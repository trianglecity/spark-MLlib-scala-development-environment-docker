package org.apache.spark.graphx.impl;
/**
 * An implementation of {@link org.apache.spark.graphx.Graph} to support computation on graphs.
 * <p>
 * Graphs are represented using two RDDs: <code>vertices</code>, which contains vertex attributes and the
 * routing information for shipping vertex attributes to edge partitions, and
 * <code>replicatedVertexView</code>, which contains edges and the vertex attributes mentioned by each edge.
 */
public  class GraphImpl<VD extends java.lang.Object, ED extends java.lang.Object> extends org.apache.spark.graphx.Graph<VD, ED> implements scala.Serializable {
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
  static public <VD extends java.lang.Object, ED extends java.lang.Object> org.apache.spark.graphx.impl.GraphImpl<VD, ED> apply (org.apache.spark.rdd.RDD<org.apache.spark.graphx.Edge<ED>> edges, VD defaultVertexAttr, org.apache.spark.storage.StorageLevel edgeStorageLevel, org.apache.spark.storage.StorageLevel vertexStorageLevel, scala.reflect.ClassTag<VD> evidence$13, scala.reflect.ClassTag<ED> evidence$14)  { throw new RuntimeException(); }
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
  static public <VD extends java.lang.Object, ED extends java.lang.Object> org.apache.spark.graphx.impl.GraphImpl<VD, ED> fromEdgePartitions (org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, org.apache.spark.graphx.impl.EdgePartition<ED, VD>>> edgePartitions, VD defaultVertexAttr, org.apache.spark.storage.StorageLevel edgeStorageLevel, org.apache.spark.storage.StorageLevel vertexStorageLevel, scala.reflect.ClassTag<VD> evidence$15, scala.reflect.ClassTag<ED> evidence$16)  { throw new RuntimeException(); }
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
  static public <VD extends java.lang.Object, ED extends java.lang.Object> org.apache.spark.graphx.impl.GraphImpl<VD, ED> apply (org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, VD>> vertices, org.apache.spark.rdd.RDD<org.apache.spark.graphx.Edge<ED>> edges, VD defaultVertexAttr, org.apache.spark.storage.StorageLevel edgeStorageLevel, org.apache.spark.storage.StorageLevel vertexStorageLevel, scala.reflect.ClassTag<VD> evidence$17, scala.reflect.ClassTag<ED> evidence$18)  { throw new RuntimeException(); }
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
  static public <VD extends java.lang.Object, ED extends java.lang.Object> org.apache.spark.graphx.impl.GraphImpl<VD, ED> apply (org.apache.spark.graphx.VertexRDD<VD> vertices, org.apache.spark.graphx.EdgeRDD<ED> edges, scala.reflect.ClassTag<VD> evidence$19, scala.reflect.ClassTag<ED> evidence$20)  { throw new RuntimeException(); }
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
  static public <VD extends java.lang.Object, ED extends java.lang.Object> org.apache.spark.graphx.impl.GraphImpl<VD, ED> fromExistingRDDs (org.apache.spark.graphx.VertexRDD<VD> vertices, org.apache.spark.graphx.EdgeRDD<ED> edges, scala.reflect.ClassTag<VD> evidence$21, scala.reflect.ClassTag<ED> evidence$22)  { throw new RuntimeException(); }
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
  static private <VD extends java.lang.Object, ED extends java.lang.Object> org.apache.spark.graphx.impl.GraphImpl<VD, ED> fromEdgeRDD (org.apache.spark.graphx.impl.EdgeRDDImpl<ED, VD> edges, VD defaultVertexAttr, org.apache.spark.storage.StorageLevel edgeStorageLevel, org.apache.spark.storage.StorageLevel vertexStorageLevel, scala.reflect.ClassTag<VD> evidence$23, scala.reflect.ClassTag<ED> evidence$24)  { throw new RuntimeException(); }
  static public <A extends java.lang.Object> org.apache.spark.graphx.VertexRDD<A> aggregateMessages (scala.Function1<org.apache.spark.graphx.EdgeContext<VD, ED, A>, scala.runtime.BoxedUnit> sendMsg, scala.Function2<A, A, A> mergeMsg, org.apache.spark.graphx.TripletFields tripletFields, scala.reflect.ClassTag<A> evidence$11)  { throw new RuntimeException(); }
  static public  org.apache.spark.graphx.GraphOps<VD, ED> ops ()  { throw new RuntimeException(); }
  static public  org.apache.spark.storage.StorageLevel persist$default$1 ()  { throw new RuntimeException(); }
  static public  boolean unpersist$default$1 ()  { throw new RuntimeException(); }
  static public  boolean unpersistVertices$default$1 ()  { throw new RuntimeException(); }
  static public <VD2 extends java.lang.Object> scala.runtime.Null$ mapVertices$default$3 (scala.Function2<java.lang.Object, VD, VD2> map)  { throw new RuntimeException(); }
  static public  scala.Function1<org.apache.spark.graphx.EdgeTriplet<VD, ED>, java.lang.Object> subgraph$default$1 ()  { throw new RuntimeException(); }
  static public  scala.Function2<java.lang.Object, VD, java.lang.Object> subgraph$default$2 ()  { throw new RuntimeException(); }
  static public <A extends java.lang.Object> org.apache.spark.graphx.TripletFields aggregateMessages$default$3 ()  { throw new RuntimeException(); }
  static public <U extends java.lang.Object, VD2 extends java.lang.Object> scala.runtime.Null$ outerJoinVertices$default$5 (org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, U>> other, scala.Function3<java.lang.Object, VD, scala.Option<U>, VD2> mapFunc)  { throw new RuntimeException(); }
  public  org.apache.spark.graphx.VertexRDD<VD> vertices ()  { throw new RuntimeException(); }
  public  org.apache.spark.graphx.impl.ReplicatedVertexView<VD, ED> replicatedVertexView ()  { throw new RuntimeException(); }
  // not preceding
  protected   GraphImpl (org.apache.spark.graphx.VertexRDD<VD> vertices, org.apache.spark.graphx.impl.ReplicatedVertexView<VD, ED> replicatedVertexView, scala.reflect.ClassTag<VD> evidence$1, scala.reflect.ClassTag<ED> evidence$2)  { throw new RuntimeException(); }
  /** Default constructor is provided to support serialization */
  protected   GraphImpl (scala.reflect.ClassTag<VD> evidence$3, scala.reflect.ClassTag<ED> evidence$4)  { throw new RuntimeException(); }
  public  org.apache.spark.graphx.impl.EdgeRDDImpl<ED, VD> edges ()  { throw new RuntimeException(); }
  /** Return an RDD that brings edges together with their source and destination vertices. */
  public  org.apache.spark.rdd.RDD<org.apache.spark.graphx.EdgeTriplet<VD, ED>> triplets ()  { throw new RuntimeException(); }
  public  org.apache.spark.graphx.Graph<VD, ED> persist (org.apache.spark.storage.StorageLevel newLevel)  { throw new RuntimeException(); }
  public  org.apache.spark.graphx.Graph<VD, ED> cache ()  { throw new RuntimeException(); }
  public  void checkpoint ()  { throw new RuntimeException(); }
  public  boolean isCheckpointed ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> getCheckpointFiles ()  { throw new RuntimeException(); }
  public  org.apache.spark.graphx.Graph<VD, ED> unpersist (boolean blocking)  { throw new RuntimeException(); }
  public  org.apache.spark.graphx.Graph<VD, ED> unpersistVertices (boolean blocking)  { throw new RuntimeException(); }
  public  org.apache.spark.graphx.Graph<VD, ED> partitionBy (org.apache.spark.graphx.PartitionStrategy partitionStrategy)  { throw new RuntimeException(); }
  public  org.apache.spark.graphx.Graph<VD, ED> partitionBy (org.apache.spark.graphx.PartitionStrategy partitionStrategy, int numPartitions)  { throw new RuntimeException(); }
  public  org.apache.spark.graphx.Graph<VD, ED> reverse ()  { throw new RuntimeException(); }
  public <VD2 extends java.lang.Object> org.apache.spark.graphx.Graph<VD2, ED> mapVertices (scala.Function2<java.lang.Object, VD, VD2> f, scala.reflect.ClassTag<VD2> evidence$5, scala.Predef.$eq$colon$eq<VD, VD2> eq)  { throw new RuntimeException(); }
  public <ED2 extends java.lang.Object> org.apache.spark.graphx.Graph<VD, ED2> mapEdges (scala.Function2<java.lang.Object, scala.collection.Iterator<org.apache.spark.graphx.Edge<ED>>, scala.collection.Iterator<ED2>> f, scala.reflect.ClassTag<ED2> evidence$6)  { throw new RuntimeException(); }
  public <ED2 extends java.lang.Object> org.apache.spark.graphx.Graph<VD, ED2> mapTriplets (scala.Function2<java.lang.Object, scala.collection.Iterator<org.apache.spark.graphx.EdgeTriplet<VD, ED>>, scala.collection.Iterator<ED2>> f, org.apache.spark.graphx.TripletFields tripletFields, scala.reflect.ClassTag<ED2> evidence$7)  { throw new RuntimeException(); }
  public  org.apache.spark.graphx.Graph<VD, ED> subgraph (scala.Function1<org.apache.spark.graphx.EdgeTriplet<VD, ED>, java.lang.Object> epred, scala.Function2<java.lang.Object, VD, java.lang.Object> vpred)  { throw new RuntimeException(); }
  public <VD2 extends java.lang.Object, ED2 extends java.lang.Object> org.apache.spark.graphx.Graph<VD, ED> mask (org.apache.spark.graphx.Graph<VD2, ED2> other, scala.reflect.ClassTag<VD2> evidence$8, scala.reflect.ClassTag<ED2> evidence$9)  { throw new RuntimeException(); }
  public  org.apache.spark.graphx.Graph<VD, ED> groupEdges (scala.Function2<ED, ED, ED> merge)  { throw new RuntimeException(); }
  public <A extends java.lang.Object> org.apache.spark.graphx.VertexRDD<A> aggregateMessagesWithActiveSet (scala.Function1<org.apache.spark.graphx.EdgeContext<VD, ED, A>, scala.runtime.BoxedUnit> sendMsg, scala.Function2<A, A, A> mergeMsg, org.apache.spark.graphx.TripletFields tripletFields, scala.Option<scala.Tuple2<org.apache.spark.graphx.VertexRDD<?>, org.apache.spark.graphx.EdgeDirection>> activeSetOpt, scala.reflect.ClassTag<A> evidence$10)  { throw new RuntimeException(); }
  public <U extends java.lang.Object, VD2 extends java.lang.Object> org.apache.spark.graphx.Graph<VD2, ED> outerJoinVertices (org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, U>> other, scala.Function3<java.lang.Object, VD, scala.Option<U>, VD2> updateF, scala.reflect.ClassTag<U> evidence$11, scala.reflect.ClassTag<VD2> evidence$12, scala.Predef.$eq$colon$eq<VD, VD2> eq)  { throw new RuntimeException(); }
  /** Test whether the closure accesses the attribute with name `attrName`. */
  private  boolean accessesVertexAttr (java.lang.Object closure, java.lang.String attrName)  { throw new RuntimeException(); }
}
