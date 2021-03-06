package de.unihamburg.swk.parsing.antlr4.java8;

import static de.unihamburg.masterprojekt2016.traceability.TypePointerClassification.*;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import org.antlr.v4.runtime.misc.NotNull;

import de.unihamburg.swk.traceabilityrecovery.ISearchableDocument;

import de.unihamburg.swk.parsing.antlr4.java8.Java8Parser.EnumConstantContext;
import de.unihamburg.swk.parsing.antlr4.java8.Java8Parser.LambdaParametersContext;
import de.unihamburg.swk.parsing.antlr4.java8.Java8Parser.UnannTypeContext;
import de.unihamburg.swk.parsing.antlr4.java8.Java8Parser.VariableDeclaratorContext;

import de.unihamburg.swk.parsing.document.DocumentBuilder;
import de.unihamburg.swk.parsing.document.IDocumentFactory;
import de.unihamburg.swk.parsing.document.JavaListenerExtension;
import de.unihamburg.swk.parsing.document.SimpleTypeSeparator;
import de.unihamburg.swk.parsing.document.PointerTypeSeparator;

/**
 * @author Jakob Andersen
 */
public class Java8ListenerImplementation<TDocument extends ISearchableDocument> extends Java8BaseListener {

	private DocumentBuilder<TDocument> docBuilder;
	private JavaListenerExtension listenerExtension;
	
	private int anonymousClassCount;

	public Java8ListenerImplementation(String filePath, IDocumentFactory<TDocument> documentFactory) {
		this.docBuilder = new DocumentBuilder<>(filePath, documentFactory);
		this.listenerExtension = new JavaListenerExtension();
		this.anonymousClassCount = 0;
	}

	@Override
	public void enterPackageDeclaration(Java8Parser.PackageDeclarationContext ctx) {
		String fullPackageName = ctx.Identifier().stream().map(e -> e.getText()).collect(Collectors.joining("."));
		docBuilder.addPackagName(fullPackageName);
	}

	@Override
	public void enterNormalInterfaceDeclaration(Java8Parser.NormalInterfaceDeclarationContext ctx) {
		List<String> inheritance = new LinkedList<>();
		String interfaceName = ctx.Identifier().getText();
		listenerExtension.setInheritance(ctx.extendsInterfaces(), inheritance);
		
		docBuilder.enterTypeDeclaration(interfaceName, INTERFACE, inheritance, ctx.getStart().getLine());
	}

	@Override
	public void exitNormalInterfaceDeclaration(Java8Parser.NormalInterfaceDeclarationContext ctx) {
		docBuilder.exitTypeDeclaration();
	}

	@Override
	public void enterAnnotationTypeDeclaration(Java8Parser.AnnotationTypeDeclarationContext ctx) {
		String interfaceName = ctx.Identifier().getText();
		docBuilder.enterTypeDeclaration(interfaceName, INTERFACE, ctx.getStart().getLine());
	}

	@Override
	public void exitAnnotationTypeDeclaration(Java8Parser.AnnotationTypeDeclarationContext ctx) {
		docBuilder.exitTypeDeclaration();
	}

	@Override
	public void enterNormalClassDeclaration(Java8Parser.NormalClassDeclarationContext ctx) {
		String className = ctx.Identifier().getText();
		List<String> inheritance = new LinkedList<>();
		
		listenerExtension.setInheritance(ctx.superclass(), inheritance);
		listenerExtension.setInheritance(ctx.superinterfaces(), inheritance);
		
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
		listenerExtension.setInheritance(ctx.superinterfaces(), inheritance);
		
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
		PointerTypeSeparator types = listenerExtension.setType(unannType);
		String mappedName = listenerExtension.getMappedAttributeName(pointerName);
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
		String pointerName =  listenerExtension.getName(ctx.methodDeclarator().Identifier());
		String mappedName = listenerExtension.getMappedMethodName(pointerName);
		if(ctx.result().getText().equals("void")) {
			docBuilder.enterMethod(pointerName, mappedName, ctx.getStart().getLine());
		} else {
			PointerTypeSeparator types = listenerExtension.setType(ctx.result().unannType());
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
		String name = listenerExtension.getName(ctx.variableDeclaratorId().Identifier());
		PointerTypeSeparator types = listenerExtension.setType(ctx.unannType());
		docBuilder.enterParameter(name, types);
	}

	@Override
	public void enterLocalVariableDeclaration(Java8Parser.LocalVariableDeclarationContext ctx) {
		PointerTypeSeparator types = listenerExtension.setType(ctx.unannType());
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
		SimpleTypeSeparator types = listenerExtension.createSimpleTypeSeperator();
		List<String> names = new LinkedList<>();
		listenerExtension.setTypesAndNames(ctx, types, names);
		docBuilder.enterLambdaParameter(names, types);
	}

	public boolean errorOccurs() {
		return docBuilder.openTypes() >  0;
	}
	
	public List<TDocument> getDocuments() {
		return docBuilder.getDocuments();
	}
	
}