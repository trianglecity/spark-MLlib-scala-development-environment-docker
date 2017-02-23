package org.apache.spark.ml.regression;
/**
 * Params for Generalized Linear Regression.
 */
  interface GeneralizedLinearRegressionBase extends org.apache.spark.ml.PredictorParams, org.apache.spark.ml.param.shared.HasFitIntercept, org.apache.spark.ml.param.shared.HasMaxIter, org.apache.spark.ml.param.shared.HasTol, org.apache.spark.ml.param.shared.HasRegParam, org.apache.spark.ml.param.shared.HasWeightCol, org.apache.spark.ml.param.shared.HasSolver, org.apache.spark.internal.Logging {
  /**
   * Param for the name of family which is a description of the error distribution
   * to be used in the model.
   * Supported options: "gaussian", "binomial", "poisson" and "gamma".
   * Default is "gaussian".
   * <p>
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.Param<java.lang.String> family ()  ;
  /** @group getParam */
  public  java.lang.String getFamily ()  ;
  /**
   * Param for the name of link function which provides the relationship
   * between the linear predictor and the mean of the distribution function.
   * Supported options: "identity", "log", "inverse", "logit", "probit", "cloglog" and "sqrt".
   * <p>
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.Param<java.lang.String> link ()  ;
  /** @group getParam */
  public  java.lang.String getLink ()  ;
  /**
   * Param for link prediction (linear predictor) column name.
   * Default is not set, which means we do not output link prediction.
   * <p>
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.Param<java.lang.String> linkPredictionCol ()  ;
  /** @group getParam */
  public  java.lang.String getLinkPredictionCol ()  ;
  /** Checks whether we should output link prediction. */
    boolean hasLinkPredictionCol ()  ;
  public  org.apache.spark.sql.types.StructType validateAndTransformSchema (org.apache.spark.sql.types.StructType schema, boolean fitting, org.apache.spark.sql.types.DataType featuresDataType)  ;
}
