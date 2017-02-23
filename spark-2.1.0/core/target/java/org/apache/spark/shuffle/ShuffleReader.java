package org.apache.spark.shuffle;
/**
 * Obtained inside a reduce task to read combined records from the mappers.
 */
  interface ShuffleReader<K extends java.lang.Object, C extends java.lang.Object> {
  /** Read the combined key-values for this reduce task */
  public  scala.collection.Iterator<scala.Product2<K, C>> read ()  ;
}
