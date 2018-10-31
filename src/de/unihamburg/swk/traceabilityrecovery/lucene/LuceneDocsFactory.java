package de.unihamburg.swk.traceabilityrecovery.lucene;

import de.unihamburg.masterprojekt2016.traceability.TraceabilityPointer;
import de.unihamburg.swk.parsing.document.IDocumentFactory;
import de.unihamburg.swk.parsing.document.TermFactors;
import de.unihamburg.swk.traceabilityrecovery.ISearchableDocument;

/**
 * Created by Tilmann Stehle on 20.01.2017.
 */
public class LuceneDocsFactory implements IDocumentFactory<LuceneDocument> {
    private static long currentId = 0;

    private TermFactors termFactors = TermFactors.DEFAULT_FACTORS;

    @Override
    public LuceneDocument createDocument(TraceabilityPointer pointer) {
        return new LuceneDocument(pointer, currentId++);
    }

    @Override
    public TermFactors getTermFactors() {
        return termFactors;
    }
}
