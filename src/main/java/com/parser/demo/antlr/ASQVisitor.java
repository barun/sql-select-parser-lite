// Generated from ASQ.g4 by ANTLR 4.13.2
package com.parser.demo.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ASQParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ASQVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ASQParser#query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery(ASQParser.QueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASQParser#select_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_stmt(ASQParser.Select_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASQParser#columns}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumns(ASQParser.ColumnsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASQParser#column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn(ASQParser.ColumnContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASQParser#tables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTables(ASQParser.TablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASQParser#table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable(ASQParser.TableContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASQParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(ASQParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PredicateExpr}
	 * labeled alternative in {@link ASQParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicateExpr(ASQParser.PredicateExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BinaryExpr}
	 * labeled alternative in {@link ASQParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryExpr(ASQParser.BinaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenExpr}
	 * labeled alternative in {@link ASQParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExpr(ASQParser.ParenExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComparisonPredicate}
	 * labeled alternative in {@link ASQParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonPredicate(ASQParser.ComparisonPredicateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ContainsPredicate}
	 * labeled alternative in {@link ASQParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContainsPredicate(ASQParser.ContainsPredicateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InPredicate}
	 * labeled alternative in {@link ASQParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInPredicate(ASQParser.InPredicateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NotInPredicate}
	 * labeled alternative in {@link ASQParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotInPredicate(ASQParser.NotInPredicateContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASQParser#contains_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContains_clause(ASQParser.Contains_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASQParser#in_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIn_clause(ASQParser.In_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASQParser#not_in_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot_in_clause(ASQParser.Not_in_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASQParser#binary_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinary_op(ASQParser.Binary_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASQParser#op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp(ASQParser.OpContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASQParser#standard_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStandard_op(ASQParser.Standard_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASQParser#custom_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCustom_op(ASQParser.Custom_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASQParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(ASQParser.LiteralContext ctx);
}