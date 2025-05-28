// Generated from c:/Users/nahia/OneDrive/Escritorio/U N I/3 UNI/2do Semestre/DLP/Practica/DLP_myLanguage/DLP/specifications/Grammar.g4 by ANTLR 4.13.1

    import ast.*;
	import ast.type.*;
	import ast.declaration.*;
	import ast.statement.*;
	import ast.expression.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarParser}.
 */
public interface GrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(GrammarParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(GrammarParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(GrammarParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(GrammarParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(GrammarParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(GrammarParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(GrammarParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(GrammarParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#call_function}.
	 * @param ctx the parse tree
	 */
	void enterCall_function(GrammarParser.Call_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#call_function}.
	 * @param ctx the parse tree
	 */
	void exitCall_function(GrammarParser.Call_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(GrammarParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(GrammarParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(GrammarParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(GrammarParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#variable_definition}.
	 * @param ctx the parse tree
	 */
	void enterVariable_definition(GrammarParser.Variable_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#variable_definition}.
	 * @param ctx the parse tree
	 */
	void exitVariable_definition(GrammarParser.Variable_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#struct_definition}.
	 * @param ctx the parse tree
	 */
	void enterStruct_definition(GrammarParser.Struct_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#struct_definition}.
	 * @param ctx the parse tree
	 */
	void exitStruct_definition(GrammarParser.Struct_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#function_definition}.
	 * @param ctx the parse tree
	 */
	void enterFunction_definition(GrammarParser.Function_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#function_definition}.
	 * @param ctx the parse tree
	 */
	void exitFunction_definition(GrammarParser.Function_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#simpleType}.
	 * @param ctx the parse tree
	 */
	void enterSimpleType(GrammarParser.SimpleTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#simpleType}.
	 * @param ctx the parse tree
	 */
	void exitSimpleType(GrammarParser.SimpleTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(GrammarParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(GrammarParser.TypeContext ctx);
}