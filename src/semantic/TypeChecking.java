/**
 * MLang. Programming Language Design Tutorial
 * @author Raúl Izquierdo (raul@uniovi.es)
 */

package semantic;



import java.lang.reflect.Array;

import ast.*;
import ast.declaration.Function_definition;
import ast.declaration.Struct_definition;
import ast.declaration.Variable_definition;
import ast.expression.Array_access;
import ast.expression.Arythmetic_expression;
import ast.expression.Cast_expression;
import ast.expression.CharE_literal;
import ast.expression.Comparative_expression;
import ast.expression.Expression;
import ast.expression.Expression_call;
import ast.expression.IntE_literal;
import ast.expression.IntE_real;
import ast.expression.Logical_expression;
import ast.expression.Parenthesized_expression;
import ast.expression.Struct_access;
import ast.expression.Unary_expression;
import ast.expression.Variable;
import ast.statement.Assigment_statement;
import ast.statement.Function_call_statement;
import ast.statement.If_statement;
import ast.statement.Print_statement;
import ast.statement.Println_statement;
import ast.statement.Printsp_statement;
import ast.statement.Read_statement;
import ast.statement.Return_statement;
import ast.statement.While_statement;
import ast.statement.Statement;
import ast.type.*;
import main.ErrorManager;
import visitor.DefaultVisitor;

// This class will be implemented in type checking phase

public class TypeChecking extends DefaultVisitor {

    private ErrorManager errorManager;

    public TypeChecking(ErrorManager errorManager) {
        this.errorManager = errorManager;
    }

    public void process(AST ast) {
        ast.accept(this, null);
    }

    // # ----------------------------------------------------------
    /*
    * Implement visit methods here.
    */



	// class Function_definition(String name, List<Local_variable> local_variables, Optional<Type> type, List<Variable_definition> variable_definitions, List<Statement> statements)
	@Override
	public Object visit(Function_definition function_definition, Object param) {

        for (Statement statement : function_definition.getStatements()) {
            // guardar la funcion en la que se encuentra
            statement.setFunction(function_definition);
        }

        if (function_definition.getParams() != null) {
            for (Variable_definition params : function_definition.getParams()) {
                params.accept(this, param);
                // comprobar que el tipo de la variable es un tipo simple
                if (!(simpleType(params.getType()) || params.getType() instanceof Void_type)) {
                    predicate(false, "Parameter type must be a simple type", params);
                }
            }
        }

        if (function_definition.getType() != null) {
            function_definition.getType().accept(this, param);
            if (!(simpleType(function_definition.getType()) || function_definition.getType() instanceof Void_type)) {
                predicate(false, "Function type must be a simple type or void", function_definition);
            }
        }
        
        
		function_definition.getVariable_definitions().forEach(variable_definition -> variable_definition.accept(this, param));
		function_definition.getStatements().forEach(statement -> statement.accept(this, param));
        

		return null;
	}

	// class Return_statement(Optional<Expression> expression)
	// phase TypeChecking { Function_definition function }
	@Override
	public Object visit(Return_statement return_statement, Object param) {

		// return_statement.getExpression().ifPresent(expression -> expression.accept(this, param));
		super.visit(return_statement, param);

        if (return_statement.getFunction().getType().getClass() == Void_type.class) {
            predicate(!return_statement.getExpression().isPresent(), "The return value is void", return_statement);
        }
        else {
            if (!return_statement.getExpression().isPresent()){
                predicate(false, "The return value is not present", return_statement);
            }
            else {
                // Comprobar que el tipo de return sea de mismo tipo que la funcion en la que está
            predicate(sameType(return_statement.getExpression().get().getTypeExpression(), return_statement.getFunction().getType()), "Return type must be a simple type", return_statement);
            }
            
        }
        
		return null;
	}

	// class Print_statement(List<Expression> expressions)
	// phase TypeChecking { Function_definition function }
	@Override
	public Object visit(Print_statement print_statement, Object param) {

		// print_statement.getExpressions().forEach(expression -> expression.accept(this, param));
		super.visit(print_statement, param);



        // Comprobar que el tipo de las expresiones sea de tipo simple o void
        for (Expression expression : print_statement.getExpressions()) {
            //if (expression.getTypeExpression() instanceof Array_type) {
                //predicate(simpleType(((Array_type) expression.getTypeExpression()).getType()), "Print type must be a simple type", expression);
            //} 
            //else {
                predicate(simpleType(expression.getTypeExpression()), "Print type must be a simple type", expression);
            //}
            
            predicate(!(expression.getTypeExpression() instanceof Void_type), "The expression to be printed cannot be of type void.", expression);
        }

		return null;
	}

	// class Printsp_statement(List<Expression> expressions)
	// phase TypeChecking { Function_definition function }
	@Override
	public Object visit(Printsp_statement printsp_statement, Object param) {

		// print_statement.getExpressions().forEach(expression -> expression.accept(this, param));
		super.visit(printsp_statement, param);



        // Comprobar que el tipo de las expresiones sea de tipo simple o void
        for (Expression expression : printsp_statement.getExpressions()) {
            //if (expression.getTypeExpression() instanceof Array_type) {
               // predicate(simpleType(((Array_type) expression.getTypeExpression()).getType()), "Print type must be a simple type", expression);
            //} 
            //else {
                predicate(simpleType(expression.getTypeExpression()), "Print type must be a simple type", expression);
            //}
            
            predicate(!(expression.getTypeExpression() instanceof Void_type), "The expression to be printed cannot be of type void.", expression);
        }

		return null;
	}

	// class Println_statement(List<Expression> expressions)
	// phase TypeChecking { Function_definition function }
	@Override
	public Object visit(Println_statement println_statement, Object param) {

		// print_statement.getExpressions().forEach(expression -> expression.accept(this, param));
		super.visit(println_statement, param);



        // Comprobar que el tipo de las expresiones sea de tipo simple o void
        for (Expression expression : println_statement.getExpressions()) {
            //if (expression.getTypeExpression() instanceof Array_type) {
                //predicate(simpleType(((Array_type) expression.getTypeExpression()).getType()), "Print type must be a simple type", expression);
            //} 
            //else {
                predicate(simpleType(expression.getTypeExpression()), "Print type must be a simple type", expression);
            //}
            
            predicate(!(expression.getTypeExpression() instanceof Void_type), "The expression to be printed cannot be of type void.", expression);
        }

		return null;
	}

	// class Read_statement(Expression expression)
	// phase TypeChecking { Function_definition function }
	@Override
	public Object visit(Read_statement read_statement, Object param) {

		// read_statement.getExpression().accept(this, param);
		super.visit(read_statement, param);

        // Comprobar que la expresión sea lvalue
        predicate(read_statement.getExpression().isLvalue(), "Read expression must be lvalue", read_statement);

        // Comprobar que el tipo de la expresion sea de tipo simple
        predicate(simpleType(read_statement.getExpression().getTypeExpression()), "Read type must be a simple type", read_statement);

		return null;
	}

	// class While_statement(Expression expression, List<Statement> statements)
	// phase TypeChecking { Function_definition function }
	@Override
	public Object visit(While_statement while_statement, Object param) {

        for (Statement statement : while_statement.getStatements()) {
            // guardar la funcion en la que se encuentra
            statement.setFunction(while_statement.getFunction());
        }

		// while_statement.getExpression().accept(this, param);
		// while_statement.getStatements().forEach(statement -> statement.accept(this, param));
		super.visit(while_statement, param);

        if (!(while_statement.getExpression().getTypeExpression() instanceof Int_type)){
            predicate (false, "Condition type must be int", while_statement);
            
        } 

		return null;
	}

	// class If_statement(Expression expression, List<Statement> st1, List<Statement> st2)
	// phase TypeChecking { Function_definition function }
	@Override
	public Object visit(If_statement if_statement, Object param) {

        for (Statement statement : if_statement.getSt1()) {
            // guardar la funcion en la que se encuentra
            statement.setFunction(if_statement.getFunction());
        }
        for (Statement statement : if_statement.getSt2()) {
            // guardar la funcion en la que se encuentra
            statement.setFunction(if_statement.getFunction());
        }

		// if_statement.getExpression().accept(this, param);
		// if_statement.getSt1().forEach(statement -> statement.accept(this, param));
		// if_statement.getSt2().forEach(statement -> statement.accept(this, param));
		super.visit(if_statement, param);

        if (!(if_statement.getExpression().getTypeExpression() instanceof Int_type)){
            predicate (false, "Condition type must be int", if_statement);
            
        } 

        

		return null;
	}

	// class Assigment_statement(Expression left, Expression right)
	// phase TypeChecking { Function_definition function }
	@Override
	public Object visit(Assigment_statement assigment_statement, Object param) {

		// assigment_statement.getLeft().accept(this, param);
		// assigment_statement.getRight().accept(this, param);
		super.visit(assigment_statement, param);

        if (simpleType(assigment_statement.getLeft().getTypeExpression()) == false) {
            predicate(false, "Left expression must be a simple type", assigment_statement);
        }
        
        if (!(assigment_statement.getRight().getTypeExpression() instanceof ErrorType)) {
            // Comprobar que la expresión de la izquierda sea del mismo tipo que la expresión de la derecha
            predicate(sameType(assigment_statement.getLeft().getTypeExpression(), assigment_statement.getRight().getTypeExpression()), 
                "Left expression must have the same type as rigth expression", assigment_statement);
        }
        
        
        predicate(assigment_statement.getLeft().isLvalue() == true, "Left expressión must be lvalue", assigment_statement);

		return null;
	}

	// class Function_call_statement(String name, List<Expression> expressions)
	// phase Identification { Function_definition function_definition }
	// phase TypeChecking { Function_definition function }
	@Override
	public Object visit(Function_call_statement function_call_statement, Object param) {

		// function_call_statement.getExpressions().forEach(expression -> expression.accept(this, param));
		super.visit(function_call_statement, param);

        Function_definition function_definition = function_call_statement.getFunction_definition();

        if (function_call_statement.getExpressions().size() == function_definition.getParams().size() && function_definition.getParams().size() > 0) {
            
            // Comprobar que los tipos de los parámetros son los mismos
            for (int i = 0; i < function_call_statement.getExpressions().size(); i++) {
                // Obtengo la expresion i
                Expression expression = function_call_statement.getExpressions().get(i);
                // Obtengo la variable i de la funcion
                Variable_definition function_params = function_definition.getParams().get(i);
                // Compruebo que son del mismo tipo
                if (!sameType(expression.getTypeExpression(), function_params.getType())){
                    predicate(sameType(expression.getTypeExpression(), function_params.getType()), 
                        "Function call parameter type must be the same as function definition parameter type", expression);
                    
                }
                
            }
        }
        
        // Comprobar que el número de parámetros es el mismo
        predicate(function_call_statement.getExpressions().size() == function_definition.getParams().size(), 
        "Function call must have the same number of parameters as function definition", function_call_statement);
        

		return null;
	}

	// class Arythmetic_expression(Expression left, String operador, Expression right)
	// phase TypeChecking { Type typeExpression, boolean lvalue }
	@Override
	public Object visit(Arythmetic_expression arythmetic_expression, Object param) {

		// arythmetic_expression.getLeft().accept(this, param);
		// arythmetic_expression.getRight().accept(this, param);
		super.visit(arythmetic_expression, param);

        // Si es (+ - * o /)
        // Comprobación de que sean del mismo tipo y sean int o float
        if (arythmetic_expression.getOperador().equals("+") || arythmetic_expression.getOperador().equals("-") || arythmetic_expression.getOperador().equals("*") || arythmetic_expression.getOperador().equals("/")) {
            if (arythmetic_expression.getLeft().getTypeExpression() instanceof Void_type || arythmetic_expression.getRight().getTypeExpression() instanceof Void_type){
                predicate(false, "The function returns type is void", arythmetic_expression);
            }
            else if (arythmetic_expression.getLeft().getTypeExpression() instanceof Int_type || arythmetic_expression.getLeft().getTypeExpression() instanceof Real_type) {
                predicate(sameType(arythmetic_expression.getLeft().getTypeExpression(), arythmetic_expression.getRight().getTypeExpression()), 
                    "Expressions must have the same type", arythmetic_expression);
            }
            else {
                predicate(false, "Expressions must be int or float", arythmetic_expression);
            }
        }

        // Si es %
        if (arythmetic_expression.getOperador().equals("%")){
            if (arythmetic_expression.getLeft().getTypeExpression() instanceof Int_type) {
                predicate(sameType(arythmetic_expression.getLeft().getTypeExpression(), arythmetic_expression.getRight().getTypeExpression()), 
                    "Expressions must have the same type", arythmetic_expression);
            }
            else {
                predicate(false, "Expressions must be int", arythmetic_expression);
            }
        }

        // Poner lvalue a true en la expresion de la izquierda
        arythmetic_expression.getLeft().setLvalue(true);
        // Poner lvalue a false en la expresion de la derecha
        arythmetic_expression.getRight().setLvalue(false);

        // Poner el tipo a Arithmetic_expression
        arythmetic_expression.setTypeExpression(arythmetic_expression.getLeft().getTypeExpression());

		return null;
	}

    // class Unary_expression(Expression expression)
	// phase TypeChecking { Type typeExpression, boolean lvalue }
	@Override
	public Object visit(Unary_expression unary_expression, Object param) {

		// unary_expression.getExpression().accept(this, param);
		super.visit(unary_expression, param);

        if (unary_expression.getTypeExpression() instanceof Void_type){
            predicate(false, "The function returns type is void", unary_expression);
        }

        if (!(unary_expression.getExpression().getTypeExpression() instanceof Int_type )) {
            predicate(false, "Expressions must be int", unary_expression);
        }

        // Poner lvalue a false 
        unary_expression.setLvalue(false);

        // Poner el tipo a Arithmetic_expression
        unary_expression.setTypeExpression(unary_expression.getExpression().getTypeExpression());


		return null;
	}


	// class Cast_expression(Type type, Expression expression)
	// phase TypeChecking { Type typeExpression, boolean lvalue }
	@Override
	public Object visit(Cast_expression cast_expression, Object param) {

		// cast_expression.getType().accept(this, param);
		// cast_expression.getExpression().accept(this, param);
		super.visit(cast_expression, param);

        // Comprobar que el tipo al que se quiere castear y el de la expresion sea un tipo simple
        if (simpleType(cast_expression.getType()) == false || simpleType(cast_expression.getExpression().getTypeExpression()) == false) {
            predicate(false, "The type must be a simple type", cast_expression);
        }

        // Comprobar que el tipo al que se quiere hacer cast sea distinto al tipo de la expresion
        if ((sameType(cast_expression.getType() , cast_expression.getExpression().getTypeExpression()))) {
            predicate(false, "Cast type must be different from expression type", cast_expression);
        }

        cast_expression.setTypeExpression(cast_expression.getType());
        cast_expression.setLvalue(false);

		return null;
	}

	// class Comparative_expression(Expression left, String operador, Expression right)
	// phase TypeChecking { Type typeExpression, boolean lvalue }
	@Override
	public Object visit(Comparative_expression comparative_expression, Object param) {

		// comparative_expression.getLeft().accept(this, param);
		// comparative_expression.getRight().accept(this, param);
		super.visit(comparative_expression, param);

        // Comprobar que sean entre enteros o reales
        if (comparative_expression.getLeft().getTypeExpression() instanceof Int_type || comparative_expression.getLeft().getTypeExpression() instanceof Real_type) {
            predicate(sameType(comparative_expression.getLeft().getTypeExpression(), comparative_expression.getRight().getTypeExpression()), 
                "Expressions must have the same type", comparative_expression);
        }
        else {
            predicate(false, "Expressions must be int or float", comparative_expression);
        }


        // Poner el tipo a comparative_expression
        if (comparative_expression.getLeft().getTypeExpression() instanceof Int_type || comparative_expression.getLeft().getTypeExpression() instanceof Real_type ) {
            comparative_expression.setTypeExpression(new Int_type());
        }
        else {
            comparative_expression.setTypeExpression(new ErrorType());
        }

        // Poner lvalue a false
        comparative_expression.setLvalue(false);

		return null;
	}

	// class Logical_expression(Expression left, String operador, Expression right)
	// phase TypeChecking { Type typeExpression, boolean lvalue }
	@Override
	public Object visit(Logical_expression logical_expression, Object param) {

		// logical_expression.getLeft().accept(this, param);
		// logical_expression.getRight().accept(this, param);
		super.visit(logical_expression, param);

        // comprobar que sean enteros
        if (!(logical_expression.getLeft().getTypeExpression() instanceof Int_type && logical_expression.getRight().getTypeExpression() instanceof Int_type)) {
            predicate(false, "Expressions must be int", logical_expression);
        }

        // Poner el tipo a logical_expression
        logical_expression.setTypeExpression(new Int_type());

        // Poner lvalue a false
        logical_expression.setLvalue(false);

		return null;
	}

	// class Parenthesized_expression(Expression expression)
	// phase TypeChecking { Type typeExpression, boolean lvalue }
	@Override
	public Object visit(Parenthesized_expression parenthesized_expression, Object param) {

		// parenthesized_expression.getExpression().accept(this, param);
		super.visit(parenthesized_expression, param);


        // Poner el tipo a parenthesized_expression
        parenthesized_expression.setTypeExpression(parenthesized_expression.getExpression().getTypeExpression());

        // Poner lvalue a false
        parenthesized_expression.setLvalue(parenthesized_expression.getExpression().isLvalue());

		return null;
	}

	// class Expression_call(String name, List<Expression> expressions)
	// phase Identification { Function_definition function_definition }
	// phase TypeChecking { Type typeExpression, boolean lvalue }
	@Override
	public Object visit(Expression_call expression_call, Object param) {

		// expression_call.getExpressions().forEach(expression -> expression.accept(this, param));
		super.visit(expression_call, param);

		Function_definition function_definition = expression_call.getFunction_definition();

        if ((expression_call.getFunction_definition().getType() instanceof Void_type)){
            predicate(true, "The function must return VOID", function_definition);
        }
        

        // Comprobar que el número de parámetros es el mismo
        predicate(expression_call.getExpressions().size() == function_definition.getParams().size(), 
            "Function call must have the same number of parameters as function definition", expression_call);

        if(expression_call.getExpressions().size() == function_definition.getParams().size()){

            // Comprobar que los tipos de los parámetros son los mismos
            for (int i = 0; i < expression_call.getExpressions().size(); i++) {
                        
                // Obtengo la expresion i
                Expression expression = expression_call.getExpressions().get(i);
                // Obtengo la variable i de la funcion
                Variable_definition params = function_definition.getParams().get(i);
                // Compruebo que son del mismo tipo
                predicate(sameType(expression.getTypeExpression(), params.getType()), 
                    "Function call parameter type must be the same as function definition parameter type", expression);
            }

        }
        

        expression_call.setTypeExpression(expression_call.getFunction_definition().getType());
        expression_call.setLvalue(false);

		return null;
	}

	// class Struct_access(Expression expression, String name)
	// phase Identification { Struct_definition struct_definition }
	// phase TypeChecking { Type typeExpression, boolean lvalue }
	@Override
	public Object visit(Struct_access struct_access, Object param) {

		// struct_access.getExpression().accept(this, param);
		super.visit(struct_access, param);

        predicate((struct_access.getExpression().getTypeExpression() instanceof Struct_type), "The expression type must be a Struct_type", struct_access);

		struct_access.setLvalue(true);

        if (struct_access.getExpression().getTypeExpression() instanceof Struct_type) {
            Struct_type struct_type = (Struct_type) struct_access.getExpression().getTypeExpression();
            // Comprobar que el nombre de la variable es el mismo que el de la estructura
            Struct_definition struct_definition = struct_type.getStruct_definition();

            boolean found = false;

            for (Variable_definition variable_definition : struct_definition.getVariable_definitions()) {
                if (variable_definition.getType() instanceof Struct_type) {
                    visit(variable_definition, null);
                }
                if (variable_definition.getName().equals(struct_access.getName())) {
                    struct_access.setTypeExpression(variable_definition.getType());
                    found = true;
                    break;
                }
                
            }

            if (!found) {
                predicate(false, "The variable " + struct_access.getName() + " does not exist in the struct " + struct_definition.getName(), struct_access);
            }
        }
        
        if (struct_access.getTypeExpression() instanceof Struct_type) {
            predicate(struct_access.getTypeExpression() != null, "Struct_access must have a type", struct_access);

        }
        
        

		return null;
	}

	// class Array_access(Expression left, Expression right)
	// phase TypeChecking { Type typeExpression, boolean lvalue }
	@Override
	public Object visit(Array_access array_access, Object param) {

		// array_access.getLeft().accept(this, param);
		// array_access.getRight().accept(this, param);
		super.visit(array_access, param);

        // Comprobar que el tipo de la expresion de la izquierda es un Array_type
        if (!(array_access.getLeft().getTypeExpression() instanceof Array_type)) {
           predicate(false, "The expression type must be an Array_type", array_access);
           array_access.setTypeExpression(new ErrorType());
           return null;
        }

        // comprobar que el indice es entero
        if (array_access.getLeft().getTypeExpression() instanceof Array_type) {
            predicate((array_access.getRight().getTypeExpression() instanceof Int_type), "The expression2 type must be a Int_type", array_access);
            array_access.setTypeExpression(array_access.getLeft().getTypeExpression());
        }

        // Poner lvalue a true
        array_access.setLvalue(true);
        array_access.setTypeExpression(((Array_type)array_access.getLeft().getTypeExpression()).getType());

        
		return null;
	}

	// class IntE_literal(String name)
	// phase TypeChecking { Type typeExpression, boolean lvalue }
	@Override
	public Object visit(IntE_literal intE_literal, Object param) {

		intE_literal.setTypeExpression(new Int_type());
        intE_literal.setLvalue(false);

		return null;
	}

	// class IntE_real(String name)
	// phase TypeChecking { Type typeExpression, boolean lvalue }
	@Override
	public Object visit(IntE_real intE_real, Object param) {

		intE_real.setTypeExpression(new Real_type());
        intE_real.setLvalue(false);

		return null;
	}

	// class CharE_literal(String name)
	// phase TypeChecking { Type typeExpression, boolean lvalue }
	@Override
	public Object visit(CharE_literal charE_literal, Object param) {

		charE_literal.setTypeExpression(new Char_type());
        charE_literal.setLvalue(false);

		return null;
	}

	// class Variable(String name)
	// phase Identification { Variable_definition variable_definition }
	// phase TypeChecking { Type typeExpression, boolean lvalue }
	@Override
	public Object visit(Variable variable, Object param) {

		variable.setTypeExpression(variable.getVariable_definition().getType());
        variable.setLvalue(true);

		return null;
	}



    //# ----------------------------------------------------------
    //# Auxiliary methods (optional)

    /**
     * Devuelve si las dos expresiones son del mismo tipo
     */
    private boolean sameType (Type t1, Type t2) {

        if (t1 instanceof Array_type && t2 instanceof Array_type) {
            do {
                t1 = ((Array_type) t1).getType();
                t2 = ((Array_type) t2).getType();
            }
            while(t1 instanceof Array_type && t2 instanceof Array_type);
        }

        if (t1 instanceof Struct_type && t2 instanceof Struct_type) {
            return ((Struct_type) t1).getStruct_definition().getName().equals(((Struct_type) t2).getStruct_definition().getName());
        }

        return t1.getClass().equals(t2.getClass());
    }

    /**
     * Devuelve si la expresion es de tipo entero, real o char
     */
    private boolean simpleType (Type t) {
        
        return (t instanceof Int_type) || (t instanceof Real_type) || (t instanceof Char_type) || (t instanceof IntE_literal) || (t instanceof CharE_literal) || (t instanceof IntE_real);
    }

    private void notifyError(String errorMessage, Position position) {
        errorManager.notify("Type Checking", errorMessage, position);
    }

    private void notifyError(String msg) {
        errorManager.notify("Type Checking", msg);
    }

    /**
     * predicate. Auxiliary method to implement predicates. Delete if not needed.
     *
     * Usage examples:
     *
     *    predicate(expr.type != null), "Type cannot be null", expr.start());
     *
     *    predicate(expr.type != null), "Type cannot be null", expr);       // expr.start() is assumed
     *
     * The start() method (example 1) indicates the position in the file where the node was. If VGen is used, this method
     * will have been generated in all AST nodes.
     *
     * @param condition     Must be met to avoid an error
     * @param errorMessage  Printed if the condition is not met
     * @param errorPosition Row and column in the file where the error occurred.
     * @return true if the condition is met
     */

    private boolean predicate(boolean condition, String errorMessage, Position position) {
        if (!condition) {
            notifyError(errorMessage, position);
            return false;
        }

        return true;
    }

    private boolean predicate(boolean condition, String errorMessage, AST node) {
        return predicate(condition, errorMessage, node.start());
    }

}
