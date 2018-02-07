package de.unihamburg.swk.traceabilityrecovery.lucene;

import com.google.common.collect.Multiset;
import de.unihamburg.masterprojekt2016.traceability.*;
import de.unihamburg.swk.parsing.ISourceCodeParser;
import de.unihamburg.swk.parsing.ParserFactory;
import de.unihamburg.swk.traceabilityrecovery.*;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang.ArrayUtils;
import org.apache.lucene.analysis.en.EnglishAnalyzer;
import org.apache.lucene.document.Document;
import org.apache.lucene.document.StoredField;
import org.apache.lucene.index.*;
import org.apache.lucene.queryparser.classic.ParseException;
import org.apache.lucene.queryparser.classic.QueryParser;
import org.apache.lucene.search.*;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.FSDirectory;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static java.io.File.separator;

/**
 * Created by Tilmann Stehle on 20.01.2017.
 */
public class LuceneTraceabilityRecoveryService implements ITraceabilityRecoveryService {

    private Predicate<LuceneDocument> documentFilter;
    private Map<Long, LuceneDocument> documentsById;
    private Map<TraceabilityPointer, LuceneDocument> documentsByPointers;
    private SourceCodeAnalyzer analyzer;
    private EnglishAnalyzer englAn;
    private Directory index;
    private Path indexPath;
    private ParserProgress parserProgress;
    private String[] projectPaths;


    public LuceneTraceabilityRecoveryService() {
        analyzer = new SourceCodeAnalyzer(SourceCodeAnalyzer.ENGLISH_STOP_WORDS_SET);
        documentsById = new HashMap<>();
        documentsByPointers = new HashMap<>();
        parserProgress = new ParserProgress();
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
            this.documentsById.put(loadedLuceneDocument.getId(), loadedLuceneDocument);
            documentsByPointers.put(loadedLuceneDocument.getTraceabilityPointer(), loadedLuceneDocument);
        }

    }


    /**
     * Filters the Source files in a directory, which possibly contains other
     * files as well.
     *
     * @param dir The directory containing source files and possibly other
     *            directories
     * @return the paths of source files in the directory
     */
    private static List<String> filterSourceFiles(File dir, Collection<String> fileNameEndings) {
        // Check if directory can be accessed
        if (!dir.isDirectory()) {
            System.out.println("Error: could not open directory " + dir.getAbsolutePath());
            System.exit(-2);
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

    @Override
    public List<TraceabilityLink> getSortedTraceabilityLinksForPointer(TraceabilityPointer pointer, Language language) {
        LuceneDocument queryDocument = documentsByPointers.get(pointer);
        Query combinedQuery = createQueryFromDocument(queryDocument, language);
        return getSortedTraceabilityLinksForLuceneQuery(combinedQuery, pointer);

    }

    @Override
    public List<TraceabilityLink> getSortedTraceabilityLinksForPointer(TraceabilityPointer pointer, String... pathPrefixes) {
        LuceneDocument queryDocument = documentsByPointers.get(pointer);
        Query combinedQuery = createQueryFromDocument(queryDocument, pathPrefixes);
        return getSortedTraceabilityLinksForLuceneQuery(combinedQuery, pointer);

    }


    private List<TraceabilityLink> getSortedTraceabilityLinksForLuceneQuery(Query query, TraceabilityPointer pointer) {
        try {
            int hitsPerPage = 50;
            IndexReader reader = DirectoryReader.open(index);
            IndexSearcher searcher = new IndexSearcher(reader);
            TopDocs docs = searcher.search(query, hitsPerPage);
            ScoreDoc[] hits = docs.scoreDocs;
            List<TraceabilityLink> hitLinks = new ArrayList<>();
            for (ScoreDoc scoreDoc : hits) {
                Document matchedDocument = searcher.doc(scoreDoc.doc);
                StoredField id = (StoredField) matchedDocument.getField("id");
                if (id != null) {
                    LuceneDocument luceneDocument = documentsById.get(new Long(id.numericValue().longValue()));
                    TraceabilityPointer targetPointer = luceneDocument.getTraceabilityPointer();
//                    if( targetPointer instanceof  TypePointer && pointer instanceof TypePointer || targetPointer instanceof MethodPointer && pointer instanceof MethodPointer )//only add links between equal Artefact Types (method->method/class->class)
//                    {
                    TraceabilityLink traceabilityLink = new TraceabilityLink(pointer, targetPointer);
                    traceabilityLink.setProbability(scoreDoc.score);
                    hitLinks.add(traceabilityLink);
//                    }
                }
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
        BooleanQuery.Builder booleanQueryBuilder = new BooleanQuery.Builder();
        for (int i = 0; i < pathPrefixes.length; i++) {

            Query prefixQuery = new PrefixQuery(new Term("path", pathPrefixes[i]));
            booleanQueryBuilder.add(prefixQuery, BooleanClause.Occur.SHOULD);
        }

        return createQueryWithFilterCriteria(queryDocument, booleanQueryBuilder.build());

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
    public void readDocuments(Predicate<String> filter, String... projectPaths) throws IndexPathNotSetException, IOException {
        this.projectPaths = projectPaths;
        if (indexPath == null) {
            throw new IndexPathNotSetException();
        }
        index = FSDirectory.open(indexPath);
        try {
            FileUtils.deleteDirectory(new File(indexPath.toString()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Collection<String> acceptedFileEndings = Arrays.stream(Language.values()).map(lang -> lang.getFileExtension()).collect(Collectors.toList());
        List<String> sourceFiles = new ArrayList<String>();
        for (String dirPath : projectPaths) {
            File dir = new File(dirPath);
            sourceFiles.addAll(filterSourceFiles(dir, acceptedFileEndings).stream().filter(filter).collect(Collectors.toList()));
        }
        createDocuments(sourceFiles);
    }

    @Override
    public int getNumberOfDocs() {
        return this.documentsById.size();
    }

    @Override
    public void printDocuments() {
        for (LuceneDocument document : this.documentsById.values()) {
            System.out.println(document);
        }

    }


    public void createDocuments(List<String> sourceFiles) {


        parserProgress.startParsing(sourceFiles.size());
        int currentFileIndex = 0;
        for (String filePath : sourceFiles) {
            currentFileIndex++;
            ExecutorService executor = Executors.newSingleThreadExecutor();
            if (parserProgress.isParsing() == true) {

                Future future = executor.submit(new ParsingRunnable(filePath));
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

    }

    class ParsingRunnable implements Runnable {

        private String filePath;

        public ParsingRunnable(String filePath) {
            this.filePath = filePath;
        }

        @Override
        public void run() {
            ISourceCodeParser parser = ParserFactory.<LuceneDocument>createParser(new LuceneDocsFactory(), filePath);
            Collection<LuceneDocument> documents = parser.parseDocuments();
            for (LuceneDocument document : documents) {
                addDocument(document);
            }
        }
    }

    public void addDocument(LuceneDocument document) {
        if (documentFilter == null || documentFilter.test(document)) {
            documentsByPointers.put(document.getTraceabilityPointer(), document);
            StoredField id = (StoredField) document.getDocument().getField("id");
            documentsById.put(id.numericValue().longValue(), document);
            IndexWriterConfig config = new IndexWriterConfig(analyzer);
            try (IndexWriter indexWriter = new IndexWriter(index, config)) {
                indexWriter.addDocument(document.getDocument());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public ParserProgress getParserProgress() {

        return this.parserProgress;
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

        for (LuceneDocument document : this.documentsById.values()) {
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
