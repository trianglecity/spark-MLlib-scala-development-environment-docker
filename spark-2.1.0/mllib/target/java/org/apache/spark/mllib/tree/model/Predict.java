package org.apache.spark.mllib.tree.model;
/**
 * :: DeveloperApi ::
 * Predicted value for a node
 * param:  predict predicted value
 * param:  prob probability of the label (classification only)
 */
public  class Predict implements scala.Serializable {
  public  double predict ()  { throw new RuntimeException(); }
  public  double prob ()  { throw new RuntimeException(); }
  // not preceding
  public   Predict (double predict, double prob)  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  boolean equals (Object other)  { throw new RuntimeException(); }
  public  int hashCode ()  { throw new RuntimeException(); }
}
