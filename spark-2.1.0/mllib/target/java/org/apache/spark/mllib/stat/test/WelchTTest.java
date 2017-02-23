package org.apache.spark.mllib.stat.test;
/**
 * Performs Welch's 2-sample t-test. The null hypothesis is that the two data sets have equal mean.
 * This test does not assume equal variance between the two samples and does not assume equal
 * sample size.
 * <p>
 * @see <a href="http://en.wikipedia.org/wiki/Welch%27s_t_test">Welch's t-test (Wikipedia)</a>
 */
public  class WelchTTest {
  static public final  java.lang.String methodName ()  { throw new RuntimeException(); }
  static public final  java.lang.String nullHypothesis ()  { throw new RuntimeException(); }
  static private final  com.twitter.chill.MeatLocker<org.apache.commons.math3.stat.inference.TTest> tTester ()  { throw new RuntimeException(); }
  static public  org.apache.spark.streaming.dstream.DStream<org.apache.spark.mllib.stat.test.StreamingTestResult> doTest (org.apache.spark.streaming.dstream.DStream<scala.Tuple2<org.apache.spark.util.StatCounter, org.apache.spark.util.StatCounter>> data)  { throw new RuntimeException(); }
  static private  org.apache.spark.mllib.stat.test.StreamingTestResult test (org.apache.spark.util.StatCounter statsA, org.apache.spark.util.StatCounter statsB)  { throw new RuntimeException(); }
  static protected  org.apache.commons.math3.stat.descriptive.StatisticalSummaryValues toApacheCommonsStats (org.apache.spark.util.StatCounter summaryStats)  { throw new RuntimeException(); }
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
}
