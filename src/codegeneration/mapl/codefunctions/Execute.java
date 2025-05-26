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

		value(return_statement.getExpression());

		return null;
	}

	// class Print_statement(List<Expression> expressions)
	// phase TypeChecking { Function_definition function }
	@Override
	public Object visit(Print_statement print_statement, Object param) {

		for (Expression expression : print_statement.getExpressions()) {
			value(expression);
			String outString = "out" +expression.getTypeExpression().getSuffix();
			out(outString);
			
		}

		out("");

		return null;
	}

	// class Printsp_statement(List<Expression> expressions)
	// phase TypeChecking { Function_definition function }
	@Override
	public Object visit(Printsp_statement printsp_statement, Object param) {

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

		out("");
		
		return null;
	}

	// class Read_statement(Expression expression)
	// phase TypeChecking { Function_definition function }
	@Override
	public Object visit(Read_statement read_statement, Object param) {

		// value(read_statement.getExpression());
		// address(read_statement.getExpression());
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

		out("INICIOWHILE:"); // Etiqueta para el inicio del bucle while

		value(while_statement.getExpression()); // Evaluar la expresión condicional
		out("jz FUERAWHILE1"); // Si la expresión es falsa, saltar al final del bucle

		while_statement.getStatements().forEach(st -> execute(st)); // Ejecutar las sentencias del bucle
		out("jmp INICIOWHILE"); // Saltar al inicio del bucle para volver a evaluar la condición

		out("FUERAWHILE1:"); // Etiqueta para el final del bucle while

		out("");

		return null;
	}

	// class If_statement(Expression expression, List<Statement> st1, List<Statement> st2)
	// phase TypeChecking { Function_definition function }
	@Override
	public Object visit(If_statement if_statement, Object param) {

		value(if_statement.getExpression()); // Evaluar la expresión condicional

		out("jz FUERAIF1"); // Si la expresión es falsa, saltar al final del bloque verdadero

		if_statement.getSt1().forEach(st -> execute(st)); // Ejecutar las sentencias del bloque verdadero


		if (if_statement.getSt2() != null && !if_statement.getSt2().isEmpty()) {
			if_statement.getSt2().forEach(st -> execute(st)); // Ejecutar las sentencias del bloque falso
		}
		
		out("FUERAIF1:"); // Etiqueta para el final del bloque if

		out("");

		return null;
	}

	// class Assigment_statement(Expression left, Expression right)
	// phase TypeChecking { Function_definition function }
	@Override
	public Object visit(Assigment_statement assigment_statement, Object param) {

		address(assigment_statement.getLeft());
		value(assigment_statement.getRight());

		out("store" + assigment_statement.getLeft().getTypeExpression().getSuffix());

		out("");

		return null;
	}

	// class Function_call_statement(String name, List<Expression> expressions)
	// phase Identification { Function_definition function_definition }
	// phase TypeChecking { Function_definition function }
	@Override
	public Object visit(Function_call_statement function_call_statement, Object param) {

		function_call_statement.getExpressions().forEach(expression -> {
			value(expression);
		});

		out("call " + function_call_statement.getName());

		out("");

		return null;
	}

	

}
