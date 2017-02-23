package org.apache.spark.streaming.flume;
/**
 * This is a helper class that wraps the methods in FlumeUtils into more Python-friendly class and
 * function so that it can be easily instantiated and called from Python's FlumeUtils.
 */
  class FlumeUtilsPythonHelper {
  static private  byte[] stringMapToByteArray (java.util.Map<java.lang.CharSequence, java.lang.CharSequence> map)  { throw new RuntimeException(); }
  static private  org.apache.spark.streaming.api.java.JavaPairDStream<byte[], byte[]> toByteArrayPairDStream (org.apache.spark.streaming.api.java.JavaReceiverInputDStream<org.apache.spark.streaming.flume.SparkFlumeEvent> dstream)  { throw new RuntimeException(); }
  public   FlumeUtilsPythonHelper ()  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.api.java.JavaPairDStream<byte[], byte[]> createStream (org.apache.spark.streaming.api.java.JavaStreamingContext jssc, java.lang.String hostname, int port, org.apache.spark.storage.StorageLevel storageLevel, boolean enableDecompression)  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.api.java.JavaPairDStream<byte[], byte[]> createPollingStream (org.apache.spark.streaming.api.java.JavaStreamingContext jssc, java.util.List<java.lang.String> hosts, java.util.List<java.lang.Object> ports, org.apache.spark.storage.StorageLevel storageLevel, int maxBatchSize, int parallelism)  { throw new RuntimeException(); }
}
