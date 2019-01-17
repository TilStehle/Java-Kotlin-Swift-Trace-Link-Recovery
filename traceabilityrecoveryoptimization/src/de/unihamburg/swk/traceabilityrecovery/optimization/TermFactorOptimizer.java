package de.unihamburg.swk.traceabilityrecovery.optimization;

import de.unihamburg.masterprojekt2016.traceability.TraceabilityPointer;
import de.unihamburg.masterprojekt2016.traceability.TypePointer;
import de.unihamburg.swk.parsing.document.TermFactor;
import de.unihamburg.swk.parsing.document.TermFactors;
import de.unihamburg.swk.traceabilityrecovery.Language;
import de.unihamburg.swk.traceabilityrecovery.lucene.LuceneDocument;
import de.unihamburg.swk.traceabilityrecovery.lucene.LuceneTraceabilityRecoveryService;
import de.unihamburg.swk.traceabilityrecovery.optimization.factors.TypeLevelTermFactors;
import de.unihamburg.swk.traceabilityrecovery.optimization.neighbourhoods.IncreaseOrDecreaseOneFactorNeighbourhood;
import de.unihamburg.swk.traceabilityrecovery.optimization.tabumemory.TermFactorTabuMemory;
import org.apache.commons.io.FileUtils;
import org.jamesframework.core.problems.GenericProblem;
import org.jamesframework.core.problems.Problem;
import org.jamesframework.core.problems.constraints.validations.Validation;
import org.jamesframework.core.problems.objectives.evaluations.Evaluation;
import org.jamesframework.core.problems.sol.RandomSolutionGenerator;
import org.jamesframework.core.search.LocalSearch;
import org.jamesframework.core.search.Search;
import org.jamesframework.core.search.algo.BasicParallelSearch;
import org.jamesframework.core.search.algo.ParallelTempering;
import org.jamesframework.core.search.algo.RandomDescent;
import org.jamesframework.core.search.algo.tabu.FullTabuMemory;
import org.jamesframework.core.search.algo.tabu.TabuSearch;
import org.jamesframework.core.search.listeners.SearchListener;
import org.jamesframework.core.search.neigh.Neighbourhood;
import org.jamesframework.core.search.stopcriteria.MaxRuntime;
import org.jamesframework.examples.util.ProgressSearchListener;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.function.Predicate;


public class TermFactorOptimizer {


    public static int MAX_FACTOR = 20;
    public static int MIN_FACTOR = 0;
    private Neighbourhood<TermFactorsSolution> neighbourhoodDefinition = new IncreaseOrDecreaseOneFactorNeighbourhood();


    public static void main(String[] args) {
        System.out.println("Working Directory = " +
                System.getProperty("user.dir"));
        TermFactorOptimizer optimizer = new TermFactorOptimizer();
        String sourcePath = "./testDocs/MDW/";
        String pathToGroundtruthLinks = sourcePath + "groundTruth/TraceabilityModel.xml";
        optimizer.optimizeTermFactors(sourcePath, pathToGroundtruthLinks, null, Language.SWIFT);
    }

    public void optimizeTermFactors(String sourcePath, String pathToGroundtruthLinks, String pathToLoadIndexFrom, Language targetLanguage) {

        TraceLinkRecoveryOptimizationData data = new TraceLinkRecoveryOptimizationData(pathToGroundtruthLinks, sourcePath, Language.SWIFT);
        MAPObjective obj = new MAPObjective();
        if (pathToLoadIndexFrom == null) {
            LuceneTraceabilityRecoveryService luceneTraceabilityRecoveryService = createLuceneTraceabilityRecoveryService();
            pathToLoadIndexFrom = sourcePath + "/LuceneIndex";
            try {
                luceneTraceabilityRecoveryService.setIndexPath(pathToLoadIndexFrom);
                luceneTraceabilityRecoveryService.discardIndexAndReadDocuments(sourcePath);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        Problem<TermFactorsSolution> problem = new GenericProblem<>(data, obj, getRandomSolutionGenerator(pathToLoadIndexFrom));
//        conductRandomDescent(problem, 240);
        //conductParallelTempering(problem, 60 * 60 * 4);
        conductTabu(problem, 300, 60*20);


    }


    private void conductTabu(Problem<TermFactorsSolution> problem, long maxSteps, long timeLimitInSeconds) {


        TabuSearch<TermFactorsSolution> tabuSearch = new TabuSearch<TermFactorsSolution>(problem, neighbourhoodDefinition, new TermFactorTabuMemory(3));
        tabuSearch.addStopCriterion(new MaxRuntime(timeLimitInSeconds, TimeUnit.SECONDS));
        tabuSearch.addSearchListener(new SearchListener<TermFactorsSolution>() {
            @Override
            public void newBestSolution(Search<? extends TermFactorsSolution> search, TermFactorsSolution newBestSolution, Evaluation newBestSolutionEvaluation, Validation newBestSolutionValidation) {
                System.out.println(" Neue Beste Kombi:");
                System.out.println("MAP: " + search.getBestSolutionEvaluation());
                System.out.println(search.getBestSolution().getTermFactors().toString());
                System.out.println();
            }
        });

        tabuSearch.start();
        System.out.println("Allerbeste Kombi:");
        System.out.println(tabuSearch.getBestSolutionEvaluation());
        TermFactors bestTermFactors = tabuSearch.getBestSolution().getTermFactors();
        System.out.println(bestTermFactors.toString());
        List<TermFactor> changeableTermFactors = TypeLevelTermFactors.getChangeableTermFactors(bestTermFactors);
        for (TermFactor changeableTermFactor : changeableTermFactors) {
            System.out.println(changeableTermFactor);
        }


    }

    private void conductParallelTempering(Problem<TermFactorsSolution> problem, long timeLimitInSeconds) {
        double minTemp = 1e-8;
        double maxTemp = 0.6;
        int numReplicas = 8;
        ParallelTempering<TermFactorsSolution> parallelTempering = new ParallelTempering<>(
                problem,
                neighbourhoodDefinition,
                numReplicas, minTemp, maxTemp
        );
        parallelTempering.setReplicaSteps(30);
        parallelTempering.addStopCriterion(new MaxRuntime(timeLimitInSeconds, TimeUnit.SECONDS));
        parallelTempering.addSearchListener(new SearchListener<TermFactorsSolution>() {
            @Override
            public void newBestSolution(Search<? extends TermFactorsSolution> search, TermFactorsSolution newBestSolution, Evaluation newBestSolutionEvaluation, Validation newBestSolutionValidation) {
                System.out.println(" Neue Beste Kombi:");
                System.out.println(parallelTempering.getBestSolutionEvaluation());
                System.out.println(parallelTempering.getBestSolution().getTermFactors().toString());
            }
        });
        parallelTempering.start();
        System.out.println("Allerbeste Kombi:");
        System.out.println(parallelTempering.getBestSolutionEvaluation());
        TermFactors bestTermFactors = parallelTempering.getBestSolution().getTermFactors();
        System.out.println(bestTermFactors.toString());
        List<TermFactor> changeableTermFactors = TypeLevelTermFactors.getChangeableTermFactors(bestTermFactors);
        for (TermFactor changeableTermFactor : changeableTermFactors) {
            System.out.println(changeableTermFactor);
        }

        System.out.println("Anzahl probierter Konfigurationen" + parallelTempering.getNumAcceptedMoves());
    }

    private void conductRandomDescent(Problem<TermFactorsSolution> problem, long timeLimitInSeconds) {
        LocalSearch<TermFactorsSolution> randomDescent = createRandomDescentSearch(problem, timeLimitInSeconds);


        // start search
        randomDescent.start();

        // print results
        if (randomDescent.getBestSolution() != null) {
            System.out.println("Beste Konfiguration ");
            System.out.println("MAP: " + randomDescent.getBestSolutionEvaluation());
            System.out.println("Faktoren: " + randomDescent.getBestSolution().getTermFactors());
        } else {
            System.out.println("No valid solution found...");
        }

        // dispose
        randomDescent.dispose();
    }

    private LocalSearch<TermFactorsSolution> createRandomDescentSearch(Problem<TermFactorsSolution> problem, long timeLimitInSeconds) {
        // create random descent search with TSP neighbourhood
        LocalSearch<TermFactorsSolution> randomDescent = new RandomDescent<>(problem, neighbourhoodDefinition);
        // set maximum runtime
        randomDescent.addStopCriterion(new MaxRuntime(timeLimitInSeconds, TimeUnit.SECONDS));
        // attach listener (see example 1A)
        randomDescent.addSearchListener(new ProgressSearchListener());
        return randomDescent;
    }

    private RandomSolutionGenerator<TermFactorsSolution, TraceLinkRecoveryOptimizationData> getRandomSolutionGenerator(String pathToLoadIndexFrom) {
        return (random, data) -> {
//            TermFactors randomFactors = new TermFactors(getRandomFactor(random), getRandomFactor(random), getRandomFactor(random), getRandomFactor(random),
//                    getRandomFactor(random), getRandomFactor(random), getRandomFactor(random), getRandomFactor(random),
//                    getRandomFactor(random), getRandomFactor(random), getRandomFactor(random), getRandomFactor(random),
//                    getRandomFactor(random), getRandomFactor(random), getRandomFactor(random), getRandomFactor(random),
//                    getRandomFactor(random), getRandomFactor(random), getRandomFactor(random), getRandomFactor(random),
//                    getRandomFactor(random), getRandomFactor(random), getRandomFactor(random), getRandomFactor(random),
//                    getRandomFactor(random), getRandomFactor(random), getRandomFactor(random), getRandomFactor(random),
//                    getRandomFactor(random), getRandomFactor(random), getRandomFactor(random), getRandomFactor(random));
            ;
            TermFactorsSolution randomSolution = new TermFactorsSolution(TermFactors.ALL_FACTORS_ONE, setUpTraceabilityRecoveryService(data.getSourcePath(), pathToLoadIndexFrom));
            neighbourhoodDefinition.getRandomMove(randomSolution).apply(randomSolution);
            return randomSolution;
        };
    }


    private LuceneTraceabilityRecoveryService setUpTraceabilityRecoveryService(String sourcePath, String pathToLoadIndexFrom) {
        LuceneTraceabilityRecoveryService recoveryService = createLuceneTraceabilityRecoveryService();

        try {
            String indexPath = sourcePath + "/LuceneIndex" + Thread.currentThread().getId();
            FileUtils.copyDirectory(new File(pathToLoadIndexFrom), new File(indexPath));
            recoveryService.setIndexPath(indexPath);
            recoveryService.loadIndexFromDisk();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return recoveryService;
    }

    private LuceneTraceabilityRecoveryService createLuceneTraceabilityRecoveryService() {
        LuceneTraceabilityRecoveryService recoveryService = new LuceneTraceabilityRecoveryService();
        Predicate<LuceneDocument> documentFilter = getTypelevelPredicate();
        recoveryService.setDocumentFilter(documentFilter);
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
                    return true;//((TypePointer) traceabilityPointer).getClassification() != TypePointerClassification.EXTENSION;
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
