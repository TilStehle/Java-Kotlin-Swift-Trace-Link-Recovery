package de.unihamburg.swk.traceabilityrecovery.optimization.tabumemory;

import de.unihamburg.swk.traceabilityrecovery.optimization.TermFactorsSolution;
import de.unihamburg.swk.traceabilityrecovery.optimization.moves.ChangeSingleFactorMove;
import de.unihamburg.swk.traceabilityrecovery.optimization.moves.SetSingleTermFactorMove;
import org.apache.commons.collections.buffer.CircularFifoBuffer;
import org.jamesframework.core.search.algo.tabu.TabuMemory;
import org.jamesframework.core.search.neigh.Move;

/**
 * Created by Tilmann Stehle on 17.01.2019.
 */
public class TermFactorTabuMemory implements TabuMemory<TermFactorsSolution> {
    CircularFifoBuffer registeredMoves;

    public TermFactorTabuMemory(int bufferSize) {
        this.registeredMoves = new CircularFifoBuffer(bufferSize);
    }

    @Override
    public boolean isTabu(Move<? super TermFactorsSolution> move, TermFactorsSolution currentSolution) {

        boolean isTabu = false;
        if(move instanceof ChangeSingleFactorMove)
        {
            Move<TermFactorsSolution> reverseMove = ((ChangeSingleFactorMove) move).reverse();
            if(registeredMoves.contains(reverseMove))
            {
                isTabu = true;
            }
        }

        return isTabu;
    }

    @Override
    public void registerVisitedSolution(TermFactorsSolution visitedSolution, Move<? super TermFactorsSolution> appliedMove) {
        if(appliedMove!=null && !registeredMoves.contains(appliedMove))
        {
            registeredMoves.add(appliedMove);
        }
    }

    @Override
    public void clear() {
        registeredMoves.clear();
    }
}
