package org.apache.spark.ui.jobs;
  class TaskTableRowShuffleReadData implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  long shuffleReadBlockedTimeSortable ()  { throw new RuntimeException(); }
  public  java.lang.String shuffleReadBlockedTimeReadable ()  { throw new RuntimeException(); }
  public  long shuffleReadSortable ()  { throw new RuntimeException(); }
  public  java.lang.String shuffleReadReadable ()  { throw new RuntimeException(); }
  public  long shuffleReadRemoteSortable ()  { throw new RuntimeException(); }
  public  java.lang.String shuffleReadRemoteReadable ()  { throw new RuntimeException(); }
  // not preceding
  public   TaskTableRowShuffleReadData (long shuffleReadBlockedTimeSortable, java.lang.String shuffleReadBlockedTimeReadable, long shuffleReadSortable, java.lang.String shuffleReadReadable, long shuffleReadRemoteSortable, java.lang.String shuffleReadRemoteReadable)  { throw new RuntimeException(); }
}
