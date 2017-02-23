package org.apache.spark.security;
/**
 * A util class for manipulating IO encryption and decryption streams.
 */
public  class CryptoStreamUtils {
  static public  int IV_LENGTH_IN_BYTES ()  { throw new RuntimeException(); }
  static public  java.lang.String SPARK_IO_ENCRYPTION_COMMONS_CONFIG_PREFIX ()  { throw new RuntimeException(); }
  static public  java.lang.String COMMONS_CRYPTO_CONF_PREFIX ()  { throw new RuntimeException(); }
  /**
   * Helper method to wrap <code>OutputStream</code> with <code>CryptoOutputStream</code> for encryption.
   * @param os (undocumented)
   * @param sparkConf (undocumented)
   * @param key (undocumented)
   * @return (undocumented)
   */
  static public  java.io.OutputStream createCryptoOutputStream (java.io.OutputStream os, org.apache.spark.SparkConf sparkConf, byte[] key)  { throw new RuntimeException(); }
  /**
   * Helper method to wrap <code>InputStream</code> with <code>CryptoInputStream</code> for decryption.
   * @param is (undocumented)
   * @param sparkConf (undocumented)
   * @param key (undocumented)
   * @return (undocumented)
   */
  static public  java.io.InputStream createCryptoInputStream (java.io.InputStream is, org.apache.spark.SparkConf sparkConf, byte[] key)  { throw new RuntimeException(); }
  /**
   * Get Commons-crypto configurations from Spark configurations identified by prefix.
   * @param conf (undocumented)
   * @return (undocumented)
   */
  static public  java.util.Properties toCryptoConf (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  /**
   * Creates a new encryption key.
   * @param conf (undocumented)
   * @return (undocumented)
   */
  static public  byte[] createKey (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  /**
   * This method to generate an IV (Initialization Vector) using secure random.
   * @param properties (undocumented)
   * @return (undocumented)
   */
  static private  byte[] createInitializationVector (java.util.Properties properties)  { throw new RuntimeException(); }
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
