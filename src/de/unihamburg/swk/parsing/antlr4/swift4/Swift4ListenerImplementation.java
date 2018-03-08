package de.unihamburg.swk.parsing.antlr4.swift4;

import de.unihamburg.masterprojekt2016.traceability.TypePointerClassification;
import de.unihamburg.swk.parsing.document.DocumentBuilder;
import de.unihamburg.swk.parsing.document.IDocumentFactory;
import de.unihamburg.swk.traceabilityrecovery.ISearchableDocument;

import java.util.List;

/**
 * Created by Tilmann Stehle on 08.03.2018.
 */
public class Swift4ListenerImplementation<T extends ISearchableDocument> extends Swift4BaseListener {

    private DocumentBuilder<T> docBuilder;
    private LocalScopeTracker lst;

    public Swift4ListenerImplementation(String filePath, IDocumentFactory<T> documentFactory) {
        this.docBuilder = new DocumentBuilder<>(filePath, documentFactory);
        this.lst = new LocalScopeTracker();
    }



    @Override
    public void enterClassDeclaration(Swift4Parser.ClassDeclarationContext ctx) {
        docBuilder.enterTypeDeclaration(ctx.identifier().getText(), TypePointerClassification.CLASS, ctx.getStart().getLine());
    }

    @Override
    public void exitClassDeclaration(Swift4Parser.ClassDeclarationContext ctx) {
        docBuilder.exitTypeDeclaration();
    }

    @Override
    public void enterVariableDeclaration(Swift4Parser.VariableDeclarationContext ctx) {
        super.enterVariableDeclaration(ctx);
    }

    @Override
    public void enterLetDeclaration(Swift4Parser.LetDeclarationContext ctx) {
        super.enterLetDeclaration(ctx);
    }

    @Override
    public void enterParameter(Swift4Parser.ParameterContext ctx) {
       // System.out.println(ctx.localParameterName().Identifier().getText());

    }

    public List<T> getDocuments() {
        return docBuilder.getDocuments();
    }

    public boolean errorOccurs() {
        return docBuilder.openTypes() > 0;
    }


}
