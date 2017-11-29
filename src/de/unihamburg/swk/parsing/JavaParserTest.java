package de.unihamburg.swk.parsing;

import de.unihamburg.swk.traceabilityrecovery.lucene.LuceneDocsFactory;
import de.unihamburg.swk.traceabilityrecovery.lucene.LuceneDocument;

public class JavaParserTest {

	public static void main(String[] args) {
		
//		Map<String, String> layers =  new HashMap<>();
//		layers.put("A", "A");
//		layers.put("B", "B");
//		layers.put("C", "C");
//		LayerManager.INSTANCE.setData(layers);
		
		JavaParser<LuceneDocument> parser = new JavaParser<>("./testDocs/ParserTestDocs/TestClass.java", new LuceneDocsFactory());
		
		long time = System.currentTimeMillis();
		
//		for (LuceneDocument document : parser.parseDocuments()) {
//			System.err.println(document);
//			System.err.println();
//		}
		System.out.println(parser.parseDocuments().size());
		
		System.out.println((System.currentTimeMillis() - time) / 1000 + " sec");
		
	}
}
