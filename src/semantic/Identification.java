package semantic;

import ast.*;
import ast.declaration.Function_definition;
import ast.declaration.Struct_definition;
import ast.declaration.Variable_definition;
import ast.expression.Variable;
import ast.expression.Expression_call;
import ast.statement.Function_call_statement;
import ast.type.Struct_type;
import main.ErrorManager;
import visitor.DefaultVisitor;
import java.util.*;

// This class will be implemented in identification phase

public class Identification extends DefaultVisitor {

    private ErrorManager errorManager;

    private ContextMap<Variable_definition> variables = new ContextMap<>();
    private Map<String, Struct_definition> structs = new HashMap<>();
    private Map<String, Function_definition> functions = new HashMap<>();


    public Identification(ErrorManager errorManager) {
        this.errorManager = errorManager;
    }

    public void process(AST ast) {
        ast.accept(this, null);
    }

    // # ----------------------------------------------------------
    /// Visit Methods --------------------------------------------------------------

	
	// class Variable_definition(String name, Type type)
	@Override
	public Object visit(Variable_definition variable_definition, Object param) {

        if (variables.getFromTop(variable_definition.getName()) != null) {
            notifyError("Variable already defined: " + variable_definition.getName(), variable_definition);
        }
        else {
            variables.put(variable_definition.getName(), variable_definition);
        }

        variable_definition.getType().accept(this, param);

        return null; // param
	}

    	// class Variable(String name)
	// phase Identification { Variable_definition variable_definition }
	@Override
	public Object visit(Variable variable, Object param) {
        // no llama a visit porque variable es un nodo hoja (terminal)
		Variable_definition definition = variables.getFromAny(variable.getName());
        if (definition == null) {
            notifyError("Variable not defined: " + variable.getName(), variable);
        }
        else {
            variable.setVariable_definition(definition);
        }
        return null; // param
	}



	// class Struct_definition(String name, List<Local_variable> local_variables)
	@Override
	public Object visit(Struct_definition struct_definition, Object param) {
        

        // si ya está definida una estructura con este nombre en este contexto:
		Struct_definition definition = structs.get(struct_definition.getName());

        if (definition != null) {
            notifyError("Struct already defined: " + struct_definition.getName(), struct_definition);
        }
        else {
            structs.put(struct_definition.getName(), struct_definition);
        }

        // establece un ámbito para la estructura específica.
        variables.set();

        struct_definition.variable_definitions().forEach(v -> v.accept(this, param));

        // vuelve al contexto anterior
        variables.reset();

        return null; // param
	}

    	// class Struct_access()
	// phase Identification { Struct_definition struct_definition }
	@Override
	public Object visit(Struct_type struct_access, Object param) {

        // busca la estructura en cualquier contexto (para acceder)
		Struct_definition definition = structs.get(struct_access.getName());
        if (definition == null) {
            notifyError("Struct no definida: " + struct_access.getName(), struct_access);
        }
        else {
            struct_access.setStruct_definition(definition);
        }
        return null; // param
	}


	// class Function_definition(String name, List<Local_variable> local_variables, Optional<Type> type, List<Variable_definition> variable_definitions, List<Statement> statements)
	@Override
	public Object visit(Function_definition function_definition, Object param) {
        

		Function_definition definition = functions.get(function_definition.getName());

        if (definition != null) {
            notifyError("Function already defined: " + function_definition.getName(), function_definition);
        }
        else {
            functions.put(function_definition.getName(), function_definition);
        }

        // Establece un nuevo ámbito para la función específica
        variables.set();

        for (Variable_definition p: function_definition.getParams()) {
            p.setGlobal(false);
            p.accept(this, param);
        }
        
        //function_definition.variable_definitions().forEach(v -> v.accept(this, param));
        for (Variable_definition v: function_definition.getVariable_definitions()) {
            v.setGlobal(false);
            v.accept(this, param);
        }
        function_definition.statements().forEach(s -> s.accept(this, param));


        variables.reset();
        return null; // param
	}


    
	// class Expression_call(String name, List<Expression> expressions)
	// phase Identification { Function_definition function_definition }
	@Override
	public Object visit(Expression_call expression_call, Object param) {

		//super.visit(expression_call, param);

        // Buscar la definición de la función
        Function_definition definition = functions.get(expression_call.getName());
        if (definition == null) {
            notifyError("Función no definida: " + expression_call.getName(), expression_call);
        }
        else {
            expression_call.setFunction_definition(definition);
        }

        expression_call.getExpressions().forEach(e -> e.accept(this, param));

        return null; // param
	}
	
	// class Function_call_statement(String name, List<Expression> expressions)
	// phase Identification { Function_definition function_definition }
	@Override
	public Object visit(Function_call_statement function_call_statement, Object param) {

		//super.visit(function_call_statement, param);

        // Buscar la definición de la función
        Function_definition definition = functions.get(function_call_statement.getName());
        if (definition == null) {
            notifyError("Función no definida: " + function_call_statement.getName(), function_call_statement);
        }
        else {
            function_call_statement.setFunction_definition(definition);
        }

        function_call_statement.getExpressions().forEach(e -> e.accept(this, param));

        return null; // param
	}

	

    

	
    // # --------------------------------------------------------
    // Métodos auxiliares recomendados (opcionales) -------------

    private void notifyError(String msg) {
        errorManager.notify("Identification", msg);
    }

    private void notifyError(String msg, Position position) {
        errorManager.notify("Identification", msg, position);
    }

    private void notifyError(String msg, AST node) {
        notifyError(msg, node.start());
    }

}
