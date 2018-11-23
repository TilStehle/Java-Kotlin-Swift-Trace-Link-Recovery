package de.unihamburg.swk.traceabilityrecovery.evaluation;

import de.unihamburg.masterprojekt2016.traceability.*;
import de.unihamburg.swk.parsing.CSharpParser;
import de.unihamburg.swk.parsing.KotlinParser;
import de.unihamburg.swk.parsing.Swift4Parser;
import de.unihamburg.swk.parsing.document.TermFactors;
import de.unihamburg.swk.parsing.javaparser.GithubJavaParser;
import de.unihamburg.swk.traceabilityrecovery.ITraceabilityRecoveryService;
import de.unihamburg.swk.traceabilityrecovery.Language;
import de.unihamburg.swk.traceabilityrecovery.lucene.LuceneDocument;
import de.unihamburg.swk.traceabilityrecovery.lucene.LuceneTraceabilityRecoveryService;
import org.junit.Test;

import java.io.IOException;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by Tilmann Stehle on 31.10.2018.
 */
public class MAPQEvaluatorTest {

    private static boolean LOAD_INDEX_FROM_DISK = false;
    private MAPQEvaluator evaluator = new MAPQEvaluator();

    @Test
    public void computeMAPForTwidereDomainModel() throws IOException {
        ITraceabilityRecoveryService traceabilityRecoveryService = setUpTraceabilityRecoveryService("./testDocs/TwidereDomainModel");
        evaluator.computeMap(traceabilityRecoveryService, "./testDocs/TwidereDomainModel/groundTruth/TraceabilityModel.xml", Language.SWIFT);

    }

    @Test
    public void computeMAPForMDW() throws IOException {
        ITraceabilityRecoveryService traceabilityRecoveryService = setUpTraceabilityRecoveryService("./testDocs/MDW");
        evaluator.computeMap(traceabilityRecoveryService, "./testDocs/MDW/groundTruth/TraceabilityModel.xml", Language.SWIFT);
    }

    @Test
    public void computeMAPForLuceneNet() throws IOException {

        ITraceabilityRecoveryService traceabilityRecoveryService = setUpTraceabilityRecoveryService("./testDocs/LuceneNet");
        evaluator.computeMap(traceabilityRecoveryService, "./testDocs/LuceneNet/groundTruth/TraceabilityModel.xml", Language.CSHARP);
    }

    @Test
    public void computeMAPForCompleteTwidereCode() throws IOException {
        ITraceabilityRecoveryService traceabilityRecoveryService = setUpTraceabilityRecoveryService("./testDocs/TwidereKomplett");
        ((LuceneTraceabilityRecoveryService)traceabilityRecoveryService).removeDocumentsByPointerPredicate(p -> p instanceof TypePointer && ((TypePointer)p).getClassification()== TypePointerClassification.EXTENSION);

        evaluator.computeMap(traceabilityRecoveryService, "./testDocs/TwidereKomplett/groundTruth/TraceabilityModel.xml", Language.SWIFT);
    }

    @Test
    public void computeMAPForCamelCaseTest() throws IOException {
        ITraceabilityRecoveryService traceabilityRecoveryService = setUpTraceabilityRecoveryService("./testDocs/CamelCaseTest");
        evaluator.computeMap(traceabilityRecoveryService, "./testDocs/CamelCaseTest/groundTruth/TraceabilityModel.xml", Language.CSHARP);
    }

    @Test
    public void buildIndexAndPrintDocs() {
        ITraceabilityRecoveryService recoveryService = setUpTraceabilityRecoveryService("./TestDocs/TwidereKomplett/swift/Twidere/UI/ViewControllers/Home");
        recoveryService.printDocuments();
    }

    @Test
    public void BuildIndex() {
        ITraceabilityRecoveryService recoveryService = setUpTraceabilityRecoveryService("/Users/tilmannstehle/Documents/DissWorkspace/HDW/hdw-app-ios/HDW");
        recoveryService.printDocuments();
    }


    @Test
    public void printSimilarities() throws IOException {
        ConceptComparer.printAllSimilarities();
    }

    @Test
    public void cleanUpSourcePaths() {

        TraceabilityModel groundTruth = evaluator.importGroundTruth("./testDocs/MDW/groundTruth/TraceabilityModel.xml");
        TraceabilityLink[] traceabilityLinkList = groundTruth.getTraceabilityLinkList();
        for (TraceabilityLink traceabilityLink : traceabilityLinkList) {
            cleanUpPath(traceabilityLink.getSource());
            cleanUpPath(traceabilityLink.getTarget());
        }
        XMLExport.createXMLFile(groundTruth, "./testDocs/MDW/groundTruth");

    }

    private void cleanUpPath(TraceabilityPointer pointer) {
        String cleanedPath = pointer.getSourceFilePath().replace('\\', '/');
        pointer.setSourceFilePath(cleanedPath);
        pointer.setStartLine(pointer.getStartLine() - 1);
    }

    ITraceabilityRecoveryService setUpTraceabilityRecoveryService(String testDocsPath) {
        long start = System.currentTimeMillis();
        LuceneTraceabilityRecoveryService recoveryService = null;
        recoveryService = new LuceneTraceabilityRecoveryService();
        Predicate<LuceneDocument> documentFilter = getTypelevelPredicate();
        recoveryService.setDocumentFilter(documentFilter);
        if (LOAD_INDEX_FROM_DISK)//wenn der bestehende index von der Platte geladen werden soll
        {
            try {
                System.out.println("Reading lucene index...");
                recoveryService.setIndexPath(testDocsPath + "/LuceneIndex");
                recoveryService.loadIndexFromDisk();
                System.out.println("Done");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else//wenn ein neuer Index aufgebaut und auf der Platte abgelegt werden soll
        {
            try {
                recoveryService.setIndexPath(testDocsPath + "/LuceneIndex");
                recoveryService.discardIndexAndReadDocuments(testDocsPath);


                System.out.println("Durchschnittliche Laufzeit JavaParser:   " + comuteAverageOfLongs(GithubJavaParser.timesNeeded) + "ms");
                System.out.println("Durchschnittliche Laufzeit C#-Parser:   " + comuteAverageOfLongs(CSharpParser.timesNeeded) + "ms");
                System.out.println("Durchschnittliche Laufzeit KotlinParser:   " + comuteAverageOfLongs(KotlinParser.timesNeeded) + "ms");
                System.out.println("Durchschnittliche Laufzeit SwiftParser:   " + comuteAverageOfLongs(Swift4Parser.timesNeeded) + "ms");
                long timeElapsed = System.currentTimeMillis() - start;
                System.out.println("Time Elapsed During indexing: " + timeElapsed + "ms");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return recoveryService;
    }


    private long comuteAverageOfLongs(List<Long> longs) {
        long sum = 0;
        for (Long item : longs) {
            sum += item;
        }
        if (longs.isEmpty()) {
            return 0;
        }
        return sum / longs.size();

    }


    /**
     * //We only include types, that are other than extensions
     *
     * @return
     */
    private Predicate<LuceneDocument> getTypelevelPredicate() {
        return new Predicate<LuceneDocument>() {
            @Override
            public boolean test(LuceneDocument document) {
                TraceabilityPointer traceabilityPointer = document.getTraceabilityPointer();
                if (traceabilityPointer instanceof TypePointer) {
                    TypePointer typePointer = (TypePointer) traceabilityPointer;
                    return typePointer.getClassification()!=TypePointerClassification.EXTENSION;
                }
//                else if(traceabilityPointer instanceof MethodPointer)
//                {
//                    return true;
//                }
                return false;
            }
        };
    }

}
