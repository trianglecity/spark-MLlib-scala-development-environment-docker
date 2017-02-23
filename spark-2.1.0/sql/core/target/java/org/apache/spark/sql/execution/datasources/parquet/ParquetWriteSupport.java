package org.apache.spark.sql.execution.datasources.parquet;
/**
 * A Parquet {@link WriteSupport} implementation that writes Catalyst {@link InternalRow}s as Parquet
 * messages.  This class can write Parquet data in two modes:
 * <p>
 *  - Standard mode: Parquet data are written in standard format defined in parquet-format spec.
 *  - Legacy mode: Parquet data are written in legacy format compatible with Spark 1.4 and prior.
 * <p>
 * This behavior can be controlled by SQL option <code>spark.sql.parquet.writeLegacyFormat</code>.  The value
 * of this option is propagated to this class by the <code>init()</code> method and its Hadoop configuration
 * argument.
 */
  class ParquetWriteSupport extends org.apache.parquet.hadoop.api.WriteSupport<org.apache.spark.sql.catalyst.InternalRow> implements org.apache.spark.internal.Logging {
  static public  java.lang.String SPARK_ROW_SCHEMA ()  { throw new RuntimeException(); }
  static public  void setSchema (org.apache.spark.sql.types.StructType schema, org.apache.hadoop.conf.Configuration configuration)  { throw new RuntimeException(); }
  static public  org.apache.parquet.hadoop.api.WriteSupport.FinalizedWriteContext finalizeWrite ()  { throw new RuntimeException(); }
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
  public   ParquetWriteSupport ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.types.StructType schema ()  { throw new RuntimeException(); }
  private  scala.collection.Seq<scala.Function2<org.apache.spark.sql.catalyst.expressions.SpecializedGetters, java.lang.Object, scala.runtime.BoxedUnit>> rootFieldWriters ()  { throw new RuntimeException(); }
  private  org.apache.parquet.io.api.RecordConsumer recordConsumer ()  { throw new RuntimeException(); }
  private  boolean writeLegacyParquetFormat ()  { throw new RuntimeException(); }
  private  byte[] timestampBuffer ()  { throw new RuntimeException(); }
  private  byte[] decimalBuffer ()  { throw new RuntimeException(); }
  public  org.apache.parquet.hadoop.api.WriteSupport.WriteContext init (org.apache.hadoop.conf.Configuration configuration)  { throw new RuntimeException(); }
  public  void prepareForWrite (org.apache.parquet.io.api.RecordConsumer recordConsumer)  { throw new RuntimeException(); }
  public  void write (org.apache.spark.sql.catalyst.InternalRow row)  { throw new RuntimeException(); }
  private  void writeFields (org.apache.spark.sql.catalyst.InternalRow row, org.apache.spark.sql.types.StructType schema, scala.collection.Seq<scala.Function2<org.apache.spark.sql.catalyst.expressions.SpecializedGetters, java.lang.Object, scala.runtime.BoxedUnit>> fieldWriters)  { throw new RuntimeException(); }
  private  scala.Function2<org.apache.spark.sql.catalyst.expressions.SpecializedGetters, java.lang.Object, scala.runtime.BoxedUnit> makeWriter (org.apache.spark.sql.types.DataType dataType)  { throw new RuntimeException(); }
  private  scala.Function2<org.apache.spark.sql.catalyst.expressions.SpecializedGetters, java.lang.Object, scala.runtime.BoxedUnit> makeDecimalWriter (int precision, int scale)  { throw new RuntimeException(); }
  public  scala.Function2<org.apache.spark.sql.catalyst.expressions.SpecializedGetters, java.lang.Object, scala.runtime.BoxedUnit> makeArrayWriter (org.apache.spark.sql.types.ArrayType arrayType)  { throw new RuntimeException(); }
  private  scala.Function2<org.apache.spark.sql.catalyst.expressions.SpecializedGetters, java.lang.Object, scala.runtime.BoxedUnit> makeMapWriter (org.apache.spark.sql.types.MapType mapType)  { throw new RuntimeException(); }
  private  void consumeMessage (scala.Function0<scala.runtime.BoxedUnit> f)  { throw new RuntimeException(); }
  private  void consumeGroup (scala.Function0<scala.runtime.BoxedUnit> f)  { throw new RuntimeException(); }
  private  void consumeField (java.lang.String field, int index, scala.Function0<scala.runtime.BoxedUnit> f)  { throw new RuntimeException(); }
}
