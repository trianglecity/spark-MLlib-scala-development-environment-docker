package org.apache.spark.mllib.optimization;
/**
 * :: DeveloperApi ::
 * Class used to perform steps (weight update) using Gradient Descent methods.
 * <p>
 * For general minimization problems, or for regularized problems of the form
 *         min  L(w) + regParam * R(w),
 * the compute function performs the actual update step, when given some
 * (e.g. stochastic) gradient direction for the loss L(w),
 * and a desired step-size (learning rate).
 * <p>
 * The updater is responsible to also perform the update coming from the
 * regularization term R(w) (if any regularization is used).
 */
public abstract class Updater implements scala.Serializable {
  public   Updater ()  { throw new RuntimeException(); }
  /**
   * Compute an updated value for weights given the gradient, stepSize, iteration number and
   * regularization parameter. Also returns the regularization value regParam * R(w)
   * computed using the *updated* weights.
   * <p>
   * @param weightsOld - Column matrix of size dx1 where d is the number of features.
   * @param gradient - Column matrix of size dx1 where d is the number of features.
   * @param stepSize - step size across iterations
   * @param iter - Iteration number
   * @param regParam - Regularization parameter
   * <p>
   * @return A tuple of 2 elements. The first element is a column matrix containing updated weights,
   *         and the second element is the regularization value computed using updated weights.
   */
  public abstract  scala.Tuple2<org.apache.spark.mllib.linalg.Vector, java.lang.Object> compute (org.apache.spark.mllib.linalg.Vector weightsOld, org.apache.spark.mllib.linalg.Vector gradient, double stepSize, int iter, double regParam)  ;
}
