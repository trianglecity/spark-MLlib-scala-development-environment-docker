package org.apache.spark;
/** RpcEndpoint class for MapOutputTrackerMaster */
  class MapOutputTrackerMasterEndpoint implements org.apache.spark.rpc.RpcEndpoint, org.apache.spark.internal.Logging {
  public  org.apache.spark.rpc.RpcEnv rpcEnv ()  { throw new RuntimeException(); }
  // not preceding
  public   MapOutputTrackerMasterEndpoint (org.apache.spark.rpc.RpcEnv rpcEnv, org.apache.spark.MapOutputTrackerMaster tracker, org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  public  scala.PartialFunction<java.lang.Object, scala.runtime.BoxedUnit> receiveAndReply (org.apache.spark.rpc.RpcCallContext context)  { throw new RuntimeException(); }
}
