package org.apache.spark.sql.execution.streaming.state;
/** Classes representing messages */
public  class ReportActiveInstance implements org.apache.spark.sql.execution.streaming.state.StateStoreCoordinatorMessage, scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.streaming.state.StateStoreId storeId ()  { throw new RuntimeException(); }
  public  java.lang.String host ()  { throw new RuntimeException(); }
  public  java.lang.String executorId ()  { throw new RuntimeException(); }
  // not preceding
  public   ReportActiveInstance (org.apache.spark.sql.execution.streaming.state.StateStoreId storeId, java.lang.String host, java.lang.String executorId)  { throw new RuntimeException(); }
}
