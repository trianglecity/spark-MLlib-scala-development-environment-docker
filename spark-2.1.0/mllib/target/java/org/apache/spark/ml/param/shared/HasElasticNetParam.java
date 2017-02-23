package org.apache.spark.ml.param.shared;
/**
 * Trait for shared param elasticNetParam.
 */
  interface HasElasticNetParam extends org.apache.spark.ml.param.Params {
  /**
   * Param for the ElasticNet mixing parameter, in range [0, 1]. For alpha = 0, the penalty is an L2 penalty. For alpha = 1, it is an L1 penalty.
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.DoubleParam elasticNetParam ()  ;
  /** @group getParam */
  public  double getElasticNetParam ()  ;
}
