package org.apache.spark.ml.feature;
/**
 * :: Experimental ::
 * Implements the transforms required for fitting a dataset against an R model formula. Currently
 * we support a limited subset of the R operators, including '~', '.', ':', '+', and '-'. Also see
 * the R formula docs here: http://stat.ethz.ch/R-manual/R-patched/library/stats/html/formula.html
 * <p>
 * The basic operators are:
 *  - <code>~</code> separate target and terms
 *  - <code>+</code> concat terms, "+ 0" means removing intercept
 *  - <code>-</code> remove a term, "- 1" means removing intercept
 *  - <code>:</code> interaction (multiplication for numeric values, or binarized categorical values)
 *  - <code>.</code> all columns except target
 * <p>
 * Suppose <code>a</code> and <code>b</code> are double columns, we use the following simple examples
 * to illustrate the effect of <code>RFormula</code>:
 *  - <code>y ~ a + b</code> means model <code>y ~ w0 + w1 * a + w2 * b</code> where <code>w0</code> is the intercept and <code>w1, w2</code>
 * are coefficients.
 *  - <code>y ~ a + b + a:b - 1</code> means model <code>y ~ w1 * a + w2 * b + w3 * a * b</code> where <code>w1, w2, w3</code>
 * are coefficients.
 * <p>
 * RFormula produces a vector column of features and a double or string column of label.
 * Like when formulas are used in R for linear regression, string input columns will be one-hot
 * encoded, and numeric columns will be cast to doubles.
 * If the label column is of type string, it will be first transformed to double with
 * <code>StringIndexer</code>. If the label column does not exist in the DataFrame, the output label column
 * will be created from the specified response variable in the formula.
 */
public  class RFormula extends org.apache.spark.ml.Estimator<org.apache.spark.ml.feature.RFormulaModel> implements org.apache.spark.ml.feature.RFormulaBase, org.apache.spark.ml.util.DefaultParamsWritable {
  static public  org.apache.spark.ml.feature.RFormula load (java.lang.String path)  { throw new RuntimeException(); }
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
  static public final  org.apache.spark.ml.param.Param<java.lang.String> featuresCol ()  { throw new RuntimeException(); }
  static public final  java.lang.String getFeaturesCol ()  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.Param<java.lang.String> labelCol ()  { throw new RuntimeException(); }
  static public final  java.lang.String getLabelCol ()  { throw new RuntimeException(); }
  static protected  boolean hasLabelCol (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  static public  void save (java.lang.String path) throws java.io.IOException { throw new RuntimeException(); }
  static public  org.apache.spark.ml.util.MLWriter write ()  { throw new RuntimeException(); }
  public  java.lang.String uid ()  { throw new RuntimeException(); }
  // not preceding
  public   RFormula (java.lang.String uid)  { throw new RuntimeException(); }
  public   RFormula ()  { throw new RuntimeException(); }
  /**
   * R formula parameter. The formula is provided in string form.
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.Param<java.lang.String> formula ()  { throw new RuntimeException(); }
  /**
   * Sets the formula to use for this transformer. Must be called before use.
   * @group setParam
   * @param value an R formula in string form (e.g. "y ~ x + z")
   * @return (undocumented)
   */
  public  org.apache.spark.ml.feature.RFormula setFormula (java.lang.String value)  { throw new RuntimeException(); }
  /** @group getParam */
  public  java.lang.String getFormula ()  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.RFormula setFeaturesCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.RFormula setLabelCol (java.lang.String value)  { throw new RuntimeException(); }
  /**
   * Force to index label whether it is numeric or string type.
   * Usually we index label only when it is string type.
   * If the formula was used by classification algorithms,
   * we can force to index label even it is numeric type by setting this param with true.
   * Default: false.
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.BooleanParam forceIndexLabel ()  { throw new RuntimeException(); }
  /** @group getParam */
  public  boolean getForceIndexLabel ()  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.RFormula setForceIndexLabel (boolean value)  { throw new RuntimeException(); }
  /** Whether the formula specifies fitting an intercept. */
    boolean hasIntercept ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.RFormulaModel fit (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.RFormula copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
