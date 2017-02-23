package org.apache.spark.ml.clustering;
/**
 * Model fitted by KMeans.
 * <p>
 * param:  parentModel a model trained by spark.mllib.clustering.KMeans.
 */
public  class KMeansModel extends org.apache.spark.ml.Model<org.apache.spark.ml.clustering.KMeansModel> implements org.apache.spark.ml.clustering.KMeansParams, org.apache.spark.ml.util.MLWritable {
  /** Helper class for storing model data */
  static private  class Data implements scala.Product, scala.Serializable {
    public  int clusterIdx ()  { throw new RuntimeException(); }
    public  org.apache.spark.ml.linalg.Vector clusterCenter ()  { throw new RuntimeException(); }
    // not preceding
    public   Data (int clusterIdx, org.apache.spark.ml.linalg.Vector clusterCenter)  { throw new RuntimeException(); }
  }
  static private  class Data$ extends scala.runtime.AbstractFunction2<java.lang.Object, org.apache.spark.ml.linalg.Vector, org.apache.spark.ml.clustering.KMeansModel.Data> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Data$ MODULE$ = null;
    public   Data$ ()  { throw new RuntimeException(); }
  }
  /**
   * We store all cluster centers in a single row and use this class to store model data by
   * Spark 1.6 and earlier. A model can be loaded from such older data for backward compatibility.
   */
  static private  class OldData implements scala.Product, scala.Serializable {
    public  org.apache.spark.mllib.linalg.Vector[] clusterCenters ()  { throw new RuntimeException(); }
    // not preceding
    public   OldData (org.apache.spark.mllib.linalg.Vector[] clusterCenters)  { throw new RuntimeException(); }
  }
  static private  class OldData$ extends scala.runtime.AbstractFunction1<org.apache.spark.mllib.linalg.Vector[], org.apache.spark.ml.clustering.KMeansModel.OldData> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final OldData$ MODULE$ = null;
    public   OldData$ ()  { throw new RuntimeException(); }
  }
  /** {@link MLWriter} instance for {@link KMeansModel} */
  static   class KMeansModelWriter extends org.apache.spark.ml.util.MLWriter {
    public   KMeansModelWriter (org.apache.spark.ml.clustering.KMeansModel instance)  { throw new RuntimeException(); }
    protected  void saveImpl (java.lang.String path)  { throw new RuntimeException(); }
  }
  static private  class KMeansModelReader extends org.apache.spark.ml.util.MLReader<org.apache.spark.ml.clustering.KMeansModel> {
    public   KMeansModelReader ()  { throw new RuntimeException(); }
    /** Checked against metadata when loading model */
    private  java.lang.String className ()  { throw new RuntimeException(); }
    public  org.apache.spark.ml.clustering.KMeansModel load (java.lang.String path)  { throw new RuntimeException(); }
  }
  static public  org.apache.spark.ml.util.MLReader<org.apache.spark.ml.clustering.KMeansModel> read ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.clustering.KMeansModel load (java.lang.String path)  { throw new RuntimeException(); }
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
  static public final  org.apache.spark.ml.param.DoubleParam tol ()  { throw new RuntimeException(); }
  static public final  double getTol ()  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.IntParam k ()  { throw new RuntimeException(); }
  static public  int getK ()  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.Param<java.lang.String> initMode ()  { throw new RuntimeException(); }
  static public  java.lang.String getInitMode ()  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.IntParam initSteps ()  { throw new RuntimeException(); }
  static public  int getInitSteps ()  { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.types.StructType validateAndTransformSchema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  static public  void save (java.lang.String path) throws java.io.IOException { throw new RuntimeException(); }
  public  java.lang.String uid ()  { throw new RuntimeException(); }
  private  org.apache.spark.mllib.clustering.KMeansModel parentModel ()  { throw new RuntimeException(); }
  // not preceding
     KMeansModel (java.lang.String uid, org.apache.spark.mllib.clustering.KMeansModel parentModel)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.clustering.KMeansModel copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.clustering.KMeansModel setFeaturesCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.clustering.KMeansModel setPredictionCol (java.lang.String value)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> transform (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
    int predict (org.apache.spark.ml.linalg.Vector features)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.linalg.Vector[] clusterCenters ()  { throw new RuntimeException(); }
  /**
   * Return the K-means cost (sum of squared distances of points to their nearest center) for this
   * model on the given data.
   * @param dataset (undocumented)
   * @return (undocumented)
   */
  public  double computeCost (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  /**
   * Returns a {@link org.apache.spark.ml.util.MLWriter} instance for this ML instance.
   * <p>
   * For {@link KMeansModel}, this does NOT currently save the training {@link summary}.
   * An option to save {@link summary} may be added in the future.
   * <p>
   * @return (undocumented)
   */
  public  org.apache.spark.ml.util.MLWriter write ()  { throw new RuntimeException(); }
  private  scala.Option<org.apache.spark.ml.clustering.KMeansSummary> trainingSummary ()  { throw new RuntimeException(); }
    org.apache.spark.ml.clustering.KMeansModel setSummary (scala.Option<org.apache.spark.ml.clustering.KMeansSummary> summary)  { throw new RuntimeException(); }
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
  public  org.apache.spark.ml.clustering.KMeansSummary summary ()  { throw new RuntimeException(); }
}
