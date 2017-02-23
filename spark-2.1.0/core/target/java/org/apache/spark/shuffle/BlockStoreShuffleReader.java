package org.apache.spark.shuffle;
/**
 * Fetches and reads the partitions in range [startPartition, endPartition) from a shuffle by
 * requesting them from other nodes' block stores.
 */
  class BlockStoreShuffleReader<K extends java.lang.Object, C extends java.lang.Object> implements org.apache.spark.shuffle.ShuffleReader<K, C>, org.apache.spark.internal.Logging {
  static protected  java.lang.String logName ()  { throw new RuntimeException(); }
  static protected  org.slf4j.Logger log ()  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  boolean isTraceEnabled ()  { throw new RuntimeException(); }
  static protected  void initializeLogIfNecessary (boolean isInterpreter)  { throw new RuntimeException(); }
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   BlockStoreShuffleReader (org.apache.spark.shuffle.BaseShuffleHandle<K, ?, C> handle, int startPartition, int endPartition, org.apache.spark.TaskContext context, org.apache.spark.serializer.SerializerManager serializerManager, org.apache.spark.storage.BlockManager blockManager, org.apache.spark.MapOutputTracker mapOutputTracker)  { throw new RuntimeException(); }
  private  Object dep ()  { throw new RuntimeException(); }
  /** Read the combined key-values for this reduce task */
  public  scala.collection.Iterator<scala.Product2<K, C>> read ()  { throw new RuntimeException(); }
}
