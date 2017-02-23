package org.apache.spark.graphx.util;
/** A collection of graph generating functions. */
public  class GraphGenerators$ implements org.apache.spark.internal.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final GraphGenerators$ MODULE$ = null;
  public   GraphGenerators$ ()  { throw new RuntimeException(); }
  public  double RMATa ()  { throw new RuntimeException(); }
  public  double RMATb ()  { throw new RuntimeException(); }
  public  double RMATd ()  { throw new RuntimeException(); }
  /**
   * Generate a graph whose vertex out degree distribution is log normal.
   * <p>
   * The default values for mu and sigma are taken from the Pregel paper:
   * <p>
   * Grzegorz Malewicz, Matthew H. Austern, Aart J.C Bik, James C. Dehnert,
   * Ilan Horn, Naty Leiser, and Grzegorz Czajkowski. 2010.
   * Pregel: a system for large-scale graph processing. SIGMOD '10.
   * <p>
   * If the seed is -1 (default), a random seed is chosen. Otherwise, use
   * the user-specified seed.
   * <p>
   * @param sc Spark Context
   * @param numVertices number of vertices in generated graph
   * @param numEParts (optional) number of partitions
   * @param mu (optional, default: 4.0) mean of out-degree distribution
   * @param sigma (optional, default: 1.3) standard deviation of out-degree distribution
   * @param seed (optional, default: -1) seed for RNGs, -1 causes a random seed to be chosen
   * @return Graph object
   */
  public  org.apache.spark.graphx.Graph<java.lang.Object, java.lang.Object> logNormalGraph (org.apache.spark.SparkContext sc, int numVertices, int numEParts, double mu, double sigma, long seed)  { throw new RuntimeException(); }
  public  double RMATc ()  { throw new RuntimeException(); }
  public  org.apache.spark.graphx.Edge<java.lang.Object>[] generateRandomEdges (int src, int numEdges, int maxVertexId, long seed)  { throw new RuntimeException(); }
  /**
   * Randomly samples from a log normal distribution whose corresponding normal distribution has
   * the given mean and standard deviation. It uses the formula <code>X = exp(m+s*Z)</code> where <code>m</code>,
   * <code>s</code> are the mean, standard deviation of the lognormal distribution and
   * <code>Z ~ N(0, 1)</code>. In this function,
   * <code>m = e^(mu+sigma^2/2)</code> and <code>s = sqrt[(e^(sigma^2) - 1)(e^(2*mu+sigma^2))]</code>.
   * <p>
   * @param mu the mean of the normal distribution
   * @param sigma the standard deviation of the normal distribution
   * @param maxVal exclusive upper bound on the value of the sample
   * @param seed optional seed
   * @return (undocumented)
   */
    int sampleLogNormal (double mu, double sigma, int maxVal, long seed)  { throw new RuntimeException(); }
  /**
   * A random graph generator using the R-MAT model, proposed in
   * "R-MAT: A Recursive Model for Graph Mining" by Chakrabarti et al.
   * <p>
   * See http://www.cs.cmu.edu/~christos/PUBLICATIONS/siam04.pdf.
   * @param sc (undocumented)
   * @param requestedNumVertices (undocumented)
   * @param numEdges (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.graphx.Graph<java.lang.Object, java.lang.Object> rmatGraph (org.apache.spark.SparkContext sc, int requestedNumVertices, int numEdges)  { throw new RuntimeException(); }
  private <ED extends java.lang.Object> org.apache.spark.graphx.Graph<java.lang.Object, ED> outDegreeFromEdges (org.apache.spark.rdd.RDD<org.apache.spark.graphx.Edge<ED>> edges, scala.reflect.ClassTag<ED> evidence$1)  { throw new RuntimeException(); }
  /**
   * @param numVertices Specifies the total number of vertices in the graph (used to get
   * the dimensions of the adjacency matrix
   * @return (undocumented)
   */
  private  org.apache.spark.graphx.Edge<java.lang.Object> addEdge (int numVertices)  { throw new RuntimeException(); }
  /**
   * This method recursively subdivides the adjacency matrix into quadrants
   * until it picks a single cell. The naming conventions in this paper match
   * those of the R-MAT paper. There are a power of 2 number of nodes in the graph.
   * The adjacency matrix looks like:
   * <pre>
   *
   *          dst -&gt;
   * (x,y) ***************  _
   *       |      |      |  |
   *       |  a   |  b   |  |
   *  src  |      |      |  |
   *   |   ***************  | T
   *  \|/  |      |      |  |
   *       |   c  |   d  |  |
   *       |      |      |  |
   *       ***************  -
   * </pre>
   * <p>
   * where this represents the subquadrant of the adj matrix currently being
   * subdivided. (x,y) represent the upper left hand corner of the subquadrant,
   * and T represents the side length (guaranteed to be a power of 2).
   * <p>
   * After choosing the next level subquadrant, we get the resulting sets
   * of parameters:
   * <pre><code>
   *    quad = a, x'=x, y'=y, T'=T/2
   *    quad = b, x'=x+T/2, y'=y, T'=T/2
   *    quad = c, x'=x, y'=y+T/2, T'=T/2
   *    quad = d, x'=x+T/2, y'=y+T/2, T'=T/2
   * </code></pre>
   * @param x (undocumented)
   * @param y (undocumented)
   * @param t (undocumented)
   * @return (undocumented)
   */
  private  scala.Tuple2<java.lang.Object, java.lang.Object> chooseCell (int x, int y, int t)  { throw new RuntimeException(); }
  private  int pickQuadrant (double a, double b, double c, double d)  { throw new RuntimeException(); }
  /**
   * Create <code>rows</code> by <code>cols</code> grid graph with each vertex connected to its
   * row+1 and col+1 neighbors.  Vertex ids are assigned in row major
   * order.
   * <p>
   * @param sc the spark context in which to construct the graph
   * @param rows the number of rows
   * @param cols the number of columns
   * <p>
   * @return A graph containing vertices with the row and column ids
   * as their attributes and edge values as 1.0.
   */
  public  org.apache.spark.graphx.Graph<scala.Tuple2<java.lang.Object, java.lang.Object>, java.lang.Object> gridGraph (org.apache.spark.SparkContext sc, int rows, int cols)  { throw new RuntimeException(); }
  /**
   * Create a star graph with vertex 0 being the center.
   * <p>
   * @param sc the spark context in which to construct the graph
   * @param nverts the number of vertices in the star
   * <p>
   * @return A star graph containing <code>nverts</code> vertices with vertex 0
   * being the center vertex.
   */
  public  org.apache.spark.graphx.Graph<java.lang.Object, java.lang.Object> starGraph (org.apache.spark.SparkContext sc, int nverts)  { throw new RuntimeException(); }
}
