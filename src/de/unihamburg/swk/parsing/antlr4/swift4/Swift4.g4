/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2014 by Bart Kiers (original author) and Alexandre Vitorelli (contributor -> ported to CSharp)
 * Copyright (c) 2017 by Ivan Kochurkin (Positive Technologies):
    added ECMAScript 6 support, cleared and transformed to the universal grammar.
 *
 * Permission is hereby granted, free of charge, to any person
 * obtaining a copy of this software and associated documentation
 * files (the "Software"), to deal in the Software without
 * restriction, including without limitation the rights to use,
 * copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the
 * Software is furnished to do so, subject to the following
 * conditions:
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES
 * OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT
 * HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
 * WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
 * FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR
 * OTHER DEALINGS IN THE SOFTWARE.
 */
grammar Swift4;



program
	: importStatement* (typeDefinition|functionDeclaration|globalVariableDeclaration)* noise?
    ;

globalVariableDeclaration
	: globalVarDeclaration
	| globalLetDeclaration
	;
	
globalVarDeclaration
	: attributes? declarationModifiers? VAR identifier noise?
	;
globalLetDeclaration
	: attributes? declarationModifiers? LET identifier noise?
	;
		
initializerDeclaration
	:initializerHead genericParameterClause? parameterClause THROWS? functionBody
	;

initializerHead
	:attributes? declarationModifiers? INIT (QuestionMark | Not)? 
	;
	
functionDeclaration
	:functionHead identifier genericParameterClause? functionSignature functionBody
	;
			
functionHead
	: attributes? declarationModifiers? FUNC
	;
	
declarationModifiers
	: (accessModifier | declarationModifier)+
	;

declarationModifier
	:CLASS
	|CONVENIENCE
	|DYNAMIC
	|FINAL
	|INFIX
	|LAZY
	|OPTIONAL
	|OVERRIDE
	|POSTFIX
	|PREFIX
	|REQUIRED
	|STATIC
	|UNOWNED
	|WEAK
	;
	
functionSignature
	: parameterClause THROWS? functionResult?
	;

functionResult
	: ARROW attributes? type
	;
functionBody
	: codeBlock?
	;

codeBlock
	: OpenBrace noisyCode codeBlock* noisyCode CloseBrace
	| OpenBrace  CloseBrace
	;
	
noisyCode
	: (noise |variableDeclaration | letDeclaration)*
	;
	
variableDeclaration
	: attributes? declarationModifiers? VAR identifier noise?
	;
letDeclaration
	: attributes? declarationModifiers? LET identifier noise?
	;
	
genericParameterClause
	: LessThan genericParameters MoreThan
	;

genericParameters
	: genericParameter
	| genericParameter Comma genericParameters
	;
	
genericParameter
	: typeName
	| typeName Colon typeidentifier
	;

typeName
	: identifier
	;
	
typeidentifier
	: identifier
	;


parameterClause
	: OpenParen CloseParen
	|OpenParen parameterList CloseParen
	;

parameterList
	:parameter
	|parameter Comma parameterList
	;

parameter
	:externalParametername? localParameterName Colon INOUT? type defaultParamInitializer?
	;

defaultParamInitializer
	: Assign expression
	;
	
expression
	: noise?
	;
	
type
	: typeidentifier (QuestionMark|Not)?
	| OpenBracket type CloseBracket (QuestionMark|Not)?
	| functionType (QuestionMark|Not)?
	| OpenParen type CloseParen (QuestionMark|Not)?
	| tupleType (QuestionMark|Not)?
	| dictionaryType (QuestionMark|Not)?
	| ANY (QuestionMark|Not)?
	| SELF 
	| UPPERCASEVOID
	;

dictionaryType
	: OpenBracket type Colon type CloseBracket
	;
	
functionType
	: attributes? functionTypeArgumentClause THROWS? ARROW type
	;

functionTypeArgumentClause
	: OpenParen CloseParen
	| OpenParen functionTypeArguments Ellipsis? CloseParen
	;
	
functionTypeArguments
	: functionTypeArgument
	|functionTypeArgument Comma functionTypeArguments
	;
	
functionTypeArgument
	:attributes? INOUT? type
	| identifier Colon INOUT? type
	;
	
tupleType
	:OpenParen tupleElement Comma tupleElements CloseParen
	;
	
tupleElements
	: tupleElement
	| tupleElement Comma tupleElements
	;

tupleElement
	: identifier Colon INOUT? type
	|type
	;
	
externalParametername
	: identifier
	;
	
localParameterName
	: identifier
	;


attributes
	: attribute+
	;
	
attribute
	: AT identifier attributeArgumentsClause?
	;
	
attributeArgumentsClause
	:OpenParen balancedTokens? CloseParen
	;
	
balancedTokens
	:balancedToken+
	;
	
balancedToken
	: OpenParen balancedTokens? CloseParen
	| OpenBrace balancedTokens? CloseBrace
	| OpenBracket balancedTokens? CloseBracket
	| identifier
	| specialCharacter
	;
	
typeDefinition
	: classDeclaration
	| enumDeclaration
	| structDeclaration
    ;
structDeclaration
	: attributes? FINAL? accessModifier? FINAL? STRUCT identifier genericParameterClause? typeInheritanceClause? typeBody noise?
	;

enumDeclaration
	: attributes? accessModifier? (unionStyleEnum| rawValueStyleEnum)
	;
	
rawValueStyleEnum
	: ENUM identifier genericParameterClause? typeInheritanceClause? OpenBrace rawValueStyleEnumMembers CloseBrace
	;
	
rawValueStyleEnumMembers
	: rawValueStyleEnumMember rawValueStyleEnumMembers?
	;
	
rawValueStyleEnumMember
	: attributes? CASE rawValueEnumCaseList
	;

rawValueEnumCaseList
	: rawValueEnumCase 
	| rawValueEnumCase Comma rawValueEnumCaseList?
	;
	
rawValueEnumCase
	: identifier noise?
	;
	
unionStyleEnum
	: INDIRECT? ENUM identifier genericParameterClause? typeInheritanceClause? OpenBrace unionStyleEnumMembers CloseBrace
	;
	
unionStyleEnumMembers
	:unionStyleEnumMember unionStyleEnumMembers?
	;

unionStyleEnumMember
	: (noise| caseClause)+
	;

caseClause
	: attributes? INDIRECT? CASE enumCaseList
	;
	
enumCaseList	
	: enumCase
	| enumCase Comma enumCaseList
	;
	
enumCase	
	: identifier tupleType?
	;
	

importStatement
	: IMPORT identifier
	;
	
classDeclaration
	: attributes? FINAL? accessModifier? FINAL? CLASS identifier genericParameterClause? typeInheritanceClause? typeBody noise?
    ;
	
typeInheritanceClause
	: Colon typeInheritances
	;
	
typeInheritances
	: identifier
	|identifier Comma typeInheritances
	;
	
typeBody
	: OpenBrace (functionDeclaration|initializerDeclaration|typeVariableDeclaration)* CloseBrace
	;
	
noise
	: (ANYCHARS|keywordNoise|specialCharacter|identifier)+?
	;
	
typeVariableDeclaration
	:typeVarDeclaration
	|typeLetDeclaration
	;
	
typeVarDeclaration
	: attributes? declarationModifiers? VAR identifier noise?
	;
typeLetDeclaration
	: attributes? declarationModifiers? LET identifier noise?
	;
	
identifier
	:Identifier
	|FOR
	|IN
	|WITH
	;

keywordNoise
	: ANY
	| INIT
	| BREAK
	| IMPORT
	| DO
	| INSTANCEOF
	| TYPEOF
	| CASE
	| ELSE
	| NEW
	| CATCH
	| FINALLY
	| FINAL
	| RETURN
	| VOID
	| UPPERCASEVOID
	| CONTINUE
	| FOR
	| SWITCH
	| WHILE
	| DEBUGGER
	| SELF
	| WITH
	| DEFAULT
	| IF
	| THROW
	| THROWS
	| DELETE
	| IN
	| TRY
	| AT
	| INOUT
	| INDIRECT
	| CONVENIENCE
	| DYNAMIC
	| INFIX
	| LAZY
	| OPTIONAL
	| OVERRIDE
	| POSTFIX
	| PREFIX
	| REQUIRED
	| UNOWNED
	| WEAK
	| STATIC
	;

specialCharacter
	:OpenParen
	|CloseParen
	|OpenBracket
	|CloseBracket
	|OpenBrace
	|CloseBrace
	|SemiColon
	|Comma
	|Assign
	|QuestionMark
	|Colon
	|Ellipsis
	|Dot
	|Plus
	|PlusPlus
	|Minus
	|BitNot
	|Not
	|Multiply
	|Divide
	|Modulus
	|RightShiftArithmetic
	|LeftShiftArithmetic
	|RightShiftLogical
	|LessThan
	|MoreThan
	|LessThanEquals
	|GreaterThanEquals
	|Equals_
	|NotEquals
	|BitAnd
	|BitXOr
	|BitOr
	|And
	|Or
	|MultiplyAssign
	|DivideAssign
	|ModulusAssign
	|PlusAssign
	|MinusAssign
	|LeftShiftArithmeticAssign
	|RightShiftArithmeticAssign
	|RightShiftLogicalAssign
	|BitAndAssign
	|BitXorAssign
	|BitOrAssign
	;

accessModifier
	:PRIVATE
	|FILEPRIVATE
	|INTERNAL
	|PUBLIC
	|MUTATING
	;
	
	
/// SpecialCharacters
OpenBracket:                    '[';
CloseBracket:                   ']';
OpenParen:                      '(';
CloseParen:                     ')';
OpenBrace:                      '{';
CloseBrace:                     '}';
SemiColon:                      ';';
Comma:                          ',';
Assign:                         '=';
QuestionMark:                   '?';
Colon:                          ':';
Ellipsis:                       '...';
Dot:                            '.';
PlusPlus:                       '++';
MinusMinus:                     '--';
Plus:                           '+';
ARROW:                          '->';
Minus:                          '-';
BitNot:                         '~';
Not:                            '!';
Multiply:                       '*';
Divide:                         '/';
Modulus:                        '%';
RightShiftArithmetic:           '>>';
LeftShiftArithmetic:            '<<';
RightShiftLogical:              '>>>';
LessThan:                       '<';
MoreThan:                       '>';
LessThanEquals:                 '<=';
GreaterThanEquals:              '>=';
Equals_:                        '==';
NotEquals:                      '!=';
IdentityEquals:                 '===';
IdentityNotEquals:              '!==';
BitAnd:                         '&';
BitXOr:                         '^';
BitOr:                          '|';
And:                            '&&';
Or:                             '||';
MultiplyAssign:                 '*=';
DivideAssign:                   '/=';
ModulusAssign:                  '%=';
PlusAssign:                     '+=';
MinusAssign:                    '-=';
LeftShiftArithmeticAssign:      '<<=';
RightShiftArithmeticAssign:     '>>=';
RightShiftLogicalAssign:        '>>>=';
BitAndAssign:                   '&=';
BitXorAssign:                   '^=';
BitOrAssign:                    '|=';

/// Keywords
AT:								'@';
ANY:                            'any';
IMPORT:                      	'import';
CLASS:                          'class';
ENUM:                           'enum';
EXTENSION:                      'extension';
PROTOCOL:                      	'protocol';
STRUCT:                      	'struct';
BREAK:                          'break';
DO:                             'do';
INSTANCEOF:                     'instanceof';
TYPEOF:                         'typeof';
CASE:                           'case';
ELSE:                           'else';
NEW:                            'new';
VAR:                            'var';
LET:							'let';
FINAL:                          'final';
CATCH:                          'catch';
FINALLY:                        'finally';
RETURN:                         'return';
VOID:                           'void';
UPPERCASEVOID:                  'Void';
CONTINUE:                       'continue';
FOR:                            'for';
SWITCH:                         'switch';
WHILE:                          'while';
DEBUGGER:                       'debugger';
FUNC:                           'func';
SELF:                           'self';
WITH:                           'with';
DEFAULT:                        'default';
IF:                             'if';
THROW:                          'throw';
THROWS:                         'throws';
DELETE:                         'delete';
IN:                             'in';
TRY:                            'try';
INOUT:                          'inout';
INDIRECT:                       'indirect';
INIT:							'init';
/// access modifiers
PRIVATE:						'private';
FILEPRIVATE:					'fileprivate';
INTERNAL:						'inernal';
PUBLIC:							'public';
MUTATING:						'mutating';
CONVENIENCE: 					'convenience';
DYNAMIC: 						'dynamic';
INFIX: 							'infix';
LAZY: 							'lazy';
OPTIONAL:						'optional';
OVERRIDE:						'override';
POSTFIX:						'postfix';
PREFIX: 						'prefix';
REQUIRED: 						'required';
UNOWNED: 						'unowned';
WEAK: 							'weak';
STATIC: 						'static';


/// noise and Whitespace
Identifier          : ('a'..'z' | 'A' .. 'Z'| '0'..'9' | '_'| '$')+;

WS  :  [ \t\r\n\u000C]+ -> skip
    ;

COMMENT
    :   '/*' .*? '*/' -> skip
    ;

LINE_COMMENT
    :   '//' ~[\r\n]* -> skip
    ;	


	
ANYCHARS     : .+?;


