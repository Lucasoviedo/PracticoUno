// Generated from c:\Users\adm\Documents\TC\Proyectos\PracticoUno\PracticoUno\src\main\java\PracticoUno\id.g4 by ANTLR 4.8

    package PracticoUno;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class idLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MESPAR=1, HORAMENOR=2, HORAMAYOR=3, OTRO=4;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"DIGITO", "MESPAR", "HORAMENOR", "HORAMAYOR", "OTRO"
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
			null, "MESPAR", "HORAMENOR", "HORAMAYOR", "OTRO"
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


	public idLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "id.g4"; }

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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\6J\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\'\n\4"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\65\n\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5E\n\5\3\6\3\6\3\6\3"+
		"\6\2\2\7\3\2\5\3\7\4\t\5\13\6\3\2\7\3\2\62;\7\2\62\62\64\64\66\6688::"+
		"\3\2:;\3\2\62\64\3\2\65\67\2M\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\3\r\3\2\2\2\5\17\3\2\2\2\7&\3\2\2\2\tD\3\2\2\2\13F\3\2\2\2\r"+
		"\16\t\2\2\2\16\4\3\2\2\2\17\20\5\3\2\2\20\21\5\3\2\2\21\22\7\61\2\2\22"+
		"\23\5\3\2\2\23\24\t\3\2\2\24\25\7\61\2\2\25\26\5\3\2\2\26\27\5\3\2\2\27"+
		"\30\5\3\2\2\30\31\5\3\2\2\31\6\3\2\2\2\32\33\7\62\2\2\33\34\t\4\2\2\34"+
		"\35\7<\2\2\35\36\5\3\2\2\36\37\5\3\2\2\37\'\3\2\2\2 !\7\63\2\2!\"\t\5"+
		"\2\2\"#\7<\2\2#$\5\3\2\2$%\5\3\2\2%\'\3\2\2\2&\32\3\2\2\2& \3\2\2\2\'"+
		"\b\3\2\2\2()\7\63\2\2)*\7:\2\2*+\7<\2\2+,\3\2\2\2,-\t\6\2\2-E\5\3\2\2"+
		"./\7\63\2\2/\60\7;\2\2\60\65\7<\2\2\61\62\7\64\2\2\62\63\7\62\2\2\63\65"+
		"\7<\2\2\64.\3\2\2\2\64\61\3\2\2\2\65\66\3\2\2\2\66\67\5\3\2\2\678\5\3"+
		"\2\28E\3\2\2\29:\7\64\2\2:;\7\63\2\2;<\7<\2\2<=\3\2\2\2=>\t\5\2\2>E\5"+
		"\3\2\2?@\7\64\2\2@A\7\63\2\2AB\7<\2\2BC\7\65\2\2CE\7\62\2\2D(\3\2\2\2"+
		"D\64\3\2\2\2D9\3\2\2\2D?\3\2\2\2E\n\3\2\2\2FG\13\2\2\2GH\3\2\2\2HI\b\6"+
		"\2\2I\f\3\2\2\2\6\2&\64D\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}