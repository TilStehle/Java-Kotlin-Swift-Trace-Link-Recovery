package de.unihamburg.swk.parsing;

import de.unihamburg.swk.parsing.antlr4.kotlin.KotlinLexer;
import de.unihamburg.swk.parsing.antlr4.kotlin.KotlinListenerImplementation;
import de.unihamburg.swk.parsing.document.IDocumentFactory;
import de.unihamburg.swk.traceabilityrecovery.ISearchableDocument;
import de.unihamburg.swk.traceabilityrecovery.ITraceabilityRecoveryService;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Jakob Andersen
 */

public class KotlinParser<TDocument extends ISearchableDocument> implements ISourceCodeParser<TDocument> {

	private String filePath;
	private IDocumentFactory<TDocument> documentFactory;
	public static List<Long> timesNeeded = new ArrayList<Long>();


	public KotlinParser(String filePath, IDocumentFactory<TDocument> documentFactory) {
		this.filePath = filePath;
		this.documentFactory = documentFactory;
	}

	@Override
	public List<TDocument> parseDocuments() {
		System.err.println("KotlinParser parse: " + filePath);
		return collectDocumentsWithANTLR();
	}

	private List<TDocument> collectDocumentsWithANTLR() {
		long start = System.currentTimeMillis();
		ANTLRInputStream input;
		try (InputStream is = new FileInputStream(filePath)) {
			input = new ANTLRInputStream(is);
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
		KotlinLexer lexer = new KotlinLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		de.unihamburg.swk.parsing.antlr4.kotlin.KotlinParser parser = new de.unihamburg.swk.parsing.antlr4.kotlin.KotlinParser(
				tokens);

		parser.setErrorHandler(new InterruptableErrorHandler());

		KotlinListenerImplementation<TDocument> kotlinListener = new KotlinListenerImplementation<>(filePath,
				documentFactory);
		try {

			ParseTree tree = parser.kotlinFile();
			ParseTreeWalker walker = new ParseTreeWalker();
			walker.walk(kotlinListener, tree);

		} catch (Exception e) {
			e.printStackTrace();
			ITraceabilityRecoveryService.NonParsedFiles.add(filePath);
		}

		finally
		{

			long timeElapsed = System.currentTimeMillis()- start;
			timesNeeded.add(timeElapsed);
			if(kotlinListener.errorOccurs())
			{
				System.err.println("fail, time Elapsed: "+timeElapsed);
			} else {
				System.err.println("ok!, time Elapsed: "+timeElapsed);
			}
			return kotlinListener.getDocuments();
		}
	}

}