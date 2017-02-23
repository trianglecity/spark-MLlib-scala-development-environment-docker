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
public  class ChiSqTest {
  /**
   * param:  name String name for the method.
   * param:  chiSqFunc Function for computing the statistic given the observed and expected counts.
   */
  static public  class Method implements scala.Product, scala.Serializable {
    public  java.lang.String name ()  { throw new RuntimeException(); }
    public  scala.Function2<java.lang.Object, java.lang.Object, java.lang.Object> chiSqFunc ()  { throw new RuntimeException(); }
    // not preceding
    public   Method (java.lang.String name, scala.Function2<java.lang.Object, java.lang.Object, java.lang.Object> chiSqFunc)  { throw new RuntimeException(); }
  }
  static public  class Method$ extends scala.runtime.AbstractFunction2<java.lang.String, scala.Function2<java.lang.Object, java.lang.Object, java.lang.Object>, org.apache.spark.mllib.stat.test.ChiSqTest.Method> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Method$ MODULE$ = null;
    public   Method$ ()  { throw new RuntimeException(); }
  }
  static public  class NullHypothesis$ extends scala.Enumeration {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final NullHypothesis$ MODULE$ = null;
    public   NullHypothesis$ ()  { throw new RuntimeException(); }
    public  scala.Enumeration.Value goodnessOfFit ()  { throw new RuntimeException(); }
    public  scala.Enumeration.Value independence ()  { throw new RuntimeException(); }
  }
  static public  org.apache.spark.mllib.stat.test.ChiSqTest.Method PEARSON ()  { throw new RuntimeException(); }
  static private  org.apache.spark.mllib.stat.test.ChiSqTest.Method methodFromString (java.lang.String methodName)  { throw new RuntimeException(); }
  /**
   * Conduct Pearson's independence test for each feature against the label across the input RDD.
   * The contingency table is constructed from the raw (feature, label) pairs and used to conduct
   * the independence test.
   * Returns an array containing the ChiSquaredTestResult for every feature against the label.
   * @param data (undocumented)
   * @param methodName (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.mllib.stat.test.ChiSqTestResult[] chiSquaredFeatures (org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint> data, java.lang.String methodName)  { throw new RuntimeException(); }
  static public  org.apache.spark.mllib.stat.test.ChiSqTestResult chiSquared (org.apache.spark.mllib.linalg.Vector observed, org.apache.spark.mllib.linalg.Vector expected, java.lang.String methodName)  { throw new RuntimeException(); }
  static public  org.apache.spark.mllib.stat.test.ChiSqTestResult chiSquaredMatrix (org.apache.spark.mllib.linalg.Matrix counts, java.lang.String methodName)  { throw new RuntimeException(); }
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
