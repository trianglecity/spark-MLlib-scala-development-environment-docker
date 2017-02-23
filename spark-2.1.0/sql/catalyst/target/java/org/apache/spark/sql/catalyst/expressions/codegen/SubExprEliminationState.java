package org.apache.spark.sql.catalyst.expressions.codegen;
/**
 * State used for subexpression elimination.
 * <p>
 * param:  isNull A term that holds a boolean value representing whether the expression evaluated
 *               to null.
 * param:  value A term for a value of a common sub-expression. Not valid if <code>isNull</code>
 *              is set to <code>true</code>.
 */
public  class SubExprEliminationState implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  java.lang.String isNull ()  { throw new RuntimeException(); }
  public  java.lang.String value ()  { throw new RuntimeException(); }
  // not preceding
  public   SubExprEliminationState (java.lang.String isNull, java.lang.String value)  { throw new RuntimeException(); }
}
