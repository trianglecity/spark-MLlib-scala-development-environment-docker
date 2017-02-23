package org.apache.spark.sql.execution.python;
/**
 * A RowQueue that has a list of RowQueues, which could be in memory or disk.
 * <p>
 * HybridRowQueue could be safely appended in one thread, and pulled in another thread in the same
 * time.
 */
  class HybridRowQueue extends org.apache.spark.memory.MemoryConsumer implements org.apache.spark.sql.execution.python.RowQueue, scala.Product, scala.Serializable {
  static public  org.apache.spark.memory.MemoryMode getMode ()  { throw new RuntimeException(); }
  static protected  long getUsed ()  { throw new RuntimeException(); }
  static public  org.apache.spark.unsafe.array.LongArray allocateArray (long x$1)  { throw new RuntimeException(); }
  static public  void freeArray (org.apache.spark.unsafe.array.LongArray x$1)  { throw new RuntimeException(); }
  static protected  org.apache.spark.unsafe.memory.MemoryBlock allocatePage (long x$1)  { throw new RuntimeException(); }
  static protected  void freePage (org.apache.spark.unsafe.memory.MemoryBlock x$1)  { throw new RuntimeException(); }
  static public  long acquireMemory (long x$1)  { throw new RuntimeException(); }
  static public  void freeMemory (long x$1)  { throw new RuntimeException(); }
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.memory.TaskMemoryManager memManager ()  { throw new RuntimeException(); }
  public  java.io.File tempDir ()  { throw new RuntimeException(); }
  public  int numFields ()  { throw new RuntimeException(); }
  // not preceding
  public   HybridRowQueue (org.apache.spark.memory.TaskMemoryManager memManager, java.io.File tempDir, int numFields)  { throw new RuntimeException(); }
  private  java.util.LinkedList<org.apache.spark.sql.execution.python.RowQueue> queues ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.execution.python.RowQueue writing ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.execution.python.RowQueue reading ()  { throw new RuntimeException(); }
    int numQueues ()  { throw new RuntimeException(); }
  public  long spill (long size, org.apache.spark.memory.MemoryConsumer trigger)  { throw new RuntimeException(); }
  private  org.apache.spark.sql.execution.python.RowQueue createDiskQueue ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.execution.python.RowQueue createNewQueue (long required)  { throw new RuntimeException(); }
  public  boolean add (org.apache.spark.sql.catalyst.expressions.UnsafeRow row)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.UnsafeRow remove ()  { throw new RuntimeException(); }
  public  void close ()  { throw new RuntimeException(); }
}
