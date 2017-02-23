package org.apache.spark.examples.graphx;
/**
 * A vertex is part of a triangle when it has two adjacent vertices with an edge between them.
 * GraphX implements a triangle counting algorithm in the [<code>TriangleCount</code> object][TriangleCount]
 * that determines the number of triangles passing through each vertex,
 * providing a measure of clustering.
 * We compute the triangle count of the social network dataset.
 * <p>
 * Note that <code>TriangleCount</code> requires the edges to be in canonical orientation (<code>srcId < dstId</code>)
 * and the graph to be partitioned using [<code>Graph.partitionBy</code>][Graph.partitionBy].
 * <p>
 * Run with
 * <pre><code>
 * bin/run-example graphx.TriangleCountingExample
 * </code></pre>
 */
public  class TriangleCountingExample$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final TriangleCountingExample$ MODULE$ = null;
  public   TriangleCountingExample$ ()  { throw new RuntimeException(); }
  public  void main (java.lang.String[] args)  { throw new RuntimeException(); }
}
