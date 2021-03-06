package de.unihamburg.swk.parsing;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import de.unihamburg.swk.parsing.antlr4.swift4.Swift4Lexer;
import de.unihamburg.swk.parsing.antlr4.swift4.Swift4ListenerImplementation;
import de.unihamburg.swk.traceabilityrecovery.ISearchableDocument;
import de.unihamburg.swk.traceabilityrecovery.ITraceabilityRecoveryService;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import de.unihamburg.swk.parsing.antlr4.swift3.Swift3Lexer;
import de.unihamburg.swk.parsing.antlr4.swift3.Swift3ListenerImplementation;
import de.unihamburg.swk.parsing.antlr4.swift3.Swift3Parser;
import de.unihamburg.swk.parsing.document.IDocumentFactory;

public class SwiftParser<TDocument extends ISearchableDocument> implements ISourceCodeParser<TDocument> {

	private String filePath;
	private IDocumentFactory<TDocument> documentFactory;
	public static List<Long> timesNeeded = new ArrayList<Long>();

	public SwiftParser(String filePath, IDocumentFactory<TDocument> documentFactory) {
		this.filePath = filePath;
		this.documentFactory = documentFactory;
	}

	@Override
	public List<TDocument> parseDocuments() {
		System.err.println("SwiftParser parse: " + filePath);
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
		Swift3Lexer lexer = new Swift3Lexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		Swift3Parser parser = new Swift3Parser(tokens);
		parser.setErrorHandler(new InterruptableErrorHandler());
		ParseTree tree = parser.topLevel();
		ParseTreeWalker walker = new ParseTreeWalker();
		Swift3ListenerImplementation<TDocument> swiftListener = new Swift3ListenerImplementation<>(filePath,
				documentFactory);
		try {
			walker.walk(swiftListener, tree);

		} catch (Exception e) {
			e.printStackTrace();
			ITraceabilityRecoveryService.NonParsedFiles.add(filePath);
		}
		finally {

			long stop = System.currentTimeMillis();
			long timeElapsed= stop -start;
			timesNeeded.add(timeElapsed);
			if(swiftListener.errorOccurs()) {
				System.err.println(">> fail <<");
			} else {
				System.err.println("ok!");
			}

			return swiftListener.getDocuments();
		}

	}

}