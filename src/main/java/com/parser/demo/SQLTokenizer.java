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
        
        // Improved regex to properly tokenize SQL keywords, operators, and string literals
        String regex = "\\b(SELECT|FROM|WHERE|AND|OR|NOT IN|IN|LIKE|BETWEEN)\\b" + // Keywords/operators
                       "|\\*|,|\\(|\\)|>=|<=|!=|=|>|<" +                          // Operators
                       "|'([^']*)'|\\w+";                                         // Strings & identifiers

        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(sql);

        while (matcher.find()) {
            if (matcher.group(1) != null) {  // Keywords & multi-word operators (e.g., "NOT IN")
                result.add(matcher.group(1).toUpperCase());
            } else if (matcher.group(2) != null) {  // String literals (keep quotes)
                result.add("'" + matcher.group(2) + "'");
            } else {  // Everything else (operators, identifiers, numbers)
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

