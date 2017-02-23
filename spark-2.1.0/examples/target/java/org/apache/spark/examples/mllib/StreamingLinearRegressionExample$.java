package org.apache.spark.examples.mllib;
/**
 * Train a linear regression model on one stream of data and make predictions
 * on another stream, where the data streams arrive as text files
 * into two different directories.
 * <p>
 * The rows of the text files must be labeled data points in the form
 * <code>(y,[x1,x2,x3,...,xn])</code>
 * Where n is the number of features. n must be the same for train and test.
 * <p>
 * Usage: StreamingLinearRegressionExample <trainingDir> <testDir>
 * <p>
 * To run on your local machine using the two directories <code>trainingDir</code> and <code>testDir</code>,
 * with updates every 5 seconds, and 2 features per data point, call:
 *    $ bin/run-example mllib.StreamingLinearRegressionExample trainingDir testDir
 * <p>
 * As you add text files to <code>trainingDir</code> the model will continuously update.
 * Anytime you add text files to <code>testDir</code>, you'll see predictions from the current model.
 * <p>
 */
public  class StreamingLinearRegressionExample$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final StreamingLinearRegressionExample$ MODULE$ = null;
  public   StreamingLinearRegressionExample$ ()  { throw new RuntimeException(); }
  public  void main (java.lang.String[] args)  { throw new RuntimeException(); }
}
