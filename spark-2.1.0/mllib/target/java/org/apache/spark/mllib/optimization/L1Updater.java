package org.apache.spark.mllib.optimization;
/**
 * :: DeveloperApi ::
 * Updater for L1 regularized problems.
 *          R(w) = ||w||_1
 * Uses a step-size decreasing with the square root of the number of iterations.
 * <p>
 * Instead of subgradient of the regularizer, the proximal operator for the
 * L1 regularization is applied after the gradient step. This is known to
 * result in better sparsity of the intermediate solution.
 * <p>
 * The corresponding proximal operator for the L1 norm is the soft-thresholding
 * function. That is, each weight component is shrunk towards 0 by shrinkageVal.
 * <p>
 * If w is greater than shrinkageVal, set weight component to w-shrinkageVal.
 * If w is less than -shrinkageVal, set weight component to w+shrinkageVal.
 * If w is (-shrinkageVal, shrinkageVal), set weight component to 0.
 * <p>
 * Equivalently, set weight component to signum(w) * max(0.0, abs(w) - shrinkageVal)
 */
public  class L1Updater extends org.apache.spark.mllib.optimization.Updater {
  public   L1Updater ()  { throw new RuntimeException(); }
  public  scala.Tuple2<org.apache.spark.mllib.linalg.Vector, java.lang.Object> compute (org.apache.spark.mllib.linalg.Vector weightsOld, org.apache.spark.mllib.linalg.Vector gradient, double stepSize, int iter, double regParam)  { throw new RuntimeException(); }
}
