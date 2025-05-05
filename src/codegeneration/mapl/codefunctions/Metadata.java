// Generated with VGen 2.0.0

package codegeneration.mapl.codefunctions;

import java.sql.Struct;
import java.util.ArrayList;
import java.util.List;

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
			if (declarations instanceof Variable_definition) {
				metadata(declarations);
			}
		}

		return null;
	}

	// class Variable_definition(String name, Type type)
	// phase MemoryAllocation { int address }
	@Override
	public Object visit(Variable_definition variable_definition, Object param) {

		if (simpleType(variable_definition.getType())) {
			out("#GLOBAL " + variable_definition.getName() + ":" + getMaplName(variable_definition.getType(), ""));
		} 
		else {
			// Struct
			if (variable_definition.getType() instanceof Struct_type) {
				Struct_type struct = (Struct_type) variable_definition.getType();
				out("#type " + variable_definition.getName() + ": {");
				Struct_definition struct_definition = ((Struct_type)variable_definition.getType()).getStruct_definition();
				for (Variable_definition var: struct_definition.getVariable_definitions()) {
					out("\t" + var.getName() + ":" + getMaplName(var.getType(), "") );
				}
				out("}");

			// Array
			} else if (variable_definition.getType() instanceof Array_type) {
				out("#GLOBAL " + variable_definition.getName() + ":" + getMaplName((Array_type)variable_definition.getType(), ""));
			}
		}

		

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

	// Metodo auxiliar
	private String getMaplName(Type type, String s) {
        if (type instanceof Int_type)
            return "int";
        if (type instanceof Real_type)
            return "float";
		if (type instanceof Char_type)
			return "char";
		if (type instanceof Array_type) {
			// si no hay mas arrays anidados
			if (simpleType(((Array_type)type).getType()) == true) {
				// añado el numero entre []
				s += ((Array_type)type).getName() + "*" + getMaplName(((Array_type)type).getType(), "");
				return s;
			}
			else {
				s += getMaplName(((Array_type)type).getType(), s);
			}	
		}


        // Sealed classes + pattern matching would avoid this situation. Those features were not
        // finished when this code was implemented
        throw new IllegalArgumentException("Unknown Type: " + type);
    }

}
