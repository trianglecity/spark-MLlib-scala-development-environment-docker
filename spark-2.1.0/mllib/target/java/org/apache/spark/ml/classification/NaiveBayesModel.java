package org.apache.spark.ml.classification;
/**
 * Model produced by {@link NaiveBayes}
 * param:  pi log of class priors, whose dimension is C (number of classes)
 * param:  theta log of class conditional probabilities, whose dimension is C (number of classes)
 *              by D (number of features)
 */
public  class NaiveBayesModel extends org.apache.spark.ml.classification.ProbabilisticClassificationModel<org.apache.spark.ml.linalg.Vector, org.apache.spark.ml.classification.NaiveBayesModel> implements org.apache.spark.ml.classification.NaiveBayesParams, org.apache.spark.ml.util.MLWritable {
  /** {@link MLWriter} instance for {@link NaiveBayesModel} */
  static   class NaiveBayesModelWriter extends org.apache.spark.ml.util.MLWriter {
    public   NaiveBayesModelWriter (org.apache.spark.ml.classification.NaiveBayesModel instance)  { throw new RuntimeException(); }
    private  class Data implements scala.Product, scala.Serializable {
      public  org.apache.spark.ml.linalg.Vector pi ()  { throw new RuntimeException(); }
      public  org.apache.spark.ml.linalg.Matrix theta ()  { throw new RuntimeException(); }
      // not preceding
      public   Data (org.apache.spark.ml.linalg.Vector pi, org.apache.spark.ml.linalg.Matrix theta)  { throw new RuntimeException(); }
    }
    private  class Data extends scala.runtime.AbstractFunction2<org.apache.spark.ml.linalg.Vector, org.apache.spark.ml.linalg.Matrix, org.apache.spark.ml.classification.NaiveBayesModel.NaiveBayesModelWriter.Data> implements scala.Serializable {
      public   Data ()  { throw new RuntimeException(); }
    }
    protected  void saveImpl (java.lang.String path)  { throw new RuntimeException(); }
  }
  static private  class NaiveBayesModelReader extends org.apache.spark.ml.util.MLReader<org.apache.spark.ml.classification.NaiveBayesModel> {
    public   NaiveBayesModelReader ()  { throw new RuntimeException(); }
    /** Checked against metadata when loading model */
    private  java.lang.String className ()  { throw new RuntimeException(); }
    public  org.apache.spark.ml.classification.NaiveBayesModel load (java.lang.String path)  { throw new RuntimeException(); }
  }
  static public  org.apache.spark.ml.util.MLReader<org.apache.spark.ml.classification.NaiveBayesModel> read ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.classification.NaiveBayesModel load (java.lang.String path)  { throw new RuntimeException(); }
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
  static public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> transform (org.apache.spark.sql.Dataset<?> dataset, org.apache.spark.ml.param.ParamPair<?> firstParamPair, scala.collection.Seq<org.apache.spark.ml.param.ParamPair<?>> otherParamPairs)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> transform (org.apache.spark.sql.Dataset<?> dataset, org.apache.spark.ml.param.ParamMap paramMap)  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.Estimator<M> parent ()  { throw new RuntimeException(); }
  static public  void parent_$eq (org.apache.spark.ml.Estimator<M> x$1)  { throw new RuntimeException(); }
  static public  M setParent (org.apache.spark.ml.Estimator<M> parent)  { throw new RuntimeException(); }
  static public  boolean hasParent ()  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.Param<java.lang.String> labelCol ()  { throw new RuntimeException(); }
  static public final  java.lang.String getLabelCol ()  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.Param<java.lang.String> featuresCol ()  { throw new RuntimeException(); }
  static public final  java.lang.String getFeaturesCol ()  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.Param<java.lang.String> predictionCol ()  { throw new RuntimeException(); }
  static public final  java.lang.String getPredictionCol ()  { throw new RuntimeException(); }
  static public  M setFeaturesCol (java.lang.String value)  { throw new RuntimeException(); }
  static public  M setPredictionCol (java.lang.String value)  { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.types.DataType featuresDataType ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> transformImpl (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.Param<java.lang.String> rawPredictionCol ()  { throw new RuntimeException(); }
  static public final  java.lang.String getRawPredictionCol ()  { throw new RuntimeException(); }
  static public  M setRawPredictionCol (java.lang.String value)  { throw new RuntimeException(); }
  static protected  double predict (FeaturesType features)  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.Param<java.lang.String> probabilityCol ()  { throw new RuntimeException(); }
  static public final  java.lang.String getProbabilityCol ()  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.DoubleArrayParam thresholds ()  { throw new RuntimeException(); }
  static public  double[] getThresholds ()  { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.types.StructType validateAndTransformSchema (org.apache.spark.sql.types.StructType schema, boolean fitting, org.apache.spark.sql.types.DataType featuresDataType)  { throw new RuntimeException(); }
  static public  M setProbabilityCol (java.lang.String value)  { throw new RuntimeException(); }
  static public  M setThresholds (double[] value)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> transform (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  static protected  org.apache.spark.ml.linalg.Vector raw2probability (org.apache.spark.ml.linalg.Vector rawPrediction)  { throw new RuntimeException(); }
  static protected  double raw2prediction (org.apache.spark.ml.linalg.Vector rawPrediction)  { throw new RuntimeException(); }
  static protected  org.apache.spark.ml.linalg.Vector predictProbability (FeaturesType features)  { throw new RuntimeException(); }
  static protected  double probability2prediction (org.apache.spark.ml.linalg.Vector probability)  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.Param<java.lang.String> weightCol ()  { throw new RuntimeException(); }
  static public final  java.lang.String getWeightCol ()  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.DoubleParam smoothing ()  { throw new RuntimeException(); }
  static public final  double getSmoothing ()  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.Param<java.lang.String> modelType ()  { throw new RuntimeException(); }
  static public final  java.lang.String getModelType ()  { throw new RuntimeException(); }
  static public  void save (java.lang.String path) throws java.io.IOException { throw new RuntimeException(); }
  public  java.lang.String uid ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.linalg.Vector pi ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.linalg.Matrix theta ()  { throw new RuntimeException(); }
  // not preceding
     NaiveBayesModel (java.lang.String uid, org.apache.spark.ml.linalg.Vector pi, org.apache.spark.ml.linalg.Matrix theta)  { throw new RuntimeException(); }
  /**
   * mllib NaiveBayes is a wrapper of ml implementation currently.
   * Input labels of mllib could be {-1, +1} and mllib NaiveBayesModel exposes labels,
   * both of which are different from ml, so we should store the labels sequentially
   * to be called by mllib. This should be removed when we remove mllib NaiveBayes.
   * @return (undocumented)
   */
    double[] oldLabels ()  { throw new RuntimeException(); }
    org.apache.spark.ml.classification.NaiveBayesModel setOldLabels (double[] labels)  { throw new RuntimeException(); }
  // not preceding
  private  scala.Option<org.apache.spark.ml.linalg.Matrix> thetaMinusNegTheta ()  { throw new RuntimeException(); }
  private  scala.Option<org.apache.spark.ml.linalg.DenseVector> negThetaSum ()  { throw new RuntimeException(); }
  public  int numFeatures ()  { throw new RuntimeException(); }
  public  int numClasses ()  { throw new RuntimeException(); }
  private  org.apache.spark.ml.linalg.DenseVector multinomialCalculation (org.apache.spark.ml.linalg.Vector features)  { throw new RuntimeException(); }
  private  org.apache.spark.ml.linalg.DenseVector bernoulliCalculation (org.apache.spark.ml.linalg.Vector features)  { throw new RuntimeException(); }
  protected  org.apache.spark.ml.linalg.Vector predictRaw (org.apache.spark.ml.linalg.Vector features)  { throw new RuntimeException(); }
  protected  org.apache.spark.ml.linalg.Vector raw2probabilityInPlace (org.apache.spark.ml.linalg.Vector rawPrediction)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.classification.NaiveBayesModel copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.util.MLWriter write ()  { throw new RuntimeException(); }
}
