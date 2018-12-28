package de.unihamburg.swk.parsing;

import de.unihamburg.swk.traceabilityrecovery.lucene.LuceneDocsFactory;
import de.unihamburg.swk.traceabilityrecovery.lucene.LuceneDocument;

public class SwiftParserTest {

    public static void main(String[] args) {
        SwiftParser<LuceneDocument> parser = new SwiftParser<>("./testDocs/TwidereKomplett/swift/Twidere/Models/StatusUpdate.swift", new LuceneDocsFactory());
        
        for (LuceneDocument document : parser.parseDocuments()) {
            System.err.println(document);
            System.err.println(document.getTraceabilityPointer());
        }
    }
}


