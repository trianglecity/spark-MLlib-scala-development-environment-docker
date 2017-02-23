package org.apache.spark.ml.param.shared;
/**
 * Trait for shared param inputCols.
 */
  interface HasInputCols extends org.apache.spark.ml.param.Params {
  /**
   * Param for input column names.
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.StringArrayParam inputCols ()  ;
  /** @group getParam */
  public  java.lang.String[] getInputCols ()  ;
}
