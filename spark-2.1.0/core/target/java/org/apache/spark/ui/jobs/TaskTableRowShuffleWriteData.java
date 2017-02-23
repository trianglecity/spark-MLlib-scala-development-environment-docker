package org.apache.spark.ui.jobs;
  class TaskTableRowShuffleWriteData implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  long writeTimeSortable ()  { throw new RuntimeException(); }
  public  java.lang.String writeTimeReadable ()  { throw new RuntimeException(); }
  public  long shuffleWriteSortable ()  { throw new RuntimeException(); }
  public  java.lang.String shuffleWriteReadable ()  { throw new RuntimeException(); }
  // not preceding
  public   TaskTableRowShuffleWriteData (long writeTimeSortable, java.lang.String writeTimeReadable, long shuffleWriteSortable, java.lang.String shuffleWriteReadable)  { throw new RuntimeException(); }
}
