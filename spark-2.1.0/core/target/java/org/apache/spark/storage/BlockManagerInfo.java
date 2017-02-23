package org.apache.spark.storage;
  class BlockManagerInfo implements org.apache.spark.internal.Logging {
  public  org.apache.spark.storage.BlockManagerId blockManagerId ()  { throw new RuntimeException(); }
  public  long maxMem ()  { throw new RuntimeException(); }
  public  org.apache.spark.rpc.RpcEndpointRef slaveEndpoint ()  { throw new RuntimeException(); }
  // not preceding
  public   BlockManagerInfo (org.apache.spark.storage.BlockManagerId blockManagerId, long timeMs, long maxMem, org.apache.spark.rpc.RpcEndpointRef slaveEndpoint)  { throw new RuntimeException(); }
  private  long _lastSeenMs ()  { throw new RuntimeException(); }
  private  long _remainingMem ()  { throw new RuntimeException(); }
  private  java.util.HashMap<org.apache.spark.storage.BlockId, org.apache.spark.storage.BlockStatus> _blocks ()  { throw new RuntimeException(); }
  private  scala.collection.mutable.HashSet<org.apache.spark.storage.BlockId> _cachedBlocks ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.storage.BlockStatus> getStatus (org.apache.spark.storage.BlockId blockId)  { throw new RuntimeException(); }
  public  void updateLastSeenMs ()  { throw new RuntimeException(); }
  public  void updateBlockInfo (org.apache.spark.storage.BlockId blockId, org.apache.spark.storage.StorageLevel storageLevel, long memSize, long diskSize)  { throw new RuntimeException(); }
  public  void removeBlock (org.apache.spark.storage.BlockId blockId)  { throw new RuntimeException(); }
  public  long remainingMem ()  { throw new RuntimeException(); }
  public  long lastSeenMs ()  { throw new RuntimeException(); }
  public  java.util.HashMap<org.apache.spark.storage.BlockId, org.apache.spark.storage.BlockStatus> blocks ()  { throw new RuntimeException(); }
  public  scala.collection.Set<org.apache.spark.storage.BlockId> cachedBlocks ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  void clear ()  { throw new RuntimeException(); }
}
