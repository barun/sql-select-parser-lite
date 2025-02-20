package com.parser.demo.antlrimpl;

import com.parser.demo.antlr.ASQLexer;
import com.parser.demo.antlr.ASQParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import com.fasterxml.jackson.databind.ObjectMapper;

public class SQLParserDemo {
    public static void main(String[] args) {
        try {
            // Example SQL query supporting both comparison and IN predicates.
          // String sql = "SELECT sor.myTable.col1, sor.myTable.col2 FROM sor.myTable WHERE sor.myTable.col1 IN ('value1', 'value2', 123) AND sor.myTable.col2 = 'abc'";
          // String sql = "SELECT sor.myTable.col1  FROM sor.myTable WHERE sor.myTable.col1 IN ('value1', 'value2', 123) ";
           // String sql = "SELECT sor.myTable.col1  FROM sor.myTable WHERE sor.myTable.col1 = 123";
          /*  String sql = """
                    SELECT col1, col2
                    FROM myTable
                    WHERE col1 IN ('value1', 'value2', 123)
                    AND col2 = 'abc'
                    AND col3 = 'CDE'
                    """;

           */
           /* String sql = """
                    SELECT col1, col2
                    FROM myTable
                    WHERE col1 IN ('value1', 'value2', 123)
                    AND col2 = 'abc'
                    AND (col3 = 'CDE' OR col4 = 'CDE')
                    """;

            */

        /*    String sql = """
                    SELECT col1, col2
                    FROM myTable
                    WHERE col1 IN ('value1', 'value2', 123)
                    AND col2 = 'abc'
                    AND (col3 = 'CDE' OR col4 CONTAINS ('CDE', 'efg'))
                    """;

         */
           /* String sql = """
                    SELECT col1, col2
                    FROM myTable
                    WHERE col1 IN ('value1', 'value2', 123)
                    AND col2 = 'abc'
                    AND (col3 = 'CDE' OR col4  NOT CONTAINS ('CDE', 'efg'))
                    """;

            */
           /* String sql = """
                    SELECT col1, col2
                    FROM myTable
                    WHERE col1 IN ('value1', 'value2', 123)
                    AND col2 = 'abc'
                    AND (col3 = 'CDE' OR col4  LIKE '%sdfdasfd')
                    """;

            */

            String sql = """
                    SELECT col1, col2
                    FROM myTable
                    WHERE col1 IN ('value1', 'value2', 123)
                    AND col2 = 'abc'
                    AND (col3 = 'CDE' OR col4  NOT LIKE '%sdfdasfd')
                    """;

          /*  String sql = """
                    SELECT col1, col2
                    FROM myTable
                    WHERE col1 IN ('value1', 'value2', 123)
                    OR col2 = 'abc'
                    OR (col3 = 'CDE' AND col4 CONTAINS ('CDE', 'efg'))
                    """;

           */
          /*  String sql = """
                    SELECT col1, col2
                    FROM myTable, ert
                    WHERE col1 IN ('value1', 'value2', 123)
                    AND col5 NOT IN ('value1', 'value2', 123)
                    AND col2 = 'abc'
                    AND (col3 = 'CDE' OR col4 CONTAINS ( 'CDE', 'efg' ) )
                    """;

           */
            /*String sql = """
                    SELECT col1, col2
                     FROM myTable, ert
                     WHERE col1 IN ('value1', 'value2', 123)
                     AND col5 NOT IN ('value1', 'value2', 123)
                     AND col2 = 'abc'
                     AND (col3 = 'CDE'
                             OR col4 CONTAINS ( 'CDE', 'efg' )
                             OR (
                                 col1 IN ('value1', 'value2', 123)
                                     AND col5 NOT IN ('value1', 'value2', 123) ) )
                    """;

             */
           // String sql = "SELECT col1, col2 FROM myTable, yourTable WHERE col1 IN ('value1', 'value2', 123) AND col2 = 'abc'";

            // Create a CharStream that reads from the SQL string.
            CharStream input = CharStreams.fromString(sql);

            // Instantiate the lexer using the CharStream.
            ASQLexer lexer = new ASQLexer(input);

            // Generate a token stream from the lexer.
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            // Create the parser using the token stream.
           ASQParser parser = new ASQParser(tokens);

            // Parse the input starting at the 'query' rule.
            ParseTree tree = parser.query();
            System.out.println("Parse Tree: " + tree.toStringTree(parser));

            // Use the custom visitor to build the Java object model.
            QueryBuilderVisitor visitor = new QueryBuilderVisitor();
            SQLQuery queryObject = (SQLQuery) visitor.visit(tree);

            // Serialize the object model to JSON (using Jackson).
            ObjectMapper mapper = new ObjectMapper();
            String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(queryObject);

            System.out.println("Generated JSON:");
            System.out.println(json);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

