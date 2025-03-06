// Generated with VGen 2.0.0

package ast.declaration;

import ast.*;
import ast.type.*;
import ast.statement.*;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;
import java.util.Optional;
import org.antlr.v4.runtime.Token;
import visitor.Visitor;

// %% User Declarations -------------

    // Declarations (e.g. imports) in this section will be preserved. Delete if not needed

// %% -------------------------------


/*
	Function_definition: declaration -> name:string local_variables:local_variable* type:type? variable_definitions:Variable_definition* statements:statement*
	declaration -> 
*/
public class Function_definition extends AbstractDeclaration  {

    // ----------------------------------
    // Instance Variables

	// Function_definition: declaration -> string local_variable* type? Variable_definition* statement*
	private String name;
	private List<Local_variable> local_variables;
	private Optional<Type> type;
	private List<Variable_definition> variable_definitions;
	private List<Statement> statements;

    // ----------------------------------
    // Constructors

	public Function_definition(String name, List<Local_variable> local_variables, Optional<Type> type, List<Variable_definition> variable_definitions, List<Statement> statements) {
		super();

		if (name == null)
			throw new IllegalArgumentException("Parameter 'name' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.name = name;

		if (local_variables == null)
			local_variables = new ArrayList<>();
		this.local_variables = local_variables;

		if (type == null)
			type = Optional.empty();
		this.type = type;

		if (variable_definitions == null)
			variable_definitions = new ArrayList<>();
		this.variable_definitions = variable_definitions;

		if (statements == null)
			statements = new ArrayList<>();
		this.statements = statements;

		updatePositions(name, local_variables, type, variable_definitions, statements);
	}

	public Function_definition(Object name, Object local_variables, Object type, Object variable_definitions, Object statements) {
		super();

        if (name == null)
            throw new IllegalArgumentException("Parameter 'name' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.name = (name instanceof Token) ? ((Token) name).getText() : (String) name;

        this.local_variables = castList(local_variables, unwrapIfContext.andThen(Local_variable.class::cast));
        this.type = castOptional(type, Type.class);
        this.variable_definitions = castList(variable_definitions, unwrapIfContext.andThen(Variable_definition.class::cast));
        this.statements = castList(statements, unwrapIfContext.andThen(Statement.class::cast));
		updatePositions(name, local_variables, type, variable_definitions, statements);
	}


    // ----------------------------------
    // Function_definition: declaration -> string local_variable* type? Variable_definition* statement*

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


	// Child 'type?' 

	public void setType(Optional<Type> type) {
		if (type == null)
			type = Optional.empty();
		this.type = type;

	}

    public Optional<Type> getType() {
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
        return "Function_definition{" + " name=" + this.getName() + " local_variables=" + this.getLocal_variables() + " type=" + this.getType() + " variable_definitions=" + this.getVariable_definitions() + " statements=" + this.getStatements() + "}";
    }


    // %% User Members -------------------------

        // Methods/attributes in this section will be preserved. Delete if not needed

    // %% --------------------------------------

}
