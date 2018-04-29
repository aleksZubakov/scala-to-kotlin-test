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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, SPACES=8, CHAR=9, 
		PUNCTUATION=10, AND=11, OR=12, NOT=13, GT=14, GE=15, LT=16, LE=17, EQ=18, 
		LPAREN=19, RPAREN=20, MULT=21, DIV=22, PLUS=23, MINUS=24, DECIMAL=25, 
		NEWLINE=26, INDENT=27, DEDENT=28;
	public static final int
		RULE_file_input = 0, RULE_template = 1, RULE_word = 2, RULE_text = 3, 
		RULE_placeholder = 4, RULE_simple_placeholder = 5, RULE_placeholder_with_body = 6, 
		RULE_placeholder_body = 7, RULE_function_call = 8, RULE_var_ref = 9, RULE_var_assign = 10, 
		RULE_description = 11, RULE_var_def = 12, RULE_rvalue = 13, RULE_func_def = 14, 
		RULE_args = 15, RULE_arg = 16, RULE_heading = 17, RULE_stmt = 18, RULE_item = 19, 
		RULE_compound_stmt = 20, RULE_if_stmt = 21, RULE_body = 22, RULE_logical_expr = 23, 
		RULE_arithmetic_expr = 24, RULE_atom = 25, RULE_comparator = 26, RULE_arithm_muldiv = 27, 
		RULE_arithm_plusminus = 28, RULE_binary = 29;
	public static final String[] ruleNames = {
		"file_input", "template", "word", "text", "placeholder", "simple_placeholder", 
		"placeholder_with_body", "placeholder_body", "function_call", "var_ref", 
		"var_assign", "description", "var_def", "rvalue", "func_def", "args", 
		"arg", "heading", "stmt", "item", "compound_stmt", "if_stmt", "body", 
		"logical_expr", "arithmetic_expr", "atom", "comparator", "arithm_muldiv", 
		"arithm_plusminus", "binary"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'$'", "'{'", "'}'", "','", "':'", "'$$'", "'##'", null, null, null, 
		"'&&'", "'||'", "'!'", "'>'", "'>='", "'<'", "'<='", "'=='", "'('", "')'", 
		"'*'", "'/'", "'+'", "'-'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, "SPACES", "CHAR", "PUNCTUATION", 
		"AND", "OR", "NOT", "GT", "GE", "LT", "LE", "EQ", "LPAREN", "RPAREN", 
		"MULT", "DIV", "PLUS", "MINUS", "DECIMAL", "NEWLINE", "INDENT", "DEDENT"
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
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6 || _la==NEWLINE) {
				{
				{
				setState(60);
				template();
				}
				}
				setState(65);
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
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(66);
				match(NEWLINE);
				}
				}
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(72);
			heading();
			setState(74); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(73);
				stmt();
				}
				}
				setState(76); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__5) | (1L << SPACES) | (1L << CHAR) | (1L << PUNCTUATION) | (1L << DECIMAL))) != 0) );
			setState(78);
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
		enterRule(_localctx, 4, RULE_word);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(81); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(80);
					match(CHAR);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(83); 
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
		public TerminalNode PUNCTUATION() { return getToken(CheckListParser.PUNCTUATION, 0); }
		public TerminalNode DECIMAL() { return getToken(CheckListParser.DECIMAL, 0); }
		public TerminalNode SPACES() { return getToken(CheckListParser.SPACES, 0); }
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
			setState(89);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHAR:
				{
				setState(85);
				word();
				}
				break;
			case PUNCTUATION:
				{
				setState(86);
				match(PUNCTUATION);
				}
				break;
			case DECIMAL:
				{
				setState(87);
				match(DECIMAL);
				}
				break;
			case SPACES:
				{
				setState(88);
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
			setState(93);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(91);
				simple_placeholder();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(92);
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
			setState(95);
			match(T__0);
			setState(96);
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
		public List<TerminalNode> SPACES() { return getTokens(CheckListParser.SPACES); }
		public TerminalNode SPACES(int i) {
			return getToken(CheckListParser.SPACES, i);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(T__0);
			setState(99);
			match(T__1);
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACES) {
				{
				setState(100);
				match(SPACES);
				}
			}

			setState(103);
			placeholder_body();
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACES) {
				{
				setState(104);
				match(SPACES);
				}
			}

			setState(107);
			match(T__2);
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
			setState(109);
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
			setState(111);
			((Function_callContext)_localctx).func_name = word();
			setState(112);
			match(LPAREN);
			setState(113);
			var_ref();
			setState(114);
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
		public List<TerminalNode> SPACES() { return getTokens(CheckListParser.SPACES); }
		public TerminalNode SPACES(int i) {
			return getToken(CheckListParser.SPACES, i);
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
			setState(133);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CHAR) | (1L << LPAREN) | (1L << MINUS) | (1L << DECIMAL))) != 0)) {
					{
					setState(116);
					rvalue();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
				rvalue();
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACES) {
					{
					setState(120);
					match(SPACES);
					}
				}

				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(123);
					match(T__3);
					setState(125);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SPACES) {
						{
						setState(124);
						match(SPACES);
						}
					}

					setState(127);
					rvalue();
					}
					}
					setState(132);
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
		public TerminalNode NEWLINE() { return getToken(CheckListParser.NEWLINE, 0); }
		public RvalueContext rvalue() {
			return getRuleContext(RvalueContext.class,0);
		}
		public TerminalNode SPACES() { return getToken(CheckListParser.SPACES, 0); }
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			var_def();
			setState(136);
			match(T__4);
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACES) {
				{
				setState(137);
				match(SPACES);
				}
			}

			setState(140);
			((Var_assignContext)_localctx).varValue = rvalue();
			setState(141);
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
			setState(144); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(143);
				text();
				}
				}
				setState(146); 
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
		public List<TerminalNode> SPACES() { return getTokens(CheckListParser.SPACES); }
		public TerminalNode SPACES(int i) {
			return getToken(CheckListParser.SPACES, i);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			description();
			setState(149);
			match(T__4);
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACES) {
				{
				setState(150);
				match(SPACES);
				}
			}

			setState(153);
			((Var_defContext)_localctx).lval = word();
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACES) {
				{
				setState(154);
				match(SPACES);
				}
			}

			setState(157);
			match(T__4);
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACES) {
				{
				setState(158);
				match(SPACES);
				}
			}

			setState(161);
			((Var_defContext)_localctx).varType = word();
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACES) {
				{
				setState(162);
				match(SPACES);
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

	public static class RvalueContext extends ParserRuleContext {
		public TerminalNode DECIMAL() { return getToken(CheckListParser.DECIMAL, 0); }
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
			setState(168);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(165);
				match(DECIMAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(166);
				word();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(167);
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
		public TerminalNode LPAREN() { return getToken(CheckListParser.LPAREN, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CheckListParser.RPAREN, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public WordContext word() {
			return getRuleContext(WordContext.class,0);
		}
		public TerminalNode SPACES() { return getToken(CheckListParser.SPACES, 0); }
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(T__5);
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACES) {
				{
				setState(171);
				match(SPACES);
				}
			}

			setState(174);
			((Func_defContext)_localctx).name = word();
			setState(175);
			match(LPAREN);
			setState(176);
			args();
			setState(177);
			match(RPAREN);
			setState(178);
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
		public List<TerminalNode> SPACES() { return getTokens(CheckListParser.SPACES); }
		public TerminalNode SPACES(int i) {
			return getToken(CheckListParser.SPACES, i);
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
			setState(181);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(180);
				arg();
				}
				break;
			}
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACES) {
				{
				setState(183);
				match(SPACES);
				}
			}

			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(186);
				match(T__3);
				setState(188);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(187);
					match(SPACES);
					}
					break;
				}
				setState(190);
				arg();
				}
				}
				setState(195);
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
		public List<TerminalNode> SPACES() { return getTokens(CheckListParser.SPACES); }
		public TerminalNode SPACES(int i) {
			return getToken(CheckListParser.SPACES, i);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACES) {
				{
				setState(196);
				match(SPACES);
				}
			}

			setState(199);
			((ArgContext)_localctx).lval = word();
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACES) {
				{
				setState(200);
				match(SPACES);
				}
			}

			setState(203);
			match(T__4);
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACES) {
				{
				setState(204);
				match(SPACES);
				}
			}

			setState(207);
			((ArgContext)_localctx).varType = word();
			setState(209);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(208);
				match(SPACES);
				}
				break;
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
		enterRule(_localctx, 34, RULE_heading);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(211);
			match(T__6);
			}
			setState(213);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(212);
				match(SPACES);
				}
				break;
			}
			setState(216); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(215);
				text();
				}
				}
				setState(218); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACES) | (1L << CHAR) | (1L << PUNCTUATION) | (1L << DECIMAL))) != 0) );
			setState(220);
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
			setState(224);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(222);
				item();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(223);
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
		public List<TerminalNode> NEWLINE() { return getTokens(CheckListParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CheckListParser.NEWLINE, i);
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
			setState(229); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(229);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(226);
					function_call();
					}
					break;
				case 2:
					{
					setState(227);
					text();
					}
					break;
				case 3:
					{
					setState(228);
					placeholder();
					}
					break;
				}
				}
				setState(231); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << SPACES) | (1L << CHAR) | (1L << PUNCTUATION) | (1L << DECIMAL))) != 0) );
			setState(234); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(233);
				match(NEWLINE);
				}
				}
				setState(236); 
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
			setState(241);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(238);
				if_stmt();
				}
				break;
			case SPACES:
			case CHAR:
			case PUNCTUATION:
			case DECIMAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(239);
				var_assign();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 3);
				{
				setState(240);
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
			setState(243);
			match(T__0);
			setState(244);
			match(T__1);
			setState(245);
			logical_expr(0);
			setState(246);
			match(T__2);
			setState(247);
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
		enterRule(_localctx, 44, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(NEWLINE);
			setState(250);
			match(INDENT);
			setState(252); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(251);
				stmt();
				}
				}
				setState(254); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__5) | (1L << SPACES) | (1L << CHAR) | (1L << PUNCTUATION) | (1L << DECIMAL))) != 0) );
			setState(256);
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
		public List<TerminalNode> SPACES() { return getTokens(CheckListParser.SPACES); }
		public TerminalNode SPACES(int i) {
			return getToken(CheckListParser.SPACES, i);
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
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				_localctx = new ParenExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(259);
				match(LPAREN);
				setState(261);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACES) {
					{
					setState(260);
					match(SPACES);
					}
				}

				setState(263);
				logical_expr(0);
				setState(265);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACES) {
					{
					setState(264);
					match(SPACES);
					}
				}

				setState(267);
				match(RPAREN);
				}
				break;
			case 2:
				{
				_localctx = new NotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(269);
				match(NOT);
				setState(270);
				logical_expr(3);
				}
				break;
			case 3:
				{
				_localctx = new ComparatorAtomContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(271);
				((ComparatorAtomContext)_localctx).left = atom();
				setState(273);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACES) {
					{
					setState(272);
					match(SPACES);
					}
				}

				setState(275);
				((ComparatorAtomContext)_localctx).op = comparator();
				setState(277);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACES) {
					{
					setState(276);
					match(SPACES);
					}
				}

				setState(279);
				((ComparatorAtomContext)_localctx).right = atom();

				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(296);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BinaryExpressionContext(new Logical_exprContext(_parentctx, _parentState));
					((BinaryExpressionContext)_localctx).left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_logical_expr);
					setState(284);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(286);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SPACES) {
						{
						setState(285);
						match(SPACES);
						}
					}

					setState(288);
					((BinaryExpressionContext)_localctx).op = binary();
					setState(290);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SPACES) {
						{
						setState(289);
						match(SPACES);
						}
					}

					setState(292);
					((BinaryExpressionContext)_localctx).right = logical_expr(2);
					}
					} 
				}
				setState(298);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
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
		public TerminalNode LPAREN() { return getToken(CheckListParser.LPAREN, 0); }
		public Arithmetic_exprContext arithmetic_expr() {
			return getRuleContext(Arithmetic_exprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CheckListParser.RPAREN, 0); }
		public List<TerminalNode> SPACES() { return getTokens(CheckListParser.SPACES); }
		public TerminalNode SPACES(int i) {
			return getToken(CheckListParser.SPACES, i);
		}
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
		public List<TerminalNode> SPACES() { return getTokens(CheckListParser.SPACES); }
		public TerminalNode SPACES(int i) {
			return getToken(CheckListParser.SPACES, i);
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
		public TerminalNode MINUS() { return getToken(CheckListParser.MINUS, 0); }
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
		public List<TerminalNode> SPACES() { return getTokens(CheckListParser.SPACES); }
		public TerminalNode SPACES(int i) {
			return getToken(CheckListParser.SPACES, i);
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
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				_localctx = new ArithmeticExpressionParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(300);
				match(LPAREN);
				setState(302);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACES) {
					{
					setState(301);
					match(SPACES);
					}
				}

				setState(304);
				arithmetic_expr(0);
				setState(306);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACES) {
					{
					setState(305);
					match(SPACES);
					}
				}

				setState(308);
				match(RPAREN);
				}
				break;
			case 2:
				{
				_localctx = new ArithmeticExpressionNegationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(310);
				match(MINUS);
				setState(311);
				arithmetic_expr(2);
				}
				break;
			case 3:
				{
				_localctx = new ArithmeticAtomExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(312);
				atom();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(337);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(335);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
					case 1:
						{
						_localctx = new ArithmeticMultDivExpressionContext(new Arithmetic_exprContext(_parentctx, _parentState));
						((ArithmeticMultDivExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic_expr);
						setState(315);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(317);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==SPACES) {
							{
							setState(316);
							match(SPACES);
							}
						}

						setState(319);
						((ArithmeticMultDivExpressionContext)_localctx).op = arithm_muldiv();
						setState(321);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==SPACES) {
							{
							setState(320);
							match(SPACES);
							}
						}

						setState(323);
						((ArithmeticMultDivExpressionContext)_localctx).right = arithmetic_expr(6);
						}
						break;
					case 2:
						{
						_localctx = new ArithmeticPlusMinusExpressionContext(new Arithmetic_exprContext(_parentctx, _parentState));
						((ArithmeticPlusMinusExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic_expr);
						setState(325);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(327);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==SPACES) {
							{
							setState(326);
							match(SPACES);
							}
						}

						setState(329);
						((ArithmeticPlusMinusExpressionContext)_localctx).op = arithm_plusminus();
						setState(331);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==SPACES) {
							{
							setState(330);
							match(SPACES);
							}
						}

						setState(333);
						((ArithmeticPlusMinusExpressionContext)_localctx).right = arithmetic_expr(5);
						}
						break;
					}
					} 
				}
				setState(339);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
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
		public TerminalNode DECIMAL() { return getToken(CheckListParser.DECIMAL, 0); }
		public Arithmetic_exprContext arithmetic_expr() {
			return getRuleContext(Arithmetic_exprContext.class,0);
		}
		public List<TerminalNode> SPACES() { return getTokens(CheckListParser.SPACES); }
		public TerminalNode SPACES(int i) {
			return getToken(CheckListParser.SPACES, i);
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
		int _la;
		try {
			setState(352);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(340);
				word();
				}
				break;
			case DECIMAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(341);
				match(DECIMAL);
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 3);
				{
				setState(342);
				match(LPAREN);
				setState(344);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACES) {
					{
					setState(343);
					match(SPACES);
					}
				}

				setState(346);
				arithmetic_expr(0);
				setState(348);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACES) {
					{
					setState(347);
					match(SPACES);
					}
				}

				setState(350);
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
		enterRule(_localctx, 52, RULE_comparator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
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
		public TerminalNode MULT() { return getToken(CheckListParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(CheckListParser.DIV, 0); }
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
			setState(356);
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
		public TerminalNode PLUS() { return getToken(CheckListParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(CheckListParser.MINUS, 0); }
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
			setState(358);
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
		enterRule(_localctx, 58, RULE_binary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\36\u016d\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\7\2@"+
		"\n\2\f\2\16\2C\13\2\3\3\7\3F\n\3\f\3\16\3I\13\3\3\3\3\3\6\3M\n\3\r\3\16"+
		"\3N\3\3\3\3\3\4\6\4T\n\4\r\4\16\4U\3\5\3\5\3\5\3\5\5\5\\\n\5\3\6\3\6\5"+
		"\6`\n\6\3\7\3\7\3\7\3\b\3\b\3\b\5\bh\n\b\3\b\3\b\5\bl\n\b\3\b\3\b\3\t"+
		"\3\t\3\n\3\n\3\n\3\n\3\n\3\13\5\13x\n\13\3\13\3\13\5\13|\n\13\3\13\3\13"+
		"\5\13\u0080\n\13\3\13\7\13\u0083\n\13\f\13\16\13\u0086\13\13\5\13\u0088"+
		"\n\13\3\f\3\f\3\f\5\f\u008d\n\f\3\f\3\f\3\f\3\r\6\r\u0093\n\r\r\r\16\r"+
		"\u0094\3\16\3\16\3\16\5\16\u009a\n\16\3\16\3\16\5\16\u009e\n\16\3\16\3"+
		"\16\5\16\u00a2\n\16\3\16\3\16\5\16\u00a6\n\16\3\17\3\17\3\17\5\17\u00ab"+
		"\n\17\3\20\3\20\5\20\u00af\n\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\5\21"+
		"\u00b8\n\21\3\21\5\21\u00bb\n\21\3\21\3\21\5\21\u00bf\n\21\3\21\7\21\u00c2"+
		"\n\21\f\21\16\21\u00c5\13\21\3\22\5\22\u00c8\n\22\3\22\3\22\5\22\u00cc"+
		"\n\22\3\22\3\22\5\22\u00d0\n\22\3\22\3\22\5\22\u00d4\n\22\3\23\3\23\5"+
		"\23\u00d8\n\23\3\23\6\23\u00db\n\23\r\23\16\23\u00dc\3\23\3\23\3\24\3"+
		"\24\5\24\u00e3\n\24\3\25\3\25\3\25\6\25\u00e8\n\25\r\25\16\25\u00e9\3"+
		"\25\6\25\u00ed\n\25\r\25\16\25\u00ee\3\26\3\26\3\26\5\26\u00f4\n\26\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\6\30\u00ff\n\30\r\30\16\30"+
		"\u0100\3\30\3\30\3\31\3\31\3\31\5\31\u0108\n\31\3\31\3\31\5\31\u010c\n"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0114\n\31\3\31\3\31\5\31\u0118"+
		"\n\31\3\31\3\31\3\31\5\31\u011d\n\31\3\31\3\31\5\31\u0121\n\31\3\31\3"+
		"\31\5\31\u0125\n\31\3\31\3\31\7\31\u0129\n\31\f\31\16\31\u012c\13\31\3"+
		"\32\3\32\3\32\5\32\u0131\n\32\3\32\3\32\5\32\u0135\n\32\3\32\3\32\3\32"+
		"\3\32\3\32\5\32\u013c\n\32\3\32\3\32\5\32\u0140\n\32\3\32\3\32\5\32\u0144"+
		"\n\32\3\32\3\32\3\32\3\32\5\32\u014a\n\32\3\32\3\32\5\32\u014e\n\32\3"+
		"\32\3\32\7\32\u0152\n\32\f\32\16\32\u0155\13\32\3\33\3\33\3\33\3\33\5"+
		"\33\u015b\n\33\3\33\3\33\5\33\u015f\n\33\3\33\3\33\5\33\u0163\n\33\3\34"+
		"\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3\37\2\4\60\62 \2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<\2\6\3\2\20\24\3\2\27\30"+
		"\3\2\31\32\3\2\r\16\2\u018f\2A\3\2\2\2\4G\3\2\2\2\6S\3\2\2\2\b[\3\2\2"+
		"\2\n_\3\2\2\2\fa\3\2\2\2\16d\3\2\2\2\20o\3\2\2\2\22q\3\2\2\2\24\u0087"+
		"\3\2\2\2\26\u0089\3\2\2\2\30\u0092\3\2\2\2\32\u0096\3\2\2\2\34\u00aa\3"+
		"\2\2\2\36\u00ac\3\2\2\2 \u00b7\3\2\2\2\"\u00c7\3\2\2\2$\u00d5\3\2\2\2"+
		"&\u00e2\3\2\2\2(\u00e7\3\2\2\2*\u00f3\3\2\2\2,\u00f5\3\2\2\2.\u00fb\3"+
		"\2\2\2\60\u011c\3\2\2\2\62\u013b\3\2\2\2\64\u0162\3\2\2\2\66\u0164\3\2"+
		"\2\28\u0166\3\2\2\2:\u0168\3\2\2\2<\u016a\3\2\2\2>@\5\4\3\2?>\3\2\2\2"+
		"@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2B\3\3\2\2\2CA\3\2\2\2DF\7\34\2\2ED\3\2\2"+
		"\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2HJ\3\2\2\2IG\3\2\2\2JL\5$\23\2KM\5&\24"+
		"\2LK\3\2\2\2MN\3\2\2\2NL\3\2\2\2NO\3\2\2\2OP\3\2\2\2PQ\7\2\2\3Q\5\3\2"+
		"\2\2RT\7\13\2\2SR\3\2\2\2TU\3\2\2\2US\3\2\2\2UV\3\2\2\2V\7\3\2\2\2W\\"+
		"\5\6\4\2X\\\7\f\2\2Y\\\7\33\2\2Z\\\7\n\2\2[W\3\2\2\2[X\3\2\2\2[Y\3\2\2"+
		"\2[Z\3\2\2\2\\\t\3\2\2\2]`\5\f\7\2^`\5\16\b\2_]\3\2\2\2_^\3\2\2\2`\13"+
		"\3\2\2\2ab\7\3\2\2bc\5\6\4\2c\r\3\2\2\2de\7\3\2\2eg\7\4\2\2fh\7\n\2\2"+
		"gf\3\2\2\2gh\3\2\2\2hi\3\2\2\2ik\5\20\t\2jl\7\n\2\2kj\3\2\2\2kl\3\2\2"+
		"\2lm\3\2\2\2mn\7\5\2\2n\17\3\2\2\2op\5\62\32\2p\21\3\2\2\2qr\5\6\4\2r"+
		"s\7\25\2\2st\5\24\13\2tu\7\26\2\2u\23\3\2\2\2vx\5\34\17\2wv\3\2\2\2wx"+
		"\3\2\2\2x\u0088\3\2\2\2y{\5\34\17\2z|\7\n\2\2{z\3\2\2\2{|\3\2\2\2|\u0084"+
		"\3\2\2\2}\177\7\6\2\2~\u0080\7\n\2\2\177~\3\2\2\2\177\u0080\3\2\2\2\u0080"+
		"\u0081\3\2\2\2\u0081\u0083\5\34\17\2\u0082}\3\2\2\2\u0083\u0086\3\2\2"+
		"\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0088\3\2\2\2\u0086\u0084"+
		"\3\2\2\2\u0087w\3\2\2\2\u0087y\3\2\2\2\u0088\25\3\2\2\2\u0089\u008a\5"+
		"\32\16\2\u008a\u008c\7\7\2\2\u008b\u008d\7\n\2\2\u008c\u008b\3\2\2\2\u008c"+
		"\u008d\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008f\5\34\17\2\u008f\u0090\7"+
		"\34\2\2\u0090\27\3\2\2\2\u0091\u0093\5\b\5\2\u0092\u0091\3\2\2\2\u0093"+
		"\u0094\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\31\3\2\2"+
		"\2\u0096\u0097\5\30\r\2\u0097\u0099\7\7\2\2\u0098\u009a\7\n\2\2\u0099"+
		"\u0098\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009d\5\6"+
		"\4\2\u009c\u009e\7\n\2\2\u009d\u009c\3\2\2\2\u009d\u009e\3\2\2\2\u009e"+
		"\u009f\3\2\2\2\u009f\u00a1\7\7\2\2\u00a0\u00a2\7\n\2\2\u00a1\u00a0\3\2"+
		"\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a5\5\6\4\2\u00a4"+
		"\u00a6\7\n\2\2\u00a5\u00a4\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\33\3\2\2"+
		"\2\u00a7\u00ab\7\33\2\2\u00a8\u00ab\5\6\4\2\u00a9\u00ab\5\62\32\2\u00aa"+
		"\u00a7\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00a9\3\2\2\2\u00ab\35\3\2\2"+
		"\2\u00ac\u00ae\7\b\2\2\u00ad\u00af\7\n\2\2\u00ae\u00ad\3\2\2\2\u00ae\u00af"+
		"\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b1\5\6\4\2\u00b1\u00b2\7\25\2\2"+
		"\u00b2\u00b3\5 \21\2\u00b3\u00b4\7\26\2\2\u00b4\u00b5\5.\30\2\u00b5\37"+
		"\3\2\2\2\u00b6\u00b8\5\"\22\2\u00b7\u00b6\3\2\2\2\u00b7\u00b8\3\2\2\2"+
		"\u00b8\u00ba\3\2\2\2\u00b9\u00bb\7\n\2\2\u00ba\u00b9\3\2\2\2\u00ba\u00bb"+
		"\3\2\2\2\u00bb\u00c3\3\2\2\2\u00bc\u00be\7\6\2\2\u00bd\u00bf\7\n\2\2\u00be"+
		"\u00bd\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c2\5\""+
		"\22\2\u00c1\u00bc\3\2\2\2\u00c2\u00c5\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3"+
		"\u00c4\3\2\2\2\u00c4!\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6\u00c8\7\n\2\2"+
		"\u00c7\u00c6\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00cb"+
		"\5\6\4\2\u00ca\u00cc\7\n\2\2\u00cb\u00ca\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc"+
		"\u00cd\3\2\2\2\u00cd\u00cf\7\7\2\2\u00ce\u00d0\7\n\2\2\u00cf\u00ce\3\2"+
		"\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d3\5\6\4\2\u00d2"+
		"\u00d4\7\n\2\2\u00d3\u00d2\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4#\3\2\2\2"+
		"\u00d5\u00d7\7\t\2\2\u00d6\u00d8\7\n\2\2\u00d7\u00d6\3\2\2\2\u00d7\u00d8"+
		"\3\2\2\2\u00d8\u00da\3\2\2\2\u00d9\u00db\5\b\5\2\u00da\u00d9\3\2\2\2\u00db"+
		"\u00dc\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00de\3\2"+
		"\2\2\u00de\u00df\7\34\2\2\u00df%\3\2\2\2\u00e0\u00e3\5(\25\2\u00e1\u00e3"+
		"\5*\26\2\u00e2\u00e0\3\2\2\2\u00e2\u00e1\3\2\2\2\u00e3\'\3\2\2\2\u00e4"+
		"\u00e8\5\22\n\2\u00e5\u00e8\5\b\5\2\u00e6\u00e8\5\n\6\2\u00e7\u00e4\3"+
		"\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9"+
		"\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00ec\3\2\2\2\u00eb\u00ed\7\34"+
		"\2\2\u00ec\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee"+
		"\u00ef\3\2\2\2\u00ef)\3\2\2\2\u00f0\u00f4\5,\27\2\u00f1\u00f4\5\26\f\2"+
		"\u00f2\u00f4\5\36\20\2\u00f3\u00f0\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f2"+
		"\3\2\2\2\u00f4+\3\2\2\2\u00f5\u00f6\7\3\2\2\u00f6\u00f7\7\4\2\2\u00f7"+
		"\u00f8\5\60\31\2\u00f8\u00f9\7\5\2\2\u00f9\u00fa\5.\30\2\u00fa-\3\2\2"+
		"\2\u00fb\u00fc\7\34\2\2\u00fc\u00fe\7\35\2\2\u00fd\u00ff\5&\24\2\u00fe"+
		"\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2"+
		"\2\2\u0101\u0102\3\2\2\2\u0102\u0103\7\36\2\2\u0103/\3\2\2\2\u0104\u0105"+
		"\b\31\1\2\u0105\u0107\7\25\2\2\u0106\u0108\7\n\2\2\u0107\u0106\3\2\2\2"+
		"\u0107\u0108\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010b\5\60\31\2\u010a\u010c"+
		"\7\n\2\2\u010b\u010a\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010d\3\2\2\2\u010d"+
		"\u010e\7\26\2\2\u010e\u011d\3\2\2\2\u010f\u0110\7\17\2\2\u0110\u011d\5"+
		"\60\31\5\u0111\u0113\5\64\33\2\u0112\u0114\7\n\2\2\u0113\u0112\3\2\2\2"+
		"\u0113\u0114\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0117\5\66\34\2\u0116\u0118"+
		"\7\n\2\2\u0117\u0116\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u0119\3\2\2\2\u0119"+
		"\u011a\5\64\33\2\u011a\u011b\b\31\1\2\u011b\u011d\3\2\2\2\u011c\u0104"+
		"\3\2\2\2\u011c\u010f\3\2\2\2\u011c\u0111\3\2\2\2\u011d\u012a\3\2\2\2\u011e"+
		"\u0120\f\3\2\2\u011f\u0121\7\n\2\2\u0120\u011f\3\2\2\2\u0120\u0121\3\2"+
		"\2\2\u0121\u0122\3\2\2\2\u0122\u0124\5<\37\2\u0123\u0125\7\n\2\2\u0124"+
		"\u0123\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0127\5\60"+
		"\31\4\u0127\u0129\3\2\2\2\u0128\u011e\3\2\2\2\u0129\u012c\3\2\2\2\u012a"+
		"\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b\61\3\2\2\2\u012c\u012a\3\2\2"+
		"\2\u012d\u012e\b\32\1\2\u012e\u0130\7\25\2\2\u012f\u0131\7\n\2\2\u0130"+
		"\u012f\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0134\5\62"+
		"\32\2\u0133\u0135\7\n\2\2\u0134\u0133\3\2\2\2\u0134\u0135\3\2\2\2\u0135"+
		"\u0136\3\2\2\2\u0136\u0137\7\26\2\2\u0137\u013c\3\2\2\2\u0138\u0139\7"+
		"\32\2\2\u0139\u013c\5\62\32\4\u013a\u013c\5\64\33\2\u013b\u012d\3\2\2"+
		"\2\u013b\u0138\3\2\2\2\u013b\u013a\3\2\2\2\u013c\u0153\3\2\2\2\u013d\u013f"+
		"\f\7\2\2\u013e\u0140\7\n\2\2\u013f\u013e\3\2\2\2\u013f\u0140\3\2\2\2\u0140"+
		"\u0141\3\2\2\2\u0141\u0143\58\35\2\u0142\u0144\7\n\2\2\u0143\u0142\3\2"+
		"\2\2\u0143\u0144\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0146\5\62\32\b\u0146"+
		"\u0152\3\2\2\2\u0147\u0149\f\6\2\2\u0148\u014a\7\n\2\2\u0149\u0148\3\2"+
		"\2\2\u0149\u014a\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u014d\5:\36\2\u014c"+
		"\u014e\7\n\2\2\u014d\u014c\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u014f\3\2"+
		"\2\2\u014f\u0150\5\62\32\7\u0150\u0152\3\2\2\2\u0151\u013d\3\2\2\2\u0151"+
		"\u0147\3\2\2\2\u0152\u0155\3\2\2\2\u0153\u0151\3\2\2\2\u0153\u0154\3\2"+
		"\2\2\u0154\63\3\2\2\2\u0155\u0153\3\2\2\2\u0156\u0163\5\6\4\2\u0157\u0163"+
		"\7\33\2\2\u0158\u015a\7\25\2\2\u0159\u015b\7\n\2\2\u015a\u0159\3\2\2\2"+
		"\u015a\u015b\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u015e\5\62\32\2\u015d\u015f"+
		"\7\n\2\2\u015e\u015d\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u0160\3\2\2\2\u0160"+
		"\u0161\7\26\2\2\u0161\u0163\3\2\2\2\u0162\u0156\3\2\2\2\u0162\u0157\3"+
		"\2\2\2\u0162\u0158\3\2\2\2\u0163\65\3\2\2\2\u0164\u0165\t\2\2\2\u0165"+
		"\67\3\2\2\2\u0166\u0167\t\3\2\2\u01679\3\2\2\2\u0168\u0169\t\4\2\2\u0169"+
		";\3\2\2\2\u016a\u016b\t\5\2\2\u016b=\3\2\2\2;AGNU[_gkw{\177\u0084\u0087"+
		"\u008c\u0094\u0099\u009d\u00a1\u00a5\u00aa\u00ae\u00b7\u00ba\u00be\u00c3"+
		"\u00c7\u00cb\u00cf\u00d3\u00d7\u00dc\u00e2\u00e7\u00e9\u00ee\u00f3\u0100"+
		"\u0107\u010b\u0113\u0117\u011c\u0120\u0124\u012a\u0130\u0134\u013b\u013f"+
		"\u0143\u0149\u014d\u0151\u0153\u015a\u015e\u0162";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}