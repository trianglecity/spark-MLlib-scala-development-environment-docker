package org.apache.spark.graphx.lib;
/** Connected components algorithm. */
public  class ConnectedComponents$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final ConnectedComponents$ MODULE$ = null;
  public   ConnectedComponents$ ()  { throw new RuntimeException(); }
  /**
   * Compute the connected component membership of each vertex and return a graph with the vertex
   * value containing the lowest vertex id in the connected component containing that vertex.
   * <p>
   * @tparam VD the vertex attribute type (discarded in the computation)
   * @tparam ED the edge attribute type (preserved in the computation)
   * @param graph the graph for which to compute the connected components
   * @param maxIterations the maximum number of iterations to run for
   * @return a graph with vertex attributes containing the smallest vertex in each
   *         connected component
   * @param evidence$1 (undocumented)
   * @param evidence$2 (undocumented)
   */
  public <VD extends java.lang.Object, ED extends java.lang.Object> org.apache.spark.graphx.Graph<java.lang.Object, ED> run (org.apache.spark.graphx.Graph<VD, ED> graph, int maxIterations, scala.reflect.ClassTag<VD> evidence$1, scala.reflect.ClassTag<ED> evidence$2)  { throw new RuntimeException(); }
  /**
   * Compute the connected component membership of each vertex and return a graph with the vertex
   * value containing the lowest vertex id in the connected component containing that vertex.
   * <p>
   * @tparam VD the vertex attribute type (discarded in the computation)
   * @tparam ED the edge attribute type (preserved in the computation)
   * @param graph the graph for which to compute the connected components
   * @return a graph with vertex attributes containing the smallest vertex in each
   *         connected component
   * @param evidence$3 (undocumented)
   * @param evidence$4 (undocumented)
   */
  public <VD extends java.lang.Object, ED extends java.lang.Object> org.apache.spark.graphx.Graph<java.lang.Object, ED> run (org.apache.spark.graphx.Graph<VD, ED> graph, scala.reflect.ClassTag<VD> evidence$3, scala.reflect.ClassTag<ED> evidence$4)  { throw new RuntimeException(); }
}
