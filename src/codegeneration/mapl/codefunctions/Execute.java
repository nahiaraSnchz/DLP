// Generated with VGen 2.0.0

package codegeneration.mapl.codefunctions;

import org.stringtemplate.v4.compiler.CodeGenerator.region_return;

import ast.declaration.*;
import ast.expression.Expression;
import ast.statement.*;
import codegeneration.mapl.*;


public class Execute extends AbstractCodeFunction {

    public Execute(MaplCodeSpecification specification) {
        super(specification);
    }


	// class Variable_definition(String name, Type type)
	// phase MemoryAllocation { int address }
	@Override
	public Object visit(Variable_definition variable_definition, Object param) {


		return null;

	}

	// class Struct_definition(String name, List<Variable_definition> variable_definitions)
	// phase MemoryAllocation { int address }
	@Override
	public Object visit(Struct_definition struct_definition, Object param) {


		// execute(struct_definition.variable_definitions());
		// metadata(struct_definition.variable_definitions());

		//out("<instruction>");

		return null;
	}

	// class Function_definition(String name, List<Variable_definition> params, Type type, List<Variable_definition> variable_definitions, List<Statement> statements)
	@Override
	public Object visit(Function_definition function_definition, Object param) {
		out(function_definition.getName() + ":");
		metadata(function_definition);

		// Si hay variables locales
		if (function_definition.getVariable_definitions() != null && !function_definition.getVariable_definitions().isEmpty()) {
			
			int localVariable_size = function_definition.getVariable_definitions().stream().mapToInt(variableLocal -> variableLocal.getType().getSize()).sum();
			out("enter " + localVariable_size);
			
		}

		execute(function_definition.statements());

		out("ret " + function_definition.getType().getSize() + ", " + function_definition.getVariable_definitions().stream().mapToInt(variableLocal -> variableLocal.getType().getSize()).sum() + 
			", " + function_definition.getParams().stream().mapToInt(paramLocal -> paramLocal.getType().getSize()).sum());

		out("");

		return null;
	}


	// class Return_statement(Optional<Expression> expression)
	// phase TypeChecking { Function_definition function }
	@Override
	public Object visit(Return_statement return_statement, Object param) {

		metadata(return_statement);
		value(return_statement.getExpression());

		return null;
	}

	// class Print_statement(List<Expression> expressions)
	// phase TypeChecking { Function_definition function }
	@Override
	public Object visit(Print_statement print_statement, Object param) {

		metadata(print_statement);

		for (Expression expression : print_statement.getExpressions()) {
			value(expression);
			String outString = "out" +expression.getTypeExpression().getSuffix();
			out(outString);
			
		}


		return null;
	}

	// class Printsp_statement(List<Expression> expressions)
	// phase TypeChecking { Function_definition function }
	@Override
	public Object visit(Printsp_statement printsp_statement, Object param) {

		metadata(printsp_statement);

		if (! printsp_statement.getExpressions().isEmpty()) {
			for (Expression expression : printsp_statement.getExpressions()) {
				value(expression);
				String outString = "out" +expression.getTypeExpression().getSuffix();
				out(outString);
				out("pushb 32"); // " "
				out("outb");
			}
		}
		else {
			// Si no hay expresiones, solo se imprime un espacio
			out("pushb 32"); // " "
			out("outb");
		}

		out("");

		return null;
	}

	// class Println_statement(List<Expression> expressions)
	// phase TypeChecking { Function_definition function }
	@Override
	public Object visit(Println_statement println_statement, Object param) {

		metadata(println_statement);

		// Si hay expresiones
		if (!println_statement.getExpressions().isEmpty()) {
			for (Expression expression : println_statement.getExpressions()) {
				value(expression);
				String outString = "out" +expression.getTypeExpression().getSuffix();
				out(outString);
				out("pushb 10"); // "\n"
				out("outb");
			}
		}
		else {
			// Si no hay expresiones, solo se imprime un salto de línea
			out("pushb 10"); // "\n"
			out("outb");
		}
		
		return null;
	}

	// class Read_statement(Expression expression)
	// phase TypeChecking { Function_definition function }
	@Override
	public Object visit(Read_statement read_statement, Object param) {

		metadata(read_statement);

		address(read_statement.getExpression());
		String outString = "in" + read_statement.getExpression().getTypeExpression().getSuffix();
		out(outString);

		out("store" + read_statement.getExpression().getTypeExpression().getSuffix());

		out("");

		return null;
	}

	// class While_statement(Expression expression, List<Statement> statements)
	// phase TypeChecking { Function_definition function }
	@Override
	public Object visit(While_statement while_statement, Object param) {

		metadata(while_statement);

		String etInicio = getEtiqueta();
		out(etInicio + ":"); // Etiqueta para el inicio del bucle while

		value(while_statement.getExpression()); // Evaluar la expresión condicional
		String etFin = getEtiqueta();
		out("jz " + etFin); // Si la expresión es falsa, saltar al final del bucle

		while_statement.getStatements().forEach(st -> execute(st)); // Ejecutar las sentencias del bucle
		out("jmp " + etInicio); // Saltar al inicio del bucle para volver a evaluar la condición

		out(etFin + ":"); // Etiqueta para el final del bucle while


		return null;
	}

	// class If_statement(Expression expression, List<Statement> st1, List<Statement> st2)
	// phase TypeChecking { Function_definition function }
	@Override
	public Object visit(If_statement if_statement, Object param) {
		
		metadata(if_statement);

		value(if_statement.getExpression()); // Evaluar la expresión condicional

		String etElse = getEtiqueta();
		String etEnd = getEtiqueta();

		// si no hay bloque else, se salta al final del bloque if
		if (if_statement.getSt2() != null && !if_statement.getSt2().isEmpty()) {
			out("jz " + etEnd); // Si la expresión es falsa, saltar al bloque falso
			if_statement.getSt1().forEach(st -> execute(st)); // Ejecutar las sentencias del bloque verdadero

			out( etEnd + ":"); // Etiqueta para el final del bloque if

		} else {
			out("jz " + etElse); // Si la expresión es falsa, saltar al bloque falso
			if_statement.getSt1().forEach(st -> execute(st)); // Ejecutar las sentencias del bloque verdadero
		
		    out("jmp " + etEnd); // Saltar al final del bloque if

			out(etElse + ":"); // Etiqueta para el bloque falso
			if_statement.getSt2().forEach(st -> execute(st)); // Ejecutar las sentencias del bloque falso

			out( etEnd + ":"); // Etiqueta para el final del bloque if

		}

		return null;
	}

	// class Assigment_statement(Expression left, Expression right)
	// phase TypeChecking { Function_definition function }
	@Override
	public Object visit(Assigment_statement assigment_statement, Object param) {

		metadata(assigment_statement);

		address(assigment_statement.getLeft());
		value(assigment_statement.getRight());

		out("store" + assigment_statement.getLeft().getTypeExpression().getSuffix());

		return null;
	}

	// class Function_call_statement(String name, List<Expression> expressions)
	// phase Identification { Function_definition function_definition }
	// phase TypeChecking { Function_definition function }
	@Override
	public Object visit(Function_call_statement function_call_statement, Object param) {

		metadata(function_call_statement);

		function_call_statement.getExpressions().forEach(expression -> {
			value(expression);
		});

		out("call " + function_call_statement.getName());

		if (function_call_statement.getFunction_definition().getType().getSize() > 0) {
			out("pop");
		}


		return null;
	}

	

}
