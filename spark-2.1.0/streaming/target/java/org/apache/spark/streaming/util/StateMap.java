package org.apache.spark.streaming.util;
/** Internal interface for defining the map that keeps track of sessions. */
 abstract class StateMap<K extends java.lang.Object, S extends java.lang.Object> implements java.io.Serializable {
  static public <K extends java.lang.Object, S extends java.lang.Object> org.apache.spark.streaming.util.StateMap<K, S> empty ()  { throw new RuntimeException(); }
  static public <K extends java.lang.Object, S extends java.lang.Object> org.apache.spark.streaming.util.StateMap<K, S> create (org.apache.spark.SparkConf conf, scala.reflect.ClassTag<K> evidence$1, scala.reflect.ClassTag<S> evidence$2)  { throw new RuntimeException(); }
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   StateMap ()  { throw new RuntimeException(); }
  /** Get the state for a key if it exists */
  public abstract  scala.Option<S> get (K key)  ;
  /** Get all the keys and states whose updated time is older than the given threshold time */
  public abstract  scala.collection.Iterator<scala.Tuple3<K, S, java.lang.Object>> getByTime (long threshUpdatedTime)  ;
  /** Get all the keys and states in this map. */
  public abstract  scala.collection.Iterator<scala.Tuple3<K, S, java.lang.Object>> getAll ()  ;
  /** Add or update state */
  public abstract  void put (K key, S state, long updatedTime)  ;
  /** Remove a key */
  public abstract  void remove (K key)  ;
  /**
   * Shallow copy <code>this</code> map to create a new state map.
   * Updates to the new map should not mutate <code>this</code> map.
   * @return (undocumented)
   */
  public abstract  org.apache.spark.streaming.util.StateMap<K, S> copy ()  ;
  public  java.lang.String toDebugString ()  { throw new RuntimeException(); }
}
