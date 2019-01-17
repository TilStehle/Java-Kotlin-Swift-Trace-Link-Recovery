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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ChangeSingleFactorMove that = (ChangeSingleFactorMove) o;

        return _termFactorIdentifier != null ? _termFactorIdentifier.equals(that._termFactorIdentifier) : that._termFactorIdentifier == null;
    }

    @Override
    public int hashCode() {
        return _termFactorIdentifier != null ? _termFactorIdentifier.hashCode() : 0;
    }

    public abstract Move<TermFactorsSolution> reverse();
}
