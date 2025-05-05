// Generated with VGen 2.0.0

package codegeneration.mapl.codefunctions;

import ast.statement.*;
import codegeneration.mapl.*;


public class Execute extends AbstractCodeFunction {

    public Execute(MaplCodeSpecification specification) {
        super(specification);
    }


	// class Return_statement(Optional<Expression> expression)
	// phase TypeChecking { Function_definition function }
	@Override
	public Object visit(Return_statement return_statement, Object param) {

		// value(return_statement.getExpression());
		// address(return_statement.getExpression());

		out("<instruction>");

		return null;
	}

	// class Print_statement(List<Expression> expressions)
	// phase TypeChecking { Function_definition function }
	@Override
	public Object visit(Print_statement print_statement, Object param) {

		// value(print_statement.expressions());
		// address(print_statement.expressions());

		out("<instruction>");

		return null;
	}

	// class Printsp_statement(List<Expression> expressions)
	// phase TypeChecking { Function_definition function }
	@Override
	public Object visit(Printsp_statement printsp_statement, Object param) {

		// value(printsp_statement.expressions());
		// address(printsp_statement.expressions());

		out("<instruction>");

		return null;
	}

	// class Println_statement(List<Expression> expressions)
	// phase TypeChecking { Function_definition function }
	@Override
	public Object visit(Println_statement println_statement, Object param) {

		// value(println_statement.expressions());
		// address(println_statement.expressions());

		out("<instruction>");

		return null;
	}

	// class Read_statement(Expression expression)
	// phase TypeChecking { Function_definition function }
	@Override
	public Object visit(Read_statement read_statement, Object param) {

		// value(read_statement.getExpression());
		// address(read_statement.getExpression());

		out("<instruction>");

		return null;
	}

	// class While_statement(Expression expression, List<Statement> statements)
	// phase TypeChecking { Function_definition function }
	@Override
	public Object visit(While_statement while_statement, Object param) {

		// value(while_statement.getExpression());
		// address(while_statement.getExpression());

		// execute(while_statement.statements());

		out("<instruction>");

		return null;
	}

	// class If_statement(Expression expression, List<Statement> st1, List<Statement> st2)
	// phase TypeChecking { Function_definition function }
	@Override
	public Object visit(If_statement if_statement, Object param) {

		// value(if_statement.getExpression());
		// address(if_statement.getExpression());

		// execute(if_statement.st1());

		// execute(if_statement.st2());

		out("<instruction>");

		return null;
	}

	// class Assigment_statement(Expression left, Expression right)
	// phase TypeChecking { Function_definition function }
	@Override
	public Object visit(Assigment_statement assigment_statement, Object param) {

		// value(assigment_statement.getLeft());
		// address(assigment_statement.getLeft());

		// value(assigment_statement.getRight());
		// address(assigment_statement.getRight());

		out("<instruction>");

		return null;
	}

	// class Function_call_statement(String name, List<Expression> expressions)
	// phase Identification { Function_definition function_definition }
	// phase TypeChecking { Function_definition function }
	@Override
	public Object visit(Function_call_statement function_call_statement, Object param) {

		// value(function_call_statement.expressions());
		// address(function_call_statement.expressions());

		out("<instruction>");

		return null;
	}

}
