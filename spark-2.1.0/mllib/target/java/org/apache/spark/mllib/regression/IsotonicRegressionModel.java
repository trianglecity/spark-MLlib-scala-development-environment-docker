package org.apache.spark.mllib.regression;
/**
 * Regression model for isotonic regression.
 * <p>
 * param:  boundaries Array of boundaries for which predictions are known.
 *                   Boundaries must be sorted in increasing order.
 * param:  predictions Array of predictions associated to the boundaries at the same index.
 *                    Results of isotonic regression and therefore monotone.
 * param:  isotonic indicates whether this is isotonic or antitonic.
 * <p>
 */
public  class IsotonicRegressionModel implements java.io.Serializable, org.apache.spark.mllib.util.Saveable {
  static private  class SaveLoadV1_0$ {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final SaveLoadV1_0$ MODULE$ = null;
    public   SaveLoadV1_0$ ()  { throw new RuntimeException(); }
    public  java.lang.String thisFormatVersion ()  { throw new RuntimeException(); }
    /** Hard-code class name string in case it changes in the future */
    public  java.lang.String thisClassName ()  { throw new RuntimeException(); }
    /** Model data for model import/export */
    public  class Data implements scala.Product, scala.Serializable {
      public  double boundary ()  { throw new RuntimeException(); }
      public  double prediction ()  { throw new RuntimeException(); }
      // not preceding
      public   Data (double boundary, double prediction)  { throw new RuntimeException(); }
    }
    public  class Data extends scala.runtime.AbstractFunction2<java.lang.Object, java.lang.Object, org.apache.spark.mllib.regression.IsotonicRegressionModel.SaveLoadV1_0.Data> implements scala.Serializable {
      public   Data ()  { throw new RuntimeException(); }
    }
    public  void save (org.apache.spark.SparkContext sc, java.lang.String path, double[] boundaries, double[] predictions, boolean isotonic)  { throw new RuntimeException(); }
    public  scala.Tuple2<double[], double[]> load (org.apache.spark.SparkContext sc, java.lang.String path)  { throw new RuntimeException(); }
  }
  static public  org.apache.spark.mllib.regression.IsotonicRegressionModel load (org.apache.spark.SparkContext sc, java.lang.String path)  { throw new RuntimeException(); }
  public  double[] boundaries ()  { throw new RuntimeException(); }
  public  double[] predictions ()  { throw new RuntimeException(); }
  public  boolean isotonic ()  { throw new RuntimeException(); }
  // not preceding
  public   IsotonicRegressionModel (double[] boundaries, double[] predictions, boolean isotonic)  { throw new RuntimeException(); }
  private  scala.math.Ordering<java.lang.Object> predictionOrd ()  { throw new RuntimeException(); }
  /**
   * A Java-friendly constructor that takes two Iterable parameters and one Boolean parameter.
   * @param boundaries (undocumented)
   * @param predictions (undocumented)
   * @param isotonic (undocumented)
   */
  public   IsotonicRegressionModel (java.lang.Iterable<java.lang.Object> boundaries, java.lang.Iterable<java.lang.Object> predictions, java.lang.Boolean isotonic)  { throw new RuntimeException(); }
  /** Asserts the input array is monotone with the given ordering. */
  private  void assertOrdered (double[] xs, scala.math.Ordering<java.lang.Object> ord)  { throw new RuntimeException(); }
  /**
   * Predict labels for provided features.
   * Using a piecewise linear function.
   * <p>
   * @param testData Features to be labeled.
   * @return Predicted labels.
   * <p>
   */
  public  org.apache.spark.rdd.RDD<java.lang.Object> predict (org.apache.spark.rdd.RDD<java.lang.Object> testData)  { throw new RuntimeException(); }
  /**
   * Predict labels for provided features.
   * Using a piecewise linear function.
   * <p>
   * @param testData Features to be labeled.
   * @return Predicted labels.
   * <p>
   */
  public  org.apache.spark.api.java.JavaDoubleRDD predict (org.apache.spark.api.java.JavaDoubleRDD testData)  { throw new RuntimeException(); }
  /**
   * Predict a single label.
   * Using a piecewise linear function.
   * <p>
   * @param testData Feature to be labeled.
   * @return Predicted label.
   *         1) If testData exactly matches a boundary then associated prediction is returned.
   *           In case there are multiple predictions with the same boundary then one of them
   *           is returned. Which one is undefined (same as java.util.Arrays.binarySearch).
   *         2) If testData is lower or higher than all boundaries then first or last prediction
   *           is returned respectively. In case there are multiple predictions with the same
   *           boundary then the lowest or highest is returned respectively.
   *         3) If testData falls between two values in boundary array then prediction is treated
   *           as piecewise linear function and interpolated value is returned. In case there are
   *           multiple values with the same boundary then the same rules as in 2) are used.
   * <p>
   */
  public  double predict (double testData)  { throw new RuntimeException(); }
  /** A convenient method for boundaries called by the Python API. */
    org.apache.spark.mllib.linalg.Vector boundaryVector ()  { throw new RuntimeException(); }
  /** A convenient method for boundaries called by the Python API. */
    org.apache.spark.mllib.linalg.Vector predictionVector ()  { throw new RuntimeException(); }
  public  void save (org.apache.spark.SparkContext sc, java.lang.String path)  { throw new RuntimeException(); }
  protected  java.lang.String formatVersion ()  { throw new RuntimeException(); }
}
