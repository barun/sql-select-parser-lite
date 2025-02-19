package com.parser.demo;

import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

/*class QueryBuilderTransformer {
    public static JSONObject toQueryBuilderModel(ConditionNode condition) {
        JSONObject jsonObject = new JSONObject();
        
        if (condition.isGroup()) {
            jsonObject.put("id", "group");
            jsonObject.put("combinator", condition.combinator.toLowerCase());

            JSONArray rulesArray = new JSONArray();
            for (ConditionNode child : condition.children) {
                rulesArray.put(toQueryBuilderModel(child));
            }
            jsonObject.put("rules", rulesArray);
        } else {
            jsonObject.put("field", condition.field);
            jsonObject.put("operator", condition.operator.toLowerCase());

            if (condition.value instanceof List val) {
                JSONArray valuesArray = new JSONArray(val);
                
                jsonObject.put("value", valuesArray);
            }  else {
                jsonObject.put("value", condition.value);
            } 
        }

        return jsonObject;
    }
}*/

