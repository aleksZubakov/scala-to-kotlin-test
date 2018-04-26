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
		RULE_arithmetic_expr = 24, RULE_atom = 25, RULE_comparator = 26, RULE_arithmetic = 27, 
		RULE_binary = 28;
	public static final String[] ruleNames = {
		"file_input", "template", "word", "text", "placeholder", "simple_placeholder", 
		"placeholder_with_body", "placeholder_body", "function_call", "var_ref", 
		"var_assign", "description", "var_def", "rvalue", "func_def", "args", 
		"arg", "heading", "stmt", "item", "compound_stmt", "if_stmt", "body", 
		"logical_expr", "arithmetic_expr", "atom", "comparator", "arithmetic", 
		"binary"
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
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6 || _la==NEWLINE) {
				{
				{
				setState(58);
				template();
				}
				}
				setState(63);
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
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(64);
				match(NEWLINE);
				}
				}
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(70);
			heading();
			setState(72); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(71);
				stmt();
				}
				}
				setState(74); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__5) | (1L << SPACES) | (1L << CHAR) | (1L << PUNCTUATION) | (1L << DECIMAL))) != 0) );
			setState(76);
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
			setState(79); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(78);
					match(CHAR);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(81); 
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
		enterRule(_localctx, 6, RULE_text);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHAR:
				{
				setState(83);
				word();
				}
				break;
			case SPACES:
				{
				setState(84);
				match(SPACES);
				}
				break;
			case DECIMAL:
				{
				setState(85);
				match(DECIMAL);
				}
				break;
			case PUNCTUATION:
				{
				setState(86);
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
			setState(91);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				simple_placeholder();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
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
			setState(93);
			match(T__0);
			setState(94);
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
			setState(96);
			match(T__0);
			setState(97);
			match(T__1);
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACES) {
				{
				setState(98);
				match(SPACES);
				}
			}

			setState(101);
			placeholder_body();
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACES) {
				{
				setState(102);
				match(SPACES);
				}
			}

			setState(105);
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
			setState(107);
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
			setState(109);
			((Function_callContext)_localctx).func_name = word();
			setState(110);
			match(LPAREN);
			setState(111);
			var_ref();
			setState(112);
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
			setState(131);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CHAR || _la==DECIMAL) {
					{
					setState(114);
					rvalue();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				rvalue();
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACES) {
					{
					setState(118);
					match(SPACES);
					}
				}

				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(121);
					match(T__3);
					setState(123);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SPACES) {
						{
						setState(122);
						match(SPACES);
						}
					}

					setState(125);
					rvalue();
					}
					}
					setState(130);
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
			setState(133);
			var_def();
			setState(134);
			match(T__4);
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACES) {
				{
				setState(135);
				match(SPACES);
				}
			}

			setState(138);
			((Var_assignContext)_localctx).varValue = rvalue();
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
			setState(141); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(140);
				text();
				}
				}
				setState(143); 
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
			setState(145);
			description();
			setState(146);
			match(T__4);
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACES) {
				{
				setState(147);
				match(SPACES);
				}
			}

			setState(150);
			((Var_defContext)_localctx).lval = word();
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACES) {
				{
				setState(151);
				match(SPACES);
				}
			}

			setState(154);
			match(T__4);
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACES) {
				{
				setState(155);
				match(SPACES);
				}
			}

			setState(158);
			((Var_defContext)_localctx).varType = word();
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACES) {
				{
				setState(159);
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
			setState(164);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECIMAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				match(DECIMAL);
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
				word();
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
			setState(166);
			match(T__5);
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACES) {
				{
				setState(167);
				match(SPACES);
				}
			}

			setState(170);
			((Func_defContext)_localctx).name = word();
			setState(171);
			match(LPAREN);
			setState(172);
			args();
			setState(173);
			match(RPAREN);
			setState(174);
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
			setState(177);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(176);
				arg();
				}
				break;
			}
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACES) {
				{
				setState(179);
				match(SPACES);
				}
			}

			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(182);
				match(T__3);
				setState(184);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(183);
					match(SPACES);
					}
					break;
				}
				setState(186);
				arg();
				}
				}
				setState(191);
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
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACES) {
				{
				setState(192);
				match(SPACES);
				}
			}

			setState(195);
			((ArgContext)_localctx).lval = word();
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
			match(T__4);
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
			((ArgContext)_localctx).varType = word();
			setState(205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(204);
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
			setState(207);
			match(T__6);
			}
			setState(209);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(208);
				match(SPACES);
				}
				break;
			}
			setState(212); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(211);
				text();
				}
				}
				setState(214); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACES) | (1L << CHAR) | (1L << PUNCTUATION) | (1L << DECIMAL))) != 0) );
			setState(216);
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
			setState(220);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(218);
				item();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(219);
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
			setState(225); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(225);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(222);
					function_call();
					}
					break;
				case 2:
					{
					setState(223);
					text();
					}
					break;
				case 3:
					{
					setState(224);
					placeholder();
					}
					break;
				}
				}
				setState(227); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << SPACES) | (1L << CHAR) | (1L << PUNCTUATION) | (1L << DECIMAL))) != 0) );
			setState(229);
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
			setState(234);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(231);
				if_stmt();
				}
				break;
			case SPACES:
			case CHAR:
			case PUNCTUATION:
			case DECIMAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(232);
				var_assign();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 3);
				{
				setState(233);
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
			setState(236);
			match(T__0);
			setState(237);
			match(T__1);
			setState(238);
			logical_expr(0);
			setState(239);
			match(T__2);
			setState(240);
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
			setState(242);
			match(NEWLINE);
			setState(243);
			match(INDENT);
			setState(245); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(244);
				stmt();
				}
				}
				setState(247); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__5) | (1L << SPACES) | (1L << CHAR) | (1L << PUNCTUATION) | (1L << DECIMAL))) != 0) );
			setState(249);
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
			setState(275);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				_localctx = new ParenExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(252);
				match(LPAREN);
				setState(254);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACES) {
					{
					setState(253);
					match(SPACES);
					}
				}

				setState(256);
				logical_expr(0);
				setState(258);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACES) {
					{
					setState(257);
					match(SPACES);
					}
				}

				setState(260);
				match(RPAREN);
				}
				break;
			case 2:
				{
				_localctx = new NotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(262);
				match(NOT);
				setState(263);
				logical_expr(3);
				}
				break;
			case 3:
				{
				_localctx = new ComparatorAtomContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(264);
				((ComparatorAtomContext)_localctx).left = atom();
				setState(266);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACES) {
					{
					setState(265);
					match(SPACES);
					}
				}

				setState(268);
				((ComparatorAtomContext)_localctx).op = comparator();
				setState(270);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACES) {
					{
					setState(269);
					match(SPACES);
					}
				}

				setState(272);
				((ComparatorAtomContext)_localctx).right = atom();

				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(289);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BinaryExpressionContext(new Logical_exprContext(_parentctx, _parentState));
					((BinaryExpressionContext)_localctx).left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_logical_expr);
					setState(277);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(279);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SPACES) {
						{
						setState(278);
						match(SPACES);
						}
					}

					setState(281);
					((BinaryExpressionContext)_localctx).op = binary();
					setState(283);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SPACES) {
						{
						setState(282);
						match(SPACES);
						}
					}

					setState(285);
					((BinaryExpressionContext)_localctx).right = logical_expr(2);
					}
					} 
				}
				setState(291);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
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
	public static class ArithmeticExpressionContext extends Arithmetic_exprContext {
		public Arithmetic_exprContext left;
		public ArithmeticContext op;
		public Arithmetic_exprContext right;
		public List<Arithmetic_exprContext> arithmetic_expr() {
			return getRuleContexts(Arithmetic_exprContext.class);
		}
		public Arithmetic_exprContext arithmetic_expr(int i) {
			return getRuleContext(Arithmetic_exprContext.class,i);
		}
		public ArithmeticContext arithmetic() {
			return getRuleContext(ArithmeticContext.class,0);
		}
		public List<TerminalNode> SPACES() { return getTokens(CheckListParser.SPACES); }
		public TerminalNode SPACES(int i) {
			return getToken(CheckListParser.SPACES, i);
		}
		public ArithmeticExpressionContext(Arithmetic_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CheckListListener ) ((CheckListListener)listener).enterArithmeticExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CheckListListener ) ((CheckListListener)listener).exitArithmeticExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CheckListVisitor ) return ((CheckListVisitor<? extends T>)visitor).visitArithmeticExpression(this);
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
			setState(306);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				_localctx = new ArithmeticExpressionParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(293);
				match(LPAREN);
				setState(295);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACES) {
					{
					setState(294);
					match(SPACES);
					}
				}

				setState(297);
				arithmetic_expr(0);
				setState(299);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACES) {
					{
					setState(298);
					match(SPACES);
					}
				}

				setState(301);
				match(RPAREN);
				}
				break;
			case 2:
				{
				_localctx = new ArithmeticExpressionNegationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(303);
				match(MINUS);
				setState(304);
				arithmetic_expr(2);
				}
				break;
			case 3:
				{
				_localctx = new ArithmeticAtomExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(305);
				atom();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(320);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArithmeticExpressionContext(new Arithmetic_exprContext(_parentctx, _parentState));
					((ArithmeticExpressionContext)_localctx).left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_arithmetic_expr);
					setState(308);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(310);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SPACES) {
						{
						setState(309);
						match(SPACES);
						}
					}

					setState(312);
					((ArithmeticExpressionContext)_localctx).op = arithmetic();
					setState(314);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SPACES) {
						{
						setState(313);
						match(SPACES);
						}
					}

					setState(316);
					((ArithmeticExpressionContext)_localctx).right = arithmetic_expr(5);
					}
					} 
				}
				setState(322);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
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
			setState(335);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(323);
				word();
				}
				break;
			case DECIMAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(324);
				match(DECIMAL);
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 3);
				{
				setState(325);
				match(LPAREN);
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
				arithmetic_expr(0);
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
			setState(337);
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

	public static class ArithmeticContext extends ParserRuleContext {
		public TerminalNode MULT() { return getToken(CheckListParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(CheckListParser.DIV, 0); }
		public TerminalNode PLUS() { return getToken(CheckListParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(CheckListParser.MINUS, 0); }
		public ArithmeticContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmetic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CheckListListener ) ((CheckListListener)listener).enterArithmetic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CheckListListener ) ((CheckListListener)listener).exitArithmetic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CheckListVisitor ) return ((CheckListVisitor<? extends T>)visitor).visitArithmetic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithmeticContext arithmetic() throws RecognitionException {
		ArithmeticContext _localctx = new ArithmeticContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_arithmetic);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULT) | (1L << DIV) | (1L << PLUS) | (1L << MINUS))) != 0)) ) {
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
		enterRule(_localctx, 56, RULE_binary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
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
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\36\u015a\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\7\2>\n\2\f\2\16"+
		"\2A\13\2\3\3\7\3D\n\3\f\3\16\3G\13\3\3\3\3\3\6\3K\n\3\r\3\16\3L\3\3\3"+
		"\3\3\4\6\4R\n\4\r\4\16\4S\3\5\3\5\3\5\3\5\5\5Z\n\5\3\6\3\6\5\6^\n\6\3"+
		"\7\3\7\3\7\3\b\3\b\3\b\5\bf\n\b\3\b\3\b\5\bj\n\b\3\b\3\b\3\t\3\t\3\n\3"+
		"\n\3\n\3\n\3\n\3\13\5\13v\n\13\3\13\3\13\5\13z\n\13\3\13\3\13\5\13~\n"+
		"\13\3\13\7\13\u0081\n\13\f\13\16\13\u0084\13\13\5\13\u0086\n\13\3\f\3"+
		"\f\3\f\5\f\u008b\n\f\3\f\3\f\3\r\6\r\u0090\n\r\r\r\16\r\u0091\3\16\3\16"+
		"\3\16\5\16\u0097\n\16\3\16\3\16\5\16\u009b\n\16\3\16\3\16\5\16\u009f\n"+
		"\16\3\16\3\16\5\16\u00a3\n\16\3\17\3\17\5\17\u00a7\n\17\3\20\3\20\5\20"+
		"\u00ab\n\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\5\21\u00b4\n\21\3\21\5"+
		"\21\u00b7\n\21\3\21\3\21\5\21\u00bb\n\21\3\21\7\21\u00be\n\21\f\21\16"+
		"\21\u00c1\13\21\3\22\5\22\u00c4\n\22\3\22\3\22\5\22\u00c8\n\22\3\22\3"+
		"\22\5\22\u00cc\n\22\3\22\3\22\5\22\u00d0\n\22\3\23\3\23\5\23\u00d4\n\23"+
		"\3\23\6\23\u00d7\n\23\r\23\16\23\u00d8\3\23\3\23\3\24\3\24\5\24\u00df"+
		"\n\24\3\25\3\25\3\25\6\25\u00e4\n\25\r\25\16\25\u00e5\3\25\3\25\3\26\3"+
		"\26\3\26\5\26\u00ed\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30"+
		"\6\30\u00f8\n\30\r\30\16\30\u00f9\3\30\3\30\3\31\3\31\3\31\5\31\u0101"+
		"\n\31\3\31\3\31\5\31\u0105\n\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u010d"+
		"\n\31\3\31\3\31\5\31\u0111\n\31\3\31\3\31\3\31\5\31\u0116\n\31\3\31\3"+
		"\31\5\31\u011a\n\31\3\31\3\31\5\31\u011e\n\31\3\31\3\31\7\31\u0122\n\31"+
		"\f\31\16\31\u0125\13\31\3\32\3\32\3\32\5\32\u012a\n\32\3\32\3\32\5\32"+
		"\u012e\n\32\3\32\3\32\3\32\3\32\3\32\5\32\u0135\n\32\3\32\3\32\5\32\u0139"+
		"\n\32\3\32\3\32\5\32\u013d\n\32\3\32\3\32\7\32\u0141\n\32\f\32\16\32\u0144"+
		"\13\32\3\33\3\33\3\33\3\33\5\33\u014a\n\33\3\33\3\33\5\33\u014e\n\33\3"+
		"\33\3\33\5\33\u0152\n\33\3\34\3\34\3\35\3\35\3\36\3\36\3\36\2\4\60\62"+
		"\37\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:\2\5"+
		"\3\2\20\24\3\2\27\32\3\2\r\16\2\u0178\2?\3\2\2\2\4E\3\2\2\2\6Q\3\2\2\2"+
		"\bY\3\2\2\2\n]\3\2\2\2\f_\3\2\2\2\16b\3\2\2\2\20m\3\2\2\2\22o\3\2\2\2"+
		"\24\u0085\3\2\2\2\26\u0087\3\2\2\2\30\u008f\3\2\2\2\32\u0093\3\2\2\2\34"+
		"\u00a6\3\2\2\2\36\u00a8\3\2\2\2 \u00b3\3\2\2\2\"\u00c3\3\2\2\2$\u00d1"+
		"\3\2\2\2&\u00de\3\2\2\2(\u00e3\3\2\2\2*\u00ec\3\2\2\2,\u00ee\3\2\2\2."+
		"\u00f4\3\2\2\2\60\u0115\3\2\2\2\62\u0134\3\2\2\2\64\u0151\3\2\2\2\66\u0153"+
		"\3\2\2\28\u0155\3\2\2\2:\u0157\3\2\2\2<>\5\4\3\2=<\3\2\2\2>A\3\2\2\2?"+
		"=\3\2\2\2?@\3\2\2\2@\3\3\2\2\2A?\3\2\2\2BD\7\34\2\2CB\3\2\2\2DG\3\2\2"+
		"\2EC\3\2\2\2EF\3\2\2\2FH\3\2\2\2GE\3\2\2\2HJ\5$\23\2IK\5&\24\2JI\3\2\2"+
		"\2KL\3\2\2\2LJ\3\2\2\2LM\3\2\2\2MN\3\2\2\2NO\7\2\2\3O\5\3\2\2\2PR\7\13"+
		"\2\2QP\3\2\2\2RS\3\2\2\2SQ\3\2\2\2ST\3\2\2\2T\7\3\2\2\2UZ\5\6\4\2VZ\7"+
		"\n\2\2WZ\7\33\2\2XZ\7\f\2\2YU\3\2\2\2YV\3\2\2\2YW\3\2\2\2YX\3\2\2\2Z\t"+
		"\3\2\2\2[^\5\f\7\2\\^\5\16\b\2][\3\2\2\2]\\\3\2\2\2^\13\3\2\2\2_`\7\3"+
		"\2\2`a\5\6\4\2a\r\3\2\2\2bc\7\3\2\2ce\7\4\2\2df\7\n\2\2ed\3\2\2\2ef\3"+
		"\2\2\2fg\3\2\2\2gi\5\20\t\2hj\7\n\2\2ih\3\2\2\2ij\3\2\2\2jk\3\2\2\2kl"+
		"\7\5\2\2l\17\3\2\2\2mn\5\62\32\2n\21\3\2\2\2op\5\6\4\2pq\7\25\2\2qr\5"+
		"\24\13\2rs\7\26\2\2s\23\3\2\2\2tv\5\34\17\2ut\3\2\2\2uv\3\2\2\2v\u0086"+
		"\3\2\2\2wy\5\34\17\2xz\7\n\2\2yx\3\2\2\2yz\3\2\2\2z\u0082\3\2\2\2{}\7"+
		"\6\2\2|~\7\n\2\2}|\3\2\2\2}~\3\2\2\2~\177\3\2\2\2\177\u0081\5\34\17\2"+
		"\u0080{\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3"+
		"\2\2\2\u0083\u0086\3\2\2\2\u0084\u0082\3\2\2\2\u0085u\3\2\2\2\u0085w\3"+
		"\2\2\2\u0086\25\3\2\2\2\u0087\u0088\5\32\16\2\u0088\u008a\7\7\2\2\u0089"+
		"\u008b\7\n\2\2\u008a\u0089\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008c\3\2"+
		"\2\2\u008c\u008d\5\34\17\2\u008d\27\3\2\2\2\u008e\u0090\5\b\5\2\u008f"+
		"\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2"+
		"\2\2\u0092\31\3\2\2\2\u0093\u0094\5\30\r\2\u0094\u0096\7\7\2\2\u0095\u0097"+
		"\7\n\2\2\u0096\u0095\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0098\3\2\2\2\u0098"+
		"\u009a\5\6\4\2\u0099\u009b\7\n\2\2\u009a\u0099\3\2\2\2\u009a\u009b\3\2"+
		"\2\2\u009b\u009c\3\2\2\2\u009c\u009e\7\7\2\2\u009d\u009f\7\n\2\2\u009e"+
		"\u009d\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a2\5\6"+
		"\4\2\u00a1\u00a3\7\n\2\2\u00a2\u00a1\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3"+
		"\33\3\2\2\2\u00a4\u00a7\7\33\2\2\u00a5\u00a7\5\6\4\2\u00a6\u00a4\3\2\2"+
		"\2\u00a6\u00a5\3\2\2\2\u00a7\35\3\2\2\2\u00a8\u00aa\7\b\2\2\u00a9\u00ab"+
		"\7\n\2\2\u00aa\u00a9\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac"+
		"\u00ad\5\6\4\2\u00ad\u00ae\7\25\2\2\u00ae\u00af\5 \21\2\u00af\u00b0\7"+
		"\26\2\2\u00b0\u00b1\5.\30\2\u00b1\37\3\2\2\2\u00b2\u00b4\5\"\22\2\u00b3"+
		"\u00b2\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b6\3\2\2\2\u00b5\u00b7\7\n"+
		"\2\2\u00b6\u00b5\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00bf\3\2\2\2\u00b8"+
		"\u00ba\7\6\2\2\u00b9\u00bb\7\n\2\2\u00ba\u00b9\3\2\2\2\u00ba\u00bb\3\2"+
		"\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00be\5\"\22\2\u00bd\u00b8\3\2\2\2\u00be"+
		"\u00c1\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0!\3\2\2\2"+
		"\u00c1\u00bf\3\2\2\2\u00c2\u00c4\7\n\2\2\u00c3\u00c2\3\2\2\2\u00c3\u00c4"+
		"\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c7\5\6\4\2\u00c6\u00c8\7\n\2\2\u00c7"+
		"\u00c6\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00cb\7\7"+
		"\2\2\u00ca\u00cc\7\n\2\2\u00cb\u00ca\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc"+
		"\u00cd\3\2\2\2\u00cd\u00cf\5\6\4\2\u00ce\u00d0\7\n\2\2\u00cf\u00ce\3\2"+
		"\2\2\u00cf\u00d0\3\2\2\2\u00d0#\3\2\2\2\u00d1\u00d3\7\t\2\2\u00d2\u00d4"+
		"\7\n\2\2\u00d3\u00d2\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d6\3\2\2\2\u00d5"+
		"\u00d7\5\b\5\2\u00d6\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d6\3\2"+
		"\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00db\7\34\2\2\u00db"+
		"%\3\2\2\2\u00dc\u00df\5(\25\2\u00dd\u00df\5*\26\2\u00de\u00dc\3\2\2\2"+
		"\u00de\u00dd\3\2\2\2\u00df\'\3\2\2\2\u00e0\u00e4\5\22\n\2\u00e1\u00e4"+
		"\5\b\5\2\u00e2\u00e4\5\n\6\2\u00e3\u00e0\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3"+
		"\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2"+
		"\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e8\7\34\2\2\u00e8)\3\2\2\2\u00e9\u00ed"+
		"\5,\27\2\u00ea\u00ed\5\26\f\2\u00eb\u00ed\5\36\20\2\u00ec\u00e9\3\2\2"+
		"\2\u00ec\u00ea\3\2\2\2\u00ec\u00eb\3\2\2\2\u00ed+\3\2\2\2\u00ee\u00ef"+
		"\7\3\2\2\u00ef\u00f0\7\4\2\2\u00f0\u00f1\5\60\31\2\u00f1\u00f2\7\5\2\2"+
		"\u00f2\u00f3\5.\30\2\u00f3-\3\2\2\2\u00f4\u00f5\7\34\2\2\u00f5\u00f7\7"+
		"\35\2\2\u00f6\u00f8\5&\24\2\u00f7\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9"+
		"\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fc\7\36"+
		"\2\2\u00fc/\3\2\2\2\u00fd\u00fe\b\31\1\2\u00fe\u0100\7\25\2\2\u00ff\u0101"+
		"\7\n\2\2\u0100\u00ff\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0102\3\2\2\2\u0102"+
		"\u0104\5\60\31\2\u0103\u0105\7\n\2\2\u0104\u0103\3\2\2\2\u0104\u0105\3"+
		"\2\2\2\u0105\u0106\3\2\2\2\u0106\u0107\7\26\2\2\u0107\u0116\3\2\2\2\u0108"+
		"\u0109\7\17\2\2\u0109\u0116\5\60\31\5\u010a\u010c\5\64\33\2\u010b\u010d"+
		"\7\n\2\2\u010c\u010b\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010e\3\2\2\2\u010e"+
		"\u0110\5\66\34\2\u010f\u0111\7\n\2\2\u0110\u010f\3\2\2\2\u0110\u0111\3"+
		"\2\2\2\u0111\u0112\3\2\2\2\u0112\u0113\5\64\33\2\u0113\u0114\b\31\1\2"+
		"\u0114\u0116\3\2\2\2\u0115\u00fd\3\2\2\2\u0115\u0108\3\2\2\2\u0115\u010a"+
		"\3\2\2\2\u0116\u0123\3\2\2\2\u0117\u0119\f\3\2\2\u0118\u011a\7\n\2\2\u0119"+
		"\u0118\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011d\5:"+
		"\36\2\u011c\u011e\7\n\2\2\u011d\u011c\3\2\2\2\u011d\u011e\3\2\2\2\u011e"+
		"\u011f\3\2\2\2\u011f\u0120\5\60\31\4\u0120\u0122\3\2\2\2\u0121\u0117\3"+
		"\2\2\2\u0122\u0125\3\2\2\2\u0123\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124"+
		"\61\3\2\2\2\u0125\u0123\3\2\2\2\u0126\u0127\b\32\1\2\u0127\u0129\7\25"+
		"\2\2\u0128\u012a\7\n\2\2\u0129\u0128\3\2\2\2\u0129\u012a\3\2\2\2\u012a"+
		"\u012b\3\2\2\2\u012b\u012d\5\62\32\2\u012c\u012e\7\n\2\2\u012d\u012c\3"+
		"\2\2\2\u012d\u012e\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0130\7\26\2\2\u0130"+
		"\u0135\3\2\2\2\u0131\u0132\7\32\2\2\u0132\u0135\5\62\32\4\u0133\u0135"+
		"\5\64\33\2\u0134\u0126\3\2\2\2\u0134\u0131\3\2\2\2\u0134\u0133\3\2\2\2"+
		"\u0135\u0142\3\2\2\2\u0136\u0138\f\6\2\2\u0137\u0139\7\n\2\2\u0138\u0137"+
		"\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u013c\58\35\2\u013b"+
		"\u013d\7\n\2\2\u013c\u013b\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013e\3\2"+
		"\2\2\u013e\u013f\5\62\32\7\u013f\u0141\3\2\2\2\u0140\u0136\3\2\2\2\u0141"+
		"\u0144\3\2\2\2\u0142\u0140\3\2\2\2\u0142\u0143\3\2\2\2\u0143\63\3\2\2"+
		"\2\u0144\u0142\3\2\2\2\u0145\u0152\5\6\4\2\u0146\u0152\7\33\2\2\u0147"+
		"\u0149\7\25\2\2\u0148\u014a\7\n\2\2\u0149\u0148\3\2\2\2\u0149\u014a\3"+
		"\2\2\2\u014a\u014b\3\2\2\2\u014b\u014d\5\62\32\2\u014c\u014e\7\n\2\2\u014d"+
		"\u014c\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0150\7\26"+
		"\2\2\u0150\u0152\3\2\2\2\u0151\u0145\3\2\2\2\u0151\u0146\3\2\2\2\u0151"+
		"\u0147\3\2\2\2\u0152\65\3\2\2\2\u0153\u0154\t\2\2\2\u0154\67\3\2\2\2\u0155"+
		"\u0156\t\3\2\2\u01569\3\2\2\2\u0157\u0158\t\4\2\2\u0158;\3\2\2\2\67?E"+
		"LSY]eiuy}\u0082\u0085\u008a\u0091\u0096\u009a\u009e\u00a2\u00a6\u00aa"+
		"\u00b3\u00b6\u00ba\u00bf\u00c3\u00c7\u00cb\u00cf\u00d3\u00d8\u00de\u00e3"+
		"\u00e5\u00ec\u00f9\u0100\u0104\u010c\u0110\u0115\u0119\u011d\u0123\u0129"+
		"\u012d\u0134\u0138\u013c\u0142\u0149\u014d\u0151";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}