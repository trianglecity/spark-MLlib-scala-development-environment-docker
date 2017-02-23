package org.apache.spark.ml.tree.impl;
public  class NodeIdCache$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final NodeIdCache$ MODULE$ = null;
  public   NodeIdCache$ ()  { throw new RuntimeException(); }
  /**
   * Initialize the node Id cache with initial node Id values.
   * @param data The RDD of training rows.
   * @param numTrees The number of trees that we want to create cache for.
   * @param checkpointInterval The checkpointing interval
   *                           (how often should the cache be checkpointed.).
   * @param initVal The initial values in the cache.
   * @return A node Id cache containing an RDD of initial root node Indices.
   */
  public  org.apache.spark.ml.tree.impl.NodeIdCache init (org.apache.spark.rdd.RDD<org.apache.spark.ml.tree.impl.BaggedPoint<org.apache.spark.ml.tree.impl.TreePoint>> data, int numTrees, int checkpointInterval, int initVal)  { throw new RuntimeException(); }
}
