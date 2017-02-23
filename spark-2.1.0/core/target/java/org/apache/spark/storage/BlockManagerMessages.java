package org.apache.spark.storage;
public  class BlockManagerMessages {
  static public  class RemoveBlock implements org.apache.spark.storage.BlockManagerMessages.ToBlockManagerSlave, scala.Product, scala.Serializable {
    public  org.apache.spark.storage.BlockId blockId ()  { throw new RuntimeException(); }
    // not preceding
    public   RemoveBlock (org.apache.spark.storage.BlockId blockId)  { throw new RuntimeException(); }
  }
  static public  class RemoveBlock$ extends scala.runtime.AbstractFunction1<org.apache.spark.storage.BlockId, org.apache.spark.storage.BlockManagerMessages.RemoveBlock> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final RemoveBlock$ MODULE$ = null;
    public   RemoveBlock$ ()  { throw new RuntimeException(); }
  }
  static public  class RemoveRdd implements org.apache.spark.storage.BlockManagerMessages.ToBlockManagerSlave, scala.Product, scala.Serializable {
    public  int rddId ()  { throw new RuntimeException(); }
    // not preceding
    public   RemoveRdd (int rddId)  { throw new RuntimeException(); }
  }
  static public  class RemoveRdd$ extends scala.runtime.AbstractFunction1<java.lang.Object, org.apache.spark.storage.BlockManagerMessages.RemoveRdd> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final RemoveRdd$ MODULE$ = null;
    public   RemoveRdd$ ()  { throw new RuntimeException(); }
  }
  static public  class RemoveShuffle implements org.apache.spark.storage.BlockManagerMessages.ToBlockManagerSlave, scala.Product, scala.Serializable {
    public  int shuffleId ()  { throw new RuntimeException(); }
    // not preceding
    public   RemoveShuffle (int shuffleId)  { throw new RuntimeException(); }
  }
  static public  class RemoveShuffle$ extends scala.runtime.AbstractFunction1<java.lang.Object, org.apache.spark.storage.BlockManagerMessages.RemoveShuffle> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final RemoveShuffle$ MODULE$ = null;
    public   RemoveShuffle$ ()  { throw new RuntimeException(); }
  }
  static public  class RemoveBroadcast implements org.apache.spark.storage.BlockManagerMessages.ToBlockManagerSlave, scala.Product, scala.Serializable {
    public  long broadcastId ()  { throw new RuntimeException(); }
    public  boolean removeFromDriver ()  { throw new RuntimeException(); }
    // not preceding
    public   RemoveBroadcast (long broadcastId, boolean removeFromDriver)  { throw new RuntimeException(); }
  }
  static public  class RemoveBroadcast$ extends scala.runtime.AbstractFunction2<java.lang.Object, java.lang.Object, org.apache.spark.storage.BlockManagerMessages.RemoveBroadcast> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final RemoveBroadcast$ MODULE$ = null;
    public   RemoveBroadcast$ ()  { throw new RuntimeException(); }
  }
  /**
   * Driver to Executor message to trigger a thread dump.
   */
  static public  class TriggerThreadDump$ implements org.apache.spark.storage.BlockManagerMessages.ToBlockManagerSlave, scala.Product, scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final TriggerThreadDump$ MODULE$ = null;
    public   TriggerThreadDump$ ()  { throw new RuntimeException(); }
  }
  static public  class RegisterBlockManager implements org.apache.spark.storage.BlockManagerMessages.ToBlockManagerMaster, scala.Product, scala.Serializable {
    public  org.apache.spark.storage.BlockManagerId blockManagerId ()  { throw new RuntimeException(); }
    public  long maxMemSize ()  { throw new RuntimeException(); }
    public  org.apache.spark.rpc.RpcEndpointRef sender ()  { throw new RuntimeException(); }
    // not preceding
    public   RegisterBlockManager (org.apache.spark.storage.BlockManagerId blockManagerId, long maxMemSize, org.apache.spark.rpc.RpcEndpointRef sender)  { throw new RuntimeException(); }
  }
  static public  class RegisterBlockManager$ extends scala.runtime.AbstractFunction3<org.apache.spark.storage.BlockManagerId, java.lang.Object, org.apache.spark.rpc.RpcEndpointRef, org.apache.spark.storage.BlockManagerMessages.RegisterBlockManager> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final RegisterBlockManager$ MODULE$ = null;
    public   RegisterBlockManager$ ()  { throw new RuntimeException(); }
  }
  static public  class UpdateBlockInfo implements org.apache.spark.storage.BlockManagerMessages.ToBlockManagerMaster, java.io.Externalizable, scala.Product, scala.Serializable {
    public  org.apache.spark.storage.BlockManagerId blockManagerId ()  { throw new RuntimeException(); }
    public  org.apache.spark.storage.BlockId blockId ()  { throw new RuntimeException(); }
    public  org.apache.spark.storage.StorageLevel storageLevel ()  { throw new RuntimeException(); }
    public  long memSize ()  { throw new RuntimeException(); }
    public  long diskSize ()  { throw new RuntimeException(); }
    // not preceding
    public   UpdateBlockInfo (org.apache.spark.storage.BlockManagerId blockManagerId, org.apache.spark.storage.BlockId blockId, org.apache.spark.storage.StorageLevel storageLevel, long memSize, long diskSize)  { throw new RuntimeException(); }
    public   UpdateBlockInfo ()  { throw new RuntimeException(); }
    public  void writeExternal (java.io.ObjectOutput out)  { throw new RuntimeException(); }
    public  void readExternal (java.io.ObjectInput in)  { throw new RuntimeException(); }
  }
  static public  class UpdateBlockInfo$ extends scala.runtime.AbstractFunction5<org.apache.spark.storage.BlockManagerId, org.apache.spark.storage.BlockId, org.apache.spark.storage.StorageLevel, java.lang.Object, java.lang.Object, org.apache.spark.storage.BlockManagerMessages.UpdateBlockInfo> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final UpdateBlockInfo$ MODULE$ = null;
    public   UpdateBlockInfo$ ()  { throw new RuntimeException(); }
  }
  static public  class GetLocations implements org.apache.spark.storage.BlockManagerMessages.ToBlockManagerMaster, scala.Product, scala.Serializable {
    public  org.apache.spark.storage.BlockId blockId ()  { throw new RuntimeException(); }
    // not preceding
    public   GetLocations (org.apache.spark.storage.BlockId blockId)  { throw new RuntimeException(); }
  }
  static public  class GetLocations$ extends scala.runtime.AbstractFunction1<org.apache.spark.storage.BlockId, org.apache.spark.storage.BlockManagerMessages.GetLocations> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final GetLocations$ MODULE$ = null;
    public   GetLocations$ ()  { throw new RuntimeException(); }
  }
  static public  class GetLocationsMultipleBlockIds implements org.apache.spark.storage.BlockManagerMessages.ToBlockManagerMaster, scala.Product, scala.Serializable {
    public  org.apache.spark.storage.BlockId[] blockIds ()  { throw new RuntimeException(); }
    // not preceding
    public   GetLocationsMultipleBlockIds (org.apache.spark.storage.BlockId[] blockIds)  { throw new RuntimeException(); }
  }
  static public  class GetLocationsMultipleBlockIds$ extends scala.runtime.AbstractFunction1<org.apache.spark.storage.BlockId[], org.apache.spark.storage.BlockManagerMessages.GetLocationsMultipleBlockIds> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final GetLocationsMultipleBlockIds$ MODULE$ = null;
    public   GetLocationsMultipleBlockIds$ ()  { throw new RuntimeException(); }
  }
  static public  class GetPeers implements org.apache.spark.storage.BlockManagerMessages.ToBlockManagerMaster, scala.Product, scala.Serializable {
    public  org.apache.spark.storage.BlockManagerId blockManagerId ()  { throw new RuntimeException(); }
    // not preceding
    public   GetPeers (org.apache.spark.storage.BlockManagerId blockManagerId)  { throw new RuntimeException(); }
  }
  static public  class GetPeers$ extends scala.runtime.AbstractFunction1<org.apache.spark.storage.BlockManagerId, org.apache.spark.storage.BlockManagerMessages.GetPeers> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final GetPeers$ MODULE$ = null;
    public   GetPeers$ ()  { throw new RuntimeException(); }
  }
  static public  class GetExecutorEndpointRef implements org.apache.spark.storage.BlockManagerMessages.ToBlockManagerMaster, scala.Product, scala.Serializable {
    public  java.lang.String executorId ()  { throw new RuntimeException(); }
    // not preceding
    public   GetExecutorEndpointRef (java.lang.String executorId)  { throw new RuntimeException(); }
  }
  static public  class GetExecutorEndpointRef$ extends scala.runtime.AbstractFunction1<java.lang.String, org.apache.spark.storage.BlockManagerMessages.GetExecutorEndpointRef> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final GetExecutorEndpointRef$ MODULE$ = null;
    public   GetExecutorEndpointRef$ ()  { throw new RuntimeException(); }
  }
  static public  class RemoveExecutor implements org.apache.spark.storage.BlockManagerMessages.ToBlockManagerMaster, scala.Product, scala.Serializable {
    public  java.lang.String execId ()  { throw new RuntimeException(); }
    // not preceding
    public   RemoveExecutor (java.lang.String execId)  { throw new RuntimeException(); }
  }
  static public  class RemoveExecutor$ extends scala.runtime.AbstractFunction1<java.lang.String, org.apache.spark.storage.BlockManagerMessages.RemoveExecutor> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final RemoveExecutor$ MODULE$ = null;
    public   RemoveExecutor$ ()  { throw new RuntimeException(); }
  }
  static public  class StopBlockManagerMaster$ implements org.apache.spark.storage.BlockManagerMessages.ToBlockManagerMaster, scala.Product, scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final StopBlockManagerMaster$ MODULE$ = null;
    public   StopBlockManagerMaster$ ()  { throw new RuntimeException(); }
  }
  static public  class GetMemoryStatus$ implements org.apache.spark.storage.BlockManagerMessages.ToBlockManagerMaster, scala.Product, scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final GetMemoryStatus$ MODULE$ = null;
    public   GetMemoryStatus$ ()  { throw new RuntimeException(); }
  }
  static public  class GetStorageStatus$ implements org.apache.spark.storage.BlockManagerMessages.ToBlockManagerMaster, scala.Product, scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final GetStorageStatus$ MODULE$ = null;
    public   GetStorageStatus$ ()  { throw new RuntimeException(); }
  }
  static public  class GetBlockStatus implements org.apache.spark.storage.BlockManagerMessages.ToBlockManagerMaster, scala.Product, scala.Serializable {
    public  org.apache.spark.storage.BlockId blockId ()  { throw new RuntimeException(); }
    public  boolean askSlaves ()  { throw new RuntimeException(); }
    // not preceding
    public   GetBlockStatus (org.apache.spark.storage.BlockId blockId, boolean askSlaves)  { throw new RuntimeException(); }
  }
  static public  class GetBlockStatus$ extends scala.runtime.AbstractFunction2<org.apache.spark.storage.BlockId, java.lang.Object, org.apache.spark.storage.BlockManagerMessages.GetBlockStatus> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final GetBlockStatus$ MODULE$ = null;
    public   GetBlockStatus$ ()  { throw new RuntimeException(); }
  }
  static public  class GetMatchingBlockIds implements org.apache.spark.storage.BlockManagerMessages.ToBlockManagerMaster, scala.Product, scala.Serializable {
    public  scala.Function1<org.apache.spark.storage.BlockId, java.lang.Object> filter ()  { throw new RuntimeException(); }
    public  boolean askSlaves ()  { throw new RuntimeException(); }
    // not preceding
    public   GetMatchingBlockIds (scala.Function1<org.apache.spark.storage.BlockId, java.lang.Object> filter, boolean askSlaves)  { throw new RuntimeException(); }
  }
  static public  class GetMatchingBlockIds$ extends scala.runtime.AbstractFunction2<scala.Function1<org.apache.spark.storage.BlockId, java.lang.Object>, java.lang.Object, org.apache.spark.storage.BlockManagerMessages.GetMatchingBlockIds> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final GetMatchingBlockIds$ MODULE$ = null;
    public   GetMatchingBlockIds$ ()  { throw new RuntimeException(); }
  }
  static public  class BlockManagerHeartbeat implements org.apache.spark.storage.BlockManagerMessages.ToBlockManagerMaster, scala.Product, scala.Serializable {
    public  org.apache.spark.storage.BlockManagerId blockManagerId ()  { throw new RuntimeException(); }
    // not preceding
    public   BlockManagerHeartbeat (org.apache.spark.storage.BlockManagerId blockManagerId)  { throw new RuntimeException(); }
  }
  static public  class BlockManagerHeartbeat$ extends scala.runtime.AbstractFunction1<org.apache.spark.storage.BlockManagerId, org.apache.spark.storage.BlockManagerMessages.BlockManagerHeartbeat> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final BlockManagerHeartbeat$ MODULE$ = null;
    public   BlockManagerHeartbeat$ ()  { throw new RuntimeException(); }
  }
  static public  class HasCachedBlocks implements org.apache.spark.storage.BlockManagerMessages.ToBlockManagerMaster, scala.Product, scala.Serializable {
    public  java.lang.String executorId ()  { throw new RuntimeException(); }
    // not preceding
    public   HasCachedBlocks (java.lang.String executorId)  { throw new RuntimeException(); }
  }
  static public  class HasCachedBlocks$ extends scala.runtime.AbstractFunction1<java.lang.String, org.apache.spark.storage.BlockManagerMessages.HasCachedBlocks> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final HasCachedBlocks$ MODULE$ = null;
    public   HasCachedBlocks$ ()  { throw new RuntimeException(); }
  }
  static public  interface ToBlockManagerSlave {
  }
  static public  interface ToBlockManagerMaster {
  }
}
