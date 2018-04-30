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
public class CheckList extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INDENT=1, DEDENT=2, COMMA=3, SPACES=4, CHAR=5, PUNCTUATION=6, AND=7, OR=8, 
		NOT=9, GT=10, GE=11, LT=12, LE=13, EQ=14, LPAREN=15, RPAREN=16, MULT=17, 
		DIV=18, PLUS=19, MINUS=20, LBRACE=21, RBRACE=22, HEADER=23, COLONS=24, 
		DOLLAR=25, DOLLARS=26, DECIMAL=27, NEWLINE=28;
	public static final int
		RULE_template = 0, RULE_punc = 1, RULE_word = 2, RULE_text = 3, RULE_placeholder = 4, 
		RULE_simple_placeholder = 5, RULE_placeholder_with_body = 6, RULE_placeholder_body = 7, 
		RULE_function_call = 8, RULE_var_ref = 9, RULE_var_assign = 10, RULE_description = 11, 
		RULE_var_def = 12, RULE_rvalue = 13, RULE_func_def = 14, RULE_args = 15, 
		RULE_arg = 16, RULE_heading = 17, RULE_stmt = 18, RULE_item = 19, RULE_compound_stmt = 20, 
		RULE_if_stmt = 21, RULE_body = 22, RULE_logical_expr = 23, RULE_arithmetic_expr = 24, 
		RULE_atom = 25, RULE_comparator = 26, RULE_arithm_muldiv = 27, RULE_arithm_plusminus = 28, 
		RULE_binary = 29;
	public static final String[] ruleNames = {
		"template", "punc", "word", "text", "placeholder", "simple_placeholder", 
		"placeholder_with_body", "placeholder_body", "function_call", "var_ref", 
		"var_assign", "description", "var_def", "rvalue", "func_def", "args", 
		"arg", "heading", "stmt", "item", "compound_stmt", "if_stmt", "body", 
		"logical_expr", "arithmetic_expr", "atom", "comparator", "arithm_muldiv", 
		"arithm_plusminus", "binary"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, "','", null, null, null, "'&&'", "'||'", "'!'", "'>'", 
		"'>='", "'<'", "'<='", "'=='", "'('", "')'", "'*'", "'/'", "'+'", "'-'", 
		"'{'", "'}'", "'##'", "':'", "'$'", "'$$'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "INDENT", "DEDENT", "COMMA", "SPACES", "CHAR", "PUNCTUATION", "AND", 
		"OR", "NOT", "GT", "GE", "LT", "LE", "EQ", "LPAREN", "RPAREN", "MULT", 
		"DIV", "PLUS", "MINUS", "LBRACE", "RBRACE", "HEADER", "COLONS", "DOLLAR", 
		"DOLLARS", "DECIMAL", "NEWLINE"
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

	public CheckList(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class TemplateContext extends ParserRuleContext {
		public HeadingContext heading() {
			return getRuleContext(HeadingContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CheckList.EOF, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(CheckList.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CheckList.NEWLINE, i);
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
		enterRule(_localctx, 0, RULE_template);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(60);
				match(NEWLINE);
				}
				}
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(66);
			heading();
			setState(68); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(67);
				stmt();
				}
				}
				setState(70); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACES) | (1L << CHAR) | (1L << PUNCTUATION) | (1L << DOLLAR) | (1L << DOLLARS) | (1L << DECIMAL))) != 0) );
			setState(72);
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

	public static class PuncContext extends ParserRuleContext {
		public TerminalNode PUNCTUATION() { return getToken(CheckList.PUNCTUATION, 0); }
		public PuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_punc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CheckListListener ) ((CheckListListener)listener).enterPunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CheckListListener ) ((CheckListListener)listener).exitPunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CheckListVisitor ) return ((CheckListVisitor<? extends T>)visitor).visitPunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PuncContext punc() throws RecognitionException {
		PuncContext _localctx = new PuncContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_punc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PUNCTUATION) {
				{
				setState(74);
				match(PUNCTUATION);
				}
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

	public static class WordContext extends ParserRuleContext {
		public List<TerminalNode> CHAR() { return getTokens(CheckList.CHAR); }
		public TerminalNode CHAR(int i) {
			return getToken(CheckList.CHAR, i);
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
		enterRule(_localctx, 4, RULE_word);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(78); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(77);
					match(CHAR);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(80); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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
		public TerminalNode PUNCTUATION() { return getToken(CheckList.PUNCTUATION, 0); }
		public TerminalNode DECIMAL() { return getToken(CheckList.DECIMAL, 0); }
		public TerminalNode SPACES() { return getToken(CheckList.SPACES, 0); }
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
		enterRule(_localctx, 6, RULE_text);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHAR:
				{
				setState(82);
				word();
				}
				break;
			case PUNCTUATION:
				{
				setState(83);
				match(PUNCTUATION);
				}
				break;
			case DECIMAL:
				{
				setState(84);
				match(DECIMAL);
				}
				break;
			case SPACES:
				{
				setState(85);
				match(SPACES);
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
		public Simple_placeholderContext simple_placeholder() {
			return getRuleContext(Simple_placeholderContext.class,0);
		}
		public Placeholder_with_bodyContext placeholder_with_body() {
			return getRuleContext(Placeholder_with_bodyContext.class,0);
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
		enterRule(_localctx, 8, RULE_placeholder);
		try {
			setState(90);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				simple_placeholder();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(89);
				placeholder_with_body();
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

	public static class Simple_placeholderContext extends ParserRuleContext {
		public WordContext word() {
			return getRuleContext(WordContext.class,0);
		}
		public Simple_placeholderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_placeholder; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CheckListListener ) ((CheckListListener)listener).enterSimple_placeholder(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CheckListListener ) ((CheckListListener)listener).exitSimple_placeholder(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CheckListVisitor ) return ((CheckListVisitor<? extends T>)visitor).visitSimple_placeholder(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_placeholderContext simple_placeholder() throws RecognitionException {
		Simple_placeholderContext _localctx = new Simple_placeholderContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_simple_placeholder);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(DOLLAR);
			setState(93);
			word();
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

	public static class Placeholder_with_bodyContext extends ParserRuleContext {
		public Placeholder_bodyContext placeholder_body() {
			return getRuleContext(Placeholder_bodyContext.class,0);
		}
		public Placeholder_with_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_placeholder_with_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CheckListListener ) ((CheckListListener)listener).enterPlaceholder_with_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CheckListListener ) ((CheckListListener)listener).exitPlaceholder_with_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CheckListVisitor ) return ((CheckListVisitor<? extends T>)visitor).visitPlaceholder_with_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Placeholder_with_bodyContext placeholder_with_body() throws RecognitionException {
		Placeholder_with_bodyContext _localctx = new Placeholder_with_bodyContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_placeholder_with_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(DOLLAR);
			setState(96);
			match(LBRACE);
			setState(97);
			placeholder_body();
			setState(98);
			match(RBRACE);
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

	public static class Placeholder_bodyContext extends ParserRuleContext {
		public Arithmetic_exprContext arithmetic_expr() {
			return getRuleContext(Arithmetic_exprContext.class,0);
		}
		public Placeholder_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_placeholder_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CheckListListener ) ((CheckListListener)listener).enterPlaceholder_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CheckListListener ) ((CheckListListener)listener).exitPlaceholder_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CheckListVisitor ) return ((CheckListVisitor<? extends T>)visitor).visitPlaceholder_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Placeholder_bodyContext placeholder_body() throws RecognitionException {
		Placeholder_bodyContext _localctx = new Placeholder_bodyContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_placeholder_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			arithmetic_expr(0);
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

	public static class Function_callContext extends ParserRuleContext {
		public WordContext func_name;
		public Var_refContext var_ref() {
			return getRuleContext(Var_refContext.class,0);
		}
		public WordContext word() {
			return getRuleContext(WordContext.class,0);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CheckListListener ) ((CheckListListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CheckListListener ) ((CheckListListener)listener).exitFunction_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CheckListVisitor ) return ((CheckListVisitor<? extends T>)visitor).visitFunction_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_function_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			((Function_callContext)_localctx).func_name = word();
			setState(103);
			match(LPAREN);
			setState(104);
			var_ref();
			setState(105);
			match(RPAREN);
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

	public static class Var_refContext extends ParserRuleContext {
		public List<RvalueContext> rvalue() {
			return getRuleContexts(RvalueContext.class);
		}
		public RvalueContext rvalue(int i) {
			return getRuleContext(RvalueContext.class,i);
		}
		public Var_refContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_ref; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CheckListListener ) ((CheckListListener)listener).enterVar_ref(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CheckListListener ) ((CheckListListener)listener).exitVar_ref(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CheckListVisitor ) return ((CheckListVisitor<? extends T>)visitor).visitVar_ref(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_refContext var_ref() throws RecognitionException {
		Var_refContext _localctx = new Var_refContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_var_ref);
		int _la;
		try {
			setState(118);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CHAR) | (1L << LPAREN) | (1L << MINUS) | (1L << DECIMAL))) != 0)) {
					{
					setState(107);
					rvalue();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(110);
				rvalue();
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(111);
					match(COMMA);
					setState(112);
					rvalue();
					}
					}
					setState(117);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class Var_assignContext extends ParserRuleContext {
		public RvalueContext varValue;
		public Var_defContext var_def() {
			return getRuleContext(Var_defContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(CheckList.NEWLINE, 0); }
		public RvalueContext rvalue() {
			return getRuleContext(RvalueContext.class,0);
		}
		public Var_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CheckListListener ) ((CheckListListener)listener).enterVar_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CheckListListener ) ((CheckListListener)listener).exitVar_assign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CheckListVisitor ) return ((CheckListVisitor<? extends T>)visitor).visitVar_assign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_assignContext var_assign() throws RecognitionException {
		Var_assignContext _localctx = new Var_assignContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_var_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			var_def();
			setState(121);
			match(COLONS);
			setState(122);
			((Var_assignContext)_localctx).varValue = rvalue();
			setState(123);
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

	public static class DescriptionContext extends ParserRuleContext {
		public List<TextContext> text() {
			return getRuleContexts(TextContext.class);
		}
		public TextContext text(int i) {
			return getRuleContext(TextContext.class,i);
		}
		public DescriptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_description; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CheckListListener ) ((CheckListListener)listener).enterDescription(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CheckListListener ) ((CheckListListener)listener).exitDescription(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CheckListVisitor ) return ((CheckListVisitor<? extends T>)visitor).visitDescription(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DescriptionContext description() throws RecognitionException {
		DescriptionContext _localctx = new DescriptionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_description);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(125);
				text();
				}
				}
				setState(128); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACES) | (1L << CHAR) | (1L << PUNCTUATION) | (1L << DECIMAL))) != 0) );
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

	public static class Var_defContext extends ParserRuleContext {
		public WordContext lval;
		public WordContext varType;
		public DescriptionContext description() {
			return getRuleContext(DescriptionContext.class,0);
		}
		public List<WordContext> word() {
			return getRuleContexts(WordContext.class);
		}
		public WordContext word(int i) {
			return getRuleContext(WordContext.class,i);
		}
		public Var_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CheckListListener ) ((CheckListListener)listener).enterVar_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CheckListListener ) ((CheckListListener)listener).exitVar_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CheckListVisitor ) return ((CheckListVisitor<? extends T>)visitor).visitVar_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_defContext var_def() throws RecognitionException {
		Var_defContext _localctx = new Var_defContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_var_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			description();
			setState(131);
			match(COLONS);
			setState(132);
			((Var_defContext)_localctx).lval = word();
			setState(133);
			match(COLONS);
			setState(134);
			((Var_defContext)_localctx).varType = word();
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

	public static class RvalueContext extends ParserRuleContext {
		public TerminalNode DECIMAL() { return getToken(CheckList.DECIMAL, 0); }
		public WordContext word() {
			return getRuleContext(WordContext.class,0);
		}
		public Arithmetic_exprContext arithmetic_expr() {
			return getRuleContext(Arithmetic_exprContext.class,0);
		}
		public RvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CheckListListener ) ((CheckListListener)listener).enterRvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CheckListListener ) ((CheckListListener)listener).exitRvalue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CheckListVisitor ) return ((CheckListVisitor<? extends T>)visitor).visitRvalue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RvalueContext rvalue() throws RecognitionException {
		RvalueContext _localctx = new RvalueContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_rvalue);
		try {
			setState(139);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				match(DECIMAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
				word();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(138);
				arithmetic_expr(0);
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

	public static class Func_defContext extends ParserRuleContext {
		public WordContext name;
		public TerminalNode LPAREN() { return getToken(CheckList.LPAREN, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CheckList.RPAREN, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public WordContext word() {
			return getRuleContext(WordContext.class,0);
		}
		public Func_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CheckListListener ) ((CheckListListener)listener).enterFunc_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CheckListListener ) ((CheckListListener)listener).exitFunc_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CheckListVisitor ) return ((CheckListVisitor<? extends T>)visitor).visitFunc_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_defContext func_def() throws RecognitionException {
		Func_defContext _localctx = new Func_defContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_func_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(DOLLARS);
			setState(142);
			((Func_defContext)_localctx).name = word();
			setState(143);
			match(LPAREN);
			setState(144);
			args();
			setState(145);
			match(RPAREN);
			setState(146);
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

	public static class ArgsContext extends ParserRuleContext {
		public List<ArgContext> arg() {
			return getRuleContexts(ArgContext.class);
		}
		public ArgContext arg(int i) {
			return getRuleContext(ArgContext.class,i);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CheckListListener ) ((CheckListListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CheckListListener ) ((CheckListListener)listener).exitArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CheckListVisitor ) return ((CheckListVisitor<? extends T>)visitor).visitArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CHAR) {
				{
				setState(148);
				arg();
				}
			}

			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(151);
				match(COMMA);
				setState(152);
				arg();
				}
				}
				setState(157);
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

	public static class ArgContext extends ParserRuleContext {
		public WordContext lval;
		public WordContext varType;
		public List<WordContext> word() {
			return getRuleContexts(WordContext.class);
		}
		public WordContext word(int i) {
			return getRuleContext(WordContext.class,i);
		}
		public ArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CheckListListener ) ((CheckListListener)listener).enterArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CheckListListener ) ((CheckListListener)listener).exitArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CheckListVisitor ) return ((CheckListVisitor<? extends T>)visitor).visitArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgContext arg() throws RecognitionException {
		ArgContext _localctx = new ArgContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_arg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			((ArgContext)_localctx).lval = word();
			setState(159);
			match(COLONS);
			setState(160);
			((ArgContext)_localctx).varType = word();
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
		public TerminalNode NEWLINE() { return getToken(CheckList.NEWLINE, 0); }
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
		enterRule(_localctx, 34, RULE_heading);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(162);
			match(HEADER);
			}
			setState(164); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(163);
				text();
				}
				}
				setState(166); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACES) | (1L << CHAR) | (1L << PUNCTUATION) | (1L << DECIMAL))) != 0) );
			setState(168);
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
		enterRule(_localctx, 36, RULE_stmt);
		try {
			setState(172);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				item();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(171);
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
		public List<Function_callContext> function_call() {
			return getRuleContexts(Function_callContext.class);
		}
		public Function_callContext function_call(int i) {
			return getRuleContext(Function_callContext.class,i);
		}
		public List<PlaceholderContext> placeholder() {
			return getRuleContexts(PlaceholderContext.class);
		}
		public PlaceholderContext placeholder(int i) {
			return getRuleContext(PlaceholderContext.class,i);
		}
		public List<TextContext> text() {
			return getRuleContexts(TextContext.class);
		}
		public TextContext text(int i) {
			return getRuleContext(TextContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(CheckList.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CheckList.NEWLINE, i);
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
		enterRule(_localctx, 38, RULE_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(177);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(174);
					function_call();
					}
					break;
				case 2:
					{
					setState(175);
					placeholder();
					}
					break;
				case 3:
					{
					setState(176);
					text();
					}
					break;
				}
				}
				setState(179); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACES) | (1L << CHAR) | (1L << PUNCTUATION) | (1L << DOLLAR) | (1L << DECIMAL))) != 0) );
			setState(182); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(181);
				match(NEWLINE);
				}
				}
				setState(184); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
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
		public Var_assignContext var_assign() {
			return getRuleContext(Var_assignContext.class,0);
		}
		public Func_defContext func_def() {
			return getRuleContext(Func_defContext.class,0);
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
		enterRule(_localctx, 40, RULE_compound_stmt);
		try {
			setState(189);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOLLAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(186);
				if_stmt();
				}
				break;
			case SPACES:
			case CHAR:
			case PUNCTUATION:
			case DECIMAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(187);
				var_assign();
				}
				break;
			case DOLLARS:
				enterOuterAlt(_localctx, 3);
				{
				setState(188);
				func_def();
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
		enterRule(_localctx, 42, RULE_if_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(DOLLAR);
			setState(192);
			match(LBRACE);
			setState(193);
			logical_expr(0);
			setState(194);
			match(RBRACE);
			setState(195);
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
		public TerminalNode NEWLINE() { return getToken(CheckList.NEWLINE, 0); }
		public TerminalNode INDENT() { return getToken(CheckList.INDENT, 0); }
		public TerminalNode DEDENT() { return getToken(CheckList.DEDENT, 0); }
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
		enterRule(_localctx, 44, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(NEWLINE);
			setState(198);
			match(INDENT);
			setState(200); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(199);
				stmt();
				}
				}
				setState(202); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACES) | (1L << CHAR) | (1L << PUNCTUATION) | (1L << DOLLAR) | (1L << DOLLARS) | (1L << DECIMAL))) != 0) );
			setState(204);
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
		public TerminalNode NOT() { return getToken(CheckList.NOT, 0); }
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
		public TerminalNode LPAREN() { return getToken(CheckList.LPAREN, 0); }
		public Logical_exprContext logical_expr() {
			return getRuleContext(Logical_exprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CheckList.RPAREN, 0); }
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
	public static class ComparatorAtomContext extends Logical_exprContext {
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
		public ComparatorAtomContext(Logical_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CheckListListener ) ((CheckListListener)listener).enterComparatorAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CheckListListener ) ((CheckListListener)listener).exitComparatorAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CheckListVisitor ) return ((CheckListVisitor<? extends T>)visitor).visitComparatorAtom(this);
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
		int _startState = 46;
		enterRecursionRule(_localctx, 46, RULE_logical_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				_localctx = new ParenExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(207);
				match(LPAREN);
				setState(208);
				logical_expr(0);
				setState(209);
				match(RPAREN);
				}
				break;
			case 2:
				{
				_localctx = new NotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(211);
				match(NOT);
				setState(212);
				logical_expr(3);
				}
				break;
			case 3:
				{
				_localctx = new ComparatorAtomContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(213);
				((ComparatorAtomContext)_localctx).left = atom();
				setState(214);
				((ComparatorAtomContext)_localctx).op = comparator();
				setState(215);
				((ComparatorAtomContext)_localctx).right = atom();

				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(226);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BinaryExpressionContext(new Logical_exprContext(_parentctx, _parentState));
					((BinaryExpressionContext)_localctx).left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_logical_expr);
					setState(220);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(221);
					((BinaryExpressionContext)_localctx).op = binary();
					setState(222);
					((BinaryExpressionContext)_localctx).right = logical_expr(2);
					}
					} 
				}
				setState(228);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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

	public static class Arithmetic_exprContext extends ParserRuleContext {
		public Arithmetic_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmetic_expr; }
	 
		public Arithmetic_exprContext() { }
		public void copyFrom(Arithmetic_exprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArithmeticExpressionParensContext extends Arithmetic_exprContext {
		public TerminalNode LPAREN() { return getToken(CheckList.LPAREN, 0); }
		public Arithmetic_exprContext arithmetic_expr() {
			return getRuleContext(Arithmetic_exprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CheckList.RPAREN, 0); }
		public ArithmeticExpressionParensContext(Arithmetic_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CheckListListener ) ((CheckListListener)listener).enterArithmeticExpressionParens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CheckListListener ) ((CheckListListener)listener).exitArithmeticExpressionParens(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CheckListVisitor ) return ((CheckListVisitor<? extends T>)visitor).visitArithmeticExpressionParens(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArithmeticMultDivExpressionContext extends Arithmetic_exprContext {
		public Arithmetic_exprContext left;
		public Arithm_muldivContext op;
		public Arithmetic_exprContext right;
		public List<Arithmetic_exprContext> arithmetic_expr() {
			return getRuleContexts(Arithmetic_exprContext.class);
		}
		public Arithmetic_exprContext arithmetic_expr(int i) {
			return getRuleContext(Arithmetic_exprContext.class,i);
		}
		public Arithm_muldivContext arithm_muldiv() {
			return getRuleContext(Arithm_muldivContext.class,0);
		}
		public ArithmeticMultDivExpressionContext(Arithmetic_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CheckListListener ) ((CheckListListener)listener).enterArithmeticMultDivExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CheckListListener ) ((CheckListListener)listener).exitArithmeticMultDivExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CheckListVisitor ) return ((CheckListVisitor<? extends T>)visitor).visitArithmeticMultDivExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArithmeticAtomExpressionContext extends Arithmetic_exprContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public ArithmeticAtomExpressionContext(Arithmetic_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CheckListListener ) ((CheckListListener)listener).enterArithmeticAtomExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CheckListListener ) ((CheckListListener)listener).exitArithmeticAtomExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CheckListVisitor ) return ((CheckListVisitor<? extends T>)visitor).visitArithmeticAtomExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArithmeticExpressionNegationContext extends Arithmetic_exprContext {
		public TerminalNode MINUS() { return getToken(CheckList.MINUS, 0); }
		public Arithmetic_exprContext arithmetic_expr() {
			return getRuleContext(Arithmetic_exprContext.class,0);
		}
		public ArithmeticExpressionNegationContext(Arithmetic_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CheckListListener ) ((CheckListListener)listener).enterArithmeticExpressionNegation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CheckListListener ) ((CheckListListener)listener).exitArithmeticExpressionNegation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CheckListVisitor ) return ((CheckListVisitor<? extends T>)visitor).visitArithmeticExpressionNegation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArithmeticPlusMinusExpressionContext extends Arithmetic_exprContext {
		public Arithmetic_exprContext left;
		public Arithm_plusminusContext op;
		public Arithmetic_exprContext right;
		public List<Arithmetic_exprContext> arithmetic_expr() {
			return getRuleContexts(Arithmetic_exprContext.class);
		}
		public Arithmetic_exprContext arithmetic_expr(int i) {
			return getRuleContext(Arithmetic_exprContext.class,i);
		}
		public Arithm_plusminusContext arithm_plusminus() {
			return getRuleContext(Arithm_plusminusContext.class,0);
		}
		public ArithmeticPlusMinusExpressionContext(Arithmetic_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CheckListListener ) ((CheckListListener)listener).enterArithmeticPlusMinusExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CheckListListener ) ((CheckListListener)listener).exitArithmeticPlusMinusExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CheckListVisitor ) return ((CheckListVisitor<? extends T>)visitor).visitArithmeticPlusMinusExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arithmetic_exprContext arithmetic_expr() throws RecognitionException {
		return arithmetic_expr(0);
	}

	private Arithmetic_exprContext arithmetic_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Arithmetic_exprContext _localctx = new Arithmetic_exprContext(_ctx, _parentState);
		Arithmetic_exprContext _prevctx = _localctx;
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_arithmetic_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				_localctx = new ArithmeticExpressionParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(230);
				match(LPAREN);
				setState(231);
				arithmetic_expr(0);
				setState(232);
				match(RPAREN);
				}
				break;
			case 2:
				{
				_localctx = new ArithmeticExpressionNegationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(234);
				match(MINUS);
				setState(235);
				arithmetic_expr(2);
				}
				break;
			case 3:
				{
				_localctx = new ArithmeticAtomExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(236);
				atom();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(249);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(247);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						_localctx = new ArithmeticMultDivExpressionContext(new Arithmetic_exprContext(_parentctx, _parentState));
						((ArithmeticMultDivExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic_expr);
						setState(239);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(240);
						((ArithmeticMultDivExpressionContext)_localctx).op = arithm_muldiv();
						setState(241);
						((ArithmeticMultDivExpressionContext)_localctx).right = arithmetic_expr(6);
						}
						break;
					case 2:
						{
						_localctx = new ArithmeticPlusMinusExpressionContext(new Arithmetic_exprContext(_parentctx, _parentState));
						((ArithmeticPlusMinusExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic_expr);
						setState(243);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(244);
						((ArithmeticPlusMinusExpressionContext)_localctx).op = arithm_plusminus();
						setState(245);
						((ArithmeticPlusMinusExpressionContext)_localctx).right = arithmetic_expr(5);
						}
						break;
					}
					} 
				}
				setState(251);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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
		public WordContext word() {
			return getRuleContext(WordContext.class,0);
		}
		public TerminalNode DECIMAL() { return getToken(CheckList.DECIMAL, 0); }
		public Arithmetic_exprContext arithmetic_expr() {
			return getRuleContext(Arithmetic_exprContext.class,0);
		}
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
		enterRule(_localctx, 50, RULE_atom);
		try {
			setState(258);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(252);
				word();
				}
				break;
			case DECIMAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(253);
				match(DECIMAL);
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 3);
				{
				setState(254);
				match(LPAREN);
				setState(255);
				arithmetic_expr(0);
				setState(256);
				match(RPAREN);
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
		public TerminalNode GT() { return getToken(CheckList.GT, 0); }
		public TerminalNode GE() { return getToken(CheckList.GE, 0); }
		public TerminalNode LT() { return getToken(CheckList.LT, 0); }
		public TerminalNode LE() { return getToken(CheckList.LE, 0); }
		public TerminalNode EQ() { return getToken(CheckList.EQ, 0); }
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
		enterRule(_localctx, 52, RULE_comparator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
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

	public static class Arithm_muldivContext extends ParserRuleContext {
		public TerminalNode MULT() { return getToken(CheckList.MULT, 0); }
		public TerminalNode DIV() { return getToken(CheckList.DIV, 0); }
		public Arithm_muldivContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithm_muldiv; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CheckListListener ) ((CheckListListener)listener).enterArithm_muldiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CheckListListener ) ((CheckListListener)listener).exitArithm_muldiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CheckListVisitor ) return ((CheckListVisitor<? extends T>)visitor).visitArithm_muldiv(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arithm_muldivContext arithm_muldiv() throws RecognitionException {
		Arithm_muldivContext _localctx = new Arithm_muldivContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_arithm_muldiv);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			_la = _input.LA(1);
			if ( !(_la==MULT || _la==DIV) ) {
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

	public static class Arithm_plusminusContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(CheckList.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(CheckList.MINUS, 0); }
		public Arithm_plusminusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithm_plusminus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CheckListListener ) ((CheckListListener)listener).enterArithm_plusminus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CheckListListener ) ((CheckListListener)listener).exitArithm_plusminus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CheckListVisitor ) return ((CheckListVisitor<? extends T>)visitor).visitArithm_plusminus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arithm_plusminusContext arithm_plusminus() throws RecognitionException {
		Arithm_plusminusContext _localctx = new Arithm_plusminusContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_arithm_plusminus);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==MINUS) ) {
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
		public TerminalNode AND() { return getToken(CheckList.AND, 0); }
		public TerminalNode OR() { return getToken(CheckList.OR, 0); }
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
		enterRule(_localctx, 58, RULE_binary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
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
		case 23:
			return logical_expr_sempred((Logical_exprContext)_localctx, predIndex);
		case 24:
			return arithmetic_expr_sempred((Arithmetic_exprContext)_localctx, predIndex);
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
	private boolean arithmetic_expr_sempred(Arithmetic_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\36\u010f\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\7\2@"+
		"\n\2\f\2\16\2C\13\2\3\2\3\2\6\2G\n\2\r\2\16\2H\3\2\3\2\3\3\5\3N\n\3\3"+
		"\4\6\4Q\n\4\r\4\16\4R\3\5\3\5\3\5\3\5\5\5Y\n\5\3\6\3\6\5\6]\n\6\3\7\3"+
		"\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\5\13o\n\13"+
		"\3\13\3\13\3\13\7\13t\n\13\f\13\16\13w\13\13\5\13y\n\13\3\f\3\f\3\f\3"+
		"\f\3\f\3\r\6\r\u0081\n\r\r\r\16\r\u0082\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\5\17\u008e\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21"+
		"\5\21\u0098\n\21\3\21\3\21\7\21\u009c\n\21\f\21\16\21\u009f\13\21\3\22"+
		"\3\22\3\22\3\22\3\23\3\23\6\23\u00a7\n\23\r\23\16\23\u00a8\3\23\3\23\3"+
		"\24\3\24\5\24\u00af\n\24\3\25\3\25\3\25\6\25\u00b4\n\25\r\25\16\25\u00b5"+
		"\3\25\6\25\u00b9\n\25\r\25\16\25\u00ba\3\26\3\26\3\26\5\26\u00c0\n\26"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\6\30\u00cb\n\30\r\30\16"+
		"\30\u00cc\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\5\31\u00dd\n\31\3\31\3\31\3\31\3\31\7\31\u00e3\n\31\f\31\16"+
		"\31\u00e6\13\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u00f0\n\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u00fa\n\32\f\32\16\32\u00fd"+
		"\13\32\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0105\n\33\3\34\3\34\3\35\3"+
		"\35\3\36\3\36\3\37\3\37\3\37\2\4\60\62 \2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\668:<\2\6\3\2\f\20\3\2\23\24\3\2\25\26\3\2"+
		"\t\n\2\u0112\2A\3\2\2\2\4M\3\2\2\2\6P\3\2\2\2\bX\3\2\2\2\n\\\3\2\2\2\f"+
		"^\3\2\2\2\16a\3\2\2\2\20f\3\2\2\2\22h\3\2\2\2\24x\3\2\2\2\26z\3\2\2\2"+
		"\30\u0080\3\2\2\2\32\u0084\3\2\2\2\34\u008d\3\2\2\2\36\u008f\3\2\2\2 "+
		"\u0097\3\2\2\2\"\u00a0\3\2\2\2$\u00a4\3\2\2\2&\u00ae\3\2\2\2(\u00b3\3"+
		"\2\2\2*\u00bf\3\2\2\2,\u00c1\3\2\2\2.\u00c7\3\2\2\2\60\u00dc\3\2\2\2\62"+
		"\u00ef\3\2\2\2\64\u0104\3\2\2\2\66\u0106\3\2\2\28\u0108\3\2\2\2:\u010a"+
		"\3\2\2\2<\u010c\3\2\2\2>@\7\36\2\2?>\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2"+
		"\2\2BD\3\2\2\2CA\3\2\2\2DF\5$\23\2EG\5&\24\2FE\3\2\2\2GH\3\2\2\2HF\3\2"+
		"\2\2HI\3\2\2\2IJ\3\2\2\2JK\7\2\2\3K\3\3\2\2\2LN\7\b\2\2ML\3\2\2\2MN\3"+
		"\2\2\2N\5\3\2\2\2OQ\7\7\2\2PO\3\2\2\2QR\3\2\2\2RP\3\2\2\2RS\3\2\2\2S\7"+
		"\3\2\2\2TY\5\6\4\2UY\7\b\2\2VY\7\35\2\2WY\7\6\2\2XT\3\2\2\2XU\3\2\2\2"+
		"XV\3\2\2\2XW\3\2\2\2Y\t\3\2\2\2Z]\5\f\7\2[]\5\16\b\2\\Z\3\2\2\2\\[\3\2"+
		"\2\2]\13\3\2\2\2^_\7\33\2\2_`\5\6\4\2`\r\3\2\2\2ab\7\33\2\2bc\7\27\2\2"+
		"cd\5\20\t\2de\7\30\2\2e\17\3\2\2\2fg\5\62\32\2g\21\3\2\2\2hi\5\6\4\2i"+
		"j\7\21\2\2jk\5\24\13\2kl\7\22\2\2l\23\3\2\2\2mo\5\34\17\2nm\3\2\2\2no"+
		"\3\2\2\2oy\3\2\2\2pu\5\34\17\2qr\7\5\2\2rt\5\34\17\2sq\3\2\2\2tw\3\2\2"+
		"\2us\3\2\2\2uv\3\2\2\2vy\3\2\2\2wu\3\2\2\2xn\3\2\2\2xp\3\2\2\2y\25\3\2"+
		"\2\2z{\5\32\16\2{|\7\32\2\2|}\5\34\17\2}~\7\36\2\2~\27\3\2\2\2\177\u0081"+
		"\5\b\5\2\u0080\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0080\3\2\2\2\u0082"+
		"\u0083\3\2\2\2\u0083\31\3\2\2\2\u0084\u0085\5\30\r\2\u0085\u0086\7\32"+
		"\2\2\u0086\u0087\5\6\4\2\u0087\u0088\7\32\2\2\u0088\u0089\5\6\4\2\u0089"+
		"\33\3\2\2\2\u008a\u008e\7\35\2\2\u008b\u008e\5\6\4\2\u008c\u008e\5\62"+
		"\32\2\u008d\u008a\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008c\3\2\2\2\u008e"+
		"\35\3\2\2\2\u008f\u0090\7\34\2\2\u0090\u0091\5\6\4\2\u0091\u0092\7\21"+
		"\2\2\u0092\u0093\5 \21\2\u0093\u0094\7\22\2\2\u0094\u0095\5.\30\2\u0095"+
		"\37\3\2\2\2\u0096\u0098\5\"\22\2\u0097\u0096\3\2\2\2\u0097\u0098\3\2\2"+
		"\2\u0098\u009d\3\2\2\2\u0099\u009a\7\5\2\2\u009a\u009c\5\"\22\2\u009b"+
		"\u0099\3\2\2\2\u009c\u009f\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2"+
		"\2\2\u009e!\3\2\2\2\u009f\u009d\3\2\2\2\u00a0\u00a1\5\6\4\2\u00a1\u00a2"+
		"\7\32\2\2\u00a2\u00a3\5\6\4\2\u00a3#\3\2\2\2\u00a4\u00a6\7\31\2\2\u00a5"+
		"\u00a7\5\b\5\2\u00a6\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a6\3\2"+
		"\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ab\7\36\2\2\u00ab"+
		"%\3\2\2\2\u00ac\u00af\5(\25\2\u00ad\u00af\5*\26\2\u00ae\u00ac\3\2\2\2"+
		"\u00ae\u00ad\3\2\2\2\u00af\'\3\2\2\2\u00b0\u00b4\5\22\n\2\u00b1\u00b4"+
		"\5\n\6\2\u00b2\u00b4\5\b\5\2\u00b3\u00b0\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3"+
		"\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2"+
		"\2\2\u00b6\u00b8\3\2\2\2\u00b7\u00b9\7\36\2\2\u00b8\u00b7\3\2\2\2\u00b9"+
		"\u00ba\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb)\3\2\2\2"+
		"\u00bc\u00c0\5,\27\2\u00bd\u00c0\5\26\f\2\u00be\u00c0\5\36\20\2\u00bf"+
		"\u00bc\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00be\3\2\2\2\u00c0+\3\2\2\2"+
		"\u00c1\u00c2\7\33\2\2\u00c2\u00c3\7\27\2\2\u00c3\u00c4\5\60\31\2\u00c4"+
		"\u00c5\7\30\2\2\u00c5\u00c6\5.\30\2\u00c6-\3\2\2\2\u00c7\u00c8\7\36\2"+
		"\2\u00c8\u00ca\7\3\2\2\u00c9\u00cb\5&\24\2\u00ca\u00c9\3\2\2\2\u00cb\u00cc"+
		"\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce"+
		"\u00cf\7\4\2\2\u00cf/\3\2\2\2\u00d0\u00d1\b\31\1\2\u00d1\u00d2\7\21\2"+
		"\2\u00d2\u00d3\5\60\31\2\u00d3\u00d4\7\22\2\2\u00d4\u00dd\3\2\2\2\u00d5"+
		"\u00d6\7\13\2\2\u00d6\u00dd\5\60\31\5\u00d7\u00d8\5\64\33\2\u00d8\u00d9"+
		"\5\66\34\2\u00d9\u00da\5\64\33\2\u00da\u00db\b\31\1\2\u00db\u00dd\3\2"+
		"\2\2\u00dc\u00d0\3\2\2\2\u00dc\u00d5\3\2\2\2\u00dc\u00d7\3\2\2\2\u00dd"+
		"\u00e4\3\2\2\2\u00de\u00df\f\3\2\2\u00df\u00e0\5<\37\2\u00e0\u00e1\5\60"+
		"\31\4\u00e1\u00e3\3\2\2\2\u00e2\u00de\3\2\2\2\u00e3\u00e6\3\2\2\2\u00e4"+
		"\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\61\3\2\2\2\u00e6\u00e4\3\2\2"+
		"\2\u00e7\u00e8\b\32\1\2\u00e8\u00e9\7\21\2\2\u00e9\u00ea\5\62\32\2\u00ea"+
		"\u00eb\7\22\2\2\u00eb\u00f0\3\2\2\2\u00ec\u00ed\7\26\2\2\u00ed\u00f0\5"+
		"\62\32\4\u00ee\u00f0\5\64\33\2\u00ef\u00e7\3\2\2\2\u00ef\u00ec\3\2\2\2"+
		"\u00ef\u00ee\3\2\2\2\u00f0\u00fb\3\2\2\2\u00f1\u00f2\f\7\2\2\u00f2\u00f3"+
		"\58\35\2\u00f3\u00f4\5\62\32\b\u00f4\u00fa\3\2\2\2\u00f5\u00f6\f\6\2\2"+
		"\u00f6\u00f7\5:\36\2\u00f7\u00f8\5\62\32\7\u00f8\u00fa\3\2\2\2\u00f9\u00f1"+
		"\3\2\2\2\u00f9\u00f5\3\2\2\2\u00fa\u00fd\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb"+
		"\u00fc\3\2\2\2\u00fc\63\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fe\u0105\5\6\4"+
		"\2\u00ff\u0105\7\35\2\2\u0100\u0101\7\21\2\2\u0101\u0102\5\62\32\2\u0102"+
		"\u0103\7\22\2\2\u0103\u0105\3\2\2\2\u0104\u00fe\3\2\2\2\u0104\u00ff\3"+
		"\2\2\2\u0104\u0100\3\2\2\2\u0105\65\3\2\2\2\u0106\u0107\t\2\2\2\u0107"+
		"\67\3\2\2\2\u0108\u0109\t\3\2\2\u01099\3\2\2\2\u010a\u010b\t\4\2\2\u010b"+
		";\3\2\2\2\u010c\u010d\t\5\2\2\u010d=\3\2\2\2\34AHMRX\\nux\u0082\u008d"+
		"\u0097\u009d\u00a8\u00ae\u00b3\u00b5\u00ba\u00bf\u00cc\u00dc\u00e4\u00ef"+
		"\u00f9\u00fb\u0104";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}