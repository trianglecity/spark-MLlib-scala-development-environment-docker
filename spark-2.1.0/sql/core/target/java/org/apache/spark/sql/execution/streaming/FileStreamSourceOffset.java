package org.apache.spark.sql.execution.streaming;
/**
 * Offset for the {@link FileStreamSource}.
 * param:  logOffset  Position in the {@link FileStreamSourceLog}
 */
public  class FileStreamSourceOffset extends org.apache.spark.sql.execution.streaming.Offset implements scala.Product, scala.Serializable {
  static public  java.lang.Object format ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.execution.streaming.FileStreamSourceOffset apply (org.apache.spark.sql.execution.streaming.Offset offset)  { throw new RuntimeException(); }
  static public  boolean equals (Object obj)  { throw new RuntimeException(); }
  static public  int hashCode ()  { throw new RuntimeException(); }
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  long logOffset ()  { throw new RuntimeException(); }
  // not preceding
  public   FileStreamSourceOffset (long logOffset)  { throw new RuntimeException(); }
  public  java.lang.String json ()  { throw new RuntimeException(); }
}
