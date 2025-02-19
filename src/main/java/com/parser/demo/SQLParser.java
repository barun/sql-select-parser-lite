package com.parser.demo;

import java.util.*;

class SQLParser {
    private Tokenizer tokenizer;

    public SQLParser(String input) {
        this.tokenizer = new Tokenizer(input);
    }

    public ConditionNode parse() {
        // Skip everything before WHERE
        while (tokenizer.hasNext()) {
            String token = tokenizer.next();
            if (token.equalsIgnoreCase("WHERE")) {
                break; // Stop at WHERE
            }
        }

        // Parse conditions from WHERE clause
        return parseConditions();
    }

    private ConditionNode parseConditions() {
        Stack<List<ConditionNode>> conditionStack = new Stack<>();
        Stack<String> operatorStack = new Stack<>();
        conditionStack.push(new ArrayList<>());

        while (tokenizer.hasNext()) {
            String token = tokenizer.next();

            if (token.equals("(")) {
                // Start a new nested condition block
                conditionStack.push(new ArrayList<>());
            } 
            else if (token.equals(")")) {
                // Close nested block
                List<ConditionNode> nestedConditions = conditionStack.pop();
                if (!conditionStack.isEmpty()) {
                    String combinator = operatorStack.isEmpty() ? "and" : operatorStack.pop();
                    conditionStack.peek().add(new ConditionNode(combinator, nestedConditions));
                }
            } 
            else if (token.equalsIgnoreCase("AND") || token.equalsIgnoreCase("OR")) {
                operatorStack.push(token.toLowerCase());
            } 
            else {
                // Process field, operator, and values
                String field = token;
                String operator = tokenizer.next();

                if (operator.equalsIgnoreCase("IN") || operator.equalsIgnoreCase("NOT IN")) {
                    tokenizer.next(); // Consume "("
                    List<String> values = new ArrayList<>();
                    while (tokenizer.hasNext()) {
                        String valueToken = tokenizer.next();
                        if (valueToken.equals(")")) break; // Stop at closing ")"
                        if (!valueToken.equals(",")) {
                            values.add(valueToken.replaceAll("(^['\"]|['\"]$)", ""));
                        }
                    }
                    conditionStack.peek().add(new ConditionNode(field, operator, values));
                } else {
                    // Regular condition (e.g. field = value)
                    String value = tokenizer.next().replaceAll("(^['\"]|['\"]$)", "");
                    conditionStack.peek().add(new ConditionNode(field, operator, value));
                }
            }
        }

        return new ConditionNode("and", conditionStack.pop());
    }
}






