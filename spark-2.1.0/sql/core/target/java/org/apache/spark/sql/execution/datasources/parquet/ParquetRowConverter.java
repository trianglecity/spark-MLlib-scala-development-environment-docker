package org.apache.spark.sql.execution.datasources.parquet;
/**
 * A {@link ParquetRowConverter} is used to convert Parquet records into Catalyst {@link InternalRow}s.
 * Since Catalyst <code>StructType</code> is also a Parquet record, this converter can be used as root
 * converter.  Take the following Parquet type as an example:
 * <pre><code>
 *   message root {
 *     required int32 f1;
 *     optional group f2 {
 *       required double f21;
 *       optional binary f22 (utf8);
 *     }
 *   }
 * </code></pre>
 * 5 converters will be created:
 * <p>
 * - a root {@link ParquetRowConverter} for {@link MessageType} <code>root</code>, which contains:
 *   - a {@link ParquetPrimitiveConverter} for required {@link INT_32} field <code>f1</code>, and
 *   - a nested {@link ParquetRowConverter} for optional {@link GroupType} <code>f2</code>, which contains:
 *     - a {@link ParquetPrimitiveConverter} for required {@link DOUBLE} field <code>f21</code>, and
 *     - a {@link ParquetStringConverter} for optional {@link UTF8} string field <code>f22</code>
 * <p>
 * When used as a root converter, {@link NoopUpdater} should be used since root converters don't have
 * any "parent" container.
 * <p>
 * param:  schemaConverter A utility converter used to convert Parquet types to Catalyst types.
 * param:  parquetType Parquet schema of Parquet records
 * param:  catalystType Spark SQL schema that corresponds to the Parquet record type. User-defined
 *        types should have been expanded.
 * param:  updater An updater which propagates converted field values to the parent container
 */
  class ParquetRowConverter extends org.apache.spark.sql.execution.datasources.parquet.ParquetGroupConverter implements org.apache.spark.internal.Logging {
  /**
   * Updater used together with field converters within a {@link ParquetRowConverter}.  It propagates
   * converted filed values to the <code>ordinal</code>-th cell in <code>currentRow</code>.
   */
  private final class RowUpdater implements org.apache.spark.sql.execution.datasources.parquet.ParentContainerUpdater {
    public   RowUpdater (org.apache.spark.sql.catalyst.InternalRow row, int ordinal)  { throw new RuntimeException(); }
    public  void set (Object value)  { throw new RuntimeException(); }
    public  void setBoolean (boolean value)  { throw new RuntimeException(); }
    public  void setByte (byte value)  { throw new RuntimeException(); }
    public  void setShort (short value)  { throw new RuntimeException(); }
    public  void setInt (int value)  { throw new RuntimeException(); }
    public  void setLong (long value)  { throw new RuntimeException(); }
    public  void setDouble (double value)  { throw new RuntimeException(); }
    public  void setFloat (float value)  { throw new RuntimeException(); }
  }
  /**
   * Parquet converter for strings. A dictionary is used to minimize string decoding cost.
   */
  private final class ParquetStringConverter extends org.apache.spark.sql.execution.datasources.parquet.ParquetPrimitiveConverter {
    public   ParquetStringConverter (org.apache.spark.sql.execution.datasources.parquet.ParentContainerUpdater updater)  { throw new RuntimeException(); }
    private  org.apache.spark.unsafe.types.UTF8String[] expandedDictionary ()  { throw new RuntimeException(); }
    public  boolean hasDictionarySupport ()  { throw new RuntimeException(); }
    public  void setDictionary (org.apache.parquet.column.Dictionary dictionary)  { throw new RuntimeException(); }
    public  void addValueFromDictionary (int dictionaryId)  { throw new RuntimeException(); }
    public  void addBinary (org.apache.parquet.io.api.Binary value)  { throw new RuntimeException(); }
  }
  /**
   * Parquet converter for fixed-precision decimals.
   */
  private abstract class ParquetDecimalConverter extends org.apache.spark.sql.execution.datasources.parquet.ParquetPrimitiveConverter {
    public   ParquetDecimalConverter (int precision, int scale, org.apache.spark.sql.execution.datasources.parquet.ParentContainerUpdater updater)  { throw new RuntimeException(); }
    protected  org.apache.spark.sql.types.Decimal[] expandedDictionary ()  { throw new RuntimeException(); }
    public  boolean hasDictionarySupport ()  { throw new RuntimeException(); }
    public  void addValueFromDictionary (int dictionaryId)  { throw new RuntimeException(); }
    public  void addInt (int value)  { throw new RuntimeException(); }
    public  void addLong (long value)  { throw new RuntimeException(); }
    public  void addBinary (org.apache.parquet.io.api.Binary value)  { throw new RuntimeException(); }
    protected  org.apache.spark.sql.types.Decimal decimalFromLong (long value)  { throw new RuntimeException(); }
    protected  org.apache.spark.sql.types.Decimal decimalFromBinary (org.apache.parquet.io.api.Binary value)  { throw new RuntimeException(); }
  }
  private  class ParquetIntDictionaryAwareDecimalConverter extends org.apache.spark.sql.execution.datasources.parquet.ParquetRowConverter.ParquetDecimalConverter {
    public   ParquetIntDictionaryAwareDecimalConverter (int precision, int scale, org.apache.spark.sql.execution.datasources.parquet.ParentContainerUpdater updater)  { throw new RuntimeException(); }
    public  void setDictionary (org.apache.parquet.column.Dictionary dictionary)  { throw new RuntimeException(); }
  }
  private  class ParquetLongDictionaryAwareDecimalConverter extends org.apache.spark.sql.execution.datasources.parquet.ParquetRowConverter.ParquetDecimalConverter {
    public   ParquetLongDictionaryAwareDecimalConverter (int precision, int scale, org.apache.spark.sql.execution.datasources.parquet.ParentContainerUpdater updater)  { throw new RuntimeException(); }
    public  void setDictionary (org.apache.parquet.column.Dictionary dictionary)  { throw new RuntimeException(); }
  }
  private  class ParquetBinaryDictionaryAwareDecimalConverter extends org.apache.spark.sql.execution.datasources.parquet.ParquetRowConverter.ParquetDecimalConverter {
    public   ParquetBinaryDictionaryAwareDecimalConverter (int precision, int scale, org.apache.spark.sql.execution.datasources.parquet.ParentContainerUpdater updater)  { throw new RuntimeException(); }
    public  void setDictionary (org.apache.parquet.column.Dictionary dictionary)  { throw new RuntimeException(); }
  }
  /**
   * Parquet converter for arrays.  Spark SQL arrays are represented as Parquet lists.  Standard
   * Parquet lists are represented as a 3-level group annotated by <code>LIST</code>:
   * <pre><code>
   *   &lt;list-repetition&gt; group &lt;name&gt; (LIST) {            &lt;-- parquetSchema points here
   *     repeated group list {
   *       &lt;element-repetition&gt; &lt;element-type&gt; element;
   *     }
   *   }
   * </code></pre>
   * The <code>parquetSchema</code> constructor argument points to the outermost group.
   * <p>
   * However, before this representation is standardized, some Parquet libraries/tools also use some
   * non-standard formats to represent list-like structures.  Backwards-compatibility rules for
   * handling these cases are described in Parquet format spec.
   * <p>
   * @see https://github.com/apache/parquet-format/blob/master/LogicalTypes.md#lists
   */
  private final class ParquetArrayConverter extends org.apache.spark.sql.execution.datasources.parquet.ParquetGroupConverter {
    public   ParquetArrayConverter (org.apache.parquet.schema.GroupType parquetSchema, org.apache.spark.sql.types.ArrayType catalystSchema, org.apache.spark.sql.execution.datasources.parquet.ParentContainerUpdater updater)  { throw new RuntimeException(); }
    private  scala.collection.mutable.ArrayBuffer<java.lang.Object> currentArray ()  { throw new RuntimeException(); }
    private  org.apache.parquet.io.api.Converter elementConverter ()  { throw new RuntimeException(); }
    public  org.apache.parquet.io.api.Converter getConverter (int fieldIndex)  { throw new RuntimeException(); }
    public  void end ()  { throw new RuntimeException(); }
    public  void start ()  { throw new RuntimeException(); }
    /** Array element converter */
    private final class ElementConverter extends org.apache.parquet.io.api.GroupConverter {
      public   ElementConverter (org.apache.parquet.schema.Type parquetType, org.apache.spark.sql.types.DataType catalystType)  { throw new RuntimeException(); }
      private  Object currentElement ()  { throw new RuntimeException(); }
      private  org.apache.parquet.io.api.Converter converter ()  { throw new RuntimeException(); }
      public  org.apache.parquet.io.api.Converter getConverter (int fieldIndex)  { throw new RuntimeException(); }
      public  void end ()  { throw new RuntimeException(); }
      public  void start ()  { throw new RuntimeException(); }
    }
  }
  /** Parquet converter for maps */
  private final class ParquetMapConverter extends org.apache.spark.sql.execution.datasources.parquet.ParquetGroupConverter {
    public   ParquetMapConverter (org.apache.parquet.schema.GroupType parquetType, org.apache.spark.sql.types.MapType catalystType, org.apache.spark.sql.execution.datasources.parquet.ParentContainerUpdater updater)  { throw new RuntimeException(); }
    private  scala.collection.mutable.ArrayBuffer<java.lang.Object> currentKeys ()  { throw new RuntimeException(); }
    private  scala.collection.mutable.ArrayBuffer<java.lang.Object> currentValues ()  { throw new RuntimeException(); }
    private  org.apache.spark.sql.execution.datasources.parquet.ParquetRowConverter.ParquetMapConverter.KeyValueConverter keyValueConverter ()  { throw new RuntimeException(); }
    public  org.apache.parquet.io.api.Converter getConverter (int fieldIndex)  { throw new RuntimeException(); }
    public  void end ()  { throw new RuntimeException(); }
    public  void start ()  { throw new RuntimeException(); }
    /** Parquet converter for key-value pairs within the map. */
    private final class KeyValueConverter extends org.apache.parquet.io.api.GroupConverter {
      public   KeyValueConverter (org.apache.parquet.schema.Type parquetKeyType, org.apache.parquet.schema.Type parquetValueType, org.apache.spark.sql.types.DataType catalystKeyType, org.apache.spark.sql.types.DataType catalystValueType)  { throw new RuntimeException(); }
      private  Object currentKey ()  { throw new RuntimeException(); }
      private  Object currentValue ()  { throw new RuntimeException(); }
      private  org.apache.parquet.io.api.Converter[] converters ()  { throw new RuntimeException(); }
      public  org.apache.parquet.io.api.Converter getConverter (int fieldIndex)  { throw new RuntimeException(); }
      public  void end ()  { throw new RuntimeException(); }
      public  void start ()  { throw new RuntimeException(); }
    }
  }
  private  interface RepeatedConverter {
    public  scala.collection.mutable.ArrayBuffer<java.lang.Object> currentArray ()  ;
    public  java.lang.Object newArrayUpdater (org.apache.spark.sql.execution.datasources.parquet.ParentContainerUpdater updater)  ;
  }
  /**
   * A primitive converter for converting unannotated repeated primitive values to required arrays
   * of required primitives values.
   */
  private final class RepeatedPrimitiveConverter extends org.apache.parquet.io.api.PrimitiveConverter implements org.apache.spark.sql.execution.datasources.parquet.ParquetRowConverter.RepeatedConverter, org.apache.spark.sql.execution.datasources.parquet.HasParentContainerUpdater {
    public   RepeatedPrimitiveConverter (org.apache.parquet.schema.Type parquetType, org.apache.spark.sql.types.DataType catalystType, org.apache.spark.sql.execution.datasources.parquet.ParentContainerUpdater parentUpdater)  { throw new RuntimeException(); }
    public  org.apache.spark.sql.execution.datasources.parquet.ParentContainerUpdater updater ()  { throw new RuntimeException(); }
    private  org.apache.parquet.io.api.PrimitiveConverter elementConverter ()  { throw new RuntimeException(); }
    public  void addBoolean (boolean value)  { throw new RuntimeException(); }
    public  void addInt (int value)  { throw new RuntimeException(); }
    public  void addLong (long value)  { throw new RuntimeException(); }
    public  void addFloat (float value)  { throw new RuntimeException(); }
    public  void addDouble (double value)  { throw new RuntimeException(); }
    public  void addBinary (org.apache.parquet.io.api.Binary value)  { throw new RuntimeException(); }
    public  void setDictionary (org.apache.parquet.column.Dictionary dict)  { throw new RuntimeException(); }
    public  boolean hasDictionarySupport ()  { throw new RuntimeException(); }
    public  void addValueFromDictionary (int id)  { throw new RuntimeException(); }
  }
  /**
   * A group converter for converting unannotated repeated group values to required arrays of
   * required struct values.
   */
  private final class RepeatedGroupConverter extends org.apache.parquet.io.api.GroupConverter implements org.apache.spark.sql.execution.datasources.parquet.HasParentContainerUpdater, org.apache.spark.sql.execution.datasources.parquet.ParquetRowConverter.RepeatedConverter {
    public   RepeatedGroupConverter (org.apache.parquet.schema.Type parquetType, org.apache.spark.sql.types.DataType catalystType, org.apache.spark.sql.execution.datasources.parquet.ParentContainerUpdater parentUpdater)  { throw new RuntimeException(); }
    public  org.apache.spark.sql.execution.datasources.parquet.ParentContainerUpdater updater ()  { throw new RuntimeException(); }
    private  org.apache.parquet.io.api.GroupConverter elementConverter ()  { throw new RuntimeException(); }
    public  org.apache.parquet.io.api.Converter getConverter (int field)  { throw new RuntimeException(); }
    public  void end ()  { throw new RuntimeException(); }
    public  void start ()  { throw new RuntimeException(); }
  }
  static public  long binaryToUnscaledLong (org.apache.parquet.io.api.Binary binary)  { throw new RuntimeException(); }
  static public  long binaryToSQLTimestamp (org.apache.parquet.io.api.Binary binary)  { throw new RuntimeException(); }
  static public  org.apache.parquet.io.api.PrimitiveConverter asPrimitiveConverter ()  { throw new RuntimeException(); }
  static public  boolean isPrimitive ()  { throw new RuntimeException(); }
  static public  org.apache.parquet.io.api.GroupConverter asGroupConverter ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.execution.datasources.parquet.ParentContainerUpdater updater ()  { throw new RuntimeException(); }
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
  public   ParquetRowConverter (org.apache.spark.sql.execution.datasources.parquet.ParquetSchemaConverter schemaConverter, org.apache.parquet.schema.GroupType parquetType, org.apache.spark.sql.types.StructType catalystType, org.apache.spark.sql.execution.datasources.parquet.ParentContainerUpdater updater)  { throw new RuntimeException(); }
  private  org.apache.spark.sql.catalyst.expressions.SpecificInternalRow currentRow ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.catalyst.expressions.UnsafeProjection unsafeProjection ()  { throw new RuntimeException(); }
  /**
   * The {@link UnsafeRow} converted from an entire Parquet record.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.expressions.UnsafeRow currentRecord ()  { throw new RuntimeException(); }
  private  org.apache.parquet.io.api.Converter[] fieldConverters ()  { throw new RuntimeException(); }
  public  org.apache.parquet.io.api.Converter getConverter (int fieldIndex)  { throw new RuntimeException(); }
  public  void end ()  { throw new RuntimeException(); }
  public  void start ()  { throw new RuntimeException(); }
  /**
   * Creates a converter for the given Parquet type <code>parquetType</code> and Spark SQL data type
   * <code>catalystType</code>. Converted values are handled by <code>updater</code>.
   * @param parquetType (undocumented)
   * @param catalystType (undocumented)
   * @param updater (undocumented)
   * @return (undocumented)
   */
  private  org.apache.parquet.io.api.Converter newConverter (org.apache.parquet.schema.Type parquetType, org.apache.spark.sql.types.DataType catalystType, org.apache.spark.sql.execution.datasources.parquet.ParentContainerUpdater updater)  { throw new RuntimeException(); }
}
