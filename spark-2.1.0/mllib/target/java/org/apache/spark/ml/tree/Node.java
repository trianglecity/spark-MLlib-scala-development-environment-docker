package org.apache.spark.ml.tree;
/**
 * Decision tree node interface.
 */
public abstract class Node implements scala.Serializable {
  /**
   * Create a new Node from the old Node format, recursively creating child nodes as needed.
   * @param oldNode (undocumented)
   * @param categoricalFeatures (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.ml.tree.Node fromOld (org.apache.spark.mllib.tree.model.Node oldNode, scala.collection.immutable.Map<java.lang.Object, java.lang.Object> categoricalFeatures)  { throw new RuntimeException(); }
  public   Node ()  { throw new RuntimeException(); }
  /** Prediction a leaf node makes, or which an internal node would make if it were a leaf node */
  public abstract  double prediction ()  ;
  /** Impurity measure at this node (for training data) */
  public abstract  double impurity ()  ;
  /**
   * Statistics aggregated from training data at this node, used to compute prediction, impurity,
   * and probabilities.
   * For classification, the array of class counts must be normalized to a probability distribution.
   * @return (undocumented)
   */
   abstract  org.apache.spark.mllib.tree.impurity.ImpurityCalculator impurityStats ()  ;
  /** Recursive prediction helper method */
   abstract  org.apache.spark.ml.tree.LeafNode predictImpl (org.apache.spark.ml.linalg.Vector features)  ;
  /**
   * Get the number of nodes in tree below this node, including leaf nodes.
   * E.g., if this is a leaf, returns 0.  If both children are leaves, returns 2.
   * @return (undocumented)
   */
   abstract  int numDescendants ()  ;
  /**
   * Recursive print function.
   * @param indentFactor  The number of spaces to add to each level of indentation.
   * @return (undocumented)
   */
   abstract  java.lang.String subtreeToString (int indentFactor)  ;
  /**
   * Get depth of tree from this node.
   * E.g.: Depth 0 means this is a leaf node.  Depth 1 means 1 internal and 2 leaf nodes.
   * @return (undocumented)
   */
   abstract  int subtreeDepth ()  ;
  /**
   * Create a copy of this node in the old Node format, recursively creating child nodes as needed.
   * @param id  Node ID using old format IDs
   * @return (undocumented)
   */
   abstract  org.apache.spark.mllib.tree.model.Node toOld (int id)  ;
  /**
   * Trace down the tree, and return the largest feature index used in any split.
   * @return  Max feature index used in a split, or -1 if there are no splits (single leaf node).
   */
   abstract  int maxSplitFeatureIndex ()  ;
  /** Returns a deep copy of the subtree rooted at this node. */
   abstract  org.apache.spark.ml.tree.Node deepCopy ()  ;
}
