package org.apache.spark.examples.streaming;
/**
 * Use this singleton to get or register an Accumulator.
 */
public  class DroppedWordsCounter {
  static private  org.apache.spark.util.LongAccumulator instance ()  { throw new RuntimeException(); }
  static public  org.apache.spark.util.LongAccumulator getInstance (org.apache.spark.SparkContext sc)  { throw new RuntimeException(); }
}
