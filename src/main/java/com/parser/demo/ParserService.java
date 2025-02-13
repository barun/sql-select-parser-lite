package com.parser.demo;

import org.json.JSONObject;

public class ParserService {

    public String parse(String sql) throws Exception {
        try {
            
            SQLParser parser = new SQLParser(sql);
            SelectStatement statement = parser.parse();

            JSONObject queryBuilderJson = QueryBuilderTransformer.toQueryBuilderModel(statement.whereCondition);
            System.out.println(queryBuilderJson.toString(2)); // Pretty print JSON
            return queryBuilderJson.toString(2);
        } catch (Exception e) {
            System.err.println("Parsing error: " + e.getMessage());
            return null;
        }
    }

}
