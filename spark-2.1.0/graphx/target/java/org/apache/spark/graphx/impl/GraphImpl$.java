package org.apache.spark.graphx.impl;
public  class GraphImpl$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final GraphImpl$ MODULE$ = null;
  public   GraphImpl$ ()  { throw new RuntimeException(); }
  /**
   * Create a graph from edges, setting referenced vertices to <code>defaultVertexAttr</code>.
   * @param edges (undocumented)
   * @param defaultVertexAttr (undocumented)
   * @param edgeStorageLevel (undocumented)
   * @param vertexStorageLevel (undocumented)
   * @param evidence$13 (undocumented)
   * @param evidence$14 (undocumented)
   * @return (undocumented)
   */
  public <VD extends java.lang.Object, ED extends java.lang.Object> org.apache.spark.graphx.impl.GraphImpl<VD, ED> apply (org.apache.spark.rdd.RDD<org.apache.spark.graphx.Edge<ED>> edges, VD defaultVertexAttr, org.apache.spark.storage.StorageLevel edgeStorageLevel, org.apache.spark.storage.StorageLevel vertexStorageLevel, scala.reflect.ClassTag<VD> evidence$13, scala.reflect.ClassTag<ED> evidence$14)  { throw new RuntimeException(); }
  /**
   * Create a graph from EdgePartitions, setting referenced vertices to <code>defaultVertexAttr</code>.
   * @param edgePartitions (undocumented)
   * @param defaultVertexAttr (undocumented)
   * @param edgeStorageLevel (undocumented)
   * @param vertexStorageLevel (undocumented)
   * @param evidence$15 (undocumented)
   * @param evidence$16 (undocumented)
   * @return (undocumented)
   */
  public <VD extends java.lang.Object, ED extends java.lang.Object> org.apache.spark.graphx.impl.GraphImpl<VD, ED> fromEdgePartitions (org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, org.apache.spark.graphx.impl.EdgePartition<ED, VD>>> edgePartitions, VD defaultVertexAttr, org.apache.spark.storage.StorageLevel edgeStorageLevel, org.apache.spark.storage.StorageLevel vertexStorageLevel, scala.reflect.ClassTag<VD> evidence$15, scala.reflect.ClassTag<ED> evidence$16)  { throw new RuntimeException(); }
  /**
   * Create a graph from vertices and edges, setting missing vertices to <code>defaultVertexAttr</code>.
   * @param vertices (undocumented)
   * @param edges (undocumented)
   * @param defaultVertexAttr (undocumented)
   * @param edgeStorageLevel (undocumented)
   * @param vertexStorageLevel (undocumented)
   * @param evidence$17 (undocumented)
   * @param evidence$18 (undocumented)
   * @return (undocumented)
   */
  public <VD extends java.lang.Object, ED extends java.lang.Object> org.apache.spark.graphx.impl.GraphImpl<VD, ED> apply (org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, VD>> vertices, org.apache.spark.rdd.RDD<org.apache.spark.graphx.Edge<ED>> edges, VD defaultVertexAttr, org.apache.spark.storage.StorageLevel edgeStorageLevel, org.apache.spark.storage.StorageLevel vertexStorageLevel, scala.reflect.ClassTag<VD> evidence$17, scala.reflect.ClassTag<ED> evidence$18)  { throw new RuntimeException(); }
  /**
   * Create a graph from a VertexRDD and an EdgeRDD with arbitrary replicated vertices. The
   * VertexRDD must already be set up for efficient joins with the EdgeRDD by calling
   * <code>VertexRDD.withEdges</code> or an appropriate VertexRDD constructor.
   * @param vertices (undocumented)
   * @param edges (undocumented)
   * @param evidence$19 (undocumented)
   * @param evidence$20 (undocumented)
   * @return (undocumented)
   */
  public <VD extends java.lang.Object, ED extends java.lang.Object> org.apache.spark.graphx.impl.GraphImpl<VD, ED> apply (org.apache.spark.graphx.VertexRDD<VD> vertices, org.apache.spark.graphx.EdgeRDD<ED> edges, scala.reflect.ClassTag<VD> evidence$19, scala.reflect.ClassTag<ED> evidence$20)  { throw new RuntimeException(); }
  /**
   * Create a graph from a VertexRDD and an EdgeRDD with the same replicated vertex type as the
   * vertices. The VertexRDD must already be set up for efficient joins with the EdgeRDD by calling
   * <code>VertexRDD.withEdges</code> or an appropriate VertexRDD constructor.
   * @param vertices (undocumented)
   * @param edges (undocumented)
   * @param evidence$21 (undocumented)
   * @param evidence$22 (undocumented)
   * @return (undocumented)
   */
  public <VD extends java.lang.Object, ED extends java.lang.Object> org.apache.spark.graphx.impl.GraphImpl<VD, ED> fromExistingRDDs (org.apache.spark.graphx.VertexRDD<VD> vertices, org.apache.spark.graphx.EdgeRDD<ED> edges, scala.reflect.ClassTag<VD> evidence$21, scala.reflect.ClassTag<ED> evidence$22)  { throw new RuntimeException(); }
  /**
   * Create a graph from an EdgeRDD with the correct vertex type, setting missing vertices to
   * <code>defaultVertexAttr</code>. The vertices will have the same number of partitions as the EdgeRDD.
   * @param edges (undocumented)
   * @param defaultVertexAttr (undocumented)
   * @param edgeStorageLevel (undocumented)
   * @param vertexStorageLevel (undocumented)
   * @param evidence$23 (undocumented)
   * @param evidence$24 (undocumented)
   * @return (undocumented)
   */
  private <VD extends java.lang.Object, ED extends java.lang.Object> org.apache.spark.graphx.impl.GraphImpl<VD, ED> fromEdgeRDD (org.apache.spark.graphx.impl.EdgeRDDImpl<ED, VD> edges, VD defaultVertexAttr, org.apache.spark.storage.StorageLevel edgeStorageLevel, org.apache.spark.storage.StorageLevel vertexStorageLevel, scala.reflect.ClassTag<VD> evidence$23, scala.reflect.ClassTag<ED> evidence$24)  { throw new RuntimeException(); }
}
