package org.apache.spark.graphx;
public  class EdgeContext$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final EdgeContext$ MODULE$ = null;
  public   EdgeContext$ ()  { throw new RuntimeException(); }
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
  public <VD extends java.lang.Object, ED extends java.lang.Object, A extends java.lang.Object> scala.Some<scala.Tuple5<java.lang.Object, java.lang.Object, VD, VD, ED>> unapply (org.apache.spark.graphx.EdgeContext<VD, ED, A> edge)  { throw new RuntimeException(); }
}
