package de.unihamburg.swk.traceabilityrecovery.evaluation;

import de.unihamburg.masterprojekt2016.traceability.TraceabilityLink;
import de.unihamburg.masterprojekt2016.traceability.TraceabilityLinkSetWrapper;
import de.unihamburg.masterprojekt2016.traceability.TraceabilityModel;
import de.unihamburg.masterprojekt2016.traceability.TraceabilityPointer;
import de.unihamburg.swk.traceabilityrecovery.ITraceabilityRecoveryService;
import de.unihamburg.swk.traceabilityrecovery.Language;
import de.unihamburg.swk.traceabilityrecovery.lucene.LuceneTraceabilityRecoveryService;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * MAP(Q) as denoted in http://nlp.stanford.edu/IR-book/pdf/08eval.pdf
 * Created by Tilmann Stehle on 24.01.2017.
 */
public class MAPQEvaluator {







    public double computeMap(ITraceabilityRecoveryService recoveryService, String linkModelXMLPath, Language targetLanguage) {
        TraceabilityModel groundTruth = importGroundTruth(linkModelXMLPath);
        long parsingStart = System.currentTimeMillis();
        double outerSumOfMAPQ = 0;
        long parsingTime = System.currentTimeMillis() - parsingStart;

        long queryingStart = System.currentTimeMillis();
        Map<TraceabilityPointer, TraceabilityLinkSetWrapper> traceabilityLinksBySourcePointers = groundTruth.getTraceabilityLinksBySourcePointers();
        for (Map.Entry<TraceabilityPointer, TraceabilityLinkSetWrapper> pointerAndCorrectLinks : traceabilityLinksBySourcePointers.entrySet()) {
            Set<TraceabilityLink> correctLinksForPointer = pointerAndCorrectLinks.getValue().get();
            double precisionSumForCurrentQuery = 0;
            for (TraceabilityLink correctLink : correctLinksForPointer) {
                List<TraceabilityLink> foundLinks = recoveryService.getSortedTraceabilityLinksForPointer(correctLink.getSource(), targetLanguage);
                List<TraceabilityLink> consideredResults = new ArrayList<>();
                for (int linkRank = 0; linkRank < foundLinks.size(); linkRank++) {
                    TraceabilityLink foundLink = foundLinks.get(linkRank);
                    consideredResults.add(foundLink);
                    if (foundLink.hasSameSourceAndTarget(correctLink)) {
                   //     System.out.println("Korrekter (gesuchter) Link gefunden: " + foundLink.getSource().getDisplayName() + " --> " + foundLink.getTarget().getDisplayName() + "   Ergebnisnummer:" + (linkRank + 1));
                        break;
                    } else {
                        boolean isLinkCorrect = false;
                        for (TraceabilityLink aCorrectLink : correctLinksForPointer) {
                            isLinkCorrect = isLinkCorrect || aCorrectLink.hasSameSourceAndTarget(foundLink);
                        }
                        if (isLinkCorrect) {
                      //      System.out.println("Korrekter Link gefunden: " + foundLink.getSource().getDisplayName() + " --> " + foundLink.getTarget().getDisplayName() + "   Ergebnisnummer:" + (linkRank + 1));
                        } else {
                        //    System.out.println("Falscher Link gefunden: " + foundLink.getSource().getDisplayName() + " --> " + foundLink.getTarget().getSourceFilePath() + "   " + foundLink.getTarget().getPointerType() + foundLink.getTarget().getDisplayName() + "   Ergebnisnummer:" + (linkRank + 1));
                        }
                    }
                }
                double precision = computePrecisionForResults(consideredResults, correctLinksForPointer);
                if (consideredResults.size() == 0) {
                    System.out.println("KEINE ERGEBNISSE FUER " + correctLink.getSource().getDisplayName());
                } else {
               //     System.out.println("Precision: " + precision);
                }
                precisionSumForCurrentQuery += precision;

            }
            outerSumOfMAPQ += (1.0d / correctLinksForPointer.size()) * precisionSumForCurrentQuery;


        }
        double mAPQ = (1.0d / traceabilityLinksBySourcePointers.size()) * outerSumOfMAPQ;

        long queryingTime = System.currentTimeMillis() - queryingStart;
        System.out.println("MAP(Q): " + mAPQ);
        System.out.println("Factors: " + ((LuceneTraceabilityRecoveryService)recoveryService).getTermFactors().toShortString());
//        System.out.println("|Q|: " + traceabilityLinksBySourcePointers.size());
//        System.out.println("Anzahl Dokumente: " + recoveryService.getNumberOfDocs());
//        System.out.println("Swift-Dokumente:   " + recoveryService.getNumberOfDocumentsForLanguage("swift"));
//        System.out.println("Java-Dokumente:   " + recoveryService.getNumberOfDocumentsForLanguage("java"));
//        System.out.println("Kotlin-Dokumente:   " + recoveryService.getNumberOfDocumentsForLanguage("kt"));
//        System.out.println("C#-Dokumente:   " + recoveryService.getNumberOfDocumentsForLanguage("cs"));
//        for (String nonParsedFile : ITraceabilityRecoveryService.NonParsedFiles) {
//            System.out.println("Parsing Failed: " + nonParsedFile);
//        }

        System.out.println("Indexing took : "+parsingTime+"ms");
        System.out.println("Querying took : "+queryingTime+"ms");

        return mAPQ;
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




    TraceabilityModel importGroundTruth(String linkModelXMLPath) {
        TraceabilityModel groundTruthModel = null;
        try {
            File file = new File(linkModelXMLPath);
            JAXBContext jaxbContext = JAXBContext.newInstance(TraceabilityModel.class);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            groundTruthModel = (TraceabilityModel) jaxbUnmarshaller.unmarshal(file);
            for (TraceabilityLink link : groundTruthModel.getTraceabilityLinkList()) {
                link.getTarget().setSourceFilePath(link.getTarget().getSourceFilePath());
                link.getSource().setSourceFilePath(link.getSource().getSourceFilePath());
            }

            return groundTruthModel;


        } catch (JAXBException e) {
            throw new RuntimeException("Make sure to provide an XML File \"TraceabilityModel.xml\" providing the correct traceability links that your search shall be evaluated against!", e);
        }
    }




}
