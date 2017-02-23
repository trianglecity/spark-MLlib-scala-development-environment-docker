package org.apache.spark.scheduler.local;
public  class StatusUpdate implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  long taskId ()  { throw new RuntimeException(); }
  public  scala.Enumeration.Value state ()  { throw new RuntimeException(); }
  public  java.nio.ByteBuffer serializedData ()  { throw new RuntimeException(); }
  // not preceding
  public   StatusUpdate (long taskId, scala.Enumeration.Value state, java.nio.ByteBuffer serializedData)  { throw new RuntimeException(); }
}
