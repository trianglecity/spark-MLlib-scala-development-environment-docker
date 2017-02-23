package org.apache.spark.sql.execution.columnar;
  class CachedBatch implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  int numRows ()  { throw new RuntimeException(); }
  public  byte[][] buffers ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.InternalRow stats ()  { throw new RuntimeException(); }
  public   CachedBatch (int numRows, byte[][] buffers, org.apache.spark.sql.catalyst.InternalRow stats)  { throw new RuntimeException(); }
}
