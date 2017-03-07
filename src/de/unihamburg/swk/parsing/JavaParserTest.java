package de.unihamburg.swk.parsing;

import de.unihamburg.swk.traceabilityrecovery.lucene.LuceneDocsFactory;
import de.unihamburg.swk.traceabilityrecovery.lucene.LuceneDocument;

public class JavaParserTest {

	public static void main(String[] args) {
		
		JavaParser<LuceneDocument> parser = new JavaParser<>("./testDocs/TestClass.java", new LuceneDocsFactory());
//		JavaParser<LS3Document> parser = new JavaParser<>("./testDocs/TestClass.java", new LS3DocumentFactory());
		
		for (LuceneDocument document : parser.parseDocuments()) {
			System.err.println(document);
			System.err.println();
		}
		
	}
}
