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

		out("<instruction>");

		return null;
	}

	// class Variable_definition(String name, Type type)
	// phase MemoryAllocation { int address }
	@Override
	public Object visit(Variable_definition variable_definition, Object param) {

		out("<instruction>");

		return null;
	}

}
