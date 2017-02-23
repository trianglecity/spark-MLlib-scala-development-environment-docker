package org.apache.spark.mllib.regression;
/**
 * Top-level methods for calling Lasso.
 * <p>
 *
 * @deprecated Use ml.regression.LinearRegression with elasticNetParam = 1.0. Note the default regParam is 0.01 for LassoWithSGD, but is 0.0 for LinearRegression. Since 2.0.0. 
*/
public  class LassoWithSGD$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final LassoWithSGD$ MODULE$ = null;
  public   LassoWithSGD$ ()  { throw new RuntimeException(); }
  /**
   * Train a Lasso model given an RDD of (label, features) pairs. We run a fixed number
   * of iterations of gradient descent using the specified step size. Each iteration uses
   * <code>miniBatchFraction</code> fraction of the data to calculate a stochastic gradient. The weights used
   * in gradient descent are initialized using the initial weights provided.
   * <p>
   * @param input RDD of (label, array of features) pairs. Each pair describes a row of the data
   *              matrix A as well as the corresponding right hand side label y
   * @param numIterations Number of iterations of gradient descent to run.
   * @param stepSize Step size scaling to be used for the iterations of gradient descent.
   * @param regParam Regularization parameter.
   * @param miniBatchFraction Fraction of data to be used per iteration.
   * @param initialWeights Initial set of weights to be used. Array should be equal in size to
   *        the number of features in the data.
   * <p>
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.regression.LassoModel train (org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint> input, int numIterations, double stepSize, double regParam, double miniBatchFraction, org.apache.spark.mllib.linalg.Vector initialWeights)  { throw new RuntimeException(); }
  /**
   * Train a Lasso model given an RDD of (label, features) pairs. We run a fixed number
   * of iterations of gradient descent using the specified step size. Each iteration uses
   * <code>miniBatchFraction</code> fraction of the data to calculate a stochastic gradient.
   * <p>
   * @param input RDD of (label, array of features) pairs. Each pair describes a row of the data
   *              matrix A as well as the corresponding right hand side label y
   * @param numIterations Number of iterations of gradient descent to run.
   * @param stepSize Step size to be used for each iteration of gradient descent.
   * @param regParam Regularization parameter.
   * @param miniBatchFraction Fraction of data to be used per iteration.
   * <p>
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.regression.LassoModel train (org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint> input, int numIterations, double stepSize, double regParam, double miniBatchFraction)  { throw new RuntimeException(); }
  /**
   * Train a Lasso model given an RDD of (label, features) pairs. We run a fixed number
   * of iterations of gradient descent using the specified step size. We use the entire data set to
   * update the true gradient in each iteration.
   * <p>
   * @param input RDD of (label, array of features) pairs. Each pair describes a row of the data
   *              matrix A as well as the corresponding right hand side label y
   * @param stepSize Step size to be used for each iteration of Gradient Descent.
   * @param regParam Regularization parameter.
   * @param numIterations Number of iterations of gradient descent to run.
   * @return a LassoModel which has the weights and offset from training.
   * <p>
   */
  public  org.apache.spark.mllib.regression.LassoModel train (org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint> input, int numIterations, double stepSize, double regParam)  { throw new RuntimeException(); }
  /**
   * Train a Lasso model given an RDD of (label, features) pairs. We run a fixed number
   * of iterations of gradient descent using a step size of 1.0. We use the entire data set to
   * compute the true gradient in each iteration.
   * <p>
   * @param input RDD of (label, array of features) pairs. Each pair describes a row of the data
   *              matrix A as well as the corresponding right hand side label y
   * @param numIterations Number of iterations of gradient descent to run.
   * @return a LassoModel which has the weights and offset from training.
   * <p>
   */
  public  org.apache.spark.mllib.regression.LassoModel train (org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint> input, int numIterations)  { throw new RuntimeException(); }
}
