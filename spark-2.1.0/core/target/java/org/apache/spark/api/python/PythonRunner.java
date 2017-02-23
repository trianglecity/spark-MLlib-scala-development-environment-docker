package org.apache.spark.api.python;
/**
 * A helper class to run Python mapPartition/UDFs in Spark.
 * <p>
 * funcs is a list of independent Python functions, each one of them is a list of chained Python
 * functions (from bottom to top).
 */
  class PythonRunner implements org.apache.spark.internal.Logging {
  /**
   * The thread responsible for writing the data from the PythonRDD's parent iterator to the
   * Python process.
   */
  public  class WriterThread extends java.lang.Thread {
    public   WriterThread (org.apache.spark.SparkEnv env, java.net.Socket worker, scala.collection.Iterator<?> inputIterator, int partitionIndex, org.apache.spark.TaskContext context)  { throw new RuntimeException(); }
    private  java.lang.Exception _exception ()  { throw new RuntimeException(); }
    private  scala.collection.immutable.Set<java.lang.String> pythonIncludes ()  { throw new RuntimeException(); }
    private  scala.collection.Seq<org.apache.spark.broadcast.Broadcast<org.apache.spark.api.python.PythonBroadcast>> broadcastVars ()  { throw new RuntimeException(); }
    /** Contains the exception thrown while writing the parent iterator to the Python process. */
    public  scala.Option<java.lang.Exception> exception ()  { throw new RuntimeException(); }
    /** Terminates the writer thread, ignoring any exceptions that may occur due to cleanup. */
    public  void shutdownOnTaskCompletion ()  { throw new RuntimeException(); }
    public  void run ()  { throw new RuntimeException(); }
  }
  /**
   * It is necessary to have a monitor thread for python workers if the user cancels with
   * interrupts disabled. In that case we will need to explicitly kill the worker, otherwise the
   * threads can block indefinitely.
   */
  public  class MonitorThread extends java.lang.Thread {
    public   MonitorThread (org.apache.spark.SparkEnv env, java.net.Socket worker, org.apache.spark.TaskContext context)  { throw new RuntimeException(); }
    public  void run ()  { throw new RuntimeException(); }
  }
  static public  org.apache.spark.api.python.PythonRunner apply (org.apache.spark.api.python.PythonFunction func, int bufferSize, boolean reuse_worker)  { throw new RuntimeException(); }
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
  public   PythonRunner (scala.collection.Seq<org.apache.spark.api.python.ChainedPythonFunctions> funcs, int bufferSize, boolean reuse_worker, boolean isUDF, int[][] argOffsets)  { throw new RuntimeException(); }
  private  java.util.Map<java.lang.String, java.lang.String> envVars ()  { throw new RuntimeException(); }
  private  java.lang.String pythonExec ()  { throw new RuntimeException(); }
  private  java.lang.String pythonVer ()  { throw new RuntimeException(); }
  private  org.apache.spark.api.python.PythonAccumulatorV2 accumulator ()  { throw new RuntimeException(); }
  public  scala.collection.Iterator<byte[]> compute (scala.collection.Iterator<?> inputIterator, int partitionIndex, org.apache.spark.TaskContext context)  { throw new RuntimeException(); }
}
