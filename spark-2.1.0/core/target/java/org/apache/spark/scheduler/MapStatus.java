package org.apache.spark.scheduler;
/**
 * Result returned by a ShuffleMapTask to a scheduler. Includes the block manager address that the
 * task ran on as well as the sizes of outputs for each reducer, for passing on to the reduce tasks.
 */
  interface MapStatus {
  /** Location where this task was run. */
  public  org.apache.spark.storage.BlockManagerId location ()  ;
  /**
   * Estimated size for the reduce block, in bytes.
   * <p>
   * If a block is non-empty, then this method MUST return a non-zero size.  This invariant is
   * necessary for correctness, since block fetchers are allowed to skip zero-size blocks.
   * @param reduceId (undocumented)
   * @return (undocumented)
   */
  public  long getSizeForBlock (int reduceId)  ;
}
