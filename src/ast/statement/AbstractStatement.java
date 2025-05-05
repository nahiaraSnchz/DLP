// Generated with VGen 2.0.0

package ast.statement;

import ast.*;
import ast.declaration.*;

// %% User Declarations -------------

    // Declarations (e.g. imports) in this section will be preserved. Delete if not needed

// %% -------------------------------

/*
	statement -> 
	
	PHASE TypeChecking
	statement -> function:Function_definition
*/
public abstract class AbstractStatement extends AbstractAST implements Statement {

    // ----------------------------------
    // Instance Variables


    // PHASE TypeChecking
	private Function_definition function;



    // --------------------------------
    // PHASE TypeChecking

	// Attribute 'function:Function_definition' 

	public void setFunction(Function_definition function) {
		if (function == null)
			throw new IllegalArgumentException("Parameter 'function' can't be null. Pass a non-null value or use 'Function_definition?' in the abstract grammar");
		this.function = function;

	}

    public Function_definition getFunction() {
        return function;
    }



    // %% User Members -------------------------

        // Methods/attributes in this section will be preserved. Delete if not needed

    // %% --------------------------------------
}
