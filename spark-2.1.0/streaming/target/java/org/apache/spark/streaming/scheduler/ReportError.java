package org.apache.spark.streaming.scheduler;
  class ReportError implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  int streamId ()  { throw new RuntimeException(); }
  public  java.lang.String message ()  { throw new RuntimeException(); }
  public  java.lang.String error ()  { throw new RuntimeException(); }
  // not preceding
  public   ReportError (int streamId, java.lang.String message, java.lang.String error)  { throw new RuntimeException(); }
}
