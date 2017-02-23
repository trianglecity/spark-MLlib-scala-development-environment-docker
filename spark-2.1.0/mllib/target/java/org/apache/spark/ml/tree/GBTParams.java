package org.apache.spark.ml.tree;
/**
 * Parameters for Gradient-Boosted Tree algorithms.
 * <p>
 * Note: Marked as private and DeveloperApi since this may be made public in the future.
 */
  interface GBTParams extends org.apache.spark.ml.tree.TreeEnsembleParams, org.apache.spark.ml.param.shared.HasMaxIter {
  /**
   * @deprecated This method is deprecated and will be removed in 2.2.0.
   * @group setParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.tree.GBTParams setMaxIter (int value)  ;
  /**
   * Param for Step size (a.k.a. learning rate) in interval (0, 1] for shrinking
   * the contribution of each estimator.
   * (default = 0.1)
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.DoubleParam stepSize ()  ;
  /** @group getParam */
  public  double getStepSize ()  ;
  /**
   * @deprecated This method is deprecated and will be removed in 2.2.0.
   * @group setParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.tree.GBTParams setStepSize (double value)  ;
  /** (private[ml]) Create a BoostingStrategy instance to use with the old API. */
    org.apache.spark.mllib.tree.configuration.BoostingStrategy getOldBoostingStrategy (scala.collection.immutable.Map<java.lang.Object, java.lang.Object> categoricalFeatures, scala.Enumeration.Value oldAlgo)  ;
  /** Get old Gradient Boosting Loss type */
    org.apache.spark.mllib.tree.loss.Loss getOldLossType ()  ;
}
