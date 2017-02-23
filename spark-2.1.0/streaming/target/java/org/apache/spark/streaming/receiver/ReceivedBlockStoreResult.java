package org.apache.spark.streaming.receiver;
/** Trait that represents the metadata related to storage of blocks */
  interface ReceivedBlockStoreResult {
  public  org.apache.spark.storage.StreamBlockId blockId ()  ;
  public  scala.Option<java.lang.Object> numRecords ()  ;
}
