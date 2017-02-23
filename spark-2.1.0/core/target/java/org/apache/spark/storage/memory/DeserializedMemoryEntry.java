package org.apache.spark.storage.memory;
public  class DeserializedMemoryEntry<T extends java.lang.Object> implements org.apache.spark.storage.memory.MemoryEntry<T>, scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  java.lang.Object value ()  { throw new RuntimeException(); }
  public  long size ()  { throw new RuntimeException(); }
  public  scala.reflect.ClassTag<T> classTag ()  { throw new RuntimeException(); }
  // not preceding
  public   DeserializedMemoryEntry (java.lang.Object value, long size, scala.reflect.ClassTag<T> classTag)  { throw new RuntimeException(); }
  public  org.apache.spark.memory.MemoryMode memoryMode ()  { throw new RuntimeException(); }
}
