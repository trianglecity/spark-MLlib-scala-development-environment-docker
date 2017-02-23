package org.apache.spark.util.collection;
/**
 * An append-only buffer that keeps track of its estimated size in bytes.
 */
  class SizeTrackingVector<T extends java.lang.Object> extends org.apache.spark.util.collection.PrimitiveVector<T> implements org.apache.spark.util.collection.SizeTracker {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   SizeTrackingVector (scala.reflect.ClassTag<T> evidence$1)  { throw new RuntimeException(); }
  public  org.apache.spark.util.collection.PrimitiveVector<T> resize (int newLength)  { throw new RuntimeException(); }
}
