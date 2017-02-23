package org.apache.spark.mllib.optimization;
/**
 * :: DeveloperApi ::
 * Top-level method to run gradient descent.
 */
public  class GradientDescent$ implements org.apache.spark.internal.Logging, scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final GradientDescent$ MODULE$ = null;
  public   GradientDescent$ ()  { throw new RuntimeException(); }
  /**
   * Run stochastic gradient descent (SGD) in parallel using mini batches.
   * In each iteration, we sample a subset (fraction miniBatchFraction) of the total data
   * in order to compute a gradient estimate.
   * Sampling, and averaging the subgradients over this subset is performed using one standard
   * spark map-reduce in each iteration.
   * <p>
   * @param data Input data for SGD. RDD of the set of data examples, each of
   *             the form (label, [feature values]).
   * @param gradient Gradient object (used to compute the gradient of the loss function of
   *                 one single data example)
   * @param updater Updater function to actually perform a gradient step in a given direction.
   * @param stepSize initial step size for the first step
   * @param numIterations number of iterations that SGD should be run.
   * @param regParam regularization parameter
   * @param miniBatchFraction fraction of the input data set that should be used for
   *                          one iteration of SGD. Default value 1.0.
   * @param convergenceTol Minibatch iteration will end before numIterations if the relative
   *                       difference between the current weight and the previous weight is less
   *                       than this value. In measuring convergence, L2 norm is calculated.
   *                       Default value 0.001. Must be between 0.0 and 1.0 inclusively.
   * @return A tuple containing two elements. The first element is a column matrix containing
   *         weights for every feature, and the second element is an array containing the
   *         stochastic loss computed for every iteration.
   * @param initialWeights (undocumented)
   */
  public  scala.Tuple2<org.apache.spark.mllib.linalg.Vector, double[]> runMiniBatchSGD (org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, org.apache.spark.mllib.linalg.Vector>> data, org.apache.spark.mllib.optimization.Gradient gradient, org.apache.spark.mllib.optimization.Updater updater, double stepSize, int numIterations, double regParam, double miniBatchFraction, org.apache.spark.mllib.linalg.Vector initialWeights, double convergenceTol)  { throw new RuntimeException(); }
  /**
   * Alias of {@link runMiniBatchSGD} with convergenceTol set to default value of 0.001.
   * @param data (undocumented)
   * @param gradient (undocumented)
   * @param updater (undocumented)
   * @param stepSize (undocumented)
   * @param numIterations (undocumented)
   * @param regParam (undocumented)
   * @param miniBatchFraction (undocumented)
   * @param initialWeights (undocumented)
   * @return (undocumented)
   */
  public  scala.Tuple2<org.apache.spark.mllib.linalg.Vector, double[]> runMiniBatchSGD (org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, org.apache.spark.mllib.linalg.Vector>> data, org.apache.spark.mllib.optimization.Gradient gradient, org.apache.spark.mllib.optimization.Updater updater, double stepSize, int numIterations, double regParam, double miniBatchFraction, org.apache.spark.mllib.linalg.Vector initialWeights)  { throw new RuntimeException(); }
  private  boolean isConverged (org.apache.spark.mllib.linalg.Vector previousWeights, org.apache.spark.mllib.linalg.Vector currentWeights, double convergenceTol)  { throw new RuntimeException(); }
}
