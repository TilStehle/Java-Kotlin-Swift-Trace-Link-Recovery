package de.unihamburg.swk.parsing;

import de.unihamburg.swk.traceabilityrecovery.lucene.LuceneDocsFactory;
import de.unihamburg.swk.traceabilityrecovery.lucene.LuceneDocument;

public class Swift4ParserTest {

    public static void main(String[] args) {
        Swift4Parser<LuceneDocument> parser = new Swift4Parser<>("/Users/tilmannstehle/Documents/DissWorkspace/HDW/hdw-app-ios/HDW/MapDetailViewController.swift", new LuceneDocsFactory());
        long start = System.currentTimeMillis();
        for (LuceneDocument document : parser.parseDocuments()) {
            System.err.println(document);
        }

        long stop = System.currentTimeMillis();
        System.err.println("time elapsed for parsing: "+ (stop - start) +"ms");

    }
}


