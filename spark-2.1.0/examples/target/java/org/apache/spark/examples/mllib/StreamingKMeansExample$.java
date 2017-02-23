package org.apache.spark.examples.mllib;
/**
 * Estimate clusters on one stream of data and make predictions
 * on another stream, where the data streams arrive as text files
 * into two different directories.
 * <p>
 * The rows of the training text files must be vector data in the form
 * <code>[x1,x2,x3,...,xn]</code>
 * Where n is the number of dimensions.
 * <p>
 * The rows of the test text files must be labeled data in the form
 * <code>(y,[x1,x2,x3,...,xn])</code>
 * Where y is some identifier. n must be the same for train and test.
 * <p>
 * Usage:
 *   StreamingKMeansExample <trainingDir> <testDir> <batchDuration> <numClusters> <numDimensions>
 * <p>
 * To run on your local machine using the two directories <code>trainingDir</code> and <code>testDir</code>,
 * with updates every 5 seconds, 2 dimensions per data point, and 3 clusters, call:
 *    $ bin/run-example mllib.StreamingKMeansExample trainingDir testDir 5 3 2
 * <p>
 * As you add text files to <code>trainingDir</code> the clusters will continuously update.
 * Anytime you add text files to <code>testDir</code>, you'll see predicted labels using the current model.
 * <p>
 */
public  class StreamingKMeansExample$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final StreamingKMeansExample$ MODULE$ = null;
  public   StreamingKMeansExample$ ()  { throw new RuntimeException(); }
  public  void main (java.lang.String[] args)  { throw new RuntimeException(); }
}
