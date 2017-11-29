// Generated from Swift3.g4 by ANTLR 4.7
package de.unihamburg.swk.parsing.antlr4.swift3;


import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Swift3Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, T__61=62, T__62=63, T__63=64, T__64=65, T__65=66, 
		T__66=67, T__67=68, T__68=69, T__69=70, T__70=71, T__71=72, T__72=73, 
		T__73=74, T__74=75, T__75=76, T__76=77, T__77=78, T__78=79, T__79=80, 
		T__80=81, T__81=82, T__82=83, T__83=84, T__84=85, T__85=86, T__86=87, 
		T__87=88, T__88=89, T__89=90, T__90=91, T__91=92, T__92=93, T__93=94, 
		T__94=95, T__95=96, T__96=97, T__97=98, T__98=99, T__99=100, T__100=101, 
		T__101=102, T__102=103, T__103=104, T__104=105, T__105=106, T__106=107, 
		T__107=108, T__108=109, T__109=110, T__110=111, T__111=112, T__112=113, 
		T__113=114, T__114=115, T__115=116, T__116=117, T__117=118, T__118=119, 
		T__119=120, T__120=121, T__121=122, T__122=123, T__123=124, T__124=125, 
		T__125=126, T__126=127, T__127=128, T__128=129, T__129=130, T__130=131, 
		T__131=132, T__132=133, T__133=134, T__134=135, T__135=136, T__136=137, 
		T__137=138, T__138=139, T__139=140, T__140=141, T__141=142, T__142=143, 
		T__143=144, T__144=145, T__145=146, T__146=147, BooleanLiteral=148, NilLiteral=149, 
		OperatorHead=150, OperatorCharacter=151, DotOperatorHead=152, Identifier=153, 
		ImplicitParameterName=154, BinaryLiteral=155, OctalLiteral=156, DecimalLiteral=157, 
		HexadecimalLiteral=158, FloatingPointLiteral=159, VersionLiteral=160, 
		StringLiteral=161, EscapedCharacter=162, WS=163, BlockComment=164, LineComment=165;
	public static final int
		RULE_topLevel = 0, RULE_statement = 1, RULE_promiseKitExpression = 2, 
		RULE_promiseKitSuffix = 3, RULE_statements = 4, RULE_loopStatement = 5, 
		RULE_forInStatement = 6, RULE_whileStatement = 7, RULE_repeatWhileStatement = 8, 
		RULE_branchStatement = 9, RULE_ifStatement = 10, RULE_elseClause = 11, 
		RULE_guardStatement = 12, RULE_switchStatement = 13, RULE_switchCases = 14, 
		RULE_switchCase = 15, RULE_caseLabel = 16, RULE_caseItemList = 17, RULE_caseItem = 18, 
		RULE_defaultLabel = 19, RULE_labeledStatement = 20, RULE_statementLabel = 21, 
		RULE_labelName = 22, RULE_controlTransferStatement = 23, RULE_breakStatement = 24, 
		RULE_continueStatement = 25, RULE_fallthroughStatement = 26, RULE_returnStatement = 27, 
		RULE_throwStatement = 28, RULE_deferStatement = 29, RULE_doStatement = 30, 
		RULE_catchClauses = 31, RULE_catchClause = 32, RULE_conditionList = 33, 
		RULE_condition = 34, RULE_caseCondition = 35, RULE_optionalBindingCondition = 36, 
		RULE_whereClause = 37, RULE_whereExpression = 38, RULE_availabilityCondition = 39, 
		RULE_availabilityArguments = 40, RULE_availabilityArgument = 41, RULE_platformName = 42, 
		RULE_platformVersion = 43, RULE_genericParameterClause = 44, RULE_genericParameterList = 45, 
		RULE_genericParameter = 46, RULE_requirementClause = 47, RULE_requirementList = 48, 
		RULE_requirement = 49, RULE_conformanceRequirement = 50, RULE_sameTypeRequirement = 51, 
		RULE_genericArgumentClause = 52, RULE_genericArgumentList = 53, RULE_genericArgument = 54, 
		RULE_declaration = 55, RULE_declarations = 56, RULE_declarationModifiers = 57, 
		RULE_declarationModifier = 58, RULE_accessLevelModifier = 59, RULE_accessLevelModifiers = 60, 
		RULE_codeBlock = 61, RULE_importDeclaration = 62, RULE_importKind = 63, 
		RULE_importPath = 64, RULE_importPathIdentifier = 65, RULE_constantDeclaration = 66, 
		RULE_patternInitializerList = 67, RULE_patternInitializer = 68, RULE_initializer = 69, 
		RULE_variableDeclaration = 70, RULE_variableDeclarationHead = 71, RULE_variableName = 72, 
		RULE_getterSetterBlock = 73, RULE_getterClause = 74, RULE_setterClause = 75, 
		RULE_setterName = 76, RULE_getterSetterKeywordBlock = 77, RULE_getterKeywordClause = 78, 
		RULE_setterKeywordClause = 79, RULE_willSetDidSetBlock = 80, RULE_willSetClause = 81, 
		RULE_didSetClause = 82, RULE_typealiasDeclaration = 83, RULE_typealiasHead = 84, 
		RULE_typealiasName = 85, RULE_typealiasAssignment = 86, RULE_functionDeclaration = 87, 
		RULE_functionHead = 88, RULE_functionName = 89, RULE_functionSignature = 90, 
		RULE_functionResult = 91, RULE_functionBody = 92, RULE_parameterClause = 93, 
		RULE_parameterList = 94, RULE_parameter = 95, RULE_externalParameterName = 96, 
		RULE_localParameterName = 97, RULE_defaultArgumentClause = 98, RULE_enumDeclaration = 99, 
		RULE_enumDef = 100, RULE_unionStyleEnum = 101, RULE_unionStyleEnumMembers = 102, 
		RULE_unionStyleEnumMember = 103, RULE_unionStyleEnumCaseClause = 104, 
		RULE_unionStyleEnumCaseList = 105, RULE_unionStyleEnumCase = 106, RULE_enumName = 107, 
		RULE_enumCaseName = 108, RULE_rawValueStyleEnum = 109, RULE_rawValueStyleEnumMembers = 110, 
		RULE_rawValueStyleEnumMember = 111, RULE_rawValueStyleEnumCaseClause = 112, 
		RULE_rawValueStyleEnumCaseList = 113, RULE_rawValueStyleEnumCase = 114, 
		RULE_rawValueAssignment = 115, RULE_structDeclaration = 116, RULE_structName = 117, 
		RULE_structBody = 118, RULE_classDeclaration = 119, RULE_classDeclarationModifiers = 120, 
		RULE_className = 121, RULE_classBody = 122, RULE_protocolDeclaration = 123, 
		RULE_protocolName = 124, RULE_protocolBody = 125, RULE_protocolMemberDeclaration = 126, 
		RULE_protocolMemberDeclarations = 127, RULE_protocolPropertyDeclaration = 128, 
		RULE_protocolMethodDeclaration = 129, RULE_protocolInitializerDeclaration = 130, 
		RULE_protocolSubscriptDeclaration = 131, RULE_protocolAssociatedTypeDeclaration = 132, 
		RULE_initializerDeclaration = 133, RULE_initializerHead = 134, RULE_initializerBody = 135, 
		RULE_deinitializerDeclaration = 136, RULE_extensionDeclaration = 137, 
		RULE_extensionBody = 138, RULE_subscriptDeclaration = 139, RULE_subscriptHead = 140, 
		RULE_subscriptResult = 141, RULE_operatorDeclaration = 142, RULE_prefixOperatorDeclaration = 143, 
		RULE_postfixOperatorDeclaration = 144, RULE_infixOperatorDeclaration = 145, 
		RULE_infixOperatorAttributes = 146, RULE_precedenceClause = 147, RULE_precedenceLevel = 148, 
		RULE_associativityClause = 149, RULE_associativity = 150, RULE_pattern = 151, 
		RULE_wildcardPattern = 152, RULE_identifierPattern = 153, RULE_valueBindingPattern = 154, 
		RULE_tuplePattern = 155, RULE_tuplePatternElementList = 156, RULE_tuplePatternElement = 157, 
		RULE_enumCasePattern = 158, RULE_typeCastingPattern = 159, RULE_isPattern = 160, 
		RULE_asPattern = 161, RULE_expressionPattern = 162, RULE_attribute = 163, 
		RULE_attributeName = 164, RULE_attributeArgumentClause = 165, RULE_attributes = 166, 
		RULE_balancedTokens = 167, RULE_balancedToken = 168, RULE_expression = 169, 
		RULE_prefixExpression = 170, RULE_inOutExpression = 171, RULE_tryOperator = 172, 
		RULE_binaryExpression = 173, RULE_assignmentOperator = 174, RULE_conditionalOperator = 175, 
		RULE_typeCastingOperator = 176, RULE_primaryExpression = 177, RULE_literalExpression = 178, 
		RULE_arrayLiteral = 179, RULE_arrayLiteralItems = 180, RULE_arrayLiteralItem = 181, 
		RULE_dictionaryLiteral = 182, RULE_dictionaryLiteralItems = 183, RULE_dictionaryLiteralItem = 184, 
		RULE_selfExpression = 185, RULE_superclassExpression = 186, RULE_superclassMethodExpression = 187, 
		RULE_superclassSubscriptExpression = 188, RULE_superclassInitializerExpression = 189, 
		RULE_closureExpression = 190, RULE_closureSignature = 191, RULE_closureParameterClause = 192, 
		RULE_closureParameterList = 193, RULE_closureParameter = 194, RULE_closureParameterName = 195, 
		RULE_captureList = 196, RULE_captureListItems = 197, RULE_captureListItem = 198, 
		RULE_captureSpecifier = 199, RULE_implicitMemberExpression = 200, RULE_parenthesizedExpression = 201, 
		RULE_expressionElementList = 202, RULE_expressionElement = 203, RULE_expressionElementIdentifier = 204, 
		RULE_wildcardExpression = 205, RULE_selectorExpression = 206, RULE_keyPathExpression = 207, 
		RULE_postfixExpression = 208, RULE_argumentNames = 209, RULE_argumentName = 210, 
		RULE_operatorHead = 211, RULE_operatorCharacter = 212, RULE_operator = 213, 
		RULE_binaryOperator = 214, RULE_prefixOperator = 215, RULE_postfixOperator = 216, 
		RULE_sType = 217, RULE_arrayType = 218, RULE_dictionaryType = 219, RULE_optionalType = 220, 
		RULE_implicitlyUnwrappedOptionalType = 221, RULE_typeAnnotation = 222, 
		RULE_typeIdentifier = 223, RULE_typeName = 224, RULE_tupleType = 225, 
		RULE_tupleTypeBody = 226, RULE_tupleTypeElementList = 227, RULE_tupleTypeElement = 228, 
		RULE_elementName = 229, RULE_protocolCompositionType = 230, RULE_protocolCompositionContinuation = 231, 
		RULE_protocolIdentifier = 232, RULE_metatypeType = 233, RULE_typeInheritanceClause = 234, 
		RULE_typeInheritanceList = 235, RULE_classRequirement = 236, RULE_compilerControlStatement = 237, 
		RULE_conditionalCompilationBlock = 238, RULE_ifDirectiveClause = 239, 
		RULE_elseifDirectiveClauses = 240, RULE_elseifDirectiveClause = 241, RULE_elseDirectiveClause = 242, 
		RULE_compilationCondition = 243, RULE_platformCondition = 244, RULE_operatingSystem = 245, 
		RULE_architecture = 246, RULE_swiftVersion = 247, RULE_lineControlStatement = 248, 
		RULE_lineNumber = 249, RULE_fileName = 250, RULE_identifier = 251, RULE_keyword = 252, 
		RULE_contextSensitiveKeyword = 253, RULE_identifierList = 254, RULE_booleanLiteral = 255, 
		RULE_literal = 256, RULE_numericLiteral = 257, RULE_integerLiteral = 258;
	public static final String[] ruleNames = {
		"topLevel", "statement", "promiseKitExpression", "promiseKitSuffix", "statements", 
		"loopStatement", "forInStatement", "whileStatement", "repeatWhileStatement", 
		"branchStatement", "ifStatement", "elseClause", "guardStatement", "switchStatement", 
		"switchCases", "switchCase", "caseLabel", "caseItemList", "caseItem", 
		"defaultLabel", "labeledStatement", "statementLabel", "labelName", "controlTransferStatement", 
		"breakStatement", "continueStatement", "fallthroughStatement", "returnStatement", 
		"throwStatement", "deferStatement", "doStatement", "catchClauses", "catchClause", 
		"conditionList", "condition", "caseCondition", "optionalBindingCondition", 
		"whereClause", "whereExpression", "availabilityCondition", "availabilityArguments", 
		"availabilityArgument", "platformName", "platformVersion", "genericParameterClause", 
		"genericParameterList", "genericParameter", "requirementClause", "requirementList", 
		"requirement", "conformanceRequirement", "sameTypeRequirement", "genericArgumentClause", 
		"genericArgumentList", "genericArgument", "declaration", "declarations", 
		"declarationModifiers", "declarationModifier", "accessLevelModifier", 
		"accessLevelModifiers", "codeBlock", "importDeclaration", "importKind", 
		"importPath", "importPathIdentifier", "constantDeclaration", "patternInitializerList", 
		"patternInitializer", "initializer", "variableDeclaration", "variableDeclarationHead", 
		"variableName", "getterSetterBlock", "getterClause", "setterClause", "setterName", 
		"getterSetterKeywordBlock", "getterKeywordClause", "setterKeywordClause", 
		"willSetDidSetBlock", "willSetClause", "didSetClause", "typealiasDeclaration", 
		"typealiasHead", "typealiasName", "typealiasAssignment", "functionDeclaration", 
		"functionHead", "functionName", "functionSignature", "functionResult", 
		"functionBody", "parameterClause", "parameterList", "parameter", "externalParameterName", 
		"localParameterName", "defaultArgumentClause", "enumDeclaration", "enumDef", 
		"unionStyleEnum", "unionStyleEnumMembers", "unionStyleEnumMember", "unionStyleEnumCaseClause", 
		"unionStyleEnumCaseList", "unionStyleEnumCase", "enumName", "enumCaseName", 
		"rawValueStyleEnum", "rawValueStyleEnumMembers", "rawValueStyleEnumMember", 
		"rawValueStyleEnumCaseClause", "rawValueStyleEnumCaseList", "rawValueStyleEnumCase", 
		"rawValueAssignment", "structDeclaration", "structName", "structBody", 
		"classDeclaration", "classDeclarationModifiers", "className", "classBody", 
		"protocolDeclaration", "protocolName", "protocolBody", "protocolMemberDeclaration", 
		"protocolMemberDeclarations", "protocolPropertyDeclaration", "protocolMethodDeclaration", 
		"protocolInitializerDeclaration", "protocolSubscriptDeclaration", "protocolAssociatedTypeDeclaration", 
		"initializerDeclaration", "initializerHead", "initializerBody", "deinitializerDeclaration", 
		"extensionDeclaration", "extensionBody", "subscriptDeclaration", "subscriptHead", 
		"subscriptResult", "operatorDeclaration", "prefixOperatorDeclaration", 
		"postfixOperatorDeclaration", "infixOperatorDeclaration", "infixOperatorAttributes", 
		"precedenceClause", "precedenceLevel", "associativityClause", "associativity", 
		"pattern", "wildcardPattern", "identifierPattern", "valueBindingPattern", 
		"tuplePattern", "tuplePatternElementList", "tuplePatternElement", "enumCasePattern", 
		"typeCastingPattern", "isPattern", "asPattern", "expressionPattern", "attribute", 
		"attributeName", "attributeArgumentClause", "attributes", "balancedTokens", 
		"balancedToken", "expression", "prefixExpression", "inOutExpression", 
		"tryOperator", "binaryExpression", "assignmentOperator", "conditionalOperator", 
		"typeCastingOperator", "primaryExpression", "literalExpression", "arrayLiteral", 
		"arrayLiteralItems", "arrayLiteralItem", "dictionaryLiteral", "dictionaryLiteralItems", 
		"dictionaryLiteralItem", "selfExpression", "superclassExpression", "superclassMethodExpression", 
		"superclassSubscriptExpression", "superclassInitializerExpression", "closureExpression", 
		"closureSignature", "closureParameterClause", "closureParameterList", 
		"closureParameter", "closureParameterName", "captureList", "captureListItems", 
		"captureListItem", "captureSpecifier", "implicitMemberExpression", "parenthesizedExpression", 
		"expressionElementList", "expressionElement", "expressionElementIdentifier", 
		"wildcardExpression", "selectorExpression", "keyPathExpression", "postfixExpression", 
		"argumentNames", "argumentName", "operatorHead", "operatorCharacter", 
		"operator", "binaryOperator", "prefixOperator", "postfixOperator", "sType", 
		"arrayType", "dictionaryType", "optionalType", "implicitlyUnwrappedOptionalType", 
		"typeAnnotation", "typeIdentifier", "typeName", "tupleType", "tupleTypeBody", 
		"tupleTypeElementList", "tupleTypeElement", "elementName", "protocolCompositionType", 
		"protocolCompositionContinuation", "protocolIdentifier", "metatypeType", 
		"typeInheritanceClause", "typeInheritanceList", "classRequirement", "compilerControlStatement", 
		"conditionalCompilationBlock", "ifDirectiveClause", "elseifDirectiveClauses", 
		"elseifDirectiveClause", "elseDirectiveClause", "compilationCondition", 
		"platformCondition", "operatingSystem", "architecture", "swiftVersion", 
		"lineControlStatement", "lineNumber", "fileName", "identifier", "keyword", 
		"contextSensitiveKeyword", "identifierList", "booleanLiteral", "literal", 
		"numericLiteral", "integerLiteral"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "':'", "'.'", "'then'", "'always'", "'catch'", "'for'", "'case'", 
		"'in'", "'while'", "'repeat'", "'if'", "'else'", "'guard'", "'switch'", 
		"'{'", "'}'", "','", "'default'", "'break'", "'continue'", "'fallthrough'", 
		"'return'", "'throw'", "'defer'", "'do'", "'let'", "'var'", "'where'", 
		"'#available'", "'('", "')'", "'*'", "'iOS'", "'iOSApplicationExtension'", 
		"'OSX'", "'OSXApplicationExtension'", "'watchOS'", "'watchOSApplicationExtension'", 
		"'tvOS'", "'tvOSApplicationExtension'", "'<'", "'>'", "'=='", "'class'", 
		"'convenience'", "'dynamic'", "'final'", "'infix'", "'lazy'", "'mutating'", 
		"'nonmutating'", "'optional'", "'override'", "'postfix'", "'prefix'", 
		"'required'", "'static'", "'unowned'", "'safe'", "'unsafe'", "'weak'", 
		"'private'", "'set'", "'fileprivate'", "'internal'", "'public'", "'open'", 
		"'import'", "'typealias'", "'struct'", "'enum'", "'protocol'", "'func'", 
		"'='", "'get'", "'willSet'", "'didSet'", "'throws'", "'rethrows'", "'->'", 
		"'...'", "'_'", "'indirect'", "'associatedtype'", "'init'", "'?'", "'!'", 
		"'deinit'", "'extension'", "'subscript'", "'operator'", "'precedence'", 
		"'associativity'", "'left'", "'right'", "'none'", "'is'", "'as'", "'@'", 
		"'['", "']'", "'-'", "'''", "'/'", "'\"'", "'&'", "'try'", "'#file'", 
		"'#line'", "'#column'", "'#function'", "'self'", "'super'", "'unowned(safe)'", 
		"'unowned(unsafe)'", "'#selector'", "'getter:'", "'setter:'", "'#keyPath'", 
		"'dynamicType'", "'&&'", "'||'", "'>='", "'Type'", "'Protocol'", "'Any'", 
		"'Self'", "'inout'", "'#endif'", "'#if'", "'#elseif'", "'#else'", "'os'", 
		"'arch'", "'swift'", "'i386'", "'x86_64'", "'arm'", "'arm64'", "'#sourceLocation'", 
		"'file'", "'line'", "'#colorLiteral'", "'fileLiteral'", "'imageLiteral'", 
		"'OSXApplicationExtension\u00C2\u00AD'", null, "'nil'", null, null, "'..'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "BooleanLiteral", "NilLiteral", "OperatorHead", 
		"OperatorCharacter", "DotOperatorHead", "Identifier", "ImplicitParameterName", 
		"BinaryLiteral", "OctalLiteral", "DecimalLiteral", "HexadecimalLiteral", 
		"FloatingPointLiteral", "VersionLiteral", "StringLiteral", "EscapedCharacter", 
		"WS", "BlockComment", "LineComment"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Swift3.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Swift3Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class TopLevelContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(Swift3Parser.EOF, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TopLevelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topLevel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterTopLevel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitTopLevel(this);
		}
	}

	public final TopLevelContext topLevel() throws RecognitionException {
		TopLevelContext _localctx = new TopLevelContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_topLevel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(519);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__37) | (1L << T__39) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__78 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__83 - 64)) | (1L << (T__84 - 64)) | (1L << (T__85 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (T__89 - 64)) | (1L << (T__90 - 64)) | (1L << (T__91 - 64)) | (1L << (T__92 - 64)) | (1L << (T__93 - 64)) | (1L << (T__94 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__99 - 64)) | (1L << (T__100 - 64)) | (1L << (T__102 - 64)) | (1L << (T__104 - 64)) | (1L << (T__106 - 64)) | (1L << (T__107 - 64)) | (1L << (T__108 - 64)) | (1L << (T__109 - 64)) | (1L << (T__110 - 64)) | (1L << (T__111 - 64)) | (1L << (T__112 - 64)) | (1L << (T__113 - 64)) | (1L << (T__116 - 64)) | (1L << (T__119 - 64)) | (1L << (T__120 - 64)) | (1L << (T__121 - 64)) | (1L << (T__122 - 64)) | (1L << (T__123 - 64)) | (1L << (T__124 - 64)) | (1L << (T__125 - 64)) | (1L << (T__126 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__127 - 128)) | (1L << (T__128 - 128)) | (1L << (T__129 - 128)) | (1L << (T__130 - 128)) | (1L << (T__131 - 128)) | (1L << (T__132 - 128)) | (1L << (T__133 - 128)) | (1L << (T__134 - 128)) | (1L << (T__136 - 128)) | (1L << (T__137 - 128)) | (1L << (T__138 - 128)) | (1L << (T__139 - 128)) | (1L << (T__140 - 128)) | (1L << (T__141 - 128)) | (1L << (T__142 - 128)) | (1L << (T__143 - 128)) | (1L << (T__144 - 128)) | (1L << (T__145 - 128)) | (1L << (T__146 - 128)) | (1L << (BooleanLiteral - 128)) | (1L << (NilLiteral - 128)) | (1L << (OperatorHead - 128)) | (1L << (DotOperatorHead - 128)) | (1L << (Identifier - 128)) | (1L << (BinaryLiteral - 128)) | (1L << (OctalLiteral - 128)) | (1L << (DecimalLiteral - 128)) | (1L << (HexadecimalLiteral - 128)) | (1L << (FloatingPointLiteral - 128)) | (1L << (StringLiteral - 128)))) != 0)) {
				{
				setState(518);
				statements();
				}
			}

			setState(521);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public LoopStatementContext loopStatement() {
			return getRuleContext(LoopStatementContext.class,0);
		}
		public BranchStatementContext branchStatement() {
			return getRuleContext(BranchStatementContext.class,0);
		}
		public LabeledStatementContext labeledStatement() {
			return getRuleContext(LabeledStatementContext.class,0);
		}
		public ControlTransferStatementContext controlTransferStatement() {
			return getRuleContext(ControlTransferStatementContext.class,0);
		}
		public DeferStatementContext deferStatement() {
			return getRuleContext(DeferStatementContext.class,0);
		}
		public DoStatementContext doStatement() {
			return getRuleContext(DoStatementContext.class,0);
		}
		public CompilerControlStatementContext compilerControlStatement() {
			return getRuleContext(CompilerControlStatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PromiseKitExpressionContext promiseKitExpression() {
			return getRuleContext(PromiseKitExpressionContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		int _la;
		try {
			setState(560);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(523);
				declaration();
				setState(525);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(524);
					match(T__0);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(527);
				loopStatement();
				setState(529);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(528);
					match(T__0);
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(531);
				branchStatement();
				setState(533);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(532);
					match(T__0);
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(535);
				labeledStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(536);
				controlTransferStatement();
				setState(538);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(537);
					match(T__0);
					}
				}

				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(540);
				deferStatement();
				setState(542);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(541);
					match(T__0);
					}
				}

				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(544);
				doStatement();
				setState(546);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(545);
					match(T__1);
					}
				}

				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(548);
				compilerControlStatement();
				setState(550);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(549);
					match(T__0);
					}
				}

				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(552);
				expression();
				setState(554);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(553);
					match(T__0);
					}
				}

				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(556);
				promiseKitExpression();
				setState(558);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(557);
					match(T__0);
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PromiseKitExpressionContext extends ParserRuleContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public List<PromiseKitSuffixContext> promiseKitSuffix() {
			return getRuleContexts(PromiseKitSuffixContext.class);
		}
		public PromiseKitSuffixContext promiseKitSuffix(int i) {
			return getRuleContext(PromiseKitSuffixContext.class,i);
		}
		public PromiseKitExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_promiseKitExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterPromiseKitExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitPromiseKitExpression(this);
		}
	}

	public final PromiseKitExpressionContext promiseKitExpression() throws RecognitionException {
		PromiseKitExpressionContext _localctx = new PromiseKitExpressionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_promiseKitExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(562);
			postfixExpression(0);
			setState(564); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(563);
					promiseKitSuffix();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(566); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			} while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PromiseKitSuffixContext extends ParserRuleContext {
		public ClosureExpressionContext closureExpression() {
			return getRuleContext(ClosureExpressionContext.class,0);
		}
		public PromiseKitSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_promiseKitSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterPromiseKitSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitPromiseKitSuffix(this);
		}
	}

	public final PromiseKitSuffixContext promiseKitSuffix() throws RecognitionException {
		PromiseKitSuffixContext _localctx = new PromiseKitSuffixContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_promiseKitSuffix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(568);
			match(T__2);
			setState(569);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(570);
			closureExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementsContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitStatements(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_statements);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(573); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(572);
					statement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(575); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			} while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LoopStatementContext extends ParserRuleContext {
		public ForInStatementContext forInStatement() {
			return getRuleContext(ForInStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public RepeatWhileStatementContext repeatWhileStatement() {
			return getRuleContext(RepeatWhileStatementContext.class,0);
		}
		public LoopStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterLoopStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitLoopStatement(this);
		}
	}

	public final LoopStatementContext loopStatement() throws RecognitionException {
		LoopStatementContext _localctx = new LoopStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_loopStatement);
		try {
			setState(580);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(577);
				forInStatement();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(578);
				whileStatement();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 3);
				{
				setState(579);
				repeatWhileStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForInStatementContext extends ParserRuleContext {
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public ForInStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterForInStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitForInStatement(this);
		}
	}

	public final ForInStatementContext forInStatement() throws RecognitionException {
		ForInStatementContext _localctx = new ForInStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_forInStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(582);
			match(T__6);
			setState(584);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(583);
				match(T__7);
				}
				break;
			}
			setState(586);
			pattern(0);
			setState(587);
			match(T__8);
			setState(588);
			expression();
			setState(590);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__28) {
				{
				setState(589);
				whereClause();
				}
			}

			setState(592);
			codeBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStatementContext extends ParserRuleContext {
		public ConditionListContext conditionList() {
			return getRuleContext(ConditionListContext.class,0);
		}
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitWhileStatement(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(594);
			match(T__9);
			setState(595);
			conditionList();
			setState(596);
			codeBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RepeatWhileStatementContext extends ParserRuleContext {
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public RepeatWhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeatWhileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterRepeatWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitRepeatWhileStatement(this);
		}
	}

	public final RepeatWhileStatementContext repeatWhileStatement() throws RecognitionException {
		RepeatWhileStatementContext _localctx = new RepeatWhileStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_repeatWhileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(598);
			match(T__10);
			setState(599);
			codeBlock();
			setState(600);
			match(T__9);
			setState(601);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BranchStatementContext extends ParserRuleContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public GuardStatementContext guardStatement() {
			return getRuleContext(GuardStatementContext.class,0);
		}
		public SwitchStatementContext switchStatement() {
			return getRuleContext(SwitchStatementContext.class,0);
		}
		public BranchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_branchStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterBranchStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitBranchStatement(this);
		}
	}

	public final BranchStatementContext branchStatement() throws RecognitionException {
		BranchStatementContext _localctx = new BranchStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_branchStatement);
		try {
			setState(606);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(603);
				ifStatement();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(604);
				guardStatement();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 3);
				{
				setState(605);
				switchStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStatementContext extends ParserRuleContext {
		public ConditionListContext conditionList() {
			return getRuleContext(ConditionListContext.class,0);
		}
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public ElseClauseContext elseClause() {
			return getRuleContext(ElseClauseContext.class,0);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitIfStatement(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(608);
			match(T__11);
			setState(609);
			conditionList();
			setState(610);
			codeBlock();
			setState(612);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(611);
				elseClause();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseClauseContext extends ParserRuleContext {
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public ElseClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterElseClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitElseClause(this);
		}
	}

	public final ElseClauseContext elseClause() throws RecognitionException {
		ElseClauseContext _localctx = new ElseClauseContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_elseClause);
		try {
			setState(618);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(614);
				match(T__12);
				setState(615);
				codeBlock();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(616);
				match(T__12);
				setState(617);
				ifStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GuardStatementContext extends ParserRuleContext {
		public ConditionListContext conditionList() {
			return getRuleContext(ConditionListContext.class,0);
		}
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public GuardStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_guardStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterGuardStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitGuardStatement(this);
		}
	}

	public final GuardStatementContext guardStatement() throws RecognitionException {
		GuardStatementContext _localctx = new GuardStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_guardStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(620);
			match(T__13);
			setState(621);
			conditionList();
			setState(622);
			match(T__12);
			setState(623);
			codeBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SwitchCasesContext switchCases() {
			return getRuleContext(SwitchCasesContext.class,0);
		}
		public SwitchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterSwitchStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitSwitchStatement(this);
		}
	}

	public final SwitchStatementContext switchStatement() throws RecognitionException {
		SwitchStatementContext _localctx = new SwitchStatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_switchStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(625);
			match(T__14);
			setState(626);
			expression();
			setState(627);
			match(T__15);
			setState(629);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7 || _la==T__18) {
				{
				setState(628);
				switchCases();
				}
			}

			setState(631);
			match(T__16);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchCasesContext extends ParserRuleContext {
		public List<SwitchCaseContext> switchCase() {
			return getRuleContexts(SwitchCaseContext.class);
		}
		public SwitchCaseContext switchCase(int i) {
			return getRuleContext(SwitchCaseContext.class,i);
		}
		public SwitchCasesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchCases; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterSwitchCases(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitSwitchCases(this);
		}
	}

	public final SwitchCasesContext switchCases() throws RecognitionException {
		SwitchCasesContext _localctx = new SwitchCasesContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_switchCases);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(634); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(633);
				switchCase();
				}
				}
				setState(636); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__7 || _la==T__18 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchCaseContext extends ParserRuleContext {
		public CaseLabelContext caseLabel() {
			return getRuleContext(CaseLabelContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public DefaultLabelContext defaultLabel() {
			return getRuleContext(DefaultLabelContext.class,0);
		}
		public SwitchCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchCase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterSwitchCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitSwitchCase(this);
		}
	}

	public final SwitchCaseContext switchCase() throws RecognitionException {
		SwitchCaseContext _localctx = new SwitchCaseContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_switchCase);
		try {
			setState(650);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(638);
				caseLabel();
				setState(639);
				statements();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(641);
				defaultLabel();
				setState(642);
				statements();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(644);
				caseLabel();
				setState(645);
				match(T__0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(647);
				defaultLabel();
				setState(648);
				match(T__0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaseLabelContext extends ParserRuleContext {
		public CaseItemListContext caseItemList() {
			return getRuleContext(CaseItemListContext.class,0);
		}
		public CaseLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseLabel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterCaseLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitCaseLabel(this);
		}
	}

	public final CaseLabelContext caseLabel() throws RecognitionException {
		CaseLabelContext _localctx = new CaseLabelContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_caseLabel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(652);
			match(T__7);
			setState(653);
			caseItemList();
			setState(654);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaseItemListContext extends ParserRuleContext {
		public List<CaseItemContext> caseItem() {
			return getRuleContexts(CaseItemContext.class);
		}
		public CaseItemContext caseItem(int i) {
			return getRuleContext(CaseItemContext.class,i);
		}
		public CaseItemListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseItemList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterCaseItemList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitCaseItemList(this);
		}
	}

	public final CaseItemListContext caseItemList() throws RecognitionException {
		CaseItemListContext _localctx = new CaseItemListContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_caseItemList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(656);
			caseItem();
			setState(661);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__17) {
				{
				{
				setState(657);
				match(T__17);
				setState(658);
				caseItem();
				}
				}
				setState(663);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaseItemContext extends ParserRuleContext {
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public CaseItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterCaseItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitCaseItem(this);
		}
	}

	public final CaseItemContext caseItem() throws RecognitionException {
		CaseItemContext _localctx = new CaseItemContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_caseItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(664);
			pattern(0);
			setState(666);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__28) {
				{
				setState(665);
				whereClause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefaultLabelContext extends ParserRuleContext {
		public DefaultLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultLabel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterDefaultLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitDefaultLabel(this);
		}
	}

	public final DefaultLabelContext defaultLabel() throws RecognitionException {
		DefaultLabelContext _localctx = new DefaultLabelContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_defaultLabel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(668);
			match(T__18);
			setState(669);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabeledStatementContext extends ParserRuleContext {
		public StatementLabelContext statementLabel() {
			return getRuleContext(StatementLabelContext.class,0);
		}
		public LoopStatementContext loopStatement() {
			return getRuleContext(LoopStatementContext.class,0);
		}
		public SwitchStatementContext switchStatement() {
			return getRuleContext(SwitchStatementContext.class,0);
		}
		public LabeledStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeledStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterLabeledStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitLabeledStatement(this);
		}
	}

	public final LabeledStatementContext labeledStatement() throws RecognitionException {
		LabeledStatementContext _localctx = new LabeledStatementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_labeledStatement);
		try {
			setState(677);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(671);
				statementLabel();
				setState(672);
				loopStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(674);
				statementLabel();
				setState(675);
				switchStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementLabelContext extends ParserRuleContext {
		public LabelNameContext labelName() {
			return getRuleContext(LabelNameContext.class,0);
		}
		public StatementLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementLabel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterStatementLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitStatementLabel(this);
		}
	}

	public final StatementLabelContext statementLabel() throws RecognitionException {
		StatementLabelContext _localctx = new StatementLabelContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_statementLabel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(679);
			labelName();
			setState(680);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabelNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public LabelNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labelName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterLabelName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitLabelName(this);
		}
	}

	public final LabelNameContext labelName() throws RecognitionException {
		LabelNameContext _localctx = new LabelNameContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_labelName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(682);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ControlTransferStatementContext extends ParserRuleContext {
		public BreakStatementContext breakStatement() {
			return getRuleContext(BreakStatementContext.class,0);
		}
		public ContinueStatementContext continueStatement() {
			return getRuleContext(ContinueStatementContext.class,0);
		}
		public FallthroughStatementContext fallthroughStatement() {
			return getRuleContext(FallthroughStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public ThrowStatementContext throwStatement() {
			return getRuleContext(ThrowStatementContext.class,0);
		}
		public ControlTransferStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_controlTransferStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterControlTransferStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitControlTransferStatement(this);
		}
	}

	public final ControlTransferStatementContext controlTransferStatement() throws RecognitionException {
		ControlTransferStatementContext _localctx = new ControlTransferStatementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_controlTransferStatement);
		try {
			setState(689);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__19:
				enterOuterAlt(_localctx, 1);
				{
				setState(684);
				breakStatement();
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 2);
				{
				setState(685);
				continueStatement();
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 3);
				{
				setState(686);
				fallthroughStatement();
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 4);
				{
				setState(687);
				returnStatement();
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 5);
				{
				setState(688);
				throwStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BreakStatementContext extends ParserRuleContext {
		public LabelNameContext labelName() {
			return getRuleContext(LabelNameContext.class,0);
		}
		public BreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitBreakStatement(this);
		}
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_breakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(691);
			match(T__19);
			setState(693);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(692);
				labelName();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContinueStatementContext extends ParserRuleContext {
		public LabelNameContext labelName() {
			return getRuleContext(LabelNameContext.class,0);
		}
		public ContinueStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterContinueStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitContinueStatement(this);
		}
	}

	public final ContinueStatementContext continueStatement() throws RecognitionException {
		ContinueStatementContext _localctx = new ContinueStatementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_continueStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(695);
			match(T__20);
			setState(697);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(696);
				labelName();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FallthroughStatementContext extends ParserRuleContext {
		public FallthroughStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fallthroughStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterFallthroughStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitFallthroughStatement(this);
		}
	}

	public final FallthroughStatementContext fallthroughStatement() throws RecognitionException {
		FallthroughStatementContext _localctx = new FallthroughStatementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_fallthroughStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(699);
			match(T__21);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitReturnStatement(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(701);
			match(T__22);
			setState(703);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(702);
				expression();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ThrowStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ThrowStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throwStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterThrowStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitThrowStatement(this);
		}
	}

	public final ThrowStatementContext throwStatement() throws RecognitionException {
		ThrowStatementContext _localctx = new ThrowStatementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_throwStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(705);
			match(T__23);
			setState(706);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeferStatementContext extends ParserRuleContext {
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public DeferStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deferStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterDeferStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitDeferStatement(this);
		}
	}

	public final DeferStatementContext deferStatement() throws RecognitionException {
		DeferStatementContext _localctx = new DeferStatementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_deferStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(708);
			match(T__24);
			setState(709);
			codeBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DoStatementContext extends ParserRuleContext {
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public CatchClausesContext catchClauses() {
			return getRuleContext(CatchClausesContext.class,0);
		}
		public DoStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterDoStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitDoStatement(this);
		}
	}

	public final DoStatementContext doStatement() throws RecognitionException {
		DoStatementContext _localctx = new DoStatementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_doStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(711);
			match(T__25);
			setState(712);
			codeBlock();
			setState(714);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(713);
				catchClauses();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchClausesContext extends ParserRuleContext {
		public CatchClauseContext catchClause() {
			return getRuleContext(CatchClauseContext.class,0);
		}
		public CatchClausesContext catchClauses() {
			return getRuleContext(CatchClausesContext.class,0);
		}
		public CatchClausesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchClauses; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterCatchClauses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitCatchClauses(this);
		}
	}

	public final CatchClausesContext catchClauses() throws RecognitionException {
		CatchClausesContext _localctx = new CatchClausesContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_catchClauses);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(716);
			catchClause();
			setState(718);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(717);
				catchClauses();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchClauseContext extends ParserRuleContext {
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public CatchClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterCatchClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitCatchClause(this);
		}
	}

	public final CatchClauseContext catchClause() throws RecognitionException {
		CatchClauseContext _localctx = new CatchClauseContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_catchClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(720);
			match(T__5);
			setState(722);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(721);
				pattern(0);
				}
				break;
			}
			setState(725);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__28) {
				{
				setState(724);
				whereClause();
				}
			}

			setState(727);
			codeBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionListContext extends ParserRuleContext {
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public ConditionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterConditionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitConditionList(this);
		}
	}

	public final ConditionListContext conditionList() throws RecognitionException {
		ConditionListContext _localctx = new ConditionListContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_conditionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(729);
			condition();
			setState(734);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__17) {
				{
				{
				setState(730);
				match(T__17);
				setState(731);
				condition();
				}
				}
				setState(736);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionContext extends ParserRuleContext {
		public AvailabilityConditionContext availabilityCondition() {
			return getRuleContext(AvailabilityConditionContext.class,0);
		}
		public CaseConditionContext caseCondition() {
			return getRuleContext(CaseConditionContext.class,0);
		}
		public OptionalBindingConditionContext optionalBindingCondition() {
			return getRuleContext(OptionalBindingConditionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_condition);
		try {
			setState(741);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(737);
				availabilityCondition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(738);
				caseCondition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(739);
				optionalBindingCondition();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(740);
				expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaseConditionContext extends ParserRuleContext {
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public CaseConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterCaseCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitCaseCondition(this);
		}
	}

	public final CaseConditionContext caseCondition() throws RecognitionException {
		CaseConditionContext _localctx = new CaseConditionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_caseCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(743);
			match(T__7);
			setState(744);
			pattern(0);
			setState(745);
			initializer();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptionalBindingConditionContext extends ParserRuleContext {
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public OptionalBindingConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionalBindingCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterOptionalBindingCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitOptionalBindingCondition(this);
		}
	}

	public final OptionalBindingConditionContext optionalBindingCondition() throws RecognitionException {
		OptionalBindingConditionContext _localctx = new OptionalBindingConditionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_optionalBindingCondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(747);
			_la = _input.LA(1);
			if ( !(_la==T__26 || _la==T__27) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(748);
			pattern(0);
			setState(749);
			initializer();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhereClauseContext extends ParserRuleContext {
		public WhereExpressionContext whereExpression() {
			return getRuleContext(WhereExpressionContext.class,0);
		}
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterWhereClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitWhereClause(this);
		}
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(751);
			match(T__28);
			setState(752);
			whereExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhereExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public WhereExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterWhereExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitWhereExpression(this);
		}
	}

	public final WhereExpressionContext whereExpression() throws RecognitionException {
		WhereExpressionContext _localctx = new WhereExpressionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_whereExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(754);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AvailabilityConditionContext extends ParserRuleContext {
		public AvailabilityArgumentsContext availabilityArguments() {
			return getRuleContext(AvailabilityArgumentsContext.class,0);
		}
		public AvailabilityConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_availabilityCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterAvailabilityCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitAvailabilityCondition(this);
		}
	}

	public final AvailabilityConditionContext availabilityCondition() throws RecognitionException {
		AvailabilityConditionContext _localctx = new AvailabilityConditionContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_availabilityCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(756);
			match(T__29);
			setState(757);
			match(T__30);
			setState(758);
			availabilityArguments();
			setState(759);
			match(T__31);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AvailabilityArgumentsContext extends ParserRuleContext {
		public AvailabilityArgumentContext availabilityArgument() {
			return getRuleContext(AvailabilityArgumentContext.class,0);
		}
		public List<AvailabilityArgumentsContext> availabilityArguments() {
			return getRuleContexts(AvailabilityArgumentsContext.class);
		}
		public AvailabilityArgumentsContext availabilityArguments(int i) {
			return getRuleContext(AvailabilityArgumentsContext.class,i);
		}
		public AvailabilityArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_availabilityArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterAvailabilityArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitAvailabilityArguments(this);
		}
	}

	public final AvailabilityArgumentsContext availabilityArguments() throws RecognitionException {
		AvailabilityArgumentsContext _localctx = new AvailabilityArgumentsContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_availabilityArguments);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(761);
			availabilityArgument();
			setState(766);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(762);
					match(T__17);
					setState(763);
					availabilityArguments();
					}
					} 
				}
				setState(768);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AvailabilityArgumentContext extends ParserRuleContext {
		public PlatformNameContext platformName() {
			return getRuleContext(PlatformNameContext.class,0);
		}
		public PlatformVersionContext platformVersion() {
			return getRuleContext(PlatformVersionContext.class,0);
		}
		public AvailabilityArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_availabilityArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterAvailabilityArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitAvailabilityArgument(this);
		}
	}

	public final AvailabilityArgumentContext availabilityArgument() throws RecognitionException {
		AvailabilityArgumentContext _localctx = new AvailabilityArgumentContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_availabilityArgument);
		try {
			setState(773);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
			case T__38:
			case T__39:
			case T__40:
				enterOuterAlt(_localctx, 1);
				{
				setState(769);
				platformName();
				setState(770);
				platformVersion();
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 2);
				{
				setState(772);
				match(T__32);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PlatformNameContext extends ParserRuleContext {
		public PlatformNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_platformName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterPlatformName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitPlatformName(this);
		}
	}

	public final PlatformNameContext platformName() throws RecognitionException {
		PlatformNameContext _localctx = new PlatformNameContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_platformName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(775);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PlatformVersionContext extends ParserRuleContext {
		public TerminalNode VersionLiteral() { return getToken(Swift3Parser.VersionLiteral, 0); }
		public TerminalNode DecimalLiteral() { return getToken(Swift3Parser.DecimalLiteral, 0); }
		public TerminalNode FloatingPointLiteral() { return getToken(Swift3Parser.FloatingPointLiteral, 0); }
		public PlatformVersionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_platformVersion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterPlatformVersion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitPlatformVersion(this);
		}
	}

	public final PlatformVersionContext platformVersion() throws RecognitionException {
		PlatformVersionContext _localctx = new PlatformVersionContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_platformVersion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(777);
			_la = _input.LA(1);
			if ( !(((((_la - 157)) & ~0x3f) == 0 && ((1L << (_la - 157)) & ((1L << (DecimalLiteral - 157)) | (1L << (FloatingPointLiteral - 157)) | (1L << (VersionLiteral - 157)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GenericParameterClauseContext extends ParserRuleContext {
		public GenericParameterListContext genericParameterList() {
			return getRuleContext(GenericParameterListContext.class,0);
		}
		public RequirementClauseContext requirementClause() {
			return getRuleContext(RequirementClauseContext.class,0);
		}
		public GenericParameterClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericParameterClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterGenericParameterClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitGenericParameterClause(this);
		}
	}

	public final GenericParameterClauseContext genericParameterClause() throws RecognitionException {
		GenericParameterClauseContext _localctx = new GenericParameterClauseContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_genericParameterClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(779);
			match(T__41);
			setState(780);
			genericParameterList();
			setState(782);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__28) {
				{
				setState(781);
				requirementClause();
				}
			}

			setState(784);
			match(T__42);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GenericParameterListContext extends ParserRuleContext {
		public List<GenericParameterContext> genericParameter() {
			return getRuleContexts(GenericParameterContext.class);
		}
		public GenericParameterContext genericParameter(int i) {
			return getRuleContext(GenericParameterContext.class,i);
		}
		public GenericParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterGenericParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitGenericParameterList(this);
		}
	}

	public final GenericParameterListContext genericParameterList() throws RecognitionException {
		GenericParameterListContext _localctx = new GenericParameterListContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_genericParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(786);
			genericParameter();
			setState(791);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__17) {
				{
				{
				setState(787);
				match(T__17);
				setState(788);
				genericParameter();
				}
				}
				setState(793);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GenericParameterContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TypeIdentifierContext typeIdentifier() {
			return getRuleContext(TypeIdentifierContext.class,0);
		}
		public ProtocolCompositionTypeContext protocolCompositionType() {
			return getRuleContext(ProtocolCompositionTypeContext.class,0);
		}
		public GenericParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterGenericParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitGenericParameter(this);
		}
	}

	public final GenericParameterContext genericParameter() throws RecognitionException {
		GenericParameterContext _localctx = new GenericParameterContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_genericParameter);
		try {
			setState(803);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(794);
				typeName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(795);
				typeName();
				setState(796);
				match(T__1);
				setState(797);
				typeIdentifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(799);
				typeName();
				setState(800);
				match(T__1);
				setState(801);
				protocolCompositionType();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RequirementClauseContext extends ParserRuleContext {
		public RequirementListContext requirementList() {
			return getRuleContext(RequirementListContext.class,0);
		}
		public RequirementClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_requirementClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterRequirementClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitRequirementClause(this);
		}
	}

	public final RequirementClauseContext requirementClause() throws RecognitionException {
		RequirementClauseContext _localctx = new RequirementClauseContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_requirementClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(805);
			match(T__28);
			setState(806);
			requirementList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RequirementListContext extends ParserRuleContext {
		public List<RequirementContext> requirement() {
			return getRuleContexts(RequirementContext.class);
		}
		public RequirementContext requirement(int i) {
			return getRuleContext(RequirementContext.class,i);
		}
		public RequirementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_requirementList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterRequirementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitRequirementList(this);
		}
	}

	public final RequirementListContext requirementList() throws RecognitionException {
		RequirementListContext _localctx = new RequirementListContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_requirementList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(808);
			requirement();
			setState(813);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__17) {
				{
				{
				setState(809);
				match(T__17);
				setState(810);
				requirement();
				}
				}
				setState(815);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RequirementContext extends ParserRuleContext {
		public ConformanceRequirementContext conformanceRequirement() {
			return getRuleContext(ConformanceRequirementContext.class,0);
		}
		public SameTypeRequirementContext sameTypeRequirement() {
			return getRuleContext(SameTypeRequirementContext.class,0);
		}
		public RequirementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_requirement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterRequirement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitRequirement(this);
		}
	}

	public final RequirementContext requirement() throws RecognitionException {
		RequirementContext _localctx = new RequirementContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_requirement);
		try {
			setState(818);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(816);
				conformanceRequirement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(817);
				sameTypeRequirement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConformanceRequirementContext extends ParserRuleContext {
		public List<TypeIdentifierContext> typeIdentifier() {
			return getRuleContexts(TypeIdentifierContext.class);
		}
		public TypeIdentifierContext typeIdentifier(int i) {
			return getRuleContext(TypeIdentifierContext.class,i);
		}
		public ProtocolCompositionTypeContext protocolCompositionType() {
			return getRuleContext(ProtocolCompositionTypeContext.class,0);
		}
		public ConformanceRequirementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conformanceRequirement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterConformanceRequirement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitConformanceRequirement(this);
		}
	}

	public final ConformanceRequirementContext conformanceRequirement() throws RecognitionException {
		ConformanceRequirementContext _localctx = new ConformanceRequirementContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_conformanceRequirement);
		try {
			setState(828);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(820);
				typeIdentifier();
				setState(821);
				match(T__1);
				setState(822);
				typeIdentifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(824);
				typeIdentifier();
				setState(825);
				match(T__1);
				setState(826);
				protocolCompositionType();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SameTypeRequirementContext extends ParserRuleContext {
		public TypeIdentifierContext typeIdentifier() {
			return getRuleContext(TypeIdentifierContext.class,0);
		}
		public STypeContext sType() {
			return getRuleContext(STypeContext.class,0);
		}
		public SameTypeRequirementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sameTypeRequirement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterSameTypeRequirement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitSameTypeRequirement(this);
		}
	}

	public final SameTypeRequirementContext sameTypeRequirement() throws RecognitionException {
		SameTypeRequirementContext _localctx = new SameTypeRequirementContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_sameTypeRequirement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(830);
			typeIdentifier();
			setState(831);
			match(T__43);
			setState(832);
			sType(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GenericArgumentClauseContext extends ParserRuleContext {
		public GenericArgumentListContext genericArgumentList() {
			return getRuleContext(GenericArgumentListContext.class,0);
		}
		public GenericArgumentClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericArgumentClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterGenericArgumentClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitGenericArgumentClause(this);
		}
	}

	public final GenericArgumentClauseContext genericArgumentClause() throws RecognitionException {
		GenericArgumentClauseContext _localctx = new GenericArgumentClauseContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_genericArgumentClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(834);
			match(T__41);
			setState(835);
			genericArgumentList();
			setState(836);
			match(T__42);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GenericArgumentListContext extends ParserRuleContext {
		public List<GenericArgumentContext> genericArgument() {
			return getRuleContexts(GenericArgumentContext.class);
		}
		public GenericArgumentContext genericArgument(int i) {
			return getRuleContext(GenericArgumentContext.class,i);
		}
		public GenericArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericArgumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterGenericArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitGenericArgumentList(this);
		}
	}

	public final GenericArgumentListContext genericArgumentList() throws RecognitionException {
		GenericArgumentListContext _localctx = new GenericArgumentListContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_genericArgumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(838);
			genericArgument();
			setState(843);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__17) {
				{
				{
				setState(839);
				match(T__17);
				setState(840);
				genericArgument();
				}
				}
				setState(845);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GenericArgumentContext extends ParserRuleContext {
		public STypeContext sType() {
			return getRuleContext(STypeContext.class,0);
		}
		public GenericArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterGenericArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitGenericArgument(this);
		}
	}

	public final GenericArgumentContext genericArgument() throws RecognitionException {
		GenericArgumentContext _localctx = new GenericArgumentContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_genericArgument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(846);
			sType(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public ImportDeclarationContext importDeclaration() {
			return getRuleContext(ImportDeclarationContext.class,0);
		}
		public ConstantDeclarationContext constantDeclaration() {
			return getRuleContext(ConstantDeclarationContext.class,0);
		}
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public TypealiasDeclarationContext typealiasDeclaration() {
			return getRuleContext(TypealiasDeclarationContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public StructDeclarationContext structDeclaration() {
			return getRuleContext(StructDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public ProtocolDeclarationContext protocolDeclaration() {
			return getRuleContext(ProtocolDeclarationContext.class,0);
		}
		public InitializerDeclarationContext initializerDeclaration() {
			return getRuleContext(InitializerDeclarationContext.class,0);
		}
		public DeinitializerDeclarationContext deinitializerDeclaration() {
			return getRuleContext(DeinitializerDeclarationContext.class,0);
		}
		public ExtensionDeclarationContext extensionDeclaration() {
			return getRuleContext(ExtensionDeclarationContext.class,0);
		}
		public SubscriptDeclarationContext subscriptDeclaration() {
			return getRuleContext(SubscriptDeclarationContext.class,0);
		}
		public OperatorDeclarationContext operatorDeclaration() {
			return getRuleContext(OperatorDeclarationContext.class,0);
		}
		public CompilerControlStatementContext compilerControlStatement() {
			return getRuleContext(CompilerControlStatementContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_declaration);
		try {
			setState(908);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(848);
				importDeclaration();
				setState(850);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
				case 1:
					{
					setState(849);
					match(T__0);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(852);
				constantDeclaration();
				setState(854);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
				case 1:
					{
					setState(853);
					match(T__0);
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(856);
				variableDeclaration();
				setState(858);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
				case 1:
					{
					setState(857);
					match(T__0);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(860);
				typealiasDeclaration();
				setState(862);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
				case 1:
					{
					setState(861);
					match(T__0);
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(864);
				functionDeclaration();
				setState(866);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
				case 1:
					{
					setState(865);
					match(T__0);
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(868);
				enumDeclaration();
				setState(870);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
				case 1:
					{
					setState(869);
					match(T__0);
					}
					break;
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(872);
				structDeclaration();
				setState(874);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
				case 1:
					{
					setState(873);
					match(T__0);
					}
					break;
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(876);
				classDeclaration();
				setState(878);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
				case 1:
					{
					setState(877);
					match(T__0);
					}
					break;
				}
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(880);
				protocolDeclaration();
				setState(882);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
				case 1:
					{
					setState(881);
					match(T__0);
					}
					break;
				}
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(884);
				initializerDeclaration();
				setState(886);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
				case 1:
					{
					setState(885);
					match(T__0);
					}
					break;
				}
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(888);
				deinitializerDeclaration();
				setState(890);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
				case 1:
					{
					setState(889);
					match(T__0);
					}
					break;
				}
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(892);
				extensionDeclaration();
				setState(894);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
				case 1:
					{
					setState(893);
					match(T__0);
					}
					break;
				}
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(896);
				subscriptDeclaration();
				setState(898);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
				case 1:
					{
					setState(897);
					match(T__0);
					}
					break;
				}
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(900);
				operatorDeclaration();
				setState(902);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
				case 1:
					{
					setState(901);
					match(T__0);
					}
					break;
				}
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(904);
				compilerControlStatement();
				setState(906);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
				case 1:
					{
					setState(905);
					match(T__0);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationsContext extends ParserRuleContext {
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public DeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitDeclarations(this);
		}
	}

	public final DeclarationsContext declarations() throws RecognitionException {
		DeclarationsContext _localctx = new DeclarationsContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_declarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(911); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(910);
				declaration();
				}
				}
				setState(913); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 27)) & ~0x3f) == 0 && ((1L << (_la - 27)) & ((1L << (T__26 - 27)) | (1L << (T__27 - 27)) | (1L << (T__44 - 27)) | (1L << (T__45 - 27)) | (1L << (T__46 - 27)) | (1L << (T__47 - 27)) | (1L << (T__48 - 27)) | (1L << (T__49 - 27)) | (1L << (T__50 - 27)) | (1L << (T__51 - 27)) | (1L << (T__52 - 27)) | (1L << (T__53 - 27)) | (1L << (T__54 - 27)) | (1L << (T__55 - 27)) | (1L << (T__56 - 27)) | (1L << (T__57 - 27)) | (1L << (T__58 - 27)) | (1L << (T__61 - 27)) | (1L << (T__62 - 27)) | (1L << (T__64 - 27)) | (1L << (T__65 - 27)) | (1L << (T__66 - 27)) | (1L << (T__67 - 27)) | (1L << (T__68 - 27)) | (1L << (T__69 - 27)) | (1L << (T__70 - 27)) | (1L << (T__71 - 27)) | (1L << (T__72 - 27)) | (1L << (T__73 - 27)) | (1L << (T__83 - 27)) | (1L << (T__85 - 27)) | (1L << (T__88 - 27)) | (1L << (T__89 - 27)))) != 0) || ((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & ((1L << (T__90 - 91)) | (1L << (T__99 - 91)) | (1L << (T__130 - 91)) | (1L << (T__140 - 91)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationModifiersContext extends ParserRuleContext {
		public List<DeclarationModifierContext> declarationModifier() {
			return getRuleContexts(DeclarationModifierContext.class);
		}
		public DeclarationModifierContext declarationModifier(int i) {
			return getRuleContext(DeclarationModifierContext.class,i);
		}
		public DeclarationModifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationModifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterDeclarationModifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitDeclarationModifiers(this);
		}
	}

	public final DeclarationModifiersContext declarationModifiers() throws RecognitionException {
		DeclarationModifiersContext _localctx = new DeclarationModifiersContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_declarationModifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(916); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(915);
				declarationModifier();
				}
				}
				setState(918); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 45)) & ~0x3f) == 0 && ((1L << (_la - 45)) & ((1L << (T__44 - 45)) | (1L << (T__45 - 45)) | (1L << (T__46 - 45)) | (1L << (T__47 - 45)) | (1L << (T__48 - 45)) | (1L << (T__49 - 45)) | (1L << (T__50 - 45)) | (1L << (T__51 - 45)) | (1L << (T__52 - 45)) | (1L << (T__53 - 45)) | (1L << (T__54 - 45)) | (1L << (T__55 - 45)) | (1L << (T__56 - 45)) | (1L << (T__57 - 45)) | (1L << (T__58 - 45)) | (1L << (T__61 - 45)) | (1L << (T__62 - 45)) | (1L << (T__64 - 45)) | (1L << (T__65 - 45)) | (1L << (T__66 - 45)) | (1L << (T__67 - 45)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationModifierContext extends ParserRuleContext {
		public AccessLevelModifierContext accessLevelModifier() {
			return getRuleContext(AccessLevelModifierContext.class,0);
		}
		public DeclarationModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterDeclarationModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitDeclarationModifier(this);
		}
	}

	public final DeclarationModifierContext declarationModifier() throws RecognitionException {
		DeclarationModifierContext _localctx = new DeclarationModifierContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_declarationModifier);
		try {
			setState(945);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(920);
				match(T__44);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(921);
				match(T__45);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(922);
				match(T__46);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(923);
				match(T__47);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(924);
				match(T__48);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(925);
				match(T__49);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(926);
				match(T__50);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(927);
				match(T__51);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(928);
				match(T__52);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(929);
				match(T__53);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(930);
				match(T__54);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(931);
				match(T__55);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(932);
				match(T__56);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(933);
				match(T__57);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(934);
				match(T__58);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(935);
				match(T__58);
				setState(936);
				match(T__30);
				setState(937);
				match(T__59);
				setState(938);
				match(T__31);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(939);
				match(T__58);
				setState(940);
				match(T__30);
				setState(941);
				match(T__60);
				setState(942);
				match(T__31);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(943);
				match(T__61);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(944);
				accessLevelModifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AccessLevelModifierContext extends ParserRuleContext {
		public AccessLevelModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessLevelModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterAccessLevelModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitAccessLevelModifier(this);
		}
	}

	public final AccessLevelModifierContext accessLevelModifier() throws RecognitionException {
		AccessLevelModifierContext _localctx = new AccessLevelModifierContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_accessLevelModifier);
		try {
			setState(972);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(947);
				match(T__62);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(948);
				match(T__62);
				setState(949);
				match(T__30);
				setState(950);
				match(T__63);
				setState(951);
				match(T__31);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(952);
				match(T__64);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(953);
				match(T__64);
				setState(954);
				match(T__30);
				setState(955);
				match(T__63);
				setState(956);
				match(T__31);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(957);
				match(T__65);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(958);
				match(T__65);
				setState(959);
				match(T__30);
				setState(960);
				match(T__63);
				setState(961);
				match(T__31);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(962);
				match(T__66);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(963);
				match(T__66);
				setState(964);
				match(T__30);
				setState(965);
				match(T__63);
				setState(966);
				match(T__31);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(967);
				match(T__67);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(968);
				match(T__67);
				setState(969);
				match(T__30);
				setState(970);
				match(T__63);
				setState(971);
				match(T__31);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AccessLevelModifiersContext extends ParserRuleContext {
		public List<AccessLevelModifierContext> accessLevelModifier() {
			return getRuleContexts(AccessLevelModifierContext.class);
		}
		public AccessLevelModifierContext accessLevelModifier(int i) {
			return getRuleContext(AccessLevelModifierContext.class,i);
		}
		public AccessLevelModifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessLevelModifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterAccessLevelModifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitAccessLevelModifiers(this);
		}
	}

	public final AccessLevelModifiersContext accessLevelModifiers() throws RecognitionException {
		AccessLevelModifiersContext _localctx = new AccessLevelModifiersContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_accessLevelModifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(975); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(974);
				accessLevelModifier();
				}
				}
				setState(977); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & ((1L << (T__62 - 63)) | (1L << (T__64 - 63)) | (1L << (T__65 - 63)) | (1L << (T__66 - 63)) | (1L << (T__67 - 63)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CodeBlockContext extends ParserRuleContext {
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public CodeBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codeBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterCodeBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitCodeBlock(this);
		}
	}

	public final CodeBlockContext codeBlock() throws RecognitionException {
		CodeBlockContext _localctx = new CodeBlockContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_codeBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(979);
			match(T__15);
			setState(981);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__37) | (1L << T__39) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__78 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__83 - 64)) | (1L << (T__84 - 64)) | (1L << (T__85 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (T__89 - 64)) | (1L << (T__90 - 64)) | (1L << (T__91 - 64)) | (1L << (T__92 - 64)) | (1L << (T__93 - 64)) | (1L << (T__94 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__99 - 64)) | (1L << (T__100 - 64)) | (1L << (T__102 - 64)) | (1L << (T__104 - 64)) | (1L << (T__106 - 64)) | (1L << (T__107 - 64)) | (1L << (T__108 - 64)) | (1L << (T__109 - 64)) | (1L << (T__110 - 64)) | (1L << (T__111 - 64)) | (1L << (T__112 - 64)) | (1L << (T__113 - 64)) | (1L << (T__116 - 64)) | (1L << (T__119 - 64)) | (1L << (T__120 - 64)) | (1L << (T__121 - 64)) | (1L << (T__122 - 64)) | (1L << (T__123 - 64)) | (1L << (T__124 - 64)) | (1L << (T__125 - 64)) | (1L << (T__126 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__127 - 128)) | (1L << (T__128 - 128)) | (1L << (T__129 - 128)) | (1L << (T__130 - 128)) | (1L << (T__131 - 128)) | (1L << (T__132 - 128)) | (1L << (T__133 - 128)) | (1L << (T__134 - 128)) | (1L << (T__136 - 128)) | (1L << (T__137 - 128)) | (1L << (T__138 - 128)) | (1L << (T__139 - 128)) | (1L << (T__140 - 128)) | (1L << (T__141 - 128)) | (1L << (T__142 - 128)) | (1L << (T__143 - 128)) | (1L << (T__144 - 128)) | (1L << (T__145 - 128)) | (1L << (T__146 - 128)) | (1L << (BooleanLiteral - 128)) | (1L << (NilLiteral - 128)) | (1L << (OperatorHead - 128)) | (1L << (DotOperatorHead - 128)) | (1L << (Identifier - 128)) | (1L << (BinaryLiteral - 128)) | (1L << (OctalLiteral - 128)) | (1L << (DecimalLiteral - 128)) | (1L << (HexadecimalLiteral - 128)) | (1L << (FloatingPointLiteral - 128)) | (1L << (StringLiteral - 128)))) != 0)) {
				{
				setState(980);
				statements();
				}
			}

			setState(983);
			match(T__16);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportDeclarationContext extends ParserRuleContext {
		public ImportPathContext importPath() {
			return getRuleContext(ImportPathContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public ImportKindContext importKind() {
			return getRuleContext(ImportKindContext.class,0);
		}
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitImportDeclaration(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_importDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(986);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__99) {
				{
				setState(985);
				attributes();
				}
			}

			setState(988);
			match(T__68);
			setState(990);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				{
				setState(989);
				importKind();
				}
				break;
			}
			setState(992);
			importPath();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportKindContext extends ParserRuleContext {
		public ImportKindContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importKind; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterImportKind(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitImportKind(this);
		}
	}

	public final ImportKindContext importKind() throws RecognitionException {
		ImportKindContext _localctx = new ImportKindContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_importKind);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(994);
			_la = _input.LA(1);
			if ( !(((((_la - 27)) & ~0x3f) == 0 && ((1L << (_la - 27)) & ((1L << (T__26 - 27)) | (1L << (T__27 - 27)) | (1L << (T__44 - 27)) | (1L << (T__69 - 27)) | (1L << (T__70 - 27)) | (1L << (T__71 - 27)) | (1L << (T__72 - 27)) | (1L << (T__73 - 27)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportPathContext extends ParserRuleContext {
		public ImportPathIdentifierContext importPathIdentifier() {
			return getRuleContext(ImportPathIdentifierContext.class,0);
		}
		public ImportPathContext importPath() {
			return getRuleContext(ImportPathContext.class,0);
		}
		public ImportPathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importPath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterImportPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitImportPath(this);
		}
	}

	public final ImportPathContext importPath() throws RecognitionException {
		ImportPathContext _localctx = new ImportPathContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_importPath);
		try {
			setState(1001);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(996);
				importPathIdentifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(997);
				importPathIdentifier();
				setState(998);
				match(T__2);
				setState(999);
				importPath();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportPathIdentifierContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public ImportPathIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importPathIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterImportPathIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitImportPathIdentifier(this);
		}
	}

	public final ImportPathIdentifierContext importPathIdentifier() throws RecognitionException {
		ImportPathIdentifierContext _localctx = new ImportPathIdentifierContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_importPathIdentifier);
		try {
			setState(1005);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__18:
			case T__27:
			case T__33:
			case T__34:
			case T__35:
			case T__37:
			case T__39:
			case T__45:
			case T__46:
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case T__54:
			case T__55:
			case T__56:
			case T__58:
			case T__59:
			case T__61:
			case T__63:
			case T__75:
			case T__76:
			case T__77:
			case T__83:
			case T__91:
			case T__92:
			case T__93:
			case T__94:
			case T__95:
			case T__96:
			case T__124:
			case T__125:
			case T__127:
			case T__133:
			case T__134:
			case T__136:
			case T__137:
			case T__138:
			case T__139:
			case T__141:
			case T__142:
			case T__146:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1003);
				identifier();
				}
				break;
			case T__32:
			case T__41:
			case T__42:
			case T__43:
			case T__74:
			case T__80:
			case T__81:
			case T__86:
			case T__87:
			case T__102:
			case T__104:
			case T__106:
			case T__121:
			case T__122:
			case T__123:
			case OperatorHead:
			case DotOperatorHead:
				enterOuterAlt(_localctx, 2);
				{
				setState(1004);
				operator();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantDeclarationContext extends ParserRuleContext {
		public PatternInitializerListContext patternInitializerList() {
			return getRuleContext(PatternInitializerListContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public DeclarationModifiersContext declarationModifiers() {
			return getRuleContext(DeclarationModifiersContext.class,0);
		}
		public ConstantDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterConstantDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitConstantDeclaration(this);
		}
	}

	public final ConstantDeclarationContext constantDeclaration() throws RecognitionException {
		ConstantDeclarationContext _localctx = new ConstantDeclarationContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_constantDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1008);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__99) {
				{
				setState(1007);
				attributes();
				}
			}

			setState(1011);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 45)) & ~0x3f) == 0 && ((1L << (_la - 45)) & ((1L << (T__44 - 45)) | (1L << (T__45 - 45)) | (1L << (T__46 - 45)) | (1L << (T__47 - 45)) | (1L << (T__48 - 45)) | (1L << (T__49 - 45)) | (1L << (T__50 - 45)) | (1L << (T__51 - 45)) | (1L << (T__52 - 45)) | (1L << (T__53 - 45)) | (1L << (T__54 - 45)) | (1L << (T__55 - 45)) | (1L << (T__56 - 45)) | (1L << (T__57 - 45)) | (1L << (T__58 - 45)) | (1L << (T__61 - 45)) | (1L << (T__62 - 45)) | (1L << (T__64 - 45)) | (1L << (T__65 - 45)) | (1L << (T__66 - 45)) | (1L << (T__67 - 45)))) != 0)) {
				{
				setState(1010);
				declarationModifiers();
				}
			}

			setState(1013);
			match(T__26);
			setState(1014);
			patternInitializerList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PatternInitializerListContext extends ParserRuleContext {
		public List<PatternInitializerContext> patternInitializer() {
			return getRuleContexts(PatternInitializerContext.class);
		}
		public PatternInitializerContext patternInitializer(int i) {
			return getRuleContext(PatternInitializerContext.class,i);
		}
		public PatternInitializerListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_patternInitializerList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterPatternInitializerList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitPatternInitializerList(this);
		}
	}

	public final PatternInitializerListContext patternInitializerList() throws RecognitionException {
		PatternInitializerListContext _localctx = new PatternInitializerListContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_patternInitializerList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1016);
			patternInitializer();
			setState(1021);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__17) {
				{
				{
				setState(1017);
				match(T__17);
				setState(1018);
				patternInitializer();
				}
				}
				setState(1023);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PatternInitializerContext extends ParserRuleContext {
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public PatternInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_patternInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterPatternInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitPatternInitializer(this);
		}
	}

	public final PatternInitializerContext patternInitializer() throws RecognitionException {
		PatternInitializerContext _localctx = new PatternInitializerContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_patternInitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1024);
			pattern(0);
			setState(1026);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				{
				setState(1025);
				initializer();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitializerContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public InitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitInitializer(this);
		}
	}

	public final InitializerContext initializer() throws RecognitionException {
		InitializerContext _localctx = new InitializerContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_initializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1028);
			match(T__74);
			setState(1029);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclarationContext extends ParserRuleContext {
		public VariableDeclarationHeadContext variableDeclarationHead() {
			return getRuleContext(VariableDeclarationHeadContext.class,0);
		}
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public GetterSetterBlockContext getterSetterBlock() {
			return getRuleContext(GetterSetterBlockContext.class,0);
		}
		public GetterSetterKeywordBlockContext getterSetterKeywordBlock() {
			return getRuleContext(GetterSetterKeywordBlockContext.class,0);
		}
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public WillSetDidSetBlockContext willSetDidSetBlock() {
			return getRuleContext(WillSetDidSetBlockContext.class,0);
		}
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public PatternInitializerListContext patternInitializerList() {
			return getRuleContext(PatternInitializerListContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitVariableDeclaration(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_variableDeclaration);
		int _la;
		try {
			setState(1062);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1031);
				variableDeclarationHead();
				setState(1032);
				variableName();
				setState(1033);
				typeAnnotation();
				setState(1034);
				getterSetterBlock();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1036);
				variableDeclarationHead();
				setState(1037);
				variableName();
				setState(1038);
				typeAnnotation();
				setState(1039);
				getterSetterKeywordBlock();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1041);
				variableDeclarationHead();
				setState(1042);
				variableName();
				setState(1043);
				initializer();
				setState(1044);
				willSetDidSetBlock();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1046);
				variableDeclarationHead();
				setState(1047);
				variableName();
				setState(1048);
				typeAnnotation();
				setState(1050);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__74) {
					{
					setState(1049);
					initializer();
					}
				}

				setState(1052);
				willSetDidSetBlock();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1054);
				variableDeclarationHead();
				setState(1055);
				variableName();
				setState(1056);
				typeAnnotation();
				setState(1057);
				codeBlock();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1059);
				variableDeclarationHead();
				setState(1060);
				patternInitializerList();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclarationHeadContext extends ParserRuleContext {
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public DeclarationModifiersContext declarationModifiers() {
			return getRuleContext(DeclarationModifiersContext.class,0);
		}
		public VariableDeclarationHeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarationHead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterVariableDeclarationHead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitVariableDeclarationHead(this);
		}
	}

	public final VariableDeclarationHeadContext variableDeclarationHead() throws RecognitionException {
		VariableDeclarationHeadContext _localctx = new VariableDeclarationHeadContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_variableDeclarationHead);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1065);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__99) {
				{
				setState(1064);
				attributes();
				}
			}

			setState(1068);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 45)) & ~0x3f) == 0 && ((1L << (_la - 45)) & ((1L << (T__44 - 45)) | (1L << (T__45 - 45)) | (1L << (T__46 - 45)) | (1L << (T__47 - 45)) | (1L << (T__48 - 45)) | (1L << (T__49 - 45)) | (1L << (T__50 - 45)) | (1L << (T__51 - 45)) | (1L << (T__52 - 45)) | (1L << (T__53 - 45)) | (1L << (T__54 - 45)) | (1L << (T__55 - 45)) | (1L << (T__56 - 45)) | (1L << (T__57 - 45)) | (1L << (T__58 - 45)) | (1L << (T__61 - 45)) | (1L << (T__62 - 45)) | (1L << (T__64 - 45)) | (1L << (T__65 - 45)) | (1L << (T__66 - 45)) | (1L << (T__67 - 45)))) != 0)) {
				{
				setState(1067);
				declarationModifiers();
				}
			}

			setState(1070);
			match(T__27);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public VariableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterVariableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitVariableName(this);
		}
	}

	public final VariableNameContext variableName() throws RecognitionException {
		VariableNameContext _localctx = new VariableNameContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_variableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1072);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GetterSetterBlockContext extends ParserRuleContext {
		public GetterClauseContext getterClause() {
			return getRuleContext(GetterClauseContext.class,0);
		}
		public SetterClauseContext setterClause() {
			return getRuleContext(SetterClauseContext.class,0);
		}
		public GetterSetterBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getterSetterBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterGetterSetterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitGetterSetterBlock(this);
		}
	}

	public final GetterSetterBlockContext getterSetterBlock() throws RecognitionException {
		GetterSetterBlockContext _localctx = new GetterSetterBlockContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_getterSetterBlock);
		int _la;
		try {
			setState(1086);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1074);
				match(T__15);
				setState(1075);
				getterClause();
				setState(1077);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 45)) & ~0x3f) == 0 && ((1L << (_la - 45)) & ((1L << (T__44 - 45)) | (1L << (T__45 - 45)) | (1L << (T__46 - 45)) | (1L << (T__47 - 45)) | (1L << (T__48 - 45)) | (1L << (T__49 - 45)) | (1L << (T__50 - 45)) | (1L << (T__51 - 45)) | (1L << (T__52 - 45)) | (1L << (T__53 - 45)) | (1L << (T__54 - 45)) | (1L << (T__55 - 45)) | (1L << (T__56 - 45)) | (1L << (T__57 - 45)) | (1L << (T__58 - 45)) | (1L << (T__61 - 45)) | (1L << (T__62 - 45)) | (1L << (T__63 - 45)) | (1L << (T__64 - 45)) | (1L << (T__65 - 45)) | (1L << (T__66 - 45)) | (1L << (T__67 - 45)) | (1L << (T__99 - 45)))) != 0)) {
					{
					setState(1076);
					setterClause();
					}
				}

				setState(1079);
				match(T__16);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1081);
				match(T__15);
				setState(1082);
				setterClause();
				setState(1083);
				getterClause();
				setState(1084);
				match(T__16);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GetterClauseContext extends ParserRuleContext {
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public DeclarationModifiersContext declarationModifiers() {
			return getRuleContext(DeclarationModifiersContext.class,0);
		}
		public GetterClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getterClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterGetterClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitGetterClause(this);
		}
	}

	public final GetterClauseContext getterClause() throws RecognitionException {
		GetterClauseContext _localctx = new GetterClauseContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_getterClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1089);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__99) {
				{
				setState(1088);
				attributes();
				}
			}

			setState(1092);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 45)) & ~0x3f) == 0 && ((1L << (_la - 45)) & ((1L << (T__44 - 45)) | (1L << (T__45 - 45)) | (1L << (T__46 - 45)) | (1L << (T__47 - 45)) | (1L << (T__48 - 45)) | (1L << (T__49 - 45)) | (1L << (T__50 - 45)) | (1L << (T__51 - 45)) | (1L << (T__52 - 45)) | (1L << (T__53 - 45)) | (1L << (T__54 - 45)) | (1L << (T__55 - 45)) | (1L << (T__56 - 45)) | (1L << (T__57 - 45)) | (1L << (T__58 - 45)) | (1L << (T__61 - 45)) | (1L << (T__62 - 45)) | (1L << (T__64 - 45)) | (1L << (T__65 - 45)) | (1L << (T__66 - 45)) | (1L << (T__67 - 45)))) != 0)) {
				{
				setState(1091);
				declarationModifiers();
				}
			}

			setState(1094);
			match(T__75);
			setState(1095);
			codeBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetterClauseContext extends ParserRuleContext {
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public DeclarationModifiersContext declarationModifiers() {
			return getRuleContext(DeclarationModifiersContext.class,0);
		}
		public SetterNameContext setterName() {
			return getRuleContext(SetterNameContext.class,0);
		}
		public SetterClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setterClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterSetterClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitSetterClause(this);
		}
	}

	public final SetterClauseContext setterClause() throws RecognitionException {
		SetterClauseContext _localctx = new SetterClauseContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_setterClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1098);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__99) {
				{
				setState(1097);
				attributes();
				}
			}

			setState(1101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 45)) & ~0x3f) == 0 && ((1L << (_la - 45)) & ((1L << (T__44 - 45)) | (1L << (T__45 - 45)) | (1L << (T__46 - 45)) | (1L << (T__47 - 45)) | (1L << (T__48 - 45)) | (1L << (T__49 - 45)) | (1L << (T__50 - 45)) | (1L << (T__51 - 45)) | (1L << (T__52 - 45)) | (1L << (T__53 - 45)) | (1L << (T__54 - 45)) | (1L << (T__55 - 45)) | (1L << (T__56 - 45)) | (1L << (T__57 - 45)) | (1L << (T__58 - 45)) | (1L << (T__61 - 45)) | (1L << (T__62 - 45)) | (1L << (T__64 - 45)) | (1L << (T__65 - 45)) | (1L << (T__66 - 45)) | (1L << (T__67 - 45)))) != 0)) {
				{
				setState(1100);
				declarationModifiers();
				}
			}

			setState(1103);
			match(T__63);
			setState(1105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__30) {
				{
				setState(1104);
				setterName();
				}
			}

			setState(1107);
			codeBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetterNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public SetterNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setterName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterSetterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitSetterName(this);
		}
	}

	public final SetterNameContext setterName() throws RecognitionException {
		SetterNameContext _localctx = new SetterNameContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_setterName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1109);
			match(T__30);
			setState(1110);
			identifier();
			setState(1111);
			match(T__31);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GetterSetterKeywordBlockContext extends ParserRuleContext {
		public GetterKeywordClauseContext getterKeywordClause() {
			return getRuleContext(GetterKeywordClauseContext.class,0);
		}
		public SetterKeywordClauseContext setterKeywordClause() {
			return getRuleContext(SetterKeywordClauseContext.class,0);
		}
		public GetterSetterKeywordBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getterSetterKeywordBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterGetterSetterKeywordBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitGetterSetterKeywordBlock(this);
		}
	}

	public final GetterSetterKeywordBlockContext getterSetterKeywordBlock() throws RecognitionException {
		GetterSetterKeywordBlockContext _localctx = new GetterSetterKeywordBlockContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_getterSetterKeywordBlock);
		int _la;
		try {
			setState(1125);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1113);
				match(T__15);
				setState(1114);
				getterKeywordClause();
				setState(1116);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__63 || _la==T__99) {
					{
					setState(1115);
					setterKeywordClause();
					}
				}

				setState(1118);
				match(T__16);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1120);
				match(T__15);
				setState(1121);
				setterKeywordClause();
				setState(1122);
				getterKeywordClause();
				setState(1123);
				match(T__16);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GetterKeywordClauseContext extends ParserRuleContext {
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public GetterKeywordClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getterKeywordClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterGetterKeywordClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitGetterKeywordClause(this);
		}
	}

	public final GetterKeywordClauseContext getterKeywordClause() throws RecognitionException {
		GetterKeywordClauseContext _localctx = new GetterKeywordClauseContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_getterKeywordClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__99) {
				{
				setState(1127);
				attributes();
				}
			}

			setState(1130);
			match(T__75);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetterKeywordClauseContext extends ParserRuleContext {
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public SetterKeywordClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setterKeywordClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterSetterKeywordClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitSetterKeywordClause(this);
		}
	}

	public final SetterKeywordClauseContext setterKeywordClause() throws RecognitionException {
		SetterKeywordClauseContext _localctx = new SetterKeywordClauseContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_setterKeywordClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__99) {
				{
				setState(1132);
				attributes();
				}
			}

			setState(1135);
			match(T__63);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WillSetDidSetBlockContext extends ParserRuleContext {
		public WillSetClauseContext willSetClause() {
			return getRuleContext(WillSetClauseContext.class,0);
		}
		public DidSetClauseContext didSetClause() {
			return getRuleContext(DidSetClauseContext.class,0);
		}
		public WillSetDidSetBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_willSetDidSetBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterWillSetDidSetBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitWillSetDidSetBlock(this);
		}
	}

	public final WillSetDidSetBlockContext willSetDidSetBlock() throws RecognitionException {
		WillSetDidSetBlockContext _localctx = new WillSetDidSetBlockContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_willSetDidSetBlock);
		int _la;
		try {
			setState(1151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1137);
				match(T__15);
				setState(1138);
				willSetClause();
				setState(1140);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__77 || _la==T__99) {
					{
					setState(1139);
					didSetClause();
					}
				}

				setState(1142);
				match(T__16);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1144);
				match(T__15);
				setState(1145);
				didSetClause();
				setState(1147);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__76 || _la==T__99) {
					{
					setState(1146);
					willSetClause();
					}
				}

				setState(1149);
				match(T__16);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WillSetClauseContext extends ParserRuleContext {
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public SetterNameContext setterName() {
			return getRuleContext(SetterNameContext.class,0);
		}
		public WillSetClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_willSetClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterWillSetClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitWillSetClause(this);
		}
	}

	public final WillSetClauseContext willSetClause() throws RecognitionException {
		WillSetClauseContext _localctx = new WillSetClauseContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_willSetClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__99) {
				{
				setState(1153);
				attributes();
				}
			}

			setState(1156);
			match(T__76);
			setState(1158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__30) {
				{
				setState(1157);
				setterName();
				}
			}

			setState(1160);
			codeBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DidSetClauseContext extends ParserRuleContext {
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public SetterNameContext setterName() {
			return getRuleContext(SetterNameContext.class,0);
		}
		public DidSetClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_didSetClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterDidSetClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitDidSetClause(this);
		}
	}

	public final DidSetClauseContext didSetClause() throws RecognitionException {
		DidSetClauseContext _localctx = new DidSetClauseContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_didSetClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__99) {
				{
				setState(1162);
				attributes();
				}
			}

			setState(1165);
			match(T__77);
			setState(1167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__30) {
				{
				setState(1166);
				setterName();
				}
			}

			setState(1169);
			codeBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypealiasDeclarationContext extends ParserRuleContext {
		public TypealiasHeadContext typealiasHead() {
			return getRuleContext(TypealiasHeadContext.class,0);
		}
		public TypealiasAssignmentContext typealiasAssignment() {
			return getRuleContext(TypealiasAssignmentContext.class,0);
		}
		public TypealiasDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typealiasDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterTypealiasDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitTypealiasDeclaration(this);
		}
	}

	public final TypealiasDeclarationContext typealiasDeclaration() throws RecognitionException {
		TypealiasDeclarationContext _localctx = new TypealiasDeclarationContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_typealiasDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1171);
			typealiasHead();
			setState(1172);
			typealiasAssignment();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypealiasHeadContext extends ParserRuleContext {
		public TypealiasNameContext typealiasName() {
			return getRuleContext(TypealiasNameContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public AccessLevelModifierContext accessLevelModifier() {
			return getRuleContext(AccessLevelModifierContext.class,0);
		}
		public GenericParameterClauseContext genericParameterClause() {
			return getRuleContext(GenericParameterClauseContext.class,0);
		}
		public TypealiasHeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typealiasHead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterTypealiasHead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitTypealiasHead(this);
		}
	}

	public final TypealiasHeadContext typealiasHead() throws RecognitionException {
		TypealiasHeadContext _localctx = new TypealiasHeadContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_typealiasHead);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__99) {
				{
				setState(1174);
				attributes();
				}
			}

			setState(1178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & ((1L << (T__62 - 63)) | (1L << (T__64 - 63)) | (1L << (T__65 - 63)) | (1L << (T__66 - 63)) | (1L << (T__67 - 63)))) != 0)) {
				{
				setState(1177);
				accessLevelModifier();
				}
			}

			setState(1180);
			match(T__69);
			setState(1181);
			typealiasName();
			setState(1183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__41) {
				{
				setState(1182);
				genericParameterClause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypealiasNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypealiasNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typealiasName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterTypealiasName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitTypealiasName(this);
		}
	}

	public final TypealiasNameContext typealiasName() throws RecognitionException {
		TypealiasNameContext _localctx = new TypealiasNameContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_typealiasName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1185);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypealiasAssignmentContext extends ParserRuleContext {
		public STypeContext sType() {
			return getRuleContext(STypeContext.class,0);
		}
		public TypealiasAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typealiasAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterTypealiasAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitTypealiasAssignment(this);
		}
	}

	public final TypealiasAssignmentContext typealiasAssignment() throws RecognitionException {
		TypealiasAssignmentContext _localctx = new TypealiasAssignmentContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_typealiasAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1187);
			match(T__74);
			setState(1188);
			sType(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDeclarationContext extends ParserRuleContext {
		public FunctionHeadContext functionHead() {
			return getRuleContext(FunctionHeadContext.class,0);
		}
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public FunctionSignatureContext functionSignature() {
			return getRuleContext(FunctionSignatureContext.class,0);
		}
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public GenericParameterClauseContext genericParameterClause() {
			return getRuleContext(GenericParameterClauseContext.class,0);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitFunctionDeclaration(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_functionDeclaration);
		int _la;
		try {
			setState(1205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1190);
				functionHead();
				setState(1191);
				functionName();
				setState(1193);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__41) {
					{
					setState(1192);
					genericParameterClause();
					}
				}

				setState(1195);
				functionSignature();
				setState(1196);
				functionBody();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1198);
				functionHead();
				setState(1199);
				functionName();
				setState(1201);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__41) {
					{
					setState(1200);
					genericParameterClause();
					}
				}

				setState(1203);
				functionSignature();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionHeadContext extends ParserRuleContext {
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public DeclarationModifiersContext declarationModifiers() {
			return getRuleContext(DeclarationModifiersContext.class,0);
		}
		public FunctionHeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionHead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterFunctionHead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitFunctionHead(this);
		}
	}

	public final FunctionHeadContext functionHead() throws RecognitionException {
		FunctionHeadContext _localctx = new FunctionHeadContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_functionHead);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__99) {
				{
				setState(1207);
				attributes();
				}
			}

			setState(1211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 45)) & ~0x3f) == 0 && ((1L << (_la - 45)) & ((1L << (T__44 - 45)) | (1L << (T__45 - 45)) | (1L << (T__46 - 45)) | (1L << (T__47 - 45)) | (1L << (T__48 - 45)) | (1L << (T__49 - 45)) | (1L << (T__50 - 45)) | (1L << (T__51 - 45)) | (1L << (T__52 - 45)) | (1L << (T__53 - 45)) | (1L << (T__54 - 45)) | (1L << (T__55 - 45)) | (1L << (T__56 - 45)) | (1L << (T__57 - 45)) | (1L << (T__58 - 45)) | (1L << (T__61 - 45)) | (1L << (T__62 - 45)) | (1L << (T__64 - 45)) | (1L << (T__65 - 45)) | (1L << (T__66 - 45)) | (1L << (T__67 - 45)))) != 0)) {
				{
				setState(1210);
				declarationModifiers();
				}
			}

			setState(1213);
			match(T__73);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public FunctionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterFunctionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitFunctionName(this);
		}
	}

	public final FunctionNameContext functionName() throws RecognitionException {
		FunctionNameContext _localctx = new FunctionNameContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_functionName);
		try {
			setState(1217);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__18:
			case T__27:
			case T__33:
			case T__34:
			case T__35:
			case T__37:
			case T__39:
			case T__45:
			case T__46:
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case T__54:
			case T__55:
			case T__56:
			case T__58:
			case T__59:
			case T__61:
			case T__63:
			case T__75:
			case T__76:
			case T__77:
			case T__83:
			case T__91:
			case T__92:
			case T__93:
			case T__94:
			case T__95:
			case T__96:
			case T__124:
			case T__125:
			case T__127:
			case T__133:
			case T__134:
			case T__136:
			case T__137:
			case T__138:
			case T__139:
			case T__141:
			case T__142:
			case T__146:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1215);
				identifier();
				}
				break;
			case T__32:
			case T__41:
			case T__42:
			case T__43:
			case T__74:
			case T__80:
			case T__81:
			case T__86:
			case T__87:
			case T__102:
			case T__104:
			case T__106:
			case T__121:
			case T__122:
			case T__123:
			case OperatorHead:
			case DotOperatorHead:
				enterOuterAlt(_localctx, 2);
				{
				setState(1216);
				operator();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionSignatureContext extends ParserRuleContext {
		public ParameterClauseContext parameterClause() {
			return getRuleContext(ParameterClauseContext.class,0);
		}
		public FunctionResultContext functionResult() {
			return getRuleContext(FunctionResultContext.class,0);
		}
		public FunctionSignatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionSignature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterFunctionSignature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitFunctionSignature(this);
		}
	}

	public final FunctionSignatureContext functionSignature() throws RecognitionException {
		FunctionSignatureContext _localctx = new FunctionSignatureContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_functionSignature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1219);
			parameterClause();
			setState(1221);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
			case 1:
				{
				setState(1220);
				_la = _input.LA(1);
				if ( !(_la==T__78 || _la==T__79) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			setState(1224);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				{
				setState(1223);
				functionResult();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionResultContext extends ParserRuleContext {
		public STypeContext sType() {
			return getRuleContext(STypeContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public FunctionResultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionResult; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterFunctionResult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitFunctionResult(this);
		}
	}

	public final FunctionResultContext functionResult() throws RecognitionException {
		FunctionResultContext _localctx = new FunctionResultContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_functionResult);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1226);
			match(T__80);
			setState(1228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__99) {
				{
				setState(1227);
				attributes();
				}
			}

			setState(1230);
			sType(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionBodyContext extends ParserRuleContext {
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public FunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterFunctionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitFunctionBody(this);
		}
	}

	public final FunctionBodyContext functionBody() throws RecognitionException {
		FunctionBodyContext _localctx = new FunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_functionBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1232);
			codeBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterClauseContext extends ParserRuleContext {
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public ParameterClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterParameterClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitParameterClause(this);
		}
	}

	public final ParameterClauseContext parameterClause() throws RecognitionException {
		ParameterClauseContext _localctx = new ParameterClauseContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_parameterClause);
		int _la;
		try {
			setState(1243);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1234);
				match(T__30);
				setState(1235);
				match(T__31);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1236);
				match(T__30);
				setState(1237);
				parameterList();
				setState(1239);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__81) {
					{
					setState(1238);
					match(T__81);
					}
				}

				setState(1241);
				match(T__31);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterListContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitParameterList(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1245);
			parameter();
			setState(1250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__17) {
				{
				{
				setState(1246);
				match(T__17);
				setState(1247);
				parameter();
				}
				}
				setState(1252);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterContext extends ParserRuleContext {
		public LocalParameterNameContext localParameterName() {
			return getRuleContext(LocalParameterNameContext.class,0);
		}
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public ExternalParameterNameContext externalParameterName() {
			return getRuleContext(ExternalParameterNameContext.class,0);
		}
		public DefaultArgumentClauseContext defaultArgumentClause() {
			return getRuleContext(DefaultArgumentClauseContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitParameter(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_parameter);
		int _la;
		try {
			setState(1274);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1254);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__99) {
					{
					setState(1253);
					attributes();
					}
				}

				setState(1257);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
				case 1:
					{
					setState(1256);
					externalParameterName();
					}
					break;
				}
				setState(1259);
				localParameterName();
				setState(1260);
				typeAnnotation();
				setState(1262);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__74) {
					{
					setState(1261);
					defaultArgumentClause();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1265);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__99) {
					{
					setState(1264);
					attributes();
					}
				}

				setState(1268);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
				case 1:
					{
					setState(1267);
					externalParameterName();
					}
					break;
				}
				setState(1270);
				localParameterName();
				setState(1271);
				typeAnnotation();
				setState(1272);
				match(T__81);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExternalParameterNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public ExternalParameterNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_externalParameterName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterExternalParameterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitExternalParameterName(this);
		}
	}

	public final ExternalParameterNameContext externalParameterName() throws RecognitionException {
		ExternalParameterNameContext _localctx = new ExternalParameterNameContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_externalParameterName);
		try {
			setState(1279);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1276);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1277);
				keyword();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1278);
				match(T__82);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalParameterNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public LocalParameterNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localParameterName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterLocalParameterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitLocalParameterName(this);
		}
	}

	public final LocalParameterNameContext localParameterName() throws RecognitionException {
		LocalParameterNameContext _localctx = new LocalParameterNameContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_localParameterName);
		try {
			setState(1283);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__18:
			case T__27:
			case T__33:
			case T__34:
			case T__35:
			case T__37:
			case T__39:
			case T__45:
			case T__46:
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case T__54:
			case T__55:
			case T__56:
			case T__58:
			case T__59:
			case T__61:
			case T__63:
			case T__75:
			case T__76:
			case T__77:
			case T__83:
			case T__91:
			case T__92:
			case T__93:
			case T__94:
			case T__95:
			case T__96:
			case T__124:
			case T__125:
			case T__127:
			case T__133:
			case T__134:
			case T__136:
			case T__137:
			case T__138:
			case T__139:
			case T__141:
			case T__142:
			case T__146:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1281);
				identifier();
				}
				break;
			case T__82:
				enterOuterAlt(_localctx, 2);
				{
				setState(1282);
				match(T__82);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefaultArgumentClauseContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DefaultArgumentClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultArgumentClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterDefaultArgumentClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitDefaultArgumentClause(this);
		}
	}

	public final DefaultArgumentClauseContext defaultArgumentClause() throws RecognitionException {
		DefaultArgumentClauseContext _localctx = new DefaultArgumentClauseContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_defaultArgumentClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1285);
			match(T__74);
			setState(1286);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumDeclarationContext extends ParserRuleContext {
		public EnumDefContext enumDef() {
			return getRuleContext(EnumDefContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public AccessLevelModifierContext accessLevelModifier() {
			return getRuleContext(AccessLevelModifierContext.class,0);
		}
		public EnumDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterEnumDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitEnumDeclaration(this);
		}
	}

	public final EnumDeclarationContext enumDeclaration() throws RecognitionException {
		EnumDeclarationContext _localctx = new EnumDeclarationContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_enumDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__99) {
				{
				setState(1288);
				attributes();
				}
			}

			setState(1292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & ((1L << (T__62 - 63)) | (1L << (T__64 - 63)) | (1L << (T__65 - 63)) | (1L << (T__66 - 63)) | (1L << (T__67 - 63)))) != 0)) {
				{
				setState(1291);
				accessLevelModifier();
				}
			}

			setState(1294);
			enumDef();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumDefContext extends ParserRuleContext {
		public UnionStyleEnumContext unionStyleEnum() {
			return getRuleContext(UnionStyleEnumContext.class,0);
		}
		public RawValueStyleEnumContext rawValueStyleEnum() {
			return getRuleContext(RawValueStyleEnumContext.class,0);
		}
		public EnumDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterEnumDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitEnumDef(this);
		}
	}

	public final EnumDefContext enumDef() throws RecognitionException {
		EnumDefContext _localctx = new EnumDefContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_enumDef);
		try {
			setState(1298);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1296);
				unionStyleEnum();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1297);
				rawValueStyleEnum();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnionStyleEnumContext extends ParserRuleContext {
		public EnumNameContext enumName() {
			return getRuleContext(EnumNameContext.class,0);
		}
		public GenericParameterClauseContext genericParameterClause() {
			return getRuleContext(GenericParameterClauseContext.class,0);
		}
		public TypeInheritanceClauseContext typeInheritanceClause() {
			return getRuleContext(TypeInheritanceClauseContext.class,0);
		}
		public UnionStyleEnumMembersContext unionStyleEnumMembers() {
			return getRuleContext(UnionStyleEnumMembersContext.class,0);
		}
		public UnionStyleEnumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unionStyleEnum; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterUnionStyleEnum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitUnionStyleEnum(this);
		}
	}

	public final UnionStyleEnumContext unionStyleEnum() throws RecognitionException {
		UnionStyleEnumContext _localctx = new UnionStyleEnumContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_unionStyleEnum);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__83) {
				{
				setState(1300);
				match(T__83);
				}
			}

			setState(1303);
			match(T__71);
			setState(1304);
			enumName();
			setState(1306);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__41) {
				{
				setState(1305);
				genericParameterClause();
				}
			}

			setState(1309);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(1308);
				typeInheritanceClause();
				}
			}

			setState(1311);
			match(T__15);
			setState(1313);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__26) | (1L << T__27) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (T__64 - 65)) | (1L << (T__65 - 65)) | (1L << (T__66 - 65)) | (1L << (T__67 - 65)) | (1L << (T__68 - 65)) | (1L << (T__69 - 65)) | (1L << (T__70 - 65)) | (1L << (T__71 - 65)) | (1L << (T__72 - 65)) | (1L << (T__73 - 65)) | (1L << (T__83 - 65)) | (1L << (T__85 - 65)) | (1L << (T__88 - 65)) | (1L << (T__89 - 65)) | (1L << (T__90 - 65)) | (1L << (T__99 - 65)))) != 0) || _la==T__130 || _la==T__140) {
				{
				setState(1312);
				unionStyleEnumMembers();
				}
			}

			setState(1315);
			match(T__16);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnionStyleEnumMembersContext extends ParserRuleContext {
		public List<UnionStyleEnumMemberContext> unionStyleEnumMember() {
			return getRuleContexts(UnionStyleEnumMemberContext.class);
		}
		public UnionStyleEnumMemberContext unionStyleEnumMember(int i) {
			return getRuleContext(UnionStyleEnumMemberContext.class,i);
		}
		public UnionStyleEnumMembersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unionStyleEnumMembers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterUnionStyleEnumMembers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitUnionStyleEnumMembers(this);
		}
	}

	public final UnionStyleEnumMembersContext unionStyleEnumMembers() throws RecognitionException {
		UnionStyleEnumMembersContext _localctx = new UnionStyleEnumMembersContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_unionStyleEnumMembers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1318); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1317);
				unionStyleEnumMember();
				}
				}
				setState(1320); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__26) | (1L << T__27) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (T__64 - 65)) | (1L << (T__65 - 65)) | (1L << (T__66 - 65)) | (1L << (T__67 - 65)) | (1L << (T__68 - 65)) | (1L << (T__69 - 65)) | (1L << (T__70 - 65)) | (1L << (T__71 - 65)) | (1L << (T__72 - 65)) | (1L << (T__73 - 65)) | (1L << (T__83 - 65)) | (1L << (T__85 - 65)) | (1L << (T__88 - 65)) | (1L << (T__89 - 65)) | (1L << (T__90 - 65)) | (1L << (T__99 - 65)))) != 0) || _la==T__130 || _la==T__140 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnionStyleEnumMemberContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public UnionStyleEnumCaseClauseContext unionStyleEnumCaseClause() {
			return getRuleContext(UnionStyleEnumCaseClauseContext.class,0);
		}
		public UnionStyleEnumMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unionStyleEnumMember; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterUnionStyleEnumMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitUnionStyleEnumMember(this);
		}
	}

	public final UnionStyleEnumMemberContext unionStyleEnumMember() throws RecognitionException {
		UnionStyleEnumMemberContext _localctx = new UnionStyleEnumMemberContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_unionStyleEnumMember);
		int _la;
		try {
			setState(1327);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1322);
				declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1323);
				unionStyleEnumCaseClause();
				setState(1325);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(1324);
					match(T__0);
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnionStyleEnumCaseClauseContext extends ParserRuleContext {
		public UnionStyleEnumCaseListContext unionStyleEnumCaseList() {
			return getRuleContext(UnionStyleEnumCaseListContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public UnionStyleEnumCaseClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unionStyleEnumCaseClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterUnionStyleEnumCaseClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitUnionStyleEnumCaseClause(this);
		}
	}

	public final UnionStyleEnumCaseClauseContext unionStyleEnumCaseClause() throws RecognitionException {
		UnionStyleEnumCaseClauseContext _localctx = new UnionStyleEnumCaseClauseContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_unionStyleEnumCaseClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1330);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__99) {
				{
				setState(1329);
				attributes();
				}
			}

			setState(1333);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__83) {
				{
				setState(1332);
				match(T__83);
				}
			}

			setState(1335);
			match(T__7);
			setState(1336);
			unionStyleEnumCaseList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnionStyleEnumCaseListContext extends ParserRuleContext {
		public List<UnionStyleEnumCaseContext> unionStyleEnumCase() {
			return getRuleContexts(UnionStyleEnumCaseContext.class);
		}
		public UnionStyleEnumCaseContext unionStyleEnumCase(int i) {
			return getRuleContext(UnionStyleEnumCaseContext.class,i);
		}
		public UnionStyleEnumCaseListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unionStyleEnumCaseList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterUnionStyleEnumCaseList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitUnionStyleEnumCaseList(this);
		}
	}

	public final UnionStyleEnumCaseListContext unionStyleEnumCaseList() throws RecognitionException {
		UnionStyleEnumCaseListContext _localctx = new UnionStyleEnumCaseListContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_unionStyleEnumCaseList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1338);
			unionStyleEnumCase();
			setState(1343);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__17) {
				{
				{
				setState(1339);
				match(T__17);
				setState(1340);
				unionStyleEnumCase();
				}
				}
				setState(1345);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnionStyleEnumCaseContext extends ParserRuleContext {
		public EnumCaseNameContext enumCaseName() {
			return getRuleContext(EnumCaseNameContext.class,0);
		}
		public TupleTypeContext tupleType() {
			return getRuleContext(TupleTypeContext.class,0);
		}
		public UnionStyleEnumCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unionStyleEnumCase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterUnionStyleEnumCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitUnionStyleEnumCase(this);
		}
	}

	public final UnionStyleEnumCaseContext unionStyleEnumCase() throws RecognitionException {
		UnionStyleEnumCaseContext _localctx = new UnionStyleEnumCaseContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_unionStyleEnumCase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1346);
			enumCaseName();
			setState(1348);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__30) {
				{
				setState(1347);
				tupleType();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public EnumNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterEnumName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitEnumName(this);
		}
	}

	public final EnumNameContext enumName() throws RecognitionException {
		EnumNameContext _localctx = new EnumNameContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_enumName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1350);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumCaseNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public EnumCaseNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumCaseName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterEnumCaseName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitEnumCaseName(this);
		}
	}

	public final EnumCaseNameContext enumCaseName() throws RecognitionException {
		EnumCaseNameContext _localctx = new EnumCaseNameContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_enumCaseName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1352);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RawValueStyleEnumContext extends ParserRuleContext {
		public EnumNameContext enumName() {
			return getRuleContext(EnumNameContext.class,0);
		}
		public GenericParameterClauseContext genericParameterClause() {
			return getRuleContext(GenericParameterClauseContext.class,0);
		}
		public TypeInheritanceClauseContext typeInheritanceClause() {
			return getRuleContext(TypeInheritanceClauseContext.class,0);
		}
		public RawValueStyleEnumMembersContext rawValueStyleEnumMembers() {
			return getRuleContext(RawValueStyleEnumMembersContext.class,0);
		}
		public RawValueStyleEnumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rawValueStyleEnum; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterRawValueStyleEnum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitRawValueStyleEnum(this);
		}
	}

	public final RawValueStyleEnumContext rawValueStyleEnum() throws RecognitionException {
		RawValueStyleEnumContext _localctx = new RawValueStyleEnumContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_rawValueStyleEnum);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1354);
			match(T__71);
			setState(1355);
			enumName();
			setState(1357);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__41) {
				{
				setState(1356);
				genericParameterClause();
				}
			}

			setState(1360);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(1359);
				typeInheritanceClause();
				}
			}

			setState(1362);
			match(T__15);
			setState(1364);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__26) | (1L << T__27) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (T__64 - 65)) | (1L << (T__65 - 65)) | (1L << (T__66 - 65)) | (1L << (T__67 - 65)) | (1L << (T__68 - 65)) | (1L << (T__69 - 65)) | (1L << (T__70 - 65)) | (1L << (T__71 - 65)) | (1L << (T__72 - 65)) | (1L << (T__73 - 65)) | (1L << (T__83 - 65)) | (1L << (T__85 - 65)) | (1L << (T__88 - 65)) | (1L << (T__89 - 65)) | (1L << (T__90 - 65)) | (1L << (T__99 - 65)))) != 0) || _la==T__130 || _la==T__140) {
				{
				setState(1363);
				rawValueStyleEnumMembers();
				}
			}

			setState(1366);
			match(T__16);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RawValueStyleEnumMembersContext extends ParserRuleContext {
		public List<RawValueStyleEnumMemberContext> rawValueStyleEnumMember() {
			return getRuleContexts(RawValueStyleEnumMemberContext.class);
		}
		public RawValueStyleEnumMemberContext rawValueStyleEnumMember(int i) {
			return getRuleContext(RawValueStyleEnumMemberContext.class,i);
		}
		public RawValueStyleEnumMembersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rawValueStyleEnumMembers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterRawValueStyleEnumMembers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitRawValueStyleEnumMembers(this);
		}
	}

	public final RawValueStyleEnumMembersContext rawValueStyleEnumMembers() throws RecognitionException {
		RawValueStyleEnumMembersContext _localctx = new RawValueStyleEnumMembersContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_rawValueStyleEnumMembers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1369); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1368);
				rawValueStyleEnumMember();
				}
				}
				setState(1371); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__26) | (1L << T__27) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (T__64 - 65)) | (1L << (T__65 - 65)) | (1L << (T__66 - 65)) | (1L << (T__67 - 65)) | (1L << (T__68 - 65)) | (1L << (T__69 - 65)) | (1L << (T__70 - 65)) | (1L << (T__71 - 65)) | (1L << (T__72 - 65)) | (1L << (T__73 - 65)) | (1L << (T__83 - 65)) | (1L << (T__85 - 65)) | (1L << (T__88 - 65)) | (1L << (T__89 - 65)) | (1L << (T__90 - 65)) | (1L << (T__99 - 65)))) != 0) || _la==T__130 || _la==T__140 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RawValueStyleEnumMemberContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public RawValueStyleEnumCaseClauseContext rawValueStyleEnumCaseClause() {
			return getRuleContext(RawValueStyleEnumCaseClauseContext.class,0);
		}
		public RawValueStyleEnumMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rawValueStyleEnumMember; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterRawValueStyleEnumMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitRawValueStyleEnumMember(this);
		}
	}

	public final RawValueStyleEnumMemberContext rawValueStyleEnumMember() throws RecognitionException {
		RawValueStyleEnumMemberContext _localctx = new RawValueStyleEnumMemberContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_rawValueStyleEnumMember);
		try {
			setState(1375);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1373);
				declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1374);
				rawValueStyleEnumCaseClause();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RawValueStyleEnumCaseClauseContext extends ParserRuleContext {
		public RawValueStyleEnumCaseListContext rawValueStyleEnumCaseList() {
			return getRuleContext(RawValueStyleEnumCaseListContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public RawValueStyleEnumCaseClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rawValueStyleEnumCaseClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterRawValueStyleEnumCaseClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitRawValueStyleEnumCaseClause(this);
		}
	}

	public final RawValueStyleEnumCaseClauseContext rawValueStyleEnumCaseClause() throws RecognitionException {
		RawValueStyleEnumCaseClauseContext _localctx = new RawValueStyleEnumCaseClauseContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_rawValueStyleEnumCaseClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1378);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__99) {
				{
				setState(1377);
				attributes();
				}
			}

			setState(1380);
			match(T__7);
			setState(1381);
			rawValueStyleEnumCaseList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RawValueStyleEnumCaseListContext extends ParserRuleContext {
		public List<RawValueStyleEnumCaseContext> rawValueStyleEnumCase() {
			return getRuleContexts(RawValueStyleEnumCaseContext.class);
		}
		public RawValueStyleEnumCaseContext rawValueStyleEnumCase(int i) {
			return getRuleContext(RawValueStyleEnumCaseContext.class,i);
		}
		public RawValueStyleEnumCaseListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rawValueStyleEnumCaseList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterRawValueStyleEnumCaseList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitRawValueStyleEnumCaseList(this);
		}
	}

	public final RawValueStyleEnumCaseListContext rawValueStyleEnumCaseList() throws RecognitionException {
		RawValueStyleEnumCaseListContext _localctx = new RawValueStyleEnumCaseListContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_rawValueStyleEnumCaseList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1383);
			rawValueStyleEnumCase();
			setState(1388);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__17) {
				{
				{
				setState(1384);
				match(T__17);
				setState(1385);
				rawValueStyleEnumCase();
				}
				}
				setState(1390);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RawValueStyleEnumCaseContext extends ParserRuleContext {
		public EnumCaseNameContext enumCaseName() {
			return getRuleContext(EnumCaseNameContext.class,0);
		}
		public RawValueAssignmentContext rawValueAssignment() {
			return getRuleContext(RawValueAssignmentContext.class,0);
		}
		public RawValueStyleEnumCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rawValueStyleEnumCase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterRawValueStyleEnumCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitRawValueStyleEnumCase(this);
		}
	}

	public final RawValueStyleEnumCaseContext rawValueStyleEnumCase() throws RecognitionException {
		RawValueStyleEnumCaseContext _localctx = new RawValueStyleEnumCaseContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_rawValueStyleEnumCase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1391);
			enumCaseName();
			setState(1393);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__74) {
				{
				setState(1392);
				rawValueAssignment();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RawValueAssignmentContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public RawValueAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rawValueAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterRawValueAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitRawValueAssignment(this);
		}
	}

	public final RawValueAssignmentContext rawValueAssignment() throws RecognitionException {
		RawValueAssignmentContext _localctx = new RawValueAssignmentContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_rawValueAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1395);
			match(T__74);
			setState(1396);
			literal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StructDeclarationContext extends ParserRuleContext {
		public StructNameContext structName() {
			return getRuleContext(StructNameContext.class,0);
		}
		public StructBodyContext structBody() {
			return getRuleContext(StructBodyContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public AccessLevelModifierContext accessLevelModifier() {
			return getRuleContext(AccessLevelModifierContext.class,0);
		}
		public GenericParameterClauseContext genericParameterClause() {
			return getRuleContext(GenericParameterClauseContext.class,0);
		}
		public TypeInheritanceClauseContext typeInheritanceClause() {
			return getRuleContext(TypeInheritanceClauseContext.class,0);
		}
		public StructDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterStructDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitStructDeclaration(this);
		}
	}

	public final StructDeclarationContext structDeclaration() throws RecognitionException {
		StructDeclarationContext _localctx = new StructDeclarationContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_structDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1399);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__99) {
				{
				setState(1398);
				attributes();
				}
			}

			setState(1402);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & ((1L << (T__62 - 63)) | (1L << (T__64 - 63)) | (1L << (T__65 - 63)) | (1L << (T__66 - 63)) | (1L << (T__67 - 63)))) != 0)) {
				{
				setState(1401);
				accessLevelModifier();
				}
			}

			setState(1404);
			match(T__70);
			setState(1405);
			structName();
			setState(1407);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__41) {
				{
				setState(1406);
				genericParameterClause();
				}
			}

			setState(1410);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(1409);
				typeInheritanceClause();
				}
			}

			setState(1412);
			structBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StructNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public StructNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterStructName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitStructName(this);
		}
	}

	public final StructNameContext structName() throws RecognitionException {
		StructNameContext _localctx = new StructNameContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_structName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1414);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StructBodyContext extends ParserRuleContext {
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public StructBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterStructBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitStructBody(this);
		}
	}

	public final StructBodyContext structBody() throws RecognitionException {
		StructBodyContext _localctx = new StructBodyContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_structBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1416);
			match(T__15);
			setState(1418);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 27)) & ~0x3f) == 0 && ((1L << (_la - 27)) & ((1L << (T__26 - 27)) | (1L << (T__27 - 27)) | (1L << (T__44 - 27)) | (1L << (T__45 - 27)) | (1L << (T__46 - 27)) | (1L << (T__47 - 27)) | (1L << (T__48 - 27)) | (1L << (T__49 - 27)) | (1L << (T__50 - 27)) | (1L << (T__51 - 27)) | (1L << (T__52 - 27)) | (1L << (T__53 - 27)) | (1L << (T__54 - 27)) | (1L << (T__55 - 27)) | (1L << (T__56 - 27)) | (1L << (T__57 - 27)) | (1L << (T__58 - 27)) | (1L << (T__61 - 27)) | (1L << (T__62 - 27)) | (1L << (T__64 - 27)) | (1L << (T__65 - 27)) | (1L << (T__66 - 27)) | (1L << (T__67 - 27)) | (1L << (T__68 - 27)) | (1L << (T__69 - 27)) | (1L << (T__70 - 27)) | (1L << (T__71 - 27)) | (1L << (T__72 - 27)) | (1L << (T__73 - 27)) | (1L << (T__83 - 27)) | (1L << (T__85 - 27)) | (1L << (T__88 - 27)) | (1L << (T__89 - 27)))) != 0) || ((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & ((1L << (T__90 - 91)) | (1L << (T__99 - 91)) | (1L << (T__130 - 91)) | (1L << (T__140 - 91)))) != 0)) {
				{
				setState(1417);
				declarations();
				}
			}

			setState(1420);
			match(T__16);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassDeclarationContext extends ParserRuleContext {
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public ClassDeclarationModifiersContext classDeclarationModifiers() {
			return getRuleContext(ClassDeclarationModifiersContext.class,0);
		}
		public GenericParameterClauseContext genericParameterClause() {
			return getRuleContext(GenericParameterClauseContext.class,0);
		}
		public TypeInheritanceClauseContext typeInheritanceClause() {
			return getRuleContext(TypeInheritanceClauseContext.class,0);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitClassDeclaration(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1423);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__99) {
				{
				setState(1422);
				attributes();
				}
			}

			setState(1426);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 48)) & ~0x3f) == 0 && ((1L << (_la - 48)) & ((1L << (T__47 - 48)) | (1L << (T__62 - 48)) | (1L << (T__64 - 48)) | (1L << (T__65 - 48)) | (1L << (T__66 - 48)) | (1L << (T__67 - 48)))) != 0)) {
				{
				setState(1425);
				classDeclarationModifiers();
				}
			}

			setState(1428);
			match(T__44);
			setState(1429);
			className();
			setState(1431);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__41) {
				{
				setState(1430);
				genericParameterClause();
				}
			}

			setState(1434);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(1433);
				typeInheritanceClause();
				}
			}

			setState(1436);
			classBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassDeclarationModifiersContext extends ParserRuleContext {
		public AccessLevelModifierContext accessLevelModifier() {
			return getRuleContext(AccessLevelModifierContext.class,0);
		}
		public ClassDeclarationModifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclarationModifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterClassDeclarationModifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitClassDeclarationModifiers(this);
		}
	}

	public final ClassDeclarationModifiersContext classDeclarationModifiers() throws RecognitionException {
		ClassDeclarationModifiersContext _localctx = new ClassDeclarationModifiersContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_classDeclarationModifiers);
		int _la;
		try {
			setState(1446);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__62:
			case T__64:
			case T__65:
			case T__66:
			case T__67:
				enterOuterAlt(_localctx, 1);
				{
				setState(1438);
				accessLevelModifier();
				setState(1440);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__47) {
					{
					setState(1439);
					match(T__47);
					}
				}

				}
				break;
			case T__47:
				enterOuterAlt(_localctx, 2);
				{
				setState(1442);
				match(T__47);
				setState(1444);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & ((1L << (T__62 - 63)) | (1L << (T__64 - 63)) | (1L << (T__65 - 63)) | (1L << (T__66 - 63)) | (1L << (T__67 - 63)))) != 0)) {
					{
					setState(1443);
					accessLevelModifier();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ClassNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_className; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterClassName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitClassName(this);
		}
	}

	public final ClassNameContext className() throws RecognitionException {
		ClassNameContext _localctx = new ClassNameContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_className);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1448);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassBodyContext extends ParserRuleContext {
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitClassBody(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1450);
			match(T__15);
			setState(1452);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 27)) & ~0x3f) == 0 && ((1L << (_la - 27)) & ((1L << (T__26 - 27)) | (1L << (T__27 - 27)) | (1L << (T__44 - 27)) | (1L << (T__45 - 27)) | (1L << (T__46 - 27)) | (1L << (T__47 - 27)) | (1L << (T__48 - 27)) | (1L << (T__49 - 27)) | (1L << (T__50 - 27)) | (1L << (T__51 - 27)) | (1L << (T__52 - 27)) | (1L << (T__53 - 27)) | (1L << (T__54 - 27)) | (1L << (T__55 - 27)) | (1L << (T__56 - 27)) | (1L << (T__57 - 27)) | (1L << (T__58 - 27)) | (1L << (T__61 - 27)) | (1L << (T__62 - 27)) | (1L << (T__64 - 27)) | (1L << (T__65 - 27)) | (1L << (T__66 - 27)) | (1L << (T__67 - 27)) | (1L << (T__68 - 27)) | (1L << (T__69 - 27)) | (1L << (T__70 - 27)) | (1L << (T__71 - 27)) | (1L << (T__72 - 27)) | (1L << (T__73 - 27)) | (1L << (T__83 - 27)) | (1L << (T__85 - 27)) | (1L << (T__88 - 27)) | (1L << (T__89 - 27)))) != 0) || ((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & ((1L << (T__90 - 91)) | (1L << (T__99 - 91)) | (1L << (T__130 - 91)) | (1L << (T__140 - 91)))) != 0)) {
				{
				setState(1451);
				declarations();
				}
			}

			setState(1454);
			match(T__16);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProtocolDeclarationContext extends ParserRuleContext {
		public ProtocolNameContext protocolName() {
			return getRuleContext(ProtocolNameContext.class,0);
		}
		public ProtocolBodyContext protocolBody() {
			return getRuleContext(ProtocolBodyContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public AccessLevelModifierContext accessLevelModifier() {
			return getRuleContext(AccessLevelModifierContext.class,0);
		}
		public TypeInheritanceClauseContext typeInheritanceClause() {
			return getRuleContext(TypeInheritanceClauseContext.class,0);
		}
		public ProtocolDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocolDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterProtocolDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitProtocolDeclaration(this);
		}
	}

	public final ProtocolDeclarationContext protocolDeclaration() throws RecognitionException {
		ProtocolDeclarationContext _localctx = new ProtocolDeclarationContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_protocolDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1457);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__99) {
				{
				setState(1456);
				attributes();
				}
			}

			setState(1460);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & ((1L << (T__62 - 63)) | (1L << (T__64 - 63)) | (1L << (T__65 - 63)) | (1L << (T__66 - 63)) | (1L << (T__67 - 63)))) != 0)) {
				{
				setState(1459);
				accessLevelModifier();
				}
			}

			setState(1462);
			match(T__72);
			setState(1463);
			protocolName();
			setState(1465);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(1464);
				typeInheritanceClause();
				}
			}

			setState(1467);
			protocolBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProtocolNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ProtocolNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocolName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterProtocolName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitProtocolName(this);
		}
	}

	public final ProtocolNameContext protocolName() throws RecognitionException {
		ProtocolNameContext _localctx = new ProtocolNameContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_protocolName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1469);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProtocolBodyContext extends ParserRuleContext {
		public ProtocolMemberDeclarationsContext protocolMemberDeclarations() {
			return getRuleContext(ProtocolMemberDeclarationsContext.class,0);
		}
		public ProtocolBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocolBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterProtocolBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitProtocolBody(this);
		}
	}

	public final ProtocolBodyContext protocolBody() throws RecognitionException {
		ProtocolBodyContext _localctx = new ProtocolBodyContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_protocolBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1471);
			match(T__15);
			setState(1473);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__27) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (T__64 - 65)) | (1L << (T__65 - 65)) | (1L << (T__66 - 65)) | (1L << (T__67 - 65)) | (1L << (T__73 - 65)) | (1L << (T__84 - 65)) | (1L << (T__85 - 65)) | (1L << (T__90 - 65)) | (1L << (T__99 - 65)))) != 0)) {
				{
				setState(1472);
				protocolMemberDeclarations();
				}
			}

			setState(1475);
			match(T__16);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProtocolMemberDeclarationContext extends ParserRuleContext {
		public ProtocolPropertyDeclarationContext protocolPropertyDeclaration() {
			return getRuleContext(ProtocolPropertyDeclarationContext.class,0);
		}
		public ProtocolMethodDeclarationContext protocolMethodDeclaration() {
			return getRuleContext(ProtocolMethodDeclarationContext.class,0);
		}
		public ProtocolInitializerDeclarationContext protocolInitializerDeclaration() {
			return getRuleContext(ProtocolInitializerDeclarationContext.class,0);
		}
		public ProtocolSubscriptDeclarationContext protocolSubscriptDeclaration() {
			return getRuleContext(ProtocolSubscriptDeclarationContext.class,0);
		}
		public ProtocolAssociatedTypeDeclarationContext protocolAssociatedTypeDeclaration() {
			return getRuleContext(ProtocolAssociatedTypeDeclarationContext.class,0);
		}
		public ProtocolMemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocolMemberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterProtocolMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitProtocolMemberDeclaration(this);
		}
	}

	public final ProtocolMemberDeclarationContext protocolMemberDeclaration() throws RecognitionException {
		ProtocolMemberDeclarationContext _localctx = new ProtocolMemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_protocolMemberDeclaration);
		int _la;
		try {
			setState(1497);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1477);
				protocolPropertyDeclaration();
				setState(1479);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(1478);
					match(T__0);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1481);
				protocolMethodDeclaration();
				setState(1483);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(1482);
					match(T__0);
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1485);
				protocolInitializerDeclaration();
				setState(1487);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(1486);
					match(T__0);
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1489);
				protocolSubscriptDeclaration();
				setState(1491);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(1490);
					match(T__0);
					}
				}

				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1493);
				protocolAssociatedTypeDeclaration();
				setState(1495);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(1494);
					match(T__0);
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProtocolMemberDeclarationsContext extends ParserRuleContext {
		public List<ProtocolMemberDeclarationContext> protocolMemberDeclaration() {
			return getRuleContexts(ProtocolMemberDeclarationContext.class);
		}
		public ProtocolMemberDeclarationContext protocolMemberDeclaration(int i) {
			return getRuleContext(ProtocolMemberDeclarationContext.class,i);
		}
		public ProtocolMemberDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocolMemberDeclarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterProtocolMemberDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitProtocolMemberDeclarations(this);
		}
	}

	public final ProtocolMemberDeclarationsContext protocolMemberDeclarations() throws RecognitionException {
		ProtocolMemberDeclarationsContext _localctx = new ProtocolMemberDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_protocolMemberDeclarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1500); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1499);
				protocolMemberDeclaration();
				}
				}
				setState(1502); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__27) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (T__64 - 65)) | (1L << (T__65 - 65)) | (1L << (T__66 - 65)) | (1L << (T__67 - 65)) | (1L << (T__73 - 65)) | (1L << (T__84 - 65)) | (1L << (T__85 - 65)) | (1L << (T__90 - 65)) | (1L << (T__99 - 65)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProtocolPropertyDeclarationContext extends ParserRuleContext {
		public VariableDeclarationHeadContext variableDeclarationHead() {
			return getRuleContext(VariableDeclarationHeadContext.class,0);
		}
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public GetterSetterKeywordBlockContext getterSetterKeywordBlock() {
			return getRuleContext(GetterSetterKeywordBlockContext.class,0);
		}
		public ProtocolPropertyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocolPropertyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterProtocolPropertyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitProtocolPropertyDeclaration(this);
		}
	}

	public final ProtocolPropertyDeclarationContext protocolPropertyDeclaration() throws RecognitionException {
		ProtocolPropertyDeclarationContext _localctx = new ProtocolPropertyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_protocolPropertyDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1504);
			variableDeclarationHead();
			setState(1505);
			variableName();
			setState(1506);
			typeAnnotation();
			setState(1507);
			getterSetterKeywordBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProtocolMethodDeclarationContext extends ParserRuleContext {
		public FunctionHeadContext functionHead() {
			return getRuleContext(FunctionHeadContext.class,0);
		}
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public FunctionSignatureContext functionSignature() {
			return getRuleContext(FunctionSignatureContext.class,0);
		}
		public GenericParameterClauseContext genericParameterClause() {
			return getRuleContext(GenericParameterClauseContext.class,0);
		}
		public ProtocolMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocolMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterProtocolMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitProtocolMethodDeclaration(this);
		}
	}

	public final ProtocolMethodDeclarationContext protocolMethodDeclaration() throws RecognitionException {
		ProtocolMethodDeclarationContext _localctx = new ProtocolMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_protocolMethodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1509);
			functionHead();
			setState(1510);
			functionName();
			setState(1512);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__41) {
				{
				setState(1511);
				genericParameterClause();
				}
			}

			setState(1514);
			functionSignature();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProtocolInitializerDeclarationContext extends ParserRuleContext {
		public InitializerHeadContext initializerHead() {
			return getRuleContext(InitializerHeadContext.class,0);
		}
		public ParameterClauseContext parameterClause() {
			return getRuleContext(ParameterClauseContext.class,0);
		}
		public GenericParameterClauseContext genericParameterClause() {
			return getRuleContext(GenericParameterClauseContext.class,0);
		}
		public ProtocolInitializerDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocolInitializerDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterProtocolInitializerDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitProtocolInitializerDeclaration(this);
		}
	}

	public final ProtocolInitializerDeclarationContext protocolInitializerDeclaration() throws RecognitionException {
		ProtocolInitializerDeclarationContext _localctx = new ProtocolInitializerDeclarationContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_protocolInitializerDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1516);
			initializerHead();
			setState(1518);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__41) {
				{
				setState(1517);
				genericParameterClause();
				}
			}

			setState(1520);
			parameterClause();
			setState(1522);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__78 || _la==T__79) {
				{
				setState(1521);
				_la = _input.LA(1);
				if ( !(_la==T__78 || _la==T__79) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProtocolSubscriptDeclarationContext extends ParserRuleContext {
		public SubscriptHeadContext subscriptHead() {
			return getRuleContext(SubscriptHeadContext.class,0);
		}
		public SubscriptResultContext subscriptResult() {
			return getRuleContext(SubscriptResultContext.class,0);
		}
		public GetterSetterKeywordBlockContext getterSetterKeywordBlock() {
			return getRuleContext(GetterSetterKeywordBlockContext.class,0);
		}
		public ProtocolSubscriptDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocolSubscriptDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterProtocolSubscriptDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitProtocolSubscriptDeclaration(this);
		}
	}

	public final ProtocolSubscriptDeclarationContext protocolSubscriptDeclaration() throws RecognitionException {
		ProtocolSubscriptDeclarationContext _localctx = new ProtocolSubscriptDeclarationContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_protocolSubscriptDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1524);
			subscriptHead();
			setState(1525);
			subscriptResult();
			setState(1526);
			getterSetterKeywordBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProtocolAssociatedTypeDeclarationContext extends ParserRuleContext {
		public TypealiasNameContext typealiasName() {
			return getRuleContext(TypealiasNameContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public AccessLevelModifierContext accessLevelModifier() {
			return getRuleContext(AccessLevelModifierContext.class,0);
		}
		public TypeInheritanceClauseContext typeInheritanceClause() {
			return getRuleContext(TypeInheritanceClauseContext.class,0);
		}
		public TypealiasAssignmentContext typealiasAssignment() {
			return getRuleContext(TypealiasAssignmentContext.class,0);
		}
		public ProtocolAssociatedTypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocolAssociatedTypeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterProtocolAssociatedTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitProtocolAssociatedTypeDeclaration(this);
		}
	}

	public final ProtocolAssociatedTypeDeclarationContext protocolAssociatedTypeDeclaration() throws RecognitionException {
		ProtocolAssociatedTypeDeclarationContext _localctx = new ProtocolAssociatedTypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_protocolAssociatedTypeDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1529);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__99) {
				{
				setState(1528);
				attributes();
				}
			}

			setState(1532);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & ((1L << (T__62 - 63)) | (1L << (T__64 - 63)) | (1L << (T__65 - 63)) | (1L << (T__66 - 63)) | (1L << (T__67 - 63)))) != 0)) {
				{
				setState(1531);
				accessLevelModifier();
				}
			}

			setState(1534);
			match(T__84);
			setState(1535);
			typealiasName();
			setState(1537);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(1536);
				typeInheritanceClause();
				}
			}

			setState(1540);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__74) {
				{
				setState(1539);
				typealiasAssignment();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitializerDeclarationContext extends ParserRuleContext {
		public InitializerHeadContext initializerHead() {
			return getRuleContext(InitializerHeadContext.class,0);
		}
		public ParameterClauseContext parameterClause() {
			return getRuleContext(ParameterClauseContext.class,0);
		}
		public InitializerBodyContext initializerBody() {
			return getRuleContext(InitializerBodyContext.class,0);
		}
		public GenericParameterClauseContext genericParameterClause() {
			return getRuleContext(GenericParameterClauseContext.class,0);
		}
		public InitializerDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializerDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterInitializerDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitInitializerDeclaration(this);
		}
	}

	public final InitializerDeclarationContext initializerDeclaration() throws RecognitionException {
		InitializerDeclarationContext _localctx = new InitializerDeclarationContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_initializerDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1542);
			initializerHead();
			setState(1544);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__41) {
				{
				setState(1543);
				genericParameterClause();
				}
			}

			setState(1546);
			parameterClause();
			setState(1548);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__78 || _la==T__79) {
				{
				setState(1547);
				_la = _input.LA(1);
				if ( !(_la==T__78 || _la==T__79) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1550);
			initializerBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitializerHeadContext extends ParserRuleContext {
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public DeclarationModifiersContext declarationModifiers() {
			return getRuleContext(DeclarationModifiersContext.class,0);
		}
		public InitializerHeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializerHead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterInitializerHead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitInitializerHead(this);
		}
	}

	public final InitializerHeadContext initializerHead() throws RecognitionException {
		InitializerHeadContext _localctx = new InitializerHeadContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_initializerHead);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1553);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__99) {
				{
				setState(1552);
				attributes();
				}
			}

			setState(1556);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 45)) & ~0x3f) == 0 && ((1L << (_la - 45)) & ((1L << (T__44 - 45)) | (1L << (T__45 - 45)) | (1L << (T__46 - 45)) | (1L << (T__47 - 45)) | (1L << (T__48 - 45)) | (1L << (T__49 - 45)) | (1L << (T__50 - 45)) | (1L << (T__51 - 45)) | (1L << (T__52 - 45)) | (1L << (T__53 - 45)) | (1L << (T__54 - 45)) | (1L << (T__55 - 45)) | (1L << (T__56 - 45)) | (1L << (T__57 - 45)) | (1L << (T__58 - 45)) | (1L << (T__61 - 45)) | (1L << (T__62 - 45)) | (1L << (T__64 - 45)) | (1L << (T__65 - 45)) | (1L << (T__66 - 45)) | (1L << (T__67 - 45)))) != 0)) {
				{
				setState(1555);
				declarationModifiers();
				}
			}

			setState(1558);
			match(T__85);
			setState(1560);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__86 || _la==T__87) {
				{
				setState(1559);
				_la = _input.LA(1);
				if ( !(_la==T__86 || _la==T__87) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitializerBodyContext extends ParserRuleContext {
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public InitializerBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializerBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterInitializerBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitInitializerBody(this);
		}
	}

	public final InitializerBodyContext initializerBody() throws RecognitionException {
		InitializerBodyContext _localctx = new InitializerBodyContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_initializerBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1562);
			codeBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeinitializerDeclarationContext extends ParserRuleContext {
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public DeinitializerDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deinitializerDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterDeinitializerDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitDeinitializerDeclaration(this);
		}
	}

	public final DeinitializerDeclarationContext deinitializerDeclaration() throws RecognitionException {
		DeinitializerDeclarationContext _localctx = new DeinitializerDeclarationContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_deinitializerDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1565);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__99) {
				{
				setState(1564);
				attributes();
				}
			}

			setState(1567);
			match(T__88);
			setState(1568);
			codeBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExtensionDeclarationContext extends ParserRuleContext {
		public TypeIdentifierContext typeIdentifier() {
			return getRuleContext(TypeIdentifierContext.class,0);
		}
		public ExtensionBodyContext extensionBody() {
			return getRuleContext(ExtensionBodyContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public AccessLevelModifierContext accessLevelModifier() {
			return getRuleContext(AccessLevelModifierContext.class,0);
		}
		public RequirementClauseContext requirementClause() {
			return getRuleContext(RequirementClauseContext.class,0);
		}
		public TypeInheritanceClauseContext typeInheritanceClause() {
			return getRuleContext(TypeInheritanceClauseContext.class,0);
		}
		public ExtensionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extensionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterExtensionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitExtensionDeclaration(this);
		}
	}

	public final ExtensionDeclarationContext extensionDeclaration() throws RecognitionException {
		ExtensionDeclarationContext _localctx = new ExtensionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_extensionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1571);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__99) {
				{
				setState(1570);
				attributes();
				}
			}

			setState(1574);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & ((1L << (T__62 - 63)) | (1L << (T__64 - 63)) | (1L << (T__65 - 63)) | (1L << (T__66 - 63)) | (1L << (T__67 - 63)))) != 0)) {
				{
				setState(1573);
				accessLevelModifier();
				}
			}

			setState(1576);
			match(T__89);
			setState(1577);
			typeIdentifier();
			setState(1580);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__28:
				{
				setState(1578);
				requirementClause();
				}
				break;
			case T__1:
				{
				setState(1579);
				typeInheritanceClause();
				}
				break;
			case T__15:
				break;
			default:
				break;
			}
			setState(1582);
			extensionBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExtensionBodyContext extends ParserRuleContext {
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public ExtensionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extensionBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterExtensionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitExtensionBody(this);
		}
	}

	public final ExtensionBodyContext extensionBody() throws RecognitionException {
		ExtensionBodyContext _localctx = new ExtensionBodyContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_extensionBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1584);
			match(T__15);
			setState(1586);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 27)) & ~0x3f) == 0 && ((1L << (_la - 27)) & ((1L << (T__26 - 27)) | (1L << (T__27 - 27)) | (1L << (T__44 - 27)) | (1L << (T__45 - 27)) | (1L << (T__46 - 27)) | (1L << (T__47 - 27)) | (1L << (T__48 - 27)) | (1L << (T__49 - 27)) | (1L << (T__50 - 27)) | (1L << (T__51 - 27)) | (1L << (T__52 - 27)) | (1L << (T__53 - 27)) | (1L << (T__54 - 27)) | (1L << (T__55 - 27)) | (1L << (T__56 - 27)) | (1L << (T__57 - 27)) | (1L << (T__58 - 27)) | (1L << (T__61 - 27)) | (1L << (T__62 - 27)) | (1L << (T__64 - 27)) | (1L << (T__65 - 27)) | (1L << (T__66 - 27)) | (1L << (T__67 - 27)) | (1L << (T__68 - 27)) | (1L << (T__69 - 27)) | (1L << (T__70 - 27)) | (1L << (T__71 - 27)) | (1L << (T__72 - 27)) | (1L << (T__73 - 27)) | (1L << (T__83 - 27)) | (1L << (T__85 - 27)) | (1L << (T__88 - 27)) | (1L << (T__89 - 27)))) != 0) || ((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & ((1L << (T__90 - 91)) | (1L << (T__99 - 91)) | (1L << (T__130 - 91)) | (1L << (T__140 - 91)))) != 0)) {
				{
				setState(1585);
				declarations();
				}
			}

			setState(1588);
			match(T__16);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubscriptDeclarationContext extends ParserRuleContext {
		public SubscriptHeadContext subscriptHead() {
			return getRuleContext(SubscriptHeadContext.class,0);
		}
		public SubscriptResultContext subscriptResult() {
			return getRuleContext(SubscriptResultContext.class,0);
		}
		public GetterSetterBlockContext getterSetterBlock() {
			return getRuleContext(GetterSetterBlockContext.class,0);
		}
		public GetterSetterKeywordBlockContext getterSetterKeywordBlock() {
			return getRuleContext(GetterSetterKeywordBlockContext.class,0);
		}
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public SubscriptDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subscriptDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterSubscriptDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitSubscriptDeclaration(this);
		}
	}

	public final SubscriptDeclarationContext subscriptDeclaration() throws RecognitionException {
		SubscriptDeclarationContext _localctx = new SubscriptDeclarationContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_subscriptDeclaration);
		try {
			setState(1602);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,182,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1590);
				subscriptHead();
				setState(1591);
				subscriptResult();
				setState(1592);
				getterSetterBlock();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1594);
				subscriptHead();
				setState(1595);
				subscriptResult();
				setState(1596);
				getterSetterKeywordBlock();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1598);
				subscriptHead();
				setState(1599);
				subscriptResult();
				setState(1600);
				codeBlock();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubscriptHeadContext extends ParserRuleContext {
		public ParameterClauseContext parameterClause() {
			return getRuleContext(ParameterClauseContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public DeclarationModifiersContext declarationModifiers() {
			return getRuleContext(DeclarationModifiersContext.class,0);
		}
		public SubscriptHeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subscriptHead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterSubscriptHead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitSubscriptHead(this);
		}
	}

	public final SubscriptHeadContext subscriptHead() throws RecognitionException {
		SubscriptHeadContext _localctx = new SubscriptHeadContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_subscriptHead);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1605);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__99) {
				{
				setState(1604);
				attributes();
				}
			}

			setState(1608);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 45)) & ~0x3f) == 0 && ((1L << (_la - 45)) & ((1L << (T__44 - 45)) | (1L << (T__45 - 45)) | (1L << (T__46 - 45)) | (1L << (T__47 - 45)) | (1L << (T__48 - 45)) | (1L << (T__49 - 45)) | (1L << (T__50 - 45)) | (1L << (T__51 - 45)) | (1L << (T__52 - 45)) | (1L << (T__53 - 45)) | (1L << (T__54 - 45)) | (1L << (T__55 - 45)) | (1L << (T__56 - 45)) | (1L << (T__57 - 45)) | (1L << (T__58 - 45)) | (1L << (T__61 - 45)) | (1L << (T__62 - 45)) | (1L << (T__64 - 45)) | (1L << (T__65 - 45)) | (1L << (T__66 - 45)) | (1L << (T__67 - 45)))) != 0)) {
				{
				setState(1607);
				declarationModifiers();
				}
			}

			setState(1610);
			match(T__90);
			setState(1611);
			parameterClause();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubscriptResultContext extends ParserRuleContext {
		public STypeContext sType() {
			return getRuleContext(STypeContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public SubscriptResultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subscriptResult; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterSubscriptResult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitSubscriptResult(this);
		}
	}

	public final SubscriptResultContext subscriptResult() throws RecognitionException {
		SubscriptResultContext _localctx = new SubscriptResultContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_subscriptResult);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1613);
			match(T__80);
			setState(1615);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__99) {
				{
				setState(1614);
				attributes();
				}
			}

			setState(1617);
			sType(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperatorDeclarationContext extends ParserRuleContext {
		public PrefixOperatorDeclarationContext prefixOperatorDeclaration() {
			return getRuleContext(PrefixOperatorDeclarationContext.class,0);
		}
		public PostfixOperatorDeclarationContext postfixOperatorDeclaration() {
			return getRuleContext(PostfixOperatorDeclarationContext.class,0);
		}
		public InfixOperatorDeclarationContext infixOperatorDeclaration() {
			return getRuleContext(InfixOperatorDeclarationContext.class,0);
		}
		public OperatorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterOperatorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitOperatorDeclaration(this);
		}
	}

	public final OperatorDeclarationContext operatorDeclaration() throws RecognitionException {
		OperatorDeclarationContext _localctx = new OperatorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_operatorDeclaration);
		try {
			setState(1622);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__55:
				enterOuterAlt(_localctx, 1);
				{
				setState(1619);
				prefixOperatorDeclaration();
				}
				break;
			case T__54:
				enterOuterAlt(_localctx, 2);
				{
				setState(1620);
				postfixOperatorDeclaration();
				}
				break;
			case T__48:
				enterOuterAlt(_localctx, 3);
				{
				setState(1621);
				infixOperatorDeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrefixOperatorDeclarationContext extends ParserRuleContext {
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public PrefixOperatorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefixOperatorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterPrefixOperatorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitPrefixOperatorDeclaration(this);
		}
	}

	public final PrefixOperatorDeclarationContext prefixOperatorDeclaration() throws RecognitionException {
		PrefixOperatorDeclarationContext _localctx = new PrefixOperatorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_prefixOperatorDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1624);
			match(T__55);
			setState(1625);
			match(T__91);
			setState(1626);
			operator();
			setState(1627);
			match(T__15);
			setState(1628);
			match(T__16);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostfixOperatorDeclarationContext extends ParserRuleContext {
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public PostfixOperatorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixOperatorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterPostfixOperatorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitPostfixOperatorDeclaration(this);
		}
	}

	public final PostfixOperatorDeclarationContext postfixOperatorDeclaration() throws RecognitionException {
		PostfixOperatorDeclarationContext _localctx = new PostfixOperatorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_postfixOperatorDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1630);
			match(T__54);
			setState(1631);
			match(T__91);
			setState(1632);
			operator();
			setState(1633);
			match(T__15);
			setState(1634);
			match(T__16);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InfixOperatorDeclarationContext extends ParserRuleContext {
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public InfixOperatorAttributesContext infixOperatorAttributes() {
			return getRuleContext(InfixOperatorAttributesContext.class,0);
		}
		public InfixOperatorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_infixOperatorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterInfixOperatorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitInfixOperatorDeclaration(this);
		}
	}

	public final InfixOperatorDeclarationContext infixOperatorDeclaration() throws RecognitionException {
		InfixOperatorDeclarationContext _localctx = new InfixOperatorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_infixOperatorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1636);
			match(T__48);
			setState(1637);
			match(T__91);
			setState(1638);
			operator();
			setState(1639);
			match(T__15);
			setState(1641);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__92 || _la==T__93) {
				{
				setState(1640);
				infixOperatorAttributes();
				}
			}

			setState(1643);
			match(T__16);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InfixOperatorAttributesContext extends ParserRuleContext {
		public PrecedenceClauseContext precedenceClause() {
			return getRuleContext(PrecedenceClauseContext.class,0);
		}
		public AssociativityClauseContext associativityClause() {
			return getRuleContext(AssociativityClauseContext.class,0);
		}
		public InfixOperatorAttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_infixOperatorAttributes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterInfixOperatorAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitInfixOperatorAttributes(this);
		}
	}

	public final InfixOperatorAttributesContext infixOperatorAttributes() throws RecognitionException {
		InfixOperatorAttributesContext _localctx = new InfixOperatorAttributesContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_infixOperatorAttributes);
		int _la;
		try {
			setState(1653);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__92:
				enterOuterAlt(_localctx, 1);
				{
				setState(1645);
				precedenceClause();
				setState(1647);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__93) {
					{
					setState(1646);
					associativityClause();
					}
				}

				}
				break;
			case T__93:
				enterOuterAlt(_localctx, 2);
				{
				setState(1649);
				associativityClause();
				setState(1651);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__92) {
					{
					setState(1650);
					precedenceClause();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrecedenceClauseContext extends ParserRuleContext {
		public PrecedenceLevelContext precedenceLevel() {
			return getRuleContext(PrecedenceLevelContext.class,0);
		}
		public PrecedenceClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_precedenceClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterPrecedenceClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitPrecedenceClause(this);
		}
	}

	public final PrecedenceClauseContext precedenceClause() throws RecognitionException {
		PrecedenceClauseContext _localctx = new PrecedenceClauseContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_precedenceClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1655);
			match(T__92);
			setState(1656);
			precedenceLevel();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrecedenceLevelContext extends ParserRuleContext {
		public IntegerLiteralContext integerLiteral() {
			return getRuleContext(IntegerLiteralContext.class,0);
		}
		public PrecedenceLevelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_precedenceLevel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterPrecedenceLevel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitPrecedenceLevel(this);
		}
	}

	public final PrecedenceLevelContext precedenceLevel() throws RecognitionException {
		PrecedenceLevelContext _localctx = new PrecedenceLevelContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_precedenceLevel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1658);
			integerLiteral();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssociativityClauseContext extends ParserRuleContext {
		public AssociativityContext associativity() {
			return getRuleContext(AssociativityContext.class,0);
		}
		public AssociativityClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_associativityClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterAssociativityClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitAssociativityClause(this);
		}
	}

	public final AssociativityClauseContext associativityClause() throws RecognitionException {
		AssociativityClauseContext _localctx = new AssociativityClauseContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_associativityClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1660);
			match(T__93);
			setState(1661);
			associativity();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssociativityContext extends ParserRuleContext {
		public AssociativityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_associativity; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterAssociativity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitAssociativity(this);
		}
	}

	public final AssociativityContext associativity() throws RecognitionException {
		AssociativityContext _localctx = new AssociativityContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_associativity);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1663);
			_la = _input.LA(1);
			if ( !(((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & ((1L << (T__94 - 95)) | (1L << (T__95 - 95)) | (1L << (T__96 - 95)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PatternContext extends ParserRuleContext {
		public WildcardPatternContext wildcardPattern() {
			return getRuleContext(WildcardPatternContext.class,0);
		}
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public IdentifierPatternContext identifierPattern() {
			return getRuleContext(IdentifierPatternContext.class,0);
		}
		public ValueBindingPatternContext valueBindingPattern() {
			return getRuleContext(ValueBindingPatternContext.class,0);
		}
		public TuplePatternContext tuplePattern() {
			return getRuleContext(TuplePatternContext.class,0);
		}
		public EnumCasePatternContext enumCasePattern() {
			return getRuleContext(EnumCasePatternContext.class,0);
		}
		public STypeContext sType() {
			return getRuleContext(STypeContext.class,0);
		}
		public ExpressionPatternContext expressionPattern() {
			return getRuleContext(ExpressionPatternContext.class,0);
		}
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public PatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitPattern(this);
		}
	}

	public final PatternContext pattern() throws RecognitionException {
		return pattern(0);
	}

	private PatternContext pattern(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PatternContext _localctx = new PatternContext(_ctx, _parentState);
		PatternContext _prevctx = _localctx;
		int _startState = 302;
		enterRecursionRule(_localctx, 302, RULE_pattern, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1683);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
			case 1:
				{
				setState(1666);
				wildcardPattern();
				setState(1668);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,191,_ctx) ) {
				case 1:
					{
					setState(1667);
					typeAnnotation();
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(1670);
				identifierPattern();
				setState(1672);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,192,_ctx) ) {
				case 1:
					{
					setState(1671);
					typeAnnotation();
					}
					break;
				}
				}
				break;
			case 3:
				{
				setState(1674);
				valueBindingPattern();
				}
				break;
			case 4:
				{
				setState(1675);
				tuplePattern();
				setState(1677);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,193,_ctx) ) {
				case 1:
					{
					setState(1676);
					typeAnnotation();
					}
					break;
				}
				}
				break;
			case 5:
				{
				setState(1679);
				enumCasePattern();
				}
				break;
			case 6:
				{
				setState(1680);
				match(T__97);
				setState(1681);
				sType(0);
				}
				break;
			case 7:
				{
				setState(1682);
				expressionPattern();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1690);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,195,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PatternContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_pattern);
					setState(1685);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(1686);
					match(T__98);
					setState(1687);
					sType(0);
					}
					} 
				}
				setState(1692);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,195,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class WildcardPatternContext extends ParserRuleContext {
		public WildcardPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wildcardPattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterWildcardPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitWildcardPattern(this);
		}
	}

	public final WildcardPatternContext wildcardPattern() throws RecognitionException {
		WildcardPatternContext _localctx = new WildcardPatternContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_wildcardPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1693);
			match(T__82);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierPatternContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public IdentifierPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierPattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterIdentifierPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitIdentifierPattern(this);
		}
	}

	public final IdentifierPatternContext identifierPattern() throws RecognitionException {
		IdentifierPatternContext _localctx = new IdentifierPatternContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_identifierPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1695);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueBindingPatternContext extends ParserRuleContext {
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public ValueBindingPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueBindingPattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterValueBindingPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitValueBindingPattern(this);
		}
	}

	public final ValueBindingPatternContext valueBindingPattern() throws RecognitionException {
		ValueBindingPatternContext _localctx = new ValueBindingPatternContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_valueBindingPattern);
		try {
			setState(1701);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__27:
				enterOuterAlt(_localctx, 1);
				{
				setState(1697);
				match(T__27);
				setState(1698);
				pattern(0);
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 2);
				{
				setState(1699);
				match(T__26);
				setState(1700);
				pattern(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TuplePatternContext extends ParserRuleContext {
		public TuplePatternElementListContext tuplePatternElementList() {
			return getRuleContext(TuplePatternElementListContext.class,0);
		}
		public TuplePatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuplePattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterTuplePattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitTuplePattern(this);
		}
	}

	public final TuplePatternContext tuplePattern() throws RecognitionException {
		TuplePatternContext _localctx = new TuplePatternContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_tuplePattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1703);
			match(T__30);
			setState(1705);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__37) | (1L << T__39) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__78 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__83 - 64)) | (1L << (T__84 - 64)) | (1L << (T__85 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (T__89 - 64)) | (1L << (T__90 - 64)) | (1L << (T__91 - 64)) | (1L << (T__92 - 64)) | (1L << (T__93 - 64)) | (1L << (T__94 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__100 - 64)) | (1L << (T__102 - 64)) | (1L << (T__104 - 64)) | (1L << (T__106 - 64)) | (1L << (T__107 - 64)) | (1L << (T__108 - 64)) | (1L << (T__109 - 64)) | (1L << (T__110 - 64)) | (1L << (T__111 - 64)) | (1L << (T__112 - 64)) | (1L << (T__113 - 64)) | (1L << (T__116 - 64)) | (1L << (T__119 - 64)) | (1L << (T__120 - 64)) | (1L << (T__121 - 64)) | (1L << (T__122 - 64)) | (1L << (T__123 - 64)) | (1L << (T__124 - 64)) | (1L << (T__125 - 64)) | (1L << (T__126 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__127 - 128)) | (1L << (T__128 - 128)) | (1L << (T__129 - 128)) | (1L << (T__130 - 128)) | (1L << (T__131 - 128)) | (1L << (T__132 - 128)) | (1L << (T__133 - 128)) | (1L << (T__134 - 128)) | (1L << (T__136 - 128)) | (1L << (T__137 - 128)) | (1L << (T__138 - 128)) | (1L << (T__139 - 128)) | (1L << (T__141 - 128)) | (1L << (T__142 - 128)) | (1L << (T__143 - 128)) | (1L << (T__144 - 128)) | (1L << (T__145 - 128)) | (1L << (T__146 - 128)) | (1L << (BooleanLiteral - 128)) | (1L << (NilLiteral - 128)) | (1L << (OperatorHead - 128)) | (1L << (DotOperatorHead - 128)) | (1L << (Identifier - 128)) | (1L << (BinaryLiteral - 128)) | (1L << (OctalLiteral - 128)) | (1L << (DecimalLiteral - 128)) | (1L << (HexadecimalLiteral - 128)) | (1L << (FloatingPointLiteral - 128)) | (1L << (StringLiteral - 128)))) != 0)) {
				{
				setState(1704);
				tuplePatternElementList();
				}
			}

			setState(1707);
			match(T__31);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TuplePatternElementListContext extends ParserRuleContext {
		public List<TuplePatternElementContext> tuplePatternElement() {
			return getRuleContexts(TuplePatternElementContext.class);
		}
		public TuplePatternElementContext tuplePatternElement(int i) {
			return getRuleContext(TuplePatternElementContext.class,i);
		}
		public TuplePatternElementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuplePatternElementList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterTuplePatternElementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitTuplePatternElementList(this);
		}
	}

	public final TuplePatternElementListContext tuplePatternElementList() throws RecognitionException {
		TuplePatternElementListContext _localctx = new TuplePatternElementListContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_tuplePatternElementList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1709);
			tuplePatternElement();
			setState(1714);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__17) {
				{
				{
				setState(1710);
				match(T__17);
				setState(1711);
				tuplePatternElement();
				}
				}
				setState(1716);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TuplePatternElementContext extends ParserRuleContext {
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TuplePatternElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuplePatternElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterTuplePatternElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitTuplePatternElement(this);
		}
	}

	public final TuplePatternElementContext tuplePatternElement() throws RecognitionException {
		TuplePatternElementContext _localctx = new TuplePatternElementContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_tuplePatternElement);
		try {
			setState(1722);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1717);
				pattern(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1718);
				identifier();
				setState(1719);
				match(T__1);
				setState(1720);
				pattern(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumCasePatternContext extends ParserRuleContext {
		public EnumCaseNameContext enumCaseName() {
			return getRuleContext(EnumCaseNameContext.class,0);
		}
		public TypeIdentifierContext typeIdentifier() {
			return getRuleContext(TypeIdentifierContext.class,0);
		}
		public TuplePatternContext tuplePattern() {
			return getRuleContext(TuplePatternContext.class,0);
		}
		public EnumCasePatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumCasePattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterEnumCasePattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitEnumCasePattern(this);
		}
	}

	public final EnumCasePatternContext enumCasePattern() throws RecognitionException {
		EnumCasePatternContext _localctx = new EnumCasePatternContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_enumCasePattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1725);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
			case 1:
				{
				setState(1724);
				typeIdentifier();
				}
				break;
			}
			setState(1728);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(1727);
				match(T__2);
				}
			}

			setState(1730);
			enumCaseName();
			setState(1732);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,202,_ctx) ) {
			case 1:
				{
				setState(1731);
				tuplePattern();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeCastingPatternContext extends ParserRuleContext {
		public IsPatternContext isPattern() {
			return getRuleContext(IsPatternContext.class,0);
		}
		public AsPatternContext asPattern() {
			return getRuleContext(AsPatternContext.class,0);
		}
		public TypeCastingPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeCastingPattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterTypeCastingPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitTypeCastingPattern(this);
		}
	}

	public final TypeCastingPatternContext typeCastingPattern() throws RecognitionException {
		TypeCastingPatternContext _localctx = new TypeCastingPatternContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_typeCastingPattern);
		try {
			setState(1736);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,203,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1734);
				isPattern();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1735);
				asPattern();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IsPatternContext extends ParserRuleContext {
		public STypeContext sType() {
			return getRuleContext(STypeContext.class,0);
		}
		public IsPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_isPattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterIsPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitIsPattern(this);
		}
	}

	public final IsPatternContext isPattern() throws RecognitionException {
		IsPatternContext _localctx = new IsPatternContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_isPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1738);
			match(T__97);
			setState(1739);
			sType(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AsPatternContext extends ParserRuleContext {
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public STypeContext sType() {
			return getRuleContext(STypeContext.class,0);
		}
		public AsPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asPattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterAsPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitAsPattern(this);
		}
	}

	public final AsPatternContext asPattern() throws RecognitionException {
		AsPatternContext _localctx = new AsPatternContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_asPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1741);
			pattern(0);
			setState(1742);
			match(T__98);
			setState(1743);
			sType(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionPatternContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionPattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterExpressionPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitExpressionPattern(this);
		}
	}

	public final ExpressionPatternContext expressionPattern() throws RecognitionException {
		ExpressionPatternContext _localctx = new ExpressionPatternContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_expressionPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1745);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributeContext extends ParserRuleContext {
		public AttributeNameContext attributeName() {
			return getRuleContext(AttributeNameContext.class,0);
		}
		public AttributeArgumentClauseContext attributeArgumentClause() {
			return getRuleContext(AttributeArgumentClauseContext.class,0);
		}
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitAttribute(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1747);
			match(T__99);
			setState(1748);
			attributeName();
			setState(1750);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,204,_ctx) ) {
			case 1:
				{
				setState(1749);
				attributeArgumentClause();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributeNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AttributeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterAttributeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitAttributeName(this);
		}
	}

	public final AttributeNameContext attributeName() throws RecognitionException {
		AttributeNameContext _localctx = new AttributeNameContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_attributeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1752);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributeArgumentClauseContext extends ParserRuleContext {
		public BalancedTokensContext balancedTokens() {
			return getRuleContext(BalancedTokensContext.class,0);
		}
		public AttributeArgumentClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeArgumentClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterAttributeArgumentClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitAttributeArgumentClause(this);
		}
	}

	public final AttributeArgumentClauseContext attributeArgumentClause() throws RecognitionException {
		AttributeArgumentClauseContext _localctx = new AttributeArgumentClauseContext(_ctx, getState());
		enterRule(_localctx, 330, RULE_attributeArgumentClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1754);
			match(T__30);
			setState(1756);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__78 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__83 - 64)) | (1L << (T__84 - 64)) | (1L << (T__85 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (T__89 - 64)) | (1L << (T__90 - 64)) | (1L << (T__91 - 64)) | (1L << (T__92 - 64)) | (1L << (T__93 - 64)) | (1L << (T__94 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__100 - 64)) | (1L << (T__102 - 64)) | (1L << (T__103 - 64)) | (1L << (T__104 - 64)) | (1L << (T__105 - 64)) | (1L << (T__106 - 64)) | (1L << (T__107 - 64)) | (1L << (T__108 - 64)) | (1L << (T__109 - 64)) | (1L << (T__110 - 64)) | (1L << (T__111 - 64)) | (1L << (T__112 - 64)) | (1L << (T__113 - 64)) | (1L << (T__116 - 64)) | (1L << (T__119 - 64)) | (1L << (T__120 - 64)) | (1L << (T__121 - 64)) | (1L << (T__122 - 64)) | (1L << (T__123 - 64)) | (1L << (T__124 - 64)) | (1L << (T__125 - 64)) | (1L << (T__126 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__127 - 128)) | (1L << (T__128 - 128)) | (1L << (T__129 - 128)) | (1L << (T__130 - 128)) | (1L << (T__131 - 128)) | (1L << (T__132 - 128)) | (1L << (T__133 - 128)) | (1L << (T__134 - 128)) | (1L << (T__136 - 128)) | (1L << (T__137 - 128)) | (1L << (T__138 - 128)) | (1L << (T__139 - 128)) | (1L << (T__141 - 128)) | (1L << (T__142 - 128)) | (1L << (T__143 - 128)) | (1L << (T__144 - 128)) | (1L << (T__145 - 128)) | (1L << (T__146 - 128)) | (1L << (BooleanLiteral - 128)) | (1L << (NilLiteral - 128)) | (1L << (OperatorHead - 128)) | (1L << (DotOperatorHead - 128)) | (1L << (Identifier - 128)) | (1L << (BinaryLiteral - 128)) | (1L << (OctalLiteral - 128)) | (1L << (DecimalLiteral - 128)) | (1L << (HexadecimalLiteral - 128)) | (1L << (FloatingPointLiteral - 128)) | (1L << (VersionLiteral - 128)) | (1L << (StringLiteral - 128)))) != 0)) {
				{
				setState(1755);
				balancedTokens();
				}
			}

			setState(1758);
			match(T__31);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributesContext extends ParserRuleContext {
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public AttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitAttributes(this);
		}
	}

	public final AttributesContext attributes() throws RecognitionException {
		AttributesContext _localctx = new AttributesContext(_ctx, getState());
		enterRule(_localctx, 332, RULE_attributes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1761); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1760);
				attribute();
				}
				}
				setState(1763); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__99 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BalancedTokensContext extends ParserRuleContext {
		public List<BalancedTokenContext> balancedToken() {
			return getRuleContexts(BalancedTokenContext.class);
		}
		public BalancedTokenContext balancedToken(int i) {
			return getRuleContext(BalancedTokenContext.class,i);
		}
		public BalancedTokensContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_balancedTokens; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterBalancedTokens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitBalancedTokens(this);
		}
	}

	public final BalancedTokensContext balancedTokens() throws RecognitionException {
		BalancedTokensContext _localctx = new BalancedTokensContext(_ctx, getState());
		enterRule(_localctx, 334, RULE_balancedTokens);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1766); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1765);
				balancedToken();
				}
				}
				setState(1768); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__78 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__83 - 64)) | (1L << (T__84 - 64)) | (1L << (T__85 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (T__89 - 64)) | (1L << (T__90 - 64)) | (1L << (T__91 - 64)) | (1L << (T__92 - 64)) | (1L << (T__93 - 64)) | (1L << (T__94 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__100 - 64)) | (1L << (T__102 - 64)) | (1L << (T__103 - 64)) | (1L << (T__104 - 64)) | (1L << (T__105 - 64)) | (1L << (T__106 - 64)) | (1L << (T__107 - 64)) | (1L << (T__108 - 64)) | (1L << (T__109 - 64)) | (1L << (T__110 - 64)) | (1L << (T__111 - 64)) | (1L << (T__112 - 64)) | (1L << (T__113 - 64)) | (1L << (T__116 - 64)) | (1L << (T__119 - 64)) | (1L << (T__120 - 64)) | (1L << (T__121 - 64)) | (1L << (T__122 - 64)) | (1L << (T__123 - 64)) | (1L << (T__124 - 64)) | (1L << (T__125 - 64)) | (1L << (T__126 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__127 - 128)) | (1L << (T__128 - 128)) | (1L << (T__129 - 128)) | (1L << (T__130 - 128)) | (1L << (T__131 - 128)) | (1L << (T__132 - 128)) | (1L << (T__133 - 128)) | (1L << (T__134 - 128)) | (1L << (T__136 - 128)) | (1L << (T__137 - 128)) | (1L << (T__138 - 128)) | (1L << (T__139 - 128)) | (1L << (T__141 - 128)) | (1L << (T__142 - 128)) | (1L << (T__143 - 128)) | (1L << (T__144 - 128)) | (1L << (T__145 - 128)) | (1L << (T__146 - 128)) | (1L << (BooleanLiteral - 128)) | (1L << (NilLiteral - 128)) | (1L << (OperatorHead - 128)) | (1L << (DotOperatorHead - 128)) | (1L << (Identifier - 128)) | (1L << (BinaryLiteral - 128)) | (1L << (OctalLiteral - 128)) | (1L << (DecimalLiteral - 128)) | (1L << (HexadecimalLiteral - 128)) | (1L << (FloatingPointLiteral - 128)) | (1L << (VersionLiteral - 128)) | (1L << (StringLiteral - 128)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BalancedTokenContext extends ParserRuleContext {
		public BalancedTokensContext balancedTokens() {
			return getRuleContext(BalancedTokensContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ContextSensitiveKeywordContext contextSensitiveKeyword() {
			return getRuleContext(ContextSensitiveKeywordContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public TerminalNode VersionLiteral() { return getToken(Swift3Parser.VersionLiteral, 0); }
		public AvailabilityArgumentContext availabilityArgument() {
			return getRuleContext(AvailabilityArgumentContext.class,0);
		}
		public BalancedTokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_balancedToken; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterBalancedToken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitBalancedToken(this);
		}
	}

	public final BalancedTokenContext balancedToken() throws RecognitionException {
		BalancedTokenContext _localctx = new BalancedTokenContext(_ctx, getState());
		enterRule(_localctx, 336, RULE_balancedToken);
		int _la;
		try {
			setState(1803);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,211,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1770);
				match(T__30);
				setState(1772);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__78 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__83 - 64)) | (1L << (T__84 - 64)) | (1L << (T__85 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (T__89 - 64)) | (1L << (T__90 - 64)) | (1L << (T__91 - 64)) | (1L << (T__92 - 64)) | (1L << (T__93 - 64)) | (1L << (T__94 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__100 - 64)) | (1L << (T__102 - 64)) | (1L << (T__103 - 64)) | (1L << (T__104 - 64)) | (1L << (T__105 - 64)) | (1L << (T__106 - 64)) | (1L << (T__107 - 64)) | (1L << (T__108 - 64)) | (1L << (T__109 - 64)) | (1L << (T__110 - 64)) | (1L << (T__111 - 64)) | (1L << (T__112 - 64)) | (1L << (T__113 - 64)) | (1L << (T__116 - 64)) | (1L << (T__119 - 64)) | (1L << (T__120 - 64)) | (1L << (T__121 - 64)) | (1L << (T__122 - 64)) | (1L << (T__123 - 64)) | (1L << (T__124 - 64)) | (1L << (T__125 - 64)) | (1L << (T__126 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__127 - 128)) | (1L << (T__128 - 128)) | (1L << (T__129 - 128)) | (1L << (T__130 - 128)) | (1L << (T__131 - 128)) | (1L << (T__132 - 128)) | (1L << (T__133 - 128)) | (1L << (T__134 - 128)) | (1L << (T__136 - 128)) | (1L << (T__137 - 128)) | (1L << (T__138 - 128)) | (1L << (T__139 - 128)) | (1L << (T__141 - 128)) | (1L << (T__142 - 128)) | (1L << (T__143 - 128)) | (1L << (T__144 - 128)) | (1L << (T__145 - 128)) | (1L << (T__146 - 128)) | (1L << (BooleanLiteral - 128)) | (1L << (NilLiteral - 128)) | (1L << (OperatorHead - 128)) | (1L << (DotOperatorHead - 128)) | (1L << (Identifier - 128)) | (1L << (BinaryLiteral - 128)) | (1L << (OctalLiteral - 128)) | (1L << (DecimalLiteral - 128)) | (1L << (HexadecimalLiteral - 128)) | (1L << (FloatingPointLiteral - 128)) | (1L << (VersionLiteral - 128)) | (1L << (StringLiteral - 128)))) != 0)) {
					{
					setState(1771);
					balancedTokens();
					}
				}

				setState(1774);
				match(T__31);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1775);
				match(T__100);
				setState(1777);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__78 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__83 - 64)) | (1L << (T__84 - 64)) | (1L << (T__85 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (T__89 - 64)) | (1L << (T__90 - 64)) | (1L << (T__91 - 64)) | (1L << (T__92 - 64)) | (1L << (T__93 - 64)) | (1L << (T__94 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__100 - 64)) | (1L << (T__102 - 64)) | (1L << (T__103 - 64)) | (1L << (T__104 - 64)) | (1L << (T__105 - 64)) | (1L << (T__106 - 64)) | (1L << (T__107 - 64)) | (1L << (T__108 - 64)) | (1L << (T__109 - 64)) | (1L << (T__110 - 64)) | (1L << (T__111 - 64)) | (1L << (T__112 - 64)) | (1L << (T__113 - 64)) | (1L << (T__116 - 64)) | (1L << (T__119 - 64)) | (1L << (T__120 - 64)) | (1L << (T__121 - 64)) | (1L << (T__122 - 64)) | (1L << (T__123 - 64)) | (1L << (T__124 - 64)) | (1L << (T__125 - 64)) | (1L << (T__126 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__127 - 128)) | (1L << (T__128 - 128)) | (1L << (T__129 - 128)) | (1L << (T__130 - 128)) | (1L << (T__131 - 128)) | (1L << (T__132 - 128)) | (1L << (T__133 - 128)) | (1L << (T__134 - 128)) | (1L << (T__136 - 128)) | (1L << (T__137 - 128)) | (1L << (T__138 - 128)) | (1L << (T__139 - 128)) | (1L << (T__141 - 128)) | (1L << (T__142 - 128)) | (1L << (T__143 - 128)) | (1L << (T__144 - 128)) | (1L << (T__145 - 128)) | (1L << (T__146 - 128)) | (1L << (BooleanLiteral - 128)) | (1L << (NilLiteral - 128)) | (1L << (OperatorHead - 128)) | (1L << (DotOperatorHead - 128)) | (1L << (Identifier - 128)) | (1L << (BinaryLiteral - 128)) | (1L << (OctalLiteral - 128)) | (1L << (DecimalLiteral - 128)) | (1L << (HexadecimalLiteral - 128)) | (1L << (FloatingPointLiteral - 128)) | (1L << (VersionLiteral - 128)) | (1L << (StringLiteral - 128)))) != 0)) {
					{
					setState(1776);
					balancedTokens();
					}
				}

				setState(1779);
				match(T__101);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1780);
				match(T__15);
				setState(1782);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__78 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__83 - 64)) | (1L << (T__84 - 64)) | (1L << (T__85 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (T__89 - 64)) | (1L << (T__90 - 64)) | (1L << (T__91 - 64)) | (1L << (T__92 - 64)) | (1L << (T__93 - 64)) | (1L << (T__94 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__100 - 64)) | (1L << (T__102 - 64)) | (1L << (T__103 - 64)) | (1L << (T__104 - 64)) | (1L << (T__105 - 64)) | (1L << (T__106 - 64)) | (1L << (T__107 - 64)) | (1L << (T__108 - 64)) | (1L << (T__109 - 64)) | (1L << (T__110 - 64)) | (1L << (T__111 - 64)) | (1L << (T__112 - 64)) | (1L << (T__113 - 64)) | (1L << (T__116 - 64)) | (1L << (T__119 - 64)) | (1L << (T__120 - 64)) | (1L << (T__121 - 64)) | (1L << (T__122 - 64)) | (1L << (T__123 - 64)) | (1L << (T__124 - 64)) | (1L << (T__125 - 64)) | (1L << (T__126 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__127 - 128)) | (1L << (T__128 - 128)) | (1L << (T__129 - 128)) | (1L << (T__130 - 128)) | (1L << (T__131 - 128)) | (1L << (T__132 - 128)) | (1L << (T__133 - 128)) | (1L << (T__134 - 128)) | (1L << (T__136 - 128)) | (1L << (T__137 - 128)) | (1L << (T__138 - 128)) | (1L << (T__139 - 128)) | (1L << (T__141 - 128)) | (1L << (T__142 - 128)) | (1L << (T__143 - 128)) | (1L << (T__144 - 128)) | (1L << (T__145 - 128)) | (1L << (T__146 - 128)) | (1L << (BooleanLiteral - 128)) | (1L << (NilLiteral - 128)) | (1L << (OperatorHead - 128)) | (1L << (DotOperatorHead - 128)) | (1L << (Identifier - 128)) | (1L << (BinaryLiteral - 128)) | (1L << (OctalLiteral - 128)) | (1L << (DecimalLiteral - 128)) | (1L << (HexadecimalLiteral - 128)) | (1L << (FloatingPointLiteral - 128)) | (1L << (VersionLiteral - 128)) | (1L << (StringLiteral - 128)))) != 0)) {
					{
					setState(1781);
					balancedTokens();
					}
				}

				setState(1784);
				match(T__16);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1785);
				identifier();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1786);
				expression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1787);
				contextSensitiveKeyword();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1788);
				literal();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1789);
				operator();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1790);
				match(VersionLiteral);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1791);
				availabilityArgument();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1792);
				match(T__1);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1793);
				match(T__0);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1794);
				match(T__17);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1795);
				match(T__87);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1796);
				match(T__41);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1797);
				match(T__42);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1798);
				match(T__102);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(1799);
				match(T__103);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(1800);
				match(T__104);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(1801);
				match(T__81);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(1802);
				match(T__105);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public PrefixExpressionContext prefixExpression() {
			return getRuleContext(PrefixExpressionContext.class,0);
		}
		public TryOperatorContext tryOperator() {
			return getRuleContext(TryOperatorContext.class,0);
		}
		public List<BinaryExpressionContext> binaryExpression() {
			return getRuleContexts(BinaryExpressionContext.class);
		}
		public BinaryExpressionContext binaryExpression(int i) {
			return getRuleContext(BinaryExpressionContext.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 338, RULE_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1806);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,212,_ctx) ) {
			case 1:
				{
				setState(1805);
				tryOperator();
				}
				break;
			}
			setState(1808);
			prefixExpression();
			setState(1812);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,213,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1809);
					binaryExpression();
					}
					} 
				}
				setState(1814);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,213,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrefixExpressionContext extends ParserRuleContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public PrefixOperatorContext prefixOperator() {
			return getRuleContext(PrefixOperatorContext.class,0);
		}
		public InOutExpressionContext inOutExpression() {
			return getRuleContext(InOutExpressionContext.class,0);
		}
		public PrefixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefixExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterPrefixExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitPrefixExpression(this);
		}
	}

	public final PrefixExpressionContext prefixExpression() throws RecognitionException {
		PrefixExpressionContext _localctx = new PrefixExpressionContext(_ctx, getState());
		enterRule(_localctx, 340, RULE_prefixExpression);
		try {
			setState(1823);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,216,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1816);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,214,_ctx) ) {
				case 1:
					{
					setState(1815);
					prefixOperator();
					}
					break;
				}
				setState(1818);
				postfixExpression(0);
				setState(1820);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,215,_ctx) ) {
				case 1:
					{
					setState(1819);
					match(T__0);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1822);
				inOutExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InOutExpressionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public InOutExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inOutExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterInOutExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitInOutExpression(this);
		}
	}

	public final InOutExpressionContext inOutExpression() throws RecognitionException {
		InOutExpressionContext _localctx = new InOutExpressionContext(_ctx, getState());
		enterRule(_localctx, 342, RULE_inOutExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1825);
			match(T__106);
			setState(1826);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TryOperatorContext extends ParserRuleContext {
		public TryOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterTryOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitTryOperator(this);
		}
	}

	public final TryOperatorContext tryOperator() throws RecognitionException {
		TryOperatorContext _localctx = new TryOperatorContext(_ctx, getState());
		enterRule(_localctx, 344, RULE_tryOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1828);
			match(T__107);
			setState(1830);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,217,_ctx) ) {
			case 1:
				{
				setState(1829);
				_la = _input.LA(1);
				if ( !(_la==T__86 || _la==T__87) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BinaryExpressionContext extends ParserRuleContext {
		public BinaryOperatorContext binaryOperator() {
			return getRuleContext(BinaryOperatorContext.class,0);
		}
		public PrefixExpressionContext prefixExpression() {
			return getRuleContext(PrefixExpressionContext.class,0);
		}
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public TryOperatorContext tryOperator() {
			return getRuleContext(TryOperatorContext.class,0);
		}
		public ConditionalOperatorContext conditionalOperator() {
			return getRuleContext(ConditionalOperatorContext.class,0);
		}
		public TypeCastingOperatorContext typeCastingOperator() {
			return getRuleContext(TypeCastingOperatorContext.class,0);
		}
		public BinaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterBinaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitBinaryExpression(this);
		}
	}

	public final BinaryExpressionContext binaryExpression() throws RecognitionException {
		BinaryExpressionContext _localctx = new BinaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 346, RULE_binaryExpression);
		try {
			setState(1848);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,220,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1832);
				binaryOperator();
				setState(1833);
				prefixExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1835);
				assignmentOperator();
				setState(1837);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,218,_ctx) ) {
				case 1:
					{
					setState(1836);
					tryOperator();
					}
					break;
				}
				setState(1839);
				prefixExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1841);
				conditionalOperator();
				setState(1843);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,219,_ctx) ) {
				case 1:
					{
					setState(1842);
					tryOperator();
					}
					break;
				}
				setState(1845);
				prefixExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1847);
				typeCastingOperator();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentOperatorContext extends ParserRuleContext {
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterAssignmentOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitAssignmentOperator(this);
		}
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 348, RULE_assignmentOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1850);
			match(T__74);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionalOperatorContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TryOperatorContext tryOperator() {
			return getRuleContext(TryOperatorContext.class,0);
		}
		public ConditionalOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterConditionalOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitConditionalOperator(this);
		}
	}

	public final ConditionalOperatorContext conditionalOperator() throws RecognitionException {
		ConditionalOperatorContext _localctx = new ConditionalOperatorContext(_ctx, getState());
		enterRule(_localctx, 350, RULE_conditionalOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1852);
			match(T__86);
			setState(1854);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,221,_ctx) ) {
			case 1:
				{
				setState(1853);
				tryOperator();
				}
				break;
			}
			setState(1856);
			expression();
			setState(1857);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeCastingOperatorContext extends ParserRuleContext {
		public STypeContext sType() {
			return getRuleContext(STypeContext.class,0);
		}
		public TypeCastingOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeCastingOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterTypeCastingOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitTypeCastingOperator(this);
		}
	}

	public final TypeCastingOperatorContext typeCastingOperator() throws RecognitionException {
		TypeCastingOperatorContext _localctx = new TypeCastingOperatorContext(_ctx, getState());
		enterRule(_localctx, 352, RULE_typeCastingOperator);
		try {
			setState(1869);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,222,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1859);
				match(T__97);
				setState(1860);
				sType(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1861);
				match(T__98);
				setState(1862);
				match(T__86);
				setState(1863);
				sType(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1864);
				match(T__98);
				setState(1865);
				sType(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1866);
				match(T__98);
				setState(1867);
				match(T__87);
				setState(1868);
				sType(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryExpressionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public ContextSensitiveKeywordContext contextSensitiveKeyword() {
			return getRuleContext(ContextSensitiveKeywordContext.class,0);
		}
		public GenericArgumentClauseContext genericArgumentClause() {
			return getRuleContext(GenericArgumentClauseContext.class,0);
		}
		public LiteralExpressionContext literalExpression() {
			return getRuleContext(LiteralExpressionContext.class,0);
		}
		public SelfExpressionContext selfExpression() {
			return getRuleContext(SelfExpressionContext.class,0);
		}
		public SuperclassExpressionContext superclassExpression() {
			return getRuleContext(SuperclassExpressionContext.class,0);
		}
		public ClosureExpressionContext closureExpression() {
			return getRuleContext(ClosureExpressionContext.class,0);
		}
		public ParenthesizedExpressionContext parenthesizedExpression() {
			return getRuleContext(ParenthesizedExpressionContext.class,0);
		}
		public ImplicitMemberExpressionContext implicitMemberExpression() {
			return getRuleContext(ImplicitMemberExpressionContext.class,0);
		}
		public WildcardExpressionContext wildcardExpression() {
			return getRuleContext(WildcardExpressionContext.class,0);
		}
		public SelectorExpressionContext selectorExpression() {
			return getRuleContext(SelectorExpressionContext.class,0);
		}
		public KeyPathExpressionContext keyPathExpression() {
			return getRuleContext(KeyPathExpressionContext.class,0);
		}
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterPrimaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitPrimaryExpression(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 354, RULE_primaryExpression);
		try {
			setState(1889);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,225,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1875);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,223,_ctx) ) {
				case 1:
					{
					setState(1871);
					identifier();
					}
					break;
				case 2:
					{
					setState(1872);
					operator();
					}
					break;
				case 3:
					{
					setState(1873);
					keyword();
					}
					break;
				case 4:
					{
					setState(1874);
					contextSensitiveKeyword();
					}
					break;
				}
				setState(1878);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,224,_ctx) ) {
				case 1:
					{
					setState(1877);
					genericArgumentClause();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1880);
				literalExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1881);
				selfExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1882);
				superclassExpression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1883);
				closureExpression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1884);
				parenthesizedExpression();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1885);
				implicitMemberExpression();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1886);
				wildcardExpression();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1887);
				selectorExpression();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1888);
				keyPathExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralExpressionContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ArrayLiteralContext arrayLiteral() {
			return getRuleContext(ArrayLiteralContext.class,0);
		}
		public DictionaryLiteralContext dictionaryLiteral() {
			return getRuleContext(DictionaryLiteralContext.class,0);
		}
		public LiteralExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterLiteralExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitLiteralExpression(this);
		}
	}

	public final LiteralExpressionContext literalExpression() throws RecognitionException {
		LiteralExpressionContext _localctx = new LiteralExpressionContext(_ctx, getState());
		enterRule(_localctx, 356, RULE_literalExpression);
		try {
			setState(1898);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,226,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1891);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1892);
				arrayLiteral();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1893);
				dictionaryLiteral();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1894);
				match(T__108);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1895);
				match(T__109);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1896);
				match(T__110);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1897);
				match(T__111);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayLiteralContext extends ParserRuleContext {
		public ArrayLiteralItemsContext arrayLiteralItems() {
			return getRuleContext(ArrayLiteralItemsContext.class,0);
		}
		public ArrayLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterArrayLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitArrayLiteral(this);
		}
	}

	public final ArrayLiteralContext arrayLiteral() throws RecognitionException {
		ArrayLiteralContext _localctx = new ArrayLiteralContext(_ctx, getState());
		enterRule(_localctx, 358, RULE_arrayLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1900);
			match(T__100);
			setState(1902);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__37) | (1L << T__39) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__78 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__83 - 64)) | (1L << (T__84 - 64)) | (1L << (T__85 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (T__89 - 64)) | (1L << (T__90 - 64)) | (1L << (T__91 - 64)) | (1L << (T__92 - 64)) | (1L << (T__93 - 64)) | (1L << (T__94 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__100 - 64)) | (1L << (T__102 - 64)) | (1L << (T__104 - 64)) | (1L << (T__106 - 64)) | (1L << (T__107 - 64)) | (1L << (T__108 - 64)) | (1L << (T__109 - 64)) | (1L << (T__110 - 64)) | (1L << (T__111 - 64)) | (1L << (T__112 - 64)) | (1L << (T__113 - 64)) | (1L << (T__116 - 64)) | (1L << (T__119 - 64)) | (1L << (T__120 - 64)) | (1L << (T__121 - 64)) | (1L << (T__122 - 64)) | (1L << (T__123 - 64)) | (1L << (T__124 - 64)) | (1L << (T__125 - 64)) | (1L << (T__126 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__127 - 128)) | (1L << (T__128 - 128)) | (1L << (T__129 - 128)) | (1L << (T__130 - 128)) | (1L << (T__131 - 128)) | (1L << (T__132 - 128)) | (1L << (T__133 - 128)) | (1L << (T__134 - 128)) | (1L << (T__136 - 128)) | (1L << (T__137 - 128)) | (1L << (T__138 - 128)) | (1L << (T__139 - 128)) | (1L << (T__141 - 128)) | (1L << (T__142 - 128)) | (1L << (T__143 - 128)) | (1L << (T__144 - 128)) | (1L << (T__145 - 128)) | (1L << (T__146 - 128)) | (1L << (BooleanLiteral - 128)) | (1L << (NilLiteral - 128)) | (1L << (OperatorHead - 128)) | (1L << (DotOperatorHead - 128)) | (1L << (Identifier - 128)) | (1L << (BinaryLiteral - 128)) | (1L << (OctalLiteral - 128)) | (1L << (DecimalLiteral - 128)) | (1L << (HexadecimalLiteral - 128)) | (1L << (FloatingPointLiteral - 128)) | (1L << (StringLiteral - 128)))) != 0)) {
				{
				setState(1901);
				arrayLiteralItems();
				}
			}

			setState(1904);
			match(T__101);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayLiteralItemsContext extends ParserRuleContext {
		public List<ArrayLiteralItemContext> arrayLiteralItem() {
			return getRuleContexts(ArrayLiteralItemContext.class);
		}
		public ArrayLiteralItemContext arrayLiteralItem(int i) {
			return getRuleContext(ArrayLiteralItemContext.class,i);
		}
		public ArrayLiteralItemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayLiteralItems; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterArrayLiteralItems(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitArrayLiteralItems(this);
		}
	}

	public final ArrayLiteralItemsContext arrayLiteralItems() throws RecognitionException {
		ArrayLiteralItemsContext _localctx = new ArrayLiteralItemsContext(_ctx, getState());
		enterRule(_localctx, 360, RULE_arrayLiteralItems);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1906);
			arrayLiteralItem();
			setState(1911);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,228,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1907);
					match(T__17);
					setState(1908);
					arrayLiteralItem();
					}
					} 
				}
				setState(1913);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,228,_ctx);
			}
			setState(1915);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__17) {
				{
				setState(1914);
				match(T__17);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayLiteralItemContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrayLiteralItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayLiteralItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterArrayLiteralItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitArrayLiteralItem(this);
		}
	}

	public final ArrayLiteralItemContext arrayLiteralItem() throws RecognitionException {
		ArrayLiteralItemContext _localctx = new ArrayLiteralItemContext(_ctx, getState());
		enterRule(_localctx, 362, RULE_arrayLiteralItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1917);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DictionaryLiteralContext extends ParserRuleContext {
		public DictionaryLiteralItemsContext dictionaryLiteralItems() {
			return getRuleContext(DictionaryLiteralItemsContext.class,0);
		}
		public DictionaryLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictionaryLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterDictionaryLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitDictionaryLiteral(this);
		}
	}

	public final DictionaryLiteralContext dictionaryLiteral() throws RecognitionException {
		DictionaryLiteralContext _localctx = new DictionaryLiteralContext(_ctx, getState());
		enterRule(_localctx, 364, RULE_dictionaryLiteral);
		try {
			setState(1926);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,230,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1919);
				match(T__100);
				setState(1920);
				dictionaryLiteralItems();
				setState(1921);
				match(T__101);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1923);
				match(T__100);
				setState(1924);
				match(T__1);
				setState(1925);
				match(T__101);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DictionaryLiteralItemsContext extends ParserRuleContext {
		public List<DictionaryLiteralItemContext> dictionaryLiteralItem() {
			return getRuleContexts(DictionaryLiteralItemContext.class);
		}
		public DictionaryLiteralItemContext dictionaryLiteralItem(int i) {
			return getRuleContext(DictionaryLiteralItemContext.class,i);
		}
		public DictionaryLiteralItemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictionaryLiteralItems; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterDictionaryLiteralItems(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitDictionaryLiteralItems(this);
		}
	}

	public final DictionaryLiteralItemsContext dictionaryLiteralItems() throws RecognitionException {
		DictionaryLiteralItemsContext _localctx = new DictionaryLiteralItemsContext(_ctx, getState());
		enterRule(_localctx, 366, RULE_dictionaryLiteralItems);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1928);
			dictionaryLiteralItem();
			setState(1933);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,231,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1929);
					match(T__17);
					setState(1930);
					dictionaryLiteralItem();
					}
					} 
				}
				setState(1935);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,231,_ctx);
			}
			setState(1937);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__17) {
				{
				setState(1936);
				match(T__17);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DictionaryLiteralItemContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public DictionaryLiteralItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictionaryLiteralItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterDictionaryLiteralItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitDictionaryLiteralItem(this);
		}
	}

	public final DictionaryLiteralItemContext dictionaryLiteralItem() throws RecognitionException {
		DictionaryLiteralItemContext _localctx = new DictionaryLiteralItemContext(_ctx, getState());
		enterRule(_localctx, 368, RULE_dictionaryLiteralItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1939);
			expression();
			setState(1940);
			match(T__1);
			setState(1941);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelfExpressionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionElementListContext expressionElementList() {
			return getRuleContext(ExpressionElementListContext.class,0);
		}
		public SelfExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selfExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterSelfExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitSelfExpression(this);
		}
	}

	public final SelfExpressionContext selfExpression() throws RecognitionException {
		SelfExpressionContext _localctx = new SelfExpressionContext(_ctx, getState());
		enterRule(_localctx, 370, RULE_selfExpression);
		try {
			setState(1955);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,233,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1943);
				match(T__112);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1944);
				match(T__112);
				setState(1945);
				match(T__2);
				setState(1946);
				identifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1947);
				match(T__112);
				setState(1948);
				match(T__100);
				setState(1949);
				expressionElementList();
				setState(1950);
				match(T__101);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1952);
				match(T__112);
				setState(1953);
				match(T__2);
				setState(1954);
				match(T__85);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SuperclassExpressionContext extends ParserRuleContext {
		public SuperclassMethodExpressionContext superclassMethodExpression() {
			return getRuleContext(SuperclassMethodExpressionContext.class,0);
		}
		public SuperclassSubscriptExpressionContext superclassSubscriptExpression() {
			return getRuleContext(SuperclassSubscriptExpressionContext.class,0);
		}
		public SuperclassInitializerExpressionContext superclassInitializerExpression() {
			return getRuleContext(SuperclassInitializerExpressionContext.class,0);
		}
		public SuperclassExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superclassExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterSuperclassExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitSuperclassExpression(this);
		}
	}

	public final SuperclassExpressionContext superclassExpression() throws RecognitionException {
		SuperclassExpressionContext _localctx = new SuperclassExpressionContext(_ctx, getState());
		enterRule(_localctx, 372, RULE_superclassExpression);
		try {
			setState(1960);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,234,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1957);
				superclassMethodExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1958);
				superclassSubscriptExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1959);
				superclassInitializerExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SuperclassMethodExpressionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public SuperclassMethodExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superclassMethodExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterSuperclassMethodExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitSuperclassMethodExpression(this);
		}
	}

	public final SuperclassMethodExpressionContext superclassMethodExpression() throws RecognitionException {
		SuperclassMethodExpressionContext _localctx = new SuperclassMethodExpressionContext(_ctx, getState());
		enterRule(_localctx, 374, RULE_superclassMethodExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1962);
			match(T__113);
			setState(1963);
			match(T__2);
			setState(1964);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SuperclassSubscriptExpressionContext extends ParserRuleContext {
		public ExpressionElementListContext expressionElementList() {
			return getRuleContext(ExpressionElementListContext.class,0);
		}
		public SuperclassSubscriptExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superclassSubscriptExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterSuperclassSubscriptExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitSuperclassSubscriptExpression(this);
		}
	}

	public final SuperclassSubscriptExpressionContext superclassSubscriptExpression() throws RecognitionException {
		SuperclassSubscriptExpressionContext _localctx = new SuperclassSubscriptExpressionContext(_ctx, getState());
		enterRule(_localctx, 376, RULE_superclassSubscriptExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1966);
			match(T__113);
			setState(1967);
			match(T__100);
			setState(1968);
			expressionElementList();
			setState(1969);
			match(T__101);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SuperclassInitializerExpressionContext extends ParserRuleContext {
		public SuperclassInitializerExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superclassInitializerExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterSuperclassInitializerExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitSuperclassInitializerExpression(this);
		}
	}

	public final SuperclassInitializerExpressionContext superclassInitializerExpression() throws RecognitionException {
		SuperclassInitializerExpressionContext _localctx = new SuperclassInitializerExpressionContext(_ctx, getState());
		enterRule(_localctx, 378, RULE_superclassInitializerExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1971);
			match(T__113);
			setState(1972);
			match(T__2);
			setState(1973);
			match(T__85);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClosureExpressionContext extends ParserRuleContext {
		public ClosureSignatureContext closureSignature() {
			return getRuleContext(ClosureSignatureContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public ClosureExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closureExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterClosureExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitClosureExpression(this);
		}
	}

	public final ClosureExpressionContext closureExpression() throws RecognitionException {
		ClosureExpressionContext _localctx = new ClosureExpressionContext(_ctx, getState());
		enterRule(_localctx, 380, RULE_closureExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1975);
			match(T__15);
			setState(1977);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,235,_ctx) ) {
			case 1:
				{
				setState(1976);
				closureSignature();
				}
				break;
			}
			setState(1980);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__37) | (1L << T__39) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__78 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__83 - 64)) | (1L << (T__84 - 64)) | (1L << (T__85 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (T__89 - 64)) | (1L << (T__90 - 64)) | (1L << (T__91 - 64)) | (1L << (T__92 - 64)) | (1L << (T__93 - 64)) | (1L << (T__94 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__99 - 64)) | (1L << (T__100 - 64)) | (1L << (T__102 - 64)) | (1L << (T__104 - 64)) | (1L << (T__106 - 64)) | (1L << (T__107 - 64)) | (1L << (T__108 - 64)) | (1L << (T__109 - 64)) | (1L << (T__110 - 64)) | (1L << (T__111 - 64)) | (1L << (T__112 - 64)) | (1L << (T__113 - 64)) | (1L << (T__116 - 64)) | (1L << (T__119 - 64)) | (1L << (T__120 - 64)) | (1L << (T__121 - 64)) | (1L << (T__122 - 64)) | (1L << (T__123 - 64)) | (1L << (T__124 - 64)) | (1L << (T__125 - 64)) | (1L << (T__126 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__127 - 128)) | (1L << (T__128 - 128)) | (1L << (T__129 - 128)) | (1L << (T__130 - 128)) | (1L << (T__131 - 128)) | (1L << (T__132 - 128)) | (1L << (T__133 - 128)) | (1L << (T__134 - 128)) | (1L << (T__136 - 128)) | (1L << (T__137 - 128)) | (1L << (T__138 - 128)) | (1L << (T__139 - 128)) | (1L << (T__140 - 128)) | (1L << (T__141 - 128)) | (1L << (T__142 - 128)) | (1L << (T__143 - 128)) | (1L << (T__144 - 128)) | (1L << (T__145 - 128)) | (1L << (T__146 - 128)) | (1L << (BooleanLiteral - 128)) | (1L << (NilLiteral - 128)) | (1L << (OperatorHead - 128)) | (1L << (DotOperatorHead - 128)) | (1L << (Identifier - 128)) | (1L << (BinaryLiteral - 128)) | (1L << (OctalLiteral - 128)) | (1L << (DecimalLiteral - 128)) | (1L << (HexadecimalLiteral - 128)) | (1L << (FloatingPointLiteral - 128)) | (1L << (StringLiteral - 128)))) != 0)) {
				{
				setState(1979);
				statements();
				}
			}

			setState(1982);
			match(T__16);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClosureSignatureContext extends ParserRuleContext {
		public ClosureParameterClauseContext closureParameterClause() {
			return getRuleContext(ClosureParameterClauseContext.class,0);
		}
		public CaptureListContext captureList() {
			return getRuleContext(CaptureListContext.class,0);
		}
		public FunctionResultContext functionResult() {
			return getRuleContext(FunctionResultContext.class,0);
		}
		public ClosureSignatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closureSignature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterClosureSignature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitClosureSignature(this);
		}
	}

	public final ClosureSignatureContext closureSignature() throws RecognitionException {
		ClosureSignatureContext _localctx = new ClosureSignatureContext(_ctx, getState());
		enterRule(_localctx, 382, RULE_closureSignature);
		int _la;
		try {
			setState(1999);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,240,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1985);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__100) {
					{
					setState(1984);
					captureList();
					}
				}

				setState(1987);
				closureParameterClause();
				setState(1989);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__78) {
					{
					setState(1988);
					match(T__78);
					}
				}

				setState(1992);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__80) {
					{
					setState(1991);
					functionResult();
					}
				}

				setState(1994);
				match(T__8);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1996);
				captureList();
				setState(1997);
				match(T__8);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClosureParameterClauseContext extends ParserRuleContext {
		public ClosureParameterListContext closureParameterList() {
			return getRuleContext(ClosureParameterListContext.class,0);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public ClosureParameterClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closureParameterClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterClosureParameterClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitClosureParameterClause(this);
		}
	}

	public final ClosureParameterClauseContext closureParameterClause() throws RecognitionException {
		ClosureParameterClauseContext _localctx = new ClosureParameterClauseContext(_ctx, getState());
		enterRule(_localctx, 384, RULE_closureParameterClause);
		try {
			setState(2008);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,241,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2001);
				match(T__30);
				setState(2002);
				match(T__31);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2003);
				match(T__30);
				setState(2004);
				closureParameterList();
				setState(2005);
				match(T__31);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2007);
				identifierList();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClosureParameterListContext extends ParserRuleContext {
		public ClosureParameterContext closureParameter() {
			return getRuleContext(ClosureParameterContext.class,0);
		}
		public List<ClosureParameterListContext> closureParameterList() {
			return getRuleContexts(ClosureParameterListContext.class);
		}
		public ClosureParameterListContext closureParameterList(int i) {
			return getRuleContext(ClosureParameterListContext.class,i);
		}
		public ClosureParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closureParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterClosureParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitClosureParameterList(this);
		}
	}

	public final ClosureParameterListContext closureParameterList() throws RecognitionException {
		ClosureParameterListContext _localctx = new ClosureParameterListContext(_ctx, getState());
		enterRule(_localctx, 386, RULE_closureParameterList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2010);
			closureParameter();
			setState(2015);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,242,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2011);
					match(T__17);
					setState(2012);
					closureParameterList();
					}
					} 
				}
				setState(2017);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,242,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClosureParameterContext extends ParserRuleContext {
		public ClosureParameterNameContext closureParameterName() {
			return getRuleContext(ClosureParameterNameContext.class,0);
		}
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public ClosureParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closureParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterClosureParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitClosureParameter(this);
		}
	}

	public final ClosureParameterContext closureParameter() throws RecognitionException {
		ClosureParameterContext _localctx = new ClosureParameterContext(_ctx, getState());
		enterRule(_localctx, 388, RULE_closureParameter);
		int _la;
		try {
			setState(2026);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,244,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2018);
				closureParameterName();
				setState(2020);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(2019);
					typeAnnotation();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2022);
				closureParameterName();
				setState(2023);
				typeAnnotation();
				setState(2024);
				match(T__81);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClosureParameterNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ClosureParameterNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closureParameterName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterClosureParameterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitClosureParameterName(this);
		}
	}

	public final ClosureParameterNameContext closureParameterName() throws RecognitionException {
		ClosureParameterNameContext _localctx = new ClosureParameterNameContext(_ctx, getState());
		enterRule(_localctx, 390, RULE_closureParameterName);
		try {
			setState(2030);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__18:
			case T__27:
			case T__33:
			case T__34:
			case T__35:
			case T__37:
			case T__39:
			case T__45:
			case T__46:
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case T__54:
			case T__55:
			case T__56:
			case T__58:
			case T__59:
			case T__61:
			case T__63:
			case T__75:
			case T__76:
			case T__77:
			case T__83:
			case T__91:
			case T__92:
			case T__93:
			case T__94:
			case T__95:
			case T__96:
			case T__124:
			case T__125:
			case T__127:
			case T__133:
			case T__134:
			case T__136:
			case T__137:
			case T__138:
			case T__139:
			case T__141:
			case T__142:
			case T__146:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(2028);
				identifier();
				}
				break;
			case T__82:
				enterOuterAlt(_localctx, 2);
				{
				setState(2029);
				match(T__82);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaptureListContext extends ParserRuleContext {
		public CaptureListItemsContext captureListItems() {
			return getRuleContext(CaptureListItemsContext.class,0);
		}
		public CaptureListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_captureList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterCaptureList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitCaptureList(this);
		}
	}

	public final CaptureListContext captureList() throws RecognitionException {
		CaptureListContext _localctx = new CaptureListContext(_ctx, getState());
		enterRule(_localctx, 392, RULE_captureList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2032);
			match(T__100);
			setState(2033);
			captureListItems();
			setState(2034);
			match(T__101);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaptureListItemsContext extends ParserRuleContext {
		public List<CaptureListItemContext> captureListItem() {
			return getRuleContexts(CaptureListItemContext.class);
		}
		public CaptureListItemContext captureListItem(int i) {
			return getRuleContext(CaptureListItemContext.class,i);
		}
		public CaptureListItemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_captureListItems; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterCaptureListItems(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitCaptureListItems(this);
		}
	}

	public final CaptureListItemsContext captureListItems() throws RecognitionException {
		CaptureListItemsContext _localctx = new CaptureListItemsContext(_ctx, getState());
		enterRule(_localctx, 394, RULE_captureListItems);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2036);
			captureListItem();
			setState(2041);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__17) {
				{
				{
				setState(2037);
				match(T__17);
				setState(2038);
				captureListItem();
				}
				}
				setState(2043);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaptureListItemContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CaptureSpecifierContext captureSpecifier() {
			return getRuleContext(CaptureSpecifierContext.class,0);
		}
		public CaptureListItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_captureListItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterCaptureListItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitCaptureListItem(this);
		}
	}

	public final CaptureListItemContext captureListItem() throws RecognitionException {
		CaptureListItemContext _localctx = new CaptureListItemContext(_ctx, getState());
		enterRule(_localctx, 396, RULE_captureListItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2045);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,247,_ctx) ) {
			case 1:
				{
				setState(2044);
				captureSpecifier();
				}
				break;
			}
			setState(2047);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaptureSpecifierContext extends ParserRuleContext {
		public CaptureSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_captureSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterCaptureSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitCaptureSpecifier(this);
		}
	}

	public final CaptureSpecifierContext captureSpecifier() throws RecognitionException {
		CaptureSpecifierContext _localctx = new CaptureSpecifierContext(_ctx, getState());
		enterRule(_localctx, 398, RULE_captureSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2049);
			_la = _input.LA(1);
			if ( !(((((_la - 59)) & ~0x3f) == 0 && ((1L << (_la - 59)) & ((1L << (T__58 - 59)) | (1L << (T__61 - 59)) | (1L << (T__114 - 59)) | (1L << (T__115 - 59)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImplicitMemberExpressionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ImplicitMemberExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implicitMemberExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterImplicitMemberExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitImplicitMemberExpression(this);
		}
	}

	public final ImplicitMemberExpressionContext implicitMemberExpression() throws RecognitionException {
		ImplicitMemberExpressionContext _localctx = new ImplicitMemberExpressionContext(_ctx, getState());
		enterRule(_localctx, 400, RULE_implicitMemberExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2051);
			match(T__2);
			setState(2052);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParenthesizedExpressionContext extends ParserRuleContext {
		public ExpressionElementListContext expressionElementList() {
			return getRuleContext(ExpressionElementListContext.class,0);
		}
		public ParenthesizedExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parenthesizedExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterParenthesizedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitParenthesizedExpression(this);
		}
	}

	public final ParenthesizedExpressionContext parenthesizedExpression() throws RecognitionException {
		ParenthesizedExpressionContext _localctx = new ParenthesizedExpressionContext(_ctx, getState());
		enterRule(_localctx, 402, RULE_parenthesizedExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2054);
			match(T__30);
			setState(2056);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__37) | (1L << T__39) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__78 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__83 - 64)) | (1L << (T__84 - 64)) | (1L << (T__85 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (T__89 - 64)) | (1L << (T__90 - 64)) | (1L << (T__91 - 64)) | (1L << (T__92 - 64)) | (1L << (T__93 - 64)) | (1L << (T__94 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__100 - 64)) | (1L << (T__102 - 64)) | (1L << (T__104 - 64)) | (1L << (T__106 - 64)) | (1L << (T__107 - 64)) | (1L << (T__108 - 64)) | (1L << (T__109 - 64)) | (1L << (T__110 - 64)) | (1L << (T__111 - 64)) | (1L << (T__112 - 64)) | (1L << (T__113 - 64)) | (1L << (T__116 - 64)) | (1L << (T__119 - 64)) | (1L << (T__120 - 64)) | (1L << (T__121 - 64)) | (1L << (T__122 - 64)) | (1L << (T__123 - 64)) | (1L << (T__124 - 64)) | (1L << (T__125 - 64)) | (1L << (T__126 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__127 - 128)) | (1L << (T__128 - 128)) | (1L << (T__129 - 128)) | (1L << (T__130 - 128)) | (1L << (T__131 - 128)) | (1L << (T__132 - 128)) | (1L << (T__133 - 128)) | (1L << (T__134 - 128)) | (1L << (T__136 - 128)) | (1L << (T__137 - 128)) | (1L << (T__138 - 128)) | (1L << (T__139 - 128)) | (1L << (T__141 - 128)) | (1L << (T__142 - 128)) | (1L << (T__143 - 128)) | (1L << (T__144 - 128)) | (1L << (T__145 - 128)) | (1L << (T__146 - 128)) | (1L << (BooleanLiteral - 128)) | (1L << (NilLiteral - 128)) | (1L << (OperatorHead - 128)) | (1L << (DotOperatorHead - 128)) | (1L << (Identifier - 128)) | (1L << (BinaryLiteral - 128)) | (1L << (OctalLiteral - 128)) | (1L << (DecimalLiteral - 128)) | (1L << (HexadecimalLiteral - 128)) | (1L << (FloatingPointLiteral - 128)) | (1L << (StringLiteral - 128)))) != 0)) {
				{
				setState(2055);
				expressionElementList();
				}
			}

			setState(2058);
			match(T__31);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionElementListContext extends ParserRuleContext {
		public List<ExpressionElementContext> expressionElement() {
			return getRuleContexts(ExpressionElementContext.class);
		}
		public ExpressionElementContext expressionElement(int i) {
			return getRuleContext(ExpressionElementContext.class,i);
		}
		public ExpressionElementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionElementList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterExpressionElementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitExpressionElementList(this);
		}
	}

	public final ExpressionElementListContext expressionElementList() throws RecognitionException {
		ExpressionElementListContext _localctx = new ExpressionElementListContext(_ctx, getState());
		enterRule(_localctx, 404, RULE_expressionElementList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2060);
			expressionElement();
			setState(2065);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__17) {
				{
				{
				setState(2061);
				match(T__17);
				setState(2062);
				expressionElement();
				}
				}
				setState(2067);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionElementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionElementIdentifierContext expressionElementIdentifier() {
			return getRuleContext(ExpressionElementIdentifierContext.class,0);
		}
		public ExpressionElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterExpressionElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitExpressionElement(this);
		}
	}

	public final ExpressionElementContext expressionElement() throws RecognitionException {
		ExpressionElementContext _localctx = new ExpressionElementContext(_ctx, getState());
		enterRule(_localctx, 406, RULE_expressionElement);
		int _la;
		try {
			setState(2074);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,251,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2068);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2069);
				expressionElementIdentifier();
				setState(2070);
				match(T__1);
				setState(2072);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__37) | (1L << T__39) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__78 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__83 - 64)) | (1L << (T__84 - 64)) | (1L << (T__85 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (T__89 - 64)) | (1L << (T__90 - 64)) | (1L << (T__91 - 64)) | (1L << (T__92 - 64)) | (1L << (T__93 - 64)) | (1L << (T__94 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__100 - 64)) | (1L << (T__102 - 64)) | (1L << (T__104 - 64)) | (1L << (T__106 - 64)) | (1L << (T__107 - 64)) | (1L << (T__108 - 64)) | (1L << (T__109 - 64)) | (1L << (T__110 - 64)) | (1L << (T__111 - 64)) | (1L << (T__112 - 64)) | (1L << (T__113 - 64)) | (1L << (T__116 - 64)) | (1L << (T__119 - 64)) | (1L << (T__120 - 64)) | (1L << (T__121 - 64)) | (1L << (T__122 - 64)) | (1L << (T__123 - 64)) | (1L << (T__124 - 64)) | (1L << (T__125 - 64)) | (1L << (T__126 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__127 - 128)) | (1L << (T__128 - 128)) | (1L << (T__129 - 128)) | (1L << (T__130 - 128)) | (1L << (T__131 - 128)) | (1L << (T__132 - 128)) | (1L << (T__133 - 128)) | (1L << (T__134 - 128)) | (1L << (T__136 - 128)) | (1L << (T__137 - 128)) | (1L << (T__138 - 128)) | (1L << (T__139 - 128)) | (1L << (T__141 - 128)) | (1L << (T__142 - 128)) | (1L << (T__143 - 128)) | (1L << (T__144 - 128)) | (1L << (T__145 - 128)) | (1L << (T__146 - 128)) | (1L << (BooleanLiteral - 128)) | (1L << (NilLiteral - 128)) | (1L << (OperatorHead - 128)) | (1L << (DotOperatorHead - 128)) | (1L << (Identifier - 128)) | (1L << (BinaryLiteral - 128)) | (1L << (OctalLiteral - 128)) | (1L << (DecimalLiteral - 128)) | (1L << (HexadecimalLiteral - 128)) | (1L << (FloatingPointLiteral - 128)) | (1L << (StringLiteral - 128)))) != 0)) {
					{
					setState(2071);
					expression();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionElementIdentifierContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public ExpressionElementIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionElementIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterExpressionElementIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitExpressionElementIdentifier(this);
		}
	}

	public final ExpressionElementIdentifierContext expressionElementIdentifier() throws RecognitionException {
		ExpressionElementIdentifierContext _localctx = new ExpressionElementIdentifierContext(_ctx, getState());
		enterRule(_localctx, 408, RULE_expressionElementIdentifier);
		try {
			setState(2078);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,252,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2076);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2077);
				keyword();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WildcardExpressionContext extends ParserRuleContext {
		public WildcardExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wildcardExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterWildcardExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitWildcardExpression(this);
		}
	}

	public final WildcardExpressionContext wildcardExpression() throws RecognitionException {
		WildcardExpressionContext _localctx = new WildcardExpressionContext(_ctx, getState());
		enterRule(_localctx, 410, RULE_wildcardExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2080);
			match(T__82);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectorExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SelectorExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectorExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterSelectorExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitSelectorExpression(this);
		}
	}

	public final SelectorExpressionContext selectorExpression() throws RecognitionException {
		SelectorExpressionContext _localctx = new SelectorExpressionContext(_ctx, getState());
		enterRule(_localctx, 412, RULE_selectorExpression);
		int _la;
		try {
			setState(2093);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,253,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2082);
				match(T__116);
				setState(2083);
				match(T__30);
				setState(2084);
				expression();
				setState(2085);
				match(T__31);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2087);
				match(T__116);
				setState(2088);
				match(T__30);
				setState(2089);
				_la = _input.LA(1);
				if ( !(_la==T__117 || _la==T__118) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2090);
				expression();
				setState(2091);
				match(T__31);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeyPathExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public KeyPathExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyPathExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterKeyPathExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitKeyPathExpression(this);
		}
	}

	public final KeyPathExpressionContext keyPathExpression() throws RecognitionException {
		KeyPathExpressionContext _localctx = new KeyPathExpressionContext(_ctx, getState());
		enterRule(_localctx, 414, RULE_keyPathExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2095);
			match(T__119);
			setState(2096);
			match(T__30);
			setState(2097);
			expression();
			setState(2098);
			match(T__31);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostfixExpressionContext extends ParserRuleContext {
		public PostfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixExpression; }
	 
		public PostfixExpressionContext() { }
		public void copyFrom(PostfixExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DynamicTypeExpressionContext extends PostfixExpressionContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public DynamicTypeExpressionContext(PostfixExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterDynamicTypeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitDynamicTypeExpression(this);
		}
	}
	public static class FunctionCallWithClosureExpressionContext extends PostfixExpressionContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public ClosureExpressionContext closureExpression() {
			return getRuleContext(ClosureExpressionContext.class,0);
		}
		public ParenthesizedExpressionContext parenthesizedExpression() {
			return getRuleContext(ParenthesizedExpressionContext.class,0);
		}
		public FunctionCallWithClosureExpressionContext(PostfixExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterFunctionCallWithClosureExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitFunctionCallWithClosureExpression(this);
		}
	}
	public static class SubscriptExpressionContext extends PostfixExpressionContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public ExpressionElementListContext expressionElementList() {
			return getRuleContext(ExpressionElementListContext.class,0);
		}
		public SubscriptExpressionContext(PostfixExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterSubscriptExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitSubscriptExpression(this);
		}
	}
	public static class PostfixSelfExpressionContext extends PostfixExpressionContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public PostfixSelfExpressionContext(PostfixExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterPostfixSelfExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitPostfixSelfExpression(this);
		}
	}
	public static class OptionalChainingExpressionContext extends PostfixExpressionContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public OptionalChainingExpressionContext(PostfixExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterOptionalChainingExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitOptionalChainingExpression(this);
		}
	}
	public static class ExplicitMemberExpression1Context extends PostfixExpressionContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public TerminalNode DecimalLiteral() { return getToken(Swift3Parser.DecimalLiteral, 0); }
		public ExplicitMemberExpression1Context(PostfixExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterExplicitMemberExpression1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitExplicitMemberExpression1(this);
		}
	}
	public static class PostfixOperationContext extends PostfixExpressionContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public PostfixOperatorContext postfixOperator() {
			return getRuleContext(PostfixOperatorContext.class,0);
		}
		public PostfixOperationContext(PostfixExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterPostfixOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitPostfixOperation(this);
		}
	}
	public static class InitializerExpressionContext extends PostfixExpressionContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public InitializerExpressionContext(PostfixExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterInitializerExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitInitializerExpression(this);
		}
	}
	public static class ForcedValueExpressionContext extends PostfixExpressionContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public ForcedValueExpressionContext(PostfixExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterForcedValueExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitForcedValueExpression(this);
		}
	}
	public static class ExplicitMemberExpression3Context extends PostfixExpressionContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ArgumentNamesContext argumentNames() {
			return getRuleContext(ArgumentNamesContext.class,0);
		}
		public ExplicitMemberExpression3Context(PostfixExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterExplicitMemberExpression3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitExplicitMemberExpression3(this);
		}
	}
	public static class ExplicitMemberExpression2Context extends PostfixExpressionContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public GenericArgumentClauseContext genericArgumentClause() {
			return getRuleContext(GenericArgumentClauseContext.class,0);
		}
		public ExplicitMemberExpression2Context(PostfixExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterExplicitMemberExpression2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitExplicitMemberExpression2(this);
		}
	}
	public static class FunctionCallExpressionContext extends PostfixExpressionContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public ParenthesizedExpressionContext parenthesizedExpression() {
			return getRuleContext(ParenthesizedExpressionContext.class,0);
		}
		public FunctionCallExpressionContext(PostfixExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterFunctionCallExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitFunctionCallExpression(this);
		}
	}
	public static class InitializerExpressionWithArgumentsContext extends PostfixExpressionContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public ArgumentNamesContext argumentNames() {
			return getRuleContext(ArgumentNamesContext.class,0);
		}
		public InitializerExpressionWithArgumentsContext(PostfixExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterInitializerExpressionWithArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitInitializerExpressionWithArguments(this);
		}
	}
	public static class PrimaryContext extends PostfixExpressionContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public PrimaryContext(PostfixExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitPrimary(this);
		}
	}

	public final PostfixExpressionContext postfixExpression() throws RecognitionException {
		return postfixExpression(0);
	}

	private PostfixExpressionContext postfixExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PostfixExpressionContext _localctx = new PostfixExpressionContext(_ctx, _parentState);
		PostfixExpressionContext _prevctx = _localctx;
		int _startState = 416;
		enterRecursionRule(_localctx, 416, RULE_postfixExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new PrimaryContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(2101);
			primaryExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(2155);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,257,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2153);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,256,_ctx) ) {
					case 1:
						{
						_localctx = new PostfixOperationContext(new PostfixExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(2103);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(2104);
						postfixOperator();
						}
						break;
					case 2:
						{
						_localctx = new FunctionCallWithClosureExpressionContext(new PostfixExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(2105);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(2107);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==T__30) {
							{
							setState(2106);
							parenthesizedExpression();
							}
						}

						setState(2109);
						closureExpression();
						}
						break;
					case 3:
						{
						_localctx = new FunctionCallExpressionContext(new PostfixExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(2110);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(2111);
						parenthesizedExpression();
						}
						break;
					case 4:
						{
						_localctx = new InitializerExpressionContext(new PostfixExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(2112);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(2113);
						match(T__2);
						setState(2114);
						match(T__85);
						}
						break;
					case 5:
						{
						_localctx = new InitializerExpressionWithArgumentsContext(new PostfixExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(2115);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(2116);
						match(T__2);
						setState(2117);
						match(T__85);
						setState(2118);
						match(T__30);
						setState(2119);
						argumentNames();
						setState(2120);
						match(T__31);
						}
						break;
					case 6:
						{
						_localctx = new ExplicitMemberExpression1Context(new PostfixExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(2122);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(2123);
						match(T__2);
						setState(2124);
						match(DecimalLiteral);
						}
						break;
					case 7:
						{
						_localctx = new ExplicitMemberExpression2Context(new PostfixExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(2125);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(2126);
						match(T__2);
						setState(2127);
						identifier();
						setState(2129);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,255,_ctx) ) {
						case 1:
							{
							setState(2128);
							genericArgumentClause();
							}
							break;
						}
						}
						break;
					case 8:
						{
						_localctx = new ExplicitMemberExpression3Context(new PostfixExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(2131);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(2132);
						match(T__2);
						setState(2133);
						identifier();
						setState(2134);
						match(T__30);
						setState(2135);
						argumentNames();
						setState(2136);
						match(T__31);
						}
						break;
					case 9:
						{
						_localctx = new PostfixSelfExpressionContext(new PostfixExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(2138);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(2139);
						match(T__2);
						setState(2140);
						match(T__112);
						}
						break;
					case 10:
						{
						_localctx = new DynamicTypeExpressionContext(new PostfixExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(2141);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(2142);
						match(T__2);
						setState(2143);
						match(T__120);
						}
						break;
					case 11:
						{
						_localctx = new SubscriptExpressionContext(new PostfixExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(2144);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(2145);
						match(T__100);
						setState(2146);
						expressionElementList();
						setState(2147);
						match(T__101);
						}
						break;
					case 12:
						{
						_localctx = new ForcedValueExpressionContext(new PostfixExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(2149);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2150);
						match(T__87);
						}
						break;
					case 13:
						{
						_localctx = new OptionalChainingExpressionContext(new PostfixExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(2151);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2152);
						match(T__86);
						}
						break;
					}
					} 
				}
				setState(2157);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,257,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ArgumentNamesContext extends ParserRuleContext {
		public List<ArgumentNameContext> argumentName() {
			return getRuleContexts(ArgumentNameContext.class);
		}
		public ArgumentNameContext argumentName(int i) {
			return getRuleContext(ArgumentNameContext.class,i);
		}
		public ArgumentNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentNames; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterArgumentNames(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitArgumentNames(this);
		}
	}

	public final ArgumentNamesContext argumentNames() throws RecognitionException {
		ArgumentNamesContext _localctx = new ArgumentNamesContext(_ctx, getState());
		enterRule(_localctx, 418, RULE_argumentNames);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2159); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2158);
				argumentName();
				}
				}
				setState(2161); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__18) | (1L << T__27) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__37) | (1L << T__39) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__58) | (1L << T__59) | (1L << T__61))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__82 - 64)) | (1L << (T__83 - 64)) | (1L << (T__91 - 64)) | (1L << (T__92 - 64)) | (1L << (T__93 - 64)) | (1L << (T__94 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__124 - 64)) | (1L << (T__125 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__127 - 128)) | (1L << (T__133 - 128)) | (1L << (T__134 - 128)) | (1L << (T__136 - 128)) | (1L << (T__137 - 128)) | (1L << (T__138 - 128)) | (1L << (T__139 - 128)) | (1L << (T__141 - 128)) | (1L << (T__142 - 128)) | (1L << (T__146 - 128)) | (1L << (Identifier - 128)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ArgumentNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterArgumentName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitArgumentName(this);
		}
	}

	public final ArgumentNameContext argumentName() throws RecognitionException {
		ArgumentNameContext _localctx = new ArgumentNameContext(_ctx, getState());
		enterRule(_localctx, 420, RULE_argumentName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2165);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__18:
			case T__27:
			case T__33:
			case T__34:
			case T__35:
			case T__37:
			case T__39:
			case T__45:
			case T__46:
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case T__54:
			case T__55:
			case T__56:
			case T__58:
			case T__59:
			case T__61:
			case T__63:
			case T__75:
			case T__76:
			case T__77:
			case T__83:
			case T__91:
			case T__92:
			case T__93:
			case T__94:
			case T__95:
			case T__96:
			case T__124:
			case T__125:
			case T__127:
			case T__133:
			case T__134:
			case T__136:
			case T__137:
			case T__138:
			case T__139:
			case T__141:
			case T__142:
			case T__146:
			case Identifier:
				{
				setState(2163);
				identifier();
				}
				break;
			case T__82:
				{
				setState(2164);
				match(T__82);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2167);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperatorHeadContext extends ParserRuleContext {
		public TerminalNode OperatorHead() { return getToken(Swift3Parser.OperatorHead, 0); }
		public OperatorHeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorHead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterOperatorHead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitOperatorHead(this);
		}
	}

	public final OperatorHeadContext operatorHead() throws RecognitionException {
		OperatorHeadContext _localctx = new OperatorHeadContext(_ctx, getState());
		enterRule(_localctx, 422, RULE_operatorHead);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2169);
			_la = _input.LA(1);
			if ( !(((((_la - 33)) & ~0x3f) == 0 && ((1L << (_la - 33)) & ((1L << (T__32 - 33)) | (1L << (T__41 - 33)) | (1L << (T__42 - 33)) | (1L << (T__43 - 33)) | (1L << (T__74 - 33)) | (1L << (T__80 - 33)) | (1L << (T__86 - 33)) | (1L << (T__87 - 33)))) != 0) || ((((_la - 103)) & ~0x3f) == 0 && ((1L << (_la - 103)) & ((1L << (T__102 - 103)) | (1L << (T__104 - 103)) | (1L << (T__106 - 103)) | (1L << (T__121 - 103)) | (1L << (T__122 - 103)) | (1L << (T__123 - 103)) | (1L << (OperatorHead - 103)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperatorCharacterContext extends ParserRuleContext {
		public OperatorHeadContext operatorHead() {
			return getRuleContext(OperatorHeadContext.class,0);
		}
		public TerminalNode OperatorCharacter() { return getToken(Swift3Parser.OperatorCharacter, 0); }
		public OperatorCharacterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorCharacter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterOperatorCharacter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitOperatorCharacter(this);
		}
	}

	public final OperatorCharacterContext operatorCharacter() throws RecognitionException {
		OperatorCharacterContext _localctx = new OperatorCharacterContext(_ctx, getState());
		enterRule(_localctx, 424, RULE_operatorCharacter);
		try {
			setState(2173);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__32:
			case T__41:
			case T__42:
			case T__43:
			case T__74:
			case T__80:
			case T__86:
			case T__87:
			case T__102:
			case T__104:
			case T__106:
			case T__121:
			case T__122:
			case T__123:
			case OperatorHead:
				enterOuterAlt(_localctx, 1);
				{
				setState(2171);
				operatorHead();
				}
				break;
			case OperatorCharacter:
				enterOuterAlt(_localctx, 2);
				{
				setState(2172);
				match(OperatorCharacter);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperatorContext extends ParserRuleContext {
		public OperatorHeadContext operatorHead() {
			return getRuleContext(OperatorHeadContext.class,0);
		}
		public List<OperatorCharacterContext> operatorCharacter() {
			return getRuleContexts(OperatorCharacterContext.class);
		}
		public OperatorCharacterContext operatorCharacter(int i) {
			return getRuleContext(OperatorCharacterContext.class,i);
		}
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitOperator(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 426, RULE_operator);
		try {
			int _alt;
			setState(2190);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__32:
			case T__41:
			case T__42:
			case T__43:
			case T__74:
			case T__80:
			case T__86:
			case T__87:
			case T__102:
			case T__104:
			case T__106:
			case T__121:
			case T__122:
			case T__123:
			case OperatorHead:
				enterOuterAlt(_localctx, 1);
				{
				setState(2175);
				operatorHead();
				setState(2179);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,261,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2176);
						operatorCharacter();
						}
						} 
					}
					setState(2181);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,261,_ctx);
				}
				}
				break;
			case DotOperatorHead:
				enterOuterAlt(_localctx, 2);
				{
				setState(2182);
				match(DotOperatorHead);
				setState(2186);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,262,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2183);
						operatorCharacter();
						}
						} 
					}
					setState(2188);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,262,_ctx);
				}
				}
				break;
			case T__81:
				enterOuterAlt(_localctx, 3);
				{
				setState(2189);
				match(T__81);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BinaryOperatorContext extends ParserRuleContext {
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public BinaryOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterBinaryOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitBinaryOperator(this);
		}
	}

	public final BinaryOperatorContext binaryOperator() throws RecognitionException {
		BinaryOperatorContext _localctx = new BinaryOperatorContext(_ctx, getState());
		enterRule(_localctx, 428, RULE_binaryOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2192);
			operator();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrefixOperatorContext extends ParserRuleContext {
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public PrefixOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefixOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterPrefixOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitPrefixOperator(this);
		}
	}

	public final PrefixOperatorContext prefixOperator() throws RecognitionException {
		PrefixOperatorContext _localctx = new PrefixOperatorContext(_ctx, getState());
		enterRule(_localctx, 430, RULE_prefixOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2194);
			operator();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostfixOperatorContext extends ParserRuleContext {
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public PostfixOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterPostfixOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitPostfixOperator(this);
		}
	}

	public final PostfixOperatorContext postfixOperator() throws RecognitionException {
		PostfixOperatorContext _localctx = new PostfixOperatorContext(_ctx, getState());
		enterRule(_localctx, 432, RULE_postfixOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2196);
			operator();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class STypeContext extends ParserRuleContext {
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public DictionaryTypeContext dictionaryType() {
			return getRuleContext(DictionaryTypeContext.class,0);
		}
		public TupleTypeContext tupleType() {
			return getRuleContext(TupleTypeContext.class,0);
		}
		public List<STypeContext> sType() {
			return getRuleContexts(STypeContext.class);
		}
		public STypeContext sType(int i) {
			return getRuleContext(STypeContext.class,i);
		}
		public TypeIdentifierContext typeIdentifier() {
			return getRuleContext(TypeIdentifierContext.class,0);
		}
		public ProtocolCompositionTypeContext protocolCompositionType() {
			return getRuleContext(ProtocolCompositionTypeContext.class,0);
		}
		public STypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterSType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitSType(this);
		}
	}

	public final STypeContext sType() throws RecognitionException {
		return sType(0);
	}

	private STypeContext sType(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		STypeContext _localctx = new STypeContext(_ctx, _parentState);
		STypeContext _prevctx = _localctx;
		int _startState = 434;
		enterRecursionRule(_localctx, 434, RULE_sType, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2234);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,266,_ctx) ) {
			case 1:
				{
				setState(2199);
				arrayType();
				}
				break;
			case 2:
				{
				setState(2200);
				dictionaryType();
				}
				break;
			case 3:
				{
				setState(2201);
				tupleType();
				setState(2203);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__78) {
					{
					setState(2202);
					match(T__78);
					}
				}

				setState(2205);
				match(T__80);
				setState(2206);
				sType(13);
				}
				break;
			case 4:
				{
				setState(2208);
				tupleType();
				setState(2209);
				match(T__79);
				setState(2210);
				match(T__80);
				setState(2211);
				sType(12);
				}
				break;
			case 5:
				{
				setState(2213);
				match(T__30);
				setState(2214);
				sType(0);
				setState(2215);
				match(T__31);
				setState(2217);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__78) {
					{
					setState(2216);
					match(T__78);
					}
				}

				setState(2219);
				match(T__80);
				setState(2220);
				sType(11);
				}
				break;
			case 6:
				{
				setState(2222);
				match(T__30);
				setState(2223);
				sType(0);
				setState(2224);
				match(T__31);
				setState(2225);
				match(T__79);
				setState(2226);
				match(T__80);
				setState(2227);
				sType(10);
				}
				break;
			case 7:
				{
				setState(2229);
				typeIdentifier();
				}
				break;
			case 8:
				{
				setState(2230);
				tupleType();
				}
				break;
			case 9:
				{
				setState(2231);
				protocolCompositionType();
				}
				break;
			case 10:
				{
				setState(2232);
				match(T__126);
				}
				break;
			case 11:
				{
				setState(2233);
				match(T__127);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2248);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,268,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2246);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,267,_ctx) ) {
					case 1:
						{
						_localctx = new STypeContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_sType);
						setState(2236);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(2237);
						match(T__86);
						}
						break;
					case 2:
						{
						_localctx = new STypeContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_sType);
						setState(2238);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(2239);
						match(T__87);
						}
						break;
					case 3:
						{
						_localctx = new STypeContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_sType);
						setState(2240);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(2241);
						match(T__2);
						setState(2242);
						match(T__124);
						}
						break;
					case 4:
						{
						_localctx = new STypeContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_sType);
						setState(2243);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(2244);
						match(T__2);
						setState(2245);
						match(T__125);
						}
						break;
					}
					} 
				}
				setState(2250);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,268,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ArrayTypeContext extends ParserRuleContext {
		public STypeContext sType() {
			return getRuleContext(STypeContext.class,0);
		}
		public ArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitArrayType(this);
		}
	}

	public final ArrayTypeContext arrayType() throws RecognitionException {
		ArrayTypeContext _localctx = new ArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 436, RULE_arrayType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2251);
			match(T__100);
			setState(2252);
			sType(0);
			setState(2253);
			match(T__101);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DictionaryTypeContext extends ParserRuleContext {
		public List<STypeContext> sType() {
			return getRuleContexts(STypeContext.class);
		}
		public STypeContext sType(int i) {
			return getRuleContext(STypeContext.class,i);
		}
		public DictionaryTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictionaryType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterDictionaryType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitDictionaryType(this);
		}
	}

	public final DictionaryTypeContext dictionaryType() throws RecognitionException {
		DictionaryTypeContext _localctx = new DictionaryTypeContext(_ctx, getState());
		enterRule(_localctx, 438, RULE_dictionaryType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2255);
			match(T__100);
			setState(2256);
			sType(0);
			setState(2257);
			match(T__1);
			setState(2258);
			sType(0);
			setState(2259);
			match(T__101);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptionalTypeContext extends ParserRuleContext {
		public STypeContext sType() {
			return getRuleContext(STypeContext.class,0);
		}
		public OptionalTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionalType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterOptionalType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitOptionalType(this);
		}
	}

	public final OptionalTypeContext optionalType() throws RecognitionException {
		OptionalTypeContext _localctx = new OptionalTypeContext(_ctx, getState());
		enterRule(_localctx, 440, RULE_optionalType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2261);
			sType(0);
			setState(2262);
			match(T__86);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImplicitlyUnwrappedOptionalTypeContext extends ParserRuleContext {
		public STypeContext sType() {
			return getRuleContext(STypeContext.class,0);
		}
		public ImplicitlyUnwrappedOptionalTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implicitlyUnwrappedOptionalType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterImplicitlyUnwrappedOptionalType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitImplicitlyUnwrappedOptionalType(this);
		}
	}

	public final ImplicitlyUnwrappedOptionalTypeContext implicitlyUnwrappedOptionalType() throws RecognitionException {
		ImplicitlyUnwrappedOptionalTypeContext _localctx = new ImplicitlyUnwrappedOptionalTypeContext(_ctx, getState());
		enterRule(_localctx, 442, RULE_implicitlyUnwrappedOptionalType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2264);
			sType(0);
			setState(2265);
			match(T__87);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeAnnotationContext extends ParserRuleContext {
		public STypeContext sType() {
			return getRuleContext(STypeContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public TypeAnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeAnnotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterTypeAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitTypeAnnotation(this);
		}
	}

	public final TypeAnnotationContext typeAnnotation() throws RecognitionException {
		TypeAnnotationContext _localctx = new TypeAnnotationContext(_ctx, getState());
		enterRule(_localctx, 444, RULE_typeAnnotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2267);
			match(T__1);
			setState(2269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__99) {
				{
				setState(2268);
				attributes();
				}
			}

			setState(2272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__128) {
				{
				setState(2271);
				match(T__128);
				}
			}

			setState(2274);
			sType(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeIdentifierContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public GenericArgumentClauseContext genericArgumentClause() {
			return getRuleContext(GenericArgumentClauseContext.class,0);
		}
		public TypeIdentifierContext typeIdentifier() {
			return getRuleContext(TypeIdentifierContext.class,0);
		}
		public TypeIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterTypeIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitTypeIdentifier(this);
		}
	}

	public final TypeIdentifierContext typeIdentifier() throws RecognitionException {
		TypeIdentifierContext _localctx = new TypeIdentifierContext(_ctx, getState());
		enterRule(_localctx, 446, RULE_typeIdentifier);
		int _la;
		try {
			setState(2287);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,273,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2276);
				typeName();
				setState(2278);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,271,_ctx) ) {
				case 1:
					{
					setState(2277);
					genericArgumentClause();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2280);
				typeName();
				setState(2282);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__41) {
					{
					setState(2281);
					genericArgumentClause();
					}
				}

				setState(2284);
				match(T__2);
				setState(2285);
				typeIdentifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitTypeName(this);
		}
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 448, RULE_typeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2289);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TupleTypeContext extends ParserRuleContext {
		public TupleTypeBodyContext tupleTypeBody() {
			return getRuleContext(TupleTypeBodyContext.class,0);
		}
		public TupleTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tupleType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterTupleType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitTupleType(this);
		}
	}

	public final TupleTypeContext tupleType() throws RecognitionException {
		TupleTypeContext _localctx = new TupleTypeContext(_ctx, getState());
		enterRule(_localctx, 450, RULE_tupleType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2291);
			match(T__30);
			setState(2293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__18) | (1L << T__27) | (1L << T__30) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__37) | (1L << T__39) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__58) | (1L << T__59) | (1L << T__61))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__82 - 64)) | (1L << (T__83 - 64)) | (1L << (T__91 - 64)) | (1L << (T__92 - 64)) | (1L << (T__93 - 64)) | (1L << (T__94 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__99 - 64)) | (1L << (T__100 - 64)) | (1L << (T__124 - 64)) | (1L << (T__125 - 64)) | (1L << (T__126 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__127 - 128)) | (1L << (T__128 - 128)) | (1L << (T__133 - 128)) | (1L << (T__134 - 128)) | (1L << (T__136 - 128)) | (1L << (T__137 - 128)) | (1L << (T__138 - 128)) | (1L << (T__139 - 128)) | (1L << (T__141 - 128)) | (1L << (T__142 - 128)) | (1L << (T__146 - 128)) | (1L << (Identifier - 128)))) != 0)) {
				{
				setState(2292);
				tupleTypeBody();
				}
			}

			setState(2295);
			match(T__31);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TupleTypeBodyContext extends ParserRuleContext {
		public TupleTypeElementListContext tupleTypeElementList() {
			return getRuleContext(TupleTypeElementListContext.class,0);
		}
		public TupleTypeBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tupleTypeBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterTupleTypeBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitTupleTypeBody(this);
		}
	}

	public final TupleTypeBodyContext tupleTypeBody() throws RecognitionException {
		TupleTypeBodyContext _localctx = new TupleTypeBodyContext(_ctx, getState());
		enterRule(_localctx, 452, RULE_tupleTypeBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2297);
			tupleTypeElementList();
			setState(2299);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__81) {
				{
				setState(2298);
				match(T__81);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TupleTypeElementListContext extends ParserRuleContext {
		public List<TupleTypeElementContext> tupleTypeElement() {
			return getRuleContexts(TupleTypeElementContext.class);
		}
		public TupleTypeElementContext tupleTypeElement(int i) {
			return getRuleContext(TupleTypeElementContext.class,i);
		}
		public TupleTypeElementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tupleTypeElementList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterTupleTypeElementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitTupleTypeElementList(this);
		}
	}

	public final TupleTypeElementListContext tupleTypeElementList() throws RecognitionException {
		TupleTypeElementListContext _localctx = new TupleTypeElementListContext(_ctx, getState());
		enterRule(_localctx, 454, RULE_tupleTypeElementList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2301);
			tupleTypeElement();
			setState(2306);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__17) {
				{
				{
				setState(2302);
				match(T__17);
				setState(2303);
				tupleTypeElement();
				}
				}
				setState(2308);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TupleTypeElementContext extends ParserRuleContext {
		public STypeContext sType() {
			return getRuleContext(STypeContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public ElementNameContext elementName() {
			return getRuleContext(ElementNameContext.class,0);
		}
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public TupleTypeElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tupleTypeElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterTupleTypeElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitTupleTypeElement(this);
		}
	}

	public final TupleTypeElementContext tupleTypeElement() throws RecognitionException {
		TupleTypeElementContext _localctx = new TupleTypeElementContext(_ctx, getState());
		enterRule(_localctx, 456, RULE_tupleTypeElement);
		int _la;
		try {
			setState(2323);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,279,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2310);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__99) {
					{
					setState(2309);
					attributes();
					}
				}

				setState(2313);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__128) {
					{
					setState(2312);
					match(T__128);
					}
				}

				setState(2315);
				sType(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2316);
				elementName();
				setState(2317);
				typeAnnotation();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2319);
				match(T__82);
				setState(2320);
				elementName();
				setState(2321);
				typeAnnotation();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ElementNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterElementName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitElementName(this);
		}
	}

	public final ElementNameContext elementName() throws RecognitionException {
		ElementNameContext _localctx = new ElementNameContext(_ctx, getState());
		enterRule(_localctx, 458, RULE_elementName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2325);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProtocolCompositionTypeContext extends ParserRuleContext {
		public ProtocolIdentifierContext protocolIdentifier() {
			return getRuleContext(ProtocolIdentifierContext.class,0);
		}
		public ProtocolCompositionContinuationContext protocolCompositionContinuation() {
			return getRuleContext(ProtocolCompositionContinuationContext.class,0);
		}
		public ProtocolCompositionTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocolCompositionType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterProtocolCompositionType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitProtocolCompositionType(this);
		}
	}

	public final ProtocolCompositionTypeContext protocolCompositionType() throws RecognitionException {
		ProtocolCompositionTypeContext _localctx = new ProtocolCompositionTypeContext(_ctx, getState());
		enterRule(_localctx, 460, RULE_protocolCompositionType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2327);
			protocolIdentifier();
			setState(2328);
			match(T__106);
			setState(2329);
			protocolCompositionContinuation();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProtocolCompositionContinuationContext extends ParserRuleContext {
		public ProtocolIdentifierContext protocolIdentifier() {
			return getRuleContext(ProtocolIdentifierContext.class,0);
		}
		public ProtocolCompositionTypeContext protocolCompositionType() {
			return getRuleContext(ProtocolCompositionTypeContext.class,0);
		}
		public ProtocolCompositionContinuationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocolCompositionContinuation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterProtocolCompositionContinuation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitProtocolCompositionContinuation(this);
		}
	}

	public final ProtocolCompositionContinuationContext protocolCompositionContinuation() throws RecognitionException {
		ProtocolCompositionContinuationContext _localctx = new ProtocolCompositionContinuationContext(_ctx, getState());
		enterRule(_localctx, 462, RULE_protocolCompositionContinuation);
		try {
			setState(2333);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,280,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2331);
				protocolIdentifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2332);
				protocolCompositionType();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProtocolIdentifierContext extends ParserRuleContext {
		public TypeIdentifierContext typeIdentifier() {
			return getRuleContext(TypeIdentifierContext.class,0);
		}
		public ProtocolIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocolIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterProtocolIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitProtocolIdentifier(this);
		}
	}

	public final ProtocolIdentifierContext protocolIdentifier() throws RecognitionException {
		ProtocolIdentifierContext _localctx = new ProtocolIdentifierContext(_ctx, getState());
		enterRule(_localctx, 464, RULE_protocolIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2335);
			typeIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MetatypeTypeContext extends ParserRuleContext {
		public STypeContext sType() {
			return getRuleContext(STypeContext.class,0);
		}
		public MetatypeTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metatypeType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterMetatypeType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitMetatypeType(this);
		}
	}

	public final MetatypeTypeContext metatypeType() throws RecognitionException {
		MetatypeTypeContext _localctx = new MetatypeTypeContext(_ctx, getState());
		enterRule(_localctx, 466, RULE_metatypeType);
		try {
			setState(2345);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,281,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2337);
				sType(0);
				setState(2338);
				match(T__2);
				setState(2339);
				match(T__124);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2341);
				sType(0);
				setState(2342);
				match(T__2);
				setState(2343);
				match(T__125);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeInheritanceClauseContext extends ParserRuleContext {
		public ClassRequirementContext classRequirement() {
			return getRuleContext(ClassRequirementContext.class,0);
		}
		public TypeInheritanceListContext typeInheritanceList() {
			return getRuleContext(TypeInheritanceListContext.class,0);
		}
		public TypeInheritanceClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeInheritanceClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterTypeInheritanceClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitTypeInheritanceClause(this);
		}
	}

	public final TypeInheritanceClauseContext typeInheritanceClause() throws RecognitionException {
		TypeInheritanceClauseContext _localctx = new TypeInheritanceClauseContext(_ctx, getState());
		enterRule(_localctx, 468, RULE_typeInheritanceClause);
		try {
			setState(2356);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,282,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2347);
				match(T__1);
				setState(2348);
				classRequirement();
				setState(2349);
				match(T__17);
				setState(2350);
				typeInheritanceList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2352);
				match(T__1);
				setState(2353);
				classRequirement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2354);
				match(T__1);
				setState(2355);
				typeInheritanceList();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeInheritanceListContext extends ParserRuleContext {
		public List<TypeIdentifierContext> typeIdentifier() {
			return getRuleContexts(TypeIdentifierContext.class);
		}
		public TypeIdentifierContext typeIdentifier(int i) {
			return getRuleContext(TypeIdentifierContext.class,i);
		}
		public TypeInheritanceListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeInheritanceList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterTypeInheritanceList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitTypeInheritanceList(this);
		}
	}

	public final TypeInheritanceListContext typeInheritanceList() throws RecognitionException {
		TypeInheritanceListContext _localctx = new TypeInheritanceListContext(_ctx, getState());
		enterRule(_localctx, 470, RULE_typeInheritanceList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2358);
			typeIdentifier();
			setState(2363);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__17) {
				{
				{
				setState(2359);
				match(T__17);
				setState(2360);
				typeIdentifier();
				}
				}
				setState(2365);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassRequirementContext extends ParserRuleContext {
		public ClassRequirementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classRequirement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterClassRequirement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitClassRequirement(this);
		}
	}

	public final ClassRequirementContext classRequirement() throws RecognitionException {
		ClassRequirementContext _localctx = new ClassRequirementContext(_ctx, getState());
		enterRule(_localctx, 472, RULE_classRequirement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2366);
			match(T__44);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompilerControlStatementContext extends ParserRuleContext {
		public ConditionalCompilationBlockContext conditionalCompilationBlock() {
			return getRuleContext(ConditionalCompilationBlockContext.class,0);
		}
		public LineControlStatementContext lineControlStatement() {
			return getRuleContext(LineControlStatementContext.class,0);
		}
		public CompilerControlStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilerControlStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterCompilerControlStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitCompilerControlStatement(this);
		}
	}

	public final CompilerControlStatementContext compilerControlStatement() throws RecognitionException {
		CompilerControlStatementContext _localctx = new CompilerControlStatementContext(_ctx, getState());
		enterRule(_localctx, 474, RULE_compilerControlStatement);
		try {
			setState(2370);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__130:
				enterOuterAlt(_localctx, 1);
				{
				setState(2368);
				conditionalCompilationBlock();
				}
				break;
			case T__140:
				enterOuterAlt(_localctx, 2);
				{
				setState(2369);
				lineControlStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionalCompilationBlockContext extends ParserRuleContext {
		public IfDirectiveClauseContext ifDirectiveClause() {
			return getRuleContext(IfDirectiveClauseContext.class,0);
		}
		public ElseifDirectiveClausesContext elseifDirectiveClauses() {
			return getRuleContext(ElseifDirectiveClausesContext.class,0);
		}
		public ElseDirectiveClauseContext elseDirectiveClause() {
			return getRuleContext(ElseDirectiveClauseContext.class,0);
		}
		public ConditionalCompilationBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalCompilationBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterConditionalCompilationBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitConditionalCompilationBlock(this);
		}
	}

	public final ConditionalCompilationBlockContext conditionalCompilationBlock() throws RecognitionException {
		ConditionalCompilationBlockContext _localctx = new ConditionalCompilationBlockContext(_ctx, getState());
		enterRule(_localctx, 476, RULE_conditionalCompilationBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2372);
			ifDirectiveClause();
			setState(2374);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__131) {
				{
				setState(2373);
				elseifDirectiveClauses();
				}
			}

			setState(2377);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__132) {
				{
				setState(2376);
				elseDirectiveClause();
				}
			}

			setState(2379);
			match(T__129);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfDirectiveClauseContext extends ParserRuleContext {
		public CompilationConditionContext compilationCondition() {
			return getRuleContext(CompilationConditionContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public IfDirectiveClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifDirectiveClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterIfDirectiveClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitIfDirectiveClause(this);
		}
	}

	public final IfDirectiveClauseContext ifDirectiveClause() throws RecognitionException {
		IfDirectiveClauseContext _localctx = new IfDirectiveClauseContext(_ctx, getState());
		enterRule(_localctx, 478, RULE_ifDirectiveClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2381);
			match(T__130);
			setState(2382);
			compilationCondition(0);
			setState(2384);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,287,_ctx) ) {
			case 1:
				{
				setState(2383);
				statements();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseifDirectiveClausesContext extends ParserRuleContext {
		public List<ElseifDirectiveClauseContext> elseifDirectiveClause() {
			return getRuleContexts(ElseifDirectiveClauseContext.class);
		}
		public ElseifDirectiveClauseContext elseifDirectiveClause(int i) {
			return getRuleContext(ElseifDirectiveClauseContext.class,i);
		}
		public ElseifDirectiveClausesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseifDirectiveClauses; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterElseifDirectiveClauses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitElseifDirectiveClauses(this);
		}
	}

	public final ElseifDirectiveClausesContext elseifDirectiveClauses() throws RecognitionException {
		ElseifDirectiveClausesContext _localctx = new ElseifDirectiveClausesContext(_ctx, getState());
		enterRule(_localctx, 480, RULE_elseifDirectiveClauses);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2387); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2386);
				elseifDirectiveClause();
				}
				}
				setState(2389); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__131 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseifDirectiveClauseContext extends ParserRuleContext {
		public CompilationConditionContext compilationCondition() {
			return getRuleContext(CompilationConditionContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public ElseifDirectiveClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseifDirectiveClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterElseifDirectiveClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitElseifDirectiveClause(this);
		}
	}

	public final ElseifDirectiveClauseContext elseifDirectiveClause() throws RecognitionException {
		ElseifDirectiveClauseContext _localctx = new ElseifDirectiveClauseContext(_ctx, getState());
		enterRule(_localctx, 482, RULE_elseifDirectiveClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2391);
			match(T__131);
			setState(2392);
			compilationCondition(0);
			setState(2394);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,289,_ctx) ) {
			case 1:
				{
				setState(2393);
				statements();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseDirectiveClauseContext extends ParserRuleContext {
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public ElseDirectiveClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseDirectiveClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterElseDirectiveClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitElseDirectiveClause(this);
		}
	}

	public final ElseDirectiveClauseContext elseDirectiveClause() throws RecognitionException {
		ElseDirectiveClauseContext _localctx = new ElseDirectiveClauseContext(_ctx, getState());
		enterRule(_localctx, 484, RULE_elseDirectiveClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2396);
			match(T__132);
			setState(2398);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,290,_ctx) ) {
			case 1:
				{
				setState(2397);
				statements();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompilationConditionContext extends ParserRuleContext {
		public PlatformConditionContext platformCondition() {
			return getRuleContext(PlatformConditionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public BooleanLiteralContext booleanLiteral() {
			return getRuleContext(BooleanLiteralContext.class,0);
		}
		public List<CompilationConditionContext> compilationCondition() {
			return getRuleContexts(CompilationConditionContext.class);
		}
		public CompilationConditionContext compilationCondition(int i) {
			return getRuleContext(CompilationConditionContext.class,i);
		}
		public CompilationConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterCompilationCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitCompilationCondition(this);
		}
	}

	public final CompilationConditionContext compilationCondition() throws RecognitionException {
		return compilationCondition(0);
	}

	private CompilationConditionContext compilationCondition(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CompilationConditionContext _localctx = new CompilationConditionContext(_ctx, _parentState);
		CompilationConditionContext _prevctx = _localctx;
		int _startState = 486;
		enterRecursionRule(_localctx, 486, RULE_compilationCondition, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2410);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,291,_ctx) ) {
			case 1:
				{
				setState(2401);
				platformCondition();
				}
				break;
			case 2:
				{
				setState(2402);
				identifier();
				}
				break;
			case 3:
				{
				setState(2403);
				booleanLiteral();
				}
				break;
			case 4:
				{
				setState(2404);
				match(T__30);
				setState(2405);
				compilationCondition(0);
				setState(2406);
				match(T__31);
				}
				break;
			case 5:
				{
				setState(2408);
				match(T__87);
				setState(2409);
				compilationCondition(2);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2417);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,292,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CompilationConditionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_compilationCondition);
					setState(2412);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2413);
					_la = _input.LA(1);
					if ( !(_la==T__121 || _la==T__122) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(2414);
					compilationCondition(2);
					}
					} 
				}
				setState(2419);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,292,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PlatformConditionContext extends ParserRuleContext {
		public OperatingSystemContext operatingSystem() {
			return getRuleContext(OperatingSystemContext.class,0);
		}
		public ArchitectureContext architecture() {
			return getRuleContext(ArchitectureContext.class,0);
		}
		public SwiftVersionContext swiftVersion() {
			return getRuleContext(SwiftVersionContext.class,0);
		}
		public PlatformConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_platformCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterPlatformCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitPlatformCondition(this);
		}
	}

	public final PlatformConditionContext platformCondition() throws RecognitionException {
		PlatformConditionContext _localctx = new PlatformConditionContext(_ctx, getState());
		enterRule(_localctx, 488, RULE_platformCondition);
		try {
			setState(2436);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__133:
				enterOuterAlt(_localctx, 1);
				{
				setState(2420);
				match(T__133);
				setState(2421);
				match(T__30);
				setState(2422);
				operatingSystem();
				setState(2423);
				match(T__31);
				}
				break;
			case T__134:
				enterOuterAlt(_localctx, 2);
				{
				setState(2425);
				match(T__134);
				setState(2426);
				match(T__30);
				setState(2427);
				architecture();
				setState(2428);
				match(T__31);
				}
				break;
			case T__135:
				enterOuterAlt(_localctx, 3);
				{
				setState(2430);
				match(T__135);
				setState(2431);
				match(T__30);
				setState(2432);
				match(T__123);
				setState(2433);
				swiftVersion();
				setState(2434);
				match(T__31);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperatingSystemContext extends ParserRuleContext {
		public OperatingSystemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatingSystem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterOperatingSystem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitOperatingSystem(this);
		}
	}

	public final OperatingSystemContext operatingSystem() throws RecognitionException {
		OperatingSystemContext _localctx = new OperatingSystemContext(_ctx, getState());
		enterRule(_localctx, 490, RULE_operatingSystem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2438);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__33) | (1L << T__35) | (1L << T__37) | (1L << T__39))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArchitectureContext extends ParserRuleContext {
		public ArchitectureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_architecture; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterArchitecture(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitArchitecture(this);
		}
	}

	public final ArchitectureContext architecture() throws RecognitionException {
		ArchitectureContext _localctx = new ArchitectureContext(_ctx, getState());
		enterRule(_localctx, 492, RULE_architecture);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2440);
			_la = _input.LA(1);
			if ( !(((((_la - 137)) & ~0x3f) == 0 && ((1L << (_la - 137)) & ((1L << (T__136 - 137)) | (1L << (T__137 - 137)) | (1L << (T__138 - 137)) | (1L << (T__139 - 137)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwiftVersionContext extends ParserRuleContext {
		public TerminalNode FloatingPointLiteral() { return getToken(Swift3Parser.FloatingPointLiteral, 0); }
		public SwiftVersionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_swiftVersion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterSwiftVersion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitSwiftVersion(this);
		}
	}

	public final SwiftVersionContext swiftVersion() throws RecognitionException {
		SwiftVersionContext _localctx = new SwiftVersionContext(_ctx, getState());
		enterRule(_localctx, 494, RULE_swiftVersion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2442);
			match(FloatingPointLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LineControlStatementContext extends ParserRuleContext {
		public FileNameContext fileName() {
			return getRuleContext(FileNameContext.class,0);
		}
		public LineNumberContext lineNumber() {
			return getRuleContext(LineNumberContext.class,0);
		}
		public LineControlStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lineControlStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterLineControlStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitLineControlStatement(this);
		}
	}

	public final LineControlStatementContext lineControlStatement() throws RecognitionException {
		LineControlStatementContext _localctx = new LineControlStatementContext(_ctx, getState());
		enterRule(_localctx, 496, RULE_lineControlStatement);
		try {
			setState(2458);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,294,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2444);
				match(T__140);
				setState(2445);
				match(T__30);
				setState(2446);
				match(T__141);
				setState(2447);
				match(T__1);
				setState(2448);
				fileName();
				setState(2449);
				match(T__17);
				setState(2450);
				match(T__142);
				setState(2451);
				match(T__1);
				setState(2452);
				lineNumber();
				setState(2453);
				match(T__31);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2455);
				match(T__140);
				setState(2456);
				match(T__30);
				setState(2457);
				match(T__31);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LineNumberContext extends ParserRuleContext {
		public IntegerLiteralContext integerLiteral() {
			return getRuleContext(IntegerLiteralContext.class,0);
		}
		public LineNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lineNumber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterLineNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitLineNumber(this);
		}
	}

	public final LineNumberContext lineNumber() throws RecognitionException {
		LineNumberContext _localctx = new LineNumberContext(_ctx, getState());
		enterRule(_localctx, 498, RULE_lineNumber);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2460);
			integerLiteral();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FileNameContext extends ParserRuleContext {
		public TerminalNode StringLiteral() { return getToken(Swift3Parser.StringLiteral, 0); }
		public FileNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterFileName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitFileName(this);
		}
	}

	public final FileNameContext fileName() throws RecognitionException {
		FileNameContext _localctx = new FileNameContext(_ctx, getState());
		enterRule(_localctx, 500, RULE_fileName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2462);
			match(StringLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Swift3Parser.Identifier, 0); }
		public ContextSensitiveKeywordContext contextSensitiveKeyword() {
			return getRuleContext(ContextSensitiveKeywordContext.class,0);
		}
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitIdentifier(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 502, RULE_identifier);
		try {
			setState(2466);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(2464);
				match(Identifier);
				}
				break;
			case T__18:
			case T__27:
			case T__33:
			case T__34:
			case T__35:
			case T__37:
			case T__39:
			case T__45:
			case T__46:
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case T__54:
			case T__55:
			case T__56:
			case T__58:
			case T__59:
			case T__61:
			case T__63:
			case T__75:
			case T__76:
			case T__77:
			case T__83:
			case T__91:
			case T__92:
			case T__93:
			case T__94:
			case T__95:
			case T__96:
			case T__124:
			case T__125:
			case T__127:
			case T__133:
			case T__134:
			case T__136:
			case T__137:
			case T__138:
			case T__139:
			case T__141:
			case T__142:
			case T__146:
				enterOuterAlt(_localctx, 2);
				{
				setState(2465);
				contextSensitiveKeyword();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeywordContext extends ParserRuleContext {
		public TerminalNode BooleanLiteral() { return getToken(Swift3Parser.BooleanLiteral, 0); }
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitKeyword(this);
		}
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 504, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2468);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__44) | (1L << T__57) | (1L << T__62))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (T__64 - 65)) | (1L << (T__65 - 65)) | (1L << (T__66 - 65)) | (1L << (T__67 - 65)) | (1L << (T__68 - 65)) | (1L << (T__69 - 65)) | (1L << (T__70 - 65)) | (1L << (T__71 - 65)) | (1L << (T__72 - 65)) | (1L << (T__73 - 65)) | (1L << (T__78 - 65)) | (1L << (T__79 - 65)) | (1L << (T__82 - 65)) | (1L << (T__84 - 65)) | (1L << (T__85 - 65)) | (1L << (T__88 - 65)) | (1L << (T__89 - 65)) | (1L << (T__90 - 65)) | (1L << (T__91 - 65)) | (1L << (T__97 - 65)) | (1L << (T__98 - 65)) | (1L << (T__107 - 65)) | (1L << (T__108 - 65)) | (1L << (T__109 - 65)) | (1L << (T__110 - 65)) | (1L << (T__111 - 65)) | (1L << (T__112 - 65)) | (1L << (T__113 - 65)) | (1L << (T__116 - 65)) | (1L << (T__120 - 65)) | (1L << (T__126 - 65)) | (1L << (T__127 - 65)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (T__128 - 129)) | (1L << (T__129 - 129)) | (1L << (T__130 - 129)) | (1L << (T__131 - 129)) | (1L << (T__132 - 129)) | (1L << (T__143 - 129)) | (1L << (T__144 - 129)) | (1L << (T__145 - 129)) | (1L << (BooleanLiteral - 129)) | (1L << (NilLiteral - 129)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContextSensitiveKeywordContext extends ParserRuleContext {
		public ContextSensitiveKeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contextSensitiveKeyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterContextSensitiveKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitContextSensitiveKeyword(this);
		}
	}

	public final ContextSensitiveKeywordContext contextSensitiveKeyword() throws RecognitionException {
		ContextSensitiveKeywordContext _localctx = new ContextSensitiveKeywordContext(_ctx, getState());
		enterRule(_localctx, 506, RULE_contextSensitiveKeyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2470);
			_la = _input.LA(1);
			if ( !(((((_la - 19)) & ~0x3f) == 0 && ((1L << (_la - 19)) & ((1L << (T__18 - 19)) | (1L << (T__27 - 19)) | (1L << (T__33 - 19)) | (1L << (T__34 - 19)) | (1L << (T__35 - 19)) | (1L << (T__37 - 19)) | (1L << (T__39 - 19)) | (1L << (T__45 - 19)) | (1L << (T__46 - 19)) | (1L << (T__47 - 19)) | (1L << (T__48 - 19)) | (1L << (T__49 - 19)) | (1L << (T__50 - 19)) | (1L << (T__51 - 19)) | (1L << (T__52 - 19)) | (1L << (T__53 - 19)) | (1L << (T__54 - 19)) | (1L << (T__55 - 19)) | (1L << (T__56 - 19)) | (1L << (T__58 - 19)) | (1L << (T__59 - 19)) | (1L << (T__61 - 19)) | (1L << (T__63 - 19)) | (1L << (T__75 - 19)) | (1L << (T__76 - 19)) | (1L << (T__77 - 19)))) != 0) || ((((_la - 84)) & ~0x3f) == 0 && ((1L << (_la - 84)) & ((1L << (T__83 - 84)) | (1L << (T__91 - 84)) | (1L << (T__92 - 84)) | (1L << (T__93 - 84)) | (1L << (T__94 - 84)) | (1L << (T__95 - 84)) | (1L << (T__96 - 84)) | (1L << (T__124 - 84)) | (1L << (T__125 - 84)) | (1L << (T__127 - 84)) | (1L << (T__133 - 84)) | (1L << (T__134 - 84)) | (1L << (T__136 - 84)) | (1L << (T__137 - 84)) | (1L << (T__138 - 84)) | (1L << (T__139 - 84)) | (1L << (T__141 - 84)) | (1L << (T__142 - 84)) | (1L << (T__146 - 84)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierListContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitIdentifierList(this);
		}
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, getState());
		enterRule(_localctx, 508, RULE_identifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2474);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__18:
			case T__27:
			case T__33:
			case T__34:
			case T__35:
			case T__37:
			case T__39:
			case T__45:
			case T__46:
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case T__54:
			case T__55:
			case T__56:
			case T__58:
			case T__59:
			case T__61:
			case T__63:
			case T__75:
			case T__76:
			case T__77:
			case T__83:
			case T__91:
			case T__92:
			case T__93:
			case T__94:
			case T__95:
			case T__96:
			case T__124:
			case T__125:
			case T__127:
			case T__133:
			case T__134:
			case T__136:
			case T__137:
			case T__138:
			case T__139:
			case T__141:
			case T__142:
			case T__146:
			case Identifier:
				{
				setState(2472);
				identifier();
				}
				break;
			case T__82:
				{
				setState(2473);
				match(T__82);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2483);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__17) {
				{
				{
				setState(2476);
				match(T__17);
				setState(2479);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__18:
				case T__27:
				case T__33:
				case T__34:
				case T__35:
				case T__37:
				case T__39:
				case T__45:
				case T__46:
				case T__47:
				case T__48:
				case T__49:
				case T__50:
				case T__51:
				case T__52:
				case T__53:
				case T__54:
				case T__55:
				case T__56:
				case T__58:
				case T__59:
				case T__61:
				case T__63:
				case T__75:
				case T__76:
				case T__77:
				case T__83:
				case T__91:
				case T__92:
				case T__93:
				case T__94:
				case T__95:
				case T__96:
				case T__124:
				case T__125:
				case T__127:
				case T__133:
				case T__134:
				case T__136:
				case T__137:
				case T__138:
				case T__139:
				case T__141:
				case T__142:
				case T__146:
				case Identifier:
					{
					setState(2477);
					identifier();
					}
					break;
				case T__82:
					{
					setState(2478);
					match(T__82);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(2485);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanLiteralContext extends ParserRuleContext {
		public TerminalNode BooleanLiteral() { return getToken(Swift3Parser.BooleanLiteral, 0); }
		public BooleanLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitBooleanLiteral(this);
		}
	}

	public final BooleanLiteralContext booleanLiteral() throws RecognitionException {
		BooleanLiteralContext _localctx = new BooleanLiteralContext(_ctx, getState());
		enterRule(_localctx, 510, RULE_booleanLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2486);
			match(BooleanLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public NumericLiteralContext numericLiteral() {
			return getRuleContext(NumericLiteralContext.class,0);
		}
		public TerminalNode StringLiteral() { return getToken(Swift3Parser.StringLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(Swift3Parser.BooleanLiteral, 0); }
		public TerminalNode NilLiteral() { return getToken(Swift3Parser.NilLiteral, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 512, RULE_literal);
		try {
			setState(2492);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__102:
			case BinaryLiteral:
			case OctalLiteral:
			case DecimalLiteral:
			case HexadecimalLiteral:
			case FloatingPointLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(2488);
				numericLiteral();
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(2489);
				match(StringLiteral);
				}
				break;
			case BooleanLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(2490);
				match(BooleanLiteral);
				}
				break;
			case NilLiteral:
				enterOuterAlt(_localctx, 4);
				{
				setState(2491);
				match(NilLiteral);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumericLiteralContext extends ParserRuleContext {
		public IntegerLiteralContext integerLiteral() {
			return getRuleContext(IntegerLiteralContext.class,0);
		}
		public TerminalNode FloatingPointLiteral() { return getToken(Swift3Parser.FloatingPointLiteral, 0); }
		public NumericLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterNumericLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitNumericLiteral(this);
		}
	}

	public final NumericLiteralContext numericLiteral() throws RecognitionException {
		NumericLiteralContext _localctx = new NumericLiteralContext(_ctx, getState());
		enterRule(_localctx, 514, RULE_numericLiteral);
		int _la;
		try {
			setState(2502);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,302,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2495);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__102) {
					{
					setState(2494);
					match(T__102);
					}
				}

				setState(2497);
				integerLiteral();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2499);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__102) {
					{
					setState(2498);
					match(T__102);
					}
				}

				setState(2501);
				match(FloatingPointLiteral);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntegerLiteralContext extends ParserRuleContext {
		public TerminalNode BinaryLiteral() { return getToken(Swift3Parser.BinaryLiteral, 0); }
		public TerminalNode OctalLiteral() { return getToken(Swift3Parser.OctalLiteral, 0); }
		public TerminalNode DecimalLiteral() { return getToken(Swift3Parser.DecimalLiteral, 0); }
		public TerminalNode HexadecimalLiteral() { return getToken(Swift3Parser.HexadecimalLiteral, 0); }
		public IntegerLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).enterIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift3Listener ) ((Swift3Listener)listener).exitIntegerLiteral(this);
		}
	}

	public final IntegerLiteralContext integerLiteral() throws RecognitionException {
		IntegerLiteralContext _localctx = new IntegerLiteralContext(_ctx, getState());
		enterRule(_localctx, 516, RULE_integerLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2504);
			_la = _input.LA(1);
			if ( !(((((_la - 155)) & ~0x3f) == 0 && ((1L << (_la - 155)) & ((1L << (BinaryLiteral - 155)) | (1L << (OctalLiteral - 155)) | (1L << (DecimalLiteral - 155)) | (1L << (HexadecimalLiteral - 155)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 151:
			return pattern_sempred((PatternContext)_localctx, predIndex);
		case 208:
			return postfixExpression_sempred((PostfixExpressionContext)_localctx, predIndex);
		case 217:
			return sType_sempred((STypeContext)_localctx, predIndex);
		case 243:
			return compilationCondition_sempred((CompilationConditionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean pattern_sempred(PatternContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean postfixExpression_sempred(PostfixExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 13);
		case 2:
			return precpred(_ctx, 12);
		case 3:
			return precpred(_ctx, 11);
		case 4:
			return precpred(_ctx, 10);
		case 5:
			return precpred(_ctx, 9);
		case 6:
			return precpred(_ctx, 8);
		case 7:
			return precpred(_ctx, 7);
		case 8:
			return precpred(_ctx, 6);
		case 9:
			return precpred(_ctx, 5);
		case 10:
			return precpred(_ctx, 4);
		case 11:
			return precpred(_ctx, 3);
		case 12:
			return precpred(_ctx, 2);
		case 13:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean sType_sempred(STypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 14:
			return precpred(_ctx, 7);
		case 15:
			return precpred(_ctx, 6);
		case 16:
			return precpred(_ctx, 4);
		case 17:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean compilationCondition_sempred(CompilationConditionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 18:
			return precpred(_ctx, 1);
		}
		return true;
	}

	private static final int _serializedATNSegments = 2;
	private static final String _serializedATNSegment0 =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00a7\u09cd\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092"+
		"\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096\4\u0097"+
		"\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\4\u009a\t\u009a\4\u009b\t\u009b"+
		"\4\u009c\t\u009c\4\u009d\t\u009d\4\u009e\t\u009e\4\u009f\t\u009f\4\u00a0"+
		"\t\u00a0\4\u00a1\t\u00a1\4\u00a2\t\u00a2\4\u00a3\t\u00a3\4\u00a4\t\u00a4"+
		"\4\u00a5\t\u00a5\4\u00a6\t\u00a6\4\u00a7\t\u00a7\4\u00a8\t\u00a8\4\u00a9"+
		"\t\u00a9\4\u00aa\t\u00aa\4\u00ab\t\u00ab\4\u00ac\t\u00ac\4\u00ad\t\u00ad"+
		"\4\u00ae\t\u00ae\4\u00af\t\u00af\4\u00b0\t\u00b0\4\u00b1\t\u00b1\4\u00b2"+
		"\t\u00b2\4\u00b3\t\u00b3\4\u00b4\t\u00b4\4\u00b5\t\u00b5\4\u00b6\t\u00b6"+
		"\4\u00b7\t\u00b7\4\u00b8\t\u00b8\4\u00b9\t\u00b9\4\u00ba\t\u00ba\4\u00bb"+
		"\t\u00bb\4\u00bc\t\u00bc\4\u00bd\t\u00bd\4\u00be\t\u00be\4\u00bf\t\u00bf"+
		"\4\u00c0\t\u00c0\4\u00c1\t\u00c1\4\u00c2\t\u00c2\4\u00c3\t\u00c3\4\u00c4"+
		"\t\u00c4\4\u00c5\t\u00c5\4\u00c6\t\u00c6\4\u00c7\t\u00c7\4\u00c8\t\u00c8"+
		"\4\u00c9\t\u00c9\4\u00ca\t\u00ca\4\u00cb\t\u00cb\4\u00cc\t\u00cc\4\u00cd"+
		"\t\u00cd\4\u00ce\t\u00ce\4\u00cf\t\u00cf\4\u00d0\t\u00d0\4\u00d1\t\u00d1"+
		"\4\u00d2\t\u00d2\4\u00d3\t\u00d3\4\u00d4\t\u00d4\4\u00d5\t\u00d5\4\u00d6"+
		"\t\u00d6\4\u00d7\t\u00d7\4\u00d8\t\u00d8\4\u00d9\t\u00d9\4\u00da\t\u00da"+
		"\4\u00db\t\u00db\4\u00dc\t\u00dc\4\u00dd\t\u00dd\4\u00de\t\u00de\4\u00df"+
		"\t\u00df\4\u00e0\t\u00e0\4\u00e1\t\u00e1\4\u00e2\t\u00e2\4\u00e3\t\u00e3"+
		"\4\u00e4\t\u00e4\4\u00e5\t\u00e5\4\u00e6\t\u00e6\4\u00e7\t\u00e7\4\u00e8"+
		"\t\u00e8\4\u00e9\t\u00e9\4\u00ea\t\u00ea\4\u00eb\t\u00eb\4\u00ec\t\u00ec"+
		"\4\u00ed\t\u00ed\4\u00ee\t\u00ee\4\u00ef\t\u00ef\4\u00f0\t\u00f0\4\u00f1"+
		"\t\u00f1\4\u00f2\t\u00f2\4\u00f3\t\u00f3\4\u00f4\t\u00f4\4\u00f5\t\u00f5"+
		"\4\u00f6\t\u00f6\4\u00f7\t\u00f7\4\u00f8\t\u00f8\4\u00f9\t\u00f9\4\u00fa"+
		"\t\u00fa\4\u00fb\t\u00fb\4\u00fc\t\u00fc\4\u00fd\t\u00fd\4\u00fe\t\u00fe"+
		"\4\u00ff\t\u00ff\4\u0100\t\u0100\4\u0101\t\u0101\4\u0102\t\u0102\4\u0103"+
		"\t\u0103\4\u0104\t\u0104\3\2\5\2\u020a\n\2\3\2\3\2\3\3\3\3\5\3\u0210\n"+
		"\3\3\3\3\3\5\3\u0214\n\3\3\3\3\3\5\3\u0218\n\3\3\3\3\3\3\3\5\3\u021d\n"+
		"\3\3\3\3\3\5\3\u0221\n\3\3\3\3\3\5\3\u0225\n\3\3\3\3\3\5\3\u0229\n\3\3"+
		"\3\3\3\5\3\u022d\n\3\3\3\3\3\5\3\u0231\n\3\5\3\u0233\n\3\3\4\3\4\6\4\u0237"+
		"\n\4\r\4\16\4\u0238\3\5\3\5\3\5\3\5\3\6\6\6\u0240\n\6\r\6\16\6\u0241\3"+
		"\7\3\7\3\7\5\7\u0247\n\7\3\b\3\b\5\b\u024b\n\b\3\b\3\b\3\b\3\b\5\b\u0251"+
		"\n\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\5\13\u0261"+
		"\n\13\3\f\3\f\3\f\3\f\5\f\u0267\n\f\3\r\3\r\3\r\3\r\5\r\u026d\n\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\5\17\u0278\n\17\3\17\3\17\3\20"+
		"\6\20\u027d\n\20\r\20\16\20\u027e\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\5\21\u028d\n\21\3\22\3\22\3\22\3\22\3\23\3\23"+
		"\3\23\7\23\u0296\n\23\f\23\16\23\u0299\13\23\3\24\3\24\5\24\u029d\n\24"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u02a8\n\26\3\27\3\27"+
		"\3\27\3\30\3\30\3\31\3\31\3\31\3\31\3\31\5\31\u02b4\n\31\3\32\3\32\5\32"+
		"\u02b8\n\32\3\33\3\33\5\33\u02bc\n\33\3\34\3\34\3\35\3\35\5\35\u02c2\n"+
		"\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \5 \u02cd\n \3!\3!\5!\u02d1"+
		"\n!\3\"\3\"\5\"\u02d5\n\"\3\"\5\"\u02d8\n\"\3\"\3\"\3#\3#\3#\7#\u02df"+
		"\n#\f#\16#\u02e2\13#\3$\3$\3$\3$\5$\u02e8\n$\3%\3%\3%\3%\3&\3&\3&\3&\3"+
		"\'\3\'\3\'\3(\3(\3)\3)\3)\3)\3)\3*\3*\3*\7*\u02ff\n*\f*\16*\u0302\13*"+
		"\3+\3+\3+\3+\5+\u0308\n+\3,\3,\3-\3-\3.\3.\3.\5.\u0311\n.\3.\3.\3/\3/"+
		"\3/\7/\u0318\n/\f/\16/\u031b\13/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3"+
		"\60\3\60\5\60\u0326\n\60\3\61\3\61\3\61\3\62\3\62\3\62\7\62\u032e\n\62"+
		"\f\62\16\62\u0331\13\62\3\63\3\63\5\63\u0335\n\63\3\64\3\64\3\64\3\64"+
		"\3\64\3\64\3\64\3\64\5\64\u033f\n\64\3\65\3\65\3\65\3\65\3\66\3\66\3\66"+
		"\3\66\3\67\3\67\3\67\7\67\u034c\n\67\f\67\16\67\u034f\13\67\38\38\39\3"+
		"9\59\u0355\n9\39\39\59\u0359\n9\39\39\59\u035d\n9\39\39\59\u0361\n9\3"+
		"9\39\59\u0365\n9\39\39\59\u0369\n9\39\39\59\u036d\n9\39\39\59\u0371\n"+
		"9\39\39\59\u0375\n9\39\39\59\u0379\n9\39\39\59\u037d\n9\39\39\59\u0381"+
		"\n9\39\39\59\u0385\n9\39\39\59\u0389\n9\39\39\59\u038d\n9\59\u038f\n9"+
		"\3:\6:\u0392\n:\r:\16:\u0393\3;\6;\u0397\n;\r;\16;\u0398\3<\3<\3<\3<\3"+
		"<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\5<\u03b4"+
		"\n<\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3="+
		"\3=\3=\3=\5=\u03cf\n=\3>\6>\u03d2\n>\r>\16>\u03d3\3?\3?\5?\u03d8\n?\3"+
		"?\3?\3@\5@\u03dd\n@\3@\3@\5@\u03e1\n@\3@\3@\3A\3A\3B\3B\3B\3B\3B\5B\u03ec"+
		"\nB\3C\3C\5C\u03f0\nC\3D\5D\u03f3\nD\3D\5D\u03f6\nD\3D\3D\3D\3E\3E\3E"+
		"\7E\u03fe\nE\fE\16E\u0401\13E\3F\3F\5F\u0405\nF\3G\3G\3G\3H\3H\3H\3H\3"+
		"H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\5H\u041d\nH\3H\3H\3H\3H\3"+
		"H\3H\3H\3H\3H\3H\5H\u0429\nH\3I\5I\u042c\nI\3I\5I\u042f\nI\3I\3I\3J\3"+
		"J\3K\3K\3K\5K\u0438\nK\3K\3K\3K\3K\3K\3K\3K\5K\u0441\nK\3L\5L\u0444\n"+
		"L\3L\5L\u0447\nL\3L\3L\3L\3M\5M\u044d\nM\3M\5M\u0450\nM\3M\3M\5M\u0454"+
		"\nM\3M\3M\3N\3N\3N\3N\3O\3O\3O\5O\u045f\nO\3O\3O\3O\3O\3O\3O\3O\5O\u0468"+
		"\nO\3P\5P\u046b\nP\3P\3P\3Q\5Q\u0470\nQ\3Q\3Q\3R\3R\3R\5R\u0477\nR\3R"+
		"\3R\3R\3R\3R\5R\u047e\nR\3R\3R\5R\u0482\nR\3S\5S\u0485\nS\3S\3S\5S\u0489"+
		"\nS\3S\3S\3T\5T\u048e\nT\3T\3T\5T\u0492\nT\3T\3T\3U\3U\3U\3V\5V\u049a"+
		"\nV\3V\5V\u049d\nV\3V\3V\3V\5V\u04a2\nV\3W\3W\3X\3X\3X\3Y\3Y\3Y\5Y\u04ac"+
		"\nY\3Y\3Y\3Y\3Y\3Y\3Y\5Y\u04b4\nY\3Y\3Y\5Y\u04b8\nY\3Z\5Z\u04bb\nZ\3Z"+
		"\5Z\u04be\nZ\3Z\3Z\3[\3[\5[\u04c4\n[\3\\\3\\\5\\\u04c8\n\\\3\\\5\\\u04cb"+
		"\n\\\3]\3]\5]\u04cf\n]\3]\3]\3^\3^\3_\3_\3_\3_\3_\5_\u04da\n_\3_\3_\5"+
		"_\u04de\n_\3`\3`\3`\7`\u04e3\n`\f`\16`\u04e6\13`\3a\5a\u04e9\na\3a\5a"+
		"\u04ec\na\3a\3a\3a\5a\u04f1\na\3a\5a\u04f4\na\3a\5a\u04f7\na\3a\3a\3a"+
		"\3a\5a\u04fd\na\3b\3b\3b\5b\u0502\nb\3c\3c\5c\u0506\nc\3d\3d\3d\3e\5e"+
		"\u050c\ne\3e\5e\u050f\ne\3e\3e\3f\3f\5f\u0515\nf\3g\5g\u0518\ng\3g\3g"+
		"\3g\5g\u051d\ng\3g\5g\u0520\ng\3g\3g\5g\u0524\ng\3g\3g\3h\6h\u0529\nh"+
		"\rh\16h\u052a\3i\3i\3i\5i\u0530\ni\5i\u0532\ni\3j\5j\u0535\nj\3j\5j\u0538"+
		"\nj\3j\3j\3j\3k\3k\3k\7k\u0540\nk\fk\16k\u0543\13k\3l\3l\5l\u0547\nl\3"+
		"m\3m\3n\3n\3o\3o\3o\5o\u0550\no\3o\5o\u0553\no\3o\3o\5o\u0557\no\3o\3"+
		"o\3p\6p\u055c\np\rp\16p\u055d\3q\3q\5q\u0562\nq\3r\5r\u0565\nr\3r\3r\3"+
		"r\3s\3s\3s\7s\u056d\ns\fs\16s\u0570\13s\3t\3t\5t\u0574\nt\3u\3u\3u\3v"+
		"\5v\u057a\nv\3v\5v\u057d\nv\3v\3v\3v\5v\u0582\nv\3v\5v\u0585\nv\3v\3v"+
		"\3w\3w\3x\3x\5x\u058d\nx\3x\3x\3y\5y\u0592\ny\3y\5y\u0595\ny\3y\3y\3y"+
		"\5y\u059a\ny\3y\5y\u059d\ny\3y\3y\3z\3z\5z\u05a3\nz\3z\3z\5z\u05a7\nz"+
		"\5z\u05a9\nz\3{\3{\3|\3|\5|\u05af\n|\3|\3|\3}\5}\u05b4\n}\3}\5}\u05b7"+
		"\n}\3}\3}\3}\5}\u05bc\n}\3}\3}\3~\3~\3\177\3\177\5\177\u05c4\n\177\3\177"+
		"\3\177\3\u0080\3\u0080\5\u0080\u05ca\n\u0080\3\u0080\3\u0080\5\u0080\u05ce"+
		"\n\u0080\3\u0080\3\u0080\5\u0080\u05d2\n\u0080\3\u0080\3\u0080\5\u0080"+
		"\u05d6\n\u0080\3\u0080\3\u0080\5\u0080\u05da\n\u0080\5\u0080\u05dc\n\u0080"+
		"\3\u0081\6\u0081\u05df\n\u0081\r\u0081\16\u0081\u05e0\3\u0082\3\u0082"+
		"\3\u0082\3\u0082\3\u0082\3\u0083\3\u0083\3\u0083\5\u0083\u05eb\n\u0083"+
		"\3\u0083\3\u0083\3\u0084\3\u0084\5\u0084\u05f1\n\u0084\3\u0084\3\u0084"+
		"\5\u0084\u05f5\n\u0084\3\u0085\3\u0085\3\u0085\3\u0085\3\u0086\5\u0086"+
		"\u05fc\n\u0086\3\u0086\5\u0086\u05ff\n\u0086\3\u0086\3\u0086\3\u0086\5"+
		"\u0086\u0604\n\u0086\3\u0086\5\u0086\u0607\n\u0086\3\u0087\3\u0087\5\u0087"+
		"\u060b\n\u0087\3\u0087\3\u0087\5\u0087\u060f\n\u0087\3\u0087\3\u0087\3"+
		"\u0088\5\u0088\u0614\n\u0088\3\u0088\5\u0088\u0617\n\u0088\3\u0088\3\u0088"+
		"\5\u0088\u061b\n\u0088\3\u0089\3\u0089\3\u008a\5\u008a\u0620\n\u008a\3"+
		"\u008a\3\u008a\3\u008a\3\u008b\5\u008b\u0626\n\u008b\3\u008b\5\u008b\u0629"+
		"\n\u008b\3\u008b\3\u008b\3\u008b\3\u008b\5\u008b\u062f\n\u008b\3\u008b"+
		"\3\u008b\3\u008c\3\u008c\5\u008c\u0635\n\u008c\3\u008c\3\u008c\3\u008d"+
		"\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d"+
		"\3\u008d\3\u008d\5\u008d\u0645\n\u008d\3\u008e\5\u008e\u0648\n\u008e\3"+
		"\u008e\5\u008e\u064b\n\u008e\3\u008e\3\u008e\3\u008e\3\u008f\3\u008f\5"+
		"\u008f\u0652\n\u008f\3\u008f\3\u008f\3\u0090\3\u0090\3\u0090\5\u0090\u0659"+
		"\n\u0090\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0092\3\u0092"+
		"\3\u0092\3\u0092\3\u0092\3\u0092\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093"+
		"\5\u0093\u066c\n\u0093\3\u0093\3\u0093\3\u0094\3\u0094\5\u0094\u0672\n"+
		"\u0094\3\u0094\3\u0094\5\u0094\u0676\n\u0094\5\u0094\u0678\n\u0094\3\u0095"+
		"\3\u0095\3\u0095\3\u0096\3\u0096\3\u0097\3\u0097\3\u0097\3\u0098\3\u0098"+
		"\3\u0099\3\u0099\3\u0099\5\u0099\u0687\n\u0099\3\u0099\3\u0099\5\u0099"+
		"\u068b\n\u0099\3\u0099\3\u0099\3\u0099\5\u0099\u0690\n\u0099\3\u0099\3"+
		"\u0099\3\u0099\3\u0099\5\u0099\u0696\n\u0099\3\u0099\3\u0099\3\u0099\7"+
		"\u0099\u069b\n\u0099\f\u0099\16\u0099\u069e\13\u0099\3\u009a\3\u009a\3"+
		"\u009b\3\u009b\3\u009c\3\u009c\3\u009c\3\u009c\5\u009c\u06a8\n\u009c\3"+
		"\u009d\3\u009d\5\u009d\u06ac\n\u009d\3\u009d\3\u009d\3\u009e\3\u009e\3"+
		"\u009e\7\u009e\u06b3\n\u009e\f\u009e\16\u009e\u06b6\13\u009e\3\u009f\3"+
		"\u009f\3\u009f\3\u009f\3\u009f\5\u009f\u06bd\n\u009f\3\u00a0\5\u00a0\u06c0"+
		"\n\u00a0\3\u00a0\5\u00a0\u06c3\n\u00a0\3\u00a0\3\u00a0\5\u00a0\u06c7\n"+
		"\u00a0\3\u00a1\3\u00a1\5\u00a1\u06cb\n\u00a1\3\u00a2\3\u00a2\3\u00a2\3"+
		"\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a4\3\u00a4\3\u00a5\3\u00a5\3\u00a5"+
		"\5\u00a5\u06d9\n\u00a5\3\u00a6\3\u00a6\3\u00a7\3\u00a7\5\u00a7\u06df\n"+
		"\u00a7\3\u00a7\3\u00a7\3\u00a8\6\u00a8\u06e4\n\u00a8\r\u00a8\16\u00a8"+
		"\u06e5\3\u00a9\6\u00a9\u06e9\n\u00a9\r\u00a9\16\u00a9\u06ea\3\u00aa\3"+
		"\u00aa\5\u00aa\u06ef\n\u00aa\3\u00aa\3\u00aa\3\u00aa\5\u00aa\u06f4\n\u00aa"+
		"\3\u00aa\3\u00aa\3\u00aa\5\u00aa\u06f9\n\u00aa\3\u00aa\3\u00aa\3\u00aa"+
		"\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa"+
		"\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa\5\u00aa\u070e"+
		"\n\u00aa\3\u00ab\5\u00ab\u0711\n\u00ab\3\u00ab\3\u00ab\7\u00ab\u0715\n"+
		"\u00ab\f\u00ab\16\u00ab\u0718\13\u00ab\3\u00ac\5\u00ac\u071b\n\u00ac\3"+
		"\u00ac\3\u00ac\5\u00ac\u071f\n\u00ac\3\u00ac\5\u00ac\u0722\n\u00ac\3\u00ad"+
		"\3\u00ad\3\u00ad\3\u00ae\3\u00ae\5\u00ae\u0729\n\u00ae\3\u00af\3\u00af"+
		"\3\u00af\3\u00af\3\u00af\5\u00af\u0730\n\u00af\3\u00af\3\u00af\3\u00af"+
		"\3\u00af\5\u00af\u0736\n\u00af\3\u00af\3\u00af\3\u00af\5\u00af\u073b\n"+
		"\u00af\3\u00b0\3\u00b0\3\u00b1\3\u00b1\5\u00b1\u0741\n\u00b1\3\u00b1\3"+
		"\u00b1\3\u00b1\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2"+
		"\3\u00b2\3\u00b2\3\u00b2\5\u00b2\u0750\n\u00b2\3\u00b3\3\u00b3\3\u00b3"+
		"\3\u00b3\5\u00b3\u0756\n\u00b3\3\u00b3\5\u00b3\u0759\n\u00b3\3\u00b3\3"+
		"\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\5\u00b3"+
		"\u0764\n\u00b3\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4"+
		"\5\u00b4\u076d\n\u00b4\3\u00b5\3\u00b5\5\u00b5\u0771\n\u00b5\3\u00b5\3"+
		"\u00b5\3\u00b6\3\u00b6\3\u00b6\7\u00b6\u0778\n\u00b6\f\u00b6\16\u00b6"+
		"\u077b\13\u00b6\3\u00b6\5\u00b6\u077e\n\u00b6\3\u00b7\3\u00b7\3\u00b8"+
		"\3\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b8\5\u00b8\u0789\n\u00b8"+
		"\3\u00b9\3\u00b9\3\u00b9\7\u00b9\u078e\n\u00b9\f\u00b9\16\u00b9\u0791"+
		"\13\u00b9\3\u00b9\5\u00b9\u0794\n\u00b9\3\u00ba\3\u00ba\3\u00ba\3\u00ba"+
		"\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb"+
		"\3\u00bb\3\u00bb\3\u00bb\5\u00bb\u07a6\n\u00bb\3\u00bc\3\u00bc\3\u00bc"+
		"\5\u00bc\u07ab\n\u00bc\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00be\3\u00be"+
		"\3\u00be\3\u00be\3\u00be\3\u00bf\3\u00bf\3\u00bf\3\u00bf\3\u00c0\3\u00c0"+
		"\5\u00c0\u07bc\n\u00c0\3\u00c0\5\u00c0\u07bf\n\u00c0\3\u00c0\3\u00c0\3"+
		"\u00c1\5\u00c1\u07c4\n\u00c1\3\u00c1\3\u00c1\5\u00c1\u07c8\n\u00c1\3\u00c1"+
		"\5\u00c1\u07cb\n\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\5\u00c1"+
		"\u07d2\n\u00c1\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2"+
		"\5\u00c2\u07db\n\u00c2\3\u00c3\3\u00c3\3\u00c3\7\u00c3\u07e0\n\u00c3\f"+
		"\u00c3\16\u00c3\u07e3\13\u00c3\3\u00c4\3\u00c4\5\u00c4\u07e7\n\u00c4\3"+
		"\u00c4\3\u00c4\3\u00c4\3\u00c4\5\u00c4\u07ed\n\u00c4\3\u00c5\3\u00c5\5"+
		"\u00c5\u07f1\n\u00c5\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c7\3\u00c7\3"+
		"\u00c7\7\u00c7\u07fa\n\u00c7\f\u00c7\16\u00c7\u07fd\13\u00c7\3\u00c8\5"+
		"\u00c8\u0800\n\u00c8\3\u00c8\3\u00c8\3\u00c9\3\u00c9\3\u00ca\3\u00ca\3"+
		"\u00ca\3\u00cb\3\u00cb\5\u00cb\u080b\n\u00cb\3\u00cb\3\u00cb\3\u00cc\3"+
		"\u00cc\3\u00cc\7\u00cc\u0812\n\u00cc\f\u00cc\16\u00cc\u0815\13\u00cc\3"+
		"\u00cd\3\u00cd\3\u00cd\3\u00cd\5\u00cd\u081b\n\u00cd\5\u00cd\u081d\n\u00cd"+
		"\3\u00ce\3\u00ce\5\u00ce\u0821\n\u00ce\3\u00cf\3\u00cf\3\u00d0\3\u00d0"+
		"\3\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0"+
		"\5\u00d0\u0830\n\u00d0\3\u00d1\3\u00d1\3\u00d1\3\u00d1\3\u00d1\3\u00d2"+
		"\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\5\u00d2\u083e\n\u00d2"+
		"\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2"+
		"\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2"+
		"\3\u00d2\3\u00d2\5\u00d2\u0854\n\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2"+
		"\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2"+
		"\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2"+
		"\7\u00d2\u086c\n\u00d2\f\u00d2\16\u00d2\u086f\13\u00d2\3\u00d3\6\u00d3"+
		"\u0872\n\u00d3\r\u00d3\16\u00d3\u0873\3\u00d4\3\u00d4\5\u00d4\u0878\n"+
		"\u00d4\3\u00d4\3\u00d4\3\u00d5\3\u00d5\3\u00d6\3\u00d6\5\u00d6\u0880\n"+
		"\u00d6\3\u00d7\3\u00d7\7\u00d7\u0884\n\u00d7\f\u00d7\16\u00d7\u0887\13"+
		"\u00d7\3\u00d7\3\u00d7\7\u00d7\u088b\n\u00d7\f\u00d7\16\u00d7\u088e\13"+
		"\u00d7\3\u00d7\5\u00d7\u0891\n\u00d7\3\u00d8\3\u00d8\3\u00d9\3\u00d9\3"+
		"\u00da\3\u00da\3\u00db\3\u00db\3\u00db\3\u00db\3\u00db\5\u00db\u089e\n"+
		"\u00db\3\u00db\3\u00db\3\u00db\3\u00db\3\u00db\3\u00db\3\u00db\3\u00db"+
		"\3\u00db\3\u00db\3\u00db\3\u00db\5\u00db\u08ac\n\u00db\3\u00db\3\u00db"+
		"\3\u00db\3\u00db\3\u00db\3\u00db\3\u00db\3\u00db\3\u00db\3\u00db\3\u00db"+
		"\3\u00db\3\u00db\3\u00db\3\u00db\5\u00db\u08bd\n\u00db\3\u00db\3\u00db"+
		"\3\u00db\3\u00db\3\u00db\3\u00db\3\u00db\3\u00db\3\u00db\3\u00db\7\u00db"+
		"\u08c9\n\u00db\f\u00db\16\u00db\u08cc\13\u00db\3\u00dc\3\u00dc\3\u00dc"+
		"\3\u00dc\3\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00de\3\u00de"+
		"\3\u00de\3\u00df\3\u00df\3\u00df\3\u00e0\3\u00e0\5\u00e0\u08e0\n\u00e0"+
		"\3\u00e0\5\u00e0\u08e3\n\u00e0\3\u00e0\3\u00e0\3\u00e1\3\u00e1\5\u00e1"+
		"\u08e9\n\u00e1\3\u00e1\3\u00e1\5\u00e1\u08ed\n\u00e1\3\u00e1\3\u00e1\3"+
		"\u00e1\5\u00e1\u08f2\n\u00e1\3\u00e2\3\u00e2\3\u00e3\3\u00e3\5\u00e3\u08f8"+
		"\n\u00e3\3\u00e3\3\u00e3\3\u00e4\3\u00e4\5\u00e4\u08fe\n\u00e4\3\u00e5"+
		"\3\u00e5\3\u00e5\7\u00e5\u0903\n\u00e5\f\u00e5\16\u00e5\u0906\13\u00e5"+
		"\3\u00e6\5\u00e6\u0909\n\u00e6\3\u00e6\5\u00e6\u090c\n\u00e6\3\u00e6\3"+
		"\u00e6\3\u00e6\3\u00e6\3\u00e6\3\u00e6\3\u00e6\3\u00e6\5\u00e6\u0916\n"+
		"\u00e6\3\u00e7\3\u00e7\3\u00e8\3\u00e8\3\u00e8\3\u00e8\3\u00e9\3\u00e9"+
		"\5\u00e9\u0920\n\u00e9\3\u00ea\3\u00ea\3\u00eb\3\u00eb\3\u00eb\3\u00eb"+
		"\3\u00eb\3\u00eb\3\u00eb\3\u00eb\5\u00eb\u092c\n\u00eb\3\u00ec\3\u00ec"+
		"\3\u00ec\3\u00ec\3\u00ec\3\u00ec\3\u00ec\3\u00ec\3\u00ec\5\u00ec\u0937"+
		"\n\u00ec\3\u00ed\3\u00ed\3\u00ed\7\u00ed\u093c\n\u00ed\f\u00ed\16\u00ed"+
		"\u093f\13\u00ed\3\u00ee\3\u00ee\3\u00ef\3\u00ef\5\u00ef\u0945\n\u00ef"+
		"\3\u00f0\3\u00f0\5\u00f0\u0949\n\u00f0\3\u00f0\5\u00f0\u094c\n\u00f0\3"+
		"\u00f0\3\u00f0\3\u00f1\3\u00f1\3\u00f1\5\u00f1\u0953\n\u00f1\3\u00f2\6"+
		"\u00f2\u0956\n\u00f2\r\u00f2\16\u00f2\u0957\3\u00f3\3\u00f3\3\u00f3\5"+
		"\u00f3\u095d\n\u00f3\3\u00f4\3\u00f4\5\u00f4\u0961\n\u00f4\3\u00f5\3\u00f5"+
		"\3\u00f5\3\u00f5\3\u00f5\3\u00f5\3\u00f5\3\u00f5\3\u00f5\3\u00f5\5\u00f5"+
		"\u096d\n\u00f5\3\u00f5\3\u00f5\3\u00f5\7\u00f5\u0972\n\u00f5\f\u00f5\16"+
		"\u00f5\u0975\13\u00f5\3\u00f6\3\u00f6\3\u00f6\3\u00f6\3\u00f6\3\u00f6"+
		"\3\u00f6\3\u00f6\3\u00f6\3\u00f6\3\u00f6\3\u00f6\3\u00f6\3\u00f6\3\u00f6"+
		"\3\u00f6\5\u00f6\u0987\n\u00f6\3\u00f7\3\u00f7\3\u00f8\3\u00f8\3\u00f9"+
		"\3\u00f9\3\u00fa\3\u00fa\3\u00fa\3\u00fa\3\u00fa\3\u00fa\3\u00fa\3\u00fa"+
		"\3\u00fa\3\u00fa\3\u00fa\3\u00fa\3\u00fa\3\u00fa\5\u00fa\u099d\n\u00fa"+
		"\3\u00fb\3\u00fb\3\u00fc\3\u00fc\3\u00fd\3\u00fd\5\u00fd\u09a5\n\u00fd"+
		"\3\u00fe\3\u00fe\3\u00ff\3\u00ff\3\u0100\3\u0100\5\u0100\u09ad\n\u0100"+
		"\3\u0100\3\u0100\3\u0100\5\u0100\u09b2\n\u0100\7\u0100\u09b4\n\u0100\f"+
		"\u0100\16\u0100\u09b7\13\u0100\3\u0101\3\u0101\3\u0102\3\u0102\3\u0102"+
		"\3\u0102\5\u0102\u09bf\n\u0102\3\u0103\5\u0103\u09c2\n\u0103\3\u0103\3"+
		"\u0103\5\u0103\u09c6\n\u0103\3\u0103\5\u0103\u09c9\n\u0103\3\u0104\3\u0104"+
		"\3\u0104\2\6\u0130\u01a2\u01b4\u01e8\u0105\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|"+
		"~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096"+
		"\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae"+
		"\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6"+
		"\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de"+
		"\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6"+
		"\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c\u010e"+
		"\u0110\u0112\u0114\u0116\u0118\u011a\u011c\u011e\u0120\u0122\u0124\u0126"+
		"\u0128\u012a\u012c\u012e\u0130\u0132\u0134\u0136\u0138\u013a\u013c\u013e"+
		"\u0140\u0142\u0144\u0146\u0148\u014a\u014c\u014e\u0150\u0152\u0154\u0156"+
		"\u0158\u015a\u015c\u015e\u0160\u0162\u0164\u0166\u0168\u016a\u016c\u016e"+
		"\u0170\u0172\u0174\u0176\u0178\u017a\u017c\u017e\u0180\u0182\u0184\u0186"+
		"\u0188\u018a\u018c\u018e\u0190\u0192\u0194\u0196\u0198\u019a\u019c\u019e"+
		"\u01a0\u01a2\u01a4\u01a6\u01a8\u01aa\u01ac\u01ae\u01b0\u01b2\u01b4\u01b6"+
		"\u01b8\u01ba\u01bc\u01be\u01c0\u01c2\u01c4\u01c6\u01c8\u01ca\u01cc\u01ce"+
		"\u01d0\u01d2\u01d4\u01d6\u01d8\u01da\u01dc\u01de\u01e0\u01e2\u01e4\u01e6"+
		"\u01e8\u01ea\u01ec\u01ee\u01f0\u01f2\u01f4\u01f6\u01f8\u01fa\u01fc\u01fe"+
		"\u0200\u0202\u0204\u0206\2\23\3\2\6\b\3\2\35\36\3\2$+\4\2\u009f\u009f"+
		"\u00a1\u00a2\5\2\35\36//HL\3\2QR\3\2YZ\3\2ac\5\2==@@uv\3\2xy\f\2##,.M"+
		"MSSYZiikkmm|~\u0098\u0098\3\2|}\6\2$$&&((**\3\2\u008b\u008e\23\2\b\21"+
		"\25 //<<AACLQRUUWX[^dentww{{\u0081\u0087\u0092\u0094\u0096\u0097\24\2"+
		"\25\25\36\36$&((**\60;=>@@BBNPVV^c\177\u0080\u0082\u0082\u0088\u0089\u008b"+
		"\u008e\u0090\u0091\u0095\u0095\3\2\u009d\u00a0\2\u0a89\2\u0209\3\2\2\2"+
		"\4\u0232\3\2\2\2\6\u0234\3\2\2\2\b\u023a\3\2\2\2\n\u023f\3\2\2\2\f\u0246"+
		"\3\2\2\2\16\u0248\3\2\2\2\20\u0254\3\2\2\2\22\u0258\3\2\2\2\24\u0260\3"+
		"\2\2\2\26\u0262\3\2\2\2\30\u026c\3\2\2\2\32\u026e\3\2\2\2\34\u0273\3\2"+
		"\2\2\36\u027c\3\2\2\2 \u028c\3\2\2\2\"\u028e\3\2\2\2$\u0292\3\2\2\2&\u029a"+
		"\3\2\2\2(\u029e\3\2\2\2*\u02a7\3\2\2\2,\u02a9\3\2\2\2.\u02ac\3\2\2\2\60"+
		"\u02b3\3\2\2\2\62\u02b5\3\2\2\2\64\u02b9\3\2\2\2\66\u02bd\3\2\2\28\u02bf"+
		"\3\2\2\2:\u02c3\3\2\2\2<\u02c6\3\2\2\2>\u02c9\3\2\2\2@\u02ce\3\2\2\2B"+
		"\u02d2\3\2\2\2D\u02db\3\2\2\2F\u02e7\3\2\2\2H\u02e9\3\2\2\2J\u02ed\3\2"+
		"\2\2L\u02f1\3\2\2\2N\u02f4\3\2\2\2P\u02f6\3\2\2\2R\u02fb\3\2\2\2T\u0307"+
		"\3\2\2\2V\u0309\3\2\2\2X\u030b\3\2\2\2Z\u030d\3\2\2\2\\\u0314\3\2\2\2"+
		"^\u0325\3\2\2\2`\u0327\3\2\2\2b\u032a\3\2\2\2d\u0334\3\2\2\2f\u033e\3"+
		"\2\2\2h\u0340\3\2\2\2j\u0344\3\2\2\2l\u0348\3\2\2\2n\u0350\3\2\2\2p\u038e"+
		"\3\2\2\2r\u0391\3\2\2\2t\u0396\3\2\2\2v\u03b3\3\2\2\2x\u03ce\3\2\2\2z"+
		"\u03d1\3\2\2\2|\u03d5\3\2\2\2~\u03dc\3\2\2\2\u0080\u03e4\3\2\2\2\u0082"+
		"\u03eb\3\2\2\2\u0084\u03ef\3\2\2\2\u0086\u03f2\3\2\2\2\u0088\u03fa\3\2"+
		"\2\2\u008a\u0402\3\2\2\2\u008c\u0406\3\2\2\2\u008e\u0428\3\2\2\2\u0090"+
		"\u042b\3\2\2\2\u0092\u0432\3\2\2\2\u0094\u0440\3\2\2\2\u0096\u0443\3\2"+
		"\2\2\u0098\u044c\3\2\2\2\u009a\u0457\3\2\2\2\u009c\u0467\3\2\2\2\u009e"+
		"\u046a\3\2\2\2\u00a0\u046f\3\2\2\2\u00a2\u0481\3\2\2\2\u00a4\u0484\3\2"+
		"\2\2\u00a6\u048d\3\2\2\2\u00a8\u0495\3\2\2\2\u00aa\u0499\3\2\2\2\u00ac"+
		"\u04a3\3\2\2\2\u00ae\u04a5\3\2\2\2\u00b0\u04b7\3\2\2\2\u00b2\u04ba\3\2"+
		"\2\2\u00b4\u04c3\3\2\2\2\u00b6\u04c5\3\2\2\2\u00b8\u04cc\3\2\2\2\u00ba"+
		"\u04d2\3\2\2\2\u00bc\u04dd\3\2\2\2\u00be\u04df\3\2\2\2\u00c0\u04fc\3\2"+
		"\2\2\u00c2\u0501\3\2\2\2\u00c4\u0505\3\2\2\2\u00c6\u0507\3\2\2\2\u00c8"+
		"\u050b\3\2\2\2\u00ca\u0514\3\2\2\2\u00cc\u0517\3\2\2\2\u00ce\u0528\3\2"+
		"\2\2\u00d0\u0531\3\2\2\2\u00d2\u0534\3\2\2\2\u00d4\u053c\3\2\2\2\u00d6"+
		"\u0544\3\2\2\2\u00d8\u0548\3\2\2\2\u00da\u054a\3\2\2\2\u00dc\u054c\3\2"+
		"\2\2\u00de\u055b\3\2\2\2\u00e0\u0561\3\2\2\2\u00e2\u0564\3\2\2\2\u00e4"+
		"\u0569\3\2\2\2\u00e6\u0571\3\2\2\2\u00e8\u0575\3\2\2\2\u00ea\u0579\3\2"+
		"\2\2\u00ec\u0588\3\2\2\2\u00ee\u058a\3\2\2\2\u00f0\u0591\3\2\2\2\u00f2"+
		"\u05a8\3\2\2\2\u00f4\u05aa\3\2\2\2\u00f6\u05ac\3\2\2\2\u00f8\u05b3\3\2"+
		"\2\2\u00fa\u05bf\3\2\2\2\u00fc\u05c1\3\2\2\2\u00fe\u05db\3\2\2\2\u0100"+
		"\u05de\3\2\2\2\u0102\u05e2\3\2\2\2\u0104\u05e7\3\2\2\2\u0106\u05ee\3\2"+
		"\2\2\u0108\u05f6\3\2\2\2\u010a\u05fb\3\2\2\2\u010c\u0608\3\2\2\2\u010e"+
		"\u0613\3\2\2\2\u0110\u061c\3\2\2\2\u0112\u061f\3\2\2\2\u0114\u0625\3\2"+
		"\2\2\u0116\u0632\3\2\2\2\u0118\u0644\3\2\2\2\u011a\u0647\3\2\2\2\u011c"+
		"\u064f\3\2\2\2\u011e\u0658\3\2\2\2\u0120\u065a\3\2\2\2\u0122\u0660\3\2"+
		"\2\2\u0124\u0666\3\2\2\2\u0126\u0677\3\2\2\2\u0128\u0679\3\2\2\2\u012a"+
		"\u067c\3\2\2\2\u012c\u067e\3\2\2\2\u012e\u0681\3\2\2\2\u0130\u0695\3\2"+
		"\2\2\u0132\u069f\3\2\2\2\u0134\u06a1\3\2\2\2\u0136\u06a7\3\2\2\2\u0138"+
		"\u06a9\3\2\2\2\u013a\u06af\3\2\2\2\u013c\u06bc\3\2\2\2\u013e\u06bf\3\2"+
		"\2\2\u0140\u06ca\3\2\2\2\u0142\u06cc\3\2\2\2\u0144\u06cf\3\2\2\2\u0146"+
		"\u06d3\3\2\2\2\u0148\u06d5\3\2\2\2\u014a\u06da\3\2\2\2\u014c\u06dc\3\2"+
		"\2\2\u014e\u06e3\3\2\2\2\u0150\u06e8\3\2\2\2\u0152\u070d\3\2\2\2\u0154"+
		"\u0710\3\2\2\2\u0156\u0721\3\2\2\2\u0158\u0723\3\2\2\2\u015a\u0726\3\2"+
		"\2\2\u015c\u073a\3\2\2\2\u015e\u073c\3\2\2\2\u0160\u073e\3\2\2\2\u0162"+
		"\u074f\3\2\2\2\u0164\u0763\3\2\2\2\u0166\u076c\3\2\2\2\u0168\u076e\3\2"+
		"\2\2\u016a\u0774\3\2\2\2\u016c\u077f\3\2\2\2\u016e\u0788\3\2\2\2\u0170"+
		"\u078a\3\2\2\2\u0172\u0795\3\2\2\2\u0174\u07a5\3\2\2\2\u0176\u07aa\3\2"+
		"\2\2\u0178\u07ac\3\2\2\2\u017a\u07b0\3\2\2\2\u017c\u07b5\3\2\2\2\u017e"+
		"\u07b9\3\2\2\2\u0180\u07d1\3\2\2\2\u0182\u07da\3\2\2\2\u0184\u07dc\3\2"+
		"\2\2\u0186\u07ec\3\2\2\2\u0188\u07f0\3\2\2\2\u018a\u07f2\3\2\2\2\u018c"+
		"\u07f6\3\2\2\2\u018e\u07ff\3\2\2\2\u0190\u0803\3\2\2\2\u0192\u0805\3\2"+
		"\2\2\u0194\u0808\3\2\2\2\u0196\u080e\3\2\2\2\u0198\u081c\3\2\2\2\u019a"+
		"\u0820\3\2\2\2\u019c\u0822\3\2\2\2\u019e\u082f\3\2\2\2\u01a0\u0831\3\2"+
		"\2\2\u01a2\u0836\3\2\2\2\u01a4\u0871\3\2\2\2\u01a6\u0877\3\2\2\2\u01a8"+
		"\u087b\3\2\2\2\u01aa\u087f\3\2\2\2\u01ac\u0890\3\2\2\2\u01ae\u0892\3\2"+
		"\2\2\u01b0\u0894\3\2\2\2\u01b2\u0896\3\2\2\2\u01b4\u08bc\3\2\2\2\u01b6"+
		"\u08cd\3\2\2\2\u01b8\u08d1\3\2\2\2\u01ba\u08d7\3\2\2\2\u01bc\u08da\3\2"+
		"\2\2\u01be\u08dd\3\2\2\2\u01c0\u08f1\3\2\2\2\u01c2\u08f3\3\2\2\2\u01c4"+
		"\u08f5\3\2\2\2\u01c6\u08fb\3\2\2\2\u01c8\u08ff\3\2\2\2\u01ca\u0915\3\2"+
		"\2\2\u01cc\u0917\3\2\2\2\u01ce\u0919\3\2\2\2\u01d0\u091f\3\2\2\2\u01d2"+
		"\u0921\3\2\2\2\u01d4\u092b\3\2\2\2\u01d6\u0936\3\2\2\2\u01d8\u0938\3\2"+
		"\2\2\u01da\u0940\3\2\2\2\u01dc\u0944\3\2\2\2\u01de\u0946\3\2\2\2\u01e0"+
		"\u094f\3\2\2\2\u01e2\u0955\3\2\2\2\u01e4\u0959\3\2\2\2\u01e6\u095e\3\2"+
		"\2\2\u01e8\u096c\3\2\2\2\u01ea\u0986\3\2\2\2\u01ec\u0988\3\2\2\2\u01ee"+
		"\u098a\3\2\2\2\u01f0\u098c\3\2\2\2\u01f2\u099c\3\2\2\2\u01f4\u099e\3\2"+
		"\2\2\u01f6\u09a0\3\2\2\2\u01f8\u09a4\3\2\2\2\u01fa\u09a6\3\2\2\2\u01fc"+
		"\u09a8\3\2\2\2\u01fe\u09ac\3\2\2\2\u0200\u09b8\3\2\2\2\u0202\u09be\3\2"+
		"\2\2\u0204\u09c8\3\2\2\2\u0206\u09ca\3\2\2\2\u0208\u020a\5\n\6\2\u0209"+
		"\u0208\3\2\2\2\u0209\u020a\3\2\2\2\u020a\u020b\3\2\2\2\u020b\u020c\7\2"+
		"\2\3\u020c\3\3\2\2\2\u020d\u020f\5p9\2\u020e\u0210\7\3\2\2\u020f\u020e"+
		"\3\2\2\2\u020f\u0210\3\2\2\2\u0210\u0233\3\2\2\2\u0211\u0213\5\f\7\2\u0212"+
		"\u0214\7\3\2\2\u0213\u0212\3\2\2\2\u0213\u0214\3\2\2\2\u0214\u0233\3\2"+
		"\2\2\u0215\u0217\5\24\13\2\u0216\u0218\7\3\2\2\u0217\u0216\3\2\2\2\u0217"+
		"\u0218\3\2\2\2\u0218\u0233\3\2\2\2\u0219\u0233\5*\26\2\u021a\u021c\5\60"+
		"\31\2\u021b\u021d\7\3\2\2\u021c\u021b\3\2\2\2\u021c\u021d\3\2\2\2\u021d"+
		"\u0233\3\2\2\2\u021e\u0220\5<\37\2\u021f\u0221\7\3\2\2\u0220\u021f\3\2"+
		"\2\2\u0220\u0221\3\2\2\2\u0221\u0233\3\2\2\2\u0222\u0224\5> \2\u0223\u0225"+
		"\7\4\2\2\u0224\u0223\3\2\2\2\u0224\u0225\3\2\2\2\u0225\u0233\3\2\2\2\u0226"+
		"\u0228\5\u01dc\u00ef\2\u0227\u0229\7\3\2\2\u0228\u0227\3\2\2\2\u0228\u0229"+
		"\3\2\2\2\u0229\u0233\3\2\2\2\u022a\u022c\5\u0154\u00ab\2\u022b\u022d\7"+
		"\3\2\2\u022c\u022b\3\2\2\2\u022c\u022d\3\2\2\2\u022d\u0233\3\2\2\2\u022e"+
		"\u0230\5\6\4\2\u022f\u0231\7\3\2\2\u0230\u022f\3\2\2\2\u0230\u0231\3\2"+
		"\2\2\u0231\u0233\3\2\2\2\u0232\u020d\3\2\2\2\u0232\u0211\3\2\2\2\u0232"+
		"\u0215\3\2\2\2\u0232\u0219\3\2\2\2\u0232\u021a\3\2\2\2\u0232\u021e\3\2"+
		"\2\2\u0232\u0222\3\2\2\2\u0232\u0226\3\2\2\2\u0232\u022a\3\2\2\2\u0232"+
		"\u022e\3\2\2\2\u0233\5\3\2\2\2\u0234\u0236\5\u01a2\u00d2\2\u0235\u0237"+
		"\5\b\5\2\u0236\u0235\3\2\2\2\u0237\u0238\3\2\2\2\u0238\u0236\3\2\2\2\u0238"+
		"\u0239\3\2\2\2\u0239\7\3\2\2\2\u023a\u023b\7\5\2\2\u023b\u023c\t\2\2\2"+
		"\u023c\u023d\5\u017e\u00c0\2\u023d\t\3\2\2\2\u023e\u0240\5\4\3\2\u023f"+
		"\u023e\3\2\2\2\u0240\u0241\3\2\2\2\u0241\u023f\3\2\2\2\u0241\u0242\3\2"+
		"\2\2\u0242\13\3\2\2\2\u0243\u0247\5\16\b\2\u0244\u0247\5\20\t\2\u0245"+
		"\u0247\5\22\n\2\u0246\u0243\3\2\2\2\u0246\u0244\3\2\2\2\u0246\u0245\3"+
		"\2\2\2\u0247\r\3\2\2\2\u0248\u024a\7\t\2\2\u0249\u024b\7\n\2\2\u024a\u0249"+
		"\3\2\2\2\u024a\u024b\3\2\2\2\u024b\u024c\3\2\2\2\u024c\u024d\5\u0130\u0099"+
		"\2\u024d\u024e\7\13\2\2\u024e\u0250\5\u0154\u00ab\2\u024f\u0251\5L\'\2"+
		"\u0250\u024f\3\2\2\2\u0250\u0251\3\2\2\2\u0251\u0252\3\2\2\2\u0252\u0253"+
		"\5|?\2\u0253\17\3\2\2\2\u0254\u0255\7\f\2\2\u0255\u0256\5D#\2\u0256\u0257"+
		"\5|?\2\u0257\21\3\2\2\2\u0258\u0259\7\r\2\2\u0259\u025a\5|?\2\u025a\u025b"+
		"\7\f\2\2\u025b\u025c\5\u0154\u00ab\2\u025c\23\3\2\2\2\u025d\u0261\5\26"+
		"\f\2\u025e\u0261\5\32\16\2\u025f\u0261\5\34\17\2\u0260\u025d\3\2\2\2\u0260"+
		"\u025e\3\2\2\2\u0260\u025f\3\2\2\2\u0261\25\3\2\2\2\u0262\u0263\7\16\2"+
		"\2\u0263\u0264\5D#\2\u0264\u0266\5|?\2\u0265\u0267\5\30\r\2\u0266\u0265"+
		"\3\2\2\2\u0266\u0267\3\2\2\2\u0267\27\3\2\2\2\u0268\u0269\7\17\2\2\u0269"+
		"\u026d\5|?\2\u026a\u026b\7\17\2\2\u026b\u026d\5\26\f\2\u026c\u0268\3\2"+
		"\2\2\u026c\u026a\3\2\2\2\u026d\31\3\2\2\2\u026e\u026f\7\20\2\2\u026f\u0270"+
		"\5D#\2\u0270\u0271\7\17\2\2\u0271\u0272\5|?\2\u0272\33\3\2\2\2\u0273\u0274"+
		"\7\21\2\2\u0274\u0275\5\u0154\u00ab\2\u0275\u0277\7\22\2\2\u0276\u0278"+
		"\5\36\20\2\u0277\u0276\3\2\2\2\u0277\u0278\3\2\2\2\u0278\u0279\3\2\2\2"+
		"\u0279\u027a\7\23\2\2\u027a\35\3\2\2\2\u027b\u027d\5 \21\2\u027c\u027b"+
		"\3\2\2\2\u027d\u027e\3\2\2\2\u027e\u027c\3\2\2\2\u027e\u027f\3\2\2\2\u027f"+
		"\37\3\2\2\2\u0280\u0281\5\"\22\2\u0281\u0282\5\n\6\2\u0282\u028d\3\2\2"+
		"\2\u0283\u0284\5(\25\2\u0284\u0285\5\n\6\2\u0285\u028d\3\2\2\2\u0286\u0287"+
		"\5\"\22\2\u0287\u0288\7\3\2\2\u0288\u028d\3\2\2\2\u0289\u028a\5(\25\2"+
		"\u028a\u028b\7\3\2\2\u028b\u028d\3\2\2\2\u028c\u0280\3\2\2\2\u028c\u0283"+
		"\3\2\2\2\u028c\u0286\3\2\2\2\u028c\u0289\3\2\2\2\u028d!\3\2\2\2\u028e"+
		"\u028f\7\n\2\2\u028f\u0290\5$\23\2\u0290\u0291\7\4\2\2\u0291#\3\2\2\2"+
		"\u0292\u0297\5&\24\2\u0293\u0294\7\24\2\2\u0294\u0296\5&\24\2\u0295\u0293"+
		"\3\2\2\2\u0296\u0299\3\2\2\2\u0297\u0295\3\2\2\2\u0297\u0298\3\2\2\2\u0298"+
		"%\3\2\2\2\u0299\u0297\3\2\2\2\u029a\u029c\5\u0130\u0099\2\u029b\u029d"+
		"\5L\'\2\u029c\u029b\3\2\2\2\u029c\u029d\3\2\2\2\u029d\'\3\2\2\2\u029e"+
		"\u029f\7\25\2\2\u029f\u02a0\7\4\2\2\u02a0)\3\2\2\2\u02a1\u02a2\5,\27\2"+
		"\u02a2\u02a3\5\f\7\2\u02a3\u02a8\3\2\2\2\u02a4\u02a5\5,\27\2\u02a5\u02a6"+
		"\5\34\17\2\u02a6\u02a8\3\2\2\2\u02a7\u02a1\3\2\2\2\u02a7\u02a4\3\2\2\2"+
		"\u02a8+\3\2\2\2\u02a9\u02aa\5.\30\2\u02aa\u02ab\7\4\2\2\u02ab-\3\2\2\2"+
		"\u02ac\u02ad\5\u01f8\u00fd\2\u02ad/\3\2\2\2\u02ae\u02b4\5\62\32\2\u02af"+
		"\u02b4\5\64\33\2\u02b0\u02b4\5\66\34\2\u02b1\u02b4\58\35\2\u02b2\u02b4"+
		"\5:\36\2\u02b3\u02ae\3\2\2\2\u02b3\u02af\3\2\2\2\u02b3\u02b0\3\2\2\2\u02b3"+
		"\u02b1\3\2\2\2\u02b3\u02b2\3\2\2\2\u02b4\61\3\2\2\2\u02b5\u02b7\7\26\2"+
		"\2\u02b6\u02b8\5.\30\2\u02b7\u02b6\3\2\2\2\u02b7\u02b8\3\2\2\2\u02b8\63"+
		"\3\2\2\2\u02b9\u02bb\7\27\2\2\u02ba\u02bc\5.\30\2\u02bb\u02ba\3\2\2\2"+
		"\u02bb\u02bc\3\2\2\2\u02bc\65\3\2\2\2\u02bd\u02be\7\30\2\2\u02be\67\3"+
		"\2\2\2\u02bf\u02c1\7\31\2\2\u02c0\u02c2\5\u0154\u00ab\2\u02c1\u02c0\3"+
		"\2\2\2\u02c1\u02c2\3\2\2\2\u02c29\3\2\2\2\u02c3\u02c4\7\32\2\2\u02c4\u02c5"+
		"\5\u0154\u00ab\2\u02c5;\3\2\2\2\u02c6\u02c7\7\33\2\2\u02c7\u02c8\5|?\2"+
		"\u02c8=\3\2\2\2\u02c9\u02ca\7\34\2\2\u02ca\u02cc\5|?\2\u02cb\u02cd\5@"+
		"!\2\u02cc\u02cb\3\2\2\2\u02cc\u02cd\3\2\2\2\u02cd?\3\2\2\2\u02ce\u02d0"+
		"\5B\"\2\u02cf\u02d1\5@!\2\u02d0\u02cf\3\2\2\2\u02d0\u02d1\3\2\2\2\u02d1"+
		"A\3\2\2\2\u02d2\u02d4\7\b\2\2\u02d3\u02d5\5\u0130\u0099\2\u02d4\u02d3"+
		"\3\2\2\2\u02d4\u02d5\3\2\2\2\u02d5\u02d7\3\2\2\2\u02d6\u02d8\5L\'\2\u02d7"+
		"\u02d6\3\2\2\2\u02d7\u02d8\3\2\2\2\u02d8\u02d9\3\2\2\2\u02d9\u02da\5|"+
		"?\2\u02daC\3\2\2\2\u02db\u02e0\5F$\2\u02dc\u02dd\7\24\2\2\u02dd\u02df"+
		"\5F$\2\u02de\u02dc\3\2\2\2\u02df\u02e2\3\2\2\2\u02e0\u02de\3\2\2\2\u02e0"+
		"\u02e1\3\2\2\2\u02e1E\3\2\2\2\u02e2\u02e0\3\2\2\2\u02e3\u02e8\5P)\2\u02e4"+
		"\u02e8\5H%\2\u02e5\u02e8\5J&\2\u02e6\u02e8\5\u0154\u00ab\2\u02e7\u02e3"+
		"\3\2\2\2\u02e7\u02e4\3\2\2\2\u02e7\u02e5\3\2\2\2\u02e7\u02e6\3\2\2\2\u02e8"+
		"G\3\2\2\2\u02e9\u02ea\7\n\2\2\u02ea\u02eb\5\u0130\u0099\2\u02eb\u02ec"+
		"\5\u008cG\2\u02ecI\3\2\2\2\u02ed\u02ee\t\3\2\2\u02ee\u02ef\5\u0130\u0099"+
		"\2\u02ef\u02f0\5\u008cG\2\u02f0K\3\2\2\2\u02f1\u02f2\7\37\2\2\u02f2\u02f3"+
		"\5N(\2\u02f3M\3\2\2\2\u02f4\u02f5\5\u0154\u00ab\2\u02f5O\3\2\2\2\u02f6"+
		"\u02f7\7 \2\2\u02f7\u02f8\7!\2\2\u02f8\u02f9\5R*\2\u02f9\u02fa\7\"\2\2"+
		"\u02faQ\3\2\2\2\u02fb\u0300\5T+\2\u02fc\u02fd\7\24\2\2\u02fd\u02ff\5R"+
		"*\2\u02fe\u02fc\3\2\2\2\u02ff\u0302\3\2\2\2\u0300\u02fe\3\2\2\2\u0300"+
		"\u0301\3\2\2\2\u0301S\3\2\2\2\u0302\u0300\3\2\2\2\u0303\u0304\5V,\2\u0304"+
		"\u0305\5X-\2\u0305\u0308\3\2\2\2\u0306\u0308\7#\2\2\u0307\u0303\3\2\2"+
		"\2\u0307\u0306\3\2\2\2\u0308U\3\2\2\2\u0309\u030a\t\4\2\2\u030aW\3\2\2"+
		"\2\u030b\u030c\t\5\2\2\u030cY\3\2\2\2\u030d\u030e\7,\2\2\u030e\u0310\5"+
		"\\/\2\u030f\u0311\5`\61\2\u0310\u030f\3\2\2\2\u0310\u0311\3\2\2\2\u0311"+
		"\u0312\3\2\2\2\u0312\u0313\7-\2\2\u0313[\3\2\2\2\u0314\u0319\5^\60\2\u0315"+
		"\u0316\7\24\2\2\u0316\u0318\5^\60\2\u0317\u0315\3\2\2\2\u0318\u031b\3"+
		"\2\2\2\u0319\u0317\3\2\2\2\u0319\u031a\3\2\2\2\u031a]\3\2\2\2\u031b\u0319"+
		"\3\2\2\2\u031c\u0326\5\u01c2\u00e2\2\u031d\u031e\5\u01c2\u00e2\2\u031e"+
		"\u031f\7\4\2\2\u031f\u0320\5\u01c0\u00e1\2\u0320\u0326\3\2\2\2\u0321\u0322"+
		"\5\u01c2\u00e2\2\u0322\u0323\7\4\2\2\u0323\u0324\5\u01ce\u00e8\2\u0324"+
		"\u0326\3\2\2\2\u0325\u031c\3\2\2\2\u0325\u031d\3\2\2\2\u0325\u0321\3\2"+
		"\2\2\u0326_\3\2\2\2\u0327\u0328\7\37\2\2\u0328\u0329\5b\62\2\u0329a\3"+
		"\2\2\2\u032a\u032f\5d\63\2\u032b\u032c\7\24\2\2\u032c\u032e\5d\63\2\u032d"+
		"\u032b\3\2\2\2\u032e\u0331\3\2\2\2\u032f\u032d\3\2\2\2\u032f\u0330\3\2"+
		"\2\2\u0330c\3\2\2\2\u0331\u032f\3\2\2\2\u0332\u0335\5f\64\2\u0333\u0335"+
		"\5h\65\2\u0334\u0332\3\2\2\2\u0334\u0333\3\2\2\2\u0335e\3\2\2\2\u0336"+
		"\u0337\5\u01c0\u00e1\2\u0337\u0338\7\4\2\2\u0338\u0339\5\u01c0\u00e1\2"+
		"\u0339\u033f\3\2\2\2\u033a\u033b\5\u01c0\u00e1\2\u033b\u033c\7\4\2\2\u033c"+
		"\u033d\5\u01ce\u00e8\2\u033d\u033f\3\2\2\2\u033e\u0336\3\2\2\2\u033e\u033a"+
		"\3\2\2\2\u033fg\3\2\2\2\u0340\u0341\5\u01c0\u00e1\2\u0341\u0342\7.\2\2"+
		"\u0342\u0343\5\u01b4\u00db\2\u0343i\3\2\2\2\u0344\u0345\7,\2\2\u0345\u0346"+
		"\5l\67\2\u0346\u0347\7-\2\2\u0347k\3\2\2\2\u0348\u034d\5n8\2\u0349\u034a"+
		"\7\24\2\2\u034a\u034c\5n8\2\u034b\u0349\3\2\2\2\u034c\u034f\3\2\2\2\u034d"+
		"\u034b\3\2\2\2\u034d\u034e\3\2\2\2\u034em\3\2\2\2\u034f\u034d\3\2\2\2"+
		"\u0350\u0351\5\u01b4\u00db\2\u0351o\3\2\2\2\u0352\u0354\5~@\2\u0353\u0355"+
		"\7\3\2\2\u0354\u0353\3\2\2\2\u0354\u0355\3\2\2\2\u0355\u038f\3\2\2\2\u0356"+
		"\u0358\5\u0086D\2\u0357\u0359\7\3\2\2\u0358\u0357\3\2\2\2\u0358\u0359"+
		"\3\2\2\2\u0359\u038f\3\2\2\2\u035a\u035c\5\u008eH\2\u035b\u035d\7\3\2"+
		"\2\u035c\u035b\3\2\2\2\u035c\u035d\3\2\2\2\u035d\u038f\3\2\2\2\u035e\u0360"+
		"\5\u00a8U\2\u035f\u0361\7\3\2\2\u0360\u035f\3\2\2\2\u0360\u0361\3\2\2"+
		"\2\u0361\u038f\3\2\2\2\u0362\u0364\5\u00b0Y\2\u0363\u0365\7\3\2\2\u0364"+
		"\u0363\3\2\2\2\u0364\u0365\3\2\2\2\u0365\u038f\3\2\2\2\u0366\u0368\5\u00c8"+
		"e\2\u0367\u0369\7\3\2\2\u0368\u0367\3\2\2\2\u0368\u0369\3\2\2\2\u0369"+
		"\u038f\3\2\2\2\u036a\u036c\5\u00eav\2\u036b\u036d\7\3\2\2\u036c\u036b"+
		"\3\2\2\2\u036c\u036d\3\2\2\2\u036d\u038f\3\2\2\2\u036e\u0370\5\u00f0y"+
		"\2\u036f\u0371\7\3\2\2\u0370\u036f\3\2\2\2\u0370\u0371\3\2\2\2\u0371\u038f"+
		"\3\2\2\2\u0372\u0374\5\u00f8}\2\u0373\u0375\7\3\2\2\u0374\u0373\3\2\2"+
		"\2\u0374\u0375\3\2\2\2\u0375\u038f\3\2\2\2\u0376\u0378\5\u010c\u0087\2"+
		"\u0377\u0379\7\3\2\2\u0378\u0377\3\2\2\2\u0378\u0379\3\2\2\2\u0379\u038f"+
		"\3\2\2\2\u037a\u037c\5\u0112\u008a\2\u037b\u037d\7\3\2\2\u037c\u037b\3"+
		"\2\2\2\u037c\u037d\3\2\2\2\u037d\u038f\3\2\2\2\u037e\u0380\5\u0114\u008b"+
		"\2\u037f\u0381\7\3\2\2\u0380\u037f\3\2\2\2\u0380\u0381\3\2\2\2\u0381\u038f"+
		"\3\2\2\2\u0382\u0384\5\u0118\u008d\2\u0383\u0385\7\3\2\2\u0384\u0383\3"+
		"\2\2\2\u0384\u0385\3\2\2\2\u0385\u038f\3\2\2\2\u0386\u0388\5\u011e\u0090"+
		"\2\u0387\u0389\7\3\2\2\u0388\u0387\3\2\2\2\u0388\u0389\3\2\2\2\u0389\u038f"+
		"\3\2\2\2\u038a\u038c\5\u01dc\u00ef\2\u038b\u038d\7\3\2\2\u038c\u038b\3"+
		"\2\2\2\u038c\u038d\3\2\2\2\u038d\u038f\3\2\2\2\u038e\u0352\3\2\2\2\u038e"+
		"\u0356\3\2\2\2\u038e\u035a\3\2\2\2\u038e\u035e\3\2\2\2\u038e\u0362\3\2"+
		"\2\2\u038e\u0366\3\2\2\2\u038e\u036a\3\2\2\2\u038e\u036e\3\2\2\2\u038e"+
		"\u0372\3\2\2\2\u038e\u0376\3\2\2\2\u038e\u037a\3\2\2\2\u038e\u037e\3\2"+
		"\2\2\u038e\u0382\3\2\2\2\u038e\u0386\3\2\2\2\u038e\u038a\3\2\2\2\u038f"+
		"q\3\2\2\2\u0390\u0392\5p9\2\u0391\u0390\3\2\2\2\u0392\u0393\3\2\2\2\u0393"+
		"\u0391\3\2\2\2\u0393\u0394\3\2\2\2\u0394s\3\2\2\2\u0395\u0397\5v<\2\u0396"+
		"\u0395\3\2\2\2\u0397\u0398\3\2\2\2\u0398\u0396\3\2\2\2\u0398\u0399\3\2"+
		"\2\2\u0399u\3\2\2\2\u039a\u03b4\7/\2\2\u039b\u03b4\7\60\2\2\u039c\u03b4"+
		"\7\61\2\2\u039d\u03b4\7\62\2\2\u039e\u03b4\7\63\2\2\u039f\u03b4\7\64\2"+
		"\2\u03a0\u03b4\7\65\2\2\u03a1\u03b4\7\66\2\2\u03a2\u03b4\7\67\2\2\u03a3"+
		"\u03b4\78\2\2\u03a4\u03b4\79\2\2\u03a5\u03b4\7:\2\2\u03a6\u03b4\7;\2\2"+
		"\u03a7\u03b4\7<\2\2\u03a8\u03b4\7=\2\2\u03a9\u03aa\7=\2\2\u03aa\u03ab"+
		"\7!\2\2\u03ab\u03ac\7>\2\2\u03ac\u03b4\7\"\2\2\u03ad\u03ae\7=\2\2\u03ae"+
		"\u03af\7!\2\2\u03af\u03b0\7?\2\2\u03b0\u03b4\7\"\2\2\u03b1\u03b4\7@\2"+
		"\2\u03b2\u03b4\5x=\2\u03b3\u039a\3\2\2\2\u03b3\u039b\3\2\2\2\u03b3\u039c"+
		"\3\2\2\2\u03b3\u039d\3\2\2\2\u03b3\u039e\3\2\2\2\u03b3\u039f\3\2\2\2\u03b3"+
		"\u03a0\3\2\2\2\u03b3\u03a1\3\2\2\2\u03b3\u03a2\3\2\2\2\u03b3\u03a3\3\2"+
		"\2\2\u03b3\u03a4\3\2\2\2\u03b3\u03a5\3\2\2\2\u03b3\u03a6\3\2\2\2\u03b3"+
		"\u03a7\3\2\2\2\u03b3\u03a8\3\2\2\2\u03b3\u03a9\3\2\2\2\u03b3\u03ad\3\2"+
		"\2\2\u03b3\u03b1\3\2\2\2\u03b3\u03b2\3\2\2\2\u03b4w\3\2\2\2\u03b5\u03cf"+
		"\7A\2\2\u03b6\u03b7\7A\2\2\u03b7\u03b8\7!\2\2\u03b8\u03b9\7B\2\2\u03b9"+
		"\u03cf\7\"\2\2\u03ba\u03cf\7C\2\2\u03bb\u03bc\7C\2\2\u03bc\u03bd\7!\2"+
		"\2\u03bd\u03be\7B\2\2\u03be\u03cf\7\"\2\2\u03bf\u03cf\7D\2\2\u03c0\u03c1"+
		"\7D\2\2\u03c1\u03c2\7!\2\2\u03c2\u03c3\7B\2\2\u03c3\u03cf\7\"\2\2\u03c4"+
		"\u03cf\7E\2\2\u03c5\u03c6\7E\2\2\u03c6\u03c7\7!\2\2\u03c7\u03c8\7B\2\2"+
		"\u03c8\u03cf\7\"\2\2\u03c9\u03cf\7F\2\2\u03ca\u03cb\7F\2\2\u03cb\u03cc"+
		"\7!\2\2\u03cc\u03cd\7B\2\2\u03cd\u03cf\7\"\2\2\u03ce\u03b5\3\2\2\2\u03ce"+
		"\u03b6\3\2\2\2\u03ce\u03ba\3\2\2\2\u03ce\u03bb\3\2\2\2\u03ce\u03bf\3\2"+
		"\2\2\u03ce\u03c0\3\2\2\2\u03ce\u03c4\3\2\2\2\u03ce\u03c5\3\2\2\2\u03ce"+
		"\u03c9\3\2\2\2\u03ce\u03ca\3\2\2\2\u03cfy\3\2\2\2\u03d0\u03d2\5x=\2\u03d1"+
		"\u03d0\3\2\2\2\u03d2\u03d3\3\2\2\2\u03d3\u03d1\3\2\2\2\u03d3\u03d4\3\2"+
		"\2\2\u03d4{\3\2\2\2\u03d5\u03d7\7\22\2\2\u03d6\u03d8\5\n\6\2\u03d7\u03d6"+
		"\3\2\2\2\u03d7\u03d8\3\2\2\2\u03d8\u03d9\3\2\2\2\u03d9\u03da\7\23\2\2"+
		"\u03da}\3\2\2\2\u03db\u03dd\5\u014e\u00a8\2\u03dc\u03db\3\2\2\2\u03dc"+
		"\u03dd\3\2\2\2\u03dd\u03de\3\2\2\2\u03de\u03e0\7G\2\2\u03df\u03e1\5\u0080"+
		"A\2\u03e0\u03df\3\2\2\2\u03e0\u03e1\3\2\2\2\u03e1\u03e2\3\2\2\2\u03e2"+
		"\u03e3\5\u0082B\2\u03e3\177\3\2\2\2\u03e4\u03e5\t\6\2\2\u03e5\u0081\3"+
		"\2\2\2\u03e6\u03ec\5\u0084C\2\u03e7\u03e8\5\u0084C\2\u03e8\u03e9\7\5\2"+
		"\2\u03e9\u03ea\5\u0082B\2\u03ea\u03ec\3\2\2\2\u03eb\u03e6\3\2\2\2\u03eb"+
		"\u03e7\3\2\2\2\u03ec\u0083\3\2\2\2\u03ed\u03f0\5\u01f8\u00fd\2\u03ee\u03f0"+
		"\5\u01ac\u00d7\2\u03ef\u03ed\3\2\2\2\u03ef\u03ee\3\2\2\2\u03f0\u0085\3"+
		"\2\2\2\u03f1\u03f3\5\u014e\u00a8\2\u03f2\u03f1\3\2\2\2\u03f2\u03f3\3\2"+
		"\2\2\u03f3\u03f5\3\2\2\2\u03f4\u03f6\5t;\2\u03f5\u03f4\3\2\2\2\u03f5\u03f6"+
		"\3\2\2\2\u03f6\u03f7\3\2\2\2\u03f7\u03f8\7\35\2\2\u03f8\u03f9\5\u0088"+
		"E\2\u03f9\u0087\3\2\2\2\u03fa\u03ff\5\u008aF\2\u03fb\u03fc\7\24\2\2\u03fc"+
		"\u03fe\5\u008aF\2\u03fd\u03fb\3\2\2\2\u03fe\u0401\3\2\2\2\u03ff\u03fd"+
		"\3\2\2\2\u03ff\u0400\3\2\2\2\u0400\u0089\3\2\2\2\u0401\u03ff\3\2\2\2\u0402"+
		"\u0404\5\u0130\u0099\2\u0403\u0405\5\u008cG\2\u0404\u0403\3\2\2\2\u0404"+
		"\u0405\3\2\2\2\u0405\u008b\3\2\2\2\u0406\u0407\7M\2\2\u0407\u0408\5\u0154"+
		"\u00ab\2\u0408\u008d\3\2\2\2\u0409\u040a\5\u0090I\2\u040a\u040b\5\u0092"+
		"J\2\u040b\u040c\5\u01be\u00e0\2\u040c\u040d\5\u0094K\2\u040d\u0429\3\2"+
		"\2\2\u040e\u040f\5\u0090I\2\u040f\u0410\5\u0092J\2\u0410\u0411\5\u01be"+
		"\u00e0\2\u0411\u0412\5\u009cO\2\u0412\u0429\3\2\2\2\u0413\u0414\5\u0090"+
		"I\2\u0414\u0415\5\u0092J\2\u0415\u0416\5\u008cG\2\u0416\u0417\5\u00a2"+
		"R\2\u0417\u0429\3\2\2\2\u0418\u0419\5\u0090I\2\u0419\u041a\5\u0092J\2"+
		"\u041a\u041c\5\u01be\u00e0\2\u041b\u041d\5\u008cG\2\u041c\u041b\3\2\2"+
		"\2\u041c\u041d\3\2\2\2\u041d\u041e\3\2\2\2\u041e\u041f\5\u00a2R\2\u041f"+
		"\u0429\3\2\2\2\u0420\u0421\5\u0090I\2\u0421\u0422\5\u0092J\2\u0422\u0423"+
		"\5\u01be\u00e0\2\u0423\u0424\5|?\2\u0424\u0429\3\2\2\2\u0425\u0426\5\u0090"+
		"I\2\u0426\u0427\5\u0088E\2\u0427\u0429\3\2\2\2\u0428\u0409\3\2\2\2\u0428"+
		"\u040e\3\2\2\2\u0428\u0413\3\2\2\2\u0428\u0418\3\2\2\2\u0428\u0420\3\2"+
		"\2\2\u0428\u0425\3\2\2\2\u0429\u008f\3\2\2\2\u042a\u042c\5\u014e\u00a8"+
		"\2\u042b\u042a\3\2\2\2\u042b\u042c\3\2\2\2\u042c\u042e\3\2\2\2\u042d\u042f"+
		"\5t;\2\u042e\u042d\3\2\2\2\u042e\u042f\3\2\2\2\u042f\u0430\3\2\2\2\u0430"+
		"\u0431\7\36\2\2\u0431\u0091\3\2\2\2\u0432\u0433\5\u01f8\u00fd\2\u0433"+
		"\u0093\3\2\2\2\u0434\u0435\7\22\2\2\u0435\u0437\5\u0096L\2\u0436\u0438"+
		"\5\u0098M\2\u0437\u0436\3\2\2\2\u0437\u0438\3\2\2\2\u0438\u0439\3\2\2"+
		"\2\u0439\u043a\7\23\2\2\u043a\u0441\3\2\2\2\u043b\u043c\7\22\2\2\u043c"+
		"\u043d\5\u0098M\2\u043d\u043e\5\u0096L\2\u043e\u043f\7\23\2\2\u043f\u0441"+
		"\3\2\2\2\u0440\u0434\3\2\2\2\u0440\u043b\3\2\2\2\u0441\u0095\3\2\2\2\u0442"+
		"\u0444\5\u014e\u00a8\2\u0443\u0442\3\2\2\2\u0443\u0444\3\2\2\2\u0444\u0446"+
		"\3\2\2\2\u0445\u0447\5t;\2\u0446\u0445\3\2\2\2\u0446\u0447\3\2\2\2\u0447"+
		"\u0448\3\2\2\2\u0448\u0449\7N\2\2\u0449\u044a\5|?\2\u044a\u0097\3\2\2"+
		"\2\u044b\u044d\5\u014e\u00a8\2\u044c\u044b\3\2\2\2\u044c\u044d\3\2\2\2"+
		"\u044d\u044f\3\2\2\2\u044e\u0450\5t;\2\u044f\u044e\3\2\2\2\u044f\u0450"+
		"\3\2\2\2\u0450\u0451\3\2\2\2\u0451\u0453\7B\2\2\u0452\u0454\5\u009aN\2"+
		"\u0453\u0452\3\2\2\2\u0453\u0454\3\2\2\2\u0454\u0455\3\2\2\2\u0455\u0456"+
		"\5|?\2\u0456\u0099\3\2\2\2\u0457\u0458\7!\2\2\u0458\u0459\5\u01f8\u00fd"+
		"\2\u0459\u045a\7\"\2\2\u045a\u009b\3\2\2\2\u045b\u045c\7\22\2\2\u045c"+
		"\u045e\5\u009eP\2\u045d\u045f\5\u00a0Q\2\u045e\u045d\3\2\2\2\u045e\u045f"+
		"\3\2\2\2\u045f\u0460\3\2\2\2\u0460\u0461\7\23\2\2\u0461\u0468\3\2\2\2"+
		"\u0462\u0463\7\22\2\2\u0463\u0464\5\u00a0Q\2\u0464\u0465\5\u009eP\2\u0465"+
		"\u0466\7\23\2\2\u0466\u0468\3\2\2\2\u0467\u045b\3\2\2\2\u0467\u0462\3"+
		"\2\2\2\u0468\u009d\3\2\2\2\u0469\u046b\5\u014e\u00a8\2\u046a\u0469\3\2"+
		"\2\2\u046a\u046b\3\2\2\2\u046b\u046c\3\2\2\2\u046c\u046d\7N\2\2\u046d"+
		"\u009f\3\2\2\2\u046e\u0470\5\u014e\u00a8\2\u046f\u046e\3\2\2\2\u046f\u0470"+
		"\3\2\2\2\u0470\u0471\3\2\2\2\u0471\u0472\7B\2\2\u0472\u00a1\3\2\2\2\u0473"+
		"\u0474\7\22\2\2\u0474\u0476\5\u00a4S\2\u0475\u0477\5\u00a6T\2\u0476\u0475"+
		"\3\2\2\2\u0476\u0477\3\2\2\2\u0477\u0478\3\2\2\2\u0478\u0479\7\23\2\2"+
		"\u0479\u0482\3\2\2\2\u047a\u047b\7\22\2\2\u047b\u047d\5\u00a6T\2\u047c"+
		"\u047e\5\u00a4S\2\u047d\u047c\3\2\2\2\u047d\u047e\3\2\2\2\u047e\u047f"+
		"\3\2\2\2\u047f\u0480\7\23\2\2\u0480\u0482\3\2\2\2\u0481\u0473\3\2\2\2"+
		"\u0481\u047a\3\2\2\2\u0482\u00a3\3\2\2\2\u0483\u0485\5\u014e\u00a8\2\u0484"+
		"\u0483\3\2\2\2\u0484\u0485\3\2\2\2\u0485\u0486\3\2\2\2\u0486\u0488\7O"+
		"\2\2\u0487\u0489\5\u009aN\2\u0488\u0487\3\2\2\2\u0488\u0489\3\2\2\2\u0489"+
		"\u048a\3\2\2\2\u048a\u048b\5|?\2\u048b\u00a5\3\2\2\2\u048c\u048e\5\u014e"+
		"\u00a8\2\u048d\u048c\3\2\2\2\u048d\u048e\3\2\2\2\u048e\u048f\3\2\2\2\u048f"+
		"\u0491\7P\2\2\u0490\u0492\5\u009aN\2\u0491\u0490\3\2\2\2\u0491\u0492\3"+
		"\2\2\2\u0492\u0493\3\2\2\2\u0493\u0494\5|?\2\u0494\u00a7\3\2\2\2\u0495"+
		"\u0496\5\u00aaV\2\u0496\u0497\5\u00aeX\2\u0497\u00a9\3\2\2\2\u0498\u049a"+
		"\5\u014e\u00a8\2\u0499\u0498\3\2\2\2\u0499\u049a\3\2\2\2\u049a\u049c\3"+
		"\2\2\2\u049b\u049d\5x=\2\u049c\u049b\3\2\2\2\u049c\u049d\3\2\2\2\u049d"+
		"\u049e\3\2\2\2\u049e\u049f\7H\2\2\u049f\u04a1\5\u00acW\2\u04a0\u04a2\5"+
		"Z.\2\u04a1\u04a0\3\2\2\2\u04a1\u04a2\3\2\2\2\u04a2\u00ab\3\2\2\2\u04a3"+
		"\u04a4\5\u01f8\u00fd\2\u04a4\u00ad\3\2\2\2\u04a5\u04a6\7M\2\2\u04a6\u04a7"+
		"\5\u01b4\u00db\2\u04a7\u00af\3\2\2\2\u04a8\u04a9\5\u00b2Z\2\u04a9\u04ab"+
		"\5\u00b4[\2\u04aa\u04ac\5Z.\2\u04ab\u04aa\3\2\2\2\u04ab\u04ac\3\2\2\2"+
		"\u04ac\u04ad\3\2\2\2\u04ad\u04ae\5\u00b6\\\2\u04ae\u04af\5\u00ba^\2\u04af"+
		"\u04b8\3\2\2\2\u04b0\u04b1\5\u00b2Z\2\u04b1\u04b3\5\u00b4[\2\u04b2\u04b4"+
		"\5Z.\2\u04b3\u04b2\3\2\2\2\u04b3\u04b4\3\2\2\2\u04b4\u04b5\3\2\2\2\u04b5"+
		"\u04b6\5\u00b6\\\2\u04b6\u04b8\3\2\2\2\u04b7\u04a8\3\2\2\2\u04b7\u04b0"+
		"\3\2\2\2\u04b8\u00b1\3\2\2\2\u04b9\u04bb\5\u014e\u00a8\2\u04ba\u04b9\3"+
		"\2\2\2\u04ba\u04bb\3\2\2\2\u04bb\u04bd\3\2\2\2\u04bc\u04be\5t;\2\u04bd"+
		"\u04bc\3\2\2\2\u04bd\u04be\3\2\2\2\u04be\u04bf\3\2\2\2\u04bf\u04c0\7L"+
		"\2\2\u04c0\u00b3\3\2\2\2\u04c1\u04c4\5\u01f8\u00fd\2\u04c2\u04c4\5\u01ac"+
		"\u00d7\2\u04c3\u04c1\3\2\2\2\u04c3\u04c2\3\2\2\2\u04c4\u00b5\3\2\2\2\u04c5"+
		"\u04c7\5\u00bc_\2\u04c6\u04c8\t\7\2\2\u04c7\u04c6\3\2\2\2\u04c7\u04c8"+
		"\3\2\2\2\u04c8\u04ca\3\2\2\2\u04c9\u04cb\5\u00b8]\2\u04ca\u04c9\3\2\2"+
		"\2\u04ca\u04cb\3\2\2\2\u04cb\u00b7\3\2\2\2\u04cc\u04ce\7S\2\2\u04cd\u04cf"+
		"\5\u014e\u00a8\2\u04ce\u04cd\3\2\2\2\u04ce\u04cf\3\2\2\2\u04cf\u04d0\3"+
		"\2\2\2\u04d0\u04d1\5\u01b4\u00db\2\u04d1\u00b9\3\2\2\2\u04d2\u04d3\5|"+
		"?\2\u04d3\u00bb\3\2\2\2\u04d4\u04d5\7!\2\2\u04d5\u04de\7\"\2\2\u04d6\u04d7"+
		"\7!\2\2\u04d7\u04d9\5\u00be`\2\u04d8\u04da\7T\2\2\u04d9\u04d8\3\2\2\2"+
		"\u04d9\u04da\3\2\2\2\u04da\u04db\3\2\2\2\u04db\u04dc\7\"\2\2\u04dc\u04de"+
		"\3\2\2\2\u04dd\u04d4\3\2\2\2\u04dd\u04d6\3\2\2\2\u04de\u00bd\3\2\2\2\u04df"+
		"\u04e4\5\u00c0a\2\u04e0\u04e1\7\24\2\2\u04e1\u04e3\5\u00c0a\2\u04e2\u04e0"+
		"\3\2\2\2\u04e3\u04e6\3\2\2\2\u04e4\u04e2\3\2\2\2\u04e4\u04e5\3\2\2\2\u04e5"+
		"\u00bf\3\2\2\2\u04e6\u04e4\3\2\2\2\u04e7\u04e9\5\u014e\u00a8\2\u04e8\u04e7"+
		"\3\2\2\2\u04e8\u04e9\3\2\2\2\u04e9\u04eb\3\2\2\2\u04ea\u04ec\5\u00c2b"+
		"\2\u04eb\u04ea\3\2\2\2\u04eb\u04ec\3\2\2\2\u04ec\u04ed\3\2\2\2\u04ed\u04ee"+
		"\5\u00c4c\2\u04ee\u04f0\5\u01be\u00e0\2\u04ef\u04f1\5\u00c6d\2\u04f0\u04ef"+
		"\3\2\2\2\u04f0\u04f1\3\2\2\2\u04f1\u04fd\3\2\2\2\u04f2\u04f4\5\u014e\u00a8"+
		"\2\u04f3\u04f2\3\2\2\2\u04f3\u04f4\3\2\2\2\u04f4\u04f6\3\2\2\2\u04f5\u04f7"+
		"\5\u00c2b\2\u04f6\u04f5\3\2\2\2\u04f6\u04f7\3\2\2\2\u04f7\u04f8\3\2\2"+
		"\2\u04f8\u04f9\5\u00c4c\2\u04f9\u04fa\5\u01be\u00e0\2\u04fa\u04fb\7T\2"+
		"\2\u04fb\u04fd\3\2\2\2\u04fc\u04e8\3\2\2\2\u04fc\u04f3\3\2\2\2\u04fd\u00c1"+
		"\3\2\2\2\u04fe\u0502\5\u01f8\u00fd\2\u04ff\u0502\5\u01fa\u00fe\2\u0500"+
		"\u0502\7U\2\2\u0501\u04fe\3\2\2\2\u0501\u04ff\3\2\2\2\u0501\u0500\3\2"+
		"\2\2\u0502\u00c3\3\2\2\2\u0503\u0506\5\u01f8\u00fd\2\u0504\u0506\7U\2"+
		"\2\u0505\u0503\3\2\2\2\u0505\u0504\3\2\2\2\u0506\u00c5\3\2\2\2\u0507\u0508"+
		"\7M\2\2\u0508\u0509\5\u0154\u00ab\2\u0509\u00c7\3\2\2\2\u050a\u050c\5"+
		"\u014e\u00a8\2\u050b\u050a\3\2\2\2\u050b\u050c\3\2\2\2\u050c\u050e\3\2"+
		"\2\2\u050d\u050f\5x=\2\u050e\u050d\3\2\2\2\u050e\u050f\3\2\2\2\u050f\u0510"+
		"\3\2\2\2\u0510\u0511\5\u00caf\2\u0511\u00c9\3\2\2\2\u0512\u0515\5\u00cc"+
		"g\2\u0513\u0515\5\u00dco\2\u0514\u0512\3\2\2\2\u0514\u0513\3\2\2\2\u0515"+
		"\u00cb\3\2\2\2\u0516\u0518\7V\2\2\u0517\u0516\3\2\2\2\u0517\u0518\3\2"+
		"\2\2\u0518\u0519\3\2\2\2\u0519\u051a\7J\2\2\u051a\u051c\5\u00d8m\2\u051b"+
		"\u051d\5Z.\2\u051c\u051b\3\2\2\2\u051c\u051d\3\2\2\2\u051d\u051f\3\2\2"+
		"\2\u051e\u0520\5\u01d6\u00ec\2\u051f\u051e\3\2\2\2\u051f\u0520\3\2\2\2"+
		"\u0520\u0521\3\2\2\2\u0521\u0523\7\22\2\2\u0522\u0524\5\u00ceh\2\u0523"+
		"\u0522\3\2\2\2\u0523\u0524\3\2\2\2\u0524\u0525\3\2\2\2\u0525\u0526\7\23"+
		"\2\2\u0526\u00cd\3\2\2\2\u0527\u0529\5\u00d0i\2\u0528\u0527\3\2\2\2\u0529"+
		"\u052a\3\2\2\2\u052a\u0528\3\2\2\2\u052a\u052b\3\2\2\2\u052b\u00cf\3\2"+
		"\2\2\u052c\u0532\5p9\2\u052d\u052f\5\u00d2j\2\u052e\u0530\7\3\2\2\u052f"+
		"\u052e\3\2\2\2\u052f\u0530\3\2\2\2\u0530\u0532\3\2\2\2\u0531\u052c\3\2"+
		"\2\2\u0531\u052d\3\2\2\2\u0532\u00d1\3\2\2\2\u0533\u0535\5\u014e\u00a8"+
		"\2\u0534\u0533\3\2\2\2\u0534\u0535\3\2\2\2\u0535\u0537\3\2\2\2\u0536\u0538"+
		"\7V\2\2\u0537\u0536\3\2\2\2\u0537\u0538\3\2\2\2\u0538\u0539\3\2\2\2\u0539"+
		"\u053a\7\n\2\2\u053a\u053b\5\u00d4k\2\u053b\u00d3\3\2\2\2\u053c\u0541"+
		"\5\u00d6l\2\u053d\u053e\7\24\2\2\u053e\u0540\5\u00d6l\2\u053f\u053d\3"+
		"\2\2\2\u0540\u0543\3\2\2\2\u0541\u053f\3\2\2\2\u0541\u0542\3\2\2\2\u0542"+
		"\u00d5\3\2\2\2\u0543\u0541\3\2\2\2\u0544\u0546\5\u00dan\2\u0545\u0547"+
		"\5\u01c4\u00e3\2\u0546\u0545\3\2\2\2\u0546\u0547\3\2\2\2\u0547\u00d7\3"+
		"\2\2\2\u0548\u0549\5\u01f8\u00fd\2\u0549\u00d9\3\2\2\2\u054a\u054b\5\u01f8"+
		"\u00fd\2\u054b\u00db\3\2\2\2\u054c\u054d\7J\2\2\u054d\u054f\5\u00d8m\2"+
		"\u054e\u0550\5Z.\2\u054f\u054e\3\2\2\2\u054f\u0550\3\2\2\2\u0550\u0552"+
		"\3\2\2\2\u0551\u0553\5\u01d6\u00ec\2\u0552\u0551\3\2\2\2\u0552\u0553\3"+
		"\2\2\2\u0553\u0554\3\2\2\2\u0554\u0556\7\22\2\2\u0555\u0557\5\u00dep\2"+
		"\u0556\u0555\3\2\2\2\u0556\u0557\3\2\2\2\u0557\u0558\3\2\2\2\u0558\u0559"+
		"\7\23\2\2\u0559\u00dd\3\2\2\2\u055a\u055c\5\u00e0q\2\u055b\u055a\3\2\2"+
		"\2\u055c\u055d\3\2\2\2\u055d\u055b\3\2\2\2\u055d\u055e\3\2\2\2\u055e\u00df"+
		"\3\2\2\2\u055f\u0562\5p9\2\u0560\u0562\5\u00e2r\2\u0561\u055f\3\2\2\2"+
		"\u0561\u0560\3\2\2\2\u0562\u00e1\3\2\2\2\u0563\u0565\5\u014e\u00a8\2\u0564"+
		"\u0563\3\2\2\2\u0564\u0565\3\2\2\2\u0565\u0566\3\2\2\2\u0566\u0567\7\n"+
		"\2\2\u0567\u0568\5\u00e4s\2\u0568\u00e3\3\2\2\2\u0569\u056e\5\u00e6t\2"+
		"\u056a\u056b\7\24\2\2\u056b\u056d\5\u00e6t\2\u056c\u056a\3\2\2\2\u056d"+
		"\u0570\3\2\2\2\u056e\u056c\3\2\2\2\u056e\u056f\3\2\2\2\u056f\u00e5\3\2"+
		"\2\2\u0570\u056e\3\2\2\2\u0571\u0573\5\u00dan\2\u0572\u0574\5\u00e8u\2"+
		"\u0573\u0572\3\2\2\2\u0573\u0574\3\2\2\2\u0574\u00e7\3\2\2\2\u0575\u0576"+
		"\7M\2\2\u0576\u0577\5\u0202\u0102\2\u0577\u00e9\3\2\2\2\u0578\u057a\5"+
		"\u014e\u00a8\2\u0579\u0578\3\2\2\2\u0579\u057a\3\2\2\2\u057a\u057c\3\2"+
		"\2\2\u057b\u057d\5x=\2\u057c\u057b\3\2\2\2\u057c\u057d\3\2\2\2\u057d\u057e"+
		"\3\2\2\2\u057e\u057f\7I\2\2\u057f\u0581\5\u00ecw\2\u0580\u0582\5Z.\2\u0581"+
		"\u0580\3\2\2\2\u0581\u0582\3\2\2\2\u0582\u0584\3\2\2\2\u0583\u0585\5\u01d6"+
		"\u00ec\2\u0584\u0583\3\2\2\2\u0584\u0585\3\2\2\2\u0585\u0586\3\2\2\2\u0586"+
		"\u0587\5\u00eex\2\u0587\u00eb\3\2\2\2\u0588\u0589\5\u01f8\u00fd\2\u0589"+
		"\u00ed\3\2\2\2\u058a\u058c\7\22\2\2\u058b\u058d\5r:\2\u058c\u058b\3\2"+
		"\2\2\u058c\u058d\3\2\2\2\u058d\u058e\3\2\2\2\u058e\u058f\7\23\2\2\u058f"+
		"\u00ef\3\2\2\2\u0590\u0592\5\u014e\u00a8\2\u0591\u0590\3\2\2\2\u0591\u0592"+
		"\3\2\2\2\u0592\u0594\3\2\2\2\u0593\u0595\5\u00f2z\2\u0594\u0593\3\2\2"+
		"\2\u0594\u0595\3\2\2\2\u0595\u0596\3\2\2\2\u0596\u0597\7/\2\2\u0597\u0599"+
		"\5\u00f4{\2\u0598\u059a\5Z.\2\u0599\u0598\3\2\2\2\u0599\u059a\3\2\2\2"+
		"\u059a\u059c\3\2\2\2\u059b\u059d\5\u01d6\u00ec\2\u059c\u059b\3\2\2\2\u059c"+
		"\u059d\3\2\2\2\u059d\u059e\3\2\2\2\u059e\u059f\5\u00f6|\2\u059f\u00f1"+
		"\3\2\2\2\u05a0\u05a2\5x=\2\u05a1\u05a3\7\62\2\2\u05a2\u05a1\3\2\2\2\u05a2"+
		"\u05a3\3\2\2\2\u05a3\u05a9\3\2\2\2\u05a4\u05a6\7\62\2\2\u05a5\u05a7\5"+
		"x=\2\u05a6\u05a5\3\2\2\2\u05a6\u05a7\3\2\2\2\u05a7\u05a9\3\2\2\2\u05a8"+
		"\u05a0\3\2\2\2\u05a8\u05a4\3\2\2\2\u05a9\u00f3\3\2\2\2\u05aa\u05ab\5\u01f8"+
		"\u00fd\2\u05ab\u00f5\3\2\2\2\u05ac\u05ae\7\22\2\2\u05ad\u05af\5r:\2\u05ae"+
		"\u05ad\3\2\2\2\u05ae\u05af\3\2\2\2\u05af\u05b0\3\2\2\2\u05b0\u05b1\7\23"+
		"\2\2\u05b1\u00f7\3\2\2\2\u05b2\u05b4\5\u014e\u00a8\2\u05b3\u05b2\3\2\2"+
		"\2\u05b3\u05b4\3\2\2\2\u05b4\u05b6\3\2\2\2\u05b5\u05b7\5x=\2\u05b6\u05b5"+
		"\3\2\2\2\u05b6\u05b7\3\2\2\2\u05b7\u05b8\3\2\2\2\u05b8\u05b9\7K\2\2\u05b9"+
		"\u05bb\5\u00fa~\2\u05ba\u05bc\5\u01d6\u00ec\2\u05bb\u05ba\3\2\2\2\u05bb"+
		"\u05bc\3\2\2\2\u05bc\u05bd\3\2\2\2\u05bd\u05be\5\u00fc\177\2\u05be\u00f9"+
		"\3\2\2\2\u05bf\u05c0\5\u01f8\u00fd\2\u05c0\u00fb\3\2\2\2\u05c1\u05c3\7"+
		"\22\2\2\u05c2\u05c4\5\u0100\u0081\2\u05c3\u05c2\3\2\2\2\u05c3\u05c4\3"+
		"\2\2\2\u05c4\u05c5\3\2\2\2\u05c5\u05c6\7\23\2\2\u05c6\u00fd\3\2\2\2\u05c7"+
		"\u05c9\5\u0102\u0082\2\u05c8\u05ca\7\3\2\2\u05c9\u05c8\3\2\2\2\u05c9\u05ca"+
		"\3\2\2\2\u05ca\u05dc\3\2\2\2\u05cb\u05cd\5\u0104\u0083\2\u05cc\u05ce\7"+
		"\3\2\2\u05cd\u05cc\3\2\2\2\u05cd\u05ce\3\2\2\2\u05ce\u05dc\3\2\2\2\u05cf"+
		"\u05d1\5\u0106\u0084\2\u05d0\u05d2\7\3\2\2\u05d1\u05d0\3\2\2\2\u05d1\u05d2"+
		"\3\2\2\2\u05d2\u05dc\3\2\2\2\u05d3\u05d5\5\u0108\u0085\2\u05d4\u05d6\7"+
		"\3\2\2\u05d5\u05d4\3\2\2\2\u05d5\u05d6\3\2\2\2\u05d6\u05dc\3\2\2\2\u05d7"+
		"\u05d9\5\u010a\u0086\2\u05d8\u05da\7\3\2\2\u05d9\u05d8\3\2\2\2\u05d9\u05da"+
		"\3\2\2\2\u05da\u05dc\3\2\2\2\u05db\u05c7\3\2\2\2\u05db\u05cb\3\2\2\2\u05db"+
		"\u05cf\3\2\2\2\u05db\u05d3\3\2\2\2\u05db\u05d7\3\2\2\2\u05dc\u00ff\3\2"+
		"\2\2\u05dd\u05df\5\u00fe\u0080\2\u05de\u05dd\3\2\2\2\u05df\u05e0\3\2\2"+
		"\2\u05e0\u05de\3\2\2\2\u05e0\u05e1\3\2\2\2\u05e1\u0101\3\2\2\2\u05e2\u05e3"+
		"\5\u0090I\2\u05e3\u05e4\5\u0092J\2\u05e4\u05e5\5\u01be\u00e0\2\u05e5\u05e6"+
		"\5\u009cO\2\u05e6\u0103\3\2\2\2\u05e7\u05e8\5\u00b2Z\2\u05e8\u05ea\5\u00b4"+
		"[\2\u05e9\u05eb\5Z.\2\u05ea\u05e9\3\2\2\2\u05ea\u05eb\3\2\2\2\u05eb\u05ec"+
		"\3\2\2\2\u05ec\u05ed\5\u00b6\\\2\u05ed\u0105\3\2\2\2\u05ee\u05f0\5\u010e"+
		"\u0088\2\u05ef\u05f1\5Z.\2\u05f0\u05ef\3\2\2\2\u05f0\u05f1\3\2\2\2\u05f1"+
		"\u05f2\3\2\2\2\u05f2\u05f4\5\u00bc_\2\u05f3\u05f5\t\7\2\2\u05f4\u05f3"+
		"\3\2\2\2\u05f4\u05f5\3\2\2\2\u05f5\u0107\3\2\2\2\u05f6\u05f7\5\u011a\u008e"+
		"\2\u05f7\u05f8\5\u011c\u008f\2\u05f8\u05f9\5\u009cO\2\u05f9\u0109\3\2"+
		"\2\2\u05fa\u05fc\5\u014e\u00a8\2\u05fb\u05fa\3\2\2\2\u05fb\u05fc\3\2\2"+
		"\2\u05fc\u05fe\3\2\2\2\u05fd\u05ff\5x=\2\u05fe\u05fd\3\2\2\2\u05fe\u05ff"+
		"\3\2\2\2\u05ff\u0600\3\2\2\2\u0600\u0601\7W\2\2\u0601\u0603\5\u00acW\2"+
		"\u0602\u0604\5\u01d6\u00ec\2\u0603\u0602\3\2\2\2\u0603\u0604\3\2\2\2\u0604"+
		"\u0606\3\2\2\2\u0605\u0607\5\u00aeX\2\u0606\u0605\3\2\2\2\u0606\u0607"+
		"\3\2\2\2\u0607\u010b\3\2\2\2\u0608\u060a\5\u010e\u0088\2\u0609\u060b\5"+
		"Z.\2\u060a\u0609\3\2\2\2\u060a\u060b\3\2\2\2\u060b\u060c\3\2\2\2\u060c"+
		"\u060e\5\u00bc_\2\u060d\u060f\t\7\2\2\u060e\u060d\3\2\2\2\u060e\u060f"+
		"\3\2\2\2\u060f\u0610\3\2\2\2\u0610\u0611\5\u0110\u0089\2\u0611\u010d\3"+
		"\2\2\2\u0612\u0614\5\u014e\u00a8\2\u0613\u0612\3\2\2\2\u0613\u0614\3\2"+
		"\2\2\u0614\u0616\3\2\2\2\u0615\u0617\5t;\2\u0616\u0615\3\2\2\2\u0616\u0617"+
		"\3\2\2\2\u0617\u0618\3\2\2\2\u0618\u061a\7X\2\2\u0619\u061b\t\b\2\2\u061a"+
		"\u0619\3\2\2\2\u061a\u061b\3\2\2\2\u061b\u010f\3\2\2\2\u061c\u061d\5|"+
		"?\2\u061d\u0111\3\2\2\2\u061e\u0620\5\u014e\u00a8\2\u061f\u061e\3\2\2"+
		"\2\u061f\u0620\3\2\2\2\u0620\u0621\3\2\2\2\u0621\u0622\7[\2\2\u0622\u0623"+
		"\5|?\2\u0623\u0113\3\2\2\2\u0624\u0626\5\u014e\u00a8\2\u0625\u0624\3\2"+
		"\2\2\u0625\u0626\3\2\2\2\u0626\u0628\3\2\2\2\u0627\u0629\5x=\2\u0628\u0627"+
		"\3\2\2\2\u0628\u0629\3\2\2\2\u0629\u062a\3\2\2\2\u062a\u062b\7\\\2\2\u062b"+
		"\u062e\5\u01c0\u00e1\2\u062c\u062f\5`\61\2\u062d\u062f\5\u01d6\u00ec\2"+
		"\u062e\u062c\3\2\2\2\u062e\u062d\3\2\2\2\u062e\u062f\3\2\2\2\u062f\u0630"+
		"\3\2\2\2\u0630\u0631\5\u0116\u008c\2\u0631\u0115\3\2\2\2\u0632\u0634\7"+
		"\22\2\2\u0633\u0635\5r:\2\u0634\u0633\3\2\2\2\u0634\u0635\3\2\2\2\u0635"+
		"\u0636\3\2\2\2\u0636\u0637\7\23\2\2\u0637\u0117\3\2\2\2\u0638\u0639\5"+
		"\u011a\u008e\2\u0639\u063a\5\u011c\u008f\2\u063a\u063b\5\u0094K\2\u063b"+
		"\u0645\3\2\2\2\u063c\u063d\5\u011a\u008e\2\u063d\u063e\5\u011c\u008f\2"+
		"\u063e\u063f\5\u009cO\2\u063f\u0645\3\2\2\2\u0640\u0641\5\u011a\u008e"+
		"\2\u0641\u0642\5\u011c\u008f\2\u0642\u0643\5|?\2\u0643\u0645\3\2\2\2\u0644"+
		"\u0638\3\2\2\2\u0644\u063c\3\2\2\2\u0644\u0640\3\2\2\2\u0645\u0119\3\2"+
		"\2\2\u0646\u0648\5\u014e\u00a8\2\u0647\u0646\3\2\2\2\u0647\u0648\3\2\2"+
		"\2\u0648\u064a\3\2\2\2\u0649\u064b\5t;\2\u064a\u0649\3\2\2\2\u064a\u064b"+
		"\3\2\2\2\u064b\u064c\3\2\2\2\u064c\u064d\7]\2\2\u064d\u064e\5\u00bc_\2"+
		"\u064e\u011b\3\2\2\2\u064f\u0651\7S\2\2\u0650\u0652\5\u014e\u00a8\2\u0651"+
		"\u0650\3\2\2\2\u0651\u0652\3\2\2\2\u0652\u0653\3\2\2\2\u0653\u0654\5\u01b4"+
		"\u00db\2\u0654\u011d\3\2\2\2\u0655\u0659\5\u0120\u0091\2\u0656\u0659\5"+
		"\u0122\u0092\2\u0657\u0659\5\u0124\u0093\2\u0658\u0655\3\2\2\2\u0658\u0656"+
		"\3\2\2\2\u0658\u0657\3\2\2\2\u0659\u011f\3\2\2\2\u065a\u065b\7:\2\2\u065b"+
		"\u065c\7^\2\2\u065c\u065d\5\u01ac\u00d7\2\u065d\u065e\7\22\2\2\u065e\u065f"+
		"\7\23\2\2\u065f\u0121\3\2\2\2\u0660\u0661\79\2\2\u0661\u0662\7^\2\2\u0662"+
		"\u0663\5\u01ac\u00d7\2\u0663\u0664\7\22\2\2\u0664\u0665\7\23\2\2\u0665"+
		"\u0123\3\2\2\2\u0666\u0667\7\63\2\2\u0667\u0668\7^\2\2\u0668\u0669\5\u01ac"+
		"\u00d7\2\u0669\u066b\7\22\2\2\u066a\u066c\5\u0126\u0094\2\u066b\u066a"+
		"\3\2\2\2\u066b\u066c\3\2\2\2\u066c\u066d\3\2\2\2\u066d\u066e\7\23\2\2"+
		"\u066e\u0125\3\2\2\2\u066f\u0671\5\u0128\u0095\2\u0670\u0672\5\u012c\u0097"+
		"\2\u0671\u0670\3\2\2\2\u0671\u0672\3\2\2\2\u0672\u0678\3\2\2\2\u0673\u0675"+
		"\5\u012c\u0097\2\u0674\u0676\5\u0128\u0095\2\u0675\u0674\3\2\2\2\u0675"+
		"\u0676\3\2\2\2\u0676\u0678\3\2\2\2\u0677\u066f\3\2\2\2\u0677\u0673\3\2"+
		"\2\2\u0678\u0127\3\2\2\2\u0679\u067a\7_\2\2\u067a\u067b\5\u012a\u0096"+
		"\2\u067b\u0129\3\2\2\2\u067c\u067d\5\u0206\u0104\2\u067d\u012b\3\2\2\2"+
		"\u067e\u067f\7`\2\2\u067f\u0680\5\u012e\u0098\2\u0680\u012d\3\2\2\2\u0681"+
		"\u0682\t\t\2\2\u0682\u012f\3\2\2\2\u0683\u0684\b\u0099\1\2\u0684\u0686"+
		"\5\u0132\u009a\2\u0685\u0687\5\u01be\u00e0\2\u0686\u0685\3\2\2\2\u0686"+
		"\u0687\3\2\2\2\u0687\u0696\3\2\2\2\u0688\u068a\5\u0134\u009b\2\u0689\u068b"+
		"\5\u01be\u00e0\2\u068a\u0689\3\2\2\2\u068a\u068b\3\2\2\2\u068b\u0696\3"+
		"\2\2\2\u068c\u0696\5\u0136\u009c\2\u068d\u068f\5\u0138\u009d\2\u068e\u0690"+
		"\5\u01be\u00e0\2\u068f\u068e\3\2\2\2\u068f\u0690\3\2\2\2\u0690\u0696\3"+
		"\2\2\2\u0691\u0696\5\u013e\u00a0\2\u0692\u0693\7d\2\2\u0693\u0696\5\u01b4"+
		"\u00db\2\u0694\u0696\5\u0146\u00a4\2\u0695\u0683\3\2\2\2\u0695\u0688\3"+
		"\2\2\2\u0695\u068c\3\2\2\2\u0695\u068d\3\2\2\2\u0695\u0691\3\2\2\2\u0695"+
		"\u0692\3\2\2\2\u0695\u0694\3\2\2\2\u0696\u069c\3\2\2\2\u0697\u0698\f\4"+
		"\2\2\u0698\u0699\7e\2\2\u0699\u069b\5\u01b4\u00db\2\u069a\u0697\3\2\2"+
		"\2\u069b\u069e\3\2\2\2\u069c\u069a\3\2\2\2\u069c\u069d\3\2\2\2\u069d\u0131"+
		"\3\2\2\2\u069e\u069c\3\2\2\2\u069f\u06a0\7U\2\2\u06a0\u0133\3\2\2\2\u06a1"+
		"\u06a2\5\u01f8\u00fd\2\u06a2\u0135\3\2\2\2\u06a3\u06a4\7\36\2\2\u06a4"+
		"\u06a8\5\u0130\u0099\2\u06a5\u06a6\7\35\2\2\u06a6\u06a8\5\u0130\u0099"+
		"\2\u06a7\u06a3\3\2\2\2\u06a7\u06a5\3\2\2\2\u06a8\u0137\3\2\2\2\u06a9\u06ab"+
		"\7!\2\2\u06aa\u06ac\5\u013a\u009e\2\u06ab\u06aa\3\2\2\2\u06ab\u06ac\3"+
		"\2\2\2\u06ac\u06ad\3\2\2\2\u06ad\u06ae\7\"\2\2\u06ae\u0139\3\2\2\2\u06af"+
		"\u06b4\5\u013c\u009f\2\u06b0\u06b1\7\24\2\2\u06b1\u06b3\5\u013c\u009f"+
		"\2\u06b2\u06b0\3\2\2\2\u06b3\u06b6\3\2\2\2\u06b4\u06b2\3\2\2\2\u06b4\u06b5"+
		"\3\2\2\2\u06b5\u013b\3\2\2\2\u06b6\u06b4\3\2\2\2\u06b7\u06bd\5\u0130\u0099"+
		"\2\u06b8\u06b9\5\u01f8\u00fd\2\u06b9\u06ba\7\4\2\2\u06ba\u06bb\5\u0130"+
		"\u0099\2\u06bb\u06bd\3\2\2\2\u06bc\u06b7\3\2\2\2\u06bc\u06b8\3\2\2\2\u06bd"+
		"\u013d\3\2\2\2\u06be\u06c0\5\u01c0\u00e1\2\u06bf\u06be\3\2\2\2\u06bf\u06c0"+
		"\3\2\2\2\u06c0\u06c2\3\2\2\2\u06c1\u06c3\7\5\2\2\u06c2\u06c1\3\2\2\2\u06c2"+
		"\u06c3\3\2\2\2\u06c3\u06c4\3\2\2\2\u06c4\u06c6\5\u00dan\2\u06c5\u06c7"+
		"\5\u0138\u009d\2\u06c6\u06c5\3\2\2\2\u06c6\u06c7\3\2\2\2\u06c7\u013f\3"+
		"\2\2\2\u06c8\u06cb\5\u0142\u00a2\2\u06c9\u06cb\5\u0144\u00a3\2\u06ca\u06c8"+
		"\3\2\2\2\u06ca\u06c9\3\2\2\2\u06cb\u0141\3\2\2\2\u06cc\u06cd\7d\2\2\u06cd"+
		"\u06ce\5\u01b4\u00db\2\u06ce\u0143\3\2\2\2\u06cf\u06d0\5\u0130\u0099\2"+
		"\u06d0\u06d1\7e\2\2\u06d1\u06d2\5\u01b4\u00db\2\u06d2\u0145\3\2\2\2\u06d3"+
		"\u06d4\5\u0154\u00ab\2\u06d4\u0147\3\2\2\2\u06d5\u06d6\7f\2\2\u06d6\u06d8"+
		"\5\u014a\u00a6\2\u06d7\u06d9\5\u014c\u00a7\2\u06d8\u06d7\3\2\2\2\u06d8"+
		"\u06d9\3\2\2\2\u06d9\u0149\3\2\2\2\u06da\u06db\5\u01f8\u00fd\2\u06db\u014b"+
		"\3\2\2\2\u06dc\u06de\7!\2\2\u06dd\u06df\5\u0150\u00a9\2\u06de\u06dd\3"+
		"\2\2\2\u06de\u06df\3\2\2\2\u06df\u06e0\3\2\2\2\u06e0\u06e1\7\"\2\2\u06e1"+
		"\u014d\3\2\2\2\u06e2\u06e4\5\u0148\u00a5\2\u06e3\u06e2\3\2\2\2\u06e4\u06e5"+
		"\3\2\2\2\u06e5\u06e3\3\2\2\2\u06e5\u06e6\3\2\2\2\u06e6\u014f\3\2\2\2\u06e7"+
		"\u06e9\5\u0152\u00aa\2\u06e8\u06e7\3\2\2\2\u06e9\u06ea\3\2\2\2\u06ea\u06e8"+
		"\3\2\2\2\u06ea\u06eb\3\2\2\2\u06eb\u0151\3\2\2\2\u06ec\u06ee\7!\2\2\u06ed"+
		"\u06ef\5\u0150\u00a9\2\u06ee\u06ed\3\2\2\2\u06ee\u06ef\3\2\2\2\u06ef\u06f0"+
		"\3\2\2\2\u06f0\u070e\7\"\2\2\u06f1\u06f3\7g\2\2\u06f2\u06f4\5\u0150\u00a9"+
		"\2\u06f3\u06f2\3\2\2\2\u06f3\u06f4\3\2\2\2\u06f4\u06f5\3\2\2\2\u06f5\u070e"+
		"\7h\2\2\u06f6\u06f8\7\22\2\2\u06f7\u06f9\5\u0150\u00a9\2\u06f8\u06f7\3"+
		"\2\2\2\u06f8\u06f9\3\2\2\2\u06f9\u06fa\3\2\2\2\u06fa\u070e\7\23\2\2\u06fb"+
		"\u070e\5\u01f8\u00fd\2\u06fc\u070e\5\u0154\u00ab\2\u06fd\u070e\5\u01fc"+
		"\u00ff\2\u06fe\u070e\5\u0202\u0102\2\u06ff\u070e\5\u01ac\u00d7\2\u0700"+
		"\u070e\7\u00a2\2\2\u0701\u070e\5T+\2\u0702\u070e\7\4\2\2\u0703\u070e\7"+
		"\3\2\2\u0704\u070e\7\24\2\2\u0705\u070e\7Z\2\2\u0706\u070e\7,\2\2\u0707"+
		"\u070e\7-\2\2\u0708\u070e\7i\2\2\u0709\u070e\7j\2\2\u070a\u070e\7k\2\2"+
		"\u070b\u070e\7T\2\2\u070c\u070e\7l\2\2\u070d\u06ec\3\2\2\2\u070d\u06f1"+
		"\3\2\2\2\u070d\u06f6\3\2\2\2\u070d\u06fb\3\2\2\2\u070d\u06fc\3\2\2\2\u070d"+
		"\u06fd\3\2\2\2\u070d\u06fe\3\2\2\2\u070d\u06ff\3\2\2\2\u070d\u0700\3\2"+
		"\2\2\u070d\u0701\3\2\2\2\u070d\u0702\3\2\2\2\u070d\u0703\3\2\2\2\u070d"+
		"\u0704\3\2\2\2\u070d\u0705\3\2\2\2\u070d\u0706\3\2\2\2\u070d\u0707\3\2"+
		"\2\2\u070d\u0708\3\2\2\2\u070d\u0709\3\2\2\2\u070d\u070a\3\2\2\2\u070d"+
		"\u070b\3\2\2\2\u070d\u070c\3\2\2\2\u070e\u0153\3\2\2\2\u070f\u0711\5\u015a"+
		"\u00ae\2\u0710\u070f\3\2\2\2\u0710\u0711\3\2\2\2\u0711\u0712\3\2\2\2\u0712"+
		"\u0716\5\u0156\u00ac\2\u0713\u0715\5\u015c\u00af\2\u0714\u0713\3\2\2\2"+
		"\u0715\u0718\3\2\2\2\u0716\u0714\3\2\2\2\u0716\u0717\3\2\2\2\u0717\u0155"+
		"\3\2\2\2\u0718\u0716\3\2\2\2\u0719\u071b\5\u01b0\u00d9\2\u071a\u0719\3"+
		"\2\2\2\u071a\u071b\3\2\2\2\u071b\u071c\3\2\2\2\u071c\u071e\5\u01a2\u00d2"+
		"\2\u071d\u071f\7\3\2\2\u071e\u071d\3\2\2\2\u071e\u071f\3\2\2\2\u071f\u0722"+
		"\3\2\2\2\u0720\u0722\5\u0158\u00ad\2\u0721\u071a\3\2\2\2\u0721\u0720\3"+
		"\2\2\2\u0722\u0157\3\2\2\2\u0723\u0724\7m\2\2\u0724\u0725\5\u01f8\u00fd"+
		"\2\u0725\u0159\3\2\2\2\u0726\u0728\7n\2\2\u0727\u0729\t\b\2\2\u0728\u0727"+
		"\3\2\2\2\u0728\u0729\3\2\2\2\u0729\u015b\3\2\2\2\u072a\u072b\5\u01ae\u00d8"+
		"\2\u072b\u072c\5\u0156\u00ac\2\u072c\u073b\3\2\2\2\u072d\u072f\5\u015e"+
		"\u00b0\2\u072e\u0730\5\u015a\u00ae\2\u072f\u072e\3\2\2\2\u072f\u0730\3"+
		"\2\2\2\u0730\u0731\3\2\2\2\u0731\u0732\5\u0156\u00ac\2\u0732\u073b\3\2"+
		"\2\2\u0733\u0735\5\u0160\u00b1\2\u0734\u0736\5\u015a\u00ae\2\u0735\u0734"+
		"\3\2\2\2\u0735\u0736\3\2\2\2\u0736\u0737\3\2\2\2\u0737\u0738\5\u0156\u00ac"+
		"\2\u0738\u073b\3\2\2\2\u0739\u073b\5\u0162\u00b2\2\u073a\u072a\3\2\2\2"+
		"\u073a\u072d\3\2\2\2\u073a\u0733\3\2\2\2\u073a\u0739\3\2\2\2\u073b\u015d"+
		"\3\2\2\2\u073c\u073d\7M\2\2\u073d\u015f\3\2\2\2\u073e\u0740\7Y\2\2\u073f"+
		"\u0741\5\u015a\u00ae\2\u0740\u073f\3\2\2\2\u0740\u0741\3\2\2\2\u0741\u0742"+
		"\3\2\2\2\u0742\u0743\5\u0154\u00ab\2\u0743\u0744\7\4\2\2\u0744\u0161\3"+
		"\2\2\2\u0745\u0746\7d\2\2\u0746\u0750\5\u01b4\u00db\2\u0747\u0748\7e\2"+
		"\2\u0748\u0749\7Y\2\2\u0749\u0750\5\u01b4\u00db\2\u074a\u074b\7e\2\2\u074b"+
		"\u0750\5\u01b4\u00db\2\u074c\u074d\7e\2\2\u074d\u074e\7Z\2\2\u074e\u0750"+
		"\5\u01b4\u00db\2\u074f\u0745\3\2\2\2\u074f\u0747\3\2\2\2\u074f\u074a\3"+
		"\2\2\2\u074f\u074c\3\2\2\2\u0750\u0163\3\2\2\2\u0751\u0756\5\u01f8\u00fd"+
		"\2\u0752\u0756\5\u01ac\u00d7\2\u0753\u0756\5\u01fa\u00fe\2\u0754\u0756"+
		"\5\u01fc\u00ff\2\u0755\u0751\3\2\2\2\u0755\u0752\3\2\2\2\u0755\u0753\3"+
		"\2\2\2\u0755\u0754\3\2\2\2\u0756\u0758\3\2\2\2\u0757\u0759\5j\66\2\u0758"+
		"\u0757\3\2\2\2\u0758\u0759\3\2\2\2\u0759\u0764\3\2\2\2\u075a\u0764\5\u0166"+
		"\u00b4\2\u075b\u0764\5\u0174\u00bb\2\u075c\u0764\5\u0176\u00bc\2\u075d"+
		"\u0764\5\u017e\u00c0\2\u075e\u0764\5\u0194\u00cb\2\u075f\u0764\5\u0192"+
		"\u00ca\2\u0760\u0764\5\u019c\u00cf\2\u0761\u0764\5\u019e\u00d0\2\u0762"+
		"\u0764\5\u01a0\u00d1\2\u0763\u0755\3\2\2\2\u0763\u075a\3\2\2\2\u0763\u075b"+
		"\3\2\2\2\u0763\u075c\3\2\2\2\u0763\u075d\3\2\2\2\u0763\u075e\3\2\2\2\u0763"+
		"\u075f\3\2\2\2\u0763\u0760\3\2\2\2\u0763\u0761\3\2\2\2\u0763\u0762\3\2"+
		"\2\2\u0764\u0165\3\2\2\2\u0765\u076d\5\u0202\u0102\2\u0766\u076d\5\u0168"+
		"\u00b5\2\u0767\u076d\5\u016e\u00b8\2\u0768\u076d\7o\2\2\u0769\u076d\7"+
		"p\2\2\u076a\u076d\7q\2\2\u076b\u076d\7r\2\2\u076c\u0765\3\2\2\2\u076c"+
		"\u0766\3\2\2\2\u076c\u0767\3\2\2\2\u076c\u0768\3\2\2\2\u076c\u0769\3\2"+
		"\2\2\u076c\u076a\3\2\2\2\u076c\u076b\3\2\2\2\u076d\u0167\3\2\2\2\u076e"+
		"\u0770\7g\2\2\u076f\u0771\5\u016a\u00b6\2\u0770\u076f\3\2\2\2\u0770\u0771"+
		"\3\2\2\2\u0771\u0772\3\2\2\2\u0772\u0773\7h\2\2\u0773\u0169\3\2\2\2\u0774"+
		"\u0779\5\u016c\u00b7\2\u0775\u0776\7\24\2\2\u0776\u0778\5\u016c\u00b7"+
		"\2\u0777\u0775\3\2\2\2\u0778\u077b\3\2\2\2\u0779\u0777\3\2\2\2\u0779\u077a"+
		"\3\2\2\2\u077a\u077d\3\2\2\2\u077b\u0779\3\2\2\2\u077c\u077e\7\24\2\2"+
		"\u077d\u077c\3\2\2\2\u077d\u077e\3\2\2\2\u077e\u016b\3\2\2\2\u077f\u0780"+
		"\5\u0154\u00ab\2\u0780\u016d\3\2\2\2\u0781\u0782\7g\2\2\u0782\u0783\5"+
		"\u0170\u00b9\2\u0783\u0784\7h\2\2\u0784\u0789\3\2\2\2\u0785\u0786\7g\2"+
		"\2\u0786\u0787\7\4\2\2\u0787\u0789\7h\2\2\u0788\u0781\3\2\2\2\u0788\u0785"+
		"\3\2\2\2\u0789\u016f\3\2\2\2\u078a\u078f\5\u0172\u00ba\2\u078b\u078c\7"+
		"\24\2\2\u078c\u078e\5\u0172\u00ba\2\u078d\u078b\3\2\2\2\u078e\u0791\3"+
		"\2\2\2\u078f\u078d\3\2\2\2\u078f\u0790\3\2\2\2\u0790\u0793\3\2\2\2\u0791"+
		"\u078f\3\2\2\2\u0792\u0794\7\24\2\2\u0793\u0792\3\2\2\2\u0793\u0794\3"+
		"\2\2\2\u0794\u0171\3\2\2\2\u0795\u0796\5\u0154\u00ab\2\u0796\u0797\7\4"+
		"\2\2\u0797\u0798\5\u0154\u00ab\2\u0798\u0173\3\2\2\2\u0799\u07a6\7s\2"+
		"\2\u079a\u079b\7s\2\2\u079b\u079c\7\5\2\2\u079c\u07a6\5\u01f8\u00fd\2"+
		"\u079d\u079e\7s\2\2\u079e\u079f\7g\2\2\u079f\u07a0\5\u0196\u00cc\2\u07a0"+
		"\u07a1\7h\2\2\u07a1\u07a6\3\2\2\2\u07a2\u07a3\7s\2\2\u07a3\u07a4\7\5\2"+
		"\2\u07a4\u07a6\7X\2\2\u07a5\u0799\3\2\2\2\u07a5\u079a\3\2\2\2\u07a5\u079d"+
		"\3\2\2\2\u07a5\u07a2\3\2\2\2\u07a6\u0175\3\2\2\2\u07a7\u07ab\5\u0178\u00bd"+
		"\2\u07a8\u07ab\5\u017a\u00be\2\u07a9\u07ab\5\u017c\u00bf\2\u07aa\u07a7"+
		"\3\2\2\2\u07aa\u07a8\3\2\2\2\u07aa\u07a9\3\2\2\2\u07ab\u0177\3\2\2\2\u07ac"+
		"\u07ad\7t\2\2\u07ad\u07ae\7\5\2\2\u07ae\u07af\5\u01f8\u00fd\2\u07af\u0179"+
		"\3\2\2\2\u07b0\u07b1\7t\2\2\u07b1\u07b2\7g\2\2\u07b2\u07b3\5\u0196\u00cc"+
		"\2\u07b3\u07b4\7h\2\2\u07b4\u017b\3\2\2\2\u07b5\u07b6\7t\2\2\u07b6\u07b7"+
		"\7\5\2\2\u07b7\u07b8\7X\2\2\u07b8\u017d\3\2\2\2\u07b9\u07bb\7\22\2\2\u07ba"+
		"\u07bc\5\u0180\u00c1\2\u07bb\u07ba\3\2\2\2\u07bb\u07bc\3\2\2\2\u07bc\u07be"+
		"\3\2\2\2\u07bd\u07bf\5\n\6\2\u07be\u07bd\3\2\2\2\u07be\u07bf\3\2\2\2\u07bf"+
		"\u07c0\3\2\2\2\u07c0\u07c1\7\23\2\2\u07c1\u017f\3\2\2\2\u07c2\u07c4\5"+
		"\u018a\u00c6\2\u07c3\u07c2\3\2\2\2\u07c3\u07c4\3\2\2\2\u07c4\u07c5\3\2"+
		"\2\2\u07c5\u07c7\5\u0182\u00c2\2\u07c6\u07c8\7Q\2\2\u07c7\u07c6\3\2\2"+
		"\2\u07c7\u07c8\3\2\2\2\u07c8\u07ca\3\2\2\2\u07c9\u07cb\5\u00b8]\2\u07ca"+
		"\u07c9\3\2\2\2\u07ca\u07cb\3\2\2\2\u07cb\u07cc\3\2\2\2\u07cc\u07cd\7\13"+
		"\2\2\u07cd\u07d2\3\2\2\2\u07ce\u07cf\5\u018a\u00c6\2\u07cf\u07d0\7\13"+
		"\2\2\u07d0\u07d2\3\2\2\2\u07d1\u07c3\3\2\2\2\u07d1\u07ce\3\2\2\2\u07d2"+
		"\u0181\3\2\2\2\u07d3\u07d4\7!\2\2\u07d4\u07db\7\"\2\2\u07d5\u07d6\7!\2"+
		"\2\u07d6\u07d7\5\u0184\u00c3\2\u07d7\u07d8\7\"\2\2\u07d8\u07db\3\2\2\2"+
		"\u07d9\u07db\5\u01fe\u0100\2\u07da\u07d3\3\2\2\2\u07da\u07d5\3\2\2\2\u07da"+
		"\u07d9\3\2\2\2\u07db\u0183\3\2\2\2\u07dc\u07e1\5\u0186\u00c4\2\u07dd\u07de"+
		"\7\24\2\2\u07de\u07e0\5\u0184\u00c3\2\u07df\u07dd\3\2\2\2\u07e0\u07e3"+
		"\3\2\2\2\u07e1\u07df\3\2\2\2\u07e1\u07e2\3\2\2\2\u07e2\u0185\3\2\2\2\u07e3"+
		"\u07e1\3\2\2\2\u07e4\u07e6\5\u0188\u00c5\2\u07e5\u07e7\5\u01be\u00e0\2"+
		"\u07e6\u07e5\3\2\2\2\u07e6\u07e7\3\2\2\2\u07e7\u07ed\3\2\2\2\u07e8\u07e9"+
		"\5\u0188\u00c5\2\u07e9\u07ea\5\u01be\u00e0\2\u07ea\u07eb\7T\2\2\u07eb"+
		"\u07ed\3\2\2\2\u07ec\u07e4\3\2\2\2\u07ec\u07e8\3\2\2\2\u07ed\u0187\3\2"+
		"\2\2\u07ee\u07f1\5\u01f8\u00fd\2\u07ef\u07f1\7U\2\2\u07f0\u07ee\3\2\2"+
		"\2\u07f0\u07ef\3\2\2\2\u07f1\u0189\3\2\2\2\u07f2\u07f3\7g\2\2\u07f3\u07f4"+
		"\5\u018c\u00c7\2\u07f4\u07f5\7h\2\2\u07f5\u018b\3\2\2\2\u07f6\u07fb\5"+
		"\u018e\u00c8\2\u07f7\u07f8\7\24\2\2\u07f8\u07fa\5\u018e\u00c8\2\u07f9"+
		"\u07f7\3\2\2\2\u07fa\u07fd\3\2\2\2\u07fb\u07f9\3\2\2\2\u07fb\u07fc\3\2"+
		"\2\2\u07fc\u018d\3\2\2\2\u07fd\u07fb\3\2\2\2\u07fe\u0800\5\u0190\u00c9"+
		"\2\u07ff\u07fe\3\2\2\2\u07ff\u0800\3\2\2\2\u0800\u0801\3\2\2\2\u0801\u0802"+
		"\5\u0154\u00ab\2\u0802\u018f\3\2\2\2\u0803\u0804\t\n\2\2\u0804\u0191\3"+
		"\2\2\2\u0805\u0806\7\5\2\2\u0806\u0807\5\u01f8\u00fd\2\u0807\u0193\3\2"+
		"\2\2\u0808\u080a\7!\2\2\u0809\u080b\5\u0196\u00cc\2\u080a\u0809\3\2\2"+
		"\2\u080a\u080b\3\2\2\2\u080b\u080c\3\2\2\2\u080c\u080d\7\"\2\2\u080d\u0195"+
		"\3\2\2\2\u080e\u0813\5\u0198\u00cd\2\u080f\u0810\7\24\2\2\u0810\u0812"+
		"\5\u0198\u00cd\2\u0811\u080f\3\2\2\2\u0812\u0815\3\2\2\2\u0813\u0811\3"+
		"\2\2\2\u0813\u0814\3\2\2\2\u0814\u0197\3\2\2\2\u0815\u0813\3\2\2\2\u0816"+
		"\u081d\5\u0154\u00ab\2\u0817\u0818\5\u019a\u00ce\2\u0818\u081a\7\4\2\2"+
		"\u0819\u081b\5\u0154\u00ab\2\u081a\u0819\3\2\2\2\u081a\u081b\3\2\2\2\u081b"+
		"\u081d\3\2\2\2\u081c\u0816\3\2\2\2\u081c\u0817\3\2\2\2\u081d\u0199\3\2"+
		"\2\2\u081e\u0821\5\u01f8\u00fd\2\u081f\u0821\5\u01fa\u00fe\2\u0820\u081e"+
		"\3\2\2\2\u0820\u081f\3\2\2\2\u0821\u019b\3\2\2\2\u0822\u0823\7U\2\2\u0823"+
		"\u019d\3\2\2\2\u0824\u0825\7w\2\2\u0825\u0826\7!\2\2\u0826\u0827\5\u0154"+
		"\u00ab\2\u0827\u0828\7\"\2\2\u0828\u0830\3\2\2\2\u0829\u082a\7w\2\2\u082a"+
		"\u082b\7!\2\2\u082b\u082c\t\13\2\2\u082c\u082d\5\u0154\u00ab\2\u082d\u082e"+
		"\7\"\2\2\u082e\u0830\3\2\2\2\u082f\u0824\3\2\2\2\u082f\u0829\3\2\2\2\u0830"+
		"\u019f\3\2\2\2\u0831\u0832\7z\2\2\u0832\u0833\7!\2\2\u0833\u0834\5\u0154"+
		"\u00ab\2\u0834\u0835\7\"\2\2\u0835\u01a1\3\2\2\2\u0836\u0837\b\u00d2\1"+
		"\2\u0837\u0838\5\u0164\u00b3\2\u0838\u086d\3\2\2\2\u0839\u083a\f\17\2"+
		"\2\u083a\u086c\5\u01b2\u00da\2\u083b\u083d\f\16\2\2\u083c\u083e\5\u0194"+
		"\u00cb\2\u083d\u083c\3\2\2\2\u083d\u083e\3\2\2\2\u083e\u083f\3\2\2\2\u083f"+
		"\u086c\5\u017e\u00c0\2\u0840\u0841\f\r\2\2\u0841\u086c\5\u0194\u00cb\2"+
		"\u0842\u0843\f\f\2\2\u0843\u0844\7\5\2\2\u0844\u086c\7X\2\2\u0845\u0846"+
		"\f\13\2\2\u0846\u0847\7\5\2\2\u0847\u0848\7X\2\2\u0848\u0849\7!\2\2\u0849"+
		"\u084a\5\u01a4\u00d3\2\u084a\u084b\7\"\2\2\u084b\u086c\3\2\2\2\u084c\u084d"+
		"\f\n\2\2\u084d\u084e\7\5\2\2\u084e\u086c\7\u009f\2\2\u084f\u0850\f\t\2"+
		"\2\u0850\u0851\7\5\2\2\u0851\u0853\5\u01f8\u00fd\2\u0852\u0854\5j\66\2"+
		"\u0853\u0852\3\2\2\2\u0853\u0854\3\2\2\2\u0854\u086c\3\2\2\2\u0855\u0856"+
		"\f\b\2\2\u0856\u0857\7\5\2\2\u0857\u0858\5\u01f8\u00fd\2\u0858\u0859\7"+
		"!\2\2\u0859\u085a\5\u01a4\u00d3\2\u085a\u085b\7\"\2\2\u085b\u086c\3\2"+
		"\2\2\u085c\u085d\f\7\2\2\u085d\u085e\7\5\2\2\u085e\u086c\7s\2\2\u085f"+
		"\u0860\f\6\2\2\u0860\u0861\7\5\2\2\u0861\u086c\7{\2\2\u0862\u0863\f\5"+
		"\2\2\u0863\u0864\7g\2\2\u0864\u0865\5\u0196\u00cc\2\u0865\u0866\7h\2\2"+
		"\u0866\u086c\3\2\2\2\u0867\u0868\f\4\2\2\u0868\u086c\7Z\2\2\u0869\u086a"+
		"\f\3\2\2\u086a\u086c\7Y\2\2\u086b\u0839\3\2\2\2\u086b\u083b\3\2\2\2\u086b"+
		"\u0840\3\2\2\2\u086b\u0842\3\2\2\2\u086b\u0845\3\2\2\2\u086b\u084c\3\2"+
		"\2\2\u086b\u084f\3\2\2\2\u086b\u0855\3\2\2\2\u086b\u085c\3\2\2\2\u086b"+
		"\u085f\3\2\2\2\u086b\u0862\3\2\2\2\u086b\u0867\3\2\2\2\u086b\u0869\3\2"+
		"\2\2\u086c\u086f\3\2\2\2\u086d\u086b\3\2\2\2\u086d\u086e\3\2\2\2\u086e"+
		"\u01a3\3\2\2\2\u086f\u086d\3\2\2\2\u0870\u0872\5\u01a6\u00d4\2\u0871\u0870"+
		"\3\2\2\2\u0872\u0873\3\2\2\2\u0873\u0871\3\2\2\2\u0873\u0874\3\2\2\2\u0874"+
		"\u01a5\3\2\2\2\u0875\u0878\5\u01f8\u00fd\2\u0876\u0878\7U\2\2\u0877\u0875"+
		"\3\2\2\2\u0877\u0876\3\2\2\2\u0878\u0879\3\2\2\2\u0879\u087a\7\4\2\2\u087a"+
		"\u01a7\3\2\2\2\u087b\u087c\t\f\2\2\u087c\u01a9\3\2\2\2\u087d\u0880\5\u01a8"+
		"\u00d5\2\u087e\u0880\7\u0099\2\2\u087f\u087d\3\2\2\2\u087f\u087e\3\2\2"+
		"\2\u0880\u01ab\3\2\2\2\u0881\u0885\5\u01a8\u00d5\2\u0882\u0884\5\u01aa"+
		"\u00d6\2\u0883\u0882\3\2\2\2\u0884\u0887\3\2\2\2\u0885\u0883\3\2\2\2\u0885"+
		"\u0886\3\2\2\2\u0886\u0891\3\2\2\2\u0887\u0885\3\2\2\2\u0888\u088c\7\u009a"+
		"\2\2\u0889\u088b\5\u01aa\u00d6\2\u088a\u0889\3\2\2\2\u088b\u088e\3\2\2"+
		"\2\u088c\u088a\3\2\2\2\u088c\u088d\3\2\2\2\u088d\u0891\3\2\2\2\u088e\u088c"+
		"\3\2\2\2\u088f\u0891\7T\2\2\u0890\u0881\3\2\2\2\u0890\u0888\3\2\2\2\u0890"+
		"\u088f\3\2\2\2\u0891\u01ad\3\2\2\2\u0892\u0893\5\u01ac\u00d7\2\u0893\u01af"+
		"\3\2\2\2\u0894\u0895\5\u01ac\u00d7\2\u0895\u01b1\3\2\2\2\u0896\u0897\5"+
		"\u01ac\u00d7\2\u0897\u01b3\3\2\2\2\u0898\u0899\b\u00db\1\2\u0899\u08bd"+
		"\5\u01b6\u00dc\2\u089a\u08bd\5\u01b8\u00dd\2\u089b\u089d\5\u01c4\u00e3"+
		"\2\u089c\u089e\7Q\2\2\u089d\u089c\3\2\2\2\u089d\u089e\3\2\2\2\u089e\u089f"+
		"\3\2\2\2\u089f\u08a0\7S\2\2\u08a0\u08a1\5\u01b4\u00db\17\u08a1\u08bd\3"+
		"\2\2\2\u08a2\u08a3\5\u01c4\u00e3\2\u08a3\u08a4\7R\2\2\u08a4\u08a5\7S\2"+
		"\2\u08a5\u08a6\5\u01b4\u00db\16\u08a6\u08bd\3\2\2\2\u08a7\u08a8\7!\2\2"+
		"\u08a8\u08a9\5\u01b4\u00db\2\u08a9\u08ab\7\"\2\2\u08aa\u08ac\7Q\2\2\u08ab"+
		"\u08aa\3\2\2\2\u08ab\u08ac\3\2\2\2\u08ac\u08ad\3\2\2\2\u08ad\u08ae\7S"+
		"\2\2\u08ae\u08af\5\u01b4\u00db\r\u08af\u08bd\3\2\2\2\u08b0\u08b1\7!\2"+
		"\2\u08b1\u08b2\5\u01b4\u00db\2\u08b2\u08b3\7\"\2\2\u08b3\u08b4\7R\2\2"+
		"\u08b4\u08b5\7S\2\2\u08b5\u08b6\5\u01b4\u00db\f\u08b6\u08bd\3\2\2\2\u08b7"+
		"\u08bd\5\u01c0\u00e1\2\u08b8\u08bd\5\u01c4\u00e3\2\u08b9\u08bd\5\u01ce"+
		"\u00e8\2\u08ba\u08bd\7\u0081\2\2\u08bb\u08bd\7\u0082\2\2\u08bc\u0898\3"+
		"\2\2\2\u08bc\u089a\3\2\2\2\u08bc\u089b\3\2\2\2\u08bc\u08a2\3\2\2\2\u08bc"+
		"\u08a7\3\2\2\2\u08bc\u08b0\3\2\2\2\u08bc\u08b7\3\2\2\2\u08bc\u08b8\3\2"+
		"\2\2\u08bc\u08b9\3\2\2\2\u08bc\u08ba\3\2\2\2\u08bc\u08bb\3\2\2\2\u08bd"+
		"\u08ca\3\2\2\2\u08be\u08bf\f\t\2\2\u08bf\u08c9\7Y\2\2\u08c0\u08c1\f\b"+
		"\2\2\u08c1\u08c9\7Z\2\2\u08c2\u08c3\f\6\2\2\u08c3\u08c4\7\5\2\2\u08c4"+
		"\u08c9\7\177\2\2\u08c5\u08c6\f\5\2\2\u08c6\u08c7\7\5\2\2\u08c7\u08c9\7"+
		"\u0080\2\2\u08c8\u08be\3\2\2\2\u08c8\u08c0\3\2\2\2\u08c8\u08c2\3\2\2\2"+
		"\u08c8\u08c5\3\2\2\2\u08c9\u08cc\3\2\2\2\u08ca\u08c8\3\2\2\2\u08ca\u08cb"+
		"\3\2\2\2\u08cb\u01b5\3\2\2\2\u08cc\u08ca\3\2\2\2\u08cd\u08ce\7g\2\2\u08ce"+
		"\u08cf\5\u01b4\u00db\2\u08cf\u08d0\7h\2\2\u08d0\u01b7\3\2\2\2\u08d1\u08d2"+
		"\7g\2\2\u08d2\u08d3\5\u01b4\u00db\2\u08d3\u08d4\7\4\2\2\u08d4\u08d5\5"+
		"\u01b4\u00db\2\u08d5\u08d6\7h\2\2\u08d6\u01b9\3\2\2\2\u08d7\u08d8\5\u01b4"+
		"\u00db\2\u08d8\u08d9\7Y\2\2\u08d9\u01bb\3\2\2\2\u08da\u08db\5\u01b4\u00db"+
		"\2\u08db\u08dc\7Z\2\2\u08dc\u01bd\3\2\2\2\u08dd\u08df\7\4\2\2\u08de\u08e0"+
		"\5\u014e\u00a8\2\u08df\u08de\3\2\2\2\u08df\u08e0\3\2\2\2\u08e0\u08e2\3"+
		"\2\2\2\u08e1\u08e3\7\u0083\2\2\u08e2\u08e1\3\2\2\2\u08e2\u08e3\3\2\2\2"+
		"\u08e3\u08e4\3\2\2\2\u08e4\u08e5\5\u01b4\u00db\2\u08e5\u01bf\3\2\2\2\u08e6"+
		"\u08e8\5\u01c2\u00e2\2\u08e7\u08e9\5j\66\2\u08e8\u08e7\3\2\2\2\u08e8\u08e9"+
		"\3\2\2\2\u08e9\u08f2\3\2\2\2\u08ea\u08ec\5\u01c2\u00e2\2\u08eb\u08ed\5"+
		"j\66\2\u08ec\u08eb\3\2\2\2\u08ec\u08ed\3\2\2\2\u08ed\u08ee\3\2\2\2\u08ee"+
		"\u08ef\7\5\2\2\u08ef\u08f0\5\u01c0\u00e1\2\u08f0\u08f2\3\2\2\2\u08f1\u08e6"+
		"\3\2\2\2\u08f1\u08ea\3\2\2\2\u08f2\u01c1\3\2\2\2\u08f3\u08f4\5\u01f8\u00fd"+
		"\2\u08f4\u01c3\3\2\2\2\u08f5\u08f7\7!\2\2\u08f6\u08f8\5\u01c6\u00e4\2"+
		"\u08f7\u08f6\3\2\2\2\u08f7\u08f8\3\2\2\2\u08f8\u08f9\3\2\2\2\u08f9\u08fa"+
		"\7\"\2\2\u08fa\u01c5\3\2\2\2\u08fb\u08fd\5\u01c8\u00e5\2\u08fc\u08fe\7"+
		"T\2\2\u08fd\u08fc\3\2\2\2\u08fd\u08fe\3\2\2\2\u08fe\u01c7\3\2\2\2\u08ff"+
		"\u0904\5\u01ca\u00e6\2\u0900\u0901\7\24\2\2\u0901\u0903\5\u01ca\u00e6"+
		"\2\u0902\u0900\3\2\2\2\u0903\u0906\3\2\2\2\u0904\u0902\3\2\2\2\u0904\u0905"+
		"\3\2\2\2\u0905\u01c9\3\2\2\2\u0906\u0904\3\2\2\2\u0907\u0909\5\u014e\u00a8"+
		"\2\u0908\u0907\3\2\2\2\u0908\u0909\3\2\2\2\u0909\u090b\3\2\2\2\u090a\u090c"+
		"\7\u0083\2\2\u090b\u090a\3\2\2\2\u090b\u090c\3\2\2\2\u090c\u090d\3\2\2"+
		"\2\u090d\u0916\5\u01b4\u00db\2\u090e\u090f\5\u01cc\u00e7\2\u090f\u0910"+
		"\5\u01be\u00e0\2\u0910\u0916\3\2\2\2\u0911\u0912\7U\2\2\u0912\u0913\5"+
		"\u01cc\u00e7\2\u0913\u0914\5\u01be\u00e0\2\u0914\u0916\3\2\2\2\u0915\u0908"+
		"\3\2\2\2\u0915\u090e\3\2\2\2\u0915\u0911\3\2\2\2\u0916\u01cb\3\2\2\2\u0917"+
		"\u0918\5\u01f8\u00fd\2\u0918\u01cd\3\2\2\2\u0919\u091a\5\u01d2\u00ea\2"+
		"\u091a\u091b\7m\2\2\u091b\u091c\5\u01d0\u00e9\2\u091c\u01cf\3\2\2\2\u091d"+
		"\u0920\5\u01d2\u00ea\2\u091e\u0920\5\u01ce\u00e8\2\u091f\u091d\3\2\2\2"+
		"\u091f\u091e\3\2\2\2\u0920\u01d1\3\2\2\2\u0921\u0922\5\u01c0\u00e1\2\u0922"+
		"\u01d3\3\2\2\2\u0923\u0924\5\u01b4\u00db\2\u0924\u0925\7\5\2\2\u0925\u0926"+
		"\7\177\2\2\u0926\u092c\3\2\2\2\u0927\u0928\5\u01b4\u00db\2\u0928\u0929"+
		"\7\5\2\2\u0929\u092a\7\u0080\2\2\u092a\u092c\3\2\2\2\u092b\u0923\3\2\2"+
		"\2\u092b\u0927\3\2\2\2\u092c\u01d5\3\2\2\2\u092d\u092e\7\4\2\2\u092e\u092f"+
		"\5\u01da\u00ee\2\u092f\u0930\7\24\2\2\u0930\u0931\5\u01d8\u00ed\2\u0931"+
		"\u0937\3\2\2\2\u0932\u0933\7\4\2\2\u0933\u0937\5\u01da\u00ee\2\u0934\u0935"+
		"\7\4\2\2\u0935\u0937\5\u01d8\u00ed\2\u0936\u092d\3\2\2\2\u0936\u0932\3"+
		"\2\2\2\u0936\u0934\3\2\2\2\u0937\u01d7\3\2\2\2\u0938\u093d\5\u01c0\u00e1"+
		"\2\u0939\u093a\7\24\2\2\u093a\u093c\5\u01c0\u00e1\2\u093b\u0939\3\2\2"+
		"\2\u093c\u093f\3\2\2\2\u093d\u093b\3\2\2\2\u093d\u093e\3\2\2\2\u093e\u01d9"+
		"\3\2\2\2\u093f\u093d\3\2\2\2\u0940\u0941\7/\2\2\u0941\u01db\3\2\2\2\u0942"+
		"\u0945\5\u01de\u00f0\2\u0943\u0945\5\u01f2\u00fa\2\u0944\u0942\3\2\2\2"+
		"\u0944\u0943\3\2\2\2\u0945\u01dd\3\2\2\2\u0946\u0948\5\u01e0\u00f1\2\u0947"+
		"\u0949\5\u01e2\u00f2\2\u0948\u0947\3\2\2\2\u0948\u0949\3\2\2\2\u0949\u094b"+
		"\3\2\2\2\u094a\u094c\5\u01e6\u00f4\2\u094b\u094a\3\2\2\2\u094b\u094c\3"+
		"\2\2\2\u094c\u094d\3\2\2\2\u094d\u094e\7\u0084\2\2\u094e\u01df\3\2\2\2"+
		"\u094f\u0950\7\u0085\2\2\u0950\u0952\5\u01e8\u00f5\2\u0951\u0953\5\n\6"+
		"\2\u0952\u0951\3\2\2\2\u0952\u0953\3\2\2\2\u0953\u01e1\3\2\2\2\u0954\u0956"+
		"\5\u01e4\u00f3\2\u0955\u0954\3\2\2\2\u0956\u0957\3\2\2\2\u0957\u0955\3"+
		"\2\2\2\u0957\u0958\3\2\2\2\u0958\u01e3\3\2\2\2\u0959\u095a\7\u0086\2\2"+
		"\u095a\u095c\5\u01e8\u00f5\2\u095b\u095d\5\n\6\2\u095c\u095b\3\2\2\2\u095c"+
		"\u095d\3\2\2\2\u095d\u01e5\3\2\2\2\u095e\u0960\7\u0087\2\2\u095f\u0961"+
		"\5\n\6\2\u0960\u095f\3\2\2\2\u0960\u0961\3\2\2\2\u0961\u01e7\3\2\2\2\u0962"+
		"\u0963\b\u00f5\1\2\u0963\u096d\5\u01ea\u00f6\2\u0964\u096d\5\u01f8\u00fd"+
		"\2\u0965\u096d\5\u0200\u0101\2\u0966\u0967\7!\2\2\u0967\u0968\5\u01e8"+
		"\u00f5\2\u0968\u0969\7\"\2\2\u0969\u096d\3\2\2\2\u096a\u096b\7Z\2\2\u096b"+
		"\u096d\5\u01e8\u00f5\4\u096c\u0962\3\2\2\2\u096c\u0964\3\2\2\2\u096c\u0965"+
		"\3\2\2\2\u096c\u0966\3\2\2\2\u096c\u096a\3\2\2\2\u096d\u0973\3\2\2\2\u096e"+
		"\u096f\f\3\2\2\u096f\u0970\t\r\2\2\u0970\u0972\5\u01e8\u00f5\4\u0971\u096e"+
		"\3\2\2\2\u0972\u0975\3\2\2\2\u0973\u0971\3\2\2\2\u0973\u0974\3\2\2\2\u0974"+
		"\u01e9\3\2\2\2\u0975\u0973\3\2\2\2\u0976\u0977\7\u0088\2\2\u0977\u0978"+
		"\7!\2\2\u0978\u0979\5\u01ec\u00f7\2\u0979\u097a\7\"\2\2\u097a\u0987\3"+
		"\2\2\2\u097b\u097c\7\u0089\2\2\u097c\u097d\7!\2\2\u097d\u097e\5\u01ee"+
		"\u00f8\2\u097e\u097f\7\"\2\2\u097f\u0987\3\2\2\2\u0980\u0981\7\u008a\2"+
		"\2\u0981\u0982\7!\2\2\u0982\u0983\7~\2\2\u0983\u0984\5\u01f0\u00f9\2\u0984"+
		"\u0985\7\"\2\2\u0985\u0987\3\2\2\2\u0986\u0976\3\2\2\2\u0986\u097b\3\2"+
		"\2\2\u0986\u0980\3\2\2\2\u0987\u01eb\3\2\2\2\u0988\u0989\t\16\2\2\u0989"+
		"\u01ed\3\2\2\2\u098a\u098b\t\17\2\2\u098b\u01ef\3\2\2\2\u098c\u098d\7"+
		"\u00a1\2\2\u098d\u01f1\3\2\2\2\u098e\u098f\7\u008f\2\2\u098f\u0990\7!"+
		"\2\2\u0990\u0991\7\u0090\2\2\u0991\u0992\7\4\2\2\u0992\u0993\5\u01f6\u00fc"+
		"\2\u0993\u0994\7\24\2\2\u0994\u0995\7\u0091\2\2\u0995\u0996\7\4\2\2\u0996"+
		"\u0997\5\u01f4\u00fb\2\u0997\u0998\7\"\2\2\u0998\u099d\3\2\2\2\u0999\u099a"+
		"\7\u008f\2\2\u099a\u099b\7!\2\2\u099b\u099d\7\"\2\2\u099c\u098e\3\2\2"+
		"\2\u099c\u0999\3\2\2\2\u099d\u01f3\3\2\2\2\u099e\u099f\5\u0206\u0104\2"+
		"\u099f\u01f5\3\2\2\2\u09a0\u09a1\7\u00a3\2\2\u09a1\u01f7\3\2\2\2\u09a2"+
		"\u09a5\7\u009b\2\2\u09a3\u09a5\5\u01fc\u00ff\2\u09a4\u09a2\3\2\2\2\u09a4"+
		"\u09a3\3\2\2\2\u09a5\u01f9\3\2\2\2\u09a6\u09a7\t\20\2\2\u09a7\u01fb\3"+
		"\2\2\2\u09a8\u09a9\t\21\2\2\u09a9\u01fd\3\2\2\2\u09aa\u09ad\5\u01f8\u00fd"+
		"\2\u09ab\u09ad\7U\2\2\u09ac\u09aa\3\2\2\2\u09ac\u09ab\3\2\2\2\u09ad\u09b5"+
		"\3\2\2\2\u09ae\u09b1\7\24\2\2\u09af\u09b2\5\u01f8\u00fd\2\u09b0\u09b2"+
		"\7U\2\2\u09b1\u09af\3\2\2\2\u09b1\u09b0\3\2\2\2\u09b2\u09b4\3\2\2\2\u09b3"+
		"\u09ae\3\2\2\2\u09b4\u09b7\3\2\2\2\u09b5\u09b3\3\2\2\2\u09b5\u09b6\3\2"+
		"\2\2\u09b6\u01ff\3\2\2\2\u09b7\u09b5\3\2\2\2\u09b8\u09b9\7\u0096\2\2\u09b9"+
		"\u0201\3\2\2\2\u09ba\u09bf\5\u0204\u0103\2\u09bb\u09bf\7\u00a3\2\2\u09bc"+
		"\u09bf\7";
	private static final String _serializedATNSegment1 =
		"\u0096\2\2\u09bd\u09bf\7\u0097\2\2\u09be\u09ba\3\2\2\2\u09be\u09bb\3\2"+
		"\2\2\u09be\u09bc\3\2\2\2\u09be\u09bd\3\2\2\2\u09bf\u0203\3\2\2\2\u09c0"+
		"\u09c2\7i\2\2\u09c1\u09c0\3\2\2\2\u09c1\u09c2\3\2\2\2\u09c2\u09c3\3\2"+
		"\2\2\u09c3\u09c9\5\u0206\u0104\2\u09c4\u09c6\7i\2\2\u09c5\u09c4\3\2\2"+
		"\2\u09c5\u09c6\3\2\2\2\u09c6\u09c7\3\2\2\2\u09c7\u09c9\7\u00a1\2\2\u09c8"+
		"\u09c1\3\2\2\2\u09c8\u09c5\3\2\2\2\u09c9\u0205\3\2\2\2\u09ca\u09cb\t\22"+
		"\2\2\u09cb\u0207\3\2\2\2\u0131\u0209\u020f\u0213\u0217\u021c\u0220\u0224"+
		"\u0228\u022c\u0230\u0232\u0238\u0241\u0246\u024a\u0250\u0260\u0266\u026c"+
		"\u0277\u027e\u028c\u0297\u029c\u02a7\u02b3\u02b7\u02bb\u02c1\u02cc\u02d0"+
		"\u02d4\u02d7\u02e0\u02e7\u0300\u0307\u0310\u0319\u0325\u032f\u0334\u033e"+
		"\u034d\u0354\u0358\u035c\u0360\u0364\u0368\u036c\u0370\u0374\u0378\u037c"+
		"\u0380\u0384\u0388\u038c\u038e\u0393\u0398\u03b3\u03ce\u03d3\u03d7\u03dc"+
		"\u03e0\u03eb\u03ef\u03f2\u03f5\u03ff\u0404\u041c\u0428\u042b\u042e\u0437"+
		"\u0440\u0443\u0446\u044c\u044f\u0453\u045e\u0467\u046a\u046f\u0476\u047d"+
		"\u0481\u0484\u0488\u048d\u0491\u0499\u049c\u04a1\u04ab\u04b3\u04b7\u04ba"+
		"\u04bd\u04c3\u04c7\u04ca\u04ce\u04d9\u04dd\u04e4\u04e8\u04eb\u04f0\u04f3"+
		"\u04f6\u04fc\u0501\u0505\u050b\u050e\u0514\u0517\u051c\u051f\u0523\u052a"+
		"\u052f\u0531\u0534\u0537\u0541\u0546\u054f\u0552\u0556\u055d\u0561\u0564"+
		"\u056e\u0573\u0579\u057c\u0581\u0584\u058c\u0591\u0594\u0599\u059c\u05a2"+
		"\u05a6\u05a8\u05ae\u05b3\u05b6\u05bb\u05c3\u05c9\u05cd\u05d1\u05d5\u05d9"+
		"\u05db\u05e0\u05ea\u05f0\u05f4\u05fb\u05fe\u0603\u0606\u060a\u060e\u0613"+
		"\u0616\u061a\u061f\u0625\u0628\u062e\u0634\u0644\u0647\u064a\u0651\u0658"+
		"\u066b\u0671\u0675\u0677\u0686\u068a\u068f\u0695\u069c\u06a7\u06ab\u06b4"+
		"\u06bc\u06bf\u06c2\u06c6\u06ca\u06d8\u06de\u06e5\u06ea\u06ee\u06f3\u06f8"+
		"\u070d\u0710\u0716\u071a\u071e\u0721\u0728\u072f\u0735\u073a\u0740\u074f"+
		"\u0755\u0758\u0763\u076c\u0770\u0779\u077d\u0788\u078f\u0793\u07a5\u07aa"+
		"\u07bb\u07be\u07c3\u07c7\u07ca\u07d1\u07da\u07e1\u07e6\u07ec\u07f0\u07fb"+
		"\u07ff\u080a\u0813\u081a\u081c\u0820\u082f\u083d\u0853\u086b\u086d\u0873"+
		"\u0877\u087f\u0885\u088c\u0890\u089d\u08ab\u08bc\u08c8\u08ca\u08df\u08e2"+
		"\u08e8\u08ec\u08f1\u08f7\u08fd\u0904\u0908\u090b\u0915\u091f\u092b\u0936"+
		"\u093d\u0944\u0948\u094b\u0952\u0957\u095c\u0960\u096c\u0973\u0986\u099c"+
		"\u09a4\u09ac\u09b1\u09b5\u09be\u09c1\u09c5\u09c8";
	public static final String _serializedATN = Utils.join(
		new String[] {
			_serializedATNSegment0,
			_serializedATNSegment1
		},
		""
	);
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}