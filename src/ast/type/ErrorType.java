// Generated with VGen 2.0.0

package ast.type;

import visitor.Visitor;
import ast.*;

// %% User Declarations -------------

    // Declarations (e.g. imports) in this section will be preserved. Delete if not needed

// %% -------------------------------

/*
	 
*/
public class ErrorType implements Type  {


    // ----------------------------------
    // Helper methods

    @Override
    public Object accept(Visitor v, Object param) {
        return null;
    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public Position start(){
        return null;
    }
    
    @Override
    public Position end(){
        return null;
    }

    @Override
    public void updatePositions(Object... children){

    }

    @Override
    public void updatePositions(Position newStart, Position newEnd){

    }

    @Override
    public String getMaplName(String s) {
        throw new UnsupportedOperationException("ErrorType cannot be converted to string");
    }

    @Override
    public String getSuffix() {
        throw new UnsupportedOperationException("ErrorType cannot have a suffix");
    }

}
