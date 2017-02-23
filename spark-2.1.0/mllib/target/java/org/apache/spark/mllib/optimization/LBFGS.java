package org.apache.spark.mllib.optimization;
/**
 * :: DeveloperApi ::
 * Class used to solve an optimization problem using Limited-memory BFGS.
 * Reference: <a href="http://en.wikipedia.org/wiki/Limited-memory_BFGS">
 * Wikipedia on Limited-memory BFGS</a>
 * param:  gradient Gradient function to be used.
 * param:  updater Updater to be used to update weights after every iteration.
 */
public  class LBFGS implements org.apache.spark.mllib.optimization.Optimizer, org.apache.spark.internal.Logging {
  /**
   * CostFun implements Breeze's DiffFunction[T], which returns the loss and gradient
   * at a particular point (weights). It's used in Breeze's convex optimization routines.
   */
  static private  class CostFun implements breeze.optimize.DiffFunction<breeze.linalg.DenseVector<java.lang.Object>> {
    public   CostFun (org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, org.apache.spark.mllib.linalg.Vector>> data, org.apache.spark.mllib.optimization.Gradient gradient, org.apache.spark.mllib.optimization.Updater updater, double regParam, long numExamples)  { throw new RuntimeException(); }
    public  scala.Tuple2<java.lang.Object, breeze.linalg.DenseVector<java.lang.Object>> calculate (breeze.linalg.DenseVector<java.lang.Object> weights)  { throw new RuntimeException(); }
  }
  /**
   * Run Limited-memory BFGS (L-BFGS) in parallel.
   * Averaging the subgradients over different partitions is performed using one standard
   * spark map-reduce in each iteration.
   * <p>
   * @param data - Input data for L-BFGS. RDD of the set of data examples, each of
   *               the form (label, [feature values]).
   * @param gradient - Gradient object (used to compute the gradient of the loss function of
   *                   one single data example)
   * @param updater - Updater function to actually perform a gradient step in a given direction.
   * @param numCorrections - The number of corrections used in the L-BFGS update.
   * @param convergenceTol - The convergence tolerance of iterations for L-BFGS which is must be
   *                         nonnegative. Lower values are less tolerant and therefore generally
   *                         cause more iterations to be run.
   * @param maxNumIterations - Maximal number of iterations that L-BFGS can be run.
   * @param regParam - Regularization parameter
   * <p>
   * @return A tuple containing two elements. The first element is a column matrix containing
   *         weights for every feature, and the second element is an array containing the loss
   *         computed for every iteration.
   * @param initialWeights (undocumented)
   */
  static public  scala.Tuple2<org.apache.spark.mllib.linalg.Vector, double[]> runLBFGS (org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, org.apache.spark.mllib.linalg.Vector>> data, org.apache.spark.mllib.optimization.Gradient gradient, org.apache.spark.mllib.optimization.Updater updater, int numCorrections, double convergenceTol, int maxNumIterations, double regParam, org.apache.spark.mllib.linalg.Vector initialWeights)  { throw new RuntimeException(); }
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
  private  org.apache.spark.mllib.optimization.Gradient gradient ()  { throw new RuntimeException(); }
  private  org.apache.spark.mllib.optimization.Updater updater ()  { throw new RuntimeException(); }
  // not preceding
  public   LBFGS (org.apache.spark.mllib.optimization.Gradient gradient, org.apache.spark.mllib.optimization.Updater updater)  { throw new RuntimeException(); }
  private  int numCorrections ()  { throw new RuntimeException(); }
  private  double convergenceTol ()  { throw new RuntimeException(); }
  private  int maxNumIterations ()  { throw new RuntimeException(); }
  private  double regParam ()  { throw new RuntimeException(); }
  /**
   * Set the number of corrections used in the LBFGS update. Default 10.
   * Values of numCorrections less than 3 are not recommended; large values
   * of numCorrections will result in excessive computing time.
   * numCorrections must be positive, and values from 4 to 9 are generally recommended.
   * @param corrections (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.optimization.LBFGS setNumCorrections (int corrections)  { throw new RuntimeException(); }
  /**
   * Set the convergence tolerance of iterations for L-BFGS. Default 1E-6.
   * Smaller value will lead to higher accuracy with the cost of more iterations.
   * This value must be nonnegative. Lower convergence values are less tolerant
   * and therefore generally cause more iterations to be run.
   * @param tolerance (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.optimization.LBFGS setConvergenceTol (double tolerance)  { throw new RuntimeException(); }
    double getConvergenceTol ()  { throw new RuntimeException(); }
  /**
   * Set the maximal number of iterations for L-BFGS. Default 100.
   * @param iters (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.optimization.LBFGS setNumIterations (int iters)  { throw new RuntimeException(); }
  /**
   * Get the maximum number of iterations for L-BFGS. Defaults to 100.
   * @return (undocumented)
   */
    int getNumIterations ()  { throw new RuntimeException(); }
  /**
   * Set the regularization parameter. Default 0.0.
   * @param regParam (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.optimization.LBFGS setRegParam (double regParam)  { throw new RuntimeException(); }
  /**
   * Get the regularization parameter.
   * @return (undocumented)
   */
    double getRegParam ()  { throw new RuntimeException(); }
  /**
   * Set the gradient function (of the loss function of one single data example)
   * to be used for L-BFGS.
   * @param gradient (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.optimization.LBFGS setGradient (org.apache.spark.mllib.optimization.Gradient gradient)  { throw new RuntimeException(); }
  /**
   * Set the updater function to actually perform a gradient step in a given direction.
   * The updater is responsible to perform the update from the regularization term as well,
   * and therefore determines what kind or regularization is used, if any.
   * @param updater (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.optimization.LBFGS setUpdater (org.apache.spark.mllib.optimization.Updater updater)  { throw new RuntimeException(); }
  /**
   * Returns the updater, limited to internal use.
   * @return (undocumented)
   */
    org.apache.spark.mllib.optimization.Updater getUpdater ()  { throw new RuntimeException(); }
  public  org.apache.spark.mllib.linalg.Vector optimize (org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, org.apache.spark.mllib.linalg.Vector>> data, org.apache.spark.mllib.linalg.Vector initialWeights)  { throw new RuntimeException(); }
}
