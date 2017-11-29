package de.unihamburg.swk.parsing.antlr4.swift3.test;

import java.util.ArrayList;
import java.util.List;

import de.unihamburg.swk.traceabilityrecovery.ISearchableDocument;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import de.unihamburg.swk.parsing.antlr4.swift3.Swift3Lexer;
import de.unihamburg.swk.parsing.antlr4.swift3.Swift3ListenerImplementation;
import de.unihamburg.swk.parsing.antlr4.swift3.Swift3Parser;
import de.unihamburg.swk.parsing.document.IDocumentFactory;

/**
 * @author Jakob Andersen
 */
public class SwiftTestParser<TDocument extends ISearchableDocument> {

	public enum Type {
		classDeclaration,
		structDeclaration,
		enumDeclaration,
		extensionDeclaration,
		
		variableDeclaration,
		constantDeclaration,
		subscriptDeclaration,
		initializerDeclaration,
		functionDeclaration,
		operatorDeclaration,
		
		protocolDeclaration,
		protocolMethodDeclaration,
		protocolInitializerDeclaration,
		protocolSubscriptDeclaration,
		protocolPropertyDeclaration, 
		protocolAssociatedTypeDeclaration,
		
		topLevel, 
		closureExpression;
		
	}
	
	private IDocumentFactory<TDocument> documentFactory;

	public SwiftTestParser(IDocumentFactory<TDocument> documentFactory) {
		this.documentFactory = documentFactory;
	}

	public List<TDocument> parseDocuments(String input, Type type) {
		return collectDocumentsWithANTLR(input, type);
	}

	private List<TDocument> collectDocumentsWithANTLR(String s, Type type) {
		ANTLRInputStream input = new ANTLRInputStream(s);
		Swift3Lexer lexer = new Swift3Lexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		Swift3Parser parser = new Swift3Parser(tokens);
		ParseTree tree = getParseTree(parser, type);
		ParseTreeWalker walker = new ParseTreeWalker();
		Swift3ListenerImplementation<TDocument> javaListener = new Swift3ListenerImplementation<>("testCase",
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

	private static ParseTree getParseTree(Swift3Parser parser, Type type) {
		switch (type) {
		case topLevel:
			return parser.topLevel();
		case classDeclaration:
			return parser.classDeclaration();
		case structDeclaration:
			return parser.structDeclaration();
		case extensionDeclaration:
			return parser.extensionDeclaration();
		case initializerDeclaration:
			return parser.initializerDeclaration();
		case enumDeclaration:
			return parser.enumDeclaration();
		case functionDeclaration:
			return parser.functionDeclaration();
		case protocolDeclaration:
			return parser.protocolDeclaration();
		case protocolMethodDeclaration:
			return parser.protocolMethodDeclaration();
		case protocolInitializerDeclaration:
			return parser.protocolInitializerDeclaration();
		case protocolSubscriptDeclaration:
			return parser.protocolSubscriptDeclaration();
		case subscriptDeclaration:
			return parser.subscriptDeclaration();
		case variableDeclaration:
			return parser.variableDeclaration();
		case constantDeclaration:
			return parser.constantDeclaration();
		case operatorDeclaration:
			return parser.operatorDeclaration();
		case protocolPropertyDeclaration:
			return parser.protocolPropertyDeclaration();
		case closureExpression:
			return parser.closureExpression();
		default:
			throw new IllegalArgumentException(type.toString());
		}
		
	}

}