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
		Identifier=109, WS=110, COMMENT=111, LINE_COMMENT=112, ANYCHARS=113;
	public static final int
		RULE_program = 0, RULE_globalVariableDeclaration = 1, RULE_globalVarDeclaration = 2, 
		RULE_globalLetDeclaration = 3, RULE_initializerDeclaration = 4, RULE_initializerHead = 5, 
		RULE_functionDeclaration = 6, RULE_functionHead = 7, RULE_declarationModifiers = 8, 
		RULE_declarationModifier = 9, RULE_functionSignature = 10, RULE_functionResult = 11, 
		RULE_functionBody = 12, RULE_codeBlock = 13, RULE_noisyCode = 14, RULE_variableDeclaration = 15, 
		RULE_letDeclaration = 16, RULE_genericParameterClause = 17, RULE_genericParameters = 18, 
		RULE_genericParameter = 19, RULE_typeName = 20, RULE_typeidentifier = 21, 
		RULE_parameterClause = 22, RULE_parameterList = 23, RULE_parameter = 24, 
		RULE_defaultParamInitializer = 25, RULE_expression = 26, RULE_type = 27, 
		RULE_dictionaryType = 28, RULE_functionType = 29, RULE_functionTypeArgumentClause = 30, 
		RULE_functionTypeArguments = 31, RULE_functionTypeArgument = 32, RULE_tupleType = 33, 
		RULE_tupleElements = 34, RULE_tupleElement = 35, RULE_externalParametername = 36, 
		RULE_localParameterName = 37, RULE_attributes = 38, RULE_attribute = 39, 
		RULE_attributeArgumentsClause = 40, RULE_balancedTokens = 41, RULE_balancedToken = 42, 
		RULE_typeDefinition = 43, RULE_structDeclaration = 44, RULE_enumDeclaration = 45, 
		RULE_rawValueStyleEnum = 46, RULE_rawValueStyleEnumMembers = 47, RULE_rawValueStyleEnumMember = 48, 
		RULE_rawValueEnumCaseList = 49, RULE_rawValueEnumCase = 50, RULE_unionStyleEnum = 51, 
		RULE_unionStyleEnumMembers = 52, RULE_unionStyleEnumMember = 53, RULE_caseClause = 54, 
		RULE_enumCaseList = 55, RULE_enumCase = 56, RULE_importStatement = 57, 
		RULE_classDeclaration = 58, RULE_typeInheritanceClause = 59, RULE_typeInheritances = 60, 
		RULE_typeBody = 61, RULE_noise = 62, RULE_typeVariableDeclaration = 63, 
		RULE_typeVarDeclaration = 64, RULE_typeLetDeclaration = 65, RULE_identifier = 66, 
		RULE_keywordNoise = 67, RULE_specialCharacter = 68, RULE_accessModifier = 69;
	public static final String[] ruleNames = {
		"program", "globalVariableDeclaration", "globalVarDeclaration", "globalLetDeclaration", 
		"initializerDeclaration", "initializerHead", "functionDeclaration", "functionHead", 
		"declarationModifiers", "declarationModifier", "functionSignature", "functionResult", 
		"functionBody", "codeBlock", "noisyCode", "variableDeclaration", "letDeclaration", 
		"genericParameterClause", "genericParameters", "genericParameter", "typeName", 
		"typeidentifier", "parameterClause", "parameterList", "parameter", "defaultParamInitializer", 
		"expression", "type", "dictionaryType", "functionType", "functionTypeArgumentClause", 
		"functionTypeArguments", "functionTypeArgument", "tupleType", "tupleElements", 
		"tupleElement", "externalParametername", "localParameterName", "attributes", 
		"attribute", "attributeArgumentsClause", "balancedTokens", "balancedToken", 
		"typeDefinition", "structDeclaration", "enumDeclaration", "rawValueStyleEnum", 
		"rawValueStyleEnumMembers", "rawValueStyleEnumMember", "rawValueEnumCaseList", 
		"rawValueEnumCase", "unionStyleEnum", "unionStyleEnumMembers", "unionStyleEnumMember", 
		"caseClause", "enumCaseList", "enumCase", "importStatement", "classDeclaration", 
		"typeInheritanceClause", "typeInheritances", "typeBody", "noise", "typeVariableDeclaration", 
		"typeVarDeclaration", "typeLetDeclaration", "identifier", "keywordNoise", 
		"specialCharacter", "accessModifier"
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
		"'prefix'", "'required'", "'unowned'", "'weak'", "'static'"
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
		"Identifier", "WS", "COMMENT", "LINE_COMMENT", "ANYCHARS"
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
			setState(143);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(140);
					importStatement();
					}
					} 
				}
				setState(145);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(151);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(149);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						setState(146);
						typeDefinition();
						}
						break;
					case 2:
						{
						setState(147);
						functionDeclaration();
						}
						break;
					case 3:
						{
						setState(148);
						globalVariableDeclaration();
						}
						break;
					}
					} 
				}
				setState(153);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenBracket) | (1L << CloseBracket) | (1L << OpenParen) | (1L << CloseParen) | (1L << OpenBrace) | (1L << CloseBrace) | (1L << SemiColon) | (1L << Comma) | (1L << Assign) | (1L << QuestionMark) | (1L << Colon) | (1L << Ellipsis) | (1L << Dot) | (1L << PlusPlus) | (1L << Plus) | (1L << Minus) | (1L << BitNot) | (1L << Not) | (1L << Multiply) | (1L << Divide) | (1L << Modulus) | (1L << RightShiftArithmetic) | (1L << LeftShiftArithmetic) | (1L << RightShiftLogical) | (1L << LessThan) | (1L << MoreThan) | (1L << LessThanEquals) | (1L << GreaterThanEquals) | (1L << Equals_) | (1L << NotEquals) | (1L << BitAnd) | (1L << BitXOr) | (1L << BitOr) | (1L << And) | (1L << Or) | (1L << MultiplyAssign) | (1L << DivideAssign) | (1L << ModulusAssign) | (1L << PlusAssign) | (1L << MinusAssign) | (1L << LeftShiftArithmeticAssign) | (1L << RightShiftArithmeticAssign) | (1L << RightShiftLogicalAssign) | (1L << BitAndAssign) | (1L << BitXorAssign) | (1L << BitOrAssign) | (1L << AT) | (1L << ANY) | (1L << IMPORT) | (1L << BREAK) | (1L << DO) | (1L << INSTANCEOF) | (1L << TYPEOF) | (1L << CASE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (ELSE - 64)) | (1L << (NEW - 64)) | (1L << (FINAL - 64)) | (1L << (CATCH - 64)) | (1L << (FINALLY - 64)) | (1L << (RETURN - 64)) | (1L << (VOID - 64)) | (1L << (UPPERCASEVOID - 64)) | (1L << (CONTINUE - 64)) | (1L << (FOR - 64)) | (1L << (SWITCH - 64)) | (1L << (WHILE - 64)) | (1L << (DEBUGGER - 64)) | (1L << (SELF - 64)) | (1L << (WITH - 64)) | (1L << (DEFAULT - 64)) | (1L << (IF - 64)) | (1L << (THROW - 64)) | (1L << (THROWS - 64)) | (1L << (DELETE - 64)) | (1L << (IN - 64)) | (1L << (TRY - 64)) | (1L << (INOUT - 64)) | (1L << (INDIRECT - 64)) | (1L << (INIT - 64)) | (1L << (CONVENIENCE - 64)) | (1L << (DYNAMIC - 64)) | (1L << (INFIX - 64)) | (1L << (LAZY - 64)) | (1L << (OPTIONAL - 64)) | (1L << (OVERRIDE - 64)) | (1L << (POSTFIX - 64)) | (1L << (PREFIX - 64)) | (1L << (REQUIRED - 64)) | (1L << (UNOWNED - 64)) | (1L << (WEAK - 64)) | (1L << (STATIC - 64)) | (1L << (Identifier - 64)) | (1L << (ANYCHARS - 64)))) != 0)) {
				{
				setState(154);
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
		public GlobalVarDeclarationContext globalVarDeclaration() {
			return getRuleContext(GlobalVarDeclarationContext.class,0);
		}
		public GlobalLetDeclarationContext globalLetDeclaration() {
			return getRuleContext(GlobalLetDeclarationContext.class,0);
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
		try {
			setState(159);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				globalVarDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(158);
				globalLetDeclaration();
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

	public static class GlobalVarDeclarationContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(Swift4Parser.VAR, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public DeclarationModifiersContext declarationModifiers() {
			return getRuleContext(DeclarationModifiersContext.class,0);
		}
		public NoiseContext noise() {
			return getRuleContext(NoiseContext.class,0);
		}
		public GlobalVarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globalVarDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).enterGlobalVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).exitGlobalVarDeclaration(this);
		}
	}

	public final GlobalVarDeclarationContext globalVarDeclaration() throws RecognitionException {
		GlobalVarDeclarationContext _localctx = new GlobalVarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_globalVarDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(161);
				attributes();
				}
			}

			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 54)) & ~0x3f) == 0 && ((1L << (_la - 54)) & ((1L << (CLASS - 54)) | (1L << (FINAL - 54)) | (1L << (PRIVATE - 54)) | (1L << (FILEPRIVATE - 54)) | (1L << (INTERNAL - 54)) | (1L << (PUBLIC - 54)) | (1L << (MUTATING - 54)) | (1L << (CONVENIENCE - 54)) | (1L << (DYNAMIC - 54)) | (1L << (INFIX - 54)) | (1L << (LAZY - 54)) | (1L << (OPTIONAL - 54)) | (1L << (OVERRIDE - 54)) | (1L << (POSTFIX - 54)) | (1L << (PREFIX - 54)) | (1L << (REQUIRED - 54)) | (1L << (UNOWNED - 54)) | (1L << (WEAK - 54)) | (1L << (STATIC - 54)))) != 0)) {
				{
				setState(164);
				declarationModifiers();
				}
			}

			setState(167);
			match(VAR);
			setState(168);
			identifier();
			setState(170);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(169);
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

	public static class GlobalLetDeclarationContext extends ParserRuleContext {
		public TerminalNode LET() { return getToken(Swift4Parser.LET, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public DeclarationModifiersContext declarationModifiers() {
			return getRuleContext(DeclarationModifiersContext.class,0);
		}
		public NoiseContext noise() {
			return getRuleContext(NoiseContext.class,0);
		}
		public GlobalLetDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globalLetDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).enterGlobalLetDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).exitGlobalLetDeclaration(this);
		}
	}

	public final GlobalLetDeclarationContext globalLetDeclaration() throws RecognitionException {
		GlobalLetDeclarationContext _localctx = new GlobalLetDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_globalLetDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(172);
				attributes();
				}
			}

			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 54)) & ~0x3f) == 0 && ((1L << (_la - 54)) & ((1L << (CLASS - 54)) | (1L << (FINAL - 54)) | (1L << (PRIVATE - 54)) | (1L << (FILEPRIVATE - 54)) | (1L << (INTERNAL - 54)) | (1L << (PUBLIC - 54)) | (1L << (MUTATING - 54)) | (1L << (CONVENIENCE - 54)) | (1L << (DYNAMIC - 54)) | (1L << (INFIX - 54)) | (1L << (LAZY - 54)) | (1L << (OPTIONAL - 54)) | (1L << (OVERRIDE - 54)) | (1L << (POSTFIX - 54)) | (1L << (PREFIX - 54)) | (1L << (REQUIRED - 54)) | (1L << (UNOWNED - 54)) | (1L << (WEAK - 54)) | (1L << (STATIC - 54)))) != 0)) {
				{
				setState(175);
				declarationModifiers();
				}
			}

			setState(178);
			match(LET);
			setState(179);
			identifier();
			setState(181);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(180);
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
		enterRule(_localctx, 8, RULE_initializerDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			initializerHead();
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LessThan) {
				{
				setState(184);
				genericParameterClause();
				}
			}

			setState(187);
			parameterClause();
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(188);
				match(THROWS);
				}
			}

			setState(191);
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
		enterRule(_localctx, 10, RULE_initializerHead);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(193);
				attributes();
				}
			}

			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 54)) & ~0x3f) == 0 && ((1L << (_la - 54)) & ((1L << (CLASS - 54)) | (1L << (FINAL - 54)) | (1L << (PRIVATE - 54)) | (1L << (FILEPRIVATE - 54)) | (1L << (INTERNAL - 54)) | (1L << (PUBLIC - 54)) | (1L << (MUTATING - 54)) | (1L << (CONVENIENCE - 54)) | (1L << (DYNAMIC - 54)) | (1L << (INFIX - 54)) | (1L << (LAZY - 54)) | (1L << (OPTIONAL - 54)) | (1L << (OVERRIDE - 54)) | (1L << (POSTFIX - 54)) | (1L << (PREFIX - 54)) | (1L << (REQUIRED - 54)) | (1L << (UNOWNED - 54)) | (1L << (WEAK - 54)) | (1L << (STATIC - 54)))) != 0)) {
				{
				setState(196);
				declarationModifiers();
				}
			}

			setState(199);
			match(INIT);
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==QuestionMark || _la==Not) {
				{
				setState(200);
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
		enterRule(_localctx, 12, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			functionHead();
			setState(204);
			identifier();
			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LessThan) {
				{
				setState(205);
				genericParameterClause();
				}
			}

			setState(208);
			functionSignature();
			setState(209);
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
		enterRule(_localctx, 14, RULE_functionHead);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(211);
				attributes();
				}
			}

			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 54)) & ~0x3f) == 0 && ((1L << (_la - 54)) & ((1L << (CLASS - 54)) | (1L << (FINAL - 54)) | (1L << (PRIVATE - 54)) | (1L << (FILEPRIVATE - 54)) | (1L << (INTERNAL - 54)) | (1L << (PUBLIC - 54)) | (1L << (MUTATING - 54)) | (1L << (CONVENIENCE - 54)) | (1L << (DYNAMIC - 54)) | (1L << (INFIX - 54)) | (1L << (LAZY - 54)) | (1L << (OPTIONAL - 54)) | (1L << (OVERRIDE - 54)) | (1L << (POSTFIX - 54)) | (1L << (PREFIX - 54)) | (1L << (REQUIRED - 54)) | (1L << (UNOWNED - 54)) | (1L << (WEAK - 54)) | (1L << (STATIC - 54)))) != 0)) {
				{
				setState(214);
				declarationModifiers();
				}
			}

			setState(217);
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
		enterRule(_localctx, 16, RULE_declarationModifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(221);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PRIVATE:
				case FILEPRIVATE:
				case INTERNAL:
				case PUBLIC:
				case MUTATING:
					{
					setState(219);
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
					setState(220);
					declarationModifier();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(223); 
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
		enterRule(_localctx, 18, RULE_declarationModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
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
		enterRule(_localctx, 20, RULE_functionSignature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			parameterClause();
			setState(229);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(228);
				match(THROWS);
				}
				break;
			}
			setState(232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ARROW) {
				{
				setState(231);
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
		enterRule(_localctx, 22, RULE_functionResult);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(ARROW);
			setState(236);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(235);
				attributes();
				}
				break;
			}
			setState(238);
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
		enterRule(_localctx, 24, RULE_functionBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(240);
				codeBlock();
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

	public static class CodeBlockContext extends ParserRuleContext {
		public TerminalNode OpenBrace() { return getToken(Swift4Parser.OpenBrace, 0); }
		public List<NoisyCodeContext> noisyCode() {
			return getRuleContexts(NoisyCodeContext.class);
		}
		public NoisyCodeContext noisyCode(int i) {
			return getRuleContext(NoisyCodeContext.class,i);
		}
		public TerminalNode CloseBrace() { return getToken(Swift4Parser.CloseBrace, 0); }
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
		enterRule(_localctx, 26, RULE_codeBlock);
		try {
			int _alt;
			setState(256);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(243);
				match(OpenBrace);
				setState(244);
				noisyCode();
				setState(248);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(245);
						codeBlock();
						}
						} 
					}
					setState(250);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				}
				setState(251);
				noisyCode();
				setState(252);
				match(CloseBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(254);
				match(OpenBrace);
				setState(255);
				match(CloseBrace);
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

	public static class NoisyCodeContext extends ParserRuleContext {
		public List<NoiseContext> noise() {
			return getRuleContexts(NoiseContext.class);
		}
		public NoiseContext noise(int i) {
			return getRuleContext(NoiseContext.class,i);
		}
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public List<LetDeclarationContext> letDeclaration() {
			return getRuleContexts(LetDeclarationContext.class);
		}
		public LetDeclarationContext letDeclaration(int i) {
			return getRuleContext(LetDeclarationContext.class,i);
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
		enterRule(_localctx, 28, RULE_noisyCode);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(261);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
					case 1:
						{
						setState(258);
						noise();
						}
						break;
					case 2:
						{
						setState(259);
						variableDeclaration();
						}
						break;
					case 3:
						{
						setState(260);
						letDeclaration();
						}
						break;
					}
					} 
				}
				setState(265);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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

	public static class VariableDeclarationContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(Swift4Parser.VAR, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public DeclarationModifiersContext declarationModifiers() {
			return getRuleContext(DeclarationModifiersContext.class,0);
		}
		public NoiseContext noise() {
			return getRuleContext(NoiseContext.class,0);
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
		enterRule(_localctx, 30, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(266);
				attributes();
				}
			}

			setState(270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 54)) & ~0x3f) == 0 && ((1L << (_la - 54)) & ((1L << (CLASS - 54)) | (1L << (FINAL - 54)) | (1L << (PRIVATE - 54)) | (1L << (FILEPRIVATE - 54)) | (1L << (INTERNAL - 54)) | (1L << (PUBLIC - 54)) | (1L << (MUTATING - 54)) | (1L << (CONVENIENCE - 54)) | (1L << (DYNAMIC - 54)) | (1L << (INFIX - 54)) | (1L << (LAZY - 54)) | (1L << (OPTIONAL - 54)) | (1L << (OVERRIDE - 54)) | (1L << (POSTFIX - 54)) | (1L << (PREFIX - 54)) | (1L << (REQUIRED - 54)) | (1L << (UNOWNED - 54)) | (1L << (WEAK - 54)) | (1L << (STATIC - 54)))) != 0)) {
				{
				setState(269);
				declarationModifiers();
				}
			}

			setState(272);
			match(VAR);
			setState(273);
			identifier();
			setState(275);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(274);
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

	public static class LetDeclarationContext extends ParserRuleContext {
		public TerminalNode LET() { return getToken(Swift4Parser.LET, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public DeclarationModifiersContext declarationModifiers() {
			return getRuleContext(DeclarationModifiersContext.class,0);
		}
		public NoiseContext noise() {
			return getRuleContext(NoiseContext.class,0);
		}
		public LetDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).enterLetDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).exitLetDeclaration(this);
		}
	}

	public final LetDeclarationContext letDeclaration() throws RecognitionException {
		LetDeclarationContext _localctx = new LetDeclarationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_letDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(277);
				attributes();
				}
			}

			setState(281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 54)) & ~0x3f) == 0 && ((1L << (_la - 54)) & ((1L << (CLASS - 54)) | (1L << (FINAL - 54)) | (1L << (PRIVATE - 54)) | (1L << (FILEPRIVATE - 54)) | (1L << (INTERNAL - 54)) | (1L << (PUBLIC - 54)) | (1L << (MUTATING - 54)) | (1L << (CONVENIENCE - 54)) | (1L << (DYNAMIC - 54)) | (1L << (INFIX - 54)) | (1L << (LAZY - 54)) | (1L << (OPTIONAL - 54)) | (1L << (OVERRIDE - 54)) | (1L << (POSTFIX - 54)) | (1L << (PREFIX - 54)) | (1L << (REQUIRED - 54)) | (1L << (UNOWNED - 54)) | (1L << (WEAK - 54)) | (1L << (STATIC - 54)))) != 0)) {
				{
				setState(280);
				declarationModifiers();
				}
			}

			setState(283);
			match(LET);
			setState(284);
			identifier();
			setState(286);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(285);
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
		enterRule(_localctx, 34, RULE_genericParameterClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			match(LessThan);
			setState(289);
			genericParameters();
			setState(290);
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
		public GenericParameterContext genericParameter() {
			return getRuleContext(GenericParameterContext.class,0);
		}
		public TerminalNode Comma() { return getToken(Swift4Parser.Comma, 0); }
		public GenericParametersContext genericParameters() {
			return getRuleContext(GenericParametersContext.class,0);
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
		enterRule(_localctx, 36, RULE_genericParameters);
		try {
			setState(297);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(292);
				genericParameter();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(293);
				genericParameter();
				setState(294);
				match(Comma);
				setState(295);
				genericParameters();
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
		enterRule(_localctx, 38, RULE_genericParameter);
		try {
			setState(304);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(299);
				typeName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(300);
				typeName();
				setState(301);
				match(Colon);
				setState(302);
				typeidentifier();
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
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).enterTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).exitTypeName(this);
		}
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_typeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
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
		enterRule(_localctx, 42, RULE_typeidentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
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
		enterRule(_localctx, 44, RULE_parameterClause);
		try {
			setState(316);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(310);
				match(OpenParen);
				setState(311);
				match(CloseParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(312);
				match(OpenParen);
				setState(313);
				parameterList();
				setState(314);
				match(CloseParen);
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
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
		}
		public TerminalNode Comma() { return getToken(Swift4Parser.Comma, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
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
		enterRule(_localctx, 46, RULE_parameterList);
		try {
			setState(323);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(318);
				parameter();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(319);
				parameter();
				setState(320);
				match(Comma);
				setState(321);
				parameterList();
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
		enterRule(_localctx, 48, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(325);
				externalParametername();
				}
				break;
			}
			setState(328);
			localParameterName();
			setState(329);
			match(Colon);
			setState(331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INOUT) {
				{
				setState(330);
				match(INOUT);
				}
			}

			setState(333);
			type();
			setState(335);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(334);
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
		enterRule(_localctx, 50, RULE_defaultParamInitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			match(Assign);
			setState(338);
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

	public static class ExpressionContext extends ParserRuleContext {
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
		enterRule(_localctx, 52, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(340);
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

	public static class TypeContext extends ParserRuleContext {
		public TypeidentifierContext typeidentifier() {
			return getRuleContext(TypeidentifierContext.class,0);
		}
		public TerminalNode QuestionMark() { return getToken(Swift4Parser.QuestionMark, 0); }
		public TerminalNode Not() { return getToken(Swift4Parser.Not, 0); }
		public TerminalNode OpenBracket() { return getToken(Swift4Parser.OpenBracket, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
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
		enterRule(_localctx, 54, RULE_type);
		int _la;
		try {
			setState(377);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(343);
				typeidentifier();
				setState(345);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
				case 1:
					{
					setState(344);
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
				setState(347);
				match(OpenBracket);
				setState(348);
				type();
				setState(349);
				match(CloseBracket);
				setState(351);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
				case 1:
					{
					setState(350);
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
				setState(353);
				functionType();
				setState(355);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
				case 1:
					{
					setState(354);
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
				setState(357);
				match(OpenParen);
				setState(358);
				type();
				setState(359);
				match(CloseParen);
				setState(361);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
				case 1:
					{
					setState(360);
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
				setState(363);
				tupleType();
				setState(365);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
				case 1:
					{
					setState(364);
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
				setState(367);
				dictionaryType();
				setState(369);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
				case 1:
					{
					setState(368);
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
				setState(371);
				match(ANY);
				setState(373);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
				case 1:
					{
					setState(372);
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
				setState(375);
				match(SELF);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(376);
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
		enterRule(_localctx, 56, RULE_dictionaryType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			match(OpenBracket);
			setState(380);
			type();
			setState(381);
			match(Colon);
			setState(382);
			type();
			setState(383);
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
		enterRule(_localctx, 58, RULE_functionType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(385);
				attributes();
				}
			}

			setState(388);
			functionTypeArgumentClause();
			setState(390);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(389);
				match(THROWS);
				}
			}

			setState(392);
			match(ARROW);
			setState(393);
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
		enterRule(_localctx, 60, RULE_functionTypeArgumentClause);
		int _la;
		try {
			setState(404);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(395);
				match(OpenParen);
				setState(396);
				match(CloseParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(397);
				match(OpenParen);
				setState(398);
				functionTypeArguments();
				setState(400);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Ellipsis) {
					{
					setState(399);
					match(Ellipsis);
					}
				}

				setState(402);
				match(CloseParen);
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

	public static class FunctionTypeArgumentsContext extends ParserRuleContext {
		public FunctionTypeArgumentContext functionTypeArgument() {
			return getRuleContext(FunctionTypeArgumentContext.class,0);
		}
		public TerminalNode Comma() { return getToken(Swift4Parser.Comma, 0); }
		public FunctionTypeArgumentsContext functionTypeArguments() {
			return getRuleContext(FunctionTypeArgumentsContext.class,0);
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
		enterRule(_localctx, 62, RULE_functionTypeArguments);
		try {
			setState(411);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(406);
				functionTypeArgument();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(407);
				functionTypeArgument();
				setState(408);
				match(Comma);
				setState(409);
				functionTypeArguments();
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
		enterRule(_localctx, 64, RULE_functionTypeArgument);
		int _la;
		try {
			setState(427);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(414);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
				case 1:
					{
					setState(413);
					attributes();
					}
					break;
				}
				setState(417);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INOUT) {
					{
					setState(416);
					match(INOUT);
					}
				}

				setState(419);
				type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(420);
				identifier();
				setState(421);
				match(Colon);
				setState(423);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INOUT) {
					{
					setState(422);
					match(INOUT);
					}
				}

				setState(425);
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
		enterRule(_localctx, 66, RULE_tupleType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			match(OpenParen);
			setState(430);
			tupleElement();
			setState(431);
			match(Comma);
			setState(432);
			tupleElements();
			setState(433);
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
		public TupleElementContext tupleElement() {
			return getRuleContext(TupleElementContext.class,0);
		}
		public TerminalNode Comma() { return getToken(Swift4Parser.Comma, 0); }
		public TupleElementsContext tupleElements() {
			return getRuleContext(TupleElementsContext.class,0);
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
		enterRule(_localctx, 68, RULE_tupleElements);
		try {
			setState(440);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(435);
				tupleElement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(436);
				tupleElement();
				setState(437);
				match(Comma);
				setState(438);
				tupleElements();
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
		enterRule(_localctx, 70, RULE_tupleElement);
		int _la;
		try {
			setState(450);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(442);
				identifier();
				setState(443);
				match(Colon);
				setState(445);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INOUT) {
					{
					setState(444);
					match(INOUT);
					}
				}

				setState(447);
				type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(449);
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
		enterRule(_localctx, 72, RULE_externalParametername);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(452);
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
		enterRule(_localctx, 74, RULE_localParameterName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
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
		enterRule(_localctx, 76, RULE_attributes);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(457); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(456);
					attribute();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(459); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
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
		enterRule(_localctx, 78, RULE_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			match(AT);
			setState(462);
			identifier();
			setState(464);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				{
				setState(463);
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
		enterRule(_localctx, 80, RULE_attributeArgumentsClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(466);
			match(OpenParen);
			setState(468);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				{
				setState(467);
				balancedTokens();
				}
				break;
			}
			setState(470);
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
		enterRule(_localctx, 82, RULE_balancedTokens);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(473); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(472);
					balancedToken();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(475); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
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
		enterRule(_localctx, 84, RULE_balancedToken);
		try {
			setState(494);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(477);
				match(OpenParen);
				setState(479);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
				case 1:
					{
					setState(478);
					balancedTokens();
					}
					break;
				}
				setState(481);
				match(CloseParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(482);
				match(OpenBrace);
				setState(484);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
				case 1:
					{
					setState(483);
					balancedTokens();
					}
					break;
				}
				setState(486);
				match(CloseBrace);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(487);
				match(OpenBracket);
				setState(489);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
				case 1:
					{
					setState(488);
					balancedTokens();
					}
					break;
				}
				setState(491);
				match(CloseBracket);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(492);
				identifier();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(493);
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
		enterRule(_localctx, 86, RULE_typeDefinition);
		try {
			setState(499);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(496);
				classDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(497);
				enumDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(498);
				structDeclaration();
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
		public NoiseContext noise() {
			return getRuleContext(NoiseContext.class,0);
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
		enterRule(_localctx, 88, RULE_structDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(502);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(501);
				attributes();
				}
			}

			setState(505);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				{
				setState(504);
				match(FINAL);
				}
				break;
			}
			setState(508);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 92)) & ~0x3f) == 0 && ((1L << (_la - 92)) & ((1L << (PRIVATE - 92)) | (1L << (FILEPRIVATE - 92)) | (1L << (INTERNAL - 92)) | (1L << (PUBLIC - 92)) | (1L << (MUTATING - 92)))) != 0)) {
				{
				setState(507);
				accessModifier();
				}
			}

			setState(511);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FINAL) {
				{
				setState(510);
				match(FINAL);
				}
			}

			setState(513);
			match(STRUCT);
			setState(514);
			identifier();
			setState(516);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LessThan) {
				{
				setState(515);
				genericParameterClause();
				}
			}

			setState(519);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(518);
				typeInheritanceClause();
				}
			}

			setState(521);
			typeBody();
			setState(523);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				{
				setState(522);
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
		enterRule(_localctx, 90, RULE_enumDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(526);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(525);
				attributes();
				}
			}

			setState(529);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 92)) & ~0x3f) == 0 && ((1L << (_la - 92)) & ((1L << (PRIVATE - 92)) | (1L << (FILEPRIVATE - 92)) | (1L << (INTERNAL - 92)) | (1L << (PUBLIC - 92)) | (1L << (MUTATING - 92)))) != 0)) {
				{
				setState(528);
				accessModifier();
				}
			}

			setState(533);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				{
				setState(531);
				unionStyleEnum();
				}
				break;
			case 2:
				{
				setState(532);
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
		enterRule(_localctx, 92, RULE_rawValueStyleEnum);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(535);
			match(ENUM);
			setState(536);
			identifier();
			setState(538);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LessThan) {
				{
				setState(537);
				genericParameterClause();
				}
			}

			setState(541);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(540);
				typeInheritanceClause();
				}
			}

			setState(543);
			match(OpenBrace);
			setState(544);
			rawValueStyleEnumMembers();
			setState(545);
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
		public RawValueStyleEnumMemberContext rawValueStyleEnumMember() {
			return getRuleContext(RawValueStyleEnumMemberContext.class,0);
		}
		public RawValueStyleEnumMembersContext rawValueStyleEnumMembers() {
			return getRuleContext(RawValueStyleEnumMembersContext.class,0);
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
		enterRule(_localctx, 94, RULE_rawValueStyleEnumMembers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(547);
			rawValueStyleEnumMember();
			setState(549);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT || _la==CASE) {
				{
				setState(548);
				rawValueStyleEnumMembers();
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

	public static class RawValueStyleEnumMemberContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(Swift4Parser.CASE, 0); }
		public RawValueEnumCaseListContext rawValueEnumCaseList() {
			return getRuleContext(RawValueEnumCaseListContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
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
		enterRule(_localctx, 96, RULE_rawValueStyleEnumMember);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(552);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(551);
				attributes();
				}
			}

			setState(554);
			match(CASE);
			setState(555);
			rawValueEnumCaseList();
			}
		}
		catch (RecognitionException re) {
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
		public RawValueEnumCaseContext rawValueEnumCase() {
			return getRuleContext(RawValueEnumCaseContext.class,0);
		}
		public TerminalNode Comma() { return getToken(Swift4Parser.Comma, 0); }
		public RawValueEnumCaseListContext rawValueEnumCaseList() {
			return getRuleContext(RawValueEnumCaseListContext.class,0);
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
		enterRule(_localctx, 98, RULE_rawValueEnumCaseList);
		int _la;
		try {
			setState(563);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(557);
				rawValueEnumCase();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(558);
				rawValueEnumCase();
				setState(559);
				match(Comma);
				setState(561);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (FOR - 75)) | (1L << (WITH - 75)) | (1L << (IN - 75)) | (1L << (Identifier - 75)))) != 0)) {
					{
					setState(560);
					rawValueEnumCaseList();
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
		enterRule(_localctx, 100, RULE_rawValueEnumCase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(565);
			identifier();
			setState(567);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				{
				setState(566);
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
		enterRule(_localctx, 102, RULE_unionStyleEnum);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(570);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INDIRECT) {
				{
				setState(569);
				match(INDIRECT);
				}
			}

			setState(572);
			match(ENUM);
			setState(573);
			identifier();
			setState(575);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LessThan) {
				{
				setState(574);
				genericParameterClause();
				}
			}

			setState(578);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(577);
				typeInheritanceClause();
				}
			}

			setState(580);
			match(OpenBrace);
			setState(581);
			unionStyleEnumMembers();
			setState(582);
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
		public UnionStyleEnumMemberContext unionStyleEnumMember() {
			return getRuleContext(UnionStyleEnumMemberContext.class,0);
		}
		public UnionStyleEnumMembersContext unionStyleEnumMembers() {
			return getRuleContext(UnionStyleEnumMembersContext.class,0);
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
		enterRule(_localctx, 104, RULE_unionStyleEnumMembers);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(584);
			unionStyleEnumMember();
			setState(586);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				{
				setState(585);
				unionStyleEnumMembers();
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
		enterRule(_localctx, 106, RULE_unionStyleEnumMember);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(590); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(590);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
					case 1:
						{
						setState(588);
						noise();
						}
						break;
					case 2:
						{
						setState(589);
						caseClause();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(592); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
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
		enterRule(_localctx, 108, RULE_caseClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(595);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(594);
				attributes();
				}
			}

			setState(598);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INDIRECT) {
				{
				setState(597);
				match(INDIRECT);
				}
			}

			setState(600);
			match(CASE);
			setState(601);
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
		public EnumCaseContext enumCase() {
			return getRuleContext(EnumCaseContext.class,0);
		}
		public TerminalNode Comma() { return getToken(Swift4Parser.Comma, 0); }
		public EnumCaseListContext enumCaseList() {
			return getRuleContext(EnumCaseListContext.class,0);
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
		enterRule(_localctx, 110, RULE_enumCaseList);
		try {
			setState(608);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(603);
				enumCase();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(604);
				enumCase();
				setState(605);
				match(Comma);
				setState(606);
				enumCaseList();
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
		enterRule(_localctx, 112, RULE_enumCase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(610);
			identifier();
			setState(612);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				{
				setState(611);
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
		enterRule(_localctx, 114, RULE_importStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(614);
			match(IMPORT);
			setState(615);
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
		public NoiseContext noise() {
			return getRuleContext(NoiseContext.class,0);
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
		enterRule(_localctx, 116, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(618);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(617);
				attributes();
				}
			}

			setState(621);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
			case 1:
				{
				setState(620);
				match(FINAL);
				}
				break;
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

			setState(627);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FINAL) {
				{
				setState(626);
				match(FINAL);
				}
			}

			setState(629);
			match(CLASS);
			setState(630);
			identifier();
			setState(632);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LessThan) {
				{
				setState(631);
				genericParameterClause();
				}
			}

			setState(635);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(634);
				typeInheritanceClause();
				}
			}

			setState(637);
			typeBody();
			setState(639);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
			case 1:
				{
				setState(638);
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
		enterRule(_localctx, 118, RULE_typeInheritanceClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(641);
			match(Colon);
			setState(642);
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
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode Comma() { return getToken(Swift4Parser.Comma, 0); }
		public TypeInheritancesContext typeInheritances() {
			return getRuleContext(TypeInheritancesContext.class,0);
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
		enterRule(_localctx, 120, RULE_typeInheritances);
		try {
			setState(649);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(644);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(645);
				identifier();
				setState(646);
				match(Comma);
				setState(647);
				typeInheritances();
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
		enterRule(_localctx, 122, RULE_typeBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(651);
			match(OpenBrace);
			setState(657);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & ((1L << (AT - 51)) | (1L << (CLASS - 51)) | (1L << (VAR - 51)) | (1L << (LET - 51)) | (1L << (FINAL - 51)) | (1L << (FUNC - 51)) | (1L << (INIT - 51)) | (1L << (PRIVATE - 51)) | (1L << (FILEPRIVATE - 51)) | (1L << (INTERNAL - 51)) | (1L << (PUBLIC - 51)) | (1L << (MUTATING - 51)) | (1L << (CONVENIENCE - 51)) | (1L << (DYNAMIC - 51)) | (1L << (INFIX - 51)) | (1L << (LAZY - 51)) | (1L << (OPTIONAL - 51)) | (1L << (OVERRIDE - 51)) | (1L << (POSTFIX - 51)) | (1L << (PREFIX - 51)) | (1L << (REQUIRED - 51)) | (1L << (UNOWNED - 51)) | (1L << (WEAK - 51)) | (1L << (STATIC - 51)))) != 0)) {
				{
				setState(655);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
				case 1:
					{
					setState(652);
					functionDeclaration();
					}
					break;
				case 2:
					{
					setState(653);
					initializerDeclaration();
					}
					break;
				case 3:
					{
					setState(654);
					typeVariableDeclaration();
					}
					break;
				}
				}
				setState(659);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(660);
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
		enterRule(_localctx, 124, RULE_noise);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(666); 
			_errHandler.sync(this);
			_alt = 1+1;
			do {
				switch (_alt) {
				case 1+1:
					{
					setState(666);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
					case 1:
						{
						setState(662);
						match(ANYCHARS);
						}
						break;
					case 2:
						{
						setState(663);
						keywordNoise();
						}
						break;
					case 3:
						{
						setState(664);
						specialCharacter();
						}
						break;
					case 4:
						{
						setState(665);
						identifier();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(668); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,110,_ctx);
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
		public TypeVarDeclarationContext typeVarDeclaration() {
			return getRuleContext(TypeVarDeclarationContext.class,0);
		}
		public TypeLetDeclarationContext typeLetDeclaration() {
			return getRuleContext(TypeLetDeclarationContext.class,0);
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
		enterRule(_localctx, 126, RULE_typeVariableDeclaration);
		try {
			setState(672);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(670);
				typeVarDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(671);
				typeLetDeclaration();
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

	public static class TypeVarDeclarationContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(Swift4Parser.VAR, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public DeclarationModifiersContext declarationModifiers() {
			return getRuleContext(DeclarationModifiersContext.class,0);
		}
		public NoiseContext noise() {
			return getRuleContext(NoiseContext.class,0);
		}
		public TypeVarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeVarDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).enterTypeVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).exitTypeVarDeclaration(this);
		}
	}

	public final TypeVarDeclarationContext typeVarDeclaration() throws RecognitionException {
		TypeVarDeclarationContext _localctx = new TypeVarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_typeVarDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(675);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(674);
				attributes();
				}
			}

			setState(678);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 54)) & ~0x3f) == 0 && ((1L << (_la - 54)) & ((1L << (CLASS - 54)) | (1L << (FINAL - 54)) | (1L << (PRIVATE - 54)) | (1L << (FILEPRIVATE - 54)) | (1L << (INTERNAL - 54)) | (1L << (PUBLIC - 54)) | (1L << (MUTATING - 54)) | (1L << (CONVENIENCE - 54)) | (1L << (DYNAMIC - 54)) | (1L << (INFIX - 54)) | (1L << (LAZY - 54)) | (1L << (OPTIONAL - 54)) | (1L << (OVERRIDE - 54)) | (1L << (POSTFIX - 54)) | (1L << (PREFIX - 54)) | (1L << (REQUIRED - 54)) | (1L << (UNOWNED - 54)) | (1L << (WEAK - 54)) | (1L << (STATIC - 54)))) != 0)) {
				{
				setState(677);
				declarationModifiers();
				}
			}

			setState(680);
			match(VAR);
			setState(681);
			identifier();
			setState(683);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
			case 1:
				{
				setState(682);
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

	public static class TypeLetDeclarationContext extends ParserRuleContext {
		public TerminalNode LET() { return getToken(Swift4Parser.LET, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public DeclarationModifiersContext declarationModifiers() {
			return getRuleContext(DeclarationModifiersContext.class,0);
		}
		public NoiseContext noise() {
			return getRuleContext(NoiseContext.class,0);
		}
		public TypeLetDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeLetDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).enterTypeLetDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift4Listener ) ((Swift4Listener)listener).exitTypeLetDeclaration(this);
		}
	}

	public final TypeLetDeclarationContext typeLetDeclaration() throws RecognitionException {
		TypeLetDeclarationContext _localctx = new TypeLetDeclarationContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_typeLetDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(686);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(685);
				attributes();
				}
			}

			setState(689);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 54)) & ~0x3f) == 0 && ((1L << (_la - 54)) & ((1L << (CLASS - 54)) | (1L << (FINAL - 54)) | (1L << (PRIVATE - 54)) | (1L << (FILEPRIVATE - 54)) | (1L << (INTERNAL - 54)) | (1L << (PUBLIC - 54)) | (1L << (MUTATING - 54)) | (1L << (CONVENIENCE - 54)) | (1L << (DYNAMIC - 54)) | (1L << (INFIX - 54)) | (1L << (LAZY - 54)) | (1L << (OPTIONAL - 54)) | (1L << (OVERRIDE - 54)) | (1L << (POSTFIX - 54)) | (1L << (PREFIX - 54)) | (1L << (REQUIRED - 54)) | (1L << (UNOWNED - 54)) | (1L << (WEAK - 54)) | (1L << (STATIC - 54)))) != 0)) {
				{
				setState(688);
				declarationModifiers();
				}
			}

			setState(691);
			match(LET);
			setState(692);
			identifier();
			setState(694);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
			case 1:
				{
				setState(693);
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
		enterRule(_localctx, 132, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(696);
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
		enterRule(_localctx, 134, RULE_keywordNoise);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(698);
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
		public TerminalNode OpenBrace() { return getToken(Swift4Parser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(Swift4Parser.CloseBrace, 0); }
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
		enterRule(_localctx, 136, RULE_specialCharacter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(700);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenBracket) | (1L << CloseBracket) | (1L << OpenParen) | (1L << CloseParen) | (1L << OpenBrace) | (1L << CloseBrace) | (1L << SemiColon) | (1L << Comma) | (1L << Assign) | (1L << QuestionMark) | (1L << Colon) | (1L << Ellipsis) | (1L << Dot) | (1L << PlusPlus) | (1L << Plus) | (1L << Minus) | (1L << BitNot) | (1L << Not) | (1L << Multiply) | (1L << Divide) | (1L << Modulus) | (1L << RightShiftArithmetic) | (1L << LeftShiftArithmetic) | (1L << RightShiftLogical) | (1L << LessThan) | (1L << MoreThan) | (1L << LessThanEquals) | (1L << GreaterThanEquals) | (1L << Equals_) | (1L << NotEquals) | (1L << BitAnd) | (1L << BitXOr) | (1L << BitOr) | (1L << And) | (1L << Or) | (1L << MultiplyAssign) | (1L << DivideAssign) | (1L << ModulusAssign) | (1L << PlusAssign) | (1L << MinusAssign) | (1L << LeftShiftArithmeticAssign) | (1L << RightShiftArithmeticAssign) | (1L << RightShiftLogicalAssign) | (1L << BitAndAssign) | (1L << BitXorAssign) | (1L << BitOrAssign))) != 0)) ) {
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
		enterRule(_localctx, 138, RULE_accessModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(702);
			_la = _input.LA(1);
			if ( !(((((_la - 92)) & ~0x3f) == 0 && ((1L << (_la - 92)) & ((1L << (PRIVATE - 92)) | (1L << (FILEPRIVATE - 92)) | (1L << (INTERNAL - 92)) | (1L << (PUBLIC - 92)) | (1L << (MUTATING - 92)))) != 0)) ) {
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3s\u02c3\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\3\2\7\2\u0090"+
		"\n\2\f\2\16\2\u0093\13\2\3\2\3\2\3\2\7\2\u0098\n\2\f\2\16\2\u009b\13\2"+
		"\3\2\5\2\u009e\n\2\3\3\3\3\5\3\u00a2\n\3\3\4\5\4\u00a5\n\4\3\4\5\4\u00a8"+
		"\n\4\3\4\3\4\3\4\5\4\u00ad\n\4\3\5\5\5\u00b0\n\5\3\5\5\5\u00b3\n\5\3\5"+
		"\3\5\3\5\5\5\u00b8\n\5\3\6\3\6\5\6\u00bc\n\6\3\6\3\6\5\6\u00c0\n\6\3\6"+
		"\3\6\3\7\5\7\u00c5\n\7\3\7\5\7\u00c8\n\7\3\7\3\7\5\7\u00cc\n\7\3\b\3\b"+
		"\3\b\5\b\u00d1\n\b\3\b\3\b\3\b\3\t\5\t\u00d7\n\t\3\t\5\t\u00da\n\t\3\t"+
		"\3\t\3\n\3\n\6\n\u00e0\n\n\r\n\16\n\u00e1\3\13\3\13\3\f\3\f\5\f\u00e8"+
		"\n\f\3\f\5\f\u00eb\n\f\3\r\3\r\5\r\u00ef\n\r\3\r\3\r\3\16\5\16\u00f4\n"+
		"\16\3\17\3\17\3\17\7\17\u00f9\n\17\f\17\16\17\u00fc\13\17\3\17\3\17\3"+
		"\17\3\17\3\17\5\17\u0103\n\17\3\20\3\20\3\20\7\20\u0108\n\20\f\20\16\20"+
		"\u010b\13\20\3\21\5\21\u010e\n\21\3\21\5\21\u0111\n\21\3\21\3\21\3\21"+
		"\5\21\u0116\n\21\3\22\5\22\u0119\n\22\3\22\5\22\u011c\n\22\3\22\3\22\3"+
		"\22\5\22\u0121\n\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\5\24"+
		"\u012c\n\24\3\25\3\25\3\25\3\25\3\25\5\25\u0133\n\25\3\26\3\26\3\27\3"+
		"\27\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u013f\n\30\3\31\3\31\3\31\3\31"+
		"\3\31\5\31\u0146\n\31\3\32\5\32\u0149\n\32\3\32\3\32\3\32\5\32\u014e\n"+
		"\32\3\32\3\32\5\32\u0152\n\32\3\33\3\33\3\33\3\34\5\34\u0158\n\34\3\35"+
		"\3\35\5\35\u015c\n\35\3\35\3\35\3\35\3\35\5\35\u0162\n\35\3\35\3\35\5"+
		"\35\u0166\n\35\3\35\3\35\3\35\3\35\5\35\u016c\n\35\3\35\3\35\5\35\u0170"+
		"\n\35\3\35\3\35\5\35\u0174\n\35\3\35\3\35\5\35\u0178\n\35\3\35\3\35\5"+
		"\35\u017c\n\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37\5\37\u0185\n\37\3\37"+
		"\3\37\5\37\u0189\n\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \5 \u0193\n \3 \3 "+
		"\5 \u0197\n \3!\3!\3!\3!\3!\5!\u019e\n!\3\"\5\"\u01a1\n\"\3\"\5\"\u01a4"+
		"\n\"\3\"\3\"\3\"\3\"\5\"\u01aa\n\"\3\"\3\"\5\"\u01ae\n\"\3#\3#\3#\3#\3"+
		"#\3#\3$\3$\3$\3$\3$\5$\u01bb\n$\3%\3%\3%\5%\u01c0\n%\3%\3%\3%\5%\u01c5"+
		"\n%\3&\3&\3\'\3\'\3(\6(\u01cc\n(\r(\16(\u01cd\3)\3)\3)\5)\u01d3\n)\3*"+
		"\3*\5*\u01d7\n*\3*\3*\3+\6+\u01dc\n+\r+\16+\u01dd\3,\3,\5,\u01e2\n,\3"+
		",\3,\3,\5,\u01e7\n,\3,\3,\3,\5,\u01ec\n,\3,\3,\3,\5,\u01f1\n,\3-\3-\3"+
		"-\5-\u01f6\n-\3.\5.\u01f9\n.\3.\5.\u01fc\n.\3.\5.\u01ff\n.\3.\5.\u0202"+
		"\n.\3.\3.\3.\5.\u0207\n.\3.\5.\u020a\n.\3.\3.\5.\u020e\n.\3/\5/\u0211"+
		"\n/\3/\5/\u0214\n/\3/\3/\5/\u0218\n/\3\60\3\60\3\60\5\60\u021d\n\60\3"+
		"\60\5\60\u0220\n\60\3\60\3\60\3\60\3\60\3\61\3\61\5\61\u0228\n\61\3\62"+
		"\5\62\u022b\n\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\5\63\u0234\n\63\5"+
		"\63\u0236\n\63\3\64\3\64\5\64\u023a\n\64\3\65\5\65\u023d\n\65\3\65\3\65"+
		"\3\65\5\65\u0242\n\65\3\65\5\65\u0245\n\65\3\65\3\65\3\65\3\65\3\66\3"+
		"\66\5\66\u024d\n\66\3\67\3\67\6\67\u0251\n\67\r\67\16\67\u0252\38\58\u0256"+
		"\n8\38\58\u0259\n8\38\38\38\39\39\39\39\39\59\u0263\n9\3:\3:\5:\u0267"+
		"\n:\3;\3;\3;\3<\5<\u026d\n<\3<\5<\u0270\n<\3<\5<\u0273\n<\3<\5<\u0276"+
		"\n<\3<\3<\3<\5<\u027b\n<\3<\5<\u027e\n<\3<\3<\5<\u0282\n<\3=\3=\3=\3>"+
		"\3>\3>\3>\3>\5>\u028c\n>\3?\3?\3?\3?\7?\u0292\n?\f?\16?\u0295\13?\3?\3"+
		"?\3@\3@\3@\3@\6@\u029d\n@\r@\16@\u029e\3A\3A\5A\u02a3\nA\3B\5B\u02a6\n"+
		"B\3B\5B\u02a9\nB\3B\3B\3B\5B\u02ae\nB\3C\5C\u02b1\nC\3C\5C\u02b4\nC\3"+
		"C\3C\3C\5C\u02b9\nC\3D\3D\3E\3E\3F\3F\3G\3G\3G\3\u029e\2H\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^"+
		"`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\2\b\4\2\f\f"+
		"\26\26\5\288FFcn\6\2MMSSYYoo\7\2\65\67=CFPR]cn\6\2\3\20\22\22\24\"%\64"+
		"\3\2^b\2\u0302\2\u0091\3\2\2\2\4\u00a1\3\2\2\2\6\u00a4\3\2\2\2\b\u00af"+
		"\3\2\2\2\n\u00b9\3\2\2\2\f\u00c4\3\2\2\2\16\u00cd\3\2\2\2\20\u00d6\3\2"+
		"\2\2\22\u00df\3\2\2\2\24\u00e3\3\2\2\2\26\u00e5\3\2\2\2\30\u00ec\3\2\2"+
		"\2\32\u00f3\3\2\2\2\34\u0102\3\2\2\2\36\u0109\3\2\2\2 \u010d\3\2\2\2\""+
		"\u0118\3\2\2\2$\u0122\3\2\2\2&\u012b\3\2\2\2(\u0132\3\2\2\2*\u0134\3\2"+
		"\2\2,\u0136\3\2\2\2.\u013e\3\2\2\2\60\u0145\3\2\2\2\62\u0148\3\2\2\2\64"+
		"\u0153\3\2\2\2\66\u0157\3\2\2\28\u017b\3\2\2\2:\u017d\3\2\2\2<\u0184\3"+
		"\2\2\2>\u0196\3\2\2\2@\u019d\3\2\2\2B\u01ad\3\2\2\2D\u01af\3\2\2\2F\u01ba"+
		"\3\2\2\2H\u01c4\3\2\2\2J\u01c6\3\2\2\2L\u01c8\3\2\2\2N\u01cb\3\2\2\2P"+
		"\u01cf\3\2\2\2R\u01d4\3\2\2\2T\u01db\3\2\2\2V\u01f0\3\2\2\2X\u01f5\3\2"+
		"\2\2Z\u01f8\3\2\2\2\\\u0210\3\2\2\2^\u0219\3\2\2\2`\u0225\3\2\2\2b\u022a"+
		"\3\2\2\2d\u0235\3\2\2\2f\u0237\3\2\2\2h\u023c\3\2\2\2j\u024a\3\2\2\2l"+
		"\u0250\3\2\2\2n\u0255\3\2\2\2p\u0262\3\2\2\2r\u0264\3\2\2\2t\u0268\3\2"+
		"\2\2v\u026c\3\2\2\2x\u0283\3\2\2\2z\u028b\3\2\2\2|\u028d\3\2\2\2~\u029c"+
		"\3\2\2\2\u0080\u02a2\3\2\2\2\u0082\u02a5\3\2\2\2\u0084\u02b0\3\2\2\2\u0086"+
		"\u02ba\3\2\2\2\u0088\u02bc\3\2\2\2\u008a\u02be\3\2\2\2\u008c\u02c0\3\2"+
		"\2\2\u008e\u0090\5t;\2\u008f\u008e\3\2\2\2\u0090\u0093\3\2\2\2\u0091\u008f"+
		"\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0099\3\2\2\2\u0093\u0091\3\2\2\2\u0094"+
		"\u0098\5X-\2\u0095\u0098\5\16\b\2\u0096\u0098\5\4\3\2\u0097\u0094\3\2"+
		"\2\2\u0097\u0095\3\2\2\2\u0097\u0096\3\2\2\2\u0098\u009b\3\2\2\2\u0099"+
		"\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009d\3\2\2\2\u009b\u0099\3\2"+
		"\2\2\u009c\u009e\5~@\2\u009d\u009c\3\2\2\2\u009d\u009e\3\2\2\2\u009e\3"+
		"\3\2\2\2\u009f\u00a2\5\6\4\2\u00a0\u00a2\5\b\5\2\u00a1\u009f\3\2\2\2\u00a1"+
		"\u00a0\3\2\2\2\u00a2\5\3\2\2\2\u00a3\u00a5\5N(\2\u00a4\u00a3\3\2\2\2\u00a4"+
		"\u00a5\3\2\2\2\u00a5\u00a7\3\2\2\2\u00a6\u00a8\5\22\n\2\u00a7\u00a6\3"+
		"\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa\7D\2\2\u00aa"+
		"\u00ac\5\u0086D\2\u00ab\u00ad\5~@\2\u00ac\u00ab\3\2\2\2\u00ac\u00ad\3"+
		"\2\2\2\u00ad\7\3\2\2\2\u00ae\u00b0\5N(\2\u00af\u00ae\3\2\2\2\u00af\u00b0"+
		"\3\2\2\2\u00b0\u00b2\3\2\2\2\u00b1\u00b3\5\22\n\2\u00b2\u00b1\3\2\2\2"+
		"\u00b2\u00b3\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\7E\2\2\u00b5\u00b7"+
		"\5\u0086D\2\u00b6\u00b8\5~@\2\u00b7\u00b6\3\2\2\2\u00b7\u00b8\3\2\2\2"+
		"\u00b8\t\3\2\2\2\u00b9\u00bb\5\f\7\2\u00ba\u00bc\5$\23\2\u00bb\u00ba\3"+
		"\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00bf\5.\30\2\u00be"+
		"\u00c0\7W\2\2\u00bf\u00be\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c1\3\2"+
		"\2\2\u00c1\u00c2\5\32\16\2\u00c2\13\3\2\2\2\u00c3\u00c5\5N(\2\u00c4\u00c3"+
		"\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c7\3\2\2\2\u00c6\u00c8\5\22\n\2"+
		"\u00c7\u00c6\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00cb"+
		"\7]\2\2\u00ca\u00cc\t\2\2\2\u00cb\u00ca\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc"+
		"\r\3\2\2\2\u00cd\u00ce\5\20\t\2\u00ce\u00d0\5\u0086D\2\u00cf\u00d1\5$"+
		"\23\2\u00d0\u00cf\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2"+
		"\u00d3\5\26\f\2\u00d3\u00d4\5\32\16\2\u00d4\17\3\2\2\2\u00d5\u00d7\5N"+
		"(\2\u00d6\u00d5\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d9\3\2\2\2\u00d8"+
		"\u00da\5\22\n\2\u00d9\u00d8\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00db\3"+
		"\2\2\2\u00db\u00dc\7Q\2\2\u00dc\21\3\2\2\2\u00dd\u00e0\5\u008cG\2\u00de"+
		"\u00e0\5\24\13\2\u00df\u00dd\3\2\2\2\u00df\u00de\3\2\2\2\u00e0\u00e1\3"+
		"\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\23\3\2\2\2\u00e3"+
		"\u00e4\t\3\2\2\u00e4\25\3\2\2\2\u00e5\u00e7\5.\30\2\u00e6\u00e8\7W\2\2"+
		"\u00e7\u00e6\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00ea\3\2\2\2\u00e9\u00eb"+
		"\5\30\r\2\u00ea\u00e9\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\27\3\2\2\2\u00ec"+
		"\u00ee\7\23\2\2\u00ed\u00ef\5N(\2\u00ee\u00ed\3\2\2\2\u00ee\u00ef\3\2"+
		"\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f1\58\35\2\u00f1\31\3\2\2\2\u00f2\u00f4"+
		"\5\34\17\2\u00f3\u00f2\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\33\3\2\2\2\u00f5"+
		"\u00f6\7\7\2\2\u00f6\u00fa\5\36\20\2\u00f7\u00f9\5\34\17\2\u00f8\u00f7"+
		"\3\2\2\2\u00f9\u00fc\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb"+
		"\u00fd\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fd\u00fe\5\36\20\2\u00fe\u00ff\7"+
		"\b\2\2\u00ff\u0103\3\2\2\2\u0100\u0101\7\7\2\2\u0101\u0103\7\b\2\2\u0102"+
		"\u00f5\3\2\2\2\u0102\u0100\3\2\2\2\u0103\35\3\2\2\2\u0104\u0108\5~@\2"+
		"\u0105\u0108\5 \21\2\u0106\u0108\5\"\22\2\u0107\u0104\3\2\2\2\u0107\u0105"+
		"\3\2\2\2\u0107\u0106\3\2\2\2\u0108\u010b\3\2\2\2\u0109\u0107\3\2\2\2\u0109"+
		"\u010a\3\2\2\2\u010a\37\3\2\2\2\u010b\u0109\3\2\2\2\u010c\u010e\5N(\2"+
		"\u010d\u010c\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u0110\3\2\2\2\u010f\u0111"+
		"\5\22\n\2\u0110\u010f\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0112\3\2\2\2"+
		"\u0112\u0113\7D\2\2\u0113\u0115\5\u0086D\2\u0114\u0116\5~@\2\u0115\u0114"+
		"\3\2\2\2\u0115\u0116\3\2\2\2\u0116!\3\2\2\2\u0117\u0119\5N(\2\u0118\u0117"+
		"\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011b\3\2\2\2\u011a\u011c\5\22\n\2"+
		"\u011b\u011a\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011e"+
		"\7E\2\2\u011e\u0120\5\u0086D\2\u011f\u0121\5~@\2\u0120\u011f\3\2\2\2\u0120"+
		"\u0121\3\2\2\2\u0121#\3\2\2\2\u0122\u0123\7\35\2\2\u0123\u0124\5&\24\2"+
		"\u0124\u0125\7\36\2\2\u0125%\3\2\2\2\u0126\u012c\5(\25\2\u0127\u0128\5"+
		"(\25\2\u0128\u0129\7\n\2\2\u0129\u012a\5&\24\2\u012a\u012c\3\2\2\2\u012b"+
		"\u0126\3\2\2\2\u012b\u0127\3\2\2\2\u012c\'\3\2\2\2\u012d\u0133\5*\26\2"+
		"\u012e\u012f\5*\26\2\u012f\u0130\7\r\2\2\u0130\u0131\5,\27\2\u0131\u0133"+
		"\3\2\2\2\u0132\u012d\3\2\2\2\u0132\u012e\3\2\2\2\u0133)\3\2\2\2\u0134"+
		"\u0135\5\u0086D\2\u0135+\3\2\2\2\u0136\u0137\5\u0086D\2\u0137-\3\2\2\2"+
		"\u0138\u0139\7\5\2\2\u0139\u013f\7\6\2\2\u013a\u013b\7\5\2\2\u013b\u013c"+
		"\5\60\31\2\u013c\u013d\7\6\2\2\u013d\u013f\3\2\2\2\u013e\u0138\3\2\2\2"+
		"\u013e\u013a\3\2\2\2\u013f/\3\2\2\2\u0140\u0146\5\62\32\2\u0141\u0142"+
		"\5\62\32\2\u0142\u0143\7\n\2\2\u0143\u0144\5\60\31\2\u0144\u0146\3\2\2"+
		"\2\u0145\u0140\3\2\2\2\u0145\u0141\3\2\2\2\u0146\61\3\2\2\2\u0147\u0149"+
		"\5J&\2\u0148\u0147\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014a\3\2\2\2\u014a"+
		"\u014b\5L\'\2\u014b\u014d\7\r\2\2\u014c\u014e\7[\2\2\u014d\u014c\3\2\2"+
		"\2\u014d\u014e\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0151\58\35\2\u0150\u0152"+
		"\5\64\33\2\u0151\u0150\3\2\2\2\u0151\u0152\3\2\2\2\u0152\63\3\2\2\2\u0153"+
		"\u0154\7\13\2\2\u0154\u0155\5\66\34\2\u0155\65\3\2\2\2\u0156\u0158\5~"+
		"@\2\u0157\u0156\3\2\2\2\u0157\u0158\3\2\2\2\u0158\67\3\2\2\2\u0159\u015b"+
		"\5,\27\2\u015a\u015c\t\2\2\2\u015b\u015a\3\2\2\2\u015b\u015c\3\2\2\2\u015c"+
		"\u017c\3\2\2\2\u015d\u015e\7\3\2\2\u015e\u015f\58\35\2\u015f\u0161\7\4"+
		"\2\2\u0160\u0162\t\2\2\2\u0161\u0160\3\2\2\2\u0161\u0162\3\2\2\2\u0162"+
		"\u017c\3\2\2\2\u0163\u0165\5<\37\2\u0164\u0166\t\2\2\2\u0165\u0164\3\2"+
		"\2\2\u0165\u0166\3\2\2\2\u0166\u017c\3\2\2\2\u0167\u0168\7\5\2\2\u0168"+
		"\u0169\58\35\2\u0169\u016b\7\6\2\2\u016a\u016c\t\2\2\2\u016b\u016a\3\2"+
		"\2\2\u016b\u016c\3\2\2\2\u016c\u017c\3\2\2\2\u016d\u016f\5D#\2\u016e\u0170"+
		"\t\2\2\2\u016f\u016e\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u017c\3\2\2\2\u0171"+
		"\u0173\5:\36\2\u0172\u0174\t\2\2\2\u0173\u0172\3\2\2\2\u0173\u0174\3\2"+
		"\2\2\u0174\u017c\3\2\2\2\u0175\u0177\7\66\2\2\u0176\u0178\t\2\2\2\u0177"+
		"\u0176\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u017c\3\2\2\2\u0179\u017c\7R"+
		"\2\2\u017a\u017c\7K\2\2\u017b\u0159\3\2\2\2\u017b\u015d\3\2\2\2\u017b"+
		"\u0163\3\2\2\2\u017b\u0167\3\2\2\2\u017b\u016d\3\2\2\2\u017b\u0171\3\2"+
		"\2\2\u017b\u0175\3\2\2\2\u017b\u0179\3\2\2\2\u017b\u017a\3\2\2\2\u017c"+
		"9\3\2\2\2\u017d\u017e\7\3\2\2\u017e\u017f\58\35\2\u017f\u0180\7\r\2\2"+
		"\u0180\u0181\58\35\2\u0181\u0182\7\4\2\2\u0182;\3\2\2\2\u0183\u0185\5"+
		"N(\2\u0184\u0183\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u0186\3\2\2\2\u0186"+
		"\u0188\5> \2\u0187\u0189\7W\2\2\u0188\u0187\3\2\2\2\u0188\u0189\3\2\2"+
		"\2\u0189\u018a\3\2\2\2\u018a\u018b\7\23\2\2\u018b\u018c\58\35\2\u018c"+
		"=\3\2\2\2\u018d\u018e\7\5\2\2\u018e\u0197\7\6\2\2\u018f\u0190\7\5\2\2"+
		"\u0190\u0192\5@!\2\u0191\u0193\7\16\2\2\u0192\u0191\3\2\2\2\u0192\u0193"+
		"\3\2\2\2\u0193\u0194\3\2\2\2\u0194\u0195\7\6\2\2\u0195\u0197\3\2\2\2\u0196"+
		"\u018d\3\2\2\2\u0196\u018f\3\2\2\2\u0197?\3\2\2\2\u0198\u019e\5B\"\2\u0199"+
		"\u019a\5B\"\2\u019a\u019b\7\n\2\2\u019b\u019c\5@!\2\u019c\u019e\3\2\2"+
		"\2\u019d\u0198\3\2\2\2\u019d\u0199\3\2\2\2\u019eA\3\2\2\2\u019f\u01a1"+
		"\5N(\2\u01a0\u019f\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\u01a3\3\2\2\2\u01a2"+
		"\u01a4\7[\2\2\u01a3\u01a2\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a5\3\2"+
		"\2\2\u01a5\u01ae\58\35\2\u01a6\u01a7\5\u0086D\2\u01a7\u01a9\7\r\2\2\u01a8"+
		"\u01aa\7[\2\2\u01a9\u01a8\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01ab\3\2"+
		"\2\2\u01ab\u01ac\58\35\2\u01ac\u01ae\3\2\2\2\u01ad\u01a0\3\2\2\2\u01ad"+
		"\u01a6\3\2\2\2\u01aeC\3\2\2\2\u01af\u01b0\7\5\2\2\u01b0\u01b1\5H%\2\u01b1"+
		"\u01b2\7\n\2\2\u01b2\u01b3\5F$\2\u01b3\u01b4\7\6\2\2\u01b4E\3\2\2\2\u01b5"+
		"\u01bb\5H%\2\u01b6\u01b7\5H%\2\u01b7\u01b8\7\n\2\2\u01b8\u01b9\5F$\2\u01b9"+
		"\u01bb\3\2\2\2\u01ba\u01b5\3\2\2\2\u01ba\u01b6\3\2\2\2\u01bbG\3\2\2\2"+
		"\u01bc\u01bd\5\u0086D\2\u01bd\u01bf\7\r\2\2\u01be\u01c0\7[\2\2\u01bf\u01be"+
		"\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01c2\58\35\2\u01c2"+
		"\u01c5\3\2\2\2\u01c3\u01c5\58\35\2\u01c4\u01bc\3\2\2\2\u01c4\u01c3\3\2"+
		"\2\2\u01c5I\3\2\2\2\u01c6\u01c7\5\u0086D\2\u01c7K\3\2\2\2\u01c8\u01c9"+
		"\5\u0086D\2\u01c9M\3\2\2\2\u01ca\u01cc\5P)\2\u01cb\u01ca\3\2\2\2\u01cc"+
		"\u01cd\3\2\2\2\u01cd\u01cb\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ceO\3\2\2\2"+
		"\u01cf\u01d0\7\65\2\2\u01d0\u01d2\5\u0086D\2\u01d1\u01d3\5R*\2\u01d2\u01d1"+
		"\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3Q\3\2\2\2\u01d4\u01d6\7\5\2\2\u01d5"+
		"\u01d7\5T+\2\u01d6\u01d5\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7\u01d8\3\2\2"+
		"\2\u01d8\u01d9\7\6\2\2\u01d9S\3\2\2\2\u01da\u01dc\5V,\2\u01db\u01da\3"+
		"\2\2\2\u01dc\u01dd\3\2\2\2\u01dd\u01db\3\2\2\2\u01dd\u01de\3\2\2\2\u01de"+
		"U\3\2\2\2\u01df\u01e1\7\5\2\2\u01e0\u01e2\5T+\2\u01e1\u01e0\3\2\2\2\u01e1"+
		"\u01e2\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3\u01f1\7\6\2\2\u01e4\u01e6\7\7"+
		"\2\2\u01e5\u01e7\5T+\2\u01e6\u01e5\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7\u01e8"+
		"\3\2\2\2\u01e8\u01f1\7\b\2\2\u01e9\u01eb\7\3\2\2\u01ea\u01ec\5T+\2\u01eb"+
		"\u01ea\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed\u01f1\7\4"+
		"\2\2\u01ee\u01f1\5\u0086D\2\u01ef\u01f1\5\u008aF\2\u01f0\u01df\3\2\2\2"+
		"\u01f0\u01e4\3\2\2\2\u01f0\u01e9\3\2\2\2\u01f0\u01ee\3\2\2\2\u01f0\u01ef"+
		"\3\2\2\2\u01f1W\3\2\2\2\u01f2\u01f6\5v<\2\u01f3\u01f6\5\\/\2\u01f4\u01f6"+
		"\5Z.\2\u01f5\u01f2\3\2\2\2\u01f5\u01f3\3\2\2\2\u01f5\u01f4\3\2\2\2\u01f6"+
		"Y\3\2\2\2\u01f7\u01f9\5N(\2\u01f8\u01f7\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9"+
		"\u01fb\3\2\2\2\u01fa\u01fc\7F\2\2\u01fb\u01fa\3\2\2\2\u01fb\u01fc\3\2"+
		"\2\2\u01fc\u01fe\3\2\2\2\u01fd\u01ff\5\u008cG\2\u01fe\u01fd\3\2\2\2\u01fe"+
		"\u01ff\3\2\2\2\u01ff\u0201\3\2\2\2\u0200\u0202\7F\2\2\u0201\u0200\3\2"+
		"\2\2\u0201\u0202\3\2\2\2\u0202\u0203\3\2\2\2\u0203\u0204\7<\2\2\u0204"+
		"\u0206\5\u0086D\2\u0205\u0207\5$\23\2\u0206\u0205\3\2\2\2\u0206\u0207"+
		"\3\2\2\2\u0207\u0209\3\2\2\2\u0208\u020a\5x=\2\u0209\u0208\3\2\2\2\u0209"+
		"\u020a\3\2\2\2\u020a\u020b\3\2\2\2\u020b\u020d\5|?\2\u020c\u020e\5~@\2"+
		"\u020d\u020c\3\2\2\2\u020d\u020e\3\2\2\2\u020e[\3\2\2\2\u020f\u0211\5"+
		"N(\2\u0210\u020f\3\2\2\2\u0210\u0211\3\2\2\2\u0211\u0213\3\2\2\2\u0212"+
		"\u0214\5\u008cG\2\u0213\u0212\3\2\2\2\u0213\u0214\3\2\2\2\u0214\u0217"+
		"\3\2\2\2\u0215\u0218\5h\65\2\u0216\u0218\5^\60\2\u0217\u0215\3\2\2\2\u0217"+
		"\u0216\3\2\2\2\u0218]\3\2\2\2\u0219\u021a\79\2\2\u021a\u021c\5\u0086D"+
		"\2\u021b\u021d\5$\23\2\u021c\u021b\3\2\2\2\u021c\u021d\3\2\2\2\u021d\u021f"+
		"\3\2\2\2\u021e\u0220\5x=\2\u021f\u021e\3\2\2\2\u021f\u0220\3\2\2\2\u0220"+
		"\u0221\3\2\2\2\u0221\u0222\7\7\2\2\u0222\u0223\5`\61\2\u0223\u0224\7\b"+
		"\2\2\u0224_\3\2\2\2\u0225\u0227\5b\62\2\u0226\u0228\5`\61\2\u0227\u0226"+
		"\3\2\2\2\u0227\u0228\3\2\2\2\u0228a\3\2\2\2\u0229\u022b\5N(\2\u022a\u0229"+
		"\3\2\2\2\u022a\u022b\3\2\2\2\u022b\u022c\3\2\2\2\u022c\u022d\7A\2\2\u022d"+
		"\u022e\5d\63\2\u022ec\3\2\2\2\u022f\u0236\5f\64\2\u0230\u0231\5f\64\2"+
		"\u0231\u0233\7\n\2\2\u0232\u0234\5d\63\2\u0233\u0232\3\2\2\2\u0233\u0234"+
		"\3\2\2\2\u0234\u0236\3\2\2\2\u0235\u022f\3\2\2\2\u0235\u0230\3\2\2\2\u0236"+
		"e\3\2\2\2\u0237\u0239\5\u0086D\2\u0238\u023a\5~@\2\u0239\u0238\3\2\2\2"+
		"\u0239\u023a\3\2\2\2\u023ag\3\2\2\2\u023b\u023d\7\\\2\2\u023c\u023b\3"+
		"\2\2\2\u023c\u023d\3\2\2\2\u023d\u023e\3\2\2\2\u023e\u023f\79\2\2\u023f"+
		"\u0241\5\u0086D\2\u0240\u0242\5$\23\2\u0241\u0240\3\2\2\2\u0241\u0242"+
		"\3\2\2\2\u0242\u0244\3\2\2\2\u0243\u0245\5x=\2\u0244\u0243\3\2\2\2\u0244"+
		"\u0245\3\2\2\2\u0245\u0246\3\2\2\2\u0246\u0247\7\7\2\2\u0247\u0248\5j"+
		"\66\2\u0248\u0249\7\b\2\2\u0249i\3\2\2\2\u024a\u024c\5l\67\2\u024b\u024d"+
		"\5j\66\2\u024c\u024b\3\2\2\2\u024c\u024d\3\2\2\2\u024dk\3\2\2\2\u024e"+
		"\u0251\5~@\2\u024f\u0251\5n8\2\u0250\u024e\3\2\2\2\u0250\u024f\3\2\2\2"+
		"\u0251\u0252\3\2\2\2\u0252\u0250\3\2\2\2\u0252\u0253\3\2\2\2\u0253m\3"+
		"\2\2\2\u0254\u0256\5N(\2\u0255\u0254\3\2\2\2\u0255\u0256\3\2\2\2\u0256"+
		"\u0258\3\2\2\2\u0257\u0259\7\\\2\2\u0258\u0257\3\2\2\2\u0258\u0259\3\2"+
		"\2\2\u0259\u025a\3\2\2\2\u025a\u025b\7A\2\2\u025b\u025c\5p9\2\u025co\3"+
		"\2\2\2\u025d\u0263\5r:\2\u025e\u025f\5r:\2\u025f\u0260\7\n\2\2\u0260\u0261"+
		"\5p9\2\u0261\u0263\3\2\2\2\u0262\u025d\3\2\2\2\u0262\u025e\3\2\2\2\u0263"+
		"q\3\2\2\2\u0264\u0266\5\u0086D\2\u0265\u0267\5D#\2\u0266\u0265\3\2\2\2"+
		"\u0266\u0267\3\2\2\2\u0267s\3\2\2\2\u0268\u0269\7\67\2\2\u0269\u026a\5"+
		"\u0086D\2\u026au\3\2\2\2\u026b\u026d\5N(\2\u026c\u026b\3\2\2\2\u026c\u026d"+
		"\3\2\2\2\u026d\u026f\3\2\2\2\u026e\u0270\7F\2\2\u026f\u026e\3\2\2\2\u026f"+
		"\u0270\3\2\2\2\u0270\u0272\3\2\2\2\u0271\u0273\5\u008cG\2\u0272\u0271"+
		"\3\2\2\2\u0272\u0273\3\2\2\2\u0273\u0275\3\2\2\2\u0274\u0276\7F\2\2\u0275"+
		"\u0274\3\2\2\2\u0275\u0276\3\2\2\2\u0276\u0277\3\2\2\2\u0277\u0278\78"+
		"\2\2\u0278\u027a\5\u0086D\2\u0279\u027b\5$\23\2\u027a\u0279\3\2\2\2\u027a"+
		"\u027b\3\2\2\2\u027b\u027d\3\2\2\2\u027c\u027e\5x=\2\u027d\u027c\3\2\2"+
		"\2\u027d\u027e\3\2\2\2\u027e\u027f\3\2\2\2\u027f\u0281\5|?\2\u0280\u0282"+
		"\5~@\2\u0281\u0280\3\2\2\2\u0281\u0282\3\2\2\2\u0282w\3\2\2\2\u0283\u0284"+
		"\7\r\2\2\u0284\u0285\5z>\2\u0285y\3\2\2\2\u0286\u028c\5\u0086D\2\u0287"+
		"\u0288\5\u0086D\2\u0288\u0289\7\n\2\2\u0289\u028a\5z>\2\u028a\u028c\3"+
		"\2\2\2\u028b\u0286\3\2\2\2\u028b\u0287\3\2\2\2\u028c{\3\2\2\2\u028d\u0293"+
		"\7\7\2\2\u028e\u0292\5\16\b\2\u028f\u0292\5\n\6\2\u0290\u0292\5\u0080"+
		"A\2\u0291\u028e\3\2\2\2\u0291\u028f\3\2\2\2\u0291\u0290\3\2\2\2\u0292"+
		"\u0295\3\2\2\2\u0293\u0291\3\2\2\2\u0293\u0294\3\2\2\2\u0294\u0296\3\2"+
		"\2\2\u0295\u0293\3\2\2\2\u0296\u0297\7\b\2\2\u0297}\3\2\2\2\u0298\u029d"+
		"\7s\2\2\u0299\u029d\5\u0088E\2\u029a\u029d\5\u008aF\2\u029b\u029d\5\u0086"+
		"D\2\u029c\u0298\3\2\2\2\u029c\u0299\3\2\2\2\u029c\u029a\3\2\2\2\u029c"+
		"\u029b\3\2\2\2\u029d\u029e\3\2\2\2\u029e\u029f\3\2\2\2\u029e\u029c\3\2"+
		"\2\2\u029f\177\3\2\2\2\u02a0\u02a3\5\u0082B\2\u02a1\u02a3\5\u0084C\2\u02a2"+
		"\u02a0\3\2\2\2\u02a2\u02a1\3\2\2\2\u02a3\u0081\3\2\2\2\u02a4\u02a6\5N"+
		"(\2\u02a5\u02a4\3\2\2\2\u02a5\u02a6\3\2\2\2\u02a6\u02a8\3\2\2\2\u02a7"+
		"\u02a9\5\22\n\2\u02a8\u02a7\3\2\2\2\u02a8\u02a9\3\2\2\2\u02a9\u02aa\3"+
		"\2\2\2\u02aa\u02ab\7D\2\2\u02ab\u02ad\5\u0086D\2\u02ac\u02ae\5~@\2\u02ad"+
		"\u02ac\3\2\2\2\u02ad\u02ae\3\2\2\2\u02ae\u0083\3\2\2\2\u02af\u02b1\5N"+
		"(\2\u02b0\u02af\3\2\2\2\u02b0\u02b1\3\2\2\2\u02b1\u02b3\3\2\2\2\u02b2"+
		"\u02b4\5\22\n\2\u02b3\u02b2\3\2\2\2\u02b3\u02b4\3\2\2\2\u02b4\u02b5\3"+
		"\2\2\2\u02b5\u02b6\7E\2\2\u02b6\u02b8\5\u0086D\2\u02b7\u02b9\5~@\2\u02b8"+
		"\u02b7\3\2\2\2\u02b8\u02b9\3\2\2\2\u02b9\u0085\3\2\2\2\u02ba\u02bb\t\4"+
		"\2\2\u02bb\u0087\3\2\2\2\u02bc\u02bd\t\5\2\2\u02bd\u0089\3\2\2\2\u02be"+
		"\u02bf\t\6\2\2\u02bf\u008b\3\2\2\2\u02c0\u02c1\t\7\2\2\u02c1\u008d\3\2"+
		"\2\2x\u0091\u0097\u0099\u009d\u00a1\u00a4\u00a7\u00ac\u00af\u00b2\u00b7"+
		"\u00bb\u00bf\u00c4\u00c7\u00cb\u00d0\u00d6\u00d9\u00df\u00e1\u00e7\u00ea"+
		"\u00ee\u00f3\u00fa\u0102\u0107\u0109\u010d\u0110\u0115\u0118\u011b\u0120"+
		"\u012b\u0132\u013e\u0145\u0148\u014d\u0151\u0157\u015b\u0161\u0165\u016b"+
		"\u016f\u0173\u0177\u017b\u0184\u0188\u0192\u0196\u019d\u01a0\u01a3\u01a9"+
		"\u01ad\u01ba\u01bf\u01c4\u01cd\u01d2\u01d6\u01dd\u01e1\u01e6\u01eb\u01f0"+
		"\u01f5\u01f8\u01fb\u01fe\u0201\u0206\u0209\u020d\u0210\u0213\u0217\u021c"+
		"\u021f\u0227\u022a\u0233\u0235\u0239\u023c\u0241\u0244\u024c\u0250\u0252"+
		"\u0255\u0258\u0262\u0266\u026c\u026f\u0272\u0275\u027a\u027d\u0281\u028b"+
		"\u0291\u0293\u029c\u029e\u02a2\u02a5\u02a8\u02ad\u02b0\u02b3\u02b8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}