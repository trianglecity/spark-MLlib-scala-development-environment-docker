package org.apache.spark.mllib.optimization;
/**
 * :: DeveloperApi ::
 * Top-level method to run L-BFGS.
 */
public  class LBFGS$ implements org.apache.spark.internal.Logging, scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final LBFGS$ MODULE$ = null;
  public   LBFGS$ ()  { throw new RuntimeException(); }
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
  public  scala.Tuple2<org.apache.spark.mllib.linalg.Vector, double[]> runLBFGS (org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, org.apache.spark.mllib.linalg.Vector>> data, org.apache.spark.mllib.optimization.Gradient gradient, org.apache.spark.mllib.optimization.Updater updater, int numCorrections, double convergenceTol, int maxNumIterations, double regParam, org.apache.spark.mllib.linalg.Vector initialWeights)  { throw new RuntimeException(); }
}
