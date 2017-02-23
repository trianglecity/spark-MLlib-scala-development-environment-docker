package org.apache.spark.rpc.netty;
  class Outbox {
  public  org.apache.spark.rpc.RpcAddress address ()  { throw new RuntimeException(); }
  // not preceding
  public   Outbox (org.apache.spark.rpc.netty.NettyRpcEnv nettyEnv, org.apache.spark.rpc.RpcAddress address)  { throw new RuntimeException(); }
  private  java.util.LinkedList<org.apache.spark.rpc.netty.OutboxMessage> messages ()  { throw new RuntimeException(); }
  private  org.apache.spark.network.client.TransportClient client ()  { throw new RuntimeException(); }
  /**
   * connectFuture points to the connect task. If there is no connect task, connectFuture will be
   * null.
   * @return (undocumented)
   */
  private  java.util.concurrent.Future<scala.runtime.BoxedUnit> connectFuture ()  { throw new RuntimeException(); }
  private  boolean stopped ()  { throw new RuntimeException(); }
  /**
   * If there is any thread draining the message queue
   * @return (undocumented)
   */
  private  boolean draining ()  { throw new RuntimeException(); }
  /**
   * Send a message. If there is no active connection, cache it and launch a new connection. If
   * {@link Outbox} is stopped, the sender will be notified with a {@link SparkException}.
   * @param message (undocumented)
   */
  public  void send (org.apache.spark.rpc.netty.OutboxMessage message)  { throw new RuntimeException(); }
  /**
   * Drain the message queue. If there is other draining thread, just exit. If the connection has
   * not been established, launch a task in the <code>nettyEnv.clientConnectionExecutor</code> to setup the
   * connection.
   */
  private  void drainOutbox ()  { throw new RuntimeException(); }
  private  void launchConnectTask ()  { throw new RuntimeException(); }
  /**
   * Stop {@link Inbox} and notify the waiting messages with the cause.
   * @param e (undocumented)
   */
  private  void handleNetworkFailure (java.lang.Throwable e)  { throw new RuntimeException(); }
  private  void closeClient ()  { throw new RuntimeException(); }
  /**
   * Stop {@link Outbox}. The remaining messages in the {@link Outbox} will be notified with a
   * {@link SparkException}.
   */
  public  void stop ()  { throw new RuntimeException(); }
}
