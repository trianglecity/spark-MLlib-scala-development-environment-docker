package org.apache.spark.graphx;
/**
 * Contains additional functionality for {@link Graph}. All operations are expressed in terms of the
 * efficient GraphX API. This class is implicitly constructed for each Graph object.
 * <p>
 * @tparam VD the vertex attribute type
 * @tparam ED the edge attribute type
 */
public  class GraphOps<VD extends java.lang.Object, ED extends java.lang.Object> implements scala.Serializable {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   GraphOps (org.apache.spark.graphx.Graph<VD, ED> graph, scala.reflect.ClassTag<VD> evidence$1, scala.reflect.ClassTag<ED> evidence$2)  { throw new RuntimeException(); }
  /** The number of edges in the graph. */
  public  long numEdges ()  { throw new RuntimeException(); }
  /** The number of vertices in the graph. */
  public  long numVertices ()  { throw new RuntimeException(); }
  /**
   * The in-degree of each vertex in the graph.
   * @note Vertices with no in-edges are not returned in the resulting RDD.
   * @return (undocumented)
   */
  public  org.apache.spark.graphx.VertexRDD<java.lang.Object> inDegrees ()  { throw new RuntimeException(); }
  /**
   * The out-degree of each vertex in the graph.
   * @note Vertices with no out-edges are not returned in the resulting RDD.
   * @return (undocumented)
   */
  public  org.apache.spark.graphx.VertexRDD<java.lang.Object> outDegrees ()  { throw new RuntimeException(); }
  /**
   * The degree of each vertex in the graph.
   * @note Vertices with no edges are not returned in the resulting RDD.
   * @return (undocumented)
   */
  public  org.apache.spark.graphx.VertexRDD<java.lang.Object> degrees ()  { throw new RuntimeException(); }
  /**
   * Computes the neighboring vertex degrees.
   * <p>
   * @param edgeDirection the direction along which to collect neighboring vertex attributes
   * @return (undocumented)
   */
  private  org.apache.spark.graphx.VertexRDD<java.lang.Object> degreesRDD (org.apache.spark.graphx.EdgeDirection edgeDirection)  { throw new RuntimeException(); }
  /**
   * Collect the neighbor vertex ids for each vertex.
   * <p>
   * @param edgeDirection the direction along which to collect
   * neighboring vertices
   * <p>
   * @return the set of neighboring ids for each vertex
   */
  public  org.apache.spark.graphx.VertexRDD<long[]> collectNeighborIds (org.apache.spark.graphx.EdgeDirection edgeDirection)  { throw new RuntimeException(); }
  /**
   * Collect the neighbor vertex attributes for each vertex.
   * <p>
   * @note This function could be highly inefficient on power-law
   * graphs where high degree vertices may force a large amount of
   * information to be collected to a single location.
   * <p>
   * @param edgeDirection the direction along which to collect
   * neighboring vertices
   * <p>
   * @return the vertex set of neighboring vertex attributes for each vertex
   */
  public  org.apache.spark.graphx.VertexRDD<scala.Tuple2<java.lang.Object, VD>[]> collectNeighbors (org.apache.spark.graphx.EdgeDirection edgeDirection)  { throw new RuntimeException(); }
  /**
   * Returns an RDD that contains for each vertex v its local edges,
   * i.e., the edges that are incident on v, in the user-specified direction.
   * Warning: note that singleton vertices, those with no edges in the given
   * direction will not be part of the return value.
   * <p>
   * @note This function could be highly inefficient on power-law
   * graphs where high degree vertices may force a large amount of
   * information to be collected to a single location.
   * <p>
   * @param edgeDirection the direction along which to collect
   * the local edges of vertices
   * <p>
   * @return the local edges for each vertex
   */
  public  org.apache.spark.graphx.VertexRDD<org.apache.spark.graphx.Edge<ED>[]> collectEdges (org.apache.spark.graphx.EdgeDirection edgeDirection)  { throw new RuntimeException(); }
  /**
   * Remove self edges.
   * <p>
   * @return a graph with all self edges removed
   */
  public  org.apache.spark.graphx.Graph<VD, ED> removeSelfEdges ()  { throw new RuntimeException(); }
  /**
   * Join the vertices with an RDD and then apply a function from the
   * vertex and RDD entry to a new vertex value.  The input table
   * should contain at most one entry for each vertex.  If no entry is
   * provided the map function is skipped and the old value is used.
   * <p>
   * @tparam U the type of entry in the table of updates
   * @param table the table to join with the vertices in the graph.
   * The table should contain at most one entry for each vertex.
   * @param mapFunc the function used to compute the new vertex
   * values.  The map function is invoked only for vertices with a
   * corresponding entry in the table otherwise the old vertex value
   * is used.
   * <p>
   * @example This function is used to update the vertices with new
   * values based on external data.  For example we could add the out
   * degree to each vertex record
   * <p>
   * <pre><code>
   * val rawGraph: Graph[Int, Int] = GraphLoader.edgeListFile(sc, "webgraph")
   *   .mapVertices((_, _) =&gt; 0)
   * val outDeg = rawGraph.outDegrees
   * val graph = rawGraph.joinVertices[Int](outDeg)
   *   ((_, _, outDeg) =&gt; outDeg)
   * </code></pre>
   * <p>
   * @param evidence$3 (undocumented)
   * @return (undocumented)
   */
  public <U extends java.lang.Object> org.apache.spark.graphx.Graph<VD, ED> joinVertices (org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, U>> table, scala.Function3<java.lang.Object, VD, U, VD> mapFunc, scala.reflect.ClassTag<U> evidence$3)  { throw new RuntimeException(); }
  /**
   * Filter the graph by computing some values to filter on, and applying the predicates.
   * <p>
   * @param preprocess a function to compute new vertex and edge data before filtering
   * @param epred edge pred to filter on after preprocess, see more details under
   *  {@link org.apache.spark.graphx.Graph#subgraph}
   * @param vpred vertex pred to filter on after preprocess, see more details under
   *  {@link org.apache.spark.graphx.Graph#subgraph}
   * @tparam VD2 vertex type the vpred operates on
   * @tparam ED2 edge type the epred operates on
   * @return a subgraph of the original graph, with its data unchanged
   * <p>
   * @example This function can be used to filter the graph based on some property, without
   * changing the vertex and edge values in your program. For example, we could remove the vertices
   * in a graph with 0 outdegree
   * <p>
   * <pre><code>
   * graph.filter(
   *   graph =&gt; {
   *     val degrees: VertexRDD[Int] = graph.outDegrees
   *     graph.outerJoinVertices(degrees) {(vid, data, deg) =&gt; deg.getOrElse(0)}
   *   },
   *   vpred = (vid: VertexId, deg:Int) =&gt; deg &gt; 0
   * )
   * </code></pre>
   * <p>
   * @param evidence$4 (undocumented)
   * @param evidence$5 (undocumented)
   */
  public <VD2 extends java.lang.Object, ED2 extends java.lang.Object> org.apache.spark.graphx.Graph<VD, ED> filter (scala.Function1<org.apache.spark.graphx.Graph<VD, ED>, org.apache.spark.graphx.Graph<VD2, ED2>> preprocess, scala.Function1<org.apache.spark.graphx.EdgeTriplet<VD2, ED2>, java.lang.Object> epred, scala.Function2<java.lang.Object, VD2, java.lang.Object> vpred, scala.reflect.ClassTag<VD2> evidence$4, scala.reflect.ClassTag<ED2> evidence$5)  { throw new RuntimeException(); }
  /**
   * Picks a random vertex from the graph and returns its ID.
   * @return (undocumented)
   */
  public  long pickRandomVertex ()  { throw new RuntimeException(); }
  /**
   * Convert bi-directional edges into uni-directional ones.
   * Some graph algorithms (e.g., TriangleCount) assume that an input graph
   * has its edges in canonical direction.
   * This function rewrites the vertex ids of edges so that srcIds are smaller
   * than dstIds, and merges the duplicated edges.
   * <p>
   * @param mergeFunc the user defined reduce function which should
   * be commutative and associative and is used to combine the output
   * of the map phase
   * <p>
   * @return the resulting graph with canonical edges
   */
  public  org.apache.spark.graphx.Graph<VD, ED> convertToCanonicalEdges (scala.Function2<ED, ED, ED> mergeFunc)  { throw new RuntimeException(); }
  /**
   * Execute a Pregel-like iterative vertex-parallel abstraction.  The
   * user-defined vertex-program <code>vprog</code> is executed in parallel on
   * each vertex receiving any inbound messages and computing a new
   * value for the vertex.  The <code>sendMsg</code> function is then invoked on
   * all out-edges and is used to compute an optional message to the
   * destination vertex. The <code>mergeMsg</code> function is a commutative
   * associative function used to combine messages destined to the
   * same vertex.
   * <p>
   * On the first iteration all vertices receive the <code>initialMsg</code> and
   * on subsequent iterations if a vertex does not receive a message
   * then the vertex-program is not invoked.
   * <p>
   * This function iterates until there are no remaining messages, or
   * for <code>maxIterations</code> iterations.
   * <p>
   * @tparam A the Pregel message type
   * <p>
   * @param initialMsg the message each vertex will receive at the on
   * the first iteration
   * <p>
   * @param maxIterations the maximum number of iterations to run for
   * <p>
   * @param activeDirection the direction of edges incident to a vertex that received a message in
   * the previous round on which to run <code>sendMsg</code>. For example, if this is <code>EdgeDirection.Out</code>, only
   * out-edges of vertices that received a message in the previous round will run.
   * <p>
   * @param vprog the user-defined vertex program which runs on each
   * vertex and receives the inbound message and computes a new vertex
   * value.  On the first iteration the vertex program is invoked on
   * all vertices and is passed the default message.  On subsequent
   * iterations the vertex program is only invoked on those vertices
   * that receive messages.
   * <p>
   * @param sendMsg a user supplied function that is applied to out
   * edges of vertices that received messages in the current
   * iteration
   * <p>
   * @param mergeMsg a user supplied function that takes two incoming
   * messages of type A and merges them into a single message of type
   * A.  ''This function must be commutative and associative and
   * ideally the size of A should not increase.''
   * <p>
   * @return the resulting graph at the end of the computation
   * <p>
   * @param evidence$6 (undocumented)
   */
  public <A extends java.lang.Object> org.apache.spark.graphx.Graph<VD, ED> pregel (A initialMsg, int maxIterations, org.apache.spark.graphx.EdgeDirection activeDirection, scala.Function3<java.lang.Object, VD, A, VD> vprog, scala.Function1<org.apache.spark.graphx.EdgeTriplet<VD, ED>, scala.collection.Iterator<scala.Tuple2<java.lang.Object, A>>> sendMsg, scala.Function2<A, A, A> mergeMsg, scala.reflect.ClassTag<A> evidence$6)  { throw new RuntimeException(); }
  /**
   * Run a dynamic version of PageRank returning a graph with vertex attributes containing the
   * PageRank and edge attributes containing the normalized edge weight.
   * <p>
   * @see org.apache.spark.graphx.lib.PageRank$#runUntilConvergence
   * @param tol (undocumented)
   * @param resetProb (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.graphx.Graph<java.lang.Object, java.lang.Object> pageRank (double tol, double resetProb)  { throw new RuntimeException(); }
  /**
   * Run personalized PageRank for a given vertex, such that all random walks
   * are started relative to the source node.
   * <p>
   * @see org.apache.spark.graphx.lib.PageRank$#runUntilConvergenceWithOptions
   * @param src (undocumented)
   * @param tol (undocumented)
   * @param resetProb (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.graphx.Graph<java.lang.Object, java.lang.Object> personalizedPageRank (long src, double tol, double resetProb)  { throw new RuntimeException(); }
  /**
   * Run parallel personalized PageRank for a given array of source vertices, such
   * that all random walks are started relative to the source vertices
   * @param sources (undocumented)
   * @param numIter (undocumented)
   * @param resetProb (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.graphx.Graph<org.apache.spark.ml.linalg.Vector, java.lang.Object> staticParallelPersonalizedPageRank (long[] sources, int numIter, double resetProb)  { throw new RuntimeException(); }
  /**
   * Run Personalized PageRank for a fixed number of iterations with
   * with all iterations originating at the source node
   * returning a graph with vertex attributes
   * containing the PageRank and edge attributes the normalized edge weight.
   * <p>
   * @see org.apache.spark.graphx.lib.PageRank$#runWithOptions
   * @param src (undocumented)
   * @param numIter (undocumented)
   * @param resetProb (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.graphx.Graph<java.lang.Object, java.lang.Object> staticPersonalizedPageRank (long src, int numIter, double resetProb)  { throw new RuntimeException(); }
  /**
   * Run PageRank for a fixed number of iterations returning a graph with vertex attributes
   * containing the PageRank and edge attributes the normalized edge weight.
   * <p>
   * @see org.apache.spark.graphx.lib.PageRank$#run
   * @param numIter (undocumented)
   * @param resetProb (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.graphx.Graph<java.lang.Object, java.lang.Object> staticPageRank (int numIter, double resetProb)  { throw new RuntimeException(); }
  /**
   * Compute the connected component membership of each vertex and return a graph with the vertex
   * value containing the lowest vertex id in the connected component containing that vertex.
   * <p>
   * @see org.apache.spark.graphx.lib.ConnectedComponents$#run
   * @return (undocumented)
   */
  public  org.apache.spark.graphx.Graph<java.lang.Object, ED> connectedComponents ()  { throw new RuntimeException(); }
  /**
   * Compute the connected component membership of each vertex and return a graph with the vertex
   * value containing the lowest vertex id in the connected component containing that vertex.
   * <p>
   * @see org.apache.spark.graphx.lib.ConnectedComponents$#run
   * @param maxIterations (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.graphx.Graph<java.lang.Object, ED> connectedComponents (int maxIterations)  { throw new RuntimeException(); }
  /**
   * Compute the number of triangles passing through each vertex.
   * <p>
   * @see org.apache.spark.graphx.lib.TriangleCount$#run
   * @return (undocumented)
   */
  public  org.apache.spark.graphx.Graph<java.lang.Object, ED> triangleCount ()  { throw new RuntimeException(); }
  /**
   * Compute the strongly connected component (SCC) of each vertex and return a graph with the
   * vertex value containing the lowest vertex id in the SCC containing that vertex.
   * <p>
   * @see org.apache.spark.graphx.lib.StronglyConnectedComponents$#run
   * @param numIter (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.graphx.Graph<java.lang.Object, ED> stronglyConnectedComponents (int numIter)  { throw new RuntimeException(); }
}
