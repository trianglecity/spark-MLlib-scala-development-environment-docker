package org.apache.spark.ml.tree;
/**
 * Abstraction for models which are ensembles of decision trees
 * <p>
 * TODO: Add support for predicting probabilities and raw predictions  SPARK-3727
 * <p>
 * @tparam M  Type of tree model in this ensemble
 */
  interface TreeEnsembleModel<M extends org.apache.spark.ml.tree.DecisionTreeModel> {
  /** Trees in this ensemble. Warning: These have null parent Estimators. */
  public  M[] trees ()  ;
  /** Weights for each tree, zippable with {@link trees} */
  public  double[] treeWeights ()  ;
  /** Weights used by the python wrappers. */
    org.apache.spark.ml.linalg.Vector javaTreeWeights ()  ;
  /** Summary of the model */
  public  java.lang.String toString ()  ;
  /** Full description of model */
  public  java.lang.String toDebugString ()  ;
  /** Total number of nodes, summed over all trees in the ensemble. */
  public  int totalNumNodes ()  ;
}
