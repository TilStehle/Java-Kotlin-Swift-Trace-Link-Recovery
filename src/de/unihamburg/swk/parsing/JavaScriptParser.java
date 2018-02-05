package de.unihamburg.swk.parsing;

import de.unihamburg.swk.parsing.antlr4.javascript.*;
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
import java.util.List;

/**
 * @author Jakob Andersen
 */

public class JavaScriptParser<TDocument extends ISearchableDocument> implements ISourceCodeParser<TDocument> {

	private String filePath;
	private IDocumentFactory<TDocument> documentFactory;

	public JavaScriptParser(String filePath, IDocumentFactory<TDocument> documentFactory) {
		this.filePath = filePath;
		this.documentFactory = documentFactory;
	}

	@Override
	public List<TDocument> parseDocuments() {
		return collectDocumentsWithANTLR();
	}


	private List<TDocument> collectDocumentsWithANTLR() {
		System.err.println("GithubJavaParser parse: " + filePath);
		
		ANTLRInputStream input;
		try (InputStream is = new FileInputStream(filePath)) {
			input = new ANTLRInputStream(is);
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
		JavaScriptLexer lexer = new JavaScriptLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		de.unihamburg.swk.parsing.antlr4.javascript.JavaScriptParser parser = new de.unihamburg.swk.parsing.antlr4.javascript.JavaScriptParser(tokens);
		parser.setErrorHandler(new InterruptableErrorHandler());
		ParseTree tree = parser.program();
		ParseTreeWalker walker = new ParseTreeWalker();
		JavaScriptListenerImplementation<TDocument> javaScriptListener = new JavaScriptListenerImplementation<>(filePath,
				documentFactory);
		try {
			walker.walk(javaScriptListener, tree);
		} catch (Exception e) {
			e.printStackTrace();
			ITraceabilityRecoveryService.NonParsedFiles.add(filePath);
		}
		finally {
			if(javaScriptListener.errorOccurs()) {
				System.err.println("fail");
			} else {
				System.err.println("ok!");
			}

			return javaScriptListener.getDocuments();
		}
	}

}