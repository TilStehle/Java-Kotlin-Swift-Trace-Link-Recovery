package de.unihamburg.swk.traceabilityrecovery.optimization.moves;

import de.unihamburg.swk.parsing.document.TermFactor;
import de.unihamburg.swk.parsing.document.TermFactors;
import de.unihamburg.swk.traceabilityrecovery.optimization.TermFactorsSolution;

/**
 * Created by Tilmann Stehle on 01.11.2018.
 */
public class IncreaseTermFactorMove extends  ChangeSingleFactorMove  {


    public IncreaseTermFactorMove(String termFactorIdentifier)
    {
       super(termFactorIdentifier);
    }


    @Override
    public void apply(TermFactorsSolution termFactorsSolution) {
        TermFactors termFactors = termFactorsSolution.getTermFactors();
        TermFactor oldFactor = termFactors.getFactor(_termFactorIdentifier);
        TermFactors newTermFactors = termFactors.withFactor(new TermFactor(oldFactor.getFactor() + 1, oldFactor.getFactorIdentifier()));
        termFactorsSolution.setTermFactors(newTermFactors);
    }

    @Override
    public void undo(TermFactorsSolution termFactorsSolution) {
        TermFactors termFactors = termFactorsSolution.getTermFactors();
        TermFactor oldFactor = termFactors.getFactor(_termFactorIdentifier);
        TermFactors newTermFactors =  termFactors.withFactor(new TermFactor(oldFactor.getFactor()-1, oldFactor.getFactorIdentifier()));
        termFactorsSolution.setTermFactors(newTermFactors);
    }
}
