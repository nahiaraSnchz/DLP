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
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, INT_REAL=38, 
		INT_LITERAL=39, CHAR_LITERAL=40, LINE_COMMENT=41, MULTILINE_COMMENT=42, 
		WHITESPACE=43, SEMICOLON=44, ID=45;
	public static final int
		RULE_program = 0, RULE_declaration = 1, RULE_statement = 2, RULE_block = 3, 
		RULE_call_function = 4, RULE_assignment = 5, RULE_expression = 6, RULE_variable_definition = 7, 
		RULE_struct_definition = 8, RULE_function_definition = 9, RULE_local_variable = 10, 
		RULE_type = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "declaration", "statement", "block", "call_function", "assignment", 
			"expression", "variable_definition", "struct_definition", "function_definition", 
			"local_variable", "type"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'return'", "'print'", "'printsp'", "'println'", "'read'", "'while'", 
			"'('", "')'", "'{'", "'}'", "'if'", "'else'", "','", "'='", "'+'", "'-'", 
			"'*'", "'/'", "'%'", "'<'", "'>'", "'<='", "'>='", "'=='", "'!='", "'&&'", 
			"'||'", "'!'", "'.'", "'['", "']'", "'var'", "':'", "'struct'", "'int'", 
			"'float'", "'char'", null, null, null, null, null, null, "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "INT_REAL", "INT_LITERAL", "CHAR_LITERAL", "LINE_COMMENT", 
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
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 35205846925312L) != 0) {
				{
				setState(33);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__31:
					{
					setState(24);
					((ProgramContext)_localctx).operator1 = variable_definition();
					_localctx.declarations.add(((ProgramContext)_localctx).operator1.ast);
					}
					break;
				case T__33:
					{
					setState(27);
					((ProgramContext)_localctx).operator2 = struct_definition();
					_localctx.declarations.add(((ProgramContext)_localctx).operator2.ast);
					}
					break;
				case ID:
					{
					setState(30);
					((ProgramContext)_localctx).operator3 = function_definition();
					_localctx.declarations.add(((ProgramContext)_localctx).operator3.ast);
					}
					break;
				default:
					throw new NoViableAltException(this);
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
			switch (_input.LA(1)) {
			case T__31:
				enterOuterAlt(_localctx, 1);
				{
				setState(41);
				((DeclarationContext)_localctx).variable_definition = variable_definition();
				 ((DeclarationContext)_localctx).ast =  ((DeclarationContext)_localctx).variable_definition.ast; 
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 2);
				{
				setState(44);
				((DeclarationContext)_localctx).struct_definition = struct_definition();
				 ((DeclarationContext)_localctx).ast =  ((DeclarationContext)_localctx).struct_definition.ast; 
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(47);
				((DeclarationContext)_localctx).function_definition = function_definition();
				 ((DeclarationContext)_localctx).ast =  ((DeclarationContext)_localctx).function_definition.ast; 
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
	public static class StatementContext extends ParserRuleContext {
		public Statement ast;
		public List<Expression> expressions = new ArrayList<>();
		public List<Statement> statements = new ArrayList<>();
		public ExpressionContext e1;
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
			setState(138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
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
				setState(64);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(59);
						((StatementContext)_localctx).expression = expression(0);
						 _localctx.expressions.add(((StatementContext)_localctx).expression.ast);
						}
						} 
					}
					setState(66);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				}
				 ((StatementContext)_localctx).ast =  new Print_statement(_localctx.expressions); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(68);
				match(T__2);
				setState(74);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(69);
						((StatementContext)_localctx).expression = expression(0);
						 _localctx.expressions.add(((StatementContext)_localctx).expression.ast);
						}
						} 
					}
					setState(76);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				}
				 ((StatementContext)_localctx).ast =  new Printsp_statement(_localctx.expressions); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(78);
				match(T__3);
				setState(84);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(79);
						((StatementContext)_localctx).expression = expression(0);
						_localctx.expressions.add(((StatementContext)_localctx).expression.ast);
						}
						} 
					}
					setState(86);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				}
				 ((StatementContext)_localctx).ast =  new Println_statement(_localctx.expressions); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(88);
				match(T__4);
				setState(89);
				((StatementContext)_localctx).expression = expression(0);
				 ((StatementContext)_localctx).ast =  new Read_statement(((StatementContext)_localctx).expression.ast); 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(92);
				match(T__5);
				setState(93);
				match(T__6);
				setState(94);
				((StatementContext)_localctx).expression = expression(0);
				setState(95);
				match(T__7);
				setState(96);
				match(T__8);
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 37108518488318L) != 0) {
					{
					{
					setState(97);
					((StatementContext)_localctx).operator2 = statement();
					_localctx.statements.add(((StatementContext)_localctx).operator2.ast);
					}
					}
					setState(104);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(105);
				match(T__9);
				 ((StatementContext)_localctx).ast =  new While_statement(((StatementContext)_localctx).expression.ast, _localctx.statements); 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(108);
				match(T__10);
				setState(109);
				match(T__6);
				setState(110);
				((StatementContext)_localctx).expression = expression(0);
				setState(111);
				match(T__7);
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(112);
					match(T__8);
					setState(113);
					((StatementContext)_localctx).b1 = block();
					((StatementContext)_localctx).statements = ((StatementContext)_localctx).b1.ast;
					setState(115);
					match(T__9);
					}
				}

				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__11) {
					{
					setState(119);
					match(T__11);
					setState(120);
					match(T__8);
					setState(121);
					((StatementContext)_localctx).b2 = block();
					((StatementContext)_localctx).statements = ((StatementContext)_localctx).b2.ast;
					setState(123);
					match(T__9);
					}
				}

				 ((StatementContext)_localctx).ast =  new If_statement(((StatementContext)_localctx).expression.ast, _localctx.statements, _localctx.statements); 
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(129);
				((StatementContext)_localctx).assignment = assignment();
				 ((StatementContext)_localctx).ast =  ((StatementContext)_localctx).assignment.ast; 
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(132);
				((StatementContext)_localctx).ID = match(ID);
				setState(133);
				match(T__6);
				setState(134);
				((StatementContext)_localctx).call_function = call_function();
				setState(135);
				match(T__7);
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
			setState(151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				((BlockContext)_localctx).statement = statement();
				 _localctx.ast.add(((BlockContext)_localctx).statement.ast); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 37108518488318L) != 0) {
					{
					{
					setState(143);
					((BlockContext)_localctx).statement = statement();
					 _localctx.ast.add(((BlockContext)_localctx).statement.ast); 
					}
					}
					setState(150);
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
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 37108518486144L) != 0) {
				{
				setState(153);
				((Call_functionContext)_localctx).e1 = expression(0);
				_localctx.expressions.add(((Call_functionContext)_localctx).e1.ast);
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__12) {
					{
					{
					setState(155);
					match(T__12);
					setState(156);
					((Call_functionContext)_localctx).e2 = expression(0);
					_localctx.expressions.add(((Call_functionContext)_localctx).e2.ast);
					}
					}
					setState(163);
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
			setState(166);
			((AssignmentContext)_localctx).left = expression(0);
			setState(167);
			match(T__13);
			setState(168);
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
		public ExpressionContext left;
		public ExpressionContext exp1;
		public TypeContext type;
		public ExpressionContext expression;
		public Token ID;
		public Call_functionContext call_function;
		public Token INT_LITERAL;
		public Token INT_REAL;
		public Token CHAR_LITERAL;
		public Token operador;
		public ExpressionContext right;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
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
			setState(197);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(172);
				match(T__19);
				setState(173);
				((ExpressionContext)_localctx).type = type();
				setState(174);
				match(T__20);
				setState(175);
				((ExpressionContext)_localctx).expression = expression(11);
				 ((ExpressionContext)_localctx).ast =  new Cast_expression(((ExpressionContext)_localctx).type.ast, ((ExpressionContext)_localctx).expression.ast); 
				}
				break;
			case 2:
				{
				setState(178);
				match(T__6);
				setState(179);
				((ExpressionContext)_localctx).expression = expression(0);
				setState(180);
				match(T__7);
				 ((ExpressionContext)_localctx).ast =  new Parenthesized_expression(((ExpressionContext)_localctx).expression.ast); 
				}
				break;
			case 3:
				{
				setState(183);
				((ExpressionContext)_localctx).ID = match(ID);
				setState(184);
				match(T__6);
				setState(185);
				((ExpressionContext)_localctx).call_function = call_function();
				setState(186);
				match(T__7);
				 ((ExpressionContext)_localctx).ast =  new Expression_call(((ExpressionContext)_localctx).ID, ((ExpressionContext)_localctx).call_function.expressions); 
				}
				break;
			case 4:
				{
				setState(189);
				((ExpressionContext)_localctx).INT_LITERAL = match(INT_LITERAL);
				 ((ExpressionContext)_localctx).ast =  new IntE_literal(((ExpressionContext)_localctx).INT_LITERAL); 
				}
				break;
			case 5:
				{
				setState(191);
				((ExpressionContext)_localctx).INT_REAL = match(INT_REAL);
				 ((ExpressionContext)_localctx).ast =  new IntE_real(((ExpressionContext)_localctx).INT_REAL); 
				}
				break;
			case 6:
				{
				setState(193);
				((ExpressionContext)_localctx).CHAR_LITERAL = match(CHAR_LITERAL);
				 ((ExpressionContext)_localctx).ast =  new CharE_literal(((ExpressionContext)_localctx).CHAR_LITERAL); 
				}
				break;
			case 7:
				{
				setState(195);
				((ExpressionContext)_localctx).ID = match(ID);
				 ((ExpressionContext)_localctx).ast =  new IdE(((ExpressionContext)_localctx).ID); 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(226);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(224);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(199);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(200);
						((ExpressionContext)_localctx).operador = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 1015808L) != 0) ) {
							((ExpressionContext)_localctx).operador = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(201);
						((ExpressionContext)_localctx).right = ((ExpressionContext)_localctx).expression = expression(13);
						 ((ExpressionContext)_localctx).ast =  new Arythmetic_expression(((ExpressionContext)_localctx).left.ast, ((ExpressionContext)_localctx).operador, ((ExpressionContext)_localctx).right.ast); 
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(204);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(205);
						((ExpressionContext)_localctx).operador = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 66060288L) != 0) ) {
							((ExpressionContext)_localctx).operador = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(206);
						((ExpressionContext)_localctx).right = ((ExpressionContext)_localctx).expression = expression(11);
						 ((ExpressionContext)_localctx).ast =  new Comparative_expression(((ExpressionContext)_localctx).left.ast, ((ExpressionContext)_localctx).operador, ((ExpressionContext)_localctx).right.ast); 
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(209);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(210);
						((ExpressionContext)_localctx).operador = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 469762048L) != 0) ) {
							((ExpressionContext)_localctx).operador = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(211);
						((ExpressionContext)_localctx).right = ((ExpressionContext)_localctx).expression = expression(10);
						 ((ExpressionContext)_localctx).ast =  new Logical_expression(((ExpressionContext)_localctx).left.ast, ((ExpressionContext)_localctx).operador, ((ExpressionContext)_localctx).right.ast); 
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.exp1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(214);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(215);
						match(T__28);
						setState(216);
						((ExpressionContext)_localctx).ID = match(ID);
						 ((ExpressionContext)_localctx).ast =  new Variable_access(((ExpressionContext)_localctx).exp1.ast, ((ExpressionContext)_localctx).ID); 
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(218);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(219);
						match(T__29);
						setState(220);
						((ExpressionContext)_localctx).right = ((ExpressionContext)_localctx).expression = expression(0);
						setState(221);
						match(T__30);
						 ((ExpressionContext)_localctx).ast =  new Array_access(((ExpressionContext)_localctx).left.ast, ((ExpressionContext)_localctx).right.ast); 
						}
						break;
					}
					} 
				}
				setState(228);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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
		public TypeContext type;
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			match(T__31);
			setState(230);
			((Variable_definitionContext)_localctx).ID = match(ID);
			setState(231);
			match(T__32);
			setState(232);
			((Variable_definitionContext)_localctx).type = type();
			((Variable_definitionContext)_localctx).ast =  new Variable_definition(((Variable_definitionContext)_localctx).ID, ((Variable_definitionContext)_localctx).type.ast);
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
		public List<Local_variable> variables = new ArrayList<>();
		public Token ID;
		public Local_variableContext local_variable;
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public List<Local_variableContext> local_variable() {
			return getRuleContexts(Local_variableContext.class);
		}
		public Local_variableContext local_variable(int i) {
			return getRuleContext(Local_variableContext.class,i);
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
			setState(235);
			match(T__33);
			setState(236);
			((Struct_definitionContext)_localctx).ID = match(ID);
			setState(237);
			match(T__8);
			setState(243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(238);
				((Struct_definitionContext)_localctx).local_variable = local_variable();
				_localctx.variables.add(((Struct_definitionContext)_localctx).local_variable.ast);
				}
				}
				setState(245);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(246);
			match(T__9);
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
		public List<Local_variable> variables = new ArrayList<>();
		public List<Variable_definition> variable_definitions = new ArrayList<>();
		public List<Statement> statements = new ArrayList<>();
		public Token ID;
		public Local_variableContext l1;
		public Local_variableContext l2;
		public Variable_definitionContext variable_definition;
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
		public List<Local_variableContext> local_variable() {
			return getRuleContexts(Local_variableContext.class);
		}
		public Local_variableContext local_variable(int i) {
			return getRuleContext(Local_variableContext.class,i);
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
			setState(329);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(249);
				((Function_definitionContext)_localctx).ID = match(ID);
				setState(250);
				match(T__6);
				setState(264);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(251);
					((Function_definitionContext)_localctx).l1 = local_variable();
					_localctx.variables.add(((Function_definitionContext)_localctx).l1.ast);
					setState(259);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__12) {
						{
						{
						setState(253);
						match(T__12);
						setState(254);
						((Function_definitionContext)_localctx).l2 = local_variable();
						_localctx.variables.add(((Function_definitionContext)_localctx).l2.ast);
						}
						}
						setState(261);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(266);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(267);
				match(T__7);
				setState(268);
				match(T__8);
				setState(274);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__31) {
					{
					{
					setState(269);
					((Function_definitionContext)_localctx).variable_definition = variable_definition();
					_localctx.variable_definitions.add(((Function_definitionContext)_localctx).variable_definition.ast);
					}
					}
					setState(276);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(282);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 37108518488318L) != 0) {
					{
					{
					setState(277);
					((Function_definitionContext)_localctx).s1 = statement();
					_localctx.statements.add(((Function_definitionContext)_localctx).s1.ast);
					}
					}
					setState(284);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(285);
				match(T__9);
				 ((Function_definitionContext)_localctx).ast =  new Function_definition(((Function_definitionContext)_localctx).ID, _localctx.variables, null, _localctx.variable_definitions, _localctx.statements);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(287);
				((Function_definitionContext)_localctx).ID = match(ID);
				setState(288);
				match(T__6);
				setState(302);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(289);
					((Function_definitionContext)_localctx).l1 = local_variable();
					_localctx.variables.add(((Function_definitionContext)_localctx).l1.ast);
					setState(297);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__12) {
						{
						{
						setState(291);
						match(T__12);
						setState(292);
						((Function_definitionContext)_localctx).l2 = local_variable();
						_localctx.variables.add(((Function_definitionContext)_localctx).l2.ast);
						}
						}
						setState(299);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(304);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(305);
				match(T__7);
				{
				setState(306);
				match(T__32);
				setState(307);
				((Function_definitionContext)_localctx).t = type();
				}
				setState(309);
				match(T__8);
				setState(315);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__31) {
					{
					{
					setState(310);
					((Function_definitionContext)_localctx).variable_definition = variable_definition();
					_localctx.variable_definitions.add(((Function_definitionContext)_localctx).variable_definition.ast);
					}
					}
					setState(317);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(323);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 37108518488318L) != 0) {
					{
					{
					setState(318);
					((Function_definitionContext)_localctx).s2 = statement();
					_localctx.statements.add(((Function_definitionContext)_localctx).s2.ast);
					}
					}
					setState(325);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(326);
				match(T__9);
				 ((Function_definitionContext)_localctx).ast =  new Function_definition(((Function_definitionContext)_localctx).ID, _localctx.variables, ((Function_definitionContext)_localctx).t.ast, _localctx.variable_definitions, _localctx.statements);
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
	public static class Local_variableContext extends ParserRuleContext {
		public Local_variable ast;
		public Token ID;
		public TypeContext type;
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Local_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_local_variable; }
	}

	public final Local_variableContext local_variable() throws RecognitionException {
		Local_variableContext _localctx = new Local_variableContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_local_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			((Local_variableContext)_localctx).ID = match(ID);
			setState(332);
			match(T__32);
			setState(333);
			((Local_variableContext)_localctx).type = type();
			((Local_variableContext)_localctx).ast =  new Local_variable(((Local_variableContext)_localctx).ID, ((Local_variableContext)_localctx).type.ast);
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
		public Token INT_LITERAL;
		public TypeContext type;
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public TerminalNode INT_LITERAL() { return getToken(GrammarParser.INT_LITERAL, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
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
			setState(350);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__34:
				enterOuterAlt(_localctx, 1);
				{
				setState(336);
				match(T__34);
				 ((TypeContext)_localctx).ast =  new Int_type(); 
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 2);
				{
				setState(338);
				match(T__35);
				 ((TypeContext)_localctx).ast =  new Real_type(); 
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 3);
				{
				setState(340);
				match(T__36);
				 ((TypeContext)_localctx).ast =  new Char_type(); 
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(342);
				match(ID);
				 ((TypeContext)_localctx).ast =  new Id_type(); 
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 5);
				{
				setState(344);
				match(T__29);
				setState(345);
				((TypeContext)_localctx).INT_LITERAL = match(INT_LITERAL);
				setState(346);
				match(T__30);
				setState(347);
				((TypeContext)_localctx).type = type();
				 ((TypeContext)_localctx).ast =  new Array_type(((TypeContext)_localctx).INT_LITERAL, ((TypeContext)_localctx).type.ast); 
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
			return precpred(_ctx, 12);
		case 1:
			return precpred(_ctx, 10);
		case 2:
			return precpred(_ctx, 9);
		case 3:
			return precpred(_ctx, 6);
		case 4:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001-\u0161\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0005\u0000\"\b\u0000\n\u0000\f\u0000%"+
		"\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0003\u00013\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0005\u0002?\b\u0002\n\u0002\f\u0002B\t\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002I\b\u0002\n\u0002"+
		"\f\u0002L\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0005\u0002S\b\u0002\n\u0002\f\u0002V\t\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005"+
		"\u0002e\b\u0002\n\u0002\f\u0002h\t\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002v\b\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u0002~\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0003\u0002\u008b\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0005\u0003\u0093\b\u0003\n\u0003\f\u0003"+
		"\u0096\t\u0003\u0003\u0003\u0098\b\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u00a0\b\u0004\n"+
		"\u0004\f\u0004\u00a3\t\u0004\u0003\u0004\u00a5\b\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003"+
		"\u0006\u00c6\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u00e1\b\u0006\n\u0006\f\u0006"+
		"\u00e4\t\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u00f2"+
		"\b\b\n\b\f\b\u00f5\t\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u0102\b\t\n\t\f\t\u0105"+
		"\t\t\u0005\t\u0107\b\t\n\t\f\t\u010a\t\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0005\t\u0111\b\t\n\t\f\t\u0114\t\t\u0001\t\u0001\t\u0001\t"+
		"\u0005\t\u0119\b\t\n\t\f\t\u011c\t\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u0128\b\t\n\t\f\t\u012b"+
		"\t\t\u0005\t\u012d\b\t\n\t\f\t\u0130\t\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u013a\b\t\n\t\f\t\u013d\t\t"+
		"\u0001\t\u0001\t\u0001\t\u0005\t\u0142\b\t\n\t\f\t\u0145\t\t\u0001\t\u0001"+
		"\t\u0001\t\u0003\t\u014a\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0003\u000b\u015f\b\u000b\u0001\u000b\u0000\u0001\f"+
		"\f\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0000\u0003"+
		"\u0001\u0000\u000f\u0013\u0001\u0000\u0014\u0019\u0001\u0000\u001a\u001c"+
		"\u0185\u0000#\u0001\u0000\u0000\u0000\u00022\u0001\u0000\u0000\u0000\u0004"+
		"\u008a\u0001\u0000\u0000\u0000\u0006\u0097\u0001\u0000\u0000\u0000\b\u00a4"+
		"\u0001\u0000\u0000\u0000\n\u00a6\u0001\u0000\u0000\u0000\f\u00c5\u0001"+
		"\u0000\u0000\u0000\u000e\u00e5\u0001\u0000\u0000\u0000\u0010\u00eb\u0001"+
		"\u0000\u0000\u0000\u0012\u0149\u0001\u0000\u0000\u0000\u0014\u014b\u0001"+
		"\u0000\u0000\u0000\u0016\u015e\u0001\u0000\u0000\u0000\u0018\u0019\u0003"+
		"\u000e\u0007\u0000\u0019\u001a\u0006\u0000\uffff\uffff\u0000\u001a\"\u0001"+
		"\u0000\u0000\u0000\u001b\u001c\u0003\u0010\b\u0000\u001c\u001d\u0006\u0000"+
		"\uffff\uffff\u0000\u001d\"\u0001\u0000\u0000\u0000\u001e\u001f\u0003\u0012"+
		"\t\u0000\u001f \u0006\u0000\uffff\uffff\u0000 \"\u0001\u0000\u0000\u0000"+
		"!\u0018\u0001\u0000\u0000\u0000!\u001b\u0001\u0000\u0000\u0000!\u001e"+
		"\u0001\u0000\u0000\u0000\"%\u0001\u0000\u0000\u0000#!\u0001\u0000\u0000"+
		"\u0000#$\u0001\u0000\u0000\u0000$&\u0001\u0000\u0000\u0000%#\u0001\u0000"+
		"\u0000\u0000&\'\u0005\u0000\u0000\u0001\'(\u0006\u0000\uffff\uffff\u0000"+
		"(\u0001\u0001\u0000\u0000\u0000)*\u0003\u000e\u0007\u0000*+\u0006\u0001"+
		"\uffff\uffff\u0000+3\u0001\u0000\u0000\u0000,-\u0003\u0010\b\u0000-.\u0006"+
		"\u0001\uffff\uffff\u0000.3\u0001\u0000\u0000\u0000/0\u0003\u0012\t\u0000"+
		"01\u0006\u0001\uffff\uffff\u000013\u0001\u0000\u0000\u00002)\u0001\u0000"+
		"\u0000\u00002,\u0001\u0000\u0000\u00002/\u0001\u0000\u0000\u00003\u0003"+
		"\u0001\u0000\u0000\u000045\u0005\u0001\u0000\u00005\u008b\u0006\u0002"+
		"\uffff\uffff\u000067\u0005\u0001\u0000\u000078\u0003\f\u0006\u000089\u0006"+
		"\u0002\uffff\uffff\u00009\u008b\u0001\u0000\u0000\u0000:@\u0005\u0002"+
		"\u0000\u0000;<\u0003\f\u0006\u0000<=\u0006\u0002\uffff\uffff\u0000=?\u0001"+
		"\u0000\u0000\u0000>;\u0001\u0000\u0000\u0000?B\u0001\u0000\u0000\u0000"+
		"@>\u0001\u0000\u0000\u0000@A\u0001\u0000\u0000\u0000AC\u0001\u0000\u0000"+
		"\u0000B@\u0001\u0000\u0000\u0000C\u008b\u0006\u0002\uffff\uffff\u0000"+
		"DJ\u0005\u0003\u0000\u0000EF\u0003\f\u0006\u0000FG\u0006\u0002\uffff\uffff"+
		"\u0000GI\u0001\u0000\u0000\u0000HE\u0001\u0000\u0000\u0000IL\u0001\u0000"+
		"\u0000\u0000JH\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000KM\u0001"+
		"\u0000\u0000\u0000LJ\u0001\u0000\u0000\u0000M\u008b\u0006\u0002\uffff"+
		"\uffff\u0000NT\u0005\u0004\u0000\u0000OP\u0003\f\u0006\u0000PQ\u0006\u0002"+
		"\uffff\uffff\u0000QS\u0001\u0000\u0000\u0000RO\u0001\u0000\u0000\u0000"+
		"SV\u0001\u0000\u0000\u0000TR\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000"+
		"\u0000UW\u0001\u0000\u0000\u0000VT\u0001\u0000\u0000\u0000W\u008b\u0006"+
		"\u0002\uffff\uffff\u0000XY\u0005\u0005\u0000\u0000YZ\u0003\f\u0006\u0000"+
		"Z[\u0006\u0002\uffff\uffff\u0000[\u008b\u0001\u0000\u0000\u0000\\]\u0005"+
		"\u0006\u0000\u0000]^\u0005\u0007\u0000\u0000^_\u0003\f\u0006\u0000_`\u0005"+
		"\b\u0000\u0000`f\u0005\t\u0000\u0000ab\u0003\u0004\u0002\u0000bc\u0006"+
		"\u0002\uffff\uffff\u0000ce\u0001\u0000\u0000\u0000da\u0001\u0000\u0000"+
		"\u0000eh\u0001\u0000\u0000\u0000fd\u0001\u0000\u0000\u0000fg\u0001\u0000"+
		"\u0000\u0000gi\u0001\u0000\u0000\u0000hf\u0001\u0000\u0000\u0000ij\u0005"+
		"\n\u0000\u0000jk\u0006\u0002\uffff\uffff\u0000k\u008b\u0001\u0000\u0000"+
		"\u0000lm\u0005\u000b\u0000\u0000mn\u0005\u0007\u0000\u0000no\u0003\f\u0006"+
		"\u0000ou\u0005\b\u0000\u0000pq\u0005\t\u0000\u0000qr\u0003\u0006\u0003"+
		"\u0000rs\u0006\u0002\uffff\uffff\u0000st\u0005\n\u0000\u0000tv\u0001\u0000"+
		"\u0000\u0000up\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000v}\u0001"+
		"\u0000\u0000\u0000wx\u0005\f\u0000\u0000xy\u0005\t\u0000\u0000yz\u0003"+
		"\u0006\u0003\u0000z{\u0006\u0002\uffff\uffff\u0000{|\u0005\n\u0000\u0000"+
		"|~\u0001\u0000\u0000\u0000}w\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000"+
		"\u0000~\u007f\u0001\u0000\u0000\u0000\u007f\u0080\u0006\u0002\uffff\uffff"+
		"\u0000\u0080\u008b\u0001\u0000\u0000\u0000\u0081\u0082\u0003\n\u0005\u0000"+
		"\u0082\u0083\u0006\u0002\uffff\uffff\u0000\u0083\u008b\u0001\u0000\u0000"+
		"\u0000\u0084\u0085\u0005-\u0000\u0000\u0085\u0086\u0005\u0007\u0000\u0000"+
		"\u0086\u0087\u0003\b\u0004\u0000\u0087\u0088\u0005\b\u0000\u0000\u0088"+
		"\u0089\u0006\u0002\uffff\uffff\u0000\u0089\u008b\u0001\u0000\u0000\u0000"+
		"\u008a4\u0001\u0000\u0000\u0000\u008a6\u0001\u0000\u0000\u0000\u008a:"+
		"\u0001\u0000\u0000\u0000\u008aD\u0001\u0000\u0000\u0000\u008aN\u0001\u0000"+
		"\u0000\u0000\u008aX\u0001\u0000\u0000\u0000\u008a\\\u0001\u0000\u0000"+
		"\u0000\u008al\u0001\u0000\u0000\u0000\u008a\u0081\u0001\u0000\u0000\u0000"+
		"\u008a\u0084\u0001\u0000\u0000\u0000\u008b\u0005\u0001\u0000\u0000\u0000"+
		"\u008c\u008d\u0003\u0004\u0002\u0000\u008d\u008e\u0006\u0003\uffff\uffff"+
		"\u0000\u008e\u0098\u0001\u0000\u0000\u0000\u008f\u0090\u0003\u0004\u0002"+
		"\u0000\u0090\u0091\u0006\u0003\uffff\uffff\u0000\u0091\u0093\u0001\u0000"+
		"\u0000\u0000\u0092\u008f\u0001\u0000\u0000\u0000\u0093\u0096\u0001\u0000"+
		"\u0000\u0000\u0094\u0092\u0001\u0000\u0000\u0000\u0094\u0095\u0001\u0000"+
		"\u0000\u0000\u0095\u0098\u0001\u0000\u0000\u0000\u0096\u0094\u0001\u0000"+
		"\u0000\u0000\u0097\u008c\u0001\u0000\u0000\u0000\u0097\u0094\u0001\u0000"+
		"\u0000\u0000\u0098\u0007\u0001\u0000\u0000\u0000\u0099\u009a\u0003\f\u0006"+
		"\u0000\u009a\u00a1\u0006\u0004\uffff\uffff\u0000\u009b\u009c\u0005\r\u0000"+
		"\u0000\u009c\u009d\u0003\f\u0006\u0000\u009d\u009e\u0006\u0004\uffff\uffff"+
		"\u0000\u009e\u00a0\u0001\u0000\u0000\u0000\u009f\u009b\u0001\u0000\u0000"+
		"\u0000\u00a0\u00a3\u0001\u0000\u0000\u0000\u00a1\u009f\u0001\u0000\u0000"+
		"\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2\u00a5\u0001\u0000\u0000"+
		"\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a4\u0099\u0001\u0000\u0000"+
		"\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5\t\u0001\u0000\u0000\u0000"+
		"\u00a6\u00a7\u0003\f\u0006\u0000\u00a7\u00a8\u0005\u000e\u0000\u0000\u00a8"+
		"\u00a9\u0003\f\u0006\u0000\u00a9\u00aa\u0006\u0005\uffff\uffff\u0000\u00aa"+
		"\u000b\u0001\u0000\u0000\u0000\u00ab\u00ac\u0006\u0006\uffff\uffff\u0000"+
		"\u00ac\u00ad\u0005\u0014\u0000\u0000\u00ad\u00ae\u0003\u0016\u000b\u0000"+
		"\u00ae\u00af\u0005\u0015\u0000\u0000\u00af\u00b0\u0003\f\u0006\u000b\u00b0"+
		"\u00b1\u0006\u0006\uffff\uffff\u0000\u00b1\u00c6\u0001\u0000\u0000\u0000"+
		"\u00b2\u00b3\u0005\u0007\u0000\u0000\u00b3\u00b4\u0003\f\u0006\u0000\u00b4"+
		"\u00b5\u0005\b\u0000\u0000\u00b5\u00b6\u0006\u0006\uffff\uffff\u0000\u00b6"+
		"\u00c6\u0001\u0000\u0000\u0000\u00b7\u00b8\u0005-\u0000\u0000\u00b8\u00b9"+
		"\u0005\u0007\u0000\u0000\u00b9\u00ba\u0003\b\u0004\u0000\u00ba\u00bb\u0005"+
		"\b\u0000\u0000\u00bb\u00bc\u0006\u0006\uffff\uffff\u0000\u00bc\u00c6\u0001"+
		"\u0000\u0000\u0000\u00bd\u00be\u0005\'\u0000\u0000\u00be\u00c6\u0006\u0006"+
		"\uffff\uffff\u0000\u00bf\u00c0\u0005&\u0000\u0000\u00c0\u00c6\u0006\u0006"+
		"\uffff\uffff\u0000\u00c1\u00c2\u0005(\u0000\u0000\u00c2\u00c6\u0006\u0006"+
		"\uffff\uffff\u0000\u00c3\u00c4\u0005-\u0000\u0000\u00c4\u00c6\u0006\u0006"+
		"\uffff\uffff\u0000\u00c5\u00ab\u0001\u0000\u0000\u0000\u00c5\u00b2\u0001"+
		"\u0000\u0000\u0000\u00c5\u00b7\u0001\u0000\u0000\u0000\u00c5\u00bd\u0001"+
		"\u0000\u0000\u0000\u00c5\u00bf\u0001\u0000\u0000\u0000\u00c5\u00c1\u0001"+
		"\u0000\u0000\u0000\u00c5\u00c3\u0001\u0000\u0000\u0000\u00c6\u00e2\u0001"+
		"\u0000\u0000\u0000\u00c7\u00c8\n\f\u0000\u0000\u00c8\u00c9\u0007\u0000"+
		"\u0000\u0000\u00c9\u00ca\u0003\f\u0006\r\u00ca\u00cb\u0006\u0006\uffff"+
		"\uffff\u0000\u00cb\u00e1\u0001\u0000\u0000\u0000\u00cc\u00cd\n\n\u0000"+
		"\u0000\u00cd\u00ce\u0007\u0001\u0000\u0000\u00ce\u00cf\u0003\f\u0006\u000b"+
		"\u00cf\u00d0\u0006\u0006\uffff\uffff\u0000\u00d0\u00e1\u0001\u0000\u0000"+
		"\u0000\u00d1\u00d2\n\t\u0000\u0000\u00d2\u00d3\u0007\u0002\u0000\u0000"+
		"\u00d3\u00d4\u0003\f\u0006\n\u00d4\u00d5\u0006\u0006\uffff\uffff\u0000"+
		"\u00d5\u00e1\u0001\u0000\u0000\u0000\u00d6\u00d7\n\u0006\u0000\u0000\u00d7"+
		"\u00d8\u0005\u001d\u0000\u0000\u00d8\u00d9\u0005-\u0000\u0000\u00d9\u00e1"+
		"\u0006\u0006\uffff\uffff\u0000\u00da\u00db\n\u0005\u0000\u0000\u00db\u00dc"+
		"\u0005\u001e\u0000\u0000\u00dc\u00dd\u0003\f\u0006\u0000\u00dd\u00de\u0005"+
		"\u001f\u0000\u0000\u00de\u00df\u0006\u0006\uffff\uffff\u0000\u00df\u00e1"+
		"\u0001\u0000\u0000\u0000\u00e0\u00c7\u0001\u0000\u0000\u0000\u00e0\u00cc"+
		"\u0001\u0000\u0000\u0000\u00e0\u00d1\u0001\u0000\u0000\u0000\u00e0\u00d6"+
		"\u0001\u0000\u0000\u0000\u00e0\u00da\u0001\u0000\u0000\u0000\u00e1\u00e4"+
		"\u0001\u0000\u0000\u0000\u00e2\u00e0\u0001\u0000\u0000\u0000\u00e2\u00e3"+
		"\u0001\u0000\u0000\u0000\u00e3\r\u0001\u0000\u0000\u0000\u00e4\u00e2\u0001"+
		"\u0000\u0000\u0000\u00e5\u00e6\u0005 \u0000\u0000\u00e6\u00e7\u0005-\u0000"+
		"\u0000\u00e7\u00e8\u0005!\u0000\u0000\u00e8\u00e9\u0003\u0016\u000b\u0000"+
		"\u00e9\u00ea\u0006\u0007\uffff\uffff\u0000\u00ea\u000f\u0001\u0000\u0000"+
		"\u0000\u00eb\u00ec\u0005\"\u0000\u0000\u00ec\u00ed\u0005-\u0000\u0000"+
		"\u00ed\u00f3\u0005\t\u0000\u0000\u00ee\u00ef\u0003\u0014\n\u0000\u00ef"+
		"\u00f0\u0006\b\uffff\uffff\u0000\u00f0\u00f2\u0001\u0000\u0000\u0000\u00f1"+
		"\u00ee\u0001\u0000\u0000\u0000\u00f2\u00f5\u0001\u0000\u0000\u0000\u00f3"+
		"\u00f1\u0001\u0000\u0000\u0000\u00f3\u00f4\u0001\u0000\u0000\u0000\u00f4"+
		"\u00f6\u0001\u0000\u0000\u0000\u00f5\u00f3\u0001\u0000\u0000\u0000\u00f6"+
		"\u00f7\u0005\n\u0000\u0000\u00f7\u00f8\u0006\b\uffff\uffff\u0000\u00f8"+
		"\u0011\u0001\u0000\u0000\u0000\u00f9\u00fa\u0005-\u0000\u0000\u00fa\u0108"+
		"\u0005\u0007\u0000\u0000\u00fb\u00fc\u0003\u0014\n\u0000\u00fc\u0103\u0006"+
		"\t\uffff\uffff\u0000\u00fd\u00fe\u0005\r\u0000\u0000\u00fe\u00ff\u0003"+
		"\u0014\n\u0000\u00ff\u0100\u0006\t\uffff\uffff\u0000\u0100\u0102\u0001"+
		"\u0000\u0000\u0000\u0101\u00fd\u0001\u0000\u0000\u0000\u0102\u0105\u0001"+
		"\u0000\u0000\u0000\u0103\u0101\u0001\u0000\u0000\u0000\u0103\u0104\u0001"+
		"\u0000\u0000\u0000\u0104\u0107\u0001\u0000\u0000\u0000\u0105\u0103\u0001"+
		"\u0000\u0000\u0000\u0106\u00fb\u0001\u0000\u0000\u0000\u0107\u010a\u0001"+
		"\u0000\u0000\u0000\u0108\u0106\u0001\u0000\u0000\u0000\u0108\u0109\u0001"+
		"\u0000\u0000\u0000\u0109\u010b\u0001\u0000\u0000\u0000\u010a\u0108\u0001"+
		"\u0000\u0000\u0000\u010b\u010c\u0005\b\u0000\u0000\u010c\u0112\u0005\t"+
		"\u0000\u0000\u010d\u010e\u0003\u000e\u0007\u0000\u010e\u010f\u0006\t\uffff"+
		"\uffff\u0000\u010f\u0111\u0001\u0000\u0000\u0000\u0110\u010d\u0001\u0000"+
		"\u0000\u0000\u0111\u0114\u0001\u0000\u0000\u0000\u0112\u0110\u0001\u0000"+
		"\u0000\u0000\u0112\u0113\u0001\u0000\u0000\u0000\u0113\u011a\u0001\u0000"+
		"\u0000\u0000\u0114\u0112\u0001\u0000\u0000\u0000\u0115\u0116\u0003\u0004"+
		"\u0002\u0000\u0116\u0117\u0006\t\uffff\uffff\u0000\u0117\u0119\u0001\u0000"+
		"\u0000\u0000\u0118\u0115\u0001\u0000\u0000\u0000\u0119\u011c\u0001\u0000"+
		"\u0000\u0000\u011a\u0118\u0001\u0000\u0000\u0000\u011a\u011b\u0001\u0000"+
		"\u0000\u0000\u011b\u011d\u0001\u0000\u0000\u0000\u011c\u011a\u0001\u0000"+
		"\u0000\u0000\u011d\u011e\u0005\n\u0000\u0000\u011e\u014a\u0006\t\uffff"+
		"\uffff\u0000\u011f\u0120\u0005-\u0000\u0000\u0120\u012e\u0005\u0007\u0000"+
		"\u0000\u0121\u0122\u0003\u0014\n\u0000\u0122\u0129\u0006\t\uffff\uffff"+
		"\u0000\u0123\u0124\u0005\r\u0000\u0000\u0124\u0125\u0003\u0014\n\u0000"+
		"\u0125\u0126\u0006\t\uffff\uffff\u0000\u0126\u0128\u0001\u0000\u0000\u0000"+
		"\u0127\u0123\u0001\u0000\u0000\u0000\u0128\u012b\u0001\u0000\u0000\u0000"+
		"\u0129\u0127\u0001\u0000\u0000\u0000\u0129\u012a\u0001\u0000\u0000\u0000"+
		"\u012a\u012d\u0001\u0000\u0000\u0000\u012b\u0129\u0001\u0000\u0000\u0000"+
		"\u012c\u0121\u0001\u0000\u0000\u0000\u012d\u0130\u0001\u0000\u0000\u0000"+
		"\u012e\u012c\u0001\u0000\u0000\u0000\u012e\u012f\u0001\u0000\u0000\u0000"+
		"\u012f\u0131\u0001\u0000\u0000\u0000\u0130\u012e\u0001\u0000\u0000\u0000"+
		"\u0131\u0132\u0005\b\u0000\u0000\u0132\u0133\u0005!\u0000\u0000\u0133"+
		"\u0134\u0003\u0016\u000b\u0000\u0134\u0135\u0001\u0000\u0000\u0000\u0135"+
		"\u013b\u0005\t\u0000\u0000\u0136\u0137\u0003\u000e\u0007\u0000\u0137\u0138"+
		"\u0006\t\uffff\uffff\u0000\u0138\u013a\u0001\u0000\u0000\u0000\u0139\u0136"+
		"\u0001\u0000\u0000\u0000\u013a\u013d\u0001\u0000\u0000\u0000\u013b\u0139"+
		"\u0001\u0000\u0000\u0000\u013b\u013c\u0001\u0000\u0000\u0000\u013c\u0143"+
		"\u0001\u0000\u0000\u0000\u013d\u013b\u0001\u0000\u0000\u0000\u013e\u013f"+
		"\u0003\u0004\u0002\u0000\u013f\u0140\u0006\t\uffff\uffff\u0000\u0140\u0142"+
		"\u0001\u0000\u0000\u0000\u0141\u013e\u0001\u0000\u0000\u0000\u0142\u0145"+
		"\u0001\u0000\u0000\u0000\u0143\u0141\u0001\u0000\u0000\u0000\u0143\u0144"+
		"\u0001\u0000\u0000\u0000\u0144\u0146\u0001\u0000\u0000\u0000\u0145\u0143"+
		"\u0001\u0000\u0000\u0000\u0146\u0147\u0005\n\u0000\u0000\u0147\u0148\u0006"+
		"\t\uffff\uffff\u0000\u0148\u014a\u0001\u0000\u0000\u0000\u0149\u00f9\u0001"+
		"\u0000\u0000\u0000\u0149\u011f\u0001\u0000\u0000\u0000\u014a\u0013\u0001"+
		"\u0000\u0000\u0000\u014b\u014c\u0005-\u0000\u0000\u014c\u014d\u0005!\u0000"+
		"\u0000\u014d\u014e\u0003\u0016\u000b\u0000\u014e\u014f\u0006\n\uffff\uffff"+
		"\u0000\u014f\u0015\u0001\u0000\u0000\u0000\u0150\u0151\u0005#\u0000\u0000"+
		"\u0151\u015f\u0006\u000b\uffff\uffff\u0000\u0152\u0153\u0005$\u0000\u0000"+
		"\u0153\u015f\u0006\u000b\uffff\uffff\u0000\u0154\u0155\u0005%\u0000\u0000"+
		"\u0155\u015f\u0006\u000b\uffff\uffff\u0000\u0156\u0157\u0005-\u0000\u0000"+
		"\u0157\u015f\u0006\u000b\uffff\uffff\u0000\u0158\u0159\u0005\u001e\u0000"+
		"\u0000\u0159\u015a\u0005\'\u0000\u0000\u015a\u015b\u0005\u001f\u0000\u0000"+
		"\u015b\u015c\u0003\u0016\u000b\u0000\u015c\u015d\u0006\u000b\uffff\uffff"+
		"\u0000\u015d\u015f\u0001\u0000\u0000\u0000\u015e\u0150\u0001\u0000\u0000"+
		"\u0000\u015e\u0152\u0001\u0000\u0000\u0000\u015e\u0154\u0001\u0000\u0000"+
		"\u0000\u015e\u0156\u0001\u0000\u0000\u0000\u015e\u0158\u0001\u0000\u0000"+
		"\u0000\u015f\u0017\u0001\u0000\u0000\u0000\u001c!#2@JTfu}\u008a\u0094"+
		"\u0097\u00a1\u00a4\u00c5\u00e0\u00e2\u00f3\u0103\u0108\u0112\u011a\u0129"+
		"\u012e\u013b\u0143\u0149\u015e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}