package de.unihamburg.swk.traceabilityrecovery.optimization;

import de.unihamburg.masterprojekt2016.traceability.TraceabilityPointer;
import de.unihamburg.masterprojekt2016.traceability.TypePointer;
import de.unihamburg.swk.parsing.document.TermFactors;
import de.unihamburg.swk.traceabilityrecovery.Language;
import de.unihamburg.swk.traceabilityrecovery.lucene.LuceneDocument;
import de.unihamburg.swk.traceabilityrecovery.lucene.LuceneTraceabilityRecoveryService;
import org.jamesframework.core.problems.GenericProblem;
import org.jamesframework.core.problems.Problem;
import org.jamesframework.core.problems.sol.RandomSolutionGenerator;
import org.jamesframework.core.search.LocalSearch;
import org.jamesframework.core.search.algo.ParallelTempering;
import org.jamesframework.core.search.algo.RandomDescent;
import org.jamesframework.core.search.stopcriteria.MaxRuntime;
import org.jamesframework.examples.util.ProgressSearchListener;

import java.io.IOException;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.function.Predicate;


public class TermFactorOptimizer {


    public static int MAX_FACTOR = 8;
    public static int MIN_FACTOR = 0;


    public static void main(String[] args) {
        System.out.println("Working Directory = " +
                System.getProperty("user.dir"));
        TermFactorOptimizer optimizer = new TermFactorOptimizer();
        String sourcePath = "./testDocs/MDW";
        String pathToGroundtruthLinks = "./testDocs/MDW/groundTruth/TraceabilityModel.xml";
        optimizer.optimizeTermFactors(sourcePath, pathToGroundtruthLinks, Language.SWIFT);
    }

    public void optimizeTermFactors(String sourcePath, String pathToGroundtruthLinks, Language targetLanguage) {

        TraceLinkRecoveryOptimizationData data = new TraceLinkRecoveryOptimizationData(pathToGroundtruthLinks, sourcePath, Language.SWIFT);
        MAPObjective obj = new MAPObjective();
        Problem<TermFactorsSolution> problem = new GenericProblem<>(data, obj, getRandomSolutionGenerator());
        //conductRandomDescent(problem, 240);
        conductParallelTempering(problem, 240);


    }

    private void conductParallelTempering(Problem<TermFactorsSolution> problem, long timeLimitInSeconds) {
        double minTemp =  1e-8;
        double maxTemp =  0.6;
        int numReplicas = 10;
        ParallelTempering<TermFactorsSolution> parallelTempering = new ParallelTempering<>(
                problem,
                new TermFactorsNeighbourhood(),
                numReplicas, minTemp, maxTemp
        );
        parallelTempering.addStopCriterion(new MaxRuntime(timeLimitInSeconds, TimeUnit.SECONDS));
        parallelTempering.start();
    }

    private void conductRandomDescent(Problem<TermFactorsSolution> problem, long timeLimitInSeconds) {
        // create random descent search with TSP neighbourhood
        LocalSearch<TermFactorsSolution> randomDescent = new RandomDescent<>(problem, new TermFactorsNeighbourhood());
// set maximum runtime
        randomDescent.addStopCriterion(new MaxRuntime(timeLimitInSeconds, TimeUnit.SECONDS));
// attach listener (see example 1A)
        randomDescent.addSearchListener(new ProgressSearchListener());

// start search
        randomDescent.start();

// print results
        if (randomDescent.getBestSolution() != null) {
            System.out.println("Best round trip: " + randomDescent.getBestSolution().getTermFactors());
            System.out.println("Best round trip travel distance: " + randomDescent.getBestSolutionEvaluation());
        } else {
            System.out.println("No valid solution found...");
        }

// dispose
        randomDescent.dispose();
    }

    private RandomSolutionGenerator<TermFactorsSolution, TraceLinkRecoveryOptimizationData> getRandomSolutionGenerator() {
        return (random, data) -> {
            TermFactors randomFactors = new TermFactors(getRandomFactor(random), getRandomFactor(random), getRandomFactor(random), getRandomFactor(random),
                    getRandomFactor(random), getRandomFactor(random), getRandomFactor(random), getRandomFactor(random),
                    getRandomFactor(random), getRandomFactor(random), getRandomFactor(random), getRandomFactor(random),
                    getRandomFactor(random), getRandomFactor(random), getRandomFactor(random), getRandomFactor(random),
                    getRandomFactor(random), getRandomFactor(random), getRandomFactor(random), getRandomFactor(random),
                    getRandomFactor(random), getRandomFactor(random), getRandomFactor(random), getRandomFactor(random),
                    getRandomFactor(random), getRandomFactor(random), getRandomFactor(random), getRandomFactor(random),
                    getRandomFactor(random), getRandomFactor(random), getRandomFactor(random), getRandomFactor(random));
            return new TermFactorsSolution(randomFactors, setUpTraceabilityRecoveryService(data.getSourcePath()));
        };
    }
    private LuceneTraceabilityRecoveryService setUpTraceabilityRecoveryService(String sourcePath) {
        LuceneTraceabilityRecoveryService recoveryService = new LuceneTraceabilityRecoveryService();
        Predicate<LuceneDocument> documentFilter = getTypelevelPredicate();
        recoveryService.setDocumentFilter(documentFilter);

        try {
            recoveryService.setIndexPath(sourcePath + "/LuceneIndex"+Thread.currentThread().getId());
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

    private static int getRandomFactor(Random random) {
        return random.nextInt(8) + 1;
    }


}
