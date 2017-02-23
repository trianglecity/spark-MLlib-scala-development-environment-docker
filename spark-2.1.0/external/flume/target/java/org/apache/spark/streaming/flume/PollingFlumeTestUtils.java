package org.apache.spark.streaming.flume;
/**
 * Share codes for Scala and Python unit tests
 */
  class PollingFlumeTestUtils {
  public   PollingFlumeTestUtils ()  { throw new RuntimeException(); }
  private  int batchCount ()  { throw new RuntimeException(); }
  public  int eventsPerBatch ()  { throw new RuntimeException(); }
  private  int totalEventsPerChannel ()  { throw new RuntimeException(); }
  private  int channelCapacity ()  { throw new RuntimeException(); }
  public  int getTotalEvents ()  { throw new RuntimeException(); }
  private  scala.collection.mutable.ArrayBuffer<org.apache.flume.channel.MemoryChannel> channels ()  { throw new RuntimeException(); }
  private  scala.collection.mutable.ArrayBuffer<org.apache.spark.streaming.flume.sink.SparkSink> sinks ()  { throw new RuntimeException(); }
  /**
   * Start a sink and return the port of this sink
   * @return (undocumented)
   */
  public  int startSingleSink ()  { throw new RuntimeException(); }
  /**
   * Start 2 sinks and return the ports
   * @return (undocumented)
   */
  public  scala.collection.Seq<java.lang.Object> startMultipleSinks ()  { throw new RuntimeException(); }
  /**
   * Send data and wait until all data has been received
   */
  public  void sendDataAndEnsureAllDataHasBeenReceived ()  { throw new RuntimeException(); }
  /**
   * A Python-friendly method to assert the output
   * @param outputHeaders (undocumented)
   * @param outputBodies (undocumented)
   */
  public  void assertOutput (java.util.List<java.util.Map<java.lang.String, java.lang.String>> outputHeaders, java.util.List<java.lang.String> outputBodies)  { throw new RuntimeException(); }
  public  void assertChannelsAreEmpty ()  { throw new RuntimeException(); }
  private  void assertChannelIsEmpty (org.apache.flume.channel.MemoryChannel channel)  { throw new RuntimeException(); }
  public  void close ()  { throw new RuntimeException(); }
  private  class TxnSubmitter implements java.util.concurrent.Callable<java.lang.Void> {
    public   TxnSubmitter (org.apache.flume.channel.MemoryChannel channel)  { throw new RuntimeException(); }
    public  java.lang.Void call ()  { throw new RuntimeException(); }
  }
}
