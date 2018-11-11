package de.unihamburg.swk.traceabilityrecovery.optimization;

import de.unihamburg.swk.parsing.document.TermFactor;
import de.unihamburg.swk.traceabilityrecovery.optimization.moves.ChangeSingleFactorMove;
import de.unihamburg.swk.traceabilityrecovery.optimization.moves.DecreaseTermFactorMove;
import de.unihamburg.swk.traceabilityrecovery.optimization.moves.IncreaseTermFactorMove;
import de.unihamburg.swk.traceabilityrecovery.optimization.moves.SetSingleTermFactorMove;
import org.jamesframework.core.search.neigh.Neighbourhood;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Tilmann Stehle on 01.11.2018.
 */
public class TermFactorsNeighbourhood implements Neighbourhood<TermFactorsSolution> {

    public ChangeSingleFactorMove getRandomMove(TermFactorsSolution solution, Random rnd) {

        List<TermFactor> allFactors = solution.getTermFactors().getAllFactors();

        TermFactor termFactortToChange = allFactors.get(rnd.nextInt(allFactors.size()));
        return new SetSingleTermFactorMove(termFactortToChange.getFactorIdentifier(),rnd.nextInt(TermFactorOptimizer.MAX_FACTOR) +1);

    }

    public List<ChangeSingleFactorMove> getAllMoves(TermFactorsSolution solution) {
        List<ChangeSingleFactorMove> allMoves = new ArrayList<>();
        for (TermFactor factorToChange : solution.getTermFactors().getAllFactors()) {

            for (int i = 1; i <= TermFactorOptimizer.MAX_FACTOR; i++) {

                allMoves.add(new SetSingleTermFactorMove(factorToChange.getFactorIdentifier(),i));
            }
        }
        return allMoves;
    }
}
