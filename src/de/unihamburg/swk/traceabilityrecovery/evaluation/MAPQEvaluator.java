package de.unihamburg.swk.traceabilityrecovery.evaluation;

import de.unihamburg.masterprojekt2016.traceability.*;
import de.unihamburg.swk.traceabilityrecovery.ITraceabilityRecoveryService;
import de.unihamburg.swk.traceabilityrecovery.lucene.LuceneDocument;
import de.unihamburg.swk.traceabilityrecovery.lucene.LuceneTraceabilityRecoveryService;
import org.junit.Test;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * MAP(Q) as denoted in http://nlp.stanford.edu/IR-book/pdf/08eval.pdf
 * Created by Tilmann Stehle on 24.01.2017.
 */
public class MAPQEvaluator {


    @Test
    public void printSimilarities() throws IOException {
       ConceptComparer.printAllSimilarities();
    }

    @Test
    public void computeMAPForTwidereDomainModel() throws IOException {
        computeMap("./testDocs/TwidereDomainModel", "./testDocs/TwidereDomainModel/groundTruth/TraceabilityModel.xml");
    }

    @Test
    public void computeMAPForCompleteTwidereCode() throws IOException {
        computeMap("./TestDocs/TwidereKomplett", "./testDocs/TwidereKomplett/groundTruth/TraceabilityModel.xml");
    }

    @Test
    public void buildIndexAndPrintDocs() {
        ITraceabilityRecoveryService recoveryService = setUpTraceabilityRecoveryService("./TestDocs/TwidereKomplett/swift/Twidere/UI/ViewControllers/Home");
        recoveryService.printDocuments();
    }

    private void computeMap(String sourcePath, String linkModelXMLPath) {
        TraceabilityModel groundTruth = importGroundTruth(linkModelXMLPath);
        ITraceabilityRecoveryService recoveryService = setUpTraceabilityRecoveryService(sourcePath);
        double outerSumOfMAPQ = 0;
        Map<TraceabilityPointer, TraceabilityLinkSetWrapper> traceabilityLinksBySourcePointers = groundTruth.getTraceabilityLinksBySourcePointers();
        for (Map.Entry<TraceabilityPointer, TraceabilityLinkSetWrapper> pointerAndCorrectLinks : traceabilityLinksBySourcePointers.entrySet()) {
            Set<TraceabilityLink> correctLinksForPointer = pointerAndCorrectLinks.getValue().get();
            double precisionSumForCurrentQuery = 0;
            for (TraceabilityLink correctLink : correctLinksForPointer) {
                List<TraceabilityLink> foundLinks = recoveryService.getSortedTraceabilityLinksForPointer(correctLink.getSource());
                List<TraceabilityLink> consideredResults = new ArrayList<>();
                for (int linkRank = 0; linkRank < foundLinks.size(); linkRank++) {
                    TraceabilityLink foundLink = foundLinks.get(linkRank);
                    consideredResults.add(foundLink);
                    if (foundLink.hasSameSourceAndTarget(correctLink)) {
                        System.out.println("Korrekter (gesuchter) Link gefunden: " + foundLink.getSource().getDisplayName() + " --> " + foundLink.getTarget().getDisplayName() + "   Ergebnisnummer:" + (linkRank + 1));
                        break;
                    } else {
                        boolean isLinkCorrect = false;
                        for (TraceabilityLink aCorrectLink : correctLinksForPointer) {
                            isLinkCorrect = isLinkCorrect || aCorrectLink.hasSameSourceAndTarget(foundLink);
                        }
                        if (isLinkCorrect) {
                            System.out.println("Korrekter Link gefunden: " + foundLink.getSource().getDisplayName() + " --> " + foundLink.getTarget().getDisplayName() + "   Ergebnisnummer:" + (linkRank + 1));
                        } else {
                            System.out.println("Falscher Link gefunden: " + foundLink.getSource().getDisplayName() + " --> " + foundLink.getTarget().getSourceFilePath() + "   " + ((TypePointer) foundLink.getTarget()).getFullyQualifiedName() + "   Ergebnisnummer:" + (linkRank + 1));
                        }
                    }
                }
                double precision = computePrecisionForResults(consideredResults, correctLinksForPointer);
                System.out.println("Precision: " + precision);
                precisionSumForCurrentQuery += precision;

            }
            outerSumOfMAPQ += (1.0d / correctLinksForPointer.size()) * precisionSumForCurrentQuery;


        }
        double mAPQ = (1.0d / traceabilityLinksBySourcePointers.size()) * outerSumOfMAPQ;
        System.out.println("MAP(Q): " + mAPQ);
        System.out.println("|Q|: " + traceabilityLinksBySourcePointers.size());
        System.out.println("Anzahl Dokumente: " + recoveryService.getNumberOfDocs());
        System.out.println("Swift-Dokumente:   "+recoveryService.getNumberOfDocumentsForLanguage("swift"));
        System.out.println("Java-Dokumente:   "+recoveryService.getNumberOfDocumentsForLanguage("java"));
        System.out.println("Kotlin-Dokumente:   "+recoveryService.getNumberOfDocumentsForLanguage("kt"));
        for (String nonParsedFile : ITraceabilityRecoveryService.NonParsedFiles) {
            System.out.println("Parsing Failed: " + nonParsedFile);
        }


    }

    private double computePrecisionForResults(List<TraceabilityLink> consideredResults, Set<TraceabilityLink> correctLinks) {
        int truePositives = 0;
        int allPositives = consideredResults.size();
        for (TraceabilityLink consideredResult : consideredResults) {
            List<TraceabilityLink> fittingResults = correctLinks.stream().filter(correctlink -> correctlink.hasSameSourceAndTarget(consideredResult)).collect(Collectors.toList());
            if (!fittingResults.isEmpty()) {
                truePositives++;
            }
        }
        return (double) truePositives / allPositives;


    }

    private ITraceabilityRecoveryService setUpTraceabilityRecoveryService(String testDocsPath) {
        LuceneTraceabilityRecoveryService recoveryService = null;
        try {
            recoveryService = new LuceneTraceabilityRecoveryService();
        } catch (IOException e) {
            e.printStackTrace();
        }


        //We only include types, that are other than extensions
        Predicate<LuceneDocument> documentFilter = new Predicate<LuceneDocument>() {
            @Override
            public boolean test(LuceneDocument document) {
                TraceabilityPointer traceabilityPointer = document.getTraceabilityPointer();
                if (traceabilityPointer instanceof TypePointer) {
                    TypePointer typePointer = (TypePointer) traceabilityPointer;
                    return typePointer.getClassification() != TypePointerClassification.EXTENSION;
                }
                return false;
            }
        };
        recoveryService.setDocumentFilter(documentFilter);
        //Die folgenden Zeilen einkommentieren, wenn ein neuer Index aufgebaut und auf der Platte abgelegt werden soll
//        try {
//            recoveryService.readDocuments(testDocsPath);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
        //Die folgenden Zeilen einkommentieren, wenn der bestehende index von der Platte geladen werden soll
        try {
            System.out.println("Reading lucene index...");
            recoveryService.loadIndexFromDisk(testDocsPath);
            System.out.println("Done");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return recoveryService;
    }


    public TraceabilityModel importGroundTruth(String linkModelXMLPath) {
        TraceabilityModel groundTruthModel = null;
        try {

            File file = new File(linkModelXMLPath);
            JAXBContext jaxbContext = JAXBContext.newInstance(TraceabilityModel.class);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            groundTruthModel = (TraceabilityModel) jaxbUnmarshaller.unmarshal(file);
            return groundTruthModel;


        } catch (JAXBException e) {
            throw new RuntimeException("Make sure to provide an XML File \"TraceabilityModel.xml\" providing the correct traceability links that your search shall be evaluated against!", e);
        }
    }
}
