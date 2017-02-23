package org.apache.spark.streaming.util;
/** Implementation of StateMap interface representing an empty map */
  class EmptyStateMap<K extends java.lang.Object, S extends java.lang.Object> extends org.apache.spark.streaming.util.StateMap<K, S> {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   EmptyStateMap ()  { throw new RuntimeException(); }
  public  void put (K key, S session, long updateTime)  { throw new RuntimeException(); }
  public  scala.Option<S> get (K key)  { throw new RuntimeException(); }
  public  scala.collection.Iterator<scala.Tuple3<K, S, java.lang.Object>> getByTime (long threshUpdatedTime)  { throw new RuntimeException(); }
  public  scala.collection.Iterator<scala.Tuple3<K, S, java.lang.Object>> getAll ()  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.util.StateMap<K, S> copy ()  { throw new RuntimeException(); }
  public  void remove (K key)  { throw new RuntimeException(); }
  public  java.lang.String toDebugString ()  { throw new RuntimeException(); }
}
