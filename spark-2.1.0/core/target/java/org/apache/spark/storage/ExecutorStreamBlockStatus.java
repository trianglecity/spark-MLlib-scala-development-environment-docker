package org.apache.spark.storage;
/**
 * The aggregated status of stream blocks in an executor
 */
  class ExecutorStreamBlockStatus implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  java.lang.String executorId ()  { throw new RuntimeException(); }
  public  java.lang.String location ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.storage.BlockUIData> blocks ()  { throw new RuntimeException(); }
  // not preceding
  public   ExecutorStreamBlockStatus (java.lang.String executorId, java.lang.String location, scala.collection.Seq<org.apache.spark.storage.BlockUIData> blocks)  { throw new RuntimeException(); }
  public  long totalMemSize ()  { throw new RuntimeException(); }
  public  long totalDiskSize ()  { throw new RuntimeException(); }
  public  int numStreamBlocks ()  { throw new RuntimeException(); }
}
