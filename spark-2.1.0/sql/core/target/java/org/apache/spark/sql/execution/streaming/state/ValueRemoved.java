package org.apache.spark.sql.execution.streaming.state;
public  class ValueRemoved implements org.apache.spark.sql.execution.streaming.state.StoreUpdate, scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.UnsafeRow key ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.UnsafeRow value ()  { throw new RuntimeException(); }
  // not preceding
  public   ValueRemoved (org.apache.spark.sql.catalyst.expressions.UnsafeRow key, org.apache.spark.sql.catalyst.expressions.UnsafeRow value)  { throw new RuntimeException(); }
}
