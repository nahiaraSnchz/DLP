// Generated with VGen 2.0.0

package codegeneration.mapl.codefunctions;

import ast.expression.*;
import ast.type.Array_type;
import ast.type.Char_type;
import codegeneration.mapl.*;


public class Value extends AbstractCodeFunction {

    public Value(MaplCodeSpecification specification) {
        super(specification);
    }


	// class Unary_expression(Expression expression)
	// phase TypeChecking { Type typeExpression, boolean lvalue }
	@Override
	public Object visit(Unary_expression unary_expression, Object param) {

		value(unary_expression.getExpression());
		out("not");

		return null;
	}

	// class Arythmetic_expression(Expression left, String operador, Expression right)
	// phase TypeChecking { Type typeExpression, boolean lvalue }
	@Override
	public Object visit(Arythmetic_expression arythmetic_expression, Object param) {

		value(arythmetic_expression.getLeft());
		value(arythmetic_expression.getRight());

		String operator = arythmetic_expression.getMaplOperador();
		out(operator);

		return null;
	}

	// class Cast_expression(Type type, Expression expression)
	// phase TypeChecking { Type typeExpression, boolean lvalue }
	@Override
	public Object visit(Cast_expression cast_expression, Object param) {

		value(cast_expression.getExpression());
		out(cast_expression.getExpression().getTypeExpression().getSuffix() + "2" + cast_expression.getType().getSuffix());

		return null;
	}

	// class Comparative_expression(Expression left, String operador, Expression right)
	// phase TypeChecking { Type typeExpression, boolean lvalue }
	@Override
	public Object visit(Comparative_expression comparative_expression, Object param) {

		value(comparative_expression.getLeft());
		value(comparative_expression.getRight());

		String operator = comparative_expression.getMaplOperador();

		out(operator);

		return null;
	}

	// class Logical_expression(Expression left, String operador, Expression right)
	// phase TypeChecking { Type typeExpression, boolean lvalue }
	@Override
	public Object visit(Logical_expression logical_expression, Object param) {

		value(logical_expression.getLeft());
		value(logical_expression.getRight());

		String operator = logical_expression.getMaplOperador();

		out(operator);

		return null;
	}

	// class Parenthesized_expression(Expression expression)
	// phase TypeChecking { Type typeExpression, boolean lvalue }
	@Override
	public Object visit(Parenthesized_expression parenthesized_expression, Object param) {
		value(parenthesized_expression.getExpression());
		return null;
	}

	// class Expression_call(String name, List<Expression> expressions)
	// phase Identification { Function_definition function_definition }
	// phase TypeChecking { Type typeExpression, boolean lvalue }
	@Override
	public Object visit(Expression_call expression_call, Object param) {

		expression_call.getExpressions().forEach(expression -> {
			value(expression);
		});

		out("call " + expression_call.getName());

		return null;
	}

	// class Struct_access(Expression expression, String name)
	// phase TypeChecking { Type typeExpression, boolean lvalue }
	@Override
	public Object visit(Struct_access struct_access, Object param) {

		address(struct_access);
		out("load" + struct_access.getTypeExpression().getSuffix());

		return null;
	}

	// class Array_access(Expression left, Expression right)
	// phase TypeChecking { Type typeExpression, boolean lvalue }
	@Override
	public Object visit(Array_access array_access, Object param) {

		address(array_access);
		out("load" + array_access.getTypeExpression().getSuffix());

		return null;
	}

	// class IntE_literal(String name)
	// phase TypeChecking { Type typeExpression, boolean lvalue }
	@Override
	public Object visit(IntE_literal intE_literal, Object param) {

		out("pushi " + intE_literal.getName());

		return null;
	}

	// class IntE_real(String name)
	// phase TypeChecking { Type typeExpression, boolean lvalue }
	@Override
	public Object visit(IntE_real intE_real, Object param) {

		out("pushf " + intE_real.getName());

		return null;
	}

	// class CharE_literal(String name)
	// phase TypeChecking { Type typeExpression, boolean lvalue }
	@Override
	public Object visit(CharE_literal charE_literal, Object param) {

		out("pushb " + (int)lexemeToChar(charE_literal.getName()));

		return null;
	}

	// class Variable(String name)
	// phase Identification { Variable_definition variable_definition }
	// phase TypeChecking { Type typeExpression, boolean lvalue }
	@Override
	public Object visit(Variable variable, Object param) {

		address(variable);
		out("load" + variable.getTypeExpression().getSuffix());

		return null;
	}

}
