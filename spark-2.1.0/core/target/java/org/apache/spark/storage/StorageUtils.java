package org.apache.spark.storage;
/** Helper methods for storage-related objects. */
public  class StorageUtils {
  /**
   * Attempt to clean up a ByteBuffer if it is memory-mapped. This uses an *unsafe* Sun API that
   * might cause errors if one attempts to read from the unmapped buffer, but it's better than
   * waiting for the GC to find it because that could lead to huge numbers of open files. There's
   * unfortunately no standard API to do this.
   * @param buffer (undocumented)
   */
  static public  void dispose (java.nio.ByteBuffer buffer)  { throw new RuntimeException(); }
  /**
   * Update the given list of RDDInfo with the given list of storage statuses.
   * This method overwrites the old values stored in the RDDInfo's.
   * @param rddInfos (undocumented)
   * @param statuses (undocumented)
   */
  static public  void updateRddInfo (scala.collection.Seq<org.apache.spark.storage.RDDInfo> rddInfos, scala.collection.Seq<org.apache.spark.storage.StorageStatus> statuses)  { throw new RuntimeException(); }
  /**
   * Return a mapping from block ID to its locations for each block that belongs to the given RDD.
   * @param rddId (undocumented)
   * @param statuses (undocumented)
   * @return (undocumented)
   */
  static public  scala.collection.Map<org.apache.spark.storage.BlockId, scala.collection.Seq<java.lang.String>> getRddBlockLocations (int rddId, scala.collection.Seq<org.apache.spark.storage.StorageStatus> statuses)  { throw new RuntimeException(); }
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
}
