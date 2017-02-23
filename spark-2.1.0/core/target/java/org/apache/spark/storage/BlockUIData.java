package org.apache.spark.storage;
  class BlockUIData implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  org.apache.spark.storage.BlockId blockId ()  { throw new RuntimeException(); }
  public  java.lang.String location ()  { throw new RuntimeException(); }
  public  org.apache.spark.storage.StorageLevel storageLevel ()  { throw new RuntimeException(); }
  public  long memSize ()  { throw new RuntimeException(); }
  public  long diskSize ()  { throw new RuntimeException(); }
  // not preceding
  public   BlockUIData (org.apache.spark.storage.BlockId blockId, java.lang.String location, org.apache.spark.storage.StorageLevel storageLevel, long memSize, long diskSize)  { throw new RuntimeException(); }
}
