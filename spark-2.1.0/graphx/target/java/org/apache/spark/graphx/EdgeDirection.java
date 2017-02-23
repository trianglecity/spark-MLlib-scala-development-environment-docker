package org.apache.spark.graphx;
/**
 * The direction of a directed edge relative to a vertex.
 */
public  class EdgeDirection implements scala.Serializable {
  /** Edges arriving at a vertex. */
  static public final  org.apache.spark.graphx.EdgeDirection In ()  { throw new RuntimeException(); }
  /** Edges originating from a vertex. */
  static public final  org.apache.spark.graphx.EdgeDirection Out ()  { throw new RuntimeException(); }
  /** Edges originating from *or* arriving at a vertex of interest. */
  static public final  org.apache.spark.graphx.EdgeDirection Either ()  { throw new RuntimeException(); }
  /** Edges originating from *and* arriving at a vertex of interest. */
  static public final  org.apache.spark.graphx.EdgeDirection Both ()  { throw new RuntimeException(); }
  private  java.lang.String name ()  { throw new RuntimeException(); }
  // not preceding
  private   EdgeDirection (java.lang.String name)  { throw new RuntimeException(); }
  /**
   * Reverse the direction of an edge.  An in becomes out,
   * out becomes in and both and either remain the same.
   * @return (undocumented)
   */
  public  org.apache.spark.graphx.EdgeDirection reverse ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  boolean equals (Object o)  { throw new RuntimeException(); }
  public  int hashCode ()  { throw new RuntimeException(); }
}
