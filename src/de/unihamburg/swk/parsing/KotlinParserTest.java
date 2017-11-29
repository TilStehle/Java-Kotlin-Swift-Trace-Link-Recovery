package de.unihamburg.swk.parsing;

import de.unihamburg.swk.traceabilityrecovery.lucene.LuceneDocsFactory;
import de.unihamburg.swk.traceabilityrecovery.lucene.LuceneDocument;

public class KotlinParserTest {

	public static void main(String[] args) {
		
		KotlinParser<LuceneDocument> parser = new KotlinParser<>("C:\\Users\\Tilmann Stehle\\Documents\\Masterprojekt\\SVN\\SE-Manager\\TraceabilityRecovery\\testDocs\\TwidereKomplett\\java\\twidere\\src\\main\\kotlin\\org\\mariotaku\\twidere\\util\\OAuthPasswordAuthenticator.kt", new LuceneDocsFactory());
		
		for (LuceneDocument document : parser.parseDocuments()) {
			System.err.println(document);
			System.err.println();
		}
	}
}


