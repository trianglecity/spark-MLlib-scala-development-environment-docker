package org.apache.spark.sql.sources;
/**
 * A filter that evaluates to <code>true</code> iff the attribute evaluates to
 * a string that contains the string <code>value</code>.
 * <p>
 * @since 1.3.1
 */
public  class StringContains extends org.apache.spark.sql.sources.Filter implements scala.Product, scala.Serializable {
  static protected  java.lang.String[] findReferences (Object value)  { throw new RuntimeException(); }
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  java.lang.String attribute ()  { throw new RuntimeException(); }
  public  java.lang.String value ()  { throw new RuntimeException(); }
  // not preceding
  public   StringContains (java.lang.String attribute, java.lang.String value)  { throw new RuntimeException(); }
  public  java.lang.String[] references ()  { throw new RuntimeException(); }
}
