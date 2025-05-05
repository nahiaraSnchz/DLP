// Generated with VGen 2.0.0

/*

Este fichero es un esqueleto para facilitar la implementación de una gramática atribuida
('ATTRIBUTE GRAMMAR' de VGen). Para usarlo hay que realizar dos pasos:
1. Ubicar este código.
2. Completar cada método visit.

## Paso 1. Ubicación de este Código

Este esqueleto será SOBREESCRITO la próxima vez que se ejecuta VGen. Por ello, se debe
copiar su contenido antes de hacer cualquier cambio.

Hay dos opciones:

1) Si ya se tiene hecha una clase para el visitor, basta con copiar a dicha clase los
   métodos visit de este esqueleto (y los import) ignorando el resto.

2) Si no se tiene hecha aún la clase, este esqueleto vale como tal si se mueve a la
   carpeta deseada del proyecto y se le pone el package correspondiente a dicha
   ubicación.

Una vez hecho esto, ya se tendría un visitor que compilaría sin errores y que, al
ejecutarlo, recorrería todo el árbol (aunque sin hacer nada en cada nodo).


## Paso 2 Completar cada Método Visit

El visit generado para cada nodo se limita a recorrer sus hijos. El código de recorrido
se encuentra en la llamada a 'super.visit'. Los 'accept' comentados encima de cada
'super.visit' son sólo un recordatorio de lo que hace dicho método (son una copia de su
implementación, que se hereda de DefaultVisitor).

Por tanto, hay tres opciones a la hora de implementar cada visit:

1. Si en el visit de un nodo SÓLO SE NECESITA RECORRER sus hijos, se puede borrar
   completamente dicho visit de esta clase. Al no estar el método, se heredará de
   DefaultVisitor la misma implementación que se acaba de borrar. Es decir, en esta
   clase sólo será necesario dejar los visit que tengan alguna acción que realizar.

2. Si se necesita hacer alguna tarea adicional ANTES o DESPUÉS de recorrer todos los
   hijos, se debe añadir su código antes o después de la llamada a 'super.visit' (y se
   pueden borrar los 'accept' comentados).

3. Y, finalmente, si se necesita hacer alguna tarea INTERCALADA en el recorrido de los
   hijos (por ejemplo, comprobar su tipo), se debe borrar el 'super.visit' y descomentar
   los 'accept'. Así se tendría ya implementado el recorrido de los hijos, que es la
   estructura donde se intecalará el código de las acciones adicionales.

NOTA 1. En los visit en los que haya que inicializar atributos heredados de los hijos
antes de recorrerlos, se han añadido recordatorios en los puntos en los que es
aconsejable hacerlo.

NOTA 2. En los visit de los nodos que tengan atributos sintetizados, se han añadido
recordatorios de que se deben inicializar dichos atributos.

*/

// TODO: write package name
// package ...;

import visitor.DefaultVisitor;
import ast.*;
import ast.declaration.*;
import ast.statement.*;
import ast.expression.*;
import ast.type.*;


public class MemoryAllocation extends DefaultVisitor {

    public void process(AST ast) {
        ast.accept(this, null);
    }

    // Visit Methods --------------------------------------------------------------

	// class Program(List<Declaration> declarations)
	@Override
	public Object visit(Program program, Object param) {

        for (var variable_definition : program.declarations()
                .filter(Variable_definition.class::isInstance)
                .map(Variable_definition.class::cast)
                .toList()) {

			// TODO: Remember to initialize INHERITED attributes <----
			// variable_definition.setAddress(?);
		}

        for (var struct_definition : program.declarations()
                .filter(Struct_definition.class::isInstance)
                .map(Struct_definition.class::cast)
                .toList()) {

			// TODO: Remember to initialize INHERITED attributes <----
			// struct_definition.setAddress(?);
		}

		// program.getDeclarations().forEach(declaration -> declaration.accept(this, param));
		super.visit(program, param);

		return null;
	}

	// class Variable_definition(String name, Type type)
	// phase MemoryAllocation { int address }
	@Override
	public Object visit(Variable_definition variable_definition, Object param) {

		// variable_definition.getType().accept(this, param);
		super.visit(variable_definition, param);

		return null;
	}

	// class Struct_definition(String name, List<Variable_definition> variable_definitions)
	// phase MemoryAllocation { int address }
	@Override
	public Object visit(Struct_definition struct_definition, Object param) {

		for (var variable_definition : struct_definition.getVariable_definitions()) {
			// TODO: Remember to initialize INHERITED attributes <----
			// variable_definition.setAddress(struct_definition.getAddress());
		}

		// struct_definition.getVariable_definitions().forEach(variable_definition -> variable_definition.accept(this, param));
		super.visit(struct_definition, param);

		return null;
	}

	// class Function_definition(String name, List<Variable_definition> params, Type type, List<Variable_definition> variable_definitions, List<Statement> statements)
	@Override
	public Object visit(Function_definition function_definition, Object param) {

		for (var variable_definition : function_definition.getParams()) {
			// TODO: Remember to initialize INHERITED attributes <----
			// variable_definition.setAddress(?);
		}

		for (var variable_definition : function_definition.getVariable_definitions()) {
			// TODO: Remember to initialize INHERITED attributes <----
			// variable_definition.setAddress(?);
		}

		// function_definition.getParams().forEach(variable_definition -> variable_definition.accept(this, param));
		// function_definition.getType().accept(this, param);
		// function_definition.getVariable_definitions().forEach(variable_definition -> variable_definition.accept(this, param));
		// function_definition.getStatements().forEach(statement -> statement.accept(this, param));
		super.visit(function_definition, param);

		return null;
	}

	// class Return_statement(Optional<Expression> expression)
	// phase TypeChecking { Function_definition function }
	@Override
	public Object visit(Return_statement return_statement, Object param) {

		// return_statement.getExpression().ifPresent(expression -> expression.accept(this, param));
		super.visit(return_statement, param);

		return null;
	}

	// class Print_statement(List<Expression> expressions)
	// phase TypeChecking { Function_definition function }
	@Override
	public Object visit(Print_statement print_statement, Object param) {

		// print_statement.getExpressions().forEach(expression -> expression.accept(this, param));
		super.visit(print_statement, param);

		return null;
	}

	// class Printsp_statement(List<Expression> expressions)
	// phase TypeChecking { Function_definition function }
	@Override
	public Object visit(Printsp_statement printsp_statement, Object param) {

		// printsp_statement.getExpressions().forEach(expression -> expression.accept(this, param));
		super.visit(printsp_statement, param);

		return null;
	}

	// class Println_statement(List<Expression> expressions)
	// phase TypeChecking { Function_definition function }
	@Override
	public Object visit(Println_statement println_statement, Object param) {

		// println_statement.getExpressions().forEach(expression -> expression.accept(this, param));
		super.visit(println_statement, param);

		return null;
	}

	// class Read_statement(Expression expression)
	// phase TypeChecking { Function_definition function }
	@Override
	public Object visit(Read_statement read_statement, Object param) {

		// read_statement.getExpression().accept(this, param);
		super.visit(read_statement, param);

		return null;
	}

	// class While_statement(Expression expression, List<Statement> statements)
	// phase TypeChecking { Function_definition function }
	@Override
	public Object visit(While_statement while_statement, Object param) {

		// while_statement.getExpression().accept(this, param);
		// while_statement.getStatements().forEach(statement -> statement.accept(this, param));
		super.visit(while_statement, param);

		return null;
	}

	// class If_statement(Expression expression, List<Statement> st1, List<Statement> st2)
	// phase TypeChecking { Function_definition function }
	@Override
	public Object visit(If_statement if_statement, Object param) {

		// if_statement.getExpression().accept(this, param);
		// if_statement.getSt1().forEach(statement -> statement.accept(this, param));
		// if_statement.getSt2().forEach(statement -> statement.accept(this, param));
		super.visit(if_statement, param);

		return null;
	}

	// class Assigment_statement(Expression left, Expression right)
	// phase TypeChecking { Function_definition function }
	@Override
	public Object visit(Assigment_statement assigment_statement, Object param) {

		// assigment_statement.getLeft().accept(this, param);
		// assigment_statement.getRight().accept(this, param);
		super.visit(assigment_statement, param);

		return null;
	}

	// class Function_call_statement(String name, List<Expression> expressions)
	// phase Identification { Function_definition function_definition }
	// phase TypeChecking { Function_definition function }
	@Override
	public Object visit(Function_call_statement function_call_statement, Object param) {

		// function_call_statement.getExpressions().forEach(expression -> expression.accept(this, param));
		super.visit(function_call_statement, param);

		return null;
	}

	// class Unary_expression(Expression expression)
	// phase TypeChecking { Type typeExpression, boolean lvalue }
	@Override
	public Object visit(Unary_expression unary_expression, Object param) {

		// unary_expression.getExpression().accept(this, param);
		super.visit(unary_expression, param);

		return null;
	}

	// class Arythmetic_expression(Expression left, String operador, Expression right)
	// phase TypeChecking { Type typeExpression, boolean lvalue }
	@Override
	public Object visit(Arythmetic_expression arythmetic_expression, Object param) {

		// arythmetic_expression.getLeft().accept(this, param);
		// arythmetic_expression.getRight().accept(this, param);
		super.visit(arythmetic_expression, param);

		return null;
	}

	// class Cast_expression(Type type, Expression expression)
	// phase TypeChecking { Type typeExpression, boolean lvalue }
	@Override
	public Object visit(Cast_expression cast_expression, Object param) {

		// cast_expression.getType().accept(this, param);
		// cast_expression.getExpression().accept(this, param);
		super.visit(cast_expression, param);

		return null;
	}

	// class Comparative_expression(Expression left, String operador, Expression right)
	// phase TypeChecking { Type typeExpression, boolean lvalue }
	@Override
	public Object visit(Comparative_expression comparative_expression, Object param) {

		// comparative_expression.getLeft().accept(this, param);
		// comparative_expression.getRight().accept(this, param);
		super.visit(comparative_expression, param);

		return null;
	}

	// class Logical_expression(Expression left, String operador, Expression right)
	// phase TypeChecking { Type typeExpression, boolean lvalue }
	@Override
	public Object visit(Logical_expression logical_expression, Object param) {

		// logical_expression.getLeft().accept(this, param);
		// logical_expression.getRight().accept(this, param);
		super.visit(logical_expression, param);

		return null;
	}

	// class Parenthesized_expression(Expression expression)
	// phase TypeChecking { Type typeExpression, boolean lvalue }
	@Override
	public Object visit(Parenthesized_expression parenthesized_expression, Object param) {

		// parenthesized_expression.getExpression().accept(this, param);
		super.visit(parenthesized_expression, param);

		return null;
	}

	// class Expression_call(String name, List<Expression> expressions)
	// phase Identification { Function_definition function_definition }
	// phase TypeChecking { Type typeExpression, boolean lvalue }
	@Override
	public Object visit(Expression_call expression_call, Object param) {

		// expression_call.getExpressions().forEach(expression -> expression.accept(this, param));
		super.visit(expression_call, param);

		return null;
	}

	// class Struct_access(Expression expression, String name)
	// phase TypeChecking { Type typeExpression, boolean lvalue }
	@Override
	public Object visit(Struct_access struct_access, Object param) {

		// struct_access.getExpression().accept(this, param);
		super.visit(struct_access, param);

		return null;
	}

	// class Array_access(Expression left, Expression right)
	// phase TypeChecking { Type typeExpression, boolean lvalue }
	@Override
	public Object visit(Array_access array_access, Object param) {

		// array_access.getLeft().accept(this, param);
		// array_access.getRight().accept(this, param);
		super.visit(array_access, param);

		return null;
	}

	// class IntE_literal(String name)
	// phase TypeChecking { Type typeExpression, boolean lvalue }
	@Override
	public Object visit(IntE_literal intE_literal, Object param) {

		return null;
	}

	// class IntE_real(String name)
	// phase TypeChecking { Type typeExpression, boolean lvalue }
	@Override
	public Object visit(IntE_real intE_real, Object param) {

		return null;
	}

	// class CharE_literal(String name)
	// phase TypeChecking { Type typeExpression, boolean lvalue }
	@Override
	public Object visit(CharE_literal charE_literal, Object param) {

		return null;
	}

	// class Variable(String name)
	// phase Identification { Variable_definition variable_definition }
	// phase TypeChecking { Type typeExpression, boolean lvalue }
	@Override
	public Object visit(Variable variable, Object param) {

		return null;
	}

	// class Int_type()
	@Override
	public Object visit(Int_type int_type, Object param) {

		return null;
	}

	// class Real_type()
	@Override
	public Object visit(Real_type real_type, Object param) {

		return null;
	}

	// class Char_type()
	@Override
	public Object visit(Char_type char_type, Object param) {

		return null;
	}

	// class Struct_type(String name)
	// phase Identification { Struct_definition struct_definition }
	@Override
	public Object visit(Struct_type struct_type, Object param) {

		return null;
	}

	// class Array_type(String name, Type type)
	@Override
	public Object visit(Array_type array_type, Object param) {

		// array_type.getType().accept(this, param);
		super.visit(array_type, param);

		return null;
	}

	// class Void_type()
	@Override
	public Object visit(Void_type void_type, Object param) {

		return null;
	}

}
