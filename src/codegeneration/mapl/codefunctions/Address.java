// Generated with VGen 2.0.0

package codegeneration.mapl.codefunctions;

import ast.expression.*;
import codegeneration.mapl.*;


public class Address extends AbstractCodeFunction {

    public Address(MaplCodeSpecification specification) {
        super(specification);
    }


	// class Unary_expression(Expression expression)
	// phase TypeChecking { Type typeExpression, boolean lvalue }
	@Override
	public Object visit(Unary_expression unary_expression, Object param) {

		// value(unary_expression.getExpression());
		// address(unary_expression.getExpression());

		out("<instruction>");

		return null;
	}

	// class Arythmetic_expression(Expression left, String operador, Expression right)
	// phase TypeChecking { Type typeExpression, boolean lvalue }
	@Override
	public Object visit(Arythmetic_expression arythmetic_expression, Object param) {

		// value(arythmetic_expression.getLeft());
		// address(arythmetic_expression.getLeft());

		// value(arythmetic_expression.getRight());
		// address(arythmetic_expression.getRight());

		out("<instruction>");

		return null;
	}

	// class Cast_expression(Type type, Expression expression)
	// phase TypeChecking { Type typeExpression, boolean lvalue }
	@Override
	public Object visit(Cast_expression cast_expression, Object param) {

		// value(cast_expression.getExpression());
		// address(cast_expression.getExpression());

		out("<instruction>");

		return null;
	}

	// class Comparative_expression(Expression left, String operador, Expression right)
	// phase TypeChecking { Type typeExpression, boolean lvalue }
	@Override
	public Object visit(Comparative_expression comparative_expression, Object param) {

		// value(comparative_expression.getLeft());
		// address(comparative_expression.getLeft());

		// value(comparative_expression.getRight());
		// address(comparative_expression.getRight());

		out("<instruction>");

		return null;
	}

	// class Logical_expression(Expression left, String operador, Expression right)
	// phase TypeChecking { Type typeExpression, boolean lvalue }
	@Override
	public Object visit(Logical_expression logical_expression, Object param) {

		// value(logical_expression.getLeft());
		// address(logical_expression.getLeft());

		// value(logical_expression.getRight());
		// address(logical_expression.getRight());

		out("<instruction>");

		return null;
	}

	// class Parenthesized_expression(Expression expression)
	// phase TypeChecking { Type typeExpression, boolean lvalue }
	@Override
	public Object visit(Parenthesized_expression parenthesized_expression, Object param) {

		// value(parenthesized_expression.getExpression());
		// address(parenthesized_expression.getExpression());

		out("<instruction>");

		return null;
	}

	// class Expression_call(String name, List<Expression> expressions)
	// phase Identification { Function_definition function_definition }
	// phase TypeChecking { Type typeExpression, boolean lvalue }
	@Override
	public Object visit(Expression_call expression_call, Object param) {

		// value(expression_call.expressions());
		// address(expression_call.expressions());

		out("<instruction>");

		return null;
	}

	// class Struct_access(Expression expression, String name)
	// phase TypeChecking { Type typeExpression, boolean lvalue }
	@Override
	public Object visit(Struct_access struct_access, Object param) {

		// value(struct_access.getExpression());
		// address(struct_access.getExpression());

		out("<instruction>");

		return null;
	}

	// class Array_access(Expression left, Expression right)
	// phase TypeChecking { Type typeExpression, boolean lvalue }
	@Override
	public Object visit(Array_access array_access, Object param) {

		// value(array_access.getLeft());
		// address(array_access.getLeft());

		// value(array_access.getRight());
		// address(array_access.getRight());

		out("<instruction>");

		return null;
	}

	// class IntE_literal(String name)
	// phase TypeChecking { Type typeExpression, boolean lvalue }
	@Override
	public Object visit(IntE_literal intE_literal, Object param) {

		out("<instruction>");

		return null;
	}

	// class IntE_real(String name)
	// phase TypeChecking { Type typeExpression, boolean lvalue }
	@Override
	public Object visit(IntE_real intE_real, Object param) {

		out("<instruction>");

		return null;
	}

	// class CharE_literal(String name)
	// phase TypeChecking { Type typeExpression, boolean lvalue }
	@Override
	public Object visit(CharE_literal charE_literal, Object param) {

		out("<instruction>");

		return null;
	}

	// class Variable(String name)
	// phase Identification { Variable_definition variable_definition }
	// phase TypeChecking { Type typeExpression, boolean lvalue }
	@Override
	public Object visit(Variable variable, Object param) {

		out("<instruction>");

		return null;
	}

}
