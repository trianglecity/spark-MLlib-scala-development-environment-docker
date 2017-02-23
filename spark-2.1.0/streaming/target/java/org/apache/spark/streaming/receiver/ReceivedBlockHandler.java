package org.apache.spark.streaming.receiver;
/** Trait that represents a class that handles the storage of blocks received by receiver */
  interface ReceivedBlockHandler {
  /** Store a received block with the given block id and return related metadata */
  public  org.apache.spark.streaming.receiver.ReceivedBlockStoreResult storeBlock (org.apache.spark.storage.StreamBlockId blockId, org.apache.spark.streaming.receiver.ReceivedBlock receivedBlock)  ;
  /** Cleanup old blocks older than the given threshold time */
  public  void cleanupOldBlocks (long threshTime)  ;
}
