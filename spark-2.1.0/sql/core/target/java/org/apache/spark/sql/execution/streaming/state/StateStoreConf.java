package org.apache.spark.sql.execution.streaming.state;
/** A class that contains configuration parameters for {@link StateStore}s. */
  class StateStoreConf implements scala.Serializable {
  static public  org.apache.spark.sql.execution.streaming.state.StateStoreConf empty ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.execution.streaming.state.StateStoreConf apply (org.apache.spark.sql.internal.SQLConf conf)  { throw new RuntimeException(); }
  private  org.apache.spark.sql.internal.SQLConf conf ()  { throw new RuntimeException(); }
  // not preceding
  public   StateStoreConf (org.apache.spark.sql.internal.SQLConf conf)  { throw new RuntimeException(); }
  public   StateStoreConf ()  { throw new RuntimeException(); }
  public  int minDeltasForSnapshot ()  { throw new RuntimeException(); }
  public  int minVersionsToRetain ()  { throw new RuntimeException(); }
}
