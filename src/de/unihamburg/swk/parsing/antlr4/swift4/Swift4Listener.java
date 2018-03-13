package de.unihamburg.swk.parsing.antlr4.swift4;// Generated from Swift4.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Swift4Parser}.
 */
public interface Swift4Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Swift4Parser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(Swift4Parser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift4Parser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(Swift4Parser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift4Parser#globalVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGlobalVariableDeclaration(Swift4Parser.GlobalVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift4Parser#globalVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGlobalVariableDeclaration(Swift4Parser.GlobalVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift4Parser#initializerDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInitializerDeclaration(Swift4Parser.InitializerDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift4Parser#initializerDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInitializerDeclaration(Swift4Parser.InitializerDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift4Parser#initializerHead}.
	 * @param ctx the parse tree
	 */
	void enterInitializerHead(Swift4Parser.InitializerHeadContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift4Parser#initializerHead}.
	 * @param ctx the parse tree
	 */
	void exitInitializerHead(Swift4Parser.InitializerHeadContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift4Parser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(Swift4Parser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift4Parser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(Swift4Parser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift4Parser#functionHead}.
	 * @param ctx the parse tree
	 */
	void enterFunctionHead(Swift4Parser.FunctionHeadContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift4Parser#functionHead}.
	 * @param ctx the parse tree
	 */
	void exitFunctionHead(Swift4Parser.FunctionHeadContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift4Parser#declarationModifiers}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationModifiers(Swift4Parser.DeclarationModifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift4Parser#declarationModifiers}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationModifiers(Swift4Parser.DeclarationModifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift4Parser#declarationModifier}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationModifier(Swift4Parser.DeclarationModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift4Parser#declarationModifier}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationModifier(Swift4Parser.DeclarationModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift4Parser#functionSignature}.
	 * @param ctx the parse tree
	 */
	void enterFunctionSignature(Swift4Parser.FunctionSignatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift4Parser#functionSignature}.
	 * @param ctx the parse tree
	 */
	void exitFunctionSignature(Swift4Parser.FunctionSignatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift4Parser#functionResult}.
	 * @param ctx the parse tree
	 */
	void enterFunctionResult(Swift4Parser.FunctionResultContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift4Parser#functionResult}.
	 * @param ctx the parse tree
	 */
	void exitFunctionResult(Swift4Parser.FunctionResultContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift4Parser#functionBody}.
	 * @param ctx the parse tree
	 */
	void enterFunctionBody(Swift4Parser.FunctionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift4Parser#functionBody}.
	 * @param ctx the parse tree
	 */
	void exitFunctionBody(Swift4Parser.FunctionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift4Parser#codeBlock}.
	 * @param ctx the parse tree
	 */
	void enterCodeBlock(Swift4Parser.CodeBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift4Parser#codeBlock}.
	 * @param ctx the parse tree
	 */
	void exitCodeBlock(Swift4Parser.CodeBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift4Parser#noisyCode}.
	 * @param ctx the parse tree
	 */
	void enterNoisyCode(Swift4Parser.NoisyCodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift4Parser#noisyCode}.
	 * @param ctx the parse tree
	 */
	void exitNoisyCode(Swift4Parser.NoisyCodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift4Parser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(Swift4Parser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift4Parser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(Swift4Parser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift4Parser#genericParameterClause}.
	 * @param ctx the parse tree
	 */
	void enterGenericParameterClause(Swift4Parser.GenericParameterClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift4Parser#genericParameterClause}.
	 * @param ctx the parse tree
	 */
	void exitGenericParameterClause(Swift4Parser.GenericParameterClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift4Parser#genericParameters}.
	 * @param ctx the parse tree
	 */
	void enterGenericParameters(Swift4Parser.GenericParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift4Parser#genericParameters}.
	 * @param ctx the parse tree
	 */
	void exitGenericParameters(Swift4Parser.GenericParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift4Parser#genericParameter}.
	 * @param ctx the parse tree
	 */
	void enterGenericParameter(Swift4Parser.GenericParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift4Parser#genericParameter}.
	 * @param ctx the parse tree
	 */
	void exitGenericParameter(Swift4Parser.GenericParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift4Parser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(Swift4Parser.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift4Parser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(Swift4Parser.TypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift4Parser#typeidentifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeidentifier(Swift4Parser.TypeidentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift4Parser#typeidentifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeidentifier(Swift4Parser.TypeidentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift4Parser#parameterClause}.
	 * @param ctx the parse tree
	 */
	void enterParameterClause(Swift4Parser.ParameterClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift4Parser#parameterClause}.
	 * @param ctx the parse tree
	 */
	void exitParameterClause(Swift4Parser.ParameterClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift4Parser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(Swift4Parser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift4Parser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(Swift4Parser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift4Parser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(Swift4Parser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift4Parser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(Swift4Parser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift4Parser#defaultParamInitializer}.
	 * @param ctx the parse tree
	 */
	void enterDefaultParamInitializer(Swift4Parser.DefaultParamInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift4Parser#defaultParamInitializer}.
	 * @param ctx the parse tree
	 */
	void exitDefaultParamInitializer(Swift4Parser.DefaultParamInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift4Parser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(Swift4Parser.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift4Parser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(Swift4Parser.VariableInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift4Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(Swift4Parser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift4Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(Swift4Parser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift4Parser#constructorCall}.
	 * @param ctx the parse tree
	 */
	void enterConstructorCall(Swift4Parser.ConstructorCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift4Parser#constructorCall}.
	 * @param ctx the parse tree
	 */
	void exitConstructorCall(Swift4Parser.ConstructorCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift4Parser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(Swift4Parser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift4Parser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(Swift4Parser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift4Parser#dictionaryType}.
	 * @param ctx the parse tree
	 */
	void enterDictionaryType(Swift4Parser.DictionaryTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift4Parser#dictionaryType}.
	 * @param ctx the parse tree
	 */
	void exitDictionaryType(Swift4Parser.DictionaryTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift4Parser#functionType}.
	 * @param ctx the parse tree
	 */
	void enterFunctionType(Swift4Parser.FunctionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift4Parser#functionType}.
	 * @param ctx the parse tree
	 */
	void exitFunctionType(Swift4Parser.FunctionTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift4Parser#functionTypeArgumentClause}.
	 * @param ctx the parse tree
	 */
	void enterFunctionTypeArgumentClause(Swift4Parser.FunctionTypeArgumentClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift4Parser#functionTypeArgumentClause}.
	 * @param ctx the parse tree
	 */
	void exitFunctionTypeArgumentClause(Swift4Parser.FunctionTypeArgumentClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift4Parser#functionTypeArguments}.
	 * @param ctx the parse tree
	 */
	void enterFunctionTypeArguments(Swift4Parser.FunctionTypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift4Parser#functionTypeArguments}.
	 * @param ctx the parse tree
	 */
	void exitFunctionTypeArguments(Swift4Parser.FunctionTypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift4Parser#functionTypeArgument}.
	 * @param ctx the parse tree
	 */
	void enterFunctionTypeArgument(Swift4Parser.FunctionTypeArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift4Parser#functionTypeArgument}.
	 * @param ctx the parse tree
	 */
	void exitFunctionTypeArgument(Swift4Parser.FunctionTypeArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift4Parser#tupleType}.
	 * @param ctx the parse tree
	 */
	void enterTupleType(Swift4Parser.TupleTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift4Parser#tupleType}.
	 * @param ctx the parse tree
	 */
	void exitTupleType(Swift4Parser.TupleTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift4Parser#tupleElements}.
	 * @param ctx the parse tree
	 */
	void enterTupleElements(Swift4Parser.TupleElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift4Parser#tupleElements}.
	 * @param ctx the parse tree
	 */
	void exitTupleElements(Swift4Parser.TupleElementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift4Parser#tupleElement}.
	 * @param ctx the parse tree
	 */
	void enterTupleElement(Swift4Parser.TupleElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift4Parser#tupleElement}.
	 * @param ctx the parse tree
	 */
	void exitTupleElement(Swift4Parser.TupleElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift4Parser#externalParametername}.
	 * @param ctx the parse tree
	 */
	void enterExternalParametername(Swift4Parser.ExternalParameternameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift4Parser#externalParametername}.
	 * @param ctx the parse tree
	 */
	void exitExternalParametername(Swift4Parser.ExternalParameternameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift4Parser#localParameterName}.
	 * @param ctx the parse tree
	 */
	void enterLocalParameterName(Swift4Parser.LocalParameterNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift4Parser#localParameterName}.
	 * @param ctx the parse tree
	 */
	void exitLocalParameterName(Swift4Parser.LocalParameterNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift4Parser#attributes}.
	 * @param ctx the parse tree
	 */
	void enterAttributes(Swift4Parser.AttributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift4Parser#attributes}.
	 * @param ctx the parse tree
	 */
	void exitAttributes(Swift4Parser.AttributesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift4Parser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(Swift4Parser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift4Parser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(Swift4Parser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift4Parser#attributeArgumentsClause}.
	 * @param ctx the parse tree
	 */
	void enterAttributeArgumentsClause(Swift4Parser.AttributeArgumentsClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift4Parser#attributeArgumentsClause}.
	 * @param ctx the parse tree
	 */
	void exitAttributeArgumentsClause(Swift4Parser.AttributeArgumentsClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift4Parser#balancedTokens}.
	 * @param ctx the parse tree
	 */
	void enterBalancedTokens(Swift4Parser.BalancedTokensContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift4Parser#balancedTokens}.
	 * @param ctx the parse tree
	 */
	void exitBalancedTokens(Swift4Parser.BalancedTokensContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift4Parser#balancedToken}.
	 * @param ctx the parse tree
	 */
	void enterBalancedToken(Swift4Parser.BalancedTokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift4Parser#balancedToken}.
	 * @param ctx the parse tree
	 */
	void exitBalancedToken(Swift4Parser.BalancedTokenContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift4Parser#typeDefinition}.
	 * @param ctx the parse tree
	 */
	void enterTypeDefinition(Swift4Parser.TypeDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift4Parser#typeDefinition}.
	 * @param ctx the parse tree
	 */
	void exitTypeDefinition(Swift4Parser.TypeDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift4Parser#extensionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterExtensionDefinition(Swift4Parser.ExtensionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift4Parser#extensionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitExtensionDefinition(Swift4Parser.ExtensionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift4Parser#protocolDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterProtocolDeclaration(Swift4Parser.ProtocolDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift4Parser#protocolDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitProtocolDeclaration(Swift4Parser.ProtocolDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift4Parser#structDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStructDeclaration(Swift4Parser.StructDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift4Parser#structDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStructDeclaration(Swift4Parser.StructDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift4Parser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEnumDeclaration(Swift4Parser.EnumDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift4Parser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEnumDeclaration(Swift4Parser.EnumDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift4Parser#rawValueStyleEnum}.
	 * @param ctx the parse tree
	 */
	void enterRawValueStyleEnum(Swift4Parser.RawValueStyleEnumContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift4Parser#rawValueStyleEnum}.
	 * @param ctx the parse tree
	 */
	void exitRawValueStyleEnum(Swift4Parser.RawValueStyleEnumContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift4Parser#rawValueStyleEnumMembers}.
	 * @param ctx the parse tree
	 */
	void enterRawValueStyleEnumMembers(Swift4Parser.RawValueStyleEnumMembersContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift4Parser#rawValueStyleEnumMembers}.
	 * @param ctx the parse tree
	 */
	void exitRawValueStyleEnumMembers(Swift4Parser.RawValueStyleEnumMembersContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift4Parser#rawValueStyleEnumMember}.
	 * @param ctx the parse tree
	 */
	void enterRawValueStyleEnumMember(Swift4Parser.RawValueStyleEnumMemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift4Parser#rawValueStyleEnumMember}.
	 * @param ctx the parse tree
	 */
	void exitRawValueStyleEnumMember(Swift4Parser.RawValueStyleEnumMemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift4Parser#rawValueEnumCaseList}.
	 * @param ctx the parse tree
	 */
	void enterRawValueEnumCaseList(Swift4Parser.RawValueEnumCaseListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift4Parser#rawValueEnumCaseList}.
	 * @param ctx the parse tree
	 */
	void exitRawValueEnumCaseList(Swift4Parser.RawValueEnumCaseListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift4Parser#rawValueEnumCase}.
	 * @param ctx the parse tree
	 */
	void enterRawValueEnumCase(Swift4Parser.RawValueEnumCaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift4Parser#rawValueEnumCase}.
	 * @param ctx the parse tree
	 */
	void exitRawValueEnumCase(Swift4Parser.RawValueEnumCaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift4Parser#unionStyleEnum}.
	 * @param ctx the parse tree
	 */
	void enterUnionStyleEnum(Swift4Parser.UnionStyleEnumContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift4Parser#unionStyleEnum}.
	 * @param ctx the parse tree
	 */
	void exitUnionStyleEnum(Swift4Parser.UnionStyleEnumContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift4Parser#unionStyleEnumMembers}.
	 * @param ctx the parse tree
	 */
	void enterUnionStyleEnumMembers(Swift4Parser.UnionStyleEnumMembersContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift4Parser#unionStyleEnumMembers}.
	 * @param ctx the parse tree
	 */
	void exitUnionStyleEnumMembers(Swift4Parser.UnionStyleEnumMembersContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift4Parser#unionStyleEnumMember}.
	 * @param ctx the parse tree
	 */
	void enterUnionStyleEnumMember(Swift4Parser.UnionStyleEnumMemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift4Parser#unionStyleEnumMember}.
	 * @param ctx the parse tree
	 */
	void exitUnionStyleEnumMember(Swift4Parser.UnionStyleEnumMemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift4Parser#caseClause}.
	 * @param ctx the parse tree
	 */
	void enterCaseClause(Swift4Parser.CaseClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift4Parser#caseClause}.
	 * @param ctx the parse tree
	 */
	void exitCaseClause(Swift4Parser.CaseClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift4Parser#enumCaseList}.
	 * @param ctx the parse tree
	 */
	void enterEnumCaseList(Swift4Parser.EnumCaseListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift4Parser#enumCaseList}.
	 * @param ctx the parse tree
	 */
	void exitEnumCaseList(Swift4Parser.EnumCaseListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift4Parser#enumCase}.
	 * @param ctx the parse tree
	 */
	void enterEnumCase(Swift4Parser.EnumCaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift4Parser#enumCase}.
	 * @param ctx the parse tree
	 */
	void exitEnumCase(Swift4Parser.EnumCaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift4Parser#importStatement}.
	 * @param ctx the parse tree
	 */
	void enterImportStatement(Swift4Parser.ImportStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift4Parser#importStatement}.
	 * @param ctx the parse tree
	 */
	void exitImportStatement(Swift4Parser.ImportStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift4Parser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(Swift4Parser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift4Parser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(Swift4Parser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift4Parser#typeInheritanceClause}.
	 * @param ctx the parse tree
	 */
	void enterTypeInheritanceClause(Swift4Parser.TypeInheritanceClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift4Parser#typeInheritanceClause}.
	 * @param ctx the parse tree
	 */
	void exitTypeInheritanceClause(Swift4Parser.TypeInheritanceClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift4Parser#typeInheritances}.
	 * @param ctx the parse tree
	 */
	void enterTypeInheritances(Swift4Parser.TypeInheritancesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift4Parser#typeInheritances}.
	 * @param ctx the parse tree
	 */
	void exitTypeInheritances(Swift4Parser.TypeInheritancesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift4Parser#typeBody}.
	 * @param ctx the parse tree
	 */
	void enterTypeBody(Swift4Parser.TypeBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift4Parser#typeBody}.
	 * @param ctx the parse tree
	 */
	void exitTypeBody(Swift4Parser.TypeBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift4Parser#noise}.
	 * @param ctx the parse tree
	 */
	void enterNoise(Swift4Parser.NoiseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift4Parser#noise}.
	 * @param ctx the parse tree
	 */
	void exitNoise(Swift4Parser.NoiseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift4Parser#typeVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeVariableDeclaration(Swift4Parser.TypeVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift4Parser#typeVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeVariableDeclaration(Swift4Parser.TypeVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift4Parser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(Swift4Parser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift4Parser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(Swift4Parser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift4Parser#keywordNoise}.
	 * @param ctx the parse tree
	 */
	void enterKeywordNoise(Swift4Parser.KeywordNoiseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift4Parser#keywordNoise}.
	 * @param ctx the parse tree
	 */
	void exitKeywordNoise(Swift4Parser.KeywordNoiseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift4Parser#specialCharacter}.
	 * @param ctx the parse tree
	 */
	void enterSpecialCharacter(Swift4Parser.SpecialCharacterContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift4Parser#specialCharacter}.
	 * @param ctx the parse tree
	 */
	void exitSpecialCharacter(Swift4Parser.SpecialCharacterContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift4Parser#accessModifier}.
	 * @param ctx the parse tree
	 */
	void enterAccessModifier(Swift4Parser.AccessModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift4Parser#accessModifier}.
	 * @param ctx the parse tree
	 */
	void exitAccessModifier(Swift4Parser.AccessModifierContext ctx);
}