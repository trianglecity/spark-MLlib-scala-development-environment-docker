package org.apache.spark.ml.optim;
/**
 * A class that solves the normal equations directly, using Cholesky decomposition.
 */
  class CholeskySolver implements org.apache.spark.ml.optim.NormalEquationSolver {
  public   CholeskySolver ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.optim.NormalEquationSolution solve (double bBar, double bbBar, org.apache.spark.ml.linalg.DenseVector abBar, org.apache.spark.ml.linalg.DenseVector aaBar, org.apache.spark.ml.linalg.DenseVector aBar)  { throw new RuntimeException(); }
}
