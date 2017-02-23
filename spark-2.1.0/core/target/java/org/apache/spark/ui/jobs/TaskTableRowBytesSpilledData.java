package org.apache.spark.ui.jobs;
  class TaskTableRowBytesSpilledData implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  long memoryBytesSpilledSortable ()  { throw new RuntimeException(); }
  public  java.lang.String memoryBytesSpilledReadable ()  { throw new RuntimeException(); }
  public  long diskBytesSpilledSortable ()  { throw new RuntimeException(); }
  public  java.lang.String diskBytesSpilledReadable ()  { throw new RuntimeException(); }
  // not preceding
  public   TaskTableRowBytesSpilledData (long memoryBytesSpilledSortable, java.lang.String memoryBytesSpilledReadable, long diskBytesSpilledSortable, java.lang.String diskBytesSpilledReadable)  { throw new RuntimeException(); }
}
