// Generated with VGen 2.0.0

package ast.declaration;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;
import org.antlr.v4.runtime.Token;
import visitor.Visitor;

// %% User Declarations -------------

    // Declarations (e.g. imports) in this section will be preserved. Delete if not needed

// %% -------------------------------

/*
	Struct_definition: declaration -> name:string variable_definitions:Variable_definition*
	declaration -> 
	
	PHASE MemoryAllocation
	Struct_definition -> address:int
*/
public class Struct_definition extends AbstractDeclaration  {

    // ----------------------------------
    // Instance Variables

	// Struct_definition: declaration -> string Variable_definition*
	private String name;
	private List<Variable_definition> variable_definitions;

    // PHASE MemoryAllocation
	private int address;

    // ----------------------------------
    // Constructors

	public Struct_definition(String name, List<Variable_definition> variable_definitions) {
		super();

		if (name == null)
			throw new IllegalArgumentException("Parameter 'name' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.name = name;

		if (variable_definitions == null)
			variable_definitions = new ArrayList<>();
		this.variable_definitions = variable_definitions;

		updatePositions(name, variable_definitions);
	}

	public Struct_definition(Object name, Object variable_definitions) {
		super();

        if (name == null)
            throw new IllegalArgumentException("Parameter 'name' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.name = (name instanceof Token) ? ((Token) name).getText() : (String) name;

        this.variable_definitions = castList(variable_definitions, unwrapIfContext.andThen(Variable_definition.class::cast));
		updatePositions(name, variable_definitions);
	}


    // ----------------------------------
    // Struct_definition: declaration -> string Variable_definition*

	// Child 'string' 

	public void setName(String name) {
		if (name == null)
			throw new IllegalArgumentException("Parameter 'name' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.name = name;

	}

    public String getName() {
        return name;
    }


	// Child 'Variable_definition*' 

	public void setVariable_definitions(List<Variable_definition> variable_definitions) {
		if (variable_definitions == null)
			variable_definitions = new ArrayList<>();
		this.variable_definitions = variable_definitions;

	}

    public List<Variable_definition> getVariable_definitions() {
        return variable_definitions;
    }

    public Stream<Variable_definition> variable_definitions() {
        return variable_definitions.stream();
    }



    // --------------------------------
    // PHASE MemoryAllocation

	// Attribute 'address:int' 

	public void setAddress(int address) {
		this.address = address;

	}

    public int getAddress() {
        return address;
    }


    // ----------------------------------
    // Helper methods

    @Override
    public Object accept(Visitor v, Object param) {
        return v.visit(this, param);
    }

    @Override
    public String toString() {
        return "Struct_definition{" + " name=" + this.getName() + " variable_definitions=" + this.getVariable_definitions() + "}";
    }


    // %% User Members -------------------------

        // Methods/attributes in this section will be preserved. Delete if not needed

    // %% --------------------------------------
}
