package org.apache.spark.ml.regression;
/**
 * <a href="http://en.wikipedia.org/wiki/Gradient_boosting">Gradient-Boosted Trees (GBTs)</a>
 * learning algorithm for regression.
 * It supports both continuous and categorical features.
 * <p>
 * The implementation is based upon: J.H. Friedman. "Stochastic Gradient Boosting." 1999.
 * <p>
 * Notes on Gradient Boosting vs. TreeBoost:
 *  - This implementation is for Stochastic Gradient Boosting, not for TreeBoost.
 *  - Both algorithms learn tree ensembles by minimizing loss functions.
 *  - TreeBoost (Friedman, 1999) additionally modifies the outputs at tree leaf nodes
 *    based on the loss function, whereas the original gradient boosting method does not.
 *     - When the loss is SquaredError, these methods give the same result, but they could differ
 *       for other loss functions.
 *  - We expect to implement TreeBoost in the future:
 *    [https://issues.apache.org/jira/browse/SPARK-4240]
 */
public  class GBTRegressor extends org.apache.spark.ml.Predictor<org.apache.spark.ml.linalg.Vector, org.apache.spark.ml.regression.GBTRegressor, org.apache.spark.ml.regression.GBTRegressionModel> implements org.apache.spark.ml.tree.GBTRegressorParams, org.apache.spark.ml.util.DefaultParamsWritable, org.apache.spark.internal.Logging {
  /** Accessor for supported loss settings: squared (L2), absolute (L1) */
  static public final  java.lang.String[] supportedLossTypes ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.regression.GBTRegressor load (java.lang.String path)  { throw new RuntimeException(); }
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
  static public final  org.apache.spark.ml.param.IntParam maxIter ()  { throw new RuntimeException(); }
  static public final  int getMaxIter ()  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.DoubleParam stepSize ()  { throw new RuntimeException(); }
  static public final  double getStepSize ()  { throw new RuntimeException(); }
  static   org.apache.spark.mllib.tree.configuration.BoostingStrategy getOldBoostingStrategy (scala.collection.immutable.Map<java.lang.Object, java.lang.Object> categoricalFeatures, scala.Enumeration.Value oldAlgo)  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.Param<java.lang.String> impurity ()  { throw new RuntimeException(); }
  static public final  java.lang.String getImpurity ()  { throw new RuntimeException(); }
  static   org.apache.spark.mllib.tree.impurity.Impurity getOldImpurity ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.param.Param<java.lang.String> lossType ()  { throw new RuntimeException(); }
  static public  java.lang.String getLossType ()  { throw new RuntimeException(); }
  static   org.apache.spark.mllib.tree.loss.Loss getOldLossType ()  { throw new RuntimeException(); }
  static public  void save (java.lang.String path) throws java.io.IOException { throw new RuntimeException(); }
  static public  org.apache.spark.ml.util.MLWriter write ()  { throw new RuntimeException(); }
  public  java.lang.String uid ()  { throw new RuntimeException(); }
  // not preceding
  public   GBTRegressor (java.lang.String uid)  { throw new RuntimeException(); }
  public   GBTRegressor ()  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.regression.GBTRegressor setMaxDepth (int value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.regression.GBTRegressor setMaxBins (int value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.regression.GBTRegressor setMinInstancesPerNode (int value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.regression.GBTRegressor setMinInfoGain (double value)  { throw new RuntimeException(); }
  /** @group expertSetParam */
  public  org.apache.spark.ml.regression.GBTRegressor setMaxMemoryInMB (int value)  { throw new RuntimeException(); }
  /** @group expertSetParam */
  public  org.apache.spark.ml.regression.GBTRegressor setCacheNodeIds (boolean value)  { throw new RuntimeException(); }
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
  public  org.apache.spark.ml.regression.GBTRegressor setCheckpointInterval (int value)  { throw new RuntimeException(); }
  /**
   * The impurity setting is ignored for GBT models.
   * Individual trees are built using impurity "Variance."
   * <p>
   * @group setParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.regression.GBTRegressor setImpurity (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.regression.GBTRegressor setSubsamplingRate (double value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.regression.GBTRegressor setSeed (long value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.regression.GBTRegressor setMaxIter (int value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.regression.GBTRegressor setStepSize (double value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.regression.GBTRegressor setLossType (java.lang.String value)  { throw new RuntimeException(); }
  protected  org.apache.spark.ml.regression.GBTRegressionModel train (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.regression.GBTRegressor copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
}
