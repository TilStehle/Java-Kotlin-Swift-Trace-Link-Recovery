package de.unihamburg.swk.parsing;

import de.unihamburg.swk.parsing.document.IDocumentFactory;
import de.unihamburg.swk.parsing.javaparser.GithubJavaParser;
import de.unihamburg.swk.traceabilityrecovery.ISearchableDocument;
import de.unihamburg.swk.traceabilityrecovery.Language;

/**
 * 
 * @author Tilmann Stehle
 * @author Jakob Andersen
 *
 */
public class ParserFactory {


	public static <TDocument extends ISearchableDocument> ISourceCodeParser<TDocument> createParser(
			IDocumentFactory<TDocument> documentFactory, String filePath) {
		if (filePath.endsWith(Language.JAVA.getFileExtension())) {
			return new GithubJavaParser<>(filePath, documentFactory);
		} else if (filePath.endsWith(Language.KOTLIN.getFileExtension())) {
			return new KotlinParser<>(filePath, documentFactory);
		} else if (filePath.endsWith(Language.SWIFT.getFileExtension())) {
			return new Swift4Parser<>(filePath, documentFactory);
		}else if (filePath.endsWith(Language.CSHARP.getFileExtension())) {
			return new CSharpParser<>(filePath, documentFactory);
		}else if (filePath.endsWith(Language.JAVASCRIPT.getFileExtension())) {
			return new JavaScriptParser<>(filePath, documentFactory);
		} else if (filePath.endsWith(".testdoc")) {
			return new TestDocParser<>(filePath, documentFactory);
		}else
			throw new IllegalArgumentException(
					"there is no Parser Class available to process the given File: " + filePath);
	}

}
