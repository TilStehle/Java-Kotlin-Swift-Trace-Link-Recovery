package de.unihamburg.swk.parsing.document;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Tilmann Stehle on 01.11.2018.
 */

public class TermFactorsTest {

    private TermFactors termFactorsUnderTest = TermFactors.ALL_FACTORS_ONE;

    @Test
    public void TestCorrectFactorIsChanged()
    {
        TermFactors changedTermFactors = termFactorsUnderTest.withFactor(new TermFactor(2, TermFactors.OWN_METHOD_FACTOR));
        changedTermFactors=changedTermFactors.withFactor(new TermFactor(34, TermFactors.ENCLOSING_TYPE_FACTOR));
        assertEquals(2,changedTermFactors.ownMethodFactor.getFactor());
        assertEquals(34,changedTermFactors.enclosingTypeFactor.getFactor());

    }

}
