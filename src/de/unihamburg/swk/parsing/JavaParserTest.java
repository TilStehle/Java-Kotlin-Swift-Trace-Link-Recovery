package de.unihamburg.swk.parsing;

import de.unihamburg.swk.parsing.javaparser.GithubJavaParser;
import de.unihamburg.swk.traceabilityrecovery.lucene.LuceneDocsFactory;
import de.unihamburg.swk.traceabilityrecovery.lucene.LuceneDocument;

import java.util.List;

public class JavaParserTest {

	public static void main(String[] args) {
		
//		Map<String, String> layers =  new HashMap<>();
//		layers.put("A", "A");
//		layers.put("B", "B");
//		layers.put("C", "C");
//		LayerManager.INSTANCE.setData(layers);

		JavaParser<LuceneDocument> parser = new JavaParser<>("C:\\Users\\Tilmann Stehle\\Documents\\Masterprojekt\\gitRecovery\\Java-Kotlin-Swift-Trace-Link-Recovery\\src\\de\\unihamburg\\swk\\parsing\\antlr4\\java8\\TestClass.java", new LuceneDocsFactory());
		
		long time = System.currentTimeMillis();

		List<LuceneDocument> luceneDocuments = parser.parseDocuments();
		for (LuceneDocument document : luceneDocuments) {
			System.err.println(document);
			System.err.println();
		}
		System.out.println(luceneDocuments.size());
		
		System.out.println((System.currentTimeMillis() - time)  + " millisec");
		
	}
}
