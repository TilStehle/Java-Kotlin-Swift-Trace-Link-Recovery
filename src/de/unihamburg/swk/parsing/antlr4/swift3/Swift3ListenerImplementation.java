
package de.unihamburg.swk.parsing.antlr4.swift3;

import static de.unihamburg.masterprojekt2016.traceability.TypePointerClassification.*;

import java.util.List;

import de.unihamburg.swk.parsing.IDocumentFactory;
import de.unihamburg.swk.parsing.antlr4.swift3.Swift3Parser.PatternContext;
import de.unihamburg.swk.parsing.antlr4.swift3.Swift3Parser.PatternInitializerContext;
import de.unihamburg.swk.parsing.antlr4.swift3.Swift3Parser.PatternInitializerListContext;
import de.unihamburg.swk.parsing.antlr4.swift3.Swift3Parser.TuplePatternElementContext;
import de.unihamburg.swk.traceabilityrecovery.ISearchableDocument;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTree;

import de.unihamburg.swk.parsing.DocumentBuilder;

public class Swift3ListenerImplementation<T extends ISearchableDocument> extends Swift3BaseListener {

	private DocumentBuilder<T> docBuilder;

	// private int anonymousClassCount;

	public Swift3ListenerImplementation(String filePath, IDocumentFactory<T> documentFactory) {
		this.docBuilder = new DocumentBuilder<T>(filePath, documentFactory);
		// this.anonymousClassCount = 0;
	}

	public void enterProtocolDeclaration(@NotNull Swift3Parser.ProtocolDeclarationContext ctx) {
		String interfaceName = ctx.protocolName().getText();
		docBuilder.enterTypeDeclaration(interfaceName, INTERFACE);
	}
	public void exitProtocolDeclaration(@NotNull Swift3Parser.ProtocolDeclarationContext ctx) {
		docBuilder.exitTypeDeclaration();
	}

	@Override
	public void enterClassDeclaration(@NotNull Swift3Parser.ClassDeclarationContext ctx) {
		String className = ctx.className().getText();
		docBuilder.enterTypeDeclaration(className, CLASS);
		docBuilder.setLayer("nonUI");
	}

	@Override
	public void exitClassDeclaration(@NotNull Swift3Parser.ClassDeclarationContext ctx) {
		docBuilder.exitTypeDeclaration();
	}

	@Override
	public void enterStructDeclaration(@NotNull Swift3Parser.StructDeclarationContext ctx) {
		String structName = ctx.structName().getText();
		docBuilder.enterTypeDeclaration(structName, STRUCT);
		docBuilder.setLayer("nonUI");
	}

	@Override
	public void exitStructDeclaration(@NotNull Swift3Parser.StructDeclarationContext ctx) {
		docBuilder.exitTypeDeclaration();
	}

	@Override
	public void enterEnumDeclaration(@NotNull Swift3Parser.EnumDeclarationContext ctx) {
		String enumName = ctx.enumDef().getText(); // TODO get name
		docBuilder.enterTypeDeclaration(enumName, ENUM);
	}

	@Override
	public void exitEnumDeclaration(@NotNull Swift3Parser.EnumDeclarationContext ctx) {
		docBuilder.exitTypeDeclaration();
	}

	@Override
	public void enterExtensionDeclaration(@NotNull Swift3Parser.ExtensionDeclarationContext ctx) {
		String className = ctx.typeIdentifier().getText();
		docBuilder.enterTypeDeclaration(className, EXTENSION);
	}

	@Override
	public void exitExtensionDeclaration(@NotNull Swift3Parser.ExtensionDeclarationContext ctx) {
		docBuilder.exitTypeDeclaration();
	}

	@Override
	public void enterTypealiasDeclaration(@NotNull Swift3Parser.TypealiasDeclarationContext ctx) {
		String className = ctx.typealiasHead().typealiasName().getText();
		docBuilder.enterTypeDeclaration(className, NO_CLASSIFICATION);
	}

	@Override
	public void exitTypealiasDeclaration(@NotNull Swift3Parser.TypealiasDeclarationContext ctx) {
		docBuilder.exitTypeDeclaration();
	}

	@Override
	public void enterInitializerDeclaration(@NotNull Swift3Parser.InitializerDeclarationContext ctx) {
		String name = docBuilder.getCurrentTypeName();
		docBuilder.enterConstructor(name);
	}

	@Override
	public void exitInitializerDeclaration(@NotNull Swift3Parser.InitializerDeclarationContext ctx) {
		docBuilder.closeElement();
	}

	@Override
	public void enterFunctionDeclaration(@NotNull Swift3Parser.FunctionDeclarationContext ctx) {
		String name = ctx.functionName().getText();
		String returnType;
		if (ctx.functionSignature().functionResult() != null) {
			returnType = ctx.functionSignature().functionResult().getText();
		} else {
			returnType = "void";
		}
		docBuilder.enterMethod(name, returnType);
	}

	@Override
	public void exitFunctionDeclaration(@NotNull Swift3Parser.FunctionDeclarationContext ctx) {
		docBuilder.closeElement();
	}

	@Override
	public void enterProtocolMethodDeclaration(@NotNull Swift3Parser.ProtocolMethodDeclarationContext ctx) {
		String name = ctx.functionName().getText();
		String returnType = ctx.functionSignature().functionResult().getText();

		docBuilder.enterMethod(name, returnType);
	}

	@Override
	public void exitProtocolMethodDeclaration(@NotNull Swift3Parser.ProtocolMethodDeclarationContext ctx) {
		docBuilder.closeElement();
	}

	@Override
	public void enterSubscriptDeclaration(@NotNull Swift3Parser.SubscriptDeclarationContext ctx) {
		docBuilder.enterSubscript();
	}

	@Override
	public void exitSubscriptDeclaration(@NotNull Swift3Parser.SubscriptDeclarationContext ctx) {
		docBuilder.closeElement();
	}

	@Override
	public void enterVariableDeclaration(@NotNull Swift3Parser.VariableDeclarationContext ctx) {
		enterField(ctx.patternInitializerList());
	}

	@Override
	public void enterConstantDeclaration(@NotNull Swift3Parser.ConstantDeclarationContext ctx) {
		enterField(ctx.patternInitializerList());
	}

	private void enterField(PatternInitializerListContext patternInitializerList) {
		if (patternInitializerList == null) return;
		String name = null;
		String type = null;
		for (ParseTree tree : patternInitializerList.children) {
			PatternContext pattern = ((PatternInitializerContext) tree).pattern();
			// identifierPattern typeAnnotation?
			if (pattern.identifierPattern() != null) {
				name = pattern.identifierPattern().getText();
				if (pattern.typeAnnotation() != null) {// no type
					type = pattern.typeAnnotation().sType().getText();
					if (type.endsWith("?")) {
						type = type.substring(0, type.length() - 1);
					}
				}
				docBuilder.enterField(name, type);
				// tuplePattern typeAnnotation?
			} else if (pattern.tuplePattern() != null) {
				for (ParseTree tupel : pattern.tuplePattern().tuplePatternElementList().tuplePatternElement()) {
					PatternContext tupelPattern = ((TuplePatternElementContext) tupel).pattern();
					if (tupelPattern.typeAnnotation() != null) {
						// System.err.println(tupelPattern.typeAnnotation().sType().getText());
					}
				}
			} else {
				System.err.println("No match on Field");
			}
		}
	}

	@Override
	public void exitParameter(@NotNull Swift3Parser.ParameterContext ctx) {
		String name = ctx.localParameterName().getText();
		String type = ctx.typeAnnotation().sType().getText();
		type = type.substring(0, type.length() - 1); // TODO

		docBuilder.enterParameter(name, type);
	}

	@Override
	public void enterTypeInheritanceList(@NotNull Swift3Parser.TypeInheritanceListContext ctx) {
		super.enterTypeInheritanceList(ctx);
		for (Swift3Parser.TypeIdentifierContext typeIdentifierContext : ctx.typeIdentifier()) {
			Swift3Parser.TypeNameContext typeIdentifier = typeIdentifierContext.typeName();
			if (typeIdentifier != null && typeIdentifier.getText() != null
					&& (typeIdentifier.getText().contains("ViewController")||typeIdentifier.getText().contains("UINavigationController"))) {
				docBuilder.setLayer("viewController");
				break;
			}
		}
	}

	public List<T> getDocuments() {
		return docBuilder.getDocuments();
	}

}