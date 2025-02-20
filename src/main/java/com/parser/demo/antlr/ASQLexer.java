// Generated from ASQ.g4 by ANTLR 4.13.2
package com.parser.demo.antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class ASQLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, SELECT=13, FROM=14, WHERE=15, CONTAINS=16, 
		IN=17, NOT=18, AND=19, OR=20, IDENTIFIER=21, NUMBER=22, STRING=23, WS=24;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "SELECT", "FROM", "WHERE", "CONTAINS", "IN", 
			"NOT", "AND", "OR", "IDENTIFIER", "NUMBER", "STRING", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'*'", "','", "'('", "')'", "'='", "'!='", "'<'", "'>'", "'<='", 
			"'>='", "'%%'", "'@@'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "SELECT", "FROM", "WHERE", "CONTAINS", "IN", "NOT", "AND", "OR", 
			"IDENTIFIER", "NUMBER", "STRING", "WS"
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


	public ASQLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ASQ.g4"; }

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
		"\u0004\u0000\u0018\u0095\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0005\u0014"+
		"z\b\u0014\n\u0014\f\u0014}\t\u0014\u0001\u0015\u0004\u0015\u0080\b\u0015"+
		"\u000b\u0015\f\u0015\u0081\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0005\u0016\u0088\b\u0016\n\u0016\f\u0016\u008b\t\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0017\u0004\u0017\u0090\b\u0017\u000b\u0017\f\u0017\u0091"+
		"\u0001\u0017\u0001\u0017\u0000\u0000\u0018\u0001\u0001\u0003\u0002\u0005"+
		"\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n"+
		"\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011"+
		"#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/\u0018\u0001\u0000\u0014\u0002"+
		"\u0000SSss\u0002\u0000EEee\u0002\u0000LLll\u0002\u0000CCcc\u0002\u0000"+
		"TTtt\u0002\u0000FFff\u0002\u0000RRrr\u0002\u0000OOoo\u0002\u0000MMmm\u0002"+
		"\u0000WWww\u0002\u0000HHhh\u0002\u0000NNnn\u0002\u0000AAaa\u0002\u0000"+
		"IIii\u0002\u0000DDdd\u0003\u0000AZ__az\u0005\u0000..09AZ__az\u0001\u0000"+
		"09\u0002\u0000\'\'\\\\\u0003\u0000\t\n\r\r  \u0099\u0000\u0001\u0001\u0000"+
		"\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000"+
		"\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000"+
		"\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000"+
		"\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000"+
		"\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000"+
		"\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000"+
		"\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000"+
		"\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000"+
		"#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001"+
		"\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000"+
		"\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u0001"+
		"1\u0001\u0000\u0000\u0000\u00033\u0001\u0000\u0000\u0000\u00055\u0001"+
		"\u0000\u0000\u0000\u00077\u0001\u0000\u0000\u0000\t9\u0001\u0000\u0000"+
		"\u0000\u000b;\u0001\u0000\u0000\u0000\r>\u0001\u0000\u0000\u0000\u000f"+
		"@\u0001\u0000\u0000\u0000\u0011B\u0001\u0000\u0000\u0000\u0013E\u0001"+
		"\u0000\u0000\u0000\u0015H\u0001\u0000\u0000\u0000\u0017K\u0001\u0000\u0000"+
		"\u0000\u0019N\u0001\u0000\u0000\u0000\u001bU\u0001\u0000\u0000\u0000\u001d"+
		"Z\u0001\u0000\u0000\u0000\u001f`\u0001\u0000\u0000\u0000!i\u0001\u0000"+
		"\u0000\u0000#l\u0001\u0000\u0000\u0000%p\u0001\u0000\u0000\u0000\'t\u0001"+
		"\u0000\u0000\u0000)w\u0001\u0000\u0000\u0000+\u007f\u0001\u0000\u0000"+
		"\u0000-\u0083\u0001\u0000\u0000\u0000/\u008f\u0001\u0000\u0000\u00001"+
		"2\u0005*\u0000\u00002\u0002\u0001\u0000\u0000\u000034\u0005,\u0000\u0000"+
		"4\u0004\u0001\u0000\u0000\u000056\u0005(\u0000\u00006\u0006\u0001\u0000"+
		"\u0000\u000078\u0005)\u0000\u00008\b\u0001\u0000\u0000\u00009:\u0005="+
		"\u0000\u0000:\n\u0001\u0000\u0000\u0000;<\u0005!\u0000\u0000<=\u0005="+
		"\u0000\u0000=\f\u0001\u0000\u0000\u0000>?\u0005<\u0000\u0000?\u000e\u0001"+
		"\u0000\u0000\u0000@A\u0005>\u0000\u0000A\u0010\u0001\u0000\u0000\u0000"+
		"BC\u0005<\u0000\u0000CD\u0005=\u0000\u0000D\u0012\u0001\u0000\u0000\u0000"+
		"EF\u0005>\u0000\u0000FG\u0005=\u0000\u0000G\u0014\u0001\u0000\u0000\u0000"+
		"HI\u0005%\u0000\u0000IJ\u0005%\u0000\u0000J\u0016\u0001\u0000\u0000\u0000"+
		"KL\u0005@\u0000\u0000LM\u0005@\u0000\u0000M\u0018\u0001\u0000\u0000\u0000"+
		"NO\u0007\u0000\u0000\u0000OP\u0007\u0001\u0000\u0000PQ\u0007\u0002\u0000"+
		"\u0000QR\u0007\u0001\u0000\u0000RS\u0007\u0003\u0000\u0000ST\u0007\u0004"+
		"\u0000\u0000T\u001a\u0001\u0000\u0000\u0000UV\u0007\u0005\u0000\u0000"+
		"VW\u0007\u0006\u0000\u0000WX\u0007\u0007\u0000\u0000XY\u0007\b\u0000\u0000"+
		"Y\u001c\u0001\u0000\u0000\u0000Z[\u0007\t\u0000\u0000[\\\u0007\n\u0000"+
		"\u0000\\]\u0007\u0001\u0000\u0000]^\u0007\u0006\u0000\u0000^_\u0007\u0001"+
		"\u0000\u0000_\u001e\u0001\u0000\u0000\u0000`a\u0007\u0003\u0000\u0000"+
		"ab\u0007\u0007\u0000\u0000bc\u0007\u000b\u0000\u0000cd\u0007\u0004\u0000"+
		"\u0000de\u0007\f\u0000\u0000ef\u0007\r\u0000\u0000fg\u0007\u000b\u0000"+
		"\u0000gh\u0007\u0000\u0000\u0000h \u0001\u0000\u0000\u0000ij\u0007\r\u0000"+
		"\u0000jk\u0007\u000b\u0000\u0000k\"\u0001\u0000\u0000\u0000lm\u0007\u000b"+
		"\u0000\u0000mn\u0007\u0007\u0000\u0000no\u0007\u0004\u0000\u0000o$\u0001"+
		"\u0000\u0000\u0000pq\u0007\f\u0000\u0000qr\u0007\u000b\u0000\u0000rs\u0007"+
		"\u000e\u0000\u0000s&\u0001\u0000\u0000\u0000tu\u0007\u0007\u0000\u0000"+
		"uv\u0007\u0006\u0000\u0000v(\u0001\u0000\u0000\u0000w{\u0007\u000f\u0000"+
		"\u0000xz\u0007\u0010\u0000\u0000yx\u0001\u0000\u0000\u0000z}\u0001\u0000"+
		"\u0000\u0000{y\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000|*\u0001"+
		"\u0000\u0000\u0000}{\u0001\u0000\u0000\u0000~\u0080\u0007\u0011\u0000"+
		"\u0000\u007f~\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000"+
		"\u0081\u007f\u0001\u0000\u0000\u0000\u0081\u0082\u0001\u0000\u0000\u0000"+
		"\u0082,\u0001\u0000\u0000\u0000\u0083\u0089\u0005\'\u0000\u0000\u0084"+
		"\u0088\b\u0012\u0000\u0000\u0085\u0086\u0005\\\u0000\u0000\u0086\u0088"+
		"\t\u0000\u0000\u0000\u0087\u0084\u0001\u0000\u0000\u0000\u0087\u0085\u0001"+
		"\u0000\u0000\u0000\u0088\u008b\u0001\u0000\u0000\u0000\u0089\u0087\u0001"+
		"\u0000\u0000\u0000\u0089\u008a\u0001\u0000\u0000\u0000\u008a\u008c\u0001"+
		"\u0000\u0000\u0000\u008b\u0089\u0001\u0000\u0000\u0000\u008c\u008d\u0005"+
		"\'\u0000\u0000\u008d.\u0001\u0000\u0000\u0000\u008e\u0090\u0007\u0013"+
		"\u0000\u0000\u008f\u008e\u0001\u0000\u0000\u0000\u0090\u0091\u0001\u0000"+
		"\u0000\u0000\u0091\u008f\u0001\u0000\u0000\u0000\u0091\u0092\u0001\u0000"+
		"\u0000\u0000\u0092\u0093\u0001\u0000\u0000\u0000\u0093\u0094\u0006\u0017"+
		"\u0000\u0000\u00940\u0001\u0000\u0000\u0000\u0006\u0000{\u0081\u0087\u0089"+
		"\u0091\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}