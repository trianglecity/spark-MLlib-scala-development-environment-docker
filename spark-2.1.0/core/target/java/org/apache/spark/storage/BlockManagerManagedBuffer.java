package org.apache.spark.storage;
/**
 * This {@link ManagedBuffer} wraps a {@link ChunkedByteBuffer} retrieved from the {@link BlockManager}
 * so that the corresponding block's read lock can be released once this buffer's references
 * are released.
 * <p>
 * This is effectively a wrapper / bridge to connect the BlockManager's notion of read locks
 * to the network layer's notion of retain / release counts.
 */
  class BlockManagerManagedBuffer extends org.apache.spark.network.buffer.NettyManagedBuffer {
  public   BlockManagerManagedBuffer (org.apache.spark.storage.BlockInfoManager blockInfoManager, org.apache.spark.storage.BlockId blockId, org.apache.spark.util.io.ChunkedByteBuffer chunkedBuffer)  { throw new RuntimeException(); }
  public  org.apache.spark.network.buffer.ManagedBuffer retain ()  { throw new RuntimeException(); }
  public  org.apache.spark.network.buffer.ManagedBuffer release ()  { throw new RuntimeException(); }
}
