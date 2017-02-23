package org.apache.spark;
public  class SSLOptions$ implements org.apache.spark.internal.Logging, scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final SSLOptions$ MODULE$ = null;
  public   SSLOptions$ ()  { throw new RuntimeException(); }
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
  public  org.apache.spark.SSLOptions parse (org.apache.spark.SparkConf conf, java.lang.String ns, scala.Option<org.apache.spark.SSLOptions> defaults)  { throw new RuntimeException(); }
}
