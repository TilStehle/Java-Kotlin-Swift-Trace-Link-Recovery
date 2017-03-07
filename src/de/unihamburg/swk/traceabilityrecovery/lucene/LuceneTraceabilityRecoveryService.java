package de.unihamburg.swk.traceabilityrecovery.lucene;

import com.google.common.collect.Multiset;
import de.unihamburg.masterprojekt2016.traceability.ConceptComparer;
import de.unihamburg.masterprojekt2016.traceability.ConceptTypeSimilarity;
import de.unihamburg.masterprojekt2016.traceability.TraceabilityLink;
import de.unihamburg.masterprojekt2016.traceability.TraceabilityPointer;
import de.unihamburg.swk.parsing.ISourceCodeParser;
import de.unihamburg.swk.parsing.ParserFactory;
import de.unihamburg.swk.traceabilityrecovery.ITraceabilityRecoveryService;
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

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.function.Predicate;

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


    public LuceneTraceabilityRecoveryService() throws IOException {
        analyzer = new SourceCodeAnalyzer(SourceCodeAnalyzer.ENGLISH_STOP_WORDS_SET);
        documentsById = new HashMap<>();
        documentsByPointers = new HashMap<>();
    }


    public void loadIndexFromDisk(String indexPathPrefix) throws IOException {
        index = FSDirectory.open(Paths.get(indexPathPrefix, "luceneIndex"));
        IndexReader reader = null;
        try {
            reader = DirectoryReader.open(index);

            for (int i = 0; i < reader.maxDoc(); i++) {

                Document document = reader.document(i);
                LuceneDocument loadedLuceneDocument = LuceneDocument.fromDocument(document);
                this.documentsById.put(loadedLuceneDocument.getId(), loadedLuceneDocument);
                documentsByPointers.put(loadedLuceneDocument.getTraceabilityPointer(), loadedLuceneDocument);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
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
    public List<TraceabilityLink> getSortedTraceabilityLinksForPointer(TraceabilityPointer pointer) {
        LuceneDocument queryDocument = documentsByPointers.get(pointer);
        org.apache.lucene.search.Query combinedQuery = createQueryFromDocument(queryDocument);
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

                    TraceabilityLink traceabilityLink = new TraceabilityLink(pointer, targetPointer);
                    traceabilityLink.setProbability(scoreDoc.score);
                    hitLinks.add(traceabilityLink);
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

    private org.apache.lucene.search.Query createQueryFromDocument(LuceneDocument queryDocument) {
        String contents = queryDocument.getContents();
        String layer = queryDocument.getLayer();
        org.apache.lucene.search.Query languageQuery = null;
        BooleanQuery.Builder booleanQueryBuilder = new BooleanQuery.Builder();
        try {
            languageQuery = new QueryParser("language", analyzer).parse("swift");
            org.apache.lucene.search.Query contentQuery = createBoostedQueryFromQueryString(contents, "content", 1f);
            booleanQueryBuilder.add(contentQuery, BooleanClause.Occur.MUST);
//            for (IndexableField field : queryDocument.getDocument().getFields()) {
//                addBoostedQueryTerms(booleanQueryBuilder,field);
//            }

            booleanQueryBuilder.add(languageQuery, BooleanClause.Occur.FILTER);
            String docTitle = queryDocument.getTitle();
            if (docTitle != null) {
                org.apache.lucene.search.Query titleQuery = null;

                titleQuery = new QueryParser("title", analyzer).parse(docTitle);

                // booleanQueryBuilder.add(titleQuery, BooleanClause.Occur.SHOULD);
            }
            if (layer != null) {
                org.apache.lucene.search.Query layerQuery = new QueryParser("layer", analyzer).parse(layer);
                layerQuery = new BoostQuery(layerQuery, 100);
                booleanQueryBuilder.add(layerQuery, BooleanClause.Occur.SHOULD);
            }
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        return booleanQueryBuilder.build();
    }

    private void addBoostedQueryTerms(BooleanQuery.Builder queryBuilder, IndexableField field) throws ParseException {
        String queryString = field.stringValue();
        List<org.apache.lucene.search.Query> boostedQueries = new ArrayList<>();
        String fieldName = field.name();
        List<ConceptTypeSimilarity> similarities = ConceptComparer.getSimilaritiesFor(fieldName);
        if (similarities != null) {
            float boost = ConceptComparer.getConceptWeight(fieldName);
            org.apache.lucene.search.Query boostedQueryForCurrentField = createBoostedQueryFromQueryString(queryString, "content", boost);
            queryBuilder.add(boostedQueryForCurrentField, BooleanClause.Occur.SHOULD);
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
    private org.apache.lucene.search.Query createBoostedQueryFromQueryString(String queryString, String fieldName, float boost) throws ParseException {
        Map<String, Integer> wordCounts = computeWordCounts(queryString);
        String boostedQueryString = "";
        for (Map.Entry<String, Integer> wordAndWeight : wordCounts.entrySet()) {
            String term = wordAndWeight.getKey();
            if (!term.contains(":")) {
                boostedQueryString += term + "^" + wordAndWeight.getValue() + " ";
            }
        }
        org.apache.lucene.search.Query query = new QueryParser(fieldName, analyzer).parse(boostedQueryString);
        return new BoostQuery(query, boost);
    }

    @Override
    public void readDocuments(String... projectPaths) throws IOException {
        String luceneIndexPathPrefix = projectPaths[0];
        Path indexPath = Paths.get(luceneIndexPathPrefix, "luceneIndex");
        index = FSDirectory.open(indexPath);
        try {
            FileUtils.deleteDirectory(new File(luceneIndexPathPrefix + "\\luceneIndex"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Collection<String> acceptedFileEndings = Arrays.asList(new String[]{"swift", "java", "kt"});
        List<String> sourceFiles = new ArrayList<String>();
        for (String dirPath : projectPaths) {
            File dir = new File(dirPath);
            sourceFiles.addAll(filterSourceFiles(dir, acceptedFileEndings));
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

    /**
     * Creates the LS3Documents of this document collection. Each document
     * contains the relevant information of a PNML file for the LS3.
     *
     * @param sourceFiles
     */
    public void createDocuments(List<String> sourceFiles) {
        for (String filePath : sourceFiles) {
            ISourceCodeParser parser = ParserFactory.<LuceneDocument>createParser(new LuceneDocsFactory(), filePath);
            Collection<LuceneDocument> documents = parser.parseDocuments();
            for (LuceneDocument document : documents) {
                if (this.documentFilter == null || this.documentFilter.test(document)) {
                    this.documentsByPointers.put(document.getTraceabilityPointer(), document);
                    StoredField id = (StoredField) document.getDocument().getField("id");
                    this.documentsById.put(id.numericValue().longValue(), document);
                    IndexWriterConfig config = new IndexWriterConfig(analyzer);
                    try (IndexWriter indexWriter = new IndexWriter(index, config)) {
                        indexWriter.addDocument(document.getDocument());
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }

    }

    @Override
    public List<TraceabilityLink> getSortedTraceabilityLinksForQuery(Multiset<String> queryTerms) {
        List<TraceabilityLink> linkResults = new ArrayList<TraceabilityLink>();
        Query languageQuery = null;
        try {
            languageQuery = new QueryParser("language", analyzer).parse("swift");

            String boostedQueryString = "";
            for (Multiset.Entry<String> stringEntry : queryTerms.entrySet()) {
                boostedQueryString += stringEntry.getElement() + "^" + stringEntry.getCount() + " ";
            }

            org.apache.lucene.search.Query contentQuery = new QueryParser("content", analyzer).parse(boostedQueryString);

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

    public void setDocumentFilter(Predicate<LuceneDocument> documentFilter) {
        this.documentFilter = documentFilter;
    }
}
