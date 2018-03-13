package de.unihamburg.swk.parsing.antlr4.swift4;

import de.unihamburg.masterprojekt2016.traceability.TypePointerClassification;
import de.unihamburg.swk.parsing.document.DocumentBuilder;
import de.unihamburg.swk.parsing.document.IDocumentFactory;
import de.unihamburg.swk.parsing.document.PointerTypeSeparator;
import de.unihamburg.swk.parsing.document.TermMapperManager;
import de.unihamburg.swk.traceabilityrecovery.ISearchableDocument;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Tilmann Stehle on 08.03.2018.
 */
public class Swift4ListenerImplementation<T extends ISearchableDocument> extends Swift4BaseListener {

    private DocumentBuilder<T> docBuilder;
    private static TermMapperManager MAPPER = TermMapperManager.SWIFT;

    public Swift4ListenerImplementation(String filePath, IDocumentFactory<T> documentFactory) {
        this.docBuilder = new DocumentBuilder<>(filePath, documentFactory);
    }



    @Override
    public void enterClassDeclaration(Swift4Parser.ClassDeclarationContext ctx) {
        docBuilder.enterTypeDeclaration(MAPPER.types(ctx.identifier().getText()), TypePointerClassification.CLASS, getInheritanceList(ctx.typeInheritanceClause()), ctx.getStart().getLine());
    }

    @Override
    public void exitClassDeclaration(Swift4Parser.ClassDeclarationContext ctx) {
        docBuilder.exitTypeDeclaration();
    }

    @Override
    public void enterVariableDeclaration(Swift4Parser.VariableDeclarationContext ctx) {
        PointerTypeSeparator typeSeparator = new PointerTypeSeparator(MAPPER);
        final String mappedName = MAPPER.variables(ctx.identifier().getText());
        if(ctx.type() !=null)
        {
            typeSeparator.setPointerType(ctx.type().getText());
        }
        docBuilder.enterLocalVariable(mappedName, typeSeparator);
    }

    @Override
    public void enterLetDeclaration(Swift4Parser.LetDeclarationContext ctx) {
        PointerTypeSeparator typeSeparator = new PointerTypeSeparator(MAPPER);
        final String mappedName = MAPPER.variables(ctx.identifier().getText());
        if(ctx.type() !=null)
        {
            typeSeparator.setPointerType(ctx.type().getText());
        }
        docBuilder.enterLocalVariable(mappedName, typeSeparator);
    }

    private List<String> getInheritanceList(Swift4Parser.TypeInheritanceClauseContext typeInheritanceClauseContext)
    {
        LinkedList<String> identifiedSuperTypes = new LinkedList<>();
        if(typeInheritanceClauseContext!=null)
        return getInheritanceList(typeInheritanceClauseContext.typeInheritances(),identifiedSuperTypes);
        else return identifiedSuperTypes;
    }

    private List<String> getInheritanceList(Swift4Parser.TypeInheritancesContext typeInheritanceClauseContext, LinkedList<String> identifiedSuperTypes) {
        if(typeInheritanceClauseContext!=null )
        {
            Swift4Parser.TypeInheritancesContext inheritances= typeInheritanceClauseContext.typeInheritances();
                    if(inheritances != null)
                    {
                        String currentParentTypename= typeInheritanceClauseContext.typeInheritances().identifier().getText();
                        identifiedSuperTypes.add(MAPPER.types(currentParentTypename));
                        if(inheritances.typeInheritances()!=null)
                        {
                            return getInheritanceList(inheritances.typeInheritances(), identifiedSuperTypes);
                        }
                    }
        }

        return identifiedSuperTypes;
    }


    @Override
    public void enterTypeVarDeclaration(Swift4Parser.TypeVarDeclarationContext ctx) {
        PointerTypeSeparator typeSeparator = new PointerTypeSeparator(MAPPER);
        final String mappedName = MAPPER.variables(ctx.identifier().getText());
        if(ctx.type() !=null)
        {
            typeSeparator.setPointerType(ctx.type().getText());
        }
        docBuilder.enterField(ctx.identifier().getText(),mappedName, typeSeparator, ctx.getStart().getLine());
    }

    @Override
    public void exitTypeVarDeclaration(Swift4Parser.TypeVarDeclarationContext ctx) {
        docBuilder.closeElement();
    }

    @Override
    public void enterTypeLetDeclaration(Swift4Parser.TypeLetDeclarationContext ctx) {
        PointerTypeSeparator typeSeparator = new PointerTypeSeparator(MAPPER);
        final String mappedName = MAPPER.variables(ctx.identifier().getText());
        if(ctx.type() !=null)
        {
            typeSeparator.setPointerType(ctx.type().getText());
        }
        docBuilder.enterField(ctx.identifier().getText(),mappedName, typeSeparator, ctx.getStart().getLine());
    }

    @Override
    public void exitTypeLetDeclaration(Swift4Parser.TypeLetDeclarationContext ctx) {
        docBuilder.closeElement();
    }

    @Override
    public void enterParameter(Swift4Parser.ParameterContext ctx) {
        PointerTypeSeparator typeSeparator = new PointerTypeSeparator(MAPPER);
        final String mappedName = MAPPER.variables(ctx.localParameterName().getText());
        if(ctx.type() !=null)
        {
            typeSeparator.setPointerType(ctx.type().getText());
        }
        docBuilder.enterLocalVariable(mappedName, typeSeparator);
    }

    @Override
    public void enterProtocolDeclaration(Swift4Parser.ProtocolDeclarationContext ctx) {
        List<String> inheritance = new LinkedList<>();
        final String interfaceName =MAPPER.types(ctx.identifier().getText());
        docBuilder.enterTypeDeclaration(interfaceName, TypePointerClassification.INTERFACE, getInheritanceList(ctx.typeInheritanceClause()), ctx.getStart().getLine());
    }

    @Override
    public void exitProtocolDeclaration(Swift4Parser.ProtocolDeclarationContext ctx) {
        docBuilder.exitTypeDeclaration();
    }

    /**
     *
     @Override
     public void enterPackageDeclaration(Java8Parser.PackageDeclarationContext ctx) {
     String fullPackageName = ctx.Identifier().stream().map(e -> e.getText()).collect(Collectors.joining("."));
     docBuilder.addPackagName(fullPackageName);
     }




     @Override
     public void enterNormalClassDeclaration(Java8Parser.NormalClassDeclarationContext ctx) {
     String className = ctx.Identifier().getText();
     List<String> inheritance = new LinkedList<>();

     listenderExtension.setInheritance(ctx.superclass(), inheritance);
     listenderExtension.setInheritance(ctx.superinterfaces(), inheritance);

     docBuilder.enterTypeDeclaration(className, CLASS, inheritance, ctx.getStart().getLine());
     }

     @Override
     public void exitNormalClassDeclaration(Java8Parser.NormalClassDeclarationContext ctx) {
     docBuilder.exitTypeDeclaration();
     }

     @Override
     public void enterEnumDeclaration(Java8Parser.EnumDeclarationContext ctx) {
     String enumName = ctx.Identifier().getText();
     List<String> inheritance = new LinkedList<>();
     listenderExtension.setInheritance(ctx.superinterfaces(), inheritance);

     docBuilder.enterTypeDeclaration(enumName, ENUM, inheritance, ctx.getStart().getLine());
     }

     @Override
     public void enterEnumConstantList(Java8Parser.EnumConstantListContext ctx) {
     for (EnumConstantContext enumConstant : ctx.enumConstant()) {
     String constantName = enumConstant.Identifier().getText();
     docBuilder.addEnumConstant(constantName);
     }
     }

     @Override
     public void exitEnumDeclaration(Java8Parser.EnumDeclarationContext ctx) {
     docBuilder.exitTypeDeclaration();
     }

     @Override
     public void enterClassInstanceCreationExpression_lfno_primary(
     Java8Parser.ClassInstanceCreationExpression_lfno_primaryContext ctx) {
     if (ctx.classBody() != null) { // is anonymous class
     String pointerName = "AnonymousClass" + "$" + this.anonymousClassCount;
     this.anonymousClassCount++;
     docBuilder.enterAnonymousTypeDeclaration(pointerName, ANONYMOUS_CLASS, ctx.getStart().getLine());
     }
     }

     @Override
     public void exitClassInstanceCreationExpression_lfno_primary(
     Java8Parser.ClassInstanceCreationExpression_lfno_primaryContext ctx) {
     // if is anonymous class
     if (ctx.classBody() != null) {
     docBuilder.exitTypeDeclaration();
     }
     }

     @Override
     public void enterFieldDeclaration(Java8Parser.FieldDeclarationContext ctx) {
     UnannTypeContext unannType = ctx.unannType();
     String name = ctx.variableDeclaratorList().variableDeclarator().stream()
     .map(e -> e.variableDeclaratorId().Identifier().getText())
     .collect(Collectors.joining(","));
     enterClassVariableDeclaration(name, unannType, ctx.getStart().getLine());
     }

     @Override
     public void exitFieldDeclaration(Java8Parser.FieldDeclarationContext ctx) {
     docBuilder.closeElement();
     }

     @Override
     public void enterConstantDeclaration(Java8Parser.ConstantDeclarationContext ctx) {
     UnannTypeContext unannType = ctx.unannType();
     for (VariableDeclaratorContext context : ctx.variableDeclaratorList().variableDeclarator()) {
     enterClassVariableDeclaration(context.variableDeclaratorId().getText(), unannType, ctx.getStart().getLine());
     }
     }

     @Override
     public void exitConstantDeclaration(Java8Parser.ConstantDeclarationContext ctx) {
     docBuilder.closeElement();
     }

     private void enterClassVariableDeclaration(String pointerName, UnannTypeContext unannType, int startLine) {
     PointerTypeSeparator types = listenderExtension.setType(unannType);
     String mappedName = listenderExtension.getMappedAttributeName(pointerName);
     docBuilder.enterField(pointerName, mappedName, types, startLine);
     }

     @Override
     public void enterConstructorDeclarator(Java8Parser.ConstructorDeclaratorContext ctx) {
     String name = ctx.simpleTypeName().getText();
     docBuilder.enterConstructor(name, ctx.getStart().getLine());
     }

     @Override
     public void exitConstructorDeclaration(Java8Parser.ConstructorDeclarationContext ctx) {
     docBuilder.closeElement();
     }

     @Override
     public void enterMethodHeader(Java8Parser.MethodHeaderContext ctx) {
     String pointerName =  listenderExtension.getName(ctx.methodDeclarator().Identifier());
     String mappedName = listenderExtension.getMappedMethodName(pointerName);
     if(ctx.result().getText().equals("void")) {
     docBuilder.enterMethod(pointerName, mappedName, ctx.getStart().getLine());
     } else {
     PointerTypeSeparator types = listenderExtension.setType(ctx.result().unannType());
     docBuilder.enterMethod(pointerName, mappedName, types, ctx.getStart().getLine());
     }
     }

     @Override
     public void exitMethodDeclaration(Java8Parser.MethodDeclarationContext ctx) {
     docBuilder.closeElement();
     }

     @Override
     public void exitInterfaceMethodDeclaration(Java8Parser.InterfaceMethodDeclarationContext ctx) {
     docBuilder.closeElement();
     }

     @Override
     public void exitFormalParameter(Java8Parser.FormalParameterContext ctx) {
     if(ctx.parent.parent.parent instanceof LambdaParametersContext) return;
     String name = listenderExtension.getName(ctx.variableDeclaratorId().Identifier());
     PointerTypeSeparator types = listenderExtension.setType(ctx.unannType());
     docBuilder.enterParameter(name, types);
     }

     @Override
     public void enterLocalVariableDeclaration(Java8Parser.LocalVariableDeclarationContext ctx) {
     PointerTypeSeparator types = listenderExtension.setType(ctx.unannType());
     for (VariableDeclaratorContext v : ctx.variableDeclaratorList().variableDeclarator()) {
     String name = v.variableDeclaratorId().getText();
     docBuilder.enterLocalVariable(name, types);
     }
     }

     @Override
     public void enterTypeParameter(Java8Parser.TypeParameterContext ctx) {
     String typeParameterName = ctx.children.get(0).getText(); // TODO
     docBuilder.enterTypeParameter(typeParameterName);
     }

     @Override
     public void enterLambdaExpression(@NotNull Java8Parser.LambdaExpressionContext ctx) {
     docBuilder.enterLambdaExpression();
     }

     @Override
     public void exitLambdaExpression(@NotNull Java8Parser.LambdaExpressionContext ctx) {
     docBuilder.closeElement();
     }

     @Override
     public void enterLambdaParameters(Java8Parser.LambdaParametersContext ctx) {
     SimpleTypeSeparator types = listenderExtension.createSimpleTypeSeperator();
     List<String> names = new LinkedList<>();
     listenderExtension.setTypesAndNames(ctx, types, names);
     docBuilder.enterLambdaParameter(names, types);
     }
     * @return
     */

    public List<T> getDocuments() {
        return docBuilder.getDocuments();
    }

    public boolean errorOccurs() {
        return docBuilder.openTypes() > 0;
    }


}
