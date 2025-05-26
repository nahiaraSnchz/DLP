// Generated with VGen 2.0.0

package codegeneration.mapl.codefunctions;

import ast.*;
import ast.declaration.*;
import codegeneration.mapl.*;


public class Metadata extends AbstractCodeFunction {

    public Metadata(MaplCodeSpecification specification) {
        super(specification);
    }


	// class Program(List<Declaration> declarations)
	@Override
	public Object visit(Program program, Object param) {

		// execute(program.declarations());
		// metadata(program.declarations());

		out("<instruction>");

		return null;
	}

	// class Variable_definition(String name, Type type)
	// phase Identification { boolean global }
	// phase MemoryAllocation { int address }
	@Override
	public Object visit(Variable_definition variable_definition, Object param) {

		out("<instruction>");

		return null;
	}

	// class Struct_definition(String name, List<Variable_definition> variable_definitions)
	// phase MemoryAllocation { int address }
	@Override
	public Object visit(Struct_definition struct_definition, Object param) {

		// execute(struct_definition.variable_definitions());
		// metadata(struct_definition.variable_definitions());

		out("<instruction>");

		return null;
	}

	// class Function_definition(String name, List<Variable_definition> params, Type type, List<Variable_definition> variable_definitions, List<Statement> statements)
	@Override
	public Object visit(Function_definition function_definition, Object param) {

		// execute(function_definition.params());
		// metadata(function_definition.params());

		// execute(function_definition.variable_definitions());
		// metadata(function_definition.variable_definitions());

		// execute(function_definition.statements());

		out("<instruction>");

		return null;
	}

}
