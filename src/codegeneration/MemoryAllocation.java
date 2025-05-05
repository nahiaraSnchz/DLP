package codegeneration;

import ast.*;
import visitor.DefaultVisitor;
import ast.declaration.*;
import ast.statement.*;
import ast.expression.*;
import ast.type.*;

// This class will be implemented in memory allocation phase

public class MemoryAllocation extends DefaultVisitor {

    int currentAddress = 0;

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

            variable_definition.accept(this, param); // Llama al visit para procesar las variables
		}

        for (var struct_definition : program.declarations()
                .filter(Struct_definition.class::isInstance)
                .map(Struct_definition.class::cast)
                .toList()) {

			struct_definition.accept(this, param); // Llama al visit para procesar las variables del struct
		}

		for (var function_definition : program.declarations()
				.filter(Function_definition.class::isInstance)
				.map(Function_definition.class::cast)
				.toList()) {

			function_definition.accept(this, param); // Llama al visit para procesar las variables de la función
		}

		// program.getDeclarations().forEach(declaration -> declaration.accept(this, param));
		//super.visit(program, param);

		return null;
	}

    // class Struct_definition(String name, List<Variable_definition> variable_definitions)
	// phase MemoryAllocation { int address }
	@Override
	public Object visit(Variable_definition variable_definition, Object param) {

		variable_definition.setAddress(currentAddress);
        currentAddress += variable_definition.getType().getSize();

		return null;
	}


	// class Struct_definition(String name, List<Variable_definition> variable_definitions)
	// phase MemoryAllocation { int address }
	@Override
	public Object visit(Struct_definition struct_definition, Object param) {

        struct_definition.setAddress(currentAddress);

        currentAddress = 0; // Reset de la dirección para el nuevo struct

		for (var variable_definition : struct_definition.getVariable_definitions()) {
			variable_definition.accept(this, param);
		}

		// struct_definition.getVariable_definitions().forEach(variable_definition -> variable_definition.accept(this, param));
		//super.visit(struct_definition, param);

		return null;
	}

	// class Function_definition(String name, List<Variable_definition> param, Type type, List<Variable_definition> variable_definitions, List<Statement> statements)
	@Override
	public Object visit(Function_definition function_definition, Object param) {

        currentAddress = 0; // Reset de la dirección para la nueva función
		int params_currentAddress = 4; // Reset de la dirección para los parámetros

		for (int i=function_definition.getParams().size()-1; i>=0; i--) {
			var variable_definition = function_definition.getParams().get(i);
			variable_definition.setAddress(params_currentAddress);
			params_currentAddress += variable_definition.getType().getSize();
		}

		for (var variable_definition : function_definition.getVariable_definitions()) {
			currentAddress -= variable_definition.getType().getSize();
			variable_definition.setAddress(currentAddress);
		}


		// function_definition.getParam().forEach(variable_definition -> variable_definition.accept(this, param));
		// function_definition.getType().accept(this, param);
		// function_definition.getVariable_definitions().forEach(variable_definition -> variable_definition.accept(this, param));
		// function_definition.getStatements().forEach(statement -> statement.accept(this, param));
		// super.visit(function_definition, param);

		return null;
	}



}
