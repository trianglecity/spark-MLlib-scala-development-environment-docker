package org.apache.spark.sql.catalyst.expressions;
/** <value> FOLLOWING boundary. */
public  class ValueFollowing implements org.apache.spark.sql.catalyst.expressions.FrameBoundary, scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  int value ()  { throw new RuntimeException(); }
  // not preceding
  public   ValueFollowing (int value)  { throw new RuntimeException(); }
  public  boolean notFollows (org.apache.spark.sql.catalyst.expressions.FrameBoundary other)  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
