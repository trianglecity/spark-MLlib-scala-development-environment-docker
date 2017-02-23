package org.apache.spark.ml.regression;
/**
 * Params for isotonic regression.
 */
  interface IsotonicRegressionBase extends org.apache.spark.ml.param.Params, org.apache.spark.ml.param.shared.HasFeaturesCol, org.apache.spark.ml.param.shared.HasLabelCol, org.apache.spark.ml.param.shared.HasPredictionCol, org.apache.spark.ml.param.shared.HasWeightCol, org.apache.spark.internal.Logging {
  /**
   * Param for whether the output sequence should be isotonic/increasing (true) or
   * antitonic/decreasing (false).
   * Default: true
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.BooleanParam isotonic ()  ;
  /** @group getParam */
  public  boolean getIsotonic ()  ;
  /**
   * Param for the index of the feature if <code>featuresCol</code> is a vector column (default: <code>0</code>), no
   * effect otherwise.
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.IntParam featureIndex ()  ;
  /** @group getParam */
  public  int getFeatureIndex ()  ;
  /** Checks whether the input has weight column. */
    boolean hasWeightCol ()  ;
  /**
   * Extracts (label, feature, weight) from input dataset.
   * @param dataset (undocumented)
   * @return (undocumented)
   */
    org.apache.spark.rdd.RDD<scala.Tuple3<java.lang.Object, java.lang.Object, java.lang.Object>> extractWeightedLabeledPoints (org.apache.spark.sql.Dataset<?> dataset)  ;
  /**
   * Validates and transforms input schema.
   * @param schema input schema
   * @param fitting whether this is in fitting or prediction
   * @return output schema
   */
    org.apache.spark.sql.types.StructType validateAndTransformSchema (org.apache.spark.sql.types.StructType schema, boolean fitting)  ;
}
