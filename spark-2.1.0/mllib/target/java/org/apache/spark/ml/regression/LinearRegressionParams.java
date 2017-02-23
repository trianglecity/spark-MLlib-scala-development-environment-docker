package org.apache.spark.ml.regression;
/**
 * Params for linear regression.
 */
  interface LinearRegressionParams extends org.apache.spark.ml.PredictorParams, org.apache.spark.ml.param.shared.HasRegParam, org.apache.spark.ml.param.shared.HasElasticNetParam, org.apache.spark.ml.param.shared.HasMaxIter, org.apache.spark.ml.param.shared.HasTol, org.apache.spark.ml.param.shared.HasFitIntercept, org.apache.spark.ml.param.shared.HasStandardization, org.apache.spark.ml.param.shared.HasWeightCol, org.apache.spark.ml.param.shared.HasSolver, org.apache.spark.ml.param.shared.HasAggregationDepth {
}
