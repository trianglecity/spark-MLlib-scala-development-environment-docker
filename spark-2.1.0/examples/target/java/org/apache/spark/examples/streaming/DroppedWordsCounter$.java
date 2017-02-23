package org.apache.spark.examples.streaming;
/**
 * Use this singleton to get or register an Accumulator.
 */
public  class DroppedWordsCounter$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final DroppedWordsCounter$ MODULE$ = null;
  public   DroppedWordsCounter$ ()  { throw new RuntimeException(); }
  private  org.apache.spark.util.LongAccumulator instance ()  { throw new RuntimeException(); }
  public  org.apache.spark.util.LongAccumulator getInstance (org.apache.spark.SparkContext sc)  { throw new RuntimeException(); }
}
