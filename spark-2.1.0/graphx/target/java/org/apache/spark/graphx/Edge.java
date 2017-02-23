package org.apache.spark.graphx;
/**
 * A single directed edge consisting of a source id, target id,
 * and the data associated with the edge.
 * <p>
 * @tparam ED type of the edge attribute
 * <p>
 * param:  srcId The vertex id of the source vertex
 * param:  dstId The vertex id of the target vertex
 * param:  attr The attribute associated with the edge
 */
public  class Edge<ED extends java.lang.Object> implements scala.Serializable, scala.Product {
  static  <ED extends java.lang.Object> java.lang.Object lexicographicOrdering ()  { throw new RuntimeException(); }
  static  <ED extends java.lang.Object> org.apache.spark.util.collection.SortDataFormat<org.apache.spark.graphx.Edge<ED>, org.apache.spark.graphx.Edge<ED>[]> edgeArraySortDataFormat ()  { throw new RuntimeException(); }
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  long srcId ()  { throw new RuntimeException(); }
  public  long dstId ()  { throw new RuntimeException(); }
  public  ED attr ()  { throw new RuntimeException(); }
  // not preceding
  public   Edge (long srcId, long dstId, ED attr)  { throw new RuntimeException(); }
  /**
   * Given one vertex in the edge return the other vertex.
   * <p>
   * @param vid the id one of the two vertices on the edge.
   * @return the id of the other vertex on the edge.
   */
  public  long otherVertexId (long vid)  { throw new RuntimeException(); }
  /**
   * Return the relative direction of the edge to the corresponding
   * vertex.
   * <p>
   * @param vid the id of one of the two vertices in the edge.
   * @return the relative direction of the edge to the corresponding
   * vertex.
   */
  public  org.apache.spark.graphx.EdgeDirection relativeDirection (long vid)  { throw new RuntimeException(); }
}
