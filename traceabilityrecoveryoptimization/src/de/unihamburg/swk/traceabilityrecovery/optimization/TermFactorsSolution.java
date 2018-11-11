package de.unihamburg.swk.traceabilityrecovery.optimization;

import de.unihamburg.swk.parsing.document.TermFactors;
import de.unihamburg.swk.traceabilityrecovery.lucene.LuceneTraceabilityRecoveryService;
import org.jamesframework.core.problems.sol.Solution;

/**
 * Created by Tilmann Stehle on 01.11.2018.
 */
public class TermFactorsSolution extends Solution {
    private TermFactors termFactors;
    private LuceneTraceabilityRecoveryService _luceneTraceabilityRecoveryService;

    public TermFactorsSolution(TermFactors termFactors, LuceneTraceabilityRecoveryService luceneTraceabilityRecoveryService) {
        this.termFactors = termFactors;
        _luceneTraceabilityRecoveryService = luceneTraceabilityRecoveryService;
    }


    @Override
    public Solution copy() {
        return new TermFactorsSolution((TermFactors) termFactors.clone(), _luceneTraceabilityRecoveryService);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TermFactorsSolution that = (TermFactorsSolution) o;

        return termFactors != null ? termFactors.equals(that.termFactors) : that.termFactors == null;
    }

    @Override
    public int hashCode() {
        return termFactors != null ? termFactors.hashCode() : 0;
    }

    public TermFactors getTermFactors() {
        return termFactors;
    }

    public void setTermFactors(TermFactors termFactors) {
        this.termFactors = termFactors;
    }

    public LuceneTraceabilityRecoveryService getRecoveryService() {
        return _luceneTraceabilityRecoveryService;
    }
}
