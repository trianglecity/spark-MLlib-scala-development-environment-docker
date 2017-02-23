package org.apache.spark.graphx.lib;
/** Label Propagation algorithm. */
public  class LabelPropagation {
  /**
   * Run static Label Propagation for detecting communities in networks.
   * <p>
   * Each node in the network is initially assigned to its own community. At every superstep, nodes
   * send their community affiliation to all neighbors and update their state to the mode community
   * affiliation of incoming messages.
   * <p>
   * LPA is a standard community detection algorithm for graphs. It is very inexpensive
   * computationally, although (1) convergence is not guaranteed and (2) one can end up with
   * trivial solutions (all nodes are identified into a single community).
   * <p>
   * @tparam ED the edge attribute type (not used in the computation)
   * <p>
   * @param graph the graph for which to compute the community affiliation
   * @param maxSteps the number of supersteps of LPA to be performed. Because this is a static
   * implementation, the algorithm will run for exactly this many supersteps.
   * <p>
   * @return a graph with vertex attributes containing the label of community affiliation
   * @param evidence$1 (undocumented)
   */
  static public <VD extends java.lang.Object, ED extends java.lang.Object> org.apache.spark.graphx.Graph<java.lang.Object, ED> run (org.apache.spark.graphx.Graph<VD, ED> graph, int maxSteps, scala.reflect.ClassTag<ED> evidence$1)  { throw new RuntimeException(); }
}
