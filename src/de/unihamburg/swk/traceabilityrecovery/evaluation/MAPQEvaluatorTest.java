package de.unihamburg.swk.traceabilityrecovery.evaluation;

import de.unihamburg.masterprojekt2016.traceability.*;
import de.unihamburg.swk.traceabilityrecovery.ITraceabilityRecoveryService;
import de.unihamburg.swk.traceabilityrecovery.Language;
import org.junit.Test;

import java.io.IOException;

/**
 * Created by Tilmann Stehle on 31.10.2018.
 */
public class MAPQEvaluatorTest {

    private MAPQEvaluator evaluator= new MAPQEvaluator();

    @Test
    public void computeMAPForTwidereDomainModel() throws IOException {
        evaluator.computeMap("./testDocs/TwidereDomainModel", "./testDocs/TwidereDomainModel/groundTruth/TraceabilityModel.xml", Language.SWIFT);
    }

    @Test
    public void computeMAPForMDW() throws IOException {
        evaluator.computeMap("./testDocs/MDW", "./testDocs/MDW/groundTruth/TraceabilityModel.xml", Language.SWIFT);
    }

    @Test
    public void computeMAPForLuceneNet() throws IOException {
        evaluator.computeMap("./testDocs/LuceneNet", "./testDocs/LuceneNet/groundTruth/TraceabilityModel.xml", Language.CSHARP);
    }

    @Test
    public void computeMAPForCompleteTwidereCode() throws IOException {
        evaluator.computeMap("./testDocs/TwidereKomplett", "./testDocs/TwidereKomplett/groundTruth/TraceabilityModel.xml", Language.SWIFT);
    }

    @Test
    public void computeMAPForCamelCaseTest() throws IOException {
        evaluator.computeMap("./testDocs/CamelCaseTest", "./testDocs/CamelCaseTest/groundTruth/TraceabilityModel.xml", Language.CSHARP);
    }

    @Test
    public void buildIndexAndPrintDocs() {
        ITraceabilityRecoveryService recoveryService = evaluator.setUpTraceabilityRecoveryService("./TestDocs/TwidereKomplett/swift/Twidere/UI/ViewControllers/Home");
        recoveryService.printDocuments();
    }

    @Test
    public void BuildIndex() {
        ITraceabilityRecoveryService recoveryService = evaluator.setUpTraceabilityRecoveryService("/Users/tilmannstehle/Documents/DissWorkspace/HDW/hdw-app-ios/HDW");
        recoveryService.printDocuments();
    }


    @Test
    public void printSimilarities() throws IOException {
        ConceptComparer.printAllSimilarities();
    }

    @Test
    public void cleanUpSourcePaths()
    {

        TraceabilityModel groundTruth = evaluator.importGroundTruth("./testDocs/MDW/groundTruth/TraceabilityModel.xml");
        TraceabilityLink[] traceabilityLinkList = groundTruth.getTraceabilityLinkList();
        for (TraceabilityLink traceabilityLink : traceabilityLinkList) {
            cleanUpPath(traceabilityLink.getSource());
            cleanUpPath(traceabilityLink.getTarget());
        }
        XMLExport.createXMLFile(groundTruth, "./testDocs/MDW/groundTruth");

    }

    private void cleanUpPath(TraceabilityPointer pointer)
    {
        String cleanedPath = pointer.getSourceFilePath().replace('\\', '/');
        pointer.setSourceFilePath(cleanedPath);
        pointer.setStartLine(pointer.getStartLine()-1);
    }

}
