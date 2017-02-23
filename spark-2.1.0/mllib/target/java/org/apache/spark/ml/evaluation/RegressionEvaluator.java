package org.apache.spark.ml.evaluation;
/**
 * :: Experimental ::
 * Evaluator for regression, which expects two input columns: prediction and label.
 */
public final class RegressionEvaluator extends org.apache.spark.ml.evaluation.Evaluator implements org.apache.spark.ml.param.shared.HasPredictionCol, org.apache.spark.ml.param.shared.HasLabelCol, org.apache.spark.ml.util.DefaultParamsWritable {
  static public  org.apache.spark.ml.evaluation.RegressionEvaluator load (java.lang.String path)  { throw new RuntimeException(); }
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
  static public final  org.apache.spark.ml.param.Param<java.lang.String> predictionCol ()  { throw new RuntimeException(); }
  static public final  java.lang.String getPredictionCol ()  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.Param<java.lang.String> labelCol ()  { throw new RuntimeException(); }
  static public final  java.lang.String getLabelCol ()  { throw new RuntimeException(); }
  static public  void save (java.lang.String path) throws java.io.IOException { throw new RuntimeException(); }
  static public  org.apache.spark.ml.util.MLWriter write ()  { throw new RuntimeException(); }
  public  java.lang.String uid ()  { throw new RuntimeException(); }
  // not preceding
  public   RegressionEvaluator (java.lang.String uid)  { throw new RuntimeException(); }
  public   RegressionEvaluator ()  { throw new RuntimeException(); }
  /**
   * Param for metric name in evaluation. Supports:
   *  - <code>"rmse"</code> (default): root mean squared error
   *  - <code>"mse"</code>: mean squared error
   *  - <code>"r2"</code>: R^2^ metric
   *  - <code>"mae"</code>: mean absolute error
   * <p>
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.Param<java.lang.String> metricName ()  { throw new RuntimeException(); }
  /** @group getParam */
  public  java.lang.String getMetricName ()  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.evaluation.RegressionEvaluator setMetricName (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.evaluation.RegressionEvaluator setPredictionCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.evaluation.RegressionEvaluator setLabelCol (java.lang.String value)  { throw new RuntimeException(); }
  public  double evaluate (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  boolean isLargerBetter ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.evaluation.RegressionEvaluator copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
}
