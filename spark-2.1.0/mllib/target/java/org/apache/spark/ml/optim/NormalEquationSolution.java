package org.apache.spark.ml.optim;
/**
 * A class to hold the solution to the normal equations A^T^ W A x = A^T^ W b.
 * <p>
 * param:  coefficients The least squares coefficients. The last element in the coefficients
 *                     is the intercept when bias is added to A.
 * param:  aaInv An option containing the upper triangular part of (A^T^ W A)^-1^, in column major
 *              format. None when an optimization program is used to solve the normal equations.
 * param:  objectiveHistory Option containing the objective history when an optimization program is
 *                         used to solve the normal equations. None when an analytic solver is used.
 */
  class NormalEquationSolution {
  public  double[] coefficients ()  { throw new RuntimeException(); }
  public  scala.Option<double[]> aaInv ()  { throw new RuntimeException(); }
  public  scala.Option<double[]> objectiveHistory ()  { throw new RuntimeException(); }
  // not preceding
  public   NormalEquationSolution (double[] coefficients, scala.Option<double[]> aaInv, scala.Option<double[]> objectiveHistory)  { throw new RuntimeException(); }
}
