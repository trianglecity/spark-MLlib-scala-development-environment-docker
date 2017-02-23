package org.apache.spark.mllib.stat.test;
/**
 * Significance testing methods for {@link StreamingTest}. New 2-sample statistical significance tests
 * should extend {@link StreamingTestMethod} and introduce a new entry in
 * {@link StreamingTestMethod.TEST_NAME_TO_OBJECT}
 */
  interface StreamingTestMethod extends java.io.Serializable {
  public  java.lang.String methodName ()  ;
  public  java.lang.String nullHypothesis ()  ;
  /**
   * Perform streaming 2-sample statistical significance testing.
   * <p>
   * @param sampleSummaries stream pairs of summary statistics for the 2 samples
   * @return stream of rest results
   */
  public  org.apache.spark.streaming.dstream.DStream<org.apache.spark.mllib.stat.test.StreamingTestResult> doTest (org.apache.spark.streaming.dstream.DStream<scala.Tuple2<org.apache.spark.util.StatCounter, org.apache.spark.util.StatCounter>> sampleSummaries)  ;
  /**
   * Implicit adapter to convert between streaming summary statistics type and the type required by
   * the t-testing libraries.
   * @param summaryStats (undocumented)
   * @return (undocumented)
   */
  public  org.apache.commons.math3.stat.descriptive.StatisticalSummaryValues toApacheCommonsStats (org.apache.spark.util.StatCounter summaryStats)  ;
}
