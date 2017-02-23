package org.apache.spark.ml.tree;
  interface GBTRegressorParams extends org.apache.spark.ml.tree.GBTParams, org.apache.spark.ml.tree.TreeRegressorParams {
  /**
   * Loss function which GBT tries to minimize. (case-insensitive)
   * Supported: "squared" (L2) and "absolute" (L1)
   * (default = squared)
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.Param<java.lang.String> lossType ()  ;
  /** @group getParam */
  public  java.lang.String getLossType ()  ;
  /** (private[ml]) Convert new loss to old loss. */
    org.apache.spark.mllib.tree.loss.Loss getOldLossType ()  ;
}
