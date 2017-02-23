package org.apache.spark.security;
/**
 * A util class for manipulating IO encryption and decryption streams.
 */
public  class CryptoStreamUtils$ implements org.apache.spark.internal.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final CryptoStreamUtils$ MODULE$ = null;
  public   CryptoStreamUtils$ ()  { throw new RuntimeException(); }
  public  int IV_LENGTH_IN_BYTES ()  { throw new RuntimeException(); }
  public  java.lang.String SPARK_IO_ENCRYPTION_COMMONS_CONFIG_PREFIX ()  { throw new RuntimeException(); }
  public  java.lang.String COMMONS_CRYPTO_CONF_PREFIX ()  { throw new RuntimeException(); }
  /**
   * Helper method to wrap <code>OutputStream</code> with <code>CryptoOutputStream</code> for encryption.
   * @param os (undocumented)
   * @param sparkConf (undocumented)
   * @param key (undocumented)
   * @return (undocumented)
   */
  public  java.io.OutputStream createCryptoOutputStream (java.io.OutputStream os, org.apache.spark.SparkConf sparkConf, byte[] key)  { throw new RuntimeException(); }
  /**
   * Helper method to wrap <code>InputStream</code> with <code>CryptoInputStream</code> for decryption.
   * @param is (undocumented)
   * @param sparkConf (undocumented)
   * @param key (undocumented)
   * @return (undocumented)
   */
  public  java.io.InputStream createCryptoInputStream (java.io.InputStream is, org.apache.spark.SparkConf sparkConf, byte[] key)  { throw new RuntimeException(); }
  /**
   * Get Commons-crypto configurations from Spark configurations identified by prefix.
   * @param conf (undocumented)
   * @return (undocumented)
   */
  public  java.util.Properties toCryptoConf (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  /**
   * Creates a new encryption key.
   * @param conf (undocumented)
   * @return (undocumented)
   */
  public  byte[] createKey (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  /**
   * This method to generate an IV (Initialization Vector) using secure random.
   * @param properties (undocumented)
   * @return (undocumented)
   */
  private  byte[] createInitializationVector (java.util.Properties properties)  { throw new RuntimeException(); }
}
