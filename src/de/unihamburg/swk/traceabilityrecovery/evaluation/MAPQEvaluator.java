package de.unihamburg.swk.traceabilityrecovery.evaluation;

import de.unihamburg.masterprojekt2016.traceability.*;
import de.unihamburg.swk.parsing.*;
import de.unihamburg.swk.parsing.javaparser.GithubJavaParser;
import de.unihamburg.swk.traceabilityrecovery.ITraceabilityRecoveryService;
import de.unihamburg.swk.traceabilityrecovery.Language;
import de.unihamburg.swk.traceabilityrecovery.lucene.LuceneDocument;
import de.unihamburg.swk.traceabilityrecovery.lucene.LuceneTraceabilityRecoveryService;
import org.junit.Test;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * MAP(Q) as denoted in http://nlp.stanford.edu/IR-book/pdf/08eval.pdf
 * Created by Tilmann Stehle on 24.01.2017.
 */
public class MAPQEvaluator {
    private static boolean LOAD_INDEX_FROM_DISK = false;







    public double computeMap(String sourcePath, String linkModelXMLPath, Language targetLanguage) {
        TraceabilityModel groundTruth = importGroundTruth(linkModelXMLPath);
        long parsingStart = System.currentTimeMillis();
        ITraceabilityRecoveryService recoveryService = setUpTraceabilityRecoveryService(sourcePath);
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
                            System.out.println("Falscher Link gefunden: " + foundLink.getSource().getDisplayName() + " --> " + foundLink.getTarget().getSourceFilePath() + "   " + foundLink.getTarget().getPointerType() + foundLink.getTarget().getDisplayName() + "   Ergebnisnummer:" + (linkRank + 1));
                        }
                    }
                }
                double precision = computePrecisionForResults(consideredResults, correctLinksForPointer);
                if (consideredResults.size() == 0) {
                    System.out.println("KEINE ERGEBNISSE FUER " + correctLink.getSource().getDisplayName());
                } else {
                    System.out.println("Precision: " + precision);
                }
                precisionSumForCurrentQuery += precision;

            }
            outerSumOfMAPQ += (1.0d / correctLinksForPointer.size()) * precisionSumForCurrentQuery;


        }
        double mAPQ = (1.0d / traceabilityLinksBySourcePointers.size()) * outerSumOfMAPQ;

        long queryingTime = System.currentTimeMillis() - queryingStart;
        System.out.println("MAP(Q): " + mAPQ);
        System.out.println("|Q|: " + traceabilityLinksBySourcePointers.size());
        System.out.println("Anzahl Dokumente: " + recoveryService.getNumberOfDocs());
        System.out.println("Swift-Dokumente:   " + recoveryService.getNumberOfDocumentsForLanguage("swift"));
        System.out.println("Java-Dokumente:   " + recoveryService.getNumberOfDocumentsForLanguage("java"));
        System.out.println("Kotlin-Dokumente:   " + recoveryService.getNumberOfDocumentsForLanguage("kt"));
        System.out.println("C#-Dokumente:   " + recoveryService.getNumberOfDocumentsForLanguage("cs"));
        for (String nonParsedFile : ITraceabilityRecoveryService.NonParsedFiles) {
            System.out.println("Parsing Failed: " + nonParsedFile);
        }

        System.out.println("Indexing took : "+parsingTime+"ms");
        System.out.println("Querying took : "+queryingTime+"ms");

        return mAPQ;
    }

    private long comuteAverageOfLongs(List<Long> longs) {
        long sum = 0;
        for (Long item : longs) {
            sum += item;
        }
        if(longs.isEmpty())
        {
            return 0;
        }
        return sum / longs.size();

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


                System.out.println("Durchschnittliche Laufzeit JavaParser:   " + comuteAverageOfLongs(GithubJavaParser.timesNeeded)+"ms");
                System.out.println("Durchschnittliche Laufzeit C#-Parser:   " + comuteAverageOfLongs(CSharpParser.timesNeeded)+"ms");
                System.out.println("Durchschnittliche Laufzeit KotlinParser:   " + comuteAverageOfLongs(KotlinParser.timesNeeded)+"ms");
                System.out.println("Durchschnittliche Laufzeit SwiftParser:   " + comuteAverageOfLongs(Swift4Parser.timesNeeded)+"ms");
                long timeElapsed = System.currentTimeMillis()-start;
                System.out.println("Time Elapsed During indexing: "+timeElapsed+"ms");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return recoveryService;
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
                   return  true;
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
