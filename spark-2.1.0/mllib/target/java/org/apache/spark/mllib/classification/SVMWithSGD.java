package org.apache.spark.mllib.classification;
/**
 * Train a Support Vector Machine (SVM) using Stochastic Gradient Descent. By default L2
 * regularization is used, which can be changed via <code>SVMWithSGD.optimizer</code>.
 * <p>
 * @note Labels used in SVM should be {0, 1}.
 */
public  class SVMWithSGD extends org.apache.spark.mllib.regression.GeneralizedLinearAlgorithm<org.apache.spark.mllib.classification.SVMModel> implements scala.Serializable {
  /**
   * Train a SVM model given an RDD of (label, features) pairs. We run a fixed number
   * of iterations of gradient descent using the specified step size. Each iteration uses
   * <code>miniBatchFraction</code> fraction of the data to calculate the gradient. The weights used in
   * gradient descent are initialized using the initial weights provided.
   * <p>
   * @param input RDD of (label, array of features) pairs.
   * @param numIterations Number of iterations of gradient descent to run.
   * @param stepSize Step size to be used for each iteration of gradient descent.
   * @param regParam Regularization parameter.
   * @param miniBatchFraction Fraction of data to be used per iteration.
   * @param initialWeights Initial set of weights to be used. Array should be equal in size to
   *        the number of features in the data.
   * <p>
   * @note Labels used in SVM should be {0, 1}.
   * @return (undocumented)
   */
  static public  org.apache.spark.mllib.classification.SVMModel train (org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint> input, int numIterations, double stepSize, double regParam, double miniBatchFraction, org.apache.spark.mllib.linalg.Vector initialWeights)  { throw new RuntimeException(); }
  /**
   * Train a SVM model given an RDD of (label, features) pairs. We run a fixed number
   * of iterations of gradient descent using the specified step size. Each iteration uses
   * <code>miniBatchFraction</code> fraction of the data to calculate the gradient.
   * <p>
   * @note Labels used in SVM should be {0, 1}
   * <p>
   * @param input RDD of (label, array of features) pairs.
   * @param numIterations Number of iterations of gradient descent to run.
   * @param stepSize Step size to be used for each iteration of gradient descent.
   * @param regParam Regularization parameter.
   * @param miniBatchFraction Fraction of data to be used per iteration.
   * @return (undocumented)
   */
  static public  org.apache.spark.mllib.classification.SVMModel train (org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint> input, int numIterations, double stepSize, double regParam, double miniBatchFraction)  { throw new RuntimeException(); }
  /**
   * Train a SVM model given an RDD of (label, features) pairs. We run a fixed number
   * of iterations of gradient descent using the specified step size. We use the entire data set to
   * update the gradient in each iteration.
   * <p>
   * @param input RDD of (label, array of features) pairs.
   * @param stepSize Step size to be used for each iteration of Gradient Descent.
   * @param regParam Regularization parameter.
   * @param numIterations Number of iterations of gradient descent to run.
   * @return a SVMModel which has the weights and offset from training.
   * <p>
   * @note Labels used in SVM should be {0, 1}
   */
  static public  org.apache.spark.mllib.classification.SVMModel train (org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint> input, int numIterations, double stepSize, double regParam)  { throw new RuntimeException(); }
  /**
   * Train a SVM model given an RDD of (label, features) pairs. We run a fixed number
   * of iterations of gradient descent using a step size of 1.0. We use the entire data set to
   * update the gradient in each iteration.
   * <p>
   * @param input RDD of (label, array of features) pairs.
   * @param numIterations Number of iterations of gradient descent to run.
   * @return a SVMModel which has the weights and offset from training.
   * <p>
   * @note Labels used in SVM should be {0, 1}
   */
  static public  org.apache.spark.mllib.classification.SVMModel train (org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint> input, int numIterations)  { throw new RuntimeException(); }
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
  private   SVMWithSGD (double stepSize, int numIterations, double regParam, double miniBatchFraction)  { throw new RuntimeException(); }
  private  org.apache.spark.mllib.optimization.HingeGradient gradient ()  { throw new RuntimeException(); }
  private  org.apache.spark.mllib.optimization.SquaredL2Updater updater ()  { throw new RuntimeException(); }
  public  org.apache.spark.mllib.optimization.GradientDescent optimizer ()  { throw new RuntimeException(); }
  protected  scala.collection.immutable.List<scala.Function1<org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint>, java.lang.Object>> validators ()  { throw new RuntimeException(); }
  /**
   * Construct a SVM object with default parameters: {stepSize: 1.0, numIterations: 100,
   * regParm: 0.01, miniBatchFraction: 1.0}.
   */
  public   SVMWithSGD ()  { throw new RuntimeException(); }
  protected  org.apache.spark.mllib.classification.SVMModel createModel (org.apache.spark.mllib.linalg.Vector weights, double intercept)  { throw new RuntimeException(); }
}
