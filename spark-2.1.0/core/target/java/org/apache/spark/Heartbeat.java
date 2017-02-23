package org.apache.spark;
/**
 * A heartbeat from executors to the driver. This is a shared message used by several internal
 * components to convey liveness or execution information for in-progress tasks. It will also
 * expire the hosts that have not heartbeated for more than spark.network.timeout.
 * spark.executor.heartbeatInterval should be significantly less than spark.network.timeout.
 */
  class Heartbeat implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  java.lang.String executorId ()  { throw new RuntimeException(); }
  public  scala.Tuple2<java.lang.Object, scala.collection.Seq<org.apache.spark.util.AccumulatorV2<?, ?>>>[] accumUpdates ()  { throw new RuntimeException(); }
  public  org.apache.spark.storage.BlockManagerId blockManagerId ()  { throw new RuntimeException(); }
  // not preceding
  public   Heartbeat (java.lang.String executorId, scala.Tuple2<java.lang.Object, scala.collection.Seq<org.apache.spark.util.AccumulatorV2<?, ?>>>[] accumUpdates, org.apache.spark.storage.BlockManagerId blockManagerId)  { throw new RuntimeException(); }
}
