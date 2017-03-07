package de.unihamburg.swk.parsing.antlr4.kotlin;// Generated from KotlinParser.g4 by ANTLR 4.4
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class KotlinParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ClassModifier_data=76, SimpleName=118, OP_AS_SAFE=48, ELVIS=33, FunctionModifier_tailrec=82, 
		ConstructorDelegationCall_this=100, SINLE_QUOTE_ESCAPED_CHAR=123, KEYWORD_where=66, 
		HierarchyModifier_lateinit=73, FunctionModifier_external=86, OP_DIV_ASSIGN=52, 
		HierarchyModifier_abstract=69, WHITESPACE=3, OP_MUNUS=44, OP_ASTERISK=40, 
		MULTILINE_COMMENT=1, SINGLE_TEXT=121, FunctionModifier_inline=85, Jump_break=98, 
		OP_DECREMENT=54, DOG=89, OP_MINUS_ASSIGN=50, AnnotationUseSiteTarget_param=93, 
		DOT=15, KEYWORD_constructor=99, OP_AS=47, FunctionModifier_operator=83, 
		HierarchyModifier_open=70, MULTILINE_QUOTE_TEXT=126, FunctionModifier_infix=84, 
		CF_do=113, CONJ=32, OP_IS=56, OP_NOT=58, GET=67, AccessModifier_public=80, 
		HierarchyModifier_final=71, AnnotationUseSiteTarget_field=91, OP_IN=45, 
		OP_NULL_ASSERT=57, AccessModifier_private=78, OP_MULT_ASSIGN=51, SET=68, 
		ConstructorDelegationCall_super=101, SINLE_QUOTE_EXPRESSION_START=124, 
		SEMI=6, AnnotationUseSiteTarget_property=92, VarianceAnnotation_out=88, 
		Jump_continue=96, Jump_return=97, IMPORT=14, Q=30, MULTILINE_QUOTE_REF=130, 
		EQ_EQ_EQ=24, SINLE_QUOTE_WHITESPACE=120, COMMA=17, KEYWORD_by=64, BRACE_CLOSE=29, 
		ClassModifier_annotation=75, NEQ_EQ_EQ=25, ClassModifier_enum=74, SINGLE_QUOTE=12, 
		OP_DIV=41, STAR=16, Declaration_class=102, NEQ=26, Declaration_init=107, 
		SQ_CLOSE=60, MULTILINE_QUOTES=128, ClassModifier_inner=77, Jump_throw=95, 
		CharacterLiteral=10, CF_catch=115, SINLE_QUOTE_CLOSE=122, CF_try=114, 
		KEYWORD_vararg=63, LT=18, Declaration_interface=103, CF_else=109, MULTILINE_QUOTE_CLOSE=127, 
		AccessModifier_protected=79, BRACE_OPEN=28, Declaration_companion=105, 
		PACKAGE=13, AnnotationUseSiteTarget_sparam=94, PropertyModifier_const=87, 
		IntegerLiteral=5, NULL=39, LongLiteral=4, CF_if=108, TRUE=37, KEYWORD_val=61, 
		EQ=22, KEYWORD_var=62, CF_when=110, HierarchyModifier_override=72, OP_PLUS_ASSIGN=49, 
		SQ_OPEN=59, CF_for=112, OP_INCREMENT=55, LONG_RANGE=34, AnnotationUseSiteTarget_file=90, 
		TRIPLE_QUOTE=11, LTE=19, DISJ=31, KEYWORD_dynamic=65, RANGE=35, SINGLELINE_COMMENT=2, 
		OP_PLUS=43, OP_NOT_IN=46, HexadecimalLiteral=9, AccessModifier_internal=81, 
		Declaration_object=104, MULTILINE_QUOTE_EXPRESSION_START=129, Declaration_fun=106, 
		OP_NOT_IS=119, REFERENCE=36, OP_MOD_ASSIGN=53, OP_MOD=42, CF_while=111, 
		CF_FINALLY=116, COLON=27, GT=20, EQ_EQ=23, SINGLE_QUOTE_REF=125, GTE=21, 
		BAX=117, FALSE=38, OPEN_BLOCK=7, CLOSE_BLOCK=8;
	public static final String[] tokenNames = {
		"<INVALID>", "MULTILINE_COMMENT", "SINGLELINE_COMMENT", "WHITESPACE", 
		"LongLiteral", "IntegerLiteral", "';'", "'{'", "'}'", "HexadecimalLiteral", 
		"CharacterLiteral", "TRIPLE_QUOTE", "SINGLE_QUOTE", "'package'", "'import'", 
		"'.'", "'*'", "','", "'<'", "'<='", "'>'", "'>='", "'='", "'=='", "'==='", 
		"'!=='", "'!='", "':'", "'('", "')'", "'?'", "'||'", "'&&'", "'?:'", "'...'", 
		"'..'", "'::'", "'true'", "'false'", "'null'", "'->'", "'/'", "'%'", "'+'", 
		"'-'", "'in'", "'!in'", "'as'", "'as?'", "'+='", "'-='", "'*='", "'/='", 
		"'%='", "'--'", "'++'", "'is'", "'!!'", "'!'", "'['", "']'", "'val'", 
		"'var'", "'vararg'", "'by'", "'dynamic'", "'where'", "'get'", "'set'", 
		"'abstract'", "'open'", "'final'", "'override'", "'lateinit'", "'enum'", 
		"'annotation'", "'data'", "'inner'", "'private'", "'protected'", "'public'", 
		"'internal'", "'tailrec'", "'operator'", "'infix'", "'inline'", "'external'", 
		"'const'", "'out'", "'@'", "'file'", "'field'", "'property'", "'param'", 
		"'sparam'", "'throw'", "'continue'", "'return'", "'break'", "'constructor'", 
		"'this'", "'super'", "'class'", "'interface'", "'object'", "'companion'", 
		"'fun'", "'init'", "'if'", "'else'", "'when'", "'while'", "'for'", "'do'", 
		"'try'", "'catch'", "'finally'", "'$'", "SimpleName", "'!is '", "SINLE_QUOTE_WHITESPACE", 
		"SINGLE_TEXT", "SINLE_QUOTE_CLOSE", "SINLE_QUOTE_ESCAPED_CHAR", "SINLE_QUOTE_EXPRESSION_START", 
		"SINGLE_QUOTE_REF", "MULTILINE_QUOTE_TEXT", "MULTILINE_QUOTE_CLOSE", "MULTILINE_QUOTES", 
		"MULTILINE_QUOTE_EXPRESSION_START", "MULTILINE_QUOTE_REF"
	};
	public static final int
		RULE_kotlinFile = 0, RULE_preamble = 1, RULE_packageHeader = 2, RULE_importHeader = 3, 
		RULE_toplevelObject = 4, RULE_memberDeclaration = 5, RULE_optionalProjection = 6, 
		RULE_typeParameters = 7, RULE_typeParameter = 8, RULE_typeArguments = 9, 
		RULE_typeConstraints = 10, RULE_typeConstraint = 11, RULE_type = 12, RULE_typeDescriptor = 13, 
		RULE_userType = 14, RULE_simpleUserType_typeParam = 15, RULE_simpleUserType = 16, 
		RULE_keywordOrSimpleName = 17, RULE_variableDeclarationEntry = 18, RULE_functionType_paramOrType = 19, 
		RULE_extensionFunctionTypeNoReceiver = 20, RULE_functionTypeNoReceiver = 21, 
		RULE_multipleVariableDeclarations = 22, RULE_propertyDeclaration = 23, 
		RULE_modifiers = 24, RULE_modifier = 25, RULE_modifierKeyword = 26, RULE_propertyModifier = 27, 
		RULE_functionModifier = 28, RULE_hierarchyModifier = 29, RULE_identifier = 30, 
		RULE_classModifier = 31, RULE_accessModifier = 32, RULE_varianceAnnotation = 33, 
		RULE_annotations = 34, RULE_annotation = 35, RULE_annotationUseSiteTarget = 36, 
		RULE_valueArgument = 37, RULE_valueArguments = 38, RULE_unescapedAnnotation = 39, 
		RULE_jump = 40, RULE_labelReference = 41, RULE_labelDefinition = 42, RULE_parameter = 43, 
		RULE_functionParameter = 44, RULE_primaryConstructor = 45, RULE_secondaryConstructor = 46, 
		RULE_constructorDelegationCall = 47, RULE_callSuffix = 48, RULE_constructorInvocation = 49, 
		RULE_explicitDelegation = 50, RULE_delegationSpecifier = 51, RULE_classDeclaration = 52, 
		RULE_classOrInterface = 53, RULE_supertypesSpecifiers = 54, RULE_objectDeclaration = 55, 
		RULE_companionObject = 56, RULE_classBody = 57, RULE_members = 58, RULE_valueParameters = 59, 
		RULE_functionDeclaration = 60, RULE_statements = 61, RULE_functionBody = 62, 
		RULE_block = 63, RULE_anonymousInitializer = 64, RULE_enumClassBody = 65, 
		RULE_enumEntries = 66, RULE_enumEntry = 67, RULE_ifExpression = 68, RULE_tryExpression = 69, 
		RULE_catchBlock = 70, RULE_finallyBlock = 71, RULE_loop = 72, RULE_forLoop = 73, 
		RULE_whileLoop = 74, RULE_doWhileLoop = 75, RULE_expression = 76, RULE_disjunction = 77, 
		RULE_conjunction = 78, RULE_equalityComparison = 79, RULE_comparison = 80, 
		RULE_namedInfix = 81, RULE_elvisExpression = 82, RULE_infixFunctionCall = 83, 
		RULE_rangeExpression = 84, RULE_additiveExpression = 85, RULE_multiplicativeExpression = 86, 
		RULE_typeRHS = 87, RULE_prefixUnaryExpression = 88, RULE_postfixUnaryExpression = 89, 
		RULE_callableReference = 90, RULE_getter = 91, RULE_setter = 92, RULE_stringLiteral = 93, 
		RULE_atomicExpression = 94, RULE_literalConstant = 95, RULE_declaration = 96, 
		RULE_statement = 97, RULE_multiplicativeOperation = 98, RULE_additiveOperation = 99, 
		RULE_inOperation = 100, RULE_typeOperation = 101, RULE_comparisonOperation = 102, 
		RULE_equalityOperation = 103, RULE_assignmentOperator = 104, RULE_postfixUnaryOperation = 105, 
		RULE_prefixUnaryOperation = 106, RULE_isOperation = 107, RULE_annotatedLambda = 108, 
		RULE_memberAccessOperation = 109, RULE_functionLiteral = 110, RULE_arrayAccess = 111, 
		RULE_objectLiteral = 112, RULE_when = 113, RULE_whenEntry = 114, RULE_whenCondition = 115;
	public static final String[] ruleNames = {
		"kotlinFile", "preamble", "packageHeader", "importHeader", "toplevelObject", 
		"memberDeclaration", "optionalProjection", "typeParameters", "typeParameter", 
		"typeArguments", "typeConstraints", "typeConstraint", "type", "typeDescriptor", 
		"userType", "simpleUserType_typeParam", "simpleUserType", "keywordOrSimpleName", 
		"variableDeclarationEntry", "functionType_paramOrType", "extensionFunctionTypeNoReceiver", 
		"functionTypeNoReceiver", "multipleVariableDeclarations", "propertyDeclaration", 
		"modifiers", "modifier", "modifierKeyword", "propertyModifier", "functionModifier", 
		"hierarchyModifier", "identifier", "classModifier", "accessModifier", 
		"varianceAnnotation", "annotations", "annotation", "annotationUseSiteTarget", 
		"valueArgument", "valueArguments", "unescapedAnnotation", "jump", "labelReference", 
		"labelDefinition", "parameter", "functionParameter", "primaryConstructor", 
		"secondaryConstructor", "constructorDelegationCall", "callSuffix", "constructorInvocation", 
		"explicitDelegation", "delegationSpecifier", "classDeclaration", "classOrInterface", 
		"supertypesSpecifiers", "objectDeclaration", "companionObject", "classBody", 
		"members", "valueParameters", "functionDeclaration", "statements", "functionBody", 
		"block", "anonymousInitializer", "enumClassBody", "enumEntries", "enumEntry", 
		"ifExpression", "tryExpression", "catchBlock", "finallyBlock", "loop", 
		"forLoop", "whileLoop", "doWhileLoop", "expression", "disjunction", "conjunction", 
		"equalityComparison", "comparison", "namedInfix", "elvisExpression", "infixFunctionCall", 
		"rangeExpression", "additiveExpression", "multiplicativeExpression", "typeRHS", 
		"prefixUnaryExpression", "postfixUnaryExpression", "callableReference", 
		"getter", "setter", "stringLiteral", "atomicExpression", "literalConstant", 
		"declaration", "statement", "multiplicativeOperation", "additiveOperation", 
		"inOperation", "typeOperation", "comparisonOperation", "equalityOperation", 
		"assignmentOperator", "postfixUnaryOperation", "prefixUnaryOperation", 
		"isOperation", "annotatedLambda", "memberAccessOperation", "functionLiteral", 
		"arrayAccess", "objectLiteral", "when", "whenEntry", "whenCondition"
	};

	@Override
	public String getGrammarFileName() { return "KotlinParser.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public KotlinParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class KotlinFileContext extends ParserRuleContext {
		public PreambleContext preamble() {
			return getRuleContext(PreambleContext.class,0);
		}
		public ToplevelObjectContext toplevelObject(int i) {
			return getRuleContext(ToplevelObjectContext.class,i);
		}
		public List<ToplevelObjectContext> toplevelObject() {
			return getRuleContexts(ToplevelObjectContext.class);
		}
		public KotlinFileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kotlinFile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterKotlinFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitKotlinFile(this);
		}
	}

	public final KotlinFileContext kotlinFile() throws RecognitionException {
		KotlinFileContext _localctx = new KotlinFileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_kotlinFile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232); preamble();
			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 45)) & ~0x3f) == 0 && ((1L << (_la - 45)) & ((1L << (OP_IN - 45)) | (1L << (KEYWORD_val - 45)) | (1L << (KEYWORD_var - 45)) | (1L << (HierarchyModifier_abstract - 45)) | (1L << (HierarchyModifier_open - 45)) | (1L << (HierarchyModifier_final - 45)) | (1L << (HierarchyModifier_override - 45)) | (1L << (HierarchyModifier_lateinit - 45)) | (1L << (ClassModifier_enum - 45)) | (1L << (ClassModifier_annotation - 45)) | (1L << (ClassModifier_data - 45)) | (1L << (ClassModifier_inner - 45)) | (1L << (AccessModifier_private - 45)) | (1L << (AccessModifier_protected - 45)) | (1L << (AccessModifier_public - 45)) | (1L << (AccessModifier_internal - 45)) | (1L << (FunctionModifier_tailrec - 45)) | (1L << (FunctionModifier_operator - 45)) | (1L << (FunctionModifier_infix - 45)) | (1L << (FunctionModifier_inline - 45)) | (1L << (FunctionModifier_external - 45)) | (1L << (PropertyModifier_const - 45)) | (1L << (VarianceAnnotation_out - 45)) | (1L << (DOG - 45)) | (1L << (Declaration_class - 45)) | (1L << (Declaration_interface - 45)) | (1L << (Declaration_object - 45)) | (1L << (Declaration_fun - 45)))) != 0)) {
				{
				{
				setState(233); toplevelObject();
				}
				}
				setState(238);
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

	public static class PreambleContext extends ParserRuleContext {
		public List<ImportHeaderContext> importHeader() {
			return getRuleContexts(ImportHeaderContext.class);
		}
		public PackageHeaderContext packageHeader() {
			return getRuleContext(PackageHeaderContext.class,0);
		}
		public ImportHeaderContext importHeader(int i) {
			return getRuleContext(ImportHeaderContext.class,i);
		}
		public PreambleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preamble; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterPreamble(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitPreamble(this);
		}
	}

	public final PreambleContext preamble() throws RecognitionException {
		PreambleContext _localctx = new PreambleContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_preamble);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			_la = _input.LA(1);
			if (_la==PACKAGE) {
				{
				setState(239); packageHeader();
				}
			}

			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(242); importHeader();
				}
				}
				setState(247);
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

	public static class PackageHeaderContext extends ParserRuleContext {
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(KotlinParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(KotlinParser.SEMI, i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public PackageHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterPackageHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitPackageHeader(this);
		}
	}

	public final PackageHeaderContext packageHeader() throws RecognitionException {
		PackageHeaderContext _localctx = new PackageHeaderContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_packageHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248); match(PACKAGE);
			setState(249); identifier();
			setState(254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(250); match(DOT);
				setState(251); identifier();
				}
				}
				setState(256);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(257); match(SEMI);
				}
				}
				setState(262);
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

	public static class ImportHeaderContext extends ParserRuleContext {
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(KotlinParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(KotlinParser.SEMI, i);
		}
		public KeywordOrSimpleNameContext keywordOrSimpleName() {
			return getRuleContext(KeywordOrSimpleNameContext.class,0);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public ImportHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterImportHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitImportHeader(this);
		}
	}

	public final ImportHeaderContext importHeader() throws RecognitionException {
		ImportHeaderContext _localctx = new ImportHeaderContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_importHeader);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(263); match(IMPORT);
			setState(264); identifier();
			setState(269);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(265); match(DOT);
					setState(266); identifier();
					}
					} 
				}
				setState(271);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(276);
			switch (_input.LA(1)) {
			case DOT:
				{
				setState(272); match(DOT);
				setState(273); match(STAR);
				}
				break;
			case OP_AS:
				{
				setState(274); match(OP_AS);
				setState(275); keywordOrSimpleName();
				}
				break;
			case EOF:
			case SEMI:
			case IMPORT:
			case OP_IN:
			case KEYWORD_val:
			case KEYWORD_var:
			case HierarchyModifier_abstract:
			case HierarchyModifier_open:
			case HierarchyModifier_final:
			case HierarchyModifier_override:
			case HierarchyModifier_lateinit:
			case ClassModifier_enum:
			case ClassModifier_annotation:
			case ClassModifier_data:
			case ClassModifier_inner:
			case AccessModifier_private:
			case AccessModifier_protected:
			case AccessModifier_public:
			case AccessModifier_internal:
			case FunctionModifier_tailrec:
			case FunctionModifier_operator:
			case FunctionModifier_infix:
			case FunctionModifier_inline:
			case FunctionModifier_external:
			case PropertyModifier_const:
			case VarianceAnnotation_out:
			case DOG:
			case Declaration_class:
			case Declaration_interface:
			case Declaration_object:
			case Declaration_fun:
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(278); match(SEMI);
				}
				}
				setState(283);
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

	public static class ToplevelObjectContext extends ParserRuleContext {
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public PropertyDeclarationContext propertyDeclaration() {
			return getRuleContext(PropertyDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public ObjectDeclarationContext objectDeclaration() {
			return getRuleContext(ObjectDeclarationContext.class,0);
		}
		public ToplevelObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_toplevelObject; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterToplevelObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitToplevelObject(this);
		}
	}

	public final ToplevelObjectContext toplevelObject() throws RecognitionException {
		ToplevelObjectContext _localctx = new ToplevelObjectContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_toplevelObject);
		try {
			setState(288);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(284); propertyDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(285); functionDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(286); classDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(287); objectDeclaration();
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

	public static class MemberDeclarationContext extends ParserRuleContext {
		public CompanionObjectContext companionObject() {
			return getRuleContext(CompanionObjectContext.class,0);
		}
		public AnonymousInitializerContext anonymousInitializer() {
			return getRuleContext(AnonymousInitializerContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public PropertyDeclarationContext propertyDeclaration() {
			return getRuleContext(PropertyDeclarationContext.class,0);
		}
		public ObjectDeclarationContext objectDeclaration() {
			return getRuleContext(ObjectDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public SecondaryConstructorContext secondaryConstructor() {
			return getRuleContext(SecondaryConstructorContext.class,0);
		}
		public MemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitMemberDeclaration(this);
		}
	}

	public final MemberDeclarationContext memberDeclaration() throws RecognitionException {
		MemberDeclarationContext _localctx = new MemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_memberDeclaration);
		try {
			setState(297);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(290); companionObject();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(291); objectDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(292); functionDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(293); propertyDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(294); classDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(295); anonymousInitializer();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(296); secondaryConstructor();
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

	public static class OptionalProjectionContext extends ParserRuleContext {
		public VarianceAnnotationContext varianceAnnotation() {
			return getRuleContext(VarianceAnnotationContext.class,0);
		}
		public OptionalProjectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionalProjection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterOptionalProjection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitOptionalProjection(this);
		}
	}

	public final OptionalProjectionContext optionalProjection() throws RecognitionException {
		OptionalProjectionContext _localctx = new OptionalProjectionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_optionalProjection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			_la = _input.LA(1);
			if (_la==OP_IN || _la==VarianceAnnotation_out) {
				{
				setState(299); varianceAnnotation();
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

	public static class TypeParametersContext extends ParserRuleContext {
		public List<TypeParameterContext> typeParameter() {
			return getRuleContexts(TypeParameterContext.class);
		}
		public TypeParameterContext typeParameter(int i) {
			return getRuleContext(TypeParameterContext.class,i);
		}
		public TypeParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterTypeParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitTypeParameters(this);
		}
	}

	public final TypeParametersContext typeParameters() throws RecognitionException {
		TypeParametersContext _localctx = new TypeParametersContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_typeParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302); match(LT);
			setState(305);
			switch (_input.LA(1)) {
			case OP_IN:
			case GET:
			case SET:
			case HierarchyModifier_abstract:
			case HierarchyModifier_open:
			case HierarchyModifier_final:
			case HierarchyModifier_override:
			case HierarchyModifier_lateinit:
			case ClassModifier_enum:
			case ClassModifier_annotation:
			case ClassModifier_data:
			case ClassModifier_inner:
			case AccessModifier_private:
			case AccessModifier_protected:
			case AccessModifier_public:
			case AccessModifier_internal:
			case FunctionModifier_tailrec:
			case FunctionModifier_operator:
			case FunctionModifier_infix:
			case FunctionModifier_inline:
			case FunctionModifier_external:
			case PropertyModifier_const:
			case VarianceAnnotation_out:
			case DOG:
			case AnnotationUseSiteTarget_file:
			case AnnotationUseSiteTarget_field:
			case KEYWORD_constructor:
			case SimpleName:
				{
				setState(303); typeParameter();
				}
				break;
			case STAR:
				{
				setState(304); match(STAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(314);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(307); match(COMMA);
				setState(310);
				switch (_input.LA(1)) {
				case OP_IN:
				case GET:
				case SET:
				case HierarchyModifier_abstract:
				case HierarchyModifier_open:
				case HierarchyModifier_final:
				case HierarchyModifier_override:
				case HierarchyModifier_lateinit:
				case ClassModifier_enum:
				case ClassModifier_annotation:
				case ClassModifier_data:
				case ClassModifier_inner:
				case AccessModifier_private:
				case AccessModifier_protected:
				case AccessModifier_public:
				case AccessModifier_internal:
				case FunctionModifier_tailrec:
				case FunctionModifier_operator:
				case FunctionModifier_infix:
				case FunctionModifier_inline:
				case FunctionModifier_external:
				case PropertyModifier_const:
				case VarianceAnnotation_out:
				case DOG:
				case AnnotationUseSiteTarget_file:
				case AnnotationUseSiteTarget_field:
				case KEYWORD_constructor:
				case SimpleName:
					{
					setState(308); typeParameter();
					}
					break;
				case STAR:
					{
					setState(309); match(STAR);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(316);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(317); match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParameterContext extends ParserRuleContext {
		public KeywordOrSimpleNameContext keywordOrSimpleName() {
			return getRuleContext(KeywordOrSimpleNameContext.class,0);
		}
		public UserTypeContext userType() {
			return getRuleContext(UserTypeContext.class,0);
		}
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
		public TypeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterTypeParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitTypeParameter(this);
		}
	}

	public final TypeParameterContext typeParameter() throws RecognitionException {
		TypeParameterContext _localctx = new TypeParameterContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_typeParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319); modifiers();
			setState(320); keywordOrSimpleName();
			setState(323);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(321); match(COLON);
				setState(322); userType();
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

	public static class TypeArgumentsContext extends ParserRuleContext {
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterTypeArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitTypeArguments(this);
		}
	}

	public final TypeArgumentsContext typeArguments() throws RecognitionException {
		TypeArgumentsContext _localctx = new TypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_typeArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325); match(LT);
			{
			setState(328);
			switch (_input.LA(1)) {
			case PACKAGE:
			case BRACE_OPEN:
			case KEYWORD_dynamic:
			case GET:
			case SET:
			case ClassModifier_annotation:
			case ClassModifier_data:
			case DOG:
			case AnnotationUseSiteTarget_file:
			case AnnotationUseSiteTarget_field:
			case KEYWORD_constructor:
			case SimpleName:
				{
				setState(326); type();
				}
				break;
			case STAR:
				{
				setState(327); match(STAR);
				}
				break;
			case COMMA:
			case GT:
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(337);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(330); match(COMMA);
				setState(333);
				switch (_input.LA(1)) {
				case PACKAGE:
				case BRACE_OPEN:
				case KEYWORD_dynamic:
				case GET:
				case SET:
				case ClassModifier_annotation:
				case ClassModifier_data:
				case DOG:
				case AnnotationUseSiteTarget_file:
				case AnnotationUseSiteTarget_field:
				case KEYWORD_constructor:
				case SimpleName:
					{
					setState(331); type();
					}
					break;
				case STAR:
					{
					setState(332); match(STAR);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(339);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(340); match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeConstraintsContext extends ParserRuleContext {
		public List<TypeConstraintContext> typeConstraint() {
			return getRuleContexts(TypeConstraintContext.class);
		}
		public TypeConstraintContext typeConstraint(int i) {
			return getRuleContext(TypeConstraintContext.class,i);
		}
		public TypeConstraintsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeConstraints; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterTypeConstraints(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitTypeConstraints(this);
		}
	}

	public final TypeConstraintsContext typeConstraints() throws RecognitionException {
		TypeConstraintsContext _localctx = new TypeConstraintsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_typeConstraints);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			_la = _input.LA(1);
			if (_la==KEYWORD_where) {
				{
				setState(342); match(KEYWORD_where);
				setState(343); typeConstraint();
				setState(348);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(344); match(COMMA);
					setState(345); typeConstraint();
					}
					}
					setState(350);
					_errHandler.sync(this);
					_la = _input.LA(1);
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

	public static class TypeConstraintContext extends ParserRuleContext {
		public KeywordOrSimpleNameContext keywordOrSimpleName() {
			return getRuleContext(KeywordOrSimpleNameContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public AnnotationsContext annotations() {
			return getRuleContext(AnnotationsContext.class,0);
		}
		public TypeConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeConstraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterTypeConstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitTypeConstraint(this);
		}
	}

	public final TypeConstraintContext typeConstraint() throws RecognitionException {
		TypeConstraintContext _localctx = new TypeConstraintContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_typeConstraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			_la = _input.LA(1);
			if (_la==DOG) {
				{
				setState(353); annotations();
				}
			}

			setState(356); keywordOrSimpleName();
			setState(357); match(COLON);
			setState(358); type();
			}
		}
		catch (RecognitionException re) {
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
		public AnnotationsContext annotations() {
			return getRuleContext(AnnotationsContext.class,0);
		}
		public TypeDescriptorContext typeDescriptor() {
			return getRuleContext(TypeDescriptorContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			_la = _input.LA(1);
			if (_la==DOG) {
				{
				setState(360); annotations();
				}
			}

			setState(363); typeDescriptor();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeDescriptorContext extends ParserRuleContext {
		public FunctionTypeNoReceiverContext functionTypeNoReceiver() {
			return getRuleContext(FunctionTypeNoReceiverContext.class,0);
		}
		public ExtensionFunctionTypeNoReceiverContext extensionFunctionTypeNoReceiver() {
			return getRuleContext(ExtensionFunctionTypeNoReceiverContext.class,0);
		}
		public UserTypeContext userType() {
			return getRuleContext(UserTypeContext.class,0);
		}
		public TypeDescriptorContext typeDescriptor() {
			return getRuleContext(TypeDescriptorContext.class,0);
		}
		public TypeDescriptorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDescriptor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterTypeDescriptor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitTypeDescriptor(this);
		}
	}

	public final TypeDescriptorContext typeDescriptor() throws RecognitionException {
		TypeDescriptorContext _localctx = new TypeDescriptorContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_typeDescriptor);
		try {
			setState(392);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(365); match(BRACE_OPEN);
				setState(366); typeDescriptor();
				setState(367); match(BRACE_CLOSE);
				setState(369);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(368); match(Q);
					}
					break;
				}
				setState(372);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(371); extensionFunctionTypeNoReceiver();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(374); functionTypeNoReceiver();
				setState(376);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(375); extensionFunctionTypeNoReceiver();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(378); userType();
				setState(380);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(379); match(Q);
					}
					break;
				}
				setState(383);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(382); extensionFunctionTypeNoReceiver();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(385); match(KEYWORD_dynamic);
				setState(387);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(386); match(Q);
					}
					break;
				}
				setState(390);
				switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
				case 1:
					{
					setState(389); extensionFunctionTypeNoReceiver();
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

	public static class UserTypeContext extends ParserRuleContext {
		public SimpleUserTypeContext simpleUserType(int i) {
			return getRuleContext(SimpleUserTypeContext.class,i);
		}
		public List<SimpleUserTypeContext> simpleUserType() {
			return getRuleContexts(SimpleUserTypeContext.class);
		}
		public UserTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_userType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterUserType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitUserType(this);
		}
	}

	public final UserTypeContext userType() throws RecognitionException {
		UserTypeContext _localctx = new UserTypeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_userType);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			_la = _input.LA(1);
			if (_la==PACKAGE) {
				{
				setState(394); match(PACKAGE);
				setState(395); match(DOT);
				}
			}

			setState(398); simpleUserType();
			setState(403);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(399); match(DOT);
					setState(400); simpleUserType();
					}
					} 
				}
				setState(405);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
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

	public static class SimpleUserType_typeParamContext extends ParserRuleContext {
		public OptionalProjectionContext optionalProjection() {
			return getRuleContext(OptionalProjectionContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public SimpleUserType_typeParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleUserType_typeParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterSimpleUserType_typeParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitSimpleUserType_typeParam(this);
		}
	}

	public final SimpleUserType_typeParamContext simpleUserType_typeParam() throws RecognitionException {
		SimpleUserType_typeParamContext _localctx = new SimpleUserType_typeParamContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_simpleUserType_typeParam);
		try {
			setState(410);
			switch (_input.LA(1)) {
			case STAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(406); match(STAR);
				}
				break;
			case PACKAGE:
			case BRACE_OPEN:
			case OP_IN:
			case KEYWORD_dynamic:
			case GET:
			case SET:
			case ClassModifier_annotation:
			case ClassModifier_data:
			case VarianceAnnotation_out:
			case DOG:
			case AnnotationUseSiteTarget_file:
			case AnnotationUseSiteTarget_field:
			case KEYWORD_constructor:
			case SimpleName:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(407); optionalProjection();
				setState(408); type();
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

	public static class SimpleUserTypeContext extends ParserRuleContext {
		public KeywordOrSimpleNameContext keywordOrSimpleName() {
			return getRuleContext(KeywordOrSimpleNameContext.class,0);
		}
		public List<SimpleUserType_typeParamContext> simpleUserType_typeParam() {
			return getRuleContexts(SimpleUserType_typeParamContext.class);
		}
		public SimpleUserType_typeParamContext simpleUserType_typeParam(int i) {
			return getRuleContext(SimpleUserType_typeParamContext.class,i);
		}
		public SimpleUserTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleUserType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterSimpleUserType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitSimpleUserType(this);
		}
	}

	public final SimpleUserTypeContext simpleUserType() throws RecognitionException {
		SimpleUserTypeContext _localctx = new SimpleUserTypeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_simpleUserType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412); keywordOrSimpleName();
			setState(424);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(413); match(LT);
				setState(414); simpleUserType_typeParam();
				setState(419);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(415); match(COMMA);
					setState(416); simpleUserType_typeParam();
					}
					}
					setState(421);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(422); match(GT);
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

	public static class KeywordOrSimpleNameContext extends ParserRuleContext {
		public TerminalNode SimpleName() { return getToken(KotlinParser.SimpleName, 0); }
		public KeywordOrSimpleNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keywordOrSimpleName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterKeywordOrSimpleName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitKeywordOrSimpleName(this);
		}
	}

	public final KeywordOrSimpleNameContext keywordOrSimpleName() throws RecognitionException {
		KeywordOrSimpleNameContext _localctx = new KeywordOrSimpleNameContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_keywordOrSimpleName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(426);
			_la = _input.LA(1);
			if ( !(((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (GET - 67)) | (1L << (SET - 67)) | (1L << (ClassModifier_annotation - 67)) | (1L << (ClassModifier_data - 67)) | (1L << (AnnotationUseSiteTarget_file - 67)) | (1L << (AnnotationUseSiteTarget_field - 67)) | (1L << (KEYWORD_constructor - 67)) | (1L << (SimpleName - 67)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclarationEntryContext extends ParserRuleContext {
		public KeywordOrSimpleNameContext keywordOrSimpleName() {
			return getRuleContext(KeywordOrSimpleNameContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VariableDeclarationEntryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarationEntry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterVariableDeclarationEntry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitVariableDeclarationEntry(this);
		}
	}

	public final VariableDeclarationEntryContext variableDeclarationEntry() throws RecognitionException {
		VariableDeclarationEntryContext _localctx = new VariableDeclarationEntryContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_variableDeclarationEntry);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(428); keywordOrSimpleName();
			setState(431);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(429); match(COLON);
				setState(430); type();
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

	public static class FunctionType_paramOrTypeContext extends ParserRuleContext {
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
		public FunctionType_paramOrTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionType_paramOrType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterFunctionType_paramOrType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitFunctionType_paramOrType(this);
		}
	}

	public final FunctionType_paramOrTypeContext functionType_paramOrType() throws RecognitionException {
		FunctionType_paramOrTypeContext _localctx = new FunctionType_paramOrTypeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_functionType_paramOrType);
		try {
			setState(437);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(433); parameter();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(434); modifiers();
				setState(435); type();
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

	public static class ExtensionFunctionTypeNoReceiverContext extends ParserRuleContext {
		public FunctionTypeNoReceiverContext functionTypeNoReceiver() {
			return getRuleContext(FunctionTypeNoReceiverContext.class,0);
		}
		public ExtensionFunctionTypeNoReceiverContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extensionFunctionTypeNoReceiver; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterExtensionFunctionTypeNoReceiver(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitExtensionFunctionTypeNoReceiver(this);
		}
	}

	public final ExtensionFunctionTypeNoReceiverContext extensionFunctionTypeNoReceiver() throws RecognitionException {
		ExtensionFunctionTypeNoReceiverContext _localctx = new ExtensionFunctionTypeNoReceiverContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_extensionFunctionTypeNoReceiver);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(439); match(DOT);
			setState(440); functionTypeNoReceiver();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionTypeNoReceiverContext extends ParserRuleContext {
		public List<FunctionType_paramOrTypeContext> functionType_paramOrType() {
			return getRuleContexts(FunctionType_paramOrTypeContext.class);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FunctionType_paramOrTypeContext functionType_paramOrType(int i) {
			return getRuleContext(FunctionType_paramOrTypeContext.class,i);
		}
		public FunctionTypeNoReceiverContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionTypeNoReceiver; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterFunctionTypeNoReceiver(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitFunctionTypeNoReceiver(this);
		}
	}

	public final FunctionTypeNoReceiverContext functionTypeNoReceiver() throws RecognitionException {
		FunctionTypeNoReceiverContext _localctx = new FunctionTypeNoReceiverContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_functionTypeNoReceiver);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(442); match(BRACE_OPEN);
			setState(451);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PACKAGE) | (1L << BRACE_OPEN) | (1L << OP_IN))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (KEYWORD_dynamic - 65)) | (1L << (GET - 65)) | (1L << (SET - 65)) | (1L << (HierarchyModifier_abstract - 65)) | (1L << (HierarchyModifier_open - 65)) | (1L << (HierarchyModifier_final - 65)) | (1L << (HierarchyModifier_override - 65)) | (1L << (HierarchyModifier_lateinit - 65)) | (1L << (ClassModifier_enum - 65)) | (1L << (ClassModifier_annotation - 65)) | (1L << (ClassModifier_data - 65)) | (1L << (ClassModifier_inner - 65)) | (1L << (AccessModifier_private - 65)) | (1L << (AccessModifier_protected - 65)) | (1L << (AccessModifier_public - 65)) | (1L << (AccessModifier_internal - 65)) | (1L << (FunctionModifier_tailrec - 65)) | (1L << (FunctionModifier_operator - 65)) | (1L << (FunctionModifier_infix - 65)) | (1L << (FunctionModifier_inline - 65)) | (1L << (FunctionModifier_external - 65)) | (1L << (PropertyModifier_const - 65)) | (1L << (VarianceAnnotation_out - 65)) | (1L << (DOG - 65)) | (1L << (AnnotationUseSiteTarget_file - 65)) | (1L << (AnnotationUseSiteTarget_field - 65)) | (1L << (KEYWORD_constructor - 65)) | (1L << (SimpleName - 65)))) != 0)) {
				{
				setState(443); functionType_paramOrType();
				setState(448);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(444); match(COMMA);
					setState(445); functionType_paramOrType();
					}
					}
					setState(450);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(453); match(BRACE_CLOSE);
			setState(454); match(OP_ASTERISK);
			setState(455); type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultipleVariableDeclarationsContext extends ParserRuleContext {
		public List<VariableDeclarationEntryContext> variableDeclarationEntry() {
			return getRuleContexts(VariableDeclarationEntryContext.class);
		}
		public VariableDeclarationEntryContext variableDeclarationEntry(int i) {
			return getRuleContext(VariableDeclarationEntryContext.class,i);
		}
		public MultipleVariableDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multipleVariableDeclarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterMultipleVariableDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitMultipleVariableDeclarations(this);
		}
	}

	public final MultipleVariableDeclarationsContext multipleVariableDeclarations() throws RecognitionException {
		MultipleVariableDeclarationsContext _localctx = new MultipleVariableDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_multipleVariableDeclarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457); match(BRACE_OPEN);
			setState(458); variableDeclarationEntry();
			setState(463);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(459); match(COMMA);
				setState(460); variableDeclarationEntry();
				}
				}
				setState(465);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(466); match(BRACE_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertyDeclarationContext extends ParserRuleContext {
		public SetterContext setter() {
			return getRuleContext(SetterContext.class,0);
		}
		public MultipleVariableDeclarationsContext multipleVariableDeclarations() {
			return getRuleContext(MultipleVariableDeclarationsContext.class,0);
		}
		public VariableDeclarationEntryContext variableDeclarationEntry() {
			return getRuleContext(VariableDeclarationEntryContext.class,0);
		}
		public List<TerminalNode> SEMI() { return getTokens(KotlinParser.SEMI); }
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public TerminalNode SEMI(int i) {
			return getToken(KotlinParser.SEMI, i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public GetterContext getter() {
			return getRuleContext(GetterContext.class,0);
		}
		public TypeConstraintsContext typeConstraints() {
			return getRuleContext(TypeConstraintsContext.class,0);
		}
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
		public PropertyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterPropertyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitPropertyDeclaration(this);
		}
	}

	public final PropertyDeclarationContext propertyDeclaration() throws RecognitionException {
		PropertyDeclarationContext _localctx = new PropertyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_propertyDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(468); modifiers();
			setState(469);
			_la = _input.LA(1);
			if ( !(_la==KEYWORD_val || _la==KEYWORD_var) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(471);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(470); typeParameters();
				}
			}

			setState(476);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(473); type();
				setState(474); match(DOT);
				}
				break;
			}
			setState(480);
			switch (_input.LA(1)) {
			case BRACE_OPEN:
				{
				setState(478); multipleVariableDeclarations();
				}
				break;
			case GET:
			case SET:
			case ClassModifier_annotation:
			case ClassModifier_data:
			case AnnotationUseSiteTarget_file:
			case AnnotationUseSiteTarget_field:
			case KEYWORD_constructor:
			case SimpleName:
				{
				setState(479); variableDeclarationEntry();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(482); typeConstraints();
			setState(491);
			_la = _input.LA(1);
			if (_la==EQ || _la==KEYWORD_by) {
				{
				setState(483);
				_la = _input.LA(1);
				if ( !(_la==EQ || _la==KEYWORD_by) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(484); expression();
				setState(488);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(485); match(SEMI);
						}
						} 
					}
					setState(490);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
				}
				}
			}

			setState(505);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				{
				setState(494);
				switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
				case 1:
					{
					setState(493); getter();
					}
					break;
				}
				setState(497);
				switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
				case 1:
					{
					setState(496); setter();
					}
					break;
				}
				}
				}
				break;
			case 2:
				{
				{
				setState(500);
				switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
				case 1:
					{
					setState(499); setter();
					}
					break;
				}
				setState(503);
				switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
				case 1:
					{
					setState(502); getter();
					}
					break;
				}
				}
				}
				break;
			}
			setState(510);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(507); match(SEMI);
					}
					} 
				}
				setState(512);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
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

	public static class ModifiersContext extends ParserRuleContext {
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public ModifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterModifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitModifiers(this);
		}
	}

	public final ModifiersContext modifiers() throws RecognitionException {
		ModifiersContext _localctx = new ModifiersContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_modifiers);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(516);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(513); modifier();
					}
					} 
				}
				setState(518);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
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

	public static class ModifierContext extends ParserRuleContext {
		public ModifierKeywordContext modifierKeyword() {
			return getRuleContext(ModifierKeywordContext.class,0);
		}
		public ModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitModifier(this);
		}
	}

	public final ModifierContext modifier() throws RecognitionException {
		ModifierContext _localctx = new ModifierContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_modifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(519); modifierKeyword();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModifierKeywordContext extends ParserRuleContext {
		public PropertyModifierContext propertyModifier() {
			return getRuleContext(PropertyModifierContext.class,0);
		}
		public ClassModifierContext classModifier() {
			return getRuleContext(ClassModifierContext.class,0);
		}
		public FunctionModifierContext functionModifier() {
			return getRuleContext(FunctionModifierContext.class,0);
		}
		public AnnotationsContext annotations() {
			return getRuleContext(AnnotationsContext.class,0);
		}
		public HierarchyModifierContext hierarchyModifier() {
			return getRuleContext(HierarchyModifierContext.class,0);
		}
		public AccessModifierContext accessModifier() {
			return getRuleContext(AccessModifierContext.class,0);
		}
		public VarianceAnnotationContext varianceAnnotation() {
			return getRuleContext(VarianceAnnotationContext.class,0);
		}
		public ModifierKeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifierKeyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterModifierKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitModifierKeyword(this);
		}
	}

	public final ModifierKeywordContext modifierKeyword() throws RecognitionException {
		ModifierKeywordContext _localctx = new ModifierKeywordContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_modifierKeyword);
		try {
			setState(528);
			switch (_input.LA(1)) {
			case HierarchyModifier_abstract:
			case HierarchyModifier_open:
			case HierarchyModifier_final:
			case HierarchyModifier_override:
			case HierarchyModifier_lateinit:
				enterOuterAlt(_localctx, 1);
				{
				setState(521); hierarchyModifier();
				}
				break;
			case AccessModifier_private:
			case AccessModifier_protected:
			case AccessModifier_public:
			case AccessModifier_internal:
				enterOuterAlt(_localctx, 2);
				{
				setState(522); accessModifier();
				}
				break;
			case OP_IN:
			case VarianceAnnotation_out:
				enterOuterAlt(_localctx, 3);
				{
				setState(523); varianceAnnotation();
				}
				break;
			case DOG:
				enterOuterAlt(_localctx, 4);
				{
				setState(524); annotations();
				}
				break;
			case ClassModifier_enum:
			case ClassModifier_annotation:
			case ClassModifier_data:
			case ClassModifier_inner:
				enterOuterAlt(_localctx, 5);
				{
				setState(525); classModifier();
				}
				break;
			case FunctionModifier_tailrec:
			case FunctionModifier_operator:
			case FunctionModifier_infix:
			case FunctionModifier_inline:
			case FunctionModifier_external:
				enterOuterAlt(_localctx, 6);
				{
				setState(526); functionModifier();
				}
				break;
			case PropertyModifier_const:
				enterOuterAlt(_localctx, 7);
				{
				setState(527); propertyModifier();
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

	public static class PropertyModifierContext extends ParserRuleContext {
		public PropertyModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterPropertyModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitPropertyModifier(this);
		}
	}

	public final PropertyModifierContext propertyModifier() throws RecognitionException {
		PropertyModifierContext _localctx = new PropertyModifierContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_propertyModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(530); match(PropertyModifier_const);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionModifierContext extends ParserRuleContext {
		public FunctionModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterFunctionModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitFunctionModifier(this);
		}
	}

	public final FunctionModifierContext functionModifier() throws RecognitionException {
		FunctionModifierContext _localctx = new FunctionModifierContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_functionModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(532);
			_la = _input.LA(1);
			if ( !(((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & ((1L << (FunctionModifier_tailrec - 82)) | (1L << (FunctionModifier_operator - 82)) | (1L << (FunctionModifier_infix - 82)) | (1L << (FunctionModifier_inline - 82)) | (1L << (FunctionModifier_external - 82)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HierarchyModifierContext extends ParserRuleContext {
		public HierarchyModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hierarchyModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterHierarchyModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitHierarchyModifier(this);
		}
	}

	public final HierarchyModifierContext hierarchyModifier() throws RecognitionException {
		HierarchyModifierContext _localctx = new HierarchyModifierContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_hierarchyModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(534);
			_la = _input.LA(1);
			if ( !(((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (HierarchyModifier_abstract - 69)) | (1L << (HierarchyModifier_open - 69)) | (1L << (HierarchyModifier_final - 69)) | (1L << (HierarchyModifier_override - 69)) | (1L << (HierarchyModifier_lateinit - 69)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode Declaration_companion() { return getToken(KotlinParser.Declaration_companion, 0); }
		public TerminalNode ClassModifier_enum() { return getToken(KotlinParser.ClassModifier_enum, 0); }
		public TerminalNode IMPORT() { return getToken(KotlinParser.IMPORT, 0); }
		public TerminalNode Declaration_init() { return getToken(KotlinParser.Declaration_init, 0); }
		public KeywordOrSimpleNameContext keywordOrSimpleName() {
			return getRuleContext(KeywordOrSimpleNameContext.class,0);
		}
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitIdentifier(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_identifier);
		try {
			setState(541);
			switch (_input.LA(1)) {
			case GET:
			case SET:
			case ClassModifier_annotation:
			case ClassModifier_data:
			case AnnotationUseSiteTarget_file:
			case AnnotationUseSiteTarget_field:
			case KEYWORD_constructor:
			case SimpleName:
				enterOuterAlt(_localctx, 1);
				{
				setState(536); keywordOrSimpleName();
				}
				break;
			case ClassModifier_enum:
				enterOuterAlt(_localctx, 2);
				{
				setState(537); match(ClassModifier_enum);
				}
				break;
			case IMPORT:
				enterOuterAlt(_localctx, 3);
				{
				setState(538); match(IMPORT);
				}
				break;
			case Declaration_companion:
				enterOuterAlt(_localctx, 4);
				{
				setState(539); match(Declaration_companion);
				}
				break;
			case Declaration_init:
				enterOuterAlt(_localctx, 5);
				{
				setState(540); match(Declaration_init);
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

	public static class ClassModifierContext extends ParserRuleContext {
		public ClassModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterClassModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitClassModifier(this);
		}
	}

	public final ClassModifierContext classModifier() throws RecognitionException {
		ClassModifierContext _localctx = new ClassModifierContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_classModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(543);
			_la = _input.LA(1);
			if ( !(((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (ClassModifier_enum - 74)) | (1L << (ClassModifier_annotation - 74)) | (1L << (ClassModifier_data - 74)) | (1L << (ClassModifier_inner - 74)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
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
		public AccessModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterAccessModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitAccessModifier(this);
		}
	}

	public final AccessModifierContext accessModifier() throws RecognitionException {
		AccessModifierContext _localctx = new AccessModifierContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_accessModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(545);
			_la = _input.LA(1);
			if ( !(((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & ((1L << (AccessModifier_private - 78)) | (1L << (AccessModifier_protected - 78)) | (1L << (AccessModifier_public - 78)) | (1L << (AccessModifier_internal - 78)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarianceAnnotationContext extends ParserRuleContext {
		public VarianceAnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varianceAnnotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterVarianceAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitVarianceAnnotation(this);
		}
	}

	public final VarianceAnnotationContext varianceAnnotation() throws RecognitionException {
		VarianceAnnotationContext _localctx = new VarianceAnnotationContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_varianceAnnotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(547);
			_la = _input.LA(1);
			if ( !(_la==OP_IN || _la==VarianceAnnotation_out) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationsContext extends ParserRuleContext {
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public AnnotationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterAnnotations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitAnnotations(this);
		}
	}

	public final AnnotationsContext annotations() throws RecognitionException {
		AnnotationsContext _localctx = new AnnotationsContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_annotations);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(550); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(549); annotation();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(552); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
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

	public static class AnnotationContext extends ParserRuleContext {
		public UnescapedAnnotationContext unescapedAnnotation() {
			return getRuleContext(UnescapedAnnotationContext.class,0);
		}
		public AnnotationUseSiteTargetContext annotationUseSiteTarget() {
			return getRuleContext(AnnotationUseSiteTargetContext.class,0);
		}
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitAnnotation(this);
		}
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_annotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(554); match(DOG);
			setState(558);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				{
				setState(555); annotationUseSiteTarget();
				setState(556); match(COLON);
				}
				break;
			}
			setState(560); unescapedAnnotation();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationUseSiteTargetContext extends ParserRuleContext {
		public AnnotationUseSiteTargetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationUseSiteTarget; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterAnnotationUseSiteTarget(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitAnnotationUseSiteTarget(this);
		}
	}

	public final AnnotationUseSiteTargetContext annotationUseSiteTarget() throws RecognitionException {
		AnnotationUseSiteTargetContext _localctx = new AnnotationUseSiteTargetContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_annotationUseSiteTarget);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(562);
			_la = _input.LA(1);
			if ( !(((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (GET - 67)) | (1L << (SET - 67)) | (1L << (AnnotationUseSiteTarget_file - 67)) | (1L << (AnnotationUseSiteTarget_field - 67)) | (1L << (AnnotationUseSiteTarget_property - 67)) | (1L << (AnnotationUseSiteTarget_param - 67)) | (1L << (AnnotationUseSiteTarget_sparam - 67)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueArgumentContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ValueArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterValueArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitValueArgument(this);
		}
	}

	public final ValueArgumentContext valueArgument() throws RecognitionException {
		ValueArgumentContext _localctx = new ValueArgumentContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_valueArgument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(567);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				{
				setState(564); identifier();
				setState(565); match(EQ);
				}
				break;
			}
			setState(570);
			_la = _input.LA(1);
			if (_la==STAR) {
				{
				setState(569); match(STAR);
				}
			}

			setState(572); expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueArgumentsContext extends ParserRuleContext {
		public List<ValueArgumentContext> valueArgument() {
			return getRuleContexts(ValueArgumentContext.class);
		}
		public ValueArgumentContext valueArgument(int i) {
			return getRuleContext(ValueArgumentContext.class,i);
		}
		public ValueArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterValueArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitValueArguments(this);
		}
	}

	public final ValueArgumentsContext valueArguments() throws RecognitionException {
		ValueArgumentsContext _localctx = new ValueArgumentsContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_valueArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(574); match(BRACE_OPEN);
			setState(583);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LongLiteral) | (1L << IntegerLiteral) | (1L << OPEN_BLOCK) | (1L << HexadecimalLiteral) | (1L << CharacterLiteral) | (1L << TRIPLE_QUOTE) | (1L << SINGLE_QUOTE) | (1L << PACKAGE) | (1L << IMPORT) | (1L << STAR) | (1L << BRACE_OPEN) | (1L << REFERENCE) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << OP_PLUS) | (1L << OP_MUNUS) | (1L << OP_DECREMENT) | (1L << OP_INCREMENT) | (1L << OP_NOT))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (GET - 67)) | (1L << (SET - 67)) | (1L << (ClassModifier_enum - 67)) | (1L << (ClassModifier_annotation - 67)) | (1L << (ClassModifier_data - 67)) | (1L << (DOG - 67)) | (1L << (AnnotationUseSiteTarget_file - 67)) | (1L << (AnnotationUseSiteTarget_field - 67)) | (1L << (Jump_throw - 67)) | (1L << (Jump_continue - 67)) | (1L << (Jump_return - 67)) | (1L << (Jump_break - 67)) | (1L << (KEYWORD_constructor - 67)) | (1L << (ConstructorDelegationCall_this - 67)) | (1L << (ConstructorDelegationCall_super - 67)) | (1L << (Declaration_object - 67)) | (1L << (Declaration_companion - 67)) | (1L << (Declaration_init - 67)) | (1L << (CF_if - 67)) | (1L << (CF_when - 67)) | (1L << (CF_while - 67)) | (1L << (CF_for - 67)) | (1L << (CF_do - 67)) | (1L << (CF_try - 67)) | (1L << (BAX - 67)) | (1L << (SimpleName - 67)))) != 0)) {
				{
				setState(575); valueArgument();
				setState(580);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(576); match(COMMA);
					setState(577); valueArgument();
					}
					}
					setState(582);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(585); match(BRACE_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnescapedAnnotationContext extends ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ValueArgumentsContext valueArguments() {
			return getRuleContext(ValueArgumentsContext.class,0);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public UnescapedAnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unescapedAnnotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterUnescapedAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitUnescapedAnnotation(this);
		}
	}

	public final UnescapedAnnotationContext unescapedAnnotation() throws RecognitionException {
		UnescapedAnnotationContext _localctx = new UnescapedAnnotationContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_unescapedAnnotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(587); identifier();
			setState(592);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(588); match(DOT);
				setState(589); identifier();
				}
				}
				setState(594);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(596);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(595); typeArguments();
				}
			}

			setState(599);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				{
				setState(598); valueArguments();
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

	public static class JumpContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LabelReferenceContext labelReference() {
			return getRuleContext(LabelReferenceContext.class,0);
		}
		public JumpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jump; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterJump(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitJump(this);
		}
	}

	public final JumpContext jump() throws RecognitionException {
		JumpContext _localctx = new JumpContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_jump);
		try {
			setState(618);
			switch (_input.LA(1)) {
			case Jump_throw:
				enterOuterAlt(_localctx, 1);
				{
				setState(601); match(Jump_throw);
				setState(602); expression();
				}
				break;
			case Jump_return:
				enterOuterAlt(_localctx, 2);
				{
				setState(603); match(Jump_return);
				setState(605);
				switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
				case 1:
					{
					setState(604); labelReference();
					}
					break;
				}
				setState(608);
				switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
				case 1:
					{
					setState(607); expression();
					}
					break;
				}
				}
				break;
			case Jump_continue:
				enterOuterAlt(_localctx, 3);
				{
				setState(610); match(Jump_continue);
				setState(612);
				switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
				case 1:
					{
					setState(611); labelReference();
					}
					break;
				}
				}
				break;
			case Jump_break:
				enterOuterAlt(_localctx, 4);
				{
				setState(614); match(Jump_break);
				setState(616);
				switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
				case 1:
					{
					setState(615); labelReference();
					}
					break;
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

	public static class LabelReferenceContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public LabelReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labelReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterLabelReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitLabelReference(this);
		}
	}

	public final LabelReferenceContext labelReference() throws RecognitionException {
		LabelReferenceContext _localctx = new LabelReferenceContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_labelReference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(620); match(DOG);
			setState(625);
			switch (_input.LA(1)) {
			case IMPORT:
			case GET:
			case SET:
			case ClassModifier_enum:
			case ClassModifier_annotation:
			case ClassModifier_data:
			case AnnotationUseSiteTarget_file:
			case AnnotationUseSiteTarget_field:
			case KEYWORD_constructor:
			case Declaration_companion:
			case Declaration_init:
			case SimpleName:
				{
				setState(621); identifier();
				}
				break;
			case CF_for:
				{
				setState(622); match(CF_for);
				}
				break;
			case CF_while:
				{
				setState(623); match(CF_while);
				}
				break;
			case CF_when:
				{
				setState(624); match(CF_when);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class LabelDefinitionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public LabelDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labelDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterLabelDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitLabelDefinition(this);
		}
	}

	public final LabelDefinitionContext labelDefinition() throws RecognitionException {
		LabelDefinitionContext _localctx = new LabelDefinitionContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_labelDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(627); identifier();
			setState(628); match(DOG);
			}
		}
		catch (RecognitionException re) {
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
		public KeywordOrSimpleNameContext keywordOrSimpleName() {
			return getRuleContext(KeywordOrSimpleNameContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitParameter(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(630); keywordOrSimpleName();
			setState(631); match(COLON);
			setState(632); type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionParameterContext extends ParserRuleContext {
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
		public FunctionParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterFunctionParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitFunctionParameter(this);
		}
	}

	public final FunctionParameterContext functionParameter() throws RecognitionException {
		FunctionParameterContext _localctx = new FunctionParameterContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_functionParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(634); modifiers();
			setState(636);
			_la = _input.LA(1);
			if (_la==KEYWORD_vararg) {
				{
				setState(635); match(KEYWORD_vararg);
				}
			}

			setState(639);
			_la = _input.LA(1);
			if (_la==KEYWORD_val || _la==KEYWORD_var) {
				{
				setState(638);
				_la = _input.LA(1);
				if ( !(_la==KEYWORD_val || _la==KEYWORD_var) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(641); parameter();
			setState(644);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(642); match(EQ);
				setState(643); expression();
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

	public static class PrimaryConstructorContext extends ParserRuleContext {
		public FunctionParameterContext functionParameter(int i) {
			return getRuleContext(FunctionParameterContext.class,i);
		}
		public List<FunctionParameterContext> functionParameter() {
			return getRuleContexts(FunctionParameterContext.class);
		}
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
		public PrimaryConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryConstructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterPrimaryConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitPrimaryConstructor(this);
		}
	}

	public final PrimaryConstructorContext primaryConstructor() throws RecognitionException {
		PrimaryConstructorContext _localctx = new PrimaryConstructorContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_primaryConstructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(649);
			_la = _input.LA(1);
			if (((((_la - 45)) & ~0x3f) == 0 && ((1L << (_la - 45)) & ((1L << (OP_IN - 45)) | (1L << (HierarchyModifier_abstract - 45)) | (1L << (HierarchyModifier_open - 45)) | (1L << (HierarchyModifier_final - 45)) | (1L << (HierarchyModifier_override - 45)) | (1L << (HierarchyModifier_lateinit - 45)) | (1L << (ClassModifier_enum - 45)) | (1L << (ClassModifier_annotation - 45)) | (1L << (ClassModifier_data - 45)) | (1L << (ClassModifier_inner - 45)) | (1L << (AccessModifier_private - 45)) | (1L << (AccessModifier_protected - 45)) | (1L << (AccessModifier_public - 45)) | (1L << (AccessModifier_internal - 45)) | (1L << (FunctionModifier_tailrec - 45)) | (1L << (FunctionModifier_operator - 45)) | (1L << (FunctionModifier_infix - 45)) | (1L << (FunctionModifier_inline - 45)) | (1L << (FunctionModifier_external - 45)) | (1L << (PropertyModifier_const - 45)) | (1L << (VarianceAnnotation_out - 45)) | (1L << (DOG - 45)) | (1L << (KEYWORD_constructor - 45)))) != 0)) {
				{
				setState(646); modifiers();
				setState(647); match(KEYWORD_constructor);
				}
			}

			{
			setState(651); match(BRACE_OPEN);
			setState(660);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OP_IN) | (1L << KEYWORD_val) | (1L << KEYWORD_var) | (1L << KEYWORD_vararg))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (GET - 67)) | (1L << (SET - 67)) | (1L << (HierarchyModifier_abstract - 67)) | (1L << (HierarchyModifier_open - 67)) | (1L << (HierarchyModifier_final - 67)) | (1L << (HierarchyModifier_override - 67)) | (1L << (HierarchyModifier_lateinit - 67)) | (1L << (ClassModifier_enum - 67)) | (1L << (ClassModifier_annotation - 67)) | (1L << (ClassModifier_data - 67)) | (1L << (ClassModifier_inner - 67)) | (1L << (AccessModifier_private - 67)) | (1L << (AccessModifier_protected - 67)) | (1L << (AccessModifier_public - 67)) | (1L << (AccessModifier_internal - 67)) | (1L << (FunctionModifier_tailrec - 67)) | (1L << (FunctionModifier_operator - 67)) | (1L << (FunctionModifier_infix - 67)) | (1L << (FunctionModifier_inline - 67)) | (1L << (FunctionModifier_external - 67)) | (1L << (PropertyModifier_const - 67)) | (1L << (VarianceAnnotation_out - 67)) | (1L << (DOG - 67)) | (1L << (AnnotationUseSiteTarget_file - 67)) | (1L << (AnnotationUseSiteTarget_field - 67)) | (1L << (KEYWORD_constructor - 67)) | (1L << (SimpleName - 67)))) != 0)) {
				{
				setState(652); functionParameter();
				setState(657);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(653); match(COMMA);
					setState(654); functionParameter();
					}
					}
					setState(659);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(662); match(BRACE_CLOSE);
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

	public static class SecondaryConstructorContext extends ParserRuleContext {
		public List<TerminalNode> SEMI() { return getTokens(KotlinParser.SEMI); }
		public ValueParametersContext valueParameters() {
			return getRuleContext(ValueParametersContext.class,0);
		}
		public TerminalNode SEMI(int i) {
			return getToken(KotlinParser.SEMI, i);
		}
		public ConstructorDelegationCallContext constructorDelegationCall() {
			return getRuleContext(ConstructorDelegationCallContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
		public SecondaryConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_secondaryConstructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterSecondaryConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitSecondaryConstructor(this);
		}
	}

	public final SecondaryConstructorContext secondaryConstructor() throws RecognitionException {
		SecondaryConstructorContext _localctx = new SecondaryConstructorContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_secondaryConstructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(664); modifiers();
			setState(665); match(KEYWORD_constructor);
			setState(666); valueParameters();
			setState(669);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(667); match(COLON);
				setState(668); constructorDelegationCall();
				}
			}

			setState(671); block();
			setState(675);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(672); match(SEMI);
				}
				}
				setState(677);
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

	public static class ConstructorDelegationCallContext extends ParserRuleContext {
		public ValueArgumentsContext valueArguments() {
			return getRuleContext(ValueArgumentsContext.class,0);
		}
		public ConstructorDelegationCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDelegationCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterConstructorDelegationCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitConstructorDelegationCall(this);
		}
	}

	public final ConstructorDelegationCallContext constructorDelegationCall() throws RecognitionException {
		ConstructorDelegationCallContext _localctx = new ConstructorDelegationCallContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_constructorDelegationCall);
		try {
			setState(682);
			switch (_input.LA(1)) {
			case ConstructorDelegationCall_this:
				enterOuterAlt(_localctx, 1);
				{
				setState(678); match(ConstructorDelegationCall_this);
				setState(679); valueArguments();
				}
				break;
			case ConstructorDelegationCall_super:
				enterOuterAlt(_localctx, 2);
				{
				setState(680); match(ConstructorDelegationCall_super);
				setState(681); valueArguments();
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

	public static class CallSuffixContext extends ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ValueArgumentsContext valueArguments() {
			return getRuleContext(ValueArgumentsContext.class,0);
		}
		public AnnotatedLambdaContext annotatedLambda() {
			return getRuleContext(AnnotatedLambdaContext.class,0);
		}
		public CallSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterCallSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitCallSuffix(this);
		}
	}

	public final CallSuffixContext callSuffix() throws RecognitionException {
		CallSuffixContext _localctx = new CallSuffixContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_callSuffix);
		int _la;
		try {
			setState(695);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(685);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(684); typeArguments();
					}
				}

				setState(687); valueArguments();
				setState(689);
				switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
				case 1:
					{
					setState(688); annotatedLambda();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(691); typeArguments();
				setState(692); annotatedLambda();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(694); annotatedLambda();
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

	public static class ConstructorInvocationContext extends ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ValueArgumentsContext valueArguments() {
			return getRuleContext(ValueArgumentsContext.class,0);
		}
		public UserTypeContext userType() {
			return getRuleContext(UserTypeContext.class,0);
		}
		public ConstructorInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorInvocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterConstructorInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitConstructorInvocation(this);
		}
	}

	public final ConstructorInvocationContext constructorInvocation() throws RecognitionException {
		ConstructorInvocationContext _localctx = new ConstructorInvocationContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_constructorInvocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(697); userType();
			setState(699);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(698); typeArguments();
				}
			}

			setState(701); valueArguments();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExplicitDelegationContext extends ParserRuleContext {
		public UserTypeContext userType() {
			return getRuleContext(UserTypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExplicitDelegationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitDelegation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterExplicitDelegation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitExplicitDelegation(this);
		}
	}

	public final ExplicitDelegationContext explicitDelegation() throws RecognitionException {
		ExplicitDelegationContext _localctx = new ExplicitDelegationContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_explicitDelegation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(703); userType();
			setState(704); match(KEYWORD_by);
			setState(705); expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DelegationSpecifierContext extends ParserRuleContext {
		public ConstructorInvocationContext constructorInvocation() {
			return getRuleContext(ConstructorInvocationContext.class,0);
		}
		public ExplicitDelegationContext explicitDelegation() {
			return getRuleContext(ExplicitDelegationContext.class,0);
		}
		public UserTypeContext userType() {
			return getRuleContext(UserTypeContext.class,0);
		}
		public DelegationSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delegationSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterDelegationSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitDelegationSpecifier(this);
		}
	}

	public final DelegationSpecifierContext delegationSpecifier() throws RecognitionException {
		DelegationSpecifierContext _localctx = new DelegationSpecifierContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_delegationSpecifier);
		try {
			setState(710);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(707); constructorInvocation();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(708); userType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(709); explicitDelegation();
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

	public static class ClassDeclarationContext extends ParserRuleContext {
		public List<DelegationSpecifierContext> delegationSpecifier() {
			return getRuleContexts(DelegationSpecifierContext.class);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public PrimaryConstructorContext primaryConstructor() {
			return getRuleContext(PrimaryConstructorContext.class,0);
		}
		public TerminalNode SEMI(int i) {
			return getToken(KotlinParser.SEMI, i);
		}
		public AnnotationsContext annotations() {
			return getRuleContext(AnnotationsContext.class,0);
		}
		public TypeConstraintsContext typeConstraints() {
			return getRuleContext(TypeConstraintsContext.class,0);
		}
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
		public ClassOrInterfaceContext classOrInterface() {
			return getRuleContext(ClassOrInterfaceContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public EnumClassBodyContext enumClassBody() {
			return getRuleContext(EnumClassBodyContext.class,0);
		}
		public List<TerminalNode> SEMI() { return getTokens(KotlinParser.SEMI); }
		public KeywordOrSimpleNameContext keywordOrSimpleName() {
			return getRuleContext(KeywordOrSimpleNameContext.class,0);
		}
		public DelegationSpecifierContext delegationSpecifier(int i) {
			return getRuleContext(DelegationSpecifierContext.class,i);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitClassDeclaration(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_classDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(712); modifiers();
			setState(713); classOrInterface();
			setState(714); keywordOrSimpleName();
			setState(716);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(715); typeParameters();
				}
			}

			setState(719);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				{
				setState(718); primaryConstructor();
				}
				break;
			}
			setState(733);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(721); match(COLON);
				setState(723);
				_la = _input.LA(1);
				if (_la==DOG) {
					{
					setState(722); annotations();
					}
				}

				setState(725); delegationSpecifier();
				setState(730);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(726); match(COMMA);
					setState(727); delegationSpecifier();
					}
					}
					setState(732);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(735); typeConstraints();
			setState(738);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				{
				setState(736); classBody();
				}
				break;
			case 2:
				{
				setState(737); enumClassBody();
				}
				break;
			}
			setState(743);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(740); match(SEMI);
					}
					} 
				}
				setState(745);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
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

	public static class ClassOrInterfaceContext extends ParserRuleContext {
		public ClassOrInterfaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterface; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterClassOrInterface(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitClassOrInterface(this);
		}
	}

	public final ClassOrInterfaceContext classOrInterface() throws RecognitionException {
		ClassOrInterfaceContext _localctx = new ClassOrInterfaceContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_classOrInterface);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(746);
			_la = _input.LA(1);
			if ( !(_la==Declaration_class || _la==Declaration_interface) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SupertypesSpecifiersContext extends ParserRuleContext {
		public List<DelegationSpecifierContext> delegationSpecifier() {
			return getRuleContexts(DelegationSpecifierContext.class);
		}
		public DelegationSpecifierContext delegationSpecifier(int i) {
			return getRuleContext(DelegationSpecifierContext.class,i);
		}
		public SupertypesSpecifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_supertypesSpecifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterSupertypesSpecifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitSupertypesSpecifiers(this);
		}
	}

	public final SupertypesSpecifiersContext supertypesSpecifiers() throws RecognitionException {
		SupertypesSpecifiersContext _localctx = new SupertypesSpecifiersContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_supertypesSpecifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(748); match(COLON);
			setState(749); delegationSpecifier();
			setState(754);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(750); match(COMMA);
				setState(751); delegationSpecifier();
				}
				}
				setState(756);
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

	public static class ObjectDeclarationContext extends ParserRuleContext {
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public List<TerminalNode> SEMI() { return getTokens(KotlinParser.SEMI); }
		public PrimaryConstructorContext primaryConstructor() {
			return getRuleContext(PrimaryConstructorContext.class,0);
		}
		public TerminalNode SEMI(int i) {
			return getToken(KotlinParser.SEMI, i);
		}
		public KeywordOrSimpleNameContext keywordOrSimpleName() {
			return getRuleContext(KeywordOrSimpleNameContext.class,0);
		}
		public SupertypesSpecifiersContext supertypesSpecifiers() {
			return getRuleContext(SupertypesSpecifiersContext.class,0);
		}
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
		public ObjectDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterObjectDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitObjectDeclaration(this);
		}
	}

	public final ObjectDeclarationContext objectDeclaration() throws RecognitionException {
		ObjectDeclarationContext _localctx = new ObjectDeclarationContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_objectDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(757); modifiers();
			setState(758); match(Declaration_object);
			setState(759); keywordOrSimpleName();
			setState(761);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				{
				setState(760); primaryConstructor();
				}
				break;
			}
			setState(764);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(763); supertypesSpecifiers();
				}
			}

			setState(766); classBody();
			setState(770);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(767); match(SEMI);
					}
					} 
				}
				setState(772);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
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

	public static class CompanionObjectContext extends ParserRuleContext {
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public List<TerminalNode> SEMI() { return getTokens(KotlinParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(KotlinParser.SEMI, i);
		}
		public SupertypesSpecifiersContext supertypesSpecifiers() {
			return getRuleContext(SupertypesSpecifiersContext.class,0);
		}
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
		public CompanionObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_companionObject; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterCompanionObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitCompanionObject(this);
		}
	}

	public final CompanionObjectContext companionObject() throws RecognitionException {
		CompanionObjectContext _localctx = new CompanionObjectContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_companionObject);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(773); modifiers();
			setState(774); match(Declaration_companion);
			setState(775); match(Declaration_object);
			setState(777);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(776); supertypesSpecifiers();
				}
			}

			setState(779); classBody();
			setState(783);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(780); match(SEMI);
				}
				}
				setState(785);
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

	public static class ClassBodyContext extends ParserRuleContext {
		public MembersContext members() {
			return getRuleContext(MembersContext.class,0);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitClassBody(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_classBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(790);
			switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
			case 1:
				{
				setState(786); match(OPEN_BLOCK);
				setState(787); members();
				setState(788); match(CLOSE_BLOCK);
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

	public static class MembersContext extends ParserRuleContext {
		public List<MemberDeclarationContext> memberDeclaration() {
			return getRuleContexts(MemberDeclarationContext.class);
		}
		public MemberDeclarationContext memberDeclaration(int i) {
			return getRuleContext(MemberDeclarationContext.class,i);
		}
		public MembersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_members; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterMembers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitMembers(this);
		}
	}

	public final MembersContext members() throws RecognitionException {
		MembersContext _localctx = new MembersContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_members);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(795);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 45)) & ~0x3f) == 0 && ((1L << (_la - 45)) & ((1L << (OP_IN - 45)) | (1L << (KEYWORD_val - 45)) | (1L << (KEYWORD_var - 45)) | (1L << (HierarchyModifier_abstract - 45)) | (1L << (HierarchyModifier_open - 45)) | (1L << (HierarchyModifier_final - 45)) | (1L << (HierarchyModifier_override - 45)) | (1L << (HierarchyModifier_lateinit - 45)) | (1L << (ClassModifier_enum - 45)) | (1L << (ClassModifier_annotation - 45)) | (1L << (ClassModifier_data - 45)) | (1L << (ClassModifier_inner - 45)) | (1L << (AccessModifier_private - 45)) | (1L << (AccessModifier_protected - 45)) | (1L << (AccessModifier_public - 45)) | (1L << (AccessModifier_internal - 45)) | (1L << (FunctionModifier_tailrec - 45)) | (1L << (FunctionModifier_operator - 45)) | (1L << (FunctionModifier_infix - 45)) | (1L << (FunctionModifier_inline - 45)) | (1L << (FunctionModifier_external - 45)) | (1L << (PropertyModifier_const - 45)) | (1L << (VarianceAnnotation_out - 45)) | (1L << (DOG - 45)) | (1L << (KEYWORD_constructor - 45)) | (1L << (Declaration_class - 45)) | (1L << (Declaration_interface - 45)) | (1L << (Declaration_object - 45)) | (1L << (Declaration_companion - 45)) | (1L << (Declaration_fun - 45)) | (1L << (Declaration_init - 45)))) != 0)) {
				{
				{
				setState(792); memberDeclaration();
				}
				}
				setState(797);
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

	public static class ValueParametersContext extends ParserRuleContext {
		public FunctionParameterContext functionParameter(int i) {
			return getRuleContext(FunctionParameterContext.class,i);
		}
		public List<FunctionParameterContext> functionParameter() {
			return getRuleContexts(FunctionParameterContext.class);
		}
		public ValueParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterValueParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitValueParameters(this);
		}
	}

	public final ValueParametersContext valueParameters() throws RecognitionException {
		ValueParametersContext _localctx = new ValueParametersContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_valueParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(798); match(BRACE_OPEN);
			setState(807);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OP_IN) | (1L << KEYWORD_val) | (1L << KEYWORD_var) | (1L << KEYWORD_vararg))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (GET - 67)) | (1L << (SET - 67)) | (1L << (HierarchyModifier_abstract - 67)) | (1L << (HierarchyModifier_open - 67)) | (1L << (HierarchyModifier_final - 67)) | (1L << (HierarchyModifier_override - 67)) | (1L << (HierarchyModifier_lateinit - 67)) | (1L << (ClassModifier_enum - 67)) | (1L << (ClassModifier_annotation - 67)) | (1L << (ClassModifier_data - 67)) | (1L << (ClassModifier_inner - 67)) | (1L << (AccessModifier_private - 67)) | (1L << (AccessModifier_protected - 67)) | (1L << (AccessModifier_public - 67)) | (1L << (AccessModifier_internal - 67)) | (1L << (FunctionModifier_tailrec - 67)) | (1L << (FunctionModifier_operator - 67)) | (1L << (FunctionModifier_infix - 67)) | (1L << (FunctionModifier_inline - 67)) | (1L << (FunctionModifier_external - 67)) | (1L << (PropertyModifier_const - 67)) | (1L << (VarianceAnnotation_out - 67)) | (1L << (DOG - 67)) | (1L << (AnnotationUseSiteTarget_file - 67)) | (1L << (AnnotationUseSiteTarget_field - 67)) | (1L << (KEYWORD_constructor - 67)) | (1L << (SimpleName - 67)))) != 0)) {
				{
				setState(799); functionParameter();
				setState(804);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(800); match(COMMA);
					setState(801); functionParameter();
					}
					}
					setState(806);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(809); match(BRACE_CLOSE);
			}
		}
		catch (RecognitionException re) {
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
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(KotlinParser.SEMI); }
		public ValueParametersContext valueParameters() {
			return getRuleContext(ValueParametersContext.class,0);
		}
		public List<TypeParametersContext> typeParameters() {
			return getRuleContexts(TypeParametersContext.class);
		}
		public TerminalNode SEMI(int i) {
			return getToken(KotlinParser.SEMI, i);
		}
		public KeywordOrSimpleNameContext keywordOrSimpleName() {
			return getRuleContext(KeywordOrSimpleNameContext.class,0);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public AnnotationsContext annotations() {
			return getRuleContext(AnnotationsContext.class,0);
		}
		public TypeConstraintsContext typeConstraints() {
			return getRuleContext(TypeConstraintsContext.class,0);
		}
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
		public TypeParametersContext typeParameters(int i) {
			return getRuleContext(TypeParametersContext.class,i);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitFunctionDeclaration(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_functionDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(811); modifiers();
			setState(812); match(Declaration_fun);
			setState(814);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(813); typeParameters();
				}
			}

			setState(820);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				{
				setState(816); type();
				setState(817); match(DOT);
				}
				break;
			case 2:
				{
				setState(819); annotations();
				}
				break;
			}
			setState(822); keywordOrSimpleName();
			setState(824);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(823); typeParameters();
				}
			}

			setState(826); valueParameters();
			setState(829);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(827); match(COLON);
				setState(828); type();
				}
			}

			setState(831); typeConstraints();
			setState(833);
			switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
			case 1:
				{
				setState(832); functionBody();
				}
				break;
			}
			setState(838);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(835); match(SEMI);
					}
					} 
				}
				setState(840);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
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

	public static class StatementsContext extends ParserRuleContext {
		public List<TerminalNode> SEMI() { return getTokens(KotlinParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(KotlinParser.SEMI, i);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitStatements(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_statements);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(844);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,106,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(841); match(SEMI);
					}
					} 
				}
				setState(846);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,106,_ctx);
			}
			setState(860);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LongLiteral) | (1L << IntegerLiteral) | (1L << OPEN_BLOCK) | (1L << HexadecimalLiteral) | (1L << CharacterLiteral) | (1L << TRIPLE_QUOTE) | (1L << SINGLE_QUOTE) | (1L << PACKAGE) | (1L << IMPORT) | (1L << BRACE_OPEN) | (1L << REFERENCE) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << OP_PLUS) | (1L << OP_MUNUS) | (1L << OP_IN) | (1L << OP_DECREMENT) | (1L << OP_INCREMENT) | (1L << OP_NOT) | (1L << KEYWORD_val) | (1L << KEYWORD_var))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (GET - 67)) | (1L << (SET - 67)) | (1L << (HierarchyModifier_abstract - 67)) | (1L << (HierarchyModifier_open - 67)) | (1L << (HierarchyModifier_final - 67)) | (1L << (HierarchyModifier_override - 67)) | (1L << (HierarchyModifier_lateinit - 67)) | (1L << (ClassModifier_enum - 67)) | (1L << (ClassModifier_annotation - 67)) | (1L << (ClassModifier_data - 67)) | (1L << (ClassModifier_inner - 67)) | (1L << (AccessModifier_private - 67)) | (1L << (AccessModifier_protected - 67)) | (1L << (AccessModifier_public - 67)) | (1L << (AccessModifier_internal - 67)) | (1L << (FunctionModifier_tailrec - 67)) | (1L << (FunctionModifier_operator - 67)) | (1L << (FunctionModifier_infix - 67)) | (1L << (FunctionModifier_inline - 67)) | (1L << (FunctionModifier_external - 67)) | (1L << (PropertyModifier_const - 67)) | (1L << (VarianceAnnotation_out - 67)) | (1L << (DOG - 67)) | (1L << (AnnotationUseSiteTarget_file - 67)) | (1L << (AnnotationUseSiteTarget_field - 67)) | (1L << (Jump_throw - 67)) | (1L << (Jump_continue - 67)) | (1L << (Jump_return - 67)) | (1L << (Jump_break - 67)) | (1L << (KEYWORD_constructor - 67)) | (1L << (ConstructorDelegationCall_this - 67)) | (1L << (ConstructorDelegationCall_super - 67)) | (1L << (Declaration_class - 67)) | (1L << (Declaration_interface - 67)) | (1L << (Declaration_object - 67)) | (1L << (Declaration_companion - 67)) | (1L << (Declaration_fun - 67)) | (1L << (Declaration_init - 67)) | (1L << (CF_if - 67)) | (1L << (CF_when - 67)) | (1L << (CF_while - 67)) | (1L << (CF_for - 67)) | (1L << (CF_do - 67)) | (1L << (CF_try - 67)) | (1L << (BAX - 67)) | (1L << (SimpleName - 67)))) != 0)) {
				{
				setState(847); statement();
				setState(857);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,108,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(851);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==SEMI) {
							{
							{
							setState(848); match(SEMI);
							}
							}
							setState(853);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(854); statement();
						}
						} 
					}
					setState(859);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,108,_ctx);
				}
				}
			}

			setState(865);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(862); match(SEMI);
				}
				}
				setState(867);
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

	public static class FunctionBodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterFunctionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitFunctionBody(this);
		}
	}

	public final FunctionBodyContext functionBody() throws RecognitionException {
		FunctionBodyContext _localctx = new FunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_functionBody);
		try {
			setState(871);
			switch (_input.LA(1)) {
			case OPEN_BLOCK:
				enterOuterAlt(_localctx, 1);
				{
				setState(868); block();
				}
				break;
			case EQ:
				enterOuterAlt(_localctx, 2);
				{
				setState(869); match(EQ);
				setState(870); expression();
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

	public static class BlockContext extends ParserRuleContext {
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(873); match(OPEN_BLOCK);
			setState(874); statements();
			setState(875); match(CLOSE_BLOCK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnonymousInitializerContext extends ParserRuleContext {
		public List<TerminalNode> SEMI() { return getTokens(KotlinParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(KotlinParser.SEMI, i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public AnonymousInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anonymousInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterAnonymousInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitAnonymousInitializer(this);
		}
	}

	public final AnonymousInitializerContext anonymousInitializer() throws RecognitionException {
		AnonymousInitializerContext _localctx = new AnonymousInitializerContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_anonymousInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(877); match(Declaration_init);
			setState(878); block();
			setState(882);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(879); match(SEMI);
				}
				}
				setState(884);
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

	public static class EnumClassBodyContext extends ParserRuleContext {
		public EnumEntriesContext enumEntries() {
			return getRuleContext(EnumEntriesContext.class,0);
		}
		public MembersContext members() {
			return getRuleContext(MembersContext.class,0);
		}
		public EnumClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumClassBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterEnumClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitEnumClassBody(this);
		}
	}

	public final EnumClassBodyContext enumClassBody() throws RecognitionException {
		EnumClassBodyContext _localctx = new EnumClassBodyContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_enumClassBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(885); match(OPEN_BLOCK);
			setState(886); enumEntries();
			setState(889);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(887); match(SEMI);
				setState(888); members();
				}
			}

			setState(891); match(CLOSE_BLOCK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumEntriesContext extends ParserRuleContext {
		public EnumEntryContext enumEntry(int i) {
			return getRuleContext(EnumEntryContext.class,i);
		}
		public List<EnumEntryContext> enumEntry() {
			return getRuleContexts(EnumEntryContext.class);
		}
		public EnumEntriesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumEntries; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterEnumEntries(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitEnumEntries(this);
		}
	}

	public final EnumEntriesContext enumEntries() throws RecognitionException {
		EnumEntriesContext _localctx = new EnumEntriesContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_enumEntries);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(899);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_IN || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (GET - 67)) | (1L << (SET - 67)) | (1L << (HierarchyModifier_abstract - 67)) | (1L << (HierarchyModifier_open - 67)) | (1L << (HierarchyModifier_final - 67)) | (1L << (HierarchyModifier_override - 67)) | (1L << (HierarchyModifier_lateinit - 67)) | (1L << (ClassModifier_enum - 67)) | (1L << (ClassModifier_annotation - 67)) | (1L << (ClassModifier_data - 67)) | (1L << (ClassModifier_inner - 67)) | (1L << (AccessModifier_private - 67)) | (1L << (AccessModifier_protected - 67)) | (1L << (AccessModifier_public - 67)) | (1L << (AccessModifier_internal - 67)) | (1L << (FunctionModifier_tailrec - 67)) | (1L << (FunctionModifier_operator - 67)) | (1L << (FunctionModifier_infix - 67)) | (1L << (FunctionModifier_inline - 67)) | (1L << (FunctionModifier_external - 67)) | (1L << (PropertyModifier_const - 67)) | (1L << (VarianceAnnotation_out - 67)) | (1L << (DOG - 67)) | (1L << (AnnotationUseSiteTarget_file - 67)) | (1L << (AnnotationUseSiteTarget_field - 67)) | (1L << (KEYWORD_constructor - 67)) | (1L << (SimpleName - 67)))) != 0)) {
				{
				{
				setState(893); enumEntry();
				setState(895);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(894); match(COMMA);
					}
				}

				}
				}
				setState(901);
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

	public static class EnumEntryContext extends ParserRuleContext {
		public ValueArgumentsContext valueArguments() {
			return getRuleContext(ValueArgumentsContext.class,0);
		}
		public ConstructorInvocationContext constructorInvocation() {
			return getRuleContext(ConstructorInvocationContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public KeywordOrSimpleNameContext keywordOrSimpleName() {
			return getRuleContext(KeywordOrSimpleNameContext.class,0);
		}
		public AnnotationsContext annotations() {
			return getRuleContext(AnnotationsContext.class,0);
		}
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
		public EnumEntryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumEntry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterEnumEntry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitEnumEntry(this);
		}
	}

	public final EnumEntryContext enumEntry() throws RecognitionException {
		EnumEntryContext _localctx = new EnumEntryContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_enumEntry);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(902); modifiers();
			setState(903); keywordOrSimpleName();
			setState(910);
			switch (_input.LA(1)) {
			case COLON:
				{
				{
				setState(904); match(COLON);
				setState(906);
				_la = _input.LA(1);
				if (_la==DOG) {
					{
					setState(905); annotations();
					}
				}

				setState(908); constructorInvocation();
				}
				}
				break;
			case BRACE_OPEN:
				{
				setState(909); valueArguments();
				}
				break;
			case SEMI:
			case OPEN_BLOCK:
			case CLOSE_BLOCK:
			case COMMA:
			case OP_IN:
			case GET:
			case SET:
			case HierarchyModifier_abstract:
			case HierarchyModifier_open:
			case HierarchyModifier_final:
			case HierarchyModifier_override:
			case HierarchyModifier_lateinit:
			case ClassModifier_enum:
			case ClassModifier_annotation:
			case ClassModifier_data:
			case ClassModifier_inner:
			case AccessModifier_private:
			case AccessModifier_protected:
			case AccessModifier_public:
			case AccessModifier_internal:
			case FunctionModifier_tailrec:
			case FunctionModifier_operator:
			case FunctionModifier_infix:
			case FunctionModifier_inline:
			case FunctionModifier_external:
			case PropertyModifier_const:
			case VarianceAnnotation_out:
			case DOG:
			case AnnotationUseSiteTarget_file:
			case AnnotationUseSiteTarget_field:
			case KEYWORD_constructor:
			case SimpleName:
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(912); classBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfExpressionContext extends ParserRuleContext {
		public List<TerminalNode> SEMI() { return getTokens(KotlinParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(KotlinParser.SEMI, i);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public IfExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterIfExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitIfExpression(this);
		}
	}

	public final IfExpressionContext ifExpression() throws RecognitionException {
		IfExpressionContext _localctx = new IfExpressionContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_ifExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(914); match(CF_if);
			setState(915); match(BRACE_OPEN);
			setState(916); expression();
			setState(917); match(BRACE_CLOSE);
			setState(918); expression();
			setState(922);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,118,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(919); match(SEMI);
					}
					} 
				}
				setState(924);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,118,_ctx);
			}
			setState(927);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				{
				setState(925); match(CF_else);
				setState(926); expression();
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

	public static class TryExpressionContext extends ParserRuleContext {
		public CatchBlockContext catchBlock(int i) {
			return getRuleContext(CatchBlockContext.class,i);
		}
		public FinallyBlockContext finallyBlock() {
			return getRuleContext(FinallyBlockContext.class,0);
		}
		public List<CatchBlockContext> catchBlock() {
			return getRuleContexts(CatchBlockContext.class);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterTryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitTryExpression(this);
		}
	}

	public final TryExpressionContext tryExpression() throws RecognitionException {
		TryExpressionContext _localctx = new TryExpressionContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_tryExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(929); match(CF_try);
			setState(930); block();
			setState(934);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CF_catch) {
				{
				{
				setState(931); catchBlock();
				}
				}
				setState(936);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(938);
			_la = _input.LA(1);
			if (_la==CF_FINALLY) {
				{
				setState(937); finallyBlock();
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

	public static class CatchBlockContext extends ParserRuleContext {
		public KeywordOrSimpleNameContext keywordOrSimpleName() {
			return getRuleContext(KeywordOrSimpleNameContext.class,0);
		}
		public AnnotationsContext annotations() {
			return getRuleContext(AnnotationsContext.class,0);
		}
		public UserTypeContext userType() {
			return getRuleContext(UserTypeContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CatchBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterCatchBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitCatchBlock(this);
		}
	}

	public final CatchBlockContext catchBlock() throws RecognitionException {
		CatchBlockContext _localctx = new CatchBlockContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_catchBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(940); match(CF_catch);
			setState(941); match(BRACE_OPEN);
			setState(943);
			_la = _input.LA(1);
			if (_la==DOG) {
				{
				setState(942); annotations();
				}
			}

			setState(945); keywordOrSimpleName();
			setState(946); match(COLON);
			setState(947); userType();
			setState(948); match(BRACE_CLOSE);
			setState(949); block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FinallyBlockContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FinallyBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finallyBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterFinallyBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitFinallyBlock(this);
		}
	}

	public final FinallyBlockContext finallyBlock() throws RecognitionException {
		FinallyBlockContext _localctx = new FinallyBlockContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_finallyBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(951); match(CF_FINALLY);
			setState(952); block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LoopContext extends ParserRuleContext {
		public ForLoopContext forLoop() {
			return getRuleContext(ForLoopContext.class,0);
		}
		public WhileLoopContext whileLoop() {
			return getRuleContext(WhileLoopContext.class,0);
		}
		public DoWhileLoopContext doWhileLoop() {
			return getRuleContext(DoWhileLoopContext.class,0);
		}
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitLoop(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_loop);
		try {
			setState(957);
			switch (_input.LA(1)) {
			case CF_for:
				enterOuterAlt(_localctx, 1);
				{
				setState(954); forLoop();
				}
				break;
			case CF_while:
				enterOuterAlt(_localctx, 2);
				{
				setState(955); whileLoop();
				}
				break;
			case CF_do:
				enterOuterAlt(_localctx, 3);
				{
				setState(956); doWhileLoop();
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

	public static class ForLoopContext extends ParserRuleContext {
		public MultipleVariableDeclarationsContext multipleVariableDeclarations() {
			return getRuleContext(MultipleVariableDeclarationsContext.class,0);
		}
		public VariableDeclarationEntryContext variableDeclarationEntry() {
			return getRuleContext(VariableDeclarationEntryContext.class,0);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AnnotationsContext annotations() {
			return getRuleContext(AnnotationsContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ForLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterForLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitForLoop(this);
		}
	}

	public final ForLoopContext forLoop() throws RecognitionException {
		ForLoopContext _localctx = new ForLoopContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_forLoop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(959); match(CF_for);
			setState(960); match(BRACE_OPEN);
			setState(962);
			_la = _input.LA(1);
			if (_la==DOG) {
				{
				setState(961); annotations();
				}
			}

			setState(966);
			switch (_input.LA(1)) {
			case BRACE_OPEN:
				{
				setState(964); multipleVariableDeclarations();
				}
				break;
			case GET:
			case SET:
			case ClassModifier_annotation:
			case ClassModifier_data:
			case AnnotationUseSiteTarget_file:
			case AnnotationUseSiteTarget_field:
			case KEYWORD_constructor:
			case SimpleName:
				{
				setState(965); variableDeclarationEntry();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(968); match(OP_IN);
			setState(969); expression();
			setState(970); match(BRACE_CLOSE);
			setState(971); expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileLoopContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public WhileLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterWhileLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitWhileLoop(this);
		}
	}

	public final WhileLoopContext whileLoop() throws RecognitionException {
		WhileLoopContext _localctx = new WhileLoopContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_whileLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(973); match(CF_while);
			setState(974); match(BRACE_OPEN);
			setState(975); expression();
			setState(976); match(BRACE_CLOSE);
			setState(977); expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DoWhileLoopContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public DoWhileLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doWhileLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterDoWhileLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitDoWhileLoop(this);
		}
	}

	public final DoWhileLoopContext doWhileLoop() throws RecognitionException {
		DoWhileLoopContext _localctx = new DoWhileLoopContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_doWhileLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(979); match(CF_do);
			setState(980); expression();
			setState(981); match(CF_while);
			setState(982); match(BRACE_OPEN);
			setState(983); expression();
			setState(984); match(BRACE_CLOSE);
			}
		}
		catch (RecognitionException re) {
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
		public DisjunctionContext disjunction(int i) {
			return getRuleContext(DisjunctionContext.class,i);
		}
		public AssignmentOperatorContext assignmentOperator(int i) {
			return getRuleContext(AssignmentOperatorContext.class,i);
		}
		public List<AssignmentOperatorContext> assignmentOperator() {
			return getRuleContexts(AssignmentOperatorContext.class);
		}
		public List<DisjunctionContext> disjunction() {
			return getRuleContexts(DisjunctionContext.class);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(986); disjunction();
			setState(992);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,126,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(987); assignmentOperator();
					setState(988); disjunction();
					}
					} 
				}
				setState(994);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,126,_ctx);
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

	public static class DisjunctionContext extends ParserRuleContext {
		public List<ConjunctionContext> conjunction() {
			return getRuleContexts(ConjunctionContext.class);
		}
		public ConjunctionContext conjunction(int i) {
			return getRuleContext(ConjunctionContext.class,i);
		}
		public DisjunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_disjunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterDisjunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitDisjunction(this);
		}
	}

	public final DisjunctionContext disjunction() throws RecognitionException {
		DisjunctionContext _localctx = new DisjunctionContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_disjunction);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(995); conjunction();
			setState(1000);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,127,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(996); match(DISJ);
					setState(997); conjunction();
					}
					} 
				}
				setState(1002);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,127,_ctx);
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

	public static class ConjunctionContext extends ParserRuleContext {
		public List<EqualityComparisonContext> equalityComparison() {
			return getRuleContexts(EqualityComparisonContext.class);
		}
		public EqualityComparisonContext equalityComparison(int i) {
			return getRuleContext(EqualityComparisonContext.class,i);
		}
		public ConjunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conjunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterConjunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitConjunction(this);
		}
	}

	public final ConjunctionContext conjunction() throws RecognitionException {
		ConjunctionContext _localctx = new ConjunctionContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_conjunction);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1003); equalityComparison();
			setState(1008);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,128,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1004); match(CONJ);
					setState(1005); equalityComparison();
					}
					} 
				}
				setState(1010);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,128,_ctx);
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

	public static class EqualityComparisonContext extends ParserRuleContext {
		public List<EqualityOperationContext> equalityOperation() {
			return getRuleContexts(EqualityOperationContext.class);
		}
		public EqualityOperationContext equalityOperation(int i) {
			return getRuleContext(EqualityOperationContext.class,i);
		}
		public List<ComparisonContext> comparison() {
			return getRuleContexts(ComparisonContext.class);
		}
		public ComparisonContext comparison(int i) {
			return getRuleContext(ComparisonContext.class,i);
		}
		public EqualityComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityComparison; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterEqualityComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitEqualityComparison(this);
		}
	}

	public final EqualityComparisonContext equalityComparison() throws RecognitionException {
		EqualityComparisonContext _localctx = new EqualityComparisonContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_equalityComparison);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1011); comparison();
			setState(1017);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,129,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1012); equalityOperation();
					setState(1013); comparison();
					}
					} 
				}
				setState(1019);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,129,_ctx);
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

	public static class ComparisonContext extends ParserRuleContext {
		public List<NamedInfixContext> namedInfix() {
			return getRuleContexts(NamedInfixContext.class);
		}
		public NamedInfixContext namedInfix(int i) {
			return getRuleContext(NamedInfixContext.class,i);
		}
		public ComparisonOperationContext comparisonOperation(int i) {
			return getRuleContext(ComparisonOperationContext.class,i);
		}
		public List<ComparisonOperationContext> comparisonOperation() {
			return getRuleContexts(ComparisonOperationContext.class);
		}
		public ComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitComparison(this);
		}
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_comparison);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1020); namedInfix();
			setState(1026);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,130,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1021); comparisonOperation();
					setState(1022); namedInfix();
					}
					} 
				}
				setState(1028);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,130,_ctx);
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

	public static class NamedInfixContext extends ParserRuleContext {
		public List<InOperationContext> inOperation() {
			return getRuleContexts(InOperationContext.class);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ElvisExpressionContext elvisExpression(int i) {
			return getRuleContext(ElvisExpressionContext.class,i);
		}
		public InOperationContext inOperation(int i) {
			return getRuleContext(InOperationContext.class,i);
		}
		public PrefixUnaryExpressionContext prefixUnaryExpression() {
			return getRuleContext(PrefixUnaryExpressionContext.class,0);
		}
		public List<ElvisExpressionContext> elvisExpression() {
			return getRuleContexts(ElvisExpressionContext.class);
		}
		public IsOperationContext isOperation() {
			return getRuleContext(IsOperationContext.class,0);
		}
		public NamedInfixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedInfix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterNamedInfix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitNamedInfix(this);
		}
	}

	public final NamedInfixContext namedInfix() throws RecognitionException {
		NamedInfixContext _localctx = new NamedInfixContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_namedInfix);
		try {
			int _alt;
			setState(1047);
			switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1029); elvisExpression();
				setState(1035);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,131,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1030); inOperation();
						setState(1031); elvisExpression();
						}
						} 
					}
					setState(1037);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,131,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1038); elvisExpression();
				setState(1039); prefixUnaryExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1041); elvisExpression();
				setState(1045);
				switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
				case 1:
					{
					setState(1042); isOperation();
					setState(1043); type();
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

	public static class ElvisExpressionContext extends ParserRuleContext {
		public InfixFunctionCallContext infixFunctionCall(int i) {
			return getRuleContext(InfixFunctionCallContext.class,i);
		}
		public List<InfixFunctionCallContext> infixFunctionCall() {
			return getRuleContexts(InfixFunctionCallContext.class);
		}
		public ElvisExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elvisExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterElvisExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitElvisExpression(this);
		}
	}

	public final ElvisExpressionContext elvisExpression() throws RecognitionException {
		ElvisExpressionContext _localctx = new ElvisExpressionContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_elvisExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1049); infixFunctionCall();
			setState(1054);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,134,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1050); match(ELVIS);
					setState(1051); infixFunctionCall();
					}
					} 
				}
				setState(1056);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,134,_ctx);
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

	public static class InfixFunctionCallContext extends ParserRuleContext {
		public RangeExpressionContext rangeExpression(int i) {
			return getRuleContext(RangeExpressionContext.class,i);
		}
		public KeywordOrSimpleNameContext keywordOrSimpleName(int i) {
			return getRuleContext(KeywordOrSimpleNameContext.class,i);
		}
		public List<RangeExpressionContext> rangeExpression() {
			return getRuleContexts(RangeExpressionContext.class);
		}
		public List<KeywordOrSimpleNameContext> keywordOrSimpleName() {
			return getRuleContexts(KeywordOrSimpleNameContext.class);
		}
		public InfixFunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_infixFunctionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterInfixFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitInfixFunctionCall(this);
		}
	}

	public final InfixFunctionCallContext infixFunctionCall() throws RecognitionException {
		InfixFunctionCallContext _localctx = new InfixFunctionCallContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_infixFunctionCall);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1057); rangeExpression();
			setState(1063);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,135,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1058); keywordOrSimpleName();
					setState(1059); rangeExpression();
					}
					} 
				}
				setState(1065);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,135,_ctx);
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

	public static class RangeExpressionContext extends ParserRuleContext {
		public AdditiveExpressionContext additiveExpression(int i) {
			return getRuleContext(AdditiveExpressionContext.class,i);
		}
		public List<AdditiveExpressionContext> additiveExpression() {
			return getRuleContexts(AdditiveExpressionContext.class);
		}
		public RangeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterRangeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitRangeExpression(this);
		}
	}

	public final RangeExpressionContext rangeExpression() throws RecognitionException {
		RangeExpressionContext _localctx = new RangeExpressionContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_rangeExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1066); additiveExpression();
			setState(1071);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,136,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1067); match(RANGE);
					setState(1068); additiveExpression();
					}
					} 
				}
				setState(1073);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,136,_ctx);
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

	public static class AdditiveExpressionContext extends ParserRuleContext {
		public AdditiveOperationContext additiveOperation(int i) {
			return getRuleContext(AdditiveOperationContext.class,i);
		}
		public List<AdditiveOperationContext> additiveOperation() {
			return getRuleContexts(AdditiveOperationContext.class);
		}
		public List<MultiplicativeExpressionContext> multiplicativeExpression() {
			return getRuleContexts(MultiplicativeExpressionContext.class);
		}
		public MultiplicativeExpressionContext multiplicativeExpression(int i) {
			return getRuleContext(MultiplicativeExpressionContext.class,i);
		}
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitAdditiveExpression(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_additiveExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1074); multiplicativeExpression();
			setState(1080);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,137,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1075); additiveOperation();
					setState(1076); multiplicativeExpression();
					}
					} 
				}
				setState(1082);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,137,_ctx);
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

	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public List<MultiplicativeOperationContext> multiplicativeOperation() {
			return getRuleContexts(MultiplicativeOperationContext.class);
		}
		public TypeRHSContext typeRHS(int i) {
			return getRuleContext(TypeRHSContext.class,i);
		}
		public MultiplicativeOperationContext multiplicativeOperation(int i) {
			return getRuleContext(MultiplicativeOperationContext.class,i);
		}
		public List<TypeRHSContext> typeRHS() {
			return getRuleContexts(TypeRHSContext.class);
		}
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitMultiplicativeExpression(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_multiplicativeExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1083); typeRHS();
			setState(1089);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,138,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1084); multiplicativeOperation();
					setState(1085); typeRHS();
					}
					} 
				}
				setState(1091);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,138,_ctx);
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

	public static class TypeRHSContext extends ParserRuleContext {
		public List<TypeOperationContext> typeOperation() {
			return getRuleContexts(TypeOperationContext.class);
		}
		public TypeOperationContext typeOperation(int i) {
			return getRuleContext(TypeOperationContext.class,i);
		}
		public PrefixUnaryExpressionContext prefixUnaryExpression(int i) {
			return getRuleContext(PrefixUnaryExpressionContext.class,i);
		}
		public List<PrefixUnaryExpressionContext> prefixUnaryExpression() {
			return getRuleContexts(PrefixUnaryExpressionContext.class);
		}
		public TypeRHSContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeRHS; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterTypeRHS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitTypeRHS(this);
		}
	}

	public final TypeRHSContext typeRHS() throws RecognitionException {
		TypeRHSContext _localctx = new TypeRHSContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_typeRHS);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1092); prefixUnaryExpression();
			setState(1098);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,139,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1093); typeOperation();
					setState(1094); prefixUnaryExpression();
					}
					} 
				}
				setState(1100);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,139,_ctx);
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

	public static class PrefixUnaryExpressionContext extends ParserRuleContext {
		public PrefixUnaryOperationContext prefixUnaryOperation(int i) {
			return getRuleContext(PrefixUnaryOperationContext.class,i);
		}
		public PostfixUnaryExpressionContext postfixUnaryExpression() {
			return getRuleContext(PostfixUnaryExpressionContext.class,0);
		}
		public List<PrefixUnaryOperationContext> prefixUnaryOperation() {
			return getRuleContexts(PrefixUnaryOperationContext.class);
		}
		public PrefixUnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefixUnaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterPrefixUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitPrefixUnaryExpression(this);
		}
	}

	public final PrefixUnaryExpressionContext prefixUnaryExpression() throws RecognitionException {
		PrefixUnaryExpressionContext _localctx = new PrefixUnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_prefixUnaryExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1104);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,140,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1101); prefixUnaryOperation();
					}
					} 
				}
				setState(1106);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,140,_ctx);
			}
			setState(1107); postfixUnaryExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostfixUnaryExpressionContext extends ParserRuleContext {
		public CallableReferenceContext callableReference() {
			return getRuleContext(CallableReferenceContext.class,0);
		}
		public AtomicExpressionContext atomicExpression() {
			return getRuleContext(AtomicExpressionContext.class,0);
		}
		public CallSuffixContext callSuffix() {
			return getRuleContext(CallSuffixContext.class,0);
		}
		public List<PostfixUnaryOperationContext> postfixUnaryOperation() {
			return getRuleContexts(PostfixUnaryOperationContext.class);
		}
		public PostfixUnaryOperationContext postfixUnaryOperation(int i) {
			return getRuleContext(PostfixUnaryOperationContext.class,i);
		}
		public PostfixUnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixUnaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterPostfixUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitPostfixUnaryExpression(this);
		}
	}

	public final PostfixUnaryExpressionContext postfixUnaryExpression() throws RecognitionException {
		PostfixUnaryExpressionContext _localctx = new PostfixUnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_postfixUnaryExpression);
		try {
			int _alt;
			setState(1126);
			switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1109); atomicExpression();
				setState(1110); callSuffix();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1112); atomicExpression();
				setState(1116);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,141,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1113); postfixUnaryOperation();
						}
						} 
					}
					setState(1118);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,141,_ctx);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1119); callableReference();
				setState(1123);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,142,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1120); postfixUnaryOperation();
						}
						} 
					}
					setState(1125);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,142,_ctx);
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

	public static class CallableReferenceContext extends ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public UserTypeContext userType() {
			return getRuleContext(UserTypeContext.class,0);
		}
		public CallableReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callableReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterCallableReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitCallableReference(this);
		}
	}

	public final CallableReferenceContext callableReference() throws RecognitionException {
		CallableReferenceContext _localctx = new CallableReferenceContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_callableReference);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1135);
			_la = _input.LA(1);
			if (_la==PACKAGE || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (GET - 67)) | (1L << (SET - 67)) | (1L << (ClassModifier_annotation - 67)) | (1L << (ClassModifier_data - 67)) | (1L << (AnnotationUseSiteTarget_file - 67)) | (1L << (AnnotationUseSiteTarget_field - 67)) | (1L << (KEYWORD_constructor - 67)) | (1L << (SimpleName - 67)))) != 0)) {
				{
				setState(1128); userType();
				setState(1132);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Q) {
					{
					{
					setState(1129); match(Q);
					}
					}
					setState(1134);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1137); match(REFERENCE);
			setState(1140);
			switch (_input.LA(1)) {
			case IMPORT:
			case GET:
			case SET:
			case ClassModifier_enum:
			case ClassModifier_annotation:
			case ClassModifier_data:
			case AnnotationUseSiteTarget_file:
			case AnnotationUseSiteTarget_field:
			case KEYWORD_constructor:
			case Declaration_companion:
			case Declaration_init:
			case SimpleName:
				{
				setState(1138); identifier();
				}
				break;
			case Declaration_class:
				{
				setState(1139); match(Declaration_class);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1143);
			switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
			case 1:
				{
				setState(1142); typeArguments();
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

	public static class GetterContext extends ParserRuleContext {
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
		public GetterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterGetter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitGetter(this);
		}
	}

	public final GetterContext getter() throws RecognitionException {
		GetterContext _localctx = new GetterContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_getter);
		int _la;
		try {
			setState(1158);
			switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1145); modifiers();
				setState(1146); match(GET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1148); modifiers();
				setState(1149); match(GET);
				setState(1150); match(BRACE_OPEN);
				setState(1151); match(BRACE_CLOSE);
				setState(1154);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(1152); match(COLON);
					setState(1153); type();
					}
				}

				setState(1156); functionBody();
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

	public static class SetterContext extends ParserRuleContext {
		public ModifiersContext modifiers(int i) {
			return getRuleContext(ModifiersContext.class,i);
		}
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
		}
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public TerminalNode SimpleName() { return getToken(KotlinParser.SimpleName, 0); }
		public List<ModifiersContext> modifiers() {
			return getRuleContexts(ModifiersContext.class);
		}
		public SetterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterSetter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitSetter(this);
		}
	}

	public final SetterContext setter() throws RecognitionException {
		SetterContext _localctx = new SetterContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_setter);
		try {
			setState(1174);
			switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1160); modifiers();
				setState(1161); match(SET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1163); modifiers();
				setState(1164); match(SET);
				setState(1165); match(BRACE_OPEN);
				setState(1166); modifiers();
				setState(1169);
				switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
				case 1:
					{
					setState(1167); match(SimpleName);
					}
					break;
				case 2:
					{
					setState(1168); parameter();
					}
					break;
				}
				setState(1171); match(BRACE_CLOSE);
				setState(1172); functionBody();
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

	public static class StringLiteralContext extends ParserRuleContext {
		public List<TerminalNode> SINLE_QUOTE_EXPRESSION_START() { return getTokens(KotlinParser.SINLE_QUOTE_EXPRESSION_START); }
		public TerminalNode SINLE_QUOTE_ESCAPED_CHAR(int i) {
			return getToken(KotlinParser.SINLE_QUOTE_ESCAPED_CHAR, i);
		}
		public List<TerminalNode> CLOSE_BLOCK() { return getTokens(KotlinParser.CLOSE_BLOCK); }
		public TerminalNode MULTILINE_QUOTE_CLOSE(int i) {
			return getToken(KotlinParser.MULTILINE_QUOTE_CLOSE, i);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> MULTILINE_QUOTE_REF() { return getTokens(KotlinParser.MULTILINE_QUOTE_REF); }
		public TerminalNode TRIPLE_QUOTE() { return getToken(KotlinParser.TRIPLE_QUOTE, 0); }
		public TerminalNode SINGLE_QUOTE_REF(int i) {
			return getToken(KotlinParser.SINGLE_QUOTE_REF, i);
		}
		public List<TerminalNode> MULTILINE_QUOTE_CLOSE() { return getTokens(KotlinParser.MULTILINE_QUOTE_CLOSE); }
		public TerminalNode SINLE_QUOTE_EXPRESSION_START(int i) {
			return getToken(KotlinParser.SINLE_QUOTE_EXPRESSION_START, i);
		}
		public List<TerminalNode> MULTILINE_QUOTE_EXPRESSION_START() { return getTokens(KotlinParser.MULTILINE_QUOTE_EXPRESSION_START); }
		public TerminalNode MULTILINE_QUOTE_REF(int i) {
			return getToken(KotlinParser.MULTILINE_QUOTE_REF, i);
		}
		public TerminalNode CLOSE_BLOCK(int i) {
			return getToken(KotlinParser.CLOSE_BLOCK, i);
		}
		public TerminalNode MULTILINE_QUOTE_EXPRESSION_START(int i) {
			return getToken(KotlinParser.MULTILINE_QUOTE_EXPRESSION_START, i);
		}
		public TerminalNode SINLE_QUOTE_CLOSE(int i) {
			return getToken(KotlinParser.SINLE_QUOTE_CLOSE, i);
		}
		public List<TerminalNode> SINLE_QUOTE_CLOSE() { return getTokens(KotlinParser.SINLE_QUOTE_CLOSE); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public List<TerminalNode> SINLE_QUOTE_ESCAPED_CHAR() { return getTokens(KotlinParser.SINLE_QUOTE_ESCAPED_CHAR); }
		public List<TerminalNode> SINGLE_QUOTE_REF() { return getTokens(KotlinParser.SINGLE_QUOTE_REF); }
		public TerminalNode SINGLE_QUOTE() { return getToken(KotlinParser.SINGLE_QUOTE, 0); }
		public StringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitStringLiteral(this);
		}
	}

	public final StringLiteralContext stringLiteral() throws RecognitionException {
		StringLiteralContext _localctx = new StringLiteralContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_stringLiteral);
		int _la;
		try {
			setState(1203);
			switch (_input.LA(1)) {
			case SINGLE_QUOTE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1176); match(SINGLE_QUOTE);
				setState(1186);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULTILINE_COMMENT) | (1L << SINGLELINE_COMMENT) | (1L << WHITESPACE) | (1L << LongLiteral) | (1L << IntegerLiteral) | (1L << SEMI) | (1L << OPEN_BLOCK) | (1L << CLOSE_BLOCK) | (1L << HexadecimalLiteral) | (1L << CharacterLiteral) | (1L << TRIPLE_QUOTE) | (1L << SINGLE_QUOTE) | (1L << PACKAGE) | (1L << IMPORT) | (1L << DOT) | (1L << STAR) | (1L << COMMA) | (1L << LT) | (1L << LTE) | (1L << GT) | (1L << GTE) | (1L << EQ) | (1L << EQ_EQ) | (1L << EQ_EQ_EQ) | (1L << NEQ_EQ_EQ) | (1L << NEQ) | (1L << COLON) | (1L << BRACE_OPEN) | (1L << BRACE_CLOSE) | (1L << Q) | (1L << DISJ) | (1L << CONJ) | (1L << ELVIS) | (1L << LONG_RANGE) | (1L << RANGE) | (1L << REFERENCE) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << OP_ASTERISK) | (1L << OP_DIV) | (1L << OP_MOD) | (1L << OP_PLUS) | (1L << OP_MUNUS) | (1L << OP_IN) | (1L << OP_NOT_IN) | (1L << OP_AS) | (1L << OP_AS_SAFE) | (1L << OP_PLUS_ASSIGN) | (1L << OP_MINUS_ASSIGN) | (1L << OP_MULT_ASSIGN) | (1L << OP_DIV_ASSIGN) | (1L << OP_MOD_ASSIGN) | (1L << OP_DECREMENT) | (1L << OP_INCREMENT) | (1L << OP_IS) | (1L << OP_NULL_ASSERT) | (1L << OP_NOT) | (1L << SQ_OPEN) | (1L << SQ_CLOSE) | (1L << KEYWORD_val) | (1L << KEYWORD_var) | (1L << KEYWORD_vararg))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (KEYWORD_by - 64)) | (1L << (KEYWORD_dynamic - 64)) | (1L << (KEYWORD_where - 64)) | (1L << (GET - 64)) | (1L << (SET - 64)) | (1L << (HierarchyModifier_abstract - 64)) | (1L << (HierarchyModifier_open - 64)) | (1L << (HierarchyModifier_final - 64)) | (1L << (HierarchyModifier_override - 64)) | (1L << (HierarchyModifier_lateinit - 64)) | (1L << (ClassModifier_enum - 64)) | (1L << (ClassModifier_annotation - 64)) | (1L << (ClassModifier_data - 64)) | (1L << (ClassModifier_inner - 64)) | (1L << (AccessModifier_private - 64)) | (1L << (AccessModifier_protected - 64)) | (1L << (AccessModifier_public - 64)) | (1L << (AccessModifier_internal - 64)) | (1L << (FunctionModifier_tailrec - 64)) | (1L << (FunctionModifier_operator - 64)) | (1L << (FunctionModifier_infix - 64)) | (1L << (FunctionModifier_inline - 64)) | (1L << (FunctionModifier_external - 64)) | (1L << (PropertyModifier_const - 64)) | (1L << (VarianceAnnotation_out - 64)) | (1L << (DOG - 64)) | (1L << (AnnotationUseSiteTarget_file - 64)) | (1L << (AnnotationUseSiteTarget_field - 64)) | (1L << (AnnotationUseSiteTarget_property - 64)) | (1L << (AnnotationUseSiteTarget_param - 64)) | (1L << (AnnotationUseSiteTarget_sparam - 64)) | (1L << (Jump_throw - 64)) | (1L << (Jump_continue - 64)) | (1L << (Jump_return - 64)) | (1L << (Jump_break - 64)) | (1L << (KEYWORD_constructor - 64)) | (1L << (ConstructorDelegationCall_this - 64)) | (1L << (ConstructorDelegationCall_super - 64)) | (1L << (Declaration_class - 64)) | (1L << (Declaration_interface - 64)) | (1L << (Declaration_object - 64)) | (1L << (Declaration_companion - 64)) | (1L << (Declaration_fun - 64)) | (1L << (Declaration_init - 64)) | (1L << (CF_if - 64)) | (1L << (CF_else - 64)) | (1L << (CF_when - 64)) | (1L << (CF_while - 64)) | (1L << (CF_for - 64)) | (1L << (CF_do - 64)) | (1L << (CF_try - 64)) | (1L << (CF_catch - 64)) | (1L << (CF_FINALLY - 64)) | (1L << (BAX - 64)) | (1L << (SimpleName - 64)) | (1L << (OP_NOT_IS - 64)) | (1L << (SINLE_QUOTE_WHITESPACE - 64)) | (1L << (SINGLE_TEXT - 64)) | (1L << (SINLE_QUOTE_ESCAPED_CHAR - 64)) | (1L << (SINLE_QUOTE_EXPRESSION_START - 64)) | (1L << (SINGLE_QUOTE_REF - 64)) | (1L << (MULTILINE_QUOTE_TEXT - 64)) | (1L << (MULTILINE_QUOTE_CLOSE - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (MULTILINE_QUOTES - 128)) | (1L << (MULTILINE_QUOTE_EXPRESSION_START - 128)) | (1L << (MULTILINE_QUOTE_REF - 128)))) != 0)) {
					{
					setState(1184);
					switch ( getInterpreter().adaptivePredict(_input,152,_ctx) ) {
					case 1:
						{
						setState(1177); match(SINLE_QUOTE_ESCAPED_CHAR);
						}
						break;
					case 2:
						{
						setState(1178); match(SINLE_QUOTE_EXPRESSION_START);
						setState(1179); expression();
						setState(1180); match(CLOSE_BLOCK);
						}
						break;
					case 3:
						{
						setState(1182); match(SINGLE_QUOTE_REF);
						}
						break;
					case 4:
						{
						setState(1183);
						_la = _input.LA(1);
						if ( _la <= 0 || (_la==SINLE_QUOTE_CLOSE) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						}
						break;
					}
					}
					setState(1188);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1189); match(SINLE_QUOTE_CLOSE);
				}
				break;
			case TRIPLE_QUOTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1190); match(TRIPLE_QUOTE);
				setState(1199);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULTILINE_COMMENT) | (1L << SINGLELINE_COMMENT) | (1L << WHITESPACE) | (1L << LongLiteral) | (1L << IntegerLiteral) | (1L << SEMI) | (1L << OPEN_BLOCK) | (1L << CLOSE_BLOCK) | (1L << HexadecimalLiteral) | (1L << CharacterLiteral) | (1L << TRIPLE_QUOTE) | (1L << SINGLE_QUOTE) | (1L << PACKAGE) | (1L << IMPORT) | (1L << DOT) | (1L << STAR) | (1L << COMMA) | (1L << LT) | (1L << LTE) | (1L << GT) | (1L << GTE) | (1L << EQ) | (1L << EQ_EQ) | (1L << EQ_EQ_EQ) | (1L << NEQ_EQ_EQ) | (1L << NEQ) | (1L << COLON) | (1L << BRACE_OPEN) | (1L << BRACE_CLOSE) | (1L << Q) | (1L << DISJ) | (1L << CONJ) | (1L << ELVIS) | (1L << LONG_RANGE) | (1L << RANGE) | (1L << REFERENCE) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << OP_ASTERISK) | (1L << OP_DIV) | (1L << OP_MOD) | (1L << OP_PLUS) | (1L << OP_MUNUS) | (1L << OP_IN) | (1L << OP_NOT_IN) | (1L << OP_AS) | (1L << OP_AS_SAFE) | (1L << OP_PLUS_ASSIGN) | (1L << OP_MINUS_ASSIGN) | (1L << OP_MULT_ASSIGN) | (1L << OP_DIV_ASSIGN) | (1L << OP_MOD_ASSIGN) | (1L << OP_DECREMENT) | (1L << OP_INCREMENT) | (1L << OP_IS) | (1L << OP_NULL_ASSERT) | (1L << OP_NOT) | (1L << SQ_OPEN) | (1L << SQ_CLOSE) | (1L << KEYWORD_val) | (1L << KEYWORD_var) | (1L << KEYWORD_vararg))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (KEYWORD_by - 64)) | (1L << (KEYWORD_dynamic - 64)) | (1L << (KEYWORD_where - 64)) | (1L << (GET - 64)) | (1L << (SET - 64)) | (1L << (HierarchyModifier_abstract - 64)) | (1L << (HierarchyModifier_open - 64)) | (1L << (HierarchyModifier_final - 64)) | (1L << (HierarchyModifier_override - 64)) | (1L << (HierarchyModifier_lateinit - 64)) | (1L << (ClassModifier_enum - 64)) | (1L << (ClassModifier_annotation - 64)) | (1L << (ClassModifier_data - 64)) | (1L << (ClassModifier_inner - 64)) | (1L << (AccessModifier_private - 64)) | (1L << (AccessModifier_protected - 64)) | (1L << (AccessModifier_public - 64)) | (1L << (AccessModifier_internal - 64)) | (1L << (FunctionModifier_tailrec - 64)) | (1L << (FunctionModifier_operator - 64)) | (1L << (FunctionModifier_infix - 64)) | (1L << (FunctionModifier_inline - 64)) | (1L << (FunctionModifier_external - 64)) | (1L << (PropertyModifier_const - 64)) | (1L << (VarianceAnnotation_out - 64)) | (1L << (DOG - 64)) | (1L << (AnnotationUseSiteTarget_file - 64)) | (1L << (AnnotationUseSiteTarget_field - 64)) | (1L << (AnnotationUseSiteTarget_property - 64)) | (1L << (AnnotationUseSiteTarget_param - 64)) | (1L << (AnnotationUseSiteTarget_sparam - 64)) | (1L << (Jump_throw - 64)) | (1L << (Jump_continue - 64)) | (1L << (Jump_return - 64)) | (1L << (Jump_break - 64)) | (1L << (KEYWORD_constructor - 64)) | (1L << (ConstructorDelegationCall_this - 64)) | (1L << (ConstructorDelegationCall_super - 64)) | (1L << (Declaration_class - 64)) | (1L << (Declaration_interface - 64)) | (1L << (Declaration_object - 64)) | (1L << (Declaration_companion - 64)) | (1L << (Declaration_fun - 64)) | (1L << (Declaration_init - 64)) | (1L << (CF_if - 64)) | (1L << (CF_else - 64)) | (1L << (CF_when - 64)) | (1L << (CF_while - 64)) | (1L << (CF_for - 64)) | (1L << (CF_do - 64)) | (1L << (CF_try - 64)) | (1L << (CF_catch - 64)) | (1L << (CF_FINALLY - 64)) | (1L << (BAX - 64)) | (1L << (SimpleName - 64)) | (1L << (OP_NOT_IS - 64)) | (1L << (SINLE_QUOTE_WHITESPACE - 64)) | (1L << (SINGLE_TEXT - 64)) | (1L << (SINLE_QUOTE_CLOSE - 64)) | (1L << (SINLE_QUOTE_ESCAPED_CHAR - 64)) | (1L << (SINLE_QUOTE_EXPRESSION_START - 64)) | (1L << (SINGLE_QUOTE_REF - 64)) | (1L << (MULTILINE_QUOTE_TEXT - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (MULTILINE_QUOTES - 128)) | (1L << (MULTILINE_QUOTE_EXPRESSION_START - 128)) | (1L << (MULTILINE_QUOTE_REF - 128)))) != 0)) {
					{
					setState(1197);
					switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
					case 1:
						{
						setState(1191); match(MULTILINE_QUOTE_EXPRESSION_START);
						setState(1192); expression();
						setState(1193); match(CLOSE_BLOCK);
						}
						break;
					case 2:
						{
						setState(1195); match(MULTILINE_QUOTE_REF);
						}
						break;
					case 3:
						{
						setState(1196);
						_la = _input.LA(1);
						if ( _la <= 0 || (_la==MULTILINE_QUOTE_CLOSE) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						}
						break;
					}
					}
					setState(1201);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1202); match(MULTILINE_QUOTE_CLOSE);
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

	public static class AtomicExpressionContext extends ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public LiteralConstantContext literalConstant() {
			return getRuleContext(LiteralConstantContext.class,0);
		}
		public FunctionLiteralContext functionLiteral() {
			return getRuleContext(FunctionLiteralContext.class,0);
		}
		public WhenContext when() {
			return getRuleContext(WhenContext.class,0);
		}
		public TryExpressionContext tryExpression() {
			return getRuleContext(TryExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public ObjectLiteralContext objectLiteral() {
			return getRuleContext(ObjectLiteralContext.class,0);
		}
		public JumpContext jump() {
			return getRuleContext(JumpContext.class,0);
		}
		public IfExpressionContext ifExpression() {
			return getRuleContext(IfExpressionContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LabelReferenceContext labelReference() {
			return getRuleContext(LabelReferenceContext.class,0);
		}
		public AtomicExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomicExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterAtomicExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitAtomicExpression(this);
		}
	}

	public final AtomicExpressionContext atomicExpression() throws RecognitionException {
		AtomicExpressionContext _localctx = new AtomicExpressionContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_atomicExpression);
		try {
			setState(1241);
			switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1205); match(BRACE_OPEN);
				setState(1206); expression();
				setState(1207); match(BRACE_CLOSE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1209); literalConstant();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1210); functionLiteral();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1211); match(ConstructorDelegationCall_this);
				setState(1213);
				switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
				case 1:
					{
					setState(1212); labelReference();
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1215); match(ConstructorDelegationCall_super);
				setState(1220);
				switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
				case 1:
					{
					setState(1216); match(LT);
					setState(1217); type();
					setState(1218); match(GT);
					}
					break;
				}
				setState(1223);
				switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
				case 1:
					{
					setState(1222); labelReference();
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1225); ifExpression();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1226); when();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1227); tryExpression();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1228); objectLiteral();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1229); jump();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1230); loop();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1231); identifier();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1232); identifier();
				setState(1233); match(Q);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1235); identifier();
				setState(1236); typeArguments();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1238); match(BAX);
				setState(1239); identifier();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1240); match(PACKAGE);
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

	public static class LiteralConstantContext extends ParserRuleContext {
		public TerminalNode LongLiteral() { return getToken(KotlinParser.LongLiteral, 0); }
		public TerminalNode HexadecimalLiteral() { return getToken(KotlinParser.HexadecimalLiteral, 0); }
		public TerminalNode IntegerLiteral() { return getToken(KotlinParser.IntegerLiteral, 0); }
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public TerminalNode CharacterLiteral() { return getToken(KotlinParser.CharacterLiteral, 0); }
		public LiteralConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literalConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterLiteralConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitLiteralConstant(this);
		}
	}

	public final LiteralConstantContext literalConstant() throws RecognitionException {
		LiteralConstantContext _localctx = new LiteralConstantContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_literalConstant);
		try {
			setState(1251);
			switch (_input.LA(1)) {
			case TRUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1243); match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1244); match(FALSE);
				}
				break;
			case TRIPLE_QUOTE:
			case SINGLE_QUOTE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1245); stringLiteral();
				}
				break;
			case IntegerLiteral:
				enterOuterAlt(_localctx, 4);
				{
				setState(1246); match(IntegerLiteral);
				}
				break;
			case LongLiteral:
				enterOuterAlt(_localctx, 5);
				{
				setState(1247); match(LongLiteral);
				}
				break;
			case HexadecimalLiteral:
				enterOuterAlt(_localctx, 6);
				{
				setState(1248); match(HexadecimalLiteral);
				}
				break;
			case CharacterLiteral:
				enterOuterAlt(_localctx, 7);
				{
				setState(1249); match(CharacterLiteral);
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 8);
				{
				setState(1250); match(NULL);
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

	public static class DeclarationContext extends ParserRuleContext {
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public PropertyDeclarationContext propertyDeclaration() {
			return getRuleContext(PropertyDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public ObjectDeclarationContext objectDeclaration() {
			return getRuleContext(ObjectDeclarationContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_declaration);
		try {
			setState(1257);
			switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1253); functionDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1254); propertyDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1255); classDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1256); objectDeclaration();
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

	public static class StatementContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_statement);
		try {
			setState(1261);
			switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1259); declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1260); expression();
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

	public static class MultiplicativeOperationContext extends ParserRuleContext {
		public MultiplicativeOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterMultiplicativeOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitMultiplicativeOperation(this);
		}
	}

	public final MultiplicativeOperationContext multiplicativeOperation() throws RecognitionException {
		MultiplicativeOperationContext _localctx = new MultiplicativeOperationContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_multiplicativeOperation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1263);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << OP_DIV) | (1L << OP_MOD))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AdditiveOperationContext extends ParserRuleContext {
		public AdditiveOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterAdditiveOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitAdditiveOperation(this);
		}
	}

	public final AdditiveOperationContext additiveOperation() throws RecognitionException {
		AdditiveOperationContext _localctx = new AdditiveOperationContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_additiveOperation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1265);
			_la = _input.LA(1);
			if ( !(_la==OP_PLUS || _la==OP_MUNUS) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InOperationContext extends ParserRuleContext {
		public TerminalNode OP_IN() { return getToken(KotlinParser.OP_IN, 0); }
		public InOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterInOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitInOperation(this);
		}
	}

	public final InOperationContext inOperation() throws RecognitionException {
		InOperationContext _localctx = new InOperationContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_inOperation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1267);
			_la = _input.LA(1);
			if ( !(_la==OP_IN || _la==OP_NOT_IN) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeOperationContext extends ParserRuleContext {
		public TypeOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterTypeOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitTypeOperation(this);
		}
	}

	public final TypeOperationContext typeOperation() throws RecognitionException {
		TypeOperationContext _localctx = new TypeOperationContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_typeOperation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1269);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COLON) | (1L << OP_AS) | (1L << OP_AS_SAFE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComparisonOperationContext extends ParserRuleContext {
		public ComparisonOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterComparisonOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitComparisonOperation(this);
		}
	}

	public final ComparisonOperationContext comparisonOperation() throws RecognitionException {
		ComparisonOperationContext _localctx = new ComparisonOperationContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_comparisonOperation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1271);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << LTE) | (1L << GT) | (1L << GTE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EqualityOperationContext extends ParserRuleContext {
		public EqualityOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterEqualityOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitEqualityOperation(this);
		}
	}

	public final EqualityOperationContext equalityOperation() throws RecognitionException {
		EqualityOperationContext _localctx = new EqualityOperationContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_equalityOperation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1273);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ_EQ) | (1L << EQ_EQ_EQ) | (1L << NEQ_EQ_EQ) | (1L << NEQ))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
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
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterAssignmentOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitAssignmentOperator(this);
		}
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1275);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << OP_PLUS_ASSIGN) | (1L << OP_MINUS_ASSIGN) | (1L << OP_MULT_ASSIGN) | (1L << OP_DIV_ASSIGN) | (1L << OP_MOD_ASSIGN))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostfixUnaryOperationContext extends ParserRuleContext {
		public CallSuffixContext callSuffix() {
			return getRuleContext(CallSuffixContext.class,0);
		}
		public MemberAccessOperationContext memberAccessOperation() {
			return getRuleContext(MemberAccessOperationContext.class,0);
		}
		public ArrayAccessContext arrayAccess() {
			return getRuleContext(ArrayAccessContext.class,0);
		}
		public PostfixUnaryExpressionContext postfixUnaryExpression() {
			return getRuleContext(PostfixUnaryExpressionContext.class,0);
		}
		public PostfixUnaryOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixUnaryOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterPostfixUnaryOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitPostfixUnaryOperation(this);
		}
	}

	public final PostfixUnaryOperationContext postfixUnaryOperation() throws RecognitionException {
		PostfixUnaryOperationContext _localctx = new PostfixUnaryOperationContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_postfixUnaryOperation);
		try {
			setState(1285);
			switch (_input.LA(1)) {
			case OP_INCREMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1277); match(OP_INCREMENT);
				}
				break;
			case OP_DECREMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1278); match(OP_DECREMENT);
				}
				break;
			case OP_NULL_ASSERT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1279); match(OP_NULL_ASSERT);
				}
				break;
			case OPEN_BLOCK:
			case IMPORT:
			case LT:
			case BRACE_OPEN:
			case GET:
			case SET:
			case ClassModifier_enum:
			case ClassModifier_annotation:
			case ClassModifier_data:
			case DOG:
			case AnnotationUseSiteTarget_file:
			case AnnotationUseSiteTarget_field:
			case KEYWORD_constructor:
			case Declaration_companion:
			case Declaration_init:
			case SimpleName:
				enterOuterAlt(_localctx, 4);
				{
				setState(1280); callSuffix();
				}
				break;
			case SQ_OPEN:
				enterOuterAlt(_localctx, 5);
				{
				setState(1281); arrayAccess();
				}
				break;
			case DOT:
			case Q:
				enterOuterAlt(_localctx, 6);
				{
				setState(1282); memberAccessOperation();
				setState(1283); postfixUnaryExpression();
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

	public static class PrefixUnaryOperationContext extends ParserRuleContext {
		public LabelDefinitionContext labelDefinition() {
			return getRuleContext(LabelDefinitionContext.class,0);
		}
		public AnnotationsContext annotations() {
			return getRuleContext(AnnotationsContext.class,0);
		}
		public PrefixUnaryOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefixUnaryOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterPrefixUnaryOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitPrefixUnaryOperation(this);
		}
	}

	public final PrefixUnaryOperationContext prefixUnaryOperation() throws RecognitionException {
		PrefixUnaryOperationContext _localctx = new PrefixUnaryOperationContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_prefixUnaryOperation);
		try {
			setState(1294);
			switch (_input.LA(1)) {
			case OP_MUNUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(1287); match(OP_MUNUS);
				}
				break;
			case OP_PLUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(1288); match(OP_PLUS);
				}
				break;
			case OP_INCREMENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1289); match(OP_INCREMENT);
				}
				break;
			case OP_DECREMENT:
				enterOuterAlt(_localctx, 4);
				{
				setState(1290); match(OP_DECREMENT);
				}
				break;
			case OP_NOT:
				enterOuterAlt(_localctx, 5);
				{
				setState(1291); match(OP_NOT);
				}
				break;
			case DOG:
				enterOuterAlt(_localctx, 6);
				{
				setState(1292); annotations();
				}
				break;
			case IMPORT:
			case GET:
			case SET:
			case ClassModifier_enum:
			case ClassModifier_annotation:
			case ClassModifier_data:
			case AnnotationUseSiteTarget_file:
			case AnnotationUseSiteTarget_field:
			case KEYWORD_constructor:
			case Declaration_companion:
			case Declaration_init:
			case SimpleName:
				enterOuterAlt(_localctx, 7);
				{
				setState(1293); labelDefinition();
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

	public static class IsOperationContext extends ParserRuleContext {
		public IsOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_isOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterIsOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitIsOperation(this);
		}
	}

	public final IsOperationContext isOperation() throws RecognitionException {
		IsOperationContext _localctx = new IsOperationContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_isOperation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1296);
			_la = _input.LA(1);
			if ( !(_la==OP_IS || _la==OP_NOT_IS) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotatedLambdaContext extends ParserRuleContext {
		public List<UnescapedAnnotationContext> unescapedAnnotation() {
			return getRuleContexts(UnescapedAnnotationContext.class);
		}
		public FunctionLiteralContext functionLiteral() {
			return getRuleContext(FunctionLiteralContext.class,0);
		}
		public LabelDefinitionContext labelDefinition() {
			return getRuleContext(LabelDefinitionContext.class,0);
		}
		public UnescapedAnnotationContext unescapedAnnotation(int i) {
			return getRuleContext(UnescapedAnnotationContext.class,i);
		}
		public AnnotatedLambdaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotatedLambda; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterAnnotatedLambda(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitAnnotatedLambda(this);
		}
	}

	public final AnnotatedLambdaContext annotatedLambda() throws RecognitionException {
		AnnotatedLambdaContext _localctx = new AnnotatedLambdaContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_annotatedLambda);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1302);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOG) {
				{
				{
				setState(1298); match(DOG);
				setState(1299); unescapedAnnotation();
				}
				}
				setState(1304);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1306);
			_la = _input.LA(1);
			if (_la==IMPORT || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (GET - 67)) | (1L << (SET - 67)) | (1L << (ClassModifier_enum - 67)) | (1L << (ClassModifier_annotation - 67)) | (1L << (ClassModifier_data - 67)) | (1L << (AnnotationUseSiteTarget_file - 67)) | (1L << (AnnotationUseSiteTarget_field - 67)) | (1L << (KEYWORD_constructor - 67)) | (1L << (Declaration_companion - 67)) | (1L << (Declaration_init - 67)) | (1L << (SimpleName - 67)))) != 0)) {
				{
				setState(1305); labelDefinition();
				}
			}

			setState(1308); functionLiteral();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MemberAccessOperationContext extends ParserRuleContext {
		public MemberAccessOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberAccessOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterMemberAccessOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitMemberAccessOperation(this);
		}
	}

	public final MemberAccessOperationContext memberAccessOperation() throws RecognitionException {
		MemberAccessOperationContext _localctx = new MemberAccessOperationContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_memberAccessOperation);
		int _la;
		try {
			setState(1315);
			switch (_input.LA(1)) {
			case DOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1310); match(DOT);
				}
				break;
			case Q:
				enterOuterAlt(_localctx, 2);
				{
				setState(1311); match(Q);
				setState(1313);
				_la = _input.LA(1);
				if (_la==DOT) {
					{
					setState(1312); match(DOT);
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

	public static class FunctionLiteralContext extends ParserRuleContext {
		public ModifiersContext modifiers(int i) {
			return getRuleContext(ModifiersContext.class,i);
		}
		public KeywordOrSimpleNameContext keywordOrSimpleName(int i) {
			return getRuleContext(KeywordOrSimpleNameContext.class,i);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public List<KeywordOrSimpleNameContext> keywordOrSimpleName() {
			return getRuleContexts(KeywordOrSimpleNameContext.class);
		}
		public List<ModifiersContext> modifiers() {
			return getRuleContexts(ModifiersContext.class);
		}
		public FunctionLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterFunctionLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitFunctionLiteral(this);
		}
	}

	public final FunctionLiteralContext functionLiteral() throws RecognitionException {
		FunctionLiteralContext _localctx = new FunctionLiteralContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_functionLiteral);
		int _la;
		try {
			setState(1340);
			switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1317); match(OPEN_BLOCK);
				setState(1318); statements();
				setState(1319); match(CLOSE_BLOCK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1321); match(OPEN_BLOCK);
				setState(1334);
				_la = _input.LA(1);
				if (_la==OP_IN || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (GET - 67)) | (1L << (SET - 67)) | (1L << (HierarchyModifier_abstract - 67)) | (1L << (HierarchyModifier_open - 67)) | (1L << (HierarchyModifier_final - 67)) | (1L << (HierarchyModifier_override - 67)) | (1L << (HierarchyModifier_lateinit - 67)) | (1L << (ClassModifier_enum - 67)) | (1L << (ClassModifier_annotation - 67)) | (1L << (ClassModifier_data - 67)) | (1L << (ClassModifier_inner - 67)) | (1L << (AccessModifier_private - 67)) | (1L << (AccessModifier_protected - 67)) | (1L << (AccessModifier_public - 67)) | (1L << (AccessModifier_internal - 67)) | (1L << (FunctionModifier_tailrec - 67)) | (1L << (FunctionModifier_operator - 67)) | (1L << (FunctionModifier_infix - 67)) | (1L << (FunctionModifier_inline - 67)) | (1L << (FunctionModifier_external - 67)) | (1L << (PropertyModifier_const - 67)) | (1L << (VarianceAnnotation_out - 67)) | (1L << (DOG - 67)) | (1L << (AnnotationUseSiteTarget_file - 67)) | (1L << (AnnotationUseSiteTarget_field - 67)) | (1L << (KEYWORD_constructor - 67)) | (1L << (SimpleName - 67)))) != 0)) {
					{
					{
					setState(1322); modifiers();
					setState(1323); keywordOrSimpleName();
					}
					setState(1331);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1325); match(COMMA);
						setState(1326); modifiers();
						setState(1327); keywordOrSimpleName();
						}
						}
						setState(1333);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1336); match(OP_ASTERISK);
				setState(1337); statements();
				setState(1338); match(CLOSE_BLOCK);
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

	public static class ArrayAccessContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ArrayAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterArrayAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitArrayAccess(this);
		}
	}

	public final ArrayAccessContext arrayAccess() throws RecognitionException {
		ArrayAccessContext _localctx = new ArrayAccessContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_arrayAccess);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1342); match(SQ_OPEN);
			setState(1351);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LongLiteral) | (1L << IntegerLiteral) | (1L << OPEN_BLOCK) | (1L << HexadecimalLiteral) | (1L << CharacterLiteral) | (1L << TRIPLE_QUOTE) | (1L << SINGLE_QUOTE) | (1L << PACKAGE) | (1L << IMPORT) | (1L << BRACE_OPEN) | (1L << REFERENCE) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << OP_PLUS) | (1L << OP_MUNUS) | (1L << OP_DECREMENT) | (1L << OP_INCREMENT) | (1L << OP_NOT))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (GET - 67)) | (1L << (SET - 67)) | (1L << (ClassModifier_enum - 67)) | (1L << (ClassModifier_annotation - 67)) | (1L << (ClassModifier_data - 67)) | (1L << (DOG - 67)) | (1L << (AnnotationUseSiteTarget_file - 67)) | (1L << (AnnotationUseSiteTarget_field - 67)) | (1L << (Jump_throw - 67)) | (1L << (Jump_continue - 67)) | (1L << (Jump_return - 67)) | (1L << (Jump_break - 67)) | (1L << (KEYWORD_constructor - 67)) | (1L << (ConstructorDelegationCall_this - 67)) | (1L << (ConstructorDelegationCall_super - 67)) | (1L << (Declaration_object - 67)) | (1L << (Declaration_companion - 67)) | (1L << (Declaration_init - 67)) | (1L << (CF_if - 67)) | (1L << (CF_when - 67)) | (1L << (CF_while - 67)) | (1L << (CF_for - 67)) | (1L << (CF_do - 67)) | (1L << (CF_try - 67)) | (1L << (BAX - 67)) | (1L << (SimpleName - 67)))) != 0)) {
				{
				setState(1343); expression();
				setState(1348);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1344); match(COMMA);
					setState(1345); expression();
					}
					}
					setState(1350);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1353); match(SQ_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObjectLiteralContext extends ParserRuleContext {
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public List<DelegationSpecifierContext> delegationSpecifier() {
			return getRuleContexts(DelegationSpecifierContext.class);
		}
		public DelegationSpecifierContext delegationSpecifier(int i) {
			return getRuleContext(DelegationSpecifierContext.class,i);
		}
		public ObjectLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterObjectLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitObjectLiteral(this);
		}
	}

	public final ObjectLiteralContext objectLiteral() throws RecognitionException {
		ObjectLiteralContext _localctx = new ObjectLiteralContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_objectLiteral);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1355); match(Declaration_object);
			setState(1365);
			switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
			case 1:
				{
				setState(1356); match(COLON);
				setState(1357); delegationSpecifier();
				setState(1362);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,175,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1358); match(COMMA);
						setState(1359); delegationSpecifier();
						}
						} 
					}
					setState(1364);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,175,_ctx);
				}
				}
				break;
			}
			setState(1367); classBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhenContext extends ParserRuleContext {
		public WhenEntryContext whenEntry(int i) {
			return getRuleContext(WhenEntryContext.class,i);
		}
		public List<WhenEntryContext> whenEntry() {
			return getRuleContexts(WhenEntryContext.class);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public WhenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_when; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterWhen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitWhen(this);
		}
	}

	public final WhenContext when() throws RecognitionException {
		WhenContext _localctx = new WhenContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_when);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1369); match(CF_when);
			setState(1374);
			_la = _input.LA(1);
			if (_la==BRACE_OPEN) {
				{
				setState(1370); match(BRACE_OPEN);
				setState(1371); expression();
				setState(1372); match(BRACE_CLOSE);
				}
			}

			setState(1376); match(OPEN_BLOCK);
			setState(1380);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LongLiteral) | (1L << IntegerLiteral) | (1L << OPEN_BLOCK) | (1L << HexadecimalLiteral) | (1L << CharacterLiteral) | (1L << TRIPLE_QUOTE) | (1L << SINGLE_QUOTE) | (1L << PACKAGE) | (1L << IMPORT) | (1L << BRACE_OPEN) | (1L << REFERENCE) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << OP_PLUS) | (1L << OP_MUNUS) | (1L << OP_IN) | (1L << OP_NOT_IN) | (1L << OP_DECREMENT) | (1L << OP_INCREMENT) | (1L << OP_IS) | (1L << OP_NOT))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (GET - 67)) | (1L << (SET - 67)) | (1L << (ClassModifier_enum - 67)) | (1L << (ClassModifier_annotation - 67)) | (1L << (ClassModifier_data - 67)) | (1L << (DOG - 67)) | (1L << (AnnotationUseSiteTarget_file - 67)) | (1L << (AnnotationUseSiteTarget_field - 67)) | (1L << (Jump_throw - 67)) | (1L << (Jump_continue - 67)) | (1L << (Jump_return - 67)) | (1L << (Jump_break - 67)) | (1L << (KEYWORD_constructor - 67)) | (1L << (ConstructorDelegationCall_this - 67)) | (1L << (ConstructorDelegationCall_super - 67)) | (1L << (Declaration_object - 67)) | (1L << (Declaration_companion - 67)) | (1L << (Declaration_init - 67)) | (1L << (CF_if - 67)) | (1L << (CF_else - 67)) | (1L << (CF_when - 67)) | (1L << (CF_while - 67)) | (1L << (CF_for - 67)) | (1L << (CF_do - 67)) | (1L << (CF_try - 67)) | (1L << (BAX - 67)) | (1L << (SimpleName - 67)) | (1L << (OP_NOT_IS - 67)))) != 0)) {
				{
				{
				setState(1377); whenEntry();
				}
				}
				setState(1382);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1383); match(CLOSE_BLOCK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhenEntryContext extends ParserRuleContext {
		public List<WhenConditionContext> whenCondition() {
			return getRuleContexts(WhenConditionContext.class);
		}
		public WhenConditionContext whenCondition(int i) {
			return getRuleContext(WhenConditionContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(KotlinParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(KotlinParser.SEMI, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public WhenEntryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whenEntry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterWhenEntry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitWhenEntry(this);
		}
	}

	public final WhenEntryContext whenEntry() throws RecognitionException {
		WhenEntryContext _localctx = new WhenEntryContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_whenEntry);
		int _la;
		try {
			setState(1410);
			switch (_input.LA(1)) {
			case LongLiteral:
			case IntegerLiteral:
			case OPEN_BLOCK:
			case HexadecimalLiteral:
			case CharacterLiteral:
			case TRIPLE_QUOTE:
			case SINGLE_QUOTE:
			case PACKAGE:
			case IMPORT:
			case BRACE_OPEN:
			case REFERENCE:
			case TRUE:
			case FALSE:
			case NULL:
			case OP_PLUS:
			case OP_MUNUS:
			case OP_IN:
			case OP_NOT_IN:
			case OP_DECREMENT:
			case OP_INCREMENT:
			case OP_IS:
			case OP_NOT:
			case GET:
			case SET:
			case ClassModifier_enum:
			case ClassModifier_annotation:
			case ClassModifier_data:
			case DOG:
			case AnnotationUseSiteTarget_file:
			case AnnotationUseSiteTarget_field:
			case Jump_throw:
			case Jump_continue:
			case Jump_return:
			case Jump_break:
			case KEYWORD_constructor:
			case ConstructorDelegationCall_this:
			case ConstructorDelegationCall_super:
			case Declaration_object:
			case Declaration_companion:
			case Declaration_init:
			case CF_if:
			case CF_when:
			case CF_while:
			case CF_for:
			case CF_do:
			case CF_try:
			case BAX:
			case SimpleName:
			case OP_NOT_IS:
				enterOuterAlt(_localctx, 1);
				{
				setState(1385); whenCondition();
				setState(1390);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1386); match(COMMA);
					setState(1387); whenCondition();
					}
					}
					setState(1392);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1393); match(OP_ASTERISK);
				setState(1394); expression();
				setState(1398);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEMI) {
					{
					{
					setState(1395); match(SEMI);
					}
					}
					setState(1400);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case CF_else:
				enterOuterAlt(_localctx, 2);
				{
				setState(1401); match(CF_else);
				setState(1402); match(OP_ASTERISK);
				setState(1403); expression();
				setState(1407);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEMI) {
					{
					{
					setState(1404); match(SEMI);
					}
					}
					setState(1409);
					_errHandler.sync(this);
					_la = _input.LA(1);
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

	public static class WhenConditionContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public WhenConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whenCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterWhenCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitWhenCondition(this);
		}
	}

	public final WhenConditionContext whenCondition() throws RecognitionException {
		WhenConditionContext _localctx = new WhenConditionContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_whenCondition);
		int _la;
		try {
			setState(1417);
			switch (_input.LA(1)) {
			case LongLiteral:
			case IntegerLiteral:
			case OPEN_BLOCK:
			case HexadecimalLiteral:
			case CharacterLiteral:
			case TRIPLE_QUOTE:
			case SINGLE_QUOTE:
			case PACKAGE:
			case IMPORT:
			case BRACE_OPEN:
			case REFERENCE:
			case TRUE:
			case FALSE:
			case NULL:
			case OP_PLUS:
			case OP_MUNUS:
			case OP_DECREMENT:
			case OP_INCREMENT:
			case OP_NOT:
			case GET:
			case SET:
			case ClassModifier_enum:
			case ClassModifier_annotation:
			case ClassModifier_data:
			case DOG:
			case AnnotationUseSiteTarget_file:
			case AnnotationUseSiteTarget_field:
			case Jump_throw:
			case Jump_continue:
			case Jump_return:
			case Jump_break:
			case KEYWORD_constructor:
			case ConstructorDelegationCall_this:
			case ConstructorDelegationCall_super:
			case Declaration_object:
			case Declaration_companion:
			case Declaration_init:
			case CF_if:
			case CF_when:
			case CF_while:
			case CF_for:
			case CF_do:
			case CF_try:
			case BAX:
			case SimpleName:
				enterOuterAlt(_localctx, 1);
				{
				setState(1412); expression();
				}
				break;
			case OP_IN:
			case OP_NOT_IN:
				enterOuterAlt(_localctx, 2);
				{
				setState(1413);
				_la = _input.LA(1);
				if ( !(_la==OP_IN || _la==OP_NOT_IN) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(1414); expression();
				}
				break;
			case OP_IS:
			case OP_NOT_IS:
				enterOuterAlt(_localctx, 3);
				{
				setState(1415);
				_la = _input.LA(1);
				if ( !(_la==OP_IS || _la==OP_NOT_IS) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(1416); type();
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u0084\u058e\4\2\t"+
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
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\3\2\3\2"+
		"\7\2\u00ed\n\2\f\2\16\2\u00f0\13\2\3\3\5\3\u00f3\n\3\3\3\7\3\u00f6\n\3"+
		"\f\3\16\3\u00f9\13\3\3\4\3\4\3\4\3\4\7\4\u00ff\n\4\f\4\16\4\u0102\13\4"+
		"\3\4\7\4\u0105\n\4\f\4\16\4\u0108\13\4\3\5\3\5\3\5\3\5\7\5\u010e\n\5\f"+
		"\5\16\5\u0111\13\5\3\5\3\5\3\5\3\5\5\5\u0117\n\5\3\5\7\5\u011a\n\5\f\5"+
		"\16\5\u011d\13\5\3\6\3\6\3\6\3\6\5\6\u0123\n\6\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\5\7\u012c\n\7\3\b\5\b\u012f\n\b\3\t\3\t\3\t\5\t\u0134\n\t\3\t\3\t"+
		"\3\t\5\t\u0139\n\t\7\t\u013b\n\t\f\t\16\t\u013e\13\t\3\t\3\t\3\n\3\n\3"+
		"\n\3\n\5\n\u0146\n\n\3\13\3\13\3\13\5\13\u014b\n\13\3\13\3\13\3\13\5\13"+
		"\u0150\n\13\7\13\u0152\n\13\f\13\16\13\u0155\13\13\3\13\3\13\3\f\3\f\3"+
		"\f\3\f\7\f\u015d\n\f\f\f\16\f\u0160\13\f\5\f\u0162\n\f\3\r\5\r\u0165\n"+
		"\r\3\r\3\r\3\r\3\r\3\16\5\16\u016c\n\16\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\5\17\u0174\n\17\3\17\5\17\u0177\n\17\3\17\3\17\5\17\u017b\n\17\3\17\3"+
		"\17\5\17\u017f\n\17\3\17\5\17\u0182\n\17\3\17\3\17\5\17\u0186\n\17\3\17"+
		"\5\17\u0189\n\17\5\17\u018b\n\17\3\20\3\20\5\20\u018f\n\20\3\20\3\20\3"+
		"\20\7\20\u0194\n\20\f\20\16\20\u0197\13\20\3\21\3\21\3\21\3\21\5\21\u019d"+
		"\n\21\3\22\3\22\3\22\3\22\3\22\7\22\u01a4\n\22\f\22\16\22\u01a7\13\22"+
		"\3\22\3\22\5\22\u01ab\n\22\3\23\3\23\3\24\3\24\3\24\5\24\u01b2\n\24\3"+
		"\25\3\25\3\25\3\25\5\25\u01b8\n\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27"+
		"\7\27\u01c1\n\27\f\27\16\27\u01c4\13\27\5\27\u01c6\n\27\3\27\3\27\3\27"+
		"\3\27\3\30\3\30\3\30\3\30\7\30\u01d0\n\30\f\30\16\30\u01d3\13\30\3\30"+
		"\3\30\3\31\3\31\3\31\5\31\u01da\n\31\3\31\3\31\3\31\5\31\u01df\n\31\3"+
		"\31\3\31\5\31\u01e3\n\31\3\31\3\31\3\31\3\31\7\31\u01e9\n\31\f\31\16\31"+
		"\u01ec\13\31\5\31\u01ee\n\31\3\31\5\31\u01f1\n\31\3\31\5\31\u01f4\n\31"+
		"\3\31\5\31\u01f7\n\31\3\31\5\31\u01fa\n\31\5\31\u01fc\n\31\3\31\7\31\u01ff"+
		"\n\31\f\31\16\31\u0202\13\31\3\32\7\32\u0205\n\32\f\32\16\32\u0208\13"+
		"\32\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u0213\n\34\3\35"+
		"\3\35\3\36\3\36\3\37\3\37\3 \3 \3 \3 \3 \5 \u0220\n \3!\3!\3\"\3\"\3#"+
		"\3#\3$\6$\u0229\n$\r$\16$\u022a\3%\3%\3%\3%\5%\u0231\n%\3%\3%\3&\3&\3"+
		"\'\3\'\3\'\5\'\u023a\n\'\3\'\5\'\u023d\n\'\3\'\3\'\3(\3(\3(\3(\7(\u0245"+
		"\n(\f(\16(\u0248\13(\5(\u024a\n(\3(\3(\3)\3)\3)\7)\u0251\n)\f)\16)\u0254"+
		"\13)\3)\5)\u0257\n)\3)\5)\u025a\n)\3*\3*\3*\3*\5*\u0260\n*\3*\5*\u0263"+
		"\n*\3*\3*\5*\u0267\n*\3*\3*\5*\u026b\n*\5*\u026d\n*\3+\3+\3+\3+\3+\5+"+
		"\u0274\n+\3,\3,\3,\3-\3-\3-\3-\3.\3.\5.\u027f\n.\3.\5.\u0282\n.\3.\3."+
		"\3.\5.\u0287\n.\3/\3/\3/\5/\u028c\n/\3/\3/\3/\3/\7/\u0292\n/\f/\16/\u0295"+
		"\13/\5/\u0297\n/\3/\3/\3\60\3\60\3\60\3\60\3\60\5\60\u02a0\n\60\3\60\3"+
		"\60\7\60\u02a4\n\60\f\60\16\60\u02a7\13\60\3\61\3\61\3\61\3\61\5\61\u02ad"+
		"\n\61\3\62\5\62\u02b0\n\62\3\62\3\62\5\62\u02b4\n\62\3\62\3\62\3\62\3"+
		"\62\5\62\u02ba\n\62\3\63\3\63\5\63\u02be\n\63\3\63\3\63\3\64\3\64\3\64"+
		"\3\64\3\65\3\65\3\65\5\65\u02c9\n\65\3\66\3\66\3\66\3\66\5\66\u02cf\n"+
		"\66\3\66\5\66\u02d2\n\66\3\66\3\66\5\66\u02d6\n\66\3\66\3\66\3\66\7\66"+
		"\u02db\n\66\f\66\16\66\u02de\13\66\5\66\u02e0\n\66\3\66\3\66\3\66\5\66"+
		"\u02e5\n\66\3\66\7\66\u02e8\n\66\f\66\16\66\u02eb\13\66\3\67\3\67\38\3"+
		"8\38\38\78\u02f3\n8\f8\168\u02f6\138\39\39\39\39\59\u02fc\n9\39\59\u02ff"+
		"\n9\39\39\79\u0303\n9\f9\169\u0306\139\3:\3:\3:\3:\5:\u030c\n:\3:\3:\7"+
		":\u0310\n:\f:\16:\u0313\13:\3;\3;\3;\3;\5;\u0319\n;\3<\7<\u031c\n<\f<"+
		"\16<\u031f\13<\3=\3=\3=\3=\7=\u0325\n=\f=\16=\u0328\13=\5=\u032a\n=\3"+
		"=\3=\3>\3>\3>\5>\u0331\n>\3>\3>\3>\3>\5>\u0337\n>\3>\3>\5>\u033b\n>\3"+
		">\3>\3>\5>\u0340\n>\3>\3>\5>\u0344\n>\3>\7>\u0347\n>\f>\16>\u034a\13>"+
		"\3?\7?\u034d\n?\f?\16?\u0350\13?\3?\3?\7?\u0354\n?\f?\16?\u0357\13?\3"+
		"?\7?\u035a\n?\f?\16?\u035d\13?\5?\u035f\n?\3?\7?\u0362\n?\f?\16?\u0365"+
		"\13?\3@\3@\3@\5@\u036a\n@\3A\3A\3A\3A\3B\3B\3B\7B\u0373\nB\fB\16B\u0376"+
		"\13B\3C\3C\3C\3C\5C\u037c\nC\3C\3C\3D\3D\5D\u0382\nD\7D\u0384\nD\fD\16"+
		"D\u0387\13D\3E\3E\3E\3E\5E\u038d\nE\3E\3E\5E\u0391\nE\3E\3E\3F\3F\3F\3"+
		"F\3F\3F\7F\u039b\nF\fF\16F\u039e\13F\3F\3F\5F\u03a2\nF\3G\3G\3G\7G\u03a7"+
		"\nG\fG\16G\u03aa\13G\3G\5G\u03ad\nG\3H\3H\3H\5H\u03b2\nH\3H\3H\3H\3H\3"+
		"H\3H\3I\3I\3I\3J\3J\3J\5J\u03c0\nJ\3K\3K\3K\5K\u03c5\nK\3K\3K\5K\u03c9"+
		"\nK\3K\3K\3K\3K\3K\3L\3L\3L\3L\3L\3L\3M\3M\3M\3M\3M\3M\3M\3N\3N\3N\3N"+
		"\7N\u03e1\nN\fN\16N\u03e4\13N\3O\3O\3O\7O\u03e9\nO\fO\16O\u03ec\13O\3"+
		"P\3P\3P\7P\u03f1\nP\fP\16P\u03f4\13P\3Q\3Q\3Q\3Q\7Q\u03fa\nQ\fQ\16Q\u03fd"+
		"\13Q\3R\3R\3R\3R\7R\u0403\nR\fR\16R\u0406\13R\3S\3S\3S\3S\7S\u040c\nS"+
		"\fS\16S\u040f\13S\3S\3S\3S\3S\3S\3S\3S\5S\u0418\nS\5S\u041a\nS\3T\3T\3"+
		"T\7T\u041f\nT\fT\16T\u0422\13T\3U\3U\3U\3U\7U\u0428\nU\fU\16U\u042b\13"+
		"U\3V\3V\3V\7V\u0430\nV\fV\16V\u0433\13V\3W\3W\3W\3W\7W\u0439\nW\fW\16"+
		"W\u043c\13W\3X\3X\3X\3X\7X\u0442\nX\fX\16X\u0445\13X\3Y\3Y\3Y\3Y\7Y\u044b"+
		"\nY\fY\16Y\u044e\13Y\3Z\7Z\u0451\nZ\fZ\16Z\u0454\13Z\3Z\3Z\3[\3[\3[\3"+
		"[\3[\7[\u045d\n[\f[\16[\u0460\13[\3[\3[\7[\u0464\n[\f[\16[\u0467\13[\5"+
		"[\u0469\n[\3\\\3\\\7\\\u046d\n\\\f\\\16\\\u0470\13\\\5\\\u0472\n\\\3\\"+
		"\3\\\3\\\5\\\u0477\n\\\3\\\5\\\u047a\n\\\3]\3]\3]\3]\3]\3]\3]\3]\3]\5"+
		"]\u0485\n]\3]\3]\5]\u0489\n]\3^\3^\3^\3^\3^\3^\3^\3^\3^\5^\u0494\n^\3"+
		"^\3^\3^\5^\u0499\n^\3_\3_\3_\3_\3_\3_\3_\3_\7_\u04a3\n_\f_\16_\u04a6\13"+
		"_\3_\3_\3_\3_\3_\3_\3_\3_\7_\u04b0\n_\f_\16_\u04b3\13_\3_\5_\u04b6\n_"+
		"\3`\3`\3`\3`\3`\3`\3`\3`\5`\u04c0\n`\3`\3`\3`\3`\3`\5`\u04c7\n`\3`\5`"+
		"\u04ca\n`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\5`\u04dc\n`"+
		"\3a\3a\3a\3a\3a\3a\3a\3a\5a\u04e6\na\3b\3b\3b\3b\5b\u04ec\nb\3c\3c\5c"+
		"\u04f0\nc\3d\3d\3e\3e\3f\3f\3g\3g\3h\3h\3i\3i\3j\3j\3k\3k\3k\3k\3k\3k"+
		"\3k\3k\5k\u0508\nk\3l\3l\3l\3l\3l\3l\3l\5l\u0511\nl\3m\3m\3n\3n\7n\u0517"+
		"\nn\fn\16n\u051a\13n\3n\5n\u051d\nn\3n\3n\3o\3o\3o\5o\u0524\no\5o\u0526"+
		"\no\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\7p\u0534\np\fp\16p\u0537\13p\5"+
		"p\u0539\np\3p\3p\3p\3p\5p\u053f\np\3q\3q\3q\3q\7q\u0545\nq\fq\16q\u0548"+
		"\13q\5q\u054a\nq\3q\3q\3r\3r\3r\3r\3r\7r\u0553\nr\fr\16r\u0556\13r\5r"+
		"\u0558\nr\3r\3r\3s\3s\3s\3s\3s\5s\u0561\ns\3s\3s\7s\u0565\ns\fs\16s\u0568"+
		"\13s\3s\3s\3t\3t\3t\7t\u056f\nt\ft\16t\u0572\13t\3t\3t\3t\7t\u0577\nt"+
		"\ft\16t\u057a\13t\3t\3t\3t\3t\7t\u0580\nt\ft\16t\u0583\13t\5t\u0585\n"+
		"t\3u\3u\3u\3u\3u\5u\u058c\nu\3u\2\2v\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080"+
		"\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098"+
		"\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0"+
		"\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8"+
		"\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0"+
		"\u00e2\u00e4\u00e6\u00e8\2\26\7\2EFMN\\]eexx\3\2?@\4\2\30\30BB\3\2TX\3"+
		"\2GK\3\2LO\3\2PS\4\2//ZZ\4\2EF\\`\3\2hi\3\2||\3\2\u0081\u0081\4\2\22\22"+
		"+,\3\2-.\3\2/\60\4\2\35\35\61\62\3\2\24\27\3\2\31\34\4\2\30\30\63\67\4"+
		"\2::yy\u0612\2\u00ea\3\2\2\2\4\u00f2\3\2\2\2\6\u00fa\3\2\2\2\b\u0109\3"+
		"\2\2\2\n\u0122\3\2\2\2\f\u012b\3\2\2\2\16\u012e\3\2\2\2\20\u0130\3\2\2"+
		"\2\22\u0141\3\2\2\2\24\u0147\3\2\2\2\26\u0161\3\2\2\2\30\u0164\3\2\2\2"+
		"\32\u016b\3\2\2\2\34\u018a\3\2\2\2\36\u018e\3\2\2\2 \u019c\3\2\2\2\"\u019e"+
		"\3\2\2\2$\u01ac\3\2\2\2&\u01ae\3\2\2\2(\u01b7\3\2\2\2*\u01b9\3\2\2\2,"+
		"\u01bc\3\2\2\2.\u01cb\3\2\2\2\60\u01d6\3\2\2\2\62\u0206\3\2\2\2\64\u0209"+
		"\3\2\2\2\66\u0212\3\2\2\28\u0214\3\2\2\2:\u0216\3\2\2\2<\u0218\3\2\2\2"+
		">\u021f\3\2\2\2@\u0221\3\2\2\2B\u0223\3\2\2\2D\u0225\3\2\2\2F\u0228\3"+
		"\2\2\2H\u022c\3\2\2\2J\u0234\3\2\2\2L\u0239\3\2\2\2N\u0240\3\2\2\2P\u024d"+
		"\3\2\2\2R\u026c\3\2\2\2T\u026e\3\2\2\2V\u0275\3\2\2\2X\u0278\3\2\2\2Z"+
		"\u027c\3\2\2\2\\\u028b\3\2\2\2^\u029a\3\2\2\2`\u02ac\3\2\2\2b\u02b9\3"+
		"\2\2\2d\u02bb\3\2\2\2f\u02c1\3\2\2\2h\u02c8\3\2\2\2j\u02ca\3\2\2\2l\u02ec"+
		"\3\2\2\2n\u02ee\3\2\2\2p\u02f7\3\2\2\2r\u0307\3\2\2\2t\u0318\3\2\2\2v"+
		"\u031d\3\2\2\2x\u0320\3\2\2\2z\u032d\3\2\2\2|\u034e\3\2\2\2~\u0369\3\2"+
		"\2\2\u0080\u036b\3\2\2\2\u0082\u036f\3\2\2\2\u0084\u0377\3\2\2\2\u0086"+
		"\u0385\3\2\2\2\u0088\u0388\3\2\2\2\u008a\u0394\3\2\2\2\u008c\u03a3\3\2"+
		"\2\2\u008e\u03ae\3\2\2\2\u0090\u03b9\3\2\2\2\u0092\u03bf\3\2\2\2\u0094"+
		"\u03c1\3\2\2\2\u0096\u03cf\3\2\2\2\u0098\u03d5\3\2\2\2\u009a\u03dc\3\2"+
		"\2\2\u009c\u03e5\3\2\2\2\u009e\u03ed\3\2\2\2\u00a0\u03f5\3\2\2\2\u00a2"+
		"\u03fe\3\2\2\2\u00a4\u0419\3\2\2\2\u00a6\u041b\3\2\2\2\u00a8\u0423\3\2"+
		"\2\2\u00aa\u042c\3\2\2\2\u00ac\u0434\3\2\2\2\u00ae\u043d\3\2\2\2\u00b0"+
		"\u0446\3\2\2\2\u00b2\u0452\3\2\2\2\u00b4\u0468\3\2\2\2\u00b6\u0471\3\2"+
		"\2\2\u00b8\u0488\3\2\2\2\u00ba\u0498\3\2\2\2\u00bc\u04b5\3\2\2\2\u00be"+
		"\u04db\3\2\2\2\u00c0\u04e5\3\2\2\2\u00c2\u04eb\3\2\2\2\u00c4\u04ef\3\2"+
		"\2\2\u00c6\u04f1\3\2\2\2\u00c8\u04f3\3\2\2\2\u00ca\u04f5\3\2\2\2\u00cc"+
		"\u04f7\3\2\2\2\u00ce\u04f9\3\2\2\2\u00d0\u04fb\3\2\2\2\u00d2\u04fd\3\2"+
		"\2\2\u00d4\u0507\3\2\2\2\u00d6\u0510\3\2\2\2\u00d8\u0512\3\2\2\2\u00da"+
		"\u0518\3\2\2\2\u00dc\u0525\3\2\2\2\u00de\u053e\3\2\2\2\u00e0\u0540\3\2"+
		"\2\2\u00e2\u054d\3\2\2\2\u00e4\u055b\3\2\2\2\u00e6\u0584\3\2\2\2\u00e8"+
		"\u058b\3\2\2\2\u00ea\u00ee\5\4\3\2\u00eb\u00ed\5\n\6\2\u00ec\u00eb\3\2"+
		"\2\2\u00ed\u00f0\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef"+
		"\3\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f1\u00f3\5\6\4\2\u00f2\u00f1\3\2\2\2"+
		"\u00f2\u00f3\3\2\2\2\u00f3\u00f7\3\2\2\2\u00f4\u00f6\5\b\5\2\u00f5\u00f4"+
		"\3\2\2\2\u00f6\u00f9\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8"+
		"\5\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa\u00fb\7\17\2\2\u00fb\u0100\5> \2"+
		"\u00fc\u00fd\7\21\2\2\u00fd\u00ff\5> \2\u00fe\u00fc\3\2\2\2\u00ff\u0102"+
		"\3\2\2\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0106\3\2\2\2\u0102"+
		"\u0100\3\2\2\2\u0103\u0105\7\b\2\2\u0104\u0103\3\2\2\2\u0105\u0108\3\2"+
		"\2\2\u0106\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107\7\3\2\2\2\u0108\u0106"+
		"\3\2\2\2\u0109\u010a\7\20\2\2\u010a\u010f\5> \2\u010b\u010c\7\21\2\2\u010c"+
		"\u010e\5> \2\u010d\u010b\3\2\2\2\u010e\u0111\3\2\2\2\u010f\u010d\3\2\2"+
		"\2\u010f\u0110\3\2\2\2\u0110\u0116\3\2\2\2\u0111\u010f\3\2\2\2\u0112\u0113"+
		"\7\21\2\2\u0113\u0117\7\22\2\2\u0114\u0115\7\61\2\2\u0115\u0117\5$\23"+
		"\2\u0116\u0112\3\2\2\2\u0116\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u011b"+
		"\3\2\2\2\u0118\u011a\7\b\2\2\u0119\u0118\3\2\2\2\u011a\u011d\3\2\2\2\u011b"+
		"\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c\t\3\2\2\2\u011d\u011b\3\2\2\2"+
		"\u011e\u0123\5\60\31\2\u011f\u0123\5z>\2\u0120\u0123\5j\66\2\u0121\u0123"+
		"\5p9\2\u0122\u011e\3\2\2\2\u0122\u011f\3\2\2\2\u0122\u0120\3\2\2\2\u0122"+
		"\u0121\3\2\2\2\u0123\13\3\2\2\2\u0124\u012c\5r:\2\u0125\u012c\5p9\2\u0126"+
		"\u012c\5z>\2\u0127\u012c\5\60\31\2\u0128\u012c\5j\66\2\u0129\u012c\5\u0082"+
		"B\2\u012a\u012c\5^\60\2\u012b\u0124\3\2\2\2\u012b\u0125\3\2\2\2\u012b"+
		"\u0126\3\2\2\2\u012b\u0127\3\2\2\2\u012b\u0128\3\2\2\2\u012b\u0129\3\2"+
		"\2\2\u012b\u012a\3\2\2\2\u012c\r\3\2\2\2\u012d\u012f\5D#\2\u012e\u012d"+
		"\3\2\2\2\u012e\u012f\3\2\2\2\u012f\17\3\2\2\2\u0130\u0133\7\24\2\2\u0131"+
		"\u0134\5\22\n\2\u0132\u0134\7\22\2\2\u0133\u0131\3\2\2\2\u0133\u0132\3"+
		"\2\2\2\u0134\u013c\3\2\2\2\u0135\u0138\7\23\2\2\u0136\u0139\5\22\n\2\u0137"+
		"\u0139\7\22\2\2\u0138\u0136\3\2\2\2\u0138\u0137\3\2\2\2\u0139\u013b\3"+
		"\2\2\2\u013a\u0135\3\2\2\2\u013b\u013e\3\2\2\2\u013c\u013a\3\2\2\2\u013c"+
		"\u013d\3\2\2\2\u013d\u013f\3\2\2\2\u013e\u013c\3\2\2\2\u013f\u0140\7\26"+
		"\2\2\u0140\21\3\2\2\2\u0141\u0142\5\62\32\2\u0142\u0145\5$\23\2\u0143"+
		"\u0144\7\35\2\2\u0144\u0146\5\36\20\2\u0145\u0143\3\2\2\2\u0145\u0146"+
		"\3\2\2\2\u0146\23\3\2\2\2\u0147\u014a\7\24\2\2\u0148\u014b\5\32\16\2\u0149"+
		"\u014b\7\22\2\2\u014a\u0148\3\2\2\2\u014a\u0149\3\2\2\2\u014a\u014b\3"+
		"\2\2\2\u014b\u0153\3\2\2\2\u014c\u014f\7\23\2\2\u014d\u0150\5\32\16\2"+
		"\u014e\u0150\7\22\2\2\u014f\u014d\3\2\2\2\u014f\u014e\3\2\2\2\u0150\u0152"+
		"\3\2\2\2\u0151\u014c\3\2\2\2\u0152\u0155\3\2\2\2\u0153\u0151\3\2\2\2\u0153"+
		"\u0154\3\2\2\2\u0154\u0156\3\2\2\2\u0155\u0153\3\2\2\2\u0156\u0157\7\26"+
		"\2\2\u0157\25\3\2\2\2\u0158\u0159\7D\2\2\u0159\u015e\5\30\r\2\u015a\u015b"+
		"\7\23\2\2\u015b\u015d\5\30\r\2\u015c\u015a\3\2\2\2\u015d\u0160\3\2\2\2"+
		"\u015e\u015c\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u0162\3\2\2\2\u0160\u015e"+
		"\3\2\2\2\u0161\u0158\3\2\2\2\u0161\u0162\3\2\2\2\u0162\27\3\2\2\2\u0163"+
		"\u0165\5F$\2\u0164\u0163\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0166\3\2\2"+
		"\2\u0166\u0167\5$\23\2\u0167\u0168\7\35\2\2\u0168\u0169\5\32\16\2\u0169"+
		"\31\3\2\2\2\u016a\u016c\5F$\2\u016b\u016a\3\2\2\2\u016b\u016c\3\2\2\2"+
		"\u016c\u016d\3\2\2\2\u016d\u016e\5\34\17\2\u016e\33\3\2\2\2\u016f\u0170"+
		"\7\36\2\2\u0170\u0171\5\34\17\2\u0171\u0173\7\37\2\2\u0172\u0174\7 \2"+
		"\2\u0173\u0172\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0176\3\2\2\2\u0175\u0177"+
		"\5*\26\2\u0176\u0175\3\2\2\2\u0176\u0177\3\2\2\2\u0177\u018b\3\2\2\2\u0178"+
		"\u017a\5,\27\2\u0179\u017b\5*\26\2\u017a\u0179\3\2\2\2\u017a\u017b\3\2"+
		"\2\2\u017b\u018b\3\2\2\2\u017c\u017e\5\36\20\2\u017d\u017f\7 \2\2\u017e"+
		"\u017d\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u0181\3\2\2\2\u0180\u0182\5*"+
		"\26\2\u0181\u0180\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u018b\3\2\2\2\u0183"+
		"\u0185\7C\2\2\u0184\u0186\7 \2\2\u0185\u0184\3\2\2\2\u0185\u0186\3\2\2"+
		"\2\u0186\u0188\3\2\2\2\u0187\u0189\5*\26\2\u0188\u0187\3\2\2\2\u0188\u0189"+
		"\3\2\2\2\u0189\u018b\3\2\2\2\u018a\u016f\3\2\2\2\u018a\u0178\3\2\2\2\u018a"+
		"\u017c\3\2\2\2\u018a\u0183\3\2\2\2\u018b\35\3\2\2\2\u018c\u018d\7\17\2"+
		"\2\u018d\u018f\7\21\2\2\u018e\u018c\3\2\2\2\u018e\u018f\3\2\2\2\u018f"+
		"\u0190\3\2\2\2\u0190\u0195\5\"\22\2\u0191\u0192\7\21\2\2\u0192\u0194\5"+
		"\"\22\2\u0193\u0191\3\2\2\2\u0194\u0197\3\2\2\2\u0195\u0193\3\2\2\2\u0195"+
		"\u0196\3\2\2\2\u0196\37\3\2\2\2\u0197\u0195\3\2\2\2\u0198\u019d\7\22\2"+
		"\2\u0199\u019a\5\16\b\2\u019a\u019b\5\32\16\2\u019b\u019d\3\2\2\2\u019c"+
		"\u0198\3\2\2\2\u019c\u0199\3\2\2\2\u019d!\3\2\2\2\u019e\u01aa\5$\23\2"+
		"\u019f\u01a0\7\24\2\2\u01a0\u01a5\5 \21\2\u01a1\u01a2\7\23\2\2\u01a2\u01a4"+
		"\5 \21\2\u01a3\u01a1\3\2\2\2\u01a4\u01a7\3\2\2\2\u01a5\u01a3\3\2\2\2\u01a5"+
		"\u01a6\3\2\2\2\u01a6\u01a8\3\2\2\2\u01a7\u01a5\3\2\2\2\u01a8\u01a9\7\26"+
		"\2\2\u01a9\u01ab\3\2\2\2\u01aa\u019f\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab"+
		"#\3\2\2\2\u01ac\u01ad\t\2\2\2\u01ad%\3\2\2\2\u01ae\u01b1\5$\23\2\u01af"+
		"\u01b0\7\35\2\2\u01b0\u01b2\5\32\16\2\u01b1\u01af\3\2\2\2\u01b1\u01b2"+
		"\3\2\2\2\u01b2\'\3\2\2\2\u01b3\u01b8\5X-\2\u01b4\u01b5\5\62\32\2\u01b5"+
		"\u01b6\5\32\16\2\u01b6\u01b8\3\2\2\2\u01b7\u01b3\3\2\2\2\u01b7\u01b4\3"+
		"\2\2\2\u01b8)\3\2\2\2\u01b9\u01ba\7\21\2\2\u01ba\u01bb\5,\27\2\u01bb+"+
		"\3\2\2\2\u01bc\u01c5\7\36\2\2\u01bd\u01c2\5(\25\2\u01be\u01bf\7\23\2\2"+
		"\u01bf\u01c1\5(\25\2\u01c0\u01be\3\2\2\2\u01c1\u01c4\3\2\2\2\u01c2\u01c0"+
		"\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3\u01c6\3\2\2\2\u01c4\u01c2\3\2\2\2\u01c5"+
		"\u01bd\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01c8\7\37"+
		"\2\2\u01c8\u01c9\7*\2\2\u01c9\u01ca\5\32\16\2\u01ca-\3\2\2\2\u01cb\u01cc"+
		"\7\36\2\2\u01cc\u01d1\5&\24\2\u01cd\u01ce\7\23\2\2\u01ce\u01d0\5&\24\2"+
		"\u01cf\u01cd\3\2\2\2\u01d0\u01d3\3\2\2\2\u01d1\u01cf\3\2\2\2\u01d1\u01d2"+
		"\3\2\2\2\u01d2\u01d4\3\2\2\2\u01d3\u01d1\3\2\2\2\u01d4\u01d5\7\37\2\2"+
		"\u01d5/\3\2\2\2\u01d6\u01d7\5\62\32\2\u01d7\u01d9\t\3\2\2\u01d8\u01da"+
		"\5\20\t\2\u01d9\u01d8\3\2\2\2\u01d9\u01da\3\2\2\2\u01da\u01de\3\2\2\2"+
		"\u01db\u01dc\5\32\16\2\u01dc\u01dd\7\21\2\2\u01dd\u01df\3\2\2\2\u01de"+
		"\u01db\3\2\2\2\u01de\u01df\3\2\2\2\u01df\u01e2\3\2\2\2\u01e0\u01e3\5."+
		"\30\2\u01e1\u01e3\5&\24\2\u01e2\u01e0\3\2\2\2\u01e2\u01e1\3\2\2\2\u01e3"+
		"\u01e4\3\2\2\2\u01e4\u01ed\5\26\f\2\u01e5\u01e6\t\4\2\2\u01e6\u01ea\5"+
		"\u009aN\2\u01e7\u01e9\7\b\2\2\u01e8\u01e7\3\2\2\2\u01e9\u01ec\3\2\2\2"+
		"\u01ea\u01e8\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb\u01ee\3\2\2\2\u01ec\u01ea"+
		"\3\2\2\2\u01ed\u01e5\3\2\2\2\u01ed\u01ee\3\2\2\2\u01ee\u01fb\3\2\2\2\u01ef"+
		"\u01f1\5\u00b8]\2\u01f0\u01ef\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f1\u01f3"+
		"\3\2\2\2\u01f2\u01f4\5\u00ba^\2\u01f3\u01f2\3\2\2\2\u01f3\u01f4\3\2\2"+
		"\2\u01f4\u01fc\3\2\2\2\u01f5\u01f7\5\u00ba^\2\u01f6\u01f5\3\2\2\2\u01f6"+
		"\u01f7\3\2\2\2\u01f7\u01f9\3\2\2\2\u01f8\u01fa\5\u00b8]\2\u01f9\u01f8"+
		"\3\2\2\2\u01f9\u01fa\3\2\2\2\u01fa\u01fc\3\2\2\2\u01fb\u01f0\3\2\2\2\u01fb"+
		"\u01f6\3\2\2\2\u01fc\u0200\3\2\2\2\u01fd\u01ff\7\b\2\2\u01fe\u01fd\3\2"+
		"\2\2\u01ff\u0202\3\2\2\2\u0200\u01fe\3\2\2\2\u0200\u0201\3\2\2\2\u0201"+
		"\61\3\2\2\2\u0202\u0200\3\2\2\2\u0203\u0205\5\64\33\2\u0204\u0203\3\2"+
		"\2\2\u0205\u0208\3\2\2\2\u0206\u0204\3\2\2\2\u0206\u0207\3\2\2\2\u0207"+
		"\63\3\2\2\2\u0208\u0206\3\2\2\2\u0209\u020a\5\66\34\2\u020a\65\3\2\2\2"+
		"\u020b\u0213\5<\37\2\u020c\u0213\5B\"\2\u020d\u0213\5D#\2\u020e\u0213"+
		"\5F$\2\u020f\u0213\5@!\2\u0210\u0213\5:\36\2\u0211\u0213\58\35\2\u0212"+
		"\u020b\3\2\2\2\u0212\u020c\3\2\2\2\u0212\u020d\3\2\2\2\u0212\u020e\3\2"+
		"\2\2\u0212\u020f\3\2\2\2\u0212\u0210\3\2\2\2\u0212\u0211\3\2\2\2\u0213"+
		"\67\3\2\2\2\u0214\u0215\7Y\2\2\u02159\3\2\2\2\u0216\u0217\t\5\2\2\u0217"+
		";\3\2\2\2\u0218\u0219\t\6\2\2\u0219=\3\2\2\2\u021a\u0220\5$\23\2\u021b"+
		"\u0220\7L\2\2\u021c\u0220\7\20\2\2\u021d\u0220\7k\2\2\u021e\u0220\7m\2"+
		"\2\u021f\u021a\3\2\2\2\u021f\u021b\3\2\2\2\u021f\u021c\3\2\2\2\u021f\u021d"+
		"\3\2\2\2\u021f\u021e\3\2\2\2\u0220?\3\2\2\2\u0221\u0222\t\7\2\2\u0222"+
		"A\3\2\2\2\u0223\u0224\t\b\2\2\u0224C\3\2\2\2\u0225\u0226\t\t\2\2\u0226"+
		"E\3\2\2\2\u0227\u0229\5H%\2\u0228\u0227\3\2\2\2\u0229\u022a\3\2\2\2\u022a"+
		"\u0228\3\2\2\2\u022a\u022b\3\2\2\2\u022bG\3\2\2\2\u022c\u0230\7[\2\2\u022d"+
		"\u022e\5J&\2\u022e\u022f\7\35\2\2\u022f\u0231\3\2\2\2\u0230\u022d\3\2"+
		"\2\2\u0230\u0231\3\2\2\2\u0231\u0232\3\2\2\2\u0232\u0233\5P)\2\u0233I"+
		"\3\2\2\2\u0234\u0235\t\n\2\2\u0235K\3\2\2\2\u0236\u0237\5> \2\u0237\u0238"+
		"\7\30\2\2\u0238\u023a\3\2\2\2\u0239\u0236\3\2\2\2\u0239\u023a\3\2\2\2"+
		"\u023a\u023c\3\2\2\2\u023b\u023d\7\22\2\2\u023c\u023b\3\2\2\2\u023c\u023d"+
		"\3\2\2\2\u023d\u023e\3\2\2\2\u023e\u023f\5\u009aN\2\u023fM\3\2\2\2\u0240"+
		"\u0249\7\36\2\2\u0241\u0246\5L\'\2\u0242\u0243\7\23\2\2\u0243\u0245\5"+
		"L\'\2\u0244\u0242\3\2\2\2\u0245\u0248\3\2\2\2\u0246\u0244\3\2\2\2\u0246"+
		"\u0247\3\2\2\2\u0247\u024a\3\2\2\2\u0248\u0246\3\2\2\2\u0249\u0241\3\2"+
		"\2\2\u0249\u024a\3\2\2\2\u024a\u024b\3\2\2\2\u024b\u024c\7\37\2\2\u024c"+
		"O\3\2\2\2\u024d\u0252\5> \2\u024e\u024f\7\21\2\2\u024f\u0251\5> \2\u0250"+
		"\u024e\3\2\2\2\u0251\u0254\3\2\2\2\u0252\u0250\3\2\2\2\u0252\u0253\3\2"+
		"\2\2\u0253\u0256\3\2\2\2\u0254\u0252\3\2\2\2\u0255\u0257\5\24\13\2\u0256"+
		"\u0255\3\2\2\2\u0256\u0257\3\2\2\2\u0257\u0259\3\2\2\2\u0258\u025a\5N"+
		"(\2\u0259\u0258\3\2\2\2\u0259\u025a\3\2\2\2\u025aQ\3\2\2\2\u025b\u025c"+
		"\7a\2\2\u025c\u026d\5\u009aN\2\u025d\u025f\7c\2\2\u025e\u0260\5T+\2\u025f"+
		"\u025e\3\2\2\2\u025f\u0260\3\2\2\2\u0260\u0262\3\2\2\2\u0261\u0263\5\u009a"+
		"N\2\u0262\u0261\3\2\2\2\u0262\u0263\3\2\2\2\u0263\u026d\3\2\2\2\u0264"+
		"\u0266\7b\2\2\u0265\u0267\5T+\2\u0266\u0265\3\2\2\2\u0266\u0267\3\2\2"+
		"\2\u0267\u026d\3\2\2\2\u0268\u026a\7d\2\2\u0269\u026b\5T+\2\u026a\u0269"+
		"\3\2\2\2\u026a\u026b\3\2\2\2\u026b\u026d\3\2\2\2\u026c\u025b\3\2\2\2\u026c"+
		"\u025d\3\2\2\2\u026c\u0264\3\2\2\2\u026c\u0268\3\2\2\2\u026dS\3\2\2\2"+
		"\u026e\u0273\7[\2\2\u026f\u0274\5> \2\u0270\u0274\7r\2\2\u0271\u0274\7"+
		"q\2\2\u0272\u0274\7p\2\2\u0273\u026f\3\2\2\2\u0273\u0270\3\2\2\2\u0273"+
		"\u0271\3\2\2\2\u0273\u0272\3\2\2\2\u0274U\3\2\2\2\u0275\u0276\5> \2\u0276"+
		"\u0277\7[\2\2\u0277W\3\2\2\2\u0278\u0279\5$\23\2\u0279\u027a\7\35\2\2"+
		"\u027a\u027b\5\32\16\2\u027bY\3\2\2\2\u027c\u027e\5\62\32\2\u027d\u027f"+
		"\7A\2\2\u027e\u027d\3\2\2\2\u027e\u027f\3\2\2\2\u027f\u0281\3\2\2\2\u0280"+
		"\u0282\t\3\2\2\u0281\u0280\3\2\2\2\u0281\u0282\3\2\2\2\u0282\u0283\3\2"+
		"\2\2\u0283\u0286\5X-\2\u0284\u0285\7\30\2\2\u0285\u0287\5\u009aN\2\u0286"+
		"\u0284\3\2\2\2\u0286\u0287\3\2\2\2\u0287[\3\2\2\2\u0288\u0289\5\62\32"+
		"\2\u0289\u028a\7e\2\2\u028a\u028c\3\2\2\2\u028b\u0288\3\2\2\2\u028b\u028c"+
		"\3\2\2\2\u028c\u028d\3\2\2\2\u028d\u0296\7\36\2\2\u028e\u0293\5Z.\2\u028f"+
		"\u0290\7\23\2\2\u0290\u0292\5Z.\2\u0291\u028f\3\2\2\2\u0292\u0295\3\2"+
		"\2\2\u0293\u0291\3\2\2\2\u0293\u0294\3\2\2\2\u0294\u0297\3\2\2\2\u0295"+
		"\u0293\3\2\2\2\u0296\u028e\3\2\2\2\u0296\u0297\3\2\2\2\u0297\u0298\3\2"+
		"\2\2\u0298\u0299\7\37\2\2\u0299]\3\2\2\2\u029a\u029b\5\62\32\2\u029b\u029c"+
		"\7e\2\2\u029c\u029f\5x=\2\u029d\u029e\7\35\2\2\u029e\u02a0\5`\61\2\u029f"+
		"\u029d\3\2\2\2\u029f\u02a0\3\2\2\2\u02a0\u02a1\3\2\2\2\u02a1\u02a5\5\u0080"+
		"A\2\u02a2\u02a4\7\b\2\2\u02a3\u02a2\3\2\2\2\u02a4\u02a7\3\2\2\2\u02a5"+
		"\u02a3\3\2\2\2\u02a5\u02a6\3\2\2\2\u02a6_\3\2\2\2\u02a7\u02a5\3\2\2\2"+
		"\u02a8\u02a9\7f\2\2\u02a9\u02ad\5N(\2\u02aa\u02ab\7g\2\2\u02ab\u02ad\5"+
		"N(\2\u02ac\u02a8\3\2\2\2\u02ac\u02aa\3\2\2\2\u02ada\3\2\2\2\u02ae\u02b0"+
		"\5\24\13\2\u02af\u02ae\3\2\2\2\u02af\u02b0\3\2\2\2\u02b0\u02b1\3\2\2\2"+
		"\u02b1\u02b3\5N(\2\u02b2\u02b4\5\u00dan\2\u02b3\u02b2\3\2\2\2\u02b3\u02b4"+
		"\3\2\2\2\u02b4\u02ba\3\2\2\2\u02b5\u02b6\5\24\13\2\u02b6\u02b7\5\u00da"+
		"n\2\u02b7\u02ba\3\2\2\2\u02b8\u02ba\5\u00dan\2\u02b9\u02af\3\2\2\2\u02b9"+
		"\u02b5\3\2\2\2\u02b9\u02b8\3\2\2\2\u02bac\3\2\2\2\u02bb\u02bd\5\36\20"+
		"\2\u02bc\u02be\5\24\13\2\u02bd\u02bc\3\2\2\2\u02bd\u02be\3\2\2\2\u02be"+
		"\u02bf\3\2\2\2\u02bf\u02c0\5N(\2\u02c0e\3\2\2\2\u02c1\u02c2\5\36\20\2"+
		"\u02c2\u02c3\7B\2\2\u02c3\u02c4\5\u009aN\2\u02c4g\3\2\2\2\u02c5\u02c9"+
		"\5d\63\2\u02c6\u02c9\5\36\20\2\u02c7\u02c9\5f\64\2\u02c8\u02c5\3\2\2\2"+
		"\u02c8\u02c6\3\2\2\2\u02c8\u02c7\3\2\2\2\u02c9i\3\2\2\2\u02ca\u02cb\5"+
		"\62\32\2\u02cb\u02cc\5l\67\2\u02cc\u02ce\5$\23\2\u02cd\u02cf\5\20\t\2"+
		"\u02ce\u02cd\3\2\2\2\u02ce\u02cf\3\2\2\2\u02cf\u02d1\3\2\2\2\u02d0\u02d2"+
		"\5\\/\2\u02d1\u02d0\3\2\2\2\u02d1\u02d2\3\2\2\2\u02d2\u02df\3\2\2\2\u02d3"+
		"\u02d5\7\35\2\2\u02d4\u02d6\5F$\2\u02d5\u02d4\3\2\2\2\u02d5\u02d6\3\2"+
		"\2\2\u02d6\u02d7\3\2\2\2\u02d7\u02dc\5h\65\2\u02d8\u02d9\7\23\2\2\u02d9"+
		"\u02db\5h\65\2\u02da\u02d8\3\2\2\2\u02db\u02de\3\2\2\2\u02dc\u02da\3\2"+
		"\2\2\u02dc\u02dd\3\2\2\2\u02dd\u02e0\3\2\2\2\u02de\u02dc\3\2\2\2\u02df"+
		"\u02d3\3\2\2\2\u02df\u02e0\3\2\2\2\u02e0\u02e1\3\2\2\2\u02e1\u02e4\5\26"+
		"\f\2\u02e2\u02e5\5t;\2\u02e3\u02e5\5\u0084C\2\u02e4\u02e2\3\2\2\2\u02e4"+
		"\u02e3\3\2\2\2\u02e5\u02e9\3\2\2\2\u02e6\u02e8\7\b\2\2\u02e7\u02e6\3\2"+
		"\2\2\u02e8\u02eb\3\2\2\2\u02e9\u02e7\3\2\2\2\u02e9\u02ea\3\2\2\2\u02ea"+
		"k\3\2\2\2\u02eb\u02e9\3\2\2\2\u02ec\u02ed\t\13\2\2\u02edm\3\2\2\2\u02ee"+
		"\u02ef\7\35\2\2\u02ef\u02f4\5h\65\2\u02f0\u02f1\7\23\2\2\u02f1\u02f3\5"+
		"h\65\2\u02f2\u02f0\3\2\2\2\u02f3\u02f6\3\2\2\2\u02f4\u02f2\3\2\2\2\u02f4"+
		"\u02f5\3\2\2\2\u02f5o\3\2\2\2\u02f6\u02f4\3\2\2\2\u02f7\u02f8\5\62\32"+
		"\2\u02f8\u02f9\7j\2\2\u02f9\u02fb\5$\23\2\u02fa\u02fc\5\\/\2\u02fb\u02fa"+
		"\3\2\2\2\u02fb\u02fc\3\2\2\2\u02fc\u02fe\3\2\2\2\u02fd\u02ff\5n8\2\u02fe"+
		"\u02fd\3\2\2\2\u02fe\u02ff\3\2\2\2\u02ff\u0300\3\2\2\2\u0300\u0304\5t"+
		";\2\u0301\u0303\7\b\2\2\u0302\u0301\3\2\2\2\u0303\u0306\3\2\2\2\u0304"+
		"\u0302\3\2\2\2\u0304\u0305\3\2\2\2\u0305q\3\2\2\2\u0306\u0304\3\2\2\2"+
		"\u0307\u0308\5\62\32\2\u0308\u0309\7k\2\2\u0309\u030b\7j\2\2\u030a\u030c"+
		"\5n8\2\u030b\u030a\3\2\2\2\u030b\u030c\3\2\2\2\u030c\u030d\3\2\2\2\u030d"+
		"\u0311\5t;\2\u030e\u0310\7\b\2\2\u030f\u030e\3\2\2\2\u0310\u0313\3\2\2"+
		"\2\u0311\u030f\3\2\2\2\u0311\u0312\3\2\2\2\u0312s\3\2\2\2\u0313\u0311"+
		"\3\2\2\2\u0314\u0315\7\t\2\2\u0315\u0316\5v<\2\u0316\u0317\7\n\2\2\u0317"+
		"\u0319\3\2\2\2\u0318\u0314\3\2\2\2\u0318\u0319\3\2\2\2\u0319u\3\2\2\2"+
		"\u031a\u031c\5\f\7\2\u031b\u031a\3\2\2\2\u031c\u031f\3\2\2\2\u031d\u031b"+
		"\3\2\2\2\u031d\u031e\3\2\2\2\u031ew\3\2\2\2\u031f\u031d\3\2\2\2\u0320"+
		"\u0329\7\36\2\2\u0321\u0326\5Z.\2\u0322\u0323\7\23\2\2\u0323\u0325\5Z"+
		".\2\u0324\u0322\3\2\2\2\u0325\u0328\3\2\2\2\u0326\u0324\3\2\2\2\u0326"+
		"\u0327\3\2\2\2\u0327\u032a\3\2\2\2\u0328\u0326\3\2\2\2\u0329\u0321\3\2"+
		"\2\2\u0329\u032a\3\2\2\2\u032a\u032b\3\2\2\2\u032b\u032c\7\37\2\2\u032c"+
		"y\3\2\2\2\u032d\u032e\5\62\32\2\u032e\u0330\7l\2\2\u032f\u0331\5\20\t"+
		"\2\u0330\u032f\3\2\2\2\u0330\u0331\3\2\2\2\u0331\u0336\3\2\2\2\u0332\u0333"+
		"\5\32\16\2\u0333\u0334\7\21\2\2\u0334\u0337\3\2\2\2\u0335\u0337\5F$\2"+
		"\u0336\u0332\3\2\2\2\u0336\u0335\3\2\2\2\u0336\u0337\3\2\2\2\u0337\u0338"+
		"\3\2\2\2\u0338\u033a\5$\23\2\u0339\u033b\5\20\t\2\u033a\u0339\3\2\2\2"+
		"\u033a\u033b\3\2\2\2\u033b\u033c\3\2\2\2\u033c\u033f\5x=\2\u033d\u033e"+
		"\7\35\2\2\u033e\u0340\5\32\16\2\u033f\u033d\3\2\2\2\u033f\u0340\3\2\2"+
		"\2\u0340\u0341\3\2\2\2\u0341\u0343\5\26\f\2\u0342\u0344\5~@\2\u0343\u0342"+
		"\3\2\2\2\u0343\u0344\3\2\2\2\u0344\u0348\3\2\2\2\u0345\u0347\7\b\2\2\u0346"+
		"\u0345\3\2\2\2\u0347\u034a\3\2\2\2\u0348\u0346\3\2\2\2\u0348\u0349\3\2"+
		"\2\2\u0349{\3\2\2\2\u034a\u0348\3\2\2\2\u034b\u034d\7\b\2\2\u034c\u034b"+
		"\3\2\2\2\u034d\u0350\3\2\2\2\u034e\u034c\3\2\2\2\u034e\u034f\3\2\2\2\u034f"+
		"\u035e\3\2\2\2\u0350\u034e\3\2\2\2\u0351\u035b\5\u00c4c\2\u0352\u0354"+
		"\7\b\2\2\u0353\u0352\3\2\2\2\u0354\u0357\3\2\2\2\u0355\u0353\3\2\2\2\u0355"+
		"\u0356\3\2\2\2\u0356\u0358\3\2\2\2\u0357\u0355\3\2\2\2\u0358\u035a\5\u00c4"+
		"c\2\u0359\u0355\3\2\2\2\u035a\u035d\3\2\2\2\u035b\u0359\3\2\2\2\u035b"+
		"\u035c\3\2\2\2\u035c\u035f\3\2\2\2\u035d\u035b\3\2\2\2\u035e\u0351\3\2"+
		"\2\2\u035e\u035f\3\2\2\2\u035f\u0363\3\2\2\2\u0360\u0362\7\b\2\2\u0361"+
		"\u0360\3\2\2\2\u0362\u0365\3\2\2\2\u0363\u0361\3\2\2\2\u0363\u0364\3\2"+
		"\2\2\u0364}\3\2\2\2\u0365\u0363\3\2\2\2\u0366\u036a\5\u0080A\2\u0367\u0368"+
		"\7\30\2\2\u0368\u036a\5\u009aN\2\u0369\u0366\3\2\2\2\u0369\u0367\3\2\2"+
		"\2\u036a\177\3\2\2\2\u036b\u036c\7\t\2\2\u036c\u036d\5|?\2\u036d\u036e"+
		"\7\n\2\2\u036e\u0081\3\2\2\2\u036f\u0370\7m\2\2\u0370\u0374\5\u0080A\2"+
		"\u0371\u0373\7\b\2\2\u0372\u0371\3\2\2\2\u0373\u0376\3\2\2\2\u0374\u0372"+
		"\3\2\2\2\u0374\u0375\3\2\2\2\u0375\u0083\3\2\2\2\u0376\u0374\3\2\2\2\u0377"+
		"\u0378\7\t\2\2\u0378\u037b\5\u0086D\2\u0379\u037a\7\b\2\2\u037a\u037c"+
		"\5v<\2\u037b\u0379\3\2\2\2\u037b\u037c\3\2\2\2\u037c\u037d\3\2\2\2\u037d"+
		"\u037e\7\n\2\2\u037e\u0085\3\2\2\2\u037f\u0381\5\u0088E\2\u0380\u0382"+
		"\7\23\2\2\u0381\u0380\3\2\2\2\u0381\u0382\3\2\2\2\u0382\u0384\3\2\2\2"+
		"\u0383\u037f\3\2\2\2\u0384\u0387\3\2\2\2\u0385\u0383\3\2\2\2\u0385\u0386"+
		"\3\2\2\2\u0386\u0087\3\2\2\2\u0387\u0385\3\2\2\2\u0388\u0389\5\62\32\2"+
		"\u0389\u0390\5$\23\2\u038a\u038c\7\35\2\2\u038b\u038d\5F$\2\u038c\u038b"+
		"\3\2\2\2\u038c\u038d\3\2\2\2\u038d\u038e\3\2\2\2\u038e\u0391\5d\63\2\u038f"+
		"\u0391\5N(\2\u0390\u038a\3\2\2\2\u0390\u038f\3\2\2\2\u0390\u0391\3\2\2"+
		"\2\u0391\u0392\3\2\2\2\u0392\u0393\5t;\2\u0393\u0089\3\2\2\2\u0394\u0395"+
		"\7n\2\2\u0395\u0396\7\36\2\2\u0396\u0397\5\u009aN\2\u0397\u0398\7\37\2"+
		"\2\u0398\u039c\5\u009aN\2\u0399\u039b\7\b\2\2\u039a\u0399\3\2\2\2\u039b"+
		"\u039e\3\2\2\2\u039c\u039a\3\2\2\2\u039c\u039d\3\2\2\2\u039d\u03a1\3\2"+
		"\2\2\u039e\u039c\3\2\2\2\u039f\u03a0\7o\2\2\u03a0\u03a2\5\u009aN\2\u03a1"+
		"\u039f\3\2\2\2\u03a1\u03a2\3\2\2\2\u03a2\u008b\3\2\2\2\u03a3\u03a4\7t"+
		"\2\2\u03a4\u03a8\5\u0080A\2\u03a5\u03a7\5\u008eH\2\u03a6\u03a5\3\2\2\2"+
		"\u03a7\u03aa\3\2\2\2\u03a8\u03a6\3\2\2\2\u03a8\u03a9\3\2\2\2\u03a9\u03ac"+
		"\3\2\2\2\u03aa\u03a8\3\2\2\2\u03ab\u03ad\5\u0090I\2\u03ac\u03ab\3\2\2"+
		"\2\u03ac\u03ad\3\2\2\2\u03ad\u008d\3\2\2\2\u03ae\u03af\7u\2\2\u03af\u03b1"+
		"\7\36\2\2\u03b0\u03b2\5F$\2\u03b1\u03b0\3\2\2\2\u03b1\u03b2\3\2\2\2\u03b2"+
		"\u03b3\3\2\2\2\u03b3\u03b4\5$\23\2\u03b4\u03b5\7\35\2\2\u03b5\u03b6\5"+
		"\36\20\2\u03b6\u03b7\7\37\2\2\u03b7\u03b8\5\u0080A\2\u03b8\u008f\3\2\2"+
		"\2\u03b9\u03ba\7v\2\2\u03ba\u03bb\5\u0080A\2\u03bb\u0091\3\2\2\2\u03bc"+
		"\u03c0\5\u0094K\2\u03bd\u03c0\5\u0096L\2\u03be\u03c0\5\u0098M\2\u03bf"+
		"\u03bc\3\2\2\2\u03bf\u03bd\3\2\2\2\u03bf\u03be\3\2\2\2\u03c0\u0093\3\2"+
		"\2\2\u03c1\u03c2\7r\2\2\u03c2\u03c4\7\36\2\2\u03c3\u03c5\5F$\2\u03c4\u03c3"+
		"\3\2\2\2\u03c4\u03c5\3\2\2\2\u03c5\u03c8\3\2\2\2\u03c6\u03c9\5.\30\2\u03c7"+
		"\u03c9\5&\24\2\u03c8\u03c6\3\2\2\2\u03c8\u03c7\3\2\2\2\u03c9\u03ca\3\2"+
		"\2\2\u03ca\u03cb\7/\2\2\u03cb\u03cc\5\u009aN\2\u03cc\u03cd\7\37\2\2\u03cd"+
		"\u03ce\5\u009aN\2\u03ce\u0095\3\2\2\2\u03cf\u03d0\7q\2\2\u03d0\u03d1\7"+
		"\36\2\2\u03d1\u03d2\5\u009aN\2\u03d2\u03d3\7\37\2\2\u03d3\u03d4\5\u009a"+
		"N\2\u03d4\u0097\3\2\2\2\u03d5\u03d6\7s\2\2\u03d6\u03d7\5\u009aN\2\u03d7"+
		"\u03d8\7q\2\2\u03d8\u03d9\7\36\2\2\u03d9\u03da\5\u009aN\2\u03da\u03db"+
		"\7\37\2\2\u03db\u0099\3\2\2\2\u03dc\u03e2\5\u009cO\2\u03dd\u03de\5\u00d2"+
		"j\2\u03de\u03df\5\u009cO\2\u03df\u03e1\3\2\2\2\u03e0\u03dd\3\2\2\2\u03e1"+
		"\u03e4\3\2\2\2\u03e2\u03e0\3\2\2\2\u03e2\u03e3\3\2\2\2\u03e3\u009b\3\2"+
		"\2\2\u03e4\u03e2\3\2\2\2\u03e5\u03ea\5\u009eP\2\u03e6\u03e7\7!\2\2\u03e7"+
		"\u03e9\5\u009eP\2\u03e8\u03e6\3\2\2\2\u03e9\u03ec\3\2\2\2\u03ea\u03e8"+
		"\3\2\2\2\u03ea\u03eb\3\2\2\2\u03eb\u009d\3\2\2\2\u03ec\u03ea\3\2\2\2\u03ed"+
		"\u03f2\5\u00a0Q\2\u03ee\u03ef\7\"\2\2\u03ef\u03f1\5\u00a0Q\2\u03f0\u03ee"+
		"\3\2\2\2\u03f1\u03f4\3\2\2\2\u03f2\u03f0\3\2\2\2\u03f2\u03f3\3\2\2\2\u03f3"+
		"\u009f\3\2\2\2\u03f4\u03f2\3\2\2\2\u03f5\u03fb\5\u00a2R\2\u03f6\u03f7"+
		"\5\u00d0i\2\u03f7\u03f8\5\u00a2R\2\u03f8\u03fa\3\2\2\2\u03f9\u03f6\3\2"+
		"\2\2\u03fa\u03fd\3\2\2\2\u03fb\u03f9\3\2\2\2\u03fb\u03fc\3\2\2\2\u03fc"+
		"\u00a1\3\2\2\2\u03fd\u03fb\3\2\2\2\u03fe\u0404\5\u00a4S\2\u03ff\u0400"+
		"\5\u00ceh\2\u0400\u0401\5\u00a4S\2\u0401\u0403\3\2\2\2\u0402\u03ff\3\2"+
		"\2\2\u0403\u0406\3\2\2\2\u0404\u0402\3\2\2\2\u0404\u0405\3\2\2\2\u0405"+
		"\u00a3\3\2\2\2\u0406\u0404\3\2\2\2\u0407\u040d\5\u00a6T\2\u0408\u0409"+
		"\5\u00caf\2\u0409\u040a\5\u00a6T\2\u040a\u040c\3\2\2\2\u040b\u0408\3\2"+
		"\2\2\u040c\u040f\3\2\2\2\u040d\u040b\3\2\2\2\u040d\u040e\3\2\2\2\u040e"+
		"\u041a\3\2\2\2\u040f\u040d\3\2\2\2\u0410\u0411\5\u00a6T\2\u0411\u0412"+
		"\5\u00b2Z\2\u0412\u041a\3\2\2\2\u0413\u0417\5\u00a6T\2\u0414\u0415\5\u00d8"+
		"m\2\u0415\u0416\5\32\16\2\u0416\u0418\3\2\2\2\u0417\u0414\3\2\2\2\u0417"+
		"\u0418\3\2\2\2\u0418\u041a\3\2\2\2\u0419\u0407\3\2\2\2\u0419\u0410\3\2"+
		"\2\2\u0419\u0413\3\2\2\2\u041a\u00a5\3\2\2\2\u041b\u0420\5\u00a8U\2\u041c"+
		"\u041d\7#\2\2\u041d\u041f\5\u00a8U\2\u041e\u041c\3\2\2\2\u041f\u0422\3"+
		"\2\2\2\u0420\u041e\3\2\2\2\u0420\u0421\3\2\2\2\u0421\u00a7\3\2\2\2\u0422"+
		"\u0420\3\2\2\2\u0423\u0429\5\u00aaV\2\u0424\u0425\5$\23\2\u0425\u0426"+
		"\5\u00aaV\2\u0426\u0428\3\2\2\2\u0427\u0424\3\2\2\2\u0428\u042b\3\2\2"+
		"\2\u0429\u0427\3\2\2\2\u0429\u042a\3\2\2\2\u042a\u00a9\3\2\2\2\u042b\u0429"+
		"\3\2\2\2\u042c\u0431\5\u00acW\2\u042d\u042e\7%\2\2\u042e\u0430\5\u00ac"+
		"W\2\u042f\u042d\3\2\2\2\u0430\u0433\3\2\2\2\u0431\u042f\3\2\2\2\u0431"+
		"\u0432\3\2\2\2\u0432\u00ab\3\2\2\2\u0433\u0431\3\2\2\2\u0434\u043a\5\u00ae"+
		"X\2\u0435\u0436\5\u00c8e\2\u0436\u0437\5\u00aeX\2\u0437\u0439\3\2\2\2"+
		"\u0438\u0435\3\2\2\2\u0439\u043c\3\2\2\2\u043a\u0438\3\2\2\2\u043a\u043b"+
		"\3\2\2\2\u043b\u00ad\3\2\2\2\u043c\u043a\3\2\2\2\u043d\u0443\5\u00b0Y"+
		"\2\u043e\u043f\5\u00c6d\2\u043f\u0440\5\u00b0Y\2\u0440\u0442\3\2\2\2\u0441"+
		"\u043e\3\2\2\2\u0442\u0445\3\2\2\2\u0443\u0441\3\2\2\2\u0443\u0444\3\2"+
		"\2\2\u0444\u00af\3\2\2\2\u0445\u0443\3\2\2\2\u0446\u044c\5\u00b2Z\2\u0447"+
		"\u0448\5\u00ccg\2\u0448\u0449\5\u00b2Z\2\u0449\u044b\3\2\2\2\u044a\u0447"+
		"\3\2\2\2\u044b\u044e\3\2\2\2\u044c\u044a\3\2\2\2\u044c\u044d\3\2\2\2\u044d"+
		"\u00b1\3\2\2\2\u044e\u044c\3\2\2\2\u044f\u0451\5\u00d6l\2\u0450\u044f"+
		"\3\2\2\2\u0451\u0454\3\2\2\2\u0452\u0450\3\2\2\2\u0452\u0453\3\2\2\2\u0453"+
		"\u0455\3\2\2\2\u0454\u0452\3\2\2\2\u0455\u0456\5\u00b4[\2\u0456\u00b3"+
		"\3\2\2\2\u0457\u0458\5\u00be`\2\u0458\u0459\5b\62\2\u0459\u0469\3\2\2"+
		"\2\u045a\u045e\5\u00be`\2\u045b\u045d\5\u00d4k\2\u045c\u045b\3\2\2\2\u045d"+
		"\u0460\3\2\2\2\u045e\u045c\3\2\2\2\u045e\u045f\3\2\2\2\u045f\u0469\3\2"+
		"\2\2\u0460\u045e\3\2\2\2\u0461\u0465\5\u00b6\\\2\u0462\u0464\5\u00d4k"+
		"\2\u0463\u0462\3\2\2\2\u0464\u0467\3\2\2\2\u0465\u0463\3\2\2\2\u0465\u0466"+
		"\3\2\2\2\u0466\u0469\3\2\2\2\u0467\u0465\3\2\2\2\u0468\u0457\3\2\2\2\u0468"+
		"\u045a\3\2\2\2\u0468\u0461\3\2\2\2\u0469\u00b5\3\2\2\2\u046a\u046e\5\36"+
		"\20\2\u046b\u046d\7 \2\2\u046c\u046b\3\2\2\2\u046d\u0470\3\2\2\2\u046e"+
		"\u046c\3\2\2\2\u046e\u046f\3\2\2\2\u046f\u0472\3\2\2\2\u0470\u046e\3\2"+
		"\2\2\u0471\u046a\3\2\2\2\u0471\u0472\3\2\2\2\u0472\u0473\3\2\2\2\u0473"+
		"\u0476\7&\2\2\u0474\u0477\5> \2\u0475\u0477\7h\2\2\u0476\u0474\3\2\2\2"+
		"\u0476\u0475\3\2\2\2\u0477\u0479\3\2\2\2\u0478\u047a\5\24\13\2\u0479\u0478"+
		"\3\2\2\2\u0479\u047a\3\2\2\2\u047a\u00b7\3\2\2\2\u047b\u047c\5\62\32\2"+
		"\u047c\u047d\7E\2\2\u047d\u0489\3\2\2\2\u047e\u047f\5\62\32\2\u047f\u0480"+
		"\7E\2\2\u0480\u0481\7\36\2\2\u0481\u0484\7\37\2\2\u0482\u0483\7\35\2\2"+
		"\u0483\u0485\5\32\16\2\u0484\u0482\3\2\2\2\u0484\u0485\3\2\2\2\u0485\u0486"+
		"\3\2\2\2\u0486\u0487\5~@\2\u0487\u0489\3\2\2\2\u0488\u047b\3\2\2\2\u0488"+
		"\u047e\3\2\2\2\u0489\u00b9\3\2\2\2\u048a\u048b\5\62\32\2\u048b\u048c\7"+
		"F\2\2\u048c\u0499\3\2\2\2\u048d\u048e\5\62\32\2\u048e\u048f\7F\2\2\u048f"+
		"\u0490\7\36\2\2\u0490\u0493\5\62\32\2\u0491\u0494\7x\2\2\u0492\u0494\5"+
		"X-\2\u0493\u0491\3\2\2\2\u0493\u0492\3\2\2\2\u0494\u0495\3\2\2\2\u0495"+
		"\u0496\7\37\2\2\u0496\u0497\5~@\2\u0497\u0499\3\2\2\2\u0498\u048a\3\2"+
		"\2\2\u0498\u048d\3\2\2\2\u0499\u00bb\3\2\2\2\u049a\u04a4\7\16\2\2\u049b"+
		"\u04a3\7}\2\2\u049c\u049d\7~\2\2\u049d\u049e\5\u009aN\2\u049e\u049f\7"+
		"\n\2\2\u049f\u04a3\3\2\2\2\u04a0\u04a3\7\177\2\2\u04a1\u04a3\n\f\2\2\u04a2"+
		"\u049b\3\2\2\2\u04a2\u049c\3\2\2\2\u04a2\u04a0\3\2\2\2\u04a2\u04a1\3\2"+
		"\2\2\u04a3\u04a6\3\2\2\2\u04a4\u04a2\3\2\2\2\u04a4\u04a5\3\2\2\2\u04a5"+
		"\u04a7\3\2\2\2\u04a6\u04a4\3\2\2\2\u04a7\u04b6\7|\2\2\u04a8\u04b1\7\r"+
		"\2\2\u04a9\u04aa\7\u0083\2\2\u04aa\u04ab\5\u009aN\2\u04ab\u04ac\7\n\2"+
		"\2\u04ac\u04b0\3\2\2\2\u04ad\u04b0\7\u0084\2\2\u04ae\u04b0\n\r\2\2\u04af"+
		"\u04a9\3\2\2\2\u04af\u04ad\3\2\2\2\u04af\u04ae\3\2\2\2\u04b0\u04b3\3\2"+
		"\2\2\u04b1\u04af\3\2\2\2\u04b1\u04b2\3\2\2\2\u04b2\u04b4\3\2\2\2\u04b3"+
		"\u04b1\3\2\2\2\u04b4\u04b6\7\u0081\2\2\u04b5\u049a\3\2\2\2\u04b5\u04a8"+
		"\3\2\2\2\u04b6\u00bd\3\2\2\2\u04b7\u04b8\7\36\2\2\u04b8\u04b9\5\u009a"+
		"N\2\u04b9\u04ba\7\37\2\2\u04ba\u04dc\3\2\2\2\u04bb\u04dc\5\u00c0a\2\u04bc"+
		"\u04dc\5\u00dep\2\u04bd\u04bf\7f\2\2\u04be\u04c0\5T+\2\u04bf\u04be\3\2"+
		"\2\2\u04bf\u04c0\3\2\2\2\u04c0\u04dc\3\2\2\2\u04c1\u04c6\7g\2\2\u04c2"+
		"\u04c3\7\24\2\2\u04c3\u04c4\5\32\16\2\u04c4\u04c5\7\26\2\2\u04c5\u04c7"+
		"\3\2\2\2\u04c6\u04c2\3\2\2\2\u04c6\u04c7\3\2\2\2\u04c7\u04c9\3\2\2\2\u04c8"+
		"\u04ca\5T+\2\u04c9\u04c8\3\2\2\2\u04c9\u04ca\3\2\2\2\u04ca\u04dc\3\2\2"+
		"\2\u04cb\u04dc\5\u008aF\2\u04cc\u04dc\5\u00e4s\2\u04cd\u04dc\5\u008cG"+
		"\2\u04ce\u04dc\5\u00e2r\2\u04cf\u04dc\5R*\2\u04d0\u04dc\5\u0092J\2\u04d1"+
		"\u04dc\5> \2\u04d2\u04d3\5> \2\u04d3\u04d4\7 \2\2\u04d4\u04dc\3\2\2\2"+
		"\u04d5\u04d6\5> \2\u04d6\u04d7\5\24\13\2\u04d7\u04dc\3\2\2\2\u04d8\u04d9"+
		"\7w\2\2\u04d9\u04dc\5> \2\u04da\u04dc\7\17\2\2\u04db\u04b7\3\2\2\2\u04db"+
		"\u04bb\3\2\2\2\u04db\u04bc\3\2\2\2\u04db\u04bd\3\2\2\2\u04db\u04c1\3\2"+
		"\2\2\u04db\u04cb\3\2\2\2\u04db\u04cc\3\2\2\2\u04db\u04cd\3\2\2\2\u04db"+
		"\u04ce\3\2\2\2\u04db\u04cf\3\2\2\2\u04db\u04d0\3\2\2\2\u04db\u04d1\3\2"+
		"\2\2\u04db\u04d2\3\2\2\2\u04db\u04d5\3\2\2\2\u04db\u04d8\3\2\2\2\u04db"+
		"\u04da\3\2\2\2\u04dc\u00bf\3\2\2\2\u04dd\u04e6\7\'\2\2\u04de\u04e6\7("+
		"\2\2\u04df\u04e6\5\u00bc_\2\u04e0\u04e6\7\7\2\2\u04e1\u04e6\7\6\2\2\u04e2"+
		"\u04e6\7\13\2\2\u04e3\u04e6\7\f\2\2\u04e4\u04e6\7)\2\2\u04e5\u04dd\3\2"+
		"\2\2\u04e5\u04de\3\2\2\2\u04e5\u04df\3\2\2\2\u04e5\u04e0\3\2\2\2\u04e5"+
		"\u04e1\3\2\2\2\u04e5\u04e2\3\2\2\2\u04e5\u04e3\3\2\2\2\u04e5\u04e4\3\2"+
		"\2\2\u04e6\u00c1\3\2\2\2\u04e7\u04ec\5z>\2\u04e8\u04ec\5\60\31\2\u04e9"+
		"\u04ec\5j\66\2\u04ea\u04ec\5p9\2\u04eb\u04e7\3\2\2\2\u04eb\u04e8\3\2\2"+
		"\2\u04eb\u04e9\3\2\2\2\u04eb\u04ea\3\2\2\2\u04ec\u00c3\3\2\2\2\u04ed\u04f0"+
		"\5\u00c2b\2\u04ee\u04f0\5\u009aN\2\u04ef\u04ed\3\2\2\2\u04ef\u04ee\3\2"+
		"\2\2\u04f0\u00c5\3\2\2\2\u04f1\u04f2\t\16\2\2\u04f2\u00c7\3\2\2\2\u04f3"+
		"\u04f4\t\17\2\2\u04f4\u00c9\3\2\2\2\u04f5\u04f6\t\20\2\2\u04f6\u00cb\3"+
		"\2\2\2\u04f7\u04f8\t\21\2\2\u04f8\u00cd\3\2\2\2\u04f9\u04fa\t\22\2\2\u04fa"+
		"\u00cf\3\2\2\2\u04fb\u04fc\t\23\2\2\u04fc\u00d1\3\2\2\2\u04fd\u04fe\t"+
		"\24\2\2\u04fe\u00d3\3\2\2\2\u04ff\u0508\79\2\2\u0500\u0508\78\2\2\u0501"+
		"\u0508\7;\2\2\u0502\u0508\5b\62\2\u0503\u0508\5\u00e0q\2\u0504\u0505\5"+
		"\u00dco\2\u0505\u0506\5\u00b4[\2\u0506\u0508\3\2\2\2\u0507\u04ff\3\2\2"+
		"\2\u0507\u0500\3\2\2\2\u0507\u0501\3\2\2\2\u0507\u0502\3\2\2\2\u0507\u0503"+
		"\3\2\2\2\u0507\u0504\3\2\2\2\u0508\u00d5\3\2\2\2\u0509\u0511\7.\2\2\u050a"+
		"\u0511\7-\2\2\u050b\u0511\79\2\2\u050c\u0511\78\2\2\u050d\u0511\7<\2\2"+
		"\u050e\u0511\5F$\2\u050f\u0511\5V,\2\u0510\u0509\3\2\2\2\u0510\u050a\3"+
		"\2\2\2\u0510\u050b\3\2\2\2\u0510\u050c\3\2\2\2\u0510\u050d\3\2\2\2\u0510"+
		"\u050e\3\2\2\2\u0510\u050f\3\2\2\2\u0511\u00d7\3\2\2\2\u0512\u0513\t\25"+
		"\2\2\u0513\u00d9\3\2\2\2\u0514\u0515\7[\2\2\u0515\u0517\5P)\2\u0516\u0514"+
		"\3\2\2\2\u0517\u051a\3\2\2\2\u0518\u0516\3\2\2\2\u0518\u0519\3\2\2\2\u0519"+
		"\u051c\3\2\2\2\u051a\u0518\3\2\2\2\u051b\u051d\5V,\2\u051c\u051b\3\2\2"+
		"\2\u051c\u051d\3\2\2\2\u051d\u051e\3\2\2\2\u051e\u051f\5\u00dep\2\u051f"+
		"\u00db\3\2\2\2\u0520\u0526\7\21\2\2\u0521\u0523\7 \2\2\u0522\u0524\7\21"+
		"\2\2\u0523\u0522\3\2\2\2\u0523\u0524\3\2\2\2\u0524\u0526\3\2\2\2\u0525"+
		"\u0520\3\2\2\2\u0525\u0521\3\2\2\2\u0526\u00dd\3\2\2\2\u0527\u0528\7\t"+
		"\2\2\u0528\u0529\5|?\2\u0529\u052a\7\n\2\2\u052a\u053f\3\2\2\2\u052b\u0538"+
		"\7\t\2\2\u052c\u052d\5\62\32\2\u052d\u052e\5$\23\2\u052e\u0535\3\2\2\2"+
		"\u052f\u0530\7\23\2\2\u0530\u0531\5\62\32\2\u0531\u0532\5$\23\2\u0532"+
		"\u0534\3\2\2\2\u0533\u052f\3\2\2\2\u0534\u0537\3\2\2\2\u0535\u0533\3\2"+
		"\2\2\u0535\u0536\3\2\2\2\u0536\u0539\3\2\2\2\u0537\u0535\3\2\2\2\u0538"+
		"\u052c\3\2\2\2\u0538\u0539\3\2\2\2\u0539\u053a\3\2\2\2\u053a\u053b\7*"+
		"\2\2\u053b\u053c\5|?\2\u053c\u053d\7\n\2\2\u053d\u053f\3\2\2\2\u053e\u0527"+
		"\3\2\2\2\u053e\u052b\3\2\2\2\u053f\u00df\3\2\2\2\u0540\u0549\7=\2\2\u0541"+
		"\u0546\5\u009aN\2\u0542\u0543\7\23\2\2\u0543\u0545\5\u009aN\2\u0544\u0542"+
		"\3\2\2\2\u0545\u0548\3\2\2\2\u0546\u0544\3\2\2\2\u0546\u0547\3\2\2\2\u0547"+
		"\u054a\3\2\2\2\u0548\u0546\3\2\2\2\u0549\u0541\3\2\2\2\u0549\u054a\3\2"+
		"\2\2\u054a\u054b\3\2\2\2\u054b\u054c\7>\2\2\u054c\u00e1\3\2\2\2\u054d"+
		"\u0557\7j\2\2\u054e\u054f\7\35\2\2\u054f\u0554\5h\65\2\u0550\u0551\7\23"+
		"\2\2\u0551\u0553\5h\65\2\u0552\u0550\3\2\2\2\u0553\u0556\3\2\2\2\u0554"+
		"\u0552\3\2\2\2\u0554\u0555\3\2\2\2\u0555\u0558\3\2\2\2\u0556\u0554\3\2"+
		"\2\2\u0557\u054e\3\2\2\2\u0557\u0558\3\2\2\2\u0558\u0559\3\2\2\2\u0559"+
		"\u055a\5t;\2\u055a\u00e3\3\2\2\2\u055b\u0560\7p\2\2\u055c\u055d\7\36\2"+
		"\2\u055d\u055e\5\u009aN\2\u055e\u055f\7\37\2\2\u055f\u0561\3\2\2\2\u0560"+
		"\u055c\3\2\2\2\u0560\u0561\3\2\2\2\u0561\u0562\3\2\2\2\u0562\u0566\7\t"+
		"\2\2\u0563\u0565\5\u00e6t\2\u0564\u0563\3\2\2\2\u0565\u0568\3\2\2\2\u0566"+
		"\u0564\3\2\2\2\u0566\u0567\3\2\2\2\u0567\u0569\3\2\2\2\u0568\u0566\3\2"+
		"\2\2\u0569\u056a\7\n\2\2\u056a\u00e5\3\2\2\2\u056b\u0570\5\u00e8u\2\u056c"+
		"\u056d\7\23\2\2\u056d\u056f\5\u00e8u\2\u056e\u056c\3\2\2\2\u056f\u0572"+
		"\3\2\2\2\u0570\u056e\3\2\2\2\u0570\u0571\3\2\2\2\u0571\u0573\3\2\2\2\u0572"+
		"\u0570\3\2\2\2\u0573\u0574\7*\2\2\u0574\u0578\5\u009aN\2\u0575\u0577\7"+
		"\b\2\2\u0576\u0575\3\2\2\2\u0577\u057a\3\2\2\2\u0578\u0576\3\2\2\2\u0578"+
		"\u0579\3\2\2\2\u0579\u0585\3\2\2\2\u057a\u0578\3\2\2\2\u057b\u057c\7o"+
		"\2\2\u057c\u057d\7*\2\2\u057d\u0581\5\u009aN\2\u057e\u0580\7\b\2\2\u057f"+
		"\u057e\3\2\2\2\u0580\u0583\3\2\2\2\u0581\u057f\3\2\2\2\u0581\u0582\3\2"+
		"\2\2\u0582\u0585\3\2\2\2\u0583\u0581\3\2\2\2\u0584\u056b\3\2\2\2\u0584"+
		"\u057b\3\2\2\2\u0585\u00e7\3\2\2\2\u0586\u058c\5\u009aN\2\u0587\u0588"+
		"\t\20\2\2\u0588\u058c\5\u009aN\2\u0589\u058a\t\25\2\2\u058a\u058c\5\32"+
		"\16\2\u058b\u0586\3\2\2\2\u058b\u0587\3\2\2\2\u058b\u0589\3\2\2\2\u058c"+
		"\u00e9\3\2\2\2\u00ba\u00ee\u00f2\u00f7\u0100\u0106\u010f\u0116\u011b\u0122"+
		"\u012b\u012e\u0133\u0138\u013c\u0145\u014a\u014f\u0153\u015e\u0161\u0164"+
		"\u016b\u0173\u0176\u017a\u017e\u0181\u0185\u0188\u018a\u018e\u0195\u019c"+
		"\u01a5\u01aa\u01b1\u01b7\u01c2\u01c5\u01d1\u01d9\u01de\u01e2\u01ea\u01ed"+
		"\u01f0\u01f3\u01f6\u01f9\u01fb\u0200\u0206\u0212\u021f\u022a\u0230\u0239"+
		"\u023c\u0246\u0249\u0252\u0256\u0259\u025f\u0262\u0266\u026a\u026c\u0273"+
		"\u027e\u0281\u0286\u028b\u0293\u0296\u029f\u02a5\u02ac\u02af\u02b3\u02b9"+
		"\u02bd\u02c8\u02ce\u02d1\u02d5\u02dc\u02df\u02e4\u02e9\u02f4\u02fb\u02fe"+
		"\u0304\u030b\u0311\u0318\u031d\u0326\u0329\u0330\u0336\u033a\u033f\u0343"+
		"\u0348\u034e\u0355\u035b\u035e\u0363\u0369\u0374\u037b\u0381\u0385\u038c"+
		"\u0390\u039c\u03a1\u03a8\u03ac\u03b1\u03bf\u03c4\u03c8\u03e2\u03ea\u03f2"+
		"\u03fb\u0404\u040d\u0417\u0419\u0420\u0429\u0431\u043a\u0443\u044c\u0452"+
		"\u045e\u0465\u0468\u046e\u0471\u0476\u0479\u0484\u0488\u0493\u0498\u04a2"+
		"\u04a4\u04af\u04b1\u04b5\u04bf\u04c6\u04c9\u04db\u04e5\u04eb\u04ef\u0507"+
		"\u0510\u0518\u051c\u0523\u0525\u0535\u0538\u053e\u0546\u0549\u0554\u0557"+
		"\u0560\u0566\u0570\u0578\u0581\u0584\u058b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}