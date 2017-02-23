package org.apache.spark.shuffle.sort;
  class SortShuffleWriter<K extends java.lang.Object, V extends java.lang.Object, C extends java.lang.Object> extends org.apache.spark.shuffle.ShuffleWriter<K, V> implements org.apache.spark.internal.Logging {
  static public  boolean shouldBypassMergeSort (org.apache.spark.SparkConf conf, org.apache.spark.ShuffleDependency<?, ?, ?> dep)  { throw new RuntimeException(); }
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
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   SortShuffleWriter (org.apache.spark.shuffle.IndexShuffleBlockResolver shuffleBlockResolver, org.apache.spark.shuffle.BaseShuffleHandle<K, V, C> handle, int mapId, org.apache.spark.TaskContext context)  { throw new RuntimeException(); }
  private  org.apache.spark.ShuffleDependency<K, V, C> dep ()  { throw new RuntimeException(); }
  private  org.apache.spark.storage.BlockManager blockManager ()  { throw new RuntimeException(); }
  private  org.apache.spark.util.collection.ExternalSorter<K, V, ?> sorter ()  { throw new RuntimeException(); }
  private  boolean stopping ()  { throw new RuntimeException(); }
  private  org.apache.spark.scheduler.MapStatus mapStatus ()  { throw new RuntimeException(); }
  private  org.apache.spark.executor.ShuffleWriteMetrics writeMetrics ()  { throw new RuntimeException(); }
  /** Write a bunch of records to this task's output */
  public  void write (scala.collection.Iterator<scala.Product2<K, V>> records)  { throw new RuntimeException(); }
  /** Close this writer, passing along whether the map completed */
  public  scala.Option<org.apache.spark.scheduler.MapStatus> stop (boolean success)  { throw new RuntimeException(); }
}
