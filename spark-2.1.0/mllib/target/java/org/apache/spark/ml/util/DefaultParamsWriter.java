package org.apache.spark.ml.util;
/**
 * Default {@link MLWriter} implementation for transformers and estimators that contain basic
 * (json4s-serializable) params and no data. This will not handle more complex params or types with
 * data (e.g., models with coefficients).
 * <p>
 * param:  instance object to save
 */
  class DefaultParamsWriter extends org.apache.spark.ml.util.MLWriter {
  /**
   * Saves metadata + Params to: path + "/metadata"
   *  - class
   *  - timestamp
   *  - sparkVersion
   *  - uid
   *  - paramMap
   *  - (optionally, extra metadata)
   * <p>
   * @param extraMetadata  Extra metadata to be saved at same level as uid, paramMap, etc.
   * @param paramMap  If given, this is saved in the "paramMap" field.
   *                  Otherwise, all {@link org.apache.spark.ml.param.Param}s are encoded using
   *                  {@link org.apache.spark.ml.param.Param.jsonEncode()}.
   * @param instance (undocumented)
   * @param path (undocumented)
   * @param sc (undocumented)
   */
  static public  void saveMetadata (org.apache.spark.ml.param.Params instance, java.lang.String path, org.apache.spark.SparkContext sc, scala.Option<org.json4s.JsonAST.JObject> extraMetadata, scala.Option<org.json4s.JsonAST.JValue> paramMap)  { throw new RuntimeException(); }
  /**
   * Helper for {@link saveMetadata()} which extracts the JSON to save.
   * This is useful for ensemble models which need to save metadata for many sub-models.
   * <p>
   * @see {@link saveMetadata()} for details on what this includes.
   * @param instance (undocumented)
   * @param sc (undocumented)
   * @param extraMetadata (undocumented)
   * @param paramMap (undocumented)
   * @return (undocumented)
   */
  static public  java.lang.String getMetadataToSave (org.apache.spark.ml.param.Params instance, org.apache.spark.SparkContext sc, scala.Option<org.json4s.JsonAST.JObject> extraMetadata, scala.Option<org.json4s.JsonAST.JValue> paramMap)  { throw new RuntimeException(); }
  static protected final  org.apache.spark.sql.SparkSession sparkSession ()  { throw new RuntimeException(); }
  static protected final  org.apache.spark.sql.SQLContext sqlContext ()  { throw new RuntimeException(); }
  static protected final  org.apache.spark.SparkContext sc ()  { throw new RuntimeException(); }
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
  static protected  boolean shouldOverwrite ()  { throw new RuntimeException(); }
  static protected  void shouldOverwrite_$eq (boolean x$1)  { throw new RuntimeException(); }
  static public  void save (java.lang.String path) throws java.io.IOException { throw new RuntimeException(); }
  static public  org.apache.spark.ml.util.MLWriter overwrite ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.util.MLWriter session (org.apache.spark.sql.SparkSession sparkSession)  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.util.MLWriter context (org.apache.spark.sql.SQLContext sqlContext)  { throw new RuntimeException(); }
  public   DefaultParamsWriter (org.apache.spark.ml.param.Params instance)  { throw new RuntimeException(); }
  protected  void saveImpl (java.lang.String path)  { throw new RuntimeException(); }
}
