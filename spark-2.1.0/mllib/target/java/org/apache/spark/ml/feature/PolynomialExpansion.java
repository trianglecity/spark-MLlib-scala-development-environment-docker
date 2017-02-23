package org.apache.spark.ml.feature;
/**
 * Perform feature expansion in a polynomial space. As said in wikipedia of Polynomial Expansion,
 * which is available at
 * <a href="http://en.wikipedia.org/wiki/Polynomial_expansion">Polynomial expansion (Wikipedia)</a>
 * , "In mathematics, an expansion of a product of sums expresses it as a sum of products by using
 * the fact that multiplication distributes over addition". Take a 2-variable feature vector
 * as an example: <code>(x, y)</code>, if we want to expand it with degree 2, then we get
 * <code>(x, x * x, y, x * y, y * y)</code>.
 */
public  class PolynomialExpansion extends org.apache.spark.ml.UnaryTransformer<org.apache.spark.ml.linalg.Vector, org.apache.spark.ml.linalg.Vector, org.apache.spark.ml.feature.PolynomialExpansion> implements org.apache.spark.ml.util.DefaultParamsWritable {
  static private  int getPolySize (int numFeatures, int degree)  { throw new RuntimeException(); }
  static private  int expandDense (double[] values, int lastIdx, int degree, double multiplier, double[] polyValues, int curPolyIdx)  { throw new RuntimeException(); }
  static private  int expandSparse (int[] indices, double[] values, int lastIdx, int lastFeatureIdx, int degree, double multiplier, scala.collection.mutable.ArrayBuilder<java.lang.Object> polyIndices, scala.collection.mutable.ArrayBuilder<java.lang.Object> polyValues, int curPolyIdx)  { throw new RuntimeException(); }
  static private  org.apache.spark.ml.linalg.DenseVector expand (org.apache.spark.ml.linalg.DenseVector dv, int degree)  { throw new RuntimeException(); }
  static private  org.apache.spark.ml.linalg.SparseVector expand (org.apache.spark.ml.linalg.SparseVector sv, int degree)  { throw new RuntimeException(); }
  static   org.apache.spark.ml.linalg.Vector expand (org.apache.spark.ml.linalg.Vector v, int degree)  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.feature.PolynomialExpansion load (java.lang.String path)  { throw new RuntimeException(); }
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
  static public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> transform (org.apache.spark.sql.Dataset<?> dataset, org.apache.spark.ml.param.ParamPair<?> firstParamPair, org.apache.spark.ml.param.ParamPair<?>... otherParamPairs)  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.Param<java.lang.String> inputCol ()  { throw new RuntimeException(); }
  static public final  java.lang.String getInputCol ()  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.Param<java.lang.String> outputCol ()  { throw new RuntimeException(); }
  static public final  java.lang.String getOutputCol ()  { throw new RuntimeException(); }
  static public  T setInputCol (java.lang.String value)  { throw new RuntimeException(); }
  static public  T setOutputCol (java.lang.String value)  { throw new RuntimeException(); }
  static protected  void validateInputType (org.apache.spark.sql.types.DataType inputType)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> transform (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  static public  void save (java.lang.String path) throws java.io.IOException { throw new RuntimeException(); }
  static public  org.apache.spark.ml.util.MLWriter write ()  { throw new RuntimeException(); }
  public  java.lang.String uid ()  { throw new RuntimeException(); }
  // not preceding
  public   PolynomialExpansion (java.lang.String uid)  { throw new RuntimeException(); }
  public   PolynomialExpansion ()  { throw new RuntimeException(); }
  /**
   * The polynomial degree to expand, which should be greater than equal to 1. A value of 1 means
   * no expansion.
   * Default: 2
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.IntParam degree ()  { throw new RuntimeException(); }
  /** @group getParam */
  public  int getDegree ()  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.PolynomialExpansion setDegree (int value)  { throw new RuntimeException(); }
  protected  scala.Function1<org.apache.spark.ml.linalg.Vector, org.apache.spark.ml.linalg.Vector> createTransformFunc ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.types.DataType outputDataType ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.PolynomialExpansion copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
}
