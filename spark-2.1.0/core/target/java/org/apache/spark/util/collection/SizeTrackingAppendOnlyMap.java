package org.apache.spark.util.collection;
/**
 * An append-only map that keeps track of its estimated size in bytes.
 */
  class SizeTrackingAppendOnlyMap<K extends java.lang.Object, V extends java.lang.Object> extends org.apache.spark.util.collection.AppendOnlyMap<K, V> implements org.apache.spark.util.collection.SizeTracker {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   SizeTrackingAppendOnlyMap ()  { throw new RuntimeException(); }
  public  void update (K key, V value)  { throw new RuntimeException(); }
  public  V changeValue (K key, scala.Function2<java.lang.Object, V, V> updateFunc)  { throw new RuntimeException(); }
  protected  void growTable ()  { throw new RuntimeException(); }
}
