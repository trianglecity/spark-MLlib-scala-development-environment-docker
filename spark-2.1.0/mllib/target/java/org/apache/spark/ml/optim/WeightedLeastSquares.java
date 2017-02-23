package org.apache.spark.ml.optim;
/**
 * Weighted least squares solver via normal equation.
 * Given weighted observations (w,,i,,, a,,i,,, b,,i,,), we use the following weighted least squares
 * formulation:
 * <p>
 * min,,x,z,, 1/2 sum,,i,, w,,i,, (a,,i,,^T^ x + z - b,,i,,)^2^ / sum,,i,, w,,i,,
 *   + lambda / delta (1/2 (1 - alpha) sum,,j,, (sigma,,j,, x,,j,,)^2^
 *   + alpha sum,,j,, abs(sigma,,j,, x,,j,,)),
 * <p>
 * where lambda is the regularization parameter, alpha is the ElasticNet mixing parameter,
 * and delta and sigma,,j,, are controlled by {@link standardizeLabel} and {@link standardizeFeatures},
 * respectively.
 * <p>
 * Set {@link regParam} to 0.0 and turn off both {@link standardizeFeatures} and {@link standardizeLabel} to
 * match R's <code>lm</code>.
 * Turn on {@link standardizeLabel} to match R's <code>glmnet</code>.
 * <p>
 * @note The coefficients and intercept are always trained in the scaled space, but are returned
 *       on the original scale. {@link standardizeFeatures} and {@link standardizeLabel} can be used to
 *       control whether regularization is applied in the original space or the scaled space.
 * param:  fitIntercept whether to fit intercept. If false, z is 0.0.
 * param:  regParam Regularization parameter (lambda).
 * param:  elasticNetParam the ElasticNet mixing parameter (alpha).
 * param:  standardizeFeatures whether to standardize features. If true, sigma,,j,, is the
 *                            population standard deviation of the j-th column of A. Otherwise,
 *                            sigma,,j,, is 1.0.
 * param:  standardizeLabel whether to standardize label. If true, delta is the population standard
 *                         deviation of the label column b. Otherwise, delta is 1.0.
 * param:  solverType the type of solver to use for optimization.
 * param:  maxIter maximum number of iterations. Only for QuasiNewton solverType.
 * param:  tol the convergence tolerance of the iterations. Only for QuasiNewton solverType.
 */
  class WeightedLeastSquares implements org.apache.spark.internal.Logging, scala.Serializable {
  static public  class Auto$ implements org.apache.spark.ml.optim.WeightedLeastSquares.Solver, scala.Product, scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Auto$ MODULE$ = null;
    public   Auto$ ()  { throw new RuntimeException(); }
  }
  static public  class Cholesky$ implements org.apache.spark.ml.optim.WeightedLeastSquares.Solver, scala.Product, scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Cholesky$ MODULE$ = null;
    public   Cholesky$ ()  { throw new RuntimeException(); }
  }
  static public  class QuasiNewton$ implements org.apache.spark.ml.optim.WeightedLeastSquares.Solver, scala.Product, scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final QuasiNewton$ MODULE$ = null;
    public   QuasiNewton$ ()  { throw new RuntimeException(); }
  }
  static public  interface Solver {
  }
  /**
   * Aggregator to provide necessary summary statistics for solving {@link WeightedLeastSquares}.
   */
  static private  class Aggregator implements scala.Serializable {
    public   Aggregator ()  { throw new RuntimeException(); }
    public  boolean initialized ()  { throw new RuntimeException(); }
    public  int k ()  { throw new RuntimeException(); }
    public  long count ()  { throw new RuntimeException(); }
    public  int triK ()  { throw new RuntimeException(); }
    public  double wSum ()  { throw new RuntimeException(); }
    private  double wwSum ()  { throw new RuntimeException(); }
    private  double bSum ()  { throw new RuntimeException(); }
    private  double bbSum ()  { throw new RuntimeException(); }
    private  org.apache.spark.ml.linalg.DenseVector aSum ()  { throw new RuntimeException(); }
    private  org.apache.spark.ml.linalg.DenseVector abSum ()  { throw new RuntimeException(); }
    private  org.apache.spark.ml.linalg.DenseVector aaSum ()  { throw new RuntimeException(); }
    private  void init (int k)  { throw new RuntimeException(); }
    /**
     * Adds an instance.
     * @param instance (undocumented)
     * @return (undocumented)
     */
    public  org.apache.spark.ml.optim.WeightedLeastSquares.Aggregator add (org.apache.spark.ml.feature.Instance instance)  { throw new RuntimeException(); }
    /**
     * Merges another {@link Aggregator}.
     * @param other (undocumented)
     * @return (undocumented)
     */
    public  org.apache.spark.ml.optim.WeightedLeastSquares.Aggregator merge (org.apache.spark.ml.optim.WeightedLeastSquares.Aggregator other)  { throw new RuntimeException(); }
    /**
     * Validates that we have seen observations.
     */
    public  void validate ()  { throw new RuntimeException(); }
    /**
     * Weighted mean of features.
     * @return (undocumented)
     */
    public  org.apache.spark.ml.linalg.DenseVector aBar ()  { throw new RuntimeException(); }
    /**
     * Weighted mean of labels.
     * @return (undocumented)
     */
    public  double bBar ()  { throw new RuntimeException(); }
    /**
     * Weighted mean of squared labels.
     * @return (undocumented)
     */
    public  double bbBar ()  { throw new RuntimeException(); }
    /**
     * Weighted population standard deviation of labels.
     * @return (undocumented)
     */
    public  double bStd ()  { throw new RuntimeException(); }
    /**
     * Weighted mean of (label * features).
     * @return (undocumented)
     */
    public  org.apache.spark.ml.linalg.DenseVector abBar ()  { throw new RuntimeException(); }
    /**
     * Weighted mean of (features * features^T^).
     * @return (undocumented)
     */
    public  org.apache.spark.ml.linalg.DenseVector aaBar ()  { throw new RuntimeException(); }
    /**
     * Weighted population standard deviation of features.
     * @return (undocumented)
     */
    public  org.apache.spark.ml.linalg.DenseVector aStd ()  { throw new RuntimeException(); }
    /**
     * Weighted population variance of features.
     * @return (undocumented)
     */
    public  org.apache.spark.ml.linalg.DenseVector aVar ()  { throw new RuntimeException(); }
  }
  /**
   * In order to take the normal equation approach efficiently, {@link WeightedLeastSquares}
   * only supports the number of features is no more than 4096.
   * @return (undocumented)
   */
  static public  int MAX_NUM_FEATURES ()  { throw new RuntimeException(); }
  static public  scala.Product[] supportedSolvers ()  { throw new RuntimeException(); }
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
  public  boolean fitIntercept ()  { throw new RuntimeException(); }
  public  double regParam ()  { throw new RuntimeException(); }
  public  double elasticNetParam ()  { throw new RuntimeException(); }
  public  boolean standardizeFeatures ()  { throw new RuntimeException(); }
  public  boolean standardizeLabel ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.optim.WeightedLeastSquares.Solver solverType ()  { throw new RuntimeException(); }
  public  int maxIter ()  { throw new RuntimeException(); }
  public  double tol ()  { throw new RuntimeException(); }
  // not preceding
  public   WeightedLeastSquares (boolean fitIntercept, double regParam, double elasticNetParam, boolean standardizeFeatures, boolean standardizeLabel, org.apache.spark.ml.optim.WeightedLeastSquares.Solver solverType, int maxIter, double tol)  { throw new RuntimeException(); }
  /**
   * Creates a {@link WeightedLeastSquaresModel} from an RDD of {@link Instance}s.
   * @param instances (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.optim.WeightedLeastSquaresModel fit (org.apache.spark.rdd.RDD<org.apache.spark.ml.feature.Instance> instances)  { throw new RuntimeException(); }
  /** Construct A^T^ A (append bias if necessary). */
  private  org.apache.spark.ml.linalg.DenseVector getAtA (double[] aaBar, double[] aBar)  { throw new RuntimeException(); }
  /** Construct A^T^ b (append bias if necessary). */
  private  org.apache.spark.ml.linalg.DenseVector getAtB (double[] abBar, double bBar)  { throw new RuntimeException(); }
}
