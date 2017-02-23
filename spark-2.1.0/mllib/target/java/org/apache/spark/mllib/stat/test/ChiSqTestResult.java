package org.apache.spark.mllib.stat.test;
/**
 * Object containing the test results for the chi-squared hypothesis test.
 */
public  class ChiSqTestResult implements org.apache.spark.mllib.stat.test.TestResult<java.lang.Object> {
  public  double pValue ()  { throw new RuntimeException(); }
  public  int degreesOfFreedom ()  { throw new RuntimeException(); }
  public  double statistic ()  { throw new RuntimeException(); }
  public  java.lang.String method ()  { throw new RuntimeException(); }
  public  java.lang.String nullHypothesis ()  { throw new RuntimeException(); }
  // not preceding
     ChiSqTestResult (double pValue, int degreesOfFreedom, double statistic, java.lang.String method, java.lang.String nullHypothesis)  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
