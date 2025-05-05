// Generated with VGen 2.0.0

package ast.declaration;

import ast.type.*;
import ast.statement.*;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;
import org.antlr.v4.runtime.Token;
import visitor.Visitor;

// %% User Declarations -------------

    // Declarations (e.g. imports) in this section will be preserved. Delete if not needed

// %% -------------------------------

/*
	Function_definition: declaration -> name:string params:Variable_definition* type:type variable_definitions:Variable_definition* statements:statement*
	declaration -> 
*/
public class Function_definition extends AbstractDeclaration  {

    // ----------------------------------
    // Instance Variables

	// Function_definition: declaration -> string params:Variable_definition* type Variable_definition* statement*
	private String name;
	private List<Variable_definition> params;
	private Type type;
	private List<Variable_definition> variable_definitions;
	private List<Statement> statements;

    // ----------------------------------
    // Constructors

	public Function_definition(String name, List<Variable_definition> params, Type type, List<Variable_definition> variable_definitions, List<Statement> statements) {
		super();

		if (name == null)
			throw new IllegalArgumentException("Parameter 'name' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.name = name;

		if (params == null)
			params = new ArrayList<>();
		this.params = params;

		if (type == null)
			throw new IllegalArgumentException("Parameter 'type' can't be null. Pass a non-null value or use 'type?' in the abstract grammar");
		this.type = type;

		if (variable_definitions == null)
			variable_definitions = new ArrayList<>();
		this.variable_definitions = variable_definitions;

		if (statements == null)
			statements = new ArrayList<>();
		this.statements = statements;

		updatePositions(name, params, type, variable_definitions, statements);
	}

	public Function_definition(Object name, Object params, Object type, Object variable_definitions, Object statements) {
		super();

        if (name == null)
            throw new IllegalArgumentException("Parameter 'name' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.name = (name instanceof Token) ? ((Token) name).getText() : (String) name;

        this.params = castList(params, unwrapIfContext.andThen(Variable_definition.class::cast));
        if (type == null)
            throw new IllegalArgumentException("Parameter 'type' can't be null. Pass a non-null value or use 'type?' in the abstract grammar");
		this.type = (Type) type;

        this.variable_definitions = castList(variable_definitions, unwrapIfContext.andThen(Variable_definition.class::cast));
        this.statements = castList(statements, unwrapIfContext.andThen(Statement.class::cast));
		updatePositions(name, params, type, variable_definitions, statements);
	}


    // ----------------------------------
    // Function_definition: declaration -> string params:Variable_definition* type Variable_definition* statement*

	// Child 'string' 

	public void setName(String name) {
		if (name == null)
			throw new IllegalArgumentException("Parameter 'name' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.name = name;

	}

    public String getName() {
        return name;
    }


	// Child 'params:Variable_definition*' 

	public void setParams(List<Variable_definition> params) {
		if (params == null)
			params = new ArrayList<>();
		this.params = params;

	}

    public List<Variable_definition> getParams() {
        return params;
    }

    public Stream<Variable_definition> params() {
        return params.stream();
    }


	// Child 'type' 

	public void setType(Type type) {
		if (type == null)
			throw new IllegalArgumentException("Parameter 'type' can't be null. Pass a non-null value or use 'type?' in the abstract grammar");
		this.type = type;

	}

    public Type getType() {
        return type;
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


	// Child 'statement*' 

	public void setStatements(List<Statement> statements) {
		if (statements == null)
			statements = new ArrayList<>();
		this.statements = statements;

	}

    public List<Statement> getStatements() {
        return statements;
    }

    public Stream<Statement> statements() {
        return statements.stream();
    }


    // ----------------------------------
    // Helper methods

    @Override
    public Object accept(Visitor v, Object param) {
        return v.visit(this, param);
    }

    @Override
    public String toString() {
        return "Function_definition{" + " name=" + this.getName() + " params=" + this.getParams() + " type=" + this.getType() + " variable_definitions=" + this.getVariable_definitions() + " statements=" + this.getStatements() + "}";
    }


    // %% User Members -------------------------

        // Methods/attributes in this section will be preserved. Delete if not needed

    // %% --------------------------------------
}
