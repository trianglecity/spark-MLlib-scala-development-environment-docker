package org.apache.spark.scheduler;
/**
 * A {@link MapStatus} implementation that only stores the average size of non-empty blocks,
 * plus a bitmap for tracking which blocks are empty.
 * <p>
 * param:  loc location where the task is being executed
 * param:  numNonEmptyBlocks the number of non-empty blocks
 * param:  emptyBlocks a bitmap tracking which blocks are empty
 * param:  avgSize average size of the non-empty blocks
 */
  class HighlyCompressedMapStatus implements org.apache.spark.scheduler.MapStatus, java.io.Externalizable {
  static public  org.apache.spark.scheduler.HighlyCompressedMapStatus apply (org.apache.spark.storage.BlockManagerId loc, long[] uncompressedSizes)  { throw new RuntimeException(); }
  private   HighlyCompressedMapStatus (org.apache.spark.storage.BlockManagerId loc, int numNonEmptyBlocks, org.roaringbitmap.RoaringBitmap emptyBlocks, long avgSize)  { throw new RuntimeException(); }
  protected   HighlyCompressedMapStatus ()  { throw new RuntimeException(); }
  public  org.apache.spark.storage.BlockManagerId location ()  { throw new RuntimeException(); }
  public  long getSizeForBlock (int reduceId)  { throw new RuntimeException(); }
  public  void writeExternal (java.io.ObjectOutput out)  { throw new RuntimeException(); }
  public  void readExternal (java.io.ObjectInput in)  { throw new RuntimeException(); }
}
