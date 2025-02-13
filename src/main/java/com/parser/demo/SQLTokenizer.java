package com.parser.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class SQLTokenizer {
    private List<String> tokens;
    public int index = 0;

    public SQLTokenizer(String sql) {
        this.tokens = tokenize(sql);
    }

    private List<String> tokenize(String sql) {
        return new ArrayList<>(Arrays.asList(sql.split("\\s+")));
    }

    public boolean hasNext() {
        return index < tokens.size();
    }

    public String next() {
        return hasNext() ? tokens.get(index++) : null;
    }
}

