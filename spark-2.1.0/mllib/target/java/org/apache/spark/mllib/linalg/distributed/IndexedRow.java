package org.apache.spark.mllib.linalg.distributed;
/**
 * Represents a row of {@link org.apache.spark.mllib.linalg.distributed.IndexedRowMatrix}.
 */
public  class IndexedRow implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  long index ()  { throw new RuntimeException(); }
  public  org.apache.spark.mllib.linalg.Vector vector ()  { throw new RuntimeException(); }
  // not preceding
  public   IndexedRow (long index, org.apache.spark.mllib.linalg.Vector vector)  { throw new RuntimeException(); }
}
