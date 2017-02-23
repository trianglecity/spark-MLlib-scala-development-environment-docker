package org.apache.spark.ml.param.shared;
/**
 * Trait for shared param rawPredictionCol (default: "rawPrediction").
 */
  interface HasRawPredictionCol extends org.apache.spark.ml.param.Params {
  /**
   * Param for raw prediction (a.k.a. confidence) column name.
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.Param<java.lang.String> rawPredictionCol ()  ;
  /** @group getParam */
  public  java.lang.String getRawPredictionCol ()  ;
}
