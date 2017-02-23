package org.apache.spark.ml.tree.impl;
public  class TreePoint$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final TreePoint$ MODULE$ = null;
  public   TreePoint$ ()  { throw new RuntimeException(); }
  /**
   * Convert an input dataset into its TreePoint representation,
   * binning feature values in preparation for DecisionTree training.
   * @param input     Input dataset.
   * @param splits    Splits for features, of size (numFeatures, numSplits).
   * @param metadata  Learning and dataset metadata
   * @return  TreePoint dataset representation
   */
  public  org.apache.spark.rdd.RDD<org.apache.spark.ml.tree.impl.TreePoint> convertToTreeRDD (org.apache.spark.rdd.RDD<org.apache.spark.ml.feature.LabeledPoint> input, org.apache.spark.ml.tree.Split[][] splits, org.apache.spark.ml.tree.impl.DecisionTreeMetadata metadata)  { throw new RuntimeException(); }
  /**
   * Convert one LabeledPoint into its TreePoint representation.
   * @param thresholds  For each feature, split thresholds for continuous features,
   *                    empty for categorical features.
   * @param featureArity  Array indexed by feature, with value 0 for continuous and numCategories
   *                      for categorical features.
   * @param labeledPoint (undocumented)
   * @return (undocumented)
   */
  private  org.apache.spark.ml.tree.impl.TreePoint labeledPointToTreePoint (org.apache.spark.ml.feature.LabeledPoint labeledPoint, double[][] thresholds, int[] featureArity)  { throw new RuntimeException(); }
  /**
   * Find discretized value for one (labeledPoint, feature).
   * <p>
   * NOTE: We cannot use Bucketizer since it handles split thresholds differently than the old
   *       (mllib) tree API.  We want to maintain the same behavior as the old tree API.
   * <p>
   * @param featureArity  0 for continuous features; number of categories for categorical features.
   * @param featureIndex (undocumented)
   * @param labeledPoint (undocumented)
   * @param thresholds (undocumented)
   * @return (undocumented)
   */
  private  int findBin (int featureIndex, org.apache.spark.ml.feature.LabeledPoint labeledPoint, int featureArity, double[] thresholds)  { throw new RuntimeException(); }
}
