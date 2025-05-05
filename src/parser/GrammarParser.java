// Generated from java-escape by ANTLR 4.11.1
package parser;

    import ast.*;
	import ast.type.*;
	import ast.declaration.*;
	import ast.statement.*;
	import ast.expression.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class GrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		INT_REAL=39, INT_LITERAL=40, CHAR_LITERAL=41, LINE_COMMENT=42, MULTILINE_COMMENT=43, 
		WHITESPACE=44, SEMICOLON=45, ID=46;
	public static final int
		RULE_program = 0, RULE_declaration = 1, RULE_statement = 2, RULE_block = 3, 
		RULE_call_function = 4, RULE_assignment = 5, RULE_expression = 6, RULE_variable_definition = 7, 
		RULE_struct_definition = 8, RULE_function_definition = 9, RULE_simpleType = 10, 
		RULE_type = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "declaration", "statement", "block", "call_function", "assignment", 
			"expression", "variable_definition", "struct_definition", "function_definition", 
			"simpleType", "type"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'return'", "'print'", "','", "'printsp'", "'println'", "'read'", 
			"'while'", "'('", "')'", "'{'", "'}'", "'if'", "'else'", "'='", "'.'", 
			"'!'", "'&&'", "'||'", "'+'", "'-'", "'*'", "'/'", "'%'", "'<'", "'>'", 
			"'<='", "'>='", "'=='", "'!='", "'['", "']'", "'var'", "':'", "'struct'", 
			"'int'", "'float'", "'char'", "'void'", null, null, null, null, null, 
			null, "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "INT_REAL", "INT_LITERAL", "CHAR_LITERAL", "LINE_COMMENT", 
			"MULTILINE_COMMENT", "WHITESPACE", "SEMICOLON", "ID"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public Program ast;
		public List<Declaration> declarations = new ArrayList<>();
		public Variable_definitionContext operator1;
		public Struct_definitionContext operator2;
		public Function_definitionContext operator3;
		public TerminalNode EOF() { return getToken(GrammarParser.EOF, 0); }
		public List<Variable_definitionContext> variable_definition() {
			return getRuleContexts(Variable_definitionContext.class);
		}
		public Variable_definitionContext variable_definition(int i) {
			return getRuleContext(Variable_definitionContext.class,i);
		}
		public List<Struct_definitionContext> struct_definition() {
			return getRuleContexts(Struct_definitionContext.class);
		}
		public Struct_definitionContext struct_definition(int i) {
			return getRuleContext(Struct_definitionContext.class,i);
		}
		public List<Function_definitionContext> function_definition() {
			return getRuleContexts(Function_definitionContext.class);
		}
		public Function_definitionContext function_definition(int i) {
			return getRuleContext(Function_definitionContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 70390219014144L) != 0) {
				{
				setState(33);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(24);
					((ProgramContext)_localctx).operator1 = variable_definition();
					_localctx.declarations.add(((ProgramContext)_localctx).operator1.ast);
					}
					break;
				case 2:
					{
					setState(27);
					((ProgramContext)_localctx).operator2 = struct_definition();
					_localctx.declarations.add(((ProgramContext)_localctx).operator2.ast);
					}
					break;
				case 3:
					{
					setState(30);
					((ProgramContext)_localctx).operator3 = function_definition();
					_localctx.declarations.add(((ProgramContext)_localctx).operator3.ast);
					}
					break;
				}
				}
				setState(37);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(38);
			match(EOF);
			((ProgramContext)_localctx).ast =  new Program(_localctx.declarations);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationContext extends ParserRuleContext {
		public Declaration ast;
		public Variable_definitionContext variable_definition;
		public Struct_definitionContext struct_definition;
		public Function_definitionContext function_definition;
		public Variable_definitionContext variable_definition() {
			return getRuleContext(Variable_definitionContext.class,0);
		}
		public Struct_definitionContext struct_definition() {
			return getRuleContext(Struct_definitionContext.class,0);
		}
		public Function_definitionContext function_definition() {
			return getRuleContext(Function_definitionContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaration);
		try {
			setState(50);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(41);
				((DeclarationContext)_localctx).variable_definition = variable_definition();
				 ((DeclarationContext)_localctx).ast =  ((DeclarationContext)_localctx).variable_definition.ast; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(44);
				((DeclarationContext)_localctx).struct_definition = struct_definition();
				 ((DeclarationContext)_localctx).ast =  ((DeclarationContext)_localctx).struct_definition.ast; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(47);
				((DeclarationContext)_localctx).function_definition = function_definition();
				 ((DeclarationContext)_localctx).ast =  ((DeclarationContext)_localctx).function_definition.ast; 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public Statement ast;
		public List<Expression> expressions = new ArrayList<>();
		public List<Statement> statements1 = new ArrayList<>();
		public List<Statement> statements2 = new ArrayList<>();
		public ExpressionContext e1;
		public ExpressionContext exp1;
		public ExpressionContext exp2;
		public ExpressionContext expression;
		public StatementContext operator2;
		public BlockContext b1;
		public BlockContext b2;
		public AssignmentContext assignment;
		public Token ID;
		public Call_functionContext call_function;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public Call_functionContext call_function() {
			return getRuleContext(Call_functionContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		int _la;
		try {
			int _alt;
			setState(162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(52);
				match(T__0);
				((StatementContext)_localctx).ast =  new Return_statement(null);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(54);
				match(T__0);
				setState(55);
				((StatementContext)_localctx).e1 = expression(0);
				 ((StatementContext)_localctx).ast =  new Return_statement(((StatementContext)_localctx).e1.ast); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(58);
				match(T__1);
				setState(72);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(59);
						((StatementContext)_localctx).exp1 = expression(0);
						 _localctx.expressions.add(((StatementContext)_localctx).exp1.ast);
						setState(67);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__2) {
							{
							{
							setState(61);
							match(T__2);
							setState(62);
							((StatementContext)_localctx).exp2 = expression(0);
							 _localctx.expressions.add(((StatementContext)_localctx).exp2.ast);
							}
							}
							setState(69);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						} 
					}
					setState(74);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				}
				 ((StatementContext)_localctx).ast =  new Print_statement(_localctx.expressions); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(76);
				match(T__3);
				setState(90);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(77);
						((StatementContext)_localctx).exp1 = expression(0);
						 _localctx.expressions.add(((StatementContext)_localctx).exp1.ast);
						setState(85);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__2) {
							{
							{
							setState(79);
							match(T__2);
							setState(80);
							((StatementContext)_localctx).exp2 = expression(0);
							 _localctx.expressions.add(((StatementContext)_localctx).exp2.ast);
							}
							}
							setState(87);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						} 
					}
					setState(92);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				}
				 ((StatementContext)_localctx).ast =  new Printsp_statement(_localctx.expressions); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(94);
				match(T__4);
				setState(108);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(95);
						((StatementContext)_localctx).exp1 = expression(0);
						 _localctx.expressions.add(((StatementContext)_localctx).exp1.ast);
						setState(103);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__2) {
							{
							{
							setState(97);
							match(T__2);
							setState(98);
							((StatementContext)_localctx).exp2 = expression(0);
							 _localctx.expressions.add(((StatementContext)_localctx).exp2.ast);
							}
							}
							setState(105);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						} 
					}
					setState(110);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				}
				 ((StatementContext)_localctx).ast =  new Println_statement(_localctx.expressions); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(112);
				match(T__5);
				setState(113);
				((StatementContext)_localctx).expression = expression(0);
				 ((StatementContext)_localctx).ast =  new Read_statement(((StatementContext)_localctx).expression.ast); 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(116);
				match(T__6);
				setState(117);
				match(T__7);
				setState(118);
				((StatementContext)_localctx).expression = expression(0);
				setState(119);
				match(T__8);
				setState(120);
				match(T__9);
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 74217051722230L) != 0) {
					{
					{
					setState(121);
					((StatementContext)_localctx).operator2 = statement();
					_localctx.statements1.add(((StatementContext)_localctx).operator2.ast);
					}
					}
					setState(128);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(129);
				match(T__10);
				 ((StatementContext)_localctx).ast =  new While_statement(((StatementContext)_localctx).expression.ast, _localctx.statements1); 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(132);
				match(T__11);
				setState(133);
				match(T__7);
				setState(134);
				((StatementContext)_localctx).expression = expression(0);
				setState(135);
				match(T__8);
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__9) {
					{
					setState(136);
					match(T__9);
					setState(137);
					((StatementContext)_localctx).b1 = block();
					((StatementContext)_localctx).statements1 = ((StatementContext)_localctx).b1.ast;
					setState(139);
					match(T__10);
					}
				}

				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(143);
					match(T__12);
					setState(144);
					match(T__9);
					setState(145);
					((StatementContext)_localctx).b2 = block();
					((StatementContext)_localctx).statements2 = ((StatementContext)_localctx).b2.ast;
					setState(147);
					match(T__10);
					}
				}

				 ((StatementContext)_localctx).ast =  new If_statement(((StatementContext)_localctx).expression.ast, _localctx.statements1, _localctx.statements2); 
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(153);
				((StatementContext)_localctx).assignment = assignment();
				 ((StatementContext)_localctx).ast =  ((StatementContext)_localctx).assignment.ast; 
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(156);
				((StatementContext)_localctx).ID = match(ID);
				setState(157);
				match(T__7);
				setState(158);
				((StatementContext)_localctx).call_function = call_function();
				setState(159);
				match(T__8);
				 ((StatementContext)_localctx).ast =  new Function_call_statement(((StatementContext)_localctx).ID, ((StatementContext)_localctx).call_function.expressions); 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public List<Statement> ast = new ArrayList<Statement>();
		public StatementContext statement;
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_block);
		int _la;
		try {
			setState(175);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(164);
				((BlockContext)_localctx).statement = statement();
				 _localctx.ast.add(((BlockContext)_localctx).statement.ast); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(172);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 74217051722230L) != 0) {
					{
					{
					setState(167);
					((BlockContext)_localctx).statement = statement();
					 _localctx.ast.add(((BlockContext)_localctx).statement.ast); 
					}
					}
					setState(174);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Call_functionContext extends ParserRuleContext {
		public List<Expression> expressions = new ArrayList<>();
		public ExpressionContext e1;
		public ExpressionContext e2;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Call_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call_function; }
	}

	public final Call_functionContext call_function() throws RecognitionException {
		Call_functionContext _localctx = new Call_functionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_call_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 74217051717888L) != 0) {
				{
				setState(177);
				((Call_functionContext)_localctx).e1 = expression(0);
				_localctx.expressions.add(((Call_functionContext)_localctx).e1.ast);
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(179);
					match(T__2);
					setState(180);
					((Call_functionContext)_localctx).e2 = expression(0);
					_localctx.expressions.add(((Call_functionContext)_localctx).e2.ast);
					}
					}
					setState(187);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public Assigment_statement ast;
		public ExpressionContext left;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			((AssignmentContext)_localctx).left = expression(0);
			setState(191);
			match(T__13);
			setState(192);
			((AssignmentContext)_localctx).right = expression(0);
			 ((AssignmentContext)_localctx).ast =  new Assigment_statement(((AssignmentContext)_localctx).left.ast, ((AssignmentContext)_localctx).right.ast); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public Expression ast;
		public ExpressionContext exp1;
		public ExpressionContext left;
		public ExpressionContext expression;
		public SimpleTypeContext simpleType;
		public Token ID;
		public Call_functionContext call_function;
		public Token INT_LITERAL;
		public Token INT_REAL;
		public Token CHAR_LITERAL;
		public Token operador;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public SimpleTypeContext simpleType() {
			return getRuleContext(SimpleTypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public Call_functionContext call_function() {
			return getRuleContext(Call_functionContext.class,0);
		}
		public TerminalNode INT_LITERAL() { return getToken(GrammarParser.INT_LITERAL, 0); }
		public TerminalNode INT_REAL() { return getToken(GrammarParser.INT_REAL, 0); }
		public TerminalNode CHAR_LITERAL() { return getToken(GrammarParser.CHAR_LITERAL, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(196);
				match(T__15);
				setState(197);
				((ExpressionContext)_localctx).expression = expression(12);
				 ((ExpressionContext)_localctx).ast =  new Unary_expression(((ExpressionContext)_localctx).expression.ast); 
				}
				break;
			case 2:
				{
				setState(200);
				match(T__23);
				setState(201);
				((ExpressionContext)_localctx).simpleType = simpleType();
				setState(202);
				match(T__24);
				setState(203);
				((ExpressionContext)_localctx).expression = expression(9);
				 ((ExpressionContext)_localctx).ast =  new Cast_expression(((ExpressionContext)_localctx).simpleType.ast, ((ExpressionContext)_localctx).expression.ast); 
				}
				break;
			case 3:
				{
				setState(206);
				match(T__7);
				setState(207);
				((ExpressionContext)_localctx).expression = expression(0);
				setState(208);
				match(T__8);
				 ((ExpressionContext)_localctx).ast =  new Parenthesized_expression(((ExpressionContext)_localctx).expression.ast); 
				}
				break;
			case 4:
				{
				setState(211);
				((ExpressionContext)_localctx).ID = match(ID);
				setState(212);
				match(T__7);
				setState(213);
				((ExpressionContext)_localctx).call_function = call_function();
				setState(214);
				match(T__8);
				 ((ExpressionContext)_localctx).ast =  new Expression_call(((ExpressionContext)_localctx).ID, ((ExpressionContext)_localctx).call_function.expressions); 
				}
				break;
			case 5:
				{
				setState(217);
				((ExpressionContext)_localctx).INT_LITERAL = match(INT_LITERAL);
				 ((ExpressionContext)_localctx).ast =  new IntE_literal(((ExpressionContext)_localctx).INT_LITERAL); 
				}
				break;
			case 6:
				{
				setState(219);
				((ExpressionContext)_localctx).INT_REAL = match(INT_REAL);
				 ((ExpressionContext)_localctx).ast =  new IntE_real(((ExpressionContext)_localctx).INT_REAL); 
				}
				break;
			case 7:
				{
				setState(221);
				((ExpressionContext)_localctx).CHAR_LITERAL = match(CHAR_LITERAL);
				 ((ExpressionContext)_localctx).ast =  new CharE_literal(((ExpressionContext)_localctx).CHAR_LITERAL); 
				}
				break;
			case 8:
				{
				setState(223);
				((ExpressionContext)_localctx).ID = match(ID);
				 ((ExpressionContext)_localctx).ast =  new Variable(((ExpressionContext)_localctx).ID); 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(254);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(252);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(227);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(228);
						((ExpressionContext)_localctx).operador = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__16 || _la==T__17) ) {
							((ExpressionContext)_localctx).operador = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(229);
						((ExpressionContext)_localctx).right = ((ExpressionContext)_localctx).expression = expression(12);
						 ((ExpressionContext)_localctx).ast =  new Logical_expression(((ExpressionContext)_localctx).left.ast, ((ExpressionContext)_localctx).operador, ((ExpressionContext)_localctx).right.ast); 
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(232);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(233);
						((ExpressionContext)_localctx).operador = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 16252928L) != 0) ) {
							((ExpressionContext)_localctx).operador = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(234);
						((ExpressionContext)_localctx).right = ((ExpressionContext)_localctx).expression = expression(11);
						 ((ExpressionContext)_localctx).ast =  new Arythmetic_expression(((ExpressionContext)_localctx).left.ast, ((ExpressionContext)_localctx).operador, ((ExpressionContext)_localctx).right.ast); 
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(237);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(238);
						((ExpressionContext)_localctx).operador = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 1056964608L) != 0) ) {
							((ExpressionContext)_localctx).operador = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(239);
						((ExpressionContext)_localctx).right = ((ExpressionContext)_localctx).expression = expression(9);
						 ((ExpressionContext)_localctx).ast =  new Comparative_expression(((ExpressionContext)_localctx).left.ast, ((ExpressionContext)_localctx).operador, ((ExpressionContext)_localctx).right.ast); 
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.exp1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(242);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(243);
						match(T__14);
						setState(244);
						((ExpressionContext)_localctx).ID = match(ID);
						 ((ExpressionContext)_localctx).ast =  new Struct_access(((ExpressionContext)_localctx).exp1.ast, ((ExpressionContext)_localctx).ID); 
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(246);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(247);
						match(T__29);
						setState(248);
						((ExpressionContext)_localctx).right = ((ExpressionContext)_localctx).expression = expression(0);
						setState(249);
						match(T__30);
						 ((ExpressionContext)_localctx).ast =  new Array_access(((ExpressionContext)_localctx).left.ast, ((ExpressionContext)_localctx).right.ast); 
						}
						break;
					}
					} 
				}
				setState(256);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Variable_definitionContext extends ParserRuleContext {
		public Variable_definition ast;
		public Token ID;
		public SimpleTypeContext simpleType;
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public SimpleTypeContext simpleType() {
			return getRuleContext(SimpleTypeContext.class,0);
		}
		public Variable_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_definition; }
	}

	public final Variable_definitionContext variable_definition() throws RecognitionException {
		Variable_definitionContext _localctx = new Variable_definitionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_variable_definition);
		try {
			setState(268);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__31:
				enterOuterAlt(_localctx, 1);
				{
				setState(257);
				match(T__31);
				setState(258);
				((Variable_definitionContext)_localctx).ID = match(ID);
				setState(259);
				match(T__32);
				setState(260);
				((Variable_definitionContext)_localctx).simpleType = simpleType();
				((Variable_definitionContext)_localctx).ast =  new Variable_definition(((Variable_definitionContext)_localctx).ID, ((Variable_definitionContext)_localctx).simpleType.ast);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(263);
				((Variable_definitionContext)_localctx).ID = match(ID);
				setState(264);
				match(T__32);
				setState(265);
				((Variable_definitionContext)_localctx).simpleType = simpleType();
				((Variable_definitionContext)_localctx).ast =  new Variable_definition(((Variable_definitionContext)_localctx).ID, ((Variable_definitionContext)_localctx).simpleType.ast);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Struct_definitionContext extends ParserRuleContext {
		public Struct_definition ast;
		public List<Variable_definition> variables = new ArrayList<>();
		public Token ID;
		public Variable_definitionContext variable_definition;
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public List<Variable_definitionContext> variable_definition() {
			return getRuleContexts(Variable_definitionContext.class);
		}
		public Variable_definitionContext variable_definition(int i) {
			return getRuleContext(Variable_definitionContext.class,i);
		}
		public Struct_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_definition; }
	}

	public final Struct_definitionContext struct_definition() throws RecognitionException {
		Struct_definitionContext _localctx = new Struct_definitionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_struct_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			match(T__33);
			setState(271);
			((Struct_definitionContext)_localctx).ID = match(ID);
			setState(272);
			match(T__9);
			setState(278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__31 || _la==ID) {
				{
				{
				setState(273);
				((Struct_definitionContext)_localctx).variable_definition = variable_definition();
				_localctx.variables.add(((Struct_definitionContext)_localctx).variable_definition.ast);
				}
				}
				setState(280);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(281);
			match(T__10);
			((Struct_definitionContext)_localctx).ast =  new Struct_definition(((Struct_definitionContext)_localctx).ID, _localctx.variables);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Function_definitionContext extends ParserRuleContext {
		public Function_definition ast;
		public List<Variable_definition> params_definitions = new ArrayList<>();
		public List<Variable_definition> variable_definitions = new ArrayList<>();
		public List<Statement> statements = new ArrayList<>();
		public Token ID;
		public Variable_definitionContext l1;
		public Variable_definitionContext variable_definition;
		public Variable_definitionContext l2;
		public StatementContext s1;
		public TypeContext t;
		public StatementContext s2;
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public List<Variable_definitionContext> variable_definition() {
			return getRuleContexts(Variable_definitionContext.class);
		}
		public Variable_definitionContext variable_definition(int i) {
			return getRuleContext(Variable_definitionContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Function_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_definition; }
	}

	public final Function_definitionContext function_definition() throws RecognitionException {
		Function_definitionContext _localctx = new Function_definitionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_function_definition);
		int _la;
		try {
			int _alt;
			setState(364);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(284);
				((Function_definitionContext)_localctx).ID = match(ID);
				setState(285);
				match(T__7);
				setState(299);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__31 || _la==ID) {
					{
					{
					setState(286);
					((Function_definitionContext)_localctx).l1 = ((Function_definitionContext)_localctx).variable_definition = variable_definition();
					_localctx.params_definitions.add(((Function_definitionContext)_localctx).l1.ast);
					setState(294);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(288);
						match(T__2);
						setState(289);
						((Function_definitionContext)_localctx).l2 = ((Function_definitionContext)_localctx).variable_definition = variable_definition();
						_localctx.params_definitions.add(((Function_definitionContext)_localctx).l2.ast);
						}
						}
						setState(296);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(301);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(302);
				match(T__8);
				setState(303);
				match(T__9);
				setState(309);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(304);
						((Function_definitionContext)_localctx).variable_definition = variable_definition();
						_localctx.variable_definitions.add(((Function_definitionContext)_localctx).variable_definition.ast);
						}
						} 
					}
					setState(311);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				}
				setState(317);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 74217051722230L) != 0) {
					{
					{
					setState(312);
					((Function_definitionContext)_localctx).s1 = statement();
					_localctx.statements.add(((Function_definitionContext)_localctx).s1.ast);
					}
					}
					setState(319);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(320);
				match(T__10);
				 ((Function_definitionContext)_localctx).ast =  new Function_definition(((Function_definitionContext)_localctx).ID, _localctx.params_definitions, new Void_type(), _localctx.variable_definitions, _localctx.statements);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(322);
				((Function_definitionContext)_localctx).ID = match(ID);
				setState(323);
				match(T__7);
				setState(337);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__31 || _la==ID) {
					{
					{
					setState(324);
					((Function_definitionContext)_localctx).l1 = ((Function_definitionContext)_localctx).variable_definition = variable_definition();
					_localctx.params_definitions.add(((Function_definitionContext)_localctx).l1.ast);
					setState(332);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(326);
						match(T__2);
						setState(327);
						((Function_definitionContext)_localctx).l2 = ((Function_definitionContext)_localctx).variable_definition = variable_definition();
						_localctx.params_definitions.add(((Function_definitionContext)_localctx).l2.ast);
						}
						}
						setState(334);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(339);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(340);
				match(T__8);
				{
				setState(341);
				match(T__32);
				setState(342);
				((Function_definitionContext)_localctx).t = type();
				}
				setState(344);
				match(T__9);
				setState(350);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(345);
						((Function_definitionContext)_localctx).variable_definition = variable_definition();
						_localctx.variable_definitions.add(((Function_definitionContext)_localctx).variable_definition.ast);
						}
						} 
					}
					setState(352);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				}
				setState(358);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 74217051722230L) != 0) {
					{
					{
					setState(353);
					((Function_definitionContext)_localctx).s2 = statement();
					_localctx.statements.add(((Function_definitionContext)_localctx).s2.ast);
					}
					}
					setState(360);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(361);
				match(T__10);
				 ((Function_definitionContext)_localctx).ast =  new Function_definition(((Function_definitionContext)_localctx).ID, _localctx.params_definitions, ((Function_definitionContext)_localctx).t.ast, _localctx.variable_definitions, _localctx.statements);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SimpleTypeContext extends ParserRuleContext {
		public Type ast;
		public Token ID;
		public Token INT_LITERAL;
		public SimpleTypeContext simpleType;
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public TerminalNode INT_LITERAL() { return getToken(GrammarParser.INT_LITERAL, 0); }
		public SimpleTypeContext simpleType() {
			return getRuleContext(SimpleTypeContext.class,0);
		}
		public SimpleTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleType; }
	}

	public final SimpleTypeContext simpleType() throws RecognitionException {
		SimpleTypeContext _localctx = new SimpleTypeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_simpleType);
		try {
			setState(380);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__34:
				enterOuterAlt(_localctx, 1);
				{
				setState(366);
				match(T__34);
				 ((SimpleTypeContext)_localctx).ast =  new Int_type(); 
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 2);
				{
				setState(368);
				match(T__35);
				 ((SimpleTypeContext)_localctx).ast =  new Real_type(); 
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 3);
				{
				setState(370);
				match(T__36);
				 ((SimpleTypeContext)_localctx).ast =  new Char_type(); 
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(372);
				((SimpleTypeContext)_localctx).ID = match(ID);
				 ((SimpleTypeContext)_localctx).ast =  new Struct_type(((SimpleTypeContext)_localctx).ID); 
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 5);
				{
				setState(374);
				match(T__29);
				setState(375);
				((SimpleTypeContext)_localctx).INT_LITERAL = match(INT_LITERAL);
				setState(376);
				match(T__30);
				setState(377);
				((SimpleTypeContext)_localctx).simpleType = simpleType();
				 ((SimpleTypeContext)_localctx).ast =  new Array_type(((SimpleTypeContext)_localctx).INT_LITERAL, ((SimpleTypeContext)_localctx).simpleType.ast); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public Type ast;
		public SimpleTypeContext simpleType;
		public SimpleTypeContext simpleType() {
			return getRuleContext(SimpleTypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_type);
		try {
			setState(387);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__37:
				enterOuterAlt(_localctx, 1);
				{
				setState(382);
				match(T__37);
				 ((TypeContext)_localctx).ast =  new Void_type(); 
				}
				break;
			case T__29:
			case T__34:
			case T__35:
			case T__36:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(384);
				((TypeContext)_localctx).simpleType = simpleType();
				((TypeContext)_localctx).ast =  ((TypeContext)_localctx).simpleType.ast;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 6:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 11);
		case 1:
			return precpred(_ctx, 10);
		case 2:
			return precpred(_ctx, 8);
		case 3:
			return precpred(_ctx, 13);
		case 4:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001.\u0186\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0005\u0000\"\b\u0000\n\u0000\f\u0000%"+
		"\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0003\u00013\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002B\b\u0002\n\u0002"+
		"\f\u0002E\t\u0002\u0005\u0002G\b\u0002\n\u0002\f\u0002J\t\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0005\u0002T\b\u0002\n\u0002\f\u0002W\t\u0002\u0005"+
		"\u0002Y\b\u0002\n\u0002\f\u0002\\\t\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005"+
		"\u0002f\b\u0002\n\u0002\f\u0002i\t\u0002\u0005\u0002k\b\u0002\n\u0002"+
		"\f\u0002n\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0005\u0002}\b\u0002\n\u0002\f\u0002\u0080"+
		"\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0003\u0002\u008e\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u0096\b\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u00a3\b\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005"+
		"\u0003\u00ab\b\u0003\n\u0003\f\u0003\u00ae\t\u0003\u0003\u0003\u00b0\b"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0005\u0004\u00b8\b\u0004\n\u0004\f\u0004\u00bb\t\u0004\u0003\u0004"+
		"\u00bd\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0003\u0006\u00e2\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u00fd\b\u0006\n\u0006"+
		"\f\u0006\u0100\t\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007\u010d\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0005\b\u0115\b\b\n\b\f\b\u0118\t\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005"+
		"\t\u0125\b\t\n\t\f\t\u0128\t\t\u0005\t\u012a\b\t\n\t\f\t\u012d\t\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u0134\b\t\n\t\f\t\u0137\t\t"+
		"\u0001\t\u0001\t\u0001\t\u0005\t\u013c\b\t\n\t\f\t\u013f\t\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005"+
		"\t\u014b\b\t\n\t\f\t\u014e\t\t\u0005\t\u0150\b\t\n\t\f\t\u0153\t\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u015d"+
		"\b\t\n\t\f\t\u0160\t\t\u0001\t\u0001\t\u0001\t\u0005\t\u0165\b\t\n\t\f"+
		"\t\u0168\t\t\u0001\t\u0001\t\u0001\t\u0003\t\u016d\b\t\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0003\n\u017d\b\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0184\b\u000b\u0001\u000b\u0000"+
		"\u0001\f\f\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0000\u0003\u0001\u0000\u0011\u0012\u0001\u0000\u0013\u0017\u0001\u0000"+
		"\u0018\u001d\u01b0\u0000#\u0001\u0000\u0000\u0000\u00022\u0001\u0000\u0000"+
		"\u0000\u0004\u00a2\u0001\u0000\u0000\u0000\u0006\u00af\u0001\u0000\u0000"+
		"\u0000\b\u00bc\u0001\u0000\u0000\u0000\n\u00be\u0001\u0000\u0000\u0000"+
		"\f\u00e1\u0001\u0000\u0000\u0000\u000e\u010c\u0001\u0000\u0000\u0000\u0010"+
		"\u010e\u0001\u0000\u0000\u0000\u0012\u016c\u0001\u0000\u0000\u0000\u0014"+
		"\u017c\u0001\u0000\u0000\u0000\u0016\u0183\u0001\u0000\u0000\u0000\u0018"+
		"\u0019\u0003\u000e\u0007\u0000\u0019\u001a\u0006\u0000\uffff\uffff\u0000"+
		"\u001a\"\u0001\u0000\u0000\u0000\u001b\u001c\u0003\u0010\b\u0000\u001c"+
		"\u001d\u0006\u0000\uffff\uffff\u0000\u001d\"\u0001\u0000\u0000\u0000\u001e"+
		"\u001f\u0003\u0012\t\u0000\u001f \u0006\u0000\uffff\uffff\u0000 \"\u0001"+
		"\u0000\u0000\u0000!\u0018\u0001\u0000\u0000\u0000!\u001b\u0001\u0000\u0000"+
		"\u0000!\u001e\u0001\u0000\u0000\u0000\"%\u0001\u0000\u0000\u0000#!\u0001"+
		"\u0000\u0000\u0000#$\u0001\u0000\u0000\u0000$&\u0001\u0000\u0000\u0000"+
		"%#\u0001\u0000\u0000\u0000&\'\u0005\u0000\u0000\u0001\'(\u0006\u0000\uffff"+
		"\uffff\u0000(\u0001\u0001\u0000\u0000\u0000)*\u0003\u000e\u0007\u0000"+
		"*+\u0006\u0001\uffff\uffff\u0000+3\u0001\u0000\u0000\u0000,-\u0003\u0010"+
		"\b\u0000-.\u0006\u0001\uffff\uffff\u0000.3\u0001\u0000\u0000\u0000/0\u0003"+
		"\u0012\t\u000001\u0006\u0001\uffff\uffff\u000013\u0001\u0000\u0000\u0000"+
		"2)\u0001\u0000\u0000\u00002,\u0001\u0000\u0000\u00002/\u0001\u0000\u0000"+
		"\u00003\u0003\u0001\u0000\u0000\u000045\u0005\u0001\u0000\u00005\u00a3"+
		"\u0006\u0002\uffff\uffff\u000067\u0005\u0001\u0000\u000078\u0003\f\u0006"+
		"\u000089\u0006\u0002\uffff\uffff\u00009\u00a3\u0001\u0000\u0000\u0000"+
		":H\u0005\u0002\u0000\u0000;<\u0003\f\u0006\u0000<C\u0006\u0002\uffff\uffff"+
		"\u0000=>\u0005\u0003\u0000\u0000>?\u0003\f\u0006\u0000?@\u0006\u0002\uffff"+
		"\uffff\u0000@B\u0001\u0000\u0000\u0000A=\u0001\u0000\u0000\u0000BE\u0001"+
		"\u0000\u0000\u0000CA\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000"+
		"DG\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000\u0000F;\u0001\u0000\u0000"+
		"\u0000GJ\u0001\u0000\u0000\u0000HF\u0001\u0000\u0000\u0000HI\u0001\u0000"+
		"\u0000\u0000IK\u0001\u0000\u0000\u0000JH\u0001\u0000\u0000\u0000K\u00a3"+
		"\u0006\u0002\uffff\uffff\u0000LZ\u0005\u0004\u0000\u0000MN\u0003\f\u0006"+
		"\u0000NU\u0006\u0002\uffff\uffff\u0000OP\u0005\u0003\u0000\u0000PQ\u0003"+
		"\f\u0006\u0000QR\u0006\u0002\uffff\uffff\u0000RT\u0001\u0000\u0000\u0000"+
		"SO\u0001\u0000\u0000\u0000TW\u0001\u0000\u0000\u0000US\u0001\u0000\u0000"+
		"\u0000UV\u0001\u0000\u0000\u0000VY\u0001\u0000\u0000\u0000WU\u0001\u0000"+
		"\u0000\u0000XM\u0001\u0000\u0000\u0000Y\\\u0001\u0000\u0000\u0000ZX\u0001"+
		"\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000[]\u0001\u0000\u0000\u0000"+
		"\\Z\u0001\u0000\u0000\u0000]\u00a3\u0006\u0002\uffff\uffff\u0000^l\u0005"+
		"\u0005\u0000\u0000_`\u0003\f\u0006\u0000`g\u0006\u0002\uffff\uffff\u0000"+
		"ab\u0005\u0003\u0000\u0000bc\u0003\f\u0006\u0000cd\u0006\u0002\uffff\uffff"+
		"\u0000df\u0001\u0000\u0000\u0000ea\u0001\u0000\u0000\u0000fi\u0001\u0000"+
		"\u0000\u0000ge\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000hk\u0001"+
		"\u0000\u0000\u0000ig\u0001\u0000\u0000\u0000j_\u0001\u0000\u0000\u0000"+
		"kn\u0001\u0000\u0000\u0000lj\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000"+
		"\u0000mo\u0001\u0000\u0000\u0000nl\u0001\u0000\u0000\u0000o\u00a3\u0006"+
		"\u0002\uffff\uffff\u0000pq\u0005\u0006\u0000\u0000qr\u0003\f\u0006\u0000"+
		"rs\u0006\u0002\uffff\uffff\u0000s\u00a3\u0001\u0000\u0000\u0000tu\u0005"+
		"\u0007\u0000\u0000uv\u0005\b\u0000\u0000vw\u0003\f\u0006\u0000wx\u0005"+
		"\t\u0000\u0000x~\u0005\n\u0000\u0000yz\u0003\u0004\u0002\u0000z{\u0006"+
		"\u0002\uffff\uffff\u0000{}\u0001\u0000\u0000\u0000|y\u0001\u0000\u0000"+
		"\u0000}\u0080\u0001\u0000\u0000\u0000~|\u0001\u0000\u0000\u0000~\u007f"+
		"\u0001\u0000\u0000\u0000\u007f\u0081\u0001\u0000\u0000\u0000\u0080~\u0001"+
		"\u0000\u0000\u0000\u0081\u0082\u0005\u000b\u0000\u0000\u0082\u0083\u0006"+
		"\u0002\uffff\uffff\u0000\u0083\u00a3\u0001\u0000\u0000\u0000\u0084\u0085"+
		"\u0005\f\u0000\u0000\u0085\u0086\u0005\b\u0000\u0000\u0086\u0087\u0003"+
		"\f\u0006\u0000\u0087\u008d\u0005\t\u0000\u0000\u0088\u0089\u0005\n\u0000"+
		"\u0000\u0089\u008a\u0003\u0006\u0003\u0000\u008a\u008b\u0006\u0002\uffff"+
		"\uffff\u0000\u008b\u008c\u0005\u000b\u0000\u0000\u008c\u008e\u0001\u0000"+
		"\u0000\u0000\u008d\u0088\u0001\u0000\u0000\u0000\u008d\u008e\u0001\u0000"+
		"\u0000\u0000\u008e\u0095\u0001\u0000\u0000\u0000\u008f\u0090\u0005\r\u0000"+
		"\u0000\u0090\u0091\u0005\n\u0000\u0000\u0091\u0092\u0003\u0006\u0003\u0000"+
		"\u0092\u0093\u0006\u0002\uffff\uffff\u0000\u0093\u0094\u0005\u000b\u0000"+
		"\u0000\u0094\u0096\u0001\u0000\u0000\u0000\u0095\u008f\u0001\u0000\u0000"+
		"\u0000\u0095\u0096\u0001\u0000\u0000\u0000\u0096\u0097\u0001\u0000\u0000"+
		"\u0000\u0097\u0098\u0006\u0002\uffff\uffff\u0000\u0098\u00a3\u0001\u0000"+
		"\u0000\u0000\u0099\u009a\u0003\n\u0005\u0000\u009a\u009b\u0006\u0002\uffff"+
		"\uffff\u0000\u009b\u00a3\u0001\u0000\u0000\u0000\u009c\u009d\u0005.\u0000"+
		"\u0000\u009d\u009e\u0005\b\u0000\u0000\u009e\u009f\u0003\b\u0004\u0000"+
		"\u009f\u00a0\u0005\t\u0000\u0000\u00a0\u00a1\u0006\u0002\uffff\uffff\u0000"+
		"\u00a1\u00a3\u0001\u0000\u0000\u0000\u00a24\u0001\u0000\u0000\u0000\u00a2"+
		"6\u0001\u0000\u0000\u0000\u00a2:\u0001\u0000\u0000\u0000\u00a2L\u0001"+
		"\u0000\u0000\u0000\u00a2^\u0001\u0000\u0000\u0000\u00a2p\u0001\u0000\u0000"+
		"\u0000\u00a2t\u0001\u0000\u0000\u0000\u00a2\u0084\u0001\u0000\u0000\u0000"+
		"\u00a2\u0099\u0001\u0000\u0000\u0000\u00a2\u009c\u0001\u0000\u0000\u0000"+
		"\u00a3\u0005\u0001\u0000\u0000\u0000\u00a4\u00a5\u0003\u0004\u0002\u0000"+
		"\u00a5\u00a6\u0006\u0003\uffff\uffff\u0000\u00a6\u00b0\u0001\u0000\u0000"+
		"\u0000\u00a7\u00a8\u0003\u0004\u0002\u0000\u00a8\u00a9\u0006\u0003\uffff"+
		"\uffff\u0000\u00a9\u00ab\u0001\u0000\u0000\u0000\u00aa\u00a7\u0001\u0000"+
		"\u0000\u0000\u00ab\u00ae\u0001\u0000\u0000\u0000\u00ac\u00aa\u0001\u0000"+
		"\u0000\u0000\u00ac\u00ad\u0001\u0000\u0000\u0000\u00ad\u00b0\u0001\u0000"+
		"\u0000\u0000\u00ae\u00ac\u0001\u0000\u0000\u0000\u00af\u00a4\u0001\u0000"+
		"\u0000\u0000\u00af\u00ac\u0001\u0000\u0000\u0000\u00b0\u0007\u0001\u0000"+
		"\u0000\u0000\u00b1\u00b2\u0003\f\u0006\u0000\u00b2\u00b9\u0006\u0004\uffff"+
		"\uffff\u0000\u00b3\u00b4\u0005\u0003\u0000\u0000\u00b4\u00b5\u0003\f\u0006"+
		"\u0000\u00b5\u00b6\u0006\u0004\uffff\uffff\u0000\u00b6\u00b8\u0001\u0000"+
		"\u0000\u0000\u00b7\u00b3\u0001\u0000\u0000\u0000\u00b8\u00bb\u0001\u0000"+
		"\u0000\u0000\u00b9\u00b7\u0001\u0000\u0000\u0000\u00b9\u00ba\u0001\u0000"+
		"\u0000\u0000\u00ba\u00bd\u0001\u0000\u0000\u0000\u00bb\u00b9\u0001\u0000"+
		"\u0000\u0000\u00bc\u00b1\u0001\u0000\u0000\u0000\u00bc\u00bd\u0001\u0000"+
		"\u0000\u0000\u00bd\t\u0001\u0000\u0000\u0000\u00be\u00bf\u0003\f\u0006"+
		"\u0000\u00bf\u00c0\u0005\u000e\u0000\u0000\u00c0\u00c1\u0003\f\u0006\u0000"+
		"\u00c1\u00c2\u0006\u0005\uffff\uffff\u0000\u00c2\u000b\u0001\u0000\u0000"+
		"\u0000\u00c3\u00c4\u0006\u0006\uffff\uffff\u0000\u00c4\u00c5\u0005\u0010"+
		"\u0000\u0000\u00c5\u00c6\u0003\f\u0006\f\u00c6\u00c7\u0006\u0006\uffff"+
		"\uffff\u0000\u00c7\u00e2\u0001\u0000\u0000\u0000\u00c8\u00c9\u0005\u0018"+
		"\u0000\u0000\u00c9\u00ca\u0003\u0014\n\u0000\u00ca\u00cb\u0005\u0019\u0000"+
		"\u0000\u00cb\u00cc\u0003\f\u0006\t\u00cc\u00cd\u0006\u0006\uffff\uffff"+
		"\u0000\u00cd\u00e2\u0001\u0000\u0000\u0000\u00ce\u00cf\u0005\b\u0000\u0000"+
		"\u00cf\u00d0\u0003\f\u0006\u0000\u00d0\u00d1\u0005\t\u0000\u0000\u00d1"+
		"\u00d2\u0006\u0006\uffff\uffff\u0000\u00d2\u00e2\u0001\u0000\u0000\u0000"+
		"\u00d3\u00d4\u0005.\u0000\u0000\u00d4\u00d5\u0005\b\u0000\u0000\u00d5"+
		"\u00d6\u0003\b\u0004\u0000\u00d6\u00d7\u0005\t\u0000\u0000\u00d7\u00d8"+
		"\u0006\u0006\uffff\uffff\u0000\u00d8\u00e2\u0001\u0000\u0000\u0000\u00d9"+
		"\u00da\u0005(\u0000\u0000\u00da\u00e2\u0006\u0006\uffff\uffff\u0000\u00db"+
		"\u00dc\u0005\'\u0000\u0000\u00dc\u00e2\u0006\u0006\uffff\uffff\u0000\u00dd"+
		"\u00de\u0005)\u0000\u0000\u00de\u00e2\u0006\u0006\uffff\uffff\u0000\u00df"+
		"\u00e0\u0005.\u0000\u0000\u00e0\u00e2\u0006\u0006\uffff\uffff\u0000\u00e1"+
		"\u00c3\u0001\u0000\u0000\u0000\u00e1\u00c8\u0001\u0000\u0000\u0000\u00e1"+
		"\u00ce\u0001\u0000\u0000\u0000\u00e1\u00d3\u0001\u0000\u0000\u0000\u00e1"+
		"\u00d9\u0001\u0000\u0000\u0000\u00e1\u00db\u0001\u0000\u0000\u0000\u00e1"+
		"\u00dd\u0001\u0000\u0000\u0000\u00e1\u00df\u0001\u0000\u0000\u0000\u00e2"+
		"\u00fe\u0001\u0000\u0000\u0000\u00e3\u00e4\n\u000b\u0000\u0000\u00e4\u00e5"+
		"\u0007\u0000\u0000\u0000\u00e5\u00e6\u0003\f\u0006\f\u00e6\u00e7\u0006"+
		"\u0006\uffff\uffff\u0000\u00e7\u00fd\u0001\u0000\u0000\u0000\u00e8\u00e9"+
		"\n\n\u0000\u0000\u00e9\u00ea\u0007\u0001\u0000\u0000\u00ea\u00eb\u0003"+
		"\f\u0006\u000b\u00eb\u00ec\u0006\u0006\uffff\uffff\u0000\u00ec\u00fd\u0001"+
		"\u0000\u0000\u0000\u00ed\u00ee\n\b\u0000\u0000\u00ee\u00ef\u0007\u0002"+
		"\u0000\u0000\u00ef\u00f0\u0003\f\u0006\t\u00f0\u00f1\u0006\u0006\uffff"+
		"\uffff\u0000\u00f1\u00fd\u0001\u0000\u0000\u0000\u00f2\u00f3\n\r\u0000"+
		"\u0000\u00f3\u00f4\u0005\u000f\u0000\u0000\u00f4\u00f5\u0005.\u0000\u0000"+
		"\u00f5\u00fd\u0006\u0006\uffff\uffff\u0000\u00f6\u00f7\n\u0005\u0000\u0000"+
		"\u00f7\u00f8\u0005\u001e\u0000\u0000\u00f8\u00f9\u0003\f\u0006\u0000\u00f9"+
		"\u00fa\u0005\u001f\u0000\u0000\u00fa\u00fb\u0006\u0006\uffff\uffff\u0000"+
		"\u00fb\u00fd\u0001\u0000\u0000\u0000\u00fc\u00e3\u0001\u0000\u0000\u0000"+
		"\u00fc\u00e8\u0001\u0000\u0000\u0000\u00fc\u00ed\u0001\u0000\u0000\u0000"+
		"\u00fc\u00f2\u0001\u0000\u0000\u0000\u00fc\u00f6\u0001\u0000\u0000\u0000"+
		"\u00fd\u0100\u0001\u0000\u0000\u0000\u00fe\u00fc\u0001\u0000\u0000\u0000"+
		"\u00fe\u00ff\u0001\u0000\u0000\u0000\u00ff\r\u0001\u0000\u0000\u0000\u0100"+
		"\u00fe\u0001\u0000\u0000\u0000\u0101\u0102\u0005 \u0000\u0000\u0102\u0103"+
		"\u0005.\u0000\u0000\u0103\u0104\u0005!\u0000\u0000\u0104\u0105\u0003\u0014"+
		"\n\u0000\u0105\u0106\u0006\u0007\uffff\uffff\u0000\u0106\u010d\u0001\u0000"+
		"\u0000\u0000\u0107\u0108\u0005.\u0000\u0000\u0108\u0109\u0005!\u0000\u0000"+
		"\u0109\u010a\u0003\u0014\n\u0000\u010a\u010b\u0006\u0007\uffff\uffff\u0000"+
		"\u010b\u010d\u0001\u0000\u0000\u0000\u010c\u0101\u0001\u0000\u0000\u0000"+
		"\u010c\u0107\u0001\u0000\u0000\u0000\u010d\u000f\u0001\u0000\u0000\u0000"+
		"\u010e\u010f\u0005\"\u0000\u0000\u010f\u0110\u0005.\u0000\u0000\u0110"+
		"\u0116\u0005\n\u0000\u0000\u0111\u0112\u0003\u000e\u0007\u0000\u0112\u0113"+
		"\u0006\b\uffff\uffff\u0000\u0113\u0115\u0001\u0000\u0000\u0000\u0114\u0111"+
		"\u0001\u0000\u0000\u0000\u0115\u0118\u0001\u0000\u0000\u0000\u0116\u0114"+
		"\u0001\u0000\u0000\u0000\u0116\u0117\u0001\u0000\u0000\u0000\u0117\u0119"+
		"\u0001\u0000\u0000\u0000\u0118\u0116\u0001\u0000\u0000\u0000\u0119\u011a"+
		"\u0005\u000b\u0000\u0000\u011a\u011b\u0006\b\uffff\uffff\u0000\u011b\u0011"+
		"\u0001\u0000\u0000\u0000\u011c\u011d\u0005.\u0000\u0000\u011d\u012b\u0005"+
		"\b\u0000\u0000\u011e\u011f\u0003\u000e\u0007\u0000\u011f\u0126\u0006\t"+
		"\uffff\uffff\u0000\u0120\u0121\u0005\u0003\u0000\u0000\u0121\u0122\u0003"+
		"\u000e\u0007\u0000\u0122\u0123\u0006\t\uffff\uffff\u0000\u0123\u0125\u0001"+
		"\u0000\u0000\u0000\u0124\u0120\u0001\u0000\u0000\u0000\u0125\u0128\u0001"+
		"\u0000\u0000\u0000\u0126\u0124\u0001\u0000\u0000\u0000\u0126\u0127\u0001"+
		"\u0000\u0000\u0000\u0127\u012a\u0001\u0000\u0000\u0000\u0128\u0126\u0001"+
		"\u0000\u0000\u0000\u0129\u011e\u0001\u0000\u0000\u0000\u012a\u012d\u0001"+
		"\u0000\u0000\u0000\u012b\u0129\u0001\u0000\u0000\u0000\u012b\u012c\u0001"+
		"\u0000\u0000\u0000\u012c\u012e\u0001\u0000\u0000\u0000\u012d\u012b\u0001"+
		"\u0000\u0000\u0000\u012e\u012f\u0005\t\u0000\u0000\u012f\u0135\u0005\n"+
		"\u0000\u0000\u0130\u0131\u0003\u000e\u0007\u0000\u0131\u0132\u0006\t\uffff"+
		"\uffff\u0000\u0132\u0134\u0001\u0000\u0000\u0000\u0133\u0130\u0001\u0000"+
		"\u0000\u0000\u0134\u0137\u0001\u0000\u0000\u0000\u0135\u0133\u0001\u0000"+
		"\u0000\u0000\u0135\u0136\u0001\u0000\u0000\u0000\u0136\u013d\u0001\u0000"+
		"\u0000\u0000\u0137\u0135\u0001\u0000\u0000\u0000\u0138\u0139\u0003\u0004"+
		"\u0002\u0000\u0139\u013a\u0006\t\uffff\uffff\u0000\u013a\u013c\u0001\u0000"+
		"\u0000\u0000\u013b\u0138\u0001\u0000\u0000\u0000\u013c\u013f\u0001\u0000"+
		"\u0000\u0000\u013d\u013b\u0001\u0000\u0000\u0000\u013d\u013e\u0001\u0000"+
		"\u0000\u0000\u013e\u0140\u0001\u0000\u0000\u0000\u013f\u013d\u0001\u0000"+
		"\u0000\u0000\u0140\u0141\u0005\u000b\u0000\u0000\u0141\u016d\u0006\t\uffff"+
		"\uffff\u0000\u0142\u0143\u0005.\u0000\u0000\u0143\u0151\u0005\b\u0000"+
		"\u0000\u0144\u0145\u0003\u000e\u0007\u0000\u0145\u014c\u0006\t\uffff\uffff"+
		"\u0000\u0146\u0147\u0005\u0003\u0000\u0000\u0147\u0148\u0003\u000e\u0007"+
		"\u0000\u0148\u0149\u0006\t\uffff\uffff\u0000\u0149\u014b\u0001\u0000\u0000"+
		"\u0000\u014a\u0146\u0001\u0000\u0000\u0000\u014b\u014e\u0001\u0000\u0000"+
		"\u0000\u014c\u014a\u0001\u0000\u0000\u0000\u014c\u014d\u0001\u0000\u0000"+
		"\u0000\u014d\u0150\u0001\u0000\u0000\u0000\u014e\u014c\u0001\u0000\u0000"+
		"\u0000\u014f\u0144\u0001\u0000\u0000\u0000\u0150\u0153\u0001\u0000\u0000"+
		"\u0000\u0151\u014f\u0001\u0000\u0000\u0000\u0151\u0152\u0001\u0000\u0000"+
		"\u0000\u0152\u0154\u0001\u0000\u0000\u0000\u0153\u0151\u0001\u0000\u0000"+
		"\u0000\u0154\u0155\u0005\t\u0000\u0000\u0155\u0156\u0005!\u0000\u0000"+
		"\u0156\u0157\u0003\u0016\u000b\u0000\u0157\u0158\u0001\u0000\u0000\u0000"+
		"\u0158\u015e\u0005\n\u0000\u0000\u0159\u015a\u0003\u000e\u0007\u0000\u015a"+
		"\u015b\u0006\t\uffff\uffff\u0000\u015b\u015d\u0001\u0000\u0000\u0000\u015c"+
		"\u0159\u0001\u0000\u0000\u0000\u015d\u0160\u0001\u0000\u0000\u0000\u015e"+
		"\u015c\u0001\u0000\u0000\u0000\u015e\u015f\u0001\u0000\u0000\u0000\u015f"+
		"\u0166\u0001\u0000\u0000\u0000\u0160\u015e\u0001\u0000\u0000\u0000\u0161"+
		"\u0162\u0003\u0004\u0002\u0000\u0162\u0163\u0006\t\uffff\uffff\u0000\u0163"+
		"\u0165\u0001\u0000\u0000\u0000\u0164\u0161\u0001\u0000\u0000\u0000\u0165"+
		"\u0168\u0001\u0000\u0000\u0000\u0166\u0164\u0001\u0000\u0000\u0000\u0166"+
		"\u0167\u0001\u0000\u0000\u0000\u0167\u0169\u0001\u0000\u0000\u0000\u0168"+
		"\u0166\u0001\u0000\u0000\u0000\u0169\u016a\u0005\u000b\u0000\u0000\u016a"+
		"\u016b\u0006\t\uffff\uffff\u0000\u016b\u016d\u0001\u0000\u0000\u0000\u016c"+
		"\u011c\u0001\u0000\u0000\u0000\u016c\u0142\u0001\u0000\u0000\u0000\u016d"+
		"\u0013\u0001\u0000\u0000\u0000\u016e\u016f\u0005#\u0000\u0000\u016f\u017d"+
		"\u0006\n\uffff\uffff\u0000\u0170\u0171\u0005$\u0000\u0000\u0171\u017d"+
		"\u0006\n\uffff\uffff\u0000\u0172\u0173\u0005%\u0000\u0000\u0173\u017d"+
		"\u0006\n\uffff\uffff\u0000\u0174\u0175\u0005.\u0000\u0000\u0175\u017d"+
		"\u0006\n\uffff\uffff\u0000\u0176\u0177\u0005\u001e\u0000\u0000\u0177\u0178"+
		"\u0005(\u0000\u0000\u0178\u0179\u0005\u001f\u0000\u0000\u0179\u017a\u0003"+
		"\u0014\n\u0000\u017a\u017b\u0006\n\uffff\uffff\u0000\u017b\u017d\u0001"+
		"\u0000\u0000\u0000\u017c\u016e\u0001\u0000\u0000\u0000\u017c\u0170\u0001"+
		"\u0000\u0000\u0000\u017c\u0172\u0001\u0000\u0000\u0000\u017c\u0174\u0001"+
		"\u0000\u0000\u0000\u017c\u0176\u0001\u0000\u0000\u0000\u017d\u0015\u0001"+
		"\u0000\u0000\u0000\u017e\u017f\u0005&\u0000\u0000\u017f\u0184\u0006\u000b"+
		"\uffff\uffff\u0000\u0180\u0181\u0003\u0014\n\u0000\u0181\u0182\u0006\u000b"+
		"\uffff\uffff\u0000\u0182\u0184\u0001\u0000\u0000\u0000\u0183\u017e\u0001"+
		"\u0000\u0000\u0000\u0183\u0180\u0001\u0000\u0000\u0000\u0184\u0017\u0001"+
		"\u0000\u0000\u0000!!#2CHUZgl~\u008d\u0095\u00a2\u00ac\u00af\u00b9\u00bc"+
		"\u00e1\u00fc\u00fe\u010c\u0116\u0126\u012b\u0135\u013d\u014c\u0151\u015e"+
		"\u0166\u016c\u017c\u0183";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}