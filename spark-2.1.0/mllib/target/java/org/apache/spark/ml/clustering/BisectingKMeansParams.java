package org.apache.spark.ml.clustering;
/**
 * Common params for BisectingKMeans and BisectingKMeansModel
 */
  interface BisectingKMeansParams extends org.apache.spark.ml.param.Params, org.apache.spark.ml.param.shared.HasMaxIter, org.apache.spark.ml.param.shared.HasFeaturesCol, org.apache.spark.ml.param.shared.HasSeed, org.apache.spark.ml.param.shared.HasPredictionCol {
  /**
   * The desired number of leaf clusters. Must be &amp;gt; 1. Default: 4.
   * The actual number could be smaller if there are no divisible leaf clusters.
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.IntParam k ()  ;
  /** @group getParam */
  public  int getK ()  ;
  /**
   * The minimum number of points (if greater than or equal to 1.0) or the minimum proportion
   * of points (if less than 1.0) of a divisible cluster (default: 1.0).
   * @group expertParam
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.DoubleParam minDivisibleClusterSize ()  ;
  /** @group expertGetParam */
  public  double getMinDivisibleClusterSize ()  ;
  /**
   * Validates and transforms the input schema.
   * @param schema input schema
   * @return output schema
   */
  public  org.apache.spark.sql.types.StructType validateAndTransformSchema (org.apache.spark.sql.types.StructType schema)  ;
}
