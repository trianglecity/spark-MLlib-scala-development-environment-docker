package org.apache.spark.ml.regression;
/**
 * Model fitted by IsotonicRegression.
 * Predicts using a piecewise linear function.
 * <p>
 * For detailed rules see <code>org.apache.spark.mllib.regression.IsotonicRegressionModel.predict()</code>.
 * <p>
 * param:  oldModel A {@link org.apache.spark.mllib.regression.IsotonicRegressionModel}
 *                 model trained by {@link org.apache.spark.mllib.regression.IsotonicRegression}.
 */
public  class IsotonicRegressionModel extends org.apache.spark.ml.Model<org.apache.spark.ml.regression.IsotonicRegressionModel> implements org.apache.spark.ml.regression.IsotonicRegressionBase, org.apache.spark.ml.util.MLWritable {
  /** {@link MLWriter} instance for {@link IsotonicRegressionModel} */
  static   class IsotonicRegressionModelWriter extends org.apache.spark.ml.util.MLWriter implements org.apache.spark.internal.Logging {
    public   IsotonicRegressionModelWriter (org.apache.spark.ml.regression.IsotonicRegressionModel instance)  { throw new RuntimeException(); }
    private  class Data implements scala.Product, scala.Serializable {
      public  double[] boundaries ()  { throw new RuntimeException(); }
      public  double[] predictions ()  { throw new RuntimeException(); }
      public  boolean isotonic ()  { throw new RuntimeException(); }
      // not preceding
      public   Data (double[] boundaries, double[] predictions, boolean isotonic)  { throw new RuntimeException(); }
    }
    private  class Data extends scala.runtime.AbstractFunction3<double[], double[], java.lang.Object, org.apache.spark.ml.regression.IsotonicRegressionModel.IsotonicRegressionModelWriter.Data> implements scala.Serializable {
      public   Data ()  { throw new RuntimeException(); }
    }
    protected  void saveImpl (java.lang.String path)  { throw new RuntimeException(); }
  }
  static private  class IsotonicRegressionModelReader extends org.apache.spark.ml.util.MLReader<org.apache.spark.ml.regression.IsotonicRegressionModel> {
    public   IsotonicRegressionModelReader ()  { throw new RuntimeException(); }
    /** Checked against metadata when loading model */
    private  java.lang.String className ()  { throw new RuntimeException(); }
    public  org.apache.spark.ml.regression.IsotonicRegressionModel load (java.lang.String path)  { throw new RuntimeException(); }
  }
  static public  org.apache.spark.ml.util.MLReader<org.apache.spark.ml.regression.IsotonicRegressionModel> read ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.regression.IsotonicRegressionModel load (java.lang.String path)  { throw new RuntimeException(); }
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
  static public  org.apache.spark.ml.Estimator<M> parent ()  { throw new RuntimeException(); }
  static public  void parent_$eq (org.apache.spark.ml.Estimator<M> x$1)  { throw new RuntimeException(); }
  static public  M setParent (org.apache.spark.ml.Estimator<M> parent)  { throw new RuntimeException(); }
  static public  boolean hasParent ()  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.Param<java.lang.String> featuresCol ()  { throw new RuntimeException(); }
  static public final  java.lang.String getFeaturesCol ()  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.Param<java.lang.String> labelCol ()  { throw new RuntimeException(); }
  static public final  java.lang.String getLabelCol ()  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.Param<java.lang.String> predictionCol ()  { throw new RuntimeException(); }
  static public final  java.lang.String getPredictionCol ()  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.Param<java.lang.String> weightCol ()  { throw new RuntimeException(); }
  static public final  java.lang.String getWeightCol ()  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.BooleanParam isotonic ()  { throw new RuntimeException(); }
  static public final  boolean getIsotonic ()  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.IntParam featureIndex ()  { throw new RuntimeException(); }
  static public final  int getFeatureIndex ()  { throw new RuntimeException(); }
  static   boolean hasWeightCol ()  { throw new RuntimeException(); }
  static protected  org.apache.spark.rdd.RDD<scala.Tuple3<java.lang.Object, java.lang.Object, java.lang.Object>> extractWeightedLabeledPoints (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.types.StructType validateAndTransformSchema (org.apache.spark.sql.types.StructType schema, boolean fitting)  { throw new RuntimeException(); }
  static public  void save (java.lang.String path) throws java.io.IOException { throw new RuntimeException(); }
  public  java.lang.String uid ()  { throw new RuntimeException(); }
  private  org.apache.spark.mllib.regression.IsotonicRegressionModel oldModel ()  { throw new RuntimeException(); }
  // not preceding
     IsotonicRegressionModel (java.lang.String uid, org.apache.spark.mllib.regression.IsotonicRegressionModel oldModel)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.regression.IsotonicRegressionModel setFeaturesCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.regression.IsotonicRegressionModel setPredictionCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.regression.IsotonicRegressionModel setFeatureIndex (int value)  { throw new RuntimeException(); }
  /** Boundaries in increasing order for which predictions are known. */
  public  org.apache.spark.ml.linalg.Vector boundaries ()  { throw new RuntimeException(); }
  /**
   * Predictions associated with the boundaries at the same index, monotone because of isotonic
   * regression.
   * @return (undocumented)
   */
  public  org.apache.spark.ml.linalg.Vector predictions ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.regression.IsotonicRegressionModel copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> transform (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.util.MLWriter write ()  { throw new RuntimeException(); }
}
