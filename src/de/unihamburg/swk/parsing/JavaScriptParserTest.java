package de.unihamburg.swk.parsing;

import de.unihamburg.swk.traceabilityrecovery.lucene.LuceneDocsFactory;
import de.unihamburg.swk.traceabilityrecovery.lucene.LuceneDocument;

/**
 * Created by Tilmann Stehle on 11.01.2018.
 */
public class JavaScriptParserTest {

    public static void main(String[] args) {


        JavaScriptParser<LuceneDocument> parser = new JavaScriptParser<>("C:\\Users\\Tilmann Stehle\\Documents\\Diss\\DESMO-JS\\desmoj_js\\target\\javascript\\desmoj\\core\\simulator\\EventAbstract.js", new LuceneDocsFactory());

        long time = System.currentTimeMillis();

        for (LuceneDocument document : parser.parseDocuments()) {
			System.err.println(document);
			System.err.println();
		}
        System.out.println(JavaScriptParser.timesNeeded.get(0)+"ms");

    }

}
