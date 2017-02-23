package org.apache.spark.api.python;
  class PythonWorkerFactory implements org.apache.spark.internal.Logging {
  /**
   * Monitor all the idle workers, kill them after timeout.
   */
  private  class MonitorThread extends java.lang.Thread {
    public   MonitorThread ()  { throw new RuntimeException(); }
    public  void run ()  { throw new RuntimeException(); }
  }
  static public  int PROCESS_WAIT_TIMEOUT_MS ()  { throw new RuntimeException(); }
  static public  int IDLE_WORKER_TIMEOUT_MS ()  { throw new RuntimeException(); }
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
  public   PythonWorkerFactory (java.lang.String pythonExec, scala.collection.immutable.Map<java.lang.String, java.lang.String> envVars)  { throw new RuntimeException(); }
  public  boolean useDaemon ()  { throw new RuntimeException(); }
  public  java.lang.Process daemon ()  { throw new RuntimeException(); }
  public  java.net.InetAddress daemonHost ()  { throw new RuntimeException(); }
  public  int daemonPort ()  { throw new RuntimeException(); }
  public  scala.collection.mutable.WeakHashMap<java.net.Socket, java.lang.Object> daemonWorkers ()  { throw new RuntimeException(); }
  public  scala.collection.mutable.Queue<java.net.Socket> idleWorkers ()  { throw new RuntimeException(); }
  public  long lastActivity ()  { throw new RuntimeException(); }
  public  scala.collection.mutable.WeakHashMap<java.net.Socket, java.lang.Process> simpleWorkers ()  { throw new RuntimeException(); }
  public  java.lang.String pythonPath ()  { throw new RuntimeException(); }
  public  java.net.Socket create ()  { throw new RuntimeException(); }
  /**
   * Connect to a worker launched through pyspark/daemon.py, which forks python processes itself
   * to avoid the high cost of forking from Java. This currently only works on UNIX-based systems.
   * @return (undocumented)
   */
  private  java.net.Socket createThroughDaemon ()  { throw new RuntimeException(); }
  /**
   * Launch a worker by executing worker.py directly and telling it to connect to us.
   * @return (undocumented)
   */
  private  java.net.Socket createSimpleWorker ()  { throw new RuntimeException(); }
  private  void startDaemon ()  { throw new RuntimeException(); }
  /**
   * Redirect the given streams to our stderr in separate threads.
   * @param stdout (undocumented)
   * @param stderr (undocumented)
   */
  private  void redirectStreamsToStderr (java.io.InputStream stdout, java.io.InputStream stderr)  { throw new RuntimeException(); }
  private  void cleanupIdleWorkers ()  { throw new RuntimeException(); }
  private  void stopDaemon ()  { throw new RuntimeException(); }
  public  void stop ()  { throw new RuntimeException(); }
  public  void stopWorker (java.net.Socket worker)  { throw new RuntimeException(); }
  public  void releaseWorker (java.net.Socket worker)  { throw new RuntimeException(); }
}
