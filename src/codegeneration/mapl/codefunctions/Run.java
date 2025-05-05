// Generated with VGen 2.0.0

package codegeneration.mapl.codefunctions;

import ast.*;
import ast.declaration.Variable_definition;
import codegeneration.mapl.*;


public class Run extends AbstractCodeFunction {

    public Run(MaplCodeSpecification specification) {
        super(specification);
    }


	// class Program(List<Declaration> declarations)
	@Override
	public Object visit(Program program, Object param) {

		metadata(program);
		for (var declaration : program.getDeclarations()) {
			if (!(declaration instanceof Variable_definition)) {
				//execute(declaration);
			}
		}
        
        out("halt");

        return null;
	}

}
