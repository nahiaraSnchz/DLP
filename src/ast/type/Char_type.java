// Generated with VGen 2.0.0

package ast.type;

import visitor.Visitor;

// %% User Declarations -------------

    // Declarations (e.g. imports) in this section will be preserved. Delete if not needed

// %% -------------------------------

/*
	Char_type: type -> 
	type -> 
*/
public class Char_type extends AbstractType  {



    // ----------------------------------
    // Helper methods

    @Override
    public Object accept(Visitor v, Object param) {
        return v.visit(this, param);
    }

    @Override
    public String toString() {
        return "Char_type{" + "}";
    }


    // %% User Members -------------------------

        // Methods/attributes in this section will be preserved. Delete if not needed

        @Override
        public int getSize() {
            return 1; // Assuming char is 1 byte
        }

        @Override
        public String getMaplName(String s) {
            return "char";
        }

        @Override
        public String getSuffix() {
            return "b"; // Suffix for character type in MAPL
        }

        

    // %% --------------------------------------
}
