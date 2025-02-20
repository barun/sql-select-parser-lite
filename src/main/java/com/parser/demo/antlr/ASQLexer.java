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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, SELECT=15, FROM=16, WHERE=17, 
		CONTAINS=18, IN=19, NOT=20, AND=21, OR=22, IDENTIFIER=23, NUMBER=24, STRING=25, 
		WS=26;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "SELECT", "FROM", "WHERE", 
			"CONTAINS", "IN", "NOT", "AND", "OR", "IDENTIFIER", "NUMBER", "STRING", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'*'", "','", "'('", "')'", "'='", "'!='", "'<'", "'>'", "'<='", 
			"'>='", "'LIKE'", "'NOT LIKE'", "'%%'", "'@@'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "SELECT", "FROM", "WHERE", "CONTAINS", "IN", "NOT", 
			"AND", "OR", "IDENTIFIER", "NUMBER", "STRING", "WS"
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
		"\u0004\u0000\u001a\u00a7\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016"+
		"\u0005\u0016\u008c\b\u0016\n\u0016\f\u0016\u008f\t\u0016\u0001\u0017\u0004"+
		"\u0017\u0092\b\u0017\u000b\u0017\f\u0017\u0093\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0005\u0018\u009a\b\u0018\n\u0018\f\u0018\u009d"+
		"\t\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0004\u0019\u00a2\b\u0019"+
		"\u000b\u0019\f\u0019\u00a3\u0001\u0019\u0001\u0019\u0000\u0000\u001a\u0001"+
		"\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007"+
		"\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d"+
		"\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/"+
		"\u00181\u00193\u001a\u0001\u0000\u0014\u0002\u0000SSss\u0002\u0000EEe"+
		"e\u0002\u0000LLll\u0002\u0000CCcc\u0002\u0000TTtt\u0002\u0000FFff\u0002"+
		"\u0000RRrr\u0002\u0000OOoo\u0002\u0000MMmm\u0002\u0000WWww\u0002\u0000"+
		"HHhh\u0002\u0000NNnn\u0002\u0000AAaa\u0002\u0000IIii\u0002\u0000DDdd\u0003"+
		"\u0000AZ__az\u0005\u0000..09AZ__az\u0001\u000009\u0002\u0000\'\'\\\\\u0003"+
		"\u0000\t\n\r\r  \u00ab\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003"+
		"\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007"+
		"\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001"+
		"\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000"+
		"\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000"+
		"\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000"+
		"\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000"+
		"\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000"+
		"\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000"+
		"\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000"+
		")\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001"+
		"\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000"+
		"\u0000\u00003\u0001\u0000\u0000\u0000\u00015\u0001\u0000\u0000\u0000\u0003"+
		"7\u0001\u0000\u0000\u0000\u00059\u0001\u0000\u0000\u0000\u0007;\u0001"+
		"\u0000\u0000\u0000\t=\u0001\u0000\u0000\u0000\u000b?\u0001\u0000\u0000"+
		"\u0000\rB\u0001\u0000\u0000\u0000\u000fD\u0001\u0000\u0000\u0000\u0011"+
		"F\u0001\u0000\u0000\u0000\u0013I\u0001\u0000\u0000\u0000\u0015L\u0001"+
		"\u0000\u0000\u0000\u0017Q\u0001\u0000\u0000\u0000\u0019Z\u0001\u0000\u0000"+
		"\u0000\u001b]\u0001\u0000\u0000\u0000\u001d`\u0001\u0000\u0000\u0000\u001f"+
		"g\u0001\u0000\u0000\u0000!l\u0001\u0000\u0000\u0000#r\u0001\u0000\u0000"+
		"\u0000%{\u0001\u0000\u0000\u0000\'~\u0001\u0000\u0000\u0000)\u0082\u0001"+
		"\u0000\u0000\u0000+\u0086\u0001\u0000\u0000\u0000-\u0089\u0001\u0000\u0000"+
		"\u0000/\u0091\u0001\u0000\u0000\u00001\u0095\u0001\u0000\u0000\u00003"+
		"\u00a1\u0001\u0000\u0000\u000056\u0005*\u0000\u00006\u0002\u0001\u0000"+
		"\u0000\u000078\u0005,\u0000\u00008\u0004\u0001\u0000\u0000\u00009:\u0005"+
		"(\u0000\u0000:\u0006\u0001\u0000\u0000\u0000;<\u0005)\u0000\u0000<\b\u0001"+
		"\u0000\u0000\u0000=>\u0005=\u0000\u0000>\n\u0001\u0000\u0000\u0000?@\u0005"+
		"!\u0000\u0000@A\u0005=\u0000\u0000A\f\u0001\u0000\u0000\u0000BC\u0005"+
		"<\u0000\u0000C\u000e\u0001\u0000\u0000\u0000DE\u0005>\u0000\u0000E\u0010"+
		"\u0001\u0000\u0000\u0000FG\u0005<\u0000\u0000GH\u0005=\u0000\u0000H\u0012"+
		"\u0001\u0000\u0000\u0000IJ\u0005>\u0000\u0000JK\u0005=\u0000\u0000K\u0014"+
		"\u0001\u0000\u0000\u0000LM\u0005L\u0000\u0000MN\u0005I\u0000\u0000NO\u0005"+
		"K\u0000\u0000OP\u0005E\u0000\u0000P\u0016\u0001\u0000\u0000\u0000QR\u0005"+
		"N\u0000\u0000RS\u0005O\u0000\u0000ST\u0005T\u0000\u0000TU\u0005 \u0000"+
		"\u0000UV\u0005L\u0000\u0000VW\u0005I\u0000\u0000WX\u0005K\u0000\u0000"+
		"XY\u0005E\u0000\u0000Y\u0018\u0001\u0000\u0000\u0000Z[\u0005%\u0000\u0000"+
		"[\\\u0005%\u0000\u0000\\\u001a\u0001\u0000\u0000\u0000]^\u0005@\u0000"+
		"\u0000^_\u0005@\u0000\u0000_\u001c\u0001\u0000\u0000\u0000`a\u0007\u0000"+
		"\u0000\u0000ab\u0007\u0001\u0000\u0000bc\u0007\u0002\u0000\u0000cd\u0007"+
		"\u0001\u0000\u0000de\u0007\u0003\u0000\u0000ef\u0007\u0004\u0000\u0000"+
		"f\u001e\u0001\u0000\u0000\u0000gh\u0007\u0005\u0000\u0000hi\u0007\u0006"+
		"\u0000\u0000ij\u0007\u0007\u0000\u0000jk\u0007\b\u0000\u0000k \u0001\u0000"+
		"\u0000\u0000lm\u0007\t\u0000\u0000mn\u0007\n\u0000\u0000no\u0007\u0001"+
		"\u0000\u0000op\u0007\u0006\u0000\u0000pq\u0007\u0001\u0000\u0000q\"\u0001"+
		"\u0000\u0000\u0000rs\u0007\u0003\u0000\u0000st\u0007\u0007\u0000\u0000"+
		"tu\u0007\u000b\u0000\u0000uv\u0007\u0004\u0000\u0000vw\u0007\f\u0000\u0000"+
		"wx\u0007\r\u0000\u0000xy\u0007\u000b\u0000\u0000yz\u0007\u0000\u0000\u0000"+
		"z$\u0001\u0000\u0000\u0000{|\u0007\r\u0000\u0000|}\u0007\u000b\u0000\u0000"+
		"}&\u0001\u0000\u0000\u0000~\u007f\u0007\u000b\u0000\u0000\u007f\u0080"+
		"\u0007\u0007\u0000\u0000\u0080\u0081\u0007\u0004\u0000\u0000\u0081(\u0001"+
		"\u0000\u0000\u0000\u0082\u0083\u0007\f\u0000\u0000\u0083\u0084\u0007\u000b"+
		"\u0000\u0000\u0084\u0085\u0007\u000e\u0000\u0000\u0085*\u0001\u0000\u0000"+
		"\u0000\u0086\u0087\u0007\u0007\u0000\u0000\u0087\u0088\u0007\u0006\u0000"+
		"\u0000\u0088,\u0001\u0000\u0000\u0000\u0089\u008d\u0007\u000f\u0000\u0000"+
		"\u008a\u008c\u0007\u0010\u0000\u0000\u008b\u008a\u0001\u0000\u0000\u0000"+
		"\u008c\u008f\u0001\u0000\u0000\u0000\u008d\u008b\u0001\u0000\u0000\u0000"+
		"\u008d\u008e\u0001\u0000\u0000\u0000\u008e.\u0001\u0000\u0000\u0000\u008f"+
		"\u008d\u0001\u0000\u0000\u0000\u0090\u0092\u0007\u0011\u0000\u0000\u0091"+
		"\u0090\u0001\u0000\u0000\u0000\u0092\u0093\u0001\u0000\u0000\u0000\u0093"+
		"\u0091\u0001\u0000\u0000\u0000\u0093\u0094\u0001\u0000\u0000\u0000\u0094"+
		"0\u0001\u0000\u0000\u0000\u0095\u009b\u0005\'\u0000\u0000\u0096\u009a"+
		"\b\u0012\u0000\u0000\u0097\u0098\u0005\\\u0000\u0000\u0098\u009a\t\u0000"+
		"\u0000\u0000\u0099\u0096\u0001\u0000\u0000\u0000\u0099\u0097\u0001\u0000"+
		"\u0000\u0000\u009a\u009d\u0001\u0000\u0000\u0000\u009b\u0099\u0001\u0000"+
		"\u0000\u0000\u009b\u009c\u0001\u0000\u0000\u0000\u009c\u009e\u0001\u0000"+
		"\u0000\u0000\u009d\u009b\u0001\u0000\u0000\u0000\u009e\u009f\u0005\'\u0000"+
		"\u0000\u009f2\u0001\u0000\u0000\u0000\u00a0\u00a2\u0007\u0013\u0000\u0000"+
		"\u00a1\u00a0\u0001\u0000\u0000\u0000\u00a2\u00a3\u0001\u0000\u0000\u0000"+
		"\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a3\u00a4\u0001\u0000\u0000\u0000"+
		"\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5\u00a6\u0006\u0019\u0000\u0000"+
		"\u00a64\u0001\u0000\u0000\u0000\u0006\u0000\u008d\u0093\u0099\u009b\u00a3"+
		"\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}