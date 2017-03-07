package de.unihamburg.swk.parsing;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import de.unihamburg.swk.traceabilityrecovery.ISearchableDocument;
import de.unihamburg.swk.traceabilityrecovery.ITraceabilityRecoveryService;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import de.unihamburg.swk.parsing.antlr4.java8.Java8Lexer;
import de.unihamburg.swk.parsing.antlr4.java8.Java8ListenerImplementation;
import de.unihamburg.swk.parsing.antlr4.java8.Java8Parser;

/**
 * @author Jakob Andersen
 */

public class JavaParser<TDocument extends ISearchableDocument> implements ISourceCodeParser<TDocument> {

	private String filePath;
	private IDocumentFactory<TDocument> documentFactory;

	public JavaParser(String filePath, IDocumentFactory<TDocument> documentFactory) {
		this.filePath = filePath;
		this.documentFactory = documentFactory;
	}

	@Override
	public List<TDocument> parseDocuments() {
		System.err.println("JavaParser parse: " + filePath);
		return collectDocumentsWithANTLR();
	}

	private List<TDocument> collectDocumentsWithANTLR() {
		ANTLRInputStream input;
		try {
			InputStream is = new FileInputStream(filePath);
			input = new ANTLRInputStream(is);
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
		Java8Lexer lexer = new Java8Lexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		Java8Parser parser = new Java8Parser(tokens);
		ParseTree tree = parser.compilationUnit();
		ParseTreeWalker walker = new ParseTreeWalker();
		Java8ListenerImplementation<TDocument> javaListener = new Java8ListenerImplementation<TDocument>(filePath, documentFactory);
		try
		{

			walker.walk(javaListener, tree);
			return javaListener.getDocuments();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			ITraceabilityRecoveryService.NonParsedFiles.add(filePath);
			return new ArrayList<TDocument>();
		}
	}

}