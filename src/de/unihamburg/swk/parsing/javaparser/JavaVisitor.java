package de.unihamburg.swk.parsing.javaparser;

import com.github.javaparser.ast.PackageDeclaration;
import com.github.javaparser.ast.body.*;
import com.github.javaparser.ast.expr.LambdaExpr;
import com.github.javaparser.ast.expr.ObjectCreationExpr;
import com.github.javaparser.ast.expr.VariableDeclarationExpr;
import com.github.javaparser.ast.type.ClassOrInterfaceType;
import com.github.javaparser.ast.type.TypeParameter;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;
import de.unihamburg.masterprojekt2016.traceability.TypePointerClassification;
import de.unihamburg.swk.parsing.document.*;
import de.unihamburg.swk.traceabilityrecovery.ISearchableDocument;

import java.util.LinkedList;
import java.util.List;

import static de.unihamburg.masterprojekt2016.traceability.TypePointerClassification.*;

/**
 * Created by Tilmann Stehle on 12.01.2018.
 */
public class JavaVisitor <TDocument extends ISearchableDocument> extends VoidVisitorAdapter<DocumentBuilder> {
    private int anonymousClassCount;
    private JavaListenerExtension listenerExtension;
    public JavaVisitor() {

        listenerExtension= new JavaListenerExtension();
    }

    @Override
    public void visit(PackageDeclaration n, DocumentBuilder docBuilder) {
        String fullPackageName = n.getNameAsString();
        docBuilder.addPackagName(fullPackageName);
        super.visit(n, docBuilder);
    }

    @Override
    public void visit(AnnotationDeclaration n, DocumentBuilder docBuilder) {
        List<String> inheritance = new LinkedList<>();
        String typeName = n.getNameAsString();
        TypePointerClassification classification = INTERFACE;
        int startLine = n.getBegin().isPresent()? n.getBegin().get().line: 0;
        docBuilder.enterTypeDeclaration(TermMapperManager.JAVA.types(typeName), classification, inheritance,startLine );
        super.visit(n, docBuilder);
        docBuilder.exitTypeDeclaration();
    }

    @Override
    public void visit(ClassOrInterfaceDeclaration n, DocumentBuilder docBuilder) {
        List<String> inheritance = new LinkedList<>();
        String typeName = n.getNameAsString();
        for (ClassOrInterfaceType inheritedType : n.getExtendedTypes()) {
            inheritance.add(TermMapperManager.JAVA.types(inheritedType.getNameAsString()));
        }
        for (ClassOrInterfaceType implemented : n.getImplementedTypes()) {
            inheritance.add(TermMapperManager.JAVA.types(implemented.getNameAsString()));
        }
        TypePointerClassification classification = n.isInterface()? INTERFACE: CLASS;
        int startLine = n.getBegin().isPresent()? n.getBegin().get().line: 0;
        docBuilder.enterTypeDeclaration(TermMapperManager.JAVA.types(typeName), classification, inheritance,startLine );
        super.visit(n, docBuilder);
        docBuilder.exitTypeDeclaration();
    }

    @Override
    public void visit(EnumDeclaration n, DocumentBuilder docBuilder) {
        List<String> inheritance = new LinkedList<>();
        String typeName = n.getNameAsString();
        for (ClassOrInterfaceType implemented : n.getImplementedTypes()) {
            inheritance.add(implemented.getNameAsString());
        }

        int startLine = n.getBegin().isPresent()? n.getBegin().get().line: 0;
        docBuilder.enterTypeDeclaration(TermMapperManager.JAVA.types(typeName), ENUM, inheritance, startLine);
        super.visit(n, docBuilder);
        docBuilder.exitTypeDeclaration();
    }

    @Override
    public void visit(EnumConstantDeclaration n, DocumentBuilder docBuilder) {
            docBuilder.addEnumConstant(n.getNameAsString());
    }

    @Override
    public void visit(ObjectCreationExpr n, DocumentBuilder docBuilder) {
        if(n.getAnonymousClassBody().isPresent())//this is an anonymous class
        {
            String pointerName = "AnonymousClass" + "$" + this.anonymousClassCount;
            this.anonymousClassCount++;

            int startLine = n.getBegin().isPresent()? n.getBegin().get().line: 0;
            docBuilder.enterAnonymousTypeDeclaration(pointerName, ANONYMOUS_CLASS,startLine);
            super.visit(n, docBuilder);
            docBuilder.exitTypeDeclaration();
        }
    }

    @Override
    public void visit(FieldDeclaration n, DocumentBuilder docBuilder) {
        for (VariableDeclarator variableDeclarator : n.getVariables()) {

            int startLine = n.getBegin().isPresent()? n.getBegin().get().line: 0;
            enterClassVariableDeclaration(variableDeclarator.getNameAsString(), variableDeclarator.getType().asString(), docBuilder, startLine);
            docBuilder.closeElement();
        }

    }


    private void enterClassVariableDeclaration(String pointerName, String typeName, DocumentBuilder docBuilder, int startLine) {
        PointerTypeSeparator pointerTypeSeparator = new PointerTypeSeparator(TermMapperManager.JAVA);
        pointerTypeSeparator.setPointerType(typeName);
        String mappedName = listenerExtension.getMappedAttributeName(pointerName);

        docBuilder.enterField(pointerName, mappedName, pointerTypeSeparator, startLine);
    }

    @Override
    public void visit(ConstructorDeclaration n, DocumentBuilder docBuilder) {
        String name =n.getNameAsString();

        int startLine = n.getBegin().isPresent()? n.getBegin().get().line: 0;
        docBuilder.enterConstructor(name, startLine);
        super.visit(n, docBuilder);
        docBuilder.closeElement();
    }

    @Override
    public void visit(MethodDeclaration n, DocumentBuilder docBuilder) {
        String pointerName =  n.getNameAsString();
        String mappedName = listenerExtension.getMappedMethodName(pointerName);
        if(n.getType().isVoidType()) {

            int startLine = n.getBegin().isPresent()? n.getBegin().get().line: 0;
            docBuilder.enterMethod(pointerName, mappedName, startLine);
        } else {
            PointerTypeSeparator type = new PointerTypeSeparator(TermMapperManager.JAVA);
            type.setPointerType(n.getType().asString());

            int startLine = n.getBegin().isPresent()? n.getBegin().get().line: 0;
            docBuilder.enterMethod(pointerName, mappedName, type, startLine);
        }
        super.visit(n, docBuilder);
        docBuilder.closeElement();
    }

    @Override
    public void visit(Parameter n, DocumentBuilder docBuilder) {
        if(n.getAncestorOfType(LambdaExpr.class).isPresent())
        {
            return;
        }
        else {
            String name = n.getNameAsString();
            PointerTypeSeparator types = new PointerTypeSeparator(TermMapperManager.JAVA);
            types.setPointerType(n.getType().asString());
            docBuilder.enterParameter(name, types);
        }
    }

    @Override
    public void visit(VariableDeclarationExpr n, DocumentBuilder docBuilder) {
        for (VariableDeclarator variableDeclarator : n.getVariables()) {
            PointerTypeSeparator types = new PointerTypeSeparator(TermMapperManager.JAVA);
            types.setPointerType(variableDeclarator.getType().asString());
            String name = variableDeclarator.getNameAsString();
            docBuilder.enterLocalVariable(name, types);
        }

    }

    @Override
    public void visit(TypeParameter n, DocumentBuilder docBuilder) {
        docBuilder.enterTypeParameter(TermMapperManager.JAVA.types(n.getNameAsString()));
    }

    @Override
    public void visit(LambdaExpr n, DocumentBuilder docBuilder) {
        docBuilder.enterLambdaExpression();
        for (Parameter parameter : n.getParameters()) {
            SimpleTypeSeparator type = listenerExtension.createSimpleTypeSeperator();
            List<String> names = new LinkedList<>();
            names.add(parameter.getNameAsString());
            docBuilder.enterLambdaParameter(names, type);
        }

        super.visit(n, docBuilder);
        docBuilder.closeElement();
    }




}
