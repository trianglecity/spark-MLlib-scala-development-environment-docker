package org.apache.spark.ml.clustering;
/**
 * Common params for KMeans and KMeansModel
 */
  interface KMeansParams extends org.apache.spark.ml.param.Params, org.apache.spark.ml.param.shared.HasMaxIter, org.apache.spark.ml.param.shared.HasFeaturesCol, org.apache.spark.ml.param.shared.HasSeed, org.apache.spark.ml.param.shared.HasPredictionCol, org.apache.spark.ml.param.shared.HasTol {
  /**
   * The number of clusters to create (k). Must be &amp;gt; 1. Note that it is possible for fewer than
   * k clusters to be returned, for example, if there are fewer than k distinct points to cluster.
   * Default: 2.
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.IntParam k ()  ;
  /** @group getParam */
  public  int getK ()  ;
  /**
   * Param for the initialization algorithm. This can be either "random" to choose random points as
   * initial cluster centers, or "k-means||" to use a parallel variant of k-means++
   * (Bahmani et al., Scalable K-Means++, VLDB 2012). Default: k-means||.
   * @group expertParam
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.Param<java.lang.String> initMode ()  ;
  /** @group expertGetParam */
  public  java.lang.String getInitMode ()  ;
  /**
   * Param for the number of steps for the k-means|| initialization mode. This is an advanced
   * setting -- the default of 2 is almost always enough. Must be &amp;gt; 0. Default: 2.
   * @group expertParam
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.IntParam initSteps ()  ;
  /** @group expertGetParam */
  public  int getInitSteps ()  ;
  /**
   * Validates and transforms the input schema.
   * @param schema input schema
   * @return output schema
   */
  public  org.apache.spark.sql.types.StructType validateAndTransformSchema (org.apache.spark.sql.types.StructType schema)  ;
}
