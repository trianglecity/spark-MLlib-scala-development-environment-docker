package org.apache.spark.storage;
/**
 * BlockManagerMasterEndpoint is an {@link ThreadSafeRpcEndpoint} on the master node to track statuses
 * of all slaves' block managers.
 */
  class BlockManagerMasterEndpoint implements org.apache.spark.rpc.ThreadSafeRpcEndpoint, org.apache.spark.internal.Logging {
  public  org.apache.spark.rpc.RpcEnv rpcEnv ()  { throw new RuntimeException(); }
  public  boolean isLocal ()  { throw new RuntimeException(); }
  // not preceding
  public   BlockManagerMasterEndpoint (org.apache.spark.rpc.RpcEnv rpcEnv, boolean isLocal, org.apache.spark.SparkConf conf, org.apache.spark.scheduler.LiveListenerBus listenerBus)  { throw new RuntimeException(); }
  private  scala.collection.mutable.HashMap<org.apache.spark.storage.BlockManagerId, org.apache.spark.storage.BlockManagerInfo> blockManagerInfo ()  { throw new RuntimeException(); }
  private  scala.collection.mutable.HashMap<java.lang.String, org.apache.spark.storage.BlockManagerId> blockManagerIdByExecutor ()  { throw new RuntimeException(); }
  private  java.util.HashMap<org.apache.spark.storage.BlockId, scala.collection.mutable.HashSet<org.apache.spark.storage.BlockManagerId>> blockLocations ()  { throw new RuntimeException(); }
  private  java.util.concurrent.ThreadPoolExecutor askThreadPool ()  { throw new RuntimeException(); }
  private  scala.concurrent.ExecutionContextExecutorService askExecutionContext ()  { throw new RuntimeException(); }
  private  org.apache.spark.storage.TopologyMapper topologyMapper ()  { throw new RuntimeException(); }
  public  scala.PartialFunction<java.lang.Object, scala.runtime.BoxedUnit> receiveAndReply (org.apache.spark.rpc.RpcCallContext context)  { throw new RuntimeException(); }
  private  scala.concurrent.Future<scala.collection.Seq<java.lang.Object>> removeRdd (int rddId)  { throw new RuntimeException(); }
  private  scala.concurrent.Future<scala.collection.Seq<java.lang.Object>> removeShuffle (int shuffleId)  { throw new RuntimeException(); }
  /**
   * Delegate RemoveBroadcast messages to each BlockManager because the master may not notified
   * of all broadcast blocks. If removeFromDriver is false, broadcast blocks are only removed
   * from the executors, but not from the driver.
   * @param broadcastId (undocumented)
   * @param removeFromDriver (undocumented)
   * @return (undocumented)
   */
  private  scala.concurrent.Future<scala.collection.Seq<java.lang.Object>> removeBroadcast (long broadcastId, boolean removeFromDriver)  { throw new RuntimeException(); }
  private  void removeBlockManager (org.apache.spark.storage.BlockManagerId blockManagerId)  { throw new RuntimeException(); }
  private  void removeExecutor (java.lang.String execId)  { throw new RuntimeException(); }
  /**
   * Return true if the driver knows about the given block manager. Otherwise, return false,
   * indicating that the block manager should re-register.
   * @param blockManagerId (undocumented)
   * @return (undocumented)
   */
  private  boolean heartbeatReceived (org.apache.spark.storage.BlockManagerId blockManagerId)  { throw new RuntimeException(); }
  private  void removeBlockFromWorkers (org.apache.spark.storage.BlockId blockId)  { throw new RuntimeException(); }
  private  scala.collection.immutable.Map<org.apache.spark.storage.BlockManagerId, scala.Tuple2<java.lang.Object, java.lang.Object>> memoryStatus ()  { throw new RuntimeException(); }
  private  org.apache.spark.storage.StorageStatus[] storageStatus ()  { throw new RuntimeException(); }
  /**
   * Return the block's status for all block managers, if any. NOTE: This is a
   * potentially expensive operation and should only be used for testing.
   * <p>
   * If askSlaves is true, the master queries each block manager for the most updated block
   * statuses. This is useful when the master is not informed of the given block by all block
   * managers.
   * @param blockId (undocumented)
   * @param askSlaves (undocumented)
   * @return (undocumented)
   */
  private  scala.collection.immutable.Map<org.apache.spark.storage.BlockManagerId, scala.concurrent.Future<scala.Option<org.apache.spark.storage.BlockStatus>>> blockStatus (org.apache.spark.storage.BlockId blockId, boolean askSlaves)  { throw new RuntimeException(); }
  /**
   * Return the ids of blocks present in all the block managers that match the given filter.
   * NOTE: This is a potentially expensive operation and should only be used for testing.
   * <p>
   * If askSlaves is true, the master queries each block manager for the most updated block
   * statuses. This is useful when the master is not informed of the given block by all block
   * managers.
   * @param filter (undocumented)
   * @param askSlaves (undocumented)
   * @return (undocumented)
   */
  private  scala.concurrent.Future<scala.collection.Seq<org.apache.spark.storage.BlockId>> getMatchingBlockIds (scala.Function1<org.apache.spark.storage.BlockId, java.lang.Object> filter, boolean askSlaves)  { throw new RuntimeException(); }
  /**
   * Returns the BlockManagerId with topology information populated, if available.
   * @param idWithoutTopologyInfo (undocumented)
   * @param maxMemSize (undocumented)
   * @param slaveEndpoint (undocumented)
   * @return (undocumented)
   */
  private  org.apache.spark.storage.BlockManagerId register (org.apache.spark.storage.BlockManagerId idWithoutTopologyInfo, long maxMemSize, org.apache.spark.rpc.RpcEndpointRef slaveEndpoint)  { throw new RuntimeException(); }
  private  boolean updateBlockInfo (org.apache.spark.storage.BlockManagerId blockManagerId, org.apache.spark.storage.BlockId blockId, org.apache.spark.storage.StorageLevel storageLevel, long memSize, long diskSize)  { throw new RuntimeException(); }
  private  scala.collection.Seq<org.apache.spark.storage.BlockManagerId> getLocations (org.apache.spark.storage.BlockId blockId)  { throw new RuntimeException(); }
  private  scala.collection.IndexedSeq<scala.collection.Seq<org.apache.spark.storage.BlockManagerId>> getLocationsMultipleBlockIds (org.apache.spark.storage.BlockId[] blockIds)  { throw new RuntimeException(); }
  /** Get the list of the peers of the given block manager */
  private  scala.collection.Seq<org.apache.spark.storage.BlockManagerId> getPeers (org.apache.spark.storage.BlockManagerId blockManagerId)  { throw new RuntimeException(); }
  /**
   * Returns an {@link RpcEndpointRef} of the {@link BlockManagerSlaveEndpoint} for sending RPC messages.
   * @param executorId (undocumented)
   * @return (undocumented)
   */
  private  scala.Option<org.apache.spark.rpc.RpcEndpointRef> getExecutorEndpointRef (java.lang.String executorId)  { throw new RuntimeException(); }
  public  void onStop ()  { throw new RuntimeException(); }
}
