package org.apache.spark.sql.execution.datasources.parquet;
/**
 * This converter class is used to convert Parquet {@link MessageType} to Spark SQL {@link StructType} and
 * vice versa.
 * <p>
 * Parquet format backwards-compatibility rules are respected when converting Parquet
 * {@link MessageType} schemas.
 * <p>
 * @see https://github.com/apache/parquet-format/blob/master/LogicalTypes.md
 * @constructor
 * param:  assumeBinaryIsString Whether unannotated BINARY fields should be assumed to be Spark SQL
 *        {@link StringType} fields when converting Parquet a {@link MessageType} to Spark SQL
 *        {@link StructType}.  This argument only affects Parquet read path.
 * param:  assumeInt96IsTimestamp Whether unannotated INT96 fields should be assumed to be Spark SQL
 *        {@link TimestampType} fields when converting Parquet a {@link MessageType} to Spark SQL
 *        {@link StructType}.  Note that Spark SQL {@link TimestampType} is similar to Hive timestamp, which
 *        has optional nanosecond precision, but different from <code>TIME_MILLS</code> and <code>TIMESTAMP_MILLIS</code>
 *        described in Parquet format spec.  This argument only affects Parquet read path.
 * param:  writeLegacyParquetFormat Whether to use legacy Parquet format compatible with Spark 1.4
 *        and prior versions when converting a Catalyst {@link StructType} to a Parquet {@link MessageType}.
 *        When set to false, use standard format defined in parquet-format spec.  This argument only
 *        affects Parquet write path.
 */
  class ParquetSchemaConverter {
  static public  java.lang.String SPARK_PARQUET_SCHEMA_NAME ()  { throw new RuntimeException(); }
  static public  org.apache.parquet.schema.MessageType EMPTY_MESSAGE ()  { throw new RuntimeException(); }
  static public  void checkFieldName (java.lang.String name)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.types.StructType checkFieldNames (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  static public  void checkConversionRequirement (scala.Function0<java.lang.Object> f, java.lang.String message)  { throw new RuntimeException(); }
  static private  int computeMinBytesForPrecision (int precision)  { throw new RuntimeException(); }
  static public  int[] minBytesForPrecision ()  { throw new RuntimeException(); }
  static public  int maxPrecisionForBytes (int numBytes)  { throw new RuntimeException(); }
  public   ParquetSchemaConverter (boolean assumeBinaryIsString, boolean assumeInt96IsTimestamp, boolean writeLegacyParquetFormat)  { throw new RuntimeException(); }
  public   ParquetSchemaConverter (org.apache.spark.sql.internal.SQLConf conf)  { throw new RuntimeException(); }
  public   ParquetSchemaConverter (org.apache.hadoop.conf.Configuration conf)  { throw new RuntimeException(); }
  /**
   * Converts Parquet {@link MessageType} <code>parquetSchema</code> to a Spark SQL {@link StructType}.
   * @param parquetSchema (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.types.StructType convert (org.apache.parquet.schema.MessageType parquetSchema)  { throw new RuntimeException(); }
  private  org.apache.spark.sql.types.StructType convert (org.apache.parquet.schema.GroupType parquetSchema)  { throw new RuntimeException(); }
  /**
   * Converts a Parquet {@link Type} to a Spark SQL {@link DataType}.
   * @param parquetType (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.types.DataType convertField (org.apache.parquet.schema.Type parquetType)  { throw new RuntimeException(); }
  private  org.apache.spark.sql.types.DataType convertPrimitiveField (org.apache.parquet.schema.PrimitiveType field)  { throw new RuntimeException(); }
  private  org.apache.spark.sql.types.DataType convertGroupField (org.apache.parquet.schema.GroupType field)  { throw new RuntimeException(); }
  private  boolean isElementType (org.apache.parquet.schema.Type repeatedType, java.lang.String parentName)  { throw new RuntimeException(); }
  /**
   * Converts a Spark SQL {@link StructType} to a Parquet {@link MessageType}.
   * @param catalystSchema (undocumented)
   * @return (undocumented)
   */
  public  org.apache.parquet.schema.MessageType convert (org.apache.spark.sql.types.StructType catalystSchema)  { throw new RuntimeException(); }
  /**
   * Converts a Spark SQL {@link StructField} to a Parquet {@link Type}.
   * @param field (undocumented)
   * @return (undocumented)
   */
  public  org.apache.parquet.schema.Type convertField (org.apache.spark.sql.types.StructField field)  { throw new RuntimeException(); }
  private  org.apache.parquet.schema.Type convertField (org.apache.spark.sql.types.StructField field, org.apache.parquet.schema.Type.Repetition repetition)  { throw new RuntimeException(); }
}
