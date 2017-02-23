package org.apache.spark.sql.catalyst.expressions;
/**
 * A Window specification reference that refers to the {@link WindowSpecDefinition} defined
 * under the name <code>name</code>.
 */
public  class WindowSpecReference implements org.apache.spark.sql.catalyst.expressions.WindowSpec, scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  java.lang.String name ()  { throw new RuntimeException(); }
  // not preceding
  public   WindowSpecReference (java.lang.String name)  { throw new RuntimeException(); }
}
