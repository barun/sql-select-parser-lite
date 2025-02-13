package com.parser.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class SQLParser {
    private SQLTokenizer tokenizer;

    public SQLParser(String sql) {
        this.tokenizer = new SQLTokenizer(sql);
    }

    public SelectStatement parse() throws Exception {
        if (!"SELECT".equalsIgnoreCase(tokenizer.next())) {
            throw new Exception("Expected SELECT keyword");
        }

        List<String> columns = parseColumns();

        if (!"FROM".equalsIgnoreCase(tokenizer.next())) {
            throw new Exception("Expected FROM keyword");
        }

        String table = tokenizer.next();
        ConditionNode whereCondition = null;

        if (tokenizer.hasNext() && "WHERE".equalsIgnoreCase(tokenizer.next())) {
            whereCondition = parseWhereClause();
        }

        return new SelectStatement(columns, table, whereCondition);
    }

    private List<String> parseColumns() throws Exception {
        List<String> columns = new ArrayList<>();
        while (tokenizer.hasNext()) {
            String column = tokenizer.next();
            if (",".equals(column)) continue;
            if ("FROM".equalsIgnoreCase(column)) {
                tokenizer.index--;
                break;
            }
            columns.add(column);
        }
        return columns;
    }

    private ConditionNode parseWhereClause() {
        Stack<List<ConditionNode>> conditionStack = new Stack<>();
        Stack<String> operatorStack = new Stack<>();
        conditionStack.push(new ArrayList<>());

        while (tokenizer.hasNext()) {
            String token = tokenizer.next();

            if ("(".equals(token)) {
                conditionStack.push(new ArrayList<>());
            } else if (")".equals(token)) {
                List<ConditionNode> nestedConditions = conditionStack.pop();
                String combinator = operatorStack.isEmpty() ? "AND" : operatorStack.pop();
                conditionStack.peek().add(new ConditionNode(nestedConditions, combinator));
            } else if ("AND".equalsIgnoreCase(token) || "OR".equalsIgnoreCase(token)) {
                operatorStack.push(token.toUpperCase());
            } else {
                conditionStack.peek().add(parseCondition(token));
            }
        }

        return new ConditionNode(conditionStack.pop(), "AND");
    }

    private ConditionNode parseCondition(String field) {
        String operator = tokenizer.next();

    if ("IN".equalsIgnoreCase(operator) || "NOT IN".equalsIgnoreCase(operator)) {
        String valuesString = tokenizer.next().replace("(", "").replace(")", "").trim();
        String[] values = valuesString.split(",");
        List<String> valueList = new ArrayList<>();
        for (String value : values) {
            valueList.add(value.trim().replace("'", "")); // Remove quotes
        }
        return new ConditionNode(field, operator, valueList); // ✅ Pass a List<String>
    } 
    else if ("LIKE".equalsIgnoreCase(operator)) {
        String value = tokenizer.next().replace("'", ""); // Remove quotes
        return new ConditionNode(field, operator, value);
    }
    else {
        // Handle simple conditions (e.g., age >= 30)
        String value = tokenizer.next().replace("'", ""); // Remove quotes
        return new ConditionNode(field, operator, value);
    }
    }
}
