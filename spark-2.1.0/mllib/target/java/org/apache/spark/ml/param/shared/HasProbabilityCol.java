package org.apache.spark.ml.param.shared;
/**
 * Trait for shared param probabilityCol (default: "probability").
 */
  interface HasProbabilityCol extends org.apache.spark.ml.param.Params {
  /**
   * Param for Column name for predicted class conditional probabilities. Note: Not all models output well-calibrated probability estimates! These probabilities should be treated as confidences, not precise probabilities.
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.Param<java.lang.String> probabilityCol ()  ;
  /** @group getParam */
  public  java.lang.String getProbabilityCol ()  ;
}
