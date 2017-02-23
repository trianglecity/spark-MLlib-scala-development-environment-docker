package org.apache.spark.ml.feature;
/**
 * Params for {@link PCA} and {@link PCAModel}.
 */
  interface PCAParams extends org.apache.spark.ml.param.Params, org.apache.spark.ml.param.shared.HasInputCol, org.apache.spark.ml.param.shared.HasOutputCol {
  /**
   * The number of principal components.
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.IntParam k ()  ;
  /** @group getParam */
  public  int getK ()  ;
  /** Validates and transforms the input schema. */
  public  org.apache.spark.sql.types.StructType validateAndTransformSchema (org.apache.spark.sql.types.StructType schema)  ;
}
