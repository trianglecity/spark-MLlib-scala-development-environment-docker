package org.apache.spark.ml.optim;
/**
 * A class for solving the normal equations using Quasi-Newton optimization methods.
 */
  class QuasiNewtonSolver implements org.apache.spark.ml.optim.NormalEquationSolver {
  public   QuasiNewtonSolver (boolean fitIntercept, int maxIter, double tol, scala.Option<scala.Function1<java.lang.Object, java.lang.Object>> l1RegFunc)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.optim.NormalEquationSolution solve (double bBar, double bbBar, org.apache.spark.ml.linalg.DenseVector abBar, org.apache.spark.ml.linalg.DenseVector aaBar, org.apache.spark.ml.linalg.DenseVector aBar)  { throw new RuntimeException(); }
  /**
   * NormalEquationCostFun implements Breeze's DiffFunction[T] for the normal equation.
   * It returns the loss and gradient with L2 regularization at a particular point (coefficients).
   * It's used in Breeze's convex optimization routines.
   */
  private  class NormalEquationCostFun implements breeze.optimize.DiffFunction<breeze.linalg.DenseVector<java.lang.Object>> {
    public   NormalEquationCostFun (double bBar, double bbBar, org.apache.spark.ml.linalg.DenseVector ab, org.apache.spark.ml.linalg.DenseVector aa, org.apache.spark.ml.linalg.DenseVector aBar, boolean fitIntercept, int numFeatures)  { throw new RuntimeException(); }
    private  int numFeaturesPlusIntercept ()  { throw new RuntimeException(); }
    public  scala.Tuple2<java.lang.Object, breeze.linalg.DenseVector<java.lang.Object>> calculate (breeze.linalg.DenseVector<java.lang.Object> coefficients)  { throw new RuntimeException(); }
  }
}
