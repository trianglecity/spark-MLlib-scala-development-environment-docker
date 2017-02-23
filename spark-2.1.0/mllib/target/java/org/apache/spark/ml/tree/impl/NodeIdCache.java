package org.apache.spark.ml.tree.impl;
/**
 * Each TreePoint belongs to a particular node per tree.
 * Each row in the nodeIdsForInstances RDD is an array over trees of the node index
 * in each tree. Initially, values should all be 1 for root node.
 * The nodeIdsForInstances RDD needs to be updated at each iteration.
 * param:  nodeIdsForInstances The initial values in the cache
 *                           (should be an Array of all 1's (meaning the root nodes)).
 * param:  checkpointInterval The checkpointing interval
 *                           (how often should the cache be checkpointed.).
 */
  class NodeIdCache implements org.apache.spark.internal.Logging {
  /**
   * Initialize the node Id cache with initial node Id values.
   * @param data The RDD of training rows.
   * @param numTrees The number of trees that we want to create cache for.
   * @param checkpointInterval The checkpointing interval
   *                           (how often should the cache be checkpointed.).
   * @param initVal The initial values in the cache.
   * @return A node Id cache containing an RDD of initial root node Indices.
   */
  static public  org.apache.spark.ml.tree.impl.NodeIdCache init (org.apache.spark.rdd.RDD<org.apache.spark.ml.tree.impl.BaggedPoint<org.apache.spark.ml.tree.impl.TreePoint>> data, int numTrees, int checkpointInterval, int initVal)  { throw new RuntimeException(); }
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
  public  org.apache.spark.rdd.RDD<int[]> nodeIdsForInstances ()  { throw new RuntimeException(); }
  public  int checkpointInterval ()  { throw new RuntimeException(); }
  // not preceding
  public   NodeIdCache (org.apache.spark.rdd.RDD<int[]> nodeIdsForInstances, int checkpointInterval)  { throw new RuntimeException(); }
  private  org.apache.spark.rdd.RDD<int[]> prevNodeIdsForInstances ()  { throw new RuntimeException(); }
  private  scala.collection.mutable.Queue<org.apache.spark.rdd.RDD<int[]>> checkpointQueue ()  { throw new RuntimeException(); }
  private  int rddUpdateCount ()  { throw new RuntimeException(); }
  private  boolean canCheckpoint ()  { throw new RuntimeException(); }
  private  org.apache.hadoop.conf.Configuration hadoopConf ()  { throw new RuntimeException(); }
  /**
   * Update the node index values in the cache.
   * This updates the RDD and its lineage.
   * TODO: Passing bin information to executors seems unnecessary and costly.
   * @param data The RDD of training rows.
   * @param nodeIdUpdaters A map of node index updaters.
   *                       The key is the indices of nodes that we want to update.
   * @param splits  Split information needed to find child node indices.
   */
  public  void updateNodeIndices (org.apache.spark.rdd.RDD<org.apache.spark.ml.tree.impl.BaggedPoint<org.apache.spark.ml.tree.impl.TreePoint>> data, scala.collection.mutable.Map<java.lang.Object, org.apache.spark.ml.tree.impl.NodeIndexUpdater>[] nodeIdUpdaters, org.apache.spark.ml.tree.Split[][] splits)  { throw new RuntimeException(); }
  /**
   * Call this after training is finished to delete any remaining checkpoints.
   */
  public  void deleteAllCheckpoints ()  { throw new RuntimeException(); }
}
