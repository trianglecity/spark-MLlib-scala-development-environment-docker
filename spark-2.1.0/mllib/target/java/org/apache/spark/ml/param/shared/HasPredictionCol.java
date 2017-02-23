package org.apache.spark.ml.param.shared;
/**
 * Trait for shared param predictionCol (default: "prediction").
 */
  interface HasPredictionCol extends org.apache.spark.ml.param.Params {
  /**
   * Param for prediction column name.
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.Param<java.lang.String> predictionCol ()  ;
  /** @group getParam */
  public  java.lang.String getPredictionCol ()  ;
}
