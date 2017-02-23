package org.apache.spark.ml.tree.impl;
/**
 * Internal representation of LabeledPoint for DecisionTree.
 * This bins feature values based on a subsampled of data as follows:
 *  (a) Continuous features are binned into ranges.
 *  (b) Unordered categorical features are binned based on subsets of feature values.
 *      "Unordered categorical features" are categorical features with low arity used in
 *      multiclass classification.
 *  (c) Ordered categorical features are binned based on feature values.
 *      "Ordered categorical features" are categorical features with high arity,
 *      or any categorical feature used in regression or binary classification.
 * <p>
 * param:  label  Label from LabeledPoint
 * param:  binnedFeatures  Binned feature values.
 *                        Same length as LabeledPoint.features, but values are bin indices.
 */
  class TreePoint implements scala.Serializable {
  /**
   * Convert an input dataset into its TreePoint representation,
   * binning feature values in preparation for DecisionTree training.
   * @param input     Input dataset.
   * @param splits    Splits for features, of size (numFeatures, numSplits).
   * @param metadata  Learning and dataset metadata
   * @return  TreePoint dataset representation
   */
  static public  org.apache.spark.rdd.RDD<org.apache.spark.ml.tree.impl.TreePoint> convertToTreeRDD (org.apache.spark.rdd.RDD<org.apache.spark.ml.feature.LabeledPoint> input, org.apache.spark.ml.tree.Split[][] splits, org.apache.spark.ml.tree.impl.DecisionTreeMetadata metadata)  { throw new RuntimeException(); }
  /**
   * Convert one LabeledPoint into its TreePoint representation.
   * @param thresholds  For each feature, split thresholds for continuous features,
   *                    empty for categorical features.
   * @param featureArity  Array indexed by feature, with value 0 for continuous and numCategories
   *                      for categorical features.
   * @param labeledPoint (undocumented)
   * @return (undocumented)
   */
  static private  org.apache.spark.ml.tree.impl.TreePoint labeledPointToTreePoint (org.apache.spark.ml.feature.LabeledPoint labeledPoint, double[][] thresholds, int[] featureArity)  { throw new RuntimeException(); }
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
  static private  int findBin (int featureIndex, org.apache.spark.ml.feature.LabeledPoint labeledPoint, int featureArity, double[] thresholds)  { throw new RuntimeException(); }
  public  double label ()  { throw new RuntimeException(); }
  public  int[] binnedFeatures ()  { throw new RuntimeException(); }
  // not preceding
  public   TreePoint (double label, int[] binnedFeatures)  { throw new RuntimeException(); }
}
