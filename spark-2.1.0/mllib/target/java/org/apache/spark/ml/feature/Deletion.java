package org.apache.spark.ml.feature;
  class Deletion implements org.apache.spark.ml.feature.Term, scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.Term term ()  { throw new RuntimeException(); }
  // not preceding
  public   Deletion (org.apache.spark.ml.feature.Term term)  { throw new RuntimeException(); }
}
