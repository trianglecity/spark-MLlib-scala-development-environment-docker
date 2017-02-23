package org.apache.spark.ml.regression;
/**
 * Class that represents the (features, label, censor) of a data point.
 * <p>
 * param:  features List of features for this data point.
 * param:  label Label for this data point.
 * param:  censor Indicator of the event has occurred or not. If the value is 1, it means
 *                 the event has occurred i.e. uncensored; otherwise censored.
 */
  class AFTPoint implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.linalg.Vector features ()  { throw new RuntimeException(); }
  public  double label ()  { throw new RuntimeException(); }
  public  double censor ()  { throw new RuntimeException(); }
  // not preceding
  public   AFTPoint (org.apache.spark.ml.linalg.Vector features, double label, double censor)  { throw new RuntimeException(); }
}
