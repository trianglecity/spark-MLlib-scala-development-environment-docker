package org.apache.spark.ml.feature;
/**
 * Base trait for {@link RFormula} and {@link RFormulaModel}.
 */
  interface RFormulaBase extends org.apache.spark.ml.param.shared.HasFeaturesCol, org.apache.spark.ml.param.shared.HasLabelCol {
  public  boolean hasLabelCol (org.apache.spark.sql.types.StructType schema)  ;
}
