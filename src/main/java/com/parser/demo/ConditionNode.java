package com.parser.demo;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

class ConditionNode {
    private String id;
    private String combinator;
    private List<ConditionNode> rules = new ArrayList<>();
    private String field;
    private String operator;
    private Object value;

    // Constructor for field conditions
    public ConditionNode(String field, String operator, Object value) {
        this.id = UUID.randomUUID().toString();
        this.field = field;
        this.operator = operator;
        this.value = value;
    }

    // Constructor for combinators (AND/OR groups)
    public ConditionNode(String combinator, List<ConditionNode> rules) {
        this.id = UUID.randomUUID().toString();
        this.combinator = combinator;
        this.rules = rules;
    }

    public String toJson() throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(this);
    }

// Explicitly define getters for JSON serialization
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("combinator")
    public String getCombinator() {
        return combinator;
    }

    @JsonProperty("rules")
    public List<ConditionNode> getRules() {
        return rules;
    }

    @JsonProperty("field")
    public String getField() {
        return field;
    }

    @JsonProperty("operator")
    public String getOperator() {
        return operator;
    }

    @JsonProperty("value")
    public Object getValue() {
        return value;
    }

}

