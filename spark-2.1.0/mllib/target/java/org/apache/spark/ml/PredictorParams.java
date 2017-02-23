package org.apache.spark.ml;
/**
 * (private[ml])  Trait for parameters for prediction (regression and classification).
 */
  interface PredictorParams extends org.apache.spark.ml.param.Params, org.apache.spark.ml.param.shared.HasLabelCol, org.apache.spark.ml.param.shared.HasFeaturesCol, org.apache.spark.ml.param.shared.HasPredictionCol {
  /**
   * Validates and transforms the input schema with the provided param map.
   * <p>
   * @param schema input schema
   * @param fitting whether this is in fitting
   * @param featuresDataType  SQL DataType for FeaturesType.
   *                          E.g., {@link org.apache.spark.mllib.linalg.VectorUDT} for vector features.
   * @return output schema
   */
  public  org.apache.spark.sql.types.StructType validateAndTransformSchema (org.apache.spark.sql.types.StructType schema, boolean fitting, org.apache.spark.sql.types.DataType featuresDataType)  ;
}
