// Generated from ASQ.g4 by ANTLR 4.13.2
package com.parser.demo.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class ASQParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, SELECT=15, FROM=16, WHERE=17, 
		CONTAINS=18, IN=19, NOT=20, AND=21, OR=22, IDENTIFIER=23, NUMBER=24, STRING=25, 
		WS=26;
	public static final int
		RULE_query = 0, RULE_select_stmt = 1, RULE_columns = 2, RULE_column = 3, 
		RULE_tables = 4, RULE_table = 5, RULE_condition = 6, RULE_expression = 7, 
		RULE_predicate = 8, RULE_contains_clause = 9, RULE_not_contains_clause = 10, 
		RULE_in_clause = 11, RULE_not_in_clause = 12, RULE_binary_op = 13, RULE_op = 14, 
		RULE_standard_op = 15, RULE_custom_op = 16, RULE_literal = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"query", "select_stmt", "columns", "column", "tables", "table", "condition", 
			"expression", "predicate", "contains_clause", "not_contains_clause", 
			"in_clause", "not_in_clause", "binary_op", "op", "standard_op", "custom_op", 
			"literal"
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

	@Override
	public String getGrammarFileName() { return "ASQ.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ASQParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QueryContext extends ParserRuleContext {
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ASQParser.EOF, 0); }
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASQListener ) ((ASQListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASQListener ) ((ASQListener)listener).exitQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASQVisitor ) return ((ASQVisitor<? extends T>)visitor).visitQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_query);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			select_stmt();
			setState(37);
			match(EOF);
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
	public static class Select_stmtContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(ASQParser.SELECT, 0); }
		public ColumnsContext columns() {
			return getRuleContext(ColumnsContext.class,0);
		}
		public TerminalNode FROM() { return getToken(ASQParser.FROM, 0); }
		public TablesContext tables() {
			return getRuleContext(TablesContext.class,0);
		}
		public TerminalNode WHERE() { return getToken(ASQParser.WHERE, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public Select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASQListener ) ((ASQListener)listener).enterSelect_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASQListener ) ((ASQListener)listener).exitSelect_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASQVisitor ) return ((ASQVisitor<? extends T>)visitor).visitSelect_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_stmtContext select_stmt() throws RecognitionException {
		Select_stmtContext _localctx = new Select_stmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			match(SELECT);
			setState(40);
			columns();
			setState(41);
			match(FROM);
			setState(42);
			tables();
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(43);
				match(WHERE);
				setState(44);
				condition();
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
	public static class ColumnsContext extends ParserRuleContext {
		public List<ColumnContext> column() {
			return getRuleContexts(ColumnContext.class);
		}
		public ColumnContext column(int i) {
			return getRuleContext(ColumnContext.class,i);
		}
		public ColumnsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columns; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASQListener ) ((ASQListener)listener).enterColumns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASQListener ) ((ASQListener)listener).exitColumns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASQVisitor ) return ((ASQVisitor<? extends T>)visitor).visitColumns(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnsContext columns() throws RecognitionException {
		ColumnsContext _localctx = new ColumnsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_columns);
		int _la;
		try {
			setState(56);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(47);
				match(T__0);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(48);
				column();
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(49);
					match(T__1);
					setState(50);
					column();
					}
					}
					setState(55);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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
	public static class ColumnContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ASQParser.IDENTIFIER, 0); }
		public ColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASQListener ) ((ASQListener)listener).enterColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASQListener ) ((ASQListener)listener).exitColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASQVisitor ) return ((ASQVisitor<? extends T>)visitor).visitColumn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnContext column() throws RecognitionException {
		ColumnContext _localctx = new ColumnContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_column);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(IDENTIFIER);
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
	public static class TablesContext extends ParserRuleContext {
		public List<TableContext> table() {
			return getRuleContexts(TableContext.class);
		}
		public TableContext table(int i) {
			return getRuleContext(TableContext.class,i);
		}
		public TablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASQListener ) ((ASQListener)listener).enterTables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASQListener ) ((ASQListener)listener).exitTables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASQVisitor ) return ((ASQVisitor<? extends T>)visitor).visitTables(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablesContext tables() throws RecognitionException {
		TablesContext _localctx = new TablesContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_tables);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			table();
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(61);
				match(T__1);
				setState(62);
				table();
				}
				}
				setState(67);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TableContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ASQParser.IDENTIFIER, 0); }
		public TableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASQListener ) ((ASQListener)listener).enterTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASQListener ) ((ASQListener)listener).exitTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASQVisitor ) return ((ASQVisitor<? extends T>)visitor).visitTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableContext table() throws RecognitionException {
		TableContext _localctx = new TableContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(IDENTIFIER);
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
	public static class ConditionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASQListener ) ((ASQListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASQListener ) ((ASQListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASQVisitor ) return ((ASQVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			expression(0);
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
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PredicateExprContext extends ExpressionContext {
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public PredicateExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASQListener ) ((ASQListener)listener).enterPredicateExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASQListener ) ((ASQListener)listener).exitPredicateExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASQVisitor ) return ((ASQVisitor<? extends T>)visitor).visitPredicateExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BinaryExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Binary_opContext binary_op() {
			return getRuleContext(Binary_opContext.class,0);
		}
		public BinaryExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASQListener ) ((ASQListener)listener).enterBinaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASQListener ) ((ASQListener)listener).exitBinaryExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASQVisitor ) return ((ASQVisitor<? extends T>)visitor).visitBinaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenExprContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParenExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASQListener ) ((ASQListener)listener).enterParenExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASQListener ) ((ASQListener)listener).exitParenExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASQVisitor ) return ((ASQVisitor<? extends T>)visitor).visitParenExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				{
				_localctx = new ParenExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(73);
				match(T__2);
				setState(74);
				expression(0);
				setState(75);
				match(T__3);
				}
				break;
			case IDENTIFIER:
				{
				_localctx = new PredicateExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(77);
				predicate();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(86);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BinaryExprContext(new ExpressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(80);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(81);
					binary_op();
					setState(82);
					expression(4);
					}
					} 
				}
				setState(88);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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
	public static class PredicateContext extends ParserRuleContext {
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
	 
		public PredicateContext() { }
		public void copyFrom(PredicateContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ContainsPredicateContext extends PredicateContext {
		public TerminalNode IDENTIFIER() { return getToken(ASQParser.IDENTIFIER, 0); }
		public Contains_clauseContext contains_clause() {
			return getRuleContext(Contains_clauseContext.class,0);
		}
		public ContainsPredicateContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASQListener ) ((ASQListener)listener).enterContainsPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASQListener ) ((ASQListener)listener).exitContainsPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASQVisitor ) return ((ASQVisitor<? extends T>)visitor).visitContainsPredicate(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotContainsPredicateContext extends PredicateContext {
		public TerminalNode IDENTIFIER() { return getToken(ASQParser.IDENTIFIER, 0); }
		public Not_contains_clauseContext not_contains_clause() {
			return getRuleContext(Not_contains_clauseContext.class,0);
		}
		public NotContainsPredicateContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASQListener ) ((ASQListener)listener).enterNotContainsPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASQListener ) ((ASQListener)listener).exitNotContainsPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASQVisitor ) return ((ASQVisitor<? extends T>)visitor).visitNotContainsPredicate(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InPredicateContext extends PredicateContext {
		public TerminalNode IDENTIFIER() { return getToken(ASQParser.IDENTIFIER, 0); }
		public In_clauseContext in_clause() {
			return getRuleContext(In_clauseContext.class,0);
		}
		public InPredicateContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASQListener ) ((ASQListener)listener).enterInPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASQListener ) ((ASQListener)listener).exitInPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASQVisitor ) return ((ASQVisitor<? extends T>)visitor).visitInPredicate(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComparisonPredicateContext extends PredicateContext {
		public TerminalNode IDENTIFIER() { return getToken(ASQParser.IDENTIFIER, 0); }
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ComparisonPredicateContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASQListener ) ((ASQListener)listener).enterComparisonPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASQListener ) ((ASQListener)listener).exitComparisonPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASQVisitor ) return ((ASQVisitor<? extends T>)visitor).visitComparisonPredicate(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotInPredicateContext extends PredicateContext {
		public TerminalNode IDENTIFIER() { return getToken(ASQParser.IDENTIFIER, 0); }
		public Not_in_clauseContext not_in_clause() {
			return getRuleContext(Not_in_clauseContext.class,0);
		}
		public NotInPredicateContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASQListener ) ((ASQListener)listener).enterNotInPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASQListener ) ((ASQListener)listener).exitNotInPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASQVisitor ) return ((ASQVisitor<? extends T>)visitor).visitNotInPredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_predicate);
		try {
			setState(101);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new ComparisonPredicateContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				match(IDENTIFIER);
				setState(90);
				op();
				setState(91);
				literal();
				}
				break;
			case 2:
				_localctx = new ContainsPredicateContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
				match(IDENTIFIER);
				setState(94);
				contains_clause();
				}
				break;
			case 3:
				_localctx = new NotContainsPredicateContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(95);
				match(IDENTIFIER);
				setState(96);
				not_contains_clause();
				}
				break;
			case 4:
				_localctx = new InPredicateContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(97);
				match(IDENTIFIER);
				setState(98);
				in_clause();
				}
				break;
			case 5:
				_localctx = new NotInPredicateContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(99);
				match(IDENTIFIER);
				setState(100);
				not_in_clause();
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
	public static class Contains_clauseContext extends ParserRuleContext {
		public TerminalNode CONTAINS() { return getToken(ASQParser.CONTAINS, 0); }
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
		public Contains_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contains_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASQListener ) ((ASQListener)listener).enterContains_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASQListener ) ((ASQListener)listener).exitContains_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASQVisitor ) return ((ASQVisitor<? extends T>)visitor).visitContains_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Contains_clauseContext contains_clause() throws RecognitionException {
		Contains_clauseContext _localctx = new Contains_clauseContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_contains_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(CONTAINS);
			setState(104);
			match(T__2);
			setState(105);
			literal();
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(106);
				match(T__1);
				setState(107);
				literal();
				}
				}
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(113);
			match(T__3);
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
	public static class Not_contains_clauseContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(ASQParser.NOT, 0); }
		public TerminalNode CONTAINS() { return getToken(ASQParser.CONTAINS, 0); }
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
		public Not_contains_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_not_contains_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASQListener ) ((ASQListener)listener).enterNot_contains_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASQListener ) ((ASQListener)listener).exitNot_contains_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASQVisitor ) return ((ASQVisitor<? extends T>)visitor).visitNot_contains_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Not_contains_clauseContext not_contains_clause() throws RecognitionException {
		Not_contains_clauseContext _localctx = new Not_contains_clauseContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_not_contains_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(NOT);
			setState(116);
			match(CONTAINS);
			setState(117);
			match(T__2);
			setState(118);
			literal();
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(119);
				match(T__1);
				setState(120);
				literal();
				}
				}
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(126);
			match(T__3);
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
	public static class In_clauseContext extends ParserRuleContext {
		public TerminalNode IN() { return getToken(ASQParser.IN, 0); }
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
		public In_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_in_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASQListener ) ((ASQListener)listener).enterIn_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASQListener ) ((ASQListener)listener).exitIn_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASQVisitor ) return ((ASQVisitor<? extends T>)visitor).visitIn_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final In_clauseContext in_clause() throws RecognitionException {
		In_clauseContext _localctx = new In_clauseContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_in_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(IN);
			setState(129);
			match(T__2);
			setState(130);
			literal();
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(131);
				match(T__1);
				setState(132);
				literal();
				}
				}
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(138);
			match(T__3);
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
	public static class Not_in_clauseContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(ASQParser.NOT, 0); }
		public TerminalNode IN() { return getToken(ASQParser.IN, 0); }
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
		public Not_in_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_not_in_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASQListener ) ((ASQListener)listener).enterNot_in_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASQListener ) ((ASQListener)listener).exitNot_in_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASQVisitor ) return ((ASQVisitor<? extends T>)visitor).visitNot_in_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Not_in_clauseContext not_in_clause() throws RecognitionException {
		Not_in_clauseContext _localctx = new Not_in_clauseContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_not_in_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(NOT);
			setState(141);
			match(IN);
			setState(142);
			match(T__2);
			setState(143);
			literal();
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(144);
				match(T__1);
				setState(145);
				literal();
				}
				}
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(151);
			match(T__3);
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
	public static class Binary_opContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(ASQParser.AND, 0); }
		public TerminalNode OR() { return getToken(ASQParser.OR, 0); }
		public Binary_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASQListener ) ((ASQListener)listener).enterBinary_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASQListener ) ((ASQListener)listener).exitBinary_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASQVisitor ) return ((ASQVisitor<? extends T>)visitor).visitBinary_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Binary_opContext binary_op() throws RecognitionException {
		Binary_opContext _localctx = new Binary_opContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_binary_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			_la = _input.LA(1);
			if ( !(_la==AND || _la==OR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
	public static class OpContext extends ParserRuleContext {
		public Standard_opContext standard_op() {
			return getRuleContext(Standard_opContext.class,0);
		}
		public Custom_opContext custom_op() {
			return getRuleContext(Custom_opContext.class,0);
		}
		public OpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASQListener ) ((ASQListener)listener).enterOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASQListener ) ((ASQListener)listener).exitOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASQVisitor ) return ((ASQVisitor<? extends T>)visitor).visitOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpContext op() throws RecognitionException {
		OpContext _localctx = new OpContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_op);
		try {
			setState(157);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				standard_op();
				}
				break;
			case T__12:
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
				custom_op();
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
	public static class Standard_opContext extends ParserRuleContext {
		public Standard_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_standard_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASQListener ) ((ASQListener)listener).enterStandard_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASQListener ) ((ASQListener)listener).exitStandard_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASQVisitor ) return ((ASQVisitor<? extends T>)visitor).visitStandard_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Standard_opContext standard_op() throws RecognitionException {
		Standard_opContext _localctx = new Standard_opContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_standard_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 8160L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
	public static class Custom_opContext extends ParserRuleContext {
		public Custom_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_custom_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASQListener ) ((ASQListener)listener).enterCustom_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASQListener ) ((ASQListener)listener).exitCustom_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASQVisitor ) return ((ASQVisitor<? extends T>)visitor).visitCustom_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Custom_opContext custom_op() throws RecognitionException {
		Custom_opContext _localctx = new Custom_opContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_custom_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			_la = _input.LA(1);
			if ( !(_la==T__12 || _la==T__13) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(ASQParser.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(ASQParser.NUMBER, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASQListener ) ((ASQListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASQListener ) ((ASQListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASQVisitor ) return ((ASQVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			_la = _input.LA(1);
			if ( !(_la==NUMBER || _la==STRING) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 7:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u001a\u00a6\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0003\u0001.\b\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0005\u00024\b\u0002\n\u0002\f\u00027\t\u0002\u0003"+
		"\u00029\b\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0005\u0004@\b\u0004\n\u0004\f\u0004C\t\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0003\u0007O\b\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0005\u0007U\b\u0007\n\u0007\f\u0007X\t"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0003\bf\b\b\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0005\tm\b\t\n\t\f\tp\t\t\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\nz\b\n\n\n\f\n}\t\n\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b"+
		"\u0086\b\u000b\n\u000b\f\u000b\u0089\t\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u0093\b\f\n\f\f\f\u0096"+
		"\t\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0003\u000e"+
		"\u009e\b\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0000\u0001\u000e\u0012\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"\u0000"+
		"\u0004\u0001\u0000\u0015\u0016\u0001\u0000\u0005\f\u0001\u0000\r\u000e"+
		"\u0001\u0000\u0018\u0019\u00a2\u0000$\u0001\u0000\u0000\u0000\u0002\'"+
		"\u0001\u0000\u0000\u0000\u00048\u0001\u0000\u0000\u0000\u0006:\u0001\u0000"+
		"\u0000\u0000\b<\u0001\u0000\u0000\u0000\nD\u0001\u0000\u0000\u0000\fF"+
		"\u0001\u0000\u0000\u0000\u000eN\u0001\u0000\u0000\u0000\u0010e\u0001\u0000"+
		"\u0000\u0000\u0012g\u0001\u0000\u0000\u0000\u0014s\u0001\u0000\u0000\u0000"+
		"\u0016\u0080\u0001\u0000\u0000\u0000\u0018\u008c\u0001\u0000\u0000\u0000"+
		"\u001a\u0099\u0001\u0000\u0000\u0000\u001c\u009d\u0001\u0000\u0000\u0000"+
		"\u001e\u009f\u0001\u0000\u0000\u0000 \u00a1\u0001\u0000\u0000\u0000\""+
		"\u00a3\u0001\u0000\u0000\u0000$%\u0003\u0002\u0001\u0000%&\u0005\u0000"+
		"\u0000\u0001&\u0001\u0001\u0000\u0000\u0000\'(\u0005\u000f\u0000\u0000"+
		"()\u0003\u0004\u0002\u0000)*\u0005\u0010\u0000\u0000*-\u0003\b\u0004\u0000"+
		"+,\u0005\u0011\u0000\u0000,.\u0003\f\u0006\u0000-+\u0001\u0000\u0000\u0000"+
		"-.\u0001\u0000\u0000\u0000.\u0003\u0001\u0000\u0000\u0000/9\u0005\u0001"+
		"\u0000\u000005\u0003\u0006\u0003\u000012\u0005\u0002\u0000\u000024\u0003"+
		"\u0006\u0003\u000031\u0001\u0000\u0000\u000047\u0001\u0000\u0000\u0000"+
		"53\u0001\u0000\u0000\u000056\u0001\u0000\u0000\u000069\u0001\u0000\u0000"+
		"\u000075\u0001\u0000\u0000\u00008/\u0001\u0000\u0000\u000080\u0001\u0000"+
		"\u0000\u00009\u0005\u0001\u0000\u0000\u0000:;\u0005\u0017\u0000\u0000"+
		";\u0007\u0001\u0000\u0000\u0000<A\u0003\n\u0005\u0000=>\u0005\u0002\u0000"+
		"\u0000>@\u0003\n\u0005\u0000?=\u0001\u0000\u0000\u0000@C\u0001\u0000\u0000"+
		"\u0000A?\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000B\t\u0001\u0000"+
		"\u0000\u0000CA\u0001\u0000\u0000\u0000DE\u0005\u0017\u0000\u0000E\u000b"+
		"\u0001\u0000\u0000\u0000FG\u0003\u000e\u0007\u0000G\r\u0001\u0000\u0000"+
		"\u0000HI\u0006\u0007\uffff\uffff\u0000IJ\u0005\u0003\u0000\u0000JK\u0003"+
		"\u000e\u0007\u0000KL\u0005\u0004\u0000\u0000LO\u0001\u0000\u0000\u0000"+
		"MO\u0003\u0010\b\u0000NH\u0001\u0000\u0000\u0000NM\u0001\u0000\u0000\u0000"+
		"OV\u0001\u0000\u0000\u0000PQ\n\u0003\u0000\u0000QR\u0003\u001a\r\u0000"+
		"RS\u0003\u000e\u0007\u0004SU\u0001\u0000\u0000\u0000TP\u0001\u0000\u0000"+
		"\u0000UX\u0001\u0000\u0000\u0000VT\u0001\u0000\u0000\u0000VW\u0001\u0000"+
		"\u0000\u0000W\u000f\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000"+
		"YZ\u0005\u0017\u0000\u0000Z[\u0003\u001c\u000e\u0000[\\\u0003\"\u0011"+
		"\u0000\\f\u0001\u0000\u0000\u0000]^\u0005\u0017\u0000\u0000^f\u0003\u0012"+
		"\t\u0000_`\u0005\u0017\u0000\u0000`f\u0003\u0014\n\u0000ab\u0005\u0017"+
		"\u0000\u0000bf\u0003\u0016\u000b\u0000cd\u0005\u0017\u0000\u0000df\u0003"+
		"\u0018\f\u0000eY\u0001\u0000\u0000\u0000e]\u0001\u0000\u0000\u0000e_\u0001"+
		"\u0000\u0000\u0000ea\u0001\u0000\u0000\u0000ec\u0001\u0000\u0000\u0000"+
		"f\u0011\u0001\u0000\u0000\u0000gh\u0005\u0012\u0000\u0000hi\u0005\u0003"+
		"\u0000\u0000in\u0003\"\u0011\u0000jk\u0005\u0002\u0000\u0000km\u0003\""+
		"\u0011\u0000lj\u0001\u0000\u0000\u0000mp\u0001\u0000\u0000\u0000nl\u0001"+
		"\u0000\u0000\u0000no\u0001\u0000\u0000\u0000oq\u0001\u0000\u0000\u0000"+
		"pn\u0001\u0000\u0000\u0000qr\u0005\u0004\u0000\u0000r\u0013\u0001\u0000"+
		"\u0000\u0000st\u0005\u0014\u0000\u0000tu\u0005\u0012\u0000\u0000uv\u0005"+
		"\u0003\u0000\u0000v{\u0003\"\u0011\u0000wx\u0005\u0002\u0000\u0000xz\u0003"+
		"\"\u0011\u0000yw\u0001\u0000\u0000\u0000z}\u0001\u0000\u0000\u0000{y\u0001"+
		"\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000|~\u0001\u0000\u0000\u0000"+
		"}{\u0001\u0000\u0000\u0000~\u007f\u0005\u0004\u0000\u0000\u007f\u0015"+
		"\u0001\u0000\u0000\u0000\u0080\u0081\u0005\u0013\u0000\u0000\u0081\u0082"+
		"\u0005\u0003\u0000\u0000\u0082\u0087\u0003\"\u0011\u0000\u0083\u0084\u0005"+
		"\u0002\u0000\u0000\u0084\u0086\u0003\"\u0011\u0000\u0085\u0083\u0001\u0000"+
		"\u0000\u0000\u0086\u0089\u0001\u0000\u0000\u0000\u0087\u0085\u0001\u0000"+
		"\u0000\u0000\u0087\u0088\u0001\u0000\u0000\u0000\u0088\u008a\u0001\u0000"+
		"\u0000\u0000\u0089\u0087\u0001\u0000\u0000\u0000\u008a\u008b\u0005\u0004"+
		"\u0000\u0000\u008b\u0017\u0001\u0000\u0000\u0000\u008c\u008d\u0005\u0014"+
		"\u0000\u0000\u008d\u008e\u0005\u0013\u0000\u0000\u008e\u008f\u0005\u0003"+
		"\u0000\u0000\u008f\u0094\u0003\"\u0011\u0000\u0090\u0091\u0005\u0002\u0000"+
		"\u0000\u0091\u0093\u0003\"\u0011\u0000\u0092\u0090\u0001\u0000\u0000\u0000"+
		"\u0093\u0096\u0001\u0000\u0000\u0000\u0094\u0092\u0001\u0000\u0000\u0000"+
		"\u0094\u0095\u0001\u0000\u0000\u0000\u0095\u0097\u0001\u0000\u0000\u0000"+
		"\u0096\u0094\u0001\u0000\u0000\u0000\u0097\u0098\u0005\u0004\u0000\u0000"+
		"\u0098\u0019\u0001\u0000\u0000\u0000\u0099\u009a\u0007\u0000\u0000\u0000"+
		"\u009a\u001b\u0001\u0000\u0000\u0000\u009b\u009e\u0003\u001e\u000f\u0000"+
		"\u009c\u009e\u0003 \u0010\u0000\u009d\u009b\u0001\u0000\u0000\u0000\u009d"+
		"\u009c\u0001\u0000\u0000\u0000\u009e\u001d\u0001\u0000\u0000\u0000\u009f"+
		"\u00a0\u0007\u0001\u0000\u0000\u00a0\u001f\u0001\u0000\u0000\u0000\u00a1"+
		"\u00a2\u0007\u0002\u0000\u0000\u00a2!\u0001\u0000\u0000\u0000\u00a3\u00a4"+
		"\u0007\u0003\u0000\u0000\u00a4#\u0001\u0000\u0000\u0000\f-58ANVen{\u0087"+
		"\u0094\u009d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}