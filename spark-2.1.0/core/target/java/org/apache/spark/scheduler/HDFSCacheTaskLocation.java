package org.apache.spark.scheduler;
/**
 * A location on a host that is cached by HDFS.
 */
  class HDFSCacheTaskLocation implements org.apache.spark.scheduler.TaskLocation, scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  java.lang.String host ()  { throw new RuntimeException(); }
  // not preceding
  public   HDFSCacheTaskLocation (java.lang.String host)  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
