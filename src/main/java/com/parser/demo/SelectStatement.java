package com.parser.demo;

import java.util.List;

class SelectStatement {
    List<String> columns;
    String table;
    ConditionNode whereCondition;

    public SelectStatement(List<String> columns, String table, ConditionNode whereCondition) {
        this.columns = columns;
        this.table = table;
        this.whereCondition = whereCondition;
    }
}

