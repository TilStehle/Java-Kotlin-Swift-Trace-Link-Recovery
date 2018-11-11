package de.unihamburg.swk.traceabilityrecovery.optimization.moves;

import de.unihamburg.swk.traceabilityrecovery.optimization.TermFactorsSolution;
import org.jamesframework.core.search.neigh.Move;

/**
 * Created by Tilmann Stehle on 01.11.2018.
 */
public abstract class ChangeSingleFactorMove  implements Move<TermFactorsSolution> {
    protected String _termFactorIdentifier;

    public ChangeSingleFactorMove(String termFactorIdentifier) {

        this._termFactorIdentifier = termFactorIdentifier;
    }
}
