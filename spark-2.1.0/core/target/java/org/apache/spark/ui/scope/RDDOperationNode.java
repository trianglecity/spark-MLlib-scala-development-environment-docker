package org.apache.spark.ui.scope;
/** A node in an RDDOperationGraph. This represents an RDD. */
  class RDDOperationNode implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  int id ()  { throw new RuntimeException(); }
  public  java.lang.String name ()  { throw new RuntimeException(); }
  public  boolean cached ()  { throw new RuntimeException(); }
  public  java.lang.String callsite ()  { throw new RuntimeException(); }
  // not preceding
  public   RDDOperationNode (int id, java.lang.String name, boolean cached, java.lang.String callsite)  { throw new RuntimeException(); }
}
