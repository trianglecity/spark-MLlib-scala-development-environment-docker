package org.apache.spark.sql.catalyst.expressions.codegen;
/**
 * Java source for evaluating an {@link Expression} given a {@link InternalRow} of input.
 * <p>
 * param:  code The sequence of statements required to evaluate the expression.
 *             It should be empty string, if <code>isNull</code> and <code>value</code> are already existed, or no code
 *             needed to evaluate them (literals).
 * param:  isNull A term that holds a boolean value representing whether the expression evaluated
 *                 to null.
 * param:  value A term for a (possibly primitive) value of the result of the evaluation. Not
 *              valid if <code>isNull</code> is set to <code>true</code>.
 */
public  class ExprCode implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  java.lang.String code ()  { throw new RuntimeException(); }
  public  java.lang.String isNull ()  { throw new RuntimeException(); }
  public  java.lang.String value ()  { throw new RuntimeException(); }
  // not preceding
  public   ExprCode (java.lang.String code, java.lang.String isNull, java.lang.String value)  { throw new RuntimeException(); }
}
