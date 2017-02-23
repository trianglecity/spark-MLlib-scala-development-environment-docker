package org.apache.spark.rdd;
public  class LocalRDDCheckpointData$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final LocalRDDCheckpointData$ MODULE$ = null;
  public   LocalRDDCheckpointData$ ()  { throw new RuntimeException(); }
  public  org.apache.spark.storage.StorageLevel DEFAULT_STORAGE_LEVEL ()  { throw new RuntimeException(); }
  /**
   * Transform the specified storage level to one that uses disk.
   * <p>
   * This guarantees that the RDD can be recomputed multiple times correctly as long as
   * executors do not fail. Otherwise, if the RDD is cached in memory only, for instance,
   * the checkpoint data will be lost if the relevant block is evicted from memory.
   * <p>
   * This method is idempotent.
   * @param level (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.storage.StorageLevel transformStorageLevel (org.apache.spark.storage.StorageLevel level)  { throw new RuntimeException(); }
}
