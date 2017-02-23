package org.apache.spark.mllib.tree.configuration;
/**
 * Stores all the configuration options for tree construction
 * param:  algo  Learning goal.  Supported:
 *              <code>org.apache.spark.mllib.tree.configuration.Algo.Classification</code>,
 *              <code>org.apache.spark.mllib.tree.configuration.Algo.Regression</code>
 * param:  impurity Criterion used for information gain calculation.
 *                 Supported for Classification: {@link org.apache.spark.mllib.tree.impurity.Gini},
 *                  {@link org.apache.spark.mllib.tree.impurity.Entropy}.
 *                 Supported for Regression: {@link org.apache.spark.mllib.tree.impurity.Variance}.
 * param:  maxDepth Maximum depth of the tree (e.g. depth 0 means 1 leaf node, depth 1 means
 *                 1 internal node + 2 leaf nodes).
 * param:  numClasses Number of classes for classification.
 *                                    (Ignored for regression.)
 *                                    Default value is 2 (binary classification).
 * param:  maxBins Maximum number of bins used for discretizing continuous features and
 *                for choosing how to split on features at each node.
 *                More bins give higher granularity.
 * param:  quantileCalculationStrategy Algorithm for calculating quantiles.  Supported:
 *                             <code>org.apache.spark.mllib.tree.configuration.QuantileStrategy.Sort</code>
 * param:  categoricalFeaturesInfo A map storing information about the categorical variables and the
 *                                number of discrete values they take. An entry (n to k)
 *                                indicates that feature n is categorical with k categories
 *                                indexed from 0: {0, 1, ..., k-1}.
 * param:  minInstancesPerNode Minimum number of instances each child must have after split.
 *                            Default value is 1. If a split cause left or right child
 *                            to have less than minInstancesPerNode,
 *                            this split will not be considered as a valid split.
 * param:  minInfoGain Minimum information gain a split must get. Default value is 0.0.
 *                    If a split has less information gain than minInfoGain,
 *                    this split will not be considered as a valid split.
 * param:  maxMemoryInMB Maximum memory in MB allocated to histogram aggregation. Default value is
 *                      256 MB.  If too small, then 1 node will be split per iteration, and
 *                      its aggregates may exceed this size.
 * param:  subsamplingRate Fraction of the training data used for learning decision tree.
 * param:  useNodeIdCache If this is true, instead of passing trees to executors, the algorithm will
 *                       maintain a separate RDD of node Id cache for each row.
 * param:  checkpointInterval How often to checkpoint when the node Id cache gets updated.
 *                           E.g. 10 means that the cache will get checkpointed every 10 updates. If
 *                           the checkpoint directory is not set in
 *                           {@link org.apache.spark.SparkContext}, this setting is ignored.
 */
public  class Strategy implements scala.Serializable {
  /**
   * Construct a default set of parameters for {@link org.apache.spark.mllib.tree.DecisionTree}
   * @param algo  "Classification" or "Regression"
   * @return (undocumented)
   */
  static public  org.apache.spark.mllib.tree.configuration.Strategy defaultStrategy (java.lang.String algo)  { throw new RuntimeException(); }
  /**
   * Construct a default set of parameters for {@link org.apache.spark.mllib.tree.DecisionTree}
   * @param algo Algo.Classification or Algo.Regression
   * @return (undocumented)
   */
  static public  org.apache.spark.mllib.tree.configuration.Strategy defaultStrategy (scala.Enumeration.Value algo)  { throw new RuntimeException(); }
  public  scala.Enumeration.Value algo ()  { throw new RuntimeException(); }
  public  org.apache.spark.mllib.tree.impurity.Impurity impurity ()  { throw new RuntimeException(); }
  public  void setImpurity (org.apache.spark.mllib.tree.impurity.Impurity x$1)  { throw new RuntimeException(); }
  public  int maxDepth ()  { throw new RuntimeException(); }
  public  void setMaxDepth (int x$1)  { throw new RuntimeException(); }
  public  int numClasses ()  { throw new RuntimeException(); }
  public  void setNumClasses (int x$1)  { throw new RuntimeException(); }
  public  int maxBins ()  { throw new RuntimeException(); }
  public  void setMaxBins (int x$1)  { throw new RuntimeException(); }
  public  scala.Enumeration.Value quantileCalculationStrategy ()  { throw new RuntimeException(); }
  public  void setQuantileCalculationStrategy (scala.Enumeration.Value x$1)  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.Object, java.lang.Object> categoricalFeaturesInfo ()  { throw new RuntimeException(); }
  public  int minInstancesPerNode ()  { throw new RuntimeException(); }
  public  void setMinInstancesPerNode (int x$1)  { throw new RuntimeException(); }
  public  double minInfoGain ()  { throw new RuntimeException(); }
  public  void setMinInfoGain (double x$1)  { throw new RuntimeException(); }
  public  int maxMemoryInMB ()  { throw new RuntimeException(); }
  public  void setMaxMemoryInMB (int x$1)  { throw new RuntimeException(); }
  public  double subsamplingRate ()  { throw new RuntimeException(); }
  public  void setSubsamplingRate (double x$1)  { throw new RuntimeException(); }
  public  boolean useNodeIdCache ()  { throw new RuntimeException(); }
  public  void setUseNodeIdCache (boolean x$1)  { throw new RuntimeException(); }
  public  int checkpointInterval ()  { throw new RuntimeException(); }
  public  void setCheckpointInterval (int x$1)  { throw new RuntimeException(); }
  // not preceding
  public   Strategy (scala.Enumeration.Value algo, org.apache.spark.mllib.tree.impurity.Impurity impurity, int maxDepth, int numClasses, int maxBins, scala.Enumeration.Value quantileCalculationStrategy, scala.collection.immutable.Map<java.lang.Object, java.lang.Object> categoricalFeaturesInfo, int minInstancesPerNode, double minInfoGain, int maxMemoryInMB, double subsamplingRate, boolean useNodeIdCache, int checkpointInterval)  { throw new RuntimeException(); }
  /**
   * @return (undocumented)
   */
  public  boolean isMulticlassClassification ()  { throw new RuntimeException(); }
  /**
   * @return (undocumented)
   */
  public  boolean isMulticlassWithCategoricalFeatures ()  { throw new RuntimeException(); }
  /**
   * Java-friendly constructor for {@link org.apache.spark.mllib.tree.configuration.Strategy}
   * @param algo (undocumented)
   * @param impurity (undocumented)
   * @param maxDepth (undocumented)
   * @param numClasses (undocumented)
   * @param maxBins (undocumented)
   * @param categoricalFeaturesInfo (undocumented)
   */
  public   Strategy (scala.Enumeration.Value algo, org.apache.spark.mllib.tree.impurity.Impurity impurity, int maxDepth, int numClasses, int maxBins, java.util.Map<java.lang.Integer, java.lang.Integer> categoricalFeaturesInfo)  { throw new RuntimeException(); }
  /**
   * Sets Algorithm using a String.
   * @param algo (undocumented)
   */
  public  void setAlgo (java.lang.String algo)  { throw new RuntimeException(); }
  /**
   * Sets categoricalFeaturesInfo using a Java Map.
   * @param categoricalFeaturesInfo (undocumented)
   */
  public  void setCategoricalFeaturesInfo (java.util.Map<java.lang.Integer, java.lang.Integer> categoricalFeaturesInfo)  { throw new RuntimeException(); }
  /**
   * Check validity of parameters.
   * Throws exception if invalid.
   */
    void assertValid ()  { throw new RuntimeException(); }
  /**
   * Returns a shallow copy of this instance.
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.tree.configuration.Strategy copy ()  { throw new RuntimeException(); }
  // not preceding
  public  scala.Enumeration.Value getAlgo ()  { throw new RuntimeException(); }
  public  org.apache.spark.mllib.tree.impurity.Impurity getImpurity ()  { throw new RuntimeException(); }
  public  int getMaxDepth ()  { throw new RuntimeException(); }
  public  int getNumClasses ()  { throw new RuntimeException(); }
  public  int getMaxBins ()  { throw new RuntimeException(); }
  public  scala.Enumeration.Value getQuantileCalculationStrategy ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.Object, java.lang.Object> getCategoricalFeaturesInfo ()  { throw new RuntimeException(); }
  public  int getMinInstancesPerNode ()  { throw new RuntimeException(); }
  public  double getMinInfoGain ()  { throw new RuntimeException(); }
  public  int getMaxMemoryInMB ()  { throw new RuntimeException(); }
  public  double getSubsamplingRate ()  { throw new RuntimeException(); }
  public  boolean getUseNodeIdCache ()  { throw new RuntimeException(); }
  public  int getCheckpointInterval ()  { throw new RuntimeException(); }
}
