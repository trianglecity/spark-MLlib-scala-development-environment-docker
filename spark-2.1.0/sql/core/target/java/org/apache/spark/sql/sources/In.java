package org.apache.spark.sql.sources;
/**
 * A filter that evaluates to <code>true</code> iff the attribute evaluates to one of the values in the array.
 * <p>
 * @since 1.3.0
 */
public  class In extends org.apache.spark.sql.sources.Filter implements scala.Product, scala.Serializable {
  static protected  java.lang.String[] findReferences (Object value)  { throw new RuntimeException(); }
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  java.lang.String attribute ()  { throw new RuntimeException(); }
  public  java.lang.Object[] values ()  { throw new RuntimeException(); }
  // not preceding
  public   In (java.lang.String attribute, java.lang.Object[] values)  { throw new RuntimeException(); }
  public  int hashCode ()  { throw new RuntimeException(); }
  public  boolean equals (Object o)  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  java.lang.String[] references ()  { throw new RuntimeException(); }
}
