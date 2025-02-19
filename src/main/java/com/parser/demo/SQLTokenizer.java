package com.parser.demo;

import java.util.*;

class Tokenizer {
    private List<String> tokens;
    private int position = 0;

    public Tokenizer(String input) {
        this.tokens = tokenize(input);
    }

    private List<String> tokenize(String input) {
        List<String> tokens = new ArrayList<>();
        StringBuilder token = new StringBuilder();
        boolean insideString = false;
        char stringDelimiter = 0;

        for (char c : input.toCharArray()) {
            // Handle string literals
            if (!insideString && (c == '\'' || c == '"')) {
                if (token.length() > 0) {
                    tokens.add(token.toString());
                    token.setLength(0);
                }
                insideString = true;
                stringDelimiter = c;
                token.append(c);
            } 
            else if (insideString && c == stringDelimiter) {
                token.append(c);
                tokens.add(token.toString());
                token.setLength(0);
                insideString = false;
            } 
            // Preserve spaces inside string literals
            else if (insideString && Character.isWhitespace(c)) {
                token.append(c);
            }
            // Handle parentheses for nested conditions
            else if (!insideString && (c == '(' || c == ')')) {
                if (token.length() > 0) {
                    tokens.add(token.toString());
                    token.setLength(0);
                }
                tokens.add(String.valueOf(c));
            } 
            // Handle spaces (split tokens only if outside a string)
            else if (Character.isWhitespace(c)) {
                if (token.length() > 0) {
                    tokens.add(token.toString());
                    token.setLength(0);
                }
            } 
            // Handle commas (for IN conditions)
            else if (!insideString && c == ',') {
                if (token.length() > 0) {
                    tokens.add(token.toString());
                    token.setLength(0);
                }
                tokens.add(",");
            } 
            // Accumulate normal characters
            else {
                token.append(c);
            }
        }

        if (token.length() > 0) {
            tokens.add(token.toString());
        }

        return tokens;
    }

    public String next() {
        return hasNext() ? tokens.get(position++) : null;
    }

    public boolean hasNext() {
        return position < tokens.size();
    }

    public String peek() {
        return hasNext() ? tokens.get(position) : null;
    }
}


