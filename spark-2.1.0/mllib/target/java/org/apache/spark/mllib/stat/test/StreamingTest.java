package org.apache.spark.mllib.stat.test;
/**
 * Performs online 2-sample significance testing for a stream of (Boolean, Double) pairs. The
 * Boolean identifies which sample each observation comes from, and the Double is the numeric value
 * of the observation.
 * <p>
 * To address novelty affects, the <code>peacePeriod</code> specifies a set number of initial
 * {@link org.apache.spark.rdd.RDD} batches of the <code>DStream</code> to be dropped from significance testing.
 * <p>
 * The <code>windowSize</code> sets the number of batches each significance test is to be performed over. The
 * window is sliding with a stride length of 1 batch. Setting windowSize to 0 will perform
 * cumulative processing, using all batches seen so far.
 * <p>
 * Different tests may be used for assessing statistical significance depending on assumptions
 * satisfied by data. For more details, see {@link StreamingTestMethod}. The <code>testMethod</code> specifies
 * which test will be used.
 * <p>
 * Use a builder pattern to construct a streaming test in an application, for example:
 * <pre><code>
 *   val model = new StreamingTest()
 *     .setPeacePeriod(10)
 *     .setWindowSize(0)
 *     .setTestMethod("welch")
 *     .registerStream(DStream)
 * </code></pre>
 */
public  class StreamingTest implements org.apache.spark.internal.Logging, scala.Serializable {
  public   StreamingTest ()  { throw new RuntimeException(); }
  private  int peacePeriod ()  { throw new RuntimeException(); }
  private  int windowSize ()  { throw new RuntimeException(); }
  private  org.apache.spark.mllib.stat.test.StreamingTestMethod testMethod ()  { throw new RuntimeException(); }
  /** Set the number of initial batches to ignore. Default: 0. */
  public  org.apache.spark.mllib.stat.test.StreamingTest setPeacePeriod (int peacePeriod)  { throw new RuntimeException(); }
  /**
   * Set the number of batches to compute significance tests over. Default: 0.
   * A value of 0 will use all batches seen so far.
   * @param windowSize (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.stat.test.StreamingTest setWindowSize (int windowSize)  { throw new RuntimeException(); }
  /** Set the statistical method used for significance testing. Default: "welch" */
  public  org.apache.spark.mllib.stat.test.StreamingTest setTestMethod (java.lang.String method)  { throw new RuntimeException(); }
  /**
   * Register a <code>DStream</code> of values for significance testing.
   * <p>
   * @param data stream of BinarySample(key,value) pairs where the key denotes group membership
   *             (true = experiment, false = control) and the value is the numerical metric to
   *             test for significance
   * @return stream of significance testing results
   */
  public  org.apache.spark.streaming.dstream.DStream<org.apache.spark.mllib.stat.test.StreamingTestResult> registerStream (org.apache.spark.streaming.dstream.DStream<org.apache.spark.mllib.stat.test.BinarySample> data)  { throw new RuntimeException(); }
  /**
   * Register a <code>JavaDStream</code> of values for significance testing.
   * <p>
   * @param data stream of BinarySample(isExperiment,value) pairs where the isExperiment denotes
   *             group (true = experiment, false = control) and the value is the numerical metric
   *             to test for significance
   * @return stream of significance testing results
   */
  public  org.apache.spark.streaming.api.java.JavaDStream<org.apache.spark.mllib.stat.test.StreamingTestResult> registerStream (org.apache.spark.streaming.api.java.JavaDStream<org.apache.spark.mllib.stat.test.BinarySample> data)  { throw new RuntimeException(); }
  /** Drop all batches inside the peace period. */
    org.apache.spark.streaming.dstream.DStream<org.apache.spark.mllib.stat.test.BinarySample> dropPeacePeriod (org.apache.spark.streaming.dstream.DStream<org.apache.spark.mllib.stat.test.BinarySample> data)  { throw new RuntimeException(); }
  /** Compute summary statistics over each key and the specified test window size. */
    org.apache.spark.streaming.dstream.DStream<scala.Tuple2<java.lang.Object, org.apache.spark.util.StatCounter>> summarizeByKeyAndWindow (org.apache.spark.streaming.dstream.DStream<org.apache.spark.mllib.stat.test.BinarySample> data)  { throw new RuntimeException(); }
  /**
   * Transform a stream of summaries into pairs representing summary statistics for control group
   * and experiment group up to this batch.
   * @param summarizedData (undocumented)
   * @return (undocumented)
   */
    org.apache.spark.streaming.dstream.DStream<scala.Tuple2<org.apache.spark.util.StatCounter, org.apache.spark.util.StatCounter>> pairSummaries (org.apache.spark.streaming.dstream.DStream<scala.Tuple2<java.lang.Object, org.apache.spark.util.StatCounter>> summarizedData)  { throw new RuntimeException(); }
}
