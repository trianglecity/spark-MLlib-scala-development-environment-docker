package org.apache.spark.ml.regression;
/**
 * <a href="http://en.wikipedia.org/wiki/Random_forest">Random Forest</a> model for regression.
 * It supports both continuous and categorical features.
 * <p>
 * param:  _trees  Decision trees in the ensemble.
 * param:  numFeatures  Number of features used by this model
 */
public  class RandomForestRegressionModel extends org.apache.spark.ml.PredictionModel<org.apache.spark.ml.linalg.Vector, org.apache.spark.ml.regression.RandomForestRegressionModel> implements org.apache.spark.ml.tree.RandomForestRegressorParams, org.apache.spark.ml.tree.TreeEnsembleModel<org.apache.spark.ml.regression.DecisionTreeRegressionModel>, org.apache.spark.ml.util.MLWritable, scala.Serializable {
  static   class RandomForestRegressionModelWriter extends org.apache.spark.ml.util.MLWriter {
    public   RandomForestRegressionModelWriter (org.apache.spark.ml.regression.RandomForestRegressionModel instance)  { throw new RuntimeException(); }
    protected  void saveImpl (java.lang.String path)  { throw new RuntimeException(); }
  }
  static private  class RandomForestRegressionModelReader extends org.apache.spark.ml.util.MLReader<org.apache.spark.ml.regression.RandomForestRegressionModel> {
    public   RandomForestRegressionModelReader ()  { throw new RuntimeException(); }
    /** Checked against metadata when loading model */
    private  java.lang.String className ()  { throw new RuntimeException(); }
    private  java.lang.String treeClassName ()  { throw new RuntimeException(); }
    public  org.apache.spark.ml.regression.RandomForestRegressionModel load (java.lang.String path)  { throw new RuntimeException(); }
  }
  static public  org.apache.spark.ml.util.MLReader<org.apache.spark.ml.regression.RandomForestRegressionModel> read ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.regression.RandomForestRegressionModel load (java.lang.String path)  { throw new RuntimeException(); }
  /** Convert a model from the old API */
  static   org.apache.spark.ml.regression.RandomForestRegressionModel fromOld (org.apache.spark.mllib.tree.model.RandomForestModel oldModel, org.apache.spark.ml.regression.RandomForestRegressor parent, scala.collection.immutable.Map<java.lang.Object, java.lang.Object> categoricalFeatures, int numFeatures)  { throw new RuntimeException(); }
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
  static public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> transform (org.apache.spark.sql.Dataset<?> dataset, org.apache.spark.ml.param.ParamPair<?> firstParamPair, org.apache.spark.ml.param.ParamPair<?>... otherParamPairs)  { throw new RuntimeException(); }
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
  static protected  org.apache.spark.sql.types.StructType validateAndTransformSchema (org.apache.spark.sql.types.StructType schema, boolean fitting, org.apache.spark.sql.types.DataType featuresDataType)  { throw new RuntimeException(); }
  static public  M setFeaturesCol (java.lang.String value)  { throw new RuntimeException(); }
  static public  M setPredictionCol (java.lang.String value)  { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.types.DataType featuresDataType ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> transform (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
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
  static public  org.apache.spark.ml.tree.DecisionTreeParams setMaxDepth (int value)  { throw new RuntimeException(); }
  static public final  int getMaxDepth ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.tree.DecisionTreeParams setMaxBins (int value)  { throw new RuntimeException(); }
  static public final  int getMaxBins ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.tree.DecisionTreeParams setMinInstancesPerNode (int value)  { throw new RuntimeException(); }
  static public final  int getMinInstancesPerNode ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.tree.DecisionTreeParams setMinInfoGain (double value)  { throw new RuntimeException(); }
  static public final  double getMinInfoGain ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.tree.DecisionTreeParams setSeed (long value)  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.tree.DecisionTreeParams setMaxMemoryInMB (int value)  { throw new RuntimeException(); }
  static public final  int getMaxMemoryInMB ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.tree.DecisionTreeParams setCacheNodeIds (boolean value)  { throw new RuntimeException(); }
  static public final  boolean getCacheNodeIds ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.tree.DecisionTreeParams setCheckpointInterval (int value)  { throw new RuntimeException(); }
  static   org.apache.spark.mllib.tree.configuration.Strategy getOldStrategy (scala.collection.immutable.Map<java.lang.Object, java.lang.Object> categoricalFeatures, int numClasses, scala.Enumeration.Value oldAlgo, org.apache.spark.mllib.tree.impurity.Impurity oldImpurity, double subsamplingRate)  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.DoubleParam subsamplingRate ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.tree.TreeEnsembleParams setSubsamplingRate (double value)  { throw new RuntimeException(); }
  static public final  double getSubsamplingRate ()  { throw new RuntimeException(); }
  static   org.apache.spark.mllib.tree.configuration.Strategy getOldStrategy (scala.collection.immutable.Map<java.lang.Object, java.lang.Object> categoricalFeatures, int numClasses, scala.Enumeration.Value oldAlgo, org.apache.spark.mllib.tree.impurity.Impurity oldImpurity)  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.IntParam numTrees ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.tree.RandomForestParams setNumTrees (int value)  { throw new RuntimeException(); }
  static public final  int getNumTrees ()  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.Param<java.lang.String> featureSubsetStrategy ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.tree.RandomForestParams setFeatureSubsetStrategy (java.lang.String value)  { throw new RuntimeException(); }
  static public final  java.lang.String getFeatureSubsetStrategy ()  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.Param<java.lang.String> impurity ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.tree.TreeRegressorParams setImpurity (java.lang.String value)  { throw new RuntimeException(); }
  static public final  java.lang.String getImpurity ()  { throw new RuntimeException(); }
  static   org.apache.spark.mllib.tree.impurity.Impurity getOldImpurity ()  { throw new RuntimeException(); }
  static   org.apache.spark.ml.linalg.Vector javaTreeWeights ()  { throw new RuntimeException(); }
  static public  java.lang.String toDebugString ()  { throw new RuntimeException(); }
  static public  int totalNumNodes ()  { throw new RuntimeException(); }
  static public  void save (java.lang.String path) throws java.io.IOException { throw new RuntimeException(); }
  public  java.lang.String uid ()  { throw new RuntimeException(); }
  private  org.apache.spark.ml.regression.DecisionTreeRegressionModel[] _trees ()  { throw new RuntimeException(); }
  public  int numFeatures ()  { throw new RuntimeException(); }
  // not preceding
     RandomForestRegressionModel (java.lang.String uid, org.apache.spark.ml.regression.DecisionTreeRegressionModel[] _trees, int numFeatures)  { throw new RuntimeException(); }
  /**
   * Construct a random forest regression model, with all trees weighted equally.
   * <p>
   * @param trees  Component trees
   * @param numFeatures (undocumented)
   */
     RandomForestRegressionModel (org.apache.spark.ml.regression.DecisionTreeRegressionModel[] trees, int numFeatures)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.regression.DecisionTreeRegressionModel[] trees ()  { throw new RuntimeException(); }
  private  double[] _treeWeights ()  { throw new RuntimeException(); }
  public  double[] treeWeights ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> transformImpl (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  protected  double predict (org.apache.spark.ml.linalg.Vector features)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.regression.RandomForestRegressionModel copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
  /**
   * Estimate of the importance of each feature.
   * <p>
   * Each feature's importance is the average of its importance across all trees in the ensemble
   * The importance vector is normalized to sum to 1. This method is suggested by Hastie et al.
   * (Hastie, Tibshirani, Friedman. "The Elements of Statistical Learning, 2nd Edition." 2001.)
   * and follows the implementation from scikit-learn.
   * <p>
   * @see <code>DecisionTreeRegressionModel.featureImportances</code>
   * @return (undocumented)
   */
  public  org.apache.spark.ml.linalg.Vector featureImportances ()  { throw new RuntimeException(); }
  /** (private[ml]) Convert to a model in the old API */
    org.apache.spark.mllib.tree.model.RandomForestModel toOld ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.util.MLWriter write ()  { throw new RuntimeException(); }
}
