package de.unihamburg.swk.parsing.antlr4.kotlin;

import de.unihamburg.masterprojekt2016.traceability.TypePointerClassification;
import de.unihamburg.swk.parsing.document.DocumentBuilder;
import de.unihamburg.swk.parsing.document.IDocumentFactory;
import de.unihamburg.swk.traceabilityrecovery.ISearchableDocument;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.List;
import java.util.stream.Collectors;

import static de.unihamburg.masterprojekt2016.traceability.TypePointerClassification.*;

/**
 * @author Jakob Andersen
 */

public class KotlinListenerImplementation<TDocument extends ISearchableDocument> extends KotlinParserBaseListener {

    private DocumentBuilder<TDocument> docBuilder;

//    private int anonymousClassCount;

    public KotlinListenerImplementation(String filePath, IDocumentFactory<TDocument> documentFactory) {
        this.docBuilder = new DocumentBuilder<>(filePath, documentFactory);
//        this.anonymousClassCount = 0;
    }

    @Override
    public void enterClassModifier(@NotNull KotlinParser.ClassModifierContext ctx) {
        super.enterClassModifier(ctx);
    }



    @Override
    public void enterClassDeclaration(@NotNull KotlinParser.ClassDeclarationContext ctx) {
        String className = ctx.keywordOrSimpleName().getText();
        TypePointerClassification pointerClassification = null;
        String classOrInterface = ctx.classOrInterface().getText();
        if (classOrInterface.equals("interface")) {
            pointerClassification = INTERFACE;
        }
        for (KotlinParser.ModifierContext modifierContext : ctx.modifiers().modifier()) {
            String modifierText = modifierContext.getText();
            if (modifierText.equals("enum")) {
                pointerClassification = ENUM;
            }
        }
        if (pointerClassification == null) {
            pointerClassification = CLASS;
        }
        docBuilder.enterTypeDeclaration(className, pointerClassification, ctx.getStart().getLine());


        String layer = "nonUI";
        for (KotlinParser.DelegationSpecifierContext delegationSpecifierContext : ctx.delegationSpecifier()) {
            String prunedSuperType = delegationSpecifierContext.getText().replace("()", "");
            if (prunedSuperType.endsWith("Activity") || prunedSuperType.endsWith("Fragment")) {
                layer = "viewController";
            }
        }

        docBuilder.setLayer(layer);


    }

    @Override
    public void exitClassDeclaration(@NotNull KotlinParser.ClassDeclarationContext ctx) {
        docBuilder.exitTypeDeclaration();
    }

    @Override
    public void enterPackageHeader(@NotNull KotlinParser.PackageHeaderContext ctx) {
        String fullPackageName = ctx.identifier().stream().map(KotlinParser.IdentifierContext::getText).collect(Collectors.joining("."));
        docBuilder.addPackagName(fullPackageName);
    }

    @Override
    public void exitPackageHeader(@NotNull KotlinParser.PackageHeaderContext ctx) {
        super.exitPackageHeader(ctx);
    }



    private void createField(KotlinParser.VariableDeclarationEntryContext variableDeclarationEntryContext) {
        String name = variableDeclarationEntryContext.keywordOrSimpleName().getText();
        String type = "";
        if (variableDeclarationEntryContext.type() != null && variableDeclarationEntryContext.type().typeDescriptor().userType() != null) {
            type = variableDeclarationEntryContext.type().typeDescriptor().userType().simpleUserType().get(0).keywordOrSimpleName().getText();

        }
        docBuilder.enterField(name, type, variableDeclarationEntryContext.getStart().getLine());
    }

    @Override
    public void enterPropertyDeclaration(@NotNull KotlinParser.PropertyDeclarationContext ctx) {
//        KotlinParser.MultipleVariableDeclarationsContext multipleVariableDeclarations = ctx.multipleVariableDeclarations();
        if (ctx.multipleVariableDeclarations() != null) {
            for (KotlinParser.VariableDeclarationEntryContext variableDeclarationEntryContext : ctx.multipleVariableDeclarations().variableDeclarationEntry()) {
                createField(variableDeclarationEntryContext);
            }
        }
        if (ctx.variableDeclarationEntry() != null) {
            createField(ctx.variableDeclarationEntry());
        }
    }

    @Override
    public void exitPropertyDeclaration(KotlinParser.PropertyDeclarationContext ctx) {
        docBuilder.closeElement();
    }

    @Override
    public void enterPrimaryConstructor(@NotNull KotlinParser.PrimaryConstructorContext ctx) {
        ParserRuleContext parent = ctx.getParent();
        String name="";
        if(parent instanceof KotlinParser.ClassDeclarationContext)

        {KotlinParser.ClassDeclarationContext parentClassDecl= (KotlinParser.ClassDeclarationContext)parent;
            name = parentClassDecl.keywordOrSimpleName().getText();
        }
        else if(parent instanceof KotlinParser.ObjectDeclarationContext)
        {
            KotlinParser.ObjectDeclarationContext parentClassDecl= (KotlinParser.ObjectDeclarationContext)parent;
            name = parentClassDecl.keywordOrSimpleName().getText();
        }
        docBuilder.enterConstructor(name, ctx.getStart().getLine());
    }

    @Override
    public void exitPrimaryConstructor(@NotNull KotlinParser.PrimaryConstructorContext ctx) {
        docBuilder.closeElement();
    }

    @Override
    public void enterFunctionDeclaration(@NotNull KotlinParser.FunctionDeclarationContext ctx) {
        String name = ctx.keywordOrSimpleName().getText();
        List<KotlinParser.TypeContext> typeContexts = ctx.type();
        String returnType ="";
        if(typeContexts!=null && !typeContexts.isEmpty())
        {
             returnType = typeContexts.get(0).getText();
        }
		docBuilder.enterMethod(name, returnType, ctx.getStart().getLine());
    }

    @Override
    public void exitFunctionDeclaration(@NotNull KotlinParser.FunctionDeclarationContext ctx) {
        docBuilder.closeElement();
    }

    @Override
    public void enterParameter(@NotNull KotlinParser.ParameterContext ctx) {
        docBuilder.enterParameter(ctx.keywordOrSimpleName().getText(), ctx.type().getText());
    }

//
//	@Override
//	public void exitFormalParameter(Java8Parser.FormalParameterContext ctx) {
//		String type = ctx.unannType().getText();
//		String name = ctx.variableDeclaratorId().getText();
//		docBuilder.enterParameter(name, type);
//	}
//
//	@Override
//	public void enterLocalVariableDeclaration(@NotNull Java8Parser.LocalVariableDeclarationContext ctx) {
//		for (VariableDeclaratorContext v : ctx.variableDeclaratorList().variableDeclarator()) {
//			String line = v.getText();
//			String type = ctx.unannType().getText();
//			String name = line.contains("=") ? line.substring(0, line.indexOf("=")) : line;
//			docBuilder.enterLocalVariable(name, type);
//		}
//	}

    // @Override
    // public void
    // enterVariableDeclaratorId(Java8Parser.VariableDeclaratorIdContext ctx) {
    // docBuilder.addIdentifierToAllDocsOnStack(ctx.getText());
    // }

    public List<TDocument> getDocuments() {
        return docBuilder.getDocuments();
    }

    public boolean errorOccurs() {
        boolean errorHasOccured=docBuilder.openTypes() >  0;
        if(errorHasOccured)
        {
            System.out.println("Elements not closed:");
            docBuilder.printOpenElements();
        }
        return errorHasOccured;
    }

}