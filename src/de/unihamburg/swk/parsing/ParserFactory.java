package de.unihamburg.swk.parsing;

import de.unihamburg.swk.traceabilityrecovery.ISearchableDocument;

/**
 * 
 * @author Tilmann Stehle
 * @author Jakob Andersen
 *
 */
public class ParserFactory {

	private static final String JAVA_FILE = ".java";
	private static final String KOTLIN_FILE = ".kt";
	private static final String SWIFT_FILE = ".swift";
	private static final String TESTDOC_FILE = ".testdoc";

	public static <TDocument extends ISearchableDocument> ISourceCodeParser<TDocument> createParser(
			IDocumentFactory<TDocument> documentFactory, String filePath) {
		if (filePath.endsWith(JAVA_FILE)) {
			return new JavaParser<TDocument>(filePath, documentFactory);
		} else if (filePath.endsWith(KOTLIN_FILE)) {
			return new KotlinParser<TDocument>(filePath, documentFactory);
		} else if (filePath.endsWith(SWIFT_FILE)) {
			return new SwiftParser<TDocument>(filePath, documentFactory);
		} else if (filePath.endsWith(TESTDOC_FILE)) {
			return new TestDocParser<TDocument>(filePath, documentFactory);
		} else
			throw new IllegalArgumentException(
					"there is no Parser Class available to process the given File: " + filePath);
	}

}
