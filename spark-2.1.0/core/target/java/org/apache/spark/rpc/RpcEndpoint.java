package org.apache.spark.rpc;
/**
 * An end point for the RPC that defines what functions to trigger given a message.
 * <p>
 * It is guaranteed that <code>onStart</code>, <code>receive</code> and <code>onStop</code> will be called in sequence.
 * <p>
 * The life-cycle of an endpoint is:
 * <p>
 * constructor -> onStart -> receive* -> onStop
 * <p>
 * Note: <code>receive</code> can be called concurrently. If you want <code>receive</code> to be thread-safe, please use
 * {@link ThreadSafeRpcEndpoint}
 * <p>
 * If any error is thrown from one of {@link RpcEndpoint} methods except <code>onError</code>, <code>onError</code> will be
 * invoked with the cause. If <code>onError</code> throws an error, {@link RpcEnv} will ignore it.
 */
  interface RpcEndpoint {
  /**
   * The {@link RpcEnv} that this {@link RpcEndpoint} is registered to.
   * @return (undocumented)
   */
  public  org.apache.spark.rpc.RpcEnv rpcEnv ()  ;
  /**
   * The {@link RpcEndpointRef} of this {@link RpcEndpoint}. <code>self</code> will become valid when <code>onStart</code> is
   * called. And <code>self</code> will become <code>null</code> when <code>onStop</code> is called.
   * <p>
   * Note: Because before <code>onStart</code>, {@link RpcEndpoint} has not yet been registered and there is not
   * valid {@link RpcEndpointRef} for it. So don't call <code>self</code> before <code>onStart</code> is called.
   * @return (undocumented)
   */
  public  org.apache.spark.rpc.RpcEndpointRef self ()  ;
  /**
   * Process messages from {@link RpcEndpointRef.send} or {@link RpcCallContext.reply)}. If receiving a
   * unmatched message, {@link SparkException} will be thrown and sent to <code>onError</code>.
   * @return (undocumented)
   */
  public  scala.PartialFunction<java.lang.Object, scala.runtime.BoxedUnit> receive ()  ;
  /**
   * Process messages from {@link RpcEndpointRef.ask}. If receiving a unmatched message,
   * {@link SparkException} will be thrown and sent to <code>onError</code>.
   * @param context (undocumented)
   * @return (undocumented)
   */
  public  scala.PartialFunction<java.lang.Object, scala.runtime.BoxedUnit> receiveAndReply (org.apache.spark.rpc.RpcCallContext context)  ;
  /**
   * Invoked when any exception is thrown during handling messages.
   * @param cause (undocumented)
   */
  public  void onError (java.lang.Throwable cause)  ;
  /**
   * Invoked when <code>remoteAddress</code> is connected to the current node.
   * @param remoteAddress (undocumented)
   */
  public  void onConnected (org.apache.spark.rpc.RpcAddress remoteAddress)  ;
  /**
   * Invoked when <code>remoteAddress</code> is lost.
   * @param remoteAddress (undocumented)
   */
  public  void onDisconnected (org.apache.spark.rpc.RpcAddress remoteAddress)  ;
  /**
   * Invoked when some network error happens in the connection between the current node and
   * <code>remoteAddress</code>.
   * @param cause (undocumented)
   * @param remoteAddress (undocumented)
   */
  public  void onNetworkError (java.lang.Throwable cause, org.apache.spark.rpc.RpcAddress remoteAddress)  ;
  /**
   * Invoked before {@link RpcEndpoint} starts to handle any message.
   */
  public  void onStart ()  ;
  /**
   * Invoked when {@link RpcEndpoint} is stopping. <code>self</code> will be <code>null</code> in this method and you cannot
   * use it to send or ask messages.
   */
  public  void onStop ()  ;
  /**
   * A convenient method to stop {@link RpcEndpoint}.
   */
  public  void stop ()  ;
}
