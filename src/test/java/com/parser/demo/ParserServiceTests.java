package com.parser.demo;

import org.junit.jupiter.api.Test;

public class ParserServiceTests {
    ParserService parserService = new ParserService();
    @Test
    void testParse() throws Exception {
        String sql = """
            SELECT name, age FROM users 
            WHERE city NOT IN ('NY', 'LA', 'SF') AND status = 'active'
            """;
        parserService.parse(sql);
    }
}
