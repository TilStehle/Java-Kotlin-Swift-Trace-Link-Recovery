package de.unihamburg.swk.parsing.javaparser;

import de.unihamburg.swk.parsing.CSharpParser;
import de.unihamburg.swk.traceabilityrecovery.lucene.LuceneDocsFactory;
import de.unihamburg.swk.traceabilityrecovery.lucene.LuceneDocument;

/**
 * Created by Tilmann Stehle on 26.02.2018.
 */
public class GithubJavaParserTest {
    public static void main(String[] args) {

        GithubJavaParser<LuceneDocument> parser = new GithubJavaParser<>("C:\\Users\\Tilmann Stehle\\Documents\\Masterprojekt\\gitRecovery\\Java-Kotlin-Swift-Trace-Link-Recovery\\testDocs\\TwidereKomplett\\java\\twidere.component.common\\src\\main\\java\\org\\mariotaku\\twidere\\model\\account\\cred\\Credentials.java", new LuceneDocsFactory());

        long time = System.currentTimeMillis();

        for (LuceneDocument document : parser.parseDocuments()) {
            System.err.println(document);
            System.err.println();
        }
        System.out.println(parser.parseDocuments().size());

        System.out.println((System.currentTimeMillis() - time) / 1000 + " sec");

    }
}
