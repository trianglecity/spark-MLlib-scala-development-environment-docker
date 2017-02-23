package org.apache.spark.ml.feature;
/**
 * Implements the feature interaction transform. This transformer takes in Double and Vector type
 * columns and outputs a flattened vector of their feature interactions. To handle interaction,
 * we first one-hot encode any nominal features. Then, a vector of the feature cross-products is
 * produced.
 * <p>
 * For example, given the input feature values <code>Double(2)</code> and <code>Vector(3, 4)</code>, the output would be
 * <code>Vector(6, 8)</code> if all input features were numeric. If the first feature was instead nominal
 * with four categories, the output would then be <code>Vector(0, 0, 0, 0, 3, 4, 0, 0)</code>.
 */
public  class Interaction extends org.apache.spark.ml.Transformer implements org.apache.spark.ml.param.shared.HasInputCols, org.apache.spark.ml.param.shared.HasOutputCol, org.apache.spark.ml.util.DefaultParamsWritable {
  static public  org.apache.spark.ml.feature.Interaction load (java.lang.String path)  { throw new RuntimeException(); }
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
  static public final  org.apache.spark.ml.param.StringArrayParam inputCols ()  { throw new RuntimeException(); }
  static public final  java.lang.String[] getInputCols ()  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.Param<java.lang.String> outputCol ()  { throw new RuntimeException(); }
  static public final  java.lang.String getOutputCol ()  { throw new RuntimeException(); }
  static public  void save (java.lang.String path) throws java.io.IOException { throw new RuntimeException(); }
  static public  org.apache.spark.ml.util.MLWriter write ()  { throw new RuntimeException(); }
  public  java.lang.String uid ()  { throw new RuntimeException(); }
  // not preceding
  public   Interaction (java.lang.String uid)  { throw new RuntimeException(); }
  public   Interaction ()  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.Interaction setInputCols (java.lang.String[] values)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.Interaction setOutputCol (java.lang.String value)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> transform (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  /**
   * Creates a feature encoder for each input column, which supports efficient iteration over
   * one-hot encoded feature values. See also the class-level comment of {@link FeatureEncoder}.
   * <p>
   * @param features The input feature columns to create encoders for.
   * @return (undocumented)
   */
  private  org.apache.spark.ml.feature.FeatureEncoder[] getFeatureEncoders (scala.collection.Seq<org.apache.spark.sql.types.StructField> features)  { throw new RuntimeException(); }
  /**
   * Generates ML attributes for the output vector of all feature interactions. We make a best
   * effort to generate reasonable names for output features, based on the concatenation of the
   * interacting feature names and values delimited with <code>_</code>. When no feature name is specified,
   * we fall back to using the feature index (e.g. <code>foo:bar_2_0</code> may indicate an interaction
   * between the numeric <code>foo</code> feature and a nominal third feature from column <code>bar</code>.
   * <p>
   * @param features The input feature columns to the Interaction transformer.
   * @return (undocumented)
   */
  private  org.apache.spark.ml.attribute.AttributeGroup getFeatureAttrs (scala.collection.Seq<org.apache.spark.sql.types.StructField> features)  { throw new RuntimeException(); }
  /**
   * Generates the output ML attributes for a single input feature. Each output feature name has
   * up to three parts: the group name, feature name, and category name (for nominal features),
   * each separated by an underscore.
   * <p>
   * @param inputAttrs The attributes of the input feature.
   * @param groupName Optional name of the input feature group (for Vector type features).
   * @return (undocumented)
   */
  private  scala.collection.Seq<org.apache.spark.ml.attribute.Attribute> encodedFeatureAttrs (scala.collection.Seq<org.apache.spark.ml.attribute.Attribute> inputAttrs, scala.Option<java.lang.String> groupName)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.Interaction copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
}
