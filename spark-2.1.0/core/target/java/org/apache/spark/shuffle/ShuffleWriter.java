package org.apache.spark.shuffle;
/**
 * Obtained inside a map task to write out records to the shuffle system.
 */
 abstract class ShuffleWriter<K extends java.lang.Object, V extends java.lang.Object> {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   ShuffleWriter ()  { throw new RuntimeException(); }
  /** Write a sequence of records to this task's output */
  public abstract  void write (scala.collection.Iterator<scala.Product2<K, V>> records) throws java.io.IOException ;
  /** Close this writer, passing along whether the map completed */
  public abstract  scala.Option<org.apache.spark.scheduler.MapStatus> stop (boolean success)  ;
}
