package org.apache.spark.streaming.scheduler;
/**
 * :: DeveloperApi ::
 * Class having information about a receiver
 */
public  class ReceiverInfo implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  int streamId ()  { throw new RuntimeException(); }
  public  java.lang.String name ()  { throw new RuntimeException(); }
  public  boolean active ()  { throw new RuntimeException(); }
  public  java.lang.String location ()  { throw new RuntimeException(); }
  public  java.lang.String executorId ()  { throw new RuntimeException(); }
  public  java.lang.String lastErrorMessage ()  { throw new RuntimeException(); }
  public  java.lang.String lastError ()  { throw new RuntimeException(); }
  public  long lastErrorTime ()  { throw new RuntimeException(); }
  // not preceding
  public   ReceiverInfo (int streamId, java.lang.String name, boolean active, java.lang.String location, java.lang.String executorId, java.lang.String lastErrorMessage, java.lang.String lastError, long lastErrorTime)  { throw new RuntimeException(); }
}
