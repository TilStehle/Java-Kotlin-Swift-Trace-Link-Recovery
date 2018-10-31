package de.unihamburg.swk.traceabilityrecovery.optimization;

import de.unihamburg.masterprojekt2016.traceability.TraceabilityPointer;
import de.unihamburg.masterprojekt2016.traceability.TypePointer;
import de.unihamburg.swk.parsing.document.TermFactors;
import de.unihamburg.swk.traceabilityrecovery.ITraceabilityRecoveryService;
import de.unihamburg.swk.traceabilityrecovery.Language;
import de.unihamburg.swk.traceabilityrecovery.evaluation.MAPQEvaluator;
import de.unihamburg.swk.traceabilityrecovery.lucene.LuceneDocument;
import de.unihamburg.swk.traceabilityrecovery.lucene.LuceneTraceabilityRecoveryService;

import java.io.IOException;
import java.util.function.Predicate;

/**
 * Created by Tilmann Stehle on 31.10.2018.
 */
public class TermFactorOptimizer {
    private MAPQEvaluator _mapqEvaluator;

    public TermFactorOptimizer() {
        this._mapqEvaluator = new MAPQEvaluator();
    }

    public void optimizeTermFactors(String sourcePath, String pathToGroundtruthLinks, Language targetLanguage)
    {
        //parse code
        LuceneTraceabilityRecoveryService traceabilityRecoveryService= setUpTraceabilityRecoveryService(sourcePath);
        //compute MAP
        double map = _mapqEvaluator.computeMap(traceabilityRecoveryService, pathToGroundtruthLinks, targetLanguage);
        System.out.println("MAP= "+ map);
        //TODO: adjust term factors
        //apply term factors to index
        traceabilityRecoveryService.applyTermFactors(TermFactors.ALL_FACTORS_ONE);
        //re-compute MAP
        map = _mapqEvaluator.computeMap(traceabilityRecoveryService, pathToGroundtruthLinks, targetLanguage);
        System.out.println("MAP when parametrized with all factors =1:   "+ map);


        //apply term factors to index
        traceabilityRecoveryService.applyTermFactors(TermFactors.DEFAULT_FACTORS);
        //re-compute MAP
        map = _mapqEvaluator.computeMap(traceabilityRecoveryService, pathToGroundtruthLinks, targetLanguage);
        System.out.println("MAP when parametrized with default factors again   "+ map);
    }

    LuceneTraceabilityRecoveryService setUpTraceabilityRecoveryService(String sourcePath) {
        LuceneTraceabilityRecoveryService recoveryService = new LuceneTraceabilityRecoveryService();
        Predicate<LuceneDocument> documentFilter = getTypelevelPredicate();
        recoveryService.setDocumentFilter(documentFilter);

        try {
            recoveryService.setIndexPath(sourcePath + "/LuceneIndex");
            recoveryService.discardIndexAndReadDocuments(sourcePath);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return recoveryService;
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
