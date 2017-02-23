package org.apache.spark.examples.streaming;
/**
 * Counts words cumulatively in UTF8 encoded, '\n' delimited text received from the network every
 * second starting with initial value of word count.
 * Usage: StatefulNetworkWordCount <hostname> <port>
 *   <hostname> and <port> describe the TCP server that Spark Streaming would connect to receive
 *   data.
 * <p>
 * To run this on your local machine, you need to first run a Netcat server
 *    <code>$ nc -lk 9999</code>
 * and then run the example
 *    <code>$ bin/run-example
 *      org.apache.spark.examples.streaming.StatefulNetworkWordCount localhost 9999</code>
 */
public  class StatefulNetworkWordCount {
  static public  void main (java.lang.String[] args)  { throw new RuntimeException(); }
}
