package org.apache.spark.ml.classification;
/**
 * Decision tree learning algorithm (http://en.wikipedia.org/wiki/Decision_tree_learning)
 * for classification.
 * It supports both binary and multiclass labels, as well as both continuous and categorical
 * features.
 */
public  class DecisionTreeClassifier extends org.apache.spark.ml.classification.ProbabilisticClassifier<org.apache.spark.ml.linalg.Vector, org.apache.spark.ml.classification.DecisionTreeClassifier, org.apache.spark.ml.classification.DecisionTreeClassificationModel> implements org.apache.spark.ml.tree.DecisionTreeClassifierParams, org.apache.spark.ml.util.DefaultParamsWritable {
  /** Accessor for supported impurities: entropy, gini */
  static public final  java.lang.String[] supportedImpurities ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.classification.DecisionTreeClassifier load (java.lang.String path)  { throw new RuntimeException(); }
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
  static public final  org.apache.spark.ml.param.Param<java.lang.String> impurity ()  { throw new RuntimeException(); }
  static public final  java.lang.String getImpurity ()  { throw new RuntimeException(); }
  static   org.apache.spark.mllib.tree.impurity.Impurity getOldImpurity ()  { throw new RuntimeException(); }
  static public  void save (java.lang.String path) throws java.io.IOException { throw new RuntimeException(); }
  static public  org.apache.spark.ml.util.MLWriter write ()  { throw new RuntimeException(); }
  public  java.lang.String uid ()  { throw new RuntimeException(); }
  // not preceding
  public   DecisionTreeClassifier (java.lang.String uid)  { throw new RuntimeException(); }
  public   DecisionTreeClassifier ()  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.classification.DecisionTreeClassifier setMaxDepth (int value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.classification.DecisionTreeClassifier setMaxBins (int value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.classification.DecisionTreeClassifier setMinInstancesPerNode (int value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.classification.DecisionTreeClassifier setMinInfoGain (double value)  { throw new RuntimeException(); }
  /** @group expertSetParam */
  public  org.apache.spark.ml.classification.DecisionTreeClassifier setMaxMemoryInMB (int value)  { throw new RuntimeException(); }
  /** @group expertSetParam */
  public  org.apache.spark.ml.classification.DecisionTreeClassifier setCacheNodeIds (boolean value)  { throw new RuntimeException(); }
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
  public  org.apache.spark.ml.classification.DecisionTreeClassifier setCheckpointInterval (int value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.classification.DecisionTreeClassifier setImpurity (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.classification.DecisionTreeClassifier setSeed (long value)  { throw new RuntimeException(); }
  protected  org.apache.spark.ml.classification.DecisionTreeClassificationModel train (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  /** (private[ml]) Train a decision tree on an RDD */
    org.apache.spark.ml.classification.DecisionTreeClassificationModel train (org.apache.spark.rdd.RDD<org.apache.spark.ml.feature.LabeledPoint> data, org.apache.spark.mllib.tree.configuration.Strategy oldStrategy)  { throw new RuntimeException(); }
  /** (private[ml]) Create a Strategy instance to use with the old API. */
    org.apache.spark.mllib.tree.configuration.Strategy getOldStrategy (scala.collection.immutable.Map<java.lang.Object, java.lang.Object> categoricalFeatures, int numClasses)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.classification.DecisionTreeClassifier copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
}
