// Generated with VGen 2.0.0

package ast.expression;

import ast.*;
import ast.type.*;
import org.antlr.v4.runtime.Token;

// %% User Declarations -------------

    // Declarations (e.g. imports) in this section will be preserved. Delete if not needed

// %% -------------------------------

/*
	expression -> 
	
	PHASE TypeChecking
	expression -> typeExpression:type
	expression -> lvalue:boolean
*/
public interface Expression extends AST {




    // --------------------------------
    // PHASE TypeChecking

	// Attribute 'typeExpression:type' 

	public void setTypeExpression(Type typeExpression);
	public Type getTypeExpression();

	// Attribute 'lvalue:boolean' 

	public void setLvalue(boolean lvalue);
	public boolean isLvalue();


    // %% User Members -------------------------

        // Methods/attributes in this section will be preserved. Delete if not needed

    // %% --------------------------------------
}
