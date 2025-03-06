// Generated with VGen 2.0.0

package ast.statement;

import ast.expression.*;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;
import visitor.Visitor;

// %% User Declarations -------------

    // Declarations (e.g. imports) in this section will be preserved. Delete if not needed

// %% -------------------------------


/*
	If_statement: statement -> expression:expression st1:statement* st2:statement*
	statement -> 
*/
public class If_statement extends AbstractStatement  {

    // ----------------------------------
    // Instance Variables

	// If_statement: statement -> expression st1:statement* st2:statement*
	private Expression expression;
	private List<Statement> st1;
	private List<Statement> st2;

    // ----------------------------------
    // Constructors

	public If_statement(Expression expression, List<Statement> st1, List<Statement> st2) {
		super();

		if (expression == null)
			throw new IllegalArgumentException("Parameter 'expression' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.expression = expression;

		if (st1 == null)
			st1 = new ArrayList<>();
		this.st1 = st1;

		if (st2 == null)
			st2 = new ArrayList<>();
		this.st2 = st2;

		updatePositions(expression, st1, st2);
	}

	public If_statement(Object expression, Object st1, Object st2) {
		super();

        if (expression == null)
            throw new IllegalArgumentException("Parameter 'expression' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.expression = (Expression) expression;

        this.st1 = castList(st1, unwrapIfContext.andThen(Statement.class::cast));
        this.st2 = castList(st2, unwrapIfContext.andThen(Statement.class::cast));
		updatePositions(expression, st1, st2);
	}


    // ----------------------------------
    // If_statement: statement -> expression st1:statement* st2:statement*

	// Child 'expression' 

	public void setExpression(Expression expression) {
		if (expression == null)
			throw new IllegalArgumentException("Parameter 'expression' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.expression = expression;

	}

    public Expression getExpression() {
        return expression;
    }


	// Child 'st1:statement*' 

	public void setSt1(List<Statement> st1) {
		if (st1 == null)
			st1 = new ArrayList<>();
		this.st1 = st1;

	}

    public List<Statement> getSt1() {
        return st1;
    }

    public Stream<Statement> st1() {
        return st1.stream();
    }


	// Child 'st2:statement*' 

	public void setSt2(List<Statement> st2) {
		if (st2 == null)
			st2 = new ArrayList<>();
		this.st2 = st2;

	}

    public List<Statement> getSt2() {
        return st2;
    }

    public Stream<Statement> st2() {
        return st2.stream();
    }


    // ----------------------------------
    // Helper methods

    @Override
    public Object accept(Visitor v, Object param) {
        return v.visit(this, param);
    }

    @Override
    public String toString() {
        return "If_statement{" + " expression=" + this.getExpression() + " st1=" + this.getSt1() + " st2=" + this.getSt2() + "}";
    }


    // %% User Members -------------------------

        // Methods/attributes in this section will be preserved. Delete if not needed

    // %% --------------------------------------

}
