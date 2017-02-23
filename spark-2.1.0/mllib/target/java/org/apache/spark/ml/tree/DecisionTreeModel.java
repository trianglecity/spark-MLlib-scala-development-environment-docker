package org.apache.spark.ml.tree;
/**
 * Abstraction for Decision Tree models.
 * <p>
 * TODO: Add support for predicting probabilities and raw predictions  SPARK-3727
 */
  interface DecisionTreeModel {
  /** Root of the decision tree */
  public  org.apache.spark.ml.tree.Node rootNode ()  ;
  /** Number of nodes in tree, including leaf nodes. */
  public  int numNodes ()  ;
  /**
   * Depth of the tree.
   * E.g.: Depth 0 means 1 leaf node.  Depth 1 means 1 internal node and 2 leaf nodes.
   * @return (undocumented)
   */
  public  int depth ()  ;
  /** Summary of the model */
  public  java.lang.String toString ()  ;
  /** Full description of model */
  public  java.lang.String toDebugString ()  ;
  /**
   * Trace down the tree, and return the largest feature index used in any split.
   * <p>
   * @return  Max feature index used in a split, or -1 if there are no splits (single leaf node).
   */
    int maxSplitFeatureIndex ()  ;
  /** Convert to spark.mllib DecisionTreeModel (losing some information) */
    org.apache.spark.mllib.tree.model.DecisionTreeModel toOld ()  ;
}
