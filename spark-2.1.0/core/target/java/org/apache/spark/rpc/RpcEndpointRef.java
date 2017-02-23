package org.apache.spark.rpc;
/**
 * A reference for a remote {@link RpcEndpoint}. {@link RpcEndpointRef} is thread-safe.
 */
 abstract class RpcEndpointRef implements scala.Serializable, org.apache.spark.internal.Logging {
  public   RpcEndpointRef (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  /**
   * return the address for the {@link RpcEndpointRef}
   * @return (undocumented)
   */
  public abstract  org.apache.spark.rpc.RpcAddress address ()  ;
  public abstract  java.lang.String name ()  ;
  /**
   * Sends a one-way asynchronous message. Fire-and-forget semantics.
   * @param message (undocumented)
   */
  public abstract  void send (Object message)  ;
  /**
   * Send a message to the corresponding {@link RpcEndpoint.receiveAndReply)} and return a {@link Future} to
   * receive the reply within the specified timeout.
   * <p>
   * This method only sends the message once and never retries.
   * @param message (undocumented)
   * @param timeout (undocumented)
   * @param evidence$1 (undocumented)
   * @return (undocumented)
   */
  public abstract <T extends java.lang.Object> scala.concurrent.Future<T> ask (Object message, org.apache.spark.rpc.RpcTimeout timeout, scala.reflect.ClassTag<T> evidence$1)  ;
  /**
   * Send a message to the corresponding {@link RpcEndpoint.receiveAndReply)} and return a {@link Future} to
   * receive the reply within a default timeout.
   * <p>
   * This method only sends the message once and never retries.
   * @param message (undocumented)
   * @param evidence$2 (undocumented)
   * @return (undocumented)
   */
  public <T extends java.lang.Object> scala.concurrent.Future<T> ask (Object message, scala.reflect.ClassTag<T> evidence$2)  { throw new RuntimeException(); }
  /**
   * Send a message to the corresponding {@link RpcEndpoint} and get its result within a default
   * timeout, or throw a SparkException if this fails even after the default number of retries.
   * The default <code>timeout</code> will be used in every trial of calling <code>sendWithReply</code>. Because this
   * method retries, the message handling in the receiver side should be idempotent.
   * <p>
   * Note: this is a blocking action which may cost a lot of time,  so don't call it in a message
   * loop of {@link RpcEndpoint}.
   * <p>
   * @param message the message to send
   * @tparam T type of the reply message
   * @return the reply message from the corresponding {@link RpcEndpoint}
   * @param evidence$3 (undocumented)
   */
  public <T extends java.lang.Object> T askWithRetry (Object message, scala.reflect.ClassTag<T> evidence$3)  { throw new RuntimeException(); }
  /**
   * Send a message to the corresponding {@link RpcEndpoint.receive} and get its result within a
   * specified timeout, throw a SparkException if this fails even after the specified number of
   * retries. <code>timeout</code> will be used in every trial of calling <code>sendWithReply</code>. Because this method
   * retries, the message handling in the receiver side should be idempotent.
   * <p>
   * Note: this is a blocking action which may cost a lot of time, so don't call it in a message
   * loop of {@link RpcEndpoint}.
   * <p>
   * @param message the message to send
   * @param timeout the timeout duration
   * @tparam T type of the reply message
   * @return the reply message from the corresponding {@link RpcEndpoint}
   * @param evidence$4 (undocumented)
   */
  public <T extends java.lang.Object> T askWithRetry (Object message, org.apache.spark.rpc.RpcTimeout timeout, scala.reflect.ClassTag<T> evidence$4)  { throw new RuntimeException(); }
}
