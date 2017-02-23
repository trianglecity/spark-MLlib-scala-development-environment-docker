package org.apache.spark.ml.clustering;
/**
 * Model fitted by BisectingKMeans.
 * <p>
 * param:  parentModel a model trained by {@link org.apache.spark.mllib.clustering.BisectingKMeans}.
 */
public  class BisectingKMeansModel extends org.apache.spark.ml.Model<org.apache.spark.ml.clustering.BisectingKMeansModel> implements org.apache.spark.ml.clustering.BisectingKMeansParams, org.apache.spark.ml.util.MLWritable {
  /** {@link MLWriter} instance for {@link BisectingKMeansModel} */
  static   class BisectingKMeansModelWriter extends org.apache.spark.ml.util.MLWriter {
    public   BisectingKMeansModelWriter (org.apache.spark.ml.clustering.BisectingKMeansModel instance)  { throw new RuntimeException(); }
    protected  void saveImpl (java.lang.String path)  { throw new RuntimeException(); }
  }
  static private  class BisectingKMeansModelReader extends org.apache.spark.ml.util.MLReader<org.apache.spark.ml.clustering.BisectingKMeansModel> {
    public   BisectingKMeansModelReader ()  { throw new RuntimeException(); }
    /** Checked against metadata when loading model */
    private  java.lang.String className ()  { throw new RuntimeException(); }
    public  org.apache.spark.ml.clustering.BisectingKMeansModel load (java.lang.String path)  { throw new RuntimeException(); }
  }
  static public  org.apache.spark.ml.util.MLReader<org.apache.spark.ml.clustering.BisectingKMeansModel> read ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.clustering.BisectingKMeansModel load (java.lang.String path)  { throw new RuntimeException(); }
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
  static public final  org.apache.spark.ml.param.IntParam maxIter ()  { throw new RuntimeException(); }
  static public final  int getMaxIter ()  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.Param<java.lang.String> featuresCol ()  { throw new RuntimeException(); }
  static public final  java.lang.String getFeaturesCol ()  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.LongParam seed ()  { throw new RuntimeException(); }
  static public final  long getSeed ()  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.Param<java.lang.String> predictionCol ()  { throw new RuntimeException(); }
  static public final  java.lang.String getPredictionCol ()  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.IntParam k ()  { throw new RuntimeException(); }
  static public  int getK ()  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.DoubleParam minDivisibleClusterSize ()  { throw new RuntimeException(); }
  static public  double getMinDivisibleClusterSize ()  { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.types.StructType validateAndTransformSchema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  static public  void save (java.lang.String path) throws java.io.IOException { throw new RuntimeException(); }
  public  java.lang.String uid ()  { throw new RuntimeException(); }
  private  org.apache.spark.mllib.clustering.BisectingKMeansModel parentModel ()  { throw new RuntimeException(); }
  // not preceding
     BisectingKMeansModel (java.lang.String uid, org.apache.spark.mllib.clustering.BisectingKMeansModel parentModel)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.clustering.BisectingKMeansModel copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.clustering.BisectingKMeansModel setFeaturesCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.clustering.BisectingKMeansModel setPredictionCol (java.lang.String value)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> transform (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
    int predict (org.apache.spark.ml.linalg.Vector features)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.linalg.Vector[] clusterCenters ()  { throw new RuntimeException(); }
  /**
   * Computes the sum of squared distances between the input points and their corresponding cluster
   * centers.
   * @param dataset (undocumented)
   * @return (undocumented)
   */
  public  double computeCost (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.util.MLWriter write ()  { throw new RuntimeException(); }
  private  scala.Option<org.apache.spark.ml.clustering.BisectingKMeansSummary> trainingSummary ()  { throw new RuntimeException(); }
    org.apache.spark.ml.clustering.BisectingKMeansModel setSummary (scala.Option<org.apache.spark.ml.clustering.BisectingKMeansSummary> summary)  { throw new RuntimeException(); }
  /**
   * Return true if there exists summary of model.
   * @return (undocumented)
   */
  public  boolean hasSummary ()  { throw new RuntimeException(); }
  /**
   * Gets summary of model on training set. An exception is
   * thrown if <code>trainingSummary == None</code>.
   * @return (undocumented)
   */
  public  org.apache.spark.ml.clustering.BisectingKMeansSummary summary ()  { throw new RuntimeException(); }
}
