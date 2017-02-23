package org.apache.spark.ml.param.shared;
/**
 * Trait for shared param featuresCol (default: "features").
 */
  interface HasFeaturesCol extends org.apache.spark.ml.param.Params {
  /**
   * Param for features column name.
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.Param<java.lang.String> featuresCol ()  ;
  /** @group getParam */
  public  java.lang.String getFeaturesCol ()  ;
}
