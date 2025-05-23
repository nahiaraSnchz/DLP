// Generated from c:/Users/sanch/OneDrive/Desktop/U N I/3 UNI/2do Semestre/Diseño de Lenguajes de Programación/Practica/DLP_language/DLP_language/mlang_nahiaraSanchez/specifications/Tokenizer.g4 by ANTLR 4.13.1
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
		WHITESPACE=6, SEMICOLON=7, ID=8;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"INT_REAL", "INT_LITERAL", "CHAR_LITERAL", "LINE_COMMENT", "MULTILINE_COMMENT", 
			"WHITESPACE", "SEMICOLON", "ID"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INT_REAL", "INT_LITERAL", "CHAR_LITERAL", "LINE_COMMENT", "MULTILINE_COMMENT", 
			"WHITESPACE", "SEMICOLON", "ID"
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
		"\u0004\u0000\bX\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0001\u0000\u0004\u0000\u0013\b\u0000\u000b\u0000\f\u0000"+
		"\u0014\u0001\u0000\u0001\u0000\u0004\u0000\u0019\b\u0000\u000b\u0000\f"+
		"\u0000\u001a\u0001\u0001\u0004\u0001\u001e\b\u0001\u000b\u0001\f\u0001"+
		"\u001f\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0003\u0002)\b\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0005\u0003/\b\u0003\n\u0003\f\u00032\t\u0003\u0001"+
		"\u0003\u0003\u00035\b\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0005\u0004=\b\u0004\n\u0004\f\u0004@\t"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0004\u0005H\b\u0005\u000b\u0005\f\u0005I\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0005\u0007T\b\u0007\n\u0007\f\u0007W\t\u0007\u00020>\u0000\b\u0001\u0001"+
		"\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f"+
		"\b\u0001\u0000\u0006\u0001\u000009\u0002\u0000\n\n\r\r\u0001\u0001\n\n"+
		"\u0003\u0000\t\n\r\r  \u0003\u0000AZ__az\u0004\u000009AZ__az_\u0000\u0001"+
		"\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005"+
		"\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001"+
		"\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000"+
		"\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0001\u0012\u0001\u0000"+
		"\u0000\u0000\u0003\u001d\u0001\u0000\u0000\u0000\u0005(\u0001\u0000\u0000"+
		"\u0000\u0007*\u0001\u0000\u0000\u0000\t8\u0001\u0000\u0000\u0000\u000b"+
		"G\u0001\u0000\u0000\u0000\rM\u0001\u0000\u0000\u0000\u000fQ\u0001\u0000"+
		"\u0000\u0000\u0011\u0013\u0007\u0000\u0000\u0000\u0012\u0011\u0001\u0000"+
		"\u0000\u0000\u0013\u0014\u0001\u0000\u0000\u0000\u0014\u0012\u0001\u0000"+
		"\u0000\u0000\u0014\u0015\u0001\u0000\u0000\u0000\u0015\u0016\u0001\u0000"+
		"\u0000\u0000\u0016\u0018\u0005.\u0000\u0000\u0017\u0019\u0007\u0000\u0000"+
		"\u0000\u0018\u0017\u0001\u0000\u0000\u0000\u0019\u001a\u0001\u0000\u0000"+
		"\u0000\u001a\u0018\u0001\u0000\u0000\u0000\u001a\u001b\u0001\u0000\u0000"+
		"\u0000\u001b\u0002\u0001\u0000\u0000\u0000\u001c\u001e\u0007\u0000\u0000"+
		"\u0000\u001d\u001c\u0001\u0000\u0000\u0000\u001e\u001f\u0001\u0000\u0000"+
		"\u0000\u001f\u001d\u0001\u0000\u0000\u0000\u001f \u0001\u0000\u0000\u0000"+
		" \u0004\u0001\u0000\u0000\u0000!\"\u0005\'\u0000\u0000\"#\b\u0001\u0000"+
		"\u0000#)\u0005\'\u0000\u0000$%\u0005\'\u0000\u0000%&\u0005\\\u0000\u0000"+
		"&\'\u0005n\u0000\u0000\')\u0005\'\u0000\u0000(!\u0001\u0000\u0000\u0000"+
		"($\u0001\u0000\u0000\u0000)\u0006\u0001\u0000\u0000\u0000*+\u0005/\u0000"+
		"\u0000+,\u0005/\u0000\u0000,0\u0001\u0000\u0000\u0000-/\t\u0000\u0000"+
		"\u0000.-\u0001\u0000\u0000\u0000/2\u0001\u0000\u0000\u000001\u0001\u0000"+
		"\u0000\u00000.\u0001\u0000\u0000\u000014\u0001\u0000\u0000\u000020\u0001"+
		"\u0000\u0000\u000035\u0007\u0002\u0000\u000043\u0001\u0000\u0000\u0000"+
		"56\u0001\u0000\u0000\u000067\u0006\u0003\u0000\u00007\b\u0001\u0000\u0000"+
		"\u000089\u0005/\u0000\u00009:\u0005*\u0000\u0000:>\u0001\u0000\u0000\u0000"+
		";=\t\u0000\u0000\u0000<;\u0001\u0000\u0000\u0000=@\u0001\u0000\u0000\u0000"+
		">?\u0001\u0000\u0000\u0000><\u0001\u0000\u0000\u0000?A\u0001\u0000\u0000"+
		"\u0000@>\u0001\u0000\u0000\u0000AB\u0005*\u0000\u0000BC\u0005/\u0000\u0000"+
		"CD\u0001\u0000\u0000\u0000DE\u0006\u0004\u0000\u0000E\n\u0001\u0000\u0000"+
		"\u0000FH\u0007\u0003\u0000\u0000GF\u0001\u0000\u0000\u0000HI\u0001\u0000"+
		"\u0000\u0000IG\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000JK\u0001"+
		"\u0000\u0000\u0000KL\u0006\u0005\u0000\u0000L\f\u0001\u0000\u0000\u0000"+
		"MN\u0005;\u0000\u0000NO\u0001\u0000\u0000\u0000OP\u0006\u0006\u0000\u0000"+
		"P\u000e\u0001\u0000\u0000\u0000QU\u0007\u0004\u0000\u0000RT\u0007\u0005"+
		"\u0000\u0000SR\u0001\u0000\u0000\u0000TW\u0001\u0000\u0000\u0000US\u0001"+
		"\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000V\u0010\u0001\u0000\u0000"+
		"\u0000WU\u0001\u0000\u0000\u0000\n\u0000\u0014\u001a\u001f(04>IU\u0001"+
		"\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}