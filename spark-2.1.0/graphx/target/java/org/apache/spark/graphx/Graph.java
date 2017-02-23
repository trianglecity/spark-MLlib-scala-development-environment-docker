package org.apache.spark.graphx;
/**
 * The Graph abstractly represents a graph with arbitrary objects
 * associated with vertices and edges.  The graph provides basic
 * operations to access and manipulate the data associated with
 * vertices and edges as well as the underlying structure.  Like Spark
 * RDDs, the graph is a functional data-structure in which mutating
 * operations return new graphs.
 * <p>
 * @note {@link GraphOps} contains additional convenience operations and graph algorithms.
 * <p>
 * @tparam VD the vertex attribute type
 * @tparam ED the edge attribute type
 */
public abstract class Graph<VD extends java.lang.Object, ED extends java.lang.Object> implements scala.Serializable {
  /**
   * Construct a graph from a collection of edges encoded as vertex id pairs.
   * <p>
   * @param rawEdges a collection of edges in (src, dst) form
   * @param defaultValue the vertex attributes with which to create vertices referenced by the edges
   * @param uniqueEdges if multiple identical edges are found they are combined and the edge
   * attribute is set to the sum.  Otherwise duplicate edges are treated as separate. To enable
   * <code>uniqueEdges</code>, a {@link PartitionStrategy} must be provided.
   * @param edgeStorageLevel the desired storage level at which to cache the edges if necessary
   * @param vertexStorageLevel the desired storage level at which to cache the vertices if necessary
   * <p>
   * @return a graph with edge attributes containing either the count of duplicate edges or 1
   * (if <code>uniqueEdges</code> is <code>None</code>) and vertex attributes containing the total degree of each vertex.
   * @param evidence$15 (undocumented)
   */
  static public <VD extends java.lang.Object> org.apache.spark.graphx.Graph<VD, java.lang.Object> fromEdgeTuples (org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, java.lang.Object>> rawEdges, VD defaultValue, scala.Option<org.apache.spark.graphx.PartitionStrategy> uniqueEdges, org.apache.spark.storage.StorageLevel edgeStorageLevel, org.apache.spark.storage.StorageLevel vertexStorageLevel, scala.reflect.ClassTag<VD> evidence$15)  { throw new RuntimeException(); }
  /**
   * Construct a graph from a collection of edges.
   * <p>
   * @param edges the RDD containing the set of edges in the graph
   * @param defaultValue the default vertex attribute to use for each vertex
   * @param edgeStorageLevel the desired storage level at which to cache the edges if necessary
   * @param vertexStorageLevel the desired storage level at which to cache the vertices if necessary
   * <p>
   * @return a graph with edge attributes described by <code>edges</code> and vertices
   *         given by all vertices in <code>edges</code> with value <code>defaultValue</code>
   * @param evidence$16 (undocumented)
   * @param evidence$17 (undocumented)
   */
  static public <VD extends java.lang.Object, ED extends java.lang.Object> org.apache.spark.graphx.Graph<VD, ED> fromEdges (org.apache.spark.rdd.RDD<org.apache.spark.graphx.Edge<ED>> edges, VD defaultValue, org.apache.spark.storage.StorageLevel edgeStorageLevel, org.apache.spark.storage.StorageLevel vertexStorageLevel, scala.reflect.ClassTag<VD> evidence$16, scala.reflect.ClassTag<ED> evidence$17)  { throw new RuntimeException(); }
  /**
   * Construct a graph from a collection of vertices and
   * edges with attributes.  Duplicate vertices are picked arbitrarily and
   * vertices found in the edge collection but not in the input
   * vertices are assigned the default attribute.
   * <p>
   * @tparam VD the vertex attribute type
   * @tparam ED the edge attribute type
   * @param vertices the "set" of vertices and their attributes
   * @param edges the collection of edges in the graph
   * @param defaultVertexAttr the default vertex attribute to use for vertices that are
   *                          mentioned in edges but not in vertices
   * @param edgeStorageLevel the desired storage level at which to cache the edges if necessary
   * @param vertexStorageLevel the desired storage level at which to cache the vertices if necessary
   * @param evidence$18 (undocumented)
   * @param evidence$19 (undocumented)
   * @return (undocumented)
   */
  static public <VD extends java.lang.Object, ED extends java.lang.Object> org.apache.spark.graphx.Graph<VD, ED> apply (org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, VD>> vertices, org.apache.spark.rdd.RDD<org.apache.spark.graphx.Edge<ED>> edges, VD defaultVertexAttr, org.apache.spark.storage.StorageLevel edgeStorageLevel, org.apache.spark.storage.StorageLevel vertexStorageLevel, scala.reflect.ClassTag<VD> evidence$18, scala.reflect.ClassTag<ED> evidence$19)  { throw new RuntimeException(); }
  /**
   * Implicitly extracts the {@link GraphOps} member from a graph.
   * <p>
   * To improve modularity the Graph type only contains a small set of basic operations.
   * All the convenience operations are defined in the {@link GraphOps} class which may be
   * shared across multiple graph implementations.
   * @param g (undocumented)
   * @param evidence$20 (undocumented)
   * @param evidence$21 (undocumented)
   * @return (undocumented)
   */
  static public <VD extends java.lang.Object, ED extends java.lang.Object> org.apache.spark.graphx.GraphOps<VD, ED> graphToGraphOps (org.apache.spark.graphx.Graph<VD, ED> g, scala.reflect.ClassTag<VD> evidence$20, scala.reflect.ClassTag<ED> evidence$21)  { throw new RuntimeException(); }
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  protected   Graph (scala.reflect.ClassTag<VD> evidence$1, scala.reflect.ClassTag<ED> evidence$2)  { throw new RuntimeException(); }
  /**
   * An RDD containing the vertices and their associated attributes.
   * <p>
   * @note vertex ids are unique.
   * @return an RDD containing the vertices in this graph
   */
  public abstract  org.apache.spark.graphx.VertexRDD<VD> vertices ()  ;
  /**
   * An RDD containing the edges and their associated attributes.  The entries in the RDD contain
   * just the source id and target id along with the edge data.
   * <p>
   * @return an RDD containing the edges in this graph
   * <p>
   * @see <code>Edge</code> for the edge type.
   * @see <code>Graph#triplets</code> to get an RDD which contains all the edges
   * along with their vertex data.
   * <p>
   */
  public abstract  org.apache.spark.graphx.EdgeRDD<ED> edges ()  ;
  /**
   * An RDD containing the edge triplets, which are edges along with the vertex data associated with
   * the adjacent vertices. The caller should use {@link edges} if the vertex data are not needed, i.e.
   * if only the edge data and adjacent vertex ids are needed.
   * <p>
   * @return an RDD containing edge triplets
   * <p>
   * @example This operation might be used to evaluate a graph
   * coloring where we would like to check that both vertices are a
   * different color.
   * <pre><code>
   * type Color = Int
   * val graph: Graph[Color, Int] = GraphLoader.edgeListFile("hdfs://file.tsv")
   * val numInvalid = graph.triplets.map(e =&gt; if (e.src.data == e.dst.data) 1 else 0).sum
   * </code></pre>
   */
  public abstract  org.apache.spark.rdd.RDD<org.apache.spark.graphx.EdgeTriplet<VD, ED>> triplets ()  ;
  /**
   * Caches the vertices and edges associated with this graph at the specified storage level,
   * ignoring any target storage levels previously set.
   * <p>
   * @param newLevel the level at which to cache the graph.
   * <p>
   * @return A reference to this graph for convenience.
   */
  public abstract  org.apache.spark.graphx.Graph<VD, ED> persist (org.apache.spark.storage.StorageLevel newLevel)  ;
  /**
   * Caches the vertices and edges associated with this graph at the previously-specified target
   * storage levels, which default to <code>MEMORY_ONLY</code>. This is used to pin a graph in memory enabling
   * multiple queries to reuse the same construction process.
   * @return (undocumented)
   */
  public abstract  org.apache.spark.graphx.Graph<VD, ED> cache ()  ;
  /**
   * Mark this Graph for checkpointing. It will be saved to a file inside the checkpoint
   * directory set with SparkContext.setCheckpointDir() and all references to its parent
   * RDDs will be removed. It is strongly recommended that this Graph is persisted in
   * memory, otherwise saving it on a file will require recomputation.
   */
  public abstract  void checkpoint ()  ;
  /**
   * Return whether this Graph has been checkpointed or not.
   * This returns true iff both the vertices RDD and edges RDD have been checkpointed.
   * @return (undocumented)
   */
  public abstract  boolean isCheckpointed ()  ;
  /**
   * Gets the name of the files to which this Graph was checkpointed.
   * (The vertices RDD and edges RDD are checkpointed separately.)
   * @return (undocumented)
   */
  public abstract  scala.collection.Seq<java.lang.String> getCheckpointFiles ()  ;
  /**
   * Uncaches both vertices and edges of this graph. This is useful in iterative algorithms that
   * build a new graph in each iteration.
   * @param blocking (undocumented)
   * @return (undocumented)
   */
  public abstract  org.apache.spark.graphx.Graph<VD, ED> unpersist (boolean blocking)  ;
  /**
   * Uncaches only the vertices of this graph, leaving the edges alone. This is useful in iterative
   * algorithms that modify the vertex attributes but reuse the edges. This method can be used to
   * uncache the vertex attributes of previous iterations once they are no longer needed, improving
   * GC performance.
   * @param blocking (undocumented)
   * @return (undocumented)
   */
  public abstract  org.apache.spark.graphx.Graph<VD, ED> unpersistVertices (boolean blocking)  ;
  /**
   * Repartitions the edges in the graph according to <code>partitionStrategy</code>.
   * <p>
   * @param partitionStrategy the partitioning strategy to use when partitioning the edges
   * in the graph.
   * @return (undocumented)
   */
  public abstract  org.apache.spark.graphx.Graph<VD, ED> partitionBy (org.apache.spark.graphx.PartitionStrategy partitionStrategy)  ;
  /**
   * Repartitions the edges in the graph according to <code>partitionStrategy</code>.
   * <p>
   * @param partitionStrategy the partitioning strategy to use when partitioning the edges
   * in the graph.
   * @param numPartitions the number of edge partitions in the new graph.
   * @return (undocumented)
   */
  public abstract  org.apache.spark.graphx.Graph<VD, ED> partitionBy (org.apache.spark.graphx.PartitionStrategy partitionStrategy, int numPartitions)  ;
  /**
   * Transforms each vertex attribute in the graph using the map function.
   * <p>
   * @note The new graph has the same structure.  As a consequence the underlying index structures
   * can be reused.
   * <p>
   * @param map the function from a vertex object to a new vertex value
   * <p>
   * @tparam VD2 the new vertex data type
   * <p>
   * @example We might use this operation to change the vertex values
   * from one type to another to initialize an algorithm.
   * <pre><code>
   * val rawGraph: Graph[(), ()] = Graph.textFile("hdfs://file")
   * val root = 42
   * var bfsGraph = rawGraph.mapVertices[Int]((vid, data) =&gt; if (vid == root) 0 else Math.MaxValue)
   * </code></pre>
   * <p>
   * @param evidence$3 (undocumented)
   * @param eq (undocumented)
   * @return (undocumented)
   */
  public abstract <VD2 extends java.lang.Object> org.apache.spark.graphx.Graph<VD2, ED> mapVertices (scala.Function2<java.lang.Object, VD, VD2> map, scala.reflect.ClassTag<VD2> evidence$3, scala.Predef.$eq$colon$eq<VD, VD2> eq)  ;
  /**
   * Transforms each edge attribute in the graph using the map function.  The map function is not
   * passed the vertex value for the vertices adjacent to the edge.  If vertex values are desired,
   * use <code>mapTriplets</code>.
   * <p>
   * @note This graph is not changed and that the new graph has the
   * same structure.  As a consequence the underlying index structures
   * can be reused.
   * <p>
   * @param map the function from an edge object to a new edge value.
   * <p>
   * @tparam ED2 the new edge data type
   * <p>
   * @example This function might be used to initialize edge
   * attributes.
   * <p>
   * @param evidence$4 (undocumented)
   * @return (undocumented)
   */
  public <ED2 extends java.lang.Object> org.apache.spark.graphx.Graph<VD, ED2> mapEdges (scala.Function1<org.apache.spark.graphx.Edge<ED>, ED2> map, scala.reflect.ClassTag<ED2> evidence$4)  { throw new RuntimeException(); }
  /**
   * Transforms each edge attribute using the map function, passing it a whole partition at a
   * time. The map function is given an iterator over edges within a logical partition as well as
   * the partition's ID, and it should return a new iterator over the new values of each edge. The
   * new iterator's elements must correspond one-to-one with the old iterator's elements. If
   * adjacent vertex values are desired, use <code>mapTriplets</code>.
   * <p>
   * @note This does not change the structure of the
   * graph or modify the values of this graph.  As a consequence
   * the underlying index structures can be reused.
   * <p>
   * @param map a function that takes a partition id and an iterator
   * over all the edges in the partition, and must return an iterator over
   * the new values for each edge in the order of the input iterator
   * <p>
   * @tparam ED2 the new edge data type
   * <p>
   * @param evidence$5 (undocumented)
   * @return (undocumented)
   */
  public abstract <ED2 extends java.lang.Object> org.apache.spark.graphx.Graph<VD, ED2> mapEdges (scala.Function2<java.lang.Object, scala.collection.Iterator<org.apache.spark.graphx.Edge<ED>>, scala.collection.Iterator<ED2>> map, scala.reflect.ClassTag<ED2> evidence$5)  ;
  /**
   * Transforms each edge attribute using the map function, passing it the adjacent vertex
   * attributes as well. If adjacent vertex values are not required,
   * consider using <code>mapEdges</code> instead.
   * <p>
   * @note This does not change the structure of the
   * graph or modify the values of this graph.  As a consequence
   * the underlying index structures can be reused.
   * <p>
   * @param map the function from an edge object to a new edge value.
   * <p>
   * @tparam ED2 the new edge data type
   * <p>
   * @example This function might be used to initialize edge
   * attributes based on the attributes associated with each vertex.
   * <pre><code>
   * val rawGraph: Graph[Int, Int] = someLoadFunction()
   * val graph = rawGraph.mapTriplets[Int]( edge =&gt;
   *   edge.src.data - edge.dst.data)
   * </code></pre>
   * <p>
   * @param evidence$6 (undocumented)
   * @return (undocumented)
   */
  public <ED2 extends java.lang.Object> org.apache.spark.graphx.Graph<VD, ED2> mapTriplets (scala.Function1<org.apache.spark.graphx.EdgeTriplet<VD, ED>, ED2> map, scala.reflect.ClassTag<ED2> evidence$6)  { throw new RuntimeException(); }
  /**
   * Transforms each edge attribute using the map function, passing it the adjacent vertex
   * attributes as well. If adjacent vertex values are not required,
   * consider using <code>mapEdges</code> instead.
   * <p>
   * @note This does not change the structure of the
   * graph or modify the values of this graph.  As a consequence
   * the underlying index structures can be reused.
   * <p>
   * @param map the function from an edge object to a new edge value.
   * @param tripletFields which fields should be included in the edge triplet passed to the map
   *   function. If not all fields are needed, specifying this can improve performance.
   * <p>
   * @tparam ED2 the new edge data type
   * <p>
   * @example This function might be used to initialize edge
   * attributes based on the attributes associated with each vertex.
   * <pre><code>
   * val rawGraph: Graph[Int, Int] = someLoadFunction()
   * val graph = rawGraph.mapTriplets[Int]( edge =&gt;
   *   edge.src.data - edge.dst.data)
   * </code></pre>
   * <p>
   * @param evidence$7 (undocumented)
   * @return (undocumented)
   */
  public <ED2 extends java.lang.Object> org.apache.spark.graphx.Graph<VD, ED2> mapTriplets (scala.Function1<org.apache.spark.graphx.EdgeTriplet<VD, ED>, ED2> map, org.apache.spark.graphx.TripletFields tripletFields, scala.reflect.ClassTag<ED2> evidence$7)  { throw new RuntimeException(); }
  /**
   * Transforms each edge attribute a partition at a time using the map function, passing it the
   * adjacent vertex attributes as well. The map function is given an iterator over edge triplets
   * within a logical partition and should yield a new iterator over the new values of each edge in
   * the order in which they are provided.  If adjacent vertex values are not required, consider
   * using <code>mapEdges</code> instead.
   * <p>
   * @note This does not change the structure of the
   * graph or modify the values of this graph.  As a consequence
   * the underlying index structures can be reused.
   * <p>
   * @param map the iterator transform
   * @param tripletFields which fields should be included in the edge triplet passed to the map
   *   function. If not all fields are needed, specifying this can improve performance.
   * <p>
   * @tparam ED2 the new edge data type
   * <p>
   * @param evidence$8 (undocumented)
   * @return (undocumented)
   */
  public abstract <ED2 extends java.lang.Object> org.apache.spark.graphx.Graph<VD, ED2> mapTriplets (scala.Function2<java.lang.Object, scala.collection.Iterator<org.apache.spark.graphx.EdgeTriplet<VD, ED>>, scala.collection.Iterator<ED2>> map, org.apache.spark.graphx.TripletFields tripletFields, scala.reflect.ClassTag<ED2> evidence$8)  ;
  /**
   * Reverses all edges in the graph.  If this graph contains an edge from a to b then the returned
   * graph contains an edge from b to a.
   * @return (undocumented)
   */
  public abstract  org.apache.spark.graphx.Graph<VD, ED> reverse ()  ;
  /**
   * Restricts the graph to only the vertices and edges satisfying the predicates. The resulting
   * subgraph satisfies
   * <p>
   * <pre><code>
   * V' = {v : for all v in V where vpred(v)}
   * E' = {(u,v): for all (u,v) in E where epred((u,v)) &amp;&amp; vpred(u) &amp;&amp; vpred(v)}
   * </code></pre>
   * <p>
   * @param epred the edge predicate, which takes a triplet and
   * evaluates to true if the edge is to remain in the subgraph.  Note
   * that only edges where both vertices satisfy the vertex
   * predicate are considered.
   * <p>
   * @param vpred the vertex predicate, which takes a vertex object and
   * evaluates to true if the vertex is to be included in the subgraph
   * <p>
   * @return the subgraph containing only the vertices and edges that
   * satisfy the predicates
   */
  public abstract  org.apache.spark.graphx.Graph<VD, ED> subgraph (scala.Function1<org.apache.spark.graphx.EdgeTriplet<VD, ED>, java.lang.Object> epred, scala.Function2<java.lang.Object, VD, java.lang.Object> vpred)  ;
  /**
   * Restricts the graph to only the vertices and edges that are also in <code>other</code>, but keeps the
   * attributes from this graph.
   * @param other the graph to project this graph onto
   * @return a graph with vertices and edges that exist in both the current graph and <code>other</code>,
   * with vertex and edge data from the current graph
   * @param evidence$9 (undocumented)
   * @param evidence$10 (undocumented)
   */
  public abstract <VD2 extends java.lang.Object, ED2 extends java.lang.Object> org.apache.spark.graphx.Graph<VD, ED> mask (org.apache.spark.graphx.Graph<VD2, ED2> other, scala.reflect.ClassTag<VD2> evidence$9, scala.reflect.ClassTag<ED2> evidence$10)  ;
  /**
   * Merges multiple edges between two vertices into a single edge. For correct results, the graph
   * must have been partitioned using {@link partitionBy}.
   * <p>
   * @param merge the user-supplied commutative associative function to merge edge attributes
   *              for duplicate edges.
   * <p>
   * @return The resulting graph with a single edge for each (source, dest) vertex pair.
   */
  public abstract  org.apache.spark.graphx.Graph<VD, ED> groupEdges (scala.Function2<ED, ED, ED> merge)  ;
  /**
   * Aggregates values from the neighboring edges and vertices of each vertex. The user-supplied
   * <code>sendMsg</code> function is invoked on each edge of the graph, generating 0 or more messages to be
   * sent to either vertex in the edge. The <code>mergeMsg</code> function is then used to combine all messages
   * destined to the same vertex.
   * <p>
   * @tparam A the type of message to be sent to each vertex
   * <p>
   * @param sendMsg runs on each edge, sending messages to neighboring vertices using the
   *   {@link EdgeContext}.
   * @param mergeMsg used to combine messages from <code>sendMsg</code> destined to the same vertex. This
   *   combiner should be commutative and associative.
   * @param tripletFields which fields should be included in the {@link EdgeContext} passed to the
   *   <code>sendMsg</code> function. If not all fields are needed, specifying this can improve performance.
   * <p>
   * @example We can use this function to compute the in-degree of each
   * vertex
   * <pre><code>
   * val rawGraph: Graph[_, _] = Graph.textFile("twittergraph")
   * val inDeg: RDD[(VertexId, Int)] =
   *   rawGraph.aggregateMessages[Int](ctx =&gt; ctx.sendToDst(1), _ + _)
   * </code></pre>
   * <p>
   * @note By expressing computation at the edge level we achieve
   * maximum parallelism.  This is one of the core functions in the
   * Graph API that enables neighborhood level computation. For
   * example this function can be used to count neighbors satisfying a
   * predicate or implement PageRank.
   * <p>
   * @param evidence$11 (undocumented)
   * @return (undocumented)
   */
  public <A extends java.lang.Object> org.apache.spark.graphx.VertexRDD<A> aggregateMessages (scala.Function1<org.apache.spark.graphx.EdgeContext<VD, ED, A>, scala.runtime.BoxedUnit> sendMsg, scala.Function2<A, A, A> mergeMsg, org.apache.spark.graphx.TripletFields tripletFields, scala.reflect.ClassTag<A> evidence$11)  { throw new RuntimeException(); }
  /**
   * Aggregates values from the neighboring edges and vertices of each vertex. The user-supplied
   * <code>sendMsg</code> function is invoked on each edge of the graph, generating 0 or more messages to be
   * sent to either vertex in the edge. The <code>mergeMsg</code> function is then used to combine all messages
   * destined to the same vertex.
   * <p>
   * This variant can take an active set to restrict the computation and is intended for internal
   * use only.
   * <p>
   * @tparam A the type of message to be sent to each vertex
   * <p>
   * @param sendMsg runs on each edge, sending messages to neighboring vertices using the
   *   {@link EdgeContext}.
   * @param mergeMsg used to combine messages from <code>sendMsg</code> destined to the same vertex. This
   *   combiner should be commutative and associative.
   * @param tripletFields which fields should be included in the {@link EdgeContext} passed to the
   *   <code>sendMsg</code> function. If not all fields are needed, specifying this can improve performance.
   * @param activeSetOpt an efficient way to run the aggregation on a subset of the edges if
   *   desired. This is done by specifying a set of "active" vertices and an edge direction. The
   *   <code>sendMsg</code> function will then run on only edges connected to active vertices by edges in the
   *   specified direction. If the direction is <code>In</code>, <code>sendMsg</code> will only be run on edges with
   *   destination in the active set. If the direction is <code>Out</code>, <code>sendMsg</code> will only be run on edges
   *   originating from vertices in the active set. If the direction is <code>Either</code>, <code>sendMsg</code> will be
   *   run on edges with *either* vertex in the active set. If the direction is <code>Both</code>, <code>sendMsg</code>
   *   will be run on edges with *both* vertices in the active set. The active set must have the
   *   same index as the graph's vertices.
   * @param evidence$12 (undocumented)
   * @return (undocumented)
   */
   abstract <A extends java.lang.Object> org.apache.spark.graphx.VertexRDD<A> aggregateMessagesWithActiveSet (scala.Function1<org.apache.spark.graphx.EdgeContext<VD, ED, A>, scala.runtime.BoxedUnit> sendMsg, scala.Function2<A, A, A> mergeMsg, org.apache.spark.graphx.TripletFields tripletFields, scala.Option<scala.Tuple2<org.apache.spark.graphx.VertexRDD<?>, org.apache.spark.graphx.EdgeDirection>> activeSetOpt, scala.reflect.ClassTag<A> evidence$12)  ;
  /**
   * Joins the vertices with entries in the <code>table</code> RDD and merges the results using <code>mapFunc</code>.
   * The input table should contain at most one entry for each vertex.  If no entry in <code>other</code> is
   * provided for a particular vertex in the graph, the map function receives <code>None</code>.
   * <p>
   * @tparam U the type of entry in the table of updates
   * @tparam VD2 the new vertex value type
   * <p>
   * @param other the table to join with the vertices in the graph.
   *              The table should contain at most one entry for each vertex.
   * @param mapFunc the function used to compute the new vertex values.
   *                The map function is invoked for all vertices, even those
   *                that do not have a corresponding entry in the table.
   * <p>
   * @example This function is used to update the vertices with new values based on external data.
   *          For example we could add the out-degree to each vertex record:
   * <p>
   * <pre><code>
   * val rawGraph: Graph[_, _] = Graph.textFile("webgraph")
   * val outDeg: RDD[(VertexId, Int)] = rawGraph.outDegrees
   * val graph = rawGraph.outerJoinVertices(outDeg) {
   *   (vid, data, optDeg) =&gt; optDeg.getOrElse(0)
   * }
   * </code></pre>
   * @param evidence$13 (undocumented)
   * @param evidence$14 (undocumented)
   * @param eq (undocumented)
   * @return (undocumented)
   */
  public abstract <U extends java.lang.Object, VD2 extends java.lang.Object> org.apache.spark.graphx.Graph<VD2, ED> outerJoinVertices (org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, U>> other, scala.Function3<java.lang.Object, VD, scala.Option<U>, VD2> mapFunc, scala.reflect.ClassTag<U> evidence$13, scala.reflect.ClassTag<VD2> evidence$14, scala.Predef.$eq$colon$eq<VD, VD2> eq)  ;
  /**
   * The associated {@link GraphOps} object.
   * @return (undocumented)
   */
  public  org.apache.spark.graphx.GraphOps<VD, ED> ops ()  { throw new RuntimeException(); }
}
