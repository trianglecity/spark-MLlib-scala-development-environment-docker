package org.apache.spark.sql.sources;
/**
 * A filter that evaluates to <code>true</code> iff at least one of <code>left</code> or <code>right</code> evaluates to <code>true</code>.
 * <p>
 * @since 1.3.0
 */
public  class Or extends org.apache.spark.sql.sources.Filter implements scala.Product, scala.Serializable {
  static protected  java.lang.String[] findReferences (Object value)  { throw new RuntimeException(); }
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.sources.Filter left ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.sources.Filter right ()  { throw new RuntimeException(); }
  // not preceding
  public   Or (org.apache.spark.sql.sources.Filter left, org.apache.spark.sql.sources.Filter right)  { throw new RuntimeException(); }
  public  java.lang.String[] references ()  { throw new RuntimeException(); }
}
