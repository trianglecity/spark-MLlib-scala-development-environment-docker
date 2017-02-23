package org.apache.spark.ml.param.shared;
/**
 * Trait for shared param solver (default: "auto").
 */
  interface HasSolver extends org.apache.spark.ml.param.Params {
  /**
   * Param for the solver algorithm for optimization. If this is not set or empty, default value is 'auto'.
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.Param<java.lang.String> solver ()  ;
  /** @group getParam */
  public  java.lang.String getSolver ()  ;
}
