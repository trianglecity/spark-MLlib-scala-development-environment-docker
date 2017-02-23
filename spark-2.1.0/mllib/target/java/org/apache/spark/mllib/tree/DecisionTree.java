package org.apache.spark.mllib.tree;
/**
 * A class which implements a decision tree learning algorithm for classification and regression.
 * It supports both continuous and categorical features.
 * <p>
 * param:  strategy The configuration parameters for the tree algorithm which specify the type
 *                 of decision tree (classification or regression), feature type (continuous,
 *                 categorical), depth of the tree, quantile calculation strategy, etc.
 * param:  seed Random seed.
 */
public  class DecisionTree implements scala.Serializable, org.apache.spark.internal.Logging {
  /**
   * Method to train a decision tree model.
   * The method supports binary and multiclass classification and regression.
   * <p>
   * @param input Training dataset: RDD of {@link org.apache.spark.mllib.regression.LabeledPoint}.
   *              For classification, labels should take values {0, 1, ..., numClasses-1}.
   *              For regression, labels are real numbers.
   * @param strategy The configuration parameters for the tree algorithm which specify the type
   *                 of decision tree (classification or regression), feature type (continuous,
   *                 categorical), depth of the tree, quantile calculation strategy, etc.
   * @return DecisionTreeModel that can be used for prediction.
   * <p>
   * @note Using {@link org.apache.spark.mllib.tree.DecisionTree$#trainClassifier}
   * and {@link org.apache.spark.mllib.tree.DecisionTree$#trainRegressor}
   * is recommended to clearly separate classification and regression.
   */
  static public  org.apache.spark.mllib.tree.model.DecisionTreeModel train (org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint> input, org.apache.spark.mllib.tree.configuration.Strategy strategy)  { throw new RuntimeException(); }
  /**
   * Method to train a decision tree model.
   * The method supports binary and multiclass classification and regression.
   * <p>
   * @param input Training dataset: RDD of {@link org.apache.spark.mllib.regression.LabeledPoint}.
   *              For classification, labels should take values {0, 1, ..., numClasses-1}.
   *              For regression, labels are real numbers.
   * @param algo Type of decision tree, either classification or regression.
   * @param impurity Criterion used for information gain calculation.
   * @param maxDepth Maximum depth of the tree (e.g. depth 0 means 1 leaf node, depth 1 means
   *                 1 internal node + 2 leaf nodes).
   * @return DecisionTreeModel that can be used for prediction.
   * <p>
   * @note Using {@link org.apache.spark.mllib.tree.DecisionTree$#trainClassifier}
   * and {@link org.apache.spark.mllib.tree.DecisionTree$#trainRegressor}
   * is recommended to clearly separate classification and regression.
   */
  static public  org.apache.spark.mllib.tree.model.DecisionTreeModel train (org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint> input, scala.Enumeration.Value algo, org.apache.spark.mllib.tree.impurity.Impurity impurity, int maxDepth)  { throw new RuntimeException(); }
  /**
   * Method to train a decision tree model.
   * The method supports binary and multiclass classification and regression.
   * <p>
   * @param input Training dataset: RDD of {@link org.apache.spark.mllib.regression.LabeledPoint}.
   *              For classification, labels should take values {0, 1, ..., numClasses-1}.
   *              For regression, labels are real numbers.
   * @param algo Type of decision tree, either classification or regression.
   * @param impurity Criterion used for information gain calculation.
   * @param maxDepth Maximum depth of the tree (e.g. depth 0 means 1 leaf node, depth 1 means
   *                 1 internal node + 2 leaf nodes).
   * @param numClasses Number of classes for classification. Default value of 2.
   * @return DecisionTreeModel that can be used for prediction.
   * <p>
   * @note Using {@link org.apache.spark.mllib.tree.DecisionTree$#trainClassifier}
   * and {@link org.apache.spark.mllib.tree.DecisionTree$#trainRegressor}
   * is recommended to clearly separate classification and regression.
   */
  static public  org.apache.spark.mllib.tree.model.DecisionTreeModel train (org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint> input, scala.Enumeration.Value algo, org.apache.spark.mllib.tree.impurity.Impurity impurity, int maxDepth, int numClasses)  { throw new RuntimeException(); }
  /**
   * Method to train a decision tree model.
   * The method supports binary and multiclass classification and regression.
   * <p>
   * @param input Training dataset: RDD of {@link org.apache.spark.mllib.regression.LabeledPoint}.
   *              For classification, labels should take values {0, 1, ..., numClasses-1}.
   *              For regression, labels are real numbers.
   * @param algo Type of decision tree, either classification or regression.
   * @param impurity Criterion used for information gain calculation.
   * @param maxDepth Maximum depth of the tree (e.g. depth 0 means 1 leaf node, depth 1 means
   *                 1 internal node + 2 leaf nodes).
   * @param numClasses Number of classes for classification. Default value of 2.
   * @param maxBins Maximum number of bins used for splitting features.
   * @param quantileCalculationStrategy  Algorithm for calculating quantiles.
   * @param categoricalFeaturesInfo Map storing arity of categorical features. An entry (n to k)
   *                                indicates that feature n is categorical with k categories
   *                                indexed from 0: {0, 1, ..., k-1}.
   * @return DecisionTreeModel that can be used for prediction.
   * <p>
   * @note Using {@link org.apache.spark.mllib.tree.DecisionTree$#trainClassifier}
   * and {@link org.apache.spark.mllib.tree.DecisionTree$#trainRegressor}
   * is recommended to clearly separate classification and regression.
   */
  static public  org.apache.spark.mllib.tree.model.DecisionTreeModel train (org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint> input, scala.Enumeration.Value algo, org.apache.spark.mllib.tree.impurity.Impurity impurity, int maxDepth, int numClasses, int maxBins, scala.Enumeration.Value quantileCalculationStrategy, scala.collection.immutable.Map<java.lang.Object, java.lang.Object> categoricalFeaturesInfo)  { throw new RuntimeException(); }
  /**
   * Method to train a decision tree model for binary or multiclass classification.
   * <p>
   * @param input Training dataset: RDD of {@link org.apache.spark.mllib.regression.LabeledPoint}.
   *              Labels should take values {0, 1, ..., numClasses-1}.
   * @param numClasses Number of classes for classification.
   * @param categoricalFeaturesInfo Map storing arity of categorical features. An entry (n to k)
   *                                indicates that feature n is categorical with k categories
   *                                indexed from 0: {0, 1, ..., k-1}.
   * @param impurity Criterion used for information gain calculation.
   *                 Supported values: "gini" (recommended) or "entropy".
   * @param maxDepth Maximum depth of the tree (e.g. depth 0 means 1 leaf node, depth 1 means
   *                 1 internal node + 2 leaf nodes).
   *                 (suggested value: 5)
   * @param maxBins Maximum number of bins used for splitting features.
   *                (suggested value: 32)
   * @return DecisionTreeModel that can be used for prediction.
   */
  static public  org.apache.spark.mllib.tree.model.DecisionTreeModel trainClassifier (org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint> input, int numClasses, scala.collection.immutable.Map<java.lang.Object, java.lang.Object> categoricalFeaturesInfo, java.lang.String impurity, int maxDepth, int maxBins)  { throw new RuntimeException(); }
  /**
   * Java-friendly API for {@link org.apache.spark.mllib.tree.DecisionTree$#trainClassifier}
   * @param input (undocumented)
   * @param numClasses (undocumented)
   * @param categoricalFeaturesInfo (undocumented)
   * @param impurity (undocumented)
   * @param maxDepth (undocumented)
   * @param maxBins (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.mllib.tree.model.DecisionTreeModel trainClassifier (org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.regression.LabeledPoint> input, int numClasses, java.util.Map<java.lang.Integer, java.lang.Integer> categoricalFeaturesInfo, java.lang.String impurity, int maxDepth, int maxBins)  { throw new RuntimeException(); }
  /**
   * Method to train a decision tree model for regression.
   * <p>
   * @param input Training dataset: RDD of {@link org.apache.spark.mllib.regression.LabeledPoint}.
   *              Labels are real numbers.
   * @param categoricalFeaturesInfo Map storing arity of categorical features. An entry (n to k)
   *                                indicates that feature n is categorical with k categories
   *                                indexed from 0: {0, 1, ..., k-1}.
   * @param impurity Criterion used for information gain calculation.
   *                 The only supported value for regression is "variance".
   * @param maxDepth Maximum depth of the tree (e.g. depth 0 means 1 leaf node, depth 1 means
   *                 1 internal node + 2 leaf nodes).
   *                 (suggested value: 5)
   * @param maxBins Maximum number of bins used for splitting features.
   *                (suggested value: 32)
   * @return DecisionTreeModel that can be used for prediction.
   */
  static public  org.apache.spark.mllib.tree.model.DecisionTreeModel trainRegressor (org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint> input, scala.collection.immutable.Map<java.lang.Object, java.lang.Object> categoricalFeaturesInfo, java.lang.String impurity, int maxDepth, int maxBins)  { throw new RuntimeException(); }
  /**
   * Java-friendly API for {@link org.apache.spark.mllib.tree.DecisionTree$#trainRegressor}
   * @param input (undocumented)
   * @param categoricalFeaturesInfo (undocumented)
   * @param impurity (undocumented)
   * @param maxDepth (undocumented)
   * @param maxBins (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.mllib.tree.model.DecisionTreeModel trainRegressor (org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.regression.LabeledPoint> input, java.util.Map<java.lang.Integer, java.lang.Integer> categoricalFeaturesInfo, java.lang.String impurity, int maxDepth, int maxBins)  { throw new RuntimeException(); }
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
  private  int seed ()  { throw new RuntimeException(); }
  // not preceding
     DecisionTree (org.apache.spark.mllib.tree.configuration.Strategy strategy, int seed)  { throw new RuntimeException(); }
  /**
   * @param strategy The configuration parameters for the tree algorithm which specify the type
   *                 of decision tree (classification or regression), feature type (continuous,
   *                 categorical), depth of the tree, quantile calculation strategy, etc.
   */
  public   DecisionTree (org.apache.spark.mllib.tree.configuration.Strategy strategy)  { throw new RuntimeException(); }
  /**
   * Method to train a decision tree model over an RDD
   * <p>
   * @param input Training data: RDD of {@link org.apache.spark.mllib.regression.LabeledPoint}.
   * @return DecisionTreeModel that can be used for prediction.
   */
  public  org.apache.spark.mllib.tree.model.DecisionTreeModel run (org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint> input)  { throw new RuntimeException(); }
}
