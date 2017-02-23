package org.apache.spark.streaming.flume;
/**
 * A NetworkReceiver which listens for events using the
 * Flume Avro interface.
 */
  class FlumeReceiver extends org.apache.spark.streaming.receiver.Receiver<org.apache.spark.streaming.flume.SparkFlumeEvent> implements org.apache.spark.internal.Logging {
  public   FlumeReceiver (java.lang.String host, int port, org.apache.spark.storage.StorageLevel storageLevel, boolean enableDecompression)  { throw new RuntimeException(); }
  public  org.apache.avro.ipc.specific.SpecificResponder responder ()  { throw new RuntimeException(); }
  public  org.apache.avro.ipc.NettyServer server ()  { throw new RuntimeException(); }
  private  org.apache.avro.ipc.NettyServer initServer ()  { throw new RuntimeException(); }
  public  void onStart ()  { throw new RuntimeException(); }
  public  void onStop ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> preferredLocation ()  { throw new RuntimeException(); }
  /**
   * A Netty Pipeline factory that will decompress incoming data from
   * and the Netty client and compress data going back to the client.
   * <p>
   * The compression on the return is required because Flume requires
   * a successful response to indicate it can remove the event/batch
   * from the configured channel
   */
    class CompressionChannelPipelineFactory implements org.jboss.netty.channel.ChannelPipelineFactory {
    public   CompressionChannelPipelineFactory ()  { throw new RuntimeException(); }
    public  org.jboss.netty.channel.ChannelPipeline getPipeline ()  { throw new RuntimeException(); }
  }
}
