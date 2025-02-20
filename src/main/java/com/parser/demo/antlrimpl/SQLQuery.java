package com.parser.demo.antlrimpl;

import java.util.List;

public class SQLQuery {
    private List<String> columns;
    private List<String> tables;
    // condition can be either a QueryGroup or QueryRule
    private Object condition;

    public SQLQuery() {}

    public List<String> getColumns() {
        return columns;
    }
    public void setColumns(List<String> columns) {
        this.columns = columns;
    }
    public List<String> getTables() {
        return tables;
    }
    public void setTables(List<String> tables) {
        this.tables = tables;
    }
    public Object getCondition() {
        return condition;
    }
    public void setCondition(Object condition) {
        this.condition = condition;
    }
}

