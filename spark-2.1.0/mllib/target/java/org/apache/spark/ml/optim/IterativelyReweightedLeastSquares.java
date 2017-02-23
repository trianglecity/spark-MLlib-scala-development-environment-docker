package org.apache.spark.ml.optim;
/**
 * Implements the method of iteratively reweighted least squares (IRLS) which is used to solve
 * certain optimization problems by an iterative method. In each step of the iterations, it
 * involves solving a weighted least squares (WLS) problem by {@link WeightedLeastSquares}.
 * It can be used to find maximum likelihood estimates of a generalized linear model (GLM),
 * find M-estimator in robust regression and other optimization problems.
 * <p>
 * param:  initialModel the initial guess model.
 * param:  reweightFunc the reweight function which is used to update offsets and weights
 *                     at each iteration.
 * param:  fitIntercept whether to fit intercept.
 * param:  regParam L2 regularization parameter used by WLS.
 * param:  maxIter maximum number of iterations.
 * param:  tol the convergence tolerance.
 * <p>
 * @see <a href="http://www.jstor.org/stable/2345503">P. J. Green, Iteratively
 * Reweighted Least Squares for Maximum Likelihood Estimation, and some Robust
 * and Resistant Alternatives, Journal of the Royal Statistical Society.
 * Series B, 1984.</a>
 */
  class IterativelyReweightedLeastSquares implements org.apache.spark.internal.Logging, scala.Serializable {
  public  org.apache.spark.ml.optim.WeightedLeastSquaresModel initialModel ()  { throw new RuntimeException(); }
  public  scala.Function2<org.apache.spark.ml.feature.Instance, org.apache.spark.ml.optim.WeightedLeastSquaresModel, scala.Tuple2<java.lang.Object, java.lang.Object>> reweightFunc ()  { throw new RuntimeException(); }
  public  boolean fitIntercept ()  { throw new RuntimeException(); }
  public  double regParam ()  { throw new RuntimeException(); }
  public  int maxIter ()  { throw new RuntimeException(); }
  public  double tol ()  { throw new RuntimeException(); }
  // not preceding
  public   IterativelyReweightedLeastSquares (org.apache.spark.ml.optim.WeightedLeastSquaresModel initialModel, scala.Function2<org.apache.spark.ml.feature.Instance, org.apache.spark.ml.optim.WeightedLeastSquaresModel, scala.Tuple2<java.lang.Object, java.lang.Object>> reweightFunc, boolean fitIntercept, double regParam, int maxIter, double tol)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.optim.IterativelyReweightedLeastSquaresModel fit (org.apache.spark.rdd.RDD<org.apache.spark.ml.feature.Instance> instances)  { throw new RuntimeException(); }
}
