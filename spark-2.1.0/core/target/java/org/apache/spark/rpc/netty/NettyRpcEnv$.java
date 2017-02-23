package org.apache.spark.rpc.netty;
public  class NettyRpcEnv$ implements org.apache.spark.internal.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final NettyRpcEnv$ MODULE$ = null;
  public   NettyRpcEnv$ ()  { throw new RuntimeException(); }
  /**
   * When deserializing the {@link NettyRpcEndpointRef}, it needs a reference to {@link NettyRpcEnv}.
   * Use <code>currentEnv</code> to wrap the deserialization codes. E.g.,
   * <p>
   * <pre><code>
   *   NettyRpcEnv.currentEnv.withValue(this) {
   *     your deserialization codes
   *   }
   * </code></pre>
   * @return (undocumented)
   */
    scala.util.DynamicVariable<org.apache.spark.rpc.netty.NettyRpcEnv> currentEnv ()  { throw new RuntimeException(); }
  /**
   * Similar to <code>currentEnv</code>, this variable references the client instance associated with an
   * RPC, in case it's needed to find out the remote address during deserialization.
   * @return (undocumented)
   */
    scala.util.DynamicVariable<org.apache.spark.network.client.TransportClient> currentClient ()  { throw new RuntimeException(); }
}
