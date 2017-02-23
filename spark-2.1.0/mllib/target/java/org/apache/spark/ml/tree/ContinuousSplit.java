package org.apache.spark.ml.tree;
/**
 * Split which tests a continuous feature.
 * param:  featureIndex  Index of the feature to test
 * param:  threshold  If the feature value is less than or equal to this threshold, then the
 *                   split goes left. Otherwise, it goes right.
 */
public  class ContinuousSplit implements org.apache.spark.ml.tree.Split {
  public  int featureIndex ()  { throw new RuntimeException(); }
  public  double threshold ()  { throw new RuntimeException(); }
  // not preceding
     ContinuousSplit (int featureIndex, double threshold)  { throw new RuntimeException(); }
    boolean shouldGoLeft (org.apache.spark.ml.linalg.Vector features)  { throw new RuntimeException(); }
    boolean shouldGoLeft (int binnedFeature, org.apache.spark.ml.tree.Split[] splits)  { throw new RuntimeException(); }
  public  boolean equals (Object o)  { throw new RuntimeException(); }
  public  int hashCode ()  { throw new RuntimeException(); }
    org.apache.spark.mllib.tree.model.Split toOld ()  { throw new RuntimeException(); }
}
