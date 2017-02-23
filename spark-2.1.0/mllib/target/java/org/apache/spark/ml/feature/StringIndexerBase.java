package org.apache.spark.ml.feature;
/**
 * Base trait for {@link StringIndexer} and {@link StringIndexerModel}.
 */
  interface StringIndexerBase extends org.apache.spark.ml.param.Params, org.apache.spark.ml.param.shared.HasInputCol, org.apache.spark.ml.param.shared.HasOutputCol, org.apache.spark.ml.param.shared.HasHandleInvalid {
  /** Validates and transforms the input schema. */
  public  org.apache.spark.sql.types.StructType validateAndTransformSchema (org.apache.spark.sql.types.StructType schema)  ;
}
