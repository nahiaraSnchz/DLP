// Generated with VGen 2.0.0

package codegeneration.mapl.codefunctions;


import ast.*;
import ast.declaration.*;
import ast.type.Array_type;
import ast.type.Char_type;
import ast.type.Int_type;
import ast.type.Real_type;
import ast.type.Struct_type;
import ast.type.Type;
import codegeneration.mapl.*;


public class Metadata extends AbstractCodeFunction {

    public Metadata(MaplCodeSpecification specification) {
        super(specification);
    }


	// class Program(List<Declaration> declarations)
	@Override
	public Object visit(Program program, Object param) {

		out("#SOURCE \"" + getSpecification().getSourceFile() + "\"");

		
		for (var declarations: program.getDeclarations()) {
			if (!(declarations instanceof Function_definition)) {
				metadata(declarations);
			}
		}

		return null;
	}

	// class Variable_definition(String name, Type type)
	// phase MemoryAllocation { int address }
	@Override
	public Object visit(Variable_definition variable_definition, Object param) {
		String result = "";
		// si es una variable global.
		if (variable_definition.isGlobal() == true) {
			result += "#GLOBAL ";
		} else {
			result += "#LOCAL ";
		}

		if (simpleType(variable_definition.getType())) {
			result += variable_definition.getName() + ":" + variable_definition.getType().getMaplName( "");
		} 
		else {
			if (variable_definition.getType() instanceof Array_type) {
				result += variable_definition.getName() + ":" + ((Array_type)variable_definition.getType()).getMaplName( "");
			}
			if (variable_definition.getType() instanceof Struct_type) {
				result += variable_definition.getName() + ":" + ((Struct_type)variable_definition.getType()).getMaplName("") ;
			}
		}

		out(result);

		return null;
	}

	// class Struct_definition(String name, List<Variable_definition> variable_definitions)
	// phase MemoryAllocation { int address }
	@Override
	public Object visit(Struct_definition struct_definition, Object param) {

		out("#type " + struct_definition.getName() + ": {");

		// execute(struct_definition.variable_definitions());
		//metadata(struct_definition.variable_definitions());
		for (Variable_definition variables : struct_definition.getVariable_definitions()) {
			out("\t" + variables.getName() + ":" + variables.getType().getMaplName( ""));
		}

		out("}");

		return null;
	}

	// class Function_definition(String name, List<Variable_definition> params, Type type, List<Variable_definition> variable_definitions, List<Statement> statements)
	@Override
	public Object visit(Function_definition function_definition, Object param) {

		out("#FUNC " + function_definition.getName());
		out("#RET " + function_definition.getType().getMaplName( ""));

		// execute(function_definition.params());
		// metadata(function_definition.params());

		// PARAMETROS
		for (Variable_definition parametros: function_definition.getParams()) {
			out("#PARAM " + parametros.getName() + ":" + parametros.getType().getMaplName( ""));
		}

		// execute(function_definition.variable_definitions());
		// metadata(function_definition.variable_definitions());

		// VARIABLES LOCALES
		for (Variable_definition variable : function_definition.getVariable_definitions()) {
			metadata(variable);
		}

		// execute(function_definition.statements());

		return null;
	}


	private boolean simpleType(Type type) {
		if (type instanceof Int_type)
			return true;
		if (type instanceof Real_type)
			return true;
		if (type instanceof Char_type)
			return true;
		if (type instanceof Struct_type)
			return false;
		if (type instanceof Array_type) 
			return false;

		// Sealed classes + pattern matching would avoid this situation. Those features were not
		// finished when this code was implemented
		throw new IllegalArgumentException("Unknown Type: " + type);
	}


}
