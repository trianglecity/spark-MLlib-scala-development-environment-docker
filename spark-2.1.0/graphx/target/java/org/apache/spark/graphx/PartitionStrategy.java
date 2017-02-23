package org.apache.spark.graphx;
/**
 * Represents the way edges are assigned to edge partitions based on their source and destination
 * vertex IDs.
 */
public  interface PartitionStrategy extends scala.Serializable {
  /**
   * Assigns edges to partitions using a 2D partitioning of the sparse edge adjacency matrix,
   * guaranteeing a <code>2 * sqrt(numParts)</code> bound on vertex replication.
   * <p>
   * Suppose we have a graph with 12 vertices that we want to partition
   * over 9 machines.  We can use the following sparse matrix representation:
   * <p>
   * <pre>
   *       __________________________________
   *  v0   | P0 *     | P1       | P2    *  |
   *  v1   |  ****    |  *       |          |
   *  v2   |  ******* |      **  |  ****    |
   *  v3   |  *****   |  *  *    |       *  |
   *       ----------------------------------
   *  v4   | P3 *     | P4 ***   | P5 **  * |
   *  v5   |  *  *    |  *       |          |
   *  v6   |       *  |      **  |  ****    |
   *  v7   |  * * *   |  *  *    |       *  |
   *       ----------------------------------
   *  v8   | P6   *   | P7    *  | P8  *   *|
   *  v9   |     *    |  *    *  |          |
   *  v10  |       *  |      **  |  *  *    |
   *  v11  | * &lt;-E    |  ***     |       ** |
   *       ----------------------------------
   * </pre>
   * <p>
   * The edge denoted by <code>E</code> connects <code>v11</code> with <code>v1</code> and is assigned to processor <code>P6</code>. To get the
   * processor number we divide the matrix into <code>sqrt(numParts)</code> by <code>sqrt(numParts)</code> blocks. Notice
   * that edges adjacent to <code>v11</code> can only be in the first column of blocks <code>(P0, P3,
   * P6)</code> or the last
   * row of blocks <code>(P6, P7, P8)</code>.  As a consequence we can guarantee that <code>v11</code> will need to be
   * replicated to at most <code>2 * sqrt(numParts)</code> machines.
   * <p>
   * Notice that <code>P0</code> has many edges and as a consequence this partitioning would lead to poor work
   * balance.  To improve balance we first multiply each vertex id by a large prime to shuffle the
   * vertex locations.
   * <p>
   * When the number of partitions requested is not a perfect square we use a slightly different
   * method where the last column can have a different number of rows than the others while still
   * maintaining the same size per block.
   */
  static public  class EdgePartition2D$ implements org.apache.spark.graphx.PartitionStrategy, scala.Product, scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final EdgePartition2D$ MODULE$ = null;
    public   EdgePartition2D$ ()  { throw new RuntimeException(); }
    public  int getPartition (long src, long dst, int numParts)  { throw new RuntimeException(); }
  }
  /**
   * Assigns edges to partitions using only the source vertex ID, colocating edges with the same
   * source.
   */
  static public  class EdgePartition1D$ implements org.apache.spark.graphx.PartitionStrategy, scala.Product, scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final EdgePartition1D$ MODULE$ = null;
    public   EdgePartition1D$ ()  { throw new RuntimeException(); }
    public  int getPartition (long src, long dst, int numParts)  { throw new RuntimeException(); }
  }
  /**
   * Assigns edges to partitions by hashing the source and destination vertex IDs, resulting in a
   * random vertex cut that colocates all same-direction edges between two vertices.
   */
  static public  class RandomVertexCut$ implements org.apache.spark.graphx.PartitionStrategy, scala.Product, scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final RandomVertexCut$ MODULE$ = null;
    public   RandomVertexCut$ ()  { throw new RuntimeException(); }
    public  int getPartition (long src, long dst, int numParts)  { throw new RuntimeException(); }
  }
  /**
   * Assigns edges to partitions by hashing the source and destination vertex IDs in a canonical
   * direction, resulting in a random vertex cut that colocates all edges between two vertices,
   * regardless of direction.
   */
  static public  class CanonicalRandomVertexCut$ implements org.apache.spark.graphx.PartitionStrategy, scala.Product, scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final CanonicalRandomVertexCut$ MODULE$ = null;
    public   CanonicalRandomVertexCut$ ()  { throw new RuntimeException(); }
    public  int getPartition (long src, long dst, int numParts)  { throw new RuntimeException(); }
  }
  /** Returns the partition number for a given edge. */
  public  int getPartition (long src, long dst, int numParts)  ;
}
