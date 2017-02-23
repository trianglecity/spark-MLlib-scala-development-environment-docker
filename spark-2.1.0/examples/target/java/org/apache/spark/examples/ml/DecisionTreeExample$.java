package org.apache.spark.examples.ml;
/**
 * An example runner for decision trees. Run with
 * <pre><code>
 * ./bin/run-example ml.DecisionTreeExample [options]
 * </code></pre>
 * Note that Decision Trees can take a large amount of memory. If the run-example command above
 * fails, try running via spark-submit and specifying the amount of memory as at least 1g.
 * For local mode, run
 * <pre><code>
 * ./bin/spark-submit --class org.apache.spark.examples.ml.DecisionTreeExample --driver-memory 1g
 *   [examples JAR path] [options]
 * </code></pre>
 * If you use it as a template to create your own app, please use <code>spark-submit</code> to submit your app.
 */
public  class DecisionTreeExample$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final DecisionTreeExample$ MODULE$ = null;
  public   DecisionTreeExample$ ()  { throw new RuntimeException(); }
  public  void main (java.lang.String[] args)  { throw new RuntimeException(); }
  /** Load a dataset from the given path, using the given format */
    org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> loadData (org.apache.spark.sql.SparkSession spark, java.lang.String path, java.lang.String format, scala.Option<java.lang.Object> expectedNumFeatures)  { throw new RuntimeException(); }
  /**
   * Load training and test data from files.
   * @param input  Path to input dataset.
   * @param dataFormat  "libsvm" or "dense"
   * @param testInput  Path to test dataset.
   * @param algo  Classification or Regression
   * @param fracTest  Fraction of input data to hold out for testing. Ignored if testInput given.
   * @return  (training dataset, test dataset)
   */
    scala.Tuple2<org.apache.spark.sql.Dataset<org.apache.spark.sql.Row>, org.apache.spark.sql.Dataset<org.apache.spark.sql.Row>> loadDatasets (java.lang.String input, java.lang.String dataFormat, java.lang.String testInput, java.lang.String algo, double fracTest)  { throw new RuntimeException(); }
  public  void run (org.apache.spark.examples.ml.DecisionTreeExample.Params params)  { throw new RuntimeException(); }
  /**
   * Evaluate the given ClassificationModel on data. Print the results.
   * @param model  Must fit ClassificationModel abstraction
   * @param data  DataFrame with "prediction" and labelColName columns
   * @param labelColName  Name of the labelCol parameter for the model
   * <p>
   * TODO: Change model type to ClassificationModel once that API is public. SPARK-5995
   */
    void evaluateClassificationModel (org.apache.spark.ml.Transformer model, org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> data, java.lang.String labelColName)  { throw new RuntimeException(); }
  /**
   * Evaluate the given RegressionModel on data. Print the results.
   * @param model  Must fit RegressionModel abstraction
   * @param data  DataFrame with "prediction" and labelColName columns
   * @param labelColName  Name of the labelCol parameter for the model
   * <p>
   * TODO: Change model type to RegressionModel once that API is public. SPARK-5995
   */
    void evaluateRegressionModel (org.apache.spark.ml.Transformer model, org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> data, java.lang.String labelColName)  { throw new RuntimeException(); }
}
