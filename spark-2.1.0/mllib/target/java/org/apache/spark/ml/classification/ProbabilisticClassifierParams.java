package org.apache.spark.ml.classification;
/**
 * (private[classification])  Params for probabilistic classification.
 */
  interface ProbabilisticClassifierParams extends org.apache.spark.ml.classification.ClassifierParams, org.apache.spark.ml.param.shared.HasProbabilityCol, org.apache.spark.ml.param.shared.HasThresholds {
  public  org.apache.spark.sql.types.StructType validateAndTransformSchema (org.apache.spark.sql.types.StructType schema, boolean fitting, org.apache.spark.sql.types.DataType featuresDataType)  ;
}
