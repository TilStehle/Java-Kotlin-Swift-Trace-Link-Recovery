package de.unihamburg.swk.parsing.antlr4.javascript;

import de.unihamburg.swk.parsing.antlr4.java8.Java8Parser;
import de.unihamburg.swk.parsing.document.*;
import de.unihamburg.swk.traceabilityrecovery.ISearchableDocument;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.LinkedList;
import java.util.List;

import static de.unihamburg.masterprojekt2016.traceability.TypePointerClassification.CLASS;

/**
 * Created by Tilmann Stehle on 10.01.2018.
 */
public class JavaScriptListenerImplementation<TDocument extends ISearchableDocument> extends JavaScriptParserBaseListener {

    private DocumentBuilder<TDocument> docBuilder;
    private GeneralListenerExtension listenerExtension;

    public JavaScriptListenerImplementation(String filePath, IDocumentFactory<TDocument> documentFactory) {
        this.docBuilder = new DocumentBuilder<>(filePath, documentFactory);
        listenerExtension = new GeneralListenerExtension(TermMapperManager.JAVASCRIPT);
    }


    @Override
    public void enterFunctionDeclaration(JavaScriptParser.FunctionDeclarationContext ctx) {
        String pointerName = ctx.Identifier().toString();
        String mappedName = listenerExtension.getMappedMethodName(pointerName);
        mappedName=mappedName != null? mappedName : "anonymous function";
        docBuilder.enterFunctionDeclaration(mappedName , ctx.getStart().getLine());
    }

    @Override
    public void exitFunctionDeclaration(JavaScriptParser.FunctionDeclarationContext ctx) {

        docBuilder.closeElement();
    }

    @Override
    public void enterFunctionExpression(JavaScriptParser.FunctionExpressionContext ctx) {
        String mappedName = null;
        if(ctx.Identifier() !=null)
        {
            String pointerName = ctx.Identifier().toString();
            mappedName = listenerExtension.getMappedMethodName(pointerName);
        }

        mappedName=mappedName != null? mappedName : "";
        docBuilder.enterFunctionDeclaration(mappedName,ctx.getStart().getLine());
    }


    @Override
    public void exitFunctionExpression(JavaScriptParser.FunctionExpressionContext ctx) {
        docBuilder.closeElement();
    }

    @Override
    public void enterClassExpression(JavaScriptParser.ClassExpressionContext ctx) {
        String className = ctx.Identifier().getText();
        List<String> inheritance = new LinkedList<>();
       docBuilder.enterTypeDeclaration(className, CLASS, inheritance);
    }
    @Override
    public void exitClassExpression(JavaScriptParser.ClassExpressionContext ctx) {
        docBuilder.exitTypeDeclaration();
    }

    @Override
    public void enterClassDeclaration(JavaScriptParser.ClassDeclarationContext ctx) {
        String className = ctx.Identifier().getText();
        List<String> inheritance = new LinkedList<>();
        docBuilder.enterTypeDeclaration(className, CLASS, inheritance);
    }

    @Override
    public void exitClassDeclaration(JavaScriptParser.ClassDeclarationContext ctx) {
        docBuilder.exitTypeDeclaration();
    }

    @Override
    public void enterMethodDefinition(JavaScriptParser.MethodDefinitionContext ctx) {
        String pointerName = ctx.propertyName().getText();
        String mappedName = listenerExtension.getMappedMethodName(pointerName);
        if(pointerName.equals("constructor"))
        {
            docBuilder.enterConstructor(docBuilder.getCurrentTypeName());
        }
        else
        {
            docBuilder.enterMethod(pointerName, mappedName);
        }
    }

    @Override
    public void exitMethodDefinition(JavaScriptParser.MethodDefinitionContext ctx) {
        docBuilder.closeElement();
    }

    @Override
    public void exitFormalParameterArg(JavaScriptParser.FormalParameterArgContext ctx) {
        docBuilder.enterParameter(ctx.Identifier().getText(), getUndefinedType());
    }


    @Override
    public void enterVariableDeclaration(JavaScriptParser.VariableDeclarationContext ctx) {
        docBuilder.enterLocalVariable(ctx.Identifier().getText(), getUndefinedType());
    }


    private PointerTypeSeparator getUndefinedType() {
        return new PointerTypeSeparator("", TermMapperManager.JAVASCRIPT);
    }


    public boolean errorOccurs() {
        return docBuilder.openTypes() > 0;
    }

    public List<TDocument> getDocuments() {
        return docBuilder.getDocuments();
    }


}
