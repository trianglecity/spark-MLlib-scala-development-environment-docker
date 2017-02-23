package org.apache.spark.graphx;
/**
 * The VertexRDD singleton is used to construct VertexRDDs.
 */
public  class VertexRDD$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final VertexRDD$ MODULE$ = null;
  public   VertexRDD$ ()  { throw new RuntimeException(); }
  /**
   * Constructs a standalone <code>VertexRDD</code> (one that is not set up for efficient joins with an
   * {@link EdgeRDD}) from an RDD of vertex-attribute pairs. Duplicate entries are removed arbitrarily.
   * <p>
   * @tparam VD the vertex attribute type
   * <p>
   * @param vertices the collection of vertex-attribute pairs
   * @param evidence$14 (undocumented)
   * @return (undocumented)
   */
  public <VD extends java.lang.Object> org.apache.spark.graphx.VertexRDD<VD> apply (org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, VD>> vertices, scala.reflect.ClassTag<VD> evidence$14)  { throw new RuntimeException(); }
  /**
   * Constructs a <code>VertexRDD</code> from an RDD of vertex-attribute pairs. Duplicate vertex entries are
   * removed arbitrarily. The resulting <code>VertexRDD</code> will be joinable with <code>edges</code>, and any missing
   * vertices referred to by <code>edges</code> will be created with the attribute <code>defaultVal</code>.
   * <p>
   * @tparam VD the vertex attribute type
   * <p>
   * @param vertices the collection of vertex-attribute pairs
   * @param edges the {@link EdgeRDD} that these vertices may be joined with
   * @param defaultVal the vertex attribute to use when creating missing vertices
   * @param evidence$15 (undocumented)
   * @return (undocumented)
   */
  public <VD extends java.lang.Object> org.apache.spark.graphx.VertexRDD<VD> apply (org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, VD>> vertices, org.apache.spark.graphx.EdgeRDD<?> edges, VD defaultVal, scala.reflect.ClassTag<VD> evidence$15)  { throw new RuntimeException(); }
  /**
   * Constructs a <code>VertexRDD</code> from an RDD of vertex-attribute pairs. Duplicate vertex entries are
   * merged using <code>mergeFunc</code>. The resulting <code>VertexRDD</code> will be joinable with <code>edges</code>, and any
   * missing vertices referred to by <code>edges</code> will be created with the attribute <code>defaultVal</code>.
   * <p>
   * @tparam VD the vertex attribute type
   * <p>
   * @param vertices the collection of vertex-attribute pairs
   * @param edges the {@link EdgeRDD} that these vertices may be joined with
   * @param defaultVal the vertex attribute to use when creating missing vertices
   * @param mergeFunc the commutative, associative duplicate vertex attribute merge function
   * @param evidence$16 (undocumented)
   * @return (undocumented)
   */
  public <VD extends java.lang.Object> org.apache.spark.graphx.VertexRDD<VD> apply (org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, VD>> vertices, org.apache.spark.graphx.EdgeRDD<?> edges, VD defaultVal, scala.Function2<VD, VD, VD> mergeFunc, scala.reflect.ClassTag<VD> evidence$16)  { throw new RuntimeException(); }
  /**
   * Constructs a <code>VertexRDD</code> containing all vertices referred to in <code>edges</code>. The vertices will be
   * created with the attribute <code>defaultVal</code>. The resulting <code>VertexRDD</code> will be joinable with
   * <code>edges</code>.
   * <p>
   * @tparam VD the vertex attribute type
   * <p>
   * @param edges the {@link EdgeRDD} referring to the vertices to create
   * @param numPartitions the desired number of partitions for the resulting <code>VertexRDD</code>
   * @param defaultVal the vertex attribute to use when creating missing vertices
   * @param evidence$17 (undocumented)
   * @return (undocumented)
   */
  public <VD extends java.lang.Object> org.apache.spark.graphx.VertexRDD<VD> fromEdges (org.apache.spark.graphx.EdgeRDD<?> edges, int numPartitions, VD defaultVal, scala.reflect.ClassTag<VD> evidence$17)  { throw new RuntimeException(); }
    org.apache.spark.rdd.RDD<org.apache.spark.graphx.impl.RoutingTablePartition> createRoutingTables (org.apache.spark.graphx.EdgeRDD<?> edges, org.apache.spark.Partitioner vertexPartitioner)  { throw new RuntimeException(); }
}
