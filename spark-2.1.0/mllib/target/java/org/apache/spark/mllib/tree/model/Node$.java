package org.apache.spark.mllib.tree.model;
public  class Node$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final Node$ MODULE$ = null;
  public   Node$ ()  { throw new RuntimeException(); }
  /**
   * Return a node with the given node id (but nothing else set).
   * @param nodeIndex (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.tree.model.Node emptyNode (int nodeIndex)  { throw new RuntimeException(); }
  /**
   * Construct a node with nodeIndex, predict, impurity and isLeaf parameters.
   * This is used in <code>DecisionTree.findBestSplits</code> to construct child nodes
   * after finding the best splits for parent nodes.
   * Other fields are set at next level.
   * @param nodeIndex integer node id, from 1
   * @param predict predicted value at the node
   * @param impurity current node impurity
   * @param isLeaf whether the node is a leaf
   * @return new node instance
   */
  public  org.apache.spark.mllib.tree.model.Node apply (int nodeIndex, org.apache.spark.mllib.tree.model.Predict predict, double impurity, boolean isLeaf)  { throw new RuntimeException(); }
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
  public  org.apache.spark.mllib.tree.model.Node getNode (int nodeIndex, org.apache.spark.mllib.tree.model.Node rootNode)  { throw new RuntimeException(); }
}
