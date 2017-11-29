package de.unihamburg.swk.parsing.antlr4.java8.test;

import java.util.ArrayList;
import java.util.List;

import de.unihamburg.swk.parsing.antlr4.java8.Java8Parser;
import de.unihamburg.swk.traceabilityrecovery.ISearchableDocument;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import de.unihamburg.swk.parsing.antlr4.java8.Java8Lexer;
import de.unihamburg.swk.parsing.antlr4.java8.Java8ListenerImplementation;
import de.unihamburg.swk.parsing.document.IDocumentFactory;

/**
 * @author Jakob Andersen
 */
public class JavaTestParser<TDocument extends ISearchableDocument> {

	public enum Type {
		compilationUnit,
		normalClassDeclaration,
		normalInterfaceDeclaration,
		methodDeclaration,
		fieldDeclaration,
		lambdaExpression,
		enumDeclaration,
		constructorDeclaration,
	}
	
	private IDocumentFactory<TDocument> documentFactory;

	public JavaTestParser(IDocumentFactory<TDocument> documentFactory) {
		this.documentFactory = documentFactory;
	}

	public List<TDocument> parseDocuments(String input, Type type) {
		return collectDocumentsWithANTLR(input, type);
	}

	private List<TDocument> collectDocumentsWithANTLR(String s, Type type) {
		ANTLRInputStream input = new ANTLRInputStream(s);
		Java8Lexer lexer = new Java8Lexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		Java8Parser parser = new Java8Parser(tokens);
		ParseTree tree = getParseTree(parser, type);
		ParseTreeWalker walker = new ParseTreeWalker();
		Java8ListenerImplementation<TDocument> javaListener = new Java8ListenerImplementation<>("testCase",
				documentFactory);
		try {
			walker.walk(javaListener, tree);
			return javaListener.getDocuments();
		} catch (Exception e) {
			e.printStackTrace();
//			ITraceabilityRecoveryService.NonParsedFiles.add(filePath);
			return new ArrayList<>();
		}
	}

	private static ParseTree getParseTree(Java8Parser parser, Type type) {
		switch (type) {
		case compilationUnit:
			return parser.compilationUnit();
		case normalClassDeclaration:
			return parser.normalClassDeclaration();
		case normalInterfaceDeclaration:
			return parser.normalInterfaceDeclaration();
		case methodDeclaration:
			return parser.methodDeclaration();
		case fieldDeclaration:
			return parser.fieldDeclaration();
		case lambdaExpression:
			return parser.lambdaExpression();
		case enumDeclaration:
			return parser.enumDeclaration();
		case constructorDeclaration:
			return parser.constructorDeclaration();
		default:
			throw new IllegalArgumentException(type.toString());
		}
		
	}

}