package org.apache.spark.mllib.stat.test;
/**
 * Performs Students's 2-sample t-test. The null hypothesis is that the two data sets have equal
 * mean. This test assumes equal variance between the two samples and does not assume equal sample
 * size. For unequal variances, Welch's t-test should be used instead.
 * <p>
 * @see <a href="http://en.wikipedia.org/wiki/Student%27s_t-test">Student's t-test (Wikipedia)</a>
 */
public  class StudentTTest$ implements org.apache.spark.mllib.stat.test.StreamingTestMethod, org.apache.spark.internal.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final StudentTTest$ MODULE$ = null;
  public   StudentTTest$ ()  { throw new RuntimeException(); }
  public final  java.lang.String methodName ()  { throw new RuntimeException(); }
  public final  java.lang.String nullHypothesis ()  { throw new RuntimeException(); }
  private final  com.twitter.chill.MeatLocker<org.apache.commons.math3.stat.inference.TTest> tTester ()  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.dstream.DStream<org.apache.spark.mllib.stat.test.StreamingTestResult> doTest (org.apache.spark.streaming.dstream.DStream<scala.Tuple2<org.apache.spark.util.StatCounter, org.apache.spark.util.StatCounter>> data)  { throw new RuntimeException(); }
  private  org.apache.spark.mllib.stat.test.StreamingTestResult test (org.apache.spark.util.StatCounter statsA, org.apache.spark.util.StatCounter statsB)  { throw new RuntimeException(); }
}
