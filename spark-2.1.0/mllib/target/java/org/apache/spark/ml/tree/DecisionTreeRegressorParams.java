package org.apache.spark.ml.tree;
  interface DecisionTreeRegressorParams extends org.apache.spark.ml.tree.DecisionTreeParams, org.apache.spark.ml.tree.TreeRegressorParams, org.apache.spark.ml.param.shared.HasVarianceCol {
  public  org.apache.spark.sql.types.StructType validateAndTransformSchema (org.apache.spark.sql.types.StructType schema, boolean fitting, org.apache.spark.sql.types.DataType featuresDataType)  ;
}
