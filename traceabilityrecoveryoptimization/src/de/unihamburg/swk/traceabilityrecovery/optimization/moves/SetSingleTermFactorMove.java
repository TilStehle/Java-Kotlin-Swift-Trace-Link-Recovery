package de.unihamburg.swk.traceabilityrecovery.optimization.moves;

import de.unihamburg.swk.parsing.document.TermFactor;
import de.unihamburg.swk.parsing.document.TermFactors;
import de.unihamburg.swk.traceabilityrecovery.optimization.TermFactorsSolution;
import org.jamesframework.core.search.neigh.Move;

/**
 * Created by Tilmann Stehle on 02.11.2018.
 */
public class SetSingleTermFactorMove extends ChangeSingleFactorMove {

    private final int _newValue;
    private int _oldValue;

    public SetSingleTermFactorMove(String termFactorIdentifier, int newValue) {
        super(termFactorIdentifier);
        this._newValue = newValue;
    }

    @Override
    public void apply(TermFactorsSolution termFactorsSolution) {
        TermFactors termFactors = termFactorsSolution.getTermFactors();
        TermFactor oldFactor = termFactors.getFactor(_termFactorIdentifier);
        _oldValue = oldFactor.getFactor();
        TermFactors newFactors = termFactors.withFactor(new TermFactor(_newValue, oldFactor.getFactorIdentifier()));
        termFactorsSolution.setTermFactors(newFactors);
    }

    @Override
    public void undo(TermFactorsSolution termFactorsSolution) {
        TermFactors termFactors = termFactorsSolution.getTermFactors();
        TermFactors newTermFactors =  termFactors.withFactor(new TermFactor(_oldValue, _termFactorIdentifier));
        termFactorsSolution.setTermFactors(newTermFactors);
    }


    @Override
    public Move<TermFactorsSolution> reverse() {
        return new SetSingleTermFactorMove(_termFactorIdentifier, _oldValue);
    }
}
