package org.apache.spark.examples.streaming;
/**
 *  Produces a count of events received from Flume.
 * <p>
 *  This should be used in conjunction with an AvroSink in Flume. It will start
 *  an Avro server on at the request host:port address and listen for requests.
 *  Your Flume AvroSink should be pointed to this address.
 * <p>
 *  Usage: FlumeEventCount <host> <port>
 *    <host> is the host the Flume receiver will be started on - a receiver
 *           creates a server and listens for flume events.
 *    <port> is the port the Flume receiver will listen on.
 * <p>
 *  To run this example:
 *    <code>$ bin/run-example org.apache.spark.examples.streaming.FlumeEventCount <host> <port> </code>
 */
public  class FlumeEventCount {
  static public  void main (java.lang.String[] args)  { throw new RuntimeException(); }
}
