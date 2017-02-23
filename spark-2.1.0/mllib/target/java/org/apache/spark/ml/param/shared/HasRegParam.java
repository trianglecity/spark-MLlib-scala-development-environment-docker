package org.apache.spark.ml.param.shared;
/**
 * Trait for shared param regParam.
 */
  interface HasRegParam extends org.apache.spark.ml.param.Params {
  /**
   * Param for regularization parameter (&amp;gt;= 0).
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.DoubleParam regParam ()  ;
  /** @group getParam */
  public  double getRegParam ()  ;
}
