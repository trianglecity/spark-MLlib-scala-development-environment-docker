package org.apache.spark.ml.param.shared;
/**
 * Trait for shared param outputCol (default: uid + "__output").
 */
  interface HasOutputCol extends org.apache.spark.ml.param.Params {
  /**
   * Param for output column name.
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.Param<java.lang.String> outputCol ()  ;
  /** @group getParam */
  public  java.lang.String getOutputCol ()  ;
}
