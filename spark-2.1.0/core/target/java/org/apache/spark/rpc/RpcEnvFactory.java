package org.apache.spark.rpc;
/**
 * A factory class to create the {@link RpcEnv}. It must have an empty constructor so that it can be
 * created using Reflection.
 */
  interface RpcEnvFactory {
  public  org.apache.spark.rpc.RpcEnv create (org.apache.spark.rpc.RpcEnvConfig config)  ;
}
