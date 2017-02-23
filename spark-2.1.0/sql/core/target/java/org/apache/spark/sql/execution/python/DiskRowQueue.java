package org.apache.spark.sql.execution.python;
/**
 * A RowQueue that is backed by a file on disk. This queue will stop accepting new rows once any
 * reader has begun reading from the queue.
 */
  class DiskRowQueue implements org.apache.spark.sql.execution.python.RowQueue, scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  java.io.File file ()  { throw new RuntimeException(); }
  public  int fields ()  { throw new RuntimeException(); }
  // not preceding
  public   DiskRowQueue (java.io.File file, int fields)  { throw new RuntimeException(); }
  private  java.io.DataOutputStream out ()  { throw new RuntimeException(); }
  private  long unreadBytes ()  { throw new RuntimeException(); }
  private  java.io.DataInputStream in ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.catalyst.expressions.UnsafeRow resultRow ()  { throw new RuntimeException(); }
  public  boolean add (org.apache.spark.sql.catalyst.expressions.UnsafeRow row)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.UnsafeRow remove ()  { throw new RuntimeException(); }
  public  void close ()  { throw new RuntimeException(); }
}
