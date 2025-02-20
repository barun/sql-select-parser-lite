package com.parser.demo.antlrimpl;

import java.util.ArrayList;
import java.util.List;

public class QueryGroup {
    private String combinator; // "and" or "or"
    private List<Object> rules = new ArrayList<>();  // Each rule is either a QueryRule or a nested QueryGroup

    public QueryGroup() {}

    public String getCombinator() {
        return combinator;
    }
    public void setCombinator(String combinator) {
        this.combinator = combinator;
    }
    public List<Object> getRules() {
        return rules;
    }
    public void setRules(List<Object> rules) {
        this.rules = rules;
    }
}
