// Generated from c:\Users\adm\Documents\TC\Proyectos\PracticoUno\PracticoUno\src\main\java\PracticoUno\id.g4 by ANTLR 4.8

    package PracticoUno;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class idParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MESPAR=1, HORAMENOR=2, HORAMAYOR=3, WS=4, OTRO=5;
	public static final int
		RULE_s = 0;
	private static String[] makeRuleNames() {
		return new String[] {
			"s"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "MESPAR", "HORAMENOR", "HORAMAYOR", "WS", "OTRO"
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
	public String getGrammarFileName() { return "id.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public idParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SContext extends ParserRuleContext {
		public Token MESPAR;
		public Token HORAMENOR;
		public Token HORAMAYOR;
		public TerminalNode MESPAR() { return getToken(idParser.MESPAR, 0); }
		public SContext s() {
			return getRuleContext(SContext.class,0);
		}
		public TerminalNode HORAMENOR() { return getToken(idParser.HORAMENOR, 0); }
		public TerminalNode HORAMAYOR() { return getToken(idParser.HORAMAYOR, 0); }
		public SContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).enterS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).exitS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof idVisitor ) return ((idVisitor<? extends T>)visitor).visitS(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SContext s() throws RecognitionException {
		SContext _localctx = new SContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_s);
		try {
			setState(12);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2);
				((SContext)_localctx).MESPAR = match(MESPAR);
				System.out.println("Linea " + ((SContext)_localctx).MESPAR.getLine() + " es mes par -> |" + ((SContext)_localctx).MESPAR.getText() + "|"); 
				setState(4);
				s();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(5);
				((SContext)_localctx).HORAMENOR = match(HORAMENOR);
				System.out.println( "Linea " + ((SContext)_localctx).HORAMENOR.getLine() + " es hora menor -> |" + ((SContext)_localctx).HORAMENOR.getText() +"|" ); 
				setState(7);
				s();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(8);
				((SContext)_localctx).HORAMAYOR = match(HORAMAYOR);
				System.out.println( "Linea " + ((SContext)_localctx).HORAMAYOR.getLine() + " es hora Mayor -> |" + ((SContext)_localctx).HORAMAYOR.getText() +"|" ); 
				setState(10);
				s();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\7\21\4\2\t\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\17\n\2\3\2\2\2\3\2\2\2\2\22\2"+
		"\16\3\2\2\2\4\5\7\3\2\2\5\6\b\2\1\2\6\17\5\2\2\2\7\b\7\4\2\2\b\t\b\2\1"+
		"\2\t\17\5\2\2\2\n\13\7\5\2\2\13\f\b\2\1\2\f\17\5\2\2\2\r\17\3\2\2\2\16"+
		"\4\3\2\2\2\16\7\3\2\2\2\16\n\3\2\2\2\16\r\3\2\2\2\17\3\3\2\2\2\3\16";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}