package org.apache.spark.ml.r;
  class KSTestWrapper {
  static public  org.apache.spark.ml.r.KSTestWrapper test (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> data, java.lang.String featureName, java.lang.String distName, double[] distParams)  { throw new RuntimeException(); }
  public  org.apache.spark.mllib.stat.test.KolmogorovSmirnovTestResult testResult ()  { throw new RuntimeException(); }
  public  java.lang.String distName ()  { throw new RuntimeException(); }
  public  double[] distParams ()  { throw new RuntimeException(); }
  // not preceding
  private   KSTestWrapper (org.apache.spark.mllib.stat.test.KolmogorovSmirnovTestResult testResult, java.lang.String distName, double[] distParams)  { throw new RuntimeException(); }
  public  double pValue ()  { throw new RuntimeException(); }
  public  double statistic ()  { throw new RuntimeException(); }
  public  java.lang.String nullHypothesis ()  { throw new RuntimeException(); }
  public  int degreesOfFreedom ()  { throw new RuntimeException(); }
  public  java.lang.String summary ()  { throw new RuntimeException(); }
}
