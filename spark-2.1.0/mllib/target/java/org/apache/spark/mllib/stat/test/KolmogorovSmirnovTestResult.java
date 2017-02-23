package org.apache.spark.mllib.stat.test;
/**
 * Object containing the test results for the Kolmogorov-Smirnov test.
 */
public  class KolmogorovSmirnovTestResult implements org.apache.spark.mllib.stat.test.TestResult<java.lang.Object> {
  public  double pValue ()  { throw new RuntimeException(); }
  public  double statistic ()  { throw new RuntimeException(); }
  public  java.lang.String nullHypothesis ()  { throw new RuntimeException(); }
  // not preceding
     KolmogorovSmirnovTestResult (double pValue, double statistic, java.lang.String nullHypothesis)  { throw new RuntimeException(); }
  public  int degreesOfFreedom ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
