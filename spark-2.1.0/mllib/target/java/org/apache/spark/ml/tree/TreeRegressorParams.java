package org.apache.spark.ml.tree;
/**
 * Parameters for Decision Tree-based regression algorithms.
 */
  interface TreeRegressorParams extends org.apache.spark.ml.param.Params {
  /**
   * Criterion used for information gain calculation (case-insensitive).
   * Supported: "variance".
   * (default = variance)
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.Param<java.lang.String> impurity ()  ;
  /**
   * @deprecated This method is deprecated and will be removed in 2.2.0.
   * @group setParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.tree.TreeRegressorParams setImpurity (java.lang.String value)  ;
  /** @group getParam */
  public  java.lang.String getImpurity ()  ;
  /** Convert new impurity to old impurity. */
    org.apache.spark.mllib.tree.impurity.Impurity getOldImpurity ()  ;
}
