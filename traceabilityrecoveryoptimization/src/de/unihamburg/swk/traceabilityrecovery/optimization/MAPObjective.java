package de.unihamburg.swk.traceabilityrecovery.optimization;

import de.unihamburg.swk.traceabilityrecovery.evaluation.MAPQEvaluator;
import de.unihamburg.swk.traceabilityrecovery.lucene.LuceneTraceabilityRecoveryService;
import org.jamesframework.core.problems.datatypes.IntegerIdentifiedData;
import org.jamesframework.core.problems.objectives.Objective;
import org.jamesframework.core.problems.objectives.evaluations.Evaluation;
import org.jamesframework.core.problems.objectives.evaluations.SimpleEvaluation;
import org.jamesframework.core.subset.SubsetSolution;

/**
 * Created by Tilmann Stehle on 31.10.2018.
 */
public class MAPObjective implements Objective<TermFactorsSolution, TraceLinkRecoveryOptimizationData> {

    private static MAPQEvaluator mapqEvaluator = new MAPQEvaluator();

    public Evaluation evaluate(TermFactorsSolution solution, TraceLinkRecoveryOptimizationData data) {
        solution.getRecoveryService().applyTermFactors(solution.getTermFactors());
        // compute sum of profits of selected items
        double mapq = mapqEvaluator.computeMap(solution.getRecoveryService(),data.getPathToGroundTruth(), data.getTargetLanguage());
        // wrap value in simple evaluation object
        return SimpleEvaluation.WITH_VALUE(mapq);
    }

    public boolean isMinimizing() {
        return false;
    }

}