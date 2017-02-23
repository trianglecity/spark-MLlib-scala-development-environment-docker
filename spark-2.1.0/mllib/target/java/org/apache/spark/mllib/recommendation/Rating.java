package org.apache.spark.mllib.recommendation;
/**
 * A more compact class to represent a rating than Tuple3[Int, Int, Double].
 */
public  class Rating implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  int user ()  { throw new RuntimeException(); }
  public  int product ()  { throw new RuntimeException(); }
  public  double rating ()  { throw new RuntimeException(); }
  // not preceding
  public   Rating (int user, int product, double rating)  { throw new RuntimeException(); }
}
