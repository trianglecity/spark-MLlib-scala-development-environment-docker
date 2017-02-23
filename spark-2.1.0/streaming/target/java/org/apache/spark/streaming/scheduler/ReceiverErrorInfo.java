package org.apache.spark.streaming.scheduler;
  class ReceiverErrorInfo implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  java.lang.String lastErrorMessage ()  { throw new RuntimeException(); }
  public  java.lang.String lastError ()  { throw new RuntimeException(); }
  public  long lastErrorTime ()  { throw new RuntimeException(); }
  // not preceding
  public   ReceiverErrorInfo (java.lang.String lastErrorMessage, java.lang.String lastError, long lastErrorTime)  { throw new RuntimeException(); }
}
