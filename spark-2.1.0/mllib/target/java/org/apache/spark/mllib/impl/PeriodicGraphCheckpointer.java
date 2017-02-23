package org.apache.spark.mllib.impl;
/**
 * This class helps with persisting and checkpointing Graphs.
 * Specifically, it automatically handles persisting and (optionally) checkpointing, as well as
 * unpersisting and removing checkpoint files.
 * <p>
 * Users should call update() when a new graph has been created,
 * before the graph has been materialized.  After updating {@link PeriodicGraphCheckpointer}, users are
 * responsible for materializing the graph to ensure that persisting and checkpointing actually
 * occur.
 * <p>
 * When update() is called, this does the following:
 *  - Persist new graph (if not yet persisted), and put in queue of persisted graphs.
 *  - Unpersist graphs from queue until there are at most 3 persisted graphs.
 *  - If using checkpointing and the checkpoint interval has been reached,
 *     - Checkpoint the new graph, and put in a queue of checkpointed graphs.
 *     - Remove older checkpoints.
 * <p>
 * WARNINGS:
 *  - This class should NOT be copied (since copies may conflict on which Graphs should be
 *    checkpointed).
 *  - This class removes checkpoint files once later graphs have been checkpointed.
 *    However, references to the older graphs will still return isCheckpointed = true.
 * <p>
 * Example usage:
 * <pre><code>
 *  val (graph1, graph2, graph3, ...) = ...
 *  val cp = new PeriodicGraphCheckpointer(2, sc)
 *  graph1.vertices.count(); graph1.edges.count()
 *  // persisted: graph1
 *  cp.updateGraph(graph2)
 *  graph2.vertices.count(); graph2.edges.count()
 *  // persisted: graph1, graph2
 *  // checkpointed: graph2
 *  cp.updateGraph(graph3)
 *  graph3.vertices.count(); graph3.edges.count()
 *  // persisted: graph1, graph2, graph3
 *  // checkpointed: graph2
 *  cp.updateGraph(graph4)
 *  graph4.vertices.count(); graph4.edges.count()
 *  // persisted: graph2, graph3, graph4
 *  // checkpointed: graph4
 *  cp.updateGraph(graph5)
 *  graph5.vertices.count(); graph5.edges.count()
 *  // persisted: graph3, graph4, graph5
 *  // checkpointed: graph4
 * </code></pre>
 * <p>
 * param:  checkpointInterval Graphs will be checkpointed at this interval.
 *                           If this interval was set as -1, then checkpointing will be disabled.
 * @tparam VD  Vertex descriptor type
 * @tparam ED  Edge descriptor type
 * <p>
 * TODO: Move this out of MLlib?
 */
  class PeriodicGraphCheckpointer<VD extends java.lang.Object, ED extends java.lang.Object> extends org.apache.spark.mllib.impl.PeriodicCheckpointer<org.apache.spark.graphx.Graph<VD, ED>> {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   PeriodicGraphCheckpointer (int checkpointInterval, org.apache.spark.SparkContext sc)  { throw new RuntimeException(); }
  protected  void checkpoint (org.apache.spark.graphx.Graph<VD, ED> data)  { throw new RuntimeException(); }
  protected  boolean isCheckpointed (org.apache.spark.graphx.Graph<VD, ED> data)  { throw new RuntimeException(); }
  protected  void persist (org.apache.spark.graphx.Graph<VD, ED> data)  { throw new RuntimeException(); }
  protected  void unpersist (org.apache.spark.graphx.Graph<VD, ED> data)  { throw new RuntimeException(); }
  protected  scala.collection.Iterable<java.lang.String> getCheckpointFiles (org.apache.spark.graphx.Graph<VD, ED> data)  { throw new RuntimeException(); }
}
