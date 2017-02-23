package org.apache.spark.ml.optim;
/**
 * Interface for classes that solve the normal equations locally.
 */
  interface NormalEquationSolver {
  /** Solve the normal equations from summary statistics. */
  public  org.apache.spark.ml.optim.NormalEquationSolution solve (double bBar, double bbBar, org.apache.spark.ml.linalg.DenseVector abBar, org.apache.spark.ml.linalg.DenseVector aaBar, org.apache.spark.ml.linalg.DenseVector aBar)  ;
}
