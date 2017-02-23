package org.apache.spark.mllib.regression;
/**
 * Isotonic regression.
 * Currently implemented using parallelized pool adjacent violators algorithm.
 * Only univariate (single feature) algorithm supported.
 * <p>
 * Sequential PAV implementation based on:
 * Tibshirani, Ryan J., Holger Hoefling, and Robert Tibshirani.
 *   "Nearly-isotonic regression." Technometrics 53.1 (2011): 54-61.
 *   Available from <a href="http://www.stat.cmu.edu/~ryantibs/papers/neariso.pdf">here</a>
 * <p>
 * Sequential PAV parallelization based on:
 * Kearsley, Anthony J., Richard A. Tapia, and Michael W. Trosset.
 *   "An approach to parallelizing isotonic regression."
 *   Applied Mathematics and Parallel Computing. Physica-Verlag HD, 1996. 141-147.
 *   Available from <a href="http://softlib.rice.edu/pub/CRPC-TRs/reports/CRPC-TR96640.pdf">here</a>
 * <p>
 * @see <a href="http://en.wikipedia.org/wiki/Isotonic_regression">Isotonic regression
 * (Wikipedia)</a>
 */
public  class IsotonicRegression implements java.io.Serializable {
  private  boolean isotonic ()  { throw new RuntimeException(); }
  // not preceding
  private   IsotonicRegression (boolean isotonic)  { throw new RuntimeException(); }
  /**
   * Constructs IsotonicRegression instance with default parameter isotonic = true.
   */
  public   IsotonicRegression ()  { throw new RuntimeException(); }
  /**
   * Sets the isotonic parameter.
   * <p>
   * @param isotonic Isotonic (increasing) or antitonic (decreasing) sequence.
   * @return This instance of IsotonicRegression.
   */
  public  org.apache.spark.mllib.regression.IsotonicRegression setIsotonic (boolean isotonic)  { throw new RuntimeException(); }
  /**
   * Run IsotonicRegression algorithm to obtain isotonic regression model.
   * <p>
   * @param input RDD of tuples (label, feature, weight) where label is dependent variable
   *              for which we calculate isotonic regression, feature is independent variable
   *              and weight represents number of measures with default 1.
   *              If multiple labels share the same feature value then they are ordered before
   *              the algorithm is executed.
   * @return Isotonic regression model.
   */
  public  org.apache.spark.mllib.regression.IsotonicRegressionModel run (org.apache.spark.rdd.RDD<scala.Tuple3<java.lang.Object, java.lang.Object, java.lang.Object>> input)  { throw new RuntimeException(); }
  /**
   * Run pool adjacent violators algorithm to obtain isotonic regression model.
   * <p>
   * @param input JavaRDD of tuples (label, feature, weight) where label is dependent variable
   *              for which we calculate isotonic regression, feature is independent variable
   *              and weight represents number of measures with default 1.
   *              If multiple labels share the same feature value then they are ordered before
   *              the algorithm is executed.
   * @return Isotonic regression model.
   */
  public  org.apache.spark.mllib.regression.IsotonicRegressionModel run (org.apache.spark.api.java.JavaRDD<scala.Tuple3<java.lang.Double, java.lang.Double, java.lang.Double>> input)  { throw new RuntimeException(); }
  /**
   * Performs a pool adjacent violators algorithm (PAV).
   * Uses approach with single processing of data where violators
   * in previously processed data created by pooling are fixed immediately.
   * Uses optimization of discovering monotonicity violating sequences (blocks).
   * <p>
   * @param input Input data of tuples (label, feature, weight).
   * @return Result tuples (label, feature, weight) where labels were updated
   *         to form a monotone sequence as per isotonic regression definition.
   */
  private  scala.Tuple3<java.lang.Object, java.lang.Object, java.lang.Object>[] poolAdjacentViolators (scala.Tuple3<java.lang.Object, java.lang.Object, java.lang.Object>[] input)  { throw new RuntimeException(); }
  /**
   * Performs parallel pool adjacent violators algorithm.
   * Performs Pool adjacent violators algorithm on each partition and then again on the result.
   * <p>
   * @param input Input data of tuples (label, feature, weight).
   * @return Result tuples (label, feature, weight) where labels were updated
   *         to form a monotone sequence as per isotonic regression definition.
   */
  private  scala.Tuple3<java.lang.Object, java.lang.Object, java.lang.Object>[] parallelPoolAdjacentViolators (org.apache.spark.rdd.RDD<scala.Tuple3<java.lang.Object, java.lang.Object, java.lang.Object>> input)  { throw new RuntimeException(); }
}
