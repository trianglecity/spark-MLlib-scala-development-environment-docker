package org.apache.spark.mllib.tree.model;
/**
 * :: DeveloperApi ::
 * Information gain statistics for each split
 * param:  gain information gain value
 * param:  impurity current node impurity
 * param:  leftImpurity left node impurity
 * param:  rightImpurity right node impurity
 * param:  leftPredict left node predict
 * param:  rightPredict right node predict
 */
public  class InformationGainStats implements scala.Serializable {
  public  double gain ()  { throw new RuntimeException(); }
  public  double impurity ()  { throw new RuntimeException(); }
  public  double leftImpurity ()  { throw new RuntimeException(); }
  public  double rightImpurity ()  { throw new RuntimeException(); }
  public  org.apache.spark.mllib.tree.model.Predict leftPredict ()  { throw new RuntimeException(); }
  public  org.apache.spark.mllib.tree.model.Predict rightPredict ()  { throw new RuntimeException(); }
  // not preceding
  public   InformationGainStats (double gain, double impurity, double leftImpurity, double rightImpurity, org.apache.spark.mllib.tree.model.Predict leftPredict, org.apache.spark.mllib.tree.model.Predict rightPredict)  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  boolean equals (Object o)  { throw new RuntimeException(); }
  public  int hashCode ()  { throw new RuntimeException(); }
}
