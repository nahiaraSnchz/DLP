// Generated with VGen 2.0.0

package ast;

import ast.declaration.*;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;
import visitor.Visitor;

// %% User Declarations -------------

    // Declarations (e.g. imports) in this section will be preserved. Delete if not needed

// %% -------------------------------


/*
	program -> declarations:declaration*
*/
public class Program extends AbstractAST  {

    // ----------------------------------
    // Instance Variables

	// program -> declaration*
	private List<Declaration> declarations;

    // ----------------------------------
    // Constructors

	public Program(List<Declaration> declarations) {
		super();

		if (declarations == null)
			declarations = new ArrayList<>();
		this.declarations = declarations;

		updatePositions(declarations);
	}

	public Program(Object declarations) {
		super();

        this.declarations = castList(declarations, unwrapIfContext.andThen(Declaration.class::cast));
		updatePositions(declarations);
	}


    // ----------------------------------
    // program -> declaration*

	// Child 'declaration*' 

	public void setDeclarations(List<Declaration> declarations) {
		if (declarations == null)
			declarations = new ArrayList<>();
		this.declarations = declarations;

	}

    public List<Declaration> getDeclarations() {
        return declarations;
    }

    public Stream<Declaration> declarations() {
        return declarations.stream();
    }


    // ----------------------------------
    // Helper methods

    @Override
    public Object accept(Visitor v, Object param) {
        return v.visit(this, param);
    }

    @Override
    public String toString() {
        return "Program{" + " declarations=" + this.getDeclarations() + "}";
    }


    // %% User Members -------------------------

        // Methods/attributes in this section will be preserved. Delete if not needed

    // %% --------------------------------------

}
