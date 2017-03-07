// Generated from Swift3.g4 by ANTLR 4.4


package de.unihamburg.swk.parsing.antlr4.swift3;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Swift3Parser}.
 */
public interface Swift3Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#protocolMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterProtocolMethodDeclaration(@NotNull Swift3Parser.ProtocolMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#protocolMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitProtocolMethodDeclaration(@NotNull Swift3Parser.ProtocolMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#didSetClause}.
	 * @param ctx the parse tree
	 */
	void enterDidSetClause(@NotNull Swift3Parser.DidSetClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#didSetClause}.
	 * @param ctx the parse tree
	 */
	void exitDidSetClause(@NotNull Swift3Parser.DidSetClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#fileName}.
	 * @param ctx the parse tree
	 */
	void enterFileName(@NotNull Swift3Parser.FileNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#fileName}.
	 * @param ctx the parse tree
	 */
	void exitFileName(@NotNull Swift3Parser.FileNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#catchClauses}.
	 * @param ctx the parse tree
	 */
	void enterCatchClauses(@NotNull Swift3Parser.CatchClausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#catchClauses}.
	 * @param ctx the parse tree
	 */
	void exitCatchClauses(@NotNull Swift3Parser.CatchClausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#argumentName}.
	 * @param ctx the parse tree
	 */
	void enterArgumentName(@NotNull Swift3Parser.ArgumentNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#argumentName}.
	 * @param ctx the parse tree
	 */
	void exitArgumentName(@NotNull Swift3Parser.ArgumentNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#unionStyleEnum}.
	 * @param ctx the parse tree
	 */
	void enterUnionStyleEnum(@NotNull Swift3Parser.UnionStyleEnumContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#unionStyleEnum}.
	 * @param ctx the parse tree
	 */
	void exitUnionStyleEnum(@NotNull Swift3Parser.UnionStyleEnumContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#functionSignature}.
	 * @param ctx the parse tree
	 */
	void enterFunctionSignature(@NotNull Swift3Parser.FunctionSignatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#functionSignature}.
	 * @param ctx the parse tree
	 */
	void exitFunctionSignature(@NotNull Swift3Parser.FunctionSignatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#extensionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterExtensionDeclaration(@NotNull Swift3Parser.ExtensionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#extensionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitExtensionDeclaration(@NotNull Swift3Parser.ExtensionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#associativityClause}.
	 * @param ctx the parse tree
	 */
	void enterAssociativityClause(@NotNull Swift3Parser.AssociativityClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#associativityClause}.
	 * @param ctx the parse tree
	 */
	void exitAssociativityClause(@NotNull Swift3Parser.AssociativityClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#arrayLiteralItem}.
	 * @param ctx the parse tree
	 */
	void enterArrayLiteralItem(@NotNull Swift3Parser.ArrayLiteralItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#arrayLiteralItem}.
	 * @param ctx the parse tree
	 */
	void exitArrayLiteralItem(@NotNull Swift3Parser.ArrayLiteralItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#classRequirement}.
	 * @param ctx the parse tree
	 */
	void enterClassRequirement(@NotNull Swift3Parser.ClassRequirementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#classRequirement}.
	 * @param ctx the parse tree
	 */
	void exitClassRequirement(@NotNull Swift3Parser.ClassRequirementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#elseifDirectiveClauses}.
	 * @param ctx the parse tree
	 */
	void enterElseifDirectiveClauses(@NotNull Swift3Parser.ElseifDirectiveClausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#elseifDirectiveClauses}.
	 * @param ctx the parse tree
	 */
	void exitElseifDirectiveClauses(@NotNull Swift3Parser.ElseifDirectiveClausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#platformCondition}.
	 * @param ctx the parse tree
	 */
	void enterPlatformCondition(@NotNull Swift3Parser.PlatformConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#platformCondition}.
	 * @param ctx the parse tree
	 */
	void exitPlatformCondition(@NotNull Swift3Parser.PlatformConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#numericLiteral}.
	 * @param ctx the parse tree
	 */
	void enterNumericLiteral(@NotNull Swift3Parser.NumericLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#numericLiteral}.
	 * @param ctx the parse tree
	 */
	void exitNumericLiteral(@NotNull Swift3Parser.NumericLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCallWithClosureExpression}
	 * labeled alternative in {@link Swift3Parser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallWithClosureExpression(@NotNull Swift3Parser.FunctionCallWithClosureExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCallWithClosureExpression}
	 * labeled alternative in {@link Swift3Parser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallWithClosureExpression(@NotNull Swift3Parser.FunctionCallWithClosureExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#protocolPropertyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterProtocolPropertyDeclaration(@NotNull Swift3Parser.ProtocolPropertyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#protocolPropertyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitProtocolPropertyDeclaration(@NotNull Swift3Parser.ProtocolPropertyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#arrayType}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(@NotNull Swift3Parser.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#arrayType}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(@NotNull Swift3Parser.ArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#argumentNames}.
	 * @param ctx the parse tree
	 */
	void enterArgumentNames(@NotNull Swift3Parser.ArgumentNamesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#argumentNames}.
	 * @param ctx the parse tree
	 */
	void exitArgumentNames(@NotNull Swift3Parser.ArgumentNamesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#identifierList}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierList(@NotNull Swift3Parser.IdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#identifierList}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierList(@NotNull Swift3Parser.IdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#dictionaryType}.
	 * @param ctx the parse tree
	 */
	void enterDictionaryType(@NotNull Swift3Parser.DictionaryTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#dictionaryType}.
	 * @param ctx the parse tree
	 */
	void exitDictionaryType(@NotNull Swift3Parser.DictionaryTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#optionalType}.
	 * @param ctx the parse tree
	 */
	void enterOptionalType(@NotNull Swift3Parser.OptionalTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#optionalType}.
	 * @param ctx the parse tree
	 */
	void exitOptionalType(@NotNull Swift3Parser.OptionalTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#requirementList}.
	 * @param ctx the parse tree
	 */
	void enterRequirementList(@NotNull Swift3Parser.RequirementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#requirementList}.
	 * @param ctx the parse tree
	 */
	void exitRequirementList(@NotNull Swift3Parser.RequirementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#wildcardPattern}.
	 * @param ctx the parse tree
	 */
	void enterWildcardPattern(@NotNull Swift3Parser.WildcardPatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#wildcardPattern}.
	 * @param ctx the parse tree
	 */
	void exitWildcardPattern(@NotNull Swift3Parser.WildcardPatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#sType}.
	 * @param ctx the parse tree
	 */
	void enterSType(@NotNull Swift3Parser.STypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#sType}.
	 * @param ctx the parse tree
	 */
	void exitSType(@NotNull Swift3Parser.STypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#externalParameterName}.
	 * @param ctx the parse tree
	 */
	void enterExternalParameterName(@NotNull Swift3Parser.ExternalParameterNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#externalParameterName}.
	 * @param ctx the parse tree
	 */
	void exitExternalParameterName(@NotNull Swift3Parser.ExternalParameterNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#closureExpression}.
	 * @param ctx the parse tree
	 */
	void enterClosureExpression(@NotNull Swift3Parser.ClosureExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#closureExpression}.
	 * @param ctx the parse tree
	 */
	void exitClosureExpression(@NotNull Swift3Parser.ClosureExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#variableDeclarationHead}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationHead(@NotNull Swift3Parser.VariableDeclarationHeadContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#variableDeclarationHead}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationHead(@NotNull Swift3Parser.VariableDeclarationHeadContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#lineNumber}.
	 * @param ctx the parse tree
	 */
	void enterLineNumber(@NotNull Swift3Parser.LineNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#lineNumber}.
	 * @param ctx the parse tree
	 */
	void exitLineNumber(@NotNull Swift3Parser.LineNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#rawValueStyleEnumCase}.
	 * @param ctx the parse tree
	 */
	void enterRawValueStyleEnumCase(@NotNull Swift3Parser.RawValueStyleEnumCaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#rawValueStyleEnumCase}.
	 * @param ctx the parse tree
	 */
	void exitRawValueStyleEnumCase(@NotNull Swift3Parser.RawValueStyleEnumCaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#structDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStructDeclaration(@NotNull Swift3Parser.StructDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#structDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStructDeclaration(@NotNull Swift3Parser.StructDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#implicitlyUnwrappedOptionalType}.
	 * @param ctx the parse tree
	 */
	void enterImplicitlyUnwrappedOptionalType(@NotNull Swift3Parser.ImplicitlyUnwrappedOptionalTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#implicitlyUnwrappedOptionalType}.
	 * @param ctx the parse tree
	 */
	void exitImplicitlyUnwrappedOptionalType(@NotNull Swift3Parser.ImplicitlyUnwrappedOptionalTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#arrayLiteral}.
	 * @param ctx the parse tree
	 */
	void enterArrayLiteral(@NotNull Swift3Parser.ArrayLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#arrayLiteral}.
	 * @param ctx the parse tree
	 */
	void exitArrayLiteral(@NotNull Swift3Parser.ArrayLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#dictionaryLiteralItem}.
	 * @param ctx the parse tree
	 */
	void enterDictionaryLiteralItem(@NotNull Swift3Parser.DictionaryLiteralItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#dictionaryLiteralItem}.
	 * @param ctx the parse tree
	 */
	void exitDictionaryLiteralItem(@NotNull Swift3Parser.DictionaryLiteralItemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code postfixSelfExpression}
	 * labeled alternative in {@link Swift3Parser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixSelfExpression(@NotNull Swift3Parser.PostfixSelfExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code postfixSelfExpression}
	 * labeled alternative in {@link Swift3Parser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixSelfExpression(@NotNull Swift3Parser.PostfixSelfExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(@NotNull Swift3Parser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(@NotNull Swift3Parser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#protocolMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterProtocolMemberDeclaration(@NotNull Swift3Parser.ProtocolMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#protocolMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitProtocolMemberDeclaration(@NotNull Swift3Parser.ProtocolMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(@NotNull Swift3Parser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(@NotNull Swift3Parser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#guardStatement}.
	 * @param ctx the parse tree
	 */
	void enterGuardStatement(@NotNull Swift3Parser.GuardStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#guardStatement}.
	 * @param ctx the parse tree
	 */
	void exitGuardStatement(@NotNull Swift3Parser.GuardStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(@NotNull Swift3Parser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(@NotNull Swift3Parser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCallExpression}
	 * labeled alternative in {@link Swift3Parser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallExpression(@NotNull Swift3Parser.FunctionCallExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCallExpression}
	 * labeled alternative in {@link Swift3Parser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallExpression(@NotNull Swift3Parser.FunctionCallExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(@NotNull Swift3Parser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(@NotNull Swift3Parser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#labelName}.
	 * @param ctx the parse tree
	 */
	void enterLabelName(@NotNull Swift3Parser.LabelNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#labelName}.
	 * @param ctx the parse tree
	 */
	void exitLabelName(@NotNull Swift3Parser.LabelNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#accessLevelModifiers}.
	 * @param ctx the parse tree
	 */
	void enterAccessLevelModifiers(@NotNull Swift3Parser.AccessLevelModifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#accessLevelModifiers}.
	 * @param ctx the parse tree
	 */
	void exitAccessLevelModifiers(@NotNull Swift3Parser.AccessLevelModifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#dictionaryLiteral}.
	 * @param ctx the parse tree
	 */
	void enterDictionaryLiteral(@NotNull Swift3Parser.DictionaryLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#dictionaryLiteral}.
	 * @param ctx the parse tree
	 */
	void exitDictionaryLiteral(@NotNull Swift3Parser.DictionaryLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#constantDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstantDeclaration(@NotNull Swift3Parser.ConstantDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#constantDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstantDeclaration(@NotNull Swift3Parser.ConstantDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEnumDeclaration(@NotNull Swift3Parser.EnumDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEnumDeclaration(@NotNull Swift3Parser.EnumDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#getterSetterKeywordBlock}.
	 * @param ctx the parse tree
	 */
	void enterGetterSetterKeywordBlock(@NotNull Swift3Parser.GetterSetterKeywordBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#getterSetterKeywordBlock}.
	 * @param ctx the parse tree
	 */
	void exitGetterSetterKeywordBlock(@NotNull Swift3Parser.GetterSetterKeywordBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(@NotNull Swift3Parser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(@NotNull Swift3Parser.PrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull Swift3Parser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull Swift3Parser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void enterThrowStatement(@NotNull Swift3Parser.ThrowStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void exitThrowStatement(@NotNull Swift3Parser.ThrowStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#promiseKitExpression}.
	 * @param ctx the parse tree
	 */
	void enterPromiseKitExpression(@NotNull Swift3Parser.PromiseKitExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#promiseKitExpression}.
	 * @param ctx the parse tree
	 */
	void exitPromiseKitExpression(@NotNull Swift3Parser.PromiseKitExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#enumDef}.
	 * @param ctx the parse tree
	 */
	void enterEnumDef(@NotNull Swift3Parser.EnumDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#enumDef}.
	 * @param ctx the parse tree
	 */
	void exitEnumDef(@NotNull Swift3Parser.EnumDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(@NotNull Swift3Parser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(@NotNull Swift3Parser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#optionalBindingCondition}.
	 * @param ctx the parse tree
	 */
	void enterOptionalBindingCondition(@NotNull Swift3Parser.OptionalBindingConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#optionalBindingCondition}.
	 * @param ctx the parse tree
	 */
	void exitOptionalBindingCondition(@NotNull Swift3Parser.OptionalBindingConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#importKind}.
	 * @param ctx the parse tree
	 */
	void enterImportKind(@NotNull Swift3Parser.ImportKindContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#importKind}.
	 * @param ctx the parse tree
	 */
	void exitImportKind(@NotNull Swift3Parser.ImportKindContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forcedValueExpression}
	 * labeled alternative in {@link Swift3Parser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterForcedValueExpression(@NotNull Swift3Parser.ForcedValueExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forcedValueExpression}
	 * labeled alternative in {@link Swift3Parser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitForcedValueExpression(@NotNull Swift3Parser.ForcedValueExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#topLevel}.
	 * @param ctx the parse tree
	 */
	void enterTopLevel(@NotNull Swift3Parser.TopLevelContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#topLevel}.
	 * @param ctx the parse tree
	 */
	void exitTopLevel(@NotNull Swift3Parser.TopLevelContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#implicitMemberExpression}.
	 * @param ctx the parse tree
	 */
	void enterImplicitMemberExpression(@NotNull Swift3Parser.ImplicitMemberExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#implicitMemberExpression}.
	 * @param ctx the parse tree
	 */
	void exitImplicitMemberExpression(@NotNull Swift3Parser.ImplicitMemberExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void enterIntegerLiteral(@NotNull Swift3Parser.IntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void exitIntegerLiteral(@NotNull Swift3Parser.IntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#captureSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterCaptureSpecifier(@NotNull Swift3Parser.CaptureSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#captureSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitCaptureSpecifier(@NotNull Swift3Parser.CaptureSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#protocolCompositionType}.
	 * @param ctx the parse tree
	 */
	void enterProtocolCompositionType(@NotNull Swift3Parser.ProtocolCompositionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#protocolCompositionType}.
	 * @param ctx the parse tree
	 */
	void exitProtocolCompositionType(@NotNull Swift3Parser.ProtocolCompositionTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#closureParameterList}.
	 * @param ctx the parse tree
	 */
	void enterClosureParameterList(@NotNull Swift3Parser.ClosureParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#closureParameterList}.
	 * @param ctx the parse tree
	 */
	void exitClosureParameterList(@NotNull Swift3Parser.ClosureParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#tupleType}.
	 * @param ctx the parse tree
	 */
	void enterTupleType(@NotNull Swift3Parser.TupleTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#tupleType}.
	 * @param ctx the parse tree
	 */
	void exitTupleType(@NotNull Swift3Parser.TupleTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#typeAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterTypeAnnotation(@NotNull Swift3Parser.TypeAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#typeAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitTypeAnnotation(@NotNull Swift3Parser.TypeAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(@NotNull Swift3Parser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(@NotNull Swift3Parser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code optionalChainingExpression}
	 * labeled alternative in {@link Swift3Parser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterOptionalChainingExpression(@NotNull Swift3Parser.OptionalChainingExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code optionalChainingExpression}
	 * labeled alternative in {@link Swift3Parser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitOptionalChainingExpression(@NotNull Swift3Parser.OptionalChainingExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#rawValueStyleEnumCaseClause}.
	 * @param ctx the parse tree
	 */
	void enterRawValueStyleEnumCaseClause(@NotNull Swift3Parser.RawValueStyleEnumCaseClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#rawValueStyleEnumCaseClause}.
	 * @param ctx the parse tree
	 */
	void exitRawValueStyleEnumCaseClause(@NotNull Swift3Parser.RawValueStyleEnumCaseClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#operatorCharacter}.
	 * @param ctx the parse tree
	 */
	void enterOperatorCharacter(@NotNull Swift3Parser.OperatorCharacterContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#operatorCharacter}.
	 * @param ctx the parse tree
	 */
	void exitOperatorCharacter(@NotNull Swift3Parser.OperatorCharacterContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#prefixOperator}.
	 * @param ctx the parse tree
	 */
	void enterPrefixOperator(@NotNull Swift3Parser.PrefixOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#prefixOperator}.
	 * @param ctx the parse tree
	 */
	void exitPrefixOperator(@NotNull Swift3Parser.PrefixOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#associativity}.
	 * @param ctx the parse tree
	 */
	void enterAssociativity(@NotNull Swift3Parser.AssociativityContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#associativity}.
	 * @param ctx the parse tree
	 */
	void exitAssociativity(@NotNull Swift3Parser.AssociativityContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#keyword}.
	 * @param ctx the parse tree
	 */
	void enterKeyword(@NotNull Swift3Parser.KeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#keyword}.
	 * @param ctx the parse tree
	 */
	void exitKeyword(@NotNull Swift3Parser.KeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiteral(@NotNull Swift3Parser.BooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiteral(@NotNull Swift3Parser.BooleanLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#availabilityArgument}.
	 * @param ctx the parse tree
	 */
	void enterAvailabilityArgument(@NotNull Swift3Parser.AvailabilityArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#availabilityArgument}.
	 * @param ctx the parse tree
	 */
	void exitAvailabilityArgument(@NotNull Swift3Parser.AvailabilityArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#selectorExpression}.
	 * @param ctx the parse tree
	 */
	void enterSelectorExpression(@NotNull Swift3Parser.SelectorExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#selectorExpression}.
	 * @param ctx the parse tree
	 */
	void exitSelectorExpression(@NotNull Swift3Parser.SelectorExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dynamicTypeExpression}
	 * labeled alternative in {@link Swift3Parser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterDynamicTypeExpression(@NotNull Swift3Parser.DynamicTypeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dynamicTypeExpression}
	 * labeled alternative in {@link Swift3Parser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitDynamicTypeExpression(@NotNull Swift3Parser.DynamicTypeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#patternInitializerList}.
	 * @param ctx the parse tree
	 */
	void enterPatternInitializerList(@NotNull Swift3Parser.PatternInitializerListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#patternInitializerList}.
	 * @param ctx the parse tree
	 */
	void exitPatternInitializerList(@NotNull Swift3Parser.PatternInitializerListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#typeInheritanceClause}.
	 * @param ctx the parse tree
	 */
	void enterTypeInheritanceClause(@NotNull Swift3Parser.TypeInheritanceClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#typeInheritanceClause}.
	 * @param ctx the parse tree
	 */
	void exitTypeInheritanceClause(@NotNull Swift3Parser.TypeInheritanceClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#rawValueStyleEnum}.
	 * @param ctx the parse tree
	 */
	void enterRawValueStyleEnum(@NotNull Swift3Parser.RawValueStyleEnumContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#rawValueStyleEnum}.
	 * @param ctx the parse tree
	 */
	void exitRawValueStyleEnum(@NotNull Swift3Parser.RawValueStyleEnumContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#unionStyleEnumCaseList}.
	 * @param ctx the parse tree
	 */
	void enterUnionStyleEnumCaseList(@NotNull Swift3Parser.UnionStyleEnumCaseListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#unionStyleEnumCaseList}.
	 * @param ctx the parse tree
	 */
	void exitUnionStyleEnumCaseList(@NotNull Swift3Parser.UnionStyleEnumCaseListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#protocolIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterProtocolIdentifier(@NotNull Swift3Parser.ProtocolIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#protocolIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitProtocolIdentifier(@NotNull Swift3Parser.ProtocolIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#captureList}.
	 * @param ctx the parse tree
	 */
	void enterCaptureList(@NotNull Swift3Parser.CaptureListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#captureList}.
	 * @param ctx the parse tree
	 */
	void exitCaptureList(@NotNull Swift3Parser.CaptureListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#setterName}.
	 * @param ctx the parse tree
	 */
	void enterSetterName(@NotNull Swift3Parser.SetterNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#setterName}.
	 * @param ctx the parse tree
	 */
	void exitSetterName(@NotNull Swift3Parser.SetterNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#keyPathExpression}.
	 * @param ctx the parse tree
	 */
	void enterKeyPathExpression(@NotNull Swift3Parser.KeyPathExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#keyPathExpression}.
	 * @param ctx the parse tree
	 */
	void exitKeyPathExpression(@NotNull Swift3Parser.KeyPathExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(@NotNull Swift3Parser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(@NotNull Swift3Parser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#declarationModifiers}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationModifiers(@NotNull Swift3Parser.DeclarationModifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#declarationModifiers}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationModifiers(@NotNull Swift3Parser.DeclarationModifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#functionHead}.
	 * @param ctx the parse tree
	 */
	void enterFunctionHead(@NotNull Swift3Parser.FunctionHeadContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#functionHead}.
	 * @param ctx the parse tree
	 */
	void exitFunctionHead(@NotNull Swift3Parser.FunctionHeadContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#closureParameterName}.
	 * @param ctx the parse tree
	 */
	void enterClosureParameterName(@NotNull Swift3Parser.ClosureParameterNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#closureParameterName}.
	 * @param ctx the parse tree
	 */
	void exitClosureParameterName(@NotNull Swift3Parser.ClosureParameterNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#protocolMemberDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterProtocolMemberDeclarations(@NotNull Swift3Parser.ProtocolMemberDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#protocolMemberDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitProtocolMemberDeclarations(@NotNull Swift3Parser.ProtocolMemberDeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#precedenceClause}.
	 * @param ctx the parse tree
	 */
	void enterPrecedenceClause(@NotNull Swift3Parser.PrecedenceClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#precedenceClause}.
	 * @param ctx the parse tree
	 */
	void exitPrecedenceClause(@NotNull Swift3Parser.PrecedenceClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#tuplePatternElementList}.
	 * @param ctx the parse tree
	 */
	void enterTuplePatternElementList(@NotNull Swift3Parser.TuplePatternElementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#tuplePatternElementList}.
	 * @param ctx the parse tree
	 */
	void exitTuplePatternElementList(@NotNull Swift3Parser.TuplePatternElementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#unionStyleEnumMembers}.
	 * @param ctx the parse tree
	 */
	void enterUnionStyleEnumMembers(@NotNull Swift3Parser.UnionStyleEnumMembersContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#unionStyleEnumMembers}.
	 * @param ctx the parse tree
	 */
	void exitUnionStyleEnumMembers(@NotNull Swift3Parser.UnionStyleEnumMembersContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#closureSignature}.
	 * @param ctx the parse tree
	 */
	void enterClosureSignature(@NotNull Swift3Parser.ClosureSignatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#closureSignature}.
	 * @param ctx the parse tree
	 */
	void exitClosureSignature(@NotNull Swift3Parser.ClosureSignatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#importPathIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterImportPathIdentifier(@NotNull Swift3Parser.ImportPathIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#importPathIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitImportPathIdentifier(@NotNull Swift3Parser.ImportPathIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#captureListItem}.
	 * @param ctx the parse tree
	 */
	void enterCaptureListItem(@NotNull Swift3Parser.CaptureListItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#captureListItem}.
	 * @param ctx the parse tree
	 */
	void exitCaptureListItem(@NotNull Swift3Parser.CaptureListItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#conformanceRequirement}.
	 * @param ctx the parse tree
	 */
	void enterConformanceRequirement(@NotNull Swift3Parser.ConformanceRequirementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#conformanceRequirement}.
	 * @param ctx the parse tree
	 */
	void exitConformanceRequirement(@NotNull Swift3Parser.ConformanceRequirementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#protocolName}.
	 * @param ctx the parse tree
	 */
	void enterProtocolName(@NotNull Swift3Parser.ProtocolNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#protocolName}.
	 * @param ctx the parse tree
	 */
	void exitProtocolName(@NotNull Swift3Parser.ProtocolNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#platformVersion}.
	 * @param ctx the parse tree
	 */
	void enterPlatformVersion(@NotNull Swift3Parser.PlatformVersionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#platformVersion}.
	 * @param ctx the parse tree
	 */
	void exitPlatformVersion(@NotNull Swift3Parser.PlatformVersionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#unionStyleEnumCaseClause}.
	 * @param ctx the parse tree
	 */
	void enterUnionStyleEnumCaseClause(@NotNull Swift3Parser.UnionStyleEnumCaseClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#unionStyleEnumCaseClause}.
	 * @param ctx the parse tree
	 */
	void exitUnionStyleEnumCaseClause(@NotNull Swift3Parser.UnionStyleEnumCaseClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#enumCaseName}.
	 * @param ctx the parse tree
	 */
	void enterEnumCaseName(@NotNull Swift3Parser.EnumCaseNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#enumCaseName}.
	 * @param ctx the parse tree
	 */
	void exitEnumCaseName(@NotNull Swift3Parser.EnumCaseNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#protocolSubscriptDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterProtocolSubscriptDeclaration(@NotNull Swift3Parser.ProtocolSubscriptDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#protocolSubscriptDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitProtocolSubscriptDeclaration(@NotNull Swift3Parser.ProtocolSubscriptDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#infixOperatorAttributes}.
	 * @param ctx the parse tree
	 */
	void enterInfixOperatorAttributes(@NotNull Swift3Parser.InfixOperatorAttributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#infixOperatorAttributes}.
	 * @param ctx the parse tree
	 */
	void exitInfixOperatorAttributes(@NotNull Swift3Parser.InfixOperatorAttributesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull Swift3Parser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull Swift3Parser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#asPattern}.
	 * @param ctx the parse tree
	 */
	void enterAsPattern(@NotNull Swift3Parser.AsPatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#asPattern}.
	 * @param ctx the parse tree
	 */
	void exitAsPattern(@NotNull Swift3Parser.AsPatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#attributeName}.
	 * @param ctx the parse tree
	 */
	void enterAttributeName(@NotNull Swift3Parser.AttributeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#attributeName}.
	 * @param ctx the parse tree
	 */
	void exitAttributeName(@NotNull Swift3Parser.AttributeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#conditionalCompilationBlock}.
	 * @param ctx the parse tree
	 */
	void enterConditionalCompilationBlock(@NotNull Swift3Parser.ConditionalCompilationBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#conditionalCompilationBlock}.
	 * @param ctx the parse tree
	 */
	void exitConditionalCompilationBlock(@NotNull Swift3Parser.ConditionalCompilationBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#requirementClause}.
	 * @param ctx the parse tree
	 */
	void enterRequirementClause(@NotNull Swift3Parser.RequirementClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#requirementClause}.
	 * @param ctx the parse tree
	 */
	void exitRequirementClause(@NotNull Swift3Parser.RequirementClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#controlTransferStatement}.
	 * @param ctx the parse tree
	 */
	void enterControlTransferStatement(@NotNull Swift3Parser.ControlTransferStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#controlTransferStatement}.
	 * @param ctx the parse tree
	 */
	void exitControlTransferStatement(@NotNull Swift3Parser.ControlTransferStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#platformName}.
	 * @param ctx the parse tree
	 */
	void enterPlatformName(@NotNull Swift3Parser.PlatformNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#platformName}.
	 * @param ctx the parse tree
	 */
	void exitPlatformName(@NotNull Swift3Parser.PlatformNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#typealiasHead}.
	 * @param ctx the parse tree
	 */
	void enterTypealiasHead(@NotNull Swift3Parser.TypealiasHeadContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#typealiasHead}.
	 * @param ctx the parse tree
	 */
	void exitTypealiasHead(@NotNull Swift3Parser.TypealiasHeadContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#unionStyleEnumMember}.
	 * @param ctx the parse tree
	 */
	void enterUnionStyleEnumMember(@NotNull Swift3Parser.UnionStyleEnumMemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#unionStyleEnumMember}.
	 * @param ctx the parse tree
	 */
	void exitUnionStyleEnumMember(@NotNull Swift3Parser.UnionStyleEnumMemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#variableName}.
	 * @param ctx the parse tree
	 */
	void enterVariableName(@NotNull Swift3Parser.VariableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#variableName}.
	 * @param ctx the parse tree
	 */
	void exitVariableName(@NotNull Swift3Parser.VariableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#postfixOperator}.
	 * @param ctx the parse tree
	 */
	void enterPostfixOperator(@NotNull Swift3Parser.PostfixOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#postfixOperator}.
	 * @param ctx the parse tree
	 */
	void exitPostfixOperator(@NotNull Swift3Parser.PostfixOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#promiseKitSuffix}.
	 * @param ctx the parse tree
	 */
	void enterPromiseKitSuffix(@NotNull Swift3Parser.PromiseKitSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#promiseKitSuffix}.
	 * @param ctx the parse tree
	 */
	void exitPromiseKitSuffix(@NotNull Swift3Parser.PromiseKitSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#fallthroughStatement}.
	 * @param ctx the parse tree
	 */
	void enterFallthroughStatement(@NotNull Swift3Parser.FallthroughStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#fallthroughStatement}.
	 * @param ctx the parse tree
	 */
	void exitFallthroughStatement(@NotNull Swift3Parser.FallthroughStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#declarationModifier}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationModifier(@NotNull Swift3Parser.DeclarationModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#declarationModifier}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationModifier(@NotNull Swift3Parser.DeclarationModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#patternInitializer}.
	 * @param ctx the parse tree
	 */
	void enterPatternInitializer(@NotNull Swift3Parser.PatternInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#patternInitializer}.
	 * @param ctx the parse tree
	 */
	void exitPatternInitializer(@NotNull Swift3Parser.PatternInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void enterLoopStatement(@NotNull Swift3Parser.LoopStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void exitLoopStatement(@NotNull Swift3Parser.LoopStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(@NotNull Swift3Parser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(@NotNull Swift3Parser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#setterClause}.
	 * @param ctx the parse tree
	 */
	void enterSetterClause(@NotNull Swift3Parser.SetterClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#setterClause}.
	 * @param ctx the parse tree
	 */
	void exitSetterClause(@NotNull Swift3Parser.SetterClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#genericParameter}.
	 * @param ctx the parse tree
	 */
	void enterGenericParameter(@NotNull Swift3Parser.GenericParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#genericParameter}.
	 * @param ctx the parse tree
	 */
	void exitGenericParameter(@NotNull Swift3Parser.GenericParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#genericParameterList}.
	 * @param ctx the parse tree
	 */
	void enterGenericParameterList(@NotNull Swift3Parser.GenericParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#genericParameterList}.
	 * @param ctx the parse tree
	 */
	void exitGenericParameterList(@NotNull Swift3Parser.GenericParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(@NotNull Swift3Parser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(@NotNull Swift3Parser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#setterKeywordClause}.
	 * @param ctx the parse tree
	 */
	void enterSetterKeywordClause(@NotNull Swift3Parser.SetterKeywordClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#setterKeywordClause}.
	 * @param ctx the parse tree
	 */
	void exitSetterKeywordClause(@NotNull Swift3Parser.SetterKeywordClauseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code postfixOperation}
	 * labeled alternative in {@link Swift3Parser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixOperation(@NotNull Swift3Parser.PostfixOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code postfixOperation}
	 * labeled alternative in {@link Swift3Parser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixOperation(@NotNull Swift3Parser.PostfixOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#structName}.
	 * @param ctx the parse tree
	 */
	void enterStructName(@NotNull Swift3Parser.StructNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#structName}.
	 * @param ctx the parse tree
	 */
	void exitStructName(@NotNull Swift3Parser.StructNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#classDeclarationModifiers}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclarationModifiers(@NotNull Swift3Parser.ClassDeclarationModifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#classDeclarationModifiers}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclarationModifiers(@NotNull Swift3Parser.ClassDeclarationModifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#functionBody}.
	 * @param ctx the parse tree
	 */
	void enterFunctionBody(@NotNull Swift3Parser.FunctionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#functionBody}.
	 * @param ctx the parse tree
	 */
	void exitFunctionBody(@NotNull Swift3Parser.FunctionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#closureParameterClause}.
	 * @param ctx the parse tree
	 */
	void enterClosureParameterClause(@NotNull Swift3Parser.ClosureParameterClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#closureParameterClause}.
	 * @param ctx the parse tree
	 */
	void exitClosureParameterClause(@NotNull Swift3Parser.ClosureParameterClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#typeInheritanceList}.
	 * @param ctx the parse tree
	 */
	void enterTypeInheritanceList(@NotNull Swift3Parser.TypeInheritanceListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#typeInheritanceList}.
	 * @param ctx the parse tree
	 */
	void exitTypeInheritanceList(@NotNull Swift3Parser.TypeInheritanceListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#tupleTypeBody}.
	 * @param ctx the parse tree
	 */
	void enterTupleTypeBody(@NotNull Swift3Parser.TupleTypeBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#tupleTypeBody}.
	 * @param ctx the parse tree
	 */
	void exitTupleTypeBody(@NotNull Swift3Parser.TupleTypeBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#postfixOperatorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPostfixOperatorDeclaration(@NotNull Swift3Parser.PostfixOperatorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#postfixOperatorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPostfixOperatorDeclaration(@NotNull Swift3Parser.PostfixOperatorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#infixOperatorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInfixOperatorDeclaration(@NotNull Swift3Parser.InfixOperatorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#infixOperatorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInfixOperatorDeclaration(@NotNull Swift3Parser.InfixOperatorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#caseCondition}.
	 * @param ctx the parse tree
	 */
	void enterCaseCondition(@NotNull Swift3Parser.CaseConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#caseCondition}.
	 * @param ctx the parse tree
	 */
	void exitCaseCondition(@NotNull Swift3Parser.CaseConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#genericArgument}.
	 * @param ctx the parse tree
	 */
	void enterGenericArgument(@NotNull Swift3Parser.GenericArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#genericArgument}.
	 * @param ctx the parse tree
	 */
	void exitGenericArgument(@NotNull Swift3Parser.GenericArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#attributeArgumentClause}.
	 * @param ctx the parse tree
	 */
	void enterAttributeArgumentClause(@NotNull Swift3Parser.AttributeArgumentClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#attributeArgumentClause}.
	 * @param ctx the parse tree
	 */
	void exitAttributeArgumentClause(@NotNull Swift3Parser.AttributeArgumentClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#precedenceLevel}.
	 * @param ctx the parse tree
	 */
	void enterPrecedenceLevel(@NotNull Swift3Parser.PrecedenceLevelContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#precedenceLevel}.
	 * @param ctx the parse tree
	 */
	void exitPrecedenceLevel(@NotNull Swift3Parser.PrecedenceLevelContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#elseDirectiveClause}.
	 * @param ctx the parse tree
	 */
	void enterElseDirectiveClause(@NotNull Swift3Parser.ElseDirectiveClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#elseDirectiveClause}.
	 * @param ctx the parse tree
	 */
	void exitElseDirectiveClause(@NotNull Swift3Parser.ElseDirectiveClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#operatingSystem}.
	 * @param ctx the parse tree
	 */
	void enterOperatingSystem(@NotNull Swift3Parser.OperatingSystemContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#operatingSystem}.
	 * @param ctx the parse tree
	 */
	void exitOperatingSystem(@NotNull Swift3Parser.OperatingSystemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code explicitMemberExpression1}
	 * labeled alternative in {@link Swift3Parser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterExplicitMemberExpression1(@NotNull Swift3Parser.ExplicitMemberExpression1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code explicitMemberExpression1}
	 * labeled alternative in {@link Swift3Parser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitExplicitMemberExpression1(@NotNull Swift3Parser.ExplicitMemberExpression1Context ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#conditionalOperator}.
	 * @param ctx the parse tree
	 */
	void enterConditionalOperator(@NotNull Swift3Parser.ConditionalOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#conditionalOperator}.
	 * @param ctx the parse tree
	 */
	void exitConditionalOperator(@NotNull Swift3Parser.ConditionalOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#parenthesizedExpression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedExpression(@NotNull Swift3Parser.ParenthesizedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#parenthesizedExpression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedExpression(@NotNull Swift3Parser.ParenthesizedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#tupleTypeElement}.
	 * @param ctx the parse tree
	 */
	void enterTupleTypeElement(@NotNull Swift3Parser.TupleTypeElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#tupleTypeElement}.
	 * @param ctx the parse tree
	 */
	void exitTupleTypeElement(@NotNull Swift3Parser.TupleTypeElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#superclassInitializerExpression}.
	 * @param ctx the parse tree
	 */
	void enterSuperclassInitializerExpression(@NotNull Swift3Parser.SuperclassInitializerExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#superclassInitializerExpression}.
	 * @param ctx the parse tree
	 */
	void exitSuperclassInitializerExpression(@NotNull Swift3Parser.SuperclassInitializerExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code explicitMemberExpression3}
	 * labeled alternative in {@link Swift3Parser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterExplicitMemberExpression3(@NotNull Swift3Parser.ExplicitMemberExpression3Context ctx);
	/**
	 * Exit a parse tree produced by the {@code explicitMemberExpression3}
	 * labeled alternative in {@link Swift3Parser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitExplicitMemberExpression3(@NotNull Swift3Parser.ExplicitMemberExpression3Context ctx);
	/**
	 * Enter a parse tree produced by the {@code explicitMemberExpression2}
	 * labeled alternative in {@link Swift3Parser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterExplicitMemberExpression2(@NotNull Swift3Parser.ExplicitMemberExpression2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code explicitMemberExpression2}
	 * labeled alternative in {@link Swift3Parser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitExplicitMemberExpression2(@NotNull Swift3Parser.ExplicitMemberExpression2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code initializerExpressionWithArguments}
	 * labeled alternative in {@link Swift3Parser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterInitializerExpressionWithArguments(@NotNull Swift3Parser.InitializerExpressionWithArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code initializerExpressionWithArguments}
	 * labeled alternative in {@link Swift3Parser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitInitializerExpressionWithArguments(@NotNull Swift3Parser.InitializerExpressionWithArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#defaultLabel}.
	 * @param ctx the parse tree
	 */
	void enterDefaultLabel(@NotNull Swift3Parser.DefaultLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#defaultLabel}.
	 * @param ctx the parse tree
	 */
	void exitDefaultLabel(@NotNull Swift3Parser.DefaultLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(@NotNull Swift3Parser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(@NotNull Swift3Parser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#caseItem}.
	 * @param ctx the parse tree
	 */
	void enterCaseItem(@NotNull Swift3Parser.CaseItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#caseItem}.
	 * @param ctx the parse tree
	 */
	void exitCaseItem(@NotNull Swift3Parser.CaseItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#captureListItems}.
	 * @param ctx the parse tree
	 */
	void enterCaptureListItems(@NotNull Swift3Parser.CaptureListItemsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#captureListItems}.
	 * @param ctx the parse tree
	 */
	void exitCaptureListItems(@NotNull Swift3Parser.CaptureListItemsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#deferStatement}.
	 * @param ctx the parse tree
	 */
	void enterDeferStatement(@NotNull Swift3Parser.DeferStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#deferStatement}.
	 * @param ctx the parse tree
	 */
	void exitDeferStatement(@NotNull Swift3Parser.DeferStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#whereExpression}.
	 * @param ctx the parse tree
	 */
	void enterWhereExpression(@NotNull Swift3Parser.WhereExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#whereExpression}.
	 * @param ctx the parse tree
	 */
	void exitWhereExpression(@NotNull Swift3Parser.WhereExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#typealiasDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypealiasDeclaration(@NotNull Swift3Parser.TypealiasDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#typealiasDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypealiasDeclaration(@NotNull Swift3Parser.TypealiasDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#tupleTypeElementList}.
	 * @param ctx the parse tree
	 */
	void enterTupleTypeElementList(@NotNull Swift3Parser.TupleTypeElementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#tupleTypeElementList}.
	 * @param ctx the parse tree
	 */
	void exitTupleTypeElementList(@NotNull Swift3Parser.TupleTypeElementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#selfExpression}.
	 * @param ctx the parse tree
	 */
	void enterSelfExpression(@NotNull Swift3Parser.SelfExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#selfExpression}.
	 * @param ctx the parse tree
	 */
	void exitSelfExpression(@NotNull Swift3Parser.SelfExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#switchCases}.
	 * @param ctx the parse tree
	 */
	void enterSwitchCases(@NotNull Swift3Parser.SwitchCasesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#switchCases}.
	 * @param ctx the parse tree
	 */
	void exitSwitchCases(@NotNull Swift3Parser.SwitchCasesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#inOutExpression}.
	 * @param ctx the parse tree
	 */
	void enterInOutExpression(@NotNull Swift3Parser.InOutExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#inOutExpression}.
	 * @param ctx the parse tree
	 */
	void exitInOutExpression(@NotNull Swift3Parser.InOutExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#typeIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeIdentifier(@NotNull Swift3Parser.TypeIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#typeIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeIdentifier(@NotNull Swift3Parser.TypeIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#initializerHead}.
	 * @param ctx the parse tree
	 */
	void enterInitializerHead(@NotNull Swift3Parser.InitializerHeadContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#initializerHead}.
	 * @param ctx the parse tree
	 */
	void exitInitializerHead(@NotNull Swift3Parser.InitializerHeadContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primary}
	 * labeled alternative in {@link Swift3Parser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(@NotNull Swift3Parser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primary}
	 * labeled alternative in {@link Swift3Parser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(@NotNull Swift3Parser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#contextSensitiveKeyword}.
	 * @param ctx the parse tree
	 */
	void enterContextSensitiveKeyword(@NotNull Swift3Parser.ContextSensitiveKeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#contextSensitiveKeyword}.
	 * @param ctx the parse tree
	 */
	void exitContextSensitiveKeyword(@NotNull Swift3Parser.ContextSensitiveKeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#balancedToken}.
	 * @param ctx the parse tree
	 */
	void enterBalancedToken(@NotNull Swift3Parser.BalancedTokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#balancedToken}.
	 * @param ctx the parse tree
	 */
	void exitBalancedToken(@NotNull Swift3Parser.BalancedTokenContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#expressionElementIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterExpressionElementIdentifier(@NotNull Swift3Parser.ExpressionElementIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#expressionElementIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitExpressionElementIdentifier(@NotNull Swift3Parser.ExpressionElementIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#elseClause}.
	 * @param ctx the parse tree
	 */
	void enterElseClause(@NotNull Swift3Parser.ElseClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#elseClause}.
	 * @param ctx the parse tree
	 */
	void exitElseClause(@NotNull Swift3Parser.ElseClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#typealiasAssignment}.
	 * @param ctx the parse tree
	 */
	void enterTypealiasAssignment(@NotNull Swift3Parser.TypealiasAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#typealiasAssignment}.
	 * @param ctx the parse tree
	 */
	void exitTypealiasAssignment(@NotNull Swift3Parser.TypealiasAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#tuplePattern}.
	 * @param ctx the parse tree
	 */
	void enterTuplePattern(@NotNull Swift3Parser.TuplePatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#tuplePattern}.
	 * @param ctx the parse tree
	 */
	void exitTuplePattern(@NotNull Swift3Parser.TuplePatternContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subscriptExpression}
	 * labeled alternative in {@link Swift3Parser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterSubscriptExpression(@NotNull Swift3Parser.SubscriptExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subscriptExpression}
	 * labeled alternative in {@link Swift3Parser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitSubscriptExpression(@NotNull Swift3Parser.SubscriptExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#rawValueStyleEnumMembers}.
	 * @param ctx the parse tree
	 */
	void enterRawValueStyleEnumMembers(@NotNull Swift3Parser.RawValueStyleEnumMembersContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#rawValueStyleEnumMembers}.
	 * @param ctx the parse tree
	 */
	void exitRawValueStyleEnumMembers(@NotNull Swift3Parser.RawValueStyleEnumMembersContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#rawValueAssignment}.
	 * @param ctx the parse tree
	 */
	void enterRawValueAssignment(@NotNull Swift3Parser.RawValueAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#rawValueAssignment}.
	 * @param ctx the parse tree
	 */
	void exitRawValueAssignment(@NotNull Swift3Parser.RawValueAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#pattern}.
	 * @param ctx the parse tree
	 */
	void enterPattern(@NotNull Swift3Parser.PatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#pattern}.
	 * @param ctx the parse tree
	 */
	void exitPattern(@NotNull Swift3Parser.PatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(@NotNull Swift3Parser.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(@NotNull Swift3Parser.TypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#availabilityArguments}.
	 * @param ctx the parse tree
	 */
	void enterAvailabilityArguments(@NotNull Swift3Parser.AvailabilityArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#availabilityArguments}.
	 * @param ctx the parse tree
	 */
	void exitAvailabilityArguments(@NotNull Swift3Parser.AvailabilityArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#className}.
	 * @param ctx the parse tree
	 */
	void enterClassName(@NotNull Swift3Parser.ClassNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#className}.
	 * @param ctx the parse tree
	 */
	void exitClassName(@NotNull Swift3Parser.ClassNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#isPattern}.
	 * @param ctx the parse tree
	 */
	void enterIsPattern(@NotNull Swift3Parser.IsPatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#isPattern}.
	 * @param ctx the parse tree
	 */
	void exitIsPattern(@NotNull Swift3Parser.IsPatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#subscriptDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSubscriptDeclaration(@NotNull Swift3Parser.SubscriptDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#subscriptDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSubscriptDeclaration(@NotNull Swift3Parser.SubscriptDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#expressionElement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionElement(@NotNull Swift3Parser.ExpressionElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#expressionElement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionElement(@NotNull Swift3Parser.ExpressionElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#caseLabel}.
	 * @param ctx the parse tree
	 */
	void enterCaseLabel(@NotNull Swift3Parser.CaseLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#caseLabel}.
	 * @param ctx the parse tree
	 */
	void exitCaseLabel(@NotNull Swift3Parser.CaseLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#repeatWhileStatement}.
	 * @param ctx the parse tree
	 */
	void enterRepeatWhileStatement(@NotNull Swift3Parser.RepeatWhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#repeatWhileStatement}.
	 * @param ctx the parse tree
	 */
	void exitRepeatWhileStatement(@NotNull Swift3Parser.RepeatWhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#catchClause}.
	 * @param ctx the parse tree
	 */
	void enterCatchClause(@NotNull Swift3Parser.CatchClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#catchClause}.
	 * @param ctx the parse tree
	 */
	void exitCatchClause(@NotNull Swift3Parser.CatchClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#balancedTokens}.
	 * @param ctx the parse tree
	 */
	void enterBalancedTokens(@NotNull Swift3Parser.BalancedTokensContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#balancedTokens}.
	 * @param ctx the parse tree
	 */
	void exitBalancedTokens(@NotNull Swift3Parser.BalancedTokensContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void enterLabeledStatement(@NotNull Swift3Parser.LabeledStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void exitLabeledStatement(@NotNull Swift3Parser.LabeledStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#metatypeType}.
	 * @param ctx the parse tree
	 */
	void enterMetatypeType(@NotNull Swift3Parser.MetatypeTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#metatypeType}.
	 * @param ctx the parse tree
	 */
	void exitMetatypeType(@NotNull Swift3Parser.MetatypeTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#operatorHead}.
	 * @param ctx the parse tree
	 */
	void enterOperatorHead(@NotNull Swift3Parser.OperatorHeadContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#operatorHead}.
	 * @param ctx the parse tree
	 */
	void exitOperatorHead(@NotNull Swift3Parser.OperatorHeadContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#closureParameter}.
	 * @param ctx the parse tree
	 */
	void enterClosureParameter(@NotNull Swift3Parser.ClosureParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#closureParameter}.
	 * @param ctx the parse tree
	 */
	void exitClosureParameter(@NotNull Swift3Parser.ClosureParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#superclassSubscriptExpression}.
	 * @param ctx the parse tree
	 */
	void enterSuperclassSubscriptExpression(@NotNull Swift3Parser.SuperclassSubscriptExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#superclassSubscriptExpression}.
	 * @param ctx the parse tree
	 */
	void exitSuperclassSubscriptExpression(@NotNull Swift3Parser.SuperclassSubscriptExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#architecture}.
	 * @param ctx the parse tree
	 */
	void enterArchitecture(@NotNull Swift3Parser.ArchitectureContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#architecture}.
	 * @param ctx the parse tree
	 */
	void exitArchitecture(@NotNull Swift3Parser.ArchitectureContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#valueBindingPattern}.
	 * @param ctx the parse tree
	 */
	void enterValueBindingPattern(@NotNull Swift3Parser.ValueBindingPatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#valueBindingPattern}.
	 * @param ctx the parse tree
	 */
	void exitValueBindingPattern(@NotNull Swift3Parser.ValueBindingPatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#localParameterName}.
	 * @param ctx the parse tree
	 */
	void enterLocalParameterName(@NotNull Swift3Parser.LocalParameterNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#localParameterName}.
	 * @param ctx the parse tree
	 */
	void exitLocalParameterName(@NotNull Swift3Parser.LocalParameterNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#protocolCompositionContinuation}.
	 * @param ctx the parse tree
	 */
	void enterProtocolCompositionContinuation(@NotNull Swift3Parser.ProtocolCompositionContinuationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#protocolCompositionContinuation}.
	 * @param ctx the parse tree
	 */
	void exitProtocolCompositionContinuation(@NotNull Swift3Parser.ProtocolCompositionContinuationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#availabilityCondition}.
	 * @param ctx the parse tree
	 */
	void enterAvailabilityCondition(@NotNull Swift3Parser.AvailabilityConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#availabilityCondition}.
	 * @param ctx the parse tree
	 */
	void exitAvailabilityCondition(@NotNull Swift3Parser.AvailabilityConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#initializer}.
	 * @param ctx the parse tree
	 */
	void enterInitializer(@NotNull Swift3Parser.InitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#initializer}.
	 * @param ctx the parse tree
	 */
	void exitInitializer(@NotNull Swift3Parser.InitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(@NotNull Swift3Parser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(@NotNull Swift3Parser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#doStatement}.
	 * @param ctx the parse tree
	 */
	void enterDoStatement(@NotNull Swift3Parser.DoStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#doStatement}.
	 * @param ctx the parse tree
	 */
	void exitDoStatement(@NotNull Swift3Parser.DoStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#unionStyleEnumCase}.
	 * @param ctx the parse tree
	 */
	void enterUnionStyleEnumCase(@NotNull Swift3Parser.UnionStyleEnumCaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#unionStyleEnumCase}.
	 * @param ctx the parse tree
	 */
	void exitUnionStyleEnumCase(@NotNull Swift3Parser.UnionStyleEnumCaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#wildcardExpression}.
	 * @param ctx the parse tree
	 */
	void enterWildcardExpression(@NotNull Swift3Parser.WildcardExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#wildcardExpression}.
	 * @param ctx the parse tree
	 */
	void exitWildcardExpression(@NotNull Swift3Parser.WildcardExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#binaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterBinaryOperator(@NotNull Swift3Parser.BinaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#binaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitBinaryOperator(@NotNull Swift3Parser.BinaryOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#forInStatement}.
	 * @param ctx the parse tree
	 */
	void enterForInStatement(@NotNull Swift3Parser.ForInStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#forInStatement}.
	 * @param ctx the parse tree
	 */
	void exitForInStatement(@NotNull Swift3Parser.ForInStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#attributes}.
	 * @param ctx the parse tree
	 */
	void enterAttributes(@NotNull Swift3Parser.AttributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#attributes}.
	 * @param ctx the parse tree
	 */
	void exitAttributes(@NotNull Swift3Parser.AttributesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#willSetDidSetBlock}.
	 * @param ctx the parse tree
	 */
	void enterWillSetDidSetBlock(@NotNull Swift3Parser.WillSetDidSetBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#willSetDidSetBlock}.
	 * @param ctx the parse tree
	 */
	void exitWillSetDidSetBlock(@NotNull Swift3Parser.WillSetDidSetBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(@NotNull Swift3Parser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(@NotNull Swift3Parser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#initializerBody}.
	 * @param ctx the parse tree
	 */
	void enterInitializerBody(@NotNull Swift3Parser.InitializerBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#initializerBody}.
	 * @param ctx the parse tree
	 */
	void exitInitializerBody(@NotNull Swift3Parser.InitializerBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#whereClause}.
	 * @param ctx the parse tree
	 */
	void enterWhereClause(@NotNull Swift3Parser.WhereClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#whereClause}.
	 * @param ctx the parse tree
	 */
	void exitWhereClause(@NotNull Swift3Parser.WhereClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#expressionElementList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionElementList(@NotNull Swift3Parser.ExpressionElementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#expressionElementList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionElementList(@NotNull Swift3Parser.ExpressionElementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#compilerControlStatement}.
	 * @param ctx the parse tree
	 */
	void enterCompilerControlStatement(@NotNull Swift3Parser.CompilerControlStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#compilerControlStatement}.
	 * @param ctx the parse tree
	 */
	void exitCompilerControlStatement(@NotNull Swift3Parser.CompilerControlStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#tuplePatternElement}.
	 * @param ctx the parse tree
	 */
	void enterTuplePatternElement(@NotNull Swift3Parser.TuplePatternElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#tuplePatternElement}.
	 * @param ctx the parse tree
	 */
	void exitTuplePatternElement(@NotNull Swift3Parser.TuplePatternElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(@NotNull Swift3Parser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(@NotNull Swift3Parser.AssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#operatorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterOperatorDeclaration(@NotNull Swift3Parser.OperatorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#operatorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitOperatorDeclaration(@NotNull Swift3Parser.OperatorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#elementName}.
	 * @param ctx the parse tree
	 */
	void enterElementName(@NotNull Swift3Parser.ElementNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#elementName}.
	 * @param ctx the parse tree
	 */
	void exitElementName(@NotNull Swift3Parser.ElementNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#superclassExpression}.
	 * @param ctx the parse tree
	 */
	void enterSuperclassExpression(@NotNull Swift3Parser.SuperclassExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#superclassExpression}.
	 * @param ctx the parse tree
	 */
	void exitSuperclassExpression(@NotNull Swift3Parser.SuperclassExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#conditionList}.
	 * @param ctx the parse tree
	 */
	void enterConditionList(@NotNull Swift3Parser.ConditionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#conditionList}.
	 * @param ctx the parse tree
	 */
	void exitConditionList(@NotNull Swift3Parser.ConditionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#arrayLiteralItems}.
	 * @param ctx the parse tree
	 */
	void enterArrayLiteralItems(@NotNull Swift3Parser.ArrayLiteralItemsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#arrayLiteralItems}.
	 * @param ctx the parse tree
	 */
	void exitArrayLiteralItems(@NotNull Swift3Parser.ArrayLiteralItemsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#getterClause}.
	 * @param ctx the parse tree
	 */
	void enterGetterClause(@NotNull Swift3Parser.GetterClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#getterClause}.
	 * @param ctx the parse tree
	 */
	void exitGetterClause(@NotNull Swift3Parser.GetterClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#codeBlock}.
	 * @param ctx the parse tree
	 */
	void enterCodeBlock(@NotNull Swift3Parser.CodeBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#codeBlock}.
	 * @param ctx the parse tree
	 */
	void exitCodeBlock(@NotNull Swift3Parser.CodeBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#ifDirectiveClause}.
	 * @param ctx the parse tree
	 */
	void enterIfDirectiveClause(@NotNull Swift3Parser.IfDirectiveClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#ifDirectiveClause}.
	 * @param ctx the parse tree
	 */
	void exitIfDirectiveClause(@NotNull Swift3Parser.IfDirectiveClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#dictionaryLiteralItems}.
	 * @param ctx the parse tree
	 */
	void enterDictionaryLiteralItems(@NotNull Swift3Parser.DictionaryLiteralItemsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#dictionaryLiteralItems}.
	 * @param ctx the parse tree
	 */
	void exitDictionaryLiteralItems(@NotNull Swift3Parser.DictionaryLiteralItemsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#sameTypeRequirement}.
	 * @param ctx the parse tree
	 */
	void enterSameTypeRequirement(@NotNull Swift3Parser.SameTypeRequirementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#sameTypeRequirement}.
	 * @param ctx the parse tree
	 */
	void exitSameTypeRequirement(@NotNull Swift3Parser.SameTypeRequirementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#accessLevelModifier}.
	 * @param ctx the parse tree
	 */
	void enterAccessLevelModifier(@NotNull Swift3Parser.AccessLevelModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#accessLevelModifier}.
	 * @param ctx the parse tree
	 */
	void exitAccessLevelModifier(@NotNull Swift3Parser.AccessLevelModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#parameterClause}.
	 * @param ctx the parse tree
	 */
	void enterParameterClause(@NotNull Swift3Parser.ParameterClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#parameterClause}.
	 * @param ctx the parse tree
	 */
	void exitParameterClause(@NotNull Swift3Parser.ParameterClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#extensionBody}.
	 * @param ctx the parse tree
	 */
	void enterExtensionBody(@NotNull Swift3Parser.ExtensionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#extensionBody}.
	 * @param ctx the parse tree
	 */
	void exitExtensionBody(@NotNull Swift3Parser.ExtensionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#elseifDirectiveClause}.
	 * @param ctx the parse tree
	 */
	void enterElseifDirectiveClause(@NotNull Swift3Parser.ElseifDirectiveClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#elseifDirectiveClause}.
	 * @param ctx the parse tree
	 */
	void exitElseifDirectiveClause(@NotNull Swift3Parser.ElseifDirectiveClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#protocolDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterProtocolDeclaration(@NotNull Swift3Parser.ProtocolDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#protocolDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitProtocolDeclaration(@NotNull Swift3Parser.ProtocolDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#subscriptResult}.
	 * @param ctx the parse tree
	 */
	void enterSubscriptResult(@NotNull Swift3Parser.SubscriptResultContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#subscriptResult}.
	 * @param ctx the parse tree
	 */
	void exitSubscriptResult(@NotNull Swift3Parser.SubscriptResultContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#typeCastingOperator}.
	 * @param ctx the parse tree
	 */
	void enterTypeCastingOperator(@NotNull Swift3Parser.TypeCastingOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#typeCastingOperator}.
	 * @param ctx the parse tree
	 */
	void exitTypeCastingOperator(@NotNull Swift3Parser.TypeCastingOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#rawValueStyleEnumMember}.
	 * @param ctx the parse tree
	 */
	void enterRawValueStyleEnumMember(@NotNull Swift3Parser.RawValueStyleEnumMemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#rawValueStyleEnumMember}.
	 * @param ctx the parse tree
	 */
	void exitRawValueStyleEnumMember(@NotNull Swift3Parser.RawValueStyleEnumMemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#typeCastingPattern}.
	 * @param ctx the parse tree
	 */
	void enterTypeCastingPattern(@NotNull Swift3Parser.TypeCastingPatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#typeCastingPattern}.
	 * @param ctx the parse tree
	 */
	void exitTypeCastingPattern(@NotNull Swift3Parser.TypeCastingPatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#binaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterBinaryExpression(@NotNull Swift3Parser.BinaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#binaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitBinaryExpression(@NotNull Swift3Parser.BinaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(@NotNull Swift3Parser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(@NotNull Swift3Parser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#genericArgumentClause}.
	 * @param ctx the parse tree
	 */
	void enterGenericArgumentClause(@NotNull Swift3Parser.GenericArgumentClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#genericArgumentClause}.
	 * @param ctx the parse tree
	 */
	void exitGenericArgumentClause(@NotNull Swift3Parser.GenericArgumentClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#functionResult}.
	 * @param ctx the parse tree
	 */
	void enterFunctionResult(@NotNull Swift3Parser.FunctionResultContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#functionResult}.
	 * @param ctx the parse tree
	 */
	void exitFunctionResult(@NotNull Swift3Parser.FunctionResultContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#willSetClause}.
	 * @param ctx the parse tree
	 */
	void enterWillSetClause(@NotNull Swift3Parser.WillSetClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#willSetClause}.
	 * @param ctx the parse tree
	 */
	void exitWillSetClause(@NotNull Swift3Parser.WillSetClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#getterSetterBlock}.
	 * @param ctx the parse tree
	 */
	void enterGetterSetterBlock(@NotNull Swift3Parser.GetterSetterBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#getterSetterBlock}.
	 * @param ctx the parse tree
	 */
	void exitGetterSetterBlock(@NotNull Swift3Parser.GetterSetterBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#typealiasName}.
	 * @param ctx the parse tree
	 */
	void enterTypealiasName(@NotNull Swift3Parser.TypealiasNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#typealiasName}.
	 * @param ctx the parse tree
	 */
	void exitTypealiasName(@NotNull Swift3Parser.TypealiasNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#enumName}.
	 * @param ctx the parse tree
	 */
	void enterEnumName(@NotNull Swift3Parser.EnumNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#enumName}.
	 * @param ctx the parse tree
	 */
	void exitEnumName(@NotNull Swift3Parser.EnumNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#branchStatement}.
	 * @param ctx the parse tree
	 */
	void enterBranchStatement(@NotNull Swift3Parser.BranchStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#branchStatement}.
	 * @param ctx the parse tree
	 */
	void exitBranchStatement(@NotNull Swift3Parser.BranchStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#switchCase}.
	 * @param ctx the parse tree
	 */
	void enterSwitchCase(@NotNull Swift3Parser.SwitchCaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#switchCase}.
	 * @param ctx the parse tree
	 */
	void exitSwitchCase(@NotNull Swift3Parser.SwitchCaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#importPath}.
	 * @param ctx the parse tree
	 */
	void enterImportPath(@NotNull Swift3Parser.ImportPathContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#importPath}.
	 * @param ctx the parse tree
	 */
	void exitImportPath(@NotNull Swift3Parser.ImportPathContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#protocolAssociatedTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterProtocolAssociatedTypeDeclaration(@NotNull Swift3Parser.ProtocolAssociatedTypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#protocolAssociatedTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitProtocolAssociatedTypeDeclaration(@NotNull Swift3Parser.ProtocolAssociatedTypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#genericParameterClause}.
	 * @param ctx the parse tree
	 */
	void enterGenericParameterClause(@NotNull Swift3Parser.GenericParameterClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#genericParameterClause}.
	 * @param ctx the parse tree
	 */
	void exitGenericParameterClause(@NotNull Swift3Parser.GenericParameterClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#genericArgumentList}.
	 * @param ctx the parse tree
	 */
	void enterGenericArgumentList(@NotNull Swift3Parser.GenericArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#genericArgumentList}.
	 * @param ctx the parse tree
	 */
	void exitGenericArgumentList(@NotNull Swift3Parser.GenericArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#enumCasePattern}.
	 * @param ctx the parse tree
	 */
	void enterEnumCasePattern(@NotNull Swift3Parser.EnumCasePatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#enumCasePattern}.
	 * @param ctx the parse tree
	 */
	void exitEnumCasePattern(@NotNull Swift3Parser.EnumCasePatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(@NotNull Swift3Parser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(@NotNull Swift3Parser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#protocolBody}.
	 * @param ctx the parse tree
	 */
	void enterProtocolBody(@NotNull Swift3Parser.ProtocolBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#protocolBody}.
	 * @param ctx the parse tree
	 */
	void exitProtocolBody(@NotNull Swift3Parser.ProtocolBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStatement(@NotNull Swift3Parser.SwitchStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStatement(@NotNull Swift3Parser.SwitchStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#tryOperator}.
	 * @param ctx the parse tree
	 */
	void enterTryOperator(@NotNull Swift3Parser.TryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#tryOperator}.
	 * @param ctx the parse tree
	 */
	void exitTryOperator(@NotNull Swift3Parser.TryOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(@NotNull Swift3Parser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(@NotNull Swift3Parser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#prefixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrefixExpression(@NotNull Swift3Parser.PrefixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#prefixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrefixExpression(@NotNull Swift3Parser.PrefixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(@NotNull Swift3Parser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(@NotNull Swift3Parser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#expressionPattern}.
	 * @param ctx the parse tree
	 */
	void enterExpressionPattern(@NotNull Swift3Parser.ExpressionPatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#expressionPattern}.
	 * @param ctx the parse tree
	 */
	void exitExpressionPattern(@NotNull Swift3Parser.ExpressionPatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#protocolInitializerDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterProtocolInitializerDeclaration(@NotNull Swift3Parser.ProtocolInitializerDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#protocolInitializerDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitProtocolInitializerDeclaration(@NotNull Swift3Parser.ProtocolInitializerDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#initializerDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInitializerDeclaration(@NotNull Swift3Parser.InitializerDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#initializerDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInitializerDeclaration(@NotNull Swift3Parser.InitializerDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(@NotNull Swift3Parser.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(@NotNull Swift3Parser.ImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#getterKeywordClause}.
	 * @param ctx the parse tree
	 */
	void enterGetterKeywordClause(@NotNull Swift3Parser.GetterKeywordClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#getterKeywordClause}.
	 * @param ctx the parse tree
	 */
	void exitGetterKeywordClause(@NotNull Swift3Parser.GetterKeywordClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#rawValueStyleEnumCaseList}.
	 * @param ctx the parse tree
	 */
	void enterRawValueStyleEnumCaseList(@NotNull Swift3Parser.RawValueStyleEnumCaseListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#rawValueStyleEnumCaseList}.
	 * @param ctx the parse tree
	 */
	void exitRawValueStyleEnumCaseList(@NotNull Swift3Parser.RawValueStyleEnumCaseListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#lineControlStatement}.
	 * @param ctx the parse tree
	 */
	void enterLineControlStatement(@NotNull Swift3Parser.LineControlStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#lineControlStatement}.
	 * @param ctx the parse tree
	 */
	void exitLineControlStatement(@NotNull Swift3Parser.LineControlStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#statementLabel}.
	 * @param ctx the parse tree
	 */
	void enterStatementLabel(@NotNull Swift3Parser.StatementLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#statementLabel}.
	 * @param ctx the parse tree
	 */
	void exitStatementLabel(@NotNull Swift3Parser.StatementLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#functionName}.
	 * @param ctx the parse tree
	 */
	void enterFunctionName(@NotNull Swift3Parser.FunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#functionName}.
	 * @param ctx the parse tree
	 */
	void exitFunctionName(@NotNull Swift3Parser.FunctionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#structBody}.
	 * @param ctx the parse tree
	 */
	void enterStructBody(@NotNull Swift3Parser.StructBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#structBody}.
	 * @param ctx the parse tree
	 */
	void exitStructBody(@NotNull Swift3Parser.StructBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatement(@NotNull Swift3Parser.BreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatement(@NotNull Swift3Parser.BreakStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#deinitializerDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterDeinitializerDeclaration(@NotNull Swift3Parser.DeinitializerDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#deinitializerDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitDeinitializerDeclaration(@NotNull Swift3Parser.DeinitializerDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#requirement}.
	 * @param ctx the parse tree
	 */
	void enterRequirement(@NotNull Swift3Parser.RequirementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#requirement}.
	 * @param ctx the parse tree
	 */
	void exitRequirement(@NotNull Swift3Parser.RequirementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#declarations}.
	 * @param ctx the parse tree
	 */
	void enterDeclarations(@NotNull Swift3Parser.DeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#declarations}.
	 * @param ctx the parse tree
	 */
	void exitDeclarations(@NotNull Swift3Parser.DeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#subscriptHead}.
	 * @param ctx the parse tree
	 */
	void enterSubscriptHead(@NotNull Swift3Parser.SubscriptHeadContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#subscriptHead}.
	 * @param ctx the parse tree
	 */
	void exitSubscriptHead(@NotNull Swift3Parser.SubscriptHeadContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#prefixOperatorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPrefixOperatorDeclaration(@NotNull Swift3Parser.PrefixOperatorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#prefixOperatorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPrefixOperatorDeclaration(@NotNull Swift3Parser.PrefixOperatorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#identifierPattern}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierPattern(@NotNull Swift3Parser.IdentifierPatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#identifierPattern}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierPattern(@NotNull Swift3Parser.IdentifierPatternContext ctx);
	/**
	 * Enter a parse tree produced by the {@code initializerExpression}
	 * labeled alternative in {@link Swift3Parser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterInitializerExpression(@NotNull Swift3Parser.InitializerExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code initializerExpression}
	 * labeled alternative in {@link Swift3Parser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitInitializerExpression(@NotNull Swift3Parser.InitializerExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#swiftVersion}.
	 * @param ctx the parse tree
	 */
	void enterSwiftVersion(@NotNull Swift3Parser.SwiftVersionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#swiftVersion}.
	 * @param ctx the parse tree
	 */
	void exitSwiftVersion(@NotNull Swift3Parser.SwiftVersionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void enterContinueStatement(@NotNull Swift3Parser.ContinueStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void exitContinueStatement(@NotNull Swift3Parser.ContinueStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#compilationCondition}.
	 * @param ctx the parse tree
	 */
	void enterCompilationCondition(@NotNull Swift3Parser.CompilationConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#compilationCondition}.
	 * @param ctx the parse tree
	 */
	void exitCompilationCondition(@NotNull Swift3Parser.CompilationConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#defaultArgumentClause}.
	 * @param ctx the parse tree
	 */
	void enterDefaultArgumentClause(@NotNull Swift3Parser.DefaultArgumentClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#defaultArgumentClause}.
	 * @param ctx the parse tree
	 */
	void exitDefaultArgumentClause(@NotNull Swift3Parser.DefaultArgumentClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#literalExpression}.
	 * @param ctx the parse tree
	 */
	void enterLiteralExpression(@NotNull Swift3Parser.LiteralExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#literalExpression}.
	 * @param ctx the parse tree
	 */
	void exitLiteralExpression(@NotNull Swift3Parser.LiteralExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#superclassMethodExpression}.
	 * @param ctx the parse tree
	 */
	void enterSuperclassMethodExpression(@NotNull Swift3Parser.SuperclassMethodExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#superclassMethodExpression}.
	 * @param ctx the parse tree
	 */
	void exitSuperclassMethodExpression(@NotNull Swift3Parser.SuperclassMethodExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#caseItemList}.
	 * @param ctx the parse tree
	 */
	void enterCaseItemList(@NotNull Swift3Parser.CaseItemListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#caseItemList}.
	 * @param ctx the parse tree
	 */
	void exitCaseItemList(@NotNull Swift3Parser.CaseItemListContext ctx);
}