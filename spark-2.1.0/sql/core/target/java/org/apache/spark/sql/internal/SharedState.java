package org.apache.spark.sql.internal;
/**
 * A class that holds all state shared across sessions in a given {@link SQLContext}.
 */
  class SharedState implements org.apache.spark.internal.Logging {
  static private  java.lang.String HIVE_EXTERNAL_CATALOG_CLASS_NAME ()  { throw new RuntimeException(); }
  static private  java.lang.String externalCatalogClassName (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  /**
   * Helper method to create an instance of {@link T} using a single-arg constructor that
   * accepts an {@link Arg1} and an {@link Arg2}.
   * @param className (undocumented)
   * @param ctorArg1 (undocumented)
   * @param ctorArg2 (undocumented)
   * @param ctorArgTag1 (undocumented)
   * @param ctorArgTag2 (undocumented)
   * @return (undocumented)
   */
  static private <T extends java.lang.Object, Arg1 extends java.lang.Object, Arg2 extends java.lang.Object> T reflect (java.lang.String className, Arg1 ctorArg1, Arg2 ctorArg2, scala.reflect.ClassTag<Arg1> ctorArgTag1, scala.reflect.ClassTag<Arg2> ctorArgTag2)  { throw new RuntimeException(); }
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
  public  org.apache.spark.SparkContext sparkContext ()  { throw new RuntimeException(); }
  // not preceding
  public   SharedState (org.apache.spark.SparkContext sparkContext)  { throw new RuntimeException(); }
  public  java.lang.String warehousePath ()  { throw new RuntimeException(); }
  /**
   * Class for caching query results reused in future executions.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.execution.CacheManager cacheManager ()  { throw new RuntimeException(); }
  /**
   * A listener for SQL-specific {@link org.apache.spark.scheduler.SparkListenerEvent}s.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.execution.ui.SQLListener listener ()  { throw new RuntimeException(); }
  /**
   * A catalog that interacts with external systems.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.catalog.ExternalCatalog externalCatalog ()  { throw new RuntimeException(); }
  /**
   * A manager for global temporary views.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.catalog.GlobalTempViewManager globalTempViewManager ()  { throw new RuntimeException(); }
  /**
   * A classloader used to load all user-added jar.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.internal.NonClosableMutableURLClassLoader jarClassLoader ()  { throw new RuntimeException(); }
  /**
   * Create a SQLListener then add it into SparkContext, and create a SQLTab if there is SparkUI.
   * @param sc (undocumented)
   * @return (undocumented)
   */
  private  org.apache.spark.sql.execution.ui.SQLListener createListenerAndUI (org.apache.spark.SparkContext sc)  { throw new RuntimeException(); }
}
