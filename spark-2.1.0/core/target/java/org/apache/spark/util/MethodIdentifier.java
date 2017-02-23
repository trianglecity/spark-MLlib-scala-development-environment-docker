package org.apache.spark.util;
/** Helper class to identify a method. */
public  class MethodIdentifier<T extends java.lang.Object> implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  java.lang.Class<T> cls ()  { throw new RuntimeException(); }
  public  java.lang.String name ()  { throw new RuntimeException(); }
  public  java.lang.String desc ()  { throw new RuntimeException(); }
  // not preceding
  public   MethodIdentifier (java.lang.Class<T> cls, java.lang.String name, java.lang.String desc)  { throw new RuntimeException(); }
}
