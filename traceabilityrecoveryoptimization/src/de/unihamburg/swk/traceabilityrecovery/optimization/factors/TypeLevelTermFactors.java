package de.unihamburg.swk.traceabilityrecovery.optimization.factors;

import de.unihamburg.swk.parsing.document.TermFactor;
import de.unihamburg.swk.parsing.document.TermFactors;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tilmann Stehle on 18.11.2018.
 */
public class TypeLevelTermFactors extends TermFactors {

    public static List<TermFactor> getChangeableTermFactors(TermFactors termFactors) {
        List<TermFactor> allFactors = termFactors.getAllFactors();
        allFactors = new ArrayList<>(allFactors);

        allFactors.removeIf(factor -> factor.getFactorIdentifier().equals(TermFactors.OWN_ATTRIBUTE_FACTOR));
        allFactors.removeIf(factor -> factor.getFactorIdentifier().equals(TermFactors.OWN_ATTRIBUTE_TYPE_FACTOR));
        allFactors.removeIf(factor -> factor.getFactorIdentifier().equals(TermFactors.OWN_METHOD_FACTOR));
        allFactors.removeIf(factor -> factor.getFactorIdentifier().equals(TermFactors.OWN_METHOD_TYPE_FACTOR));
        allFactors.removeIf(factor -> factor.getFactorIdentifier().equals(TermFactors.OWN_CLOSURE_TYPE_FACTOR));
        allFactors.removeIf(factor -> factor.getFactorIdentifier().equals(TermFactors.OWN_CONSTRUCTOR_FACTOR));
        allFactors.removeIf(factor -> factor.getFactorIdentifier().equals(TermFactors.OWN_LOCAL_VARIABLE_FACTOR));
        allFactors.removeIf(factor -> factor.getFactorIdentifier().equals(TermFactors.OWN_LOCAL_VARIABLE_TYPE_FACTOR));
        allFactors.removeIf(factor -> factor.getFactorIdentifier().equals(TermFactors.OWN_PARAMETER_FACTOR));
        allFactors.removeIf(factor -> factor.getFactorIdentifier().equals(TermFactors.OWN_PARAMETER_TYPE_FACTOR));
        allFactors.removeIf(factor -> factor.getFactorIdentifier().equals(TermFactors.VARIABLE_USAGE_FACTOR));
        allFactors.removeIf(factor -> factor.getFactorIdentifier().equals(TermFactors.METHOD_CALL_FACTOR));
        return allFactors;
    }
}
