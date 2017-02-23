package org.apache.spark.mllib.tree.model;
/**
 * :: DeveloperApi ::
 * Node in a decision tree.
 * <p>
 * About node indexing:
 *   Nodes are indexed from 1.  Node 1 is the root; nodes 2, 3 are the left, right children.
 *   Node index 0 is not used.
 * <p>
 * param:  id integer node id, from 1
 * param:  predict predicted value at the node
 * param:  impurity current node impurity
 * param:  isLeaf whether the node is a leaf
 * param:  split split to calculate left and right nodes
 * param:  leftNode  left child
 * param:  rightNode right child
 * param:  stats information gain stats
 */
public  class Node implements scala.Serializable, org.apache.spark.internal.Logging {
  /**
   * Return a node with the given node id (but nothing else set).
   * @param nodeIndex (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.mllib.tree.model.Node emptyNode (int nodeIndex)  { throw new RuntimeException(); }
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
  static public  org.apache.spark.mllib.tree.model.Node apply (int nodeIndex, org.apache.spark.mllib.tree.model.Predict predict, double impurity, boolean isLeaf)  { throw new RuntimeException(); }
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
  static public  org.apache.spark.mllib.tree.model.Node getNode (int nodeIndex, org.apache.spark.mllib.tree.model.Node rootNode)  { throw new RuntimeException(); }
  static protected  java.lang.String logName ()  { throw new RuntimeException(); }
  static protected  org.slf4j.Logger log ()  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  boolean isTraceEnabled ()  { throw new RuntimeException(); }
  static protected  void initializeLogIfNecessary (boolean isInterpreter)  { throw new RuntimeException(); }
  public  int id ()  { throw new RuntimeException(); }
  public  org.apache.spark.mllib.tree.model.Predict predict ()  { throw new RuntimeException(); }
  public  double impurity ()  { throw new RuntimeException(); }
  public  boolean isLeaf ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.mllib.tree.model.Split> split ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.mllib.tree.model.Node> leftNode ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.mllib.tree.model.Node> rightNode ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.mllib.tree.model.InformationGainStats> stats ()  { throw new RuntimeException(); }
  // not preceding
  public   Node (int id, org.apache.spark.mllib.tree.model.Predict predict, double impurity, boolean isLeaf, scala.Option<org.apache.spark.mllib.tree.model.Split> split, scala.Option<org.apache.spark.mllib.tree.model.Node> leftNode, scala.Option<org.apache.spark.mllib.tree.model.Node> rightNode, scala.Option<org.apache.spark.mllib.tree.model.InformationGainStats> stats)  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
  /**
   * predict value if node is not leaf
   * @param features feature value
   * @return predicted value
   */
  public  double predict (org.apache.spark.mllib.linalg.Vector features)  { throw new RuntimeException(); }
  /**
   * Returns a deep copy of the subtree rooted at this node.
   * @return (undocumented)
   */
    org.apache.spark.mllib.tree.model.Node deepCopy ()  { throw new RuntimeException(); }
  /**
   * Get the number of nodes in tree below this node, including leaf nodes.
   * E.g., if this is a leaf, returns 0.  If both children are leaves, returns 2.
   * @return (undocumented)
   */
    int numDescendants ()  { throw new RuntimeException(); }
  /**
   * Get depth of tree from this node.
   * E.g.: Depth 0 means this is a leaf node.
   * @return (undocumented)
   */
    int subtreeDepth ()  { throw new RuntimeException(); }
  /**
   * Recursive print function.
   * @param indentFactor  The number of spaces to add to each level of indentation.
   * @return (undocumented)
   */
    java.lang.String subtreeToString (int indentFactor)  { throw new RuntimeException(); }
  /** Returns an iterator that traverses (DFS, left to right) the subtree of this node. */
    scala.collection.Iterator<org.apache.spark.mllib.tree.model.Node> subtreeIterator ()  { throw new RuntimeException(); }
}
