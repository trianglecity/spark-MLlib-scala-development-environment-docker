package org.apache.spark.examples.streaming;
/**
 * Use this singleton to get or register a Broadcast variable.
 */
public  class WordBlacklist {
  static private  org.apache.spark.broadcast.Broadcast<scala.collection.Seq<java.lang.String>> instance ()  { throw new RuntimeException(); }
  static public  org.apache.spark.broadcast.Broadcast<scala.collection.Seq<java.lang.String>> getInstance (org.apache.spark.SparkContext sc)  { throw new RuntimeException(); }
}
