// Generated with VGen 2.0.0

package ast.type;

import org.antlr.v4.runtime.Token;
import visitor.Visitor;

// %% User Declarations -------------

    // Declarations (e.g. imports) in this section will be preserved. Delete if not needed

// %% -------------------------------

/*
	Array_type: type -> name:string type:type
	type -> 
*/
public class Array_type extends AbstractType  {

    // ----------------------------------
    // Instance Variables

	// Array_type: type -> string type
	private String name;
	private Type type;

    // ----------------------------------
    // Constructors

	public Array_type(String name, Type type) {
		super();

		if (name == null)
			throw new IllegalArgumentException("Parameter 'name' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.name = name;

		if (type == null)
			throw new IllegalArgumentException("Parameter 'type' can't be null. Pass a non-null value or use 'type?' in the abstract grammar");
		this.type = type;

		updatePositions(name, type);
	}

	public Array_type(Object name, Object type) {
		super();

        if (name == null)
            throw new IllegalArgumentException("Parameter 'name' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.name = (name instanceof Token) ? ((Token) name).getText() : (String) name;

        if (type == null)
            throw new IllegalArgumentException("Parameter 'type' can't be null. Pass a non-null value or use 'type?' in the abstract grammar");
		this.type = (Type) type;

		updatePositions(name, type);
	}


    // ----------------------------------
    // Array_type: type -> string type

	// Child 'string' 

	public void setName(String name) {
		if (name == null)
			throw new IllegalArgumentException("Parameter 'name' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.name = name;

	}

    public String getName() {
        return name;
    }


	// Child 'type' 

	public void setType(Type type) {
		if (type == null)
			throw new IllegalArgumentException("Parameter 'type' can't be null. Pass a non-null value or use 'type?' in the abstract grammar");
		this.type = type;

	}

    public Type getType() {
        return type;
    }


    // ----------------------------------
    // Helper methods

    @Override
    public Object accept(Visitor v, Object param) {
        return v.visit(this, param);
    }

    @Override
    public String toString() {
        return "Array_type{" + " name=" + this.getName() + " type=" + this.getType() + "}";
    }


    // %% User Members -------------------------

        // Methods/attributes in this section will be preserved. Delete if not needed

		@Override
		public int getSize() {
			return Integer.parseInt(name) * getType().getSize();
		}

		@Override
		public String getMaplName(String s) {
			s += getName();  // añadimos la dimensión actual

			if (getType() instanceof Array_type) {
				s += "*" + ((Array_type) getType()).getMaplName("");
			} else {
				s += "*" + getType().getMaplName("");  // añadimos el tipo base
			}

			return s;
		}

		private boolean simpleType(Type type) {
			if (type instanceof Int_type)
				return true;
			if (type instanceof Real_type)
				return true;
			if (type instanceof Char_type)
				return true;
			return false;
		}

		

    // %% --------------------------------------
}
