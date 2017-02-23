package org.apache.spark.sql.execution.joins;
/**
 * An append-only hash map mapping from key of Long to UnsafeRow.
 * <p>
 * The underlying bytes of all values (UnsafeRows) are packed together as a single byte array
 * (<code>page</code>) in this format:
 * <p>
 *  [bytes of row1][address1][bytes of row2][address1] ...
 * <p>
 *  address1 (8 bytes) is the offset and size of next value for the same key as row1, any key
 *  could have multiple values. the address at the end of last value for every key is 0.
 * <p>
 * The keys and addresses of their values could be stored in two modes:
 * <p>
 * 1) sparse mode: the keys and addresses are stored in <code>array</code> as:
 * <p>
 *  [key1][address1][key2][address2]...[]
 * <p>
 *  address1 (Long) is the offset (in <code>page</code>) and size of the value for key1. The position of key1
 *  is determined by <code>key1 % cap</code>. Quadratic probing with triangular numbers is used to address
 *  hash collision.
 * <p>
 * 2) dense mode: all the addresses are packed into a single array of long, as:
 * <p>
 *  [address1] [address2] ...
 * <p>
 *  address1 (Long) is the offset (in <code>page</code>) and size of the value for key1, the position is
 *  determined by <code>key1 - minKey</code>.
 * <p>
 * The map is created as sparse mode, then key-value could be appended into it. Once finish
 * appending, caller could all optimize() to try to turn the map into dense mode, which is faster
 * to probe.
 * <p>
 * see http://java-performance.info/implementing-world-fastest-java-int-to-int-hash-map/
 */
 final class LongToUnsafeRowMap extends org.apache.spark.memory.MemoryConsumer implements java.io.Externalizable, com.esotericsoftware.kryo.KryoSerializable {
  public  org.apache.spark.memory.TaskMemoryManager mm ()  { throw new RuntimeException(); }
  // not preceding
  public   LongToUnsafeRowMap (org.apache.spark.memory.TaskMemoryManager mm, int capacity)  { throw new RuntimeException(); }
  private  boolean isDense ()  { throw new RuntimeException(); }
  private  long minKey ()  { throw new RuntimeException(); }
  private  long maxKey ()  { throw new RuntimeException(); }
  private  long[] array ()  { throw new RuntimeException(); }
  private  int mask ()  { throw new RuntimeException(); }
  private  long[] page ()  { throw new RuntimeException(); }
  private  long cursor ()  { throw new RuntimeException(); }
  private  int SIZE_BITS ()  { throw new RuntimeException(); }
  private  int SIZE_MASK ()  { throw new RuntimeException(); }
  private  long numValues ()  { throw new RuntimeException(); }
  private  long numKeys ()  { throw new RuntimeException(); }
  public   LongToUnsafeRowMap ()  { throw new RuntimeException(); }
  private  void ensureAcquireMemory (long size)  { throw new RuntimeException(); }
  private  void init ()  { throw new RuntimeException(); }
  public  long spill (long size, org.apache.spark.memory.MemoryConsumer trigger)  { throw new RuntimeException(); }
  /**
   * Returns whether all the keys are unique.
   * @return (undocumented)
   */
  public  boolean keyIsUnique ()  { throw new RuntimeException(); }
  /**
   * Returns total memory consumption.
   * @return (undocumented)
   */
  public  long getTotalMemoryConsumption ()  { throw new RuntimeException(); }
  /**
   * Returns the first slot of array that store the keys (sparse mode).
   * @param key (undocumented)
   * @return (undocumented)
   */
  private  int firstSlot (long key)  { throw new RuntimeException(); }
  /**
   * Returns the next probe in the array.
   * @param pos (undocumented)
   * @return (undocumented)
   */
  private  int nextSlot (int pos)  { throw new RuntimeException(); }
  private  long toAddress (long offset, int size)  { throw new RuntimeException(); }
  private  long toOffset (long address)  { throw new RuntimeException(); }
  private  int toSize (long address)  { throw new RuntimeException(); }
  private  org.apache.spark.sql.catalyst.expressions.UnsafeRow getRow (long address, org.apache.spark.sql.catalyst.expressions.UnsafeRow resultRow)  { throw new RuntimeException(); }
  /**
   * Returns the single UnsafeRow for given key, or null if not found.
   * @param key (undocumented)
   * @param resultRow (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.expressions.UnsafeRow getValue (long key, org.apache.spark.sql.catalyst.expressions.UnsafeRow resultRow)  { throw new RuntimeException(); }
  /**
   * Returns an iterator of UnsafeRow for multiple linked values.
   * @param address (undocumented)
   * @param resultRow (undocumented)
   * @return (undocumented)
   */
  private  scala.collection.Iterator<org.apache.spark.sql.catalyst.expressions.UnsafeRow> valueIter (long address, org.apache.spark.sql.catalyst.expressions.UnsafeRow resultRow)  { throw new RuntimeException(); }
  /**
   * Returns an iterator for all the values for the given key, or null if no value found.
   * @param key (undocumented)
   * @param resultRow (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Iterator<org.apache.spark.sql.catalyst.expressions.UnsafeRow> get (long key, org.apache.spark.sql.catalyst.expressions.UnsafeRow resultRow)  { throw new RuntimeException(); }
  /**
   * Appends the key and row into this map.
   * @param key (undocumented)
   * @param row (undocumented)
   */
  public  void append (long key, org.apache.spark.sql.catalyst.expressions.UnsafeRow row)  { throw new RuntimeException(); }
  /**
   * Update the address in array for given key.
   * @param key (undocumented)
   * @param address (undocumented)
   */
  private  void updateIndex (long key, long address)  { throw new RuntimeException(); }
  private  void growArray ()  { throw new RuntimeException(); }
  /**
   * Try to turn the map into dense mode, which is faster to probe.
   */
  public  void optimize ()  { throw new RuntimeException(); }
  /**
   * Free all the memory acquired by this map.
   */
  public  void free ()  { throw new RuntimeException(); }
  private  void writeLongArray (scala.Function3<byte[], java.lang.Object, java.lang.Object, scala.runtime.BoxedUnit> writeBuffer, long[] arr, int len)  { throw new RuntimeException(); }
  private  void write (scala.Function1<java.lang.Object, scala.runtime.BoxedUnit> writeBoolean, scala.Function1<java.lang.Object, scala.runtime.BoxedUnit> writeLong, scala.Function3<byte[], java.lang.Object, java.lang.Object, scala.runtime.BoxedUnit> writeBuffer)  { throw new RuntimeException(); }
  public  void writeExternal (java.io.ObjectOutput output)  { throw new RuntimeException(); }
  public  void write (com.esotericsoftware.kryo.Kryo kryo, com.esotericsoftware.kryo.io.Output out)  { throw new RuntimeException(); }
  private  long[] readLongArray (scala.Function3<byte[], java.lang.Object, java.lang.Object, scala.runtime.BoxedUnit> readBuffer, int length)  { throw new RuntimeException(); }
  private  void read (scala.Function0<java.lang.Object> readBoolean, scala.Function0<java.lang.Object> readLong, scala.Function3<byte[], java.lang.Object, java.lang.Object, scala.runtime.BoxedUnit> readBuffer)  { throw new RuntimeException(); }
  public  void readExternal (java.io.ObjectInput in)  { throw new RuntimeException(); }
  public  void read (com.esotericsoftware.kryo.Kryo kryo, com.esotericsoftware.kryo.io.Input in)  { throw new RuntimeException(); }
}
