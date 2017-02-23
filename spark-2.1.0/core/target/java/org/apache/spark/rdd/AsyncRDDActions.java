package org.apache.spark.rdd;
/**
 * A set of asynchronous RDD actions available through an implicit conversion.
 */
public  class AsyncRDDActions<T extends java.lang.Object> implements scala.Serializable, org.apache.spark.internal.Logging {
  static public  scala.concurrent.ExecutionContextExecutorService futureExecutionContext ()  { throw new RuntimeException(); }
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
  public   AsyncRDDActions (org.apache.spark.rdd.RDD<T> self, scala.reflect.ClassTag<T> evidence$1)  { throw new RuntimeException(); }
  /**
   * Returns a future for counting the number of elements in the RDD.
   * @return (undocumented)
   */
  public  org.apache.spark.FutureAction<java.lang.Object> countAsync ()  { throw new RuntimeException(); }
  /**
   * Returns a future for retrieving all elements of this RDD.
   * @return (undocumented)
   */
  public  org.apache.spark.FutureAction<scala.collection.Seq<T>> collectAsync ()  { throw new RuntimeException(); }
  /**
   * Returns a future for retrieving the first num elements of the RDD.
   * @param num (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.FutureAction<scala.collection.Seq<T>> takeAsync (int num)  { throw new RuntimeException(); }
  /**
   * Applies a function f to all elements of this RDD.
   * @param f (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.FutureAction<scala.runtime.BoxedUnit> foreachAsync (scala.Function1<T, scala.runtime.BoxedUnit> f)  { throw new RuntimeException(); }
  /**
   * Applies a function f to each partition of this RDD.
   * @param f (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.FutureAction<scala.runtime.BoxedUnit> foreachPartitionAsync (scala.Function1<scala.collection.Iterator<T>, scala.runtime.BoxedUnit> f)  { throw new RuntimeException(); }
}
