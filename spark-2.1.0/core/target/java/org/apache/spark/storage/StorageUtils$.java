package org.apache.spark.storage;
/** Helper methods for storage-related objects. */
public  class StorageUtils$ implements org.apache.spark.internal.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final StorageUtils$ MODULE$ = null;
  public   StorageUtils$ ()  { throw new RuntimeException(); }
  /**
   * Attempt to clean up a ByteBuffer if it is memory-mapped. This uses an *unsafe* Sun API that
   * might cause errors if one attempts to read from the unmapped buffer, but it's better than
   * waiting for the GC to find it because that could lead to huge numbers of open files. There's
   * unfortunately no standard API to do this.
   * @param buffer (undocumented)
   */
  public  void dispose (java.nio.ByteBuffer buffer)  { throw new RuntimeException(); }
  /**
   * Update the given list of RDDInfo with the given list of storage statuses.
   * This method overwrites the old values stored in the RDDInfo's.
   * @param rddInfos (undocumented)
   * @param statuses (undocumented)
   */
  public  void updateRddInfo (scala.collection.Seq<org.apache.spark.storage.RDDInfo> rddInfos, scala.collection.Seq<org.apache.spark.storage.StorageStatus> statuses)  { throw new RuntimeException(); }
  /**
   * Return a mapping from block ID to its locations for each block that belongs to the given RDD.
   * @param rddId (undocumented)
   * @param statuses (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Map<org.apache.spark.storage.BlockId, scala.collection.Seq<java.lang.String>> getRddBlockLocations (int rddId, scala.collection.Seq<org.apache.spark.storage.StorageStatus> statuses)  { throw new RuntimeException(); }
}
