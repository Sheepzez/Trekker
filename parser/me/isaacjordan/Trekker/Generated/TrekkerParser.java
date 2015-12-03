// Generated from Trekker.g4 by ANTLR 4.5.1
package me.isaacjordan.Trekker.Generated;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TrekkerParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, ID=5, LITERAL=6, SPACE=7, EOL=8, COMMENT=9, 
		LETTER=10, DIGIT=11, MAIN=12, RESISTANCE=13, THENEEDS=14, TOBOLDLYGO=15, 
		BEAMMEUP=16, DISMISSED=17, MAKEITSO=18, ENGAGE=19, SETPHASERS=20, WESSELS=21, 
		GIVINGHER=22, DOCTORNOTA=23, LIVELONG=24, TEA=25, GOODDAYTODIE=26;
	public static final int
		RULE_program = 0, RULE_func_end = 1, RULE_proc = 2, RULE_proc_decl = 3, 
		RULE_proc_end = 4, RULE_var_decl = 5, RULE_var_set = 6, RULE_array_decl = 7, 
		RULE_func_call = 8, RULE_seq_com = 9, RULE_command = 10, RULE_num_decl = 11;
	public static final String[] ruleNames = {
		"program", "func_end", "proc", "proc_decl", "proc_end", "var_decl", "var_set", 
		"array_decl", "func_call", "seq_com", "command", "num_decl"
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

	@Override
	public String getGrammarFileName() { return "Trekker.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TrekkerParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	 
		public ProgramContext() { }
		public void copyFrom(ProgramContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ProgContext extends ProgramContext {
		public List<ProcContext> proc() {
			return getRuleContexts(ProcContext.class);
		}
		public ProcContext proc(int i) {
			return getRuleContext(ProcContext.class,i);
		}
		public ProgContext(ProgramContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrekkerVisitor ) return ((TrekkerVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			_localctx = new ProgContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(25); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(24);
				proc();
				}
				}
				setState(27); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TOBOLDLYGO );
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

	public static class Func_endContext extends ParserRuleContext {
		public TerminalNode DISMISSED() { return getToken(TrekkerParser.DISMISSED, 0); }
		public Func_endContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_end; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrekkerVisitor ) return ((TrekkerVisitor<? extends T>)visitor).visitFunc_end(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_endContext func_end() throws RecognitionException {
		Func_endContext _localctx = new Func_endContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_func_end);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			match(DISMISSED);
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

	public static class ProcContext extends ParserRuleContext {
		public Proc_declContext proc_decl() {
			return getRuleContext(Proc_declContext.class,0);
		}
		public Seq_comContext seq_com() {
			return getRuleContext(Seq_comContext.class,0);
		}
		public Proc_endContext proc_end() {
			return getRuleContext(Proc_endContext.class,0);
		}
		public ProcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proc; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrekkerVisitor ) return ((TrekkerVisitor<? extends T>)visitor).visitProc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcContext proc() throws RecognitionException {
		ProcContext _localctx = new ProcContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_proc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			proc_decl();
			setState(32);
			seq_com();
			setState(33);
			proc_end();
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

	public static class Proc_declContext extends ParserRuleContext {
		public TerminalNode TOBOLDLYGO() { return getToken(TrekkerParser.TOBOLDLYGO, 0); }
		public TerminalNode ID() { return getToken(TrekkerParser.ID, 0); }
		public Proc_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proc_decl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrekkerVisitor ) return ((TrekkerVisitor<? extends T>)visitor).visitProc_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Proc_declContext proc_decl() throws RecognitionException {
		Proc_declContext _localctx = new Proc_declContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_proc_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			match(TOBOLDLYGO);
			setState(36);
			match(ID);
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

	public static class Proc_endContext extends ParserRuleContext {
		public TerminalNode BEAMMEUP() { return getToken(TrekkerParser.BEAMMEUP, 0); }
		public Proc_endContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proc_end; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrekkerVisitor ) return ((TrekkerVisitor<? extends T>)visitor).visitProc_end(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Proc_endContext proc_end() throws RecognitionException {
		Proc_endContext _localctx = new Proc_endContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_proc_end);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(BEAMMEUP);
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

	public static class Var_declContext extends ParserRuleContext {
		public TerminalNode RESISTANCE() { return getToken(TrekkerParser.RESISTANCE, 0); }
		public TerminalNode ID() { return getToken(TrekkerParser.ID, 0); }
		public Var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrekkerVisitor ) return ((TrekkerVisitor<? extends T>)visitor).visitVar_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_var_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(RESISTANCE);
			setState(41);
			match(ID);
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

	public static class Var_setContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(TrekkerParser.ID, 0); }
		public TerminalNode MAKEITSO() { return getToken(TrekkerParser.MAKEITSO, 0); }
		public TerminalNode LITERAL() { return getToken(TrekkerParser.LITERAL, 0); }
		public Var_setContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_set; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrekkerVisitor ) return ((TrekkerVisitor<? extends T>)visitor).visitVar_set(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_setContext var_set() throws RecognitionException {
		Var_setContext _localctx = new Var_setContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_var_set);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			match(ID);
			setState(44);
			match(MAKEITSO);
			setState(45);
			match(LITERAL);
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

	public static class Array_declContext extends ParserRuleContext {
		public TerminalNode THENEEDS() { return getToken(TrekkerParser.THENEEDS, 0); }
		public Array_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_decl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrekkerVisitor ) return ((TrekkerVisitor<? extends T>)visitor).visitArray_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_declContext array_decl() throws RecognitionException {
		Array_declContext _localctx = new Array_declContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_array_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(THENEEDS);
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

	public static class Func_callContext extends ParserRuleContext {
		public TerminalNode ENGAGE() { return getToken(TrekkerParser.ENGAGE, 0); }
		public TerminalNode ID() { return getToken(TrekkerParser.ID, 0); }
		public Func_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_call; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrekkerVisitor ) return ((TrekkerVisitor<? extends T>)visitor).visitFunc_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_callContext func_call() throws RecognitionException {
		Func_callContext _localctx = new Func_callContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_func_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(ENGAGE);
			setState(50);
			match(ID);
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

	public static class Seq_comContext extends ParserRuleContext {
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public Seq_comContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_seq_com; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrekkerVisitor ) return ((TrekkerVisitor<? extends T>)visitor).visitSeq_com(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Seq_comContext seq_com() throws RecognitionException {
		Seq_comContext _localctx = new Seq_comContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_seq_com);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(52);
				command();
				}
				}
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class CommandContext extends ParserRuleContext {
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrekkerVisitor ) return ((TrekkerVisitor<? extends T>)visitor).visitCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_command);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(T__0);
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

	public static class Num_declContext extends ParserRuleContext {
		public Num_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num_decl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrekkerVisitor ) return ((TrekkerVisitor<? extends T>)visitor).visitNum_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Num_declContext num_decl() throws RecognitionException {
		Num_declContext _localctx = new Num_declContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_num_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(60);
			match(T__1);
			setState(62); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(61);
				match(T__2);
				}
				}
				setState(64); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__2 );
			setState(67); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(66);
				match(T__3);
				}
				}
				setState(69); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__3 );
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\34J\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\3\2\6\2\34\n\2\r\2\16\2\35\3\3\3\3\3\4\3\4\3\4\3\4\3\5"+
		"\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\13"+
		"\7\138\n\13\f\13\16\13;\13\13\3\f\3\f\3\r\3\r\6\rA\n\r\r\r\16\rB\3\r\6"+
		"\rF\n\r\r\r\16\rG\3\r\2\2\16\2\4\6\b\n\f\16\20\22\24\26\30\2\2A\2\33\3"+
		"\2\2\2\4\37\3\2\2\2\6!\3\2\2\2\b%\3\2\2\2\n(\3\2\2\2\f*\3\2\2\2\16-\3"+
		"\2\2\2\20\61\3\2\2\2\22\63\3\2\2\2\249\3\2\2\2\26<\3\2\2\2\30>\3\2\2\2"+
		"\32\34\5\6\4\2\33\32\3\2\2\2\34\35\3\2\2\2\35\33\3\2\2\2\35\36\3\2\2\2"+
		"\36\3\3\2\2\2\37 \7\23\2\2 \5\3\2\2\2!\"\5\b\5\2\"#\5\24\13\2#$\5\n\6"+
		"\2$\7\3\2\2\2%&\7\21\2\2&\'\7\7\2\2\'\t\3\2\2\2()\7\22\2\2)\13\3\2\2\2"+
		"*+\7\17\2\2+,\7\7\2\2,\r\3\2\2\2-.\7\7\2\2./\7\24\2\2/\60\7\b\2\2\60\17"+
		"\3\2\2\2\61\62\7\20\2\2\62\21\3\2\2\2\63\64\7\25\2\2\64\65\7\7\2\2\65"+
		"\23\3\2\2\2\668\5\26\f\2\67\66\3\2\2\28;\3\2\2\29\67\3\2\2\29:\3\2\2\2"+
		":\25\3\2\2\2;9\3\2\2\2<=\7\3\2\2=\27\3\2\2\2>@\7\4\2\2?A\7\5\2\2@?\3\2"+
		"\2\2AB\3\2\2\2B@\3\2\2\2BC\3\2\2\2CE\3\2\2\2DF\7\6\2\2ED\3\2\2\2FG\3\2"+
		"\2\2GE\3\2\2\2GH\3\2\2\2H\31\3\2\2\2\6\359BG";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}