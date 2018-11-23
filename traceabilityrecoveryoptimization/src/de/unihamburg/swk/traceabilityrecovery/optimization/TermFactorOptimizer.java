package de.unihamburg.swk.traceabilityrecovery.optimization;

import de.unihamburg.masterprojekt2016.traceability.TraceabilityPointer;
import de.unihamburg.masterprojekt2016.traceability.TypePointer;
import de.unihamburg.masterprojekt2016.traceability.TypePointerClassification;
import de.unihamburg.swk.parsing.document.TermFactors;
import de.unihamburg.swk.traceabilityrecovery.Language;
import de.unihamburg.swk.traceabilityrecovery.lucene.LuceneDocument;
import de.unihamburg.swk.traceabilityrecovery.lucene.LuceneTraceabilityRecoveryService;
import org.apache.commons.io.FileUtils;
import org.jamesframework.core.problems.GenericProblem;
import org.jamesframework.core.problems.Problem;
import org.jamesframework.core.problems.constraints.validations.Validation;
import org.jamesframework.core.problems.objectives.evaluations.Evaluation;
import org.jamesframework.core.problems.sol.RandomSolutionGenerator;
import org.jamesframework.core.search.LocalSearch;
import org.jamesframework.core.search.Search;
import org.jamesframework.core.search.algo.ParallelTempering;
import org.jamesframework.core.search.algo.RandomDescent;
import org.jamesframework.core.search.listeners.SearchListener;
import org.jamesframework.core.search.stopcriteria.MaxRuntime;
import org.jamesframework.examples.util.ProgressSearchListener;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
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
        String sourcePath = "./testDocs/TwidereKomplett/";
        String pathToGroundtruthLinks = sourcePath + "groundTruth/TraceabilityModel.xml";
        optimizer.optimizeTermFactors(sourcePath, pathToGroundtruthLinks, sourcePath + "LuceneIndex", Language.SWIFT);
    }

    public void optimizeTermFactors(String sourcePath, String pathToGroundtruthLinks, String pathToLoadIndexFrom, Language targetLanguage) {

        TraceLinkRecoveryOptimizationData data = new TraceLinkRecoveryOptimizationData(pathToGroundtruthLinks, sourcePath, Language.SWIFT);
        MAPObjective obj = new MAPObjective();
        Problem<TermFactorsSolution> problem = new GenericProblem<>(data, obj, getRandomSolutionGenerator(pathToLoadIndexFrom));
//        conductRandomDescent(problem, 240);
        conductParallelTempering(problem, 60 *60* 4);


    }

    private void conductParallelTempering(Problem<TermFactorsSolution> problem, long timeLimitInSeconds) {
        double minTemp = 1e-8;
        double maxTemp = 0.6;
        int numReplicas = 10;
        ParallelTempering<TermFactorsSolution> parallelTempering = new ParallelTempering<>(
                problem,
                new TermFactorsNeighbourhood(),
                numReplicas, minTemp, maxTemp
        );
        parallelTempering.setReplicaSteps(30);
        parallelTempering.addStopCriterion(new MaxRuntime(timeLimitInSeconds, TimeUnit.SECONDS));
        parallelTempering.start();
        parallelTempering.addSearchListener(new SearchListener<TermFactorsSolution>() {
            @Override
            public void newBestSolution(Search<? extends TermFactorsSolution> search, TermFactorsSolution newBestSolution, Evaluation newBestSolutionEvaluation, Validation newBestSolutionValidation) {
                System.out.println(" Neue Beste Kombi:");
                System.out.println(parallelTempering.getBestSolutionEvaluation());
                System.out.println(parallelTempering.getBestSolution().getTermFactors().toString());
            }
        });
        System.out.println("Allerbeste Kombi:");
        System.out.println(parallelTempering.getBestSolutionEvaluation());
        System.out.println(parallelTempering.getBestSolution().getTermFactors().toString());
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

    private RandomSolutionGenerator<TermFactorsSolution, TraceLinkRecoveryOptimizationData> getRandomSolutionGenerator(String pathToLoadIndexFrom) {
        return (random, data) -> {
            TermFactors randomFactors = new TermFactors(getRandomFactor(random), getRandomFactor(random), getRandomFactor(random), getRandomFactor(random),
                    getRandomFactor(random), getRandomFactor(random), getRandomFactor(random), getRandomFactor(random),
                    getRandomFactor(random), getRandomFactor(random), getRandomFactor(random), getRandomFactor(random),
                    getRandomFactor(random), getRandomFactor(random), getRandomFactor(random), getRandomFactor(random),
                    getRandomFactor(random), getRandomFactor(random), getRandomFactor(random), getRandomFactor(random),
                    getRandomFactor(random), getRandomFactor(random), getRandomFactor(random), getRandomFactor(random),
                    getRandomFactor(random), getRandomFactor(random), getRandomFactor(random), getRandomFactor(random),
                    getRandomFactor(random), getRandomFactor(random), getRandomFactor(random), getRandomFactor(random));
            return new TermFactorsSolution(randomFactors, setUpTraceabilityRecoveryService(data.getSourcePath(), pathToLoadIndexFrom));
        };
    }


    private LuceneTraceabilityRecoveryService setUpTraceabilityRecoveryService(String sourcePath, String pathToLoadIndexFrom) {
        LuceneTraceabilityRecoveryService recoveryService = new LuceneTraceabilityRecoveryService();
        Predicate<LuceneDocument> documentFilter = getTypelevelPredicate();
        recoveryService.setDocumentFilter(documentFilter);

        try {
            String indexPath = sourcePath + "/LuceneIndex" + Thread.currentThread().getId();
            FileUtils.copyDirectory(new File(pathToLoadIndexFrom), new File(indexPath));
            recoveryService.setIndexPath(indexPath);
            if (pathToLoadIndexFrom != null) {
                recoveryService.loadIndexFromDisk();
            } else {
                recoveryService.discardIndexAndReadDocuments(sourcePath);
            }
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
                return getTypelevelPointerPredicate().test(traceabilityPointer);
            }
        };
    }

    private Predicate<TraceabilityPointer> getTypelevelPointerPredicate() {
        return new Predicate<TraceabilityPointer>() {
            @Override
            public boolean test(TraceabilityPointer traceabilityPointer) {
                if (traceabilityPointer instanceof TypePointer) {
                    return ((TypePointer) traceabilityPointer).getClassification() != TypePointerClassification.EXTENSION;
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
