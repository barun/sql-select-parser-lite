package com.parser.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class SQLTokenizer {
    private List<String> tokens;
    public int index = 0;

    public SQLTokenizer(String sql) {
        this.tokens = tokenize(sql);
    }

    private List<String> tokenize(String sql) {
        List<String> result = new ArrayList<>();
        
        // Regex to handle string literals with single/double quotes and braces
        String regex = "\\b(SELECT|FROM|WHERE|AND|OR|NOT IN|IN|LIKE|BETWEEN)\\b" +  // SQL Keywords
                       "|\\*|,|\\(|\\)|\\{|\\}|\\[|\\]|>=|<=|!=|=|>|<" +           // Operators and Braces
                       "|'([^']*)'|\"([^\"]*)\"|\\(([^)]*)\\)|\\{([^}]*)\\}|\\[([^]]*)\\]" +  // String literals in quotes and braces
                       "|[a-zA-Z0-9_]+(?:\\.[a-zA-Z0-9_]+){1,2}";                  // Schema.table or Schema.table.field

        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(sql);

        while (matcher.find()) {
            if (matcher.group(1) != null) {  // SQL keywords
                result.add(matcher.group(1).toUpperCase());
            } else if (matcher.group(2) != null) {  // Single-quoted string literals
                result.add("'" + matcher.group(2) + "'");
            } else if (matcher.group(3) != null) {  // Double-quoted string literals
                result.add("\"" + matcher.group(3) + "\"");
            } else if (matcher.group(4) != null) {  // Parentheses `(value)`
                result.add("(" + matcher.group(4) + ")");
            } else if (matcher.group(5) != null) {  // Curly braces `{value}`
                result.add("{" + matcher.group(5) + "}");
            } else if (matcher.group(6) != null) {  // Square brackets `[value]`
                result.add("[" + matcher.group(6) + "]");
            } else {  // Schema.table, Schema.table.field, identifiers, numbers
                result.add(matcher.group());
            }
        }
        return result;
    }

    public boolean hasNext() {
        return index < tokens.size();
    }

    public String next() {
        return hasNext() ? tokens.get(index++) : null;
    }
}

