package org.apache.spark.mllib.linalg.distributed;
/**
 * A grid partitioner, which uses a regular grid to partition coordinates.
 * <p>
 * param:  rows Number of rows.
 * param:  cols Number of columns.
 * param:  rowsPerPart Number of rows per partition, which may be less at the bottom edge.
 * param:  colsPerPart Number of columns per partition, which may be less at the right edge.
 */
  class GridPartitioner extends org.apache.spark.Partitioner {
  /** Creates a new {@link GridPartitioner} instance. */
  static public  org.apache.spark.mllib.linalg.distributed.GridPartitioner apply (int rows, int cols, int rowsPerPart, int colsPerPart)  { throw new RuntimeException(); }
  /** Creates a new {@link GridPartitioner} instance with the input suggested number of partitions. */
  static public  org.apache.spark.mllib.linalg.distributed.GridPartitioner apply (int rows, int cols, int suggestedNumPartitions)  { throw new RuntimeException(); }
  public  int rows ()  { throw new RuntimeException(); }
  public  int cols ()  { throw new RuntimeException(); }
  public  int rowsPerPart ()  { throw new RuntimeException(); }
  public  int colsPerPart ()  { throw new RuntimeException(); }
  // not preceding
  public   GridPartitioner (int rows, int cols, int rowsPerPart, int colsPerPart)  { throw new RuntimeException(); }
  private  int rowPartitions ()  { throw new RuntimeException(); }
  private  int colPartitions ()  { throw new RuntimeException(); }
  public  int numPartitions ()  { throw new RuntimeException(); }
  /**
   * Returns the index of the partition the input coordinate belongs to.
   * <p>
   * @param key The partition id i (calculated through this method for coordinate (i, j) in
   *            <code>simulateMultiply</code>, the coordinate (i, j) or a tuple (i, j, k), where k is
   *            the inner index used in multiplication. k is ignored in computing partitions.
   * @return The index of the partition, which the coordinate belongs to.
   */
  public  int getPartition (Object key)  { throw new RuntimeException(); }
  /** Partitions sub-matrices as blocks with neighboring sub-matrices. */
  private  int getPartitionId (int i, int j)  { throw new RuntimeException(); }
  public  boolean equals (Object obj)  { throw new RuntimeException(); }
  public  int hashCode ()  { throw new RuntimeException(); }
}
