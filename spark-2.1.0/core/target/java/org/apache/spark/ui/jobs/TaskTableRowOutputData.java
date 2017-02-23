package org.apache.spark.ui.jobs;
  class TaskTableRowOutputData implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  long outputSortable ()  { throw new RuntimeException(); }
  public  java.lang.String outputReadable ()  { throw new RuntimeException(); }
  // not preceding
  public   TaskTableRowOutputData (long outputSortable, java.lang.String outputReadable)  { throw new RuntimeException(); }
}
