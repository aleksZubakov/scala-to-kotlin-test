parser grammar CheckList;

options { tokenVocab=CheckListLexer; }

template:
    (NEWLINE)*
    heading
    stmt+
    EOF;


punc: PUNCTUATION?;
word: CHAR+;
text: (word | PUNCTUATION  | DECIMAL | SPACES );
placeholder: simple_placeholder| placeholder_with_body;
simple_placeholder: '$' word;

placeholder_with_body: '$' '{' placeholder_body '}';
placeholder_body: arithmetic_expr;

function_call: func_name=word '(' var_ref ')';
var_ref: rvalue? | rvalue (',' rvalue)*;

var_assign: var_def ':' varValue=rvalue NEWLINE;
description: text+;
var_def: description ':' lval=word ':' varType=word;
rvalue: DECIMAL | word | arithmetic_expr;

func_def: '$$' name=word LPAREN args RPAREN body;
args: arg? (',' arg)*; // check fun(, arg)
arg: lval=word ':' varType=word;

// template title/description
heading: ('##') text+ NEWLINE;
stmt: item | compound_stmt;

item: (function_call | placeholder | text)+ NEWLINE+;

compound_stmt: if_stmt | var_assign | func_def;

// rules that parse ${чтоТо < чегоТо}
if_stmt: '$' '{' logical_expr '}' body;

body: NEWLINE INDENT stmt+ DEDENT;
logical_expr
 : LPAREN    logical_expr RPAREN                    #parenExpression
 | NOT       logical_expr                           #notExpression
 | left=atom op=comparator right=atom {}            #comparatorAtom
 | left=logical_expr op=binary right=logical_expr   #binaryExpression

;

arithmetic_expr
 : left=arithmetic_expr op=arithm_muldiv  right=arithmetic_expr    # arithmeticMultDivExpression
 | left=arithmetic_expr op=arithm_plusminus right=arithmetic_expr  # arithmeticPlusMinusExpression
 | LPAREN arithmetic_expr RPAREN                                   # arithmeticExpressionParens
 | MINUS arithmetic_expr                                           # arithmeticExpressionNegation
 | atom                                                            # arithmeticAtomExpression
 ;

atom
  : word
  | DECIMAL
  | '(' arithmetic_expr ')'
  ;

comparator
 : GT | GE | LT | LE | EQ
 ;

arithm_muldiv: MULT | DIV;
arithm_plusminus: PLUS | MINUS;

binary
 : AND | OR
 ;

