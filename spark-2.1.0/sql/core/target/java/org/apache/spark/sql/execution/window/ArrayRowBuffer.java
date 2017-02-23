package org.apache.spark.sql.execution.window;
/**
 * A row buffer based on ArrayBuffer (the number of rows is limited).
 */
  class ArrayRowBuffer extends org.apache.spark.sql.execution.window.RowBuffer {
  public   ArrayRowBuffer (scala.collection.mutable.ArrayBuffer<org.apache.spark.sql.catalyst.expressions.UnsafeRow> buffer)  { throw new RuntimeException(); }
  /** Number of rows. */
  public  int size ()  { throw new RuntimeException(); }
  /** Return next row in the buffer, null if no more left. */
  public  org.apache.spark.sql.catalyst.InternalRow next ()  { throw new RuntimeException(); }
  /** Skip the next `n` rows. */
  public  void skip (int n)  { throw new RuntimeException(); }
  /** Return a new RowBuffer that has the same rows. */
  public  org.apache.spark.sql.execution.window.RowBuffer copy ()  { throw new RuntimeException(); }
}
