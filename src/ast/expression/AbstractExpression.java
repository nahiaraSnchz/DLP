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
public abstract class AbstractExpression extends AbstractAST implements Expression {

    // ----------------------------------
    // Instance Variables


    // PHASE TypeChecking
	private Type typeExpression;
	private boolean lvalue;



    // --------------------------------
    // PHASE TypeChecking

	// Attribute 'typeExpression:type' 

	public void setTypeExpression(Type typeExpression) {
		if (typeExpression == null)
			throw new IllegalArgumentException("Parameter 'typeExpression' can't be null. Pass a non-null value or use 'type?' in the abstract grammar");
		this.typeExpression = typeExpression;

	}

    public Type getTypeExpression() {
        return typeExpression;
    }


	// Attribute 'lvalue:boolean' 

	public void setLvalue(boolean lvalue) {
		this.lvalue = lvalue;

	}

    public boolean isLvalue() {
        return lvalue;
    }



    // %% User Members -------------------------

        // Methods/attributes in this section will be preserved. Delete if not needed

    // %% --------------------------------------
}
