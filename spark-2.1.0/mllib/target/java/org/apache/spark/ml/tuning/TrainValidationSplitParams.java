package org.apache.spark.ml.tuning;
/**
 * Params for {@link TrainValidationSplit} and {@link TrainValidationSplitModel}.
 */
  interface TrainValidationSplitParams extends org.apache.spark.ml.tuning.ValidatorParams {
  /**
   * Param for ratio between train and validation data. Must be between 0 and 1.
   * Default: 0.75
   * <p>
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.DoubleParam trainRatio ()  ;
  /** @group getParam */
  public  double getTrainRatio ()  ;
}
