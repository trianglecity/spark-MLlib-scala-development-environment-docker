package org.apache.spark.ml.feature;
/**
 * <code>QuantileDiscretizer</code> takes a column with continuous features and outputs a column with binned
 * categorical features. The number of bins can be set using the <code>numBuckets</code> parameter. It is
 * possible that the number of buckets used will be smaller than this value, for example, if there
 * are too few distinct values of the input to create enough distinct quantiles.
 * <p>
 * NaN handling:
 * NaN values will be removed from the column during <code>QuantileDiscretizer</code> fitting. This will
 * produce a <code>Bucketizer</code> model for making predictions. During the transformation,
 * <code>Bucketizer</code> will raise an error when it finds NaN values in the dataset, but the user can
 * also choose to either keep or remove NaN values within the dataset by setting <code>handleInvalid</code>.
 * If the user chooses to keep NaN values, they will be handled specially and placed into their own
 * bucket, for example, if 4 buckets are used, then non-NaN data will be put into buckets[0-3],
 * but NaNs will be counted in a special bucket[4].
 * <p>
 * Algorithm: The bin ranges are chosen using an approximate algorithm (see the documentation for
 * <code>org.apache.spark.sql.DataFrameStatFunctions.approxQuantile</code>
 * for a detailed description). The precision of the approximation can be controlled with the
 * <code>relativeError</code> parameter. The lower and upper bin bounds will be <code>-Infinity</code> and <code>+Infinity</code>,
 * covering all real values.
 */
public final class QuantileDiscretizer extends org.apache.spark.ml.Estimator<org.apache.spark.ml.feature.Bucketizer> implements org.apache.spark.ml.feature.QuantileDiscretizerBase, org.apache.spark.ml.util.DefaultParamsWritable {
  static public  org.apache.spark.ml.feature.QuantileDiscretizer load (java.lang.String path)  { throw new RuntimeException(); }
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
  static public final  org.apache.spark.ml.param.Param<java.lang.String> inputCol ()  { throw new RuntimeException(); }
  static public final  java.lang.String getInputCol ()  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.Param<java.lang.String> outputCol ()  { throw new RuntimeException(); }
  static public final  java.lang.String getOutputCol ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.param.IntParam numBuckets ()  { throw new RuntimeException(); }
  static public  int getNumBuckets ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.param.DoubleParam relativeError ()  { throw new RuntimeException(); }
  static public  double getRelativeError ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.param.Param<java.lang.String> handleInvalid ()  { throw new RuntimeException(); }
  static public  java.lang.String getHandleInvalid ()  { throw new RuntimeException(); }
  static public  void save (java.lang.String path) throws java.io.IOException { throw new RuntimeException(); }
  static public  org.apache.spark.ml.util.MLWriter write ()  { throw new RuntimeException(); }
  public  java.lang.String uid ()  { throw new RuntimeException(); }
  // not preceding
  public   QuantileDiscretizer (java.lang.String uid)  { throw new RuntimeException(); }
  public   QuantileDiscretizer ()  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.QuantileDiscretizer setRelativeError (double value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.QuantileDiscretizer setNumBuckets (int value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.QuantileDiscretizer setInputCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.QuantileDiscretizer setOutputCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.QuantileDiscretizer setHandleInvalid (java.lang.String value)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.Bucketizer fit (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.QuantileDiscretizer copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
}
