package org.apache.spark.ml.optim;
/**
 * Model fitted by {@link IterativelyReweightedLeastSquares}.
 * param:  coefficients model coefficients
 * param:  intercept model intercept
 * param:  diagInvAtWA diagonal of matrix (A^T * W * A)^-1 in the last iteration
 * param:  numIterations number of iterations
 */
  class IterativelyReweightedLeastSquaresModel implements scala.Serializable {
  public  org.apache.spark.ml.linalg.DenseVector coefficients ()  { throw new RuntimeException(); }
  public  double intercept ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.linalg.DenseVector diagInvAtWA ()  { throw new RuntimeException(); }
  public  int numIterations ()  { throw new RuntimeException(); }
  // not preceding
  public   IterativelyReweightedLeastSquaresModel (org.apache.spark.ml.linalg.DenseVector coefficients, double intercept, org.apache.spark.ml.linalg.DenseVector diagInvAtWA, int numIterations)  { throw new RuntimeException(); }
}
