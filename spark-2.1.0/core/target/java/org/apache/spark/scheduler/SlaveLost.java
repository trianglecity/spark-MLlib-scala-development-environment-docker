package org.apache.spark.scheduler;
/**
 * param:  _message human readable loss reason
 * param:  workerLost whether the worker is confirmed lost too (i.e. including shuffle service)
 */
  class SlaveLost extends org.apache.spark.scheduler.ExecutorLossReason implements scala.Product, scala.Serializable {
  static public  java.lang.String message ()  { throw new RuntimeException(); }
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  java.lang.String _message ()  { throw new RuntimeException(); }
  public  boolean workerLost ()  { throw new RuntimeException(); }
  // not preceding
  public   SlaveLost (java.lang.String _message, boolean workerLost)  { throw new RuntimeException(); }
}
