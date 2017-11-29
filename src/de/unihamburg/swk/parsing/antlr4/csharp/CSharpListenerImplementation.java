package de.unihamburg.swk.parsing.antlr4.csharp;

import de.unihamburg.swk.parsing.document.*;
import de.unihamburg.swk.traceabilityrecovery.ISearchableDocument;

import java.util.List;

import static de.unihamburg.masterprojekt2016.traceability.TypePointerClassification.CLASS;
import static de.unihamburg.masterprojekt2016.traceability.TypePointerClassification.ENUM;
import static de.unihamburg.masterprojekt2016.traceability.TypePointerClassification.INTERFACE;

/**
 * Created by Tilmann Stehle on 04.09.2017.
 */
public class CSharpListenerImplementation<TDocument extends ISearchableDocument> extends CSharpParserBaseListener {


    private DocumentBuilder<TDocument> docBuilder;

    private int anonymousClassCount;

    public CSharpListenerImplementation(String filePath, IDocumentFactory<TDocument> documentFactory) {
        this.docBuilder = new DocumentBuilder<>(filePath, documentFactory);
        this.anonymousClassCount = 0;
    }

    @Override
    public void enterNamespace_declaration(CSharpParser.Namespace_declarationContext ctx) {

        String namespaceName = ctx.qualified_identifier().getText();
        docBuilder.addPackagName(namespaceName);
    }

    @Override
    public void enterInterface_definition(CSharpParser.Interface_definitionContext ctx) {
                docBuilder.enterTypeDeclaration(ctx.identifier().getText(), INTERFACE);
    }

    @Override
    public void exitInterface_definition(CSharpParser.Interface_definitionContext ctx) {
        docBuilder.exitTypeDeclaration();
    }

    @Override
    public void enterClass_definition(CSharpParser.Class_definitionContext ctx) {
        docBuilder.enterTypeDeclaration(ctx.identifier().getText(), CLASS);
    }

    @Override
    public void exitClass_definition(CSharpParser.Class_definitionContext ctx) {
        docBuilder.exitTypeDeclaration();
    }

    @Override
    public void enterEnum_definition(CSharpParser.Enum_definitionContext ctx) {
        String enumName = ctx.identifier().getText();

        docBuilder.enterTypeDeclaration(enumName, ENUM);
    }

    @Override
    public void enterEnum_body(CSharpParser.Enum_bodyContext ctx) {
        for (CSharpParser.Enum_member_declarationContext member_declarationContext : ctx.enum_member_declaration()) {
            docBuilder.addEnumConstant(member_declarationContext.identifier().getText());
        }
    }

    @Override
    public void exitEnum_definition(CSharpParser.Enum_definitionContext ctx) {
        docBuilder.exitTypeDeclaration();
    }

    @Override
    public void enterField_declaration(CSharpParser.Field_declarationContext ctx) {
        for (CSharpParser.Variable_declaratorContext variable_declaratorContext : ctx.variable_declarators().variable_declarator()) {
            String fieldName = variable_declaratorContext.identifier().getText();
            CSharpParser.Typed_member_declarationContext parent = (CSharpParser.Typed_member_declarationContext) ctx.parent;
            docBuilder.enterField(fieldName,parent.type().getText());

        }

    }

    @Override
    public void exitField_declaration(CSharpParser.Field_declarationContext ctx) {
        docBuilder.closeElement();
    }


    @Override
    public void enterProperty_declaration(CSharpParser.Property_declarationContext ctx) {
        CSharpParser.Typed_member_declarationContext parent = (CSharpParser.Typed_member_declarationContext) ctx.parent;
        docBuilder.enterField(ctx.member_name().getText(), parent.type().getText());
    }

    @Override
    public void exitProperty_declaration(CSharpParser.Property_declarationContext ctx) {
        docBuilder.closeElement();
    }

    @Override
    public void enterConstructor_declaration(CSharpParser.Constructor_declarationContext ctx) {
        docBuilder.enterConstructor(ctx.identifier().getText());
    }

    @Override
    public void exitConstructor_declaration(CSharpParser.Constructor_declarationContext ctx) {
        docBuilder.closeElement();
    }

    @Override
    public void enterMethod_declaration(CSharpParser.Method_declarationContext ctx) {
        String methodName= ctx.method_member_name().getText();
        if(ctx.parent instanceof CSharpParser.Common_member_declarationContext)//void method
        {
            docBuilder.enterMethod(methodName, methodName);
        }
        else//non-void method
        {
            CSharpParser.Typed_member_declarationContext methodParent = (CSharpParser.Typed_member_declarationContext)ctx.parent;
            docBuilder.enterMethod(methodName,methodName,new PointerTypeSeparator(methodParent.type().getText(), TermMapperManager.CSHARP));
        }
    }

    @Override
    public void exitMethod_declaration(CSharpParser.Method_declarationContext ctx) {
        docBuilder.closeElement();
    }

    @Override
    public void enterFormal_parameter_list(CSharpParser.Formal_parameter_listContext ctx) {
        if(ctx.fixed_parameters()!=null&&!ctx.fixed_parameters().fixed_parameter().isEmpty())//there are paramters other than a "param"-array
        {
            acceptFixedParams(ctx);

        }
        else
        {
            if(ctx.parameter_array()!=null)
            {
                String type = ctx.parameter_array().array_type().getText();
                String name = ctx.parameter_array().identifier().getText();
                docBuilder.enterParameter(name, type);
            }
        }
    }

    private void acceptFixedParams(CSharpParser.Formal_parameter_listContext ctx) {
        for (CSharpParser.Fixed_parameterContext fixed_parameterContext : ctx.fixed_parameters().fixed_parameter()) {
            String type = fixed_parameterContext.arg_declaration().type().getText();
            String name=fixed_parameterContext.arg_declaration().identifier().getText();
            docBuilder.enterParameter(name, type);
        }
    }

    @Override
    public void enterLocal_variable_declaration(CSharpParser.Local_variable_declarationContext ctx) {
        for (CSharpParser.Local_variable_declaratorContext local_variable_declaratorContext : ctx.local_variable_declarator()) {
            String variableName = local_variable_declaratorContext.identifier().getText();
            String type= ctx.local_variable_type().type()!=null? ctx.local_variable_type().type().getText():"var";
            PointerTypeSeparator pointerTypeSeparator = new PointerTypeSeparator(type, TermMapperManager.CSHARP);
            docBuilder.enterLocalVariable(variableName,pointerTypeSeparator );
        }

    }

    @Override
    public void enterInterface_member_declaration(CSharpParser.Interface_member_declarationContext ctx) {
        String type= ctx.type()!=null? ctx.type().getText():"void";
        if(ctx.identifier()!=null)
        {
            docBuilder.enterMethod(ctx.identifier().getText(), type);
        }

    }

    @Override
    public void exitInterface_member_declaration(CSharpParser.Interface_member_declarationContext ctx) {
        docBuilder.closeElement();
    }

    /**
     * @Override
    public void exitFormalParameter(Java8Parser.FormalParameterContext ctx) {
    if(ctx.parent.parent.parent instanceof LambdaParametersContext) return;
    String name = JavaParserUtils.getName(ctx.variableDeclaratorId().Identifier());
    PointerTypeSeparator types = JavaParserUtils.setType(ctx.unannType());
    docBuilder.enterParameter(name, types);
    }
     * @return
     */

    public boolean errorOccurs() {
        return docBuilder.openTypes() >  0;
    }

    public List<TDocument> getDocuments() {
        return docBuilder.getDocuments();
    }
}
