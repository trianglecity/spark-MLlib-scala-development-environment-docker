package org.apache.spark.mllib.tree;
/**
 * A class that implements a <a href="http://en.wikipedia.org/wiki/Random_forest">Random Forest</a>
 * learning algorithm for classification and regression.
 * It supports both continuous and categorical features.
 * <p>
 * The settings for featureSubsetStrategy are based on the following references:
 *  - log2: tested in Breiman (2001)
 *  - sqrt: recommended by Breiman manual for random forests
 *  - The defaults of sqrt (classification) and onethird (regression) match the R randomForest
 *    package.
 * <p>
 * @see <a href="http://www.stat.berkeley.edu/~breiman/randomforest2001.pdf">Breiman (2001)</a>
 * @see <a href="http://www.stat.berkeley.edu/~breiman/Using_random_forests_V3.1.pdf">
 * Breiman manual for random forests</a>
 * param:  strategy The configuration parameters for the random forest algorithm which specify
 *                 the type of random forest (classification or regression), feature type
 *                 (continuous, categorical), depth of the tree, quantile calculation strategy,
 *                 etc.
 * param:  numTrees If 1, then no bootstrapping is used.  If greater than 1, then bootstrapping is
 *                 done.
 * param:  featureSubsetStrategy Number of features to consider for splits at each node.
 *                              Supported values: "auto", "all", "sqrt", "log2", "onethird".
 *                              Supported numerical values: "(0.0-1.0]", "[1-n]".
 *                              If "auto" is set, this parameter is set based on numTrees:
 *                                if numTrees == 1, set to "all";
 *                                if numTrees is greater than 1 (forest) set to "sqrt" for
 *                                  classification and to "onethird" for regression.
 *                              If a real value "n" in the range (0, 1.0] is set,
 *                                use n * number of features.
 *                              If an integer value "n" in the range (1, num features) is set,
 *                                use n features.
 * param:  seed Random seed for bootstrapping and choosing feature subsets.
 */
public  class RandomForest implements scala.Serializable, org.apache.spark.internal.Logging {
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
  static public  org.apache.spark.mllib.tree.model.RandomForestModel trainClassifier (org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint> input, org.apache.spark.mllib.tree.configuration.Strategy strategy, int numTrees, java.lang.String featureSubsetStrategy, int seed)  { throw new RuntimeException(); }
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
  static public  org.apache.spark.mllib.tree.model.RandomForestModel trainClassifier (org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint> input, int numClasses, scala.collection.immutable.Map<java.lang.Object, java.lang.Object> categoricalFeaturesInfo, int numTrees, java.lang.String featureSubsetStrategy, java.lang.String impurity, int maxDepth, int maxBins, int seed)  { throw new RuntimeException(); }
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
  static public  org.apache.spark.mllib.tree.model.RandomForestModel trainClassifier (org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.regression.LabeledPoint> input, int numClasses, java.util.Map<java.lang.Integer, java.lang.Integer> categoricalFeaturesInfo, int numTrees, java.lang.String featureSubsetStrategy, java.lang.String impurity, int maxDepth, int maxBins, int seed)  { throw new RuntimeException(); }
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
  static public  org.apache.spark.mllib.tree.model.RandomForestModel trainRegressor (org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint> input, org.apache.spark.mllib.tree.configuration.Strategy strategy, int numTrees, java.lang.String featureSubsetStrategy, int seed)  { throw new RuntimeException(); }
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
  static public  org.apache.spark.mllib.tree.model.RandomForestModel trainRegressor (org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint> input, scala.collection.immutable.Map<java.lang.Object, java.lang.Object> categoricalFeaturesInfo, int numTrees, java.lang.String featureSubsetStrategy, java.lang.String impurity, int maxDepth, int maxBins, int seed)  { throw new RuntimeException(); }
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
  static public  org.apache.spark.mllib.tree.model.RandomForestModel trainRegressor (org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.regression.LabeledPoint> input, java.util.Map<java.lang.Integer, java.lang.Integer> categoricalFeaturesInfo, int numTrees, java.lang.String featureSubsetStrategy, java.lang.String impurity, int maxDepth, int maxBins, int seed)  { throw new RuntimeException(); }
  /**
   * List of supported feature subset sampling strategies.
   * @return (undocumented)
   */
  static public  java.lang.String[] supportedFeatureSubsetStrategies ()  { throw new RuntimeException(); }
  static protected  java.lang.String logName ()  { throw new RuntimeException(); }
  static protected  org.slf4j.Logger log ()  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  boolean isTraceEnabled ()  { throw new RuntimeException(); }
  static protected  void initializeLogIfNecessary (boolean isInterpreter)  { throw new RuntimeException(); }
  private  org.apache.spark.mllib.tree.configuration.Strategy strategy ()  { throw new RuntimeException(); }
  private  int numTrees ()  { throw new RuntimeException(); }
  private  int seed ()  { throw new RuntimeException(); }
  // not preceding
  public   RandomForest (org.apache.spark.mllib.tree.configuration.Strategy strategy, int numTrees, java.lang.String featureSubsetStrategy, int seed)  { throw new RuntimeException(); }
  /**
   * Method to train a decision tree model over an RDD
   * <p>
   * @param input Training data: RDD of {@link org.apache.spark.mllib.regression.LabeledPoint}.
   * @return RandomForestModel that can be used for prediction.
   */
  public  org.apache.spark.mllib.tree.model.RandomForestModel run (org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint> input)  { throw new RuntimeException(); }
}
