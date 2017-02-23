package org.apache.spark.ml.feature;
/**
 * Params for {@link LSH}.
 */
  interface LSHParams extends org.apache.spark.ml.param.shared.HasInputCol, org.apache.spark.ml.param.shared.HasOutputCol {
  /**
   * Param for the number of hash tables used in LSH OR-amplification.
   * <p>
   * LSH OR-amplification can be used to reduce the false negative rate. Higher values for this
   * param lead to a reduced false negative rate, at the expense of added computational complexity.
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.IntParam numHashTables ()  ;
  /** @group getParam */
  public  int getNumHashTables ()  ;
  /**
   * Transform the Schema for LSH
   * @param schema The schema of the input dataset without {@link outputCol}.
   * @return A derived schema with {@link outputCol} added.
   */
  public  org.apache.spark.sql.types.StructType validateAndTransformSchema (org.apache.spark.sql.types.StructType schema)  ;
}
