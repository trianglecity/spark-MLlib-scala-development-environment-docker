package org.apache.spark.mllib.classification;
/**
 * Trains a Naive Bayes model given an RDD of <code>(label, features)</code> pairs.
 * <p>
 * This is the Multinomial NB (see <a href="http://tinyurl.com/lsdw6p">here</a>) which can
 * handle all kinds of discrete data. For example, by converting documents into TF-IDF
 * vectors, it can be used for document classification. By making every vector a 0-1 vector,
 * it can also be used as Bernoulli NB (see <a href="http://tinyurl.com/p7c96j6">here</a>).
 * The input feature values must be nonnegative.
 */
public  class NaiveBayes implements scala.Serializable, org.apache.spark.internal.Logging {
  /** String name for multinomial model type. */
  static   java.lang.String Multinomial ()  { throw new RuntimeException(); }
  /** String name for Bernoulli model type. */
  static   java.lang.String Bernoulli ()  { throw new RuntimeException(); }
  static   scala.collection.immutable.Set<java.lang.String> supportedModelTypes ()  { throw new RuntimeException(); }
  /**
   * Trains a Naive Bayes model given an RDD of <code>(label, features)</code> pairs.
   * <p>
   * This is the default Multinomial NB (see <a href="http://tinyurl.com/lsdw6p">here</a>)
   * which can handle all kinds of discrete data. For example, by converting documents into
   * TF-IDF vectors, it can be used for document classification.
   * <p>
   * This version of the method uses a default smoothing parameter of 1.0.
   * <p>
   * @param input RDD of <code>(label, array of features)</code> pairs.  Every vector should be a frequency
   *              vector or a count vector.
   * @return (undocumented)
   */
  static public  org.apache.spark.mllib.classification.NaiveBayesModel train (org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint> input)  { throw new RuntimeException(); }
  /**
   * Trains a Naive Bayes model given an RDD of <code>(label, features)</code> pairs.
   * <p>
   * This is the default Multinomial NB (see <a href="http://tinyurl.com/lsdw6p">here</a>)
   * which can handle all kinds of discrete data. For example, by converting documents
   * into TF-IDF vectors, it can be used for document classification.
   * <p>
   * @param input RDD of <code>(label, array of features)</code> pairs.  Every vector should be a frequency
   *              vector or a count vector.
   * @param lambda The smoothing parameter
   * @return (undocumented)
   */
  static public  org.apache.spark.mllib.classification.NaiveBayesModel train (org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint> input, double lambda)  { throw new RuntimeException(); }
  /**
   * Trains a Naive Bayes model given an RDD of <code>(label, features)</code> pairs.
   * <p>
   * The model type can be set to either Multinomial NB (see <a href="http://tinyurl.com/lsdw6p">
   * here</a>) or Bernoulli NB (see <a href="http://tinyurl.com/p7c96j6">here</a>).
   * The Multinomial NB can handle discrete count data and can be called by setting the model
   * type to "multinomial".
   * For example, it can be used with word counts or TF_IDF vectors of documents.
   * The Bernoulli model fits presence or absence (0-1) counts. By making every vector a
   * 0-1 vector and setting the model type to "bernoulli", the  fits and predicts as
   * Bernoulli NB.
   * <p>
   * @param input RDD of <code>(label, array of features)</code> pairs.  Every vector should be a frequency
   *              vector or a count vector.
   * @param lambda The smoothing parameter
   * <p>
   * @param modelType The type of NB model to fit from the enumeration NaiveBayesModels, can be
   *              multinomial or bernoulli
   * @return (undocumented)
   */
  static public  org.apache.spark.mllib.classification.NaiveBayesModel train (org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint> input, double lambda, java.lang.String modelType)  { throw new RuntimeException(); }
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
  private  double lambda ()  { throw new RuntimeException(); }
  private  java.lang.String modelType ()  { throw new RuntimeException(); }
  // not preceding
  private   NaiveBayes (double lambda, java.lang.String modelType)  { throw new RuntimeException(); }
  public   NaiveBayes (double lambda)  { throw new RuntimeException(); }
  public   NaiveBayes ()  { throw new RuntimeException(); }
  /** Set the smoothing parameter. Default: 1.0. */
  public  org.apache.spark.mllib.classification.NaiveBayes setLambda (double lambda)  { throw new RuntimeException(); }
  /** Get the smoothing parameter. */
  public  double getLambda ()  { throw new RuntimeException(); }
  /**
   * Set the model type using a string (case-sensitive).
   * Supported options: "multinomial" (default) and "bernoulli".
   * @param modelType (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.classification.NaiveBayes setModelType (java.lang.String modelType)  { throw new RuntimeException(); }
  /** Get the model type. */
  public  java.lang.String getModelType ()  { throw new RuntimeException(); }
  /**
   * Run the algorithm with the configured parameters on an input RDD of LabeledPoint entries.
   * <p>
   * @param data RDD of {@link org.apache.spark.mllib.regression.LabeledPoint}.
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.classification.NaiveBayesModel run (org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint> data)  { throw new RuntimeException(); }
}
