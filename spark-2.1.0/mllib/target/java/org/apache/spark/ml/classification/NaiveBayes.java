package org.apache.spark.ml.classification;
/**
 * Naive Bayes Classifiers.
 * It supports Multinomial NB
 * (see <a href="http://nlp.stanford.edu/IR-book/html/htmledition/naive-bayes-text-classification-1.html">
 * here</a>)
 * which can handle finitely supported discrete data. For example, by converting documents into
 * TF-IDF vectors, it can be used for document classification. By making every vector a
 * binary (0/1) data, it can also be used as Bernoulli NB
 * (see <a href="http://nlp.stanford.edu/IR-book/html/htmledition/the-bernoulli-model-1.html">
 * here</a>).
 * The input feature values must be nonnegative.
 */
public  class NaiveBayes extends org.apache.spark.ml.classification.ProbabilisticClassifier<org.apache.spark.ml.linalg.Vector, org.apache.spark.ml.classification.NaiveBayes, org.apache.spark.ml.classification.NaiveBayesModel> implements org.apache.spark.ml.classification.NaiveBayesParams, org.apache.spark.ml.util.DefaultParamsWritable {
  /** String name for multinomial model type. */
  static   java.lang.String Multinomial ()  { throw new RuntimeException(); }
  /** String name for Bernoulli model type. */
  static   java.lang.String Bernoulli ()  { throw new RuntimeException(); }
  static   scala.collection.immutable.Set<java.lang.String> supportedModelTypes ()  { throw new RuntimeException(); }
  static   void requireNonnegativeValues (org.apache.spark.ml.linalg.Vector v)  { throw new RuntimeException(); }
  static   void requireZeroOneBernoulliValues (org.apache.spark.ml.linalg.Vector v)  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.classification.NaiveBayes load (java.lang.String path)  { throw new RuntimeException(); }
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.param.Param<?>[] params ()  { throw new RuntimeException(); }
  static public  java.lang.String explainParam (org.apache.spark.ml.param.Param<?> param)  { throw new RuntimeException(); }
  static public  java.lang.String explainParams ()  { throw new RuntimeException(); }
  static public final  boolean isSet (org.apache.spark.ml.param.Param<?> param)  { throw new RuntimeException(); }
  static public final  boolean isDefined (org.apache.spark.ml.param.Param<?> param)  { throw new RuntimeException(); }
  static public  boolean hasParam (java.lang.String paramName)  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.param.Param<java.lang.Object> getParam (java.lang.String paramName)  { throw new RuntimeException(); }
  static public final <T extends java.lang.Object> org.apache.spark.ml.param.Params set (org.apache.spark.ml.param.Param<T> param, T value)  { throw new RuntimeException(); }
  static protected final  org.apache.spark.ml.param.Params set (java.lang.String param, Object value)  { throw new RuntimeException(); }
  static protected final  org.apache.spark.ml.param.Params set (org.apache.spark.ml.param.ParamPair<?> paramPair)  { throw new RuntimeException(); }
  static public final <T extends java.lang.Object> scala.Option<T> get (org.apache.spark.ml.param.Param<T> param)  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.Params clear (org.apache.spark.ml.param.Param<?> param)  { throw new RuntimeException(); }
  static public final <T extends java.lang.Object> T getOrDefault (org.apache.spark.ml.param.Param<T> param)  { throw new RuntimeException(); }
  static protected final <T extends java.lang.Object> T $ (org.apache.spark.ml.param.Param<T> param)  { throw new RuntimeException(); }
  static protected final <T extends java.lang.Object> org.apache.spark.ml.param.Params setDefault (org.apache.spark.ml.param.Param<T> param, T value)  { throw new RuntimeException(); }
  static protected final  org.apache.spark.ml.param.Params setDefault (scala.collection.Seq<org.apache.spark.ml.param.ParamPair<?>> paramPairs)  { throw new RuntimeException(); }
  static public final <T extends java.lang.Object> scala.Option<T> getDefault (org.apache.spark.ml.param.Param<T> param)  { throw new RuntimeException(); }
  static public final <T extends java.lang.Object> boolean hasDefault (org.apache.spark.ml.param.Param<T> param)  { throw new RuntimeException(); }
  static protected final <T extends org.apache.spark.ml.param.Params> T defaultCopy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.ParamMap extractParamMap (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.ParamMap extractParamMap ()  { throw new RuntimeException(); }
  static protected <T extends org.apache.spark.ml.param.Params> T copyValues (T to, org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
  static protected <T extends org.apache.spark.ml.param.Params> org.apache.spark.ml.param.ParamMap copyValues$default$2 ()  { throw new RuntimeException(); }
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
  static protected  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema, boolean logging)  { throw new RuntimeException(); }
  static public  M fit (org.apache.spark.sql.Dataset<?> dataset, org.apache.spark.ml.param.ParamPair<?> firstParamPair, scala.collection.Seq<org.apache.spark.ml.param.ParamPair<?>> otherParamPairs)  { throw new RuntimeException(); }
  static public  M fit (org.apache.spark.sql.Dataset<?> dataset, org.apache.spark.ml.param.ParamMap paramMap)  { throw new RuntimeException(); }
  static public  scala.collection.Seq<M> fit (org.apache.spark.sql.Dataset<?> dataset, org.apache.spark.ml.param.ParamMap[] paramMaps)  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.Param<java.lang.String> labelCol ()  { throw new RuntimeException(); }
  static public final  java.lang.String getLabelCol ()  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.Param<java.lang.String> featuresCol ()  { throw new RuntimeException(); }
  static public final  java.lang.String getFeaturesCol ()  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.Param<java.lang.String> predictionCol ()  { throw new RuntimeException(); }
  static public final  java.lang.String getPredictionCol ()  { throw new RuntimeException(); }
  static public  Learner setLabelCol (java.lang.String value)  { throw new RuntimeException(); }
  static public  Learner setFeaturesCol (java.lang.String value)  { throw new RuntimeException(); }
  static public  Learner setPredictionCol (java.lang.String value)  { throw new RuntimeException(); }
  static public  M fit (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  static   org.apache.spark.sql.types.DataType featuresDataType ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  static protected  org.apache.spark.rdd.RDD<org.apache.spark.ml.feature.LabeledPoint> extractLabeledPoints (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.Param<java.lang.String> rawPredictionCol ()  { throw new RuntimeException(); }
  static public final  java.lang.String getRawPredictionCol ()  { throw new RuntimeException(); }
  static public  E setRawPredictionCol (java.lang.String value)  { throw new RuntimeException(); }
  static protected  org.apache.spark.rdd.RDD<org.apache.spark.ml.feature.LabeledPoint> extractLabeledPoints (org.apache.spark.sql.Dataset<?> dataset, int numClasses)  { throw new RuntimeException(); }
  static protected  int getNumClasses (org.apache.spark.sql.Dataset<?> dataset, int maxNumClasses)  { throw new RuntimeException(); }
  static protected  int getNumClasses$default$2 ()  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.Param<java.lang.String> probabilityCol ()  { throw new RuntimeException(); }
  static public final  java.lang.String getProbabilityCol ()  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.DoubleArrayParam thresholds ()  { throw new RuntimeException(); }
  static public  double[] getThresholds ()  { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.types.StructType validateAndTransformSchema (org.apache.spark.sql.types.StructType schema, boolean fitting, org.apache.spark.sql.types.DataType featuresDataType)  { throw new RuntimeException(); }
  static public  E setProbabilityCol (java.lang.String value)  { throw new RuntimeException(); }
  static public  E setThresholds (double[] value)  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.Param<java.lang.String> weightCol ()  { throw new RuntimeException(); }
  static public final  java.lang.String getWeightCol ()  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.DoubleParam smoothing ()  { throw new RuntimeException(); }
  static public final  double getSmoothing ()  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.Param<java.lang.String> modelType ()  { throw new RuntimeException(); }
  static public final  java.lang.String getModelType ()  { throw new RuntimeException(); }
  static public  void save (java.lang.String path) throws java.io.IOException { throw new RuntimeException(); }
  static public  org.apache.spark.ml.util.MLWriter write ()  { throw new RuntimeException(); }
  public  java.lang.String uid ()  { throw new RuntimeException(); }
  // not preceding
  public   NaiveBayes (java.lang.String uid)  { throw new RuntimeException(); }
  public   NaiveBayes ()  { throw new RuntimeException(); }
  /**
   * Set the smoothing parameter.
   * Default is 1.0.
   * @group setParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.classification.NaiveBayes setSmoothing (double value)  { throw new RuntimeException(); }
  /**
   * Set the model type using a string (case-sensitive).
   * Supported options: "multinomial" and "bernoulli".
   * Default is "multinomial"
   * @group setParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.classification.NaiveBayes setModelType (java.lang.String value)  { throw new RuntimeException(); }
  /**
   * Sets the value of param {@link weightCol}.
   * If this is not set or empty, we treat all instance weights as 1.0.
   * Default is not set, so all instances have weight one.
   * <p>
   * @group setParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.classification.NaiveBayes setWeightCol (java.lang.String value)  { throw new RuntimeException(); }
  protected  org.apache.spark.ml.classification.NaiveBayesModel train (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  /**
   * ml assumes input labels in range [0, numClasses). But this implementation
   * is also called by mllib NaiveBayes which allows other kinds of input labels
   * such as {-1, +1}. <code>positiveLabel</code> is used to determine whether the label
   * should be checked and it should be removed when we remove mllib NaiveBayes.
   * @param dataset (undocumented)
   * @param positiveLabel (undocumented)
   * @return (undocumented)
   */
    org.apache.spark.ml.classification.NaiveBayesModel trainWithLabelCheck (org.apache.spark.sql.Dataset<?> dataset, boolean positiveLabel)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.classification.NaiveBayes copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
}
