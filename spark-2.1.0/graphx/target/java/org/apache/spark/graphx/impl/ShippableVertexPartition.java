package org.apache.spark.graphx.impl;
/**
 * A map from vertex id to vertex attribute that additionally stores edge partition join sites for
 * each vertex attribute, enabling joining with an {@link org.apache.spark.graphx.EdgeRDD}.
 */
  class ShippableVertexPartition<VD extends java.lang.Object> extends org.apache.spark.graphx.impl.VertexPartitionBase<VD> {
  /**
   * Implicit evidence that <code>ShippableVertexPartition</code> is a member of the
   * <code>VertexPartitionBaseOpsConstructor</code> typeclass. This enables invoking <code>VertexPartitionBase</code>
   * operations on a <code>ShippableVertexPartition</code> via an evidence parameter, as in
   * {@link VertexPartitionBaseOps}.
   */
  static public  class ShippableVertexPartitionOpsConstructor$ implements org.apache.spark.graphx.impl.VertexPartitionBaseOpsConstructor<org.apache.spark.graphx.impl.ShippableVertexPartition> {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final ShippableVertexPartitionOpsConstructor$ MODULE$ = null;
    public   ShippableVertexPartitionOpsConstructor$ ()  { throw new RuntimeException(); }
    public <VD extends java.lang.Object> org.apache.spark.graphx.impl.VertexPartitionBaseOps<VD, org.apache.spark.graphx.impl.ShippableVertexPartition> toOps (org.apache.spark.graphx.impl.ShippableVertexPartition<VD> partition, scala.reflect.ClassTag<VD> evidence$6)  { throw new RuntimeException(); }
  }
  /** Construct a `ShippableVertexPartition` from the given vertices without any routing table. */
  static public <VD extends java.lang.Object> org.apache.spark.graphx.impl.ShippableVertexPartition<VD> apply (scala.collection.Iterator<scala.Tuple2<java.lang.Object, VD>> iter, scala.reflect.ClassTag<VD> evidence$2)  { throw new RuntimeException(); }
  /**
   * Construct a <code>ShippableVertexPartition</code> from the given vertices with the specified routing
   * table, filling in missing vertices mentioned in the routing table using <code>defaultVal</code>.
   * @param iter (undocumented)
   * @param routingTable (undocumented)
   * @param defaultVal (undocumented)
   * @param evidence$3 (undocumented)
   * @return (undocumented)
   */
  static public <VD extends java.lang.Object> org.apache.spark.graphx.impl.ShippableVertexPartition<VD> apply (scala.collection.Iterator<scala.Tuple2<java.lang.Object, VD>> iter, org.apache.spark.graphx.impl.RoutingTablePartition routingTable, VD defaultVal, scala.reflect.ClassTag<VD> evidence$3)  { throw new RuntimeException(); }
  /**
   * Construct a <code>ShippableVertexPartition</code> from the given vertices with the specified routing
   * table, filling in missing vertices mentioned in the routing table using <code>defaultVal</code>,
   * and merging duplicate vertex attribute with mergeFunc.
   * @param iter (undocumented)
   * @param routingTable (undocumented)
   * @param defaultVal (undocumented)
   * @param mergeFunc (undocumented)
   * @param evidence$4 (undocumented)
   * @return (undocumented)
   */
  static public <VD extends java.lang.Object> org.apache.spark.graphx.impl.ShippableVertexPartition<VD> apply (scala.collection.Iterator<scala.Tuple2<java.lang.Object, VD>> iter, org.apache.spark.graphx.impl.RoutingTablePartition routingTable, VD defaultVal, scala.Function2<VD, VD, VD> mergeFunc, scala.reflect.ClassTag<VD> evidence$4)  { throw new RuntimeException(); }
  /**
   * Implicit conversion to allow invoking <code>VertexPartitionBase</code> operations directly on a
   * <code>ShippableVertexPartition</code>.
   * @param partition (undocumented)
   * @param evidence$5 (undocumented)
   * @return (undocumented)
   */
  static public <VD extends java.lang.Object> org.apache.spark.graphx.impl.ShippableVertexPartitionOps<VD> shippablePartitionToOps (org.apache.spark.graphx.impl.ShippableVertexPartition<VD> partition, scala.reflect.ClassTag<VD> evidence$5)  { throw new RuntimeException(); }
  static public  int capacity ()  { throw new RuntimeException(); }
  static public  int size ()  { throw new RuntimeException(); }
  static public  boolean isDefined (long vid)  { throw new RuntimeException(); }
  static public  scala.collection.Iterator<scala.Tuple2<java.lang.Object, VD>> iterator ()  { throw new RuntimeException(); }
  public  org.apache.spark.util.collection.OpenHashSet<java.lang.Object> index ()  { throw new RuntimeException(); }
  public  java.lang.Object values ()  { throw new RuntimeException(); }
  public  org.apache.spark.util.collection.BitSet mask ()  { throw new RuntimeException(); }
  public  org.apache.spark.graphx.impl.RoutingTablePartition routingTable ()  { throw new RuntimeException(); }
  // not preceding
  public   ShippableVertexPartition (org.apache.spark.util.collection.OpenHashSet<java.lang.Object> index, java.lang.Object values, org.apache.spark.util.collection.BitSet mask, org.apache.spark.graphx.impl.RoutingTablePartition routingTable, scala.reflect.ClassTag<VD> evidence$7)  { throw new RuntimeException(); }
  /** Return a new ShippableVertexPartition with the specified routing table. */
  public  org.apache.spark.graphx.impl.ShippableVertexPartition<VD> withRoutingTable (org.apache.spark.graphx.impl.RoutingTablePartition _routingTable)  { throw new RuntimeException(); }
  /**
   * Generate a <code>VertexAttributeBlock</code> for each edge partition keyed on the edge partition ID. The
   * <code>VertexAttributeBlock</code> contains the vertex attributes from the current partition that are
   * referenced in the specified positions in the edge partition.
   * @param shipSrc (undocumented)
   * @param shipDst (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Iterator<scala.Tuple2<java.lang.Object, org.apache.spark.graphx.impl.VertexAttributeBlock<VD>>> shipVertexAttributes (boolean shipSrc, boolean shipDst)  { throw new RuntimeException(); }
  /**
   * Generate a <code>VertexId</code> array for each edge partition keyed on the edge partition ID. The array
   * contains the visible vertex ids from the current partition that are referenced in the edge
   * partition.
   * @return (undocumented)
   */
  public  scala.collection.Iterator<scala.Tuple2<java.lang.Object, long[]>> shipVertexIds ()  { throw new RuntimeException(); }
}
