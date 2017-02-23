package org.apache.spark.ml.feature;
/**
 * Class that represents an instance of weighted data point with label and features.
 * <p>
 * param:  label Label for this data point.
 * param:  weight The weight of this instance.
 * param:  features The vector of features for this data point.
 */
  class Instance implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  double label ()  { throw new RuntimeException(); }
  public  double weight ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.linalg.Vector features ()  { throw new RuntimeException(); }
  // not preceding
  public   Instance (double label, double weight, org.apache.spark.ml.linalg.Vector features)  { throw new RuntimeException(); }
}
