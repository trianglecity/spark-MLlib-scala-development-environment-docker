package org.apache.spark.sql.execution.window;
/**
 * An external buffer of rows based on UnsafeExternalSorter.
 */
  class ExternalRowBuffer extends org.apache.spark.sql.execution.window.RowBuffer {
  public   ExternalRowBuffer (org.apache.spark.util.collection.unsafe.sort.UnsafeExternalSorter sorter, int numFields)  { throw new RuntimeException(); }
  /** Number of rows. */
  public  int size ()  { throw new RuntimeException(); }
  /** Return next row in the buffer, null if no more left. */
  public  org.apache.spark.sql.catalyst.InternalRow next ()  { throw new RuntimeException(); }
  /** Skip the next `n` rows. */
  public  void skip (int n)  { throw new RuntimeException(); }
  /** Return a new RowBuffer that has the same rows. */
  public  org.apache.spark.sql.execution.window.RowBuffer copy ()  { throw new RuntimeException(); }
}
