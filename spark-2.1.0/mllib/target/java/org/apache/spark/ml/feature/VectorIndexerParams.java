package org.apache.spark.ml.feature;
/** Private trait for params for VectorIndexer and VectorIndexerModel */
  interface VectorIndexerParams extends org.apache.spark.ml.param.Params, org.apache.spark.ml.param.shared.HasInputCol, org.apache.spark.ml.param.shared.HasOutputCol {
  /**
   * Threshold for the number of values a categorical feature can take.
   * If a feature is found to have {@literal >} maxCategories values, then it is declared
   * continuous. Must be greater than or equal to 2.
   * <p>
   * (default = 20)
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.IntParam maxCategories ()  ;
  /** @group getParam */
  public  int getMaxCategories ()  ;
}
