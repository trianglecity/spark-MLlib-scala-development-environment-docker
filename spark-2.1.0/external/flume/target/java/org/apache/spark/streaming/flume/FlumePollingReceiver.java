package org.apache.spark.streaming.flume;
  class FlumePollingReceiver extends org.apache.spark.streaming.receiver.Receiver<org.apache.spark.streaming.flume.SparkFlumeEvent> implements org.apache.spark.internal.Logging {
  public   FlumePollingReceiver (scala.collection.Seq<java.net.InetSocketAddress> addresses, int maxBatchSize, int parallelism, org.apache.spark.storage.StorageLevel storageLevel)  { throw new RuntimeException(); }
  public  java.util.concurrent.ExecutorService channelFactoryExecutor ()  { throw new RuntimeException(); }
  public  org.jboss.netty.channel.socket.nio.NioClientSocketChannelFactory channelFactory ()  { throw new RuntimeException(); }
  public  java.util.concurrent.ExecutorService receiverExecutor ()  { throw new RuntimeException(); }
  private  java.util.concurrent.LinkedBlockingQueue<org.apache.spark.streaming.flume.FlumeConnection> connections ()  { throw new RuntimeException(); }
  public  void onStart ()  { throw new RuntimeException(); }
  public  void onStop ()  { throw new RuntimeException(); }
    java.util.concurrent.LinkedBlockingQueue<org.apache.spark.streaming.flume.FlumeConnection> getConnections ()  { throw new RuntimeException(); }
    int getMaxBatchSize ()  { throw new RuntimeException(); }
}
