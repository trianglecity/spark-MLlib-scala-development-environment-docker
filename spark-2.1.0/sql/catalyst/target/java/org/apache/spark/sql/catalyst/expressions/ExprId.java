package org.apache.spark.sql.catalyst.expressions;
/**
 * A globally unique id for a given named expression.
 * Used to identify which attribute output by a relation is being
 * referenced in a subsequent computation.
 * <p>
 * The <code>id</code> field is unique within a given JVM, while the <code>uuid</code> is used to uniquely identify JVMs.
 */
public  class ExprId implements scala.Product, scala.Serializable {
  static public  org.apache.spark.sql.catalyst.expressions.ExprId apply (long id)  { throw new RuntimeException(); }
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  long id ()  { throw new RuntimeException(); }
  public  java.util.UUID jvmId ()  { throw new RuntimeException(); }
  // not preceding
  public   ExprId (long id, java.util.UUID jvmId)  { throw new RuntimeException(); }
}
