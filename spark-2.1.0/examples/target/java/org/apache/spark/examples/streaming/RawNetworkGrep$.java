package org.apache.spark.examples.streaming;
/**
 * Receives text from multiple rawNetworkStreams and counts how many '\n' delimited
 * lines have the word 'the' in them. This is useful for benchmarking purposes. This
 * will only work with spark.streaming.util.RawTextSender running on all worker nodes
 * and with Spark using Kryo serialization (set Java property "spark.serializer" to
 * "org.apache.spark.serializer.KryoSerializer").
 * Usage: RawNetworkGrep <numStreams> <host> <port> <batchMillis>
 *   <numStream> is the number rawNetworkStreams, which should be same as number
 *               of work nodes in the cluster
 *   <host> is "localhost".
 *   <port> is the port on which RawTextSender is running in the worker nodes.
 *   <batchMillise> is the Spark Streaming batch duration in milliseconds.
 */
public  class RawNetworkGrep$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final RawNetworkGrep$ MODULE$ = null;
  public   RawNetworkGrep$ ()  { throw new RuntimeException(); }
  public  void main (java.lang.String[] args)  { throw new RuntimeException(); }
}
