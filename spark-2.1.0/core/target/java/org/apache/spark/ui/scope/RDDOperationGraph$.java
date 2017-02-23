package org.apache.spark.ui.scope;
public  class RDDOperationGraph$ implements org.apache.spark.internal.Logging, scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final RDDOperationGraph$ MODULE$ = null;
  public   RDDOperationGraph$ ()  { throw new RuntimeException(); }
  public  java.lang.String STAGE_CLUSTER_PREFIX ()  { throw new RuntimeException(); }
  /**
   * Construct a RDDOperationGraph for a given stage.
   * <p>
   * The root cluster represents the stage, and all children clusters represent RDD operations.
   * Each node represents an RDD, and each edge represents a dependency between two RDDs pointing
   * from the parent to the child.
   * <p>
   * This does not currently merge common operation scopes across stages. This may be worth
   * supporting in the future if we decide to group certain stages within the same job under
   * a common scope (e.g. part of a SQL query).
   * @param stage (undocumented)
   * @param retainedNodes (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ui.scope.RDDOperationGraph makeOperationGraph (org.apache.spark.scheduler.StageInfo stage, int retainedNodes)  { throw new RuntimeException(); }
  /**
   * Generate the content of a dot file that describes the specified graph.
   * <p>
   * Note that this only uses a minimal subset of features available to the DOT specification.
   * Part of the styling must be done here because the rendering library must take certain
   * attributes into account when arranging the graph elements. More style is added in the
   * visualization later through post-processing in JavaScript.
   * <p>
   * For the complete DOT specification, see http://www.graphviz.org/Documentation/dotguide.pdf.
   * @param graph (undocumented)
   * @return (undocumented)
   */
  public  java.lang.String makeDotFile (org.apache.spark.ui.scope.RDDOperationGraph graph)  { throw new RuntimeException(); }
  /** Return the dot representation of a node in an RDDOperationGraph. */
  private  java.lang.String makeDotNode (org.apache.spark.ui.scope.RDDOperationNode node)  { throw new RuntimeException(); }
  /** Update the dot representation of the RDDOperationGraph in cluster to subgraph. */
  private  void makeDotSubgraph (scala.collection.mutable.StringBuilder subgraph, org.apache.spark.ui.scope.RDDOperationCluster cluster, java.lang.String indent)  { throw new RuntimeException(); }
}
