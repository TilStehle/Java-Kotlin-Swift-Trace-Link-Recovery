package de.unihamburg.swk.parsing;

import de.unihamburg.swk.traceabilityrecovery.lucene.LuceneDocsFactory;
import de.unihamburg.swk.traceabilityrecovery.lucene.LuceneDocument;

public class SwiftParserTest {

    public static void main(String[] args) {
        SwiftParser<LuceneDocument> parser = new SwiftParser<>("C:/Users/Tilmann Stehle/Documents/Masterprojekt/gitRecovery/Java-Kotlin-Swift-Trace-Link-Recovery/testDocs/TwidereKomplett/swift/Twidere/Services/MicroBlog/OAuthService.swift", new LuceneDocsFactory());
        
        for (LuceneDocument document : parser.parseDocuments()) {
            System.err.println(document);
            System.err.println(document.getTraceabilityPointer());
        }
    }
}


