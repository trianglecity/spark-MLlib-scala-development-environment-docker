package org.apache.spark.ml.feature;
/**
 * Params for {@link MaxAbsScaler} and {@link MaxAbsScalerModel}.
 */
  interface MaxAbsScalerParams extends org.apache.spark.ml.param.Params, org.apache.spark.ml.param.shared.HasInputCol, org.apache.spark.ml.param.shared.HasOutputCol {
  /** Validates and transforms the input schema. */
  public  org.apache.spark.sql.types.StructType validateAndTransformSchema (org.apache.spark.sql.types.StructType schema)  ;
}
