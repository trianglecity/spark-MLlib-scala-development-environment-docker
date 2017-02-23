package org.apache.spark.ml.feature;
  class ColumnInteraction implements org.apache.spark.ml.feature.Term, scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.ml.feature.InteractableTerm> terms ()  { throw new RuntimeException(); }
  // not preceding
  public   ColumnInteraction (scala.collection.Seq<org.apache.spark.ml.feature.InteractableTerm> terms)  { throw new RuntimeException(); }
}
