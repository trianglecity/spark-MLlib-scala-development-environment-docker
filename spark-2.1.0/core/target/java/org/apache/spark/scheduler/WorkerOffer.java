package org.apache.spark.scheduler;
/**
 * Represents free resources available on an executor.
 */
  class WorkerOffer implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  java.lang.String executorId ()  { throw new RuntimeException(); }
  public  java.lang.String host ()  { throw new RuntimeException(); }
  public  int cores ()  { throw new RuntimeException(); }
  // not preceding
  public   WorkerOffer (java.lang.String executorId, java.lang.String host, int cores)  { throw new RuntimeException(); }
}
