// Generated from c:/Users/nahia/OneDrive/Escritorio/U N I/3 UNI/2do Semestre/Diseño de Lenguajes de Programación/Practica/DLP_language/mlang_nahiaraSanchez/specifications/Grammar.g4 by ANTLR 4.13.1
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
	 * Enter a parse tree produced by {@link GrammarParser#struct_variable}.
	 * @param ctx the parse tree
	 */
	void enterStruct_variable(GrammarParser.Struct_variableContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#struct_variable}.
	 * @param ctx the parse tree
	 */
	void exitStruct_variable(GrammarParser.Struct_variableContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#base_type}.
	 * @param ctx the parse tree
	 */
	void enterBase_type(GrammarParser.Base_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#base_type}.
	 * @param ctx the parse tree
	 */
	void exitBase_type(GrammarParser.Base_typeContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link GrammarParser#array_type}.
	 * @param ctx the parse tree
	 */
	void enterArray_type(GrammarParser.Array_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#array_type}.
	 * @param ctx the parse tree
	 */
	void exitArray_type(GrammarParser.Array_typeContext ctx);
}