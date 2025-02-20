package com.parser.demo.antlrimpl;

import com.parser.demo.antlr.ASQBaseVisitor;
import com.parser.demo.antlr.ASQParser;

import java.util.ArrayList;
import java.util.List;

public class QueryBuilderVisitor extends ASQBaseVisitor<Object> {

    @Override
    public Object visitQuery(ASQParser.QueryContext ctx) {
        // Only return the result of the select_stmt, ignoring EOF.
        return visit(ctx.select_stmt());
    }


    // Visit a SELECT statement and build the SQLQuery object.
    @Override
    public SQLQuery visitSelect_stmt(ASQParser.Select_stmtContext ctx) {
        SQLQuery query = new SQLQuery();

        // Process columns: either "*" or a comma-separated list of identifiers.
        List<String> cols = new ArrayList<>();
        if (ctx.columns().getText().equals("*")) {
            cols.add("*");
        } else {
            for (ASQParser.ColumnContext colCtx : ctx.columns().column()) {
                cols.add(colCtx.getText());
            }
        }
        query.setColumns(cols);

        // Process the tableList: extract all table names from the comma-separated list.
        List<String> tables = new ArrayList<>();
        for (ASQParser.TableContext tblCtx : ctx.tables().table()) {
            tables.add(tblCtx.getText());
        }
        query.setTables(tables);

        // Process the WHERE clause condition if present.
        if (ctx.condition() != null) {
            Object condition = visit(ctx.condition());
            if(condition instanceof QueryRule rule){
                var qg = new QueryGroup();
                qg.setCombinator("and");
                qg.setRules(List.of(rule));
                query.setCondition(qg);
            }else{
                query.setCondition(condition);
            }

        }

        return query;
    }

    // Visit binary expressions (e.g., combining predicates with AND/OR).
    @Override
    public Object visitBinaryExpr(ASQParser.BinaryExprContext ctx) {
        // Get the combinator: should be "and" or "or"
        String opText = ctx.binary_op().getText().toLowerCase();

        // Visit left and right expressions
        Object left = visit(ctx.expression(0));
        Object right = visit(ctx.expression(1));

        QueryGroup group = new QueryGroup();
        group.setCombinator(opText);
        List<Object> rules = new ArrayList<>();

        // Flatten left if it is a group with the same combinator
        if (left instanceof QueryGroup && ((QueryGroup) left).getCombinator().equals(opText)) {
            rules.addAll(((QueryGroup) left).getRules());
        } else {
            rules.add(left);
        }

        // Flatten right if it is a group with the same combinator
        if (right instanceof QueryGroup && ((QueryGroup) right).getCombinator().equals(opText)) {
            rules.addAll(((QueryGroup) right).getRules());
        } else {
            rules.add(right);
        }

        group.setRules(rules);
        return group;
    }

    // Visit parenthesized expressions.
    @Override
    public Object visitParenExpr(ASQParser.ParenExprContext ctx) {
        return visit(ctx.expression());
    }

    // Visit a comparison predicate (e.g., col = 'value').
    @Override
    public Object visitComparisonPredicate(ASQParser.ComparisonPredicateContext ctx) {
        QueryRule rule = new QueryRule();
        rule.setField(ctx.IDENTIFIER().getText());
        rule.setOperator(ctx.op().getText());

        String literalText = ctx.literal().getText();
        // Optionally remove single quotes from string literals.
        if (literalText.startsWith("'") && literalText.endsWith("'")) {
            literalText = literalText.substring(1, literalText.length() - 1);
        }
        rule.setValue(literalText);
        return rule;
    }

    // Visit an IN predicate (e.g., col IN ('val1', 'val2', 123)).
    @Override
    public Object visitInPredicate(ASQParser.InPredicateContext ctx) {
        QueryRule rule = new QueryRule();
        rule.setField(ctx.IDENTIFIER().getText());
        rule.setOperator("in");

        List<Object> values = new ArrayList<>();
        // Get all literals from the in_clause.
        List<ASQParser.LiteralContext> literalContexts = ctx.in_clause().literal();
        for (ASQParser.LiteralContext litCtx : literalContexts) {
            String literalText = litCtx.getText();
            if (literalText.startsWith("'") && literalText.endsWith("'")) {
                literalText = literalText.substring(1, literalText.length() - 1);
            }
            values.add(literalText);
        }
        rule.setValue(values);
        return rule;
    }

    @Override
    public Object visitNotInPredicate(ASQParser.NotInPredicateContext ctx) {
        QueryRule rule = new QueryRule();
        rule.setField(ctx.IDENTIFIER().getText());
        rule.setOperator("not in");

        List<Object> values = new ArrayList<>();
        // Get all literals from the not_in_clause.
        List<ASQParser.LiteralContext> literalContexts = ctx.not_in_clause().literal();
        for (ASQParser.LiteralContext litCtx : literalContexts) {
            String literalText = litCtx.getText();
            if (literalText.startsWith("'") && literalText.endsWith("'")) {
                literalText = literalText.substring(1, literalText.length() - 1);
            }
            values.add(literalText);
        }
        rule.setValue(values);
        return rule;
    }

    // Visit a CONTAINS predicate (e.g., col CONTAINS ('val1', 'val2', 123)).
    @Override
    public Object visitContainsPredicate(ASQParser.ContainsPredicateContext ctx) {
        QueryRule rule = new QueryRule();
        rule.setField(ctx.IDENTIFIER().getText());
        rule.setOperator("contains");

        List<Object> values = new ArrayList<>();
        // Get all literals from the contains_clause.
        List<ASQParser.LiteralContext> literalContexts = ctx.contains_clause().literal();
        for (ASQParser.LiteralContext litCtx : literalContexts) {
            String literalText = litCtx.getText();
            if (literalText.startsWith("'") && literalText.endsWith("'")) {
                literalText = literalText.substring(1, literalText.length() - 1);
            }
            values.add(literalText);
        }
        rule.setValue(values);
        return rule;
    }
}
