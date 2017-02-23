package org.apache.spark.mllib.linalg.distributed;
/**
 * Represents an entry in a distributed matrix.
 * param:  i row index
 * param:  j column index
 * param:  value value of the entry
 */
public  class MatrixEntry implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  long i ()  { throw new RuntimeException(); }
  public  long j ()  { throw new RuntimeException(); }
  public  double value ()  { throw new RuntimeException(); }
  // not preceding
  public   MatrixEntry (long i, long j, double value)  { throw new RuntimeException(); }
}
