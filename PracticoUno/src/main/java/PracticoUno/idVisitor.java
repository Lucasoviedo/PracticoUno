// Generated from c:\Users\adm\Documents\TC\Proyectos\PracticoUno\PracticoUno\src\main\java\PracticoUno\id.g4 by ANTLR 4.8

    package PracticoUno;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link idParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface idVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link idParser#s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitS(idParser.SContext ctx);
}