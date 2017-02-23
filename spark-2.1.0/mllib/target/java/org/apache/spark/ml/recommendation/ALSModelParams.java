package org.apache.spark.ml.recommendation;
/**
 * Common params for ALS and ALSModel.
 */
  interface ALSModelParams extends org.apache.spark.ml.param.Params, org.apache.spark.ml.param.shared.HasPredictionCol {
  /**
   * Param for the column name for user ids. Ids must be integers. Other
   * numeric types are supported for this column, but will be cast to integers as long as they
   * fall within the integer value range.
   * Default: "user"
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.Param<java.lang.String> userCol ()  ;
  /** @group getParam */
  public  java.lang.String getUserCol ()  ;
  /**
   * Param for the column name for item ids. Ids must be integers. Other
   * numeric types are supported for this column, but will be cast to integers as long as they
   * fall within the integer value range.
   * Default: "item"
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.Param<java.lang.String> itemCol ()  ;
  /** @group getParam */
  public  java.lang.String getItemCol ()  ;
  /**
   * Attempts to safely cast a user/item id to an Int. Throws an exception if the value is
   * out of integer range.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.expressions.UserDefinedFunction checkedCast ()  ;
}
