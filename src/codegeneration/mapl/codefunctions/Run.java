// Generated with VGen 2.0.0

package codegeneration.mapl.codefunctions;

import ast.*;
import codegeneration.mapl.*;


public class Run extends AbstractCodeFunction {

    public Run(MaplCodeSpecification specification) {
        super(specification);
    }


	// class Program(List<Declaration> declarations)
	@Override
	public Object visit(Program program, Object param) {

		metadata(program);
		out("call main");
		out("halt");
		for (var declaration : program.getDeclarations()) {
			execute(declaration);
			out("");
		}
        

        return null;
	}

}
