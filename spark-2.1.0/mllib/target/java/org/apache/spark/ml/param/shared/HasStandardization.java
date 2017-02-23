package org.apache.spark.ml.param.shared;
/**
 * Trait for shared param standardization (default: true).
 */
  interface HasStandardization extends org.apache.spark.ml.param.Params {
  /**
   * Param for whether to standardize the training features before fitting the model.
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.BooleanParam standardization ()  ;
  /** @group getParam */
  public  boolean getStandardization ()  ;
}
