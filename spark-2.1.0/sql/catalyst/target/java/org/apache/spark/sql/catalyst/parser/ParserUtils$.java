package org.apache.spark.sql.catalyst.parser;
/**
 * A collection of utility methods for use during the parsing process.
 */
public  class ParserUtils$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final ParserUtils$ MODULE$ = null;
  public   ParserUtils$ ()  { throw new RuntimeException(); }
  /** Get the command which created the token. */
  public  java.lang.String command (org.antlr.v4.runtime.ParserRuleContext ctx)  { throw new RuntimeException(); }
  public  scala.runtime.Nothing$ operationNotAllowed (java.lang.String message, org.antlr.v4.runtime.ParserRuleContext ctx)  { throw new RuntimeException(); }
  /** Check if duplicate keys exist in a set of key-value pairs. */
  public <T extends java.lang.Object> void checkDuplicateKeys (scala.collection.Seq<scala.Tuple2<java.lang.String, T>> keyPairs, org.antlr.v4.runtime.ParserRuleContext ctx)  { throw new RuntimeException(); }
  /** Get the code that creates the given node. */
  public  java.lang.String source (org.antlr.v4.runtime.ParserRuleContext ctx)  { throw new RuntimeException(); }
  /** Get all the text which comes after the given rule. */
  public  java.lang.String remainder (org.antlr.v4.runtime.ParserRuleContext ctx)  { throw new RuntimeException(); }
  /** Get all the text which comes after the given token. */
  public  java.lang.String remainder (org.antlr.v4.runtime.Token token)  { throw new RuntimeException(); }
  /** Convert a string token into a string. */
  public  java.lang.String string (org.antlr.v4.runtime.Token token)  { throw new RuntimeException(); }
  /** Convert a string node into a string. */
  public  java.lang.String string (org.antlr.v4.runtime.tree.TerminalNode node)  { throw new RuntimeException(); }
  /** Get the origin (line and position) of the token. */
  public  org.apache.spark.sql.catalyst.trees.Origin position (org.antlr.v4.runtime.Token token)  { throw new RuntimeException(); }
  /** Validate the condition. If it doesn't throw a parse exception. */
  public  void validate (scala.Function0<java.lang.Object> f, java.lang.String message, org.antlr.v4.runtime.ParserRuleContext ctx)  { throw new RuntimeException(); }
  /**
   * Register the origin of the context. Any TreeNode created in the closure will be assigned the
   * registered origin. This method restores the previously set origin after completion of the
   * closure.
   * @param ctx (undocumented)
   * @param f (undocumented)
   * @return (undocumented)
   */
  public <T extends java.lang.Object> T withOrigin (org.antlr.v4.runtime.ParserRuleContext ctx, scala.Function0<T> f)  { throw new RuntimeException(); }
  /** Unescape baskslash-escaped string enclosed by quotes. */
  public  java.lang.String unescapeSQLString (java.lang.String b)  { throw new RuntimeException(); }
}
