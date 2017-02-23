package org.apache.spark.storage;
/**
 * :: DeveloperApi ::
 * Stores information about a block status in a block manager.
 */
public  class BlockUpdatedInfo implements scala.Product, scala.Serializable {
  static   org.apache.spark.storage.BlockUpdatedInfo apply (org.apache.spark.storage.BlockManagerMessages.UpdateBlockInfo updateBlockInfo)  { throw new RuntimeException(); }
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  org.apache.spark.storage.BlockManagerId blockManagerId ()  { throw new RuntimeException(); }
  public  org.apache.spark.storage.BlockId blockId ()  { throw new RuntimeException(); }
  public  org.apache.spark.storage.StorageLevel storageLevel ()  { throw new RuntimeException(); }
  public  long memSize ()  { throw new RuntimeException(); }
  public  long diskSize ()  { throw new RuntimeException(); }
  // not preceding
  public   BlockUpdatedInfo (org.apache.spark.storage.BlockManagerId blockManagerId, org.apache.spark.storage.BlockId blockId, org.apache.spark.storage.StorageLevel storageLevel, long memSize, long diskSize)  { throw new RuntimeException(); }
}
