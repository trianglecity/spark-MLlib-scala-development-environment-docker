package org.apache.spark.deploy;
/**
 * Provides a server from which Executors can read shuffle files (rather than reading directly from
 * each other), to provide uninterrupted access to the files in the face of executors being turned
 * off or killed.
 * <p>
 * Optionally requires SASL authentication in order to read. See {@link SecurityManager}.
 */
  class ExternalShuffleService implements org.apache.spark.internal.Logging {
  static private  java.util.concurrent.CountDownLatch barrier ()  { throw new RuntimeException(); }
  static public  void main (java.lang.String[] args)  { throw new RuntimeException(); }
  /** A helper main method that allows the caller to call this with a custom shuffle service. */
  static   void main (java.lang.String[] args, scala.Function2<org.apache.spark.SparkConf, org.apache.spark.SecurityManager, org.apache.spark.deploy.ExternalShuffleService> newShuffleService)  { throw new RuntimeException(); }
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
  public   ExternalShuffleService (org.apache.spark.SparkConf sparkConf, org.apache.spark.SecurityManager securityManager)  { throw new RuntimeException(); }
  protected  org.apache.spark.metrics.MetricsSystem masterMetricsSystem ()  { throw new RuntimeException(); }
  private  boolean enabled ()  { throw new RuntimeException(); }
  private  int port ()  { throw new RuntimeException(); }
  private  boolean useSasl ()  { throw new RuntimeException(); }
  private  org.apache.spark.network.util.TransportConf transportConf ()  { throw new RuntimeException(); }
  private  org.apache.spark.network.shuffle.ExternalShuffleBlockHandler blockHandler ()  { throw new RuntimeException(); }
  private  org.apache.spark.network.TransportContext transportContext ()  { throw new RuntimeException(); }
  private  org.apache.spark.network.server.TransportServer server ()  { throw new RuntimeException(); }
  private  org.apache.spark.deploy.ExternalShuffleServiceSource shuffleServiceSource ()  { throw new RuntimeException(); }
  /** Create a new shuffle block handler. Factored out for subclasses to override. */
  protected  org.apache.spark.network.shuffle.ExternalShuffleBlockHandler newShuffleBlockHandler (org.apache.spark.network.util.TransportConf conf)  { throw new RuntimeException(); }
  /** Starts the external shuffle service if the user has configured us to. */
  public  void startIfEnabled ()  { throw new RuntimeException(); }
  /** Start the external shuffle service */
  public  void start ()  { throw new RuntimeException(); }
  /** Clean up all shuffle files associated with an application that has exited. */
  public  void applicationRemoved (java.lang.String appId)  { throw new RuntimeException(); }
  public  void stop ()  { throw new RuntimeException(); }
}
