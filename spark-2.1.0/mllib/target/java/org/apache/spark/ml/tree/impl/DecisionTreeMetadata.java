package org.apache.spark.ml.tree.impl;
/**
 * Learning and dataset metadata for DecisionTree.
 * <p>
 * param:  numClasses    For classification: labels can take values {0, ..., numClasses - 1}.
 *                      For regression: fixed at 0 (no meaning).
 * param:  maxBins  Maximum number of bins, for all features.
 * param:  featureArity  Map: categorical feature index to arity.
 *                      I.e., the feature takes values in {0, ..., arity - 1}.
 * param:  numBins  Number of bins for each feature.
 */
  class DecisionTreeMetadata implements scala.Serializable {
  /**
   * Construct a {@link DecisionTreeMetadata} instance for this dataset and parameters.
   * This computes which categorical features will be ordered vs. unordered,
   * as well as the number of splits and bins for each feature.
   * @param input (undocumented)
   * @param strategy (undocumented)
   * @param numTrees (undocumented)
   * @param featureSubsetStrategy (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.ml.tree.impl.DecisionTreeMetadata buildMetadata (org.apache.spark.rdd.RDD<org.apache.spark.ml.feature.LabeledPoint> input, org.apache.spark.mllib.tree.configuration.Strategy strategy, int numTrees, java.lang.String featureSubsetStrategy)  { throw new RuntimeException(); }
  /**
   * Version of {@link DecisionTreeMetadata#buildMetadata} for DecisionTree.
   * @param input (undocumented)
   * @param strategy (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.ml.tree.impl.DecisionTreeMetadata buildMetadata (org.apache.spark.rdd.RDD<org.apache.spark.ml.feature.LabeledPoint> input, org.apache.spark.mllib.tree.configuration.Strategy strategy)  { throw new RuntimeException(); }
  /**
   * Given the arity of a categorical feature (arity = number of categories),
   * return the number of bins for the feature if it is to be treated as an unordered feature.
   * There is 1 split for every partitioning of categories into 2 disjoint, non-empty sets;
   * there are math.pow(2, arity - 1) - 1 such splits.
   * Each split has 2 corresponding bins.
   * @param arity (undocumented)
   * @return (undocumented)
   */
  static public  int numUnorderedBins (int arity)  { throw new RuntimeException(); }
  public  int numFeatures ()  { throw new RuntimeException(); }
  public  long numExamples ()  { throw new RuntimeException(); }
  public  int numClasses ()  { throw new RuntimeException(); }
  public  int maxBins ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.Object, java.lang.Object> featureArity ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Set<java.lang.Object> unorderedFeatures ()  { throw new RuntimeException(); }
  public  int[] numBins ()  { throw new RuntimeException(); }
  public  org.apache.spark.mllib.tree.impurity.Impurity impurity ()  { throw new RuntimeException(); }
  public  scala.Enumeration.Value quantileStrategy ()  { throw new RuntimeException(); }
  public  int maxDepth ()  { throw new RuntimeException(); }
  public  int minInstancesPerNode ()  { throw new RuntimeException(); }
  public  double minInfoGain ()  { throw new RuntimeException(); }
  public  int numTrees ()  { throw new RuntimeException(); }
  public  int numFeaturesPerNode ()  { throw new RuntimeException(); }
  // not preceding
  public   DecisionTreeMetadata (int numFeatures, long numExamples, int numClasses, int maxBins, scala.collection.immutable.Map<java.lang.Object, java.lang.Object> featureArity, scala.collection.immutable.Set<java.lang.Object> unorderedFeatures, int[] numBins, org.apache.spark.mllib.tree.impurity.Impurity impurity, scala.Enumeration.Value quantileStrategy, int maxDepth, int minInstancesPerNode, double minInfoGain, int numTrees, int numFeaturesPerNode)  { throw new RuntimeException(); }
  public  boolean isUnordered (int featureIndex)  { throw new RuntimeException(); }
  public  boolean isClassification ()  { throw new RuntimeException(); }
  public  boolean isMulticlass ()  { throw new RuntimeException(); }
  public  boolean isMulticlassWithCategoricalFeatures ()  { throw new RuntimeException(); }
  public  boolean isCategorical (int featureIndex)  { throw new RuntimeException(); }
  public  boolean isContinuous (int featureIndex)  { throw new RuntimeException(); }
  /**
   * Number of splits for the given feature.
   * For unordered features, there is 1 bin per split.
   * For ordered features, there is 1 more bin than split.
   * @param featureIndex (undocumented)
   * @return (undocumented)
   */
  public  int numSplits (int featureIndex)  { throw new RuntimeException(); }
  /**
   * Set number of splits for a continuous feature.
   * For a continuous feature, number of bins is number of splits plus 1.
   * @param featureIndex (undocumented)
   * @param numSplits (undocumented)
   */
  public  void setNumSplits (int featureIndex, int numSplits)  { throw new RuntimeException(); }
  /**
   * Indicates if feature subsampling is being used.
   * @return (undocumented)
   */
  public  boolean subsamplingFeatures ()  { throw new RuntimeException(); }
}
