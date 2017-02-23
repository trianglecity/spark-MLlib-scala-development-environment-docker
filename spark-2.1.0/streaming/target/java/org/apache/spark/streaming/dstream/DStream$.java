package org.apache.spark.streaming.dstream;
public  class DStream$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final DStream$ MODULE$ = null;
  public   DStream$ ()  { throw new RuntimeException(); }
  public <K extends java.lang.Object, V extends java.lang.Object> org.apache.spark.streaming.dstream.PairDStreamFunctions<K, V> toPairDStreamFunctions (org.apache.spark.streaming.dstream.DStream<scala.Tuple2<K, V>> stream, scala.reflect.ClassTag<K> kt, scala.reflect.ClassTag<V> vt, scala.math.Ordering<K> ord)  { throw new RuntimeException(); }
  /** Get the creation site of a DStream from the stack trace of when the DStream is created. */
    org.apache.spark.util.CallSite getCreationSite ()  { throw new RuntimeException(); }
}
