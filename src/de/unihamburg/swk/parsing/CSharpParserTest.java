package de.unihamburg.swk.parsing;

import de.unihamburg.swk.traceabilityrecovery.lucene.LuceneDocsFactory;
import de.unihamburg.swk.traceabilityrecovery.lucene.LuceneDocument;

/**
 * Created by Tilmann Stehle on 04.09.2017.
 */
public class CSharpParserTest {
    public static void main(String[] args) {

//		Map<String, String> layers =  new HashMap<>();
//		layers.put("A", "A");
//		layers.put("B", "B");
//		layers.put("C", "C");
//		LayerManager.INSTANCE.setData(layers);C:\Users\Tilmann Stehle\Documents\Masterprojekt\SVN\SE-Manager\TraceabilityRecovery\testDocs\LuceneNet\Net\Index\BinaryDocValuesFieldUpdates.cs
        CSharpParser<LuceneDocument> parser = new CSharpParser<>("C:\\Users\\Tilmann Stehle\\Documents\\Masterprojekt\\SVN\\SE-Manager\\TraceabilityRecovery\\testDocs\\LuceneNet\\Net\\Index\\BinaryDocValuesFieldUpdates.cs", new LuceneDocsFactory());

        long time = System.currentTimeMillis();

		for (LuceneDocument document : parser.parseDocuments()) {
			System.err.println(document.getTraceabilityPointer());
			System.err.println();
		}
        System.out.println(parser.parseDocuments().size());

        System.out.println((System.currentTimeMillis() - time) / 1000 + " sec");

    }
}
