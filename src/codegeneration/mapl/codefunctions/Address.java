// Generated with VGen 2.0.0

package codegeneration.mapl.codefunctions;

import org.stringtemplate.v4.compiler.STParser.singleElement_return;

import ast.expression.*;
import codegeneration.mapl.*;
import ast.type.*;


public class Address extends AbstractCodeFunction {

    public Address(MaplCodeSpecification specification) {
        super(specification);
    }


	// class Unary_expression(Expression expression)
	// phase TypeChecking { Type typeExpression, boolean lvalue }
	@Override
	public Object visit(Unary_expression unary_expression, Object param) {

		return null;
	}

	// class Arythmetic_expression(Expression left, String operador, Expression right)
	// phase TypeChecking { Type typeExpression, boolean lvalue }
	@Override
	public Object visit(Arythmetic_expression arythmetic_expression, Object param) {

		return null;
	}

	// class Cast_expression(Type type, Expression expression)
	// phase TypeChecking { Type typeExpression, boolean lvalue }
	@Override
	public Object visit(Cast_expression cast_expression, Object param) {

		return null;
	}

	// class Comparative_expression(Expression left, String operador, Expression right)
	// phase TypeChecking { Type typeExpression, boolean lvalue }
	@Override
	public Object visit(Comparative_expression comparative_expression, Object param) {

		return null;
	}

	// class Logical_expression(Expression left, String operador, Expression right)
	// phase TypeChecking { Type typeExpression, boolean lvalue }
	@Override
	public Object visit(Logical_expression logical_expression, Object param) {

		return null;
	}

	// class Parenthesized_expression(Expression expression)
	// phase TypeChecking { Type typeExpression, boolean lvalue }
	@Override
	public Object visit(Parenthesized_expression parenthesized_expression, Object param) {

		return null;
	}

	// class Expression_call(String name, List<Expression> expressions)
	// phase Identification { Function_definition function_definition }
	// phase TypeChecking { Type typeExpression, boolean lvalue }
	@Override
	public Object visit(Expression_call expression_call, Object param) {

		return null;
	}

	// class Struct_access(Expression expression, String name)
	// phase TypeChecking { Type typeExpression, boolean lvalue }
	@Override
	public Object visit(Struct_access struct_access, Object param) {
		// calcula la direccion base de la estructura
		address(struct_access.getExpression());
		// Tipo de la expresion base 
		Struct_type structType = (Struct_type) struct_access.getExpression().getTypeExpression();
		// Calcula el offset del campo dentro de la estructura
		int offset = structType.getField(struct_access.getName()).getAddress();

		out("pushi " + offset);
		out("addi");

		return null;
	}

	// class Array_access(Expression left, Expression right)
	// phase TypeChecking { Type typeExpression, boolean lvalue }
	@Override
	public Object visit(Array_access array_access, Object param) {
		// direccion base del array
		address(array_access.getLeft());
		// Evalua el indice del array
		value(array_access.getRight());
		// Tamaño del tipo de datos del array
		int size = ((Array_type)array_access.getLeft().getTypeExpression()).getType().getSize();

		out("pushi " + size);
		out("mul");
		out("add");

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
		if (variable.getVariable_definition().isGlobal()) {
			out("pusha"  + " " + variable.getVariable_definition().getAddress());
		}
		else {
			out("pusha bp");
			out("pushi " + variable.getVariable_definition().getAddress());
			out("add");
		}

		return null;
	}

}
