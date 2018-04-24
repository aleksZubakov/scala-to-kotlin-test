// Generated from /Users/alekseyzubakov/Documents/programming/internship_test/src/main/java/org.antlr/grammar/CheckList.g4 by ANTLR 4.7
package org.antlr.generated;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CheckListLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, SKIP_=5, CHAR=6, PUNCTUATION=7, AND=8, 
		OR=9, NOT=10, TRUE=11, FALSE=12, GT=13, GE=14, LT=15, LE=16, EQ=17, LPAREN=18, 
		RPAREN=19, DECIMAL=20, NEWLINE=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "SPACES", "SKIP_", "CHAR", "PUNCTUATION", 
		"AND", "OR", "NOT", "TRUE", "FALSE", "GT", "GE", "LT", "LE", "EQ", "LPAREN", 
		"RPAREN", "DECIMAL", "NEWLINE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'##'", "'$'", "'{'", "'}'", null, null, null, "'&&'", "'||'", "'!'", 
		"'TRUE'", "'FALSE'", "'>'", "'>='", "'<'", "'<='", "'=='", "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, "SKIP_", "CHAR", "PUNCTUATION", "AND", "OR", 
		"NOT", "TRUE", "FALSE", "GT", "GE", "LT", "LE", "EQ", "LPAREN", "RPAREN", 
		"DECIMAL", "NEWLINE"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


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


	public CheckListLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CheckList.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 21:
			NEWLINE_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void NEWLINE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:

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
			   
			break;
		}
	}
	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 21:
			return NEWLINE_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean NEWLINE_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return atStartOfInput();
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\27\u0089\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\3"+
		"\3\3\3\3\4\3\4\3\5\3\5\3\6\6\6:\n\6\r\6\16\6;\3\7\3\7\3\7\3\7\3\b\3\b"+
		"\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3"+
		"\22\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\26\5\26k\n\26\3\26\6\26n\n\26"+
		"\r\26\16\26o\3\26\3\26\6\26t\n\26\r\26\16\26u\5\26x\n\26\3\27\3\27\3\27"+
		"\5\27}\n\27\3\27\3\27\5\27\u0081\n\27\3\27\5\27\u0084\n\27\5\27\u0086"+
		"\n\27\3\27\3\27\2\2\30\3\3\5\4\7\5\t\6\13\2\r\7\17\b\21\t\23\n\25\13\27"+
		"\f\31\r\33\16\35\17\37\20!\21#\22%\23\'\24)\25+\26-\27\3\2\6\4\2\13\13"+
		"\"\"\4\2//\u0412\u0451\6\2$$..\60\60==\3\2\62;\2\u0090\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35"+
		"\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)"+
		"\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\3/\3\2\2\2\5\62\3\2\2\2\7\64\3\2\2\2\t"+
		"\66\3\2\2\2\139\3\2\2\2\r=\3\2\2\2\17A\3\2\2\2\21C\3\2\2\2\23E\3\2\2\2"+
		"\25H\3\2\2\2\27K\3\2\2\2\31M\3\2\2\2\33R\3\2\2\2\35X\3\2\2\2\37Z\3\2\2"+
		"\2!]\3\2\2\2#_\3\2\2\2%b\3\2\2\2\'e\3\2\2\2)g\3\2\2\2+j\3\2\2\2-\u0085"+
		"\3\2\2\2/\60\7%\2\2\60\61\7%\2\2\61\4\3\2\2\2\62\63\7&\2\2\63\6\3\2\2"+
		"\2\64\65\7}\2\2\65\b\3\2\2\2\66\67\7\177\2\2\67\n\3\2\2\28:\t\2\2\298"+
		"\3\2\2\2:;\3\2\2\2;9\3\2\2\2;<\3\2\2\2<\f\3\2\2\2=>\5\13\6\2>?\3\2\2\2"+
		"?@\b\7\2\2@\16\3\2\2\2AB\t\3\2\2B\20\3\2\2\2CD\t\4\2\2D\22\3\2\2\2EF\7"+
		"(\2\2FG\7(\2\2G\24\3\2\2\2HI\7~\2\2IJ\7~\2\2J\26\3\2\2\2KL\7#\2\2L\30"+
		"\3\2\2\2MN\7V\2\2NO\7T\2\2OP\7W\2\2PQ\7G\2\2Q\32\3\2\2\2RS\7H\2\2ST\7"+
		"C\2\2TU\7N\2\2UV\7U\2\2VW\7G\2\2W\34\3\2\2\2XY\7@\2\2Y\36\3\2\2\2Z[\7"+
		"@\2\2[\\\7?\2\2\\ \3\2\2\2]^\7>\2\2^\"\3\2\2\2_`\7>\2\2`a\7?\2\2a$\3\2"+
		"\2\2bc\7?\2\2cd\7?\2\2d&\3\2\2\2ef\7*\2\2f(\3\2\2\2gh\7+\2\2h*\3\2\2\2"+
		"ik\7/\2\2ji\3\2\2\2jk\3\2\2\2km\3\2\2\2ln\t\5\2\2ml\3\2\2\2no\3\2\2\2"+
		"om\3\2\2\2op\3\2\2\2pw\3\2\2\2qs\7\60\2\2rt\t\5\2\2sr\3\2\2\2tu\3\2\2"+
		"\2us\3\2\2\2uv\3\2\2\2vx\3\2\2\2wq\3\2\2\2wx\3\2\2\2x,\3\2\2\2yz\6\27"+
		"\2\2z\u0086\5\13\6\2{}\7\17\2\2|{\3\2\2\2|}\3\2\2\2}~\3\2\2\2~\u0081\7"+
		"\f\2\2\177\u0081\7\17\2\2\u0080|\3\2\2\2\u0080\177\3\2\2\2\u0081\u0083"+
		"\3\2\2\2\u0082\u0084\5\13\6\2\u0083\u0082\3\2\2\2\u0083\u0084\3\2\2\2"+
		"\u0084\u0086\3\2\2\2\u0085y\3\2\2\2\u0085\u0080\3\2\2\2\u0086\u0087\3"+
		"\2\2\2\u0087\u0088\b\27\3\2\u0088.\3\2\2\2\f\2;jouw|\u0080\u0083\u0085"+
		"\4\b\2\2\3\27\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}