package org.apache.spark.ml.regression;
/**
 * <a href="http://en.wikipedia.org/wiki/Random_forest">Random Forest</a>
 * learning algorithm for regression.
 * It supports both continuous and categorical features.
 */
public  class RandomForestRegressor extends org.apache.spark.ml.Predictor<org.apache.spark.ml.linalg.Vector, org.apache.spark.ml.regression.RandomForestRegressor, org.apache.spark.ml.regression.RandomForestRegressionModel> implements org.apache.spark.ml.tree.RandomForestRegressorParams, org.apache.spark.ml.util.DefaultParamsWritable {
  /** Accessor for supported impurity settings: variance */
  static public final  java.lang.String[] supportedImpurities ()  { throw new RuntimeException(); }
  /** Accessor for supported featureSubsetStrategy settings: auto, all, onethird, sqrt, log2 */
  static public final  java.lang.String[] supportedFeatureSubsetStrategies ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.regression.RandomForestRegressor load (java.lang.String path)  { throw new RuntimeException(); }
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
  static public  M fit (org.apache.spark.sql.Dataset<?> dataset, org.apache.spark.ml.param.ParamPair<?> firstParamPair, org.apache.spark.ml.param.ParamPair<?>... otherParamPairs)  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.Param<java.lang.String> labelCol ()  { throw new RuntimeException(); }
  static public final  java.lang.String getLabelCol ()  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.Param<java.lang.String> featuresCol ()  { throw new RuntimeException(); }
  static public final  java.lang.String getFeaturesCol ()  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.Param<java.lang.String> predictionCol ()  { throw new RuntimeException(); }
  static public final  java.lang.String getPredictionCol ()  { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.types.StructType validateAndTransformSchema (org.apache.spark.sql.types.StructType schema, boolean fitting, org.apache.spark.sql.types.DataType featuresDataType)  { throw new RuntimeException(); }
  static public  Learner setLabelCol (java.lang.String value)  { throw new RuntimeException(); }
  static public  Learner setFeaturesCol (java.lang.String value)  { throw new RuntimeException(); }
  static public  Learner setPredictionCol (java.lang.String value)  { throw new RuntimeException(); }
  static public  M fit (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  static   org.apache.spark.sql.types.DataType featuresDataType ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  static protected  org.apache.spark.rdd.RDD<org.apache.spark.ml.feature.LabeledPoint> extractLabeledPoints (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.IntParam checkpointInterval ()  { throw new RuntimeException(); }
  static public final  int getCheckpointInterval ()  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.LongParam seed ()  { throw new RuntimeException(); }
  static public final  long getSeed ()  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.IntParam maxDepth ()  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.IntParam maxBins ()  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.IntParam minInstancesPerNode ()  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.DoubleParam minInfoGain ()  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.IntParam maxMemoryInMB ()  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.BooleanParam cacheNodeIds ()  { throw new RuntimeException(); }
  static public final  int getMaxDepth ()  { throw new RuntimeException(); }
  static public final  int getMaxBins ()  { throw new RuntimeException(); }
  static public final  int getMinInstancesPerNode ()  { throw new RuntimeException(); }
  static public final  double getMinInfoGain ()  { throw new RuntimeException(); }
  static public final  int getMaxMemoryInMB ()  { throw new RuntimeException(); }
  static public final  boolean getCacheNodeIds ()  { throw new RuntimeException(); }
  static   org.apache.spark.mllib.tree.configuration.Strategy getOldStrategy (scala.collection.immutable.Map<java.lang.Object, java.lang.Object> categoricalFeatures, int numClasses, scala.Enumeration.Value oldAlgo, org.apache.spark.mllib.tree.impurity.Impurity oldImpurity, double subsamplingRate)  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.DoubleParam subsamplingRate ()  { throw new RuntimeException(); }
  static public final  double getSubsamplingRate ()  { throw new RuntimeException(); }
  static   org.apache.spark.mllib.tree.configuration.Strategy getOldStrategy (scala.collection.immutable.Map<java.lang.Object, java.lang.Object> categoricalFeatures, int numClasses, scala.Enumeration.Value oldAlgo, org.apache.spark.mllib.tree.impurity.Impurity oldImpurity)  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.IntParam numTrees ()  { throw new RuntimeException(); }
  static public final  int getNumTrees ()  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.Param<java.lang.String> featureSubsetStrategy ()  { throw new RuntimeException(); }
  static public final  java.lang.String getFeatureSubsetStrategy ()  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.Param<java.lang.String> impurity ()  { throw new RuntimeException(); }
  static public final  java.lang.String getImpurity ()  { throw new RuntimeException(); }
  static   org.apache.spark.mllib.tree.impurity.Impurity getOldImpurity ()  { throw new RuntimeException(); }
  static public  void save (java.lang.String path) throws java.io.IOException { throw new RuntimeException(); }
  static public  org.apache.spark.ml.util.MLWriter write ()  { throw new RuntimeException(); }
  public  java.lang.String uid ()  { throw new RuntimeException(); }
  // not preceding
  public   RandomForestRegressor (java.lang.String uid)  { throw new RuntimeException(); }
  public   RandomForestRegressor ()  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.regression.RandomForestRegressor setMaxDepth (int value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.regression.RandomForestRegressor setMaxBins (int value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.regression.RandomForestRegressor setMinInstancesPerNode (int value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.regression.RandomForestRegressor setMinInfoGain (double value)  { throw new RuntimeException(); }
  /** @group expertSetParam */
  public  org.apache.spark.ml.regression.RandomForestRegressor setMaxMemoryInMB (int value)  { throw new RuntimeException(); }
  /** @group expertSetParam */
  public  org.apache.spark.ml.regression.RandomForestRegressor setCacheNodeIds (boolean value)  { throw new RuntimeException(); }
  /**
   * Specifies how often to checkpoint the cached node IDs.
   * E.g. 10 means that the cache will get checkpointed every 10 iterations.
   * This is only used if cacheNodeIds is true and if the checkpoint directory is set in
   * {@link org.apache.spark.SparkContext}.
   * Must be at least 1.
   * (default = 10)
   * @group setParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.regression.RandomForestRegressor setCheckpointInterval (int value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.regression.RandomForestRegressor setImpurity (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.regression.RandomForestRegressor setSubsamplingRate (double value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.regression.RandomForestRegressor setSeed (long value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.regression.RandomForestRegressor setNumTrees (int value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.regression.RandomForestRegressor setFeatureSubsetStrategy (java.lang.String value)  { throw new RuntimeException(); }
  protected  org.apache.spark.ml.regression.RandomForestRegressionModel train (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.regression.RandomForestRegressor copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
}
