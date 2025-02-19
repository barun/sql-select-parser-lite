package com.parser.demo;

import org.junit.jupiter.api.Test;

public class ParserServiceTests {
    ParserService parserService = new ParserService();
    @Test
    void testParse1() throws Exception {
        String sql = """
            SELECT school.student.name from school.student 
            WHERE school.student.city NOT IN ( 'NY' , 'LA' , 'SF' ) AND school.student.status = 'active'
            """;
            SQLParser parser = new SQLParser(sql);
            ConditionNode rootCondition = parser.parse();
    
            System.out.println(rootCondition.toJson());
    }

    @Test
    void testParse2() throws Exception {
        String sql = """
            SELECT school.student.name from school.student 
            WHERE school.student.city IN ('NY', 'LA', 'SF') 
            AND school.student.status = 'active'
            AND school.student.name = 'John Doe'
            """;
            SQLParser parser = new SQLParser(sql);
            ConditionNode rootCondition = parser.parse();
    
            System.out.println(rootCondition.toJson());
    }

    @Test
    void testParse3() throws Exception {
        String sql = """
            SELECT school.student.name from school.student 
            WHERE ( school.student.status = 'active' )
            """;
            SQLParser parser = new SQLParser(sql);
            ConditionNode rootCondition = parser.parse();
    
            System.out.println(rootCondition.toJson());
    }

}
