package de.unihamburg.swk.traceabilityrecovery.lucene;

import com.google.common.collect.Multiset;
import de.unihamburg.masterprojekt2016.traceability.TraceabilityLink;
import de.unihamburg.masterprojekt2016.traceability.TraceabilityPointer;
import de.unihamburg.masterprojekt2016.traceability.XMLImport;
import de.unihamburg.swk.parsing.ISourceCodeParser;
import de.unihamburg.swk.parsing.ParserFactory;
import de.unihamburg.swk.traceabilityrecovery.*;
import de.unihamburg.swk.traceabilityrecovery.commands.ITraceabilityRecoveryCommand;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.apache.lucene.analysis.en.EnglishAnalyzer;
import org.apache.lucene.document.Document;
import org.apache.lucene.document.StoredField;
import org.apache.lucene.index.*;
import org.apache.lucene.queryparser.classic.ParseException;
import org.apache.lucene.queryparser.classic.QueryParser;
import org.apache.lucene.search.*;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.FSDirectory;
import org.jetbrains.annotations.NotNull;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Created by Tilmann Stehle on 20.01.2017.
 */
public class LuceneTraceabilityRecoveryService implements ITraceabilityRecoveryService {

    private Predicate<LuceneDocument> documentFilter;
    private Map<TraceabilityPointer, LuceneDocument> documentsByPointers;
    private SourceCodeAnalyzer analyzer;
    private EnglishAnalyzer englAn;
    private Directory index;
    private Path indexPath;
    private ParserProgress parserProgress;
    private String[] projectPaths;
    private Queue<ITraceabilityRecoveryCommand> commandQueue;
    private Map<String, byte[]> fileContentsHashes;
    private FileContentsHashComputer hashComputer;

    public LuceneTraceabilityRecoveryService() {
        analyzer = new SourceCodeAnalyzer(SourceCodeAnalyzer.ENGLISH_STOP_WORDS_SET);
        documentsByPointers = new HashMap<>();
        parserProgress = new ParserProgress();
        commandQueue = new LinkedList<>();
        fileContentsHashes = new HashMap<>();
        hashComputer = new FileContentsHashComputer();
    }


    public void loadIndexFromDisk() throws IOException, IndexPathNotSetException {
        if (indexPath == null) {
            throw new IndexPathNotSetException();
        }

        index = FSDirectory.open(indexPath);
        IndexReader reader = null;
        reader = DirectoryReader.open(index);

        for (int i = 0; i < reader.maxDoc(); i++) {
            Document document = reader.document(i);
            LuceneDocument loadedLuceneDocument = LuceneDocument.fromDocument(document);
            documentsByPointers.put(loadedLuceneDocument.getTraceabilityPointer(), loadedLuceneDocument);

        }
        reader.close();
        deSerializeHashes();

    }


    /**
     * Filters the Source files in a directory, which possibly contains other
     * files as well.
     *
     * @param dir The directory containing source files and possibly other
     *            directories
     * @return the paths of source files in the directory
     */
    private List<String> filterSourceFiles(File dir, Collection<String> fileNameEndings) throws IOException {
        // Check if directory can be accessed
        if (!dir.isDirectory()) {
            System.out.println("Error: could not open directory " + dir.getAbsolutePath());
            throw new IllegalArgumentException("dir is no Directory");
        }
        // Filter Source files
        File[] fileList = dir.listFiles(new FileFilter() {

                                            @Override
                                            public boolean accept(File pathname) {
                                                return fileNameEndings.contains(FilenameUtils.getExtension(pathname.getPath()));
                                            }
                                        }
        );
        ArrayList<String> filePaths = new ArrayList<>();
        for (File file : fileList) {
            filePaths.add(file.getAbsolutePath());
        }
        File[] subDirectoriesList = dir.listFiles(new FileFilter() {

                                                      @Override
                                                      public boolean accept(File file) {
                                                          return file.isDirectory();
                                                      }
                                                  }
        );
        for (File subDirectory : subDirectoriesList) {
            filePaths.addAll(filterSourceFiles(subDirectory, fileNameEndings));
        }


        return filePaths;
    }

    private List<String> removeHashedFiles(List<String> filePaths) throws IOException {
        List<String> filteredFilePaths= new ArrayList<>();
        for (String filePath : filePaths) {
                if (checkFileChangeAndUpdateHash(filePath)) {
                    filteredFilePaths.add(filePath);
                }
        }
        return filteredFilePaths;
    }


    @Override
    public List<TraceabilityLink> getSortedTraceabilityLinksForPointer(TraceabilityPointer pointer, Language language) {
        LuceneDocument queryDocument = documentsByPointers.get(pointer);
        Query combinedQuery = createQueryFromDocument(queryDocument, language);
        return getSortedTraceabilityLinksForLuceneQuery(combinedQuery, pointer);

    }
    @Override
    public List<TraceabilityLink> getSortedTraceabilityLinksToOtherLanguagesForPointer(TraceabilityPointer pointer) {
        Language ownLanguage = Language.getLanguageForPath(pointer.getSourceFilePath());
        List<Language> otherLanguages = Language.getOtherLanguagesExcept(ownLanguage);
        List<TraceabilityLink> linksToOtherLanguages = new ArrayList<>();
        for (Language otherLanguage : otherLanguages) {
            linksToOtherLanguages.addAll(getSortedTraceabilityLinksForPointer(pointer, otherLanguage));
        }
        return linksToOtherLanguages;


    }

    @Override
    public List<TraceabilityLink> getSortedTraceabilityLinksForPointer(TraceabilityPointer pointer, String... pathPrefixes) {
        LuceneDocument queryDocument = documentsByPointers.get(pointer);
        Query combinedQuery = createQueryFromDocument(queryDocument, pathPrefixes);
        return getSortedTraceabilityLinksForLuceneQuery(combinedQuery, pointer);

    }


    private List<TraceabilityLink> getSortedTraceabilityLinksForLuceneQuery(Query query, TraceabilityPointer pointer) {
        try (IndexReader reader = DirectoryReader.open(index);) {
            int hitsPerPage = 50;
            IndexSearcher searcher = new IndexSearcher(reader);
            TopDocs docs = searcher.search(query, hitsPerPage);
            ScoreDoc[] hits = docs.scoreDocs;
            List<TraceabilityLink> hitLinks = new ArrayList<>();
            for (ScoreDoc scoreDoc : hits) {
                Document matchedDocument = searcher.doc(scoreDoc.doc);
                StoredField pointerField = (StoredField) matchedDocument.getField("pointer");
                TraceabilityPointer targetPointer = XMLImport.unmarshalPointer(pointerField.stringValue());
                TraceabilityLink traceabilityLink = new TraceabilityLink(pointer, targetPointer);
                traceabilityLink.setProbability(scoreDoc.score);
                hitLinks.add(traceabilityLink);
            }
            return hitLinks;

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    private Query createQueryFromDocument(LuceneDocument queryDocument, String... pathPrefixes) {
        BooleanQuery allPrefixesQuery = createPrefixQueryForPaths(pathPrefixes);
        return createQueryWithFilterCriteria(queryDocument, allPrefixesQuery);

    }

    private BooleanQuery createPrefixQueryForPaths(String... pathPrefixes) {
        BooleanQuery.Builder booleanQueryBuilder = new BooleanQuery.Builder();
        for (int i = 0; i < pathPrefixes.length; i++) {

            Query prefixQuery = new PrefixQuery(new Term("path", pathPrefixes[i]));
            booleanQueryBuilder.add(prefixQuery, BooleanClause.Occur.SHOULD);
        }
        return booleanQueryBuilder.build();
    }

    private Query createQueryWithFilterCriteria(LuceneDocument queryDocument, Query filterQuery) {
        String contents = queryDocument.getContents();
        String layer = queryDocument.getLayer();
        BooleanQuery.Builder booleanQueryBuilder = new BooleanQuery.Builder();
        booleanQueryBuilder.add(filterQuery, BooleanClause.Occur.FILTER);
        try {
            Query contentQuery = createBoostedQueryFromQueryString(contents, "content", 1f);
            booleanQueryBuilder.add(contentQuery, BooleanClause.Occur.MUST);
            if (layer != null) {
                Query layerQuery = new QueryParser("layer", analyzer).parse(layer);
                layerQuery = new BoostQuery(layerQuery, 100);
                booleanQueryBuilder.add(layerQuery, BooleanClause.Occur.SHOULD);
            }
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        return booleanQueryBuilder.build();
    }

    private Query createQueryFromDocument(LuceneDocument queryDocument, Language language) {
        try {
            Query filterQuery = new QueryParser("language", analyzer).parse(language.getFileExtension());

            return createQueryWithFilterCriteria(queryDocument, filterQuery);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    private Map<String, Integer> computeWordCounts(String queryString) throws ParseException {
        Map<String, Integer> wordCounts = new HashMap<>();
        for (String s : queryString.split(" ")) {
            if (s != null && !s.equals("")) {
                if (wordCounts.containsKey(s)) {
                    wordCounts.put(s, wordCounts.get(s) + 1);
                } else {
                    wordCounts.put(s, 1);
                }
            }
        }

        return wordCounts;
    }

    //    @NotNull
    private Query createBoostedQueryFromQueryString(String queryString, String fieldName, float boost) throws ParseException {
        Map<String, Integer> wordCounts = computeWordCounts(queryString);
        String boostedQueryString = "";
        for (Map.Entry<String, Integer> wordAndWeight : wordCounts.entrySet()) {
            String term = wordAndWeight.getKey();
            if (!term.contains(":")) {
                boostedQueryString += term + "^" + wordAndWeight.getValue() + " ";
            }
        }
        Query query = new QueryParser(fieldName, analyzer).parse(boostedQueryString);
        return new BoostQuery(query, boost);
    }


    @Override
    public void discardIndexAndReadDocuments(Predicate<String> filter, String... projectPaths) throws IndexPathNotSetException, IOException {

        tryDiscardIndex();
            List<String> sourceFiles = getSourceFilePaths(filter, projectPaths);
            createDocuments(sourceFiles);
    }

    @Override
    public void addFolderToIndex(Predicate<String> pathFilter, String projectPaths) throws IndexPathNotSetException, IOException {
        List<String> sourceFiles = getSourceFilePaths(pathFilter, new String[]{projectPaths});
        createDocuments(sourceFiles);
    }


    private void tryDiscardIndex() {
        try {
            FileUtils.deleteDirectory(new File(indexPath.toString()));
            if(fileContentsHashes !=null)
            this.fileContentsHashes.clear();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @NotNull
    private List<String> getSourceFilePaths(Predicate<String> filter, String[] projectPaths) throws IOException {
        this.projectPaths = projectPaths;
        if (indexPath == null) {
            throw new IndexPathNotSetException();
        }
        index = FSDirectory.open(indexPath);

        Collection<String> acceptedFileEndings = Arrays.stream(Language.values()).map(lang -> lang.getFileExtension()).collect(Collectors.toList());
        List<String> sourceFiles = new ArrayList<String>();
        for (String dirPath : projectPaths) {
            File dir = new File(dirPath);
            sourceFiles.addAll(filterSourceFiles(dir, acceptedFileEndings).stream().filter(filter).collect(Collectors.toList()));
        }
        return removeHashedFiles(sourceFiles);
    }

    public boolean checkFileChangeAndUpdateHash(String filePath) {
        try {
            byte[] oldHash = this.fileContentsHashes.get(filePath);
            byte[] newHash = hashComputer.gethashForFileContents(filePath);
            boolean hashChanged = !Arrays.equals(newHash, oldHash);
            if (hashChanged) {
                this.fileContentsHashes.put(filePath, newHash);
            }
            return hashChanged;
        } catch (Exception e) {
            e.printStackTrace();
            return true;
        }
    }

    private void serializeHashes() {
        try
        {
            FileOutputStream fos =
                    new FileOutputStream(this.indexPath+"/fileHashes.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(this.fileContentsHashes);
            oos.close();
            fos.close();
            System.out.printf("Serialized HashMap data is saved in hashmap.ser");
        }catch(IOException ioe)
        {
            ioe.printStackTrace();
        }
    }
    private void deSerializeHashes() {

        try
        {
            FileInputStream fis = new FileInputStream(this.indexPath+"/fileHashes.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            this.fileContentsHashes = (HashMap<String, byte[]>) ois.readObject();
            ois.close();
            fis.close();
        }catch(IOException ioe)
        {
            ioe.printStackTrace();
            return;
        }catch(ClassNotFoundException c)
        {
            System.out.println("Class not found");
            c.printStackTrace();
            return;
        }
    }



    @Override
    public void replaceDocumentsForFilePath(String filePath) throws IOException {

        if (isParseableSourceFilePath(filePath) && checkFileChangeAndUpdateHash(filePath)) {
            removeDocumentsForFilesWithPathPrefix(filePath);
            this.createDocuments(Arrays.asList(filePath));
        }
    }

    @Override
    public void addDocumentsForFilePath(String filePath) throws IOException {
        if (isParseableSourceFilePath(filePath) && checkFileChangeAndUpdateHash(filePath)) {
            removeDocumentsForFilesWithPathPrefix(filePath);
            this.createDocuments(Arrays.asList(filePath));
        }
    }

    @Override
    public void removeDocumentsForFilesWithPathPrefix(String path) throws IOException {
        if (!isParseableSourceFilePath(path)) return;
        IndexWriterConfig config = new IndexWriterConfig(analyzer);
        try (IndexWriter indexWriter = new IndexWriter(index, config)) {
            indexWriter.deleteDocuments(createPrefixQueryForPaths(path));
            indexWriter.flush();
            indexWriter.commit();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        this.fileContentsHashes.entrySet().removeIf(pair -> pair.getKey().startsWith(path));
        serializeHashes();
        this.documentsByPointers.entrySet().removeIf(pair -> pair.getKey().getSourceFilePath().startsWith(path));


    }

    @Override
    public int getNumberOfDocs() {
        return this.documentsByPointers.size();
    }

    @Override
    public void printDocuments() {
        for (LuceneDocument document : this.documentsByPointers.values()) {
            System.out.println(document);
        }

    }


    @Override
    public boolean isParseableSourceFilePath(String filePath) {
        for (Language language : Language.values()) {
            if (filePath.endsWith(language.getFileExtension())) return true;
        }
        return false;
    }

    public void createDocuments(List<String> sourceFiles)
    {
        try(IndexWriter indexWriter = createIndexWriter())
        {


        parserProgress.startParsing(sourceFiles.size());
        int currentFileIndex = 0;
        for (String filePath : sourceFiles) {
            filePath = filePath.replace("\\", "/");
            currentFileIndex++;
            checkFileChangeAndUpdateHash(filePath);
            ExecutorService executor = Executors.newSingleThreadExecutor();
            if (parserProgress.isParsing() == true) {

                Future future = executor.submit(new ParsingRunnable(filePath, indexWriter));
                try {

                    System.out.println("Parsing File " + currentFileIndex + " of " + sourceFiles.size());
                    future.get(parserProgress.getFileParserTimeout(), TimeUnit.SECONDS);
                    parserProgress.fileParsed();
                } catch (Exception ex) {
                    future.cancel(true);
                    parserProgress.fileParseFailed(filePath);
                    ex.printStackTrace();
                }
            } else {
                parserProgress.fileParseFailed(filePath);
            }
        }

        parserProgress.stopParsing();


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        serializeHashes();

    }

    class ParsingRunnable implements Runnable {

        private String filePath;
        private IndexWriter indexWriter;

        public ParsingRunnable(String filePath, IndexWriter indexWriter) {
            this.filePath = filePath;
            this.indexWriter = indexWriter;
        }

        @Override
        public void run() {
            ISourceCodeParser parser = ParserFactory.<LuceneDocument>createParser(new LuceneDocsFactory(), filePath);
            Collection<LuceneDocument> documents = parser.parseDocuments();
            for (LuceneDocument document : documents) {
                try {

                        addDocument(document, indexWriter);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    private IndexWriter createIndexWriter()  {
        IndexWriterConfig config = new IndexWriterConfig(analyzer);
        try {
            return new IndexWriter(index, config);
        } catch (IOException e) {
           throw new RuntimeException(e);
        }
    }


    private void addDocument(LuceneDocument document, IndexWriter indexWriter ) throws IOException {
        if (documentFilter == null || documentFilter.test(document)) {
            documentsByPointers.put(document.getTraceabilityPointer(), document);
            StoredField id = (StoredField) document.getDocument().getField("id");
            synchronized (indexWriter) {
                indexWriter.addDocument(document.getDocument());
            }
        }
    }

    @Override
    public ParserProgress getParserProgress() {

        return this.parserProgress;
    }

    @Override
    public void enqueueCommand(ITraceabilityRecoveryCommand command) throws IOException {
        this.commandQueue.add(command);
        checkCommandQueue();
    }

    private void checkCommandQueue() throws IOException {
        synchronized (this) {
            ITraceabilityRecoveryCommand nextCommand = this.commandQueue.poll();
            if (nextCommand != null) {
                nextCommand.execute();
                checkCommandQueue();
            }
        }
    }


    @Override
    public List<TraceabilityLink> getSortedTraceabilityLinksForQuery(Multiset<String> queryTerms, Language language) {
        List<TraceabilityLink> linkResults = new ArrayList<TraceabilityLink>();
        Query languageQuery = null;
        try {
            languageQuery = new QueryParser("language", analyzer).parse(language.getFileExtension());

            String boostedQueryString = "";
            for (Multiset.Entry<String> stringEntry : queryTerms.entrySet()) {
                boostedQueryString += stringEntry.getElement() + "^" + stringEntry.getCount() + " ";
            }

            Query contentQuery = new QueryParser("content", analyzer).parse(boostedQueryString);

            BooleanQuery.Builder booleanQueryBuilder = new BooleanQuery.Builder();
            booleanQueryBuilder.add(contentQuery, BooleanClause.Occur.MUST);

            booleanQueryBuilder.add(languageQuery, BooleanClause.Occur.FILTER);
            BooleanQuery combinedQuery = booleanQueryBuilder.build();
            linkResults = getSortedTraceabilityLinksForLuceneQuery(combinedQuery, null);

        } catch (ParseException e) {
            e.printStackTrace();
        } finally {
            return linkResults;
        }

    }



    @Override
    public int getNumberOfDocumentsForLanguage(String language) {
        int number = 0;

        for (LuceneDocument document : this.documentsByPointers.values()) {
            if (document.getLanguage().equals(language))
                number++;
        }
        return number;

    }

    @Override
    public void setIndexPath(String indexPath) {
        this.indexPath = Paths.get(indexPath);
    }

    public void setDocumentFilter(Predicate<LuceneDocument> documentFilter) {
        this.documentFilter = documentFilter;
    }
}
