package org.apache.spark;
public  class CleanCheckpoint implements org.apache.spark.CleanupTask, scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  int rddId ()  { throw new RuntimeException(); }
  // not preceding
  public   CleanCheckpoint (int rddId)  { throw new RuntimeException(); }
}
