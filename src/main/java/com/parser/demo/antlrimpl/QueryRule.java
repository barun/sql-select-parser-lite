package com.parser.demo.antlrimpl;

public class QueryRule {
    private String field;
    private String operator;
    private Object value; // Either a single value (String/Number) or a List for IN predicates

    public QueryRule() {}

    public String getField() {
        return field;
    }
    public void setField(String field) {
        this.field = field;
    }
    public String getOperator() {
        return operator;
    }
    public void setOperator(String operator) {
        this.operator = operator;
    }
    public Object getValue() {
        return value;
    }
    public void setValue(Object value) {
        this.value = value;
    }
}
