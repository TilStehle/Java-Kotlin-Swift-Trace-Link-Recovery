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
		RULE_typeDefinition = 43, RULE_protocolDeclaration = 44, RULE_structDeclaration = 45, 
		RULE_enumDeclaration = 46, RULE_rawValueStyleEnum = 47, RULE_rawValueStyleEnumMembers = 48, 
		RULE_rawValueStyleEnumMember = 49, RULE_rawValueEnumCaseList = 50, RULE_rawValueEnumCase = 51, 
		RULE_unionStyleEnum = 52, RULE_unionStyleEnumMembers = 53, RULE_unionStyleEnumMember = 54, 
		RULE_caseClause = 55, RULE_enumCaseList = 56, RULE_enumCase = 57, RULE_importStatement = 58, 
		RULE_classDeclaration = 59, RULE_typeInheritanceClause = 60, RULE_typeInheritances = 61, 
		RULE_typeBody = 62, RULE_noise = 63, RULE_typeVariableDeclaration = 64, 
		RULE_typeVarDeclaration = 65, RULE_typeLetDeclaration = 66, RULE_identifier = 67, 
		RULE_keywordNoise = 68, RULE_specialCharacter = 69, RULE_accessModifier = 70;
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
		"typeDefinition", "protocolDeclaration", "structDeclaration", "enumDeclaration", 
		"rawValueStyleEnum", "rawValueStyleEnumMembers", "rawValueStyleEnumMember", 
		"rawValueEnumCaseList", "rawValueEnumCase", "unionStyleEnum", "unionStyleEnumMembers", 
		"unionStyleEnumMember", "caseClause", "enumCaseList", "enumCase", "importStatement", 
		"classDeclaration", "typeInheritanceClause", "typeInheritances", "typeBody", 
		"noise", "typeVariableDeclaration", "typeVarDeclaration", "typeLetDeclaration", 
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
			setState(145);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(142);
					importStatement();
					}
					} 
				}
				setState(147);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(153);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(151);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						setState(148);
						typeDefinition();
						}
						break;
					case 2:
						{
						setState(149);
						functionDeclaration();
						}
						break;
					case 3:
						{
						setState(150);
						globalVariableDeclaration();
						}
						break;
					}
					} 
				}
				setState(155);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenBracket) | (1L << CloseBracket) | (1L << OpenParen) | (1L << CloseParen) | (1L << OpenBrace) | (1L << CloseBrace) | (1L << SemiColon) | (1L << Comma) | (1L << Assign) | (1L << QuestionMark) | (1L << Colon) | (1L << Ellipsis) | (1L << Dot) | (1L << PlusPlus) | (1L << Plus) | (1L << Minus) | (1L << BitNot) | (1L << Not) | (1L << Multiply) | (1L << Divide) | (1L << Modulus) | (1L << RightShiftArithmetic) | (1L << LeftShiftArithmetic) | (1L << RightShiftLogical) | (1L << LessThan) | (1L << MoreThan) | (1L << LessThanEquals) | (1L << GreaterThanEquals) | (1L << Equals_) | (1L << NotEquals) | (1L << BitAnd) | (1L << BitXOr) | (1L << BitOr) | (1L << And) | (1L << Or) | (1L << MultiplyAssign) | (1L << DivideAssign) | (1L << ModulusAssign) | (1L << PlusAssign) | (1L << MinusAssign) | (1L << LeftShiftArithmeticAssign) | (1L << RightShiftArithmeticAssign) | (1L << RightShiftLogicalAssign) | (1L << BitAndAssign) | (1L << BitXorAssign) | (1L << BitOrAssign) | (1L << AT) | (1L << ANY) | (1L << IMPORT) | (1L << BREAK) | (1L << DO) | (1L << INSTANCEOF) | (1L << TYPEOF) | (1L << CASE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (ELSE - 64)) | (1L << (NEW - 64)) | (1L << (FINAL - 64)) | (1L << (CATCH - 64)) | (1L << (FINALLY - 64)) | (1L << (RETURN - 64)) | (1L << (VOID - 64)) | (1L << (UPPERCASEVOID - 64)) | (1L << (CONTINUE - 64)) | (1L << (FOR - 64)) | (1L << (SWITCH - 64)) | (1L << (WHILE - 64)) | (1L << (DEBUGGER - 64)) | (1L << (SELF - 64)) | (1L << (WITH - 64)) | (1L << (DEFAULT - 64)) | (1L << (IF - 64)) | (1L << (THROW - 64)) | (1L << (THROWS - 64)) | (1L << (DELETE - 64)) | (1L << (IN - 64)) | (1L << (TRY - 64)) | (1L << (INOUT - 64)) | (1L << (INDIRECT - 64)) | (1L << (INIT - 64)) | (1L << (CONVENIENCE - 64)) | (1L << (DYNAMIC - 64)) | (1L << (INFIX - 64)) | (1L << (LAZY - 64)) | (1L << (OPTIONAL - 64)) | (1L << (OVERRIDE - 64)) | (1L << (POSTFIX - 64)) | (1L << (PREFIX - 64)) | (1L << (REQUIRED - 64)) | (1L << (UNOWNED - 64)) | (1L << (WEAK - 64)) | (1L << (STATIC - 64)) | (1L << (Identifier - 64)) | (1L << (ANYCHARS - 64)))) != 0)) {
				{
				setState(156);
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
			setState(161);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
				globalVarDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(160);
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
		public TerminalNode Colon() { return getToken(Swift4Parser.Colon, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
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
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(163);
				attributes();
				}
			}

			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 54)) & ~0x3f) == 0 && ((1L << (_la - 54)) & ((1L << (CLASS - 54)) | (1L << (FINAL - 54)) | (1L << (PRIVATE - 54)) | (1L << (FILEPRIVATE - 54)) | (1L << (INTERNAL - 54)) | (1L << (PUBLIC - 54)) | (1L << (MUTATING - 54)) | (1L << (CONVENIENCE - 54)) | (1L << (DYNAMIC - 54)) | (1L << (INFIX - 54)) | (1L << (LAZY - 54)) | (1L << (OPTIONAL - 54)) | (1L << (OVERRIDE - 54)) | (1L << (POSTFIX - 54)) | (1L << (PREFIX - 54)) | (1L << (REQUIRED - 54)) | (1L << (UNOWNED - 54)) | (1L << (WEAK - 54)) | (1L << (STATIC - 54)))) != 0)) {
				{
				setState(166);
				declarationModifiers();
				}
			}

			setState(169);
			match(VAR);
			setState(170);
			identifier();
			setState(173);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(171);
				match(Colon);
				setState(172);
				type();
				}
				break;
			}
			setState(176);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(175);
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
		public TerminalNode Colon() { return getToken(Swift4Parser.Colon, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
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
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(178);
				attributes();
				}
			}

			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 54)) & ~0x3f) == 0 && ((1L << (_la - 54)) & ((1L << (CLASS - 54)) | (1L << (FINAL - 54)) | (1L << (PRIVATE - 54)) | (1L << (FILEPRIVATE - 54)) | (1L << (INTERNAL - 54)) | (1L << (PUBLIC - 54)) | (1L << (MUTATING - 54)) | (1L << (CONVENIENCE - 54)) | (1L << (DYNAMIC - 54)) | (1L << (INFIX - 54)) | (1L << (LAZY - 54)) | (1L << (OPTIONAL - 54)) | (1L << (OVERRIDE - 54)) | (1L << (POSTFIX - 54)) | (1L << (PREFIX - 54)) | (1L << (REQUIRED - 54)) | (1L << (UNOWNED - 54)) | (1L << (WEAK - 54)) | (1L << (STATIC - 54)))) != 0)) {
				{
				setState(181);
				declarationModifiers();
				}
			}

			setState(184);
			match(LET);
			setState(185);
			identifier();
			setState(188);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(186);
				match(Colon);
				setState(187);
				type();
				}
				break;
			}
			setState(191);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(190);
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
			setState(193);
			initializerHead();
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LessThan) {
				{
				setState(194);
				genericParameterClause();
				}
			}

			setState(197);
			parameterClause();
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(198);
				match(THROWS);
				}
			}

			setState(201);
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
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(203);
				attributes();
				}
			}

			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 54)) & ~0x3f) == 0 && ((1L << (_la - 54)) & ((1L << (CLASS - 54)) | (1L << (FINAL - 54)) | (1L << (PRIVATE - 54)) | (1L << (FILEPRIVATE - 54)) | (1L << (INTERNAL - 54)) | (1L << (PUBLIC - 54)) | (1L << (MUTATING - 54)) | (1L << (CONVENIENCE - 54)) | (1L << (DYNAMIC - 54)) | (1L << (INFIX - 54)) | (1L << (LAZY - 54)) | (1L << (OPTIONAL - 54)) | (1L << (OVERRIDE - 54)) | (1L << (POSTFIX - 54)) | (1L << (PREFIX - 54)) | (1L << (REQUIRED - 54)) | (1L << (UNOWNED - 54)) | (1L << (WEAK - 54)) | (1L << (STATIC - 54)))) != 0)) {
				{
				setState(206);
				declarationModifiers();
				}
			}

			setState(209);
			match(INIT);
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==QuestionMark || _la==Not) {
				{
				setState(210);
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
			setState(213);
			functionHead();
			setState(214);
			identifier();
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LessThan) {
				{
				setState(215);
				genericParameterClause();
				}
			}

			setState(218);
			functionSignature();
			setState(219);
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
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(221);
				attributes();
				}
			}

			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 54)) & ~0x3f) == 0 && ((1L << (_la - 54)) & ((1L << (CLASS - 54)) | (1L << (FINAL - 54)) | (1L << (PRIVATE - 54)) | (1L << (FILEPRIVATE - 54)) | (1L << (INTERNAL - 54)) | (1L << (PUBLIC - 54)) | (1L << (MUTATING - 54)) | (1L << (CONVENIENCE - 54)) | (1L << (DYNAMIC - 54)) | (1L << (INFIX - 54)) | (1L << (LAZY - 54)) | (1L << (OPTIONAL - 54)) | (1L << (OVERRIDE - 54)) | (1L << (POSTFIX - 54)) | (1L << (PREFIX - 54)) | (1L << (REQUIRED - 54)) | (1L << (UNOWNED - 54)) | (1L << (WEAK - 54)) | (1L << (STATIC - 54)))) != 0)) {
				{
				setState(224);
				declarationModifiers();
				}
			}

			setState(227);
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
			setState(231); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(231);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PRIVATE:
				case FILEPRIVATE:
				case INTERNAL:
				case PUBLIC:
				case MUTATING:
					{
					setState(229);
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
					setState(230);
					declarationModifier();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(233); 
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
			setState(235);
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
			setState(237);
			parameterClause();
			setState(239);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(238);
				match(THROWS);
				}
				break;
			}
			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ARROW) {
				{
				setState(241);
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
			setState(244);
			match(ARROW);
			setState(246);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(245);
				attributes();
				}
				break;
			}
			setState(248);
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
			setState(251);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(250);
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
			setState(266);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(253);
				match(OpenBrace);
				setState(254);
				noisyCode();
				setState(258);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(255);
						codeBlock();
						}
						} 
					}
					setState(260);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				}
				setState(261);
				noisyCode();
				setState(262);
				match(CloseBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(264);
				match(OpenBrace);
				setState(265);
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
			setState(273);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(271);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
					case 1:
						{
						setState(268);
						noise();
						}
						break;
					case 2:
						{
						setState(269);
						variableDeclaration();
						}
						break;
					case 3:
						{
						setState(270);
						letDeclaration();
						}
						break;
					}
					} 
				}
				setState(275);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
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
		public TerminalNode Colon() { return getToken(Swift4Parser.Colon, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
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
			setState(277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(276);
				attributes();
				}
			}

			setState(280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 54)) & ~0x3f) == 0 && ((1L << (_la - 54)) & ((1L << (CLASS - 54)) | (1L << (FINAL - 54)) | (1L << (PRIVATE - 54)) | (1L << (FILEPRIVATE - 54)) | (1L << (INTERNAL - 54)) | (1L << (PUBLIC - 54)) | (1L << (MUTATING - 54)) | (1L << (CONVENIENCE - 54)) | (1L << (DYNAMIC - 54)) | (1L << (INFIX - 54)) | (1L << (LAZY - 54)) | (1L << (OPTIONAL - 54)) | (1L << (OVERRIDE - 54)) | (1L << (POSTFIX - 54)) | (1L << (PREFIX - 54)) | (1L << (REQUIRED - 54)) | (1L << (UNOWNED - 54)) | (1L << (WEAK - 54)) | (1L << (STATIC - 54)))) != 0)) {
				{
				setState(279);
				declarationModifiers();
				}
			}

			setState(282);
			match(VAR);
			setState(283);
			identifier();
			setState(286);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(284);
				match(Colon);
				setState(285);
				type();
				}
				break;
			}
			setState(289);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(288);
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
		public TerminalNode Colon() { return getToken(Swift4Parser.Colon, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
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
			setState(292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(291);
				attributes();
				}
			}

			setState(295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 54)) & ~0x3f) == 0 && ((1L << (_la - 54)) & ((1L << (CLASS - 54)) | (1L << (FINAL - 54)) | (1L << (PRIVATE - 54)) | (1L << (FILEPRIVATE - 54)) | (1L << (INTERNAL - 54)) | (1L << (PUBLIC - 54)) | (1L << (MUTATING - 54)) | (1L << (CONVENIENCE - 54)) | (1L << (DYNAMIC - 54)) | (1L << (INFIX - 54)) | (1L << (LAZY - 54)) | (1L << (OPTIONAL - 54)) | (1L << (OVERRIDE - 54)) | (1L << (POSTFIX - 54)) | (1L << (PREFIX - 54)) | (1L << (REQUIRED - 54)) | (1L << (UNOWNED - 54)) | (1L << (WEAK - 54)) | (1L << (STATIC - 54)))) != 0)) {
				{
				setState(294);
				declarationModifiers();
				}
			}

			setState(297);
			match(LET);
			setState(298);
			identifier();
			setState(301);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(299);
				match(Colon);
				setState(300);
				type();
				}
				break;
			}
			setState(304);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(303);
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
			setState(306);
			match(LessThan);
			setState(307);
			genericParameters();
			setState(308);
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
			setState(315);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(310);
				genericParameter();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(311);
				genericParameter();
				setState(312);
				match(Comma);
				setState(313);
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
			setState(322);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(317);
				typeName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(318);
				typeName();
				setState(319);
				match(Colon);
				setState(320);
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
			setState(324);
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
			setState(326);
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
			setState(334);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(328);
				match(OpenParen);
				setState(329);
				match(CloseParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(330);
				match(OpenParen);
				setState(331);
				parameterList();
				setState(332);
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
			setState(341);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(336);
				parameter();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(337);
				parameter();
				setState(338);
				match(Comma);
				setState(339);
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
			setState(344);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(343);
				externalParametername();
				}
				break;
			}
			setState(346);
			localParameterName();
			setState(347);
			match(Colon);
			setState(349);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INOUT) {
				{
				setState(348);
				match(INOUT);
				}
			}

			setState(351);
			type();
			setState(353);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(352);
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
			setState(355);
			match(Assign);
			setState(356);
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
			setState(359);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(358);
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
			setState(395);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(361);
				typeidentifier();
				setState(363);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
				case 1:
					{
					setState(362);
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
				setState(365);
				match(OpenBracket);
				setState(366);
				type();
				setState(367);
				match(CloseBracket);
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
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(371);
				functionType();
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
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(375);
				match(OpenParen);
				setState(376);
				type();
				setState(377);
				match(CloseParen);
				setState(379);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
				case 1:
					{
					setState(378);
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
				setState(381);
				tupleType();
				setState(383);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
				case 1:
					{
					setState(382);
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
				setState(385);
				dictionaryType();
				setState(387);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
				case 1:
					{
					setState(386);
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
				setState(389);
				match(ANY);
				setState(391);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
				case 1:
					{
					setState(390);
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
				setState(393);
				match(SELF);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(394);
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
			setState(397);
			match(OpenBracket);
			setState(398);
			type();
			setState(399);
			match(Colon);
			setState(400);
			type();
			setState(401);
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
			setState(404);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(403);
				attributes();
				}
			}

			setState(406);
			functionTypeArgumentClause();
			setState(408);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(407);
				match(THROWS);
				}
			}

			setState(410);
			match(ARROW);
			setState(411);
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
			setState(422);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(413);
				match(OpenParen);
				setState(414);
				match(CloseParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(415);
				match(OpenParen);
				setState(416);
				functionTypeArguments();
				setState(418);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Ellipsis) {
					{
					setState(417);
					match(Ellipsis);
					}
				}

				setState(420);
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
			setState(429);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(424);
				functionTypeArgument();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(425);
				functionTypeArgument();
				setState(426);
				match(Comma);
				setState(427);
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
			setState(445);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(432);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
				case 1:
					{
					setState(431);
					attributes();
					}
					break;
				}
				setState(435);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INOUT) {
					{
					setState(434);
					match(INOUT);
					}
				}

				setState(437);
				type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(438);
				identifier();
				setState(439);
				match(Colon);
				setState(441);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INOUT) {
					{
					setState(440);
					match(INOUT);
					}
				}

				setState(443);
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
			setState(447);
			match(OpenParen);
			setState(448);
			tupleElement();
			setState(449);
			match(Comma);
			setState(450);
			tupleElements();
			setState(451);
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
			setState(458);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(453);
				tupleElement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(454);
				tupleElement();
				setState(455);
				match(Comma);
				setState(456);
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
			setState(468);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(460);
				identifier();
				setState(461);
				match(Colon);
				setState(463);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INOUT) {
					{
					setState(462);
					match(INOUT);
					}
				}

				setState(465);
				type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(467);
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
			setState(470);
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
			setState(472);
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
			setState(475); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(474);
					attribute();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(477); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
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
			setState(479);
			match(AT);
			setState(480);
			identifier();
			setState(482);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				{
				setState(481);
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
			setState(484);
			match(OpenParen);
			setState(486);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				{
				setState(485);
				balancedTokens();
				}
				break;
			}
			setState(488);
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
			setState(491); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(490);
					balancedToken();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(493); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
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
			setState(512);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(495);
				match(OpenParen);
				setState(497);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
				case 1:
					{
					setState(496);
					balancedTokens();
					}
					break;
				}
				setState(499);
				match(CloseParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(500);
				match(OpenBrace);
				setState(502);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
				case 1:
					{
					setState(501);
					balancedTokens();
					}
					break;
				}
				setState(504);
				match(CloseBrace);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(505);
				match(OpenBracket);
				setState(507);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
				case 1:
					{
					setState(506);
					balancedTokens();
					}
					break;
				}
				setState(509);
				match(CloseBracket);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(510);
				identifier();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(511);
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
			setState(518);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(514);
				classDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(515);
				enumDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(516);
				structDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(517);
				protocolDeclaration();
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
		public NoiseContext noise() {
			return getRuleContext(NoiseContext.class,0);
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
		enterRule(_localctx, 88, RULE_protocolDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(521);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(520);
				attributes();
				}
			}

			setState(524);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 92)) & ~0x3f) == 0 && ((1L << (_la - 92)) & ((1L << (PRIVATE - 92)) | (1L << (FILEPRIVATE - 92)) | (1L << (INTERNAL - 92)) | (1L << (PUBLIC - 92)) | (1L << (MUTATING - 92)))) != 0)) {
				{
				setState(523);
				accessModifier();
				}
			}

			setState(526);
			match(PROTOCOL);
			setState(527);
			identifier();
			setState(529);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(528);
				typeInheritanceClause();
				}
			}

			setState(531);
			typeBody();
			setState(533);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				{
				setState(532);
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
		enterRule(_localctx, 90, RULE_structDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(536);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(535);
				attributes();
				}
			}

			setState(539);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				{
				setState(538);
				match(FINAL);
				}
				break;
			}
			setState(542);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 92)) & ~0x3f) == 0 && ((1L << (_la - 92)) & ((1L << (PRIVATE - 92)) | (1L << (FILEPRIVATE - 92)) | (1L << (INTERNAL - 92)) | (1L << (PUBLIC - 92)) | (1L << (MUTATING - 92)))) != 0)) {
				{
				setState(541);
				accessModifier();
				}
			}

			setState(545);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FINAL) {
				{
				setState(544);
				match(FINAL);
				}
			}

			setState(547);
			match(STRUCT);
			setState(548);
			identifier();
			setState(550);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LessThan) {
				{
				setState(549);
				genericParameterClause();
				}
			}

			setState(553);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(552);
				typeInheritanceClause();
				}
			}

			setState(555);
			typeBody();
			setState(557);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				{
				setState(556);
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
		enterRule(_localctx, 92, RULE_enumDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(560);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(559);
				attributes();
				}
			}

			setState(563);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 92)) & ~0x3f) == 0 && ((1L << (_la - 92)) & ((1L << (PRIVATE - 92)) | (1L << (FILEPRIVATE - 92)) | (1L << (INTERNAL - 92)) | (1L << (PUBLIC - 92)) | (1L << (MUTATING - 92)))) != 0)) {
				{
				setState(562);
				accessModifier();
				}
			}

			setState(567);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				{
				setState(565);
				unionStyleEnum();
				}
				break;
			case 2:
				{
				setState(566);
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
		enterRule(_localctx, 94, RULE_rawValueStyleEnum);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(569);
			match(ENUM);
			setState(570);
			identifier();
			setState(572);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LessThan) {
				{
				setState(571);
				genericParameterClause();
				}
			}

			setState(575);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(574);
				typeInheritanceClause();
				}
			}

			setState(577);
			match(OpenBrace);
			setState(578);
			rawValueStyleEnumMembers();
			setState(579);
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
		enterRule(_localctx, 96, RULE_rawValueStyleEnumMembers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(581);
			rawValueStyleEnumMember();
			setState(583);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT || _la==CASE) {
				{
				setState(582);
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
		enterRule(_localctx, 98, RULE_rawValueStyleEnumMember);
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

			setState(588);
			match(CASE);
			setState(589);
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
		enterRule(_localctx, 100, RULE_rawValueEnumCaseList);
		int _la;
		try {
			setState(597);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(591);
				rawValueEnumCase();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(592);
				rawValueEnumCase();
				setState(593);
				match(Comma);
				setState(595);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (FOR - 75)) | (1L << (WITH - 75)) | (1L << (IN - 75)) | (1L << (Identifier - 75)))) != 0)) {
					{
					setState(594);
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
		enterRule(_localctx, 102, RULE_rawValueEnumCase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(599);
			identifier();
			setState(601);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
			case 1:
				{
				setState(600);
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
		enterRule(_localctx, 104, RULE_unionStyleEnum);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(604);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INDIRECT) {
				{
				setState(603);
				match(INDIRECT);
				}
			}

			setState(606);
			match(ENUM);
			setState(607);
			identifier();
			setState(609);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LessThan) {
				{
				setState(608);
				genericParameterClause();
				}
			}

			setState(612);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(611);
				typeInheritanceClause();
				}
			}

			setState(614);
			match(OpenBrace);
			setState(615);
			unionStyleEnumMembers();
			setState(616);
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
		enterRule(_localctx, 106, RULE_unionStyleEnumMembers);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(618);
			unionStyleEnumMember();
			setState(620);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
			case 1:
				{
				setState(619);
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
		enterRule(_localctx, 108, RULE_unionStyleEnumMember);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(624); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(624);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
					case 1:
						{
						setState(622);
						noise();
						}
						break;
					case 2:
						{
						setState(623);
						caseClause();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(626); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
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
		enterRule(_localctx, 110, RULE_caseClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(629);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(628);
				attributes();
				}
			}

			setState(632);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INDIRECT) {
				{
				setState(631);
				match(INDIRECT);
				}
			}

			setState(634);
			match(CASE);
			setState(635);
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
		enterRule(_localctx, 112, RULE_enumCaseList);
		try {
			setState(642);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(637);
				enumCase();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(638);
				enumCase();
				setState(639);
				match(Comma);
				setState(640);
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
		enterRule(_localctx, 114, RULE_enumCase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(644);
			identifier();
			setState(646);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				{
				setState(645);
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
		enterRule(_localctx, 116, RULE_importStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(648);
			match(IMPORT);
			setState(649);
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
		enterRule(_localctx, 118, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(652);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(651);
				attributes();
				}
			}

			setState(655);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				{
				setState(654);
				match(FINAL);
				}
				break;
			}
			setState(658);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 92)) & ~0x3f) == 0 && ((1L << (_la - 92)) & ((1L << (PRIVATE - 92)) | (1L << (FILEPRIVATE - 92)) | (1L << (INTERNAL - 92)) | (1L << (PUBLIC - 92)) | (1L << (MUTATING - 92)))) != 0)) {
				{
				setState(657);
				accessModifier();
				}
			}

			setState(661);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FINAL) {
				{
				setState(660);
				match(FINAL);
				}
			}

			setState(663);
			match(CLASS);
			setState(664);
			identifier();
			setState(666);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LessThan) {
				{
				setState(665);
				genericParameterClause();
				}
			}

			setState(669);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(668);
				typeInheritanceClause();
				}
			}

			setState(671);
			typeBody();
			setState(673);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
			case 1:
				{
				setState(672);
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
		enterRule(_localctx, 120, RULE_typeInheritanceClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(675);
			match(Colon);
			setState(676);
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
		enterRule(_localctx, 122, RULE_typeInheritances);
		try {
			setState(683);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(678);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(679);
				identifier();
				setState(680);
				match(Comma);
				setState(681);
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
		enterRule(_localctx, 124, RULE_typeBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(685);
			match(OpenBrace);
			setState(691);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & ((1L << (AT - 51)) | (1L << (CLASS - 51)) | (1L << (VAR - 51)) | (1L << (LET - 51)) | (1L << (FINAL - 51)) | (1L << (FUNC - 51)) | (1L << (INIT - 51)) | (1L << (PRIVATE - 51)) | (1L << (FILEPRIVATE - 51)) | (1L << (INTERNAL - 51)) | (1L << (PUBLIC - 51)) | (1L << (MUTATING - 51)) | (1L << (CONVENIENCE - 51)) | (1L << (DYNAMIC - 51)) | (1L << (INFIX - 51)) | (1L << (LAZY - 51)) | (1L << (OPTIONAL - 51)) | (1L << (OVERRIDE - 51)) | (1L << (POSTFIX - 51)) | (1L << (PREFIX - 51)) | (1L << (REQUIRED - 51)) | (1L << (UNOWNED - 51)) | (1L << (WEAK - 51)) | (1L << (STATIC - 51)))) != 0)) {
				{
				setState(689);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
				case 1:
					{
					setState(686);
					functionDeclaration();
					}
					break;
				case 2:
					{
					setState(687);
					initializerDeclaration();
					}
					break;
				case 3:
					{
					setState(688);
					typeVariableDeclaration();
					}
					break;
				}
				}
				setState(693);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(694);
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
		enterRule(_localctx, 126, RULE_noise);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(700); 
			_errHandler.sync(this);
			_alt = 1+1;
			do {
				switch (_alt) {
				case 1+1:
					{
					setState(700);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
					case 1:
						{
						setState(696);
						match(ANYCHARS);
						}
						break;
					case 2:
						{
						setState(697);
						keywordNoise();
						}
						break;
					case 3:
						{
						setState(698);
						specialCharacter();
						}
						break;
					case 4:
						{
						setState(699);
						identifier();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(702); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,118,_ctx);
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
		enterRule(_localctx, 128, RULE_typeVariableDeclaration);
		try {
			setState(706);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(704);
				typeVarDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(705);
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
		public TerminalNode Colon() { return getToken(Swift4Parser.Colon, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
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
		enterRule(_localctx, 130, RULE_typeVarDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(709);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(708);
				attributes();
				}
			}

			setState(712);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 54)) & ~0x3f) == 0 && ((1L << (_la - 54)) & ((1L << (CLASS - 54)) | (1L << (FINAL - 54)) | (1L << (PRIVATE - 54)) | (1L << (FILEPRIVATE - 54)) | (1L << (INTERNAL - 54)) | (1L << (PUBLIC - 54)) | (1L << (MUTATING - 54)) | (1L << (CONVENIENCE - 54)) | (1L << (DYNAMIC - 54)) | (1L << (INFIX - 54)) | (1L << (LAZY - 54)) | (1L << (OPTIONAL - 54)) | (1L << (OVERRIDE - 54)) | (1L << (POSTFIX - 54)) | (1L << (PREFIX - 54)) | (1L << (REQUIRED - 54)) | (1L << (UNOWNED - 54)) | (1L << (WEAK - 54)) | (1L << (STATIC - 54)))) != 0)) {
				{
				setState(711);
				declarationModifiers();
				}
			}

			setState(714);
			match(VAR);
			setState(715);
			identifier();
			setState(718);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
			case 1:
				{
				setState(716);
				match(Colon);
				setState(717);
				type();
				}
				break;
			}
			setState(721);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
			case 1:
				{
				setState(720);
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
		public TerminalNode Colon() { return getToken(Swift4Parser.Colon, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
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
		enterRule(_localctx, 132, RULE_typeLetDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(724);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(723);
				attributes();
				}
			}

			setState(727);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 54)) & ~0x3f) == 0 && ((1L << (_la - 54)) & ((1L << (CLASS - 54)) | (1L << (FINAL - 54)) | (1L << (PRIVATE - 54)) | (1L << (FILEPRIVATE - 54)) | (1L << (INTERNAL - 54)) | (1L << (PUBLIC - 54)) | (1L << (MUTATING - 54)) | (1L << (CONVENIENCE - 54)) | (1L << (DYNAMIC - 54)) | (1L << (INFIX - 54)) | (1L << (LAZY - 54)) | (1L << (OPTIONAL - 54)) | (1L << (OVERRIDE - 54)) | (1L << (POSTFIX - 54)) | (1L << (PREFIX - 54)) | (1L << (REQUIRED - 54)) | (1L << (UNOWNED - 54)) | (1L << (WEAK - 54)) | (1L << (STATIC - 54)))) != 0)) {
				{
				setState(726);
				declarationModifiers();
				}
			}

			setState(729);
			match(LET);
			setState(730);
			identifier();
			setState(733);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
			case 1:
				{
				setState(731);
				match(Colon);
				setState(732);
				type();
				}
				break;
			}
			setState(736);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
			case 1:
				{
				setState(735);
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
		enterRule(_localctx, 134, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(738);
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
		enterRule(_localctx, 136, RULE_keywordNoise);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(740);
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
		enterRule(_localctx, 138, RULE_specialCharacter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(742);
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
		enterRule(_localctx, 140, RULE_accessModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(744);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3s\u02ed\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\3\2"+
		"\7\2\u0092\n\2\f\2\16\2\u0095\13\2\3\2\3\2\3\2\7\2\u009a\n\2\f\2\16\2"+
		"\u009d\13\2\3\2\5\2\u00a0\n\2\3\3\3\3\5\3\u00a4\n\3\3\4\5\4\u00a7\n\4"+
		"\3\4\5\4\u00aa\n\4\3\4\3\4\3\4\3\4\5\4\u00b0\n\4\3\4\5\4\u00b3\n\4\3\5"+
		"\5\5\u00b6\n\5\3\5\5\5\u00b9\n\5\3\5\3\5\3\5\3\5\5\5\u00bf\n\5\3\5\5\5"+
		"\u00c2\n\5\3\6\3\6\5\6\u00c6\n\6\3\6\3\6\5\6\u00ca\n\6\3\6\3\6\3\7\5\7"+
		"\u00cf\n\7\3\7\5\7\u00d2\n\7\3\7\3\7\5\7\u00d6\n\7\3\b\3\b\3\b\5\b\u00db"+
		"\n\b\3\b\3\b\3\b\3\t\5\t\u00e1\n\t\3\t\5\t\u00e4\n\t\3\t\3\t\3\n\3\n\6"+
		"\n\u00ea\n\n\r\n\16\n\u00eb\3\13\3\13\3\f\3\f\5\f\u00f2\n\f\3\f\5\f\u00f5"+
		"\n\f\3\r\3\r\5\r\u00f9\n\r\3\r\3\r\3\16\5\16\u00fe\n\16\3\17\3\17\3\17"+
		"\7\17\u0103\n\17\f\17\16\17\u0106\13\17\3\17\3\17\3\17\3\17\3\17\5\17"+
		"\u010d\n\17\3\20\3\20\3\20\7\20\u0112\n\20\f\20\16\20\u0115\13\20\3\21"+
		"\5\21\u0118\n\21\3\21\5\21\u011b\n\21\3\21\3\21\3\21\3\21\5\21\u0121\n"+
		"\21\3\21\5\21\u0124\n\21\3\22\5\22\u0127\n\22\3\22\5\22\u012a\n\22\3\22"+
		"\3\22\3\22\3\22\5\22\u0130\n\22\3\22\5\22\u0133\n\22\3\23\3\23\3\23\3"+
		"\23\3\24\3\24\3\24\3\24\3\24\5\24\u013e\n\24\3\25\3\25\3\25\3\25\3\25"+
		"\5\25\u0145\n\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\5\30"+
		"\u0151\n\30\3\31\3\31\3\31\3\31\3\31\5\31\u0158\n\31\3\32\5\32\u015b\n"+
		"\32\3\32\3\32\3\32\5\32\u0160\n\32\3\32\3\32\5\32\u0164\n\32\3\33\3\33"+
		"\3\33\3\34\5\34\u016a\n\34\3\35\3\35\5\35\u016e\n\35\3\35\3\35\3\35\3"+
		"\35\5\35\u0174\n\35\3\35\3\35\5\35\u0178\n\35\3\35\3\35\3\35\3\35\5\35"+
		"\u017e\n\35\3\35\3\35\5\35\u0182\n\35\3\35\3\35\5\35\u0186\n\35\3\35\3"+
		"\35\5\35\u018a\n\35\3\35\3\35\5\35\u018e\n\35\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\37\5\37\u0197\n\37\3\37\3\37\5\37\u019b\n\37\3\37\3\37\3\37\3"+
		" \3 \3 \3 \3 \5 \u01a5\n \3 \3 \5 \u01a9\n \3!\3!\3!\3!\3!\5!\u01b0\n"+
		"!\3\"\5\"\u01b3\n\"\3\"\5\"\u01b6\n\"\3\"\3\"\3\"\3\"\5\"\u01bc\n\"\3"+
		"\"\3\"\5\"\u01c0\n\"\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\5$\u01cd\n$\3%\3"+
		"%\3%\5%\u01d2\n%\3%\3%\3%\5%\u01d7\n%\3&\3&\3\'\3\'\3(\6(\u01de\n(\r("+
		"\16(\u01df\3)\3)\3)\5)\u01e5\n)\3*\3*\5*\u01e9\n*\3*\3*\3+\6+\u01ee\n"+
		"+\r+\16+\u01ef\3,\3,\5,\u01f4\n,\3,\3,\3,\5,\u01f9\n,\3,\3,\3,\5,\u01fe"+
		"\n,\3,\3,\3,\5,\u0203\n,\3-\3-\3-\3-\5-\u0209\n-\3.\5.\u020c\n.\3.\5."+
		"\u020f\n.\3.\3.\3.\5.\u0214\n.\3.\3.\5.\u0218\n.\3/\5/\u021b\n/\3/\5/"+
		"\u021e\n/\3/\5/\u0221\n/\3/\5/\u0224\n/\3/\3/\3/\5/\u0229\n/\3/\5/\u022c"+
		"\n/\3/\3/\5/\u0230\n/\3\60\5\60\u0233\n\60\3\60\5\60\u0236\n\60\3\60\3"+
		"\60\5\60\u023a\n\60\3\61\3\61\3\61\5\61\u023f\n\61\3\61\5\61\u0242\n\61"+
		"\3\61\3\61\3\61\3\61\3\62\3\62\5\62\u024a\n\62\3\63\5\63\u024d\n\63\3"+
		"\63\3\63\3\63\3\64\3\64\3\64\3\64\5\64\u0256\n\64\5\64\u0258\n\64\3\65"+
		"\3\65\5\65\u025c\n\65\3\66\5\66\u025f\n\66\3\66\3\66\3\66\5\66\u0264\n"+
		"\66\3\66\5\66\u0267\n\66\3\66\3\66\3\66\3\66\3\67\3\67\5\67\u026f\n\67"+
		"\38\38\68\u0273\n8\r8\168\u0274\39\59\u0278\n9\39\59\u027b\n9\39\39\3"+
		"9\3:\3:\3:\3:\3:\5:\u0285\n:\3;\3;\5;\u0289\n;\3<\3<\3<\3=\5=\u028f\n"+
		"=\3=\5=\u0292\n=\3=\5=\u0295\n=\3=\5=\u0298\n=\3=\3=\3=\5=\u029d\n=\3"+
		"=\5=\u02a0\n=\3=\3=\5=\u02a4\n=\3>\3>\3>\3?\3?\3?\3?\3?\5?\u02ae\n?\3"+
		"@\3@\3@\3@\7@\u02b4\n@\f@\16@\u02b7\13@\3@\3@\3A\3A\3A\3A\6A\u02bf\nA"+
		"\rA\16A\u02c0\3B\3B\5B\u02c5\nB\3C\5C\u02c8\nC\3C\5C\u02cb\nC\3C\3C\3"+
		"C\3C\5C\u02d1\nC\3C\5C\u02d4\nC\3D\5D\u02d7\nD\3D\5D\u02da\nD\3D\3D\3"+
		"D\3D\5D\u02e0\nD\3D\5D\u02e3\nD\3E\3E\3F\3F\3G\3G\3H\3H\3H\3\u02c0\2I"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFH"+
		"JLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c"+
		"\u008e\2\b\4\2\f\f\26\26\5\288FFcn\6\2MMSSYYoo\7\2\65\67=CFPR]cn\6\2\3"+
		"\20\22\22\24\"%\64\3\2^b\2\u0336\2\u0093\3\2\2\2\4\u00a3\3\2\2\2\6\u00a6"+
		"\3\2\2\2\b\u00b5\3\2\2\2\n\u00c3\3\2\2\2\f\u00ce\3\2\2\2\16\u00d7\3\2"+
		"\2\2\20\u00e0\3\2\2\2\22\u00e9\3\2\2\2\24\u00ed\3\2\2\2\26\u00ef\3\2\2"+
		"\2\30\u00f6\3\2\2\2\32\u00fd\3\2\2\2\34\u010c\3\2\2\2\36\u0113\3\2\2\2"+
		" \u0117\3\2\2\2\"\u0126\3\2\2\2$\u0134\3\2\2\2&\u013d\3\2\2\2(\u0144\3"+
		"\2\2\2*\u0146\3\2\2\2,\u0148\3\2\2\2.\u0150\3\2\2\2\60\u0157\3\2\2\2\62"+
		"\u015a\3\2\2\2\64\u0165\3\2\2\2\66\u0169\3\2\2\28\u018d\3\2\2\2:\u018f"+
		"\3\2\2\2<\u0196\3\2\2\2>\u01a8\3\2\2\2@\u01af\3\2\2\2B\u01bf\3\2\2\2D"+
		"\u01c1\3\2\2\2F\u01cc\3\2\2\2H\u01d6\3\2\2\2J\u01d8\3\2\2\2L\u01da\3\2"+
		"\2\2N\u01dd\3\2\2\2P\u01e1\3\2\2\2R\u01e6\3\2\2\2T\u01ed\3\2\2\2V\u0202"+
		"\3\2\2\2X\u0208\3\2\2\2Z\u020b\3\2\2\2\\\u021a\3\2\2\2^\u0232\3\2\2\2"+
		"`\u023b\3\2\2\2b\u0247\3\2\2\2d\u024c\3\2\2\2f\u0257\3\2\2\2h\u0259\3"+
		"\2\2\2j\u025e\3\2\2\2l\u026c\3\2\2\2n\u0272\3\2\2\2p\u0277\3\2\2\2r\u0284"+
		"\3\2\2\2t\u0286\3\2\2\2v\u028a\3\2\2\2x\u028e\3\2\2\2z\u02a5\3\2\2\2|"+
		"\u02ad\3\2\2\2~\u02af\3\2\2\2\u0080\u02be\3\2\2\2\u0082\u02c4\3\2\2\2"+
		"\u0084\u02c7\3\2\2\2\u0086\u02d6\3\2\2\2\u0088\u02e4\3\2\2\2\u008a\u02e6"+
		"\3\2\2\2\u008c\u02e8\3\2\2\2\u008e\u02ea\3\2\2\2\u0090\u0092\5v<\2\u0091"+
		"\u0090\3\2\2\2\u0092\u0095\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2"+
		"\2\2\u0094\u009b\3\2\2\2\u0095\u0093\3\2\2\2\u0096\u009a\5X-\2\u0097\u009a"+
		"\5\16\b\2\u0098\u009a\5\4\3\2\u0099\u0096\3\2\2\2\u0099\u0097\3\2\2\2"+
		"\u0099\u0098\3\2\2\2\u009a\u009d\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c"+
		"\3\2\2\2\u009c\u009f\3\2\2\2\u009d\u009b\3\2\2\2\u009e\u00a0\5\u0080A"+
		"\2\u009f\u009e\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\3\3\2\2\2\u00a1\u00a4"+
		"\5\6\4\2\u00a2\u00a4\5\b\5\2\u00a3\u00a1\3\2\2\2\u00a3\u00a2\3\2\2\2\u00a4"+
		"\5\3\2\2\2\u00a5\u00a7\5N(\2\u00a6\u00a5\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7"+
		"\u00a9\3\2\2\2\u00a8\u00aa\5\22\n\2\u00a9\u00a8\3\2\2\2\u00a9\u00aa\3"+
		"\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac\7D\2\2\u00ac\u00af\5\u0088E\2\u00ad"+
		"\u00ae\7\r\2\2\u00ae\u00b0\58\35\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2"+
		"\2\2\u00b0\u00b2\3\2\2\2\u00b1\u00b3\5\u0080A\2\u00b2\u00b1\3\2\2\2\u00b2"+
		"\u00b3\3\2\2\2\u00b3\7\3\2\2\2\u00b4\u00b6\5N(\2\u00b5\u00b4\3\2\2\2\u00b5"+
		"\u00b6\3\2\2\2\u00b6\u00b8\3\2\2\2\u00b7\u00b9\5\22\n\2\u00b8\u00b7\3"+
		"\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bb\7E\2\2\u00bb"+
		"\u00be\5\u0088E\2\u00bc\u00bd\7\r\2\2\u00bd\u00bf\58\35\2\u00be\u00bc"+
		"\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c1\3\2\2\2\u00c0\u00c2\5\u0080A"+
		"\2\u00c1\u00c0\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\t\3\2\2\2\u00c3\u00c5"+
		"\5\f\7\2\u00c4\u00c6\5$\23\2\u00c5\u00c4\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6"+
		"\u00c7\3\2\2\2\u00c7\u00c9\5.\30\2\u00c8\u00ca\7W\2\2\u00c9\u00c8\3\2"+
		"\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cc\5\32\16\2\u00cc"+
		"\13\3\2\2\2\u00cd\u00cf\5N(\2\u00ce\u00cd\3\2\2\2\u00ce\u00cf\3\2\2\2"+
		"\u00cf\u00d1\3\2\2\2\u00d0\u00d2\5\22\n\2\u00d1\u00d0\3\2\2\2\u00d1\u00d2"+
		"\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d5\7]\2\2\u00d4\u00d6\t\2\2\2\u00d5"+
		"\u00d4\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\r\3\2\2\2\u00d7\u00d8\5\20\t"+
		"\2\u00d8\u00da\5\u0088E\2\u00d9\u00db\5$\23\2\u00da\u00d9\3\2\2\2\u00da"+
		"\u00db\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00dd\5\26\f\2\u00dd\u00de\5"+
		"\32\16\2\u00de\17\3\2\2\2\u00df\u00e1\5N(\2\u00e0\u00df\3\2\2\2\u00e0"+
		"\u00e1\3\2\2\2\u00e1\u00e3\3\2\2\2\u00e2\u00e4\5\22\n\2\u00e3\u00e2\3"+
		"\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e6\7Q\2\2\u00e6"+
		"\21\3\2\2\2\u00e7\u00ea\5\u008eH\2\u00e8\u00ea\5\24\13\2\u00e9\u00e7\3"+
		"\2\2\2\u00e9\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb"+
		"\u00ec\3\2\2\2\u00ec\23\3\2\2\2\u00ed\u00ee\t\3\2\2\u00ee\25\3\2\2\2\u00ef"+
		"\u00f1\5.\30\2\u00f0\u00f2\7W\2\2\u00f1\u00f0\3\2\2\2\u00f1\u00f2\3\2"+
		"\2\2\u00f2\u00f4\3\2\2\2\u00f3\u00f5\5\30\r\2\u00f4\u00f3\3\2\2\2\u00f4"+
		"\u00f5\3\2\2\2\u00f5\27\3\2\2\2\u00f6\u00f8\7\23\2\2\u00f7\u00f9\5N(\2"+
		"\u00f8\u00f7\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fb"+
		"\58\35\2\u00fb\31\3\2\2\2\u00fc\u00fe\5\34\17\2\u00fd\u00fc\3\2\2\2\u00fd"+
		"\u00fe\3\2\2\2\u00fe\33\3\2\2\2\u00ff\u0100\7\7\2\2\u0100\u0104\5\36\20"+
		"\2\u0101\u0103\5\34\17\2\u0102\u0101\3\2\2\2\u0103\u0106\3\2\2\2\u0104"+
		"\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0107\3\2\2\2\u0106\u0104\3\2"+
		"\2\2\u0107\u0108\5\36\20\2\u0108\u0109\7\b\2\2\u0109\u010d\3\2\2\2\u010a"+
		"\u010b\7\7\2\2\u010b\u010d\7\b\2\2\u010c\u00ff\3\2\2\2\u010c\u010a\3\2"+
		"\2\2\u010d\35\3\2\2\2\u010e\u0112\5\u0080A\2\u010f\u0112\5 \21\2\u0110"+
		"\u0112\5\"\22\2\u0111\u010e\3\2\2\2\u0111\u010f\3\2\2\2\u0111\u0110\3"+
		"\2\2\2\u0112\u0115\3\2\2\2\u0113\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114"+
		"\37\3\2\2\2\u0115\u0113\3\2\2\2\u0116\u0118\5N(\2\u0117\u0116\3\2\2\2"+
		"\u0117\u0118\3\2\2\2\u0118\u011a\3\2\2\2\u0119\u011b\5\22\n\2\u011a\u0119"+
		"\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011d\7D\2\2\u011d"+
		"\u0120\5\u0088E\2\u011e\u011f\7\r\2\2\u011f\u0121\58\35\2\u0120\u011e"+
		"\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0123\3\2\2\2\u0122\u0124\5\u0080A"+
		"\2\u0123\u0122\3\2\2\2\u0123\u0124\3\2\2\2\u0124!\3\2\2\2\u0125\u0127"+
		"\5N(\2\u0126\u0125\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0129\3\2\2\2\u0128"+
		"\u012a\5\22\n\2\u0129\u0128\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012b\3"+
		"\2\2\2\u012b\u012c\7E\2\2\u012c\u012f\5\u0088E\2\u012d\u012e\7\r\2\2\u012e"+
		"\u0130\58\35\2\u012f\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0132\3\2"+
		"\2\2\u0131\u0133\5\u0080A\2\u0132\u0131\3\2\2\2\u0132\u0133\3\2\2\2\u0133"+
		"#\3\2\2\2\u0134\u0135\7\35\2\2\u0135\u0136\5&\24\2\u0136\u0137\7\36\2"+
		"\2\u0137%\3\2\2\2\u0138\u013e\5(\25\2\u0139\u013a\5(\25\2\u013a\u013b"+
		"\7\n\2\2\u013b\u013c\5&\24\2\u013c\u013e\3\2\2\2\u013d\u0138\3\2\2\2\u013d"+
		"\u0139\3\2\2\2\u013e\'\3\2\2\2\u013f\u0145\5*\26\2\u0140\u0141\5*\26\2"+
		"\u0141\u0142\7\r\2\2\u0142\u0143\5,\27\2\u0143\u0145\3\2\2\2\u0144\u013f"+
		"\3\2\2\2\u0144\u0140\3\2\2\2\u0145)\3\2\2\2\u0146\u0147\5\u0088E\2\u0147"+
		"+\3\2\2\2\u0148\u0149\5\u0088E\2\u0149-\3\2\2\2\u014a\u014b\7\5\2\2\u014b"+
		"\u0151\7\6\2\2\u014c\u014d\7\5\2\2\u014d\u014e\5\60\31\2\u014e\u014f\7"+
		"\6\2\2\u014f\u0151\3\2\2\2\u0150\u014a\3\2\2\2\u0150\u014c\3\2\2\2\u0151"+
		"/\3\2\2\2\u0152\u0158\5\62\32\2\u0153\u0154\5\62\32\2\u0154\u0155\7\n"+
		"\2\2\u0155\u0156\5\60\31\2\u0156\u0158\3\2\2\2\u0157\u0152\3\2\2\2\u0157"+
		"\u0153\3\2\2\2\u0158\61\3\2\2\2\u0159\u015b\5J&\2\u015a\u0159\3\2\2\2"+
		"\u015a\u015b\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u015d\5L\'\2\u015d\u015f"+
		"\7\r\2\2\u015e\u0160\7[\2\2\u015f\u015e\3\2\2\2\u015f\u0160\3\2\2\2\u0160"+
		"\u0161\3\2\2\2\u0161\u0163\58\35\2\u0162\u0164\5\64\33\2\u0163\u0162\3"+
		"\2\2\2\u0163\u0164\3\2\2\2\u0164\63\3\2\2\2\u0165\u0166\7\13\2\2\u0166"+
		"\u0167\5\66\34\2\u0167\65\3\2\2\2\u0168\u016a\5\u0080A\2\u0169\u0168\3"+
		"\2\2\2\u0169\u016a\3\2\2\2\u016a\67\3\2\2\2\u016b\u016d\5,\27\2\u016c"+
		"\u016e\t\2\2\2\u016d\u016c\3\2\2\2\u016d\u016e\3\2\2\2\u016e\u018e\3\2"+
		"\2\2\u016f\u0170\7\3\2\2\u0170\u0171\58\35\2\u0171\u0173\7\4\2\2\u0172"+
		"\u0174\t\2\2\2\u0173\u0172\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u018e\3\2"+
		"\2\2\u0175\u0177\5<\37\2\u0176\u0178\t\2\2\2\u0177\u0176\3\2\2\2\u0177"+
		"\u0178\3\2\2\2\u0178\u018e\3\2\2\2\u0179\u017a\7\5\2\2\u017a\u017b\58"+
		"\35\2\u017b\u017d\7\6\2\2\u017c\u017e\t\2\2\2\u017d\u017c\3\2\2\2\u017d"+
		"\u017e\3\2\2\2\u017e\u018e\3\2\2\2\u017f\u0181\5D#\2\u0180\u0182\t\2\2"+
		"\2\u0181\u0180\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u018e\3\2\2\2\u0183\u0185"+
		"\5:\36\2\u0184\u0186\t\2\2\2\u0185\u0184\3\2\2\2\u0185\u0186\3\2\2\2\u0186"+
		"\u018e\3\2\2\2\u0187\u0189\7\66\2\2\u0188\u018a\t\2\2\2\u0189\u0188\3"+
		"\2\2\2\u0189\u018a\3\2\2\2\u018a\u018e\3\2\2\2\u018b\u018e\7R\2\2\u018c"+
		"\u018e\7K\2\2\u018d\u016b\3\2\2\2\u018d\u016f\3\2\2\2\u018d\u0175\3\2"+
		"\2\2\u018d\u0179\3\2\2\2\u018d\u017f\3\2\2\2\u018d\u0183\3\2\2\2\u018d"+
		"\u0187\3\2\2\2\u018d\u018b\3\2\2\2\u018d\u018c\3\2\2\2\u018e9\3\2\2\2"+
		"\u018f\u0190\7\3\2\2\u0190\u0191\58\35\2\u0191\u0192\7\r\2\2\u0192\u0193"+
		"\58\35\2\u0193\u0194\7\4\2\2\u0194;\3\2\2\2\u0195\u0197\5N(\2\u0196\u0195"+
		"\3\2\2\2\u0196\u0197\3\2\2\2\u0197\u0198\3\2\2\2\u0198\u019a\5> \2\u0199"+
		"\u019b\7W\2\2\u019a\u0199\3\2\2\2\u019a\u019b\3\2\2\2\u019b\u019c\3\2"+
		"\2\2\u019c\u019d\7\23\2\2\u019d\u019e\58\35\2\u019e=\3\2\2\2\u019f\u01a0"+
		"\7\5\2\2\u01a0\u01a9\7\6\2\2\u01a1\u01a2\7\5\2\2\u01a2\u01a4\5@!\2\u01a3"+
		"\u01a5\7\16\2\2\u01a4\u01a3\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01a6\3"+
		"\2\2\2\u01a6\u01a7\7\6\2\2\u01a7\u01a9\3\2\2\2\u01a8\u019f\3\2\2\2\u01a8"+
		"\u01a1\3\2\2\2\u01a9?\3\2\2\2\u01aa\u01b0\5B\"\2\u01ab\u01ac\5B\"\2\u01ac"+
		"\u01ad\7\n\2\2\u01ad\u01ae\5@!\2\u01ae\u01b0\3\2\2\2\u01af\u01aa\3\2\2"+
		"\2\u01af\u01ab\3\2\2\2\u01b0A\3\2\2\2\u01b1\u01b3\5N(\2\u01b2\u01b1\3"+
		"\2\2\2\u01b2\u01b3\3\2\2\2\u01b3\u01b5\3\2\2\2\u01b4\u01b6\7[\2\2\u01b5"+
		"\u01b4\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7\u01c0\58"+
		"\35\2\u01b8\u01b9\5\u0088E\2\u01b9\u01bb\7\r\2\2\u01ba\u01bc\7[\2\2\u01bb"+
		"\u01ba\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01be\58"+
		"\35\2\u01be\u01c0\3\2\2\2\u01bf\u01b2\3\2\2\2\u01bf\u01b8\3\2\2\2\u01c0"+
		"C\3\2\2\2\u01c1\u01c2\7\5\2\2\u01c2\u01c3\5H%\2\u01c3\u01c4\7\n\2\2\u01c4"+
		"\u01c5\5F$\2\u01c5\u01c6\7\6\2\2\u01c6E\3\2\2\2\u01c7\u01cd\5H%\2\u01c8"+
		"\u01c9\5H%\2\u01c9\u01ca\7\n\2\2\u01ca\u01cb\5F$\2\u01cb\u01cd\3\2\2\2"+
		"\u01cc\u01c7\3\2\2\2\u01cc\u01c8\3\2\2\2\u01cdG\3\2\2\2\u01ce\u01cf\5"+
		"\u0088E\2\u01cf\u01d1\7\r\2\2\u01d0\u01d2\7[\2\2\u01d1\u01d0\3\2\2\2\u01d1"+
		"\u01d2\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3\u01d4\58\35\2\u01d4\u01d7\3\2"+
		"\2\2\u01d5\u01d7\58\35\2\u01d6\u01ce\3\2\2\2\u01d6\u01d5\3\2\2\2\u01d7"+
		"I\3\2\2\2\u01d8\u01d9\5\u0088E\2\u01d9K\3\2\2\2\u01da\u01db\5\u0088E\2"+
		"\u01dbM\3\2\2\2\u01dc\u01de\5P)\2\u01dd\u01dc\3\2\2\2\u01de\u01df\3\2"+
		"\2\2\u01df\u01dd\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0O\3\2\2\2\u01e1\u01e2"+
		"\7\65\2\2\u01e2\u01e4\5\u0088E\2\u01e3\u01e5\5R*\2\u01e4\u01e3\3\2\2\2"+
		"\u01e4\u01e5\3\2\2\2\u01e5Q\3\2\2\2\u01e6\u01e8\7\5\2\2\u01e7\u01e9\5"+
		"T+\2\u01e8\u01e7\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea"+
		"\u01eb\7\6\2\2\u01ebS\3\2\2\2\u01ec\u01ee\5V,\2\u01ed\u01ec\3\2\2\2\u01ee"+
		"\u01ef\3\2\2\2\u01ef\u01ed\3\2\2\2\u01ef\u01f0\3\2\2\2\u01f0U\3\2\2\2"+
		"\u01f1\u01f3\7\5\2\2\u01f2\u01f4\5T+\2\u01f3\u01f2\3\2\2\2\u01f3\u01f4"+
		"\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5\u0203\7\6\2\2\u01f6\u01f8\7\7\2\2\u01f7"+
		"\u01f9\5T+\2\u01f8\u01f7\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9\u01fa\3\2\2"+
		"\2\u01fa\u0203\7\b\2\2\u01fb\u01fd\7\3\2\2\u01fc\u01fe\5T+\2\u01fd\u01fc"+
		"\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff\u0203\7\4\2\2\u0200"+
		"\u0203\5\u0088E\2\u0201\u0203\5\u008cG\2\u0202\u01f1\3\2\2\2\u0202\u01f6"+
		"\3\2\2\2\u0202\u01fb\3\2\2\2\u0202\u0200\3\2\2\2\u0202\u0201\3\2\2\2\u0203"+
		"W\3\2\2\2\u0204\u0209\5x=\2\u0205\u0209\5^\60\2\u0206\u0209\5\\/\2\u0207"+
		"\u0209\5Z.\2\u0208\u0204\3\2\2\2\u0208\u0205\3\2\2\2\u0208\u0206\3\2\2"+
		"\2\u0208\u0207\3\2\2\2\u0209Y\3\2\2\2\u020a\u020c\5N(\2\u020b\u020a\3"+
		"\2\2\2\u020b\u020c\3\2\2\2\u020c\u020e\3\2\2\2\u020d\u020f\5\u008eH\2"+
		"\u020e\u020d\3\2\2\2\u020e\u020f\3\2\2\2\u020f\u0210\3\2\2\2\u0210\u0211"+
		"\7;\2\2\u0211\u0213\5\u0088E\2\u0212\u0214\5z>\2\u0213\u0212\3\2\2\2\u0213"+
		"\u0214\3\2\2\2\u0214\u0215\3\2\2\2\u0215\u0217\5~@\2\u0216\u0218\5\u0080"+
		"A\2\u0217\u0216\3\2\2\2\u0217\u0218\3\2\2\2\u0218[\3\2\2\2\u0219\u021b"+
		"\5N(\2\u021a\u0219\3\2\2\2\u021a\u021b\3\2\2\2\u021b\u021d\3\2\2\2\u021c"+
		"\u021e\7F\2\2\u021d\u021c\3\2\2\2\u021d\u021e\3\2\2\2\u021e\u0220\3\2"+
		"\2\2\u021f\u0221\5\u008eH\2\u0220\u021f\3\2\2\2\u0220\u0221\3\2\2\2\u0221"+
		"\u0223\3\2\2\2\u0222\u0224\7F\2\2\u0223\u0222\3\2\2\2\u0223\u0224\3\2"+
		"\2\2\u0224\u0225\3\2\2\2\u0225\u0226\7<\2\2\u0226\u0228\5\u0088E\2\u0227"+
		"\u0229\5$\23\2\u0228\u0227\3\2\2\2\u0228\u0229\3\2\2\2\u0229\u022b\3\2"+
		"\2\2\u022a\u022c\5z>\2\u022b\u022a\3\2\2\2\u022b\u022c\3\2\2\2\u022c\u022d"+
		"\3\2\2\2\u022d\u022f\5~@\2\u022e\u0230\5\u0080A\2\u022f\u022e\3\2\2\2"+
		"\u022f\u0230\3\2\2\2\u0230]\3\2\2\2\u0231\u0233\5N(\2\u0232\u0231\3\2"+
		"\2\2\u0232\u0233\3\2\2\2\u0233\u0235\3\2\2\2\u0234\u0236\5\u008eH\2\u0235"+
		"\u0234\3\2\2\2\u0235\u0236\3\2\2\2\u0236\u0239\3\2\2\2\u0237\u023a\5j"+
		"\66\2\u0238\u023a\5`\61\2\u0239\u0237\3\2\2\2\u0239\u0238\3\2\2\2\u023a"+
		"_\3\2\2\2\u023b\u023c\79\2\2\u023c\u023e\5\u0088E\2\u023d\u023f\5$\23"+
		"\2\u023e\u023d\3\2\2\2\u023e\u023f\3\2\2\2\u023f\u0241\3\2\2\2\u0240\u0242"+
		"\5z>\2\u0241\u0240\3\2\2\2\u0241\u0242\3\2\2\2\u0242\u0243\3\2\2\2\u0243"+
		"\u0244\7\7\2\2\u0244\u0245\5b\62\2\u0245\u0246\7\b\2\2\u0246a\3\2\2\2"+
		"\u0247\u0249\5d\63\2\u0248\u024a\5b\62\2\u0249\u0248\3\2\2\2\u0249\u024a"+
		"\3\2\2\2\u024ac\3\2\2\2\u024b\u024d\5N(\2\u024c\u024b\3\2\2\2\u024c\u024d"+
		"\3\2\2\2\u024d\u024e\3\2\2\2\u024e\u024f\7A\2\2\u024f\u0250\5f\64\2\u0250"+
		"e\3\2\2\2\u0251\u0258\5h\65\2\u0252\u0253\5h\65\2\u0253\u0255\7\n\2\2"+
		"\u0254\u0256\5f\64\2\u0255\u0254\3\2\2\2\u0255\u0256\3\2\2\2\u0256\u0258"+
		"\3\2\2\2\u0257\u0251\3\2\2\2\u0257\u0252\3\2\2\2\u0258g\3\2\2\2\u0259"+
		"\u025b\5\u0088E\2\u025a\u025c\5\u0080A\2\u025b\u025a\3\2\2\2\u025b\u025c"+
		"\3\2\2\2\u025ci\3\2\2\2\u025d\u025f\7\\\2\2\u025e\u025d\3\2\2\2\u025e"+
		"\u025f\3\2\2\2\u025f\u0260\3\2\2\2\u0260\u0261\79\2\2\u0261\u0263\5\u0088"+
		"E\2\u0262\u0264\5$\23\2\u0263\u0262\3\2\2\2\u0263\u0264\3\2\2\2\u0264"+
		"\u0266\3\2\2\2\u0265\u0267\5z>\2\u0266\u0265\3\2\2\2\u0266\u0267\3\2\2"+
		"\2\u0267\u0268\3\2\2\2\u0268\u0269\7\7\2\2\u0269\u026a\5l\67\2\u026a\u026b"+
		"\7\b\2\2\u026bk\3\2\2\2\u026c\u026e\5n8\2\u026d\u026f\5l\67\2\u026e\u026d"+
		"\3\2\2\2\u026e\u026f\3\2\2\2\u026fm\3\2\2\2\u0270\u0273\5\u0080A\2\u0271"+
		"\u0273\5p9\2\u0272\u0270\3\2\2\2\u0272\u0271\3\2\2\2\u0273\u0274\3\2\2"+
		"\2\u0274\u0272\3\2\2\2\u0274\u0275\3\2\2\2\u0275o\3\2\2\2\u0276\u0278"+
		"\5N(\2\u0277\u0276\3\2\2\2\u0277\u0278\3\2\2\2\u0278\u027a\3\2\2\2\u0279"+
		"\u027b\7\\\2\2\u027a\u0279\3\2\2\2\u027a\u027b\3\2\2\2\u027b\u027c\3\2"+
		"\2\2\u027c\u027d\7A\2\2\u027d\u027e\5r:\2\u027eq\3\2\2\2\u027f\u0285\5"+
		"t;\2\u0280\u0281\5t;\2\u0281\u0282\7\n\2\2\u0282\u0283\5r:\2\u0283\u0285"+
		"\3\2\2\2\u0284\u027f\3\2\2\2\u0284\u0280\3\2\2\2\u0285s\3\2\2\2\u0286"+
		"\u0288\5\u0088E\2\u0287\u0289\5D#\2\u0288\u0287\3\2\2\2\u0288\u0289\3"+
		"\2\2\2\u0289u\3\2\2\2\u028a\u028b\7\67\2\2\u028b\u028c\5\u0088E\2\u028c"+
		"w\3\2\2\2\u028d\u028f\5N(\2\u028e\u028d\3\2\2\2\u028e\u028f\3\2\2\2\u028f"+
		"\u0291\3\2\2\2\u0290\u0292\7F\2\2\u0291\u0290\3\2\2\2\u0291\u0292\3\2"+
		"\2\2\u0292\u0294\3\2\2\2\u0293\u0295\5\u008eH\2\u0294\u0293\3\2\2\2\u0294"+
		"\u0295\3\2\2\2\u0295\u0297\3\2\2\2\u0296\u0298\7F\2\2\u0297\u0296\3\2"+
		"\2\2\u0297\u0298\3\2\2\2\u0298\u0299\3\2\2\2\u0299\u029a\78\2\2\u029a"+
		"\u029c\5\u0088E\2\u029b\u029d\5$\23\2\u029c\u029b\3\2\2\2\u029c\u029d"+
		"\3\2\2\2\u029d\u029f\3\2\2\2\u029e\u02a0\5z>\2\u029f\u029e\3\2\2\2\u029f"+
		"\u02a0\3\2\2\2\u02a0\u02a1\3\2\2\2\u02a1\u02a3\5~@\2\u02a2\u02a4\5\u0080"+
		"A\2\u02a3\u02a2\3\2\2\2\u02a3\u02a4\3\2\2\2\u02a4y\3\2\2\2\u02a5\u02a6"+
		"\7\r\2\2\u02a6\u02a7\5|?\2\u02a7{\3\2\2\2\u02a8\u02ae\5\u0088E\2\u02a9"+
		"\u02aa\5\u0088E\2\u02aa\u02ab\7\n\2\2\u02ab\u02ac\5|?\2\u02ac\u02ae\3"+
		"\2\2\2\u02ad\u02a8\3\2\2\2\u02ad\u02a9\3\2\2\2\u02ae}\3\2\2\2\u02af\u02b5"+
		"\7\7\2\2\u02b0\u02b4\5\16\b\2\u02b1\u02b4\5\n\6\2\u02b2\u02b4\5\u0082"+
		"B\2\u02b3\u02b0\3\2\2\2\u02b3\u02b1\3\2\2\2\u02b3\u02b2\3\2\2\2\u02b4"+
		"\u02b7\3\2\2\2\u02b5\u02b3\3\2\2\2\u02b5\u02b6\3\2\2\2\u02b6\u02b8\3\2"+
		"\2\2\u02b7\u02b5\3\2\2\2\u02b8\u02b9\7\b\2\2\u02b9\177\3\2\2\2\u02ba\u02bf"+
		"\7s\2\2\u02bb\u02bf\5\u008aF\2\u02bc\u02bf\5\u008cG\2\u02bd\u02bf\5\u0088"+
		"E\2\u02be\u02ba\3\2\2\2\u02be\u02bb\3\2\2\2\u02be\u02bc\3\2\2\2\u02be"+
		"\u02bd\3\2\2\2\u02bf\u02c0\3\2\2\2\u02c0\u02c1\3\2\2\2\u02c0\u02be\3\2"+
		"\2\2\u02c1\u0081\3\2\2\2\u02c2\u02c5\5\u0084C\2\u02c3\u02c5\5\u0086D\2"+
		"\u02c4\u02c2\3\2\2\2\u02c4\u02c3\3\2\2\2\u02c5\u0083\3\2\2\2\u02c6\u02c8"+
		"\5N(\2\u02c7\u02c6\3\2\2\2\u02c7\u02c8\3\2\2\2\u02c8\u02ca\3\2\2\2\u02c9"+
		"\u02cb\5\22\n\2\u02ca\u02c9\3\2\2\2\u02ca\u02cb\3\2\2\2\u02cb\u02cc\3"+
		"\2\2\2\u02cc\u02cd\7D\2\2\u02cd\u02d0\5\u0088E\2\u02ce\u02cf\7\r\2\2\u02cf"+
		"\u02d1\58\35\2\u02d0\u02ce\3\2\2\2\u02d0\u02d1\3\2\2\2\u02d1\u02d3\3\2"+
		"\2\2\u02d2\u02d4\5\u0080A\2\u02d3\u02d2\3\2\2\2\u02d3\u02d4\3\2\2\2\u02d4"+
		"\u0085\3\2\2\2\u02d5\u02d7\5N(\2\u02d6\u02d5\3\2\2\2\u02d6\u02d7\3\2\2"+
		"\2\u02d7\u02d9\3\2\2\2\u02d8\u02da\5\22\n\2\u02d9\u02d8\3\2\2\2\u02d9"+
		"\u02da\3\2\2\2\u02da\u02db\3\2\2\2\u02db\u02dc\7E\2\2\u02dc\u02df\5\u0088"+
		"E\2\u02dd\u02de\7\r\2\2\u02de\u02e0\58\35\2\u02df\u02dd\3\2\2\2\u02df"+
		"\u02e0\3\2\2\2\u02e0\u02e2\3\2\2\2\u02e1\u02e3\5\u0080A\2\u02e2\u02e1"+
		"\3\2\2\2\u02e2\u02e3\3\2\2\2\u02e3\u0087\3\2\2\2\u02e4\u02e5\t\4\2\2\u02e5"+
		"\u0089\3\2\2\2\u02e6\u02e7\t\5\2\2\u02e7\u008b\3\2\2\2\u02e8\u02e9\t\6"+
		"\2\2\u02e9\u008d\3\2\2\2\u02ea\u02eb\t\7\2\2\u02eb\u008f\3\2\2\2\u0082"+
		"\u0093\u0099\u009b\u009f\u00a3\u00a6\u00a9\u00af\u00b2\u00b5\u00b8\u00be"+
		"\u00c1\u00c5\u00c9\u00ce\u00d1\u00d5\u00da\u00e0\u00e3\u00e9\u00eb\u00f1"+
		"\u00f4\u00f8\u00fd\u0104\u010c\u0111\u0113\u0117\u011a\u0120\u0123\u0126"+
		"\u0129\u012f\u0132\u013d\u0144\u0150\u0157\u015a\u015f\u0163\u0169\u016d"+
		"\u0173\u0177\u017d\u0181\u0185\u0189\u018d\u0196\u019a\u01a4\u01a8\u01af"+
		"\u01b2\u01b5\u01bb\u01bf\u01cc\u01d1\u01d6\u01df\u01e4\u01e8\u01ef\u01f3"+
		"\u01f8\u01fd\u0202\u0208\u020b\u020e\u0213\u0217\u021a\u021d\u0220\u0223"+
		"\u0228\u022b\u022f\u0232\u0235\u0239\u023e\u0241\u0249\u024c\u0255\u0257"+
		"\u025b\u025e\u0263\u0266\u026e\u0272\u0274\u0277\u027a\u0284\u0288\u028e"+
		"\u0291\u0294\u0297\u029c\u029f\u02a3\u02ad\u02b3\u02b5\u02be\u02c0\u02c4"+
		"\u02c7\u02ca\u02d0\u02d3\u02d6\u02d9\u02df\u02e2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}