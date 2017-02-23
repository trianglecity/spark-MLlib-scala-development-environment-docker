package org.apache.spark.mllib.linalg;
/**
 * Represents singular value decomposition (SVD) factors.
 */
public  class SingularValueDecomposition<UType extends java.lang.Object, VType extends java.lang.Object> implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  UType U ()  { throw new RuntimeException(); }
  public  org.apache.spark.mllib.linalg.Vector s ()  { throw new RuntimeException(); }
  public  VType V ()  { throw new RuntimeException(); }
  // not preceding
  public   SingularValueDecomposition (UType U, org.apache.spark.mllib.linalg.Vector s, VType V)  { throw new RuntimeException(); }
}
