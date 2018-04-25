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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, SPACES=8, CHAR=9, 
		PUNCTUATION=10, AND=11, OR=12, NOT=13, GT=14, GE=15, LT=16, LE=17, EQ=18, 
		LPAREN=19, RPAREN=20, MULT=21, DIV=22, PLUS=23, MINUS=24, DECIMAL=25, 
		NEWLINE=26;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "SPACES", "CHAR", 
		"PUNCTUATION", "AND", "OR", "NOT", "GT", "GE", "LT", "LE", "EQ", "LPAREN", 
		"RPAREN", "MULT", "DIV", "PLUS", "MINUS", "DECIMAL", "NEWLINE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'$'", "'{'", "'}'", "','", "':'", "'$$'", "'##'", null, null, null, 
		"'&&'", "'||'", "'!'", "'>'", "'>='", "'<'", "'<='", "'=='", "'('", "')'", 
		"'*'", "'/'", "'+'", "'-'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, "SPACES", "CHAR", "PUNCTUATION", 
		"AND", "OR", "NOT", "GT", "GE", "LT", "LE", "EQ", "LPAREN", "RPAREN", 
		"MULT", "DIV", "PLUS", "MINUS", "DECIMAL", "NEWLINE"
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
		case 25:
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
		case 25:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\34\u0091\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7"+
		"\3\7\3\7\3\b\3\b\3\b\3\t\6\tI\n\t\r\t\16\tJ\3\n\3\n\3\13\3\13\3\f\3\f"+
		"\3\f\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30"+
		"\3\31\3\31\3\32\5\32s\n\32\3\32\6\32v\n\32\r\32\16\32w\3\32\3\32\6\32"+
		"|\n\32\r\32\16\32}\5\32\u0080\n\32\3\33\3\33\3\33\5\33\u0085\n\33\3\33"+
		"\3\33\5\33\u0089\n\33\3\33\5\33\u008c\n\33\5\33\u008e\n\33\3\33\3\33\2"+
		"\2\34\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\3\2\6\4\2"+
		"\13\13\"\"\3\2\u0412\u0451\t\2#$..\60\61==AA^^~~\3\2\62;\2\u0099\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3"+
		"\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2"+
		"%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61"+
		"\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\3\67\3\2\2\2\59\3\2\2\2\7;\3\2\2\2"+
		"\t=\3\2\2\2\13?\3\2\2\2\rA\3\2\2\2\17D\3\2\2\2\21H\3\2\2\2\23L\3\2\2\2"+
		"\25N\3\2\2\2\27P\3\2\2\2\31S\3\2\2\2\33V\3\2\2\2\35X\3\2\2\2\37Z\3\2\2"+
		"\2!]\3\2\2\2#_\3\2\2\2%b\3\2\2\2\'e\3\2\2\2)g\3\2\2\2+i\3\2\2\2-k\3\2"+
		"\2\2/m\3\2\2\2\61o\3\2\2\2\63r\3\2\2\2\65\u008d\3\2\2\2\678\7&\2\28\4"+
		"\3\2\2\29:\7}\2\2:\6\3\2\2\2;<\7\177\2\2<\b\3\2\2\2=>\7.\2\2>\n\3\2\2"+
		"\2?@\7<\2\2@\f\3\2\2\2AB\7&\2\2BC\7&\2\2C\16\3\2\2\2DE\7%\2\2EF\7%\2\2"+
		"F\20\3\2\2\2GI\t\2\2\2HG\3\2\2\2IJ\3\2\2\2JH\3\2\2\2JK\3\2\2\2K\22\3\2"+
		"\2\2LM\t\3\2\2M\24\3\2\2\2NO\t\4\2\2O\26\3\2\2\2PQ\7(\2\2QR\7(\2\2R\30"+
		"\3\2\2\2ST\7~\2\2TU\7~\2\2U\32\3\2\2\2VW\7#\2\2W\34\3\2\2\2XY\7@\2\2Y"+
		"\36\3\2\2\2Z[\7@\2\2[\\\7?\2\2\\ \3\2\2\2]^\7>\2\2^\"\3\2\2\2_`\7>\2\2"+
		"`a\7?\2\2a$\3\2\2\2bc\7?\2\2cd\7?\2\2d&\3\2\2\2ef\7*\2\2f(\3\2\2\2gh\7"+
		"+\2\2h*\3\2\2\2ij\7,\2\2j,\3\2\2\2kl\7\61\2\2l.\3\2\2\2mn\7-\2\2n\60\3"+
		"\2\2\2op\7/\2\2p\62\3\2\2\2qs\7/\2\2rq\3\2\2\2rs\3\2\2\2su\3\2\2\2tv\t"+
		"\5\2\2ut\3\2\2\2vw\3\2\2\2wu\3\2\2\2wx\3\2\2\2x\177\3\2\2\2y{\7\60\2\2"+
		"z|\t\5\2\2{z\3\2\2\2|}\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\u0080\3\2\2\2\177"+
		"y\3\2\2\2\177\u0080\3\2\2\2\u0080\64\3\2\2\2\u0081\u0082\6\33\2\2\u0082"+
		"\u008e\5\21\t\2\u0083\u0085\7\17\2\2\u0084\u0083\3\2\2\2\u0084\u0085\3"+
		"\2\2\2\u0085\u0086\3\2\2\2\u0086\u0089\7\f\2\2\u0087\u0089\7\17\2\2\u0088"+
		"\u0084\3\2\2\2\u0088\u0087\3\2\2\2\u0089\u008b\3\2\2\2\u008a\u008c\5\21"+
		"\t\2\u008b\u008a\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008e\3\2\2\2\u008d"+
		"\u0081\3\2\2\2\u008d\u0088\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0090\b\33"+
		"\2\2\u0090\66\3\2\2\2\f\2Jrw}\177\u0084\u0088\u008b\u008d\3\3\33\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}