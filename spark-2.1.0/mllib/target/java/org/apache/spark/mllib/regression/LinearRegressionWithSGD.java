package org.apache.spark.mllib.regression;
/**
 * Train a linear regression model with no regularization using Stochastic Gradient Descent.
 * This solves the least squares regression formulation
 *              f(weights) = 1/n ||A weights-y||^2^
 * (which is the mean squared error).
 * Here the data matrix has n rows, and the input RDD holds the set of rows of A, each with
 * its corresponding right hand side label y.
 * See also the documentation for the precise formulation.
 */
public  class LinearRegressionWithSGD extends org.apache.spark.mllib.regression.GeneralizedLinearAlgorithm<org.apache.spark.mllib.regression.LinearRegressionModel> implements scala.Serializable {
  /**
   * Train a Linear Regression model given an RDD of (label, features) pairs. We run a fixed number
   * of iterations of gradient descent using the specified step size. Each iteration uses
   * <code>miniBatchFraction</code> fraction of the data to calculate a stochastic gradient. The weights used
   * in gradient descent are initialized using the initial weights provided.
   * <p>
   * @param input RDD of (label, array of features) pairs. Each pair describes a row of the data
   *              matrix A as well as the corresponding right hand side label y
   * @param numIterations Number of iterations of gradient descent to run.
   * @param stepSize Step size to be used for each iteration of gradient descent.
   * @param miniBatchFraction Fraction of data to be used per iteration.
   * @param initialWeights Initial set of weights to be used. Array should be equal in size to
   *        the number of features in the data.
   * <p>
   * @return (undocumented)
   */
  static public  org.apache.spark.mllib.regression.LinearRegressionModel train (org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint> input, int numIterations, double stepSize, double miniBatchFraction, org.apache.spark.mllib.linalg.Vector initialWeights)  { throw new RuntimeException(); }
  /**
   * Train a LinearRegression model given an RDD of (label, features) pairs. We run a fixed number
   * of iterations of gradient descent using the specified step size. Each iteration uses
   * <code>miniBatchFraction</code> fraction of the data to calculate a stochastic gradient.
   * <p>
   * @param input RDD of (label, array of features) pairs. Each pair describes a row of the data
   *              matrix A as well as the corresponding right hand side label y
   * @param numIterations Number of iterations of gradient descent to run.
   * @param stepSize Step size to be used for each iteration of gradient descent.
   * @param miniBatchFraction Fraction of data to be used per iteration.
   * <p>
   * @return (undocumented)
   */
  static public  org.apache.spark.mllib.regression.LinearRegressionModel train (org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint> input, int numIterations, double stepSize, double miniBatchFraction)  { throw new RuntimeException(); }
  /**
   * Train a LinearRegression model given an RDD of (label, features) pairs. We run a fixed number
   * of iterations of gradient descent using the specified step size. We use the entire data set to
   * compute the true gradient in each iteration.
   * <p>
   * @param input RDD of (label, array of features) pairs. Each pair describes a row of the data
   *              matrix A as well as the corresponding right hand side label y
   * @param stepSize Step size to be used for each iteration of Gradient Descent.
   * @param numIterations Number of iterations of gradient descent to run.
   * @return a LinearRegressionModel which has the weights and offset from training.
   * <p>
   */
  static public  org.apache.spark.mllib.regression.LinearRegressionModel train (org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint> input, int numIterations, double stepSize)  { throw new RuntimeException(); }
  /**
   * Train a LinearRegression model given an RDD of (label, features) pairs. We run a fixed number
   * of iterations of gradient descent using a step size of 1.0. We use the entire data set to
   * compute the true gradient in each iteration.
   * <p>
   * @param input RDD of (label, array of features) pairs. Each pair describes a row of the data
   *              matrix A as well as the corresponding right hand side label y
   * @param numIterations Number of iterations of gradient descent to run.
   * @return a LinearRegressionModel which has the weights and offset from training.
   * <p>
   */
  static public  org.apache.spark.mllib.regression.LinearRegressionModel train (org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint> input, int numIterations)  { throw new RuntimeException(); }
  static protected  java.lang.String logName ()  { throw new RuntimeException(); }
  static protected  org.slf4j.Logger log ()  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  boolean isTraceEnabled ()  { throw new RuntimeException(); }
  static protected  void initializeLogIfNecessary (boolean isInterpreter)  { throw new RuntimeException(); }
  static protected  scala.collection.Seq<scala.Function1<org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint>, java.lang.Object>> validators ()  { throw new RuntimeException(); }
  static protected  boolean addIntercept ()  { throw new RuntimeException(); }
  static protected  void addIntercept_$eq (boolean x$1)  { throw new RuntimeException(); }
  static protected  boolean validateData ()  { throw new RuntimeException(); }
  static protected  void validateData_$eq (boolean x$1)  { throw new RuntimeException(); }
  static protected  int numOfLinearPredictor ()  { throw new RuntimeException(); }
  static protected  void numOfLinearPredictor_$eq (int x$1)  { throw new RuntimeException(); }
  static   boolean useFeatureScaling ()  { throw new RuntimeException(); }
  static   void useFeatureScaling_$eq (boolean x$1)  { throw new RuntimeException(); }
  static public  int getNumFeatures ()  { throw new RuntimeException(); }
  static protected  int numFeatures ()  { throw new RuntimeException(); }
  static protected  void numFeatures_$eq (int x$1)  { throw new RuntimeException(); }
  static   org.apache.spark.mllib.regression.GeneralizedLinearAlgorithm<M> setFeatureScaling (boolean useFeatureScaling)  { throw new RuntimeException(); }
  static public  boolean isAddIntercept ()  { throw new RuntimeException(); }
  static public  org.apache.spark.mllib.regression.GeneralizedLinearAlgorithm<M> setIntercept (boolean addIntercept)  { throw new RuntimeException(); }
  static public  org.apache.spark.mllib.regression.GeneralizedLinearAlgorithm<M> setValidateData (boolean validateData)  { throw new RuntimeException(); }
  static protected  org.apache.spark.mllib.linalg.Vector generateInitialWeights (org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint> input)  { throw new RuntimeException(); }
  static public  M run (org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint> input)  { throw new RuntimeException(); }
  static public  M run (org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint> input, org.apache.spark.mllib.linalg.Vector initialWeights)  { throw new RuntimeException(); }
  private  double stepSize ()  { throw new RuntimeException(); }
  private  int numIterations ()  { throw new RuntimeException(); }
  private  double regParam ()  { throw new RuntimeException(); }
  private  double miniBatchFraction ()  { throw new RuntimeException(); }
  // not preceding
     LinearRegressionWithSGD (double stepSize, int numIterations, double regParam, double miniBatchFraction)  { throw new RuntimeException(); }
  private  org.apache.spark.mllib.optimization.LeastSquaresGradient gradient ()  { throw new RuntimeException(); }
  private  org.apache.spark.mllib.optimization.SimpleUpdater updater ()  { throw new RuntimeException(); }
  public  org.apache.spark.mllib.optimization.GradientDescent optimizer ()  { throw new RuntimeException(); }
  /**
   * Construct a LinearRegression object with default parameters: {stepSize: 1.0,
   * numIterations: 100, miniBatchFraction: 1.0}.
   *
   * @deprecated Use ml.regression.LinearRegression or LBFGS. Since 2.0.0. 
  */
  public   LinearRegressionWithSGD ()  { throw new RuntimeException(); }
  protected  org.apache.spark.mllib.regression.LinearRegressionModel createModel (org.apache.spark.mllib.linalg.Vector weights, double intercept)  { throw new RuntimeException(); }
}
