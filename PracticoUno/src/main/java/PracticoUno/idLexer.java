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
		MESPAR=1, HORAMENOR=2, HORAMAYOR=3, WS=4, OTRO=5;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"DIGITO", "MESPAR", "HORAMENOR", "HORAMAYOR", "WS", "OTRO"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\7S\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5"+
		"\4)\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\67\n\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5G\n\5\3\6\6\6"+
		"J\n\6\r\6\16\6K\3\6\3\6\3\7\3\7\3\7\3\7\2\2\b\3\2\5\3\7\4\t\5\13\6\r\7"+
		"\3\2\b\3\2\62;\7\2\62\62\64\64\66\6688::\3\2:;\3\2\62\64\3\2\65\67\5\2"+
		"\13\f\17\17\"\"\2W\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\3\17\3\2\2\2\5\21\3\2\2\2\7(\3\2\2\2\tF\3\2\2\2\13I\3\2\2\2"+
		"\rO\3\2\2\2\17\20\t\2\2\2\20\4\3\2\2\2\21\22\5\3\2\2\22\23\5\3\2\2\23"+
		"\24\7\61\2\2\24\25\5\3\2\2\25\26\t\3\2\2\26\27\7\61\2\2\27\30\5\3\2\2"+
		"\30\31\5\3\2\2\31\32\5\3\2\2\32\33\5\3\2\2\33\6\3\2\2\2\34\35\7\62\2\2"+
		"\35\36\t\4\2\2\36\37\7<\2\2\37 \5\3\2\2 !\5\3\2\2!)\3\2\2\2\"#\7\63\2"+
		"\2#$\t\5\2\2$%\7<\2\2%&\5\3\2\2&\'\5\3\2\2\')\3\2\2\2(\34\3\2\2\2(\"\3"+
		"\2\2\2)\b\3\2\2\2*+\7\63\2\2+,\7:\2\2,-\7<\2\2-.\3\2\2\2./\t\6\2\2/G\5"+
		"\3\2\2\60\61\7\63\2\2\61\62\7;\2\2\62\67\7<\2\2\63\64\7\64\2\2\64\65\7"+
		"\62\2\2\65\67\7<\2\2\66\60\3\2\2\2\66\63\3\2\2\2\678\3\2\2\289\5\3\2\2"+
		"9:\5\3\2\2:G\3\2\2\2;<\7\64\2\2<=\7\63\2\2=>\7<\2\2>?\3\2\2\2?@\t\5\2"+
		"\2@G\5\3\2\2AB\7\64\2\2BC\7\63\2\2CD\7<\2\2DE\7\65\2\2EG\7\62\2\2F*\3"+
		"\2\2\2F\66\3\2\2\2F;\3\2\2\2FA\3\2\2\2G\n\3\2\2\2HJ\t\7\2\2IH\3\2\2\2"+
		"JK\3\2\2\2KI\3\2\2\2KL\3\2\2\2LM\3\2\2\2MN\b\6\2\2N\f\3\2\2\2OP\13\2\2"+
		"\2PQ\3\2\2\2QR\b\7\2\2R\16\3\2\2\2\7\2(\66FK\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}