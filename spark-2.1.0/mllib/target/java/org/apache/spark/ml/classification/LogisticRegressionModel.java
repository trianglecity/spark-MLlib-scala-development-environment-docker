package org.apache.spark.ml.classification;
/**
 * Model produced by {@link LogisticRegression}.
 */
public  class LogisticRegressionModel extends org.apache.spark.ml.classification.ProbabilisticClassificationModel<org.apache.spark.ml.linalg.Vector, org.apache.spark.ml.classification.LogisticRegressionModel> implements org.apache.spark.ml.classification.LogisticRegressionParams, org.apache.spark.ml.util.MLWritable {
  /** {@link MLWriter} instance for {@link LogisticRegressionModel} */
  static   class LogisticRegressionModelWriter extends org.apache.spark.ml.util.MLWriter implements org.apache.spark.internal.Logging {
    public   LogisticRegressionModelWriter (org.apache.spark.ml.classification.LogisticRegressionModel instance)  { throw new RuntimeException(); }
    private  class Data implements scala.Product, scala.Serializable {
      public  int numClasses ()  { throw new RuntimeException(); }
      public  int numFeatures ()  { throw new RuntimeException(); }
      public  org.apache.spark.ml.linalg.Vector interceptVector ()  { throw new RuntimeException(); }
      public  org.apache.spark.ml.linalg.Matrix coefficientMatrix ()  { throw new RuntimeException(); }
      public  boolean isMultinomial ()  { throw new RuntimeException(); }
      // not preceding
      public   Data (int numClasses, int numFeatures, org.apache.spark.ml.linalg.Vector interceptVector, org.apache.spark.ml.linalg.Matrix coefficientMatrix, boolean isMultinomial)  { throw new RuntimeException(); }
    }
    private  class Data extends scala.runtime.AbstractFunction5<java.lang.Object, java.lang.Object, org.apache.spark.ml.linalg.Vector, org.apache.spark.ml.linalg.Matrix, java.lang.Object, org.apache.spark.ml.classification.LogisticRegressionModel.LogisticRegressionModelWriter.Data> implements scala.Serializable {
      public   Data ()  { throw new RuntimeException(); }
    }
    protected  void saveImpl (java.lang.String path)  { throw new RuntimeException(); }
  }
  static private  class LogisticRegressionModelReader extends org.apache.spark.ml.util.MLReader<org.apache.spark.ml.classification.LogisticRegressionModel> {
    public   LogisticRegressionModelReader ()  { throw new RuntimeException(); }
    /** Checked against metadata when loading model */
    private  java.lang.String className ()  { throw new RuntimeException(); }
    public  org.apache.spark.ml.classification.LogisticRegressionModel load (java.lang.String path)  { throw new RuntimeException(); }
  }
  static public  org.apache.spark.ml.util.MLReader<org.apache.spark.ml.classification.LogisticRegressionModel> read ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.classification.LogisticRegressionModel load (java.lang.String path)  { throw new RuntimeException(); }
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
  static public final  org.apache.spark.ml.param.Param<java.lang.String> probabilityCol ()  { throw new RuntimeException(); }
  static public final  java.lang.String getProbabilityCol ()  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.DoubleArrayParam thresholds ()  { throw new RuntimeException(); }
  static public  M setProbabilityCol (java.lang.String value)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> transform (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  static protected  org.apache.spark.ml.linalg.Vector raw2probability (org.apache.spark.ml.linalg.Vector rawPrediction)  { throw new RuntimeException(); }
  static protected  org.apache.spark.ml.linalg.Vector predictProbability (FeaturesType features)  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.DoubleParam regParam ()  { throw new RuntimeException(); }
  static public final  double getRegParam ()  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.DoubleParam elasticNetParam ()  { throw new RuntimeException(); }
  static public final  double getElasticNetParam ()  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.IntParam maxIter ()  { throw new RuntimeException(); }
  static public final  int getMaxIter ()  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.BooleanParam fitIntercept ()  { throw new RuntimeException(); }
  static public final  boolean getFitIntercept ()  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.DoubleParam tol ()  { throw new RuntimeException(); }
  static public final  double getTol ()  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.BooleanParam standardization ()  { throw new RuntimeException(); }
  static public final  boolean getStandardization ()  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.Param<java.lang.String> weightCol ()  { throw new RuntimeException(); }
  static public final  java.lang.String getWeightCol ()  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.DoubleParam threshold ()  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.IntParam aggregationDepth ()  { throw new RuntimeException(); }
  static public final  int getAggregationDepth ()  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.Param<java.lang.String> family ()  { throw new RuntimeException(); }
  static public  java.lang.String getFamily ()  { throw new RuntimeException(); }
  static protected  void checkThresholdConsistency ()  { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.types.StructType validateAndTransformSchema (org.apache.spark.sql.types.StructType schema, boolean fitting, org.apache.spark.sql.types.DataType featuresDataType)  { throw new RuntimeException(); }
  static public  void save (java.lang.String path) throws java.io.IOException { throw new RuntimeException(); }
  public  java.lang.String uid ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.linalg.Matrix coefficientMatrix ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.linalg.Vector interceptVector ()  { throw new RuntimeException(); }
  public  int numClasses ()  { throw new RuntimeException(); }
  private  boolean isMultinomial ()  { throw new RuntimeException(); }
  // not preceding
     LogisticRegressionModel (java.lang.String uid, org.apache.spark.ml.linalg.Matrix coefficientMatrix, org.apache.spark.ml.linalg.Vector interceptVector, int numClasses, boolean isMultinomial)  { throw new RuntimeException(); }
     LogisticRegressionModel (java.lang.String uid, org.apache.spark.ml.linalg.Vector coefficients, double intercept)  { throw new RuntimeException(); }
  /**
   * A vector of model coefficients for "binomial" logistic regression. If this model was trained
   * using the "multinomial" family then an exception is thrown.
   * <p>
   * @return Vector
   */
  public  org.apache.spark.ml.linalg.Vector coefficients ()  { throw new RuntimeException(); }
  private  org.apache.spark.ml.linalg.Vector _coefficients ()  { throw new RuntimeException(); }
  /**
   * The model intercept for "binomial" logistic regression. If this model was fit with the
   * "multinomial" family then an exception is thrown.
   * <p>
   * @return Double
   */
  public  double intercept ()  { throw new RuntimeException(); }
  private  double _intercept ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.classification.LogisticRegressionModel setThreshold (double value)  { throw new RuntimeException(); }
  public  double getThreshold ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.classification.LogisticRegressionModel setThresholds (double[] value)  { throw new RuntimeException(); }
  public  double[] getThresholds ()  { throw new RuntimeException(); }
  /** Margin (rawPrediction) for class label 1.  For binary classification only. */
  private  scala.Function1<org.apache.spark.ml.linalg.Vector, java.lang.Object> margin ()  { throw new RuntimeException(); }
  /** Margin (rawPrediction) for each class label. */
  private  scala.Function1<org.apache.spark.ml.linalg.Vector, org.apache.spark.ml.linalg.Vector> margins ()  { throw new RuntimeException(); }
  /** Score (probability) for class label 1.  For binary classification only. */
  private  scala.Function1<org.apache.spark.ml.linalg.Vector, java.lang.Object> score ()  { throw new RuntimeException(); }
  public  int numFeatures ()  { throw new RuntimeException(); }
  private  scala.Option<org.apache.spark.ml.classification.LogisticRegressionTrainingSummary> trainingSummary ()  { throw new RuntimeException(); }
  /**
   * Gets summary of model on training set. An exception is
   * thrown if <code>trainingSummary == None</code>.
   * @return (undocumented)
   */
  public  org.apache.spark.ml.classification.LogisticRegressionTrainingSummary summary ()  { throw new RuntimeException(); }
  /**
   * If the probability column is set returns the current model and probability column,
   * otherwise generates a new column and sets it as the probability column on a new copy
   * of the current model.
   * @return (undocumented)
   */
    scala.Tuple2<org.apache.spark.ml.classification.LogisticRegressionModel, java.lang.String> findSummaryModelAndProbabilityCol ()  { throw new RuntimeException(); }
    org.apache.spark.ml.classification.LogisticRegressionModel setSummary (scala.Option<org.apache.spark.ml.classification.LogisticRegressionTrainingSummary> summary)  { throw new RuntimeException(); }
  /** Indicates whether a training summary exists for this model instance. */
  public  boolean hasSummary ()  { throw new RuntimeException(); }
  /**
   * Evaluates the model on a test dataset.
   * <p>
   * @param dataset Test dataset to evaluate model on.
   * @return (undocumented)
   */
  public  org.apache.spark.ml.classification.LogisticRegressionSummary evaluate (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  /**
   * Predict label for the given feature vector.
   * The behavior of this can be adjusted using <code>thresholds</code>.
   * @param features (undocumented)
   * @return (undocumented)
   */
  protected  double predict (org.apache.spark.ml.linalg.Vector features)  { throw new RuntimeException(); }
  protected  org.apache.spark.ml.linalg.Vector raw2probabilityInPlace (org.apache.spark.ml.linalg.Vector rawPrediction)  { throw new RuntimeException(); }
  protected  org.apache.spark.ml.linalg.Vector predictRaw (org.apache.spark.ml.linalg.Vector features)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.classification.LogisticRegressionModel copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
  protected  double raw2prediction (org.apache.spark.ml.linalg.Vector rawPrediction)  { throw new RuntimeException(); }
  protected  double probability2prediction (org.apache.spark.ml.linalg.Vector probability)  { throw new RuntimeException(); }
  /**
   * Returns a {@link org.apache.spark.ml.util.MLWriter} instance for this ML instance.
   * <p>
   * For {@link LogisticRegressionModel}, this does NOT currently save the training {@link summary}.
   * An option to save {@link summary} may be added in the future.
   * <p>
   * This also does not save the {@link parent} currently.
   * @return (undocumented)
   */
  public  org.apache.spark.ml.util.MLWriter write ()  { throw new RuntimeException(); }
}
