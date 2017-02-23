package org.apache.spark.ml.feature;
/**
 * :: Experimental ::
 * <p>
 * Model produced by {@link BucketedRandomProjectionLSH}, where multiple random vectors are stored. The
 * vectors are normalized to be unit vectors and each vector is used in a hash function:
 *    <code>h_i(x) = floor(r_i.dot(x) / bucketLength)</code>
 * where <code>r_i</code> is the i-th random unit vector. The number of buckets will be <code>(max L2 norm of input
 * vectors) / bucketLength</code>.
 * <p>
 * param:  randUnitVectors An array of random unit vectors. Each vector represents a hash function.
 */
public  class BucketedRandomProjectionLSHModel extends org.apache.spark.ml.feature.LSHModel<org.apache.spark.ml.feature.BucketedRandomProjectionLSHModel> implements org.apache.spark.ml.feature.BucketedRandomProjectionLSHParams {
  static   class BucketedRandomProjectionLSHModelWriter extends org.apache.spark.ml.util.MLWriter {
    public   BucketedRandomProjectionLSHModelWriter (org.apache.spark.ml.feature.BucketedRandomProjectionLSHModel instance)  { throw new RuntimeException(); }
    private  class Data implements scala.Product, scala.Serializable {
      public  org.apache.spark.ml.linalg.Matrix randUnitVectors ()  { throw new RuntimeException(); }
      // not preceding
      public   Data (org.apache.spark.ml.linalg.Matrix randUnitVectors)  { throw new RuntimeException(); }
    }
    private  class Data extends scala.runtime.AbstractFunction1<org.apache.spark.ml.linalg.Matrix, org.apache.spark.ml.feature.BucketedRandomProjectionLSHModel.BucketedRandomProjectionLSHModelWriter.Data> implements scala.Serializable {
      public   Data ()  { throw new RuntimeException(); }
    }
    protected  void saveImpl (java.lang.String path)  { throw new RuntimeException(); }
  }
  static private  class BucketedRandomProjectionLSHModelReader extends org.apache.spark.ml.util.MLReader<org.apache.spark.ml.feature.BucketedRandomProjectionLSHModel> {
    public   BucketedRandomProjectionLSHModelReader ()  { throw new RuntimeException(); }
    /** Checked against metadata when loading model */
    private  java.lang.String className ()  { throw new RuntimeException(); }
    public  org.apache.spark.ml.feature.BucketedRandomProjectionLSHModel load (java.lang.String path)  { throw new RuntimeException(); }
  }
  static public  org.apache.spark.ml.util.MLReader<org.apache.spark.ml.feature.BucketedRandomProjectionLSHModel> read ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.feature.BucketedRandomProjectionLSHModel load (java.lang.String path)  { throw new RuntimeException(); }
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
  static public final  org.apache.spark.ml.param.Param<java.lang.String> inputCol ()  { throw new RuntimeException(); }
  static public final  java.lang.String getInputCol ()  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.Param<java.lang.String> outputCol ()  { throw new RuntimeException(); }
  static public final  java.lang.String getOutputCol ()  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.IntParam numHashTables ()  { throw new RuntimeException(); }
  static public final  int getNumHashTables ()  { throw new RuntimeException(); }
  static protected final  org.apache.spark.sql.types.StructType validateAndTransformSchema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  static public  void save (java.lang.String path) throws java.io.IOException { throw new RuntimeException(); }
  static public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> transform (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  static   org.apache.spark.sql.Dataset<?> approxNearestNeighbors (org.apache.spark.sql.Dataset<?> dataset, org.apache.spark.ml.linalg.Vector key, int numNearestNeighbors, boolean singleProbe, java.lang.String distCol)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.Dataset<?> approxNearestNeighbors (org.apache.spark.sql.Dataset<?> dataset, org.apache.spark.ml.linalg.Vector key, int numNearestNeighbors, java.lang.String distCol)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.Dataset<?> approxNearestNeighbors (org.apache.spark.sql.Dataset<?> dataset, org.apache.spark.ml.linalg.Vector key, int numNearestNeighbors)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.Dataset<?> approxSimilarityJoin (org.apache.spark.sql.Dataset<?> datasetA, org.apache.spark.sql.Dataset<?> datasetB, double threshold, java.lang.String distCol)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.Dataset<?> approxSimilarityJoin (org.apache.spark.sql.Dataset<?> datasetA, org.apache.spark.sql.Dataset<?> datasetB, double threshold)  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.param.DoubleParam bucketLength ()  { throw new RuntimeException(); }
  static public final  double getBucketLength ()  { throw new RuntimeException(); }
  public  java.lang.String uid ()  { throw new RuntimeException(); }
    org.apache.spark.ml.linalg.Vector[] randUnitVectors ()  { throw new RuntimeException(); }
  // not preceding
     BucketedRandomProjectionLSHModel (java.lang.String uid, org.apache.spark.ml.linalg.Vector[] randUnitVectors)  { throw new RuntimeException(); }
  protected  scala.Function1<org.apache.spark.ml.linalg.Vector, org.apache.spark.ml.linalg.Vector[]> hashFunction ()  { throw new RuntimeException(); }
  protected  double keyDistance (org.apache.spark.ml.linalg.Vector x, org.apache.spark.ml.linalg.Vector y)  { throw new RuntimeException(); }
  protected  double hashDistance (scala.collection.Seq<org.apache.spark.ml.linalg.Vector> x, scala.collection.Seq<org.apache.spark.ml.linalg.Vector> y)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.BucketedRandomProjectionLSHModel copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.util.MLWriter write ()  { throw new RuntimeException(); }
}
