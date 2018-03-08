package de.unihamburg.swk.parsing.antlr4.javascript;

import de.unihamburg.swk.parsing.antlr4.java8.Java8Parser;
import de.unihamburg.swk.parsing.document.*;
import de.unihamburg.swk.traceabilityrecovery.ISearchableDocument;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.LinkedList;
import java.util.List;

import static de.unihamburg.masterprojekt2016.traceability.TypePointerClassification.CLASS;

/**
 * Created by Tilmann Stehle on 10.01.2018.
 */
public class JavaScriptListenerImplementation<TDocument extends ISearchableDocument> extends JavaScriptParserBaseListener {

    private static final int NAME_LENGTH_LIMIT = 100 ;
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
        mappedName = mappedName != null ? mappedName : "anonymous function";
        docBuilder.enterFunctionDeclaration(mappedName, ctx.getStart().getLine());
    }


    @Override
    public void exitFunctionDeclaration(JavaScriptParser.FunctionDeclarationContext ctx) {

        docBuilder.closeElement();
    }

    @Override
    public void enterFunctionExpression(JavaScriptParser.FunctionExpressionContext ctx) {
        String mappedName = null;
        if (ctx.Identifier() != null) {
            String pointerName = ctx.Identifier().toString();

            pointerName = pointerName == null ? tryGetFunctionName(ctx) : pointerName;
            mappedName = listenerExtension.getMappedMethodName(pointerName);
        } else {
            mappedName = listenerExtension.getMappedMethodName(tryGetFunctionName(ctx));
        }

        mappedName = mappedName != null ? mappedName : "";
        docBuilder.enterFunctionDeclaration(mappedName, ctx.getStart().getLine());
    }

    private Object iterateToParentOfType (int depth, ParserRuleContext child, Class... clazzes)
    {
        ParserRuleContext parent = child.getParent();
        if(depth==0 || parent!=null)
        {
            for (Class clazz : clazzes) {


                if(clazz.isInstance(parent))
                {
                    return parent;
                }
            }
                return iterateToParentOfType(depth -1,parent, clazzes);
        }
        else return null ;

    }

    private String tryGetFunctionName(JavaScriptParser.FunctionExpressionContext ctx) {
        Object namingContext = iterateToParentOfType(3, ctx, JavaScriptParser.AssignmentExpressionContext.class,JavaScriptParser.VariableDeclarationContext.class, JavaScriptParser.PropertyExpressionAssignmentContext.class);
        if(namingContext instanceof JavaScriptParser.AssignmentExpressionContext)
        {
            JavaScriptParser.AssignmentExpressionContext assignmentExpressionContext = (JavaScriptParser.AssignmentExpressionContext) namingContext;
            JavaScriptParser.SingleExpressionContext singleExpressionContext = assignmentExpressionContext.singleExpression(0);
            String singleExpressionText = singleExpressionContext.getText();
            if(singleExpressionText.length() >NAME_LENGTH_LIMIT)
            {
                return "..."+singleExpressionText.substring(singleExpressionText.length()- NAME_LENGTH_LIMIT, singleExpressionText.length());
            }
            else return singleExpressionText;
        }

        else if(namingContext instanceof JavaScriptParser.VariableDeclarationContext)
        {
            JavaScriptParser.VariableDeclarationContext variableDeclarationContext = (JavaScriptParser.VariableDeclarationContext) namingContext;
            return variableDeclarationContext.Identifier().toString();

        }
        else if(namingContext instanceof JavaScriptParser.PropertyExpressionAssignmentContext)
        {
            JavaScriptParser.PropertyExpressionAssignmentContext propertyAssignmentContext = (JavaScriptParser.PropertyExpressionAssignmentContext) namingContext;
            return propertyAssignmentContext.propertyName().getText().toString();

        }

         return null;

    }




    @Override
    public void exitFunctionExpression(JavaScriptParser.FunctionExpressionContext ctx) {
        docBuilder.closeElement();
    }

    @Override
    public void enterClassExpression(JavaScriptParser.ClassExpressionContext ctx) {
        String className = ctx.Identifier().getText();
        List<String> inheritance = new LinkedList<>();
        docBuilder.enterTypeDeclaration(className, CLASS, inheritance, ctx.getStart().getLine());
    }

    @Override
    public void exitClassExpression(JavaScriptParser.ClassExpressionContext ctx) {
        docBuilder.exitTypeDeclaration();
    }

    @Override
    public void enterClassDeclaration(JavaScriptParser.ClassDeclarationContext ctx) {
        String className = ctx.Identifier().getText();
        List<String> inheritance = new LinkedList<>();
        docBuilder.enterTypeDeclaration(className, CLASS, inheritance, ctx.getStart().getLine());
    }

    @Override
    public void exitClassDeclaration(JavaScriptParser.ClassDeclarationContext ctx) {
        docBuilder.exitTypeDeclaration();
    }

    @Override
    public void enterMethodDefinition(JavaScriptParser.MethodDefinitionContext ctx) {
        String pointerName = ctx.propertyName().getText();
        String mappedName = listenerExtension.getMappedMethodName(pointerName);
        if (ctx.generatorMethod() != null) {
            docBuilder.enterConstructor(docBuilder.getCurrentTypeName(), ctx.getStart().getLine());
        } else
            if (ctx.getter() != null)
            {
                pointerName = ctx.getter().Identifier().getText();
                mappedName = listenerExtension.getMappedMethodName(pointerName);
                docBuilder.enterMethod(pointerName, mappedName, ctx.getStart().getLine());
            } else if (ctx.setter() != null)
            {
                pointerName = ctx.setter().Identifier().getText();
                mappedName = listenerExtension.getMappedMethodName(pointerName);
                docBuilder.enterMethod(pointerName, mappedName, ctx.getStart().getLine());
            }
            else
            {
                docBuilder.enterMethod(pointerName, mappedName, ctx.getStart().getLine());
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
