package de.unihamburg.swk.parsing.javaparser;

import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import de.unihamburg.swk.parsing.ISourceCodeParser;
import de.unihamburg.swk.parsing.document.DocumentBuilder;
import de.unihamburg.swk.parsing.document.IDocumentFactory;
import de.unihamburg.swk.traceabilityrecovery.ISearchableDocument;
import de.unihamburg.swk.traceabilityrecovery.lucene.LuceneDocsFactory;
import org.antlr.v4.runtime.ANTLRInputStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Created by Tilmann Stehle on 12.01.2018.
 */
public class GithubJavaParser<TDocument extends ISearchableDocument>  implements ISourceCodeParser<TDocument>

{
    private final DocumentBuilder docBuilder;
    private String filePath;
    private IDocumentFactory<TDocument> documentFactory;

    public GithubJavaParser(String filePath, IDocumentFactory<TDocument> documentFactory) {
        this.filePath = filePath;
        this.docBuilder = new DocumentBuilder<>(filePath, documentFactory);
    }



        @Override
        public List<TDocument> parseDocuments() {
            try (InputStream is = new FileInputStream(filePath)) {
                System.out.println("JavaParser parse: " + filePath);
                CompilationUnit compilationUnit = com.github.javaparser.JavaParser.parse(is);
                JavaVisitor<TDocument> visitor = new JavaVisitor( );
                compilationUnit.accept(visitor, docBuilder);
            } catch (IOException e) {
                e.printStackTrace();
                return null;
            }
            return docBuilder.getDocuments();
    }
}
