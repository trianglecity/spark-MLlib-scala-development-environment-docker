package org.apache.spark.ui.scope;
/**
 * A directed edge connecting two nodes in an RDDOperationGraph.
 * This represents an RDD dependency.
 */
  class RDDOperationEdge implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  int fromId ()  { throw new RuntimeException(); }
  public  int toId ()  { throw new RuntimeException(); }
  // not preceding
  public   RDDOperationEdge (int fromId, int toId)  { throw new RuntimeException(); }
}
