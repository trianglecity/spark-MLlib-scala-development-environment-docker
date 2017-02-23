package org.apache.spark.examples.streaming;
/**
 * Use this singleton to get or register a Broadcast variable.
 */
public  class WordBlacklist$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final WordBlacklist$ MODULE$ = null;
  public   WordBlacklist$ ()  { throw new RuntimeException(); }
  private  org.apache.spark.broadcast.Broadcast<scala.collection.Seq<java.lang.String>> instance ()  { throw new RuntimeException(); }
  public  org.apache.spark.broadcast.Broadcast<scala.collection.Seq<java.lang.String>> getInstance (org.apache.spark.SparkContext sc)  { throw new RuntimeException(); }
}
