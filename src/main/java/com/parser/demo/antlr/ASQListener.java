// Generated from ASQ.g4 by ANTLR 4.13.2
package com.parser.demo.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ASQParser}.
 */
public interface ASQListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ASQParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(ASQParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASQParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(ASQParser.QueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASQParser#select_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSelect_stmt(ASQParser.Select_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASQParser#select_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSelect_stmt(ASQParser.Select_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASQParser#columns}.
	 * @param ctx the parse tree
	 */
	void enterColumns(ASQParser.ColumnsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASQParser#columns}.
	 * @param ctx the parse tree
	 */
	void exitColumns(ASQParser.ColumnsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASQParser#column}.
	 * @param ctx the parse tree
	 */
	void enterColumn(ASQParser.ColumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASQParser#column}.
	 * @param ctx the parse tree
	 */
	void exitColumn(ASQParser.ColumnContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASQParser#tables}.
	 * @param ctx the parse tree
	 */
	void enterTables(ASQParser.TablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASQParser#tables}.
	 * @param ctx the parse tree
	 */
	void exitTables(ASQParser.TablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASQParser#table}.
	 * @param ctx the parse tree
	 */
	void enterTable(ASQParser.TableContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASQParser#table}.
	 * @param ctx the parse tree
	 */
	void exitTable(ASQParser.TableContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASQParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(ASQParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASQParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(ASQParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PredicateExpr}
	 * labeled alternative in {@link ASQParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPredicateExpr(ASQParser.PredicateExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PredicateExpr}
	 * labeled alternative in {@link ASQParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPredicateExpr(ASQParser.PredicateExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BinaryExpr}
	 * labeled alternative in {@link ASQParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBinaryExpr(ASQParser.BinaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BinaryExpr}
	 * labeled alternative in {@link ASQParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBinaryExpr(ASQParser.BinaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenExpr}
	 * labeled alternative in {@link ASQParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParenExpr(ASQParser.ParenExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenExpr}
	 * labeled alternative in {@link ASQParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParenExpr(ASQParser.ParenExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComparisonPredicate}
	 * labeled alternative in {@link ASQParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterComparisonPredicate(ASQParser.ComparisonPredicateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComparisonPredicate}
	 * labeled alternative in {@link ASQParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitComparisonPredicate(ASQParser.ComparisonPredicateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ContainsPredicate}
	 * labeled alternative in {@link ASQParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterContainsPredicate(ASQParser.ContainsPredicateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ContainsPredicate}
	 * labeled alternative in {@link ASQParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitContainsPredicate(ASQParser.ContainsPredicateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InPredicate}
	 * labeled alternative in {@link ASQParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterInPredicate(ASQParser.InPredicateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InPredicate}
	 * labeled alternative in {@link ASQParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitInPredicate(ASQParser.InPredicateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotInPredicate}
	 * labeled alternative in {@link ASQParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterNotInPredicate(ASQParser.NotInPredicateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotInPredicate}
	 * labeled alternative in {@link ASQParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitNotInPredicate(ASQParser.NotInPredicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASQParser#contains_clause}.
	 * @param ctx the parse tree
	 */
	void enterContains_clause(ASQParser.Contains_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASQParser#contains_clause}.
	 * @param ctx the parse tree
	 */
	void exitContains_clause(ASQParser.Contains_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASQParser#in_clause}.
	 * @param ctx the parse tree
	 */
	void enterIn_clause(ASQParser.In_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASQParser#in_clause}.
	 * @param ctx the parse tree
	 */
	void exitIn_clause(ASQParser.In_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASQParser#not_in_clause}.
	 * @param ctx the parse tree
	 */
	void enterNot_in_clause(ASQParser.Not_in_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASQParser#not_in_clause}.
	 * @param ctx the parse tree
	 */
	void exitNot_in_clause(ASQParser.Not_in_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASQParser#binary_op}.
	 * @param ctx the parse tree
	 */
	void enterBinary_op(ASQParser.Binary_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASQParser#binary_op}.
	 * @param ctx the parse tree
	 */
	void exitBinary_op(ASQParser.Binary_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASQParser#op}.
	 * @param ctx the parse tree
	 */
	void enterOp(ASQParser.OpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASQParser#op}.
	 * @param ctx the parse tree
	 */
	void exitOp(ASQParser.OpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASQParser#standard_op}.
	 * @param ctx the parse tree
	 */
	void enterStandard_op(ASQParser.Standard_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASQParser#standard_op}.
	 * @param ctx the parse tree
	 */
	void exitStandard_op(ASQParser.Standard_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASQParser#custom_op}.
	 * @param ctx the parse tree
	 */
	void enterCustom_op(ASQParser.Custom_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASQParser#custom_op}.
	 * @param ctx the parse tree
	 */
	void exitCustom_op(ASQParser.Custom_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASQParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(ASQParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASQParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(ASQParser.LiteralContext ctx);
}