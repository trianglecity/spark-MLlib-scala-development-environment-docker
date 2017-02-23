package org.apache.spark.streaming.flume;
/**
 * A wrapper around the transceiver and the Avro IPC API.
 * param:  transceiver The transceiver to use for communication with Flume
 * param:  client The client that the callbacks are received on.
 */
  class FlumeConnection {
  public  org.apache.avro.ipc.NettyTransceiver transceiver ()  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.flume.sink.SparkFlumeProtocol.Callback client ()  { throw new RuntimeException(); }
  // not preceding
  public   FlumeConnection (org.apache.avro.ipc.NettyTransceiver transceiver, org.apache.spark.streaming.flume.sink.SparkFlumeProtocol.Callback client)  { throw new RuntimeException(); }
}
