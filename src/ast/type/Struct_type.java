// Generated with VGen 2.0.0

package ast.type;

import ast.declaration.*;
import org.antlr.v4.runtime.Token;
import visitor.Visitor;

// %% User Declarations -------------

    // Declarations (e.g. imports) in this section will be preserved. Delete if not needed

// %% -------------------------------

/*
	Struct_type: type -> name:string
	type -> 
	
	PHASE Identification
	Struct_type -> struct_definition:Struct_definition
*/
public class Struct_type extends AbstractType  {

    // ----------------------------------
    // Instance Variables

	// Struct_type: type -> name:string
	private String name;

    // PHASE Identification
	private Struct_definition struct_definition;

    // ----------------------------------
    // Constructors

	public Struct_type(String name) {
		super();

		if (name == null)
			throw new IllegalArgumentException("Parameter 'name' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.name = name;

		updatePositions(name);
	}

	public Struct_type(Object name) {
		super();

        if (name == null)
            throw new IllegalArgumentException("Parameter 'name' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.name = (name instanceof Token) ? ((Token) name).getText() : (String) name;

		updatePositions(name);
	}


    // ----------------------------------
    // Struct_type: type -> name:string

	// Child 'name:string' 

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

	// Attribute 'Struct_definition' 

	public void setStruct_definition(Struct_definition struct_definition) {
		if (struct_definition == null)
			throw new IllegalArgumentException("Parameter 'struct_definition' can't be null. Pass a non-null value or use 'Struct_definition?' in the abstract grammar");
		this.struct_definition = struct_definition;

	}

    public Struct_definition getStruct_definition() {
        return struct_definition;
    }


    // ----------------------------------
    // Helper methods

    @Override
    public Object accept(Visitor v, Object param) {
        return v.visit(this, param);
    }

    @Override
    public String toString() {
        return "Struct_type{" + " name=" + this.getName() + "}";
    }


    // %% User Members -------------------------

        // Methods/attributes in this section will be preserved. Delete if not needed

        @Override
        public int getSize() {
            int size = 0;
            for (Variable_definition var : struct_definition.getVariable_definitions()) {
                if (var.getType() != null) {
                    size += var.getType().getSize();
                }
            }
            return size; // Default size if no variable definitions are found
        }

    // %% --------------------------------------
}
