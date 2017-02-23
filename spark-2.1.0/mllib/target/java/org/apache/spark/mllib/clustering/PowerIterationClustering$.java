package org.apache.spark.mllib.clustering;
public  class PowerIterationClustering$ implements org.apache.spark.internal.Logging, scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final PowerIterationClustering$ MODULE$ = null;
  public   PowerIterationClustering$ ()  { throw new RuntimeException(); }
  /**
   * Normalizes the affinity graph (A) and returns the normalized affinity matrix (W).
   * @param graph (undocumented)
   * @return (undocumented)
   */
    org.apache.spark.graphx.Graph<java.lang.Object, java.lang.Object> normalize (org.apache.spark.graphx.Graph<java.lang.Object, java.lang.Object> graph)  { throw new RuntimeException(); }
  /**
   * Normalizes the affinity matrix (A) by row sums and returns the normalized affinity matrix (W).
   * @param similarities (undocumented)
   * @return (undocumented)
   */
    org.apache.spark.graphx.Graph<java.lang.Object, java.lang.Object> normalize (org.apache.spark.rdd.RDD<scala.Tuple3<java.lang.Object, java.lang.Object, java.lang.Object>> similarities)  { throw new RuntimeException(); }
  /**
   * Generates random vertex properties (v0) to start power iteration.
   * <p>
   * @param g a graph representing the normalized affinity matrix (W)
   * @return a graph with edges representing W and vertices representing a random vector
   *         with unit 1-norm
   */
    org.apache.spark.graphx.Graph<java.lang.Object, java.lang.Object> randomInit (org.apache.spark.graphx.Graph<java.lang.Object, java.lang.Object> g)  { throw new RuntimeException(); }
  /**
   * Generates the degree vector as the vertex properties (v0) to start power iteration.
   * It is not exactly the node degrees but just the normalized sum similarities. Call it
   * as degree vector because it is used in the PIC paper.
   * <p>
   * @param g a graph representing the normalized affinity matrix (W)
   * @return a graph with edges representing W and vertices representing the degree vector
   */
    org.apache.spark.graphx.Graph<java.lang.Object, java.lang.Object> initDegreeVector (org.apache.spark.graphx.Graph<java.lang.Object, java.lang.Object> g)  { throw new RuntimeException(); }
  /**
   * Runs power iteration.
   * @param g input graph with edges representing the normalized affinity matrix (W) and vertices
   *          representing the initial vector of the power iterations.
   * @param maxIterations maximum number of iterations
   * @return a {@link VertexRDD} representing the pseudo-eigenvector
   */
    org.apache.spark.graphx.VertexRDD<java.lang.Object> powerIter (org.apache.spark.graphx.Graph<java.lang.Object, java.lang.Object> g, int maxIterations)  { throw new RuntimeException(); }
  /**
   * Runs k-means clustering.
   * @param v a {@link VertexRDD} representing the pseudo-eigenvector
   * @param k number of clusters
   * @return a {@link VertexRDD} representing the clustering assignments
   */
    org.apache.spark.graphx.VertexRDD<java.lang.Object> kMeans (org.apache.spark.graphx.VertexRDD<java.lang.Object> v, int k)  { throw new RuntimeException(); }
}
