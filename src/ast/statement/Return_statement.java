// Generated with VGen 2.0.0

package ast.statement;

import ast.expression.*;
import java.util.Optional;
import visitor.Visitor;

// %% User Declarations -------------

    // Declarations (e.g. imports) in this section will be preserved. Delete if not needed

// %% -------------------------------


/*
	Return_statement: statement -> expression:expression?
	statement -> 
*/
public class Return_statement extends AbstractStatement  {

    // ----------------------------------
    // Instance Variables

	// Return_statement: statement -> expression?
	private Optional<Expression> expression;

    // ----------------------------------
    // Constructors

	public Return_statement(Optional<Expression> expression) {
		super();

		if (expression == null)
			expression = Optional.empty();
		this.expression = expression;

		updatePositions(expression);
	}

	public Return_statement(Object expression) {
		super();

        this.expression = castOptional(expression, Expression.class);
		updatePositions(expression);
	}


    // ----------------------------------
    // Return_statement: statement -> expression?

	// Child 'expression?' 

	public void setExpression(Optional<Expression> expression) {
		if (expression == null)
			expression = Optional.empty();
		this.expression = expression;

	}

    public Optional<Expression> getExpression() {
        return expression;
    }


    // ----------------------------------
    // Helper methods

    @Override
    public Object accept(Visitor v, Object param) {
        return v.visit(this, param);
    }

    @Override
    public String toString() {
        return "Return_statement{" + " expression=" + this.getExpression() + "}";
    }


    // %% User Members -------------------------

        // Methods/attributes in this section will be preserved. Delete if not needed

    // %% --------------------------------------

}
