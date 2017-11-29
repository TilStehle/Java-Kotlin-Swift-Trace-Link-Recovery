package de.unihamburg.swk.parsing;

//import de.andreasschoknecht.LS3.LS3Document;
//import de.unihamburg.swk.parsing.antlr4.java8.Java8Lexer;
//import de.unihamburg.swk.parsing.antlr4.java8.Java8ListenerImplementation;
//import de.unihamburg.swk.parsing.antlr4.java8.Java8Parser;
//import de.unihamburg.swk.traceabilityrecovery.lucene.LuceneDocsFactory;
//import de.unihamburg.swk.traceabilityrecovery.lucene.LuceneDocument;
//import org.antlr.v4.runtime.ANTLRInputStream;
//import org.antlr.v4.runtime.CommonTokenStream;
//import org.antlr.v4.runtime.tree.ParseTree;
//import org.antlr.v4.runtime.tree.ParseTreeWalker;
//
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.io.InputStream;
//import java.util.List;
//
///**
// * @author Jakob Andersen
// */
//
//public class JavaLuceneDocsParser implements ISourceCodeParser<LuceneDocument> {
//
//	private String filePath;
//
//	public JavaLuceneDocsParser(String filePath) {
//		this.filePath = filePath;
//	}
//
//	@Override
//	public List<LuceneDocument> parseDocuments() {
//		System.err.println("JavaParser parse: " + filePath);
//		return collectDocumentsWithANTLR();
//	}
//
//	private List<LuceneDocument> collectDocumentsWithANTLR() {
//		ANTLRInputStream input;
//		try {
//			InputStream is = new FileInputStream(filePath);
//			input = new ANTLRInputStream(is);
//		} catch (IOException e) {
//			e.printStackTrace();
//			return null;
//		}
//		Java8Lexer lexer = new Java8Lexer(input);
//		CommonTokenStream tokens = new CommonTokenStream(lexer);
//		Java8Parser parser = new Java8Parser(tokens);
//		ParseTree tree = parser.compilationUnit();
//		ParseTreeWalker walker = new ParseTreeWalker();
//		Java8ListenerImplementation<LuceneDocument> javaListener = new Java8ListenerImplementation<LuceneDocument>(filePath, new LuceneDocsFactory());
//		walker.walk(javaListener, tree);
//		return javaListener.getDocuments();
//	}
//
//}