package org.apache.spark.ml.tree;
public  class LearningNode$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final LearningNode$ MODULE$ = null;
  public   LearningNode$ ()  { throw new RuntimeException(); }
  /** Create a node with some of its fields set. */
  public  org.apache.spark.ml.tree.LearningNode apply (int id, boolean isLeaf, org.apache.spark.mllib.tree.model.ImpurityStats stats)  { throw new RuntimeException(); }
  /** Create an empty node with the given node index.  Values must be set later on. */
  public  org.apache.spark.ml.tree.LearningNode emptyNode (int nodeIndex)  { throw new RuntimeException(); }
  /**
   * Return the index of the left child of this node.
   * @param nodeIndex (undocumented)
   * @return (undocumented)
   */
  public  int leftChildIndex (int nodeIndex)  { throw new RuntimeException(); }
  /**
   * Return the index of the right child of this node.
   * @param nodeIndex (undocumented)
   * @return (undocumented)
   */
  public  int rightChildIndex (int nodeIndex)  { throw new RuntimeException(); }
  /**
   * Get the parent index of the given node, or 0 if it is the root.
   * @param nodeIndex (undocumented)
   * @return (undocumented)
   */
  public  int parentIndex (int nodeIndex)  { throw new RuntimeException(); }
  /**
   * Return the level of a tree which the given node is in.
   * @param nodeIndex (undocumented)
   * @return (undocumented)
   */
  public  int indexToLevel (int nodeIndex)  { throw new RuntimeException(); }
  /**
   * Returns true if this is a left child.
   * Note: Returns false for the root.
   * @param nodeIndex (undocumented)
   * @return (undocumented)
   */
  public  boolean isLeftChild (int nodeIndex)  { throw new RuntimeException(); }
  /**
   * Return the maximum number of nodes which can be in the given level of the tree.
   * @param level  Level of tree (0 = root).
   * @return (undocumented)
   */
  public  int maxNodesInLevel (int level)  { throw new RuntimeException(); }
  /**
   * Return the index of the first node in the given level.
   * @param level  Level of tree (0 = root).
   * @return (undocumented)
   */
  public  int startIndexInLevel (int level)  { throw new RuntimeException(); }
  /**
   * Traces down from a root node to get the node with the given node index.
   * This assumes the node exists.
   * @param nodeIndex (undocumented)
   * @param rootNode (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.tree.LearningNode getNode (int nodeIndex, org.apache.spark.ml.tree.LearningNode rootNode)  { throw new RuntimeException(); }
}
