package org.apache.spark.deploy;
public  class SparkCuratorUtil {
  static private  int ZK_CONNECTION_TIMEOUT_MILLIS ()  { throw new RuntimeException(); }
  static private  int ZK_SESSION_TIMEOUT_MILLIS ()  { throw new RuntimeException(); }
  static private  int RETRY_WAIT_MILLIS ()  { throw new RuntimeException(); }
  static private  int MAX_RECONNECT_ATTEMPTS ()  { throw new RuntimeException(); }
  static public  org.apache.curator.framework.CuratorFramework newClient (org.apache.spark.SparkConf conf, java.lang.String zkUrlConf)  { throw new RuntimeException(); }
  static public  void mkdir (org.apache.curator.framework.CuratorFramework zk, java.lang.String path)  { throw new RuntimeException(); }
  static public  void deleteRecursive (org.apache.curator.framework.CuratorFramework zk, java.lang.String path)  { throw new RuntimeException(); }
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
