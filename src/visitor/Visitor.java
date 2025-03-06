// Generated with VGen 2.0.0

/**
* Este interfaz es el resultado de la aplicación del patrón Visitor a los nodos del AST.
*/

package visitor;

import ast.*;
import ast.declaration.*;
import ast.statement.*;
import ast.expression.*;
import ast.type.*;




public interface Visitor {
	public Object visit(Program program, Object param);

	public Object visit(Variable_definition variable_definition, Object param);

	public Object visit(Struct_definition struct_definition, Object param);

	public Object visit(Function_definition function_definition, Object param);

	public Object visit(Return_statement return_statement, Object param);

	public Object visit(Print_statement print_statement, Object param);

	public Object visit(Printsp_statement printsp_statement, Object param);

	public Object visit(Println_statement println_statement, Object param);

	public Object visit(Read_statement read_statement, Object param);

	public Object visit(While_statement while_statement, Object param);

	public Object visit(If_statement if_statement, Object param);

	public Object visit(Assigment_statement assigment_statement, Object param);

	public Object visit(Function_call_statement function_call_statement, Object param);

	public Object visit(Arythmetic_expression arythmetic_expression, Object param);

	public Object visit(Cast_expression cast_expression, Object param);

	public Object visit(Comparative_expression comparative_expression, Object param);

	public Object visit(Logical_expression logical_expression, Object param);

	public Object visit(Parenthesized_expression parenthesized_expression, Object param);

	public Object visit(Expression_call expression_call, Object param);

	public Object visit(Variable_access variable_access, Object param);

	public Object visit(Array_access array_access, Object param);

	public Object visit(IntE_literal intE_literal, Object param);

	public Object visit(IntE_real intE_real, Object param);

	public Object visit(CharE_literal charE_literal, Object param);

	public Object visit(IdE idE, Object param);

	public Object visit(Local_variable local_variable, Object param);

	public Object visit(Int_type int_type, Object param);

	public Object visit(Real_type real_type, Object param);

	public Object visit(Char_type char_type, Object param);

	public Object visit(Id_type id_type, Object param);

	public Object visit(Array_type array_type, Object param);

	public Object visit(Return_list return_list, Object param);


}
