// Generated with VGen 2.0.0

package ast.type;

import visitor.Visitor;

// %% User Declarations -------------

    // Declarations (e.g. imports) in this section will be preserved. Delete if not needed

// %% -------------------------------

/*
	Void_type: type -> 
	type -> 
*/
public class Void_type extends AbstractType  {



    // ----------------------------------
    // Helper methods

    @Override
    public Object accept(Visitor v, Object param) {
        return v.visit(this, param);
    }

    @Override
    public String toString() {
        return "Void_type{" + "}";
    }


    // %% User Members -------------------------

        // Methods/attributes in this section will be preserved. Delete if not needed

        @Override
        public int getSize() {
            throw new UnsupportedOperationException("Void type has no size");
        }

    // %% --------------------------------------
}
