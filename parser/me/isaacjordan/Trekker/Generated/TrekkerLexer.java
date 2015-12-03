// Generated from Trekker.g4 by ANTLR 4.5.1
package me.isaacjordan.Trekker.Generated;
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
		T__0=1, T__1=2, T__2=3, T__3=4, ID=5, LITERAL=6, SPACE=7, EOL=8, COMMENT=9, 
		LETTER=10, DIGIT=11, MAIN=12, RESISTANCE=13, THENEEDS=14, TOBOLDLYGO=15, 
		BEAMMEUP=16, DISMISSED=17, MAKEITSO=18, ENGAGE=19, SETPHASERS=20, WESSELS=21, 
		GIVINGHER=22, DOCTORNOTA=23, LIVELONG=24, TEA=25, GOODDAYTODIE=26;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "ID", "LITERAL", "SPACE", "EOL", "COMMENT", 
		"LETTER", "DIGIT", "MAIN", "RESISTANCE", "THENEEDS", "TOBOLDLYGO", "BEAMMEUP", 
		"DISMISSED", "MAKEITSO", "ENGAGE", "SETPHASERS", "WESSELS", "GIVINGHER", 
		"DOCTORNOTA", "LIVELONG", "TEA", "GOODDAYTODIE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'example-command'", "'KH'", "'A'", "'N'", null, null, null, null, 
		null, null, null, "'main'", "'Resistance Is'", "'The Needs Of The Many Outweigh The Needs Of The Few'", 
		"'To Boldly Go'", "'Beam Me Up, Scotty'", "'Dismissed'", "'Make It So'", 
		"'Engage'", "'Set Phasers To Stun'", "'Nuclear Wessels'", "'Im Giving Her All Shes Got, Captain!'", 
		"'Im A Doctor, Not A...'", "'Live Long and Prosper'", "'Tea. Earl Grey. Hot.'", 
		"'Today is a good day to die'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, "ID", "LITERAL", "SPACE", "EOL", "COMMENT", 
		"LETTER", "DIGIT", "MAIN", "RESISTANCE", "THENEEDS", "TOBOLDLYGO", "BEAMMEUP", 
		"DISMISSED", "MAKEITSO", "ENGAGE", "SETPHASERS", "WESSELS", "GIVINGHER", 
		"DOCTORNOTA", "LIVELONG", "TEA", "GOODDAYTODIE"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\34\u01aa\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\7\6R\n\6"+
		"\f\6\16\6U\13\6\3\7\6\7X\n\7\r\7\16\7Y\3\7\6\7]\n\7\r\7\16\7^\5\7a\n\7"+
		"\3\b\6\bd\n\b\r\b\16\be\3\b\3\b\3\t\5\tk\n\t\3\t\3\t\3\t\3\t\3\n\3\n\7"+
		"\ns\n\n\f\n\16\nv\13\n\3\n\5\ny\n\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f"+
		"\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\2\2\34\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34"+
		"\3\2\5\4\2\13\13\"\"\4\2\f\f\17\17\4\2C\\c|\u01b2\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\3\67\3\2\2\2\5G\3\2\2\2\7J\3\2\2\2\tL\3\2\2\2\13N"+
		"\3\2\2\2\r`\3\2\2\2\17c\3\2\2\2\21j\3\2\2\2\23p\3\2\2\2\25~\3\2\2\2\27"+
		"\u0080\3\2\2\2\31\u0082\3\2\2\2\33\u0087\3\2\2\2\35\u0095\3\2\2\2\37\u00c9"+
		"\3\2\2\2!\u00d6\3\2\2\2#\u00e9\3\2\2\2%\u00f3\3\2\2\2\'\u00fe\3\2\2\2"+
		")\u0105\3\2\2\2+\u0119\3\2\2\2-\u0129\3\2\2\2/\u014e\3\2\2\2\61\u0164"+
		"\3\2\2\2\63\u017a\3\2\2\2\65\u018f\3\2\2\2\678\7g\2\289\7z\2\29:\7c\2"+
		"\2:;\7o\2\2;<\7r\2\2<=\7n\2\2=>\7g\2\2>?\7/\2\2?@\7e\2\2@A\7q\2\2AB\7"+
		"o\2\2BC\7o\2\2CD\7c\2\2DE\7p\2\2EF\7f\2\2F\4\3\2\2\2GH\7M\2\2HI\7J\2\2"+
		"I\6\3\2\2\2JK\7C\2\2K\b\3\2\2\2LM\7P\2\2M\n\3\2\2\2NS\5\25\13\2OR\5\25"+
		"\13\2PR\5\27\f\2QO\3\2\2\2QP\3\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2T\f"+
		"\3\2\2\2US\3\2\2\2VX\5\25\13\2WV\3\2\2\2XY\3\2\2\2YW\3\2\2\2YZ\3\2\2\2"+
		"Za\3\2\2\2[]\5\27\f\2\\[\3\2\2\2]^\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_a\3\2"+
		"\2\2`W\3\2\2\2`\\\3\2\2\2a\16\3\2\2\2bd\t\2\2\2cb\3\2\2\2de\3\2\2\2ec"+
		"\3\2\2\2ef\3\2\2\2fg\3\2\2\2gh\b\b\2\2h\20\3\2\2\2ik\7\17\2\2ji\3\2\2"+
		"\2jk\3\2\2\2kl\3\2\2\2lm\7\f\2\2mn\3\2\2\2no\b\t\2\2o\22\3\2\2\2pt\7%"+
		"\2\2qs\n\3\2\2rq\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2ux\3\2\2\2vt\3\2"+
		"\2\2wy\7\17\2\2xw\3\2\2\2xy\3\2\2\2yz\3\2\2\2z{\7\f\2\2{|\3\2\2\2|}\b"+
		"\n\2\2}\24\3\2\2\2~\177\t\4\2\2\177\26\3\2\2\2\u0080\u0081\4\62;\2\u0081"+
		"\30\3\2\2\2\u0082\u0083\7o\2\2\u0083\u0084\7c\2\2\u0084\u0085\7k\2\2\u0085"+
		"\u0086\7p\2\2\u0086\32\3\2\2\2\u0087\u0088\7T\2\2\u0088\u0089\7g\2\2\u0089"+
		"\u008a\7u\2\2\u008a\u008b\7k\2\2\u008b\u008c\7u\2\2\u008c\u008d\7v\2\2"+
		"\u008d\u008e\7c\2\2\u008e\u008f\7p\2\2\u008f\u0090\7e\2\2\u0090\u0091"+
		"\7g\2\2\u0091\u0092\7\"\2\2\u0092\u0093\7K\2\2\u0093\u0094\7u\2\2\u0094"+
		"\34\3\2\2\2\u0095\u0096\7V\2\2\u0096\u0097\7j\2\2\u0097\u0098\7g\2\2\u0098"+
		"\u0099\7\"\2\2\u0099\u009a\7P\2\2\u009a\u009b\7g\2\2\u009b\u009c\7g\2"+
		"\2\u009c\u009d\7f\2\2\u009d\u009e\7u\2\2\u009e\u009f\7\"\2\2\u009f\u00a0"+
		"\7Q\2\2\u00a0\u00a1\7h\2\2\u00a1\u00a2\7\"\2\2\u00a2\u00a3\7V\2\2\u00a3"+
		"\u00a4\7j\2\2\u00a4\u00a5\7g\2\2\u00a5\u00a6\7\"\2\2\u00a6\u00a7\7O\2"+
		"\2\u00a7\u00a8\7c\2\2\u00a8\u00a9\7p\2\2\u00a9\u00aa\7{\2\2\u00aa\u00ab"+
		"\7\"\2\2\u00ab\u00ac\7Q\2\2\u00ac\u00ad\7w\2\2\u00ad\u00ae\7v\2\2\u00ae"+
		"\u00af\7y\2\2\u00af\u00b0\7g\2\2\u00b0\u00b1\7k\2\2\u00b1\u00b2\7i\2\2"+
		"\u00b2\u00b3\7j\2\2\u00b3\u00b4\7\"\2\2\u00b4\u00b5\7V\2\2\u00b5\u00b6"+
		"\7j\2\2\u00b6\u00b7\7g\2\2\u00b7\u00b8\7\"\2\2\u00b8\u00b9\7P\2\2\u00b9"+
		"\u00ba\7g\2\2\u00ba\u00bb\7g\2\2\u00bb\u00bc\7f\2\2\u00bc\u00bd\7u\2\2"+
		"\u00bd\u00be\7\"\2\2\u00be\u00bf\7Q\2\2\u00bf\u00c0\7h\2\2\u00c0\u00c1"+
		"\7\"\2\2\u00c1\u00c2\7V\2\2\u00c2\u00c3\7j\2\2\u00c3\u00c4\7g\2\2\u00c4"+
		"\u00c5\7\"\2\2\u00c5\u00c6\7H\2\2\u00c6\u00c7\7g\2\2\u00c7\u00c8\7y\2"+
		"\2\u00c8\36\3\2\2\2\u00c9\u00ca\7V\2\2\u00ca\u00cb\7q\2\2\u00cb\u00cc"+
		"\7\"\2\2\u00cc\u00cd\7D\2\2\u00cd\u00ce\7q\2\2\u00ce\u00cf\7n\2\2\u00cf"+
		"\u00d0\7f\2\2\u00d0\u00d1\7n\2\2\u00d1\u00d2\7{\2\2\u00d2\u00d3\7\"\2"+
		"\2\u00d3\u00d4\7I\2\2\u00d4\u00d5\7q\2\2\u00d5 \3\2\2\2\u00d6\u00d7\7"+
		"D\2\2\u00d7\u00d8\7g\2\2\u00d8\u00d9\7c\2\2\u00d9\u00da\7o\2\2\u00da\u00db"+
		"\7\"\2\2\u00db\u00dc\7O\2\2\u00dc\u00dd\7g\2\2\u00dd\u00de\7\"\2\2\u00de"+
		"\u00df\7W\2\2\u00df\u00e0\7r\2\2\u00e0\u00e1\7.\2\2\u00e1\u00e2\7\"\2"+
		"\2\u00e2\u00e3\7U\2\2\u00e3\u00e4\7e\2\2\u00e4\u00e5\7q\2\2\u00e5\u00e6"+
		"\7v\2\2\u00e6\u00e7\7v\2\2\u00e7\u00e8\7{\2\2\u00e8\"\3\2\2\2\u00e9\u00ea"+
		"\7F\2\2\u00ea\u00eb\7k\2\2\u00eb\u00ec\7u\2\2\u00ec\u00ed\7o\2\2\u00ed"+
		"\u00ee\7k\2\2\u00ee\u00ef\7u\2\2\u00ef\u00f0\7u\2\2\u00f0\u00f1\7g\2\2"+
		"\u00f1\u00f2\7f\2\2\u00f2$\3\2\2\2\u00f3\u00f4\7O\2\2\u00f4\u00f5\7c\2"+
		"\2\u00f5\u00f6\7m\2\2\u00f6\u00f7\7g\2\2\u00f7\u00f8\7\"\2\2\u00f8\u00f9"+
		"\7K\2\2\u00f9\u00fa\7v\2\2\u00fa\u00fb\7\"\2\2\u00fb\u00fc\7U\2\2\u00fc"+
		"\u00fd\7q\2\2\u00fd&\3\2\2\2\u00fe\u00ff\7G\2\2\u00ff\u0100\7p\2\2\u0100"+
		"\u0101\7i\2\2\u0101\u0102\7c\2\2\u0102\u0103\7i\2\2\u0103\u0104\7g\2\2"+
		"\u0104(\3\2\2\2\u0105\u0106\7U\2\2\u0106\u0107\7g\2\2\u0107\u0108\7v\2"+
		"\2\u0108\u0109\7\"\2\2\u0109\u010a\7R\2\2\u010a\u010b\7j\2\2\u010b\u010c"+
		"\7c\2\2\u010c\u010d\7u\2\2\u010d\u010e\7g\2\2\u010e\u010f\7t\2\2\u010f"+
		"\u0110\7u\2\2\u0110\u0111\7\"\2\2\u0111\u0112\7V\2\2\u0112\u0113\7q\2"+
		"\2\u0113\u0114\7\"\2\2\u0114\u0115\7U\2\2\u0115\u0116\7v\2\2\u0116\u0117"+
		"\7w\2\2\u0117\u0118\7p\2\2\u0118*\3\2\2\2\u0119\u011a\7P\2\2\u011a\u011b"+
		"\7w\2\2\u011b\u011c\7e\2\2\u011c\u011d\7n\2\2\u011d\u011e\7g\2\2\u011e"+
		"\u011f\7c\2\2\u011f\u0120\7t\2\2\u0120\u0121\7\"\2\2\u0121\u0122\7Y\2"+
		"\2\u0122\u0123\7g\2\2\u0123\u0124\7u\2\2\u0124\u0125\7u\2\2\u0125\u0126"+
		"\7g\2\2\u0126\u0127\7n\2\2\u0127\u0128\7u\2\2\u0128,\3\2\2\2\u0129\u012a"+
		"\7K\2\2\u012a\u012b\7o\2\2\u012b\u012c\7\"\2\2\u012c\u012d\7I\2\2\u012d"+
		"\u012e\7k\2\2\u012e\u012f\7x\2\2\u012f\u0130\7k\2\2\u0130\u0131\7p\2\2"+
		"\u0131\u0132\7i\2\2\u0132\u0133\7\"\2\2\u0133\u0134\7J\2\2\u0134\u0135"+
		"\7g\2\2\u0135\u0136\7t\2\2\u0136\u0137\7\"\2\2\u0137\u0138\7C\2\2\u0138"+
		"\u0139\7n\2\2\u0139\u013a\7n\2\2\u013a\u013b\7\"\2\2\u013b\u013c\7U\2"+
		"\2\u013c\u013d\7j\2\2\u013d\u013e\7g\2\2\u013e\u013f\7u\2\2\u013f\u0140"+
		"\7\"\2\2\u0140\u0141\7I\2\2\u0141\u0142\7q\2\2\u0142\u0143\7v\2\2\u0143"+
		"\u0144\7.\2\2\u0144\u0145\7\"\2\2\u0145\u0146\7E\2\2\u0146\u0147\7c\2"+
		"\2\u0147\u0148\7r\2\2\u0148\u0149\7v\2\2\u0149\u014a\7c\2\2\u014a\u014b"+
		"\7k\2\2\u014b\u014c\7p\2\2\u014c\u014d\7#\2\2\u014d.\3\2\2\2\u014e\u014f"+
		"\7K\2\2\u014f\u0150\7o\2\2\u0150\u0151\7\"\2\2\u0151\u0152\7C\2\2\u0152"+
		"\u0153\7\"\2\2\u0153\u0154\7F\2\2\u0154\u0155\7q\2\2\u0155\u0156\7e\2"+
		"\2\u0156\u0157\7v\2\2\u0157\u0158\7q\2\2\u0158\u0159\7t\2\2\u0159\u015a"+
		"\7.\2\2\u015a\u015b\7\"\2\2\u015b\u015c\7P\2\2\u015c\u015d\7q\2\2\u015d"+
		"\u015e\7v\2\2\u015e\u015f\7\"\2\2\u015f\u0160\7C\2\2\u0160\u0161\7\60"+
		"\2\2\u0161\u0162\7\60\2\2\u0162\u0163\7\60\2\2\u0163\60\3\2\2\2\u0164"+
		"\u0165\7N\2\2\u0165\u0166\7k\2\2\u0166\u0167\7x\2\2\u0167\u0168\7g\2\2"+
		"\u0168\u0169\7\"\2\2\u0169\u016a\7N\2\2\u016a\u016b\7q\2\2\u016b\u016c"+
		"\7p\2\2\u016c\u016d\7i\2\2\u016d\u016e\7\"\2\2\u016e\u016f\7c\2\2\u016f"+
		"\u0170\7p\2\2\u0170\u0171\7f\2\2\u0171\u0172\7\"\2\2\u0172\u0173\7R\2"+
		"\2\u0173\u0174\7t\2\2\u0174\u0175\7q\2\2\u0175\u0176\7u\2\2\u0176\u0177"+
		"\7r\2\2\u0177\u0178\7g\2\2\u0178\u0179\7t\2\2\u0179\62\3\2\2\2\u017a\u017b"+
		"\7V\2\2\u017b\u017c\7g\2\2\u017c\u017d\7c\2\2\u017d\u017e\7\60\2\2\u017e"+
		"\u017f\7\"\2\2\u017f\u0180\7G\2\2\u0180\u0181\7c\2\2\u0181\u0182\7t\2"+
		"\2\u0182\u0183\7n\2\2\u0183\u0184\7\"\2\2\u0184\u0185\7I\2\2\u0185\u0186"+
		"\7t\2\2\u0186\u0187\7g\2\2\u0187\u0188\7{\2\2\u0188\u0189\7\60\2\2\u0189"+
		"\u018a\7\"\2\2\u018a\u018b\7J\2\2\u018b\u018c\7q\2\2\u018c\u018d\7v\2"+
		"\2\u018d\u018e\7\60\2\2\u018e\64\3\2\2\2\u018f\u0190\7V\2\2\u0190\u0191"+
		"\7q\2\2\u0191\u0192\7f\2\2\u0192\u0193\7c\2\2\u0193\u0194\7{\2\2\u0194"+
		"\u0195\7\"\2\2\u0195\u0196\7k\2\2\u0196\u0197\7u\2\2\u0197\u0198\7\"\2"+
		"\2\u0198\u0199\7c\2\2\u0199\u019a\7\"\2\2\u019a\u019b\7i\2\2\u019b\u019c"+
		"\7q\2\2\u019c\u019d\7q\2\2\u019d\u019e\7f\2\2\u019e\u019f\7\"\2\2\u019f"+
		"\u01a0\7f\2\2\u01a0\u01a1\7c\2\2\u01a1\u01a2\7{\2\2\u01a2\u01a3\7\"\2"+
		"\2\u01a3\u01a4\7v\2\2\u01a4\u01a5\7q\2\2\u01a5\u01a6\7\"\2\2\u01a6\u01a7"+
		"\7f\2\2\u01a7\u01a8\7k\2\2\u01a8\u01a9\7g\2\2\u01a9\66\3\2\2\2\f\2QSY"+
		"^`ejtx\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}