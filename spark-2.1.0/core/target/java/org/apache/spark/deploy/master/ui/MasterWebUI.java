package org.apache.spark.deploy.master.ui;
/**
 * Web UI server for the standalone master.
 */
  class MasterWebUI extends org.apache.spark.ui.WebUI implements org.apache.spark.internal.Logging {
  static private  java.lang.String STATIC_RESOURCE_DIR ()  { throw new RuntimeException(); }
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
  static public  org.apache.spark.SecurityManager securityManager ()  { throw new RuntimeException(); }
  static public  org.apache.spark.SSLOptions sslOptions ()  { throw new RuntimeException(); }
  static protected  scala.collection.mutable.ArrayBuffer<org.apache.spark.ui.WebUITab> tabs ()  { throw new RuntimeException(); }
  static protected  scala.collection.mutable.ArrayBuffer<org.eclipse.jetty.servlet.ServletContextHandler> handlers ()  { throw new RuntimeException(); }
  static protected  scala.collection.mutable.HashMap<org.apache.spark.ui.WebUIPage, scala.collection.mutable.ArrayBuffer<org.eclipse.jetty.servlet.ServletContextHandler>> pageToHandlers ()  { throw new RuntimeException(); }
  static protected  scala.Option<org.apache.spark.ui.ServerInfo> serverInfo ()  { throw new RuntimeException(); }
  static protected  void serverInfo_$eq (scala.Option<org.apache.spark.ui.ServerInfo> x$1)  { throw new RuntimeException(); }
  static protected  java.lang.String publicHostName ()  { throw new RuntimeException(); }
  static public  java.lang.String getBasePath ()  { throw new RuntimeException(); }
  static public  scala.collection.Seq<org.apache.spark.ui.WebUITab> getTabs ()  { throw new RuntimeException(); }
  static public  scala.collection.Seq<org.eclipse.jetty.servlet.ServletContextHandler> getHandlers ()  { throw new RuntimeException(); }
  static public  org.apache.spark.SecurityManager getSecurityManager ()  { throw new RuntimeException(); }
  static public  void attachTab (org.apache.spark.ui.WebUITab tab)  { throw new RuntimeException(); }
  static public  void detachTab (org.apache.spark.ui.WebUITab tab)  { throw new RuntimeException(); }
  static public  void detachPage (org.apache.spark.ui.WebUIPage page)  { throw new RuntimeException(); }
  static public  void attachPage (org.apache.spark.ui.WebUIPage page)  { throw new RuntimeException(); }
  static public  void attachHandler (org.eclipse.jetty.servlet.ServletContextHandler handler)  { throw new RuntimeException(); }
  static public  void detachHandler (org.eclipse.jetty.servlet.ServletContextHandler handler)  { throw new RuntimeException(); }
  static public  void addStaticHandler (java.lang.String resourceBase, java.lang.String path)  { throw new RuntimeException(); }
  static public  void removeStaticHandler (java.lang.String path)  { throw new RuntimeException(); }
  static public  void bind ()  { throw new RuntimeException(); }
  static public  java.lang.String webUrl ()  { throw new RuntimeException(); }
  static public  int boundPort ()  { throw new RuntimeException(); }
  static public  void stop ()  { throw new RuntimeException(); }
  public  org.apache.spark.deploy.master.Master master ()  { throw new RuntimeException(); }
  // not preceding
  public   MasterWebUI (org.apache.spark.deploy.master.Master master, int requestedPort)  { throw new RuntimeException(); }
  public  org.apache.spark.rpc.RpcEndpointRef masterEndpointRef ()  { throw new RuntimeException(); }
  public  boolean killEnabled ()  { throw new RuntimeException(); }
  private  scala.collection.mutable.HashMap<java.lang.String, org.eclipse.jetty.servlet.ServletContextHandler> proxyHandlers ()  { throw new RuntimeException(); }
  /** Initialize all components of the server. */
  public  void initialize ()  { throw new RuntimeException(); }
  public  void addProxyTargets (java.lang.String id, java.lang.String target)  { throw new RuntimeException(); }
  public  void removeProxyTargets (java.lang.String id)  { throw new RuntimeException(); }
}
