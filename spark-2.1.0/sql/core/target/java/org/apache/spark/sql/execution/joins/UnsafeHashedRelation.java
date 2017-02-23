package org.apache.spark.sql.execution.joins;
/**
 * A HashedRelation for UnsafeRow, which is backed BytesToBytesMap.
 * <p>
 * It's serialized in the following format:
 *  [number of keys]
 *  [size of key] [size of value] [key bytes] [bytes for value]
 */
  class UnsafeHashedRelation implements org.apache.spark.sql.execution.joins.HashedRelation, java.io.Externalizable, com.esotericsoftware.kryo.KryoSerializable {
  static public  org.apache.spark.sql.execution.joins.HashedRelation apply (scala.collection.Iterator<org.apache.spark.sql.catalyst.InternalRow> input, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> key, int sizeEstimate, org.apache.spark.memory.TaskMemoryManager taskMemoryManager)  { throw new RuntimeException(); }
  private  int numFields ()  { throw new RuntimeException(); }
  private  org.apache.spark.unsafe.map.BytesToBytesMap binaryMap ()  { throw new RuntimeException(); }
  // not preceding
  public   UnsafeHashedRelation (int numFields, org.apache.spark.unsafe.map.BytesToBytesMap binaryMap)  { throw new RuntimeException(); }
     UnsafeHashedRelation ()  { throw new RuntimeException(); }
  public  boolean keyIsUnique ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.joins.UnsafeHashedRelation asReadOnlyCopy ()  { throw new RuntimeException(); }
  public  long estimatedSize ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.UnsafeRow resultRow ()  { throw new RuntimeException(); }
  public  scala.collection.Iterator<org.apache.spark.sql.catalyst.InternalRow> get (org.apache.spark.sql.catalyst.InternalRow key)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.InternalRow getValue (org.apache.spark.sql.catalyst.InternalRow key)  { throw new RuntimeException(); }
  public  void close ()  { throw new RuntimeException(); }
  public  void writeExternal (java.io.ObjectOutput out)  { throw new RuntimeException(); }
  public  void write (com.esotericsoftware.kryo.Kryo kryo, com.esotericsoftware.kryo.io.Output out)  { throw new RuntimeException(); }
  private  void write (scala.Function1<java.lang.Object, scala.runtime.BoxedUnit> writeInt, scala.Function1<java.lang.Object, scala.runtime.BoxedUnit> writeLong, scala.Function3<byte[], java.lang.Object, java.lang.Object, scala.runtime.BoxedUnit> writeBuffer)  { throw new RuntimeException(); }
  public  void readExternal (java.io.ObjectInput in)  { throw new RuntimeException(); }
  private  void read (scala.Function0<java.lang.Object> readInt, scala.Function0<java.lang.Object> readLong, scala.Function3<byte[], java.lang.Object, java.lang.Object, scala.runtime.BoxedUnit> readBuffer)  { throw new RuntimeException(); }
  public  void read (com.esotericsoftware.kryo.Kryo kryo, com.esotericsoftware.kryo.io.Input in)  { throw new RuntimeException(); }
}
