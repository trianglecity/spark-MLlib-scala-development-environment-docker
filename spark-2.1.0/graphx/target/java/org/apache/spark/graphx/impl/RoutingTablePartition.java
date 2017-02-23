package org.apache.spark.graphx.impl;
/**
 * Stores the locations of edge-partition join sites for each vertex attribute in a particular
 * vertex partition. This provides routing information for shipping vertex attributes to edge
 * partitions.
 */
  class RoutingTablePartition implements scala.Serializable {
  static private  scala.Tuple2<java.lang.Object, java.lang.Object> toMessage (long vid, int pid, byte position)  { throw new RuntimeException(); }
  static private  long vidFromMessage (scala.Tuple2<java.lang.Object, java.lang.Object> msg)  { throw new RuntimeException(); }
  static private  int pidFromMessage (scala.Tuple2<java.lang.Object, java.lang.Object> msg)  { throw new RuntimeException(); }
  static private  byte positionFromMessage (scala.Tuple2<java.lang.Object, java.lang.Object> msg)  { throw new RuntimeException(); }
  static public  org.apache.spark.graphx.impl.RoutingTablePartition empty ()  { throw new RuntimeException(); }
  /** Generate a `RoutingTableMessage` for each vertex referenced in `edgePartition`. */
  static public  scala.collection.Iterator<scala.Tuple2<java.lang.Object, java.lang.Object>> edgePartitionToMsgs (int pid, org.apache.spark.graphx.impl.EdgePartition<?, ?> edgePartition)  { throw new RuntimeException(); }
  /** Build a `RoutingTablePartition` from `RoutingTableMessage`s. */
  static public  org.apache.spark.graphx.impl.RoutingTablePartition fromMsgs (int numEdgePartitions, scala.collection.Iterator<scala.Tuple2<java.lang.Object, java.lang.Object>> iter)  { throw new RuntimeException(); }
  /** Compact the given vector of Booleans into a BitSet. */
  static private  org.apache.spark.util.collection.BitSet toBitSet (org.apache.spark.util.collection.PrimitiveVector<java.lang.Object> flags)  { throw new RuntimeException(); }
  private  scala.Tuple3<long[], org.apache.spark.util.collection.BitSet, org.apache.spark.util.collection.BitSet>[] routingTable ()  { throw new RuntimeException(); }
  // not preceding
  public   RoutingTablePartition (scala.Tuple3<long[], org.apache.spark.util.collection.BitSet, org.apache.spark.util.collection.BitSet>[] routingTable)  { throw new RuntimeException(); }
  /** The maximum number of edge partitions this `RoutingTablePartition` is built to join with. */
  public  int numEdgePartitions ()  { throw new RuntimeException(); }
  /** Returns the number of vertices that will be sent to the specified edge partition. */
  public  int partitionSize (int pid)  { throw new RuntimeException(); }
  /** Returns an iterator over all vertex ids stored in this `RoutingTablePartition`. */
  public  scala.collection.Iterator<java.lang.Object> iterator ()  { throw new RuntimeException(); }
  /** Returns a new RoutingTablePartition reflecting a reversal of all edge directions. */
  public  org.apache.spark.graphx.impl.RoutingTablePartition reverse ()  { throw new RuntimeException(); }
  /**
   * Runs <code>f</code> on each vertex id to be sent to the specified edge partition. Vertex ids can be
   * filtered by the position they have in the edge partition.
   * @param pid (undocumented)
   * @param includeSrc (undocumented)
   * @param includeDst (undocumented)
   * @param f (undocumented)
   */
  public  void foreachWithinEdgePartition (int pid, boolean includeSrc, boolean includeDst, scala.Function1<java.lang.Object, scala.runtime.BoxedUnit> f)  { throw new RuntimeException(); }
}
