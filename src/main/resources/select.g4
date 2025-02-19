// SQL.g4
grammar SQL;

// ----- Parser Rules -----

query
    : select_stmt EOF
    ;

select_stmt
    : SELECT columns FROM table (WHERE condition)?
    ;

columns
    : '*' 
    | column (',' column)*
    ;

column
    : IDENTIFIER
    ;

table
    : IDENTIFIER
    ;

condition
    : expression
    ;

expression
    : expression binary_op expression      #BinaryExpr
    | '(' expression ')'                     #ParenExpr
    | predicate                            #PredicateExpr
    ;

predicate
    : IDENTIFIER op literal
    ;

binary_op
    : AND
    | OR
    ;

op
    : standard_op
    | custom_op
    ;

standard_op
    : '='
    | '!='
    | '<'
    | '>'
    | '<='
    | '>='
    ;

custom_op
    : '%%'   // example custom operator
    | '@@'   // another custom operator
    ;

literal
    : STRING
    | NUMBER
    ;

// ----- Lexer Rules -----

SELECT : [Ss][Ee][Ll][Ee][Cc][Tt];
FROM   : [Ff][Rr][Oo][Mm];
WHERE  : [Ww][Hh][Ee][Rr][Ee];
AND    : [Aa][Nn][Dd];
OR     : [Oo][Rr];

IDENTIFIER
    : [a-zA-Z_][a-zA-Z0-9_]*
    ;

NUMBER
    : [0-9]+
    ;

STRING
    : '\'' ( ~('\'' | '\\') | '\\' . )* '\''
    ;

// Skip whitespace and newlines
WS : [ \t\r\n]+ -> skip;
