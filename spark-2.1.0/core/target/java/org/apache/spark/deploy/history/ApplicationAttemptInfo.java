package org.apache.spark.deploy.history;
  class ApplicationAttemptInfo implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> attemptId ()  { throw new RuntimeException(); }
  public  long startTime ()  { throw new RuntimeException(); }
  public  long endTime ()  { throw new RuntimeException(); }
  public  long lastUpdated ()  { throw new RuntimeException(); }
  public  java.lang.String sparkUser ()  { throw new RuntimeException(); }
  public  boolean completed ()  { throw new RuntimeException(); }
  // not preceding
  public   ApplicationAttemptInfo (scala.Option<java.lang.String> attemptId, long startTime, long endTime, long lastUpdated, java.lang.String sparkUser, boolean completed)  { throw new RuntimeException(); }
}
