package org.apache.spark.examples.sql.streaming;
/**
 * Counts words in UTF8 encoded, '\n' delimited text received from the network.
 * <p>
 * Usage: StructuredNetworkWordCount <hostname> <port>
 * <hostname> and <port> describe the TCP server that Structured Streaming
 * would connect to receive data.
 * <p>
 * To run this on your local machine, you need to first run a Netcat server
 *    <code>$ nc -lk 9999</code>
 * and then run the example
 *    <code>$ bin/run-example sql.streaming.StructuredNetworkWordCount
 *    localhost 9999</code>
 */
public  class StructuredNetworkWordCount {
  static public  void main (java.lang.String[] args)  { throw new RuntimeException(); }
}
