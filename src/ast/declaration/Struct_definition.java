// Generated with VGen 2.0.0

package ast.declaration;

import ast.*;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;
import org.antlr.v4.runtime.Token;
import visitor.Visitor;

// %% User Declarations -------------

    // Declarations (e.g. imports) in this section will be preserved. Delete if not needed

// %% -------------------------------


/*
	Struct_definition: declaration -> name:string local_variables:local_variable*
	declaration -> 
*/
public class Struct_definition extends AbstractDeclaration  {

    // ----------------------------------
    // Instance Variables

	// Struct_definition: declaration -> string local_variable*
	private String name;
	private List<Local_variable> local_variables;

    // ----------------------------------
    // Constructors

	public Struct_definition(String name, List<Local_variable> local_variables) {
		super();

		if (name == null)
			throw new IllegalArgumentException("Parameter 'name' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.name = name;

		if (local_variables == null)
			local_variables = new ArrayList<>();
		this.local_variables = local_variables;

		updatePositions(name, local_variables);
	}

	public Struct_definition(Object name, Object local_variables) {
		super();

        if (name == null)
            throw new IllegalArgumentException("Parameter 'name' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.name = (name instanceof Token) ? ((Token) name).getText() : (String) name;

        this.local_variables = castList(local_variables, unwrapIfContext.andThen(Local_variable.class::cast));
		updatePositions(name, local_variables);
	}


    // ----------------------------------
    // Struct_definition: declaration -> string local_variable*

	// Child 'string' 

	public void setName(String name) {
		if (name == null)
			throw new IllegalArgumentException("Parameter 'name' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.name = name;

	}

    public String getName() {
        return name;
    }


	// Child 'local_variable*' 

	public void setLocal_variables(List<Local_variable> local_variables) {
		if (local_variables == null)
			local_variables = new ArrayList<>();
		this.local_variables = local_variables;

	}

    public List<Local_variable> getLocal_variables() {
        return local_variables;
    }

    public Stream<Local_variable> local_variables() {
        return local_variables.stream();
    }


    // ----------------------------------
    // Helper methods

    @Override
    public Object accept(Visitor v, Object param) {
        return v.visit(this, param);
    }

    @Override
    public String toString() {
        return "Struct_definition{" + " name=" + this.getName() + " local_variables=" + this.getLocal_variables() + "}";
    }


    // %% User Members -------------------------

        // Methods/attributes in this section will be preserved. Delete if not needed

    // %% --------------------------------------

}
