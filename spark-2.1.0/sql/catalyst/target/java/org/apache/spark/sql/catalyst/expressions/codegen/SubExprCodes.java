package org.apache.spark.sql.catalyst.expressions.codegen;
/**
 * Codes and common subexpressions mapping used for subexpression elimination.
 * <p>
 * param:  codes Strings representing the codes that evaluate common subexpressions.
 * param:  states Foreach expression that is participating in subexpression elimination,
 *               the state to use.
 */
public  class SubExprCodes implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> codes ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<org.apache.spark.sql.catalyst.expressions.Expression, org.apache.spark.sql.catalyst.expressions.codegen.SubExprEliminationState> states ()  { throw new RuntimeException(); }
  // not preceding
  public   SubExprCodes (scala.collection.Seq<java.lang.String> codes, scala.collection.immutable.Map<org.apache.spark.sql.catalyst.expressions.Expression, org.apache.spark.sql.catalyst.expressions.codegen.SubExprEliminationState> states)  { throw new RuntimeException(); }
}
