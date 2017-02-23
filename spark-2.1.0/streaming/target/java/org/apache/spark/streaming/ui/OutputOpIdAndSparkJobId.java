package org.apache.spark.streaming.ui;
  class OutputOpIdAndSparkJobId implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  int outputOpId ()  { throw new RuntimeException(); }
  public  int sparkJobId ()  { throw new RuntimeException(); }
  // not preceding
  public   OutputOpIdAndSparkJobId (int outputOpId, int sparkJobId)  { throw new RuntimeException(); }
}
