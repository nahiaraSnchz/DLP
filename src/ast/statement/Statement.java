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
public interface Statement extends AST {




    // --------------------------------
    // PHASE TypeChecking

	// Attribute 'function:Function_definition' 

	public void setFunction(Function_definition function);
	public Function_definition getFunction();


    // %% User Members -------------------------

        // Methods/attributes in this section will be preserved. Delete if not needed

    // %% --------------------------------------
}
