package de.unihamburg.swk.parsing.antlr4.java8;

import static de.unihamburg.masterprojekt2016.traceability.TypePointerClassification.*;

import java.util.List;
import java.util.stream.Collectors;

import de.unihamburg.swk.parsing.IDocumentFactory;
import de.unihamburg.swk.traceabilityrecovery.ISearchableDocument;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.TerminalNode;

import de.unihamburg.swk.parsing.DocumentBuilder;
import de.unihamburg.swk.parsing.antlr4.java8.Java8Parser.VariableDeclaratorContext;

/**
 * @author Jakob Andersen
 */

public class Java8ListenerImplementation<TDocument extends ISearchableDocument> extends Java8BaseListener {

	private DocumentBuilder<TDocument> docBuilder;

	private int anonymousClassCount;

	public Java8ListenerImplementation(String filePath, IDocumentFactory<TDocument> documentFactory) {
		this.docBuilder = new DocumentBuilder<TDocument>(filePath, documentFactory);
		this.anonymousClassCount = 0;
	}

	@Override
	public void enterSuperclass(@NotNull Java8Parser.SuperclassContext ctx) {
		String superClassName = ctx.classType().Identifier().getText();
		if (superClassName.endsWith("Activity") || superClassName.contains("Fragment")) {
			docBuilder.setLayer("viewController");
		} else {
			docBuilder.setLayer("nonUI");
		}
	}

	@Override
	public void enterPackageDeclaration(Java8Parser.PackageDeclarationContext ctx) {
		String fullPackageName = ctx.Identifier().stream().map(TerminalNode::getText).collect(Collectors.joining("."));
		docBuilder.addPackagName(fullPackageName);
	}

	@Override
	public void enterNormalInterfaceDeclaration(Java8Parser.NormalInterfaceDeclarationContext ctx) {
		String interfaceName = ctx.Identifier().getText();
		docBuilder.enterTypeDeclaration(interfaceName, INTERFACE);
	}

	@Override
	public void exitNormalInterfaceDeclaration(Java8Parser.NormalInterfaceDeclarationContext ctx) {
		docBuilder.exitTypeDeclaration();
	}

	@Override
	public void enterAnnotationTypeDeclaration(@NotNull Java8Parser.AnnotationTypeDeclarationContext ctx) {
		String interfaceName = ctx.Identifier().getText();
		docBuilder.enterTypeDeclaration(interfaceName, INTERFACE);
	}

	@Override
	public void exitAnnotationTypeDeclaration(@NotNull Java8Parser.AnnotationTypeDeclarationContext ctx) {
		docBuilder.exitTypeDeclaration();
	}

	@Override
	public void enterNormalClassDeclaration(Java8Parser.NormalClassDeclarationContext ctx) {
		String className = ctx.Identifier().getText();
		docBuilder.enterTypeDeclaration(className, CLASS);
		docBuilder.setLayer("nonUI");
	}

	@Override
	public void exitNormalClassDeclaration(Java8Parser.NormalClassDeclarationContext ctx) {
		docBuilder.exitTypeDeclaration();
	}

	@Override
	public void enterEnumDeclaration(Java8Parser.EnumDeclarationContext ctx) {
		String enumName = ctx.Identifier().getText();
		docBuilder.enterTypeDeclaration(enumName, ENUM);
		docBuilder.setLayer("nonUI");
	}

	@Override
	public void exitEnumDeclaration(Java8Parser.EnumDeclarationContext ctx) {
		docBuilder.exitTypeDeclaration();
	}

	@Override
	public void enterClassInstanceCreationExpression_lfno_primary(
			Java8Parser.ClassInstanceCreationExpression_lfno_primaryContext ctx) {
		if (ctx.classBody() != null) { // is anonymous class
			String anonymousClassName = "AnonymousClass" + "$" + this.anonymousClassCount;
			this.anonymousClassCount++;
			docBuilder.enterTypeDeclaration(anonymousClassName, ANONYMOUS_CLASS);
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
		String declerationLine = ctx.variableDeclaratorList().getText();
		String name = declerationLine.contains("=") ? declerationLine.substring(0, declerationLine.indexOf("="))
				: declerationLine;
		String type = ctx.unannType().getText();
		docBuilder.enterField(name, type);

	}

	@Override
	public void enterConstantDeclaration(@NotNull Java8Parser.ConstantDeclarationContext ctx) {
		String declerationLine = ctx.variableDeclaratorList().getText();
		String name = declerationLine.contains("=") ? declerationLine.substring(0, declerationLine.indexOf("=")) : declerationLine;
		String type = ctx.unannType().getText();
		docBuilder.enterField(name, type);
	}

	@Override
	public void enterConstructorDeclarator(Java8Parser.ConstructorDeclaratorContext ctx) {
		String name = ctx.simpleTypeName().getText();
		docBuilder.enterConstructor(name);
	}

	@Override
	public void exitConstructorDeclaration(Java8Parser.ConstructorDeclarationContext ctx) {
		docBuilder.closeElement();
	}

	@Override
	public void enterMethodHeader(Java8Parser.MethodHeaderContext ctx) {
		String name = ctx.methodDeclarator().getChild(0).toString();
		String returnType = ctx.getChild(0).getText();
		docBuilder.enterMethod(name, returnType);
	}

	@Override
	public void exitMethodDeclaration(Java8Parser.MethodDeclarationContext ctx) {
		docBuilder.closeElement();
	}

	// @Override
	// public void enterMethodDeclaration(Java8Parser.MethodDeclarationContext
	// ctx) {
	// String name =
	// ctx.methodHeader().methodDeclarator().Identifier().getText();
	// String returnType = ctx.methodHeader().result().getText();
	// // ...
	// }

	@Override
	public void exitInterfaceMethodDeclaration(Java8Parser.InterfaceMethodDeclarationContext ctx) {
		docBuilder.closeElement();
	}

	@Override
	public void exitFormalParameter(Java8Parser.FormalParameterContext ctx) {
		String type = ctx.unannType().getText();
		String name = ctx.variableDeclaratorId().getText();
		docBuilder.enterParameter(name, type);
	}

	@Override
	public void enterLocalVariableDeclaration(@NotNull Java8Parser.LocalVariableDeclarationContext ctx) {
		for (VariableDeclaratorContext v : ctx.variableDeclaratorList().variableDeclarator()) {
			String line = v.getText();
			String type = ctx.unannType().getText();
			String name = line.contains("=") ? line.substring(0, line.indexOf("=")) : line;
			docBuilder.enterLocalVariable(name, type);
		}
	}

	// @Override
	// public void
	// enterVariableDeclaratorId(Java8Parser.VariableDeclaratorIdContext ctx) {
	// docBuilder.addIdentifierToAllDocsOnStack(ctx.getText());
	// }

	public List<TDocument> getDocuments() {
		return docBuilder.getDocuments();
	}

}