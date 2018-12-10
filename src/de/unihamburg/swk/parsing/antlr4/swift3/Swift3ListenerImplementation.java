
package de.unihamburg.swk.parsing.antlr4.swift3;

import static de.unihamburg.masterprojekt2016.traceability.TypePointerClassification.*;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.NotNull;

import de.unihamburg.swk.parsing.antlr4.swift3.Swift3Parser.ClosureParameterContext;
import de.unihamburg.swk.parsing.antlr4.swift3.Swift3Parser.ClosureParameterListContext;
import de.unihamburg.swk.parsing.antlr4.swift3.Swift3Parser.PatternInitializerContext;
import de.unihamburg.swk.parsing.antlr4.swift3.Swift3Parser.PatternInitializerListContext;
import de.unihamburg.swk.parsing.antlr4.swift3.Swift3Parser.TypeAnnotationContext;

import de.unihamburg.swk.parsing.document.DocumentBuilder;
import de.unihamburg.swk.parsing.document.IDocumentFactory;
import de.unihamburg.swk.parsing.document.SwiftParserUtils;
import de.unihamburg.swk.parsing.document.PointerTypeSeparator;
import de.unihamburg.swk.traceabilityrecovery.ISearchableDocument;

public class Swift3ListenerImplementation<T extends ISearchableDocument> extends Swift3BaseListener {

	private DocumentBuilder<T> docBuilder;
	private LocalScopeTracker lst;

	public Swift3ListenerImplementation(String filePath, IDocumentFactory<T> documentFactory) {
		this.docBuilder = new DocumentBuilder<>(filePath, documentFactory);
		this.lst = new LocalScopeTracker();
	}

	@Override
	public void enterProtocolDeclaration(Swift3Parser.ProtocolDeclarationContext ctx) {
		List<String> interfaces = new LinkedList<>();
		SwiftParserUtils.setInharitance(ctx.typeInheritanceClause(), interfaces);
		String interfaceName = ctx.protocolName().getText();

		docBuilder.enterTypeDeclaration(interfaceName, INTERFACE,interfaces, ctx.getStart().getLine());
	}
	@Override
	public void exitProtocolDeclaration(Swift3Parser.ProtocolDeclarationContext ctx) {
		docBuilder.exitTypeDeclaration();
	}

	@Override
	public void enterClassDeclaration(Swift3Parser.ClassDeclarationContext ctx) {
		lst.enterLocalScope(false);

		String className = ctx.className().getText();
		List<String> inheritance = new LinkedList<>();

		SwiftParserUtils.setInharitance(ctx.typeInheritanceClause(), inheritance);

		docBuilder.enterTypeDeclaration(className, CLASS, inheritance,ctx.getStart().getLine());
//                        docBuilder.setLayer("nonUI");
	}


	@Override
	public void exitClassDeclaration(Swift3Parser.ClassDeclarationContext ctx) {
		lst.exitScope();
		docBuilder.exitTypeDeclaration();
	}

	@Override
	public void enterStructDeclaration(Swift3Parser.StructDeclarationContext ctx) {
		lst.enterLocalScope(false);

		String structName = ctx.structName().getText();
		List<String> inherintance = new LinkedList<>();
		SwiftParserUtils.setInharitance(ctx.typeInheritanceClause(), inherintance);
		docBuilder.enterTypeDeclaration(structName, STRUCT, inherintance,ctx.getStart().getLine());
//                        docBuilder.setLayer("nonUI");
	}

	@Override
	public void exitStructDeclaration(Swift3Parser.StructDeclarationContext ctx) {
		lst.exitScope();

		docBuilder.exitTypeDeclaration();
	}

	@Override
	public void enterEnumDeclaration(Swift3Parser.EnumDeclarationContext ctx) {
		lst.enterLocalScope(false);

		String enumName;
		List<String> interfaces = new LinkedList<>();
		if(ctx.enumDef().unionStyleEnum() != null) {
			enumName = ctx.enumDef().unionStyleEnum().enumName().getText();
			SwiftParserUtils.setInharitance(ctx.enumDef().unionStyleEnum().typeInheritanceClause(), interfaces);
		} else {
			enumName = ctx.enumDef().rawValueStyleEnum().enumName().getText();
			SwiftParserUtils.setInharitance(ctx.enumDef().rawValueStyleEnum().typeInheritanceClause(), interfaces);
		}
		docBuilder.enterTypeDeclaration(enumName, ENUM, interfaces, ctx.getStart().getLine());
	}

	@Override
	public void enterRawValueStyleEnumCaseList(Swift3Parser.RawValueStyleEnumCaseListContext ctx) {
		ctx.rawValueStyleEnumCase().forEach(e -> docBuilder.addEnumConstant(e.enumCaseName().getText()));
	}

	@Override
	public void enterUnionStyleEnumCaseList(Swift3Parser.UnionStyleEnumCaseListContext ctx) {
		ctx.unionStyleEnumCase().forEach(e -> docBuilder.addEnumConstant(e.enumCaseName().getText()));
	}

	@Override
	public void exitEnumDeclaration(Swift3Parser.EnumDeclarationContext ctx) {
		lst.exitScope();

		docBuilder.exitTypeDeclaration();
	}

	@Override
	public void enterExtensionDeclaration(Swift3Parser.ExtensionDeclarationContext ctx) {
		lst.enterLocalScope(false);

		String className = ctx.typeIdentifier().getText();
		List<String> inherintance = new LinkedList<>();
		SwiftParserUtils.setInharitance(ctx.typeInheritanceClause(), inherintance);
		docBuilder.enterTypeDeclaration(className, EXTENSION, inherintance, ctx.getStart().getLine());
	}

	@Override
	public void exitExtensionDeclaration(Swift3Parser.ExtensionDeclarationContext ctx) {
		lst.exitScope();

		docBuilder.exitTypeDeclaration();
	}

	@Override
	public void enterTypealiasDeclaration(@NotNull Swift3Parser.TypealiasDeclarationContext ctx) {
		String className = ctx.typealiasHead().typealiasName().getText();
		docBuilder.enterTypeDeclaration(className, NO_CLASSIFICATION,ctx.getStart().getLine());
	}

	@Override
	public void exitTypealiasDeclaration(@NotNull Swift3Parser.TypealiasDeclarationContext ctx) {
		docBuilder.exitTypeDeclaration();
	}

	@Override
	public void enterInitializerDeclaration(Swift3Parser.InitializerDeclarationContext ctx) {
		lst.enterLocalScope(true);

		String name = "init";
		docBuilder.enterConstructor(name,ctx.getStart().getLine());
	}

	@Override
	public void exitInitializerDeclaration(Swift3Parser.InitializerDeclarationContext ctx) {
		lst.exitScope();

		docBuilder.closeElement();
	}

	@Override
	public void enterFunctionDeclaration(Swift3Parser.FunctionDeclarationContext ctx) {
		lst.enterLocalScope(true);

		if(ctx.functionName() == null) {  // TODO fix gramma
			System.err.println("Method Error: " + ctx.getText());
			docBuilder.enterMethod("noname", "noname", ctx.getStart().getLine());
			return;
		}

		String name = ctx.functionName().getText();
		String mappedName = SwiftParserUtils.getMappedMethodName(name);
		if (ctx.functionSignature().functionResult() != null) {
			PointerTypeSeparator returnType = SwiftParserUtils.getType(ctx.functionSignature().functionResult().sType());
			docBuilder.enterMethod(name, mappedName, returnType, ctx.getStart().getLine());
		} else {
			docBuilder.enterMethod(name, mappedName, ctx.getStart().getLine());
		}

	}

	@Override
	public void exitFunctionDeclaration(Swift3Parser.FunctionDeclarationContext ctx) {
		lst.exitScope();

		docBuilder.closeElement();
	}

	@Override
	public void enterProtocolMethodDeclaration(Swift3Parser.ProtocolMethodDeclarationContext ctx) {
		String pointerName = ctx.functionName().getText();
		String mappedName = SwiftParserUtils.getMappedMethodName(pointerName);
		if(ctx.functionSignature().functionResult() != null) {
			PointerTypeSeparator returnType = SwiftParserUtils.getType(ctx.functionSignature().functionResult().sType());
			docBuilder.enterMethod(pointerName, mappedName, returnType,ctx.getStart().getLine());
		} else {
			docBuilder.enterMethod(pointerName, mappedName, ctx.getStart().getLine());
		}
	}

	@Override
	public void exitProtocolMethodDeclaration(Swift3Parser.ProtocolMethodDeclarationContext ctx) {
		docBuilder.closeElement();
	}

	@Override
	public void enterProtocolInitializerDeclaration(Swift3Parser.ProtocolInitializerDeclarationContext ctx) {
		String name = "init";
		docBuilder.enterConstructor(name, ctx.getStart().getLine());
	}

	@Override
	public void exitProtocolInitializerDeclaration(Swift3Parser.ProtocolInitializerDeclarationContext ctx) {
		docBuilder.closeElement();
	}

	@Override
	public void enterProtocolSubscriptDeclaration(Swift3Parser.ProtocolSubscriptDeclarationContext ctx) {
		PointerTypeSeparator returnType = SwiftParserUtils.getType(ctx.subscriptResult().sType());
		docBuilder.enterSubscript(returnType);
	}

	@Override
	public void exitProtocolSubscriptDeclaration(Swift3Parser.ProtocolSubscriptDeclarationContext ctx) {
		docBuilder.closeElement();
	}

	@Override
	public void enterProtocolPropertyDeclaration(Swift3Parser.ProtocolPropertyDeclarationContext ctx) {
		String pointerName = ctx.variableName().identifier().getText();
		String mappedName = SwiftParserUtils.getMappedAttributeName(pointerName);
		PointerTypeSeparator types = SwiftParserUtils.getType(ctx.typeAnnotation().sType());

//           System.err.println(ctx.getterSetterKeywordBlock().getterKeywordClause().getText()); // TODO
		if(ctx.getterSetterKeywordBlock().setterKeywordClause() != null) {
//                        System.err.println(ctx.getterSetterKeywordBlock().setterKeywordClause().getText()); // TODO
		}

		docBuilder.enterField(pointerName, mappedName, types, ctx.getStart().getLine());
	}

	@Override
	public void exitProtocolPropertyDeclaration(Swift3Parser.ProtocolPropertyDeclarationContext ctx) {
		docBuilder.closeElement();
	}

	@Override
	public void enterSubscriptDeclaration(Swift3Parser.SubscriptDeclarationContext ctx) {
		lst.enterLocalScope(true);

		PointerTypeSeparator returnType = SwiftParserUtils.getType(ctx.subscriptResult().sType());
		docBuilder.enterSubscript(returnType);
	}

	@Override
	public void exitSubscriptDeclaration(Swift3Parser.SubscriptDeclarationContext ctx) {
		lst.exitScope();

		docBuilder.closeElement();
	}
	/**
	 variableDeclaration
	 : variableDeclarationHead variableName typeAnnotation getterSetterBlock
	 | variableDeclarationHead variableName typeAnnotation getterSetterKeywordBlock
	 | variableDeclarationHead variableName initializer willSetDidSetBlock
	 | variableDeclarationHead variableName typeAnnotation initializer? willSetDidSetBlock
	 // keep this below getter and setter rules for ambiguity reasons
	 | variableDeclarationHead variableName typeAnnotation codeBlock
	 | variableDeclarationHead patternInitializerList
	 ;
	 */
	@Override
	public void enterVariableDeclaration(Swift3Parser.VariableDeclarationContext ctx) {
		if (ctx.patternInitializerList() != null) {
			enterField(ctx.patternInitializerList(), ctx.getStart().getLine());
		} else if (ctx.typeAnnotation() != null) {
			enterField(ctx);
		} else {
			System.err.println("no match on enterVariableDeclaration");
		}
	}

	private void enterField(Swift3Parser.VariableDeclarationContext ctx) {
		PointerTypeSeparator types = SwiftParserUtils.getType(ctx.typeAnnotation().sType());
		String pointerName = ctx.variableName().identifier().getText();
		String mappedName = SwiftParserUtils.getMappedAttributeName(pointerName);

		if(lst.isScopeLocal()) {
			docBuilder.enterLocalVariable(mappedName, types);
		} else {
			docBuilder.enterField(pointerName, mappedName, types, ctx.getStart().getLine());
		}
	}

	private void enterField(PatternInitializerListContext patternInitializerList, int startLine) {
		List<String> names = new LinkedList<>();
		PointerTypeSeparator types = new PointerTypeSeparator(SwiftParserUtils.MAPPER);
		for (PatternInitializerContext pil : patternInitializerList.patternInitializer()) {
			names.add(pil.pattern().identifierPattern().identifier().getText());
			TypeAnnotationContext typeContext = pil.pattern().typeAnnotation();
			if (typeContext != null) {
				types.union(SwiftParserUtils.getType(typeContext.sType()));
			}
		}
		String pointerName = names.stream().collect(Collectors.joining(","));
		String mappedName = names.stream().map(SwiftParserUtils::getMappedAttributeName).collect(Collectors.joining(","));

		if(lst.isScopeLocal()) {
			docBuilder.enterLocalVariable(mappedName, types);
		} else {
			docBuilder.enterField(pointerName, mappedName, types, startLine);
		}
	}

	@Override
	public void exitVariableDeclaration(Swift3Parser.VariableDeclarationContext ctx) {
		if(!lst.isScopeLocal()) {
			docBuilder.closeElement();
		}

	}

	@Override
	public void enterGetterSetterBlock(@NotNull Swift3Parser.GetterSetterBlockContext ctx) {
		lst.enterLocalScope(true);
		docBuilder.enterGetter(ctx.getterClause().getStart().getText());
		if(ctx.setterClause() != null) {
			docBuilder.enterGetter(ctx.setterClause().getStart().getText());
		}
	}

	@Override
	public void exitGetterSetterBlock(@NotNull Swift3Parser.GetterSetterBlockContext ctx) {
		lst.exitScope();
	}

	@Override
	public void enterGetterSetterKeywordBlock(@NotNull Swift3Parser.GetterSetterKeywordBlockContext ctx) {
		lst.enterLocalScope(true);
		docBuilder.enterSetter(ctx.getterKeywordClause().getText());
		if(ctx.setterKeywordClause() != null) {
			docBuilder.enterSetter(ctx.setterKeywordClause().getText());
		}
	}

	@Override
	public void exitGetterSetterKeywordBlock(@NotNull Swift3Parser.GetterSetterKeywordBlockContext ctx) {
		lst.exitScope();
	}

	/**
	 constantDeclaration : attributes? declarationModifiers? 'let' patternInitializerList ;
	 */
	@Override
	public void enterConstantDeclaration(Swift3Parser.ConstantDeclarationContext ctx) {
		enterField(ctx.patternInitializerList(), ctx.getStart().getLine());
	}

	@Override
	public void exitConstantDeclaration(Swift3Parser.ConstantDeclarationContext ctx) {
		if(!lst.isScopeLocal()) {
			docBuilder.closeElement();
		}
	}

	@Override
	public void exitParameter(Swift3Parser.ParameterContext ctx) {
		String name = ctx.localParameterName().getText();
		PointerTypeSeparator types = SwiftParserUtils.getType(ctx.typeAnnotation().sType());
		if(ctx.externalParameterName() != null && !ctx.externalParameterName().getText().equals("_")) {
			name = ctx.externalParameterName().getText();
			docBuilder.enterParameter(name, types);
		} else {
			docBuilder.enterParameter(name, types);
		}
	}

	@Override public void enterClosureExpression(@NotNull Swift3Parser.ClosureExpressionContext ctx) {
		lst.enterLocalScope(true);
	}

	@Override public void exitClosureExpression(@NotNull Swift3Parser.ClosureExpressionContext ctx) {
		lst.exitScope();
	}

	@Override public void enterWillSetDidSetBlock(@NotNull Swift3Parser.WillSetDidSetBlockContext ctx) {
		lst.enterLocalScope(true);
	}

	@Override public void exitWillSetDidSetBlock(@NotNull Swift3Parser.WillSetDidSetBlockContext ctx) {
		lst.exitScope();
	}


	// captureList? closureParameterClause 'throws'? functionResult? 'in'
	@Override
	public void enterClosureSignature(@NotNull Swift3Parser.ClosureSignatureContext ctx) {
		if(ctx.closureParameterClause() != null) {
			if(ctx.functionResult() != null) {
				PointerTypeSeparator type = SwiftParserUtils.getType(ctx.functionResult().sType());
				docBuilder.enterClosure(type, ctx.getStart().getLine());
			} else {
				docBuilder.enterClosure(ctx.getStart().getLine());
			}
		}
	}


	// closureParameterClause: '(' ')' | '(' closureParameterList ')' | identifierList ;
	@Override
	public void enterClosureParameterClause(@NotNull Swift3Parser.ClosureParameterClauseContext ctx) {
		if(ctx.closureParameterList() !=  null) {
			ClosureParameterContext closureParameter = ctx.closureParameterList().closureParameter();
			getClosureParameters(closureParameter);
			getClosureParametersFromList(ctx.closureParameterList().closureParameterList());
		} else if(ctx.identifierList() != null) {
			ctx.identifierList().identifier().forEach(e -> docBuilder.enterParameter(e.getText()));
		}
	}

	private void getClosureParametersFromList(List<ClosureParameterListContext> closureParameterList) {
		for (ClosureParameterListContext closureParameterListContext : closureParameterList) {
			getClosureParameters(closureParameterListContext.closureParameter());
			getClosureParametersFromList(closureParameterListContext.closureParameterList());
		}
	}

	private void getClosureParameters(ClosureParameterContext closureParameter) {
		String name = closureParameter.closureParameterName().getText();
		if(closureParameter.typeAnnotation() != null) {
			PointerTypeSeparator type = SwiftParserUtils.getType(closureParameter.typeAnnotation().sType());
			docBuilder.enterParameter(name, type);
		} else {
			docBuilder.enterParameter(name);
		}
	}

	@Override
	public void exitClosureSignature(@NotNull Swift3Parser.ClosureSignatureContext ctx) {
		if(ctx.closureParameterClause() != null) {
			docBuilder.closeElement();
		}
	}

	@Override
	public void enterGenericParameter(@NotNull Swift3Parser.GenericParameterContext ctx) {
		docBuilder.enterTypeParameter(ctx.typeName().getText());
	}

	public List<T> getDocuments() {
		return docBuilder.getDocuments();
	}

	public boolean errorOccurs() {
		return docBuilder.openTypes() > 0;
	}


	@Override
	public void enterFunctionCallExpression(Swift3Parser.FunctionCallExpressionContext ctx) {
		docBuilder.enterMethodCall(ctx.postfixExpression().getText());
	}


}
