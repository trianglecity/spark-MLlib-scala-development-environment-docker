package org.apache.spark.examples.mllib;
/**
 * An example runner for decision trees and random forests. Run with
 * <pre><code>
 * ./bin/run-example org.apache.spark.examples.mllib.DecisionTreeRunner [options]
 * </code></pre>
 * If you use it as a template to create your own app, please use <code>spark-submit</code> to submit your app.
 * <p>
 * Note: This script treats all features as real-valued (not categorical).
 *       To include categorical features, modify categoricalFeaturesInfo.
 */
public  class DecisionTreeRunner {
  static public  class ImpurityType$ extends scala.Enumeration {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final ImpurityType$ MODULE$ = null;
    public   ImpurityType$ ()  { throw new RuntimeException(); }
    public  scala.Enumeration.Value Gini ()  { throw new RuntimeException(); }
    public  scala.Enumeration.Value Entropy ()  { throw new RuntimeException(); }
    public  scala.Enumeration.Value Variance ()  { throw new RuntimeException(); }
  }
  static public  class Params extends org.apache.spark.examples.mllib.AbstractParams<org.apache.spark.examples.mllib.DecisionTreeRunner.Params> implements scala.Product, scala.Serializable {
    public  java.lang.String input ()  { throw new RuntimeException(); }
    public  java.lang.String testInput ()  { throw new RuntimeException(); }
    public  java.lang.String dataFormat ()  { throw new RuntimeException(); }
    public  scala.Enumeration.Value algo ()  { throw new RuntimeException(); }
    public  int maxDepth ()  { throw new RuntimeException(); }
    public  scala.Enumeration.Value impurity ()  { throw new RuntimeException(); }
    public  int maxBins ()  { throw new RuntimeException(); }
    public  int minInstancesPerNode ()  { throw new RuntimeException(); }
    public  double minInfoGain ()  { throw new RuntimeException(); }
    public  int numTrees ()  { throw new RuntimeException(); }
    public  java.lang.String featureSubsetStrategy ()  { throw new RuntimeException(); }
    public  double fracTest ()  { throw new RuntimeException(); }
    public  boolean useNodeIdCache ()  { throw new RuntimeException(); }
    public  scala.Option<java.lang.String> checkpointDir ()  { throw new RuntimeException(); }
    public  int checkpointInterval ()  { throw new RuntimeException(); }
    // not preceding
    public   Params (java.lang.String input, java.lang.String testInput, java.lang.String dataFormat, scala.Enumeration.Value algo, int maxDepth, scala.Enumeration.Value impurity, int maxBins, int minInstancesPerNode, double minInfoGain, int numTrees, java.lang.String featureSubsetStrategy, double fracTest, boolean useNodeIdCache, scala.Option<java.lang.String> checkpointDir, int checkpointInterval)  { throw new RuntimeException(); }
  }
  static public  class Params$ extends scala.runtime.AbstractFunction15<java.lang.String, java.lang.String, java.lang.String, scala.Enumeration.Value, java.lang.Object, scala.Enumeration.Value, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.String, java.lang.Object, java.lang.Object, scala.Option<java.lang.String>, java.lang.Object, org.apache.spark.examples.mllib.DecisionTreeRunner.Params> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Params$ MODULE$ = null;
    public   Params$ ()  { throw new RuntimeException(); }
  }
  static public  void main (java.lang.String[] args)  { throw new RuntimeException(); }
  /**
   * Load training and test data from files.
   * @param input  Path to input dataset.
   * @param dataFormat  "libsvm" or "dense"
   * @param testInput  Path to test dataset.
   * @param algo  Classification or Regression
   * @param fracTest  Fraction of input data to hold out for testing.  Ignored if testInput given.
   * @return  (training dataset, test dataset, number of classes),
   *          where the number of classes is inferred from data (and set to 0 for Regression)
   * @param sc (undocumented)
   */
  static   scala.Tuple3<org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint>, org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint>, java.lang.Object> loadDatasets (org.apache.spark.SparkContext sc, java.lang.String input, java.lang.String dataFormat, java.lang.String testInput, scala.Enumeration.Value algo, double fracTest)  { throw new RuntimeException(); }
  static public  void run (org.apache.spark.examples.mllib.DecisionTreeRunner.Params params)  { throw new RuntimeException(); }
  /**
   * Calculates the mean squared error for regression.
   * <p>
   * This is just for demo purpose. In general, don't copy this code because it is NOT efficient
   * due to the use of structural types, which leads to one reflection call per record.
   * @param model (undocumented)
   * @param data (undocumented)
   * @return (undocumented)
   */
  static   double meanSquaredError (java.lang.Object model, org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint> data)  { throw new RuntimeException(); }
}
