// Generated with VGen 2.0.0

package ast.type;

import visitor.Visitor;

// %% User Declarations -------------

    // Declarations (e.g. imports) in this section will be preserved. Delete if not needed

// %% -------------------------------

/*
	Int_type: type -> 
	type -> 
*/
public class Int_type extends AbstractType  {



    // ----------------------------------
    // Helper methods

    @Override
    public Object accept(Visitor v, Object param) {
        return v.visit(this, param);
    }

    @Override
    public String toString() {
        return "Int_type{" + "}";
    }


    // %% User Members -------------------------

        // Methods/attributes in this section will be preserved. Delete if not needed

        @Override
        public int getSize() {
            return 2; // Assuming int is 4 bytes
        }

        @Override
        public String getMaplName(String s) {
            return "int";
        }

        @Override
        public String getSuffix() {
            return "i"; // Suffix for integer type in MAPL
        }


    // %% --------------------------------------
}
