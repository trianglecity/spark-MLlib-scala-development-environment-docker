package org.apache.spark.ml.param.shared;
/**
 * Trait for shared param varianceCol.
 */
  interface HasVarianceCol extends org.apache.spark.ml.param.Params {
  /**
   * Param for Column name for the biased sample variance of prediction.
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.Param<java.lang.String> varianceCol ()  ;
  /** @group getParam */
  public  java.lang.String getVarianceCol ()  ;
}
