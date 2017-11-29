package de.unihamburg.swk.parsing;

import de.unihamburg.swk.parsing.antlr4.csharp.CSharpLexer;
import de.unihamburg.swk.parsing.antlr4.csharp.CSharpListenerImplementation;
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
 * Created by Tilmann Stehle on 04.09.2017.
 */
public class CSharpParser<TDocument extends ISearchableDocument> implements ISourceCodeParser<TDocument>  {
    private String filePath;
    private IDocumentFactory<TDocument> documentFactory;

    public CSharpParser(String filePath, IDocumentFactory<TDocument> documentFactory) {
        this.filePath = filePath;
        this.documentFactory = documentFactory;
    }

    @Override
    public List<TDocument> parseDocuments() {
        return collectDocumentsWithANTLR();
    }


    private List<TDocument> collectDocumentsWithANTLR() {
        System.err.println("CSharpParser parse: " + filePath);

        ANTLRInputStream  input;
        try (InputStream is = new FileInputStream(filePath)) {
            input = new ANTLRInputStream(is);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        CSharpLexer lexer = new CSharpLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        de.unihamburg.swk.parsing.antlr4.csharp.CSharpParser parser = new de.unihamburg.swk.parsing.antlr4.csharp.CSharpParser(tokens);
        parser.setErrorHandler(new InterruptableErrorHandler());
        ParseTree tree = parser.compilation_unit();
        ParseTreeWalker walker = new ParseTreeWalker();
        CSharpListenerImplementation<TDocument> csharpListener = new CSharpListenerImplementation<>(filePath,
                documentFactory);
        try {
            walker.walk(csharpListener, tree);
        } catch (Exception e) {
            e.printStackTrace();
            ITraceabilityRecoveryService.NonParsedFiles.add(filePath);
        }
        finally {
            if(csharpListener.errorOccurs()) {
                System.err.println("fail");
            } else {
                System.err.println("ok!");
            }

            return csharpListener.getDocuments();
        }
    }
}
