package org.apache.spark.scheduler;
public  class AskPermissionToCommitOutput implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  int stage ()  { throw new RuntimeException(); }
  public  int partition ()  { throw new RuntimeException(); }
  public  int attemptNumber ()  { throw new RuntimeException(); }
  // not preceding
  public   AskPermissionToCommitOutput (int stage, int partition, int attemptNumber)  { throw new RuntimeException(); }
}
