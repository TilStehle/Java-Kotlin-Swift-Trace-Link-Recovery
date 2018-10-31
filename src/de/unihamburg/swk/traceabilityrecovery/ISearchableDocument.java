package de.unihamburg.swk.traceabilityrecovery;

import de.unihamburg.masterprojekt2016.traceability.TraceabilityPointer;
import de.unihamburg.swk.parsing.document.TermFactor;
import de.unihamburg.swk.parsing.document.TermFactors;

/**
 * Created by Tilmann Stehle on 20.01.2017.
 */
public interface ISearchableDocument {
    void setTitle(String title);
    void addTerm(TermFactor weight, String term, String termType);
    String getDescription();
    TraceabilityPointer getTraceabilityPointer();
    void setLayer(String value);

    void traceabilityPointerHasChanged();

    void applyTermFactors(TermFactors newTermFactors);
}
