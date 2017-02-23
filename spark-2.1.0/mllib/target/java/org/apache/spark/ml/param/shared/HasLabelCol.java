package org.apache.spark.ml.param.shared;
/**
 * Trait for shared param labelCol (default: "label").
 */
  interface HasLabelCol extends org.apache.spark.ml.param.Params {
  /**
   * Param for label column name.
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.Param<java.lang.String> labelCol ()  ;
  /** @group getParam */
  public  java.lang.String getLabelCol ()  ;
}
