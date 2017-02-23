package org.apache.spark.scheduler;
/** A reference to a DirectTaskResult that has been stored in the worker's BlockManager. */
  class IndirectTaskResult<T extends java.lang.Object> implements org.apache.spark.scheduler.TaskResult<T>, java.io.Serializable, scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  org.apache.spark.storage.BlockId blockId ()  { throw new RuntimeException(); }
  public  int size ()  { throw new RuntimeException(); }
  // not preceding
  public   IndirectTaskResult (org.apache.spark.storage.BlockId blockId, int size)  { throw new RuntimeException(); }
}
