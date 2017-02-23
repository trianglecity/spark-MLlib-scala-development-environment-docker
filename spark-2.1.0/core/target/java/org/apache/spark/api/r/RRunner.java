package org.apache.spark.api.r;
/**
 * A helper class to run R UDFs in Spark.
 */
  class RRunner<U extends java.lang.Object> implements org.apache.spark.internal.Logging {
  /**
   * Start a thread to print the process's stderr to ours
   * @param proc (undocumented)
   * @return (undocumented)
   */
  static private  org.apache.spark.api.r.BufferedStreamThread startStdoutThread (java.lang.Process proc)  { throw new RuntimeException(); }
  static private  org.apache.spark.api.r.BufferedStreamThread createRProcess (int port, java.lang.String script)  { throw new RuntimeException(); }
  /**
   * ProcessBuilder used to launch worker R processes.
   * @param port (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.api.r.BufferedStreamThread createRWorker (int port)  { throw new RuntimeException(); }
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
  public   RRunner (byte[] func, java.lang.String deserializer, java.lang.String serializer, byte[] packageNames, org.apache.spark.broadcast.Broadcast<java.lang.Object>[] broadcastVars, int numPartitions, boolean isDataFrame, java.lang.String[] colNames, int mode)  { throw new RuntimeException(); }
  private  double bootTime ()  { throw new RuntimeException(); }
  private  java.io.DataInputStream dataStream ()  { throw new RuntimeException(); }
  public  scala.Function1<java.lang.Object, java.lang.Object> readData ()  { throw new RuntimeException(); }
  public  scala.collection.Iterator<U> compute (scala.collection.Iterator<?> inputIterator, int partitionIndex)  { throw new RuntimeException(); }
  /**
   * Start a thread to write RDD data to the R process.
   * @param output (undocumented)
   * @param iter (undocumented)
   * @param partitionIndex (undocumented)
   */
  private  void startStdinThread (java.io.OutputStream output, scala.collection.Iterator<?> iter, int partitionIndex)  { throw new RuntimeException(); }
  private  U read ()  { throw new RuntimeException(); }
  private  scala.Tuple2<java.lang.Object, byte[]> readShuffledData (int length)  { throw new RuntimeException(); }
  private  byte[] readByteArrayData (int length)  { throw new RuntimeException(); }
  private  java.lang.String readStringData (int length)  { throw new RuntimeException(); }
}
