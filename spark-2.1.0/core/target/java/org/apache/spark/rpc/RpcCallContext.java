package org.apache.spark.rpc;
/**
 * A callback that {@link RpcEndpoint} can use to send back a message or failure. It's thread-safe
 * and can be called in any thread.
 */
  interface RpcCallContext {
  /**
   * Reply a message to the sender. If the sender is {@link RpcEndpoint}, its {@link RpcEndpoint.receive}
   * will be called.
   * @param response (undocumented)
   */
  public  void reply (Object response)  ;
  /**
   * Report a failure to the sender.
   * @param e (undocumented)
   */
  public  void sendFailure (java.lang.Throwable e)  ;
  /**
   * The sender of this message.
   * @return (undocumented)
   */
  public  org.apache.spark.rpc.RpcAddress senderAddress ()  ;
}
