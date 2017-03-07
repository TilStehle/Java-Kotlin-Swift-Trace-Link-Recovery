package de.unihamburg.swk.traceabilityrecovery;

import de.unihamburg.masterprojekt2016.traceability.TraceabilityPointer;

/**
 * Created by Tilmann Stehle on 20.01.2017.
 */
public interface ISearchableDocument {
    void setTitle(String title);
    void addTerm(int weight, String term, String termType);
    String getDescription();
    TraceabilityPointer getTraceabilityPointer();
    void setLayer(String value);
}
