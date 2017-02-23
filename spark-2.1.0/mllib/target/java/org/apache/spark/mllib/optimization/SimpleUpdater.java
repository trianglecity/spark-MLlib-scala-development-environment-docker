package org.apache.spark.mllib.optimization;
/**
 * :: DeveloperApi ::
 * A simple updater for gradient descent *without* any regularization.
 * Uses a step-size decreasing with the square root of the number of iterations.
 */
public  class SimpleUpdater extends org.apache.spark.mllib.optimization.Updater {
  public   SimpleUpdater ()  { throw new RuntimeException(); }
  public  scala.Tuple2<org.apache.spark.mllib.linalg.Vector, java.lang.Object> compute (org.apache.spark.mllib.linalg.Vector weightsOld, org.apache.spark.mllib.linalg.Vector gradient, double stepSize, int iter, double regParam)  { throw new RuntimeException(); }
}
