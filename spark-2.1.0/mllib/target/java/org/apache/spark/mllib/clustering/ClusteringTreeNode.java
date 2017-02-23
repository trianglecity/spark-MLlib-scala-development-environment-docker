package org.apache.spark.mllib.clustering;
/**
 * Represents a node in a clustering tree.
 * <p>
 * param:  index node index, negative for internal nodes and non-negative for leaf nodes
 * param:  size size of the cluster
 * param:  centerWithNorm cluster center with norm
 * param:  cost cost of the cluster, i.e., the sum of squared distances to the center
 * param:  height height of the node in the dendrogram. Currently this is defined as the max distance
 *               from the center to the centers of the children's, but subject to change.
 * param:  children children nodes
 */
  class ClusteringTreeNode implements scala.Serializable {
  public  int index ()  { throw new RuntimeException(); }
  public  long size ()  { throw new RuntimeException(); }
    org.apache.spark.mllib.clustering.VectorWithNorm centerWithNorm ()  { throw new RuntimeException(); }
  public  double cost ()  { throw new RuntimeException(); }
  public  double height ()  { throw new RuntimeException(); }
  public  org.apache.spark.mllib.clustering.ClusteringTreeNode[] children ()  { throw new RuntimeException(); }
  // not preceding
     ClusteringTreeNode (int index, long size, org.apache.spark.mllib.clustering.VectorWithNorm centerWithNorm, double cost, double height, org.apache.spark.mllib.clustering.ClusteringTreeNode[] children)  { throw new RuntimeException(); }
  /** Whether this is a leaf node. */
  public  boolean isLeaf ()  { throw new RuntimeException(); }
  /** Cluster center. */
  public  org.apache.spark.mllib.linalg.Vector center ()  { throw new RuntimeException(); }
  /** Predicts the leaf cluster node index that the input point belongs to. */
  public  int predict (org.apache.spark.mllib.linalg.Vector point)  { throw new RuntimeException(); }
  /** Returns the full prediction path from root to leaf. */
  public  org.apache.spark.mllib.clustering.ClusteringTreeNode[] predictPath (org.apache.spark.mllib.linalg.Vector point)  { throw new RuntimeException(); }
  /** Returns the full prediction path from root to leaf. */
  private  scala.collection.immutable.List<org.apache.spark.mllib.clustering.ClusteringTreeNode> predictPath (org.apache.spark.mllib.clustering.VectorWithNorm pointWithNorm)  { throw new RuntimeException(); }
  /**
   * Computes the cost (squared distance to the predicted leaf cluster center) of the input point.
   * @param point (undocumented)
   * @return (undocumented)
   */
  public  double computeCost (org.apache.spark.mllib.linalg.Vector point)  { throw new RuntimeException(); }
  /**
   * Predicts the cluster index and the cost of the input point.
   * @param pointWithNorm (undocumented)
   * @return (undocumented)
   */
  private  scala.Tuple2<java.lang.Object, java.lang.Object> predict (org.apache.spark.mllib.clustering.VectorWithNorm pointWithNorm)  { throw new RuntimeException(); }
  /**
   * Predicts the cluster index and the cost of the input point.
   * @param pointWithNorm input point
   * @param cost the cost to the current center
   * @return (predicted leaf cluster index, cost)
   */
  private  scala.Tuple2<java.lang.Object, java.lang.Object> predict (org.apache.spark.mllib.clustering.VectorWithNorm pointWithNorm, double cost)  { throw new RuntimeException(); }
  /**
   * Returns all leaf nodes from this node.
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.clustering.ClusteringTreeNode[] leafNodes ()  { throw new RuntimeException(); }
}
