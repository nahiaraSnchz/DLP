grammar Grammar;

import Tokenizer;


@header {
    import ast.*;
	import ast.type.*;
	import ast.declaration.*;
	import ast.statement.*;
	import ast.expression.*;
}


program returns[Program ast] locals [List<Declaration> declarations = new ArrayList<>()]
	: (operator1=variable_definition {$declarations.add($operator1.ast);} 
	| operator2=struct_definition {$declarations.add($operator2.ast);} 
	| operator3=function_definition {$declarations.add($operator3.ast);}
	  )* EOF{$ast = new Program($declarations);}
    ;

declaration returns[Declaration ast]
	: variable_definition { $ast = $variable_definition.ast; }
	| struct_definition { $ast = $struct_definition.ast; }
	| function_definition { $ast = $function_definition.ast; }
	;

statement returns[Statement ast] locals [List<Expression> expressions = new ArrayList<>(), List<Statement> statements = new ArrayList<>()]
	: 'return'
	  {$ast = new Return_statement(null);}
	|'return' e1=expression
	 { $ast = new Return_statement($e1.ast); }
	| 'print' (expression { $expressions.add($expression.ast);})* 
	 { $ast = new Print_statement($expressions); }
	| 'printsp' (expression { $expressions.add($expression.ast);})*  
	 { $ast = new Printsp_statement($expressions); }
	| 'println' (expression {$expressions.add($expression.ast);})*
	 { $ast = new Println_statement($expressions); }
	| 'read' expression 
	 { $ast = new Read_statement($expression.ast); }
	| 'while' '(' expression ')' '{' (operator2=statement {$statements.add($operator2.ast);} )* '}'
	 { $ast = new While_statement($expression.ast, $statements); }
	| 'if' '(' expression ')'  ('{'b1=block {$statements=$b1.ast;} '}')?  ( 'else' '{' b2=block {$statements=$b2.ast;} '}')?
	 { $ast = new If_statement($expression.ast, $statements, $statements); }
	| assignment
	 { $ast = $assignment.ast; }
	| ID '(' call_function ')'
	  { $ast = new Function_call_statement($ID, $call_function.expressions); }
	;



block returns[List<Statement> ast = new ArrayList<Statement>()]
	: statement { $ast.add($statement.ast); }
	| (statement { $ast.add($statement.ast); })* 
	;

call_function returns[List<Expression> expressions = new ArrayList<>()]
	: (e1=expression {$expressions.add($e1.ast);} (',' e2=expression  {$expressions.add($e2.ast);} )* )? 	
	;

assignment returns[Assigment_statement ast]
	: left=expression '=' right=expression 
	 { $ast = new Assigment_statement($left.ast, $right.ast); }
	;

expression returns[Expression ast]
	: '!' expression
	 { $ast = new Unary_expression($expression.ast); }
	|left=expression operador=('&&' | '||') right=expression
	 { $ast = new Logical_expression($left.ast, $operador, $right.ast); }
	| left=expression operador=('+' | '-' | '*' | '/' | '%') right=expression
	 { $ast = new Arythmetic_expression($left.ast, $operador, $right.ast); }
	| '<' simpleType '>' expression
	 { $ast = new Cast_expression($simpleType.ast, $expression.ast); }
	| left=expression operador=('<' | '>' | '<=' | '>=' | '==' | '!=') right=expression
	 { $ast = new Comparative_expression($left.ast, $operador, $right.ast); }
	| '(' expression ')'
	 { $ast = new Parenthesized_expression($expression.ast); }
	| ID '(' call_function ')'
	 { $ast = new Expression_call($ID, $call_function.expressions); }
	| exp1=expression '.' ID
	 { $ast = new Struct_access($exp1.ast, $ID); }
	| left=expression '[' right=expression ']'
	 { $ast = new Array_access($left.ast, $right.ast); }
	| INT_LITERAL
	 { $ast = new IntE_literal($INT_LITERAL); }
	| INT_REAL
	 { $ast = new IntE_real($INT_REAL); }
	| CHAR_LITERAL
	 { $ast = new CharE_literal($CHAR_LITERAL); }
	| ID
	 { $ast = new Variable($ID); }
	
	;



variable_definition returns[Variable_definition ast]
	: 'var' ID ':' simpleType {$ast = new Variable_definition($ID, $simpleType.ast);}
	| ID ':' simpleType {$ast = new Variable_definition($ID, $simpleType.ast);}
	;



struct_definition returns[Struct_definition ast] locals [List<Variable_definition> variables = new ArrayList<>()]
	: 'struct' ID '{' (variable_definition {$variables.add($variable_definition.ast);})* '}' 
	
	{$ast = new Struct_definition($ID, $variables);}
	;

function_definition returns[Function_definition ast] locals [List<Variable_definition> params_definitions = new ArrayList<>(),List<Variable_definition> variable_definitions = new ArrayList<>(), List<Statement> statements = new ArrayList<>()]
	: ID '(' (l1=variable_definition {$params_definitions.add($l1.ast);} (',' l2=variable_definition {$params_definitions.add($l2.ast);})*)* ')' '{' (variable_definition {$variable_definitions.add($variable_definition.ast);})* (s1=statement {$statements.add($s1.ast);})* '}' 
	
	 { $ast = new Function_definition($ID, $params_definitions, new Void_type(), $variable_definitions, $statements);}

	|  ID '('  (l1=variable_definition {$params_definitions.add($l1.ast);} (',' l2=variable_definition {$params_definitions.add($l2.ast);})*)* ')' (':' t=type ) '{'  (variable_definition {$variable_definitions.add($variable_definition.ast);})* (s2=statement {$statements.add($s2.ast);})* '}' 
	 { $ast = new Function_definition($ID, $params_definitions, $t.ast, $variable_definitions, $statements);}
	;






simpleType returns[Type ast]
 	: 'int' { $ast = new Int_type(); }
    | 'float' { $ast = new Real_type(); }
    | 'char' { $ast = new Char_type(); }
    | ID { $ast = new Struct_type($ID); }
	| '[' INT_LITERAL ']' simpleType { $ast = new Array_type($INT_LITERAL, $simpleType.ast); }
 ;

 type returns [Type ast]
	: 'void' { $ast = new Void_type(); }
	| simpleType {$ast = $simpleType.ast;}
	;






	



