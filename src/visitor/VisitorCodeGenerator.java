package visitor;

import ast.*;
import ast.declaration.*;
import ast.statement.*;
import ast.expression.*;
import ast.type.*;

public class VisitorCodeGenerator extends DefaultVisitor {

    public void process(AST ast) {
        ast.accept(this, null);
    }

    @Override
    public Object visit(Program program, Object param) {
        for (Declaration decl : program.getDeclarations()) {
            decl.accept(this, param);
            System.out.println();
        }
        return null;
    }

    @Override
    public Object visit(Variable_definition variableDefinition, Object param) {
        System.out.println("var " + variableDefinition.getName() + ":" + variableDefinition.getType() + ";");
        return null;
    }

    @Override
    public Object visit(Struct_definition structDefinition, Object param) {
        System.out.println("struct " + structDefinition.getName() + " {");
        for (Variable_definition var : structDefinition.getVariable_definitions()) {
            System.out.println("    " + var.getName() + ":" + var.getType() + ";");
        }
        System.out.println("}");
        return null;
    }

    @Override
    public Object visit(Function_definition functionDefinition, Object param) {
        System.out.print(functionDefinition.getName() + "(");
        for (int i = 0; i < functionDefinition.getVariable_definitions().size(); i++) {
            Variable_definition var = functionDefinition.getVariable_definitions().get(i);
            System.out.print(var.getName() + ":" + var.getType());
            if (i < functionDefinition.getVariable_definitions().size() - 1) System.out.print(", ");
        }
        System.out.print(")");
        if (functionDefinition.getType() != null) {
            System.out.print(": " + functionDefinition.getType());
        }
        System.out.println(" {");
        for (Statement stmt : functionDefinition.getStatements()) {
            stmt.accept(this, param);
        }
        System.out.println("}");
        return null;
    }

    @Override
    public Object visit(Comparative_expression comparativeExpression, Object param) {
        comparativeExpression.getLeft().accept(this, param);
        System.out.print(" " + comparativeExpression.getOperador() + " ");
        comparativeExpression.getRight().accept(this, param);
        return null;
    }

    @Override
    public Object visit(If_statement ifStatement, Object param) {
        System.out.print("if (");
        ifStatement.getExpression().accept(this, param);
        System.out.println(") {");
        for (Statement stmt : ifStatement.getSt1()) {
            stmt.accept(this, param);
        }
        System.out.println("}");
        if (!ifStatement.getSt2().isEmpty()) {
            System.out.println("else {");
            for (Statement stmt : ifStatement.getSt2()) {
                stmt.accept(this, param);
            }
            System.out.println("}");
        }
        return null;
    }

    @Override
    public Object visit(Assigment_statement assignmentStatement, Object param) {
        assignmentStatement.getLeft().accept(this, param);
        System.out.print(" = ");
        assignmentStatement.getRight().accept(this, param);
        System.out.println(";");
        return null;
    }

    @Override
    public Object visit(Function_call_statement functionCallStatement, Object param) {
        System.out.print(functionCallStatement.getName() + "(");
        for (int i = 0; i < functionCallStatement.getExpressions().size(); i++) {
            functionCallStatement.getExpressions().get(i).accept(this, param);
            if (i < functionCallStatement.getExpressions().size() - 1) System.out.print(", ");
        }
        System.out.print(")");
        return null;
    }

    @Override
    public Object visit(Variable variable, Object param) {
        System.out.print(variable.getName());
        return null;
    }

    @Override
    public Object visit(IntE_literal intLiteral, Object param) {
        System.out.print(intLiteral.getName());
        return null;
    }

    @Override
    public Object visit(IntE_real realLiteral, Object param) {
        System.out.print(realLiteral.getName());
        return null;
    }

    @Override
    public Object visit(CharE_literal charLiteral, Object param) {
        System.out.print("'" + charLiteral.getName() + "'");
        return null;
    }
}