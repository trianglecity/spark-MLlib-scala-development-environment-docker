package org.apache.spark;
/**
 * SSLOptions class is a common container for SSL configuration options. It offers methods to
 * generate specific objects to configure SSL for different communication protocols.
 * <p>
 * SSLOptions is intended to provide the maximum common set of SSL settings, which are supported
 * by the protocol, which it can generate the configuration for.
 * <p>
 * param:  enabled             enables or disables SSL; if it is set to false, the rest of the
 *                            settings are disregarded
 * param:  keyStore            a path to the key-store file
 * param:  keyStorePassword    a password to access the key-store file
 * param:  keyPassword         a password to access the private key in the key-store
 * param:  keyStoreType        the type of the key-store
 * param:  needClientAuth      set true if SSL needs client authentication
 * param:  trustStore          a path to the trust-store file
 * param:  trustStorePassword  a password to access the trust-store file
 * param:  trustStoreType      the type of the trust-store
 * param:  protocol            SSL protocol (remember that SSLv3 was compromised) supported by Java
 * param:  enabledAlgorithms   a set of encryption algorithms that may be used
 */
  class SSLOptions implements org.apache.spark.internal.Logging, scala.Product, scala.Serializable {
  /**
   * Resolves SSLOptions settings from a given Spark configuration object at a given namespace.
   * <p>
   * The following settings are allowed:
   * $ - <code>[ns].enabled</code> - <code>true</code> or <code>false</code>, to enable or disable SSL respectively
   * $ - <code>[ns].keyStore</code> - a path to the key-store file; can be relative to the current directory
   * $ - <code>[ns].keyStorePassword</code> - a password to the key-store file
   * $ - <code>[ns].keyPassword</code> - a password to the private key
   * $ - <code>[ns].keyStoreType</code> - the type of the key-store
   * $ - <code>[ns].needClientAuth</code> - whether SSL needs client authentication
   * $ - <code>[ns].trustStore</code> - a path to the trust-store file; can be relative to the current
   *                         directory
   * $ - <code>[ns].trustStorePassword</code> - a password to the trust-store file
   * $ - <code>[ns].trustStoreType</code> - the type of trust-store
   * $ - <code>[ns].protocol</code> - a protocol name supported by a particular Java version
   * $ - <code>[ns].enabledAlgorithms</code> - a comma separated list of ciphers
   * <p>
   * For a list of protocols and ciphers supported by particular Java versions, you may go to
   * <a href="https://blogs.oracle.com/java-platform-group/entry/diagnosing_tls_ssl_and_https">
   * Oracle blog page</a>.
   * <p>
   * You can optionally specify the default configuration. If you do, for each setting which is
   * missing in SparkConf, the corresponding setting is used from the default configuration.
   * <p>
   * @param conf Spark configuration object where the settings are collected from
   * @param ns the namespace name
   * @param defaults the default configuration
   * @return {@link org.apache.spark.SSLOptions} object
   */
  static public  org.apache.spark.SSLOptions parse (org.apache.spark.SparkConf conf, java.lang.String ns, scala.Option<org.apache.spark.SSLOptions> defaults)  { throw new RuntimeException(); }
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
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  boolean enabled ()  { throw new RuntimeException(); }
  public  scala.Option<java.io.File> keyStore ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> keyStorePassword ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> keyPassword ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> keyStoreType ()  { throw new RuntimeException(); }
  public  boolean needClientAuth ()  { throw new RuntimeException(); }
  public  scala.Option<java.io.File> trustStore ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> trustStorePassword ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> trustStoreType ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> protocol ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Set<java.lang.String> enabledAlgorithms ()  { throw new RuntimeException(); }
  // not preceding
  public   SSLOptions (boolean enabled, scala.Option<java.io.File> keyStore, scala.Option<java.lang.String> keyStorePassword, scala.Option<java.lang.String> keyPassword, scala.Option<java.lang.String> keyStoreType, boolean needClientAuth, scala.Option<java.io.File> trustStore, scala.Option<java.lang.String> trustStorePassword, scala.Option<java.lang.String> trustStoreType, scala.Option<java.lang.String> protocol, scala.collection.immutable.Set<java.lang.String> enabledAlgorithms)  { throw new RuntimeException(); }
  /**
   * Creates a Jetty SSL context factory according to the SSL settings represented by this object.
   * @return (undocumented)
   */
  public  scala.Option<org.eclipse.jetty.util.ssl.SslContextFactory> createJettySslContextFactory ()  { throw new RuntimeException(); }
  private  scala.collection.immutable.Set<java.lang.String> supportedAlgorithms ()  { throw new RuntimeException(); }
  /** Returns a string representation of this SSLOptions with all the passwords masked. */
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
