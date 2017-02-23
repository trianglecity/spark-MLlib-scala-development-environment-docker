package org.apache.spark.mllib.optimization;
/**
 * :: DeveloperApi ::
 * Updater for L2 regularized problems.
 *          R(w) = 1/2 ||w||^2
 * Uses a step-size decreasing with the square root of the number of iterations.
 */
public  class SquaredL2Updater extends org.apache.spark.mllib.optimization.Updater {
  public   SquaredL2Updater ()  { throw new RuntimeException(); }
  public  scala.Tuple2<org.apache.spark.mllib.linalg.Vector, java.lang.Object> compute (org.apache.spark.mllib.linalg.Vector weightsOld, org.apache.spark.mllib.linalg.Vector gradient, double stepSize, int iter, double regParam)  { throw new RuntimeException(); }
}
