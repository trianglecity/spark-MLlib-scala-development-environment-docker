package org.apache.spark.ml.feature;
/**
 * Class that represents the features and label of a data point.
 * <p>
 * param:  label Label for this data point.
 * param:  features List of features for this data point.
 */
public  class LabeledPoint implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  double label ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.linalg.Vector features ()  { throw new RuntimeException(); }
  // not preceding
  public   LabeledPoint (double label, org.apache.spark.ml.linalg.Vector features)  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
