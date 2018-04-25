grammar CheckList;

tokens { INDENT, DEDENT }

@lexer::members {
  // queue for extra tokens
  private java.util.LinkedList<Token> tokens = new java.util.LinkedList<>();

  // stack for keeping track of the indentation level
  private java.util.Stack<Integer> indents = new java.util.Stack<>();

  // amount of opened braces, brackets and parenthesis.
  private int opened = 0;

  // The most recently produced token.
  private Token lastToken = null;
  @Override
  public void emit(Token t) {
    super.setToken(t);
    tokens.offer(t);
  }

  @Override
  public Token nextToken() {
    // check if the end-of-file is ahead and there are still some DEDENTS expected
    if (_input.LA(1) == EOF && !this.indents.isEmpty()) {
      // remove any trailing EOF tokens from our buffer.
      for (int i = tokens.size() - 1; i >= 0; i--) {
        if (tokens.get(i).getType() == EOF) {
          tokens.remove(i);
        }
      }

      // first emit an extra line break that serves as the end of the statement
      this.emit(commonToken(CheckListParser.NEWLINE, "\n"));

      // now emit as much DEDENT tokens as needed
      while (!indents.isEmpty()) {
        this.emit(createDedent());
        indents.pop();
      }

      // put the EOF back on the token stream
      this.emit(commonToken(CheckListParser.EOF, "<EOF>"));
    }

    Token next = super.nextToken();

    if (next.getChannel() == Token.DEFAULT_CHANNEL) {
      // Keep track of the last token on the default channel.
      this.lastToken = next;
    }

    return tokens.isEmpty() ? next : tokens.poll();
  }

  private Token createDedent() {
    CommonToken dedent = commonToken(CheckListParser.DEDENT, "");
    dedent.setLine(this.lastToken.getLine());
    return dedent;
  }

  private CommonToken commonToken(int type, String text) {
    int stop = this.getCharIndex() - 1;
    int start = text.isEmpty() ? stop : stop - text.length() + 1;
    return new CommonToken(this._tokenFactorySourcePair, type, DEFAULT_TOKEN_CHANNEL, start, stop);
  }

  static int getIndentationCount(String spaces) {
    int count = 0;
    for (char ch : spaces.toCharArray()) {
      switch (ch) {
        case '\t':
          count += 8 - (count % 8);
          break;
        default:
          // A normal space char.
          count++;
      }
    }

    return count;
  }

  boolean atStartOfInput() {
    return super.getCharPositionInLine() == 0 && super.getLine() == 1;
  }
}

// template file rule
file_input: template*;

template:
    (NEWLINE)*
    heading
    stmt+
    EOF;

SPACES
 : [ \t]+
 ;

//SKIP_
// : ( SPACES )
// ;

CHAR: [а-яА-Я-];
PUNCTUATION: [.,;"!?\\|/];
id: CHAR+;

word: CHAR+;
text: (word | SPACES | DECIMAL | PUNCTUATION);
placeholder: '$' CHAR+;

// template title/description
heading: ('##') SPACES? (text)+ NEWLINE;

stmt: item | compound_stmt;

item: (text | placeholder)+ NEWLINE;

compound_stmt: if_stmt;

// rules that parse ${чтоТо < чегоТо}
if_stmt: '$' '{' logical_expr '}' body;

body: NEWLINE INDENT stmt+ DEDENT;
logical_expr
 : LPAREN SPACES? logical_expr SPACES? RPAREN                     #parenExpression
 | NOT logical_expr                               #notExpression
 | left=atom SPACES? op=comparator SPACES? right=atom {}             #comparatorExpression
 | left=logical_expr SPACES? op=binary SPACES? right=logical_expr #binaryExpression
 ;

atom
  : word
  | DECIMAL
  ;

comparator
 : GT | GE | LT | LE | EQ
 ;

binary
 : AND | OR
 ;

AND        : '&&' ;
OR         : '||' ;
NOT        : '!';
GT         : '>' ;
GE         : '>=' ;
LT         : '<' ;
LE         : '<=' ;
EQ         : '==' ;
LPAREN     : '(' ;
RPAREN     : ')' ;
DECIMAL    : '-'? [0-9]+ ( '.' [0-9]+ )? ;

NEWLINE
 : ( {atStartOfInput()}?   SPACES
   | ( '\r'? '\n' | '\r' ) SPACES?
   )
   {
     String newLine = getText().replaceAll("[^\r\n]+", "");
     String spaces = getText().replaceAll("[\r\n]+", "");
     int next = _input.LA(1);
     if (opened > 0 || next == '\r' || next == '\n' || next == '#') {
       // If we're inside a list or on a blank line, ignore all indents,
       // dedents and line breaks.
       skip();
     }
     else {
       emit(commonToken(NEWLINE, newLine));
       int indent = getIndentationCount(spaces);
       int previous = indents.isEmpty() ? 0 : indents.peek();
       if (indent == previous) {
         // skip indents of the same size as the present indent-size
         skip();
       }
       else if (indent > previous) {
         indents.push(indent);
         emit(commonToken(CheckListParser.INDENT, spaces));
       }
       else {
         // Possibly emit more than 1 DEDENT token.
         while(!indents.isEmpty() && indents.peek() > indent) {
           this.emit(createDedent());
           indents.pop();
         }
       }
     }
   }
 ;