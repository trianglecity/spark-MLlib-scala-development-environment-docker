package org.apache.spark.ml.tuning;
public  class ValidatorParams$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final ValidatorParams$ MODULE$ = null;
  public   ValidatorParams$ ()  { throw new RuntimeException(); }
  /**
   * Check that {@link ValidatorParams.evaluator} and {@link ValidatorParams.estimator} are Writable.
   * This does not check {@link ValidatorParams.estimatorParamMaps}.
   * @param instance (undocumented)
   */
  public  void validateParams (org.apache.spark.ml.tuning.ValidatorParams instance)  { throw new RuntimeException(); }
  /**
   * Generic implementation of save for {@link ValidatorParams} types.
   * This handles all {@link ValidatorParams} fields and saves {@link Param} values, but the implementing
   * class needs to handle model data.
   * @param path (undocumented)
   * @param instance (undocumented)
   * @param sc (undocumented)
   * @param extraMetadata (undocumented)
   */
  public  void saveImpl (java.lang.String path, org.apache.spark.ml.tuning.ValidatorParams instance, org.apache.spark.SparkContext sc, scala.Option<org.json4s.JsonAST.JObject> extraMetadata)  { throw new RuntimeException(); }
  /**
   * Generic implementation of load for {@link ValidatorParams} types.
   * This handles all {@link ValidatorParams} fields, but the implementing
   * class needs to handle model data and special {@link Param} values.
   * @param path (undocumented)
   * @param sc (undocumented)
   * @param expectedClassName (undocumented)
   * @return (undocumented)
   */
  public <M extends org.apache.spark.ml.Model<M>> scala.Tuple4<org.apache.spark.ml.util.DefaultParamsReader.Metadata, org.apache.spark.ml.Estimator<M>, org.apache.spark.ml.evaluation.Evaluator, org.apache.spark.ml.param.ParamMap[]> loadImpl (java.lang.String path, org.apache.spark.SparkContext sc, java.lang.String expectedClassName)  { throw new RuntimeException(); }
}
