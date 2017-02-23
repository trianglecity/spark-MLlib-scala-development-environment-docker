package org.apache.spark.examples.streaming;
/**
 * Counts words in text encoded with UTF8 received from the network every second. This example also
 * shows how to use lazily instantiated singleton instances for Accumulator and Broadcast so that
 * they can be registered on driver failures.
 * <p>
 * Usage: RecoverableNetworkWordCount <hostname> <port> <checkpoint-directory> <output-file>
 *   <hostname> and <port> describe the TCP server that Spark Streaming would connect to receive
 *   data. <checkpoint-directory> directory to HDFS-compatible file system which checkpoint data
 *   <output-file> file to which the word counts will be appended
 * <p>
 * <checkpoint-directory> and <output-file> must be absolute paths
 * <p>
 * To run this on your local machine, you need to first run a Netcat server
 * <p>
 *      <code>$ nc -lk 9999</code>
 * <p>
 * and run the example as
 * <p>
 *      <code>$ ./bin/run-example org.apache.spark.examples.streaming.RecoverableNetworkWordCount \
 *              localhost 9999 ~/checkpoint/ ~/out</code>
 * <p>
 * If the directory ~/checkpoint/ does not exist (e.g. running for the first time), it will create
 * a new StreamingContext (will print "Creating new context" to the console). Otherwise, if
 * checkpoint data exists in ~/checkpoint/, then it will create StreamingContext from
 * the checkpoint data.
 * <p>
 * Refer to the online documentation for more details.
 */
public  class RecoverableNetworkWordCount {
  static public  org.apache.spark.streaming.StreamingContext createContext (java.lang.String ip, int port, java.lang.String outputPath, java.lang.String checkpointDirectory)  { throw new RuntimeException(); }
  static public  void main (java.lang.String[] args)  { throw new RuntimeException(); }
}
