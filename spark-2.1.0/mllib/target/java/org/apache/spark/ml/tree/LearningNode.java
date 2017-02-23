package org.apache.spark.ml.tree;
/**
 * Version of a node used in learning.  This uses vars so that we can modify nodes as we split the
 * tree by adding children, etc.
 * <p>
 * For now, we use node IDs.  These will be kept internal since we hope to remove node IDs
 * in the future, or at least change the indexing (so that we can support much deeper trees).
 * <p>
 * This node can either be:
 *  - a leaf node, with leftChild, rightChild, split set to null, or
 *  - an internal node, with all values set
 * <p>
 * param:  id  We currently use the same indexing as the old implementation in
 *            {@link org.apache.spark.mllib.tree.model.Node}, but this will change later.
 * param:  isLeaf  Indicates whether this node will definitely be a leaf in the learned tree,
 *                so that we do not need to consider splitting it further.
 * param:  stats  Impurity statistics for this node.
 */
  class LearningNode implements scala.Serializable {
  /** Create a node with some of its fields set. */
  static public  org.apache.spark.ml.tree.LearningNode apply (int id, boolean isLeaf, org.apache.spark.mllib.tree.model.ImpurityStats stats)  { throw new RuntimeException(); }
  /** Create an empty node with the given node index.  Values must be set later on. */
  static public  org.apache.spark.ml.tree.LearningNode emptyNode (int nodeIndex)  { throw new RuntimeException(); }
  /**
   * Return the index of the left child of this node.
   * @param nodeIndex (undocumented)
   * @return (undocumented)
   */
  static public  int leftChildIndex (int nodeIndex)  { throw new RuntimeException(); }
  /**
   * Return the index of the right child of this node.
   * @param nodeIndex (undocumented)
   * @return (undocumented)
   */
  static public  int rightChildIndex (int nodeIndex)  { throw new RuntimeException(); }
  /**
   * Get the parent index of the given node, or 0 if it is the root.
   * @param nodeIndex (undocumented)
   * @return (undocumented)
   */
  static public  int parentIndex (int nodeIndex)  { throw new RuntimeException(); }
  /**
   * Return the level of a tree which the given node is in.
   * @param nodeIndex (undocumented)
   * @return (undocumented)
   */
  static public  int indexToLevel (int nodeIndex)  { throw new RuntimeException(); }
  /**
   * Returns true if this is a left child.
   * Note: Returns false for the root.
   * @param nodeIndex (undocumented)
   * @return (undocumented)
   */
  static public  boolean isLeftChild (int nodeIndex)  { throw new RuntimeException(); }
  /**
   * Return the maximum number of nodes which can be in the given level of the tree.
   * @param level  Level of tree (0 = root).
   * @return (undocumented)
   */
  static public  int maxNodesInLevel (int level)  { throw new RuntimeException(); }
  /**
   * Return the index of the first node in the given level.
   * @param level  Level of tree (0 = root).
   * @return (undocumented)
   */
  static public  int startIndexInLevel (int level)  { throw new RuntimeException(); }
  /**
   * Traces down from a root node to get the node with the given node index.
   * This assumes the node exists.
   * @param nodeIndex (undocumented)
   * @param rootNode (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.ml.tree.LearningNode getNode (int nodeIndex, org.apache.spark.ml.tree.LearningNode rootNode)  { throw new RuntimeException(); }
  public  int id ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.ml.tree.LearningNode> leftChild ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.ml.tree.LearningNode> rightChild ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.ml.tree.Split> split ()  { throw new RuntimeException(); }
  public  boolean isLeaf ()  { throw new RuntimeException(); }
  public  org.apache.spark.mllib.tree.model.ImpurityStats stats ()  { throw new RuntimeException(); }
  // not preceding
  public   LearningNode (int id, scala.Option<org.apache.spark.ml.tree.LearningNode> leftChild, scala.Option<org.apache.spark.ml.tree.LearningNode> rightChild, scala.Option<org.apache.spark.ml.tree.Split> split, boolean isLeaf, org.apache.spark.mllib.tree.model.ImpurityStats stats)  { throw new RuntimeException(); }
  /**
   * Convert this {@link LearningNode} to a regular {@link Node}, and recurse on any children.
   * @return (undocumented)
   */
  public  org.apache.spark.ml.tree.Node toNode ()  { throw new RuntimeException(); }
  /**
   * Get the node index corresponding to this data point.
   * This function mimics prediction, passing an example from the root node down to a leaf
   * or unsplit node; that node's index is returned.
   * <p>
   * @param binnedFeatures  Binned feature vector for data point.
   * @param splits possible splits for all features, indexed (numFeatures)(numSplits)
   * @return Leaf index if the data point reaches a leaf.
   *         Otherwise, last node reachable in tree matching this example.
   *         Note: This is the global node index, i.e., the index used in the tree.
   *         This index is different from the index used during training a particular
   *         group of nodes on one call to
   *         {@link org.apache.spark.ml.tree.impl.RandomForest.findBestSplits()}.
   */
  public  int predictImpl (int[] binnedFeatures, org.apache.spark.ml.tree.Split[][] splits)  { throw new RuntimeException(); }
}
