package org.apache.spark.sql.hive.orc;
/**
 * Options for the ORC data source.
 */
  class OrcOptions implements scala.Serializable {
  static private  scala.collection.immutable.Map<java.lang.String, java.lang.String> shortOrcCompressionCodecNames ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.catalyst.util.CaseInsensitiveMap parameters ()  { throw new RuntimeException(); }
  // not preceding
  public   OrcOptions (org.apache.spark.sql.catalyst.util.CaseInsensitiveMap parameters)  { throw new RuntimeException(); }
  public   OrcOptions (scala.collection.immutable.Map<java.lang.String, java.lang.String> parameters)  { throw new RuntimeException(); }
  /**
   * Compression codec to use. By default snappy compression.
   * Acceptable values are defined in {@link shortOrcCompressionCodecNames}.
   * @return (undocumented)
   */
  public  java.lang.String compressionCodec ()  { throw new RuntimeException(); }
}
