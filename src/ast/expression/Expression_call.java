// Generated with VGen 2.0.0

package ast.expression;

import ast.type.*;
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
	Expression_call: expression -> name:string expressions:expression*
	expression -> 
	
	PHASE Identification
	Expression_call -> function_definition:Function_definition
	
	PHASE TypeChecking
	expression -> typeExpression:type
	expression -> lvalue:boolean
*/
public class Expression_call extends AbstractExpression  {

    // ----------------------------------
    // Instance Variables

	// Expression_call: expression -> string expression*
	private String name;
	private List<Expression> expressions;

    // PHASE Identification
	private Function_definition function_definition;

    // ----------------------------------
    // Constructors

	public Expression_call(String name, List<Expression> expressions) {
		super();

		if (name == null)
			throw new IllegalArgumentException("Parameter 'name' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.name = name;

		if (expressions == null)
			expressions = new ArrayList<>();
		this.expressions = expressions;

		updatePositions(name, expressions);
	}

	public Expression_call(Object name, Object expressions) {
		super();

        if (name == null)
            throw new IllegalArgumentException("Parameter 'name' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.name = (name instanceof Token) ? ((Token) name).getText() : (String) name;

        this.expressions = castList(expressions, unwrapIfContext.andThen(Expression.class::cast));
		updatePositions(name, expressions);
	}


    // ----------------------------------
    // Expression_call: expression -> string expression*

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
        return "Expression_call{" + " name=" + this.getName() + " expressions=" + this.getExpressions() + "}";
    }


    // %% User Members -------------------------

        // Methods/attributes in this section will be preserved. Delete if not needed

    // %% --------------------------------------
}
