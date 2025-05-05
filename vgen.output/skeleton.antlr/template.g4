// Generated with VGen 2.0.0

grammar Grammar;

@header {
	    import ast.type.*;
	    import ast.statement.*;
	    import ast.expression.*;
	    import ast.declaration.*;
	    import ast.*;
}

program returns[Program ast]
    : declarations+=declaration*          { $ast = new Program($declarations); }                 
	;

declaration returns[Declaration ast]
    : name=IDENT type                     { $ast = new Variable_definition($name, $type.ast); }  
    | name=IDENT variable_definitions+=variable_definition* { $ast = new Struct_definition($name, $variable_definitions); }
    | name=IDENT params+=variable_definition* type variable_definitions+=variable_definition* statements+=statement* { $ast = new Function_definition($name, $params, $type.ast, $variable_definitions, $statements); }
	;

type returns[Type ast]
    :                                     { $ast = new Int_type(); }                             
    |                                     { $ast = new Real_type(); }                            
    |                                     { $ast = new Char_type(); }                            
    | name=IDENT                          { $ast = new Struct_type($name); }                     
    | name=IDENT type                     { $ast = new Array_type($name, $type.ast); }           
    |                                     { $ast = new Void_type(); }                            
	;

variable_definition returns[Variable_definition ast]
    : name=IDENT type                     { $ast = new Variable_definition($name, $type.ast); }  
	;

statement returns[Statement ast]
    : expression?                         { $ast = new Return_statement(($expression.ctx == null) ? null : $expression.ast); }
    | expressions+=expression*            { $ast = new Print_statement($expressions); }          
    | expressions+=expression*            { $ast = new Printsp_statement($expressions); }        
    | expressions+=expression*            { $ast = new Println_statement($expressions); }        
    | expression                          { $ast = new Read_statement($expression.ast); }        
    | expression statements+=statement*   { $ast = new While_statement($expression.ast, $statements); }
    | expression st1+=statement* st2+=statement* { $ast = new If_statement($expression.ast, $st1, $st2); }
    | left=expression right=expression    { $ast = new Assigment_statement($left.ast, $right.ast); }
    | name=IDENT expressions+=expression* { $ast = new Function_call_statement($name, $expressions); }
	;

expression returns[Expression ast]
    : expression                          { $ast = new Unary_expression($expression.ast); }      
    | left=expression operador=IDENT right=expression { $ast = new Arythmetic_expression($left.ast, $operador, $right.ast); }
    | type expression                     { $ast = new Cast_expression($type.ast, $expression.ast); }
    | left=expression operador=IDENT right=expression { $ast = new Comparative_expression($left.ast, $operador, $right.ast); }
    | left=expression operador=IDENT right=expression { $ast = new Logical_expression($left.ast, $operador, $right.ast); }
    | expression                          { $ast = new Parenthesized_expression($expression.ast); }
    | name=IDENT expressions+=expression* { $ast = new Expression_call($name, $expressions); }   
    | expression name=IDENT               { $ast = new Struct_access($expression.ast, $name); }  
    | left=expression right=expression    { $ast = new Array_access($left.ast, $right.ast); }    
    | name=IDENT                          { $ast = new IntE_literal($name); }                    
    | name=IDENT                          { $ast = new IntE_real($name); }                       
    | name=IDENT                          { $ast = new CharE_literal($name); }                   
    | name=IDENT                          { $ast = new Variable($name); }                        
	;


// ---------------------------------------------------------------
// Tokens

IDENT: [a-zA-Z_][a-zA-Z0-9_]*;
