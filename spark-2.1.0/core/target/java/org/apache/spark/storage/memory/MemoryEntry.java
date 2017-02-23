package org.apache.spark.storage.memory;
public  interface MemoryEntry<T extends java.lang.Object> {
  public  long size ()  ;
  public  org.apache.spark.memory.MemoryMode memoryMode ()  ;
  public  scala.reflect.ClassTag<T> classTag ()  ;
}
