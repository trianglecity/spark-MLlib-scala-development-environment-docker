package org.apache.spark.storage;
  class BlockManagerMaster implements org.apache.spark.internal.Logging {
  static public  java.lang.String DRIVER_ENDPOINT_NAME ()  { throw new RuntimeException(); }
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
  public  org.apache.spark.rpc.RpcEndpointRef driverEndpoint ()  { throw new RuntimeException(); }
  // not preceding
  public   BlockManagerMaster (org.apache.spark.rpc.RpcEndpointRef driverEndpoint, org.apache.spark.SparkConf conf, boolean isDriver)  { throw new RuntimeException(); }
  public  org.apache.spark.rpc.RpcTimeout timeout ()  { throw new RuntimeException(); }
  /** Remove a dead executor from the driver endpoint. This is only called on the driver side. */
  public  void removeExecutor (java.lang.String execId)  { throw new RuntimeException(); }
  /** Request removal of a dead executor from the driver endpoint.
   *  This is only called on the driver side. Non-blocking
   * @param execId (undocumented)
   */
  public  void removeExecutorAsync (java.lang.String execId)  { throw new RuntimeException(); }
  /**
   * Register the BlockManager's id with the driver. The input BlockManagerId does not contain
   * topology information. This information is obtained from the master and we respond with an
   * updated BlockManagerId fleshed out with this information.
   * @param blockManagerId (undocumented)
   * @param maxMemSize (undocumented)
   * @param slaveEndpoint (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.storage.BlockManagerId registerBlockManager (org.apache.spark.storage.BlockManagerId blockManagerId, long maxMemSize, org.apache.spark.rpc.RpcEndpointRef slaveEndpoint)  { throw new RuntimeException(); }
  public  boolean updateBlockInfo (org.apache.spark.storage.BlockManagerId blockManagerId, org.apache.spark.storage.BlockId blockId, org.apache.spark.storage.StorageLevel storageLevel, long memSize, long diskSize)  { throw new RuntimeException(); }
  /** Get locations of the blockId from the driver */
  public  scala.collection.Seq<org.apache.spark.storage.BlockManagerId> getLocations (org.apache.spark.storage.BlockId blockId)  { throw new RuntimeException(); }
  /** Get locations of multiple blockIds from the driver */
  public  scala.collection.IndexedSeq<scala.collection.Seq<org.apache.spark.storage.BlockManagerId>> getLocations (org.apache.spark.storage.BlockId[] blockIds)  { throw new RuntimeException(); }
  /**
   * Check if block manager master has a block. Note that this can be used to check for only
   * those blocks that are reported to block manager master.
   * @param blockId (undocumented)
   * @return (undocumented)
   */
  public  boolean contains (org.apache.spark.storage.BlockId blockId)  { throw new RuntimeException(); }
  /** Get ids of other nodes in the cluster from the driver */
  public  scala.collection.Seq<org.apache.spark.storage.BlockManagerId> getPeers (org.apache.spark.storage.BlockManagerId blockManagerId)  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.rpc.RpcEndpointRef> getExecutorEndpointRef (java.lang.String executorId)  { throw new RuntimeException(); }
  /**
   * Remove a block from the slaves that have it. This can only be used to remove
   * blocks that the driver knows about.
   * @param blockId (undocumented)
   */
  public  void removeBlock (org.apache.spark.storage.BlockId blockId)  { throw new RuntimeException(); }
  /** Remove all blocks belonging to the given RDD. */
  public  void removeRdd (int rddId, boolean blocking)  { throw new RuntimeException(); }
  /** Remove all blocks belonging to the given shuffle. */
  public  void removeShuffle (int shuffleId, boolean blocking)  { throw new RuntimeException(); }
  /** Remove all blocks belonging to the given broadcast. */
  public  void removeBroadcast (long broadcastId, boolean removeFromMaster, boolean blocking)  { throw new RuntimeException(); }
  /**
   * Return the memory status for each block manager, in the form of a map from
   * the block manager's id to two long values. The first value is the maximum
   * amount of memory allocated for the block manager, while the second is the
   * amount of remaining memory.
   * @return (undocumented)
   */
  public  scala.collection.immutable.Map<org.apache.spark.storage.BlockManagerId, scala.Tuple2<java.lang.Object, java.lang.Object>> getMemoryStatus ()  { throw new RuntimeException(); }
  public  org.apache.spark.storage.StorageStatus[] getStorageStatus ()  { throw new RuntimeException(); }
  /**
   * Return the block's status on all block managers, if any. NOTE: This is a
   * potentially expensive operation and should only be used for testing.
   * <p>
   * If askSlaves is true, this invokes the master to query each block manager for the most
   * updated block statuses. This is useful when the master is not informed of the given block
   * by all block managers.
   * @param blockId (undocumented)
   * @param askSlaves (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.immutable.Map<org.apache.spark.storage.BlockManagerId, org.apache.spark.storage.BlockStatus> getBlockStatus (org.apache.spark.storage.BlockId blockId, boolean askSlaves)  { throw new RuntimeException(); }
  /**
   * Return a list of ids of existing blocks such that the ids match the given filter. NOTE: This
   * is a potentially expensive operation and should only be used for testing.
   * <p>
   * If askSlaves is true, this invokes the master to query each block manager for the most
   * updated block statuses. This is useful when the master is not informed of the given block
   * by all block managers.
   * @param filter (undocumented)
   * @param askSlaves (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Seq<org.apache.spark.storage.BlockId> getMatchingBlockIds (scala.Function1<org.apache.spark.storage.BlockId, java.lang.Object> filter, boolean askSlaves)  { throw new RuntimeException(); }
  /**
   * Find out if the executor has cached blocks. This method does not consider broadcast blocks,
   * since they are not reported the master.
   * @param executorId (undocumented)
   * @return (undocumented)
   */
  public  boolean hasCachedBlocks (java.lang.String executorId)  { throw new RuntimeException(); }
  /** Stop the driver endpoint, called only on the Spark driver node */
  public  void stop ()  { throw new RuntimeException(); }
  /** Send a one-way message to the master endpoint, to which we expect it to reply with true. */
  private  void tell (Object message)  { throw new RuntimeException(); }
}
