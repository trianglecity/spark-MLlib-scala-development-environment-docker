package org.apache.spark.ml.r;
public  class RWrapperUtils$ implements org.apache.spark.internal.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final RWrapperUtils$ MODULE$ = null;
  public   RWrapperUtils$ ()  { throw new RuntimeException(); }
  /**
   * DataFrame column check.
   * When loading libsvm data, default columns "features" and "label" will be added.
   * And "features" would conflict with RFormula default feature column names.
   * Here is to change the column name to avoid "column already exists" error.
   * <p>
   * @param rFormula RFormula instance
   * @param data Input dataset
   */
  public  void checkDataColumns (org.apache.spark.ml.feature.RFormula rFormula, org.apache.spark.sql.Dataset<?> data)  { throw new RuntimeException(); }
  /**
   * Get the feature names and original labels from the schema
   * of DataFrame transformed by RFormulaModel.
   * <p>
   * @param rFormulaModel The RFormulaModel instance.
   * @param data Input dataset.
   * @return The feature names and original labels.
   */
  public  scala.Tuple2<java.lang.String[], java.lang.String[]> getFeaturesAndLabels (org.apache.spark.ml.feature.RFormulaModel rFormulaModel, org.apache.spark.sql.Dataset<?> data)  { throw new RuntimeException(); }
}
