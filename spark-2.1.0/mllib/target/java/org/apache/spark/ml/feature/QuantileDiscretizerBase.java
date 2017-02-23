package org.apache.spark.ml.feature;
/**
 * Params for {@link QuantileDiscretizer}.
 */
  interface QuantileDiscretizerBase extends org.apache.spark.ml.param.Params, org.apache.spark.ml.param.shared.HasInputCol, org.apache.spark.ml.param.shared.HasOutputCol {
  /**
   * Number of buckets (quantiles, or categories) into which data points are grouped. Must
   * be greater than or equal to 2.
   * <p>
   * See also {@link handleInvalid}, which can optionally create an additional bucket for NaN values.
   * <p>
   * default: 2
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.IntParam numBuckets ()  ;
  /** @group getParam */
  public  int getNumBuckets ()  ;
  /**
   * Relative error (see documentation for
   * <code>org.apache.spark.sql.DataFrameStatFunctions.approxQuantile</code> for description)
   * Must be in the range [0, 1].
   * default: 0.001
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.DoubleParam relativeError ()  ;
  /** @group getParam */
  public  double getRelativeError ()  ;
  /**
   * Param for how to handle invalid entries. Options are 'skip' (filter out rows with
   * invalid values), 'error' (throw an error), or 'keep' (keep invalid values in a special
   * additional bucket).
   * Default: "error"
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.Param<java.lang.String> handleInvalid ()  ;
  /** @group getParam */
  public  java.lang.String getHandleInvalid ()  ;
}
