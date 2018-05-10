package de.unihamburg.swk.parsing.antlr4.swift4;// Generated from Swift4.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Swift4Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		OpenBracket=1, CloseBracket=2, OpenParen=3, CloseParen=4, OpenBrace=5, 
		CloseBrace=6, SemiColon=7, Comma=8, Assign=9, QuestionMark=10, Colon=11, 
		Ellipsis=12, Dot=13, PlusPlus=14, MinusMinus=15, Plus=16, ARROW=17, Minus=18, 
		BitNot=19, Not=20, Multiply=21, Divide=22, Modulus=23, RightShiftArithmetic=24, 
		LeftShiftArithmetic=25, RightShiftLogical=26, LessThan=27, MoreThan=28, 
		LessThanEquals=29, GreaterThanEquals=30, Equals_=31, NotEquals=32, IdentityEquals=33, 
		IdentityNotEquals=34, BitAnd=35, BitXOr=36, BitOr=37, And=38, Or=39, MultiplyAssign=40, 
		DivideAssign=41, ModulusAssign=42, PlusAssign=43, MinusAssign=44, LeftShiftArithmeticAssign=45, 
		RightShiftArithmeticAssign=46, RightShiftLogicalAssign=47, BitAndAssign=48, 
		BitXorAssign=49, BitOrAssign=50, AT=51, ANY=52, IMPORT=53, CLASS=54, ENUM=55, 
		EXTENSION=56, PROTOCOL=57, STRUCT=58, BREAK=59, DO=60, INSTANCEOF=61, 
		TYPEOF=62, CASE=63, ELSE=64, NEW=65, VAR=66, LET=67, FINAL=68, CATCH=69, 
		FINALLY=70, RETURN=71, VOID=72, UPPERCASEVOID=73, CONTINUE=74, FOR=75, 
		SWITCH=76, WHILE=77, DEBUGGER=78, FUNC=79, SELF=80, WITH=81, DEFAULT=82, 
		IF=83, THROW=84, THROWS=85, DELETE=86, IN=87, TRY=88, INOUT=89, INDIRECT=90, 
		INIT=91, PRIVATE=92, FILEPRIVATE=93, INTERNAL=94, PUBLIC=95, MUTATING=96, 
		CONVENIENCE=97, DYNAMIC=98, INFIX=99, LAZY=100, OPTIONAL=101, OVERRIDE=102, 
		POSTFIX=103, PREFIX=104, REQUIRED=105, UNOWNED=106, WEAK=107, STATIC=108, 
		SET=109, Identifier=110, StringLiteral=111, WS=112, COMMENT=113, LINE_COMMENT=114, 
		ANYCHARS=115;
	public static final int
		RULE_program = 0, RULE_globalVariableDeclaration = 1, RULE_initializerDeclaration = 2, 
		RULE_initializerHead = 3, RULE_functionDeclaration = 4, RULE_functionHead = 5, 
		RULE_declarationModifiers = 6, RULE_declarationModifier = 7, RULE_functionSignature = 8, 
		RULE_functionResult = 9, RULE_functionBody = 10, RULE_codeBlock = 11, 
		RULE_noisyCode = 12, RULE_functionCallExpression = 13, RULE_functionName = 14, 
		RULE_functionCallArgumentClause = 15, RULE_functionCallArgumentList = 16, 
		RULE_functionCallArgument = 17, RULE_parameterName = 18, RULE_expression = 19, 
		RULE_postfixExpression = 20, RULE_variableDeclaration = 21, RULE_genericParameterClause = 22, 
		RULE_genericParameters = 23, RULE_genericParameter = 24, RULE_typeName = 25, 
		RULE_typeidentifier = 26, RULE_parameterClause = 27, RULE_parameterList = 28, 
		RULE_parameter = 29, RULE_defaultParamInitializer = 30, RULE_variableInitializer = 31, 
		RULE_constructorCall = 32, RULE_type = 33, RULE_dictionaryType = 34, RULE_functionType = 35, 
		RULE_functionTypeArgumentClause = 36, RULE_functionTypeArguments = 37, 
		RULE_functionTypeArgument = 38, RULE_tupleType = 39, RULE_tupleElements = 40, 
		RULE_tupleElement = 41, RULE_externalParametername = 42, RULE_localParameterName = 43, 
		RULE_attributes = 44, RULE_attribute = 45, RULE_attributeArgumentsClause = 46, 
		RULE_balancedTokens = 47, RULE_balancedToken = 48, RULE_typeDefinition = 49, 
		RULE_extensionDefinition = 50, RULE_protocolDeclaration = 51, RULE_structDeclaration = 52, 
		RULE_enumDeclaration = 53, RULE_rawValueStyleEnum = 54, RULE_rawValueStyleEnumMembers = 55, 
		RULE_rawValueStyleEnumMember = 56, RULE_rawValueEnumCaseList = 57, RULE_rawValueEnumCase = 58, 
		RULE_unionStyleEnum = 59, RULE_unionStyleEnumMembers = 60, RULE_unionStyleEnumMember = 61, 
		RULE_caseClause = 62, RULE_enumCaseList = 63, RULE_enumCase = 64, RULE_importStatement = 65, 
		RULE_classDeclaration = 66, RULE_typeInheritanceClause = 67, RULE_typeInheritances = 68, 
		RULE_typeBody = 69, RULE_noise = 70, RULE_typeVariableDeclaration = 71, 
		RULE_identifier = 72, RULE_keywordNoise = 73, RULE_specialCharacter = 74, 
		RULE_accessModifier = 75;
	public static final String[] ruleNames = {
		"program", "globalVariableDeclaration", "initializerDeclaration", "initializerHead", 
		"functionDeclaration", "functionHead", "declarationModifiers", "declarationModifier", 
		"functionSignature", "functionResult", "functionBody", "codeBlock", "noisyCode", 
		"functionCallExpression", "functionName", "functionCallArgumentClause", 
		"functionCallArgumentList", "functionCallArgument", "parameterName", "expression", 
		"postfixExpression", "variableDeclaration", "genericParameterClause", 
		"genericParameters", "genericParameter", "typeName", "typeidentifier", 
		"parameterClause", "parameterList", "parameter", "defaultParamInitializer", 
		"variableInitializer", "constructorCall", "type", "dictionaryType", "functionType", 
		"functionTypeArgumentClause", "functionTypeArguments", "functionTypeArgument", 
		"tupleType", "tupleElements", "tupleElement", "externalParametername", 
		"localParameterName", "attributes", "attribute", "attributeArgumentsClause", 
		"balancedTokens", "balancedToken", "typeDefinition", "extensionDefinition", 
		"protocolDeclaration", "structDeclaration", "enumDeclaration", "rawValueStyleEnum", 
		"rawValueStyleEnumMembers", "rawValueStyleEnumMember", "rawValueEnumCaseList", 
		"rawValueEnumCase", "unionStyleEnum", "unionStyleEnumMembers", "unionStyleEnumMember", 
		"caseClause", "enumCaseList", "enumCase", "importStatement", "classDeclaration", 
		"typeInheritanceClause", "typeInheritances", "typeBody", "noise", "typeVariableDeclaration", 
		"identifier", "keywordNoise", "specialCharacter", "accessModifier"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'['", "']'", "'('", "')'", "'{'", "'}'", "';'", "','", "'='", "'?'", 
		"':'", "'...'", "'.'", "'++'", "'--'", "'+'", "'->'", "'-'", "'~'", "'!'", 
		"'*'", "'/'", "'%'", "'>>'", "'<<'", "'>>>'", "'<'", "'>'", "'<='", "'>='", 
		"'=='", "'!='", "'==='", "'!=='", "'&'", "'^'", "'|'", "'&&'", "'||'", 
		"'*='", "'/='", "'%='", "'+='", "'-='", "'<<='", "'>>='", "'>>>='", "'&='", 
		"'^='", "'|='", "'@'", "'any'", "'import'", "'class'", "'enum'", "'extension'", 
		"'protocol'", "'struct'", "'break'", "'do'", "'instanceof'", "'typeof'", 
		"'case'", "'else'", "'new'", "'var'", "'let'", "'final'", "'catch'", "'finally'", 
		"'return'", "'void'", "'Void'", "'continue'", "'for'", "'switch'", "'while'", 
		"'debugger'", "'func'", "'self'", "'with'", "'default'", "'if'", "'throw'", 
		"'throws'", "'delete'", "'in'", "'try'", "'inout'", "'indirect'", "'init'", 
		"'private'", "'fileprivate'", "'inernal'", "'public'", "'mutating'", "'convenience'", 
		"'dynamic'", "'infix'", "'lazy'", "'optional'", "'override'", "'postfix'", 
		"'prefix'", "'required'", "'unowned'", "'weak'", "'static'", "'set'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "OpenBracket", "CloseBracket", "OpenParen", "CloseParen", "OpenBrace", 
		"CloseBrace", "SemiColon", "Comma", "Assign", "QuestionMark", "Colon", 
		"Ellipsis", "Dot", "PlusPlus", "MinusMinus", "Plus", "ARROW", "Minus", 
		"BitNot", "Not", "Multiply", "Divide", "Modulus", "RightShiftArithmetic", 
		"LeftShiftArithmetic", "RightShiftLogical", "LessThan", "MoreThan", "LessThanEquals", 
		"GreaterThanEquals", "Equals_", "NotEquals", "IdentityEquals", "IdentityNotEquals", 
		"BitAnd", "BitXOr", "BitOr", "And", "Or", "MultiplyAssign", "DivideAssign", 
		"ModulusAssign", "PlusAssign", "MinusAssign", "LeftShiftArithmeticAssign", 
		"RightShiftArithmeticAssign", "RightShiftLogicalAssign", "BitAndAssign", 
		"BitXorAssign", "BitOrAssign", "AT", "ANY", "IMPORT", "CLASS", "ENUM", 
		"EXTENSION", "PROTOCOL", "STRUCT", "BREAK", "DO", "INSTANCEOF", "TYPEOF", 
		"CASE", "ELSE", "NEW", "VAR", "LET", "FINAL", "CATCH", "FINALLY", "RETURN", 
		"VOID", "UPPERCASEVOID", "CONTINUE", "FOR", "SWITCH", "WHILE", "DEBUGGER", 
		"FUNC", "SELF", "WITH", "DEFAULT", "IF", "THROW", "THROWS", "DELETE", 
		"IN", "TRY", "INOUT", "INDIRECT", "INIT", "PRIVATE", "FILEPRIVATE", "INTERNAL", 
		"PUBLIC", "MUTATING", "CONVENIENCE", "DYNAMIC", "INFIX", "LAZY", "OPTIONAL", 
		"OVERRIDE", "POSTFIX", "PREFIX", "REQUIRED", "UNOWNED", "WEAK", "STATIC", 
		"SET", "Identifier", "StringLiteral", "WS", "COMMENT", "LINE_COMMENT", 
		"ANYCHARS"
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
	public String getGrammarFileName() { return "Swift4.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Swift4Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public List<ImportStatementContext> importStatement() {
			return getRuleContexts(ImportStatementContext.class);
		}
		public ImportStatementContext importStatement(int i) {
			return getRuleContext(ImportStatementContext.class,i);
		}
		public List<TypeDefinitionContext> typeDefinition() {
			return getRuleContexts(TypeDefinitionContext.class);
		}
		public TypeDefinitionContext typeDefinition(int i) {
			return getRuleContext(TypeDefinitionContext.class,i);
		}
		public List<FunctionDeclarationContext> functionDeclaration() {
			return getRuleContexts(FunctionDeclarationContext.class);
		}
		public FunctionDeclarationContext functionDeclaration(int i) {
			return getRuleContext(FunctionDeclarationContext.class,i);
		}
		public List<GlobalVariableDeclarationContext> globalVariableDeclaration() {
			return getRuleContexts(GlobalVariableDeclarationContext.class);
		}
		public GlobalVariableDeclarationContext globalVariableDeclaration(int i) {
			return getRuleContext(GlobalVariableDeclarationContext.class,i);
		}
		public NoiseContext noise() {
			return getRuleContext(NoiseContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(152);
					importStatement();
					}
					} 
				}
				setState(157);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(163);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(161);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						setState(158);
						typeDefinition();
						}
						break;
					case 2:
						{
						setState(159);
						functionDeclaration();
						}
						break;
					case 3:
						{
						setState(160);
						globalVariableDeclaration();
						}
						break;
					}
					} 
				}
				setState(165);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenBracket) | (1L << CloseBracket) | (1L << OpenParen) | (1L << CloseParen) | (1L << SemiColon) | (1L << Comma) | (1L << Assign) | (1L << QuestionMark) | (1L << Colon) | (1L << Ellipsis) | (1L << Dot) | (1L << PlusPlus) | (1L << Plus) | (1L << Minus) | (1L << BitNot) | (1L << Not) | (1L << Multiply) | (1L << Divide) | (1L << Modulus) | (1L << RightShiftArithmetic) | (1L << LeftShiftArithmetic) | (1L << RightShiftLogical) | (1L << LessThan) | (1L << MoreThan) | (1L << LessThanEquals) | (1L << GreaterThanEquals) | (1L << Equals_) | (1L << NotEquals) | (1L << BitAnd) | (1L << BitXOr) | (1L << BitOr) | (1L << And) | (1L << Or) | (1L << MultiplyAssign) | (1L << DivideAssign) | (1L << ModulusAssign) | (1L << PlusAssign) | (1L << MinusAssign) | (1L << LeftShiftArithmeticAssign) | (1L << RightShiftArithmeticAssign) | (1L << RightShiftLogicalAssign) | (1L << BitAndAssign) | (1L << BitXorAssign) | (1L << BitOrAssign) | (1L << AT) | (1L << ANY) | (1L << IMPORT) | (1L << BREAK) | (1L << DO) | (1L << INSTANCEOF) | (1L << TYPEOF) | (1L << CASE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (ELSE - 64)) | (1L << (NEW - 64)) | (1L << (FINAL - 64)) | (1L << (CATCH - 64)) | (1L << (FINALLY - 64)) | (1L << (RETURN - 64)) | (1L << (VOID - 64)) | (1L << (UPPERCASEVOID - 64)) | (1L << (CONTINUE - 64)) | (1L << (FOR - 64)) | (1L << (SWITCH - 64)) | (1L << (WHILE - 64)) | (1L << (DEBUGGER - 64)) | (1L << (SELF - 64)) | (1L << (WITH - 64)) | (1L << (DEFAULT - 64)) | (1L << (IF - 64)) | (1L << (THROW - 64)) | (1L << (THROWS - 64)) | (1L << (DELETE - 64)) | (1L << (IN - 64)) | (1L << (TRY - 64)) | (1L << (INOUT - 64)) | (1L << (INDIRECT - 64)) | (1L << (INIT - 64)) | (1L << (CONVENIENCE - 64)) | (1L << (DYNAMIC - 64)) | (1L << (INFIX - 64)) | (1L << (LAZY - 64)) | (1L << (OPTIONAL - 64)) | (1L << (OVERRIDE - 64)) | (1L << (POSTFIX - 64)) | (1L << (PREFIX - 64)) | (1L << (REQUIRED - 64)) | (1L << (UNOWNED - 64)) | (1L << (WEAK - 64)) | (1L << (STATIC - 64)) | (1L << (Identifier - 64)) | (1L << (ANYCHARS - 64)))) != 0)) {
				{
				setState(166);
				noise();
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

	public static class GlobalVariableDeclarationContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode VAR() { return getToken(Swift4Parser.VAR, 0); }
		public TerminalNode LET() { return getToken(Swift4Parser.LET, 0); }
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public DeclarationModifiersContext declarationModifiers() {
			return getRuleContext(DeclarationModifiersContext.class,0);
		}
		public TerminalNode Colon() { return getToken(Swift4Parser.Colon, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public NoiseContext noise() {
			return getRuleContext(NoiseContext.class,0);
		}
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public GlobalVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globalVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).enterGlobalVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).exitGlobalVariableDeclaration(this);
		}
	}

	public final GlobalVariableDeclarationContext globalVariableDeclaration() throws RecognitionException {
		GlobalVariableDeclarationContext _localctx = new GlobalVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_globalVariableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(169);
				attributes();
				}
			}

			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 54)) & ~0x3f) == 0 && ((1L << (_la - 54)) & ((1L << (CLASS - 54)) | (1L << (FINAL - 54)) | (1L << (PRIVATE - 54)) | (1L << (FILEPRIVATE - 54)) | (1L << (INTERNAL - 54)) | (1L << (PUBLIC - 54)) | (1L << (MUTATING - 54)) | (1L << (CONVENIENCE - 54)) | (1L << (DYNAMIC - 54)) | (1L << (INFIX - 54)) | (1L << (LAZY - 54)) | (1L << (OPTIONAL - 54)) | (1L << (OVERRIDE - 54)) | (1L << (POSTFIX - 54)) | (1L << (PREFIX - 54)) | (1L << (REQUIRED - 54)) | (1L << (UNOWNED - 54)) | (1L << (WEAK - 54)) | (1L << (STATIC - 54)))) != 0)) {
				{
				setState(172);
				declarationModifiers();
				}
			}

			setState(175);
			_la = _input.LA(1);
			if ( !(_la==VAR || _la==LET) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(176);
			identifier();
			setState(179);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(177);
				match(Colon);
				setState(178);
				type();
				}
				break;
			}
			setState(182);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(181);
				noise();
				}
				break;
			}
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OpenBrace) {
				{
				setState(184);
				codeBlock();
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
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public GenericParameterClauseContext genericParameterClause() {
			return getRuleContext(GenericParameterClauseContext.class,0);
		}
		public TerminalNode THROWS() { return getToken(Swift4Parser.THROWS, 0); }
		public InitializerDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializerDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).enterInitializerDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).exitInitializerDeclaration(this);
		}
	}

	public final InitializerDeclarationContext initializerDeclaration() throws RecognitionException {
		InitializerDeclarationContext _localctx = new InitializerDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_initializerDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			initializerHead();
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LessThan) {
				{
				setState(188);
				genericParameterClause();
				}
			}

			setState(191);
			parameterClause();
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(192);
				match(THROWS);
				}
			}

			setState(195);
			functionBody();
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
		public TerminalNode INIT() { return getToken(Swift4Parser.INIT, 0); }
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public DeclarationModifiersContext declarationModifiers() {
			return getRuleContext(DeclarationModifiersContext.class,0);
		}
		public TerminalNode QuestionMark() { return getToken(Swift4Parser.QuestionMark, 0); }
		public TerminalNode Not() { return getToken(Swift4Parser.Not, 0); }
		public InitializerHeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializerHead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).enterInitializerHead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).exitInitializerHead(this);
		}
	}

	public final InitializerHeadContext initializerHead() throws RecognitionException {
		InitializerHeadContext _localctx = new InitializerHeadContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_initializerHead);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(197);
				attributes();
				}
			}

			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 54)) & ~0x3f) == 0 && ((1L << (_la - 54)) & ((1L << (CLASS - 54)) | (1L << (FINAL - 54)) | (1L << (PRIVATE - 54)) | (1L << (FILEPRIVATE - 54)) | (1L << (INTERNAL - 54)) | (1L << (PUBLIC - 54)) | (1L << (MUTATING - 54)) | (1L << (CONVENIENCE - 54)) | (1L << (DYNAMIC - 54)) | (1L << (INFIX - 54)) | (1L << (LAZY - 54)) | (1L << (OPTIONAL - 54)) | (1L << (OVERRIDE - 54)) | (1L << (POSTFIX - 54)) | (1L << (PREFIX - 54)) | (1L << (REQUIRED - 54)) | (1L << (UNOWNED - 54)) | (1L << (WEAK - 54)) | (1L << (STATIC - 54)))) != 0)) {
				{
				setState(200);
				declarationModifiers();
				}
			}

			setState(203);
			match(INIT);
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==QuestionMark || _la==Not) {
				{
				setState(204);
				_la = _input.LA(1);
				if ( !(_la==QuestionMark || _la==Not) ) {
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

	public static class FunctionDeclarationContext extends ParserRuleContext {
		public FunctionHeadContext functionHead() {
			return getRuleContext(FunctionHeadContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
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
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).exitFunctionDeclaration(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			functionHead();
			setState(208);
			identifier();
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LessThan) {
				{
				setState(209);
				genericParameterClause();
				}
			}

			setState(212);
			functionSignature();
			setState(213);
			functionBody();
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
		public TerminalNode FUNC() { return getToken(Swift4Parser.FUNC, 0); }
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
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).enterFunctionHead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).exitFunctionHead(this);
		}
	}

	public final FunctionHeadContext functionHead() throws RecognitionException {
		FunctionHeadContext _localctx = new FunctionHeadContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_functionHead);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(215);
				attributes();
				}
			}

			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 54)) & ~0x3f) == 0 && ((1L << (_la - 54)) & ((1L << (CLASS - 54)) | (1L << (FINAL - 54)) | (1L << (PRIVATE - 54)) | (1L << (FILEPRIVATE - 54)) | (1L << (INTERNAL - 54)) | (1L << (PUBLIC - 54)) | (1L << (MUTATING - 54)) | (1L << (CONVENIENCE - 54)) | (1L << (DYNAMIC - 54)) | (1L << (INFIX - 54)) | (1L << (LAZY - 54)) | (1L << (OPTIONAL - 54)) | (1L << (OVERRIDE - 54)) | (1L << (POSTFIX - 54)) | (1L << (PREFIX - 54)) | (1L << (REQUIRED - 54)) | (1L << (UNOWNED - 54)) | (1L << (WEAK - 54)) | (1L << (STATIC - 54)))) != 0)) {
				{
				setState(218);
				declarationModifiers();
				}
			}

			setState(221);
			match(FUNC);
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
		public List<AccessModifierContext> accessModifier() {
			return getRuleContexts(AccessModifierContext.class);
		}
		public AccessModifierContext accessModifier(int i) {
			return getRuleContext(AccessModifierContext.class,i);
		}
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
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).enterDeclarationModifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).exitDeclarationModifiers(this);
		}
	}

	public final DeclarationModifiersContext declarationModifiers() throws RecognitionException {
		DeclarationModifiersContext _localctx = new DeclarationModifiersContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_declarationModifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(225);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PRIVATE:
				case FILEPRIVATE:
				case INTERNAL:
				case PUBLIC:
				case MUTATING:
					{
					setState(223);
					accessModifier();
					}
					break;
				case CLASS:
				case FINAL:
				case CONVENIENCE:
				case DYNAMIC:
				case INFIX:
				case LAZY:
				case OPTIONAL:
				case OVERRIDE:
				case POSTFIX:
				case PREFIX:
				case REQUIRED:
				case UNOWNED:
				case WEAK:
				case STATIC:
					{
					setState(224);
					declarationModifier();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(227); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 54)) & ~0x3f) == 0 && ((1L << (_la - 54)) & ((1L << (CLASS - 54)) | (1L << (FINAL - 54)) | (1L << (PRIVATE - 54)) | (1L << (FILEPRIVATE - 54)) | (1L << (INTERNAL - 54)) | (1L << (PUBLIC - 54)) | (1L << (MUTATING - 54)) | (1L << (CONVENIENCE - 54)) | (1L << (DYNAMIC - 54)) | (1L << (INFIX - 54)) | (1L << (LAZY - 54)) | (1L << (OPTIONAL - 54)) | (1L << (OVERRIDE - 54)) | (1L << (POSTFIX - 54)) | (1L << (PREFIX - 54)) | (1L << (REQUIRED - 54)) | (1L << (UNOWNED - 54)) | (1L << (WEAK - 54)) | (1L << (STATIC - 54)))) != 0) );
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
		public TerminalNode CLASS() { return getToken(Swift4Parser.CLASS, 0); }
		public TerminalNode CONVENIENCE() { return getToken(Swift4Parser.CONVENIENCE, 0); }
		public TerminalNode DYNAMIC() { return getToken(Swift4Parser.DYNAMIC, 0); }
		public TerminalNode FINAL() { return getToken(Swift4Parser.FINAL, 0); }
		public TerminalNode INFIX() { return getToken(Swift4Parser.INFIX, 0); }
		public TerminalNode LAZY() { return getToken(Swift4Parser.LAZY, 0); }
		public TerminalNode OPTIONAL() { return getToken(Swift4Parser.OPTIONAL, 0); }
		public TerminalNode OVERRIDE() { return getToken(Swift4Parser.OVERRIDE, 0); }
		public TerminalNode POSTFIX() { return getToken(Swift4Parser.POSTFIX, 0); }
		public TerminalNode PREFIX() { return getToken(Swift4Parser.PREFIX, 0); }
		public TerminalNode REQUIRED() { return getToken(Swift4Parser.REQUIRED, 0); }
		public TerminalNode STATIC() { return getToken(Swift4Parser.STATIC, 0); }
		public TerminalNode UNOWNED() { return getToken(Swift4Parser.UNOWNED, 0); }
		public TerminalNode WEAK() { return getToken(Swift4Parser.WEAK, 0); }
		public DeclarationModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).enterDeclarationModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).exitDeclarationModifier(this);
		}
	}

	public final DeclarationModifierContext declarationModifier() throws RecognitionException {
		DeclarationModifierContext _localctx = new DeclarationModifierContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_declarationModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			_la = _input.LA(1);
			if ( !(((((_la - 54)) & ~0x3f) == 0 && ((1L << (_la - 54)) & ((1L << (CLASS - 54)) | (1L << (FINAL - 54)) | (1L << (CONVENIENCE - 54)) | (1L << (DYNAMIC - 54)) | (1L << (INFIX - 54)) | (1L << (LAZY - 54)) | (1L << (OPTIONAL - 54)) | (1L << (OVERRIDE - 54)) | (1L << (POSTFIX - 54)) | (1L << (PREFIX - 54)) | (1L << (REQUIRED - 54)) | (1L << (UNOWNED - 54)) | (1L << (WEAK - 54)) | (1L << (STATIC - 54)))) != 0)) ) {
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

	public static class FunctionSignatureContext extends ParserRuleContext {
		public ParameterClauseContext parameterClause() {
			return getRuleContext(ParameterClauseContext.class,0);
		}
		public TerminalNode THROWS() { return getToken(Swift4Parser.THROWS, 0); }
		public FunctionResultContext functionResult() {
			return getRuleContext(FunctionResultContext.class,0);
		}
		public FunctionSignatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionSignature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).enterFunctionSignature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).exitFunctionSignature(this);
		}
	}

	public final FunctionSignatureContext functionSignature() throws RecognitionException {
		FunctionSignatureContext _localctx = new FunctionSignatureContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_functionSignature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			parameterClause();
			setState(233);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(232);
				match(THROWS);
				}
				break;
			}
			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ARROW) {
				{
				setState(235);
				functionResult();
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

	public static class FunctionResultContext extends ParserRuleContext {
		public TerminalNode ARROW() { return getToken(Swift4Parser.ARROW, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
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
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).enterFunctionResult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).exitFunctionResult(this);
		}
	}

	public final FunctionResultContext functionResult() throws RecognitionException {
		FunctionResultContext _localctx = new FunctionResultContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_functionResult);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			match(ARROW);
			setState(240);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(239);
				attributes();
				}
				break;
			}
			setState(242);
			type();
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
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).enterFunctionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).exitFunctionBody(this);
		}
	}

	public final FunctionBodyContext functionBody() throws RecognitionException {
		FunctionBodyContext _localctx = new FunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_functionBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OpenBrace) {
				{
				setState(244);
				codeBlock();
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

	public static class CodeBlockContext extends ParserRuleContext {
		public TerminalNode OpenBrace() { return getToken(Swift4Parser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(Swift4Parser.CloseBrace, 0); }
		public List<NoisyCodeContext> noisyCode() {
			return getRuleContexts(NoisyCodeContext.class);
		}
		public NoisyCodeContext noisyCode(int i) {
			return getRuleContext(NoisyCodeContext.class,i);
		}
		public List<CodeBlockContext> codeBlock() {
			return getRuleContexts(CodeBlockContext.class);
		}
		public CodeBlockContext codeBlock(int i) {
			return getRuleContext(CodeBlockContext.class,i);
		}
		public CodeBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codeBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).enterCodeBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).exitCodeBlock(this);
		}
	}

	public final CodeBlockContext codeBlock() throws RecognitionException {
		CodeBlockContext _localctx = new CodeBlockContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_codeBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			match(OpenBrace);
			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenBracket) | (1L << CloseBracket) | (1L << OpenParen) | (1L << CloseParen) | (1L << OpenBrace) | (1L << SemiColon) | (1L << Comma) | (1L << Assign) | (1L << QuestionMark) | (1L << Colon) | (1L << Ellipsis) | (1L << Dot) | (1L << PlusPlus) | (1L << Plus) | (1L << Minus) | (1L << BitNot) | (1L << Not) | (1L << Multiply) | (1L << Divide) | (1L << Modulus) | (1L << RightShiftArithmetic) | (1L << LeftShiftArithmetic) | (1L << RightShiftLogical) | (1L << LessThan) | (1L << MoreThan) | (1L << LessThanEquals) | (1L << GreaterThanEquals) | (1L << Equals_) | (1L << NotEquals) | (1L << BitAnd) | (1L << BitXOr) | (1L << BitOr) | (1L << And) | (1L << Or) | (1L << MultiplyAssign) | (1L << DivideAssign) | (1L << ModulusAssign) | (1L << PlusAssign) | (1L << MinusAssign) | (1L << LeftShiftArithmeticAssign) | (1L << RightShiftArithmeticAssign) | (1L << RightShiftLogicalAssign) | (1L << BitAndAssign) | (1L << BitXorAssign) | (1L << BitOrAssign) | (1L << AT) | (1L << ANY) | (1L << IMPORT) | (1L << CLASS) | (1L << BREAK) | (1L << DO) | (1L << INSTANCEOF) | (1L << TYPEOF) | (1L << CASE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (ELSE - 64)) | (1L << (NEW - 64)) | (1L << (VAR - 64)) | (1L << (LET - 64)) | (1L << (FINAL - 64)) | (1L << (CATCH - 64)) | (1L << (FINALLY - 64)) | (1L << (RETURN - 64)) | (1L << (VOID - 64)) | (1L << (UPPERCASEVOID - 64)) | (1L << (CONTINUE - 64)) | (1L << (FOR - 64)) | (1L << (SWITCH - 64)) | (1L << (WHILE - 64)) | (1L << (DEBUGGER - 64)) | (1L << (SELF - 64)) | (1L << (WITH - 64)) | (1L << (DEFAULT - 64)) | (1L << (IF - 64)) | (1L << (THROW - 64)) | (1L << (THROWS - 64)) | (1L << (DELETE - 64)) | (1L << (IN - 64)) | (1L << (TRY - 64)) | (1L << (INOUT - 64)) | (1L << (INDIRECT - 64)) | (1L << (INIT - 64)) | (1L << (PRIVATE - 64)) | (1L << (FILEPRIVATE - 64)) | (1L << (INTERNAL - 64)) | (1L << (PUBLIC - 64)) | (1L << (MUTATING - 64)) | (1L << (CONVENIENCE - 64)) | (1L << (DYNAMIC - 64)) | (1L << (INFIX - 64)) | (1L << (LAZY - 64)) | (1L << (OPTIONAL - 64)) | (1L << (OVERRIDE - 64)) | (1L << (POSTFIX - 64)) | (1L << (PREFIX - 64)) | (1L << (REQUIRED - 64)) | (1L << (UNOWNED - 64)) | (1L << (WEAK - 64)) | (1L << (STATIC - 64)) | (1L << (Identifier - 64)) | (1L << (ANYCHARS - 64)))) != 0)) {
				{
				setState(250);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OpenBracket:
				case CloseBracket:
				case OpenParen:
				case CloseParen:
				case SemiColon:
				case Comma:
				case Assign:
				case QuestionMark:
				case Colon:
				case Ellipsis:
				case Dot:
				case PlusPlus:
				case Plus:
				case Minus:
				case BitNot:
				case Not:
				case Multiply:
				case Divide:
				case Modulus:
				case RightShiftArithmetic:
				case LeftShiftArithmetic:
				case RightShiftLogical:
				case LessThan:
				case MoreThan:
				case LessThanEquals:
				case GreaterThanEquals:
				case Equals_:
				case NotEquals:
				case BitAnd:
				case BitXOr:
				case BitOr:
				case And:
				case Or:
				case MultiplyAssign:
				case DivideAssign:
				case ModulusAssign:
				case PlusAssign:
				case MinusAssign:
				case LeftShiftArithmeticAssign:
				case RightShiftArithmeticAssign:
				case RightShiftLogicalAssign:
				case BitAndAssign:
				case BitXorAssign:
				case BitOrAssign:
				case AT:
				case ANY:
				case IMPORT:
				case CLASS:
				case BREAK:
				case DO:
				case INSTANCEOF:
				case TYPEOF:
				case CASE:
				case ELSE:
				case NEW:
				case VAR:
				case LET:
				case FINAL:
				case CATCH:
				case FINALLY:
				case RETURN:
				case VOID:
				case UPPERCASEVOID:
				case CONTINUE:
				case FOR:
				case SWITCH:
				case WHILE:
				case DEBUGGER:
				case SELF:
				case WITH:
				case DEFAULT:
				case IF:
				case THROW:
				case THROWS:
				case DELETE:
				case IN:
				case TRY:
				case INOUT:
				case INDIRECT:
				case INIT:
				case PRIVATE:
				case FILEPRIVATE:
				case INTERNAL:
				case PUBLIC:
				case MUTATING:
				case CONVENIENCE:
				case DYNAMIC:
				case INFIX:
				case LAZY:
				case OPTIONAL:
				case OVERRIDE:
				case POSTFIX:
				case PREFIX:
				case REQUIRED:
				case UNOWNED:
				case WEAK:
				case STATIC:
				case Identifier:
				case ANYCHARS:
					{
					setState(248);
					noisyCode();
					}
					break;
				case OpenBrace:
					{
					setState(249);
					codeBlock();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(254);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(255);
			match(CloseBrace);
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

	public static class NoisyCodeContext extends ParserRuleContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public FunctionCallExpressionContext functionCallExpression() {
			return getRuleContext(FunctionCallExpressionContext.class,0);
		}
		public NoiseContext noise() {
			return getRuleContext(NoiseContext.class,0);
		}
		public NoisyCodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noisyCode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).enterNoisyCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).exitNoisyCode(this);
		}
	}

	public final NoisyCodeContext noisyCode() throws RecognitionException {
		NoisyCodeContext _localctx = new NoisyCodeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_noisyCode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(257);
				variableDeclaration();
				}
				break;
			case 2:
				{
				setState(258);
				functionCallExpression();
				}
				break;
			case 3:
				{
				setState(259);
				noise();
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

	public static class FunctionCallExpressionContext extends ParserRuleContext {
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public FunctionCallArgumentClauseContext functionCallArgumentClause() {
			return getRuleContext(FunctionCallArgumentClauseContext.class,0);
		}
		public List<PostfixExpressionContext> postfixExpression() {
			return getRuleContexts(PostfixExpressionContext.class);
		}
		public PostfixExpressionContext postfixExpression(int i) {
			return getRuleContext(PostfixExpressionContext.class,i);
		}
		public TerminalNode Dot() { return getToken(Swift4Parser.Dot, 0); }
		public FunctionCallExpressionContext functionCallExpression() {
			return getRuleContext(FunctionCallExpressionContext.class,0);
		}
		public FunctionCallExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCallExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).enterFunctionCallExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).exitFunctionCallExpression(this);
		}
	}

	public final FunctionCallExpressionContext functionCallExpression() throws RecognitionException {
		FunctionCallExpressionContext _localctx = new FunctionCallExpressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_functionCallExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(262);
					postfixExpression(0);
					}
					} 
				}
				setState(267);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			}
			setState(268);
			functionName();
			setState(269);
			functionCallArgumentClause();
			setState(272);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(270);
				match(Dot);
				setState(271);
				functionCallExpression();
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

	public static class FunctionNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FunctionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).enterFunctionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).exitFunctionName(this);
		}
	}

	public final FunctionNameContext functionName() throws RecognitionException {
		FunctionNameContext _localctx = new FunctionNameContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_functionName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
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

	public static class FunctionCallArgumentClauseContext extends ParserRuleContext {
		public TerminalNode OpenParen() { return getToken(Swift4Parser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(Swift4Parser.CloseParen, 0); }
		public FunctionCallArgumentListContext functionCallArgumentList() {
			return getRuleContext(FunctionCallArgumentListContext.class,0);
		}
		public FunctionCallArgumentClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCallArgumentClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).enterFunctionCallArgumentClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).exitFunctionCallArgumentClause(this);
		}
	}

	public final FunctionCallArgumentClauseContext functionCallArgumentClause() throws RecognitionException {
		FunctionCallArgumentClauseContext _localctx = new FunctionCallArgumentClauseContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_functionCallArgumentClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			match(OpenParen);
			setState(278);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(277);
				functionCallArgumentList();
				}
				break;
			}
			setState(280);
			match(CloseParen);
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

	public static class FunctionCallArgumentListContext extends ParserRuleContext {
		public List<FunctionCallArgumentContext> functionCallArgument() {
			return getRuleContexts(FunctionCallArgumentContext.class);
		}
		public FunctionCallArgumentContext functionCallArgument(int i) {
			return getRuleContext(FunctionCallArgumentContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(Swift4Parser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(Swift4Parser.Comma, i);
		}
		public FunctionCallArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCallArgumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).enterFunctionCallArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).exitFunctionCallArgumentList(this);
		}
	}

	public final FunctionCallArgumentListContext functionCallArgumentList() throws RecognitionException {
		FunctionCallArgumentListContext _localctx = new FunctionCallArgumentListContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_functionCallArgumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			functionCallArgument();
			setState(287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(283);
				match(Comma);
				setState(284);
				functionCallArgument();
				}
				}
				setState(289);
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

	public static class FunctionCallArgumentContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParameterNameContext parameterName() {
			return getRuleContext(ParameterNameContext.class,0);
		}
		public TerminalNode Colon() { return getToken(Swift4Parser.Colon, 0); }
		public FunctionCallArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCallArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).enterFunctionCallArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).exitFunctionCallArgument(this);
		}
	}

	public final FunctionCallArgumentContext functionCallArgument() throws RecognitionException {
		FunctionCallArgumentContext _localctx = new FunctionCallArgumentContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_functionCallArgument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(290);
				parameterName();
				setState(291);
				match(Colon);
				}
				break;
			}
			{
			setState(295);
			expression();
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

	public static class ParameterNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ParameterNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).enterParameterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).exitParameterName(this);
		}
	}

	public final ParameterNameContext parameterName() throws RecognitionException {
		ParameterNameContext _localctx = new ParameterNameContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_parameterName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
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

	public static class ExpressionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode And() { return getToken(Swift4Parser.And, 0); }
		public ConstructorCallContext constructorCall() {
			return getRuleContext(ConstructorCallContext.class,0);
		}
		public NoiseContext noise() {
			return getRuleContext(NoiseContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_expression);
		int _la;
		try {
			setState(305);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(300);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==And) {
					{
					setState(299);
					match(And);
					}
				}

				setState(302);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(303);
				constructorCall();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(304);
				noise();
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

	public static class PostfixExpressionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode Dot() { return getToken(Swift4Parser.Dot, 0); }
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public TerminalNode QuestionMark() { return getToken(Swift4Parser.QuestionMark, 0); }
		public TerminalNode Not() { return getToken(Swift4Parser.Not, 0); }
		public TerminalNode SELF() { return getToken(Swift4Parser.SELF, 0); }
		public PostfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).enterPostfixExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).exitPostfixExpression(this);
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
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_postfixExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(308);
			identifier();
			setState(309);
			match(Dot);
			}
			_ctx.stop = _input.LT(-1);
			setState(324);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(322);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
					case 1:
						{
						_localctx = new PostfixExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(311);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(313);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==QuestionMark || _la==Not) {
							{
							setState(312);
							_la = _input.LA(1);
							if ( !(_la==QuestionMark || _la==Not) ) {
							_errHandler.recoverInline(this);
							}
							else {
								if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							}
						}

						setState(315);
						match(Dot);
						}
						break;
					case 2:
						{
						_localctx = new PostfixExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(316);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(317);
						match(Dot);
						setState(318);
						match(SELF);
						}
						break;
					case 3:
						{
						_localctx = new PostfixExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(319);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(320);
						match(Dot);
						setState(321);
						identifier();
						}
						break;
					}
					} 
				}
				setState(326);
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
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class VariableDeclarationContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode VAR() { return getToken(Swift4Parser.VAR, 0); }
		public TerminalNode LET() { return getToken(Swift4Parser.LET, 0); }
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public DeclarationModifiersContext declarationModifiers() {
			return getRuleContext(DeclarationModifiersContext.class,0);
		}
		public TerminalNode Colon() { return getToken(Swift4Parser.Colon, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).exitVariableDeclaration(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(327);
				attributes();
				}
			}

			setState(331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 54)) & ~0x3f) == 0 && ((1L << (_la - 54)) & ((1L << (CLASS - 54)) | (1L << (FINAL - 54)) | (1L << (PRIVATE - 54)) | (1L << (FILEPRIVATE - 54)) | (1L << (INTERNAL - 54)) | (1L << (PUBLIC - 54)) | (1L << (MUTATING - 54)) | (1L << (CONVENIENCE - 54)) | (1L << (DYNAMIC - 54)) | (1L << (INFIX - 54)) | (1L << (LAZY - 54)) | (1L << (OPTIONAL - 54)) | (1L << (OVERRIDE - 54)) | (1L << (POSTFIX - 54)) | (1L << (PREFIX - 54)) | (1L << (REQUIRED - 54)) | (1L << (UNOWNED - 54)) | (1L << (WEAK - 54)) | (1L << (STATIC - 54)))) != 0)) {
				{
				setState(330);
				declarationModifiers();
				}
			}

			setState(333);
			_la = _input.LA(1);
			if ( !(_la==VAR || _la==LET) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(334);
			identifier();
			setState(337);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(335);
				match(Colon);
				setState(336);
				type();
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

	public static class GenericParameterClauseContext extends ParserRuleContext {
		public TerminalNode LessThan() { return getToken(Swift4Parser.LessThan, 0); }
		public GenericParametersContext genericParameters() {
			return getRuleContext(GenericParametersContext.class,0);
		}
		public TerminalNode MoreThan() { return getToken(Swift4Parser.MoreThan, 0); }
		public GenericParameterClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericParameterClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).enterGenericParameterClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).exitGenericParameterClause(this);
		}
	}

	public final GenericParameterClauseContext genericParameterClause() throws RecognitionException {
		GenericParameterClauseContext _localctx = new GenericParameterClauseContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_genericParameterClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			match(LessThan);
			setState(340);
			genericParameters();
			setState(341);
			match(MoreThan);
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

	public static class GenericParametersContext extends ParserRuleContext {
		public List<GenericParameterContext> genericParameter() {
			return getRuleContexts(GenericParameterContext.class);
		}
		public GenericParameterContext genericParameter(int i) {
			return getRuleContext(GenericParameterContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(Swift4Parser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(Swift4Parser.Comma, i);
		}
		public GenericParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).enterGenericParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).exitGenericParameters(this);
		}
	}

	public final GenericParametersContext genericParameters() throws RecognitionException {
		GenericParametersContext _localctx = new GenericParametersContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_genericParameters);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(343);
					genericParameter();
					setState(344);
					match(Comma);
					}
					} 
				}
				setState(350);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			}
			setState(351);
			genericParameter();
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
		public TerminalNode Colon() { return getToken(Swift4Parser.Colon, 0); }
		public TypeidentifierContext typeidentifier() {
			return getRuleContext(TypeidentifierContext.class,0);
		}
		public GenericParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).enterGenericParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).exitGenericParameter(this);
		}
	}

	public final GenericParameterContext genericParameter() throws RecognitionException {
		GenericParameterContext _localctx = new GenericParameterContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_genericParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			typeName();
			setState(356);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(354);
				match(Colon);
				setState(355);
				typeidentifier();
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
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).enterTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).exitTypeName(this);
		}
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_typeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
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

	public static class TypeidentifierContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeidentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeidentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).enterTypeidentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).exitTypeidentifier(this);
		}
	}

	public final TypeidentifierContext typeidentifier() throws RecognitionException {
		TypeidentifierContext _localctx = new TypeidentifierContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_typeidentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
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

	public static class ParameterClauseContext extends ParserRuleContext {
		public TerminalNode OpenParen() { return getToken(Swift4Parser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(Swift4Parser.CloseParen, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public ParameterClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).enterParameterClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).exitParameterClause(this);
		}
	}

	public final ParameterClauseContext parameterClause() throws RecognitionException {
		ParameterClauseContext _localctx = new ParameterClauseContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_parameterClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			match(OpenParen);
			setState(364);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (FOR - 75)) | (1L << (WITH - 75)) | (1L << (IN - 75)) | (1L << (Identifier - 75)))) != 0)) {
				{
				setState(363);
				parameterList();
				}
			}

			setState(366);
			match(CloseParen);
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
		public List<TerminalNode> Comma() { return getTokens(Swift4Parser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(Swift4Parser.Comma, i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).exitParameterList(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_parameterList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(368);
					parameter();
					setState(369);
					match(Comma);
					}
					} 
				}
				setState(375);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			}
			setState(376);
			parameter();
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
		public TerminalNode Colon() { return getToken(Swift4Parser.Colon, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExternalParameternameContext externalParametername() {
			return getRuleContext(ExternalParameternameContext.class,0);
		}
		public TerminalNode INOUT() { return getToken(Swift4Parser.INOUT, 0); }
		public DefaultParamInitializerContext defaultParamInitializer() {
			return getRuleContext(DefaultParamInitializerContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).exitParameter(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(378);
				externalParametername();
				}
				break;
			}
			setState(381);
			localParameterName();
			setState(382);
			match(Colon);
			setState(384);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INOUT) {
				{
				setState(383);
				match(INOUT);
				}
			}

			setState(386);
			type();
			setState(388);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(387);
				defaultParamInitializer();
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

	public static class DefaultParamInitializerContext extends ParserRuleContext {
		public TerminalNode Assign() { return getToken(Swift4Parser.Assign, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DefaultParamInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultParamInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).enterDefaultParamInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).exitDefaultParamInitializer(this);
		}
	}

	public final DefaultParamInitializerContext defaultParamInitializer() throws RecognitionException {
		DefaultParamInitializerContext _localctx = new DefaultParamInitializerContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_defaultParamInitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			match(Assign);
			setState(391);
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

	public static class VariableInitializerContext extends ParserRuleContext {
		public TerminalNode Assign() { return getToken(Swift4Parser.Assign, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).enterVariableInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).exitVariableInitializer(this);
		}
	}

	public final VariableInitializerContext variableInitializer() throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_variableInitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			match(Assign);
			setState(394);
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

	public static class ConstructorCallContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode OpenParen() { return getToken(Swift4Parser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(Swift4Parser.CloseParen, 0); }
		public ConstructorCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).enterConstructorCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).exitConstructorCall(this);
		}
	}

	public final ConstructorCallContext constructorCall() throws RecognitionException {
		ConstructorCallContext _localctx = new ConstructorCallContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_constructorCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			type();
			setState(397);
			match(OpenParen);
			setState(398);
			match(CloseParen);
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

	public static class TypeContext extends ParserRuleContext {
		public TypeidentifierContext typeidentifier() {
			return getRuleContext(TypeidentifierContext.class,0);
		}
		public TerminalNode LessThan() { return getToken(Swift4Parser.LessThan, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode MoreThan() { return getToken(Swift4Parser.MoreThan, 0); }
		public TerminalNode QuestionMark() { return getToken(Swift4Parser.QuestionMark, 0); }
		public TerminalNode Not() { return getToken(Swift4Parser.Not, 0); }
		public TerminalNode OpenBracket() { return getToken(Swift4Parser.OpenBracket, 0); }
		public TerminalNode CloseBracket() { return getToken(Swift4Parser.CloseBracket, 0); }
		public FunctionTypeContext functionType() {
			return getRuleContext(FunctionTypeContext.class,0);
		}
		public TerminalNode OpenParen() { return getToken(Swift4Parser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(Swift4Parser.CloseParen, 0); }
		public TupleTypeContext tupleType() {
			return getRuleContext(TupleTypeContext.class,0);
		}
		public DictionaryTypeContext dictionaryType() {
			return getRuleContext(DictionaryTypeContext.class,0);
		}
		public TerminalNode ANY() { return getToken(Swift4Parser.ANY, 0); }
		public TerminalNode SELF() { return getToken(Swift4Parser.SELF, 0); }
		public TerminalNode UPPERCASEVOID() { return getToken(Swift4Parser.UPPERCASEVOID, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_type);
		int _la;
		try {
			setState(442);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(400);
				typeidentifier();
				setState(405);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
				case 1:
					{
					setState(401);
					match(LessThan);
					setState(402);
					type();
					setState(403);
					match(MoreThan);
					}
					break;
				}
				setState(408);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
				case 1:
					{
					setState(407);
					_la = _input.LA(1);
					if ( !(_la==QuestionMark || _la==Not) ) {
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
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(410);
				match(OpenBracket);
				setState(411);
				type();
				setState(412);
				match(CloseBracket);
				setState(414);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
				case 1:
					{
					setState(413);
					_la = _input.LA(1);
					if ( !(_la==QuestionMark || _la==Not) ) {
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
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(416);
				functionType();
				setState(418);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
				case 1:
					{
					setState(417);
					_la = _input.LA(1);
					if ( !(_la==QuestionMark || _la==Not) ) {
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
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(420);
				match(OpenParen);
				setState(422);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenBracket) | (1L << OpenParen) | (1L << AT) | (1L << ANY))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (UPPERCASEVOID - 73)) | (1L << (FOR - 73)) | (1L << (SELF - 73)) | (1L << (WITH - 73)) | (1L << (IN - 73)) | (1L << (Identifier - 73)))) != 0)) {
					{
					setState(421);
					type();
					}
				}

				setState(424);
				match(CloseParen);
				setState(426);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
				case 1:
					{
					setState(425);
					_la = _input.LA(1);
					if ( !(_la==QuestionMark || _la==Not) ) {
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
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(428);
				tupleType();
				setState(430);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
				case 1:
					{
					setState(429);
					_la = _input.LA(1);
					if ( !(_la==QuestionMark || _la==Not) ) {
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
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(432);
				dictionaryType();
				setState(434);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
				case 1:
					{
					setState(433);
					_la = _input.LA(1);
					if ( !(_la==QuestionMark || _la==Not) ) {
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
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(436);
				match(ANY);
				setState(438);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
				case 1:
					{
					setState(437);
					_la = _input.LA(1);
					if ( !(_la==QuestionMark || _la==Not) ) {
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
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(440);
				match(SELF);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(441);
				match(UPPERCASEVOID);
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

	public static class DictionaryTypeContext extends ParserRuleContext {
		public TerminalNode OpenBracket() { return getToken(Swift4Parser.OpenBracket, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TerminalNode Colon() { return getToken(Swift4Parser.Colon, 0); }
		public TerminalNode CloseBracket() { return getToken(Swift4Parser.CloseBracket, 0); }
		public DictionaryTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictionaryType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).enterDictionaryType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).exitDictionaryType(this);
		}
	}

	public final DictionaryTypeContext dictionaryType() throws RecognitionException {
		DictionaryTypeContext _localctx = new DictionaryTypeContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_dictionaryType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
			match(OpenBracket);
			setState(445);
			type();
			setState(446);
			match(Colon);
			setState(447);
			type();
			setState(448);
			match(CloseBracket);
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

	public static class FunctionTypeContext extends ParserRuleContext {
		public FunctionTypeArgumentClauseContext functionTypeArgumentClause() {
			return getRuleContext(FunctionTypeArgumentClauseContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(Swift4Parser.ARROW, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public TerminalNode THROWS() { return getToken(Swift4Parser.THROWS, 0); }
		public FunctionTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).enterFunctionType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).exitFunctionType(this);
		}
	}

	public final FunctionTypeContext functionType() throws RecognitionException {
		FunctionTypeContext _localctx = new FunctionTypeContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_functionType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(450);
				attributes();
				}
			}

			setState(453);
			functionTypeArgumentClause();
			setState(455);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(454);
				match(THROWS);
				}
			}

			setState(457);
			match(ARROW);
			setState(458);
			type();
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

	public static class FunctionTypeArgumentClauseContext extends ParserRuleContext {
		public TerminalNode OpenParen() { return getToken(Swift4Parser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(Swift4Parser.CloseParen, 0); }
		public FunctionTypeArgumentsContext functionTypeArguments() {
			return getRuleContext(FunctionTypeArgumentsContext.class,0);
		}
		public TerminalNode Ellipsis() { return getToken(Swift4Parser.Ellipsis, 0); }
		public FunctionTypeArgumentClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionTypeArgumentClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).enterFunctionTypeArgumentClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).exitFunctionTypeArgumentClause(this);
		}
	}

	public final FunctionTypeArgumentClauseContext functionTypeArgumentClause() throws RecognitionException {
		FunctionTypeArgumentClauseContext _localctx = new FunctionTypeArgumentClauseContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_functionTypeArgumentClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			match(OpenParen);
			setState(465);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenBracket) | (1L << OpenParen) | (1L << AT) | (1L << ANY))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (UPPERCASEVOID - 73)) | (1L << (FOR - 73)) | (1L << (SELF - 73)) | (1L << (WITH - 73)) | (1L << (IN - 73)) | (1L << (INOUT - 73)) | (1L << (Identifier - 73)))) != 0)) {
				{
				setState(461);
				functionTypeArguments();
				setState(463);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Ellipsis) {
					{
					setState(462);
					match(Ellipsis);
					}
				}

				}
			}

			setState(467);
			match(CloseParen);
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

	public static class FunctionTypeArgumentsContext extends ParserRuleContext {
		public List<FunctionTypeArgumentContext> functionTypeArgument() {
			return getRuleContexts(FunctionTypeArgumentContext.class);
		}
		public FunctionTypeArgumentContext functionTypeArgument(int i) {
			return getRuleContext(FunctionTypeArgumentContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(Swift4Parser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(Swift4Parser.Comma, i);
		}
		public FunctionTypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionTypeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).enterFunctionTypeArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).exitFunctionTypeArguments(this);
		}
	}

	public final FunctionTypeArgumentsContext functionTypeArguments() throws RecognitionException {
		FunctionTypeArgumentsContext _localctx = new FunctionTypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_functionTypeArguments);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(474);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(469);
					functionTypeArgument();
					setState(470);
					match(Comma);
					}
					} 
				}
				setState(476);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			}
			setState(477);
			functionTypeArgument();
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

	public static class FunctionTypeArgumentContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public TerminalNode INOUT() { return getToken(Swift4Parser.INOUT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode Colon() { return getToken(Swift4Parser.Colon, 0); }
		public FunctionTypeArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionTypeArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).enterFunctionTypeArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).exitFunctionTypeArgument(this);
		}
	}

	public final FunctionTypeArgumentContext functionTypeArgument() throws RecognitionException {
		FunctionTypeArgumentContext _localctx = new FunctionTypeArgumentContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_functionTypeArgument);
		int _la;
		try {
			setState(493);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(480);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
				case 1:
					{
					setState(479);
					attributes();
					}
					break;
				}
				setState(483);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INOUT) {
					{
					setState(482);
					match(INOUT);
					}
				}

				setState(485);
				type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(486);
				identifier();
				setState(487);
				match(Colon);
				setState(489);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INOUT) {
					{
					setState(488);
					match(INOUT);
					}
				}

				setState(491);
				type();
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

	public static class TupleTypeContext extends ParserRuleContext {
		public TerminalNode OpenParen() { return getToken(Swift4Parser.OpenParen, 0); }
		public TupleElementContext tupleElement() {
			return getRuleContext(TupleElementContext.class,0);
		}
		public TerminalNode Comma() { return getToken(Swift4Parser.Comma, 0); }
		public TupleElementsContext tupleElements() {
			return getRuleContext(TupleElementsContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(Swift4Parser.CloseParen, 0); }
		public TupleTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tupleType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).enterTupleType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).exitTupleType(this);
		}
	}

	public final TupleTypeContext tupleType() throws RecognitionException {
		TupleTypeContext _localctx = new TupleTypeContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_tupleType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(495);
			match(OpenParen);
			setState(496);
			tupleElement();
			setState(497);
			match(Comma);
			setState(498);
			tupleElements();
			setState(499);
			match(CloseParen);
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

	public static class TupleElementsContext extends ParserRuleContext {
		public List<TupleElementContext> tupleElement() {
			return getRuleContexts(TupleElementContext.class);
		}
		public TupleElementContext tupleElement(int i) {
			return getRuleContext(TupleElementContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(Swift4Parser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(Swift4Parser.Comma, i);
		}
		public TupleElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tupleElements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).enterTupleElements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).exitTupleElements(this);
		}
	}

	public final TupleElementsContext tupleElements() throws RecognitionException {
		TupleElementsContext _localctx = new TupleElementsContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_tupleElements);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(506);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(501);
					tupleElement();
					setState(502);
					match(Comma);
					}
					} 
				}
				setState(508);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
			}
			setState(509);
			tupleElement();
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

	public static class TupleElementContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode Colon() { return getToken(Swift4Parser.Colon, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode INOUT() { return getToken(Swift4Parser.INOUT, 0); }
		public TupleElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tupleElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).enterTupleElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).exitTupleElement(this);
		}
	}

	public final TupleElementContext tupleElement() throws RecognitionException {
		TupleElementContext _localctx = new TupleElementContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_tupleElement);
		int _la;
		try {
			setState(519);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(511);
				identifier();
				setState(512);
				match(Colon);
				setState(514);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INOUT) {
					{
					setState(513);
					match(INOUT);
					}
				}

				setState(516);
				type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(518);
				type();
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

	public static class ExternalParameternameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExternalParameternameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_externalParametername; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).enterExternalParametername(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).exitExternalParametername(this);
		}
	}

	public final ExternalParameternameContext externalParametername() throws RecognitionException {
		ExternalParameternameContext _localctx = new ExternalParameternameContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_externalParametername);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(521);
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
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).enterLocalParameterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).exitLocalParameterName(this);
		}
	}

	public final LocalParameterNameContext localParameterName() throws RecognitionException {
		LocalParameterNameContext _localctx = new LocalParameterNameContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_localParameterName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(523);
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
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).enterAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).exitAttributes(this);
		}
	}

	public final AttributesContext attributes() throws RecognitionException {
		AttributesContext _localctx = new AttributesContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_attributes);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(526); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(525);
					attribute();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(528); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
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

	public static class AttributeContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(Swift4Parser.AT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AttributeArgumentsClauseContext attributeArgumentsClause() {
			return getRuleContext(AttributeArgumentsClauseContext.class,0);
		}
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).exitAttribute(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(530);
			match(AT);
			setState(531);
			identifier();
			setState(533);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				{
				setState(532);
				attributeArgumentsClause();
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

	public static class AttributeArgumentsClauseContext extends ParserRuleContext {
		public TerminalNode OpenParen() { return getToken(Swift4Parser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(Swift4Parser.CloseParen, 0); }
		public BalancedTokensContext balancedTokens() {
			return getRuleContext(BalancedTokensContext.class,0);
		}
		public AttributeArgumentsClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeArgumentsClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).enterAttributeArgumentsClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).exitAttributeArgumentsClause(this);
		}
	}

	public final AttributeArgumentsClauseContext attributeArgumentsClause() throws RecognitionException {
		AttributeArgumentsClauseContext _localctx = new AttributeArgumentsClauseContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_attributeArgumentsClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(535);
			match(OpenParen);
			setState(537);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				{
				setState(536);
				balancedTokens();
				}
				break;
			}
			setState(539);
			match(CloseParen);
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
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).enterBalancedTokens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).exitBalancedTokens(this);
		}
	}

	public final BalancedTokensContext balancedTokens() throws RecognitionException {
		BalancedTokensContext _localctx = new BalancedTokensContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_balancedTokens);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(542); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(541);
					balancedToken();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(544); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
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

	public static class BalancedTokenContext extends ParserRuleContext {
		public TerminalNode OpenParen() { return getToken(Swift4Parser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(Swift4Parser.CloseParen, 0); }
		public BalancedTokensContext balancedTokens() {
			return getRuleContext(BalancedTokensContext.class,0);
		}
		public TerminalNode OpenBrace() { return getToken(Swift4Parser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(Swift4Parser.CloseBrace, 0); }
		public TerminalNode OpenBracket() { return getToken(Swift4Parser.OpenBracket, 0); }
		public TerminalNode CloseBracket() { return getToken(Swift4Parser.CloseBracket, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public SpecialCharacterContext specialCharacter() {
			return getRuleContext(SpecialCharacterContext.class,0);
		}
		public BalancedTokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_balancedToken; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).enterBalancedToken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).exitBalancedToken(this);
		}
	}

	public final BalancedTokenContext balancedToken() throws RecognitionException {
		BalancedTokenContext _localctx = new BalancedTokenContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_balancedToken);
		int _la;
		try {
			setState(563);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(546);
				match(OpenParen);
				setState(548);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
				case 1:
					{
					setState(547);
					balancedTokens();
					}
					break;
				}
				setState(550);
				match(CloseParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(551);
				match(OpenBrace);
				setState(553);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenBracket) | (1L << CloseBracket) | (1L << OpenParen) | (1L << CloseParen) | (1L << OpenBrace) | (1L << SemiColon) | (1L << Comma) | (1L << Assign) | (1L << QuestionMark) | (1L << Colon) | (1L << Ellipsis) | (1L << Dot) | (1L << PlusPlus) | (1L << Plus) | (1L << Minus) | (1L << BitNot) | (1L << Not) | (1L << Multiply) | (1L << Divide) | (1L << Modulus) | (1L << RightShiftArithmetic) | (1L << LeftShiftArithmetic) | (1L << RightShiftLogical) | (1L << LessThan) | (1L << MoreThan) | (1L << LessThanEquals) | (1L << GreaterThanEquals) | (1L << Equals_) | (1L << NotEquals) | (1L << BitAnd) | (1L << BitXOr) | (1L << BitOr) | (1L << And) | (1L << Or) | (1L << MultiplyAssign) | (1L << DivideAssign) | (1L << ModulusAssign) | (1L << PlusAssign) | (1L << MinusAssign) | (1L << LeftShiftArithmeticAssign) | (1L << RightShiftArithmeticAssign) | (1L << RightShiftLogicalAssign) | (1L << BitAndAssign) | (1L << BitXorAssign) | (1L << BitOrAssign))) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (FOR - 75)) | (1L << (WITH - 75)) | (1L << (IN - 75)) | (1L << (Identifier - 75)))) != 0)) {
					{
					setState(552);
					balancedTokens();
					}
				}

				setState(555);
				match(CloseBrace);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(556);
				match(OpenBracket);
				setState(558);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
				case 1:
					{
					setState(557);
					balancedTokens();
					}
					break;
				}
				setState(560);
				match(CloseBracket);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(561);
				identifier();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(562);
				specialCharacter();
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

	public static class TypeDefinitionContext extends ParserRuleContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public StructDeclarationContext structDeclaration() {
			return getRuleContext(StructDeclarationContext.class,0);
		}
		public ProtocolDeclarationContext protocolDeclaration() {
			return getRuleContext(ProtocolDeclarationContext.class,0);
		}
		public ExtensionDefinitionContext extensionDefinition() {
			return getRuleContext(ExtensionDefinitionContext.class,0);
		}
		public TypeDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).enterTypeDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).exitTypeDefinition(this);
		}
	}

	public final TypeDefinitionContext typeDefinition() throws RecognitionException {
		TypeDefinitionContext _localctx = new TypeDefinitionContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_typeDefinition);
		try {
			setState(570);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(565);
				classDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(566);
				enumDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(567);
				structDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(568);
				protocolDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(569);
				extensionDefinition();
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

	public static class ExtensionDefinitionContext extends ParserRuleContext {
		public TerminalNode EXTENSION() { return getToken(Swift4Parser.EXTENSION, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeBodyContext typeBody() {
			return getRuleContext(TypeBodyContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public AccessModifierContext accessModifier() {
			return getRuleContext(AccessModifierContext.class,0);
		}
		public TypeInheritanceClauseContext typeInheritanceClause() {
			return getRuleContext(TypeInheritanceClauseContext.class,0);
		}
		public ExtensionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extensionDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).enterExtensionDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).exitExtensionDefinition(this);
		}
	}

	public final ExtensionDefinitionContext extensionDefinition() throws RecognitionException {
		ExtensionDefinitionContext _localctx = new ExtensionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_extensionDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(573);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(572);
				attributes();
				}
			}

			setState(576);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 92)) & ~0x3f) == 0 && ((1L << (_la - 92)) & ((1L << (PRIVATE - 92)) | (1L << (FILEPRIVATE - 92)) | (1L << (INTERNAL - 92)) | (1L << (PUBLIC - 92)) | (1L << (MUTATING - 92)))) != 0)) {
				{
				setState(575);
				accessModifier();
				}
			}

			setState(578);
			match(EXTENSION);
			setState(579);
			identifier();
			setState(581);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(580);
				typeInheritanceClause();
				}
			}

			setState(583);
			typeBody();
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
		public TerminalNode PROTOCOL() { return getToken(Swift4Parser.PROTOCOL, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeBodyContext typeBody() {
			return getRuleContext(TypeBodyContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public AccessModifierContext accessModifier() {
			return getRuleContext(AccessModifierContext.class,0);
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
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).enterProtocolDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).exitProtocolDeclaration(this);
		}
	}

	public final ProtocolDeclarationContext protocolDeclaration() throws RecognitionException {
		ProtocolDeclarationContext _localctx = new ProtocolDeclarationContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_protocolDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(586);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(585);
				attributes();
				}
			}

			setState(589);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 92)) & ~0x3f) == 0 && ((1L << (_la - 92)) & ((1L << (PRIVATE - 92)) | (1L << (FILEPRIVATE - 92)) | (1L << (INTERNAL - 92)) | (1L << (PUBLIC - 92)) | (1L << (MUTATING - 92)))) != 0)) {
				{
				setState(588);
				accessModifier();
				}
			}

			setState(591);
			match(PROTOCOL);
			setState(592);
			identifier();
			setState(594);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(593);
				typeInheritanceClause();
				}
			}

			setState(596);
			typeBody();
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
		public TerminalNode STRUCT() { return getToken(Swift4Parser.STRUCT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeBodyContext typeBody() {
			return getRuleContext(TypeBodyContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public List<TerminalNode> FINAL() { return getTokens(Swift4Parser.FINAL); }
		public TerminalNode FINAL(int i) {
			return getToken(Swift4Parser.FINAL, i);
		}
		public AccessModifierContext accessModifier() {
			return getRuleContext(AccessModifierContext.class,0);
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
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).enterStructDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).exitStructDeclaration(this);
		}
	}

	public final StructDeclarationContext structDeclaration() throws RecognitionException {
		StructDeclarationContext _localctx = new StructDeclarationContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_structDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(599);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(598);
				attributes();
				}
			}

			setState(602);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				{
				setState(601);
				match(FINAL);
				}
				break;
			}
			setState(605);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 92)) & ~0x3f) == 0 && ((1L << (_la - 92)) & ((1L << (PRIVATE - 92)) | (1L << (FILEPRIVATE - 92)) | (1L << (INTERNAL - 92)) | (1L << (PUBLIC - 92)) | (1L << (MUTATING - 92)))) != 0)) {
				{
				setState(604);
				accessModifier();
				}
			}

			setState(608);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FINAL) {
				{
				setState(607);
				match(FINAL);
				}
			}

			setState(610);
			match(STRUCT);
			setState(611);
			identifier();
			setState(613);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LessThan) {
				{
				setState(612);
				genericParameterClause();
				}
			}

			setState(616);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(615);
				typeInheritanceClause();
				}
			}

			setState(618);
			typeBody();
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
		public UnionStyleEnumContext unionStyleEnum() {
			return getRuleContext(UnionStyleEnumContext.class,0);
		}
		public RawValueStyleEnumContext rawValueStyleEnum() {
			return getRuleContext(RawValueStyleEnumContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public AccessModifierContext accessModifier() {
			return getRuleContext(AccessModifierContext.class,0);
		}
		public EnumDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).enterEnumDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).exitEnumDeclaration(this);
		}
	}

	public final EnumDeclarationContext enumDeclaration() throws RecognitionException {
		EnumDeclarationContext _localctx = new EnumDeclarationContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_enumDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(621);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(620);
				attributes();
				}
			}

			setState(624);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 92)) & ~0x3f) == 0 && ((1L << (_la - 92)) & ((1L << (PRIVATE - 92)) | (1L << (FILEPRIVATE - 92)) | (1L << (INTERNAL - 92)) | (1L << (PUBLIC - 92)) | (1L << (MUTATING - 92)))) != 0)) {
				{
				setState(623);
				accessModifier();
				}
			}

			setState(628);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				{
				setState(626);
				unionStyleEnum();
				}
				break;
			case 2:
				{
				setState(627);
				rawValueStyleEnum();
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

	public static class RawValueStyleEnumContext extends ParserRuleContext {
		public TerminalNode ENUM() { return getToken(Swift4Parser.ENUM, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode OpenBrace() { return getToken(Swift4Parser.OpenBrace, 0); }
		public RawValueStyleEnumMembersContext rawValueStyleEnumMembers() {
			return getRuleContext(RawValueStyleEnumMembersContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(Swift4Parser.CloseBrace, 0); }
		public GenericParameterClauseContext genericParameterClause() {
			return getRuleContext(GenericParameterClauseContext.class,0);
		}
		public TypeInheritanceClauseContext typeInheritanceClause() {
			return getRuleContext(TypeInheritanceClauseContext.class,0);
		}
		public RawValueStyleEnumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rawValueStyleEnum; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).enterRawValueStyleEnum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).exitRawValueStyleEnum(this);
		}
	}

	public final RawValueStyleEnumContext rawValueStyleEnum() throws RecognitionException {
		RawValueStyleEnumContext _localctx = new RawValueStyleEnumContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_rawValueStyleEnum);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(630);
			match(ENUM);
			setState(631);
			identifier();
			setState(633);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LessThan) {
				{
				setState(632);
				genericParameterClause();
				}
			}

			setState(636);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(635);
				typeInheritanceClause();
				}
			}

			setState(638);
			match(OpenBrace);
			setState(639);
			rawValueStyleEnumMembers();
			setState(640);
			match(CloseBrace);
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
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).enterRawValueStyleEnumMembers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).exitRawValueStyleEnumMembers(this);
		}
	}

	public final RawValueStyleEnumMembersContext rawValueStyleEnumMembers() throws RecognitionException {
		RawValueStyleEnumMembersContext _localctx = new RawValueStyleEnumMembersContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_rawValueStyleEnumMembers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(643); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(642);
				rawValueStyleEnumMember();
				}
				}
				setState(645); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & ((1L << (AT - 51)) | (1L << (CLASS - 51)) | (1L << (CASE - 51)) | (1L << (VAR - 51)) | (1L << (LET - 51)) | (1L << (FINAL - 51)) | (1L << (PRIVATE - 51)) | (1L << (FILEPRIVATE - 51)) | (1L << (INTERNAL - 51)) | (1L << (PUBLIC - 51)) | (1L << (MUTATING - 51)) | (1L << (CONVENIENCE - 51)) | (1L << (DYNAMIC - 51)) | (1L << (INFIX - 51)) | (1L << (LAZY - 51)) | (1L << (OPTIONAL - 51)) | (1L << (OVERRIDE - 51)) | (1L << (POSTFIX - 51)) | (1L << (PREFIX - 51)) | (1L << (REQUIRED - 51)) | (1L << (UNOWNED - 51)) | (1L << (WEAK - 51)) | (1L << (STATIC - 51)))) != 0) );
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
		public TerminalNode CASE() { return getToken(Swift4Parser.CASE, 0); }
		public RawValueEnumCaseListContext rawValueEnumCaseList() {
			return getRuleContext(RawValueEnumCaseListContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public TypeVariableDeclarationContext typeVariableDeclaration() {
			return getRuleContext(TypeVariableDeclarationContext.class,0);
		}
		public RawValueStyleEnumMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rawValueStyleEnumMember; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).enterRawValueStyleEnumMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).exitRawValueStyleEnumMember(this);
		}
	}

	public final RawValueStyleEnumMemberContext rawValueStyleEnumMember() throws RecognitionException {
		RawValueStyleEnumMemberContext _localctx = new RawValueStyleEnumMemberContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_rawValueStyleEnumMember);
		int _la;
		try {
			setState(653);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(648);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AT) {
					{
					setState(647);
					attributes();
					}
				}

				setState(650);
				match(CASE);
				setState(651);
				rawValueEnumCaseList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(652);
				typeVariableDeclaration();
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

	public static class RawValueEnumCaseListContext extends ParserRuleContext {
		public List<RawValueEnumCaseContext> rawValueEnumCase() {
			return getRuleContexts(RawValueEnumCaseContext.class);
		}
		public RawValueEnumCaseContext rawValueEnumCase(int i) {
			return getRuleContext(RawValueEnumCaseContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(Swift4Parser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(Swift4Parser.Comma, i);
		}
		public RawValueEnumCaseListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rawValueEnumCaseList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).enterRawValueEnumCaseList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).exitRawValueEnumCaseList(this);
		}
	}

	public final RawValueEnumCaseListContext rawValueEnumCaseList() throws RecognitionException {
		RawValueEnumCaseListContext _localctx = new RawValueEnumCaseListContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_rawValueEnumCaseList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(660);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(655);
					rawValueEnumCase();
					setState(656);
					match(Comma);
					}
					} 
				}
				setState(662);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
			}
			setState(663);
			rawValueEnumCase();
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

	public static class RawValueEnumCaseContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public NoiseContext noise() {
			return getRuleContext(NoiseContext.class,0);
		}
		public RawValueEnumCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rawValueEnumCase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).enterRawValueEnumCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).exitRawValueEnumCase(this);
		}
	}

	public final RawValueEnumCaseContext rawValueEnumCase() throws RecognitionException {
		RawValueEnumCaseContext _localctx = new RawValueEnumCaseContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_rawValueEnumCase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(665);
			identifier();
			setState(667);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				{
				setState(666);
				noise();
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

	public static class UnionStyleEnumContext extends ParserRuleContext {
		public TerminalNode ENUM() { return getToken(Swift4Parser.ENUM, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode OpenBrace() { return getToken(Swift4Parser.OpenBrace, 0); }
		public UnionStyleEnumMembersContext unionStyleEnumMembers() {
			return getRuleContext(UnionStyleEnumMembersContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(Swift4Parser.CloseBrace, 0); }
		public TerminalNode INDIRECT() { return getToken(Swift4Parser.INDIRECT, 0); }
		public GenericParameterClauseContext genericParameterClause() {
			return getRuleContext(GenericParameterClauseContext.class,0);
		}
		public TypeInheritanceClauseContext typeInheritanceClause() {
			return getRuleContext(TypeInheritanceClauseContext.class,0);
		}
		public UnionStyleEnumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unionStyleEnum; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).enterUnionStyleEnum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).exitUnionStyleEnum(this);
		}
	}

	public final UnionStyleEnumContext unionStyleEnum() throws RecognitionException {
		UnionStyleEnumContext _localctx = new UnionStyleEnumContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_unionStyleEnum);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(670);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INDIRECT) {
				{
				setState(669);
				match(INDIRECT);
				}
			}

			setState(672);
			match(ENUM);
			setState(673);
			identifier();
			setState(675);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LessThan) {
				{
				setState(674);
				genericParameterClause();
				}
			}

			setState(678);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(677);
				typeInheritanceClause();
				}
			}

			setState(680);
			match(OpenBrace);
			setState(681);
			unionStyleEnumMembers();
			setState(682);
			match(CloseBrace);
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
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).enterUnionStyleEnumMembers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).exitUnionStyleEnumMembers(this);
		}
	}

	public final UnionStyleEnumMembersContext unionStyleEnumMembers() throws RecognitionException {
		UnionStyleEnumMembersContext _localctx = new UnionStyleEnumMembersContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_unionStyleEnumMembers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(687);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenBracket) | (1L << CloseBracket) | (1L << OpenParen) | (1L << CloseParen) | (1L << SemiColon) | (1L << Comma) | (1L << Assign) | (1L << QuestionMark) | (1L << Colon) | (1L << Ellipsis) | (1L << Dot) | (1L << PlusPlus) | (1L << Plus) | (1L << Minus) | (1L << BitNot) | (1L << Not) | (1L << Multiply) | (1L << Divide) | (1L << Modulus) | (1L << RightShiftArithmetic) | (1L << LeftShiftArithmetic) | (1L << RightShiftLogical) | (1L << LessThan) | (1L << MoreThan) | (1L << LessThanEquals) | (1L << GreaterThanEquals) | (1L << Equals_) | (1L << NotEquals) | (1L << BitAnd) | (1L << BitXOr) | (1L << BitOr) | (1L << And) | (1L << Or) | (1L << MultiplyAssign) | (1L << DivideAssign) | (1L << ModulusAssign) | (1L << PlusAssign) | (1L << MinusAssign) | (1L << LeftShiftArithmeticAssign) | (1L << RightShiftArithmeticAssign) | (1L << RightShiftLogicalAssign) | (1L << BitAndAssign) | (1L << BitXorAssign) | (1L << BitOrAssign) | (1L << AT) | (1L << ANY) | (1L << IMPORT) | (1L << BREAK) | (1L << DO) | (1L << INSTANCEOF) | (1L << TYPEOF) | (1L << CASE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (ELSE - 64)) | (1L << (NEW - 64)) | (1L << (FINAL - 64)) | (1L << (CATCH - 64)) | (1L << (FINALLY - 64)) | (1L << (RETURN - 64)) | (1L << (VOID - 64)) | (1L << (UPPERCASEVOID - 64)) | (1L << (CONTINUE - 64)) | (1L << (FOR - 64)) | (1L << (SWITCH - 64)) | (1L << (WHILE - 64)) | (1L << (DEBUGGER - 64)) | (1L << (SELF - 64)) | (1L << (WITH - 64)) | (1L << (DEFAULT - 64)) | (1L << (IF - 64)) | (1L << (THROW - 64)) | (1L << (THROWS - 64)) | (1L << (DELETE - 64)) | (1L << (IN - 64)) | (1L << (TRY - 64)) | (1L << (INOUT - 64)) | (1L << (INDIRECT - 64)) | (1L << (INIT - 64)) | (1L << (CONVENIENCE - 64)) | (1L << (DYNAMIC - 64)) | (1L << (INFIX - 64)) | (1L << (LAZY - 64)) | (1L << (OPTIONAL - 64)) | (1L << (OVERRIDE - 64)) | (1L << (POSTFIX - 64)) | (1L << (PREFIX - 64)) | (1L << (REQUIRED - 64)) | (1L << (UNOWNED - 64)) | (1L << (WEAK - 64)) | (1L << (STATIC - 64)) | (1L << (Identifier - 64)) | (1L << (ANYCHARS - 64)))) != 0)) {
				{
				{
				setState(684);
				unionStyleEnumMember();
				}
				}
				setState(689);
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

	public static class UnionStyleEnumMemberContext extends ParserRuleContext {
		public List<NoiseContext> noise() {
			return getRuleContexts(NoiseContext.class);
		}
		public NoiseContext noise(int i) {
			return getRuleContext(NoiseContext.class,i);
		}
		public List<CaseClauseContext> caseClause() {
			return getRuleContexts(CaseClauseContext.class);
		}
		public CaseClauseContext caseClause(int i) {
			return getRuleContext(CaseClauseContext.class,i);
		}
		public UnionStyleEnumMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unionStyleEnumMember; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).enterUnionStyleEnumMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).exitUnionStyleEnumMember(this);
		}
	}

	public final UnionStyleEnumMemberContext unionStyleEnumMember() throws RecognitionException {
		UnionStyleEnumMemberContext _localctx = new UnionStyleEnumMemberContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_unionStyleEnumMember);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(692); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(692);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
					case 1:
						{
						setState(690);
						noise();
						}
						break;
					case 2:
						{
						setState(691);
						caseClause();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(694); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
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

	public static class CaseClauseContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(Swift4Parser.CASE, 0); }
		public EnumCaseListContext enumCaseList() {
			return getRuleContext(EnumCaseListContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public TerminalNode INDIRECT() { return getToken(Swift4Parser.INDIRECT, 0); }
		public CaseClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).enterCaseClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).exitCaseClause(this);
		}
	}

	public final CaseClauseContext caseClause() throws RecognitionException {
		CaseClauseContext _localctx = new CaseClauseContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_caseClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(697);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(696);
				attributes();
				}
			}

			setState(700);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INDIRECT) {
				{
				setState(699);
				match(INDIRECT);
				}
			}

			setState(702);
			match(CASE);
			setState(703);
			enumCaseList();
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

	public static class EnumCaseListContext extends ParserRuleContext {
		public List<EnumCaseContext> enumCase() {
			return getRuleContexts(EnumCaseContext.class);
		}
		public EnumCaseContext enumCase(int i) {
			return getRuleContext(EnumCaseContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(Swift4Parser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(Swift4Parser.Comma, i);
		}
		public EnumCaseListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumCaseList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).enterEnumCaseList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).exitEnumCaseList(this);
		}
	}

	public final EnumCaseListContext enumCaseList() throws RecognitionException {
		EnumCaseListContext _localctx = new EnumCaseListContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_enumCaseList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(710);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(705);
					enumCase();
					setState(706);
					match(Comma);
					}
					} 
				}
				setState(712);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
			}
			setState(713);
			enumCase();
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

	public static class EnumCaseContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TupleTypeContext tupleType() {
			return getRuleContext(TupleTypeContext.class,0);
		}
		public EnumCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumCase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).enterEnumCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).exitEnumCase(this);
		}
	}

	public final EnumCaseContext enumCase() throws RecognitionException {
		EnumCaseContext _localctx = new EnumCaseContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_enumCase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(715);
			identifier();
			setState(717);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				{
				setState(716);
				tupleType();
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

	public static class ImportStatementContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(Swift4Parser.IMPORT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ImportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).enterImportStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).exitImportStatement(this);
		}
	}

	public final ImportStatementContext importStatement() throws RecognitionException {
		ImportStatementContext _localctx = new ImportStatementContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_importStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(719);
			match(IMPORT);
			setState(720);
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

	public static class ClassDeclarationContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(Swift4Parser.CLASS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeBodyContext typeBody() {
			return getRuleContext(TypeBodyContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public List<TerminalNode> FINAL() { return getTokens(Swift4Parser.FINAL); }
		public TerminalNode FINAL(int i) {
			return getToken(Swift4Parser.FINAL, i);
		}
		public AccessModifierContext accessModifier() {
			return getRuleContext(AccessModifierContext.class,0);
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
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).exitClassDeclaration(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(723);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(722);
				attributes();
				}
			}

			setState(726);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
			case 1:
				{
				setState(725);
				match(FINAL);
				}
				break;
			}
			setState(729);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 92)) & ~0x3f) == 0 && ((1L << (_la - 92)) & ((1L << (PRIVATE - 92)) | (1L << (FILEPRIVATE - 92)) | (1L << (INTERNAL - 92)) | (1L << (PUBLIC - 92)) | (1L << (MUTATING - 92)))) != 0)) {
				{
				setState(728);
				accessModifier();
				}
			}

			setState(732);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FINAL) {
				{
				setState(731);
				match(FINAL);
				}
			}

			setState(734);
			match(CLASS);
			setState(735);
			identifier();
			setState(737);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LessThan) {
				{
				setState(736);
				genericParameterClause();
				}
			}

			setState(740);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(739);
				typeInheritanceClause();
				}
			}

			setState(742);
			typeBody();
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
		public TerminalNode Colon() { return getToken(Swift4Parser.Colon, 0); }
		public TypeInheritancesContext typeInheritances() {
			return getRuleContext(TypeInheritancesContext.class,0);
		}
		public TypeInheritanceClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeInheritanceClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).enterTypeInheritanceClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).exitTypeInheritanceClause(this);
		}
	}

	public final TypeInheritanceClauseContext typeInheritanceClause() throws RecognitionException {
		TypeInheritanceClauseContext _localctx = new TypeInheritanceClauseContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_typeInheritanceClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(744);
			match(Colon);
			setState(745);
			typeInheritances();
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

	public static class TypeInheritancesContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(Swift4Parser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(Swift4Parser.Comma, i);
		}
		public TypeInheritancesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeInheritances; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).enterTypeInheritances(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).exitTypeInheritances(this);
		}
	}

	public final TypeInheritancesContext typeInheritances() throws RecognitionException {
		TypeInheritancesContext _localctx = new TypeInheritancesContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_typeInheritances);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(752);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,115,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(747);
					identifier();
					setState(748);
					match(Comma);
					}
					} 
				}
				setState(754);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,115,_ctx);
			}
			setState(755);
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

	public static class TypeBodyContext extends ParserRuleContext {
		public TerminalNode OpenBrace() { return getToken(Swift4Parser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(Swift4Parser.CloseBrace, 0); }
		public List<FunctionDeclarationContext> functionDeclaration() {
			return getRuleContexts(FunctionDeclarationContext.class);
		}
		public FunctionDeclarationContext functionDeclaration(int i) {
			return getRuleContext(FunctionDeclarationContext.class,i);
		}
		public List<InitializerDeclarationContext> initializerDeclaration() {
			return getRuleContexts(InitializerDeclarationContext.class);
		}
		public InitializerDeclarationContext initializerDeclaration(int i) {
			return getRuleContext(InitializerDeclarationContext.class,i);
		}
		public List<TypeVariableDeclarationContext> typeVariableDeclaration() {
			return getRuleContexts(TypeVariableDeclarationContext.class);
		}
		public TypeVariableDeclarationContext typeVariableDeclaration(int i) {
			return getRuleContext(TypeVariableDeclarationContext.class,i);
		}
		public List<TypeDefinitionContext> typeDefinition() {
			return getRuleContexts(TypeDefinitionContext.class);
		}
		public TypeDefinitionContext typeDefinition(int i) {
			return getRuleContext(TypeDefinitionContext.class,i);
		}
		public TypeBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).enterTypeBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).exitTypeBody(this);
		}
	}

	public final TypeBodyContext typeBody() throws RecognitionException {
		TypeBodyContext _localctx = new TypeBodyContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_typeBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(757);
			match(OpenBrace);
			setState(764);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & ((1L << (AT - 51)) | (1L << (CLASS - 51)) | (1L << (ENUM - 51)) | (1L << (EXTENSION - 51)) | (1L << (PROTOCOL - 51)) | (1L << (STRUCT - 51)) | (1L << (VAR - 51)) | (1L << (LET - 51)) | (1L << (FINAL - 51)) | (1L << (FUNC - 51)) | (1L << (INDIRECT - 51)) | (1L << (INIT - 51)) | (1L << (PRIVATE - 51)) | (1L << (FILEPRIVATE - 51)) | (1L << (INTERNAL - 51)) | (1L << (PUBLIC - 51)) | (1L << (MUTATING - 51)) | (1L << (CONVENIENCE - 51)) | (1L << (DYNAMIC - 51)) | (1L << (INFIX - 51)) | (1L << (LAZY - 51)) | (1L << (OPTIONAL - 51)) | (1L << (OVERRIDE - 51)) | (1L << (POSTFIX - 51)) | (1L << (PREFIX - 51)) | (1L << (REQUIRED - 51)) | (1L << (UNOWNED - 51)) | (1L << (WEAK - 51)) | (1L << (STATIC - 51)))) != 0)) {
				{
				setState(762);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
				case 1:
					{
					setState(758);
					functionDeclaration();
					}
					break;
				case 2:
					{
					setState(759);
					initializerDeclaration();
					}
					break;
				case 3:
					{
					setState(760);
					typeVariableDeclaration();
					}
					break;
				case 4:
					{
					setState(761);
					typeDefinition();
					}
					break;
				}
				}
				setState(766);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(767);
			match(CloseBrace);
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

	public static class NoiseContext extends ParserRuleContext {
		public List<TerminalNode> ANYCHARS() { return getTokens(Swift4Parser.ANYCHARS); }
		public TerminalNode ANYCHARS(int i) {
			return getToken(Swift4Parser.ANYCHARS, i);
		}
		public List<KeywordNoiseContext> keywordNoise() {
			return getRuleContexts(KeywordNoiseContext.class);
		}
		public KeywordNoiseContext keywordNoise(int i) {
			return getRuleContext(KeywordNoiseContext.class,i);
		}
		public List<SpecialCharacterContext> specialCharacter() {
			return getRuleContexts(SpecialCharacterContext.class);
		}
		public SpecialCharacterContext specialCharacter(int i) {
			return getRuleContext(SpecialCharacterContext.class,i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public NoiseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noise; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).enterNoise(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).exitNoise(this);
		}
	}

	public final NoiseContext noise() throws RecognitionException {
		NoiseContext _localctx = new NoiseContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_noise);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(773); 
			_errHandler.sync(this);
			_alt = 1+1;
			do {
				switch (_alt) {
				case 1+1:
					{
					setState(773);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
					case 1:
						{
						setState(769);
						match(ANYCHARS);
						}
						break;
					case 2:
						{
						setState(770);
						keywordNoise();
						}
						break;
					case 3:
						{
						setState(771);
						specialCharacter();
						}
						break;
					case 4:
						{
						setState(772);
						identifier();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(775); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
			} while ( _alt!=1 && _alt!= ATN.INVALID_ALT_NUMBER );
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

	public static class TypeVariableDeclarationContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode VAR() { return getToken(Swift4Parser.VAR, 0); }
		public TerminalNode LET() { return getToken(Swift4Parser.LET, 0); }
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public DeclarationModifiersContext declarationModifiers() {
			return getRuleContext(DeclarationModifiersContext.class,0);
		}
		public TerminalNode Colon() { return getToken(Swift4Parser.Colon, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public NoiseContext noise() {
			return getRuleContext(NoiseContext.class,0);
		}
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public TypeVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).enterTypeVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).exitTypeVariableDeclaration(this);
		}
	}

	public final TypeVariableDeclarationContext typeVariableDeclaration() throws RecognitionException {
		TypeVariableDeclarationContext _localctx = new TypeVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_typeVariableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(778);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(777);
				attributes();
				}
			}

			setState(781);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 54)) & ~0x3f) == 0 && ((1L << (_la - 54)) & ((1L << (CLASS - 54)) | (1L << (FINAL - 54)) | (1L << (PRIVATE - 54)) | (1L << (FILEPRIVATE - 54)) | (1L << (INTERNAL - 54)) | (1L << (PUBLIC - 54)) | (1L << (MUTATING - 54)) | (1L << (CONVENIENCE - 54)) | (1L << (DYNAMIC - 54)) | (1L << (INFIX - 54)) | (1L << (LAZY - 54)) | (1L << (OPTIONAL - 54)) | (1L << (OVERRIDE - 54)) | (1L << (POSTFIX - 54)) | (1L << (PREFIX - 54)) | (1L << (REQUIRED - 54)) | (1L << (UNOWNED - 54)) | (1L << (WEAK - 54)) | (1L << (STATIC - 54)))) != 0)) {
				{
				setState(780);
				declarationModifiers();
				}
			}

			setState(783);
			_la = _input.LA(1);
			if ( !(_la==VAR || _la==LET) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(784);
			identifier();
			setState(787);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
			case 1:
				{
				setState(785);
				match(Colon);
				setState(786);
				type();
				}
				break;
			}
			setState(790);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
			case 1:
				{
				setState(789);
				variableInitializer();
				}
				break;
			}
			setState(793);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
			case 1:
				{
				setState(792);
				noise();
				}
				break;
			}
			setState(796);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OpenBrace) {
				{
				setState(795);
				codeBlock();
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

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Swift4Parser.Identifier, 0); }
		public TerminalNode FOR() { return getToken(Swift4Parser.FOR, 0); }
		public TerminalNode IN() { return getToken(Swift4Parser.IN, 0); }
		public TerminalNode WITH() { return getToken(Swift4Parser.WITH, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).exitIdentifier(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(798);
			_la = _input.LA(1);
			if ( !(((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (FOR - 75)) | (1L << (WITH - 75)) | (1L << (IN - 75)) | (1L << (Identifier - 75)))) != 0)) ) {
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

	public static class KeywordNoiseContext extends ParserRuleContext {
		public TerminalNode ANY() { return getToken(Swift4Parser.ANY, 0); }
		public TerminalNode INIT() { return getToken(Swift4Parser.INIT, 0); }
		public TerminalNode BREAK() { return getToken(Swift4Parser.BREAK, 0); }
		public TerminalNode IMPORT() { return getToken(Swift4Parser.IMPORT, 0); }
		public TerminalNode DO() { return getToken(Swift4Parser.DO, 0); }
		public TerminalNode INSTANCEOF() { return getToken(Swift4Parser.INSTANCEOF, 0); }
		public TerminalNode TYPEOF() { return getToken(Swift4Parser.TYPEOF, 0); }
		public TerminalNode CASE() { return getToken(Swift4Parser.CASE, 0); }
		public TerminalNode ELSE() { return getToken(Swift4Parser.ELSE, 0); }
		public TerminalNode NEW() { return getToken(Swift4Parser.NEW, 0); }
		public TerminalNode CATCH() { return getToken(Swift4Parser.CATCH, 0); }
		public TerminalNode FINALLY() { return getToken(Swift4Parser.FINALLY, 0); }
		public TerminalNode FINAL() { return getToken(Swift4Parser.FINAL, 0); }
		public TerminalNode RETURN() { return getToken(Swift4Parser.RETURN, 0); }
		public TerminalNode VOID() { return getToken(Swift4Parser.VOID, 0); }
		public TerminalNode UPPERCASEVOID() { return getToken(Swift4Parser.UPPERCASEVOID, 0); }
		public TerminalNode CONTINUE() { return getToken(Swift4Parser.CONTINUE, 0); }
		public TerminalNode FOR() { return getToken(Swift4Parser.FOR, 0); }
		public TerminalNode SWITCH() { return getToken(Swift4Parser.SWITCH, 0); }
		public TerminalNode WHILE() { return getToken(Swift4Parser.WHILE, 0); }
		public TerminalNode DEBUGGER() { return getToken(Swift4Parser.DEBUGGER, 0); }
		public TerminalNode SELF() { return getToken(Swift4Parser.SELF, 0); }
		public TerminalNode WITH() { return getToken(Swift4Parser.WITH, 0); }
		public TerminalNode DEFAULT() { return getToken(Swift4Parser.DEFAULT, 0); }
		public TerminalNode IF() { return getToken(Swift4Parser.IF, 0); }
		public TerminalNode THROW() { return getToken(Swift4Parser.THROW, 0); }
		public TerminalNode THROWS() { return getToken(Swift4Parser.THROWS, 0); }
		public TerminalNode DELETE() { return getToken(Swift4Parser.DELETE, 0); }
		public TerminalNode IN() { return getToken(Swift4Parser.IN, 0); }
		public TerminalNode TRY() { return getToken(Swift4Parser.TRY, 0); }
		public TerminalNode AT() { return getToken(Swift4Parser.AT, 0); }
		public TerminalNode INOUT() { return getToken(Swift4Parser.INOUT, 0); }
		public TerminalNode INDIRECT() { return getToken(Swift4Parser.INDIRECT, 0); }
		public TerminalNode CONVENIENCE() { return getToken(Swift4Parser.CONVENIENCE, 0); }
		public TerminalNode DYNAMIC() { return getToken(Swift4Parser.DYNAMIC, 0); }
		public TerminalNode INFIX() { return getToken(Swift4Parser.INFIX, 0); }
		public TerminalNode LAZY() { return getToken(Swift4Parser.LAZY, 0); }
		public TerminalNode OPTIONAL() { return getToken(Swift4Parser.OPTIONAL, 0); }
		public TerminalNode OVERRIDE() { return getToken(Swift4Parser.OVERRIDE, 0); }
		public TerminalNode POSTFIX() { return getToken(Swift4Parser.POSTFIX, 0); }
		public TerminalNode PREFIX() { return getToken(Swift4Parser.PREFIX, 0); }
		public TerminalNode REQUIRED() { return getToken(Swift4Parser.REQUIRED, 0); }
		public TerminalNode UNOWNED() { return getToken(Swift4Parser.UNOWNED, 0); }
		public TerminalNode WEAK() { return getToken(Swift4Parser.WEAK, 0); }
		public TerminalNode STATIC() { return getToken(Swift4Parser.STATIC, 0); }
		public KeywordNoiseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keywordNoise; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).enterKeywordNoise(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).exitKeywordNoise(this);
		}
	}

	public final KeywordNoiseContext keywordNoise() throws RecognitionException {
		KeywordNoiseContext _localctx = new KeywordNoiseContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_keywordNoise);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(800);
			_la = _input.LA(1);
			if ( !(((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & ((1L << (AT - 51)) | (1L << (ANY - 51)) | (1L << (IMPORT - 51)) | (1L << (BREAK - 51)) | (1L << (DO - 51)) | (1L << (INSTANCEOF - 51)) | (1L << (TYPEOF - 51)) | (1L << (CASE - 51)) | (1L << (ELSE - 51)) | (1L << (NEW - 51)) | (1L << (FINAL - 51)) | (1L << (CATCH - 51)) | (1L << (FINALLY - 51)) | (1L << (RETURN - 51)) | (1L << (VOID - 51)) | (1L << (UPPERCASEVOID - 51)) | (1L << (CONTINUE - 51)) | (1L << (FOR - 51)) | (1L << (SWITCH - 51)) | (1L << (WHILE - 51)) | (1L << (DEBUGGER - 51)) | (1L << (SELF - 51)) | (1L << (WITH - 51)) | (1L << (DEFAULT - 51)) | (1L << (IF - 51)) | (1L << (THROW - 51)) | (1L << (THROWS - 51)) | (1L << (DELETE - 51)) | (1L << (IN - 51)) | (1L << (TRY - 51)) | (1L << (INOUT - 51)) | (1L << (INDIRECT - 51)) | (1L << (INIT - 51)) | (1L << (CONVENIENCE - 51)) | (1L << (DYNAMIC - 51)) | (1L << (INFIX - 51)) | (1L << (LAZY - 51)) | (1L << (OPTIONAL - 51)) | (1L << (OVERRIDE - 51)) | (1L << (POSTFIX - 51)) | (1L << (PREFIX - 51)) | (1L << (REQUIRED - 51)) | (1L << (UNOWNED - 51)) | (1L << (WEAK - 51)) | (1L << (STATIC - 51)))) != 0)) ) {
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

	public static class SpecialCharacterContext extends ParserRuleContext {
		public TerminalNode OpenParen() { return getToken(Swift4Parser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(Swift4Parser.CloseParen, 0); }
		public TerminalNode OpenBracket() { return getToken(Swift4Parser.OpenBracket, 0); }
		public TerminalNode CloseBracket() { return getToken(Swift4Parser.CloseBracket, 0); }
		public TerminalNode SemiColon() { return getToken(Swift4Parser.SemiColon, 0); }
		public TerminalNode Comma() { return getToken(Swift4Parser.Comma, 0); }
		public TerminalNode Assign() { return getToken(Swift4Parser.Assign, 0); }
		public TerminalNode QuestionMark() { return getToken(Swift4Parser.QuestionMark, 0); }
		public TerminalNode Colon() { return getToken(Swift4Parser.Colon, 0); }
		public TerminalNode Ellipsis() { return getToken(Swift4Parser.Ellipsis, 0); }
		public TerminalNode Dot() { return getToken(Swift4Parser.Dot, 0); }
		public TerminalNode Plus() { return getToken(Swift4Parser.Plus, 0); }
		public TerminalNode PlusPlus() { return getToken(Swift4Parser.PlusPlus, 0); }
		public TerminalNode Minus() { return getToken(Swift4Parser.Minus, 0); }
		public TerminalNode BitNot() { return getToken(Swift4Parser.BitNot, 0); }
		public TerminalNode Not() { return getToken(Swift4Parser.Not, 0); }
		public TerminalNode Multiply() { return getToken(Swift4Parser.Multiply, 0); }
		public TerminalNode Divide() { return getToken(Swift4Parser.Divide, 0); }
		public TerminalNode Modulus() { return getToken(Swift4Parser.Modulus, 0); }
		public TerminalNode RightShiftArithmetic() { return getToken(Swift4Parser.RightShiftArithmetic, 0); }
		public TerminalNode LeftShiftArithmetic() { return getToken(Swift4Parser.LeftShiftArithmetic, 0); }
		public TerminalNode RightShiftLogical() { return getToken(Swift4Parser.RightShiftLogical, 0); }
		public TerminalNode LessThan() { return getToken(Swift4Parser.LessThan, 0); }
		public TerminalNode MoreThan() { return getToken(Swift4Parser.MoreThan, 0); }
		public TerminalNode LessThanEquals() { return getToken(Swift4Parser.LessThanEquals, 0); }
		public TerminalNode GreaterThanEquals() { return getToken(Swift4Parser.GreaterThanEquals, 0); }
		public TerminalNode Equals_() { return getToken(Swift4Parser.Equals_, 0); }
		public TerminalNode NotEquals() { return getToken(Swift4Parser.NotEquals, 0); }
		public TerminalNode BitAnd() { return getToken(Swift4Parser.BitAnd, 0); }
		public TerminalNode BitXOr() { return getToken(Swift4Parser.BitXOr, 0); }
		public TerminalNode BitOr() { return getToken(Swift4Parser.BitOr, 0); }
		public TerminalNode And() { return getToken(Swift4Parser.And, 0); }
		public TerminalNode Or() { return getToken(Swift4Parser.Or, 0); }
		public TerminalNode MultiplyAssign() { return getToken(Swift4Parser.MultiplyAssign, 0); }
		public TerminalNode DivideAssign() { return getToken(Swift4Parser.DivideAssign, 0); }
		public TerminalNode ModulusAssign() { return getToken(Swift4Parser.ModulusAssign, 0); }
		public TerminalNode PlusAssign() { return getToken(Swift4Parser.PlusAssign, 0); }
		public TerminalNode MinusAssign() { return getToken(Swift4Parser.MinusAssign, 0); }
		public TerminalNode LeftShiftArithmeticAssign() { return getToken(Swift4Parser.LeftShiftArithmeticAssign, 0); }
		public TerminalNode RightShiftArithmeticAssign() { return getToken(Swift4Parser.RightShiftArithmeticAssign, 0); }
		public TerminalNode RightShiftLogicalAssign() { return getToken(Swift4Parser.RightShiftLogicalAssign, 0); }
		public TerminalNode BitAndAssign() { return getToken(Swift4Parser.BitAndAssign, 0); }
		public TerminalNode BitXorAssign() { return getToken(Swift4Parser.BitXorAssign, 0); }
		public TerminalNode BitOrAssign() { return getToken(Swift4Parser.BitOrAssign, 0); }
		public SpecialCharacterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specialCharacter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).enterSpecialCharacter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).exitSpecialCharacter(this);
		}
	}

	public final SpecialCharacterContext specialCharacter() throws RecognitionException {
		SpecialCharacterContext _localctx = new SpecialCharacterContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_specialCharacter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(802);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenBracket) | (1L << CloseBracket) | (1L << OpenParen) | (1L << CloseParen) | (1L << SemiColon) | (1L << Comma) | (1L << Assign) | (1L << QuestionMark) | (1L << Colon) | (1L << Ellipsis) | (1L << Dot) | (1L << PlusPlus) | (1L << Plus) | (1L << Minus) | (1L << BitNot) | (1L << Not) | (1L << Multiply) | (1L << Divide) | (1L << Modulus) | (1L << RightShiftArithmetic) | (1L << LeftShiftArithmetic) | (1L << RightShiftLogical) | (1L << LessThan) | (1L << MoreThan) | (1L << LessThanEquals) | (1L << GreaterThanEquals) | (1L << Equals_) | (1L << NotEquals) | (1L << BitAnd) | (1L << BitXOr) | (1L << BitOr) | (1L << And) | (1L << Or) | (1L << MultiplyAssign) | (1L << DivideAssign) | (1L << ModulusAssign) | (1L << PlusAssign) | (1L << MinusAssign) | (1L << LeftShiftArithmeticAssign) | (1L << RightShiftArithmeticAssign) | (1L << RightShiftLogicalAssign) | (1L << BitAndAssign) | (1L << BitXorAssign) | (1L << BitOrAssign))) != 0)) ) {
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

	public static class AccessModifierContext extends ParserRuleContext {
		public TerminalNode PRIVATE() { return getToken(Swift4Parser.PRIVATE, 0); }
		public TerminalNode OpenParen() { return getToken(Swift4Parser.OpenParen, 0); }
		public TerminalNode SET() { return getToken(Swift4Parser.SET, 0); }
		public TerminalNode CloseParen() { return getToken(Swift4Parser.CloseParen, 0); }
		public TerminalNode FILEPRIVATE() { return getToken(Swift4Parser.FILEPRIVATE, 0); }
		public TerminalNode INTERNAL() { return getToken(Swift4Parser.INTERNAL, 0); }
		public TerminalNode PUBLIC() { return getToken(Swift4Parser.PUBLIC, 0); }
		public TerminalNode MUTATING() { return getToken(Swift4Parser.MUTATING, 0); }
		public AccessModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).enterAccessModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).exitAccessModifier(this);
		}
	}

	public final AccessModifierContext accessModifier() throws RecognitionException {
		AccessModifierContext _localctx = new AccessModifierContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_accessModifier);
		int _la;
		try {
			setState(824);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRIVATE:
				enterOuterAlt(_localctx, 1);
				{
				setState(804);
				match(PRIVATE);
				setState(808);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OpenParen) {
					{
					setState(805);
					match(OpenParen);
					setState(806);
					match(SET);
					setState(807);
					match(CloseParen);
					}
				}

				}
				break;
			case FILEPRIVATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(810);
				match(FILEPRIVATE);
				setState(814);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OpenParen) {
					{
					setState(811);
					match(OpenParen);
					setState(812);
					match(SET);
					setState(813);
					match(CloseParen);
					}
				}

				}
				break;
			case INTERNAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(816);
				match(INTERNAL);
				setState(820);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OpenParen) {
					{
					setState(817);
					match(OpenParen);
					setState(818);
					match(SET);
					setState(819);
					match(CloseParen);
					}
				}

				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 4);
				{
				setState(822);
				match(PUBLIC);
				}
				break;
			case MUTATING:
				enterOuterAlt(_localctx, 5);
				{
				setState(823);
				match(MUTATING);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 20:
			return postfixExpression_sempred((PostfixExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean postfixExpression_sempred(PostfixExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 2);
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3u\u033d\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\3\2\7\2\u009c\n\2\f\2\16\2\u009f\13\2\3\2"+
		"\3\2\3\2\7\2\u00a4\n\2\f\2\16\2\u00a7\13\2\3\2\5\2\u00aa\n\2\3\3\5\3\u00ad"+
		"\n\3\3\3\5\3\u00b0\n\3\3\3\3\3\3\3\3\3\5\3\u00b6\n\3\3\3\5\3\u00b9\n\3"+
		"\3\3\5\3\u00bc\n\3\3\4\3\4\5\4\u00c0\n\4\3\4\3\4\5\4\u00c4\n\4\3\4\3\4"+
		"\3\5\5\5\u00c9\n\5\3\5\5\5\u00cc\n\5\3\5\3\5\5\5\u00d0\n\5\3\6\3\6\3\6"+
		"\5\6\u00d5\n\6\3\6\3\6\3\6\3\7\5\7\u00db\n\7\3\7\5\7\u00de\n\7\3\7\3\7"+
		"\3\b\3\b\6\b\u00e4\n\b\r\b\16\b\u00e5\3\t\3\t\3\n\3\n\5\n\u00ec\n\n\3"+
		"\n\5\n\u00ef\n\n\3\13\3\13\5\13\u00f3\n\13\3\13\3\13\3\f\5\f\u00f8\n\f"+
		"\3\r\3\r\3\r\7\r\u00fd\n\r\f\r\16\r\u0100\13\r\3\r\3\r\3\16\3\16\3\16"+
		"\5\16\u0107\n\16\3\17\7\17\u010a\n\17\f\17\16\17\u010d\13\17\3\17\3\17"+
		"\3\17\3\17\5\17\u0113\n\17\3\20\3\20\3\21\3\21\5\21\u0119\n\21\3\21\3"+
		"\21\3\22\3\22\3\22\7\22\u0120\n\22\f\22\16\22\u0123\13\22\3\23\3\23\3"+
		"\23\5\23\u0128\n\23\3\23\3\23\3\24\3\24\3\25\5\25\u012f\n\25\3\25\3\25"+
		"\3\25\5\25\u0134\n\25\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u013c\n\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u0145\n\26\f\26\16\26\u0148\13"+
		"\26\3\27\5\27\u014b\n\27\3\27\5\27\u014e\n\27\3\27\3\27\3\27\3\27\5\27"+
		"\u0154\n\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\7\31\u015d\n\31\f\31\16"+
		"\31\u0160\13\31\3\31\3\31\3\32\3\32\3\32\5\32\u0167\n\32\3\33\3\33\3\34"+
		"\3\34\3\35\3\35\5\35\u016f\n\35\3\35\3\35\3\36\3\36\3\36\7\36\u0176\n"+
		"\36\f\36\16\36\u0179\13\36\3\36\3\36\3\37\5\37\u017e\n\37\3\37\3\37\3"+
		"\37\5\37\u0183\n\37\3\37\3\37\5\37\u0187\n\37\3 \3 \3 \3!\3!\3!\3\"\3"+
		"\"\3\"\3\"\3#\3#\3#\3#\3#\5#\u0198\n#\3#\5#\u019b\n#\3#\3#\3#\3#\5#\u01a1"+
		"\n#\3#\3#\5#\u01a5\n#\3#\3#\5#\u01a9\n#\3#\3#\5#\u01ad\n#\3#\3#\5#\u01b1"+
		"\n#\3#\3#\5#\u01b5\n#\3#\3#\5#\u01b9\n#\3#\3#\5#\u01bd\n#\3$\3$\3$\3$"+
		"\3$\3$\3%\5%\u01c6\n%\3%\3%\5%\u01ca\n%\3%\3%\3%\3&\3&\3&\5&\u01d2\n&"+
		"\5&\u01d4\n&\3&\3&\3\'\3\'\3\'\7\'\u01db\n\'\f\'\16\'\u01de\13\'\3\'\3"+
		"\'\3(\5(\u01e3\n(\3(\5(\u01e6\n(\3(\3(\3(\3(\5(\u01ec\n(\3(\3(\5(\u01f0"+
		"\n(\3)\3)\3)\3)\3)\3)\3*\3*\3*\7*\u01fb\n*\f*\16*\u01fe\13*\3*\3*\3+\3"+
		"+\3+\5+\u0205\n+\3+\3+\3+\5+\u020a\n+\3,\3,\3-\3-\3.\6.\u0211\n.\r.\16"+
		".\u0212\3/\3/\3/\5/\u0218\n/\3\60\3\60\5\60\u021c\n\60\3\60\3\60\3\61"+
		"\6\61\u0221\n\61\r\61\16\61\u0222\3\62\3\62\5\62\u0227\n\62\3\62\3\62"+
		"\3\62\5\62\u022c\n\62\3\62\3\62\3\62\5\62\u0231\n\62\3\62\3\62\3\62\5"+
		"\62\u0236\n\62\3\63\3\63\3\63\3\63\3\63\5\63\u023d\n\63\3\64\5\64\u0240"+
		"\n\64\3\64\5\64\u0243\n\64\3\64\3\64\3\64\5\64\u0248\n\64\3\64\3\64\3"+
		"\65\5\65\u024d\n\65\3\65\5\65\u0250\n\65\3\65\3\65\3\65\5\65\u0255\n\65"+
		"\3\65\3\65\3\66\5\66\u025a\n\66\3\66\5\66\u025d\n\66\3\66\5\66\u0260\n"+
		"\66\3\66\5\66\u0263\n\66\3\66\3\66\3\66\5\66\u0268\n\66\3\66\5\66\u026b"+
		"\n\66\3\66\3\66\3\67\5\67\u0270\n\67\3\67\5\67\u0273\n\67\3\67\3\67\5"+
		"\67\u0277\n\67\38\38\38\58\u027c\n8\38\58\u027f\n8\38\38\38\38\39\69\u0286"+
		"\n9\r9\169\u0287\3:\5:\u028b\n:\3:\3:\3:\5:\u0290\n:\3;\3;\3;\7;\u0295"+
		"\n;\f;\16;\u0298\13;\3;\3;\3<\3<\5<\u029e\n<\3=\5=\u02a1\n=\3=\3=\3=\5"+
		"=\u02a6\n=\3=\5=\u02a9\n=\3=\3=\3=\3=\3>\7>\u02b0\n>\f>\16>\u02b3\13>"+
		"\3?\3?\6?\u02b7\n?\r?\16?\u02b8\3@\5@\u02bc\n@\3@\5@\u02bf\n@\3@\3@\3"+
		"@\3A\3A\3A\7A\u02c7\nA\fA\16A\u02ca\13A\3A\3A\3B\3B\5B\u02d0\nB\3C\3C"+
		"\3C\3D\5D\u02d6\nD\3D\5D\u02d9\nD\3D\5D\u02dc\nD\3D\5D\u02df\nD\3D\3D"+
		"\3D\5D\u02e4\nD\3D\5D\u02e7\nD\3D\3D\3E\3E\3E\3F\3F\3F\7F\u02f1\nF\fF"+
		"\16F\u02f4\13F\3F\3F\3G\3G\3G\3G\3G\7G\u02fd\nG\fG\16G\u0300\13G\3G\3"+
		"G\3H\3H\3H\3H\6H\u0308\nH\rH\16H\u0309\3I\5I\u030d\nI\3I\5I\u0310\nI\3"+
		"I\3I\3I\3I\5I\u0316\nI\3I\5I\u0319\nI\3I\5I\u031c\nI\3I\5I\u031f\nI\3"+
		"J\3J\3K\3K\3L\3L\3M\3M\3M\3M\5M\u032b\nM\3M\3M\3M\3M\5M\u0331\nM\3M\3"+
		"M\3M\3M\5M\u0337\nM\3M\3M\5M\u033b\nM\3M\3\u0309\3*N\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhj"+
		"lnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092"+
		"\u0094\u0096\u0098\2\b\3\2DE\4\2\f\f\26\26\5\288FFcn\6\2MMSSYYpp\7\2\65"+
		"\67=CFPR]cn\7\2\3\6\t\20\22\22\24\"%\64\2\u038a\2\u009d\3\2\2\2\4\u00ac"+
		"\3\2\2\2\6\u00bd\3\2\2\2\b\u00c8\3\2\2\2\n\u00d1\3\2\2\2\f\u00da\3\2\2"+
		"\2\16\u00e3\3\2\2\2\20\u00e7\3\2\2\2\22\u00e9\3\2\2\2\24\u00f0\3\2\2\2"+
		"\26\u00f7\3\2\2\2\30\u00f9\3\2\2\2\32\u0106\3\2\2\2\34\u010b\3\2\2\2\36"+
		"\u0114\3\2\2\2 \u0116\3\2\2\2\"\u011c\3\2\2\2$\u0127\3\2\2\2&\u012b\3"+
		"\2\2\2(\u0133\3\2\2\2*\u0135\3\2\2\2,\u014a\3\2\2\2.\u0155\3\2\2\2\60"+
		"\u015e\3\2\2\2\62\u0163\3\2\2\2\64\u0168\3\2\2\2\66\u016a\3\2\2\28\u016c"+
		"\3\2\2\2:\u0177\3\2\2\2<\u017d\3\2\2\2>\u0188\3\2\2\2@\u018b\3\2\2\2B"+
		"\u018e\3\2\2\2D\u01bc\3\2\2\2F\u01be\3\2\2\2H\u01c5\3\2\2\2J\u01ce\3\2"+
		"\2\2L\u01dc\3\2\2\2N\u01ef\3\2\2\2P\u01f1\3\2\2\2R\u01fc\3\2\2\2T\u0209"+
		"\3\2\2\2V\u020b\3\2\2\2X\u020d\3\2\2\2Z\u0210\3\2\2\2\\\u0214\3\2\2\2"+
		"^\u0219\3\2\2\2`\u0220\3\2\2\2b\u0235\3\2\2\2d\u023c\3\2\2\2f\u023f\3"+
		"\2\2\2h\u024c\3\2\2\2j\u0259\3\2\2\2l\u026f\3\2\2\2n\u0278\3\2\2\2p\u0285"+
		"\3\2\2\2r\u028f\3\2\2\2t\u0296\3\2\2\2v\u029b\3\2\2\2x\u02a0\3\2\2\2z"+
		"\u02b1\3\2\2\2|\u02b6\3\2\2\2~\u02bb\3\2\2\2\u0080\u02c8\3\2\2\2\u0082"+
		"\u02cd\3\2\2\2\u0084\u02d1\3\2\2\2\u0086\u02d5\3\2\2\2\u0088\u02ea\3\2"+
		"\2\2\u008a\u02f2\3\2\2\2\u008c\u02f7\3\2\2\2\u008e\u0307\3\2\2\2\u0090"+
		"\u030c\3\2\2\2\u0092\u0320\3\2\2\2\u0094\u0322\3\2\2\2\u0096\u0324\3\2"+
		"\2\2\u0098\u033a\3\2\2\2\u009a\u009c\5\u0084C\2\u009b\u009a\3\2\2\2\u009c"+
		"\u009f\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u00a5\3\2"+
		"\2\2\u009f\u009d\3\2\2\2\u00a0\u00a4\5d\63\2\u00a1\u00a4\5\n\6\2\u00a2"+
		"\u00a4\5\4\3\2\u00a3\u00a0\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a2\3\2"+
		"\2\2\u00a4\u00a7\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6"+
		"\u00a9\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8\u00aa\5\u008eH\2\u00a9\u00a8"+
		"\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\3\3\2\2\2\u00ab\u00ad\5Z.\2\u00ac\u00ab"+
		"\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00af\3\2\2\2\u00ae\u00b0\5\16\b\2"+
		"\u00af\u00ae\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2"+
		"\t\2\2\2\u00b2\u00b5\5\u0092J\2\u00b3\u00b4\7\r\2\2\u00b4\u00b6\5D#\2"+
		"\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b8\3\2\2\2\u00b7\u00b9"+
		"\5\u008eH\2\u00b8\u00b7\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00bb\3\2\2"+
		"\2\u00ba\u00bc\5\30\r\2\u00bb\u00ba\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc"+
		"\5\3\2\2\2\u00bd\u00bf\5\b\5\2\u00be\u00c0\5.\30\2\u00bf\u00be\3\2\2\2"+
		"\u00bf\u00c0\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c3\58\35\2\u00c2\u00c4"+
		"\7W\2\2\u00c3\u00c2\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5"+
		"\u00c6\5\26\f\2\u00c6\7\3\2\2\2\u00c7\u00c9\5Z.\2\u00c8\u00c7\3\2\2\2"+
		"\u00c8\u00c9\3\2\2\2\u00c9\u00cb\3\2\2\2\u00ca\u00cc\5\16\b\2\u00cb\u00ca"+
		"\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00cf\7]\2\2\u00ce"+
		"\u00d0\t\3\2\2\u00cf\u00ce\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\t\3\2\2\2"+
		"\u00d1\u00d2\5\f\7\2\u00d2\u00d4\5\u0092J\2\u00d3\u00d5\5.\30\2\u00d4"+
		"\u00d3\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d7\5\22"+
		"\n\2\u00d7\u00d8\5\26\f\2\u00d8\13\3\2\2\2\u00d9\u00db\5Z.\2\u00da\u00d9"+
		"\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dd\3\2\2\2\u00dc\u00de\5\16\b\2"+
		"\u00dd\u00dc\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e0"+
		"\7Q\2\2\u00e0\r\3\2\2\2\u00e1\u00e4\5\u0098M\2\u00e2\u00e4\5\20\t\2\u00e3"+
		"\u00e1\3\2\2\2\u00e3\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e3\3\2"+
		"\2\2\u00e5\u00e6\3\2\2\2\u00e6\17\3\2\2\2\u00e7\u00e8\t\4\2\2\u00e8\21"+
		"\3\2\2\2\u00e9\u00eb\58\35\2\u00ea\u00ec\7W\2\2\u00eb\u00ea\3\2\2\2\u00eb"+
		"\u00ec\3\2\2\2\u00ec\u00ee\3\2\2\2\u00ed\u00ef\5\24\13\2\u00ee\u00ed\3"+
		"\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\23\3\2\2\2\u00f0\u00f2\7\23\2\2\u00f1"+
		"\u00f3\5Z.\2\u00f2\u00f1\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f4\3\2\2"+
		"\2\u00f4\u00f5\5D#\2\u00f5\25\3\2\2\2\u00f6\u00f8\5\30\r\2\u00f7\u00f6"+
		"\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\27\3\2\2\2\u00f9\u00fe\7\7\2\2\u00fa"+
		"\u00fd\5\32\16\2\u00fb\u00fd\5\30\r\2\u00fc\u00fa\3\2\2\2\u00fc\u00fb"+
		"\3\2\2\2\u00fd\u0100\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff"+
		"\u0101\3\2\2\2\u0100\u00fe\3\2\2\2\u0101\u0102\7\b\2\2\u0102\31\3\2\2"+
		"\2\u0103\u0107\5,\27\2\u0104\u0107\5\34\17\2\u0105\u0107\5\u008eH\2\u0106"+
		"\u0103\3\2\2\2\u0106\u0104\3\2\2\2\u0106\u0105\3\2\2\2\u0107\33\3\2\2"+
		"\2\u0108\u010a\5*\26\2\u0109\u0108\3\2\2\2\u010a\u010d\3\2\2\2\u010b\u0109"+
		"\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010e\3\2\2\2\u010d\u010b\3\2\2\2\u010e"+
		"\u010f\5\36\20\2\u010f\u0112\5 \21\2\u0110\u0111\7\17\2\2\u0111\u0113"+
		"\5\34\17\2\u0112\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113\35\3\2\2\2\u0114"+
		"\u0115\5\u0092J\2\u0115\37\3\2\2\2\u0116\u0118\7\5\2\2\u0117\u0119\5\""+
		"\22\2\u0118\u0117\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011a\3\2\2\2\u011a"+
		"\u011b\7\6\2\2\u011b!\3\2\2\2\u011c\u0121\5$\23\2\u011d\u011e\7\n\2\2"+
		"\u011e\u0120\5$\23\2\u011f\u011d\3\2\2\2\u0120\u0123\3\2\2\2\u0121\u011f"+
		"\3\2\2\2\u0121\u0122\3\2\2\2\u0122#\3\2\2\2\u0123\u0121\3\2\2\2\u0124"+
		"\u0125\5&\24\2\u0125\u0126\7\r\2\2\u0126\u0128\3\2\2\2\u0127\u0124\3\2"+
		"\2\2\u0127\u0128\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012a\5(\25\2\u012a"+
		"%\3\2\2\2\u012b\u012c\5\u0092J\2\u012c\'\3\2\2\2\u012d\u012f\7(\2\2\u012e"+
		"\u012d\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0134\5\u0092"+
		"J\2\u0131\u0134\5B\"\2\u0132\u0134\5\u008eH\2\u0133\u012e\3\2\2\2\u0133"+
		"\u0131\3\2\2\2\u0133\u0132\3\2\2\2\u0134)\3\2\2\2\u0135\u0136\b\26\1\2"+
		"\u0136\u0137\5\u0092J\2\u0137\u0138\7\17\2\2\u0138\u0146\3\2\2\2\u0139"+
		"\u013b\f\6\2\2\u013a\u013c\t\3\2\2\u013b\u013a\3\2\2\2\u013b\u013c\3\2"+
		"\2\2\u013c\u013d\3\2\2\2\u013d\u0145\7\17\2\2\u013e\u013f\f\4\2\2\u013f"+
		"\u0140\7\17\2\2\u0140\u0145\7R\2\2\u0141\u0142\f\3\2\2\u0142\u0143\7\17"+
		"\2\2\u0143\u0145\5\u0092J\2\u0144\u0139\3\2\2\2\u0144\u013e\3\2\2\2\u0144"+
		"\u0141\3\2\2\2\u0145\u0148\3\2\2\2\u0146\u0144\3\2\2\2\u0146\u0147\3\2"+
		"\2\2\u0147+\3\2\2\2\u0148\u0146\3\2\2\2\u0149\u014b\5Z.\2\u014a\u0149"+
		"\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u014d\3\2\2\2\u014c\u014e\5\16\b\2"+
		"\u014d\u014c\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0150"+
		"\t\2\2\2\u0150\u0153\5\u0092J\2\u0151\u0152\7\r\2\2\u0152\u0154\5D#\2"+
		"\u0153\u0151\3\2\2\2\u0153\u0154\3\2\2\2\u0154-\3\2\2\2\u0155\u0156\7"+
		"\35\2\2\u0156\u0157\5\60\31\2\u0157\u0158\7\36\2\2\u0158/\3\2\2\2\u0159"+
		"\u015a\5\62\32\2\u015a\u015b\7\n\2\2\u015b\u015d\3\2\2\2\u015c\u0159\3"+
		"\2\2\2\u015d\u0160\3\2\2\2\u015e\u015c\3\2\2\2\u015e\u015f\3\2\2\2\u015f"+
		"\u0161\3\2\2\2\u0160\u015e\3\2\2\2\u0161\u0162\5\62\32\2\u0162\61\3\2"+
		"\2\2\u0163\u0166\5\64\33\2\u0164\u0165\7\r\2\2\u0165\u0167\5\66\34\2\u0166"+
		"\u0164\3\2\2\2\u0166\u0167\3\2\2\2\u0167\63\3\2\2\2\u0168\u0169\5\u0092"+
		"J\2\u0169\65\3\2\2\2\u016a\u016b\5\u0092J\2\u016b\67\3\2\2\2\u016c\u016e"+
		"\7\5\2\2\u016d\u016f\5:\36\2\u016e\u016d\3\2\2\2\u016e\u016f\3\2\2\2\u016f"+
		"\u0170\3\2\2\2\u0170\u0171\7\6\2\2\u01719\3\2\2\2\u0172\u0173\5<\37\2"+
		"\u0173\u0174\7\n\2\2\u0174\u0176\3\2\2\2\u0175\u0172\3\2\2\2\u0176\u0179"+
		"\3\2\2\2\u0177\u0175\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u017a\3\2\2\2\u0179"+
		"\u0177\3\2\2\2\u017a\u017b\5<\37\2\u017b;\3\2\2\2\u017c\u017e\5V,\2\u017d"+
		"\u017c\3\2\2\2\u017d\u017e\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u0180\5X"+
		"-\2\u0180\u0182\7\r\2\2\u0181\u0183\7[\2\2\u0182\u0181\3\2\2\2\u0182\u0183"+
		"\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u0186\5D#\2\u0185\u0187\5> \2\u0186"+
		"\u0185\3\2\2\2\u0186\u0187\3\2\2\2\u0187=\3\2\2\2\u0188\u0189\7\13\2\2"+
		"\u0189\u018a\5(\25\2\u018a?\3\2\2\2\u018b\u018c\7\13\2\2\u018c\u018d\5"+
		"(\25\2\u018dA\3\2\2\2\u018e\u018f\5D#\2\u018f\u0190\7\5\2\2\u0190\u0191"+
		"\7\6\2\2\u0191C\3\2\2\2\u0192\u0197\5\66\34\2\u0193\u0194\7\35\2\2\u0194"+
		"\u0195\5D#\2\u0195\u0196\7\36\2\2\u0196\u0198\3\2\2\2\u0197\u0193\3\2"+
		"\2\2\u0197\u0198\3\2\2\2\u0198\u019a\3\2\2\2\u0199\u019b\t\3\2\2\u019a"+
		"\u0199\3\2\2\2\u019a\u019b\3\2\2\2\u019b\u01bd\3\2\2\2\u019c\u019d\7\3"+
		"\2\2\u019d\u019e\5D#\2\u019e\u01a0\7\4\2\2\u019f\u01a1\t\3\2\2\u01a0\u019f"+
		"\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\u01bd\3\2\2\2\u01a2\u01a4\5H%\2\u01a3"+
		"\u01a5\t\3\2\2\u01a4\u01a3\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01bd\3\2"+
		"\2\2\u01a6\u01a8\7\5\2\2\u01a7\u01a9\5D#\2\u01a8\u01a7\3\2\2\2\u01a8\u01a9"+
		"\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01ac\7\6\2\2\u01ab\u01ad\t\3\2\2\u01ac"+
		"\u01ab\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01bd\3\2\2\2\u01ae\u01b0\5P"+
		")\2\u01af\u01b1\t\3\2\2\u01b0\u01af\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1"+
		"\u01bd\3\2\2\2\u01b2\u01b4\5F$\2\u01b3\u01b5\t\3\2\2\u01b4\u01b3\3\2\2"+
		"\2\u01b4\u01b5\3\2\2\2\u01b5\u01bd\3\2\2\2\u01b6\u01b8\7\66\2\2\u01b7"+
		"\u01b9\t\3\2\2\u01b8\u01b7\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01bd\3\2"+
		"\2\2\u01ba\u01bd\7R\2\2\u01bb\u01bd\7K\2\2\u01bc\u0192\3\2\2\2\u01bc\u019c"+
		"\3\2\2\2\u01bc\u01a2\3\2\2\2\u01bc\u01a6\3\2\2\2\u01bc\u01ae\3\2\2\2\u01bc"+
		"\u01b2\3\2\2\2\u01bc\u01b6\3\2\2\2\u01bc\u01ba\3\2\2\2\u01bc\u01bb\3\2"+
		"\2\2\u01bdE\3\2\2\2\u01be\u01bf\7\3\2\2\u01bf\u01c0\5D#\2\u01c0\u01c1"+
		"\7\r\2\2\u01c1\u01c2\5D#\2\u01c2\u01c3\7\4\2\2\u01c3G\3\2\2\2\u01c4\u01c6"+
		"\5Z.\2\u01c5\u01c4\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7"+
		"\u01c9\5J&\2\u01c8\u01ca\7W\2\2\u01c9\u01c8\3\2\2\2\u01c9\u01ca\3\2\2"+
		"\2\u01ca\u01cb\3\2\2\2\u01cb\u01cc\7\23\2\2\u01cc\u01cd\5D#\2\u01cdI\3"+
		"\2\2\2\u01ce\u01d3\7\5\2\2\u01cf\u01d1\5L\'\2\u01d0\u01d2\7\16\2\2\u01d1"+
		"\u01d0\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2\u01d4\3\2\2\2\u01d3\u01cf\3\2"+
		"\2\2\u01d3\u01d4\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5\u01d6\7\6\2\2\u01d6"+
		"K\3\2\2\2\u01d7\u01d8\5N(\2\u01d8\u01d9\7\n\2\2\u01d9\u01db\3\2\2\2\u01da"+
		"\u01d7\3\2\2\2\u01db\u01de\3\2\2\2\u01dc\u01da\3\2\2\2\u01dc\u01dd\3\2"+
		"\2\2\u01dd\u01df\3\2\2\2\u01de\u01dc\3\2\2\2\u01df\u01e0\5N(\2\u01e0M"+
		"\3\2\2\2\u01e1\u01e3\5Z.\2\u01e2\u01e1\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3"+
		"\u01e5\3\2\2\2\u01e4\u01e6\7[\2\2\u01e5\u01e4\3\2\2\2\u01e5\u01e6\3\2"+
		"\2\2\u01e6\u01e7\3\2\2\2\u01e7\u01f0\5D#\2\u01e8\u01e9\5\u0092J\2\u01e9"+
		"\u01eb\7\r\2\2\u01ea\u01ec\7[\2\2\u01eb\u01ea\3\2\2\2\u01eb\u01ec\3\2"+
		"\2\2\u01ec\u01ed\3\2\2\2\u01ed\u01ee\5D#\2\u01ee\u01f0\3\2\2\2\u01ef\u01e2"+
		"\3\2\2\2\u01ef\u01e8\3\2\2\2\u01f0O\3\2\2\2\u01f1\u01f2\7\5\2\2\u01f2"+
		"\u01f3\5T+\2\u01f3\u01f4\7\n\2\2\u01f4\u01f5\5R*\2\u01f5\u01f6\7\6\2\2"+
		"\u01f6Q\3\2\2\2\u01f7\u01f8\5T+\2\u01f8\u01f9\7\n\2\2\u01f9\u01fb\3\2"+
		"\2\2\u01fa\u01f7\3\2\2\2\u01fb\u01fe\3\2\2\2\u01fc\u01fa\3\2\2\2\u01fc"+
		"\u01fd\3\2\2\2\u01fd\u01ff\3\2\2\2\u01fe\u01fc\3\2\2\2\u01ff\u0200\5T"+
		"+\2\u0200S\3\2\2\2\u0201\u0202\5\u0092J\2\u0202\u0204\7\r\2\2\u0203\u0205"+
		"\7[\2\2\u0204\u0203\3\2\2\2\u0204\u0205\3\2\2\2\u0205\u0206\3\2\2\2\u0206"+
		"\u0207\5D#\2\u0207\u020a\3\2\2\2\u0208\u020a\5D#\2\u0209\u0201\3\2\2\2"+
		"\u0209\u0208\3\2\2\2\u020aU\3\2\2\2\u020b\u020c\5\u0092J\2\u020cW\3\2"+
		"\2\2\u020d\u020e\5\u0092J\2\u020eY\3\2\2\2\u020f\u0211\5\\/\2\u0210\u020f"+
		"\3\2\2\2\u0211\u0212\3\2\2\2\u0212\u0210\3\2\2\2\u0212\u0213\3\2\2\2\u0213"+
		"[\3\2\2\2\u0214\u0215\7\65\2\2\u0215\u0217\5\u0092J\2\u0216\u0218\5^\60"+
		"\2\u0217\u0216\3\2\2\2\u0217\u0218\3\2\2\2\u0218]\3\2\2\2\u0219\u021b"+
		"\7\5\2\2\u021a\u021c\5`\61\2\u021b\u021a\3\2\2\2\u021b\u021c\3\2\2\2\u021c"+
		"\u021d\3\2\2\2\u021d\u021e\7\6\2\2\u021e_\3\2\2\2\u021f\u0221\5b\62\2"+
		"\u0220\u021f\3\2\2\2\u0221\u0222\3\2\2\2\u0222\u0220\3\2\2\2\u0222\u0223"+
		"\3\2\2\2\u0223a\3\2\2\2\u0224\u0226\7\5\2\2\u0225\u0227\5`\61\2\u0226"+
		"\u0225\3\2\2\2\u0226\u0227\3\2\2\2\u0227\u0228\3\2\2\2\u0228\u0236\7\6"+
		"\2\2\u0229\u022b\7\7\2\2\u022a\u022c\5`\61\2\u022b\u022a\3\2\2\2\u022b"+
		"\u022c\3\2\2\2\u022c\u022d\3\2\2\2\u022d\u0236\7\b\2\2\u022e\u0230\7\3"+
		"\2\2\u022f\u0231\5`\61\2\u0230\u022f\3\2\2\2\u0230\u0231\3\2\2\2\u0231"+
		"\u0232\3\2\2\2\u0232\u0236\7\4\2\2\u0233\u0236\5\u0092J\2\u0234\u0236"+
		"\5\u0096L\2\u0235\u0224\3\2\2\2\u0235\u0229\3\2\2\2\u0235\u022e\3\2\2"+
		"\2\u0235\u0233\3\2\2\2\u0235\u0234\3\2\2\2\u0236c\3\2\2\2\u0237\u023d"+
		"\5\u0086D\2\u0238\u023d\5l\67\2\u0239\u023d\5j\66\2\u023a\u023d\5h\65"+
		"\2\u023b\u023d\5f\64\2\u023c\u0237\3\2\2\2\u023c\u0238\3\2\2\2\u023c\u0239"+
		"\3\2\2\2\u023c\u023a\3\2\2\2\u023c\u023b\3\2\2\2\u023de\3\2\2\2\u023e"+
		"\u0240\5Z.\2\u023f\u023e\3\2\2\2\u023f\u0240\3\2\2\2\u0240\u0242\3\2\2"+
		"\2\u0241\u0243\5\u0098M\2\u0242\u0241\3\2\2\2\u0242\u0243\3\2\2\2\u0243"+
		"\u0244\3\2\2\2\u0244\u0245\7:\2\2\u0245\u0247\5\u0092J\2\u0246\u0248\5"+
		"\u0088E\2\u0247\u0246\3\2\2\2\u0247\u0248\3\2\2\2\u0248\u0249\3\2\2\2"+
		"\u0249\u024a\5\u008cG\2\u024ag\3\2\2\2\u024b\u024d\5Z.\2\u024c\u024b\3"+
		"\2\2\2\u024c\u024d\3\2\2\2\u024d\u024f\3\2\2\2\u024e\u0250\5\u0098M\2"+
		"\u024f\u024e\3\2\2\2\u024f\u0250\3\2\2\2\u0250\u0251\3\2\2\2\u0251\u0252"+
		"\7;\2\2\u0252\u0254\5\u0092J\2\u0253\u0255\5\u0088E\2\u0254\u0253\3\2"+
		"\2\2\u0254\u0255\3\2\2\2\u0255\u0256\3\2\2\2\u0256\u0257\5\u008cG\2\u0257"+
		"i\3\2\2\2\u0258\u025a\5Z.\2\u0259\u0258\3\2\2\2\u0259\u025a\3\2\2\2\u025a"+
		"\u025c\3\2\2\2\u025b\u025d\7F\2\2\u025c\u025b\3\2\2\2\u025c\u025d\3\2"+
		"\2\2\u025d\u025f\3\2\2\2\u025e\u0260\5\u0098M\2\u025f\u025e\3\2\2\2\u025f"+
		"\u0260\3\2\2\2\u0260\u0262\3\2\2\2\u0261\u0263\7F\2\2\u0262\u0261\3\2"+
		"\2\2\u0262\u0263\3\2\2\2\u0263\u0264\3\2\2\2\u0264\u0265\7<\2\2\u0265"+
		"\u0267\5\u0092J\2\u0266\u0268\5.\30\2\u0267\u0266\3\2\2\2\u0267\u0268"+
		"\3\2\2\2\u0268\u026a\3\2\2\2\u0269\u026b\5\u0088E\2\u026a\u0269\3\2\2"+
		"\2\u026a\u026b\3\2\2\2\u026b\u026c\3\2\2\2\u026c\u026d\5\u008cG\2\u026d"+
		"k\3\2\2\2\u026e\u0270\5Z.\2\u026f\u026e\3\2\2\2\u026f\u0270\3\2\2\2\u0270"+
		"\u0272\3\2\2\2\u0271\u0273\5\u0098M\2\u0272\u0271\3\2\2\2\u0272\u0273"+
		"\3\2\2\2\u0273\u0276\3\2\2\2\u0274\u0277\5x=\2\u0275\u0277\5n8\2\u0276"+
		"\u0274\3\2\2\2\u0276\u0275\3\2\2\2\u0277m\3\2\2\2\u0278\u0279\79\2\2\u0279"+
		"\u027b\5\u0092J\2\u027a\u027c\5.\30\2\u027b\u027a\3\2\2\2\u027b\u027c"+
		"\3\2\2\2\u027c\u027e\3\2\2\2\u027d\u027f\5\u0088E\2\u027e\u027d\3\2\2"+
		"\2\u027e\u027f\3\2\2\2\u027f\u0280\3\2\2\2\u0280\u0281\7\7\2\2\u0281\u0282"+
		"\5p9\2\u0282\u0283\7\b\2\2\u0283o\3\2\2\2\u0284\u0286\5r:\2\u0285\u0284"+
		"\3\2\2\2\u0286\u0287\3\2\2\2\u0287\u0285\3\2\2\2\u0287\u0288\3\2\2\2\u0288"+
		"q\3\2\2\2\u0289\u028b\5Z.\2\u028a\u0289\3\2\2\2\u028a\u028b\3\2\2\2\u028b"+
		"\u028c\3\2\2\2\u028c\u028d\7A\2\2\u028d\u0290\5t;\2\u028e\u0290\5\u0090"+
		"I\2\u028f\u028a\3\2\2\2\u028f\u028e\3\2\2\2\u0290s\3\2\2\2\u0291\u0292"+
		"\5v<\2\u0292\u0293\7\n\2\2\u0293\u0295\3\2\2\2\u0294\u0291\3\2\2\2\u0295"+
		"\u0298\3\2\2\2\u0296\u0294\3\2\2\2\u0296\u0297\3\2\2\2\u0297\u0299\3\2"+
		"\2\2\u0298\u0296\3\2\2\2\u0299\u029a\5v<\2\u029au\3\2\2\2\u029b\u029d"+
		"\5\u0092J\2\u029c\u029e\5\u008eH\2\u029d\u029c\3\2\2\2\u029d\u029e\3\2"+
		"\2\2\u029ew\3\2\2\2\u029f\u02a1\7\\\2\2\u02a0\u029f\3\2\2\2\u02a0\u02a1"+
		"\3\2\2\2\u02a1\u02a2\3\2\2\2\u02a2\u02a3\79\2\2\u02a3\u02a5\5\u0092J\2"+
		"\u02a4\u02a6\5.\30\2\u02a5\u02a4\3\2\2\2\u02a5\u02a6\3\2\2\2\u02a6\u02a8"+
		"\3\2\2\2\u02a7\u02a9\5\u0088E\2\u02a8\u02a7\3\2\2\2\u02a8\u02a9\3\2\2"+
		"\2\u02a9\u02aa\3\2\2\2\u02aa\u02ab\7\7\2\2\u02ab\u02ac\5z>\2\u02ac\u02ad"+
		"\7\b\2\2\u02ady\3\2\2\2\u02ae\u02b0\5|?\2\u02af\u02ae\3\2\2\2\u02b0\u02b3"+
		"\3\2\2\2\u02b1\u02af\3\2\2\2\u02b1\u02b2\3\2\2\2\u02b2{\3\2\2\2\u02b3"+
		"\u02b1\3\2\2\2\u02b4\u02b7\5\u008eH\2\u02b5\u02b7\5~@\2\u02b6\u02b4\3"+
		"\2\2\2\u02b6\u02b5\3\2\2\2\u02b7\u02b8\3\2\2\2\u02b8\u02b6\3\2\2\2\u02b8"+
		"\u02b9\3\2\2\2\u02b9}\3\2\2\2\u02ba\u02bc\5Z.\2\u02bb\u02ba\3\2\2\2\u02bb"+
		"\u02bc\3\2\2\2\u02bc\u02be\3\2\2\2\u02bd\u02bf\7\\\2\2\u02be\u02bd\3\2"+
		"\2\2\u02be\u02bf\3\2\2\2\u02bf\u02c0\3\2\2\2\u02c0\u02c1\7A\2\2\u02c1"+
		"\u02c2\5\u0080A\2\u02c2\177\3\2\2\2\u02c3\u02c4\5\u0082B\2\u02c4\u02c5"+
		"\7\n\2\2\u02c5\u02c7\3\2\2\2\u02c6\u02c3\3\2\2\2\u02c7\u02ca\3\2\2\2\u02c8"+
		"\u02c6\3\2\2\2\u02c8\u02c9\3\2\2\2\u02c9\u02cb\3\2\2\2\u02ca\u02c8\3\2"+
		"\2\2\u02cb\u02cc\5\u0082B\2\u02cc\u0081\3\2\2\2\u02cd\u02cf\5\u0092J\2"+
		"\u02ce\u02d0\5P)\2\u02cf\u02ce\3\2\2\2\u02cf\u02d0\3\2\2\2\u02d0\u0083"+
		"\3\2\2\2\u02d1\u02d2\7\67\2\2\u02d2\u02d3\5\u0092J\2\u02d3\u0085\3\2\2"+
		"\2\u02d4\u02d6\5Z.\2\u02d5\u02d4\3\2\2\2\u02d5\u02d6\3\2\2\2\u02d6\u02d8"+
		"\3\2\2\2\u02d7\u02d9\7F\2\2\u02d8\u02d7\3\2\2\2\u02d8\u02d9\3\2\2\2\u02d9"+
		"\u02db\3\2\2\2\u02da\u02dc\5\u0098M\2\u02db\u02da\3\2\2\2\u02db\u02dc"+
		"\3\2\2\2\u02dc\u02de\3\2\2\2\u02dd\u02df\7F\2\2\u02de\u02dd\3\2\2\2\u02de"+
		"\u02df\3\2\2\2\u02df\u02e0\3\2\2\2\u02e0\u02e1\78\2\2\u02e1\u02e3\5\u0092"+
		"J\2\u02e2\u02e4\5.\30\2\u02e3\u02e2\3\2\2\2\u02e3\u02e4\3\2\2\2\u02e4"+
		"\u02e6\3\2\2\2\u02e5\u02e7\5\u0088E\2\u02e6\u02e5\3\2\2\2\u02e6\u02e7"+
		"\3\2\2\2\u02e7\u02e8\3\2\2\2\u02e8\u02e9\5\u008cG\2\u02e9\u0087\3\2\2"+
		"\2\u02ea\u02eb\7\r\2\2\u02eb\u02ec\5\u008aF\2\u02ec\u0089\3\2\2\2\u02ed"+
		"\u02ee\5\u0092J\2\u02ee\u02ef\7\n\2\2\u02ef\u02f1\3\2\2\2\u02f0\u02ed"+
		"\3\2\2\2\u02f1\u02f4\3\2\2\2\u02f2\u02f0\3\2\2\2\u02f2\u02f3\3\2\2\2\u02f3"+
		"\u02f5\3\2\2\2\u02f4\u02f2\3\2\2\2\u02f5\u02f6\5\u0092J\2\u02f6\u008b"+
		"\3\2\2\2\u02f7\u02fe\7\7\2\2\u02f8\u02fd\5\n\6\2\u02f9\u02fd\5\6\4\2\u02fa"+
		"\u02fd\5\u0090I\2\u02fb\u02fd\5d\63\2\u02fc\u02f8\3\2\2\2\u02fc\u02f9"+
		"\3\2\2\2\u02fc\u02fa\3\2\2\2\u02fc\u02fb\3\2\2\2\u02fd\u0300\3\2\2\2\u02fe"+
		"\u02fc\3\2\2\2\u02fe\u02ff\3\2\2\2\u02ff\u0301\3\2\2\2\u0300\u02fe\3\2"+
		"\2\2\u0301\u0302\7\b\2\2\u0302\u008d\3\2\2\2\u0303\u0308\7u\2\2\u0304"+
		"\u0308\5\u0094K\2\u0305\u0308\5\u0096L\2\u0306\u0308\5\u0092J\2\u0307"+
		"\u0303\3\2\2\2\u0307\u0304\3\2\2\2\u0307\u0305\3\2\2\2\u0307\u0306\3\2"+
		"\2\2\u0308\u0309\3\2\2\2\u0309\u030a\3\2\2\2\u0309\u0307\3\2\2\2\u030a"+
		"\u008f\3\2\2\2\u030b\u030d\5Z.\2\u030c\u030b\3\2\2\2\u030c\u030d\3\2\2"+
		"\2\u030d\u030f\3\2\2\2\u030e\u0310\5\16\b\2\u030f\u030e\3\2\2\2\u030f"+
		"\u0310\3\2\2\2\u0310\u0311\3\2\2\2\u0311\u0312\t\2\2\2\u0312\u0315\5\u0092"+
		"J\2\u0313\u0314\7\r\2\2\u0314\u0316\5D#\2\u0315\u0313\3\2\2\2\u0315\u0316"+
		"\3\2\2\2\u0316\u0318\3\2\2\2\u0317\u0319\5@!\2\u0318\u0317\3\2\2\2\u0318"+
		"\u0319\3\2\2\2\u0319\u031b\3\2\2\2\u031a\u031c\5\u008eH\2\u031b\u031a"+
		"\3\2\2\2\u031b\u031c\3\2\2\2\u031c\u031e\3\2\2\2\u031d\u031f\5\30\r\2"+
		"\u031e\u031d\3\2\2\2\u031e\u031f\3\2\2\2\u031f\u0091\3\2\2\2\u0320\u0321"+
		"\t\5\2\2\u0321\u0093\3\2\2\2\u0322\u0323\t\6\2\2\u0323\u0095\3\2\2\2\u0324"+
		"\u0325\t\7\2\2\u0325\u0097\3\2\2\2\u0326\u032a\7^\2\2\u0327\u0328\7\5"+
		"\2\2\u0328\u0329\7o\2\2\u0329\u032b\7\6\2\2\u032a\u0327\3\2\2\2\u032a"+
		"\u032b\3\2\2\2\u032b\u033b\3\2\2\2\u032c\u0330\7_\2\2\u032d\u032e\7\5"+
		"\2\2\u032e\u032f\7o\2\2\u032f\u0331\7\6\2\2\u0330\u032d\3\2\2\2\u0330"+
		"\u0331\3\2\2\2\u0331\u033b\3\2\2\2\u0332\u0336\7`\2\2\u0333\u0334\7\5"+
		"\2\2\u0334\u0335\7o\2\2\u0335\u0337\7\6\2\2\u0336\u0333\3\2\2\2\u0336"+
		"\u0337\3\2\2\2\u0337\u033b\3\2\2\2\u0338\u033b\7a\2\2\u0339\u033b\7b\2"+
		"\2\u033a\u0326\3\2\2\2\u033a\u032c\3\2\2\2\u033a\u0332\3\2\2\2\u033a\u0338"+
		"\3\2\2\2\u033a\u0339\3\2\2\2\u033b\u0099\3\2\2\2\u0084\u009d\u00a3\u00a5"+
		"\u00a9\u00ac\u00af\u00b5\u00b8\u00bb\u00bf\u00c3\u00c8\u00cb\u00cf\u00d4"+
		"\u00da\u00dd\u00e3\u00e5\u00eb\u00ee\u00f2\u00f7\u00fc\u00fe\u0106\u010b"+
		"\u0112\u0118\u0121\u0127\u012e\u0133\u013b\u0144\u0146\u014a\u014d\u0153"+
		"\u015e\u0166\u016e\u0177\u017d\u0182\u0186\u0197\u019a\u01a0\u01a4\u01a8"+
		"\u01ac\u01b0\u01b4\u01b8\u01bc\u01c5\u01c9\u01d1\u01d3\u01dc\u01e2\u01e5"+
		"\u01eb\u01ef\u01fc\u0204\u0209\u0212\u0217\u021b\u0222\u0226\u022b\u0230"+
		"\u0235\u023c\u023f\u0242\u0247\u024c\u024f\u0254\u0259\u025c\u025f\u0262"+
		"\u0267\u026a\u026f\u0272\u0276\u027b\u027e\u0287\u028a\u028f\u0296\u029d"+
		"\u02a0\u02a5\u02a8\u02b1\u02b6\u02b8\u02bb\u02be\u02c8\u02cf\u02d5\u02d8"+
		"\u02db\u02de\u02e3\u02e6\u02f2\u02fc\u02fe\u0307\u0309\u030c\u030f\u0315"+
		"\u0318\u031b\u031e\u032a\u0330\u0336\u033a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}