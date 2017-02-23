package org.apache.spark.ml.regression;
/**
 * :: Experimental ::
 * Model produced by {@link AFTSurvivalRegression}.
 */
public  class AFTSurvivalRegressionModel extends org.apache.spark.ml.Model<org.apache.spark.ml.regression.AFTSurvivalRegressionModel> implements org.apache.spark.ml.regression.AFTSurvivalRegressionParams, org.apache.spark.ml.util.MLWritable {
  /** {@link MLWriter} instance for {@link AFTSurvivalRegressionModel} */
  static   class AFTSurvivalRegressionModelWriter extends org.apache.spark.ml.util.MLWriter implements org.apache.spark.internal.Logging {
    public   AFTSurvivalRegressionModelWriter (org.apache.spark.ml.regression.AFTSurvivalRegressionModel instance)  { throw new RuntimeException(); }
    private  class Data implements scala.Product, scala.Serializable {
      public  org.apache.spark.ml.linalg.Vector coefficients ()  { throw new RuntimeException(); }
      public  double intercept ()  { throw new RuntimeException(); }
      public  double scale ()  { throw new RuntimeException(); }
      // not preceding
      public   Data (org.apache.spark.ml.linalg.Vector coefficients, double intercept, double scale)  { throw new RuntimeException(); }
    }
    private  class Data extends scala.runtime.AbstractFunction3<org.apache.spark.ml.linalg.Vector, java.lang.Object, java.lang.Object, org.apache.spark.ml.regression.AFTSurvivalRegressionModel.AFTSurvivalRegressionModelWriter.Data> implements scala.Serializable {
      public   Data ()  { throw new RuntimeException(); }
    }
    protected  void saveImpl (java.lang.String path)  { throw new RuntimeException(); }
  }
  static private  class AFTSurvivalRegressionModelReader extends org.apache.spark.ml.util.MLReader<org.apache.spark.ml.regression.AFTSurvivalRegressionModel> {
    public   AFTSurvivalRegressionModelReader ()  { throw new RuntimeException(); }
    /** Checked against metadata when loading model */
    private  java.lang.String className ()  { throw new RuntimeException(); }
    public  org.apache.spark.ml.regression.AFTSurvivalRegressionModel load (java.lang.String path)  { throw new RuntimeException(); }
  }
  static public  org.apache.spark.ml.util.MLReader<org.apache.spark.ml.regression.AFTSurvivalRegressionModel> read ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.regression.AFTSurvivalRegressionModel load (java.lang.String path)  { throw new RuntimeException(); }
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
  static public final  org.apache.spark.ml.param.IntParam maxIter ()  { throw new RuntimeException(); }
  static public final  int getMaxIter ()  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.DoubleParam tol ()  { throw new RuntimeException(); }
  static public final  double getTol ()  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.BooleanParam fitIntercept ()  { throw new RuntimeException(); }
  static public final  boolean getFitIntercept ()  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.IntParam aggregationDepth ()  { throw new RuntimeException(); }
  static public final  int getAggregationDepth ()  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.Param<java.lang.String> censorCol ()  { throw new RuntimeException(); }
  static public  java.lang.String getCensorCol ()  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.DoubleArrayParam quantileProbabilities ()  { throw new RuntimeException(); }
  static public  double[] getQuantileProbabilities ()  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.Param<java.lang.String> quantilesCol ()  { throw new RuntimeException(); }
  static public  java.lang.String getQuantilesCol ()  { throw new RuntimeException(); }
  static   boolean hasQuantilesCol ()  { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.types.StructType validateAndTransformSchema (org.apache.spark.sql.types.StructType schema, boolean fitting)  { throw new RuntimeException(); }
  static public  void save (java.lang.String path) throws java.io.IOException { throw new RuntimeException(); }
  public  java.lang.String uid ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.linalg.Vector coefficients ()  { throw new RuntimeException(); }
  public  double intercept ()  { throw new RuntimeException(); }
  public  double scale ()  { throw new RuntimeException(); }
  // not preceding
     AFTSurvivalRegressionModel (java.lang.String uid, org.apache.spark.ml.linalg.Vector coefficients, double intercept, double scale)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.regression.AFTSurvivalRegressionModel setFeaturesCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.regression.AFTSurvivalRegressionModel setPredictionCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.regression.AFTSurvivalRegressionModel setQuantileProbabilities (double[] value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.regression.AFTSurvivalRegressionModel setQuantilesCol (java.lang.String value)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.linalg.Vector predictQuantiles (org.apache.spark.ml.linalg.Vector features)  { throw new RuntimeException(); }
  public  double predict (org.apache.spark.ml.linalg.Vector features)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> transform (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.regression.AFTSurvivalRegressionModel copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.util.MLWriter write ()  { throw new RuntimeException(); }
}
