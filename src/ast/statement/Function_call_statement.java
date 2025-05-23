// Generated with VGen 2.0.0

package ast.statement;

import ast.expression.*;
import ast.declaration.*;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;
import org.antlr.v4.runtime.Token;
import visitor.Visitor;

// %% User Declarations -------------

    // Declarations (e.g. imports) in this section will be preserved. Delete if not needed

// %% -------------------------------

/*
	Function_call_statement: statement -> name:string expressions:expression*
	statement -> 
	
	PHASE Identification
	Function_call_statement -> function_definition:Function_definition
	
	PHASE TypeChecking
	statement -> function:Function_definition
*/
public class Function_call_statement extends AbstractStatement  {

    // ----------------------------------
    // Instance Variables

	// Function_call_statement: statement -> string expression*
	private String name;
	private List<Expression> expressions;

    // PHASE Identification
	private Function_definition function_definition;

    // ----------------------------------
    // Constructors

	public Function_call_statement(String name, List<Expression> expressions) {
		super();

		if (name == null)
			throw new IllegalArgumentException("Parameter 'name' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.name = name;

		if (expressions == null)
			expressions = new ArrayList<>();
		this.expressions = expressions;

		updatePositions(name, expressions);
	}

	public Function_call_statement(Object name, Object expressions) {
		super();

        if (name == null)
            throw new IllegalArgumentException("Parameter 'name' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.name = (name instanceof Token) ? ((Token) name).getText() : (String) name;

        this.expressions = castList(expressions, unwrapIfContext.andThen(Expression.class::cast));
		updatePositions(name, expressions);
	}


    // ----------------------------------
    // Function_call_statement: statement -> string expression*

	// Child 'string' 

	public void setName(String name) {
		if (name == null)
			throw new IllegalArgumentException("Parameter 'name' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.name = name;

	}

    public String getName() {
        return name;
    }


	// Child 'expression*' 

	public void setExpressions(List<Expression> expressions) {
		if (expressions == null)
			expressions = new ArrayList<>();
		this.expressions = expressions;

	}

    public List<Expression> getExpressions() {
        return expressions;
    }

    public Stream<Expression> expressions() {
        return expressions.stream();
    }



    // --------------------------------
    // PHASE Identification

	// Attribute 'Function_definition' 

	public void setFunction_definition(Function_definition function_definition) {
		if (function_definition == null)
			throw new IllegalArgumentException("Parameter 'function_definition' can't be null. Pass a non-null value or use 'Function_definition?' in the abstract grammar");
		this.function_definition = function_definition;

	}

    public Function_definition getFunction_definition() {
        return function_definition;
    }


    // ----------------------------------
    // Helper methods

    @Override
    public Object accept(Visitor v, Object param) {
        return v.visit(this, param);
    }

    @Override
    public String toString() {
        return "Function_call_statement{" + " name=" + this.getName() + " expressions=" + this.getExpressions() + "}";
    }


    // %% User Members -------------------------

        // Methods/attributes in this section will be preserved. Delete if not needed

    // %% --------------------------------------
}
