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
public  class DecisionTreeRunner$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final DecisionTreeRunner$ MODULE$ = null;
  public   DecisionTreeRunner$ ()  { throw new RuntimeException(); }
  public  void main (java.lang.String[] args)  { throw new RuntimeException(); }
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
    scala.Tuple3<org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint>, org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint>, java.lang.Object> loadDatasets (org.apache.spark.SparkContext sc, java.lang.String input, java.lang.String dataFormat, java.lang.String testInput, scala.Enumeration.Value algo, double fracTest)  { throw new RuntimeException(); }
  public  void run (org.apache.spark.examples.mllib.DecisionTreeRunner.Params params)  { throw new RuntimeException(); }
  /**
   * Calculates the mean squared error for regression.
   * <p>
   * This is just for demo purpose. In general, don't copy this code because it is NOT efficient
   * due to the use of structural types, which leads to one reflection call per record.
   * @param model (undocumented)
   * @param data (undocumented)
   * @return (undocumented)
   */
    double meanSquaredError (java.lang.Object model, org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint> data)  { throw new RuntimeException(); }
}
