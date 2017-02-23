package org.apache.spark.graphx.lib;
/**
 * PageRank algorithm implementation. There are two implementations of PageRank implemented.
 * <p>
 * The first implementation uses the standalone <code>Graph</code> interface and runs PageRank
 * for a fixed number of iterations:
 * <pre><code>
 * var PR = Array.fill(n)( 1.0 )
 * val oldPR = Array.fill(n)( 1.0 )
 * for( iter &lt;- 0 until numIter ) {
 *   swap(oldPR, PR)
 *   for( i &lt;- 0 until n ) {
 *     PR[i] = alpha + (1 - alpha) * inNbrs[i].map(j =&gt; oldPR[j] / outDeg[j]).sum
 *   }
 * }
 * </code></pre>
 * <p>
 * The second implementation uses the <code>Pregel</code> interface and runs PageRank until
 * convergence:
 * <p>
 * <pre><code>
 * var PR = Array.fill(n)( 1.0 )
 * val oldPR = Array.fill(n)( 0.0 )
 * while( max(abs(PR - oldPr)) &gt; tol ) {
 *   swap(oldPR, PR)
 *   for( i &lt;- 0 until n if abs(PR[i] - oldPR[i]) &gt; tol ) {
 *     PR[i] = alpha + (1 - \alpha) * inNbrs[i].map(j =&gt; oldPR[j] / outDeg[j]).sum
 *   }
 * }
 * </code></pre>
 * <p>
 * <code>alpha</code> is the random reset probability (typically 0.15), <code>inNbrs[i]</code> is the set of
 * neighbors which link to <code>i</code> and <code>outDeg[j]</code> is the out degree of vertex <code>j</code>.
 * <p>
 * @note This is not the "normalized" PageRank and as a consequence pages that have no
 * inlinks will have a PageRank of alpha.
 */
public  class PageRank$ implements org.apache.spark.internal.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final PageRank$ MODULE$ = null;
  public   PageRank$ ()  { throw new RuntimeException(); }
  /**
   * Run PageRank for a fixed number of iterations returning a graph
   * with vertex attributes containing the PageRank and edge
   * attributes the normalized edge weight.
   * <p>
   * @tparam VD the original vertex attribute (not used)
   * @tparam ED the original edge attribute (not used)
   * <p>
   * @param graph the graph on which to compute PageRank
   * @param numIter the number of iterations of PageRank to run
   * @param resetProb the random reset probability (alpha)
   * <p>
   * @return the graph containing with each vertex containing the PageRank and each edge
   *         containing the normalized weight.
   * @param evidence$1 (undocumented)
   * @param evidence$2 (undocumented)
   */
  public <VD extends java.lang.Object, ED extends java.lang.Object> org.apache.spark.graphx.Graph<java.lang.Object, java.lang.Object> run (org.apache.spark.graphx.Graph<VD, ED> graph, int numIter, double resetProb, scala.reflect.ClassTag<VD> evidence$1, scala.reflect.ClassTag<ED> evidence$2)  { throw new RuntimeException(); }
  /**
   * Run PageRank for a fixed number of iterations returning a graph
   * with vertex attributes containing the PageRank and edge
   * attributes the normalized edge weight.
   * <p>
   * @tparam VD the original vertex attribute (not used)
   * @tparam ED the original edge attribute (not used)
   * <p>
   * @param graph the graph on which to compute PageRank
   * @param numIter the number of iterations of PageRank to run
   * @param resetProb the random reset probability (alpha)
   * @param srcId the source vertex for a Personalized Page Rank (optional)
   * <p>
   * @return the graph containing with each vertex containing the PageRank and each edge
   *         containing the normalized weight.
   * <p>
   * @param evidence$3 (undocumented)
   * @param evidence$4 (undocumented)
   */
  public <VD extends java.lang.Object, ED extends java.lang.Object> org.apache.spark.graphx.Graph<java.lang.Object, java.lang.Object> runWithOptions (org.apache.spark.graphx.Graph<VD, ED> graph, int numIter, double resetProb, scala.Option<java.lang.Object> srcId, scala.reflect.ClassTag<VD> evidence$3, scala.reflect.ClassTag<ED> evidence$4)  { throw new RuntimeException(); }
  /**
   * Run Personalized PageRank for a fixed number of iterations, for a
   * set of starting nodes in parallel. Returns a graph with vertex attributes
   * containing the pagerank relative to all starting nodes (as a sparse vector) and
   * edge attributes the normalized edge weight
   * <p>
   * @tparam VD The original vertex attribute (not used)
   * @tparam ED The original edge attribute (not used)
   * <p>
   * @param graph The graph on which to compute personalized pagerank
   * @param numIter The number of iterations to run
   * @param resetProb The random reset probability
   * @param sources The list of sources to compute personalized pagerank from
   * @return the graph with vertex attributes
   *         containing the pagerank relative to all starting nodes (as a sparse vector) and
   *         edge attributes the normalized edge weight
   * @param evidence$5 (undocumented)
   * @param evidence$6 (undocumented)
   */
  public <VD extends java.lang.Object, ED extends java.lang.Object> org.apache.spark.graphx.Graph<org.apache.spark.ml.linalg.Vector, java.lang.Object> runParallelPersonalizedPageRank (org.apache.spark.graphx.Graph<VD, ED> graph, int numIter, double resetProb, long[] sources, scala.reflect.ClassTag<VD> evidence$5, scala.reflect.ClassTag<ED> evidence$6)  { throw new RuntimeException(); }
  /**
   * Run a dynamic version of PageRank returning a graph with vertex attributes containing the
   * PageRank and edge attributes containing the normalized edge weight.
   * <p>
   * @tparam VD the original vertex attribute (not used)
   * @tparam ED the original edge attribute (not used)
   * <p>
   * @param graph the graph on which to compute PageRank
   * @param tol the tolerance allowed at convergence (smaller =&gt; more accurate).
   * @param resetProb the random reset probability (alpha)
   * <p>
   * @return the graph containing with each vertex containing the PageRank and each edge
   *         containing the normalized weight.
   * @param evidence$7 (undocumented)
   * @param evidence$8 (undocumented)
   */
  public <VD extends java.lang.Object, ED extends java.lang.Object> org.apache.spark.graphx.Graph<java.lang.Object, java.lang.Object> runUntilConvergence (org.apache.spark.graphx.Graph<VD, ED> graph, double tol, double resetProb, scala.reflect.ClassTag<VD> evidence$7, scala.reflect.ClassTag<ED> evidence$8)  { throw new RuntimeException(); }
  /**
   * Run a dynamic version of PageRank returning a graph with vertex attributes containing the
   * PageRank and edge attributes containing the normalized edge weight.
   * <p>
   * @tparam VD the original vertex attribute (not used)
   * @tparam ED the original edge attribute (not used)
   * <p>
   * @param graph the graph on which to compute PageRank
   * @param tol the tolerance allowed at convergence (smaller =&gt; more accurate).
   * @param resetProb the random reset probability (alpha)
   * @param srcId the source vertex for a Personalized Page Rank (optional)
   * <p>
   * @return the graph containing with each vertex containing the PageRank and each edge
   *         containing the normalized weight.
   * @param evidence$9 (undocumented)
   * @param evidence$10 (undocumented)
   */
  public <VD extends java.lang.Object, ED extends java.lang.Object> org.apache.spark.graphx.Graph<java.lang.Object, java.lang.Object> runUntilConvergenceWithOptions (org.apache.spark.graphx.Graph<VD, ED> graph, double tol, double resetProb, scala.Option<java.lang.Object> srcId, scala.reflect.ClassTag<VD> evidence$9, scala.reflect.ClassTag<ED> evidence$10)  { throw new RuntimeException(); }
}
