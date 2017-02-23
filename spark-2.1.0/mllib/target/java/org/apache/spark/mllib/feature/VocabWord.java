package org.apache.spark.mllib.feature;
/**
 *  Entry in vocabulary
 */
public  class VocabWord implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  java.lang.String word ()  { throw new RuntimeException(); }
  public  int cn ()  { throw new RuntimeException(); }
  public  int[] point ()  { throw new RuntimeException(); }
  public  int[] code ()  { throw new RuntimeException(); }
  public  int codeLen ()  { throw new RuntimeException(); }
  // not preceding
  public   VocabWord (java.lang.String word, int cn, int[] point, int[] code, int codeLen)  { throw new RuntimeException(); }
}
