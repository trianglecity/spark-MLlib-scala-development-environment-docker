package org.apache.spark.ml.tuning;
/**
 * Common params for {@link TrainValidationSplitParams} and {@link CrossValidatorParams}.
 */
  interface ValidatorParams extends org.apache.spark.ml.param.shared.HasSeed, org.apache.spark.ml.param.Params {
  /**
   * param for the estimator to be validated
   * <p>
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.Param<org.apache.spark.ml.Estimator<?>> estimator ()  ;
  /** @group getParam */
  public  org.apache.spark.ml.Estimator<?> getEstimator ()  ;
  /**
   * param for estimator param maps
   * <p>
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.Param<org.apache.spark.ml.param.ParamMap[]> estimatorParamMaps ()  ;
  /** @group getParam */
  public  org.apache.spark.ml.param.ParamMap[] getEstimatorParamMaps ()  ;
  /**
   * param for the evaluator used to select hyper-parameters that maximize the validated metric
   * <p>
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.Param<org.apache.spark.ml.evaluation.Evaluator> evaluator ()  ;
  /** @group getParam */
  public  org.apache.spark.ml.evaluation.Evaluator getEvaluator ()  ;
  public  org.apache.spark.sql.types.StructType transformSchemaImpl (org.apache.spark.sql.types.StructType schema)  ;
}
