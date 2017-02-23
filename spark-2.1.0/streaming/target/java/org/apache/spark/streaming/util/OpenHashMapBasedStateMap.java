package org.apache.spark.streaming.util;
/** Implementation of StateMap based on Spark's {@link org.apache.spark.util.collection.OpenHashMap} */
  class OpenHashMapBasedStateMap<K extends java.lang.Object, S extends java.lang.Object> extends org.apache.spark.streaming.util.StateMap<K, S> implements com.esotericsoftware.kryo.KryoSerializable {
  /** Internal class to represent the state information */
  static public  class StateInfo<S extends java.lang.Object> implements scala.Product, scala.Serializable {
    public  S data ()  { throw new RuntimeException(); }
    public  long updateTime ()  { throw new RuntimeException(); }
    public  boolean deleted ()  { throw new RuntimeException(); }
    // not preceding
    public   StateInfo (S data, long updateTime, boolean deleted)  { throw new RuntimeException(); }
    public  void markDeleted ()  { throw new RuntimeException(); }
    public  void update (S newData, long newUpdateTime)  { throw new RuntimeException(); }
  }
  static public  class StateInfo$ implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final StateInfo$ MODULE$ = null;
    public   StateInfo$ ()  { throw new RuntimeException(); }
  }
  /**
   * Internal class to represent a marker the demarkate the end of all state data in the
   * serialized bytes.
   */
  static public  class LimitMarker implements java.io.Serializable {
    public  int num ()  { throw new RuntimeException(); }
    // not preceding
    public   LimitMarker (int num)  { throw new RuntimeException(); }
  }
  static public  int DELTA_CHAIN_LENGTH_THRESHOLD ()  { throw new RuntimeException(); }
  static public  int DEFAULT_INITIAL_CAPACITY ()  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.util.StateMap<K, S> parentStateMap ()  { throw new RuntimeException(); }
  private  int initialCapacity ()  { throw new RuntimeException(); }
  private  int deltaChainThreshold ()  { throw new RuntimeException(); }
  private  scala.reflect.ClassTag<K> keyClassTag ()  { throw new RuntimeException(); }
  private  scala.reflect.ClassTag<S> stateClassTag ()  { throw new RuntimeException(); }
  // not preceding
  public   OpenHashMapBasedStateMap (org.apache.spark.streaming.util.StateMap<K, S> parentStateMap, int initialCapacity, int deltaChainThreshold, scala.reflect.ClassTag<K> keyClassTag, scala.reflect.ClassTag<S> stateClassTag)  { throw new RuntimeException(); }
  public   OpenHashMapBasedStateMap (int initialCapacity, int deltaChainThreshold, scala.reflect.ClassTag<K> keyClassTag, scala.reflect.ClassTag<S> stateClassTag)  { throw new RuntimeException(); }
  public   OpenHashMapBasedStateMap (int deltaChainThreshold, scala.reflect.ClassTag<K> keyClassTag, scala.reflect.ClassTag<S> stateClassTag)  { throw new RuntimeException(); }
  public   OpenHashMapBasedStateMap (scala.reflect.ClassTag<K> keyClassTag, scala.reflect.ClassTag<S> stateClassTag)  { throw new RuntimeException(); }
  private  org.apache.spark.util.collection.OpenHashMap<K, org.apache.spark.streaming.util.OpenHashMapBasedStateMap.StateInfo<S>> deltaMap ()  { throw new RuntimeException(); }
  /** Get the session data if it exists */
  public  scala.Option<S> get (K key)  { throw new RuntimeException(); }
  /** Get all the keys and states whose updated time is older than the give threshold time */
  public  scala.collection.Iterator<scala.Tuple3<K, S, java.lang.Object>> getByTime (long threshUpdatedTime)  { throw new RuntimeException(); }
  /** Get all the keys and states in this map. */
  public  scala.collection.Iterator<scala.Tuple3<K, S, java.lang.Object>> getAll ()  { throw new RuntimeException(); }
  /** Add or update state */
  public  void put (K key, S state, long updateTime)  { throw new RuntimeException(); }
  /** Remove a state */
  public  void remove (K key)  { throw new RuntimeException(); }
  /**
   * Shallow copy the map to create a new session store. Updates to the new map
   * should not mutate <code>this</code> map.
   * @return (undocumented)
   */
  public  org.apache.spark.streaming.util.StateMap<K, S> copy ()  { throw new RuntimeException(); }
  /** Whether the delta chain length is long enough that it should be compacted */
  public  boolean shouldCompact ()  { throw new RuntimeException(); }
  /** Length of the delta chains of this map */
  public  int deltaChainLength ()  { throw new RuntimeException(); }
  /**
   * Approximate number of keys in the map. This is an overestimation that is mainly used to
   * reserve capacity in a new map at delta compaction time.
   * @return (undocumented)
   */
  public  int approxSize ()  { throw new RuntimeException(); }
  /** Get all the data of this map as string formatted as a tree based on the delta depth */
  public  java.lang.String toDebugString ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
  /**
   * Serialize the map data. Besides serialization, this method actually compact the deltas
   * (if needed) in a single pass over all the data in the map.
   * @param outputStream (undocumented)
   */
  private  void writeObjectInternal (java.io.ObjectOutput outputStream)  { throw new RuntimeException(); }
  /** Deserialize the map data. */
  private  void readObjectInternal (java.io.ObjectInput inputStream)  { throw new RuntimeException(); }
  private  void writeObject (java.io.ObjectOutputStream outputStream)  { throw new RuntimeException(); }
  private  void readObject (java.io.ObjectInputStream inputStream)  { throw new RuntimeException(); }
  public  void write (com.esotericsoftware.kryo.Kryo kryo, com.esotericsoftware.kryo.io.Output output)  { throw new RuntimeException(); }
  public  void read (com.esotericsoftware.kryo.Kryo kryo, com.esotericsoftware.kryo.io.Input input)  { throw new RuntimeException(); }
}
