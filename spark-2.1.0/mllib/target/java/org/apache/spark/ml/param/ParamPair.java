package org.apache.spark.ml.param;
/**
 * A param and its value.
 */
public  class ParamPair<T extends java.lang.Object> implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.param.Param<T> param ()  { throw new RuntimeException(); }
  public  T value ()  { throw new RuntimeException(); }
  // not preceding
  public   ParamPair (org.apache.spark.ml.param.Param<T> param, T value)  { throw new RuntimeException(); }
}
