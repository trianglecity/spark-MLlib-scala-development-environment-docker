package org.apache.spark.ml.feature;
/**
 * Params for {@link ChiSqSelector} and {@link ChiSqSelectorModel}.
 */
  interface ChiSqSelectorParams extends org.apache.spark.ml.param.Params, org.apache.spark.ml.param.shared.HasFeaturesCol, org.apache.spark.ml.param.shared.HasOutputCol, org.apache.spark.ml.param.shared.HasLabelCol {
  /**
   * Number of features that selector will select, ordered by ascending p-value. If the
   * number of features is less than numTopFeatures, then this will select all features.
   * Only applicable when selectorType = "numTopFeatures".
   * The default value of numTopFeatures is 50.
   * <p>
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.IntParam numTopFeatures ()  ;
  /** @group getParam */
  public  int getNumTopFeatures ()  ;
  /**
   * Percentile of features that selector will select, ordered by statistics value descending.
   * Only applicable when selectorType = "percentile".
   * Default value is 0.1.
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.DoubleParam percentile ()  ;
  /** @group getParam */
  public  double getPercentile ()  ;
  /**
   * The highest p-value for features to be kept.
   * Only applicable when selectorType = "fpr".
   * Default value is 0.05.
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.DoubleParam fpr ()  ;
  /** @group getParam */
  public  double getFpr ()  ;
  /**
   * The selector type of the ChisqSelector.
   * Supported options: "numTopFeatures" (default), "percentile", "fpr".
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.Param<java.lang.String> selectorType ()  ;
  /** @group getParam */
  public  java.lang.String getSelectorType ()  ;
}
