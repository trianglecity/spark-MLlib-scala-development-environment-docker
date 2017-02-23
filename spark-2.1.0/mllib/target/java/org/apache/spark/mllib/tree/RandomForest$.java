package org.apache.spark.mllib.tree;
public  class RandomForest$ implements scala.Serializable, org.apache.spark.internal.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final RandomForest$ MODULE$ = null;
  public   RandomForest$ ()  { throw new RuntimeException(); }
  /**
   * Method to train a decision tree model for binary or multiclass classification.
   * <p>
   * @param input Training dataset: RDD of {@link org.apache.spark.mllib.regression.LabeledPoint}.
   *              Labels should take values {0, 1, ..., numClasses-1}.
   * @param strategy Parameters for training each tree in the forest.
   * @param numTrees Number of trees in the random forest.
   * @param featureSubsetStrategy Number of features to consider for splits at each node.
   *                              Supported values: "auto", "all", "sqrt", "log2", "onethird".
   *                              If "auto" is set, this parameter is set based on numTrees:
   *                                if numTrees == 1, set to "all";
   *                                if numTrees is greater than 1 (forest) set to "sqrt".
   * @param seed Random seed for bootstrapping and choosing feature subsets.
   * @return RandomForestModel that can be used for prediction.
   */
  public  org.apache.spark.mllib.tree.model.RandomForestModel trainClassifier (org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint> input, org.apache.spark.mllib.tree.configuration.Strategy strategy, int numTrees, java.lang.String featureSubsetStrategy, int seed)  { throw new RuntimeException(); }
  /**
   * Method to train a decision tree model for binary or multiclass classification.
   * <p>
   * @param input Training dataset: RDD of {@link org.apache.spark.mllib.regression.LabeledPoint}.
   *              Labels should take values {0, 1, ..., numClasses-1}.
   * @param numClasses Number of classes for classification.
   * @param categoricalFeaturesInfo Map storing arity of categorical features. An entry (n to k)
   *                                indicates that feature n is categorical with k categories
   *                                indexed from 0: {0, 1, ..., k-1}.
   * @param numTrees Number of trees in the random forest.
   * @param featureSubsetStrategy Number of features to consider for splits at each node.
   *                              Supported values: "auto", "all", "sqrt", "log2", "onethird".
   *                              If "auto" is set, this parameter is set based on numTrees:
   *                                if numTrees == 1, set to "all";
   *                                if numTrees is greater than 1 (forest) set to "sqrt".
   * @param impurity Criterion used for information gain calculation.
   *                 Supported values: "gini" (recommended) or "entropy".
   * @param maxDepth Maximum depth of the tree (e.g. depth 0 means 1 leaf node, depth 1 means
   *                 1 internal node + 2 leaf nodes).
   *                 (suggested value: 4)
   * @param maxBins Maximum number of bins used for splitting features
   *                (suggested value: 100)
   * @param seed Random seed for bootstrapping and choosing feature subsets.
   * @return RandomForestModel that can be used for prediction.
   */
  public  org.apache.spark.mllib.tree.model.RandomForestModel trainClassifier (org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint> input, int numClasses, scala.collection.immutable.Map<java.lang.Object, java.lang.Object> categoricalFeaturesInfo, int numTrees, java.lang.String featureSubsetStrategy, java.lang.String impurity, int maxDepth, int maxBins, int seed)  { throw new RuntimeException(); }
  /**
   * Java-friendly API for {@link org.apache.spark.mllib.tree.RandomForest$#trainClassifier}
   * @param input (undocumented)
   * @param numClasses (undocumented)
   * @param categoricalFeaturesInfo (undocumented)
   * @param numTrees (undocumented)
   * @param featureSubsetStrategy (undocumented)
   * @param impurity (undocumented)
   * @param maxDepth (undocumented)
   * @param maxBins (undocumented)
   * @param seed (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.tree.model.RandomForestModel trainClassifier (org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.regression.LabeledPoint> input, int numClasses, java.util.Map<java.lang.Integer, java.lang.Integer> categoricalFeaturesInfo, int numTrees, java.lang.String featureSubsetStrategy, java.lang.String impurity, int maxDepth, int maxBins, int seed)  { throw new RuntimeException(); }
  /**
   * Method to train a decision tree model for regression.
   * <p>
   * @param input Training dataset: RDD of {@link org.apache.spark.mllib.regression.LabeledPoint}.
   *              Labels are real numbers.
   * @param strategy Parameters for training each tree in the forest.
   * @param numTrees Number of trees in the random forest.
   * @param featureSubsetStrategy Number of features to consider for splits at each node.
   *                              Supported values: "auto", "all", "sqrt", "log2", "onethird".
   *                              If "auto" is set, this parameter is set based on numTrees:
   *                                if numTrees == 1, set to "all";
   *                                if numTrees is greater than 1 (forest) set to "onethird".
   * @param seed Random seed for bootstrapping and choosing feature subsets.
   * @return RandomForestModel that can be used for prediction.
   */
  public  org.apache.spark.mllib.tree.model.RandomForestModel trainRegressor (org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint> input, org.apache.spark.mllib.tree.configuration.Strategy strategy, int numTrees, java.lang.String featureSubsetStrategy, int seed)  { throw new RuntimeException(); }
  /**
   * Method to train a decision tree model for regression.
   * <p>
   * @param input Training dataset: RDD of {@link org.apache.spark.mllib.regression.LabeledPoint}.
   *              Labels are real numbers.
   * @param categoricalFeaturesInfo Map storing arity of categorical features. An entry (n to k)
   *                                indicates that feature n is categorical with k categories
   *                                indexed from 0: {0, 1, ..., k-1}.
   * @param numTrees Number of trees in the random forest.
   * @param featureSubsetStrategy Number of features to consider for splits at each node.
   *                              Supported values: "auto", "all", "sqrt", "log2", "onethird".
   *                              If "auto" is set, this parameter is set based on numTrees:
   *                                if numTrees == 1, set to "all";
   *                                if numTrees is greater than 1 (forest) set to "onethird".
   * @param impurity Criterion used for information gain calculation.
   *                 The only supported value for regression is "variance".
   * @param maxDepth Maximum depth of the tree. (e.g., depth 0 means 1 leaf node, depth 1 means
   *                 1 internal node + 2 leaf nodes).
   *                 (suggested value: 4)
   * @param maxBins Maximum number of bins used for splitting features.
   *                (suggested value: 100)
   * @param seed Random seed for bootstrapping and choosing feature subsets.
   * @return RandomForestModel that can be used for prediction.
   */
  public  org.apache.spark.mllib.tree.model.RandomForestModel trainRegressor (org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint> input, scala.collection.immutable.Map<java.lang.Object, java.lang.Object> categoricalFeaturesInfo, int numTrees, java.lang.String featureSubsetStrategy, java.lang.String impurity, int maxDepth, int maxBins, int seed)  { throw new RuntimeException(); }
  /**
   * Java-friendly API for {@link org.apache.spark.mllib.tree.RandomForest$#trainRegressor}
   * @param input (undocumented)
   * @param categoricalFeaturesInfo (undocumented)
   * @param numTrees (undocumented)
   * @param featureSubsetStrategy (undocumented)
   * @param impurity (undocumented)
   * @param maxDepth (undocumented)
   * @param maxBins (undocumented)
   * @param seed (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.tree.model.RandomForestModel trainRegressor (org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.regression.LabeledPoint> input, java.util.Map<java.lang.Integer, java.lang.Integer> categoricalFeaturesInfo, int numTrees, java.lang.String featureSubsetStrategy, java.lang.String impurity, int maxDepth, int maxBins, int seed)  { throw new RuntimeException(); }
  /**
   * List of supported feature subset sampling strategies.
   * @return (undocumented)
   */
  public  java.lang.String[] supportedFeatureSubsetStrategies ()  { throw new RuntimeException(); }
}
