package org.apache.spark.mllib.optimization;
/**
 * :: DeveloperApi ::
 * Compute gradient and loss for a Least-squared loss function, as used in linear regression.
 * This is correct for the averaged least squares loss function (mean squared error)
 *              L = 1/2n ||A weights-y||^2
 * See also the documentation for the precise formulation.
 */
public  class LeastSquaresGradient extends org.apache.spark.mllib.optimization.Gradient {
  public   LeastSquaresGradient ()  { throw new RuntimeException(); }
  public  scala.Tuple2<org.apache.spark.mllib.linalg.Vector, java.lang.Object> compute (org.apache.spark.mllib.linalg.Vector data, double label, org.apache.spark.mllib.linalg.Vector weights)  { throw new RuntimeException(); }
  public  double compute (org.apache.spark.mllib.linalg.Vector data, double label, org.apache.spark.mllib.linalg.Vector weights, org.apache.spark.mllib.linalg.Vector cumGradient)  { throw new RuntimeException(); }
}
