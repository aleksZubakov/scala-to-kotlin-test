// Generated from /Users/alekseyzubakov/Documents/programming/internship_test/src/main/java/org.antlr/grammar/CheckList.g4 by ANTLR 4.7
package org.antlr.generated;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CheckListParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, SPACES=5, CHAR=6, PUNCTUATION=7, AND=8, 
		OR=9, NOT=10, GT=11, GE=12, LT=13, LE=14, EQ=15, LPAREN=16, RPAREN=17, 
		DECIMAL=18, NEWLINE=19, INDENT=20, DEDENT=21;
	public static final int
		RULE_file_input = 0, RULE_template = 1, RULE_id = 2, RULE_word = 3, RULE_text = 4, 
		RULE_placeholder = 5, RULE_heading = 6, RULE_stmt = 7, RULE_item = 8, 
		RULE_compound_stmt = 9, RULE_if_stmt = 10, RULE_body = 11, RULE_logical_expr = 12, 
		RULE_atom = 13, RULE_comparator = 14, RULE_binary = 15;
	public static final String[] ruleNames = {
		"file_input", "template", "id", "word", "text", "placeholder", "heading", 
		"stmt", "item", "compound_stmt", "if_stmt", "body", "logical_expr", "atom", 
		"comparator", "binary"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'$'", "'##'", "'{'", "'}'", null, null, null, "'&&'", "'||'", "'!'", 
		"'>'", "'>='", "'<'", "'<='", "'=='", "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, "SPACES", "CHAR", "PUNCTUATION", "AND", 
		"OR", "NOT", "GT", "GE", "LT", "LE", "EQ", "LPAREN", "RPAREN", "DECIMAL", 
		"NEWLINE", "INDENT", "DEDENT"
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

	@Override
	public String getGrammarFileName() { return "CheckList.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CheckListParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class File_inputContext extends ParserRuleContext {
		public List<TemplateContext> template() {
			return getRuleContexts(TemplateContext.class);
		}
		public TemplateContext template(int i) {
			return getRuleContext(TemplateContext.class,i);
		}
		public File_inputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CheckListListener ) ((CheckListListener)listener).enterFile_input(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CheckListListener ) ((CheckListListener)listener).exitFile_input(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CheckListVisitor ) return ((CheckListVisitor<? extends T>)visitor).visitFile_input(this);
			else return visitor.visitChildren(this);
		}
	}

	public final File_inputContext file_input() throws RecognitionException {
		File_inputContext _localctx = new File_inputContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file_input);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1 || _la==NEWLINE) {
				{
				{
				setState(32);
				template();
				}
				}
				setState(37);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TemplateContext extends ParserRuleContext {
		public HeadingContext heading() {
			return getRuleContext(HeadingContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CheckListParser.EOF, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(CheckListParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CheckListParser.NEWLINE, i);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public TemplateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_template; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CheckListListener ) ((CheckListListener)listener).enterTemplate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CheckListListener ) ((CheckListListener)listener).exitTemplate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CheckListVisitor ) return ((CheckListVisitor<? extends T>)visitor).visitTemplate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateContext template() throws RecognitionException {
		TemplateContext _localctx = new TemplateContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_template);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(38);
				match(NEWLINE);
				}
				}
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(44);
			heading();
			setState(46); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(45);
				stmt();
				}
				}
				setState(48); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << SPACES) | (1L << CHAR) | (1L << PUNCTUATION) | (1L << DECIMAL))) != 0) );
			setState(50);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdContext extends ParserRuleContext {
		public List<TerminalNode> CHAR() { return getTokens(CheckListParser.CHAR); }
		public TerminalNode CHAR(int i) {
			return getToken(CheckListParser.CHAR, i);
		}
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CheckListListener ) ((CheckListListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CheckListListener ) ((CheckListListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CheckListVisitor ) return ((CheckListVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(52);
				match(CHAR);
				}
				}
				setState(55); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CHAR );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WordContext extends ParserRuleContext {
		public List<TerminalNode> CHAR() { return getTokens(CheckListParser.CHAR); }
		public TerminalNode CHAR(int i) {
			return getToken(CheckListParser.CHAR, i);
		}
		public WordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_word; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CheckListListener ) ((CheckListListener)listener).enterWord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CheckListListener ) ((CheckListListener)listener).exitWord(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CheckListVisitor ) return ((CheckListVisitor<? extends T>)visitor).visitWord(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WordContext word() throws RecognitionException {
		WordContext _localctx = new WordContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_word);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(58); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(57);
					match(CHAR);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(60); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TextContext extends ParserRuleContext {
		public WordContext word() {
			return getRuleContext(WordContext.class,0);
		}
		public TerminalNode SPACES() { return getToken(CheckListParser.SPACES, 0); }
		public TerminalNode DECIMAL() { return getToken(CheckListParser.DECIMAL, 0); }
		public TerminalNode PUNCTUATION() { return getToken(CheckListParser.PUNCTUATION, 0); }
		public TextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CheckListListener ) ((CheckListListener)listener).enterText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CheckListListener ) ((CheckListListener)listener).exitText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CheckListVisitor ) return ((CheckListVisitor<? extends T>)visitor).visitText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextContext text() throws RecognitionException {
		TextContext _localctx = new TextContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_text);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHAR:
				{
				setState(62);
				word();
				}
				break;
			case SPACES:
				{
				setState(63);
				match(SPACES);
				}
				break;
			case DECIMAL:
				{
				setState(64);
				match(DECIMAL);
				}
				break;
			case PUNCTUATION:
				{
				setState(65);
				match(PUNCTUATION);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PlaceholderContext extends ParserRuleContext {
		public List<TerminalNode> CHAR() { return getTokens(CheckListParser.CHAR); }
		public TerminalNode CHAR(int i) {
			return getToken(CheckListParser.CHAR, i);
		}
		public PlaceholderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_placeholder; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CheckListListener ) ((CheckListListener)listener).enterPlaceholder(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CheckListListener ) ((CheckListListener)listener).exitPlaceholder(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CheckListVisitor ) return ((CheckListVisitor<? extends T>)visitor).visitPlaceholder(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PlaceholderContext placeholder() throws RecognitionException {
		PlaceholderContext _localctx = new PlaceholderContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_placeholder);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(T__0);
			setState(70); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(69);
					match(CHAR);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(72); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HeadingContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(CheckListParser.NEWLINE, 0); }
		public TerminalNode SPACES() { return getToken(CheckListParser.SPACES, 0); }
		public List<TextContext> text() {
			return getRuleContexts(TextContext.class);
		}
		public TextContext text(int i) {
			return getRuleContext(TextContext.class,i);
		}
		public HeadingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_heading; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CheckListListener ) ((CheckListListener)listener).enterHeading(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CheckListListener ) ((CheckListListener)listener).exitHeading(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CheckListVisitor ) return ((CheckListVisitor<? extends T>)visitor).visitHeading(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeadingContext heading() throws RecognitionException {
		HeadingContext _localctx = new HeadingContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_heading);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(74);
			match(T__1);
			}
			setState(76);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(75);
				match(SPACES);
				}
				break;
			}
			setState(79); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(78);
				text();
				}
				}
				setState(81); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACES) | (1L << CHAR) | (1L << PUNCTUATION) | (1L << DECIMAL))) != 0) );
			setState(83);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StmtContext extends ParserRuleContext {
		public ItemContext item() {
			return getRuleContext(ItemContext.class,0);
		}
		public Compound_stmtContext compound_stmt() {
			return getRuleContext(Compound_stmtContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CheckListListener ) ((CheckListListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CheckListListener ) ((CheckListListener)listener).exitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CheckListVisitor ) return ((CheckListVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_stmt);
		try {
			setState(87);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				item();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				compound_stmt();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ItemContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(CheckListParser.NEWLINE, 0); }
		public List<TextContext> text() {
			return getRuleContexts(TextContext.class);
		}
		public TextContext text(int i) {
			return getRuleContext(TextContext.class,i);
		}
		public List<PlaceholderContext> placeholder() {
			return getRuleContexts(PlaceholderContext.class);
		}
		public PlaceholderContext placeholder(int i) {
			return getRuleContext(PlaceholderContext.class,i);
		}
		public ItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CheckListListener ) ((CheckListListener)listener).enterItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CheckListListener ) ((CheckListListener)listener).exitItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CheckListVisitor ) return ((CheckListVisitor<? extends T>)visitor).visitItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ItemContext item() throws RecognitionException {
		ItemContext _localctx = new ItemContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(91);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SPACES:
				case CHAR:
				case PUNCTUATION:
				case DECIMAL:
					{
					setState(89);
					text();
					}
					break;
				case T__0:
					{
					setState(90);
					placeholder();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(93); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << SPACES) | (1L << CHAR) | (1L << PUNCTUATION) | (1L << DECIMAL))) != 0) );
			setState(95);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Compound_stmtContext extends ParserRuleContext {
		public If_stmtContext if_stmt() {
			return getRuleContext(If_stmtContext.class,0);
		}
		public Compound_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CheckListListener ) ((CheckListListener)listener).enterCompound_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CheckListListener ) ((CheckListListener)listener).exitCompound_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CheckListVisitor ) return ((CheckListVisitor<? extends T>)visitor).visitCompound_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Compound_stmtContext compound_stmt() throws RecognitionException {
		Compound_stmtContext _localctx = new Compound_stmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_compound_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			if_stmt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_stmtContext extends ParserRuleContext {
		public Logical_exprContext logical_expr() {
			return getRuleContext(Logical_exprContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public If_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CheckListListener ) ((CheckListListener)listener).enterIf_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CheckListListener ) ((CheckListListener)listener).exitIf_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CheckListVisitor ) return ((CheckListVisitor<? extends T>)visitor).visitIf_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_stmtContext if_stmt() throws RecognitionException {
		If_stmtContext _localctx = new If_stmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_if_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(T__0);
			setState(100);
			match(T__2);
			setState(101);
			logical_expr(0);
			setState(102);
			match(T__3);
			setState(103);
			body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BodyContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(CheckListParser.NEWLINE, 0); }
		public TerminalNode INDENT() { return getToken(CheckListParser.INDENT, 0); }
		public TerminalNode DEDENT() { return getToken(CheckListParser.DEDENT, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CheckListListener ) ((CheckListListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CheckListListener ) ((CheckListListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CheckListVisitor ) return ((CheckListVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(NEWLINE);
			setState(106);
			match(INDENT);
			setState(108); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(107);
				stmt();
				}
				}
				setState(110); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << SPACES) | (1L << CHAR) | (1L << PUNCTUATION) | (1L << DECIMAL))) != 0) );
			setState(112);
			match(DEDENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Logical_exprContext extends ParserRuleContext {
		public Logical_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_expr; }
	 
		public Logical_exprContext() { }
		public void copyFrom(Logical_exprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BinaryExpressionContext extends Logical_exprContext {
		public Logical_exprContext left;
		public BinaryContext op;
		public Logical_exprContext right;
		public List<Logical_exprContext> logical_expr() {
			return getRuleContexts(Logical_exprContext.class);
		}
		public Logical_exprContext logical_expr(int i) {
			return getRuleContext(Logical_exprContext.class,i);
		}
		public BinaryContext binary() {
			return getRuleContext(BinaryContext.class,0);
		}
		public List<TerminalNode> SPACES() { return getTokens(CheckListParser.SPACES); }
		public TerminalNode SPACES(int i) {
			return getToken(CheckListParser.SPACES, i);
		}
		public BinaryExpressionContext(Logical_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CheckListListener ) ((CheckListListener)listener).enterBinaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CheckListListener ) ((CheckListListener)listener).exitBinaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CheckListVisitor ) return ((CheckListVisitor<? extends T>)visitor).visitBinaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotExpressionContext extends Logical_exprContext {
		public TerminalNode NOT() { return getToken(CheckListParser.NOT, 0); }
		public Logical_exprContext logical_expr() {
			return getRuleContext(Logical_exprContext.class,0);
		}
		public NotExpressionContext(Logical_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CheckListListener ) ((CheckListListener)listener).enterNotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CheckListListener ) ((CheckListListener)listener).exitNotExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CheckListVisitor ) return ((CheckListVisitor<? extends T>)visitor).visitNotExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenExpressionContext extends Logical_exprContext {
		public TerminalNode LPAREN() { return getToken(CheckListParser.LPAREN, 0); }
		public Logical_exprContext logical_expr() {
			return getRuleContext(Logical_exprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CheckListParser.RPAREN, 0); }
		public List<TerminalNode> SPACES() { return getTokens(CheckListParser.SPACES); }
		public TerminalNode SPACES(int i) {
			return getToken(CheckListParser.SPACES, i);
		}
		public ParenExpressionContext(Logical_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CheckListListener ) ((CheckListListener)listener).enterParenExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CheckListListener ) ((CheckListListener)listener).exitParenExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CheckListVisitor ) return ((CheckListVisitor<? extends T>)visitor).visitParenExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComparatorExpressionContext extends Logical_exprContext {
		public AtomContext left;
		public ComparatorContext op;
		public AtomContext right;
		public List<AtomContext> atom() {
			return getRuleContexts(AtomContext.class);
		}
		public AtomContext atom(int i) {
			return getRuleContext(AtomContext.class,i);
		}
		public ComparatorContext comparator() {
			return getRuleContext(ComparatorContext.class,0);
		}
		public List<TerminalNode> SPACES() { return getTokens(CheckListParser.SPACES); }
		public TerminalNode SPACES(int i) {
			return getToken(CheckListParser.SPACES, i);
		}
		public ComparatorExpressionContext(Logical_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CheckListListener ) ((CheckListListener)listener).enterComparatorExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CheckListListener ) ((CheckListListener)listener).exitComparatorExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CheckListVisitor ) return ((CheckListVisitor<? extends T>)visitor).visitComparatorExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logical_exprContext logical_expr() throws RecognitionException {
		return logical_expr(0);
	}

	private Logical_exprContext logical_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Logical_exprContext _localctx = new Logical_exprContext(_ctx, _parentState);
		Logical_exprContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_logical_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				{
				_localctx = new ParenExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(115);
				match(LPAREN);
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACES) {
					{
					setState(116);
					match(SPACES);
					}
				}

				setState(119);
				logical_expr(0);
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACES) {
					{
					setState(120);
					match(SPACES);
					}
				}

				setState(123);
				match(RPAREN);
				}
				break;
			case NOT:
				{
				_localctx = new NotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(125);
				match(NOT);
				setState(126);
				logical_expr(3);
				}
				break;
			case T__0:
			case DECIMAL:
				{
				_localctx = new ComparatorExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(127);
				((ComparatorExpressionContext)_localctx).left = atom();
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACES) {
					{
					setState(128);
					match(SPACES);
					}
				}

				setState(131);
				((ComparatorExpressionContext)_localctx).op = comparator();
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACES) {
					{
					setState(132);
					match(SPACES);
					}
				}

				setState(135);
				((ComparatorExpressionContext)_localctx).right = atom();

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(152);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BinaryExpressionContext(new Logical_exprContext(_parentctx, _parentState));
					((BinaryExpressionContext)_localctx).left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_logical_expr);
					setState(140);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(142);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SPACES) {
						{
						setState(141);
						match(SPACES);
						}
					}

					setState(144);
					((BinaryExpressionContext)_localctx).op = binary();
					setState(146);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SPACES) {
						{
						setState(145);
						match(SPACES);
						}
					}

					setState(148);
					((BinaryExpressionContext)_localctx).right = logical_expr(2);
					}
					} 
				}
				setState(154);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AtomContext extends ParserRuleContext {
		public PlaceholderContext placeholder() {
			return getRuleContext(PlaceholderContext.class,0);
		}
		public TerminalNode DECIMAL() { return getToken(CheckListParser.DECIMAL, 0); }
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CheckListListener ) ((CheckListListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CheckListListener ) ((CheckListListener)listener).exitAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CheckListVisitor ) return ((CheckListVisitor<? extends T>)visitor).visitAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_atom);
		try {
			setState(157);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				placeholder();
				}
				break;
			case DECIMAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
				match(DECIMAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComparatorContext extends ParserRuleContext {
		public TerminalNode GT() { return getToken(CheckListParser.GT, 0); }
		public TerminalNode GE() { return getToken(CheckListParser.GE, 0); }
		public TerminalNode LT() { return getToken(CheckListParser.LT, 0); }
		public TerminalNode LE() { return getToken(CheckListParser.LE, 0); }
		public TerminalNode EQ() { return getToken(CheckListParser.EQ, 0); }
		public ComparatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CheckListListener ) ((CheckListListener)listener).enterComparator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CheckListListener ) ((CheckListListener)listener).exitComparator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CheckListVisitor ) return ((CheckListVisitor<? extends T>)visitor).visitComparator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparatorContext comparator() throws RecognitionException {
		ComparatorContext _localctx = new ComparatorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_comparator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << GE) | (1L << LT) | (1L << LE) | (1L << EQ))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BinaryContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(CheckListParser.AND, 0); }
		public TerminalNode OR() { return getToken(CheckListParser.OR, 0); }
		public BinaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CheckListListener ) ((CheckListListener)listener).enterBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CheckListListener ) ((CheckListListener)listener).exitBinary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CheckListVisitor ) return ((CheckListVisitor<? extends T>)visitor).visitBinary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryContext binary() throws RecognitionException {
		BinaryContext _localctx = new BinaryContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_binary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			_la = _input.LA(1);
			if ( !(_la==AND || _la==OR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 12:
			return logical_expr_sempred((Logical_exprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean logical_expr_sempred(Logical_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\27\u00a6\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\7\2"+
		"$\n\2\f\2\16\2\'\13\2\3\3\7\3*\n\3\f\3\16\3-\13\3\3\3\3\3\6\3\61\n\3\r"+
		"\3\16\3\62\3\3\3\3\3\4\6\48\n\4\r\4\16\49\3\5\6\5=\n\5\r\5\16\5>\3\6\3"+
		"\6\3\6\3\6\5\6E\n\6\3\7\3\7\6\7I\n\7\r\7\16\7J\3\b\3\b\5\bO\n\b\3\b\6"+
		"\bR\n\b\r\b\16\bS\3\b\3\b\3\t\3\t\5\tZ\n\t\3\n\3\n\6\n^\n\n\r\n\16\n_"+
		"\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\6\ro\n\r\r\r\16"+
		"\rp\3\r\3\r\3\16\3\16\3\16\5\16x\n\16\3\16\3\16\5\16|\n\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\5\16\u0084\n\16\3\16\3\16\5\16\u0088\n\16\3\16\3\16"+
		"\3\16\5\16\u008d\n\16\3\16\3\16\5\16\u0091\n\16\3\16\3\16\5\16\u0095\n"+
		"\16\3\16\3\16\7\16\u0099\n\16\f\16\16\16\u009c\13\16\3\17\3\17\5\17\u00a0"+
		"\n\17\3\20\3\20\3\21\3\21\3\21\2\3\32\22\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \2\4\3\2\r\21\3\2\n\13\2\u00ae\2%\3\2\2\2\4+\3\2\2\2\6\67\3"+
		"\2\2\2\b<\3\2\2\2\nD\3\2\2\2\fF\3\2\2\2\16L\3\2\2\2\20Y\3\2\2\2\22]\3"+
		"\2\2\2\24c\3\2\2\2\26e\3\2\2\2\30k\3\2\2\2\32\u008c\3\2\2\2\34\u009f\3"+
		"\2\2\2\36\u00a1\3\2\2\2 \u00a3\3\2\2\2\"$\5\4\3\2#\"\3\2\2\2$\'\3\2\2"+
		"\2%#\3\2\2\2%&\3\2\2\2&\3\3\2\2\2\'%\3\2\2\2(*\7\25\2\2)(\3\2\2\2*-\3"+
		"\2\2\2+)\3\2\2\2+,\3\2\2\2,.\3\2\2\2-+\3\2\2\2.\60\5\16\b\2/\61\5\20\t"+
		"\2\60/\3\2\2\2\61\62\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63\64\3\2\2\2"+
		"\64\65\7\2\2\3\65\5\3\2\2\2\668\7\b\2\2\67\66\3\2\2\289\3\2\2\29\67\3"+
		"\2\2\29:\3\2\2\2:\7\3\2\2\2;=\7\b\2\2<;\3\2\2\2=>\3\2\2\2><\3\2\2\2>?"+
		"\3\2\2\2?\t\3\2\2\2@E\5\b\5\2AE\7\7\2\2BE\7\24\2\2CE\7\t\2\2D@\3\2\2\2"+
		"DA\3\2\2\2DB\3\2\2\2DC\3\2\2\2E\13\3\2\2\2FH\7\3\2\2GI\7\b\2\2HG\3\2\2"+
		"\2IJ\3\2\2\2JH\3\2\2\2JK\3\2\2\2K\r\3\2\2\2LN\7\4\2\2MO\7\7\2\2NM\3\2"+
		"\2\2NO\3\2\2\2OQ\3\2\2\2PR\5\n\6\2QP\3\2\2\2RS\3\2\2\2SQ\3\2\2\2ST\3\2"+
		"\2\2TU\3\2\2\2UV\7\25\2\2V\17\3\2\2\2WZ\5\22\n\2XZ\5\24\13\2YW\3\2\2\2"+
		"YX\3\2\2\2Z\21\3\2\2\2[^\5\n\6\2\\^\5\f\7\2][\3\2\2\2]\\\3\2\2\2^_\3\2"+
		"\2\2_]\3\2\2\2_`\3\2\2\2`a\3\2\2\2ab\7\25\2\2b\23\3\2\2\2cd\5\26\f\2d"+
		"\25\3\2\2\2ef\7\3\2\2fg\7\5\2\2gh\5\32\16\2hi\7\6\2\2ij\5\30\r\2j\27\3"+
		"\2\2\2kl\7\25\2\2ln\7\26\2\2mo\5\20\t\2nm\3\2\2\2op\3\2\2\2pn\3\2\2\2"+
		"pq\3\2\2\2qr\3\2\2\2rs\7\27\2\2s\31\3\2\2\2tu\b\16\1\2uw\7\22\2\2vx\7"+
		"\7\2\2wv\3\2\2\2wx\3\2\2\2xy\3\2\2\2y{\5\32\16\2z|\7\7\2\2{z\3\2\2\2{"+
		"|\3\2\2\2|}\3\2\2\2}~\7\23\2\2~\u008d\3\2\2\2\177\u0080\7\f\2\2\u0080"+
		"\u008d\5\32\16\5\u0081\u0083\5\34\17\2\u0082\u0084\7\7\2\2\u0083\u0082"+
		"\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0087\5\36\20\2"+
		"\u0086\u0088\7\7\2\2\u0087\u0086\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0089"+
		"\3\2\2\2\u0089\u008a\5\34\17\2\u008a\u008b\b\16\1\2\u008b\u008d\3\2\2"+
		"\2\u008ct\3\2\2\2\u008c\177\3\2\2\2\u008c\u0081\3\2\2\2\u008d\u009a\3"+
		"\2\2\2\u008e\u0090\f\3\2\2\u008f\u0091\7\7\2\2\u0090\u008f\3\2\2\2\u0090"+
		"\u0091\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0094\5 \21\2\u0093\u0095\7\7"+
		"\2\2\u0094\u0093\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0096\3\2\2\2\u0096"+
		"\u0097\5\32\16\4\u0097\u0099\3\2\2\2\u0098\u008e\3\2\2\2\u0099\u009c\3"+
		"\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\33\3\2\2\2\u009c"+
		"\u009a\3\2\2\2\u009d\u00a0\5\f\7\2\u009e\u00a0\7\24\2\2\u009f\u009d\3"+
		"\2\2\2\u009f\u009e\3\2\2\2\u00a0\35\3\2\2\2\u00a1\u00a2\t\2\2\2\u00a2"+
		"\37\3\2\2\2\u00a3\u00a4\t\3\2\2\u00a4!\3\2\2\2\30%+\629>DJNSY]_pw{\u0083"+
		"\u0087\u008c\u0090\u0094\u009a\u009f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}