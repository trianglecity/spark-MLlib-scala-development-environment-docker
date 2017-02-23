package org.apache.spark.sql.execution.streaming.state;
/**
 * Class for coordinating instances of {@link StateStore}s loaded in executors across the cluster,
 * and get their locations for job scheduling.
 */
public  class StateStoreCoordinator implements org.apache.spark.rpc.ThreadSafeRpcEndpoint, org.apache.spark.internal.Logging {
  public  org.apache.spark.rpc.RpcEnv rpcEnv ()  { throw new RuntimeException(); }
  // not preceding
  public   StateStoreCoordinator (org.apache.spark.rpc.RpcEnv rpcEnv)  { throw new RuntimeException(); }
  private  scala.collection.mutable.HashMap<org.apache.spark.sql.execution.streaming.state.StateStoreId, org.apache.spark.scheduler.ExecutorCacheTaskLocation> instances ()  { throw new RuntimeException(); }
  public  scala.PartialFunction<java.lang.Object, scala.runtime.BoxedUnit> receive ()  { throw new RuntimeException(); }
  public  scala.PartialFunction<java.lang.Object, scala.runtime.BoxedUnit> receiveAndReply (org.apache.spark.rpc.RpcCallContext context)  { throw new RuntimeException(); }
}
