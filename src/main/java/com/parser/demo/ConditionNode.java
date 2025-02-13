package com.parser.demo;

import java.util.List;
import java.util.stream.Collectors;

class ConditionNode {
    String field;
    String operator;
    String value;
    List<ConditionNode> children;
    String combinator;

    public ConditionNode(String field, String operator, String value) {
        this.field = field;
        this.operator = operator;
        this.value = value;
    }

    public ConditionNode(List<ConditionNode> children, String combinator) {
        this.children = children;
        this.combinator = combinator;
    }

    public ConditionNode(String field2, String operator2, List<String> valueList) {
        this.field = field;
        this.operator = operator;
        this.value = valueList.stream().collect(Collectors.joining(",")); 
    }

    public boolean isGroup() {
        return children != null;
    }
}

