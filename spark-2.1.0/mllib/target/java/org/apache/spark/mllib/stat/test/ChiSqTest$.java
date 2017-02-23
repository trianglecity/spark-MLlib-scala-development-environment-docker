package org.apache.spark.mllib.stat.test;
/**
 * Conduct the chi-squared test for the input RDDs using the specified method.
 * Goodness-of-fit test is conducted on two <code>Vectors</code>, whereas test of independence is conducted
 * on an input of type <code>Matrix</code> in which independence between columns is assessed.
 * We also provide a method for computing the chi-squared statistic between each feature and the
 * label for an input <code>RDD[LabeledPoint]</code>, return an <code>Array[ChiSquaredTestResult]</code> of size =
 * number of features in the input RDD.
 * <p>
 * Supported methods for goodness of fit: <code>pearson</code> (default)
 * Supported methods for independence: <code>pearson</code> (default)
 * <p>
 * More information on Chi-squared test: http://en.wikipedia.org/wiki/Chi-squared_test
 */
public  class ChiSqTest$ implements org.apache.spark.internal.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final ChiSqTest$ MODULE$ = null;
  public   ChiSqTest$ ()  { throw new RuntimeException(); }
  public  org.apache.spark.mllib.stat.test.ChiSqTest.Method PEARSON ()  { throw new RuntimeException(); }
  private  org.apache.spark.mllib.stat.test.ChiSqTest.Method methodFromString (java.lang.String methodName)  { throw new RuntimeException(); }
  /**
   * Conduct Pearson's independence test for each feature against the label across the input RDD.
   * The contingency table is constructed from the raw (feature, label) pairs and used to conduct
   * the independence test.
   * Returns an array containing the ChiSquaredTestResult for every feature against the label.
   * @param data (undocumented)
   * @param methodName (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.stat.test.ChiSqTestResult[] chiSquaredFeatures (org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint> data, java.lang.String methodName)  { throw new RuntimeException(); }
  public  org.apache.spark.mllib.stat.test.ChiSqTestResult chiSquared (org.apache.spark.mllib.linalg.Vector observed, org.apache.spark.mllib.linalg.Vector expected, java.lang.String methodName)  { throw new RuntimeException(); }
  public  org.apache.spark.mllib.stat.test.ChiSqTestResult chiSquaredMatrix (org.apache.spark.mllib.linalg.Matrix counts, java.lang.String methodName)  { throw new RuntimeException(); }
}
