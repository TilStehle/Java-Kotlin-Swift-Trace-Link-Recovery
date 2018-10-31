package de.unihamburg.swk.parsing.document;

import de.unihamburg.masterprojekt2016.traceability.TraceabilityPointer;
import de.unihamburg.swk.traceabilityrecovery.ISearchableDocument;

/**
 * Created by Tilmann Stehle on 20.01.2017.
 */
public interface IDocumentFactory <T extends ISearchableDocument> {
    T  createDocument(TraceabilityPointer traceabilityPointer);

    TermFactors getTermFactors();
}
