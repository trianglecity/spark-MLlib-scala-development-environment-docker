package org.apache.spark.shuffle;
/**
 * Implementers of this trait understand how to retrieve block data for a logical shuffle block
 * identifier (i.e. map, reduce, and shuffle). Implementations may use files or file segments to
 * encapsulate shuffle data. This is used by the BlockStore to abstract over different shuffle
 * implementations when shuffle data is retrieved.
 */
  interface ShuffleBlockResolver {
  /**
   * Retrieve the data for the specified block. If the data for that block is not available,
   * throws an unspecified exception.
   * @param blockId (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.network.buffer.ManagedBuffer getBlockData (org.apache.spark.storage.ShuffleBlockId blockId)  ;
  public  void stop ()  ;
}
