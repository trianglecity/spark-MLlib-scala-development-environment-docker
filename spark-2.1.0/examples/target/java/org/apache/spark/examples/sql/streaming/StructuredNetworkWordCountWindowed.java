package org.apache.spark.examples.sql.streaming;
/**
 * Counts words in UTF8 encoded, '\n' delimited text received from the network over a
 * sliding window of configurable duration. Each line from the network is tagged
 * with a timestamp that is used to determine the windows into which it falls.
 * <p>
 * Usage: StructuredNetworkWordCountWindowed <hostname> <port> <window duration>
 *   [<slide duration>]
 * <hostname> and <port> describe the TCP server that Structured Streaming
 * would connect to receive data.
 * <window duration> gives the size of window, specified as integer number of seconds
 * <slide duration> gives the amount of time successive windows are offset from one another,
 * given in the same units as above. <slide duration> should be less than or equal to
 * <window duration>. If the two are equal, successive windows have no overlap. If
 * <slide duration> is not provided, it defaults to <window duration>.
 * <p>
 * To run this on your local machine, you need to first run a Netcat server
 *    <code>$ nc -lk 9999</code>
 * and then run the example
 *    <code>$ bin/run-example sql.streaming.StructuredNetworkWordCountWindowed
 *    localhost 9999 <window duration in seconds> [<slide duration in seconds>]</code>
 * <p>
 * One recommended <window duration>, <slide duration> pair is 10, 5
 */
public  class StructuredNetworkWordCountWindowed {
  static public  void main (java.lang.String[] args)  { throw new RuntimeException(); }
}
