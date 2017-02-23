package org.apache.spark.graphx.lib;
/** Implementation of SVD++ algorithm. */
public  class SVDPlusPlus {
  /** Configuration parameters for SVDPlusPlus. */
  static public  class Conf implements scala.Serializable {
    public  int rank ()  { throw new RuntimeException(); }
    public  int maxIters ()  { throw new RuntimeException(); }
    public  double minVal ()  { throw new RuntimeException(); }
    public  double maxVal ()  { throw new RuntimeException(); }
    public  double gamma1 ()  { throw new RuntimeException(); }
    public  double gamma2 ()  { throw new RuntimeException(); }
    public  double gamma6 ()  { throw new RuntimeException(); }
    public  double gamma7 ()  { throw new RuntimeException(); }
    // not preceding
    public   Conf (int rank, int maxIters, double minVal, double maxVal, double gamma1, double gamma2, double gamma6, double gamma7)  { throw new RuntimeException(); }
  }
  /**
   * Implement SVD++ based on "Factorization Meets the Neighborhood:
   * a Multifaceted Collaborative Filtering Model",
   * available at <a href="http://public.research.att.com/~volinsky/netflix/kdd08koren.pdf">
   * here</a>.
   * <p>
   * The prediction rule is rui = u + bu + bi + qi*(pu + |N(u)|^^-0.5^^*sum(y)),
   * see the details on page 6.
   * <p>
   * @param edges edges for constructing the graph
   * <p>
   * @param conf SVDPlusPlus parameters
   * <p>
   * @return a graph with vertex attributes containing the trained model
   */
  static public  scala.Tuple2<org.apache.spark.graphx.Graph<scala.Tuple4<double[], double[], java.lang.Object, java.lang.Object>, java.lang.Object>, java.lang.Object> run (org.apache.spark.rdd.RDD<org.apache.spark.graphx.Edge<java.lang.Object>> edges, org.apache.spark.graphx.lib.SVDPlusPlus.Conf conf)  { throw new RuntimeException(); }
  /**
   * Forces materialization of a Graph by count()ing its RDDs.
   * @param g (undocumented)
   */
  static private  void materialize (org.apache.spark.graphx.Graph<?, ?> g)  { throw new RuntimeException(); }
}
