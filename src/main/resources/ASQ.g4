// SQL.g4
grammar ASQ;

// Entry point for a SQL query
query
    : select_stmt EOF
    ;



// SELECT statement with optional WHERE clause
select_stmt
    : SELECT columns FROM tables (WHERE condition)?
    ;

// Define columns: either a star or one or more comma-separated columns
columns
    : '*'
    | column (',' column)*
    ;

// A single column represented by an identifier
column
    : IDENTIFIER
    ;

// New rule for a list of tables (one or more, separated by commas)
tables
    : table (',' table)*
    ;

// Table name is an identifier
table
    : IDENTIFIER
    ;

// WHERE clause condition
condition
    : expression
    ;

// Expressions can be binary expressions, parenthesized expressions, or simple predicates
expression
    : expression binary_op expression   #BinaryExpr
    | '(' expression ')'                 #ParenExpr
    | predicate                          #PredicateExpr
    ;

// A predicate can be a comparison or an IN clause
predicate
    : IDENTIFIER op literal              #ComparisonPredicate
    | IDENTIFIER contains_clause         #ContainsPredicate
    | IDENTIFIER in_clause               #InPredicate
    | IDENTIFIER not_in_clause           #NotInPredicate
    ;

contains_clause
    : CONTAINS '(' literal (',' literal)* ')'
    ;

// Rule for IN clause with a list of literals
in_clause
    : IN '(' literal (',' literal)* ')'
    ;

// Rule for NOT IN clause
not_in_clause
    : NOT IN '(' literal (',' literal)* ')'
    ;


// Binary operators: AND, OR
binary_op
    : AND
    | OR
    ;

// Operator can be either a standard operator or a custom operator
op
    : standard_op
    | custom_op
    ;

// Standard comparison operators
standard_op
    : '='
    | '!='
    | '<'
    | '>'
    | '<='
    | '>='
    ;

// Custom operators for extended functionality (example: %% and @@)
custom_op
    : '%%'
    | '@@'
    ;

// Literals: string or number
literal
    : STRING
    | NUMBER
    ;

// Lexer rules for keywords (case insensitive)
SELECT : [Ss][Ee][Ll][Ee][Cc][Tt];
FROM   : [Ff][Rr][Oo][Mm];
WHERE  : [Ww][Hh][Ee][Rr][Ee];
CONTAINS  : [Cc][Oo][Nn][Tt][Aa][Ii][Nn][Ss];
IN     : [Ii][Nn];
NOT      : [Nn][Oo][Tt];    // Added NOT keyword
AND    : [Aa][Nn][Dd];
OR     : [Oo][Rr];


// Identifier: letter or underscore followed by letters, digits, or underscores
IDENTIFIER
    : [a-zA-Z_][a-zA-Z0-9_.]*
    ;

// Number: one or more digits
NUMBER
    : [0-9]+
    ;

// String literal: text enclosed in single quotes (with escape handling)
STRING
    : '\'' ( ~('\'' | '\\') | '\\' . )* '\''
    ;

// Whitespace: skip spaces, tabs, newlines, and carriage returns
WS : [ \t\r\n]+ -> skip;
