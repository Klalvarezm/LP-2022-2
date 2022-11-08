// Generated from C:/Users/Kevin/Documents/GitHub/LP-2022-2/interpreter/grammar\interpreter.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class interpreterParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		ID=25, PIZQ=26, PDER=27, ROP=28, SMCOLON=29, MULOP=30, SUMOP=31, LOGIC=32, 
		LOGICNOT=33, LINE_COMMENT=34, INTEGER=35, FLOAT=36, STRING=37, WS=38;
	public static final int
		RULE_codeblock = 0, RULE_statement = 1, RULE_bodyblock = 2, RULE_arraydeclaration = 3, 
		RULE_functioncreation = 4, RULE_maincreation = 5, RULE_params = 6, RULE_returndt = 7, 
		RULE_vardeclaration = 8, RULE_datatypedeclaration = 9, RULE_forstatement = 10, 
		RULE_whilestatement = 11, RULE_printstatement = 12, RULE_asignationstatement = 13, 
		RULE_conditional = 14, RULE_inputstatement = 15, RULE_logicexpr = 16, 
		RULE_mathexpr = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"codeblock", "statement", "bodyblock", "arraydeclaration", "functioncreation", 
			"maincreation", "params", "returndt", "vardeclaration", "datatypedeclaration", 
			"forstatement", "whilestatement", "printstatement", "asignationstatement", 
			"conditional", "inputstatement", "logicexpr", "mathexpr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Function '", "'array'", "'?'", "'returns '", "'Main'", "','", 
			"'nothing'", "'integer '", "'float '", "'for '", "'while '", "'Put '", 
			"' to '", "'output'", "'='", "'if'", "'elseif'", "'else'", "'Get'", "'next'", 
			"'input'", "'SquareRoot'", "'RaiseToPower'", "'AbsoluteValue'", null, 
			"'('", "')'", null, "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "ID", "PIZQ", "PDER", "ROP", "SMCOLON", "MULOP", "SUMOP", "LOGIC", 
			"LOGICNOT", "LINE_COMMENT", "INTEGER", "FLOAT", "STRING", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "interpreter.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public interpreterParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class CodeblockContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode EOF() { return getToken(interpreterParser.EOF, 0); }
		public CodeblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codeblock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).enterCodeblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).exitCodeblock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof interpreterVisitor ) return ((interpreterVisitor<? extends T>)visitor).visitCodeblock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodeblockContext codeblock() throws RecognitionException {
		CodeblockContext _localctx = new CodeblockContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_codeblock);
		try {
			setState(38);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__15:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(36);
				statement();
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
				setState(37);
				match(EOF);
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

	public static class StatementContext extends ParserRuleContext {
		public MaincreationContext maincreation() {
			return getRuleContext(MaincreationContext.class,0);
		}
		public List<FunctioncreationContext> functioncreation() {
			return getRuleContexts(FunctioncreationContext.class);
		}
		public FunctioncreationContext functioncreation(int i) {
			return getRuleContext(FunctioncreationContext.class,i);
		}
		public BodyblockContext bodyblock() {
			return getRuleContext(BodyblockContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof interpreterVisitor ) return ((interpreterVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			int _alt;
			setState(49);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(41); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(40);
						functioncreation();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(43); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(45);
				match(T__0);
				setState(46);
				maincreation();
				}
				break;
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__15:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(48);
				bodyblock();
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

	public static class BodyblockContext extends ParserRuleContext {
		public List<WhilestatementContext> whilestatement() {
			return getRuleContexts(WhilestatementContext.class);
		}
		public WhilestatementContext whilestatement(int i) {
			return getRuleContext(WhilestatementContext.class,i);
		}
		public List<VardeclarationContext> vardeclaration() {
			return getRuleContexts(VardeclarationContext.class);
		}
		public VardeclarationContext vardeclaration(int i) {
			return getRuleContext(VardeclarationContext.class,i);
		}
		public List<InputstatementContext> inputstatement() {
			return getRuleContexts(InputstatementContext.class);
		}
		public InputstatementContext inputstatement(int i) {
			return getRuleContext(InputstatementContext.class,i);
		}
		public List<ArraydeclarationContext> arraydeclaration() {
			return getRuleContexts(ArraydeclarationContext.class);
		}
		public ArraydeclarationContext arraydeclaration(int i) {
			return getRuleContext(ArraydeclarationContext.class,i);
		}
		public List<PrintstatementContext> printstatement() {
			return getRuleContexts(PrintstatementContext.class);
		}
		public PrintstatementContext printstatement(int i) {
			return getRuleContext(PrintstatementContext.class,i);
		}
		public List<AsignationstatementContext> asignationstatement() {
			return getRuleContexts(AsignationstatementContext.class);
		}
		public AsignationstatementContext asignationstatement(int i) {
			return getRuleContext(AsignationstatementContext.class,i);
		}
		public List<ConditionalContext> conditional() {
			return getRuleContexts(ConditionalContext.class);
		}
		public ConditionalContext conditional(int i) {
			return getRuleContext(ConditionalContext.class,i);
		}
		public List<ForstatementContext> forstatement() {
			return getRuleContexts(ForstatementContext.class);
		}
		public ForstatementContext forstatement(int i) {
			return getRuleContext(ForstatementContext.class,i);
		}
		public BodyblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bodyblock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).enterBodyblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).exitBodyblock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof interpreterVisitor ) return ((interpreterVisitor<? extends T>)visitor).visitBodyblock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyblockContext bodyblock() throws RecognitionException {
		BodyblockContext _localctx = new BodyblockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_bodyblock);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(87); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(87);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						setState(52); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(51);
								vardeclaration();
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(54); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						break;
					case 2:
						{
						setState(57); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(56);
								inputstatement();
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(59); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						break;
					case 3:
						{
						setState(62); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(61);
								arraydeclaration();
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(64); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						break;
					case 4:
						{
						setState(67); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(66);
								printstatement();
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(69); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						break;
					case 5:
						{
						setState(72); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(71);
								asignationstatement();
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(74); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						break;
					case 6:
						{
						setState(77); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(76);
								conditional();
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(79); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						break;
					case 7:
						{
						setState(82); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(81);
								forstatement();
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(84); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						break;
					case 8:
						{
						{
						setState(86);
						whilestatement();
						}
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(89); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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

	public static class ArraydeclarationContext extends ParserRuleContext {
		public DatatypedeclarationContext datatypedeclaration() {
			return getRuleContext(DatatypedeclarationContext.class,0);
		}
		public TerminalNode PIZQ() { return getToken(interpreterParser.PIZQ, 0); }
		public TerminalNode PDER() { return getToken(interpreterParser.PDER, 0); }
		public TerminalNode ID() { return getToken(interpreterParser.ID, 0); }
		public TerminalNode INTEGER() { return getToken(interpreterParser.INTEGER, 0); }
		public ArraydeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arraydeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).enterArraydeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).exitArraydeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof interpreterVisitor ) return ((interpreterVisitor<? extends T>)visitor).visitArraydeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArraydeclarationContext arraydeclaration() throws RecognitionException {
		ArraydeclarationContext _localctx = new ArraydeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_arraydeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			datatypedeclaration();
			setState(92);
			match(T__1);
			setState(93);
			match(PIZQ);
			setState(94);
			_la = _input.LA(1);
			if ( !(_la==T__2 || _la==INTEGER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(95);
			match(PDER);
			setState(96);
			match(ID);
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

	public static class FunctioncreationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(interpreterParser.ID, 0); }
		public TerminalNode PIZQ() { return getToken(interpreterParser.PIZQ, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public TerminalNode PDER() { return getToken(interpreterParser.PDER, 0); }
		public ReturndtContext returndt() {
			return getRuleContext(ReturndtContext.class,0);
		}
		public BodyblockContext bodyblock() {
			return getRuleContext(BodyblockContext.class,0);
		}
		public FunctioncreationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functioncreation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).enterFunctioncreation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).exitFunctioncreation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof interpreterVisitor ) return ((interpreterVisitor<? extends T>)visitor).visitFunctioncreation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctioncreationContext functioncreation() throws RecognitionException {
		FunctioncreationContext _localctx = new FunctioncreationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_functioncreation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(T__0);
			setState(99);
			match(ID);
			setState(100);
			match(PIZQ);
			setState(101);
			params();
			setState(102);
			match(PDER);
			setState(103);
			match(T__3);
			setState(104);
			returndt();
			setState(105);
			bodyblock();
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

	public static class MaincreationContext extends ParserRuleContext {
		public TerminalNode PIZQ() { return getToken(interpreterParser.PIZQ, 0); }
		public TerminalNode PDER() { return getToken(interpreterParser.PDER, 0); }
		public ReturndtContext returndt() {
			return getRuleContext(ReturndtContext.class,0);
		}
		public BodyblockContext bodyblock() {
			return getRuleContext(BodyblockContext.class,0);
		}
		public TerminalNode ID() { return getToken(interpreterParser.ID, 0); }
		public MaincreationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_maincreation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).enterMaincreation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).exitMaincreation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof interpreterVisitor ) return ((interpreterVisitor<? extends T>)visitor).visitMaincreation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MaincreationContext maincreation() throws RecognitionException {
		MaincreationContext _localctx = new MaincreationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_maincreation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(T__4);
			setState(108);
			match(PIZQ);
			setState(109);
			match(PDER);
			setState(110);
			match(T__3);
			setState(111);
			returndt();
			setState(113);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(112);
				match(ID);
				}
				break;
			}
			setState(115);
			bodyblock();
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

	public static class ParamsContext extends ParserRuleContext {
		public List<DatatypedeclarationContext> datatypedeclaration() {
			return getRuleContexts(DatatypedeclarationContext.class);
		}
		public DatatypedeclarationContext datatypedeclaration(int i) {
			return getRuleContext(DatatypedeclarationContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(interpreterParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(interpreterParser.ID, i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).exitParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof interpreterVisitor ) return ((interpreterVisitor<? extends T>)visitor).visitParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			datatypedeclaration();
			setState(118);
			match(ID);
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(119);
				match(T__5);
				setState(120);
				datatypedeclaration();
				setState(121);
				match(ID);
				}
				}
				setState(127);
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

	public static class ReturndtContext extends ParserRuleContext {
		public DatatypedeclarationContext datatypedeclaration() {
			return getRuleContext(DatatypedeclarationContext.class,0);
		}
		public TerminalNode ID() { return getToken(interpreterParser.ID, 0); }
		public ReturndtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returndt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).enterReturndt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).exitReturndt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof interpreterVisitor ) return ((interpreterVisitor<? extends T>)visitor).visitReturndt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturndtContext returndt() throws RecognitionException {
		ReturndtContext _localctx = new ReturndtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_returndt);
		try {
			setState(133);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				datatypedeclaration();
				setState(130);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(129);
					match(ID);
					}
					break;
				}
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
				match(T__6);
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

	public static class VardeclarationContext extends ParserRuleContext {
		public DatatypedeclarationContext datatypedeclaration() {
			return getRuleContext(DatatypedeclarationContext.class,0);
		}
		public TerminalNode ID() { return getToken(interpreterParser.ID, 0); }
		public VardeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vardeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).enterVardeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).exitVardeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof interpreterVisitor ) return ((interpreterVisitor<? extends T>)visitor).visitVardeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VardeclarationContext vardeclaration() throws RecognitionException {
		VardeclarationContext _localctx = new VardeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_vardeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			datatypedeclaration();
			setState(136);
			match(ID);
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

	public static class DatatypedeclarationContext extends ParserRuleContext {
		public DatatypedeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datatypedeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).enterDatatypedeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).exitDatatypedeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof interpreterVisitor ) return ((interpreterVisitor<? extends T>)visitor).visitDatatypedeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatatypedeclarationContext datatypedeclaration() throws RecognitionException {
		DatatypedeclarationContext _localctx = new DatatypedeclarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_datatypedeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			_la = _input.LA(1);
			if ( !(_la==T__7 || _la==T__8) ) {
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

	public static class ForstatementContext extends ParserRuleContext {
		public List<AsignationstatementContext> asignationstatement() {
			return getRuleContexts(AsignationstatementContext.class);
		}
		public AsignationstatementContext asignationstatement(int i) {
			return getRuleContext(AsignationstatementContext.class,i);
		}
		public List<TerminalNode> SMCOLON() { return getTokens(interpreterParser.SMCOLON); }
		public TerminalNode SMCOLON(int i) {
			return getToken(interpreterParser.SMCOLON, i);
		}
		public LogicexprContext logicexpr() {
			return getRuleContext(LogicexprContext.class,0);
		}
		public BodyblockContext bodyblock() {
			return getRuleContext(BodyblockContext.class,0);
		}
		public ForstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).enterForstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).exitForstatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof interpreterVisitor ) return ((interpreterVisitor<? extends T>)visitor).visitForstatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForstatementContext forstatement() throws RecognitionException {
		ForstatementContext _localctx = new ForstatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_forstatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(T__9);
			setState(141);
			asignationstatement();
			setState(142);
			match(SMCOLON);
			setState(143);
			logicexpr();
			setState(144);
			match(SMCOLON);
			setState(145);
			asignationstatement();
			setState(146);
			bodyblock();
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

	public static class WhilestatementContext extends ParserRuleContext {
		public LogicexprContext logicexpr() {
			return getRuleContext(LogicexprContext.class,0);
		}
		public BodyblockContext bodyblock() {
			return getRuleContext(BodyblockContext.class,0);
		}
		public WhilestatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whilestatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).enterWhilestatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).exitWhilestatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof interpreterVisitor ) return ((interpreterVisitor<? extends T>)visitor).visitWhilestatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhilestatementContext whilestatement() throws RecognitionException {
		WhilestatementContext _localctx = new WhilestatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_whilestatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(T__10);
			setState(149);
			logicexpr();
			setState(150);
			bodyblock();
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

	public static class PrintstatementContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(interpreterParser.ID, 0); }
		public TerminalNode STRING() { return getToken(interpreterParser.STRING, 0); }
		public TerminalNode INTEGER() { return getToken(interpreterParser.INTEGER, 0); }
		public TerminalNode FLOAT() { return getToken(interpreterParser.FLOAT, 0); }
		public MathexprContext mathexpr() {
			return getRuleContext(MathexprContext.class,0);
		}
		public PrintstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).enterPrintstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).exitPrintstatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof interpreterVisitor ) return ((interpreterVisitor<? extends T>)visitor).visitPrintstatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintstatementContext printstatement() throws RecognitionException {
		PrintstatementContext _localctx = new PrintstatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_printstatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(T__11);
			setState(158);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(153);
				match(ID);
				}
				break;
			case 2:
				{
				setState(154);
				match(STRING);
				}
				break;
			case 3:
				{
				setState(155);
				match(INTEGER);
				}
				break;
			case 4:
				{
				setState(156);
				match(FLOAT);
				}
				break;
			case 5:
				{
				setState(157);
				mathexpr(0);
				}
				break;
			}
			setState(160);
			match(T__12);
			setState(161);
			match(T__13);
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

	public static class AsignationstatementContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(interpreterParser.ID, 0); }
		public MathexprContext mathexpr() {
			return getRuleContext(MathexprContext.class,0);
		}
		public AsignationstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignationstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).enterAsignationstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).exitAsignationstatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof interpreterVisitor ) return ((interpreterVisitor<? extends T>)visitor).visitAsignationstatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignationstatementContext asignationstatement() throws RecognitionException {
		AsignationstatementContext _localctx = new AsignationstatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_asignationstatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(ID);
			setState(164);
			match(T__14);
			setState(165);
			mathexpr(0);
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

	public static class ConditionalContext extends ParserRuleContext {
		public List<LogicexprContext> logicexpr() {
			return getRuleContexts(LogicexprContext.class);
		}
		public LogicexprContext logicexpr(int i) {
			return getRuleContext(LogicexprContext.class,i);
		}
		public List<BodyblockContext> bodyblock() {
			return getRuleContexts(BodyblockContext.class);
		}
		public BodyblockContext bodyblock(int i) {
			return getRuleContext(BodyblockContext.class,i);
		}
		public ConditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).enterConditional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).exitConditional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof interpreterVisitor ) return ((interpreterVisitor<? extends T>)visitor).visitConditional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalContext conditional() throws RecognitionException {
		ConditionalContext _localctx = new ConditionalContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_conditional);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(T__15);
			setState(168);
			logicexpr();
			setState(169);
			bodyblock();
			setState(176);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(170);
					match(T__16);
					setState(171);
					logicexpr();
					setState(172);
					bodyblock();
					}
					} 
				}
				setState(178);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			setState(183);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(179);
					match(T__17);
					setState(180);
					bodyblock();
					}
					} 
				}
				setState(185);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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

	public static class InputstatementContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(interpreterParser.ID, 0); }
		public InputstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).enterInputstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).exitInputstatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof interpreterVisitor ) return ((interpreterVisitor<? extends T>)visitor).visitInputstatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputstatementContext inputstatement() throws RecognitionException {
		InputstatementContext _localctx = new InputstatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_inputstatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(ID);
			setState(187);
			match(T__14);
			setState(188);
			match(T__18);
			setState(189);
			match(T__19);
			setState(190);
			match(T__20);
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

	public static class LogicexprContext extends ParserRuleContext {
		public List<MathexprContext> mathexpr() {
			return getRuleContexts(MathexprContext.class);
		}
		public MathexprContext mathexpr(int i) {
			return getRuleContext(MathexprContext.class,i);
		}
		public TerminalNode ROP() { return getToken(interpreterParser.ROP, 0); }
		public List<TerminalNode> LOGICNOT() { return getTokens(interpreterParser.LOGICNOT); }
		public TerminalNode LOGICNOT(int i) {
			return getToken(interpreterParser.LOGICNOT, i);
		}
		public List<TerminalNode> LOGIC() { return getTokens(interpreterParser.LOGIC); }
		public TerminalNode LOGIC(int i) {
			return getToken(interpreterParser.LOGIC, i);
		}
		public List<LogicexprContext> logicexpr() {
			return getRuleContexts(LogicexprContext.class);
		}
		public LogicexprContext logicexpr(int i) {
			return getRuleContext(LogicexprContext.class,i);
		}
		public LogicexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).enterLogicexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).exitLogicexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof interpreterVisitor ) return ((interpreterVisitor<? extends T>)visitor).visitLogicexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicexprContext logicexpr() throws RecognitionException {
		LogicexprContext _localctx = new LogicexprContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_logicexpr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LOGICNOT) {
				{
				setState(192);
				match(LOGICNOT);
				}
			}

			setState(195);
			mathexpr(0);
			setState(196);
			match(ROP);
			setState(197);
			mathexpr(0);
			setState(205);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(198);
					match(LOGIC);
					setState(200);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						setState(199);
						match(LOGICNOT);
						}
						break;
					}
					setState(202);
					logicexpr();
					}
					} 
				}
				setState(207);
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
			exitRule();
		}
		return _localctx;
	}

	public static class MathexprContext extends ParserRuleContext {
		public TerminalNode FLOAT() { return getToken(interpreterParser.FLOAT, 0); }
		public TerminalNode PIZQ() { return getToken(interpreterParser.PIZQ, 0); }
		public List<MathexprContext> mathexpr() {
			return getRuleContexts(MathexprContext.class);
		}
		public MathexprContext mathexpr(int i) {
			return getRuleContext(MathexprContext.class,i);
		}
		public TerminalNode PDER() { return getToken(interpreterParser.PDER, 0); }
		public TerminalNode ID() { return getToken(interpreterParser.ID, 0); }
		public TerminalNode INTEGER() { return getToken(interpreterParser.INTEGER, 0); }
		public TerminalNode MULOP() { return getToken(interpreterParser.MULOP, 0); }
		public TerminalNode SUMOP() { return getToken(interpreterParser.SUMOP, 0); }
		public MathexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).enterMathexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof interpreterListener ) ((interpreterListener)listener).exitMathexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof interpreterVisitor ) return ((interpreterVisitor<? extends T>)visitor).visitMathexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MathexprContext mathexpr() throws RecognitionException {
		return mathexpr(0);
	}

	private MathexprContext mathexpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MathexprContext _localctx = new MathexprContext(_ctx, _parentState);
		MathexprContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_mathexpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FLOAT:
				{
				setState(209);
				match(FLOAT);
				}
				break;
			case PIZQ:
				{
				setState(210);
				match(PIZQ);
				setState(211);
				mathexpr(0);
				setState(212);
				match(PDER);
				}
				break;
			case ID:
				{
				setState(214);
				match(ID);
				}
				break;
			case INTEGER:
				{
				setState(215);
				match(INTEGER);
				}
				break;
			case T__21:
				{
				setState(216);
				match(T__21);
				setState(217);
				match(PIZQ);
				setState(218);
				mathexpr(0);
				setState(219);
				match(PDER);
				}
				break;
			case T__22:
				{
				setState(221);
				match(T__22);
				setState(222);
				match(PIZQ);
				setState(223);
				mathexpr(0);
				setState(224);
				match(T__5);
				setState(225);
				mathexpr(0);
				setState(226);
				match(PDER);
				}
				break;
			case T__23:
				{
				setState(228);
				match(T__23);
				setState(229);
				match(PIZQ);
				setState(230);
				mathexpr(0);
				setState(231);
				match(PDER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(243);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(241);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						_localctx = new MathexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_mathexpr);
						setState(235);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(236);
						match(MULOP);
						setState(237);
						mathexpr(10);
						}
						break;
					case 2:
						{
						_localctx = new MathexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_mathexpr);
						setState(238);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(239);
						match(SUMOP);
						setState(240);
						mathexpr(9);
						}
						break;
					}
					} 
				}
				setState(245);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 17:
			return mathexpr_sempred((MathexprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean mathexpr_sempred(MathexprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 9);
		case 1:
			return precpred(_ctx, 8);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001&\u00f7\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0001\u0000\u0001\u0000"+
		"\u0003\u0000\'\b\u0000\u0001\u0001\u0004\u0001*\b\u0001\u000b\u0001\f"+
		"\u0001+\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u00012\b"+
		"\u0001\u0001\u0002\u0004\u00025\b\u0002\u000b\u0002\f\u00026\u0001\u0002"+
		"\u0004\u0002:\b\u0002\u000b\u0002\f\u0002;\u0001\u0002\u0004\u0002?\b"+
		"\u0002\u000b\u0002\f\u0002@\u0001\u0002\u0004\u0002D\b\u0002\u000b\u0002"+
		"\f\u0002E\u0001\u0002\u0004\u0002I\b\u0002\u000b\u0002\f\u0002J\u0001"+
		"\u0002\u0004\u0002N\b\u0002\u000b\u0002\f\u0002O\u0001\u0002\u0004\u0002"+
		"S\b\u0002\u000b\u0002\f\u0002T\u0001\u0002\u0004\u0002X\b\u0002\u000b"+
		"\u0002\f\u0002Y\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003"+
		"\u0005r\b\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006|\b\u0006\n\u0006"+
		"\f\u0006\u007f\t\u0006\u0001\u0007\u0001\u0007\u0003\u0007\u0083\b\u0007"+
		"\u0001\u0007\u0003\u0007\u0086\b\u0007\u0001\b\u0001\b\u0001\b\u0001\t"+
		"\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0003\f\u009f\b\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u00af\b\u000e\n\u000e"+
		"\f\u000e\u00b2\t\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u00b6\b\u000e"+
		"\n\u000e\f\u000e\u00b9\t\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0003\u0010\u00c2\b\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00c9"+
		"\b\u0010\u0001\u0010\u0005\u0010\u00cc\b\u0010\n\u0010\f\u0010\u00cf\t"+
		"\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0003\u0011\u00ea\b\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u00f2\b\u0011\n"+
		"\u0011\f\u0011\u00f5\t\u0011\u0001\u0011\u0000\u0001\"\u0012\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"\u0000\u0002\u0002\u0000\u0003\u0003##\u0001\u0000\b\t\u010b\u0000"+
		"&\u0001\u0000\u0000\u0000\u00021\u0001\u0000\u0000\u0000\u0004W\u0001"+
		"\u0000\u0000\u0000\u0006[\u0001\u0000\u0000\u0000\bb\u0001\u0000\u0000"+
		"\u0000\nk\u0001\u0000\u0000\u0000\fu\u0001\u0000\u0000\u0000\u000e\u0085"+
		"\u0001\u0000\u0000\u0000\u0010\u0087\u0001\u0000\u0000\u0000\u0012\u008a"+
		"\u0001\u0000\u0000\u0000\u0014\u008c\u0001\u0000\u0000\u0000\u0016\u0094"+
		"\u0001\u0000\u0000\u0000\u0018\u0098\u0001\u0000\u0000\u0000\u001a\u00a3"+
		"\u0001\u0000\u0000\u0000\u001c\u00a7\u0001\u0000\u0000\u0000\u001e\u00ba"+
		"\u0001\u0000\u0000\u0000 \u00c1\u0001\u0000\u0000\u0000\"\u00e9\u0001"+
		"\u0000\u0000\u0000$\'\u0003\u0002\u0001\u0000%\'\u0005\u0000\u0000\u0001"+
		"&$\u0001\u0000\u0000\u0000&%\u0001\u0000\u0000\u0000\'\u0001\u0001\u0000"+
		"\u0000\u0000(*\u0003\b\u0004\u0000)(\u0001\u0000\u0000\u0000*+\u0001\u0000"+
		"\u0000\u0000+)\u0001\u0000\u0000\u0000+,\u0001\u0000\u0000\u0000,-\u0001"+
		"\u0000\u0000\u0000-.\u0005\u0001\u0000\u0000./\u0003\n\u0005\u0000/2\u0001"+
		"\u0000\u0000\u000002\u0003\u0004\u0002\u00001)\u0001\u0000\u0000\u0000"+
		"10\u0001\u0000\u0000\u00002\u0003\u0001\u0000\u0000\u000035\u0003\u0010"+
		"\b\u000043\u0001\u0000\u0000\u000056\u0001\u0000\u0000\u000064\u0001\u0000"+
		"\u0000\u000067\u0001\u0000\u0000\u00007X\u0001\u0000\u0000\u00008:\u0003"+
		"\u001e\u000f\u000098\u0001\u0000\u0000\u0000:;\u0001\u0000\u0000\u0000"+
		";9\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000<X\u0001\u0000\u0000"+
		"\u0000=?\u0003\u0006\u0003\u0000>=\u0001\u0000\u0000\u0000?@\u0001\u0000"+
		"\u0000\u0000@>\u0001\u0000\u0000\u0000@A\u0001\u0000\u0000\u0000AX\u0001"+
		"\u0000\u0000\u0000BD\u0003\u0018\f\u0000CB\u0001\u0000\u0000\u0000DE\u0001"+
		"\u0000\u0000\u0000EC\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000"+
		"FX\u0001\u0000\u0000\u0000GI\u0003\u001a\r\u0000HG\u0001\u0000\u0000\u0000"+
		"IJ\u0001\u0000\u0000\u0000JH\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000"+
		"\u0000KX\u0001\u0000\u0000\u0000LN\u0003\u001c\u000e\u0000ML\u0001\u0000"+
		"\u0000\u0000NO\u0001\u0000\u0000\u0000OM\u0001\u0000\u0000\u0000OP\u0001"+
		"\u0000\u0000\u0000PX\u0001\u0000\u0000\u0000QS\u0003\u0014\n\u0000RQ\u0001"+
		"\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000TR\u0001\u0000\u0000\u0000"+
		"TU\u0001\u0000\u0000\u0000UX\u0001\u0000\u0000\u0000VX\u0003\u0016\u000b"+
		"\u0000W4\u0001\u0000\u0000\u0000W9\u0001\u0000\u0000\u0000W>\u0001\u0000"+
		"\u0000\u0000WC\u0001\u0000\u0000\u0000WH\u0001\u0000\u0000\u0000WM\u0001"+
		"\u0000\u0000\u0000WR\u0001\u0000\u0000\u0000WV\u0001\u0000\u0000\u0000"+
		"XY\u0001\u0000\u0000\u0000YW\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000"+
		"\u0000Z\u0005\u0001\u0000\u0000\u0000[\\\u0003\u0012\t\u0000\\]\u0005"+
		"\u0002\u0000\u0000]^\u0005\u001a\u0000\u0000^_\u0007\u0000\u0000\u0000"+
		"_`\u0005\u001b\u0000\u0000`a\u0005\u0019\u0000\u0000a\u0007\u0001\u0000"+
		"\u0000\u0000bc\u0005\u0001\u0000\u0000cd\u0005\u0019\u0000\u0000de\u0005"+
		"\u001a\u0000\u0000ef\u0003\f\u0006\u0000fg\u0005\u001b\u0000\u0000gh\u0005"+
		"\u0004\u0000\u0000hi\u0003\u000e\u0007\u0000ij\u0003\u0004\u0002\u0000"+
		"j\t\u0001\u0000\u0000\u0000kl\u0005\u0005\u0000\u0000lm\u0005\u001a\u0000"+
		"\u0000mn\u0005\u001b\u0000\u0000no\u0005\u0004\u0000\u0000oq\u0003\u000e"+
		"\u0007\u0000pr\u0005\u0019\u0000\u0000qp\u0001\u0000\u0000\u0000qr\u0001"+
		"\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000st\u0003\u0004\u0002\u0000"+
		"t\u000b\u0001\u0000\u0000\u0000uv\u0003\u0012\t\u0000v}\u0005\u0019\u0000"+
		"\u0000wx\u0005\u0006\u0000\u0000xy\u0003\u0012\t\u0000yz\u0005\u0019\u0000"+
		"\u0000z|\u0001\u0000\u0000\u0000{w\u0001\u0000\u0000\u0000|\u007f\u0001"+
		"\u0000\u0000\u0000}{\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000"+
		"~\r\u0001\u0000\u0000\u0000\u007f}\u0001\u0000\u0000\u0000\u0080\u0082"+
		"\u0003\u0012\t\u0000\u0081\u0083\u0005\u0019\u0000\u0000\u0082\u0081\u0001"+
		"\u0000\u0000\u0000\u0082\u0083\u0001\u0000\u0000\u0000\u0083\u0086\u0001"+
		"\u0000\u0000\u0000\u0084\u0086\u0005\u0007\u0000\u0000\u0085\u0080\u0001"+
		"\u0000\u0000\u0000\u0085\u0084\u0001\u0000\u0000\u0000\u0086\u000f\u0001"+
		"\u0000\u0000\u0000\u0087\u0088\u0003\u0012\t\u0000\u0088\u0089\u0005\u0019"+
		"\u0000\u0000\u0089\u0011\u0001\u0000\u0000\u0000\u008a\u008b\u0007\u0001"+
		"\u0000\u0000\u008b\u0013\u0001\u0000\u0000\u0000\u008c\u008d\u0005\n\u0000"+
		"\u0000\u008d\u008e\u0003\u001a\r\u0000\u008e\u008f\u0005\u001d\u0000\u0000"+
		"\u008f\u0090\u0003 \u0010\u0000\u0090\u0091\u0005\u001d\u0000\u0000\u0091"+
		"\u0092\u0003\u001a\r\u0000\u0092\u0093\u0003\u0004\u0002\u0000\u0093\u0015"+
		"\u0001\u0000\u0000\u0000\u0094\u0095\u0005\u000b\u0000\u0000\u0095\u0096"+
		"\u0003 \u0010\u0000\u0096\u0097\u0003\u0004\u0002\u0000\u0097\u0017\u0001"+
		"\u0000\u0000\u0000\u0098\u009e\u0005\f\u0000\u0000\u0099\u009f\u0005\u0019"+
		"\u0000\u0000\u009a\u009f\u0005%\u0000\u0000\u009b\u009f\u0005#\u0000\u0000"+
		"\u009c\u009f\u0005$\u0000\u0000\u009d\u009f\u0003\"\u0011\u0000\u009e"+
		"\u0099\u0001\u0000\u0000\u0000\u009e\u009a\u0001\u0000\u0000\u0000\u009e"+
		"\u009b\u0001\u0000\u0000\u0000\u009e\u009c\u0001\u0000\u0000\u0000\u009e"+
		"\u009d\u0001\u0000\u0000\u0000\u009f\u00a0\u0001\u0000\u0000\u0000\u00a0"+
		"\u00a1\u0005\r\u0000\u0000\u00a1\u00a2\u0005\u000e\u0000\u0000\u00a2\u0019"+
		"\u0001\u0000\u0000\u0000\u00a3\u00a4\u0005\u0019\u0000\u0000\u00a4\u00a5"+
		"\u0005\u000f\u0000\u0000\u00a5\u00a6\u0003\"\u0011\u0000\u00a6\u001b\u0001"+
		"\u0000\u0000\u0000\u00a7\u00a8\u0005\u0010\u0000\u0000\u00a8\u00a9\u0003"+
		" \u0010\u0000\u00a9\u00b0\u0003\u0004\u0002\u0000\u00aa\u00ab\u0005\u0011"+
		"\u0000\u0000\u00ab\u00ac\u0003 \u0010\u0000\u00ac\u00ad\u0003\u0004\u0002"+
		"\u0000\u00ad\u00af\u0001\u0000\u0000\u0000\u00ae\u00aa\u0001\u0000\u0000"+
		"\u0000\u00af\u00b2\u0001\u0000\u0000\u0000\u00b0\u00ae\u0001\u0000\u0000"+
		"\u0000\u00b0\u00b1\u0001\u0000\u0000\u0000\u00b1\u00b7\u0001\u0000\u0000"+
		"\u0000\u00b2\u00b0\u0001\u0000\u0000\u0000\u00b3\u00b4\u0005\u0012\u0000"+
		"\u0000\u00b4\u00b6\u0003\u0004\u0002\u0000\u00b5\u00b3\u0001\u0000\u0000"+
		"\u0000\u00b6\u00b9\u0001\u0000\u0000\u0000\u00b7\u00b5\u0001\u0000\u0000"+
		"\u0000\u00b7\u00b8\u0001\u0000\u0000\u0000\u00b8\u001d\u0001\u0000\u0000"+
		"\u0000\u00b9\u00b7\u0001\u0000\u0000\u0000\u00ba\u00bb\u0005\u0019\u0000"+
		"\u0000\u00bb\u00bc\u0005\u000f\u0000\u0000\u00bc\u00bd\u0005\u0013\u0000"+
		"\u0000\u00bd\u00be\u0005\u0014\u0000\u0000\u00be\u00bf\u0005\u0015\u0000"+
		"\u0000\u00bf\u001f\u0001\u0000\u0000\u0000\u00c0\u00c2\u0005!\u0000\u0000"+
		"\u00c1\u00c0\u0001\u0000\u0000\u0000\u00c1\u00c2\u0001\u0000\u0000\u0000"+
		"\u00c2\u00c3\u0001\u0000\u0000\u0000\u00c3\u00c4\u0003\"\u0011\u0000\u00c4"+
		"\u00c5\u0005\u001c\u0000\u0000\u00c5\u00cd\u0003\"\u0011\u0000\u00c6\u00c8"+
		"\u0005 \u0000\u0000\u00c7\u00c9\u0005!\u0000\u0000\u00c8\u00c7\u0001\u0000"+
		"\u0000\u0000\u00c8\u00c9\u0001\u0000\u0000\u0000\u00c9\u00ca\u0001\u0000"+
		"\u0000\u0000\u00ca\u00cc\u0003 \u0010\u0000\u00cb\u00c6\u0001\u0000\u0000"+
		"\u0000\u00cc\u00cf\u0001\u0000\u0000\u0000\u00cd\u00cb\u0001\u0000\u0000"+
		"\u0000\u00cd\u00ce\u0001\u0000\u0000\u0000\u00ce!\u0001\u0000\u0000\u0000"+
		"\u00cf\u00cd\u0001\u0000\u0000\u0000\u00d0\u00d1\u0006\u0011\uffff\uffff"+
		"\u0000\u00d1\u00ea\u0005$\u0000\u0000\u00d2\u00d3\u0005\u001a\u0000\u0000"+
		"\u00d3\u00d4\u0003\"\u0011\u0000\u00d4\u00d5\u0005\u001b\u0000\u0000\u00d5"+
		"\u00ea\u0001\u0000\u0000\u0000\u00d6\u00ea\u0005\u0019\u0000\u0000\u00d7"+
		"\u00ea\u0005#\u0000\u0000\u00d8\u00d9\u0005\u0016\u0000\u0000\u00d9\u00da"+
		"\u0005\u001a\u0000\u0000\u00da\u00db\u0003\"\u0011\u0000\u00db\u00dc\u0005"+
		"\u001b\u0000\u0000\u00dc\u00ea\u0001\u0000\u0000\u0000\u00dd\u00de\u0005"+
		"\u0017\u0000\u0000\u00de\u00df\u0005\u001a\u0000\u0000\u00df\u00e0\u0003"+
		"\"\u0011\u0000\u00e0\u00e1\u0005\u0006\u0000\u0000\u00e1\u00e2\u0003\""+
		"\u0011\u0000\u00e2\u00e3\u0005\u001b\u0000\u0000\u00e3\u00ea\u0001\u0000"+
		"\u0000\u0000\u00e4\u00e5\u0005\u0018\u0000\u0000\u00e5\u00e6\u0005\u001a"+
		"\u0000\u0000\u00e6\u00e7\u0003\"\u0011\u0000\u00e7\u00e8\u0005\u001b\u0000"+
		"\u0000\u00e8\u00ea\u0001\u0000\u0000\u0000\u00e9\u00d0\u0001\u0000\u0000"+
		"\u0000\u00e9\u00d2\u0001\u0000\u0000\u0000\u00e9\u00d6\u0001\u0000\u0000"+
		"\u0000\u00e9\u00d7\u0001\u0000\u0000\u0000\u00e9\u00d8\u0001\u0000\u0000"+
		"\u0000\u00e9\u00dd\u0001\u0000\u0000\u0000\u00e9\u00e4\u0001\u0000\u0000"+
		"\u0000\u00ea\u00f3\u0001\u0000\u0000\u0000\u00eb\u00ec\n\t\u0000\u0000"+
		"\u00ec\u00ed\u0005\u001e\u0000\u0000\u00ed\u00f2\u0003\"\u0011\n\u00ee"+
		"\u00ef\n\b\u0000\u0000\u00ef\u00f0\u0005\u001f\u0000\u0000\u00f0\u00f2"+
		"\u0003\"\u0011\t\u00f1\u00eb\u0001\u0000\u0000\u0000\u00f1\u00ee\u0001"+
		"\u0000\u0000\u0000\u00f2\u00f5\u0001\u0000\u0000\u0000\u00f3\u00f1\u0001"+
		"\u0000\u0000\u0000\u00f3\u00f4\u0001\u0000\u0000\u0000\u00f4#\u0001\u0000"+
		"\u0000\u0000\u00f5\u00f3\u0001\u0000\u0000\u0000\u0019&+16;@EJOTWYq}\u0082"+
		"\u0085\u009e\u00b0\u00b7\u00c1\u00c8\u00cd\u00e9\u00f1\u00f3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}