// Generated with VGen 2.0.0

package ast.expression;

import ast.type.*;
import ast.declaration.*;
import org.antlr.v4.runtime.Token;
import visitor.Visitor;

// %% User Declarations -------------

    // Declarations (e.g. imports) in this section will be preserved. Delete if not needed

// %% -------------------------------

/*
	Variable: expression -> name:string
	expression -> 
	
	PHASE Identification
	Variable -> variable_definition:Variable_definition
	
	PHASE TypeChecking
	expression -> typeExpression:type
	expression -> lvalue:boolean
*/
public class Variable extends AbstractExpression  {

    // ----------------------------------
    // Instance Variables

	// Variable: expression -> string
	private String name;

    // PHASE Identification
	private Variable_definition variable_definition;

    // ----------------------------------
    // Constructors

	public Variable(String name) {
		super();

		if (name == null)
			throw new IllegalArgumentException("Parameter 'name' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.name = name;

		updatePositions(name);
	}

	public Variable(Object name) {
		super();

        if (name == null)
            throw new IllegalArgumentException("Parameter 'name' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.name = (name instanceof Token) ? ((Token) name).getText() : (String) name;

		updatePositions(name);
	}


    // ----------------------------------
    // Variable: expression -> string

	// Child 'string' 

	public void setName(String name) {
		if (name == null)
			throw new IllegalArgumentException("Parameter 'name' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.name = name;

	}

    public String getName() {
        return name;
    }



    // --------------------------------
    // PHASE Identification

	// Attribute 'Variable_definition' 

	public void setVariable_definition(Variable_definition variable_definition) {
		if (variable_definition == null)
			throw new IllegalArgumentException("Parameter 'variable_definition' can't be null. Pass a non-null value or use 'Variable_definition?' in the abstract grammar");
		this.variable_definition = variable_definition;

	}

    public Variable_definition getVariable_definition() {
        return variable_definition;
    }


    // ----------------------------------
    // Helper methods

    @Override
    public Object accept(Visitor v, Object param) {
        return v.visit(this, param);
    }

    @Override
    public String toString() {
        return "Variable{" + " name=" + this.getName() + "}";
    }


    // %% User Members -------------------------

        // Methods/attributes in this section will be preserved. Delete if not needed

    // %% --------------------------------------
}
