package org.apache.spark.ml.classification;
/**
 * (private[spark]) Params for classification.
 */
  interface ClassifierParams extends org.apache.spark.ml.PredictorParams, org.apache.spark.ml.param.shared.HasRawPredictionCol {
  public  org.apache.spark.sql.types.StructType validateAndTransformSchema (org.apache.spark.sql.types.StructType schema, boolean fitting, org.apache.spark.sql.types.DataType featuresDataType)  ;
}
