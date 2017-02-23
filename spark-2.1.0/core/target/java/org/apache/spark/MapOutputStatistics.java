package org.apache.spark;
/**
 * Holds statistics about the output sizes in a map stage. May become a DeveloperApi in the future.
 * <p>
 * param:  shuffleId ID of the shuffle
 * param:  bytesByPartitionId approximate number of output bytes for each map output partition
 *   (may be inexact due to use of compressed map statuses)
 */
  class MapOutputStatistics {
  public  int shuffleId ()  { throw new RuntimeException(); }
  public  long[] bytesByPartitionId ()  { throw new RuntimeException(); }
  // not preceding
  public   MapOutputStatistics (int shuffleId, long[] bytesByPartitionId)  { throw new RuntimeException(); }
}
