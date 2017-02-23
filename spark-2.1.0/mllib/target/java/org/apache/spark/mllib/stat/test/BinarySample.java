package org.apache.spark.mllib.stat.test;
/**
 * Class that represents the group and value of a sample.
 * <p>
 * param:  isExperiment if the sample is of the experiment group.
 * param:  value numeric value of the observation.
 */
public  class BinarySample implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  boolean isExperiment ()  { throw new RuntimeException(); }
  public  double value ()  { throw new RuntimeException(); }
  // not preceding
  public   BinarySample (boolean isExperiment, double value)  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
