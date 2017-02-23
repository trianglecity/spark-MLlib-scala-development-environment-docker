package org.apache.spark.examples.mllib;
/**
 * Perform streaming testing using Welch's 2-sample t-test on a stream of data, where the data
 * stream arrives as text files in a directory. Stops when the two groups are statistically
 * significant (p-value < 0.05) or after a user-specified timeout in number of batches is exceeded.
 * <p>
 * The rows of the text files must be in the form <code>Boolean, Double</code>. For example:
 *   false, -3.92
 *   true, 99.32
 * <p>
 * Usage:
 *   StreamingTestExample <dataDir> <batchDuration> <numBatchesTimeout>
 * <p>
 * To run on your local machine using the directory <code>dataDir</code> with 5 seconds between each batch and
 * a timeout after 100 insignificant batches, call:
 *    $ bin/run-example mllib.StreamingTestExample dataDir 5 100
 * <p>
 * As you add text files to <code>dataDir</code> the significance test wil continually update every
 * <code>batchDuration</code> seconds until the test becomes significant (p-value < 0.05) or the number of
 * batches processed exceeds <code>numBatchesTimeout</code>.
 */
public  class StreamingTestExample$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final StreamingTestExample$ MODULE$ = null;
  public   StreamingTestExample$ ()  { throw new RuntimeException(); }
  public  void main (java.lang.String[] args)  { throw new RuntimeException(); }
}
