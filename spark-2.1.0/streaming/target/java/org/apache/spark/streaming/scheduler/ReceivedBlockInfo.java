package org.apache.spark.streaming.scheduler;
/** Information about blocks received by the receiver */
  class ReceivedBlockInfo implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  int streamId ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> numRecords ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> metadataOption ()  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.receiver.ReceivedBlockStoreResult blockStoreResult ()  { throw new RuntimeException(); }
  // not preceding
  public   ReceivedBlockInfo (int streamId, scala.Option<java.lang.Object> numRecords, scala.Option<java.lang.Object> metadataOption, org.apache.spark.streaming.receiver.ReceivedBlockStoreResult blockStoreResult)  { throw new RuntimeException(); }
  private  boolean _isBlockIdValid ()  { throw new RuntimeException(); }
  public  org.apache.spark.storage.StreamBlockId blockId ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.streaming.util.WriteAheadLogRecordHandle> walRecordHandleOption ()  { throw new RuntimeException(); }
  /** Is the block ID valid, that is, is the block present in the Spark executors. */
  public  boolean isBlockIdValid ()  { throw new RuntimeException(); }
  /**
   * Set the block ID as invalid. This is useful when it is known that the block is not present
   * in the Spark executors.
   */
  public  void setBlockIdInvalid ()  { throw new RuntimeException(); }
}
