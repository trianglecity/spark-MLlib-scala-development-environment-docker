package org.apache.spark.mllib.clustering;
public  class BisectingKMeans$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final BisectingKMeans$ MODULE$ = null;
  public   BisectingKMeans$ ()  { throw new RuntimeException(); }
  /** The index of the root node of a tree. */
  private  long ROOT_INDEX ()  { throw new RuntimeException(); }
  private  long MAX_DIVISIBLE_CLUSTER_INDEX ()  { throw new RuntimeException(); }
  private  double LEVEL_LIMIT ()  { throw new RuntimeException(); }
  /** Returns the left child index of the given node index. */
  private  long leftChildIndex (long index)  { throw new RuntimeException(); }
  /** Returns the right child index of the given node index. */
  private  long rightChildIndex (long index)  { throw new RuntimeException(); }
  /** Returns the parent index of the given node index, or 0 if the input is 1 (root). */
  private  long parentIndex (long index)  { throw new RuntimeException(); }
  /**
   * Summarizes data by each cluster as Map.
   * @param d feature dimension
   * @param assignments pairs of point and its cluster index
   * @return a map from cluster indices to corresponding cluster summaries
   */
  private  scala.collection.immutable.Map<java.lang.Object, org.apache.spark.mllib.clustering.BisectingKMeans.ClusterSummary> summarize (int d, org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, org.apache.spark.mllib.clustering.VectorWithNorm>> assignments)  { throw new RuntimeException(); }
  /**
   * Bisects a cluster center.
   * <p>
   * @param center current cluster center
   * @param random a random number generator
   * @return initial centers
   */
  private  scala.Tuple2<org.apache.spark.mllib.clustering.VectorWithNorm, org.apache.spark.mllib.clustering.VectorWithNorm> splitCenter (org.apache.spark.mllib.clustering.VectorWithNorm center, java.util.Random random)  { throw new RuntimeException(); }
  /**
   * Updates assignments.
   * @param assignments current assignments
   * @param divisibleIndices divisible cluster indices
   * @param newClusterCenters new cluster centers
   * @return new assignments
   */
  private  org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, org.apache.spark.mllib.clustering.VectorWithNorm>> updateAssignments (org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, org.apache.spark.mllib.clustering.VectorWithNorm>> assignments, scala.collection.immutable.Set<java.lang.Object> divisibleIndices, scala.collection.immutable.Map<java.lang.Object, org.apache.spark.mllib.clustering.VectorWithNorm> newClusterCenters)  { throw new RuntimeException(); }
  /**
   * Builds a clustering tree by re-indexing internal and leaf clusters.
   * @param clusters a map from cluster indices to corresponding cluster summaries
   * @return the root node of the clustering tree
   */
  private  org.apache.spark.mllib.clustering.ClusteringTreeNode buildTree (scala.collection.immutable.Map<java.lang.Object, org.apache.spark.mllib.clustering.BisectingKMeans.ClusterSummary> clusters)  { throw new RuntimeException(); }
}
