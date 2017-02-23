package org.apache.spark.util.collection;
/**
 * Iterator that writes elements to a DiskBlockObjectWriter instead of returning them. Each element
 * has an associated partition.
 */
  interface WritablePartitionedIterator {
  public  void writeNext (org.apache.spark.storage.DiskBlockObjectWriter writer)  ;
  public  boolean hasNext ()  ;
  public  int nextPartition ()  ;
}
