package org.apache.spark.streaming.receiver;
/**
 * Implementation of a {@link org.apache.spark.streaming.receiver.ReceivedBlockHandler} which
 * stores the received blocks into a block manager with the specified storage level.
 */
  class BlockManagerBasedBlockHandler implements org.apache.spark.streaming.receiver.ReceivedBlockHandler, org.apache.spark.internal.Logging {
  public   BlockManagerBasedBlockHandler (org.apache.spark.storage.BlockManager blockManager, org.apache.spark.storage.StorageLevel storageLevel)  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.receiver.ReceivedBlockStoreResult storeBlock (org.apache.spark.storage.StreamBlockId blockId, org.apache.spark.streaming.receiver.ReceivedBlock block)  { throw new RuntimeException(); }
  public  void cleanupOldBlocks (long threshTime)  { throw new RuntimeException(); }
}
