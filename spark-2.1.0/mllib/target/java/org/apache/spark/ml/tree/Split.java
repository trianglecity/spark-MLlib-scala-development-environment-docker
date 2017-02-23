package org.apache.spark.ml.tree;
/**
 * Interface for a "Split," which specifies a test made at a decision tree node
 * to choose the left or right path.
 */
public  interface Split extends scala.Serializable {
  /** Index of feature which this split tests */
  public  int featureIndex ()  ;
  /**
   * Return true (split to left) or false (split to right).
   * @param features  Vector of features (original values, not binned).
   * @return (undocumented)
   */
    boolean shouldGoLeft (org.apache.spark.ml.linalg.Vector features)  ;
  /**
   * Return true (split to left) or false (split to right).
   * @param binnedFeature Binned feature value.
   * @param splits All splits for the given feature.
   * @return (undocumented)
   */
    boolean shouldGoLeft (int binnedFeature, org.apache.spark.ml.tree.Split[] splits)  ;
  /** Convert to old Split format */
    org.apache.spark.mllib.tree.model.Split toOld ()  ;
}
