// Generated from Swift3.g4 by ANTLR 4.7
package de.unihamburg.swk.parsing.antlr4.swift3;


import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Swift3Parser}.
 */
public interface Swift3Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#topLevel}.
	 * @param ctx the parse tree
	 */
	void enterTopLevel(Swift3Parser.TopLevelContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#topLevel}.
	 * @param ctx the parse tree
	 */
	void exitTopLevel(Swift3Parser.TopLevelContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(Swift3Parser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(Swift3Parser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#promiseKitExpression}.
	 * @param ctx the parse tree
	 */
	void enterPromiseKitExpression(Swift3Parser.PromiseKitExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#promiseKitExpression}.
	 * @param ctx the parse tree
	 */
	void exitPromiseKitExpression(Swift3Parser.PromiseKitExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#promiseKitSuffix}.
	 * @param ctx the parse tree
	 */
	void enterPromiseKitSuffix(Swift3Parser.PromiseKitSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#promiseKitSuffix}.
	 * @param ctx the parse tree
	 */
	void exitPromiseKitSuffix(Swift3Parser.PromiseKitSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(Swift3Parser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(Swift3Parser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void enterLoopStatement(Swift3Parser.LoopStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void exitLoopStatement(Swift3Parser.LoopStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#forInStatement}.
	 * @param ctx the parse tree
	 */
	void enterForInStatement(Swift3Parser.ForInStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#forInStatement}.
	 * @param ctx the parse tree
	 */
	void exitForInStatement(Swift3Parser.ForInStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(Swift3Parser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(Swift3Parser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#repeatWhileStatement}.
	 * @param ctx the parse tree
	 */
	void enterRepeatWhileStatement(Swift3Parser.RepeatWhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#repeatWhileStatement}.
	 * @param ctx the parse tree
	 */
	void exitRepeatWhileStatement(Swift3Parser.RepeatWhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#branchStatement}.
	 * @param ctx the parse tree
	 */
	void enterBranchStatement(Swift3Parser.BranchStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#branchStatement}.
	 * @param ctx the parse tree
	 */
	void exitBranchStatement(Swift3Parser.BranchStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(Swift3Parser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(Swift3Parser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#elseClause}.
	 * @param ctx the parse tree
	 */
	void enterElseClause(Swift3Parser.ElseClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#elseClause}.
	 * @param ctx the parse tree
	 */
	void exitElseClause(Swift3Parser.ElseClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#guardStatement}.
	 * @param ctx the parse tree
	 */
	void enterGuardStatement(Swift3Parser.GuardStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#guardStatement}.
	 * @param ctx the parse tree
	 */
	void exitGuardStatement(Swift3Parser.GuardStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStatement(Swift3Parser.SwitchStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStatement(Swift3Parser.SwitchStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#switchCases}.
	 * @param ctx the parse tree
	 */
	void enterSwitchCases(Swift3Parser.SwitchCasesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#switchCases}.
	 * @param ctx the parse tree
	 */
	void exitSwitchCases(Swift3Parser.SwitchCasesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#switchCase}.
	 * @param ctx the parse tree
	 */
	void enterSwitchCase(Swift3Parser.SwitchCaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#switchCase}.
	 * @param ctx the parse tree
	 */
	void exitSwitchCase(Swift3Parser.SwitchCaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#caseLabel}.
	 * @param ctx the parse tree
	 */
	void enterCaseLabel(Swift3Parser.CaseLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#caseLabel}.
	 * @param ctx the parse tree
	 */
	void exitCaseLabel(Swift3Parser.CaseLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#caseItemList}.
	 * @param ctx the parse tree
	 */
	void enterCaseItemList(Swift3Parser.CaseItemListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#caseItemList}.
	 * @param ctx the parse tree
	 */
	void exitCaseItemList(Swift3Parser.CaseItemListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#caseItem}.
	 * @param ctx the parse tree
	 */
	void enterCaseItem(Swift3Parser.CaseItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#caseItem}.
	 * @param ctx the parse tree
	 */
	void exitCaseItem(Swift3Parser.CaseItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#defaultLabel}.
	 * @param ctx the parse tree
	 */
	void enterDefaultLabel(Swift3Parser.DefaultLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#defaultLabel}.
	 * @param ctx the parse tree
	 */
	void exitDefaultLabel(Swift3Parser.DefaultLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void enterLabeledStatement(Swift3Parser.LabeledStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void exitLabeledStatement(Swift3Parser.LabeledStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#statementLabel}.
	 * @param ctx the parse tree
	 */
	void enterStatementLabel(Swift3Parser.StatementLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#statementLabel}.
	 * @param ctx the parse tree
	 */
	void exitStatementLabel(Swift3Parser.StatementLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#labelName}.
	 * @param ctx the parse tree
	 */
	void enterLabelName(Swift3Parser.LabelNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#labelName}.
	 * @param ctx the parse tree
	 */
	void exitLabelName(Swift3Parser.LabelNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#controlTransferStatement}.
	 * @param ctx the parse tree
	 */
	void enterControlTransferStatement(Swift3Parser.ControlTransferStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#controlTransferStatement}.
	 * @param ctx the parse tree
	 */
	void exitControlTransferStatement(Swift3Parser.ControlTransferStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatement(Swift3Parser.BreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatement(Swift3Parser.BreakStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void enterContinueStatement(Swift3Parser.ContinueStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void exitContinueStatement(Swift3Parser.ContinueStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#fallthroughStatement}.
	 * @param ctx the parse tree
	 */
	void enterFallthroughStatement(Swift3Parser.FallthroughStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#fallthroughStatement}.
	 * @param ctx the parse tree
	 */
	void exitFallthroughStatement(Swift3Parser.FallthroughStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(Swift3Parser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(Swift3Parser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void enterThrowStatement(Swift3Parser.ThrowStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void exitThrowStatement(Swift3Parser.ThrowStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#deferStatement}.
	 * @param ctx the parse tree
	 */
	void enterDeferStatement(Swift3Parser.DeferStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#deferStatement}.
	 * @param ctx the parse tree
	 */
	void exitDeferStatement(Swift3Parser.DeferStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#doStatement}.
	 * @param ctx the parse tree
	 */
	void enterDoStatement(Swift3Parser.DoStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#doStatement}.
	 * @param ctx the parse tree
	 */
	void exitDoStatement(Swift3Parser.DoStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#catchClauses}.
	 * @param ctx the parse tree
	 */
	void enterCatchClauses(Swift3Parser.CatchClausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#catchClauses}.
	 * @param ctx the parse tree
	 */
	void exitCatchClauses(Swift3Parser.CatchClausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#catchClause}.
	 * @param ctx the parse tree
	 */
	void enterCatchClause(Swift3Parser.CatchClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#catchClause}.
	 * @param ctx the parse tree
	 */
	void exitCatchClause(Swift3Parser.CatchClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#conditionList}.
	 * @param ctx the parse tree
	 */
	void enterConditionList(Swift3Parser.ConditionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#conditionList}.
	 * @param ctx the parse tree
	 */
	void exitConditionList(Swift3Parser.ConditionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(Swift3Parser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(Swift3Parser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#caseCondition}.
	 * @param ctx the parse tree
	 */
	void enterCaseCondition(Swift3Parser.CaseConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#caseCondition}.
	 * @param ctx the parse tree
	 */
	void exitCaseCondition(Swift3Parser.CaseConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#optionalBindingCondition}.
	 * @param ctx the parse tree
	 */
	void enterOptionalBindingCondition(Swift3Parser.OptionalBindingConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#optionalBindingCondition}.
	 * @param ctx the parse tree
	 */
	void exitOptionalBindingCondition(Swift3Parser.OptionalBindingConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#whereClause}.
	 * @param ctx the parse tree
	 */
	void enterWhereClause(Swift3Parser.WhereClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#whereClause}.
	 * @param ctx the parse tree
	 */
	void exitWhereClause(Swift3Parser.WhereClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#whereExpression}.
	 * @param ctx the parse tree
	 */
	void enterWhereExpression(Swift3Parser.WhereExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#whereExpression}.
	 * @param ctx the parse tree
	 */
	void exitWhereExpression(Swift3Parser.WhereExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#availabilityCondition}.
	 * @param ctx the parse tree
	 */
	void enterAvailabilityCondition(Swift3Parser.AvailabilityConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#availabilityCondition}.
	 * @param ctx the parse tree
	 */
	void exitAvailabilityCondition(Swift3Parser.AvailabilityConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#availabilityArguments}.
	 * @param ctx the parse tree
	 */
	void enterAvailabilityArguments(Swift3Parser.AvailabilityArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#availabilityArguments}.
	 * @param ctx the parse tree
	 */
	void exitAvailabilityArguments(Swift3Parser.AvailabilityArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#availabilityArgument}.
	 * @param ctx the parse tree
	 */
	void enterAvailabilityArgument(Swift3Parser.AvailabilityArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#availabilityArgument}.
	 * @param ctx the parse tree
	 */
	void exitAvailabilityArgument(Swift3Parser.AvailabilityArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#platformName}.
	 * @param ctx the parse tree
	 */
	void enterPlatformName(Swift3Parser.PlatformNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#platformName}.
	 * @param ctx the parse tree
	 */
	void exitPlatformName(Swift3Parser.PlatformNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#platformVersion}.
	 * @param ctx the parse tree
	 */
	void enterPlatformVersion(Swift3Parser.PlatformVersionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#platformVersion}.
	 * @param ctx the parse tree
	 */
	void exitPlatformVersion(Swift3Parser.PlatformVersionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#genericParameterClause}.
	 * @param ctx the parse tree
	 */
	void enterGenericParameterClause(Swift3Parser.GenericParameterClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#genericParameterClause}.
	 * @param ctx the parse tree
	 */
	void exitGenericParameterClause(Swift3Parser.GenericParameterClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#genericParameterList}.
	 * @param ctx the parse tree
	 */
	void enterGenericParameterList(Swift3Parser.GenericParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#genericParameterList}.
	 * @param ctx the parse tree
	 */
	void exitGenericParameterList(Swift3Parser.GenericParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#genericParameter}.
	 * @param ctx the parse tree
	 */
	void enterGenericParameter(Swift3Parser.GenericParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#genericParameter}.
	 * @param ctx the parse tree
	 */
	void exitGenericParameter(Swift3Parser.GenericParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#requirementClause}.
	 * @param ctx the parse tree
	 */
	void enterRequirementClause(Swift3Parser.RequirementClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#requirementClause}.
	 * @param ctx the parse tree
	 */
	void exitRequirementClause(Swift3Parser.RequirementClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#requirementList}.
	 * @param ctx the parse tree
	 */
	void enterRequirementList(Swift3Parser.RequirementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#requirementList}.
	 * @param ctx the parse tree
	 */
	void exitRequirementList(Swift3Parser.RequirementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#requirement}.
	 * @param ctx the parse tree
	 */
	void enterRequirement(Swift3Parser.RequirementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#requirement}.
	 * @param ctx the parse tree
	 */
	void exitRequirement(Swift3Parser.RequirementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#conformanceRequirement}.
	 * @param ctx the parse tree
	 */
	void enterConformanceRequirement(Swift3Parser.ConformanceRequirementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#conformanceRequirement}.
	 * @param ctx the parse tree
	 */
	void exitConformanceRequirement(Swift3Parser.ConformanceRequirementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#sameTypeRequirement}.
	 * @param ctx the parse tree
	 */
	void enterSameTypeRequirement(Swift3Parser.SameTypeRequirementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#sameTypeRequirement}.
	 * @param ctx the parse tree
	 */
	void exitSameTypeRequirement(Swift3Parser.SameTypeRequirementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#genericArgumentClause}.
	 * @param ctx the parse tree
	 */
	void enterGenericArgumentClause(Swift3Parser.GenericArgumentClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#genericArgumentClause}.
	 * @param ctx the parse tree
	 */
	void exitGenericArgumentClause(Swift3Parser.GenericArgumentClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#genericArgumentList}.
	 * @param ctx the parse tree
	 */
	void enterGenericArgumentList(Swift3Parser.GenericArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#genericArgumentList}.
	 * @param ctx the parse tree
	 */
	void exitGenericArgumentList(Swift3Parser.GenericArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#genericArgument}.
	 * @param ctx the parse tree
	 */
	void enterGenericArgument(Swift3Parser.GenericArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#genericArgument}.
	 * @param ctx the parse tree
	 */
	void exitGenericArgument(Swift3Parser.GenericArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(Swift3Parser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(Swift3Parser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#declarations}.
	 * @param ctx the parse tree
	 */
	void enterDeclarations(Swift3Parser.DeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#declarations}.
	 * @param ctx the parse tree
	 */
	void exitDeclarations(Swift3Parser.DeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#declarationModifiers}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationModifiers(Swift3Parser.DeclarationModifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#declarationModifiers}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationModifiers(Swift3Parser.DeclarationModifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#declarationModifier}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationModifier(Swift3Parser.DeclarationModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#declarationModifier}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationModifier(Swift3Parser.DeclarationModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#accessLevelModifier}.
	 * @param ctx the parse tree
	 */
	void enterAccessLevelModifier(Swift3Parser.AccessLevelModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#accessLevelModifier}.
	 * @param ctx the parse tree
	 */
	void exitAccessLevelModifier(Swift3Parser.AccessLevelModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#accessLevelModifiers}.
	 * @param ctx the parse tree
	 */
	void enterAccessLevelModifiers(Swift3Parser.AccessLevelModifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#accessLevelModifiers}.
	 * @param ctx the parse tree
	 */
	void exitAccessLevelModifiers(Swift3Parser.AccessLevelModifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#codeBlock}.
	 * @param ctx the parse tree
	 */
	void enterCodeBlock(Swift3Parser.CodeBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#codeBlock}.
	 * @param ctx the parse tree
	 */
	void exitCodeBlock(Swift3Parser.CodeBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(Swift3Parser.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(Swift3Parser.ImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#importKind}.
	 * @param ctx the parse tree
	 */
	void enterImportKind(Swift3Parser.ImportKindContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#importKind}.
	 * @param ctx the parse tree
	 */
	void exitImportKind(Swift3Parser.ImportKindContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#importPath}.
	 * @param ctx the parse tree
	 */
	void enterImportPath(Swift3Parser.ImportPathContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#importPath}.
	 * @param ctx the parse tree
	 */
	void exitImportPath(Swift3Parser.ImportPathContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#importPathIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterImportPathIdentifier(Swift3Parser.ImportPathIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#importPathIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitImportPathIdentifier(Swift3Parser.ImportPathIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#constantDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstantDeclaration(Swift3Parser.ConstantDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#constantDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstantDeclaration(Swift3Parser.ConstantDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#patternInitializerList}.
	 * @param ctx the parse tree
	 */
	void enterPatternInitializerList(Swift3Parser.PatternInitializerListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#patternInitializerList}.
	 * @param ctx the parse tree
	 */
	void exitPatternInitializerList(Swift3Parser.PatternInitializerListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#patternInitializer}.
	 * @param ctx the parse tree
	 */
	void enterPatternInitializer(Swift3Parser.PatternInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#patternInitializer}.
	 * @param ctx the parse tree
	 */
	void exitPatternInitializer(Swift3Parser.PatternInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#initializer}.
	 * @param ctx the parse tree
	 */
	void enterInitializer(Swift3Parser.InitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#initializer}.
	 * @param ctx the parse tree
	 */
	void exitInitializer(Swift3Parser.InitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(Swift3Parser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(Swift3Parser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#variableDeclarationHead}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationHead(Swift3Parser.VariableDeclarationHeadContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#variableDeclarationHead}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationHead(Swift3Parser.VariableDeclarationHeadContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#variableName}.
	 * @param ctx the parse tree
	 */
	void enterVariableName(Swift3Parser.VariableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#variableName}.
	 * @param ctx the parse tree
	 */
	void exitVariableName(Swift3Parser.VariableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#getterSetterBlock}.
	 * @param ctx the parse tree
	 */
	void enterGetterSetterBlock(Swift3Parser.GetterSetterBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#getterSetterBlock}.
	 * @param ctx the parse tree
	 */
	void exitGetterSetterBlock(Swift3Parser.GetterSetterBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#getterClause}.
	 * @param ctx the parse tree
	 */
	void enterGetterClause(Swift3Parser.GetterClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#getterClause}.
	 * @param ctx the parse tree
	 */
	void exitGetterClause(Swift3Parser.GetterClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#setterClause}.
	 * @param ctx the parse tree
	 */
	void enterSetterClause(Swift3Parser.SetterClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#setterClause}.
	 * @param ctx the parse tree
	 */
	void exitSetterClause(Swift3Parser.SetterClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#setterName}.
	 * @param ctx the parse tree
	 */
	void enterSetterName(Swift3Parser.SetterNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#setterName}.
	 * @param ctx the parse tree
	 */
	void exitSetterName(Swift3Parser.SetterNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#getterSetterKeywordBlock}.
	 * @param ctx the parse tree
	 */
	void enterGetterSetterKeywordBlock(Swift3Parser.GetterSetterKeywordBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#getterSetterKeywordBlock}.
	 * @param ctx the parse tree
	 */
	void exitGetterSetterKeywordBlock(Swift3Parser.GetterSetterKeywordBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#getterKeywordClause}.
	 * @param ctx the parse tree
	 */
	void enterGetterKeywordClause(Swift3Parser.GetterKeywordClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#getterKeywordClause}.
	 * @param ctx the parse tree
	 */
	void exitGetterKeywordClause(Swift3Parser.GetterKeywordClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#setterKeywordClause}.
	 * @param ctx the parse tree
	 */
	void enterSetterKeywordClause(Swift3Parser.SetterKeywordClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#setterKeywordClause}.
	 * @param ctx the parse tree
	 */
	void exitSetterKeywordClause(Swift3Parser.SetterKeywordClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#willSetDidSetBlock}.
	 * @param ctx the parse tree
	 */
	void enterWillSetDidSetBlock(Swift3Parser.WillSetDidSetBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#willSetDidSetBlock}.
	 * @param ctx the parse tree
	 */
	void exitWillSetDidSetBlock(Swift3Parser.WillSetDidSetBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#willSetClause}.
	 * @param ctx the parse tree
	 */
	void enterWillSetClause(Swift3Parser.WillSetClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#willSetClause}.
	 * @param ctx the parse tree
	 */
	void exitWillSetClause(Swift3Parser.WillSetClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#didSetClause}.
	 * @param ctx the parse tree
	 */
	void enterDidSetClause(Swift3Parser.DidSetClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#didSetClause}.
	 * @param ctx the parse tree
	 */
	void exitDidSetClause(Swift3Parser.DidSetClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#typealiasDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypealiasDeclaration(Swift3Parser.TypealiasDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#typealiasDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypealiasDeclaration(Swift3Parser.TypealiasDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#typealiasHead}.
	 * @param ctx the parse tree
	 */
	void enterTypealiasHead(Swift3Parser.TypealiasHeadContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#typealiasHead}.
	 * @param ctx the parse tree
	 */
	void exitTypealiasHead(Swift3Parser.TypealiasHeadContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#typealiasName}.
	 * @param ctx the parse tree
	 */
	void enterTypealiasName(Swift3Parser.TypealiasNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#typealiasName}.
	 * @param ctx the parse tree
	 */
	void exitTypealiasName(Swift3Parser.TypealiasNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#typealiasAssignment}.
	 * @param ctx the parse tree
	 */
	void enterTypealiasAssignment(Swift3Parser.TypealiasAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#typealiasAssignment}.
	 * @param ctx the parse tree
	 */
	void exitTypealiasAssignment(Swift3Parser.TypealiasAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(Swift3Parser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(Swift3Parser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#functionHead}.
	 * @param ctx the parse tree
	 */
	void enterFunctionHead(Swift3Parser.FunctionHeadContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#functionHead}.
	 * @param ctx the parse tree
	 */
	void exitFunctionHead(Swift3Parser.FunctionHeadContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#functionName}.
	 * @param ctx the parse tree
	 */
	void enterFunctionName(Swift3Parser.FunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#functionName}.
	 * @param ctx the parse tree
	 */
	void exitFunctionName(Swift3Parser.FunctionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#functionSignature}.
	 * @param ctx the parse tree
	 */
	void enterFunctionSignature(Swift3Parser.FunctionSignatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#functionSignature}.
	 * @param ctx the parse tree
	 */
	void exitFunctionSignature(Swift3Parser.FunctionSignatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#functionResult}.
	 * @param ctx the parse tree
	 */
	void enterFunctionResult(Swift3Parser.FunctionResultContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#functionResult}.
	 * @param ctx the parse tree
	 */
	void exitFunctionResult(Swift3Parser.FunctionResultContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#functionBody}.
	 * @param ctx the parse tree
	 */
	void enterFunctionBody(Swift3Parser.FunctionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#functionBody}.
	 * @param ctx the parse tree
	 */
	void exitFunctionBody(Swift3Parser.FunctionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#parameterClause}.
	 * @param ctx the parse tree
	 */
	void enterParameterClause(Swift3Parser.ParameterClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#parameterClause}.
	 * @param ctx the parse tree
	 */
	void exitParameterClause(Swift3Parser.ParameterClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(Swift3Parser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(Swift3Parser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(Swift3Parser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(Swift3Parser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#externalParameterName}.
	 * @param ctx the parse tree
	 */
	void enterExternalParameterName(Swift3Parser.ExternalParameterNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#externalParameterName}.
	 * @param ctx the parse tree
	 */
	void exitExternalParameterName(Swift3Parser.ExternalParameterNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#localParameterName}.
	 * @param ctx the parse tree
	 */
	void enterLocalParameterName(Swift3Parser.LocalParameterNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#localParameterName}.
	 * @param ctx the parse tree
	 */
	void exitLocalParameterName(Swift3Parser.LocalParameterNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#defaultArgumentClause}.
	 * @param ctx the parse tree
	 */
	void enterDefaultArgumentClause(Swift3Parser.DefaultArgumentClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#defaultArgumentClause}.
	 * @param ctx the parse tree
	 */
	void exitDefaultArgumentClause(Swift3Parser.DefaultArgumentClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEnumDeclaration(Swift3Parser.EnumDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEnumDeclaration(Swift3Parser.EnumDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#enumDef}.
	 * @param ctx the parse tree
	 */
	void enterEnumDef(Swift3Parser.EnumDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#enumDef}.
	 * @param ctx the parse tree
	 */
	void exitEnumDef(Swift3Parser.EnumDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#unionStyleEnum}.
	 * @param ctx the parse tree
	 */
	void enterUnionStyleEnum(Swift3Parser.UnionStyleEnumContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#unionStyleEnum}.
	 * @param ctx the parse tree
	 */
	void exitUnionStyleEnum(Swift3Parser.UnionStyleEnumContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#unionStyleEnumMembers}.
	 * @param ctx the parse tree
	 */
	void enterUnionStyleEnumMembers(Swift3Parser.UnionStyleEnumMembersContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#unionStyleEnumMembers}.
	 * @param ctx the parse tree
	 */
	void exitUnionStyleEnumMembers(Swift3Parser.UnionStyleEnumMembersContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#unionStyleEnumMember}.
	 * @param ctx the parse tree
	 */
	void enterUnionStyleEnumMember(Swift3Parser.UnionStyleEnumMemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#unionStyleEnumMember}.
	 * @param ctx the parse tree
	 */
	void exitUnionStyleEnumMember(Swift3Parser.UnionStyleEnumMemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#unionStyleEnumCaseClause}.
	 * @param ctx the parse tree
	 */
	void enterUnionStyleEnumCaseClause(Swift3Parser.UnionStyleEnumCaseClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#unionStyleEnumCaseClause}.
	 * @param ctx the parse tree
	 */
	void exitUnionStyleEnumCaseClause(Swift3Parser.UnionStyleEnumCaseClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#unionStyleEnumCaseList}.
	 * @param ctx the parse tree
	 */
	void enterUnionStyleEnumCaseList(Swift3Parser.UnionStyleEnumCaseListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#unionStyleEnumCaseList}.
	 * @param ctx the parse tree
	 */
	void exitUnionStyleEnumCaseList(Swift3Parser.UnionStyleEnumCaseListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#unionStyleEnumCase}.
	 * @param ctx the parse tree
	 */
	void enterUnionStyleEnumCase(Swift3Parser.UnionStyleEnumCaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#unionStyleEnumCase}.
	 * @param ctx the parse tree
	 */
	void exitUnionStyleEnumCase(Swift3Parser.UnionStyleEnumCaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#enumName}.
	 * @param ctx the parse tree
	 */
	void enterEnumName(Swift3Parser.EnumNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#enumName}.
	 * @param ctx the parse tree
	 */
	void exitEnumName(Swift3Parser.EnumNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#enumCaseName}.
	 * @param ctx the parse tree
	 */
	void enterEnumCaseName(Swift3Parser.EnumCaseNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#enumCaseName}.
	 * @param ctx the parse tree
	 */
	void exitEnumCaseName(Swift3Parser.EnumCaseNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#rawValueStyleEnum}.
	 * @param ctx the parse tree
	 */
	void enterRawValueStyleEnum(Swift3Parser.RawValueStyleEnumContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#rawValueStyleEnum}.
	 * @param ctx the parse tree
	 */
	void exitRawValueStyleEnum(Swift3Parser.RawValueStyleEnumContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#rawValueStyleEnumMembers}.
	 * @param ctx the parse tree
	 */
	void enterRawValueStyleEnumMembers(Swift3Parser.RawValueStyleEnumMembersContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#rawValueStyleEnumMembers}.
	 * @param ctx the parse tree
	 */
	void exitRawValueStyleEnumMembers(Swift3Parser.RawValueStyleEnumMembersContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#rawValueStyleEnumMember}.
	 * @param ctx the parse tree
	 */
	void enterRawValueStyleEnumMember(Swift3Parser.RawValueStyleEnumMemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#rawValueStyleEnumMember}.
	 * @param ctx the parse tree
	 */
	void exitRawValueStyleEnumMember(Swift3Parser.RawValueStyleEnumMemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#rawValueStyleEnumCaseClause}.
	 * @param ctx the parse tree
	 */
	void enterRawValueStyleEnumCaseClause(Swift3Parser.RawValueStyleEnumCaseClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#rawValueStyleEnumCaseClause}.
	 * @param ctx the parse tree
	 */
	void exitRawValueStyleEnumCaseClause(Swift3Parser.RawValueStyleEnumCaseClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#rawValueStyleEnumCaseList}.
	 * @param ctx the parse tree
	 */
	void enterRawValueStyleEnumCaseList(Swift3Parser.RawValueStyleEnumCaseListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#rawValueStyleEnumCaseList}.
	 * @param ctx the parse tree
	 */
	void exitRawValueStyleEnumCaseList(Swift3Parser.RawValueStyleEnumCaseListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#rawValueStyleEnumCase}.
	 * @param ctx the parse tree
	 */
	void enterRawValueStyleEnumCase(Swift3Parser.RawValueStyleEnumCaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#rawValueStyleEnumCase}.
	 * @param ctx the parse tree
	 */
	void exitRawValueStyleEnumCase(Swift3Parser.RawValueStyleEnumCaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#rawValueAssignment}.
	 * @param ctx the parse tree
	 */
	void enterRawValueAssignment(Swift3Parser.RawValueAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#rawValueAssignment}.
	 * @param ctx the parse tree
	 */
	void exitRawValueAssignment(Swift3Parser.RawValueAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#structDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStructDeclaration(Swift3Parser.StructDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#structDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStructDeclaration(Swift3Parser.StructDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#structName}.
	 * @param ctx the parse tree
	 */
	void enterStructName(Swift3Parser.StructNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#structName}.
	 * @param ctx the parse tree
	 */
	void exitStructName(Swift3Parser.StructNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#structBody}.
	 * @param ctx the parse tree
	 */
	void enterStructBody(Swift3Parser.StructBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#structBody}.
	 * @param ctx the parse tree
	 */
	void exitStructBody(Swift3Parser.StructBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(Swift3Parser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(Swift3Parser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#classDeclarationModifiers}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclarationModifiers(Swift3Parser.ClassDeclarationModifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#classDeclarationModifiers}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclarationModifiers(Swift3Parser.ClassDeclarationModifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#className}.
	 * @param ctx the parse tree
	 */
	void enterClassName(Swift3Parser.ClassNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#className}.
	 * @param ctx the parse tree
	 */
	void exitClassName(Swift3Parser.ClassNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(Swift3Parser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(Swift3Parser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#protocolDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterProtocolDeclaration(Swift3Parser.ProtocolDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#protocolDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitProtocolDeclaration(Swift3Parser.ProtocolDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#protocolName}.
	 * @param ctx the parse tree
	 */
	void enterProtocolName(Swift3Parser.ProtocolNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#protocolName}.
	 * @param ctx the parse tree
	 */
	void exitProtocolName(Swift3Parser.ProtocolNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#protocolBody}.
	 * @param ctx the parse tree
	 */
	void enterProtocolBody(Swift3Parser.ProtocolBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#protocolBody}.
	 * @param ctx the parse tree
	 */
	void exitProtocolBody(Swift3Parser.ProtocolBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#protocolMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterProtocolMemberDeclaration(Swift3Parser.ProtocolMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#protocolMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitProtocolMemberDeclaration(Swift3Parser.ProtocolMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#protocolMemberDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterProtocolMemberDeclarations(Swift3Parser.ProtocolMemberDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#protocolMemberDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitProtocolMemberDeclarations(Swift3Parser.ProtocolMemberDeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#protocolPropertyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterProtocolPropertyDeclaration(Swift3Parser.ProtocolPropertyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#protocolPropertyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitProtocolPropertyDeclaration(Swift3Parser.ProtocolPropertyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#protocolMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterProtocolMethodDeclaration(Swift3Parser.ProtocolMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#protocolMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitProtocolMethodDeclaration(Swift3Parser.ProtocolMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#protocolInitializerDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterProtocolInitializerDeclaration(Swift3Parser.ProtocolInitializerDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#protocolInitializerDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitProtocolInitializerDeclaration(Swift3Parser.ProtocolInitializerDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#protocolSubscriptDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterProtocolSubscriptDeclaration(Swift3Parser.ProtocolSubscriptDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#protocolSubscriptDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitProtocolSubscriptDeclaration(Swift3Parser.ProtocolSubscriptDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#protocolAssociatedTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterProtocolAssociatedTypeDeclaration(Swift3Parser.ProtocolAssociatedTypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#protocolAssociatedTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitProtocolAssociatedTypeDeclaration(Swift3Parser.ProtocolAssociatedTypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#initializerDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInitializerDeclaration(Swift3Parser.InitializerDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#initializerDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInitializerDeclaration(Swift3Parser.InitializerDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#initializerHead}.
	 * @param ctx the parse tree
	 */
	void enterInitializerHead(Swift3Parser.InitializerHeadContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#initializerHead}.
	 * @param ctx the parse tree
	 */
	void exitInitializerHead(Swift3Parser.InitializerHeadContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#initializerBody}.
	 * @param ctx the parse tree
	 */
	void enterInitializerBody(Swift3Parser.InitializerBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#initializerBody}.
	 * @param ctx the parse tree
	 */
	void exitInitializerBody(Swift3Parser.InitializerBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#deinitializerDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterDeinitializerDeclaration(Swift3Parser.DeinitializerDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#deinitializerDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitDeinitializerDeclaration(Swift3Parser.DeinitializerDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#extensionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterExtensionDeclaration(Swift3Parser.ExtensionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#extensionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitExtensionDeclaration(Swift3Parser.ExtensionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#extensionBody}.
	 * @param ctx the parse tree
	 */
	void enterExtensionBody(Swift3Parser.ExtensionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#extensionBody}.
	 * @param ctx the parse tree
	 */
	void exitExtensionBody(Swift3Parser.ExtensionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#subscriptDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSubscriptDeclaration(Swift3Parser.SubscriptDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#subscriptDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSubscriptDeclaration(Swift3Parser.SubscriptDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#subscriptHead}.
	 * @param ctx the parse tree
	 */
	void enterSubscriptHead(Swift3Parser.SubscriptHeadContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#subscriptHead}.
	 * @param ctx the parse tree
	 */
	void exitSubscriptHead(Swift3Parser.SubscriptHeadContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#subscriptResult}.
	 * @param ctx the parse tree
	 */
	void enterSubscriptResult(Swift3Parser.SubscriptResultContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#subscriptResult}.
	 * @param ctx the parse tree
	 */
	void exitSubscriptResult(Swift3Parser.SubscriptResultContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#operatorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterOperatorDeclaration(Swift3Parser.OperatorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#operatorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitOperatorDeclaration(Swift3Parser.OperatorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#prefixOperatorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPrefixOperatorDeclaration(Swift3Parser.PrefixOperatorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#prefixOperatorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPrefixOperatorDeclaration(Swift3Parser.PrefixOperatorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#postfixOperatorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPostfixOperatorDeclaration(Swift3Parser.PostfixOperatorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#postfixOperatorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPostfixOperatorDeclaration(Swift3Parser.PostfixOperatorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#infixOperatorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInfixOperatorDeclaration(Swift3Parser.InfixOperatorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#infixOperatorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInfixOperatorDeclaration(Swift3Parser.InfixOperatorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#infixOperatorAttributes}.
	 * @param ctx the parse tree
	 */
	void enterInfixOperatorAttributes(Swift3Parser.InfixOperatorAttributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#infixOperatorAttributes}.
	 * @param ctx the parse tree
	 */
	void exitInfixOperatorAttributes(Swift3Parser.InfixOperatorAttributesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#precedenceClause}.
	 * @param ctx the parse tree
	 */
	void enterPrecedenceClause(Swift3Parser.PrecedenceClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#precedenceClause}.
	 * @param ctx the parse tree
	 */
	void exitPrecedenceClause(Swift3Parser.PrecedenceClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#precedenceLevel}.
	 * @param ctx the parse tree
	 */
	void enterPrecedenceLevel(Swift3Parser.PrecedenceLevelContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#precedenceLevel}.
	 * @param ctx the parse tree
	 */
	void exitPrecedenceLevel(Swift3Parser.PrecedenceLevelContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#associativityClause}.
	 * @param ctx the parse tree
	 */
	void enterAssociativityClause(Swift3Parser.AssociativityClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#associativityClause}.
	 * @param ctx the parse tree
	 */
	void exitAssociativityClause(Swift3Parser.AssociativityClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#associativity}.
	 * @param ctx the parse tree
	 */
	void enterAssociativity(Swift3Parser.AssociativityContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#associativity}.
	 * @param ctx the parse tree
	 */
	void exitAssociativity(Swift3Parser.AssociativityContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#pattern}.
	 * @param ctx the parse tree
	 */
	void enterPattern(Swift3Parser.PatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#pattern}.
	 * @param ctx the parse tree
	 */
	void exitPattern(Swift3Parser.PatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#wildcardPattern}.
	 * @param ctx the parse tree
	 */
	void enterWildcardPattern(Swift3Parser.WildcardPatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#wildcardPattern}.
	 * @param ctx the parse tree
	 */
	void exitWildcardPattern(Swift3Parser.WildcardPatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#identifierPattern}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierPattern(Swift3Parser.IdentifierPatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#identifierPattern}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierPattern(Swift3Parser.IdentifierPatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#valueBindingPattern}.
	 * @param ctx the parse tree
	 */
	void enterValueBindingPattern(Swift3Parser.ValueBindingPatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#valueBindingPattern}.
	 * @param ctx the parse tree
	 */
	void exitValueBindingPattern(Swift3Parser.ValueBindingPatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#tuplePattern}.
	 * @param ctx the parse tree
	 */
	void enterTuplePattern(Swift3Parser.TuplePatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#tuplePattern}.
	 * @param ctx the parse tree
	 */
	void exitTuplePattern(Swift3Parser.TuplePatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#tuplePatternElementList}.
	 * @param ctx the parse tree
	 */
	void enterTuplePatternElementList(Swift3Parser.TuplePatternElementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#tuplePatternElementList}.
	 * @param ctx the parse tree
	 */
	void exitTuplePatternElementList(Swift3Parser.TuplePatternElementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#tuplePatternElement}.
	 * @param ctx the parse tree
	 */
	void enterTuplePatternElement(Swift3Parser.TuplePatternElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#tuplePatternElement}.
	 * @param ctx the parse tree
	 */
	void exitTuplePatternElement(Swift3Parser.TuplePatternElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#enumCasePattern}.
	 * @param ctx the parse tree
	 */
	void enterEnumCasePattern(Swift3Parser.EnumCasePatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#enumCasePattern}.
	 * @param ctx the parse tree
	 */
	void exitEnumCasePattern(Swift3Parser.EnumCasePatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#typeCastingPattern}.
	 * @param ctx the parse tree
	 */
	void enterTypeCastingPattern(Swift3Parser.TypeCastingPatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#typeCastingPattern}.
	 * @param ctx the parse tree
	 */
	void exitTypeCastingPattern(Swift3Parser.TypeCastingPatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#isPattern}.
	 * @param ctx the parse tree
	 */
	void enterIsPattern(Swift3Parser.IsPatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#isPattern}.
	 * @param ctx the parse tree
	 */
	void exitIsPattern(Swift3Parser.IsPatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#asPattern}.
	 * @param ctx the parse tree
	 */
	void enterAsPattern(Swift3Parser.AsPatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#asPattern}.
	 * @param ctx the parse tree
	 */
	void exitAsPattern(Swift3Parser.AsPatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#expressionPattern}.
	 * @param ctx the parse tree
	 */
	void enterExpressionPattern(Swift3Parser.ExpressionPatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#expressionPattern}.
	 * @param ctx the parse tree
	 */
	void exitExpressionPattern(Swift3Parser.ExpressionPatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(Swift3Parser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(Swift3Parser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#attributeName}.
	 * @param ctx the parse tree
	 */
	void enterAttributeName(Swift3Parser.AttributeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#attributeName}.
	 * @param ctx the parse tree
	 */
	void exitAttributeName(Swift3Parser.AttributeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#attributeArgumentClause}.
	 * @param ctx the parse tree
	 */
	void enterAttributeArgumentClause(Swift3Parser.AttributeArgumentClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#attributeArgumentClause}.
	 * @param ctx the parse tree
	 */
	void exitAttributeArgumentClause(Swift3Parser.AttributeArgumentClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#attributes}.
	 * @param ctx the parse tree
	 */
	void enterAttributes(Swift3Parser.AttributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#attributes}.
	 * @param ctx the parse tree
	 */
	void exitAttributes(Swift3Parser.AttributesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#balancedTokens}.
	 * @param ctx the parse tree
	 */
	void enterBalancedTokens(Swift3Parser.BalancedTokensContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#balancedTokens}.
	 * @param ctx the parse tree
	 */
	void exitBalancedTokens(Swift3Parser.BalancedTokensContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#balancedToken}.
	 * @param ctx the parse tree
	 */
	void enterBalancedToken(Swift3Parser.BalancedTokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#balancedToken}.
	 * @param ctx the parse tree
	 */
	void exitBalancedToken(Swift3Parser.BalancedTokenContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(Swift3Parser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(Swift3Parser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#prefixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrefixExpression(Swift3Parser.PrefixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#prefixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrefixExpression(Swift3Parser.PrefixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#inOutExpression}.
	 * @param ctx the parse tree
	 */
	void enterInOutExpression(Swift3Parser.InOutExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#inOutExpression}.
	 * @param ctx the parse tree
	 */
	void exitInOutExpression(Swift3Parser.InOutExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#tryOperator}.
	 * @param ctx the parse tree
	 */
	void enterTryOperator(Swift3Parser.TryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#tryOperator}.
	 * @param ctx the parse tree
	 */
	void exitTryOperator(Swift3Parser.TryOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#binaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterBinaryExpression(Swift3Parser.BinaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#binaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitBinaryExpression(Swift3Parser.BinaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(Swift3Parser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(Swift3Parser.AssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#conditionalOperator}.
	 * @param ctx the parse tree
	 */
	void enterConditionalOperator(Swift3Parser.ConditionalOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#conditionalOperator}.
	 * @param ctx the parse tree
	 */
	void exitConditionalOperator(Swift3Parser.ConditionalOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#typeCastingOperator}.
	 * @param ctx the parse tree
	 */
	void enterTypeCastingOperator(Swift3Parser.TypeCastingOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#typeCastingOperator}.
	 * @param ctx the parse tree
	 */
	void exitTypeCastingOperator(Swift3Parser.TypeCastingOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(Swift3Parser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(Swift3Parser.PrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#literalExpression}.
	 * @param ctx the parse tree
	 */
	void enterLiteralExpression(Swift3Parser.LiteralExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#literalExpression}.
	 * @param ctx the parse tree
	 */
	void exitLiteralExpression(Swift3Parser.LiteralExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#arrayLiteral}.
	 * @param ctx the parse tree
	 */
	void enterArrayLiteral(Swift3Parser.ArrayLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#arrayLiteral}.
	 * @param ctx the parse tree
	 */
	void exitArrayLiteral(Swift3Parser.ArrayLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#arrayLiteralItems}.
	 * @param ctx the parse tree
	 */
	void enterArrayLiteralItems(Swift3Parser.ArrayLiteralItemsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#arrayLiteralItems}.
	 * @param ctx the parse tree
	 */
	void exitArrayLiteralItems(Swift3Parser.ArrayLiteralItemsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#arrayLiteralItem}.
	 * @param ctx the parse tree
	 */
	void enterArrayLiteralItem(Swift3Parser.ArrayLiteralItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#arrayLiteralItem}.
	 * @param ctx the parse tree
	 */
	void exitArrayLiteralItem(Swift3Parser.ArrayLiteralItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#dictionaryLiteral}.
	 * @param ctx the parse tree
	 */
	void enterDictionaryLiteral(Swift3Parser.DictionaryLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#dictionaryLiteral}.
	 * @param ctx the parse tree
	 */
	void exitDictionaryLiteral(Swift3Parser.DictionaryLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#dictionaryLiteralItems}.
	 * @param ctx the parse tree
	 */
	void enterDictionaryLiteralItems(Swift3Parser.DictionaryLiteralItemsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#dictionaryLiteralItems}.
	 * @param ctx the parse tree
	 */
	void exitDictionaryLiteralItems(Swift3Parser.DictionaryLiteralItemsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#dictionaryLiteralItem}.
	 * @param ctx the parse tree
	 */
	void enterDictionaryLiteralItem(Swift3Parser.DictionaryLiteralItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#dictionaryLiteralItem}.
	 * @param ctx the parse tree
	 */
	void exitDictionaryLiteralItem(Swift3Parser.DictionaryLiteralItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#selfExpression}.
	 * @param ctx the parse tree
	 */
	void enterSelfExpression(Swift3Parser.SelfExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#selfExpression}.
	 * @param ctx the parse tree
	 */
	void exitSelfExpression(Swift3Parser.SelfExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#superclassExpression}.
	 * @param ctx the parse tree
	 */
	void enterSuperclassExpression(Swift3Parser.SuperclassExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#superclassExpression}.
	 * @param ctx the parse tree
	 */
	void exitSuperclassExpression(Swift3Parser.SuperclassExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#superclassMethodExpression}.
	 * @param ctx the parse tree
	 */
	void enterSuperclassMethodExpression(Swift3Parser.SuperclassMethodExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#superclassMethodExpression}.
	 * @param ctx the parse tree
	 */
	void exitSuperclassMethodExpression(Swift3Parser.SuperclassMethodExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#superclassSubscriptExpression}.
	 * @param ctx the parse tree
	 */
	void enterSuperclassSubscriptExpression(Swift3Parser.SuperclassSubscriptExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#superclassSubscriptExpression}.
	 * @param ctx the parse tree
	 */
	void exitSuperclassSubscriptExpression(Swift3Parser.SuperclassSubscriptExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#superclassInitializerExpression}.
	 * @param ctx the parse tree
	 */
	void enterSuperclassInitializerExpression(Swift3Parser.SuperclassInitializerExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#superclassInitializerExpression}.
	 * @param ctx the parse tree
	 */
	void exitSuperclassInitializerExpression(Swift3Parser.SuperclassInitializerExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#closureExpression}.
	 * @param ctx the parse tree
	 */
	void enterClosureExpression(Swift3Parser.ClosureExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#closureExpression}.
	 * @param ctx the parse tree
	 */
	void exitClosureExpression(Swift3Parser.ClosureExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#closureSignature}.
	 * @param ctx the parse tree
	 */
	void enterClosureSignature(Swift3Parser.ClosureSignatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#closureSignature}.
	 * @param ctx the parse tree
	 */
	void exitClosureSignature(Swift3Parser.ClosureSignatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#closureParameterClause}.
	 * @param ctx the parse tree
	 */
	void enterClosureParameterClause(Swift3Parser.ClosureParameterClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#closureParameterClause}.
	 * @param ctx the parse tree
	 */
	void exitClosureParameterClause(Swift3Parser.ClosureParameterClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#closureParameterList}.
	 * @param ctx the parse tree
	 */
	void enterClosureParameterList(Swift3Parser.ClosureParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#closureParameterList}.
	 * @param ctx the parse tree
	 */
	void exitClosureParameterList(Swift3Parser.ClosureParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#closureParameter}.
	 * @param ctx the parse tree
	 */
	void enterClosureParameter(Swift3Parser.ClosureParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#closureParameter}.
	 * @param ctx the parse tree
	 */
	void exitClosureParameter(Swift3Parser.ClosureParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#closureParameterName}.
	 * @param ctx the parse tree
	 */
	void enterClosureParameterName(Swift3Parser.ClosureParameterNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#closureParameterName}.
	 * @param ctx the parse tree
	 */
	void exitClosureParameterName(Swift3Parser.ClosureParameterNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#captureList}.
	 * @param ctx the parse tree
	 */
	void enterCaptureList(Swift3Parser.CaptureListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#captureList}.
	 * @param ctx the parse tree
	 */
	void exitCaptureList(Swift3Parser.CaptureListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#captureListItems}.
	 * @param ctx the parse tree
	 */
	void enterCaptureListItems(Swift3Parser.CaptureListItemsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#captureListItems}.
	 * @param ctx the parse tree
	 */
	void exitCaptureListItems(Swift3Parser.CaptureListItemsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#captureListItem}.
	 * @param ctx the parse tree
	 */
	void enterCaptureListItem(Swift3Parser.CaptureListItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#captureListItem}.
	 * @param ctx the parse tree
	 */
	void exitCaptureListItem(Swift3Parser.CaptureListItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#captureSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterCaptureSpecifier(Swift3Parser.CaptureSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#captureSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitCaptureSpecifier(Swift3Parser.CaptureSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#implicitMemberExpression}.
	 * @param ctx the parse tree
	 */
	void enterImplicitMemberExpression(Swift3Parser.ImplicitMemberExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#implicitMemberExpression}.
	 * @param ctx the parse tree
	 */
	void exitImplicitMemberExpression(Swift3Parser.ImplicitMemberExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#parenthesizedExpression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedExpression(Swift3Parser.ParenthesizedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#parenthesizedExpression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedExpression(Swift3Parser.ParenthesizedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#expressionElementList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionElementList(Swift3Parser.ExpressionElementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#expressionElementList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionElementList(Swift3Parser.ExpressionElementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#expressionElement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionElement(Swift3Parser.ExpressionElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#expressionElement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionElement(Swift3Parser.ExpressionElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#expressionElementIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterExpressionElementIdentifier(Swift3Parser.ExpressionElementIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#expressionElementIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitExpressionElementIdentifier(Swift3Parser.ExpressionElementIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#wildcardExpression}.
	 * @param ctx the parse tree
	 */
	void enterWildcardExpression(Swift3Parser.WildcardExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#wildcardExpression}.
	 * @param ctx the parse tree
	 */
	void exitWildcardExpression(Swift3Parser.WildcardExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#selectorExpression}.
	 * @param ctx the parse tree
	 */
	void enterSelectorExpression(Swift3Parser.SelectorExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#selectorExpression}.
	 * @param ctx the parse tree
	 */
	void exitSelectorExpression(Swift3Parser.SelectorExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#keyPathExpression}.
	 * @param ctx the parse tree
	 */
	void enterKeyPathExpression(Swift3Parser.KeyPathExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#keyPathExpression}.
	 * @param ctx the parse tree
	 */
	void exitKeyPathExpression(Swift3Parser.KeyPathExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dynamicTypeExpression}
	 * labeled alternative in {@link Swift3Parser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterDynamicTypeExpression(Swift3Parser.DynamicTypeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dynamicTypeExpression}
	 * labeled alternative in {@link Swift3Parser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitDynamicTypeExpression(Swift3Parser.DynamicTypeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCallWithClosureExpression}
	 * labeled alternative in {@link Swift3Parser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallWithClosureExpression(Swift3Parser.FunctionCallWithClosureExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCallWithClosureExpression}
	 * labeled alternative in {@link Swift3Parser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallWithClosureExpression(Swift3Parser.FunctionCallWithClosureExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subscriptExpression}
	 * labeled alternative in {@link Swift3Parser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterSubscriptExpression(Swift3Parser.SubscriptExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subscriptExpression}
	 * labeled alternative in {@link Swift3Parser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitSubscriptExpression(Swift3Parser.SubscriptExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code postfixSelfExpression}
	 * labeled alternative in {@link Swift3Parser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixSelfExpression(Swift3Parser.PostfixSelfExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code postfixSelfExpression}
	 * labeled alternative in {@link Swift3Parser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixSelfExpression(Swift3Parser.PostfixSelfExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code optionalChainingExpression}
	 * labeled alternative in {@link Swift3Parser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterOptionalChainingExpression(Swift3Parser.OptionalChainingExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code optionalChainingExpression}
	 * labeled alternative in {@link Swift3Parser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitOptionalChainingExpression(Swift3Parser.OptionalChainingExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code explicitMemberExpression1}
	 * labeled alternative in {@link Swift3Parser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterExplicitMemberExpression1(Swift3Parser.ExplicitMemberExpression1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code explicitMemberExpression1}
	 * labeled alternative in {@link Swift3Parser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitExplicitMemberExpression1(Swift3Parser.ExplicitMemberExpression1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code postfixOperation}
	 * labeled alternative in {@link Swift3Parser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixOperation(Swift3Parser.PostfixOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code postfixOperation}
	 * labeled alternative in {@link Swift3Parser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixOperation(Swift3Parser.PostfixOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code initializerExpression}
	 * labeled alternative in {@link Swift3Parser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterInitializerExpression(Swift3Parser.InitializerExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code initializerExpression}
	 * labeled alternative in {@link Swift3Parser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitInitializerExpression(Swift3Parser.InitializerExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forcedValueExpression}
	 * labeled alternative in {@link Swift3Parser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterForcedValueExpression(Swift3Parser.ForcedValueExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forcedValueExpression}
	 * labeled alternative in {@link Swift3Parser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitForcedValueExpression(Swift3Parser.ForcedValueExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code explicitMemberExpression3}
	 * labeled alternative in {@link Swift3Parser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterExplicitMemberExpression3(Swift3Parser.ExplicitMemberExpression3Context ctx);
	/**
	 * Exit a parse tree produced by the {@code explicitMemberExpression3}
	 * labeled alternative in {@link Swift3Parser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitExplicitMemberExpression3(Swift3Parser.ExplicitMemberExpression3Context ctx);
	/**
	 * Enter a parse tree produced by the {@code explicitMemberExpression2}
	 * labeled alternative in {@link Swift3Parser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterExplicitMemberExpression2(Swift3Parser.ExplicitMemberExpression2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code explicitMemberExpression2}
	 * labeled alternative in {@link Swift3Parser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitExplicitMemberExpression2(Swift3Parser.ExplicitMemberExpression2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCallExpression}
	 * labeled alternative in {@link Swift3Parser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallExpression(Swift3Parser.FunctionCallExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCallExpression}
	 * labeled alternative in {@link Swift3Parser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallExpression(Swift3Parser.FunctionCallExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code initializerExpressionWithArguments}
	 * labeled alternative in {@link Swift3Parser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterInitializerExpressionWithArguments(Swift3Parser.InitializerExpressionWithArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code initializerExpressionWithArguments}
	 * labeled alternative in {@link Swift3Parser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitInitializerExpressionWithArguments(Swift3Parser.InitializerExpressionWithArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primary}
	 * labeled alternative in {@link Swift3Parser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(Swift3Parser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primary}
	 * labeled alternative in {@link Swift3Parser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(Swift3Parser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#argumentNames}.
	 * @param ctx the parse tree
	 */
	void enterArgumentNames(Swift3Parser.ArgumentNamesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#argumentNames}.
	 * @param ctx the parse tree
	 */
	void exitArgumentNames(Swift3Parser.ArgumentNamesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#argumentName}.
	 * @param ctx the parse tree
	 */
	void enterArgumentName(Swift3Parser.ArgumentNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#argumentName}.
	 * @param ctx the parse tree
	 */
	void exitArgumentName(Swift3Parser.ArgumentNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#operatorHead}.
	 * @param ctx the parse tree
	 */
	void enterOperatorHead(Swift3Parser.OperatorHeadContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#operatorHead}.
	 * @param ctx the parse tree
	 */
	void exitOperatorHead(Swift3Parser.OperatorHeadContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#operatorCharacter}.
	 * @param ctx the parse tree
	 */
	void enterOperatorCharacter(Swift3Parser.OperatorCharacterContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#operatorCharacter}.
	 * @param ctx the parse tree
	 */
	void exitOperatorCharacter(Swift3Parser.OperatorCharacterContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(Swift3Parser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(Swift3Parser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#binaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterBinaryOperator(Swift3Parser.BinaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#binaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitBinaryOperator(Swift3Parser.BinaryOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#prefixOperator}.
	 * @param ctx the parse tree
	 */
	void enterPrefixOperator(Swift3Parser.PrefixOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#prefixOperator}.
	 * @param ctx the parse tree
	 */
	void exitPrefixOperator(Swift3Parser.PrefixOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#postfixOperator}.
	 * @param ctx the parse tree
	 */
	void enterPostfixOperator(Swift3Parser.PostfixOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#postfixOperator}.
	 * @param ctx the parse tree
	 */
	void exitPostfixOperator(Swift3Parser.PostfixOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#sType}.
	 * @param ctx the parse tree
	 */
	void enterSType(Swift3Parser.STypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#sType}.
	 * @param ctx the parse tree
	 */
	void exitSType(Swift3Parser.STypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#arrayType}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(Swift3Parser.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#arrayType}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(Swift3Parser.ArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#dictionaryType}.
	 * @param ctx the parse tree
	 */
	void enterDictionaryType(Swift3Parser.DictionaryTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#dictionaryType}.
	 * @param ctx the parse tree
	 */
	void exitDictionaryType(Swift3Parser.DictionaryTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#optionalType}.
	 * @param ctx the parse tree
	 */
	void enterOptionalType(Swift3Parser.OptionalTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#optionalType}.
	 * @param ctx the parse tree
	 */
	void exitOptionalType(Swift3Parser.OptionalTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#implicitlyUnwrappedOptionalType}.
	 * @param ctx the parse tree
	 */
	void enterImplicitlyUnwrappedOptionalType(Swift3Parser.ImplicitlyUnwrappedOptionalTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#implicitlyUnwrappedOptionalType}.
	 * @param ctx the parse tree
	 */
	void exitImplicitlyUnwrappedOptionalType(Swift3Parser.ImplicitlyUnwrappedOptionalTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#typeAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterTypeAnnotation(Swift3Parser.TypeAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#typeAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitTypeAnnotation(Swift3Parser.TypeAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#typeIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeIdentifier(Swift3Parser.TypeIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#typeIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeIdentifier(Swift3Parser.TypeIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(Swift3Parser.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(Swift3Parser.TypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#tupleType}.
	 * @param ctx the parse tree
	 */
	void enterTupleType(Swift3Parser.TupleTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#tupleType}.
	 * @param ctx the parse tree
	 */
	void exitTupleType(Swift3Parser.TupleTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#tupleTypeBody}.
	 * @param ctx the parse tree
	 */
	void enterTupleTypeBody(Swift3Parser.TupleTypeBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#tupleTypeBody}.
	 * @param ctx the parse tree
	 */
	void exitTupleTypeBody(Swift3Parser.TupleTypeBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#tupleTypeElementList}.
	 * @param ctx the parse tree
	 */
	void enterTupleTypeElementList(Swift3Parser.TupleTypeElementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#tupleTypeElementList}.
	 * @param ctx the parse tree
	 */
	void exitTupleTypeElementList(Swift3Parser.TupleTypeElementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#tupleTypeElement}.
	 * @param ctx the parse tree
	 */
	void enterTupleTypeElement(Swift3Parser.TupleTypeElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#tupleTypeElement}.
	 * @param ctx the parse tree
	 */
	void exitTupleTypeElement(Swift3Parser.TupleTypeElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#elementName}.
	 * @param ctx the parse tree
	 */
	void enterElementName(Swift3Parser.ElementNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#elementName}.
	 * @param ctx the parse tree
	 */
	void exitElementName(Swift3Parser.ElementNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#protocolCompositionType}.
	 * @param ctx the parse tree
	 */
	void enterProtocolCompositionType(Swift3Parser.ProtocolCompositionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#protocolCompositionType}.
	 * @param ctx the parse tree
	 */
	void exitProtocolCompositionType(Swift3Parser.ProtocolCompositionTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#protocolCompositionContinuation}.
	 * @param ctx the parse tree
	 */
	void enterProtocolCompositionContinuation(Swift3Parser.ProtocolCompositionContinuationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#protocolCompositionContinuation}.
	 * @param ctx the parse tree
	 */
	void exitProtocolCompositionContinuation(Swift3Parser.ProtocolCompositionContinuationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#protocolIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterProtocolIdentifier(Swift3Parser.ProtocolIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#protocolIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitProtocolIdentifier(Swift3Parser.ProtocolIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#metatypeType}.
	 * @param ctx the parse tree
	 */
	void enterMetatypeType(Swift3Parser.MetatypeTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#metatypeType}.
	 * @param ctx the parse tree
	 */
	void exitMetatypeType(Swift3Parser.MetatypeTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#typeInheritanceClause}.
	 * @param ctx the parse tree
	 */
	void enterTypeInheritanceClause(Swift3Parser.TypeInheritanceClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#typeInheritanceClause}.
	 * @param ctx the parse tree
	 */
	void exitTypeInheritanceClause(Swift3Parser.TypeInheritanceClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#typeInheritanceList}.
	 * @param ctx the parse tree
	 */
	void enterTypeInheritanceList(Swift3Parser.TypeInheritanceListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#typeInheritanceList}.
	 * @param ctx the parse tree
	 */
	void exitTypeInheritanceList(Swift3Parser.TypeInheritanceListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#classRequirement}.
	 * @param ctx the parse tree
	 */
	void enterClassRequirement(Swift3Parser.ClassRequirementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#classRequirement}.
	 * @param ctx the parse tree
	 */
	void exitClassRequirement(Swift3Parser.ClassRequirementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#compilerControlStatement}.
	 * @param ctx the parse tree
	 */
	void enterCompilerControlStatement(Swift3Parser.CompilerControlStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#compilerControlStatement}.
	 * @param ctx the parse tree
	 */
	void exitCompilerControlStatement(Swift3Parser.CompilerControlStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#conditionalCompilationBlock}.
	 * @param ctx the parse tree
	 */
	void enterConditionalCompilationBlock(Swift3Parser.ConditionalCompilationBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#conditionalCompilationBlock}.
	 * @param ctx the parse tree
	 */
	void exitConditionalCompilationBlock(Swift3Parser.ConditionalCompilationBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#ifDirectiveClause}.
	 * @param ctx the parse tree
	 */
	void enterIfDirectiveClause(Swift3Parser.IfDirectiveClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#ifDirectiveClause}.
	 * @param ctx the parse tree
	 */
	void exitIfDirectiveClause(Swift3Parser.IfDirectiveClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#elseifDirectiveClauses}.
	 * @param ctx the parse tree
	 */
	void enterElseifDirectiveClauses(Swift3Parser.ElseifDirectiveClausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#elseifDirectiveClauses}.
	 * @param ctx the parse tree
	 */
	void exitElseifDirectiveClauses(Swift3Parser.ElseifDirectiveClausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#elseifDirectiveClause}.
	 * @param ctx the parse tree
	 */
	void enterElseifDirectiveClause(Swift3Parser.ElseifDirectiveClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#elseifDirectiveClause}.
	 * @param ctx the parse tree
	 */
	void exitElseifDirectiveClause(Swift3Parser.ElseifDirectiveClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#elseDirectiveClause}.
	 * @param ctx the parse tree
	 */
	void enterElseDirectiveClause(Swift3Parser.ElseDirectiveClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#elseDirectiveClause}.
	 * @param ctx the parse tree
	 */
	void exitElseDirectiveClause(Swift3Parser.ElseDirectiveClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#compilationCondition}.
	 * @param ctx the parse tree
	 */
	void enterCompilationCondition(Swift3Parser.CompilationConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#compilationCondition}.
	 * @param ctx the parse tree
	 */
	void exitCompilationCondition(Swift3Parser.CompilationConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#platformCondition}.
	 * @param ctx the parse tree
	 */
	void enterPlatformCondition(Swift3Parser.PlatformConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#platformCondition}.
	 * @param ctx the parse tree
	 */
	void exitPlatformCondition(Swift3Parser.PlatformConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#operatingSystem}.
	 * @param ctx the parse tree
	 */
	void enterOperatingSystem(Swift3Parser.OperatingSystemContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#operatingSystem}.
	 * @param ctx the parse tree
	 */
	void exitOperatingSystem(Swift3Parser.OperatingSystemContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#architecture}.
	 * @param ctx the parse tree
	 */
	void enterArchitecture(Swift3Parser.ArchitectureContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#architecture}.
	 * @param ctx the parse tree
	 */
	void exitArchitecture(Swift3Parser.ArchitectureContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#swiftVersion}.
	 * @param ctx the parse tree
	 */
	void enterSwiftVersion(Swift3Parser.SwiftVersionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#swiftVersion}.
	 * @param ctx the parse tree
	 */
	void exitSwiftVersion(Swift3Parser.SwiftVersionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#lineControlStatement}.
	 * @param ctx the parse tree
	 */
	void enterLineControlStatement(Swift3Parser.LineControlStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#lineControlStatement}.
	 * @param ctx the parse tree
	 */
	void exitLineControlStatement(Swift3Parser.LineControlStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#lineNumber}.
	 * @param ctx the parse tree
	 */
	void enterLineNumber(Swift3Parser.LineNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#lineNumber}.
	 * @param ctx the parse tree
	 */
	void exitLineNumber(Swift3Parser.LineNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#fileName}.
	 * @param ctx the parse tree
	 */
	void enterFileName(Swift3Parser.FileNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#fileName}.
	 * @param ctx the parse tree
	 */
	void exitFileName(Swift3Parser.FileNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(Swift3Parser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(Swift3Parser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#keyword}.
	 * @param ctx the parse tree
	 */
	void enterKeyword(Swift3Parser.KeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#keyword}.
	 * @param ctx the parse tree
	 */
	void exitKeyword(Swift3Parser.KeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#contextSensitiveKeyword}.
	 * @param ctx the parse tree
	 */
	void enterContextSensitiveKeyword(Swift3Parser.ContextSensitiveKeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#contextSensitiveKeyword}.
	 * @param ctx the parse tree
	 */
	void exitContextSensitiveKeyword(Swift3Parser.ContextSensitiveKeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#identifierList}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierList(Swift3Parser.IdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#identifierList}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierList(Swift3Parser.IdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiteral(Swift3Parser.BooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiteral(Swift3Parser.BooleanLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(Swift3Parser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(Swift3Parser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#numericLiteral}.
	 * @param ctx the parse tree
	 */
	void enterNumericLiteral(Swift3Parser.NumericLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#numericLiteral}.
	 * @param ctx the parse tree
	 */
	void exitNumericLiteral(Swift3Parser.NumericLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift3Parser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void enterIntegerLiteral(Swift3Parser.IntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift3Parser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void exitIntegerLiteral(Swift3Parser.IntegerLiteralContext ctx);
}