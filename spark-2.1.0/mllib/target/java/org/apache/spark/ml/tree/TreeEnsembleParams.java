package org.apache.spark.ml.tree;
/**
 * Parameters for Decision Tree-based ensemble algorithms.
 * <p>
 * Note: Marked as private and DeveloperApi since this may be made public in the future.
 */
  interface TreeEnsembleParams extends org.apache.spark.ml.tree.DecisionTreeParams {
  /**
   * Fraction of the training data used for learning each decision tree, in range (0, 1].
   * (default = 1.0)
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.DoubleParam subsamplingRate ()  ;
  /**
   * @deprecated This method is deprecated and will be removed in 2.2.0.
   * @group setParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.tree.TreeEnsembleParams setSubsamplingRate (double value)  ;
  /** @group getParam */
  public  double getSubsamplingRate ()  ;
  /**
   * Create a Strategy instance to use with the old API.
   * NOTE: The caller should set impurity and seed.
   * @param categoricalFeatures (undocumented)
   * @param numClasses (undocumented)
   * @param oldAlgo (undocumented)
   * @param oldImpurity (undocumented)
   * @return (undocumented)
   */
    org.apache.spark.mllib.tree.configuration.Strategy getOldStrategy (scala.collection.immutable.Map<java.lang.Object, java.lang.Object> categoricalFeatures, int numClasses, scala.Enumeration.Value oldAlgo, org.apache.spark.mllib.tree.impurity.Impurity oldImpurity)  ;
}
