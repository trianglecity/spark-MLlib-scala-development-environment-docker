package org.apache.spark.rpc.netty;
/**
 * An inbox that stores messages for an {@link RpcEndpoint} and posts messages to it thread-safely.
 */
  class Inbox implements org.apache.spark.internal.Logging {
  public  org.apache.spark.rpc.netty.NettyRpcEndpointRef endpointRef ()  { throw new RuntimeException(); }
  public  org.apache.spark.rpc.RpcEndpoint endpoint ()  { throw new RuntimeException(); }
  // not preceding
  public   Inbox (org.apache.spark.rpc.netty.NettyRpcEndpointRef endpointRef, org.apache.spark.rpc.RpcEndpoint endpoint)  { throw new RuntimeException(); }
  protected  java.util.LinkedList<org.apache.spark.rpc.netty.InboxMessage> messages ()  { throw new RuntimeException(); }
  /** True if the inbox (and its associated endpoint) is stopped. */
  private  boolean stopped ()  { throw new RuntimeException(); }
  /** Allow multiple threads to process messages at the same time. */
  private  boolean enableConcurrent ()  { throw new RuntimeException(); }
  /** The number of threads processing messages for this inbox. */
  private  int numActiveThreads ()  { throw new RuntimeException(); }
  /**
   * Process stored messages.
   * @param dispatcher (undocumented)
   */
  public  void process (org.apache.spark.rpc.netty.Dispatcher dispatcher)  { throw new RuntimeException(); }
  public  void post (org.apache.spark.rpc.netty.InboxMessage message)  { throw new RuntimeException(); }
  public  void stop ()  { throw new RuntimeException(); }
  public  boolean isEmpty ()  { throw new RuntimeException(); }
  /**
   * Called when we are dropping a message. Test cases override this to test message dropping.
   * Exposed for testing.
   * @param message (undocumented)
   */
  protected  void onDrop (org.apache.spark.rpc.netty.InboxMessage message)  { throw new RuntimeException(); }
  /**
   * Calls action closure, and calls the endpoint's onError function in the case of exceptions.
   * @param endpoint (undocumented)
   * @param action (undocumented)
   */
  private  void safelyCall (org.apache.spark.rpc.RpcEndpoint endpoint, scala.Function0<scala.runtime.BoxedUnit> action)  { throw new RuntimeException(); }
}
