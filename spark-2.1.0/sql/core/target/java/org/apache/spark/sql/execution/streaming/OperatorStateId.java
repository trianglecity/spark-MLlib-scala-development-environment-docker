package org.apache.spark.sql.execution.streaming;
/** Used to identify the state store for a given operator. */
public  class OperatorStateId implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  java.lang.String checkpointLocation ()  { throw new RuntimeException(); }
  public  long operatorId ()  { throw new RuntimeException(); }
  public  long batchId ()  { throw new RuntimeException(); }
  // not preceding
  public   OperatorStateId (java.lang.String checkpointLocation, long operatorId, long batchId)  { throw new RuntimeException(); }
}
