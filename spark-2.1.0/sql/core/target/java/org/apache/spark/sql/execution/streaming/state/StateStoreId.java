package org.apache.spark.sql.execution.streaming.state;
/** Unique identifier for a {@link StateStore} */
public  class StateStoreId implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  java.lang.String checkpointLocation ()  { throw new RuntimeException(); }
  public  long operatorId ()  { throw new RuntimeException(); }
  public  int partitionId ()  { throw new RuntimeException(); }
  // not preceding
  public   StateStoreId (java.lang.String checkpointLocation, long operatorId, int partitionId)  { throw new RuntimeException(); }
}
