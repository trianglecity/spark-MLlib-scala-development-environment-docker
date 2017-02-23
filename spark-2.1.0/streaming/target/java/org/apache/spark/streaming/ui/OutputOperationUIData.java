package org.apache.spark.streaming.ui;
  class OutputOperationUIData implements scala.Product, scala.Serializable {
  static public  org.apache.spark.streaming.ui.OutputOperationUIData apply (org.apache.spark.streaming.scheduler.OutputOperationInfo outputOperationInfo)  { throw new RuntimeException(); }
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  int id ()  { throw new RuntimeException(); }
  public  java.lang.String name ()  { throw new RuntimeException(); }
  public  java.lang.String description ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> startTime ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> endTime ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> failureReason ()  { throw new RuntimeException(); }
  // not preceding
  public   OutputOperationUIData (int id, java.lang.String name, java.lang.String description, scala.Option<java.lang.Object> startTime, scala.Option<java.lang.Object> endTime, scala.Option<java.lang.String> failureReason)  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> duration ()  { throw new RuntimeException(); }
}
