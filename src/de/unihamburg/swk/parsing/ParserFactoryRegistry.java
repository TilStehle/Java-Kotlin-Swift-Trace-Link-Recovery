package de.unihamburg.swk.parsing;

import de.unihamburg.swk.parsing.document.IDocumentFactory;
import de.unihamburg.swk.parsing.javaparser.GithubJavaParser;
import de.unihamburg.swk.traceabilityrecovery.ISearchableDocument;
import de.unihamburg.swk.traceabilityrecovery.Language;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Tilmann Stehle
 * @author Jakob Andersen
 */
public class ParserFactoryRegistry {

	private static final  Map<Language, ParserFactory> registry = new HashMap<>();
	static
	{
		registry.put(Language.JAVA, new ParserFactory() {
			@Override
			public <TDocument extends ISearchableDocument> ISourceCodeParser<TDocument> createParser(IDocumentFactory<TDocument> documentFactory, String filePath) {
				return new GithubJavaParser<>(filePath, documentFactory);
			}
		});

		registry.put(Language.KOTLIN, new ParserFactory() {
			@Override
			public <TDocument extends ISearchableDocument> ISourceCodeParser<TDocument> createParser(IDocumentFactory<TDocument> documentFactory, String filePath) {
				return new KotlinParser<>(filePath, documentFactory);
			}
		});

		registry.put(Language.JAVASCRIPT, new ParserFactory() {
			@Override
			public <TDocument extends ISearchableDocument> ISourceCodeParser<TDocument> createParser(IDocumentFactory<TDocument> documentFactory, String filePath) {
				return new JavaScriptParser<>(filePath, documentFactory);
			}
		});

		registry.put(Language.SWIFT, new ParserFactory() {
			@Override
			public <TDocument extends ISearchableDocument> ISourceCodeParser<TDocument> createParser(IDocumentFactory<TDocument> documentFactory, String filePath) {
				return new Swift4Parser<>(filePath, documentFactory);
			}
		});

		registry.put(Language.CSHARP, new ParserFactory() {
			@Override
			public <TDocument extends ISearchableDocument> ISourceCodeParser<TDocument> createParser(IDocumentFactory<TDocument> documentFactory, String filePath) {
				return new CSharpParser<>(filePath, documentFactory);
			}
		});

	}

	public static void registerParserFactory(Language language, ParserFactory parserFactory)
	{
		registry.put(language, parserFactory);
	}

	public static <TDocument extends ISearchableDocument> ISourceCodeParser<TDocument> createParserForFilepath(IDocumentFactory<TDocument> documentFactory, String filePath )
	{
		Language languageForFile = Language.getLanguageForPath(filePath);

		if(languageForFile!= null && registry.containsKey(languageForFile))
		{
			return registry.get(languageForFile).createParser(documentFactory, filePath);
		}
		else throw new IllegalArgumentException("There is no appropriate parser registered at ParserFactoryRegistry for the file at "+ filePath);
	}




	public interface ParserFactory {

		<TDocument extends ISearchableDocument> ISourceCodeParser<TDocument> createParser(
				IDocumentFactory<TDocument> documentFactory, String filePath) ;

	}

}