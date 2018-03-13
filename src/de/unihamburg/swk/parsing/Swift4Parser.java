package de.unihamburg.swk.parsing;

import de.unihamburg.swk.parsing.antlr4.swift4.Swift4Lexer;
import de.unihamburg.swk.parsing.antlr4.swift4.Swift4ListenerImplementation;
import de.unihamburg.swk.parsing.document.IDocumentFactory;
import de.unihamburg.swk.traceabilityrecovery.ISearchableDocument;
import de.unihamburg.swk.traceabilityrecovery.ITraceabilityRecoveryService;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.atn.PredictionMode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class Swift4Parser<TDocument extends ISearchableDocument> implements ISourceCodeParser<TDocument> {

    private String filePath;
    private IDocumentFactory<TDocument> documentFactory;
    public static List<Long> timesNeeded = new ArrayList<Long>();

    public Swift4Parser(String filePath, IDocumentFactory<TDocument> documentFactory) {
        this.filePath = filePath;
        this.documentFactory = documentFactory;
    }

    @Override
    public List<TDocument> parseDocuments() {
        System.err.println("Parsing Swift 4: " + filePath);
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
        Swift4Lexer lexer = new Swift4Lexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        de.unihamburg.swk.parsing.antlr4.swift4.Swift4Parser parser = new de.unihamburg.swk.parsing.antlr4.swift4.Swift4Parser(tokens);
        parser.setErrorHandler(new InterruptableErrorHandler());
        //parser.getInterpreter().setPredictionMode(PredictionMode.SLL);
        ParseTree tree;
        try {
            tree = parser.program();
        } catch (Exception e) {
            e.printStackTrace();
            parser.getInterpreter().setPredictionMode(PredictionMode.LL);
            tree = parser.program();

        }
        ParseTreeWalker walker = new ParseTreeWalker();
        Swift4ListenerImplementation<TDocument> swiftListener = new Swift4ListenerImplementation<>(filePath,
                documentFactory);
        try {
            walker.walk(swiftListener, tree);

        } catch (Exception e) {
            e.printStackTrace();
            ITraceabilityRecoveryService.NonParsedFiles.add(filePath);
        } finally {

            long stop = System.currentTimeMillis();
            long timeElapsed = stop - start;
            timesNeeded.add(timeElapsed);
            if (swiftListener.errorOccurs()) {
                System.err.println(">> fail <<");
            } else {
                System.err.println("ok!");
            }

            return swiftListener.getDocuments();
        }

    }

}