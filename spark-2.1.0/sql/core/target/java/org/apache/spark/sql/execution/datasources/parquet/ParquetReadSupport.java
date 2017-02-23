package org.apache.spark.sql.execution.datasources.parquet;
/**
 * A Parquet {@link ReadSupport} implementation for reading Parquet records as Catalyst
 * {@link UnsafeRow}s.
 * <p>
 * The API interface of {@link ReadSupport} is a little bit over complicated because of historical
 * reasons.  In older versions of parquet-mr (say 1.6.0rc3 and prior), {@link ReadSupport} need to be
 * instantiated and initialized twice on both driver side and executor side.  The {@link init()} method
 * is for driver side initialization, while {@link prepareForRead()} is for executor side.  However,
 * starting from parquet-mr 1.6.0, it's no longer the case, and {@link ReadSupport} is only instantiated
 * and initialized on executor side.  So, theoretically, now it's totally fine to combine these two
 * methods into a single initialization method.  The only reason (I could think of) to still have
 * them here is for parquet-mr API backwards-compatibility.
 * <p>
 * Due to this reason, we no longer rely on {@link ReadContext} to pass requested schema from {@link init()}
 * to {@link prepareForRead()}, but use a private <code>var</code> for simplicity.
 */
  class ParquetReadSupport extends org.apache.parquet.hadoop.api.ReadSupport<org.apache.spark.sql.catalyst.expressions.UnsafeRow> implements org.apache.spark.internal.Logging {
  static public  java.lang.String SPARK_ROW_REQUESTED_SCHEMA ()  { throw new RuntimeException(); }
  static public  java.lang.String SPARK_METADATA_KEY ()  { throw new RuntimeException(); }
  /**
   * Tailors <code>parquetSchema</code> according to <code>catalystSchema</code> by removing column paths don't exist
   * in <code>catalystSchema</code>, and adding those only exist in <code>catalystSchema</code>.
   * @param parquetSchema (undocumented)
   * @param catalystSchema (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.parquet.schema.MessageType clipParquetSchema (org.apache.parquet.schema.MessageType parquetSchema, org.apache.spark.sql.types.StructType catalystSchema)  { throw new RuntimeException(); }
  static private  org.apache.parquet.schema.Type clipParquetType (org.apache.parquet.schema.Type parquetType, org.apache.spark.sql.types.DataType catalystType)  { throw new RuntimeException(); }
  /**
   * Whether a Catalyst {@link DataType} is primitive.  Primitive {@link DataType} is not equivalent to
   * {@link AtomicType}.  For example, {@link CalendarIntervalType} is primitive, but it's not an
   * {@link AtomicType}.
   * @param dataType (undocumented)
   * @return (undocumented)
   */
  static private  boolean isPrimitiveCatalystType (org.apache.spark.sql.types.DataType dataType)  { throw new RuntimeException(); }
  /**
   * Clips a Parquet {@link GroupType} which corresponds to a Catalyst {@link ArrayType}.  The element type
   * of the {@link ArrayType} should also be a nested type, namely an {@link ArrayType}, a {@link MapType}, or a
   * {@link StructType}.
   * @param parquetList (undocumented)
   * @param elementType (undocumented)
   * @return (undocumented)
   */
  static private  org.apache.parquet.schema.Type clipParquetListType (org.apache.parquet.schema.GroupType parquetList, org.apache.spark.sql.types.DataType elementType)  { throw new RuntimeException(); }
  /**
   * Clips a Parquet {@link GroupType} which corresponds to a Catalyst {@link MapType}.  Either key type or
   * value type of the {@link MapType} must be a nested type, namely an {@link ArrayType}, a {@link MapType}, or
   * a {@link StructType}.
   * @param parquetMap (undocumented)
   * @param keyType (undocumented)
   * @param valueType (undocumented)
   * @return (undocumented)
   */
  static private  org.apache.parquet.schema.GroupType clipParquetMapType (org.apache.parquet.schema.GroupType parquetMap, org.apache.spark.sql.types.DataType keyType, org.apache.spark.sql.types.DataType valueType)  { throw new RuntimeException(); }
  /**
   * Clips a Parquet {@link GroupType} which corresponds to a Catalyst {@link StructType}.
   * <p>
   * @return A clipped {@link GroupType}, which has at least one field.
   * @note Parquet doesn't allow creating empty {@link GroupType} instances except for empty
   *       {@link MessageType}.  Because it's legal to construct an empty requested schema for column
   *       pruning.
   * @param parquetRecord (undocumented)
   * @param structType (undocumented)
   */
  static private  org.apache.parquet.schema.GroupType clipParquetGroup (org.apache.parquet.schema.GroupType parquetRecord, org.apache.spark.sql.types.StructType structType)  { throw new RuntimeException(); }
  /**
   * Clips a Parquet {@link GroupType} which corresponds to a Catalyst {@link StructType}.
   * <p>
   * @return A list of clipped {@link GroupType} fields, which can be empty.
   * @param parquetRecord (undocumented)
   * @param structType (undocumented)
   */
  static private  scala.collection.Seq<org.apache.parquet.schema.Type> clipParquetGroupFields (org.apache.parquet.schema.GroupType parquetRecord, org.apache.spark.sql.types.StructType structType)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.types.StructType expandUDT (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
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
  public   ParquetReadSupport ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.types.StructType catalystRequestedSchema ()  { throw new RuntimeException(); }
  /**
   * Called on executor side before {@link prepareForRead()} and instantiating actual Parquet record
   * readers.  Responsible for figuring out Parquet requested schema used for column pruning.
   * @param context (undocumented)
   * @return (undocumented)
   */
  public  org.apache.parquet.hadoop.api.ReadSupport.ReadContext init (org.apache.parquet.hadoop.api.InitContext context)  { throw new RuntimeException(); }
  /**
   * Called on executor side after {@link init()}, before instantiating actual Parquet record readers.
   * Responsible for instantiating {@link RecordMaterializer}, which is used for converting Parquet
   * records to Catalyst {@link UnsafeRow}s.
   * @param conf (undocumented)
   * @param keyValueMetaData (undocumented)
   * @param fileSchema (undocumented)
   * @param readContext (undocumented)
   * @return (undocumented)
   */
  public  org.apache.parquet.io.api.RecordMaterializer<org.apache.spark.sql.catalyst.expressions.UnsafeRow> prepareForRead (org.apache.hadoop.conf.Configuration conf, java.util.Map<java.lang.String, java.lang.String> keyValueMetaData, org.apache.parquet.schema.MessageType fileSchema, org.apache.parquet.hadoop.api.ReadSupport.ReadContext readContext)  { throw new RuntimeException(); }
}
