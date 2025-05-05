// Generated with VGen 2.0.0

/**
* El objetivo de esta clase DefaultVisitor es ser la implementación base de la que
* deriven todos los demás visitor.
*
* Sus métodos visit recorren los hijos del nodo que se está visitando. Por tanto,
* todo visitor que derive de este ya tendrá implementado todo el código de
* recorrido del AST.
*
* Para crear nuevos visitor, en vez de modificar esta clase, se recomienda copiar
* 'SkeletonForNewVisitors.java' o, mejor aún, definir una nueva PHASE en la gramática
* y usar el visitor generado para la misma.
*/

package visitor;

import ast.*;
import ast.declaration.*;
import ast.statement.*;
import ast.expression.*;
import ast.type.*;




public class DefaultVisitor implements Visitor {
	@Override
	public Object visit(Program program, Object param) {

		program.getDeclarations().forEach(declaration -> declaration.accept(this, param));
		return null;
	}

	@Override
	public Object visit(Variable_definition variable_definition, Object param) {

		variable_definition.getType().accept(this, param);
		return null;
	}

	@Override
	public Object visit(Struct_definition struct_definition, Object param) {

		struct_definition.getVariable_definitions().forEach(variable_definition -> variable_definition.accept(this, param));
		return null;
	}

	@Override
	public Object visit(Function_definition function_definition, Object param) {

		function_definition.getParams().forEach(variable_definition -> variable_definition.accept(this, param));
		function_definition.getType().accept(this, param);
		function_definition.getVariable_definitions().forEach(variable_definition -> variable_definition.accept(this, param));
		function_definition.getStatements().forEach(statement -> statement.accept(this, param));
		return null;
	}

	@Override
	public Object visit(Return_statement return_statement, Object param) {

		return_statement.getExpression().ifPresent(expression -> expression.accept(this, param));
		return null;
	}

	@Override
	public Object visit(Print_statement print_statement, Object param) {

		print_statement.getExpressions().forEach(expression -> expression.accept(this, param));
		return null;
	}

	@Override
	public Object visit(Printsp_statement printsp_statement, Object param) {

		printsp_statement.getExpressions().forEach(expression -> expression.accept(this, param));
		return null;
	}

	@Override
	public Object visit(Println_statement println_statement, Object param) {

		println_statement.getExpressions().forEach(expression -> expression.accept(this, param));
		return null;
	}

	@Override
	public Object visit(Read_statement read_statement, Object param) {

		read_statement.getExpression().accept(this, param);
		return null;
	}

	@Override
	public Object visit(While_statement while_statement, Object param) {

		while_statement.getExpression().accept(this, param);
		while_statement.getStatements().forEach(statement -> statement.accept(this, param));
		return null;
	}

	@Override
	public Object visit(If_statement if_statement, Object param) {

		if_statement.getExpression().accept(this, param);
		if_statement.getSt1().forEach(statement -> statement.accept(this, param));
		if_statement.getSt2().forEach(statement -> statement.accept(this, param));
		return null;
	}

	@Override
	public Object visit(Assigment_statement assigment_statement, Object param) {

		assigment_statement.getLeft().accept(this, param);
		assigment_statement.getRight().accept(this, param);
		return null;
	}

	@Override
	public Object visit(Function_call_statement function_call_statement, Object param) {

		function_call_statement.getExpressions().forEach(expression -> expression.accept(this, param));
		return null;
	}

	@Override
	public Object visit(Unary_expression unary_expression, Object param) {

		unary_expression.getExpression().accept(this, param);
		return null;
	}

	@Override
	public Object visit(Arythmetic_expression arythmetic_expression, Object param) {

		arythmetic_expression.getLeft().accept(this, param);
		arythmetic_expression.getRight().accept(this, param);
		return null;
	}

	@Override
	public Object visit(Cast_expression cast_expression, Object param) {

		cast_expression.getType().accept(this, param);
		cast_expression.getExpression().accept(this, param);
		return null;
	}

	@Override
	public Object visit(Comparative_expression comparative_expression, Object param) {

		comparative_expression.getLeft().accept(this, param);
		comparative_expression.getRight().accept(this, param);
		return null;
	}

	@Override
	public Object visit(Logical_expression logical_expression, Object param) {

		logical_expression.getLeft().accept(this, param);
		logical_expression.getRight().accept(this, param);
		return null;
	}

	@Override
	public Object visit(Parenthesized_expression parenthesized_expression, Object param) {

		parenthesized_expression.getExpression().accept(this, param);
		return null;
	}

	@Override
	public Object visit(Expression_call expression_call, Object param) {

		expression_call.getExpressions().forEach(expression -> expression.accept(this, param));
		return null;
	}

	@Override
	public Object visit(Struct_access struct_access, Object param) {

		struct_access.getExpression().accept(this, param);
		return null;
	}

	@Override
	public Object visit(Array_access array_access, Object param) {

		array_access.getLeft().accept(this, param);
		array_access.getRight().accept(this, param);
		return null;
	}

	@Override
	public Object visit(IntE_literal intE_literal, Object param) {

		return null;
	}

	@Override
	public Object visit(IntE_real intE_real, Object param) {

		return null;
	}

	@Override
	public Object visit(CharE_literal charE_literal, Object param) {

		return null;
	}

	@Override
	public Object visit(Variable variable, Object param) {

		return null;
	}

	@Override
	public Object visit(Int_type int_type, Object param) {

		return null;
	}

	@Override
	public Object visit(Real_type real_type, Object param) {

		return null;
	}

	@Override
	public Object visit(Char_type char_type, Object param) {

		return null;
	}

	@Override
	public Object visit(Struct_type struct_type, Object param) {

		return null;
	}

	@Override
	public Object visit(Array_type array_type, Object param) {

		array_type.getType().accept(this, param);
		return null;
	}

	@Override
	public Object visit(Void_type void_type, Object param) {

		return null;
	}


}
