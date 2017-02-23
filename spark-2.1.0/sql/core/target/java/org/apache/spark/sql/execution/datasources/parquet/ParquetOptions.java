package org.apache.spark.sql.execution.datasources.parquet;
/**
 * Options for the Parquet data source.
 */
  class ParquetOptions implements scala.Serializable {
  static public  java.lang.String MERGE_SCHEMA ()  { throw new RuntimeException(); }
  static private  scala.collection.immutable.Map<java.lang.String, org.apache.parquet.hadoop.metadata.CompressionCodecName> shortParquetCompressionCodecNames ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.catalyst.util.CaseInsensitiveMap parameters ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.internal.SQLConf sqlConf ()  { throw new RuntimeException(); }
  // not preceding
  public   ParquetOptions (org.apache.spark.sql.catalyst.util.CaseInsensitiveMap parameters, org.apache.spark.sql.internal.SQLConf sqlConf)  { throw new RuntimeException(); }
  public   ParquetOptions (scala.collection.immutable.Map<java.lang.String, java.lang.String> parameters, org.apache.spark.sql.internal.SQLConf sqlConf)  { throw new RuntimeException(); }
  /**
   * Compression codec to use. By default use the value specified in SQLConf.
   * Acceptable values are defined in {@link shortParquetCompressionCodecNames}.
   * @return (undocumented)
   */
  public  java.lang.String compressionCodecClassName ()  { throw new RuntimeException(); }
  /**
   * Whether it merges schemas or not. When the given Parquet files have different schemas,
   * the schemas can be merged.  By default use the value specified in SQLConf.
   * @return (undocumented)
   */
  public  boolean mergeSchema ()  { throw new RuntimeException(); }
}
