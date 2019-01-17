package de.unihamburg.swk.traceabilityrecovery.optimization.neighbourhoods;

import de.unihamburg.swk.parsing.document.TermFactor;
import de.unihamburg.swk.traceabilityrecovery.optimization.TermFactorOptimizer;
import de.unihamburg.swk.traceabilityrecovery.optimization.TermFactorsSolution;
import de.unihamburg.swk.traceabilityrecovery.optimization.factors.TypeLevelTermFactors;
import de.unihamburg.swk.traceabilityrecovery.optimization.moves.ChangeSingleFactorMove;
import de.unihamburg.swk.traceabilityrecovery.optimization.moves.DecreaseTermFactorMove;
import de.unihamburg.swk.traceabilityrecovery.optimization.moves.IncreaseTermFactorMove;
import de.unihamburg.swk.traceabilityrecovery.optimization.moves.SetSingleTermFactorMove;
import org.jamesframework.core.search.neigh.Neighbourhood;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Tilmann Stehle on 12.12.2018.
 */
public class IncreaseOrDecreaseOneFactorNeighbourhood implements Neighbourhood<TermFactorsSolution> {

    public ChangeSingleFactorMove getRandomMove(TermFactorsSolution solution, Random rnd) {

        List<TermFactor> allFactors = TypeLevelTermFactors.getChangeableTermFactors(solution.getTermFactors());

        TermFactor termFactortToChange = allFactors.get(rnd.nextInt(allFactors.size()));
        int currentfactor = termFactortToChange.getFactor();
        boolean shallFactorBeIncreased = rnd.nextBoolean();
        if (currentfactor == TermFactorOptimizer.MAX_FACTOR) {
            shallFactorBeIncreased = false;
        } else if (currentfactor == TermFactorOptimizer.MIN_FACTOR) {
            shallFactorBeIncreased = true;
        }
        return new SetSingleTermFactorMove(termFactortToChange.getFactorIdentifier(), shallFactorBeIncreased ? currentfactor + 1 : currentfactor - 1);

    }

    public List<ChangeSingleFactorMove> getAllMoves(TermFactorsSolution solution) {
        List<ChangeSingleFactorMove> allMoves = new ArrayList<>();

        for (TermFactor factorToChange : TypeLevelTermFactors.getChangeableTermFactors(solution.getTermFactors())) {
            int currentFactor = factorToChange.getFactor();
            boolean currentFactorCanBeIncreased = currentFactor != TermFactorOptimizer.MAX_FACTOR;
            boolean currentFactorCanBeDecreased = currentFactor != TermFactorOptimizer.MIN_FACTOR;
            if (currentFactorCanBeIncreased) {
                allMoves.add(new IncreaseTermFactorMove(factorToChange.getFactorIdentifier()));
            }
            if (currentFactorCanBeDecreased) {
                allMoves.add(new DecreaseTermFactorMove(factorToChange.getFactorIdentifier()));
            }
        }
        return allMoves;
    }


}
