package org.apache.spark.mllib.linalg;
/**
 * Represents QR factors.
 */
public  class QRDecomposition<QType extends java.lang.Object, RType extends java.lang.Object> implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  QType Q ()  { throw new RuntimeException(); }
  public  RType R ()  { throw new RuntimeException(); }
  // not preceding
  public   QRDecomposition (QType Q, RType R)  { throw new RuntimeException(); }
}
