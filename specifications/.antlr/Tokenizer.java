// Generated from c:/Users/nahia/OneDrive/Escritorio/U N I/3 UNI/2do Semestre/DLP/Practica/DLP_myLanguage/DLP/specifications/Tokenizer.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class Tokenizer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT_REAL=1, INT_LITERAL=2, CHAR_LITERAL=3, LINE_COMMENT=4, MULTILINE_COMMENT=5, 
		WHITESPACE=6, ID=7;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"INT_REAL", "INT_LITERAL", "CHAR_LITERAL", "LINE_COMMENT", "MULTILINE_COMMENT", 
			"WHITESPACE", "ID"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INT_REAL", "INT_LITERAL", "CHAR_LITERAL", "LINE_COMMENT", "MULTILINE_COMMENT", 
			"WHITESPACE", "ID"
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


	public Tokenizer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Tokenizer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0007R\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0001\u0000"+
		"\u0004\u0000\u0011\b\u0000\u000b\u0000\f\u0000\u0012\u0001\u0000\u0001"+
		"\u0000\u0004\u0000\u0017\b\u0000\u000b\u0000\f\u0000\u0018\u0001\u0001"+
		"\u0004\u0001\u001c\b\u0001\u000b\u0001\f\u0001\u001d\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u0002\'\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005"+
		"\u0003-\b\u0003\n\u0003\f\u00030\t\u0003\u0001\u0003\u0003\u00033\b\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0005\u0004;\b\u0004\n\u0004\f\u0004>\t\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0004\u0005F\b\u0005"+
		"\u000b\u0005\f\u0005G\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0005\u0006N\b\u0006\n\u0006\f\u0006Q\t\u0006\u0002.<\u0000\u0007\u0001"+
		"\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007"+
		"\u0001\u0000\u0006\u0001\u000009\u0002\u0000\n\n\r\r\u0001\u0001\n\n\u0003"+
		"\u0000\t\n\r\r  \u0003\u0000AZ__az\u0004\u000009AZ__azY\u0000\u0001\u0001"+
		"\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001"+
		"\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000"+
		"\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000"+
		"\u0000\u0001\u0010\u0001\u0000\u0000\u0000\u0003\u001b\u0001\u0000\u0000"+
		"\u0000\u0005&\u0001\u0000\u0000\u0000\u0007(\u0001\u0000\u0000\u0000\t"+
		"6\u0001\u0000\u0000\u0000\u000bE\u0001\u0000\u0000\u0000\rK\u0001\u0000"+
		"\u0000\u0000\u000f\u0011\u0007\u0000\u0000\u0000\u0010\u000f\u0001\u0000"+
		"\u0000\u0000\u0011\u0012\u0001\u0000\u0000\u0000\u0012\u0010\u0001\u0000"+
		"\u0000\u0000\u0012\u0013\u0001\u0000\u0000\u0000\u0013\u0014\u0001\u0000"+
		"\u0000\u0000\u0014\u0016\u0005.\u0000\u0000\u0015\u0017\u0007\u0000\u0000"+
		"\u0000\u0016\u0015\u0001\u0000\u0000\u0000\u0017\u0018\u0001\u0000\u0000"+
		"\u0000\u0018\u0016\u0001\u0000\u0000\u0000\u0018\u0019\u0001\u0000\u0000"+
		"\u0000\u0019\u0002\u0001\u0000\u0000\u0000\u001a\u001c\u0007\u0000\u0000"+
		"\u0000\u001b\u001a\u0001\u0000\u0000\u0000\u001c\u001d\u0001\u0000\u0000"+
		"\u0000\u001d\u001b\u0001\u0000\u0000\u0000\u001d\u001e\u0001\u0000\u0000"+
		"\u0000\u001e\u0004\u0001\u0000\u0000\u0000\u001f \u0005\'\u0000\u0000"+
		" !\b\u0001\u0000\u0000!\'\u0005\'\u0000\u0000\"#\u0005\'\u0000\u0000#"+
		"$\u0005\\\u0000\u0000$%\u0005n\u0000\u0000%\'\u0005\'\u0000\u0000&\u001f"+
		"\u0001\u0000\u0000\u0000&\"\u0001\u0000\u0000\u0000\'\u0006\u0001\u0000"+
		"\u0000\u0000()\u0005/\u0000\u0000)*\u0005/\u0000\u0000*.\u0001\u0000\u0000"+
		"\u0000+-\t\u0000\u0000\u0000,+\u0001\u0000\u0000\u0000-0\u0001\u0000\u0000"+
		"\u0000./\u0001\u0000\u0000\u0000.,\u0001\u0000\u0000\u0000/2\u0001\u0000"+
		"\u0000\u00000.\u0001\u0000\u0000\u000013\u0007\u0002\u0000\u000021\u0001"+
		"\u0000\u0000\u000034\u0001\u0000\u0000\u000045\u0006\u0003\u0000\u0000"+
		"5\b\u0001\u0000\u0000\u000067\u0005/\u0000\u000078\u0005*\u0000\u0000"+
		"8<\u0001\u0000\u0000\u00009;\t\u0000\u0000\u0000:9\u0001\u0000\u0000\u0000"+
		";>\u0001\u0000\u0000\u0000<=\u0001\u0000\u0000\u0000<:\u0001\u0000\u0000"+
		"\u0000=?\u0001\u0000\u0000\u0000><\u0001\u0000\u0000\u0000?@\u0005*\u0000"+
		"\u0000@A\u0005/\u0000\u0000AB\u0001\u0000\u0000\u0000BC\u0006\u0004\u0000"+
		"\u0000C\n\u0001\u0000\u0000\u0000DF\u0007\u0003\u0000\u0000ED\u0001\u0000"+
		"\u0000\u0000FG\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000GH\u0001"+
		"\u0000\u0000\u0000HI\u0001\u0000\u0000\u0000IJ\u0006\u0005\u0000\u0000"+
		"J\f\u0001\u0000\u0000\u0000KO\u0007\u0004\u0000\u0000LN\u0007\u0005\u0000"+
		"\u0000ML\u0001\u0000\u0000\u0000NQ\u0001\u0000\u0000\u0000OM\u0001\u0000"+
		"\u0000\u0000OP\u0001\u0000\u0000\u0000P\u000e\u0001\u0000\u0000\u0000"+
		"QO\u0001\u0000\u0000\u0000\n\u0000\u0012\u0018\u001d&.2<GO\u0001\u0006"+
		"\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}