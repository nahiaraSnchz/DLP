// Generated with VGen 2.0.0

package ast.expression;

import ast.type.*;
import org.antlr.v4.runtime.Token;
import visitor.Visitor;

// %% User Declarations -------------

    // Declarations (e.g. imports) in this section will be preserved. Delete if not needed

// %% -------------------------------

/*
	Arythmetic_expression: expression -> left:expression operador:string right:expression
	expression -> 
	
	PHASE TypeChecking
	expression -> typeExpression:type
	expression -> lvalue:boolean
*/
public class Arythmetic_expression extends AbstractExpression  {

    // ----------------------------------
    // Instance Variables

	// Arythmetic_expression: expression -> left:expression operador:string right:expression
	private Expression left;
	private String operador;
	private Expression right;

    // ----------------------------------
    // Constructors

	public Arythmetic_expression(Expression left, String operador, Expression right) {
		super();

		if (left == null)
			throw new IllegalArgumentException("Parameter 'left' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.left = left;

		if (operador == null)
			throw new IllegalArgumentException("Parameter 'operador' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.operador = operador;

		if (right == null)
			throw new IllegalArgumentException("Parameter 'right' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.right = right;

		updatePositions(left, operador, right);
	}

	public Arythmetic_expression(Object left, Object operador, Object right) {
		super();

        if (left == null)
            throw new IllegalArgumentException("Parameter 'left' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.left = (Expression) left;

        if (operador == null)
            throw new IllegalArgumentException("Parameter 'operador' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.operador = (operador instanceof Token) ? ((Token) operador).getText() : (String) operador;

        if (right == null)
            throw new IllegalArgumentException("Parameter 'right' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.right = (Expression) right;

		updatePositions(left, operador, right);
	}


    // ----------------------------------
    // Arythmetic_expression: expression -> left:expression operador:string right:expression

	// Child 'left:expression' 

	public void setLeft(Expression left) {
		if (left == null)
			throw new IllegalArgumentException("Parameter 'left' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.left = left;

	}

    public Expression getLeft() {
        return left;
    }


	// Child 'operador:string' 

	public void setOperador(String operador) {
		if (operador == null)
			throw new IllegalArgumentException("Parameter 'operador' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.operador = operador;

	}

    public String getOperador() {
        return operador;
    }


	// Child 'right:expression' 

	public void setRight(Expression right) {
		if (right == null)
			throw new IllegalArgumentException("Parameter 'right' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.right = right;

	}

    public Expression getRight() {
        return right;
    }


    // ----------------------------------
    // Helper methods

    @Override
    public Object accept(Visitor v, Object param) {
        return v.visit(this, param);
    }

    @Override
    public String toString() {
        return "Arythmetic_expression{" + " left=" + this.getLeft() + " operador=" + this.getOperador() + " right=" + this.getRight() + "}";
    }


    // %% User Members -------------------------

        // Methods/attributes in this section will be preserved. Delete if not needed

		public String getMaplOperador() {
			switch (operador) {
				case "+":
					return "add" + getLeft().getTypeExpression().getSuffix();
				case "-":
					return "sub" + getLeft().getTypeExpression().getSuffix();
				case "*":
					return "mul" + getLeft().getTypeExpression().getSuffix();
				case "/":
					return "div" + getLeft().getTypeExpression().getSuffix();
				case "%":
					return "mod" + getLeft().getTypeExpression().getSuffix();
				default:
					throw new IllegalArgumentException("Unknown operator: " + operador);
			}
		}

    // %% --------------------------------------
}
