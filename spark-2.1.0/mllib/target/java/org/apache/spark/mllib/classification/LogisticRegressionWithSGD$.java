package org.apache.spark.mllib.classification;
/**
 * Top-level methods for calling Logistic Regression using Stochastic Gradient Descent.
 * <p>
 * @note Labels used in Logistic Regression should be {0, 1}
 *
 * @deprecated Use ml.classification.LogisticRegression or LogisticRegressionWithLBFGS. Since 2.0.0. 
*/
public  class LogisticRegressionWithSGD$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final LogisticRegressionWithSGD$ MODULE$ = null;
  public   LogisticRegressionWithSGD$ ()  { throw new RuntimeException(); }
  /**
   * Train a logistic regression model given an RDD of (label, features) pairs. We run a fixed
   * number of iterations of gradient descent using the specified step size. Each iteration uses
   * <code>miniBatchFraction</code> fraction of the data to calculate the gradient. The weights used in
   * gradient descent are initialized using the initial weights provided.
   * <p>
   * @param input RDD of (label, array of features) pairs.
   * @param numIterations Number of iterations of gradient descent to run.
   * @param stepSize Step size to be used for each iteration of gradient descent.
   * @param miniBatchFraction Fraction of data to be used per iteration.
   * @param initialWeights Initial set of weights to be used. Array should be equal in size to
   *        the number of features in the data.
   * <p>
   * @note Labels used in Logistic Regression should be {0, 1}
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.classification.LogisticRegressionModel train (org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint> input, int numIterations, double stepSize, double miniBatchFraction, org.apache.spark.mllib.linalg.Vector initialWeights)  { throw new RuntimeException(); }
  /**
   * Train a logistic regression model given an RDD of (label, features) pairs. We run a fixed
   * number of iterations of gradient descent using the specified step size. Each iteration uses
   * <code>miniBatchFraction</code> fraction of the data to calculate the gradient.
   * <p>
   * @param input RDD of (label, array of features) pairs.
   * @param numIterations Number of iterations of gradient descent to run.
   * @param stepSize Step size to be used for each iteration of gradient descent.
   * @param miniBatchFraction Fraction of data to be used per iteration.
   * <p>
   * @note Labels used in Logistic Regression should be {0, 1}
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.classification.LogisticRegressionModel train (org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint> input, int numIterations, double stepSize, double miniBatchFraction)  { throw new RuntimeException(); }
  /**
   * Train a logistic regression model given an RDD of (label, features) pairs. We run a fixed
   * number of iterations of gradient descent using the specified step size. We use the entire data
   * set to update the gradient in each iteration.
   * <p>
   * @param input RDD of (label, array of features) pairs.
   * @param stepSize Step size to be used for each iteration of Gradient Descent.
   * @param numIterations Number of iterations of gradient descent to run.
   * @return a LogisticRegressionModel which has the weights and offset from training.
   * <p>
   * @note Labels used in Logistic Regression should be {0, 1}
   */
  public  org.apache.spark.mllib.classification.LogisticRegressionModel train (org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint> input, int numIterations, double stepSize)  { throw new RuntimeException(); }
  /**
   * Train a logistic regression model given an RDD of (label, features) pairs. We run a fixed
   * number of iterations of gradient descent using a step size of 1.0. We use the entire data set
   * to update the gradient in each iteration.
   * <p>
   * @param input RDD of (label, array of features) pairs.
   * @param numIterations Number of iterations of gradient descent to run.
   * @return a LogisticRegressionModel which has the weights and offset from training.
   * <p>
   * @note Labels used in Logistic Regression should be {0, 1}
   */
  public  org.apache.spark.mllib.classification.LogisticRegressionModel train (org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint> input, int numIterations)  { throw new RuntimeException(); }
}
