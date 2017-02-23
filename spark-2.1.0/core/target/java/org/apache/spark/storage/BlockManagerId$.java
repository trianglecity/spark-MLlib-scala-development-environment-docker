package org.apache.spark.storage;
public  class BlockManagerId$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final BlockManagerId$ MODULE$ = null;
  public   BlockManagerId$ ()  { throw new RuntimeException(); }
  /**
   * Returns a {@link org.apache.spark.storage.BlockManagerId} for the given configuration.
   * <p>
   * @param execId ID of the executor.
   * @param host Host name of the block manager.
   * @param port Port of the block manager.
   * @param topologyInfo topology information for the blockmanager, if available
   *                     This can be network topology information for use while choosing peers
   *                     while replicating data blocks. More information available here:
   *                     {@link org.apache.spark.storage.TopologyMapper}
   * @return A new {@link org.apache.spark.storage.BlockManagerId}.
   */
  public  org.apache.spark.storage.BlockManagerId apply (java.lang.String execId, java.lang.String host, int port, scala.Option<java.lang.String> topologyInfo)  { throw new RuntimeException(); }
  public  org.apache.spark.storage.BlockManagerId apply (java.io.ObjectInput in)  { throw new RuntimeException(); }
  public  java.util.concurrent.ConcurrentHashMap<org.apache.spark.storage.BlockManagerId, org.apache.spark.storage.BlockManagerId> blockManagerIdCache ()  { throw new RuntimeException(); }
  public  org.apache.spark.storage.BlockManagerId getCachedBlockManagerId (org.apache.spark.storage.BlockManagerId id)  { throw new RuntimeException(); }
}
