package org.apache.spark.ui.storage;
  class BlockTableRowData implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  java.lang.String blockName ()  { throw new RuntimeException(); }
  public  java.lang.String storageLevel ()  { throw new RuntimeException(); }
  public  long memoryUsed ()  { throw new RuntimeException(); }
  public  long diskUsed ()  { throw new RuntimeException(); }
  public  java.lang.String executors ()  { throw new RuntimeException(); }
  // not preceding
  public   BlockTableRowData (java.lang.String blockName, java.lang.String storageLevel, long memoryUsed, long diskUsed, java.lang.String executors)  { throw new RuntimeException(); }
}
