package org.apache.spark.graphx;
/**
 * Represents an edge along with its neighboring vertices and allows sending messages along the
 * edge. Used in {@link Graph#aggregateMessages}.
 */
public abstract class EdgeContext<VD extends java.lang.Object, ED extends java.lang.Object, A extends java.lang.Object> {
  /**
   * Extractor mainly used for Graph#aggregateMessages*.
   * Example:
   * <pre><code>
   *  val messages = graph.aggregateMessages(
   *    case ctx &#64; EdgeContext(_, _, _, _, attr) =&gt;
   *      ctx.sendToDst(attr)
   *    , _ + _)
   * </code></pre>
   * @param edge (undocumented)
   * @return (undocumented)
   */
  static public <VD extends java.lang.Object, ED extends java.lang.Object, A extends java.lang.Object> scala.Some<scala.Tuple5<java.lang.Object, java.lang.Object, VD, VD, ED>> unapply (org.apache.spark.graphx.EdgeContext<VD, ED, A> edge)  { throw new RuntimeException(); }
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   EdgeContext ()  { throw new RuntimeException(); }
  /** The vertex id of the edge's source vertex. */
  public abstract  long srcId ()  ;
  /** The vertex id of the edge's destination vertex. */
  public abstract  long dstId ()  ;
  /** The vertex attribute of the edge's source vertex. */
  public abstract  VD srcAttr ()  ;
  /** The vertex attribute of the edge's destination vertex. */
  public abstract  VD dstAttr ()  ;
  /** The attribute associated with the edge. */
  public abstract  ED attr ()  ;
  /** Sends a message to the source vertex. */
  public abstract  void sendToSrc (A msg)  ;
  /** Sends a message to the destination vertex. */
  public abstract  void sendToDst (A msg)  ;
  /** Converts the edge and vertex properties into an {@link EdgeTriplet} for convenience. */
  public  org.apache.spark.graphx.EdgeTriplet<VD, ED> toEdgeTriplet ()  { throw new RuntimeException(); }
}
