// Generated from Trekker.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TrekkerLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, SPACE=4, EOL=5, COMMENT=6;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "SPACE", "EOL", "COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'var'", "'function'", "'function main'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, "SPACE", "EOL", "COMMENT"
	};
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


	public TrekkerLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Trekker.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\bF\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\5\6\5,\n\5\r\5\16\5-\3\5\3\5\3\6\5\6\63\n\6\3\6\3\6\3\6\3\6\3"+
		"\7\3\7\7\7;\n\7\f\7\16\7>\13\7\3\7\5\7A\n\7\3\7\3\7\3\7\3\7\2\2\b\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\3\2\4\4\2\13\13\"\"\4\2\f\f\17\17I\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\3\17\3\2\2"+
		"\2\5\23\3\2\2\2\7\34\3\2\2\2\t+\3\2\2\2\13\62\3\2\2\2\r8\3\2\2\2\17\20"+
		"\7x\2\2\20\21\7c\2\2\21\22\7t\2\2\22\4\3\2\2\2\23\24\7h\2\2\24\25\7w\2"+
		"\2\25\26\7p\2\2\26\27\7e\2\2\27\30\7v\2\2\30\31\7k\2\2\31\32\7q\2\2\32"+
		"\33\7p\2\2\33\6\3\2\2\2\34\35\7h\2\2\35\36\7w\2\2\36\37\7p\2\2\37 \7e"+
		"\2\2 !\7v\2\2!\"\7k\2\2\"#\7q\2\2#$\7p\2\2$%\7\"\2\2%&\7o\2\2&\'\7c\2"+
		"\2\'(\7k\2\2()\7p\2\2)\b\3\2\2\2*,\t\2\2\2+*\3\2\2\2,-\3\2\2\2-+\3\2\2"+
		"\2-.\3\2\2\2./\3\2\2\2/\60\b\5\2\2\60\n\3\2\2\2\61\63\7\17\2\2\62\61\3"+
		"\2\2\2\62\63\3\2\2\2\63\64\3\2\2\2\64\65\7\f\2\2\65\66\3\2\2\2\66\67\b"+
		"\6\2\2\67\f\3\2\2\28<\7%\2\29;\n\3\2\2:9\3\2\2\2;>\3\2\2\2<:\3\2\2\2<"+
		"=\3\2\2\2=@\3\2\2\2><\3\2\2\2?A\7\17\2\2@?\3\2\2\2@A\3\2\2\2AB\3\2\2\2"+
		"BC\7\f\2\2CD\3\2\2\2DE\b\7\2\2E\16\3\2\2\2\7\2-\62<@\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}