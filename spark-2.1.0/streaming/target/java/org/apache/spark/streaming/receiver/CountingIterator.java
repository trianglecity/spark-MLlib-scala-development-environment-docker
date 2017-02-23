package org.apache.spark.streaming.receiver;
/**
 * A utility that will wrap the Iterator to get the count
 */
  class CountingIterator<T extends java.lang.Object> implements scala.collection.Iterator<T> {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   CountingIterator (scala.collection.Iterator<T> iterator)  { throw new RuntimeException(); }
  private  int _count ()  { throw new RuntimeException(); }
  private  boolean isFullyConsumed ()  { throw new RuntimeException(); }
  public  boolean hasNext ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> count ()  { throw new RuntimeException(); }
  public  T next ()  { throw new RuntimeException(); }
}
