package org.apache.spark.sql.internal;
public  class SQLConf$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final SQLConf$ MODULE$ = null;
  public   SQLConf$ ()  { throw new RuntimeException(); }
  private  java.util.Map<java.lang.String, org.apache.spark.internal.config.ConfigEntry<?>> sqlConfEntries ()  { throw new RuntimeException(); }
    void register (org.apache.spark.internal.config.ConfigEntry<?> entry)  { throw new RuntimeException(); }
  public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> OPTIMIZER_MAX_ITERATIONS ()  { throw new RuntimeException(); }
  public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> OPTIMIZER_INSET_CONVERSION_THRESHOLD ()  { throw new RuntimeException(); }
  public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> COMPRESS_CACHED ()  { throw new RuntimeException(); }
  public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> COLUMN_BATCH_SIZE ()  { throw new RuntimeException(); }
  public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> IN_MEMORY_PARTITION_PRUNING ()  { throw new RuntimeException(); }
  public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> PREFER_SORTMERGEJOIN ()  { throw new RuntimeException(); }
  public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> RADIX_SORT_ENABLED ()  { throw new RuntimeException(); }
  public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> AUTO_BROADCASTJOIN_THRESHOLD ()  { throw new RuntimeException(); }
  public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> LIMIT_SCALE_UP_FACTOR ()  { throw new RuntimeException(); }
  public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> ENABLE_FALL_BACK_TO_HDFS_FOR_STATS ()  { throw new RuntimeException(); }
  public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> DEFAULT_SIZE_IN_BYTES ()  { throw new RuntimeException(); }
  public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> SHUFFLE_PARTITIONS ()  { throw new RuntimeException(); }
  public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> SHUFFLE_TARGET_POSTSHUFFLE_INPUT_SIZE ()  { throw new RuntimeException(); }
  public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> ADAPTIVE_EXECUTION_ENABLED ()  { throw new RuntimeException(); }
  public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> SHUFFLE_MIN_NUM_POSTSHUFFLE_PARTITIONS ()  { throw new RuntimeException(); }
  public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> SUBEXPRESSION_ELIMINATION_ENABLED ()  { throw new RuntimeException(); }
  public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> CASE_SENSITIVE ()  { throw new RuntimeException(); }
  public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> PARQUET_SCHEMA_MERGING_ENABLED ()  { throw new RuntimeException(); }
  public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> PARQUET_SCHEMA_RESPECT_SUMMARIES ()  { throw new RuntimeException(); }
  public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> PARQUET_BINARY_AS_STRING ()  { throw new RuntimeException(); }
  public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> PARQUET_INT96_AS_TIMESTAMP ()  { throw new RuntimeException(); }
  public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> PARQUET_CACHE_METADATA ()  { throw new RuntimeException(); }
  public  org.apache.spark.internal.config.ConfigEntry<java.lang.String> PARQUET_COMPRESSION ()  { throw new RuntimeException(); }
  public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> PARQUET_FILTER_PUSHDOWN_ENABLED ()  { throw new RuntimeException(); }
  public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> PARQUET_WRITE_LEGACY_FORMAT ()  { throw new RuntimeException(); }
  public  org.apache.spark.internal.config.ConfigEntry<java.lang.String> PARQUET_OUTPUT_COMMITTER_CLASS ()  { throw new RuntimeException(); }
  public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> PARQUET_VECTORIZED_READER_ENABLED ()  { throw new RuntimeException(); }
  public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> ORC_FILTER_PUSHDOWN_ENABLED ()  { throw new RuntimeException(); }
  public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> HIVE_VERIFY_PARTITION_PATH ()  { throw new RuntimeException(); }
  public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> HIVE_METASTORE_PARTITION_PRUNING ()  { throw new RuntimeException(); }
  public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> HIVE_MANAGE_FILESOURCE_PARTITIONS ()  { throw new RuntimeException(); }
  public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> HIVE_FILESOURCE_PARTITION_FILE_CACHE_SIZE ()  { throw new RuntimeException(); }
  public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> OPTIMIZER_METADATA_ONLY ()  { throw new RuntimeException(); }
  public  org.apache.spark.internal.config.ConfigEntry<java.lang.String> COLUMN_NAME_OF_CORRUPT_RECORD ()  { throw new RuntimeException(); }
  public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> BROADCAST_TIMEOUT ()  { throw new RuntimeException(); }
  public  org.apache.spark.internal.config.OptionalConfigEntry<java.lang.String> THRIFTSERVER_POOL ()  { throw new RuntimeException(); }
  public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> THRIFTSERVER_UI_STATEMENT_LIMIT ()  { throw new RuntimeException(); }
  public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> THRIFTSERVER_UI_SESSION_LIMIT ()  { throw new RuntimeException(); }
  public  org.apache.spark.internal.config.ConfigEntry<java.lang.String> DEFAULT_DATA_SOURCE_NAME ()  { throw new RuntimeException(); }
  public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> CONVERT_CTAS ()  { throw new RuntimeException(); }
  public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> GATHER_FASTSTAT ()  { throw new RuntimeException(); }
  public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> PARTITION_COLUMN_TYPE_INFERENCE ()  { throw new RuntimeException(); }
  public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> BUCKETING_ENABLED ()  { throw new RuntimeException(); }
  public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> CROSS_JOINS_ENABLED ()  { throw new RuntimeException(); }
  public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> ORDER_BY_ORDINAL ()  { throw new RuntimeException(); }
  public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> GROUP_BY_ORDINAL ()  { throw new RuntimeException(); }
  public  org.apache.spark.internal.config.OptionalConfigEntry<java.lang.String> OUTPUT_COMMITTER_CLASS ()  { throw new RuntimeException(); }
  public  org.apache.spark.internal.config.ConfigEntry<java.lang.String> FILE_COMMIT_PROTOCOL_CLASS ()  { throw new RuntimeException(); }
  public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> PARALLEL_PARTITION_DISCOVERY_THRESHOLD ()  { throw new RuntimeException(); }
  public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> DATAFRAME_SELF_JOIN_AUTO_RESOLVE_AMBIGUITY ()  { throw new RuntimeException(); }
  public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> DATAFRAME_RETAIN_GROUP_COLUMNS ()  { throw new RuntimeException(); }
  public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> DATAFRAME_PIVOT_MAX_VALUES ()  { throw new RuntimeException(); }
  public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> RUN_SQL_ON_FILES ()  { throw new RuntimeException(); }
  public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> WHOLESTAGE_CODEGEN_ENABLED ()  { throw new RuntimeException(); }
  public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> WHOLESTAGE_MAX_NUM_FIELDS ()  { throw new RuntimeException(); }
  public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> WHOLESTAGE_FALLBACK ()  { throw new RuntimeException(); }
  public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> MAX_CASES_BRANCHES ()  { throw new RuntimeException(); }
  public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> FILES_MAX_PARTITION_BYTES ()  { throw new RuntimeException(); }
  public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> FILES_OPEN_COST_IN_BYTES ()  { throw new RuntimeException(); }
  public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> EXCHANGE_REUSE_ENABLED ()  { throw new RuntimeException(); }
  public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> STATE_STORE_MIN_DELTAS_FOR_SNAPSHOT ()  { throw new RuntimeException(); }
  public  org.apache.spark.internal.config.OptionalConfigEntry<java.lang.String> CHECKPOINT_LOCATION ()  { throw new RuntimeException(); }
  public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> MIN_BATCHES_TO_RETAIN ()  { throw new RuntimeException(); }
  public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> UNSUPPORTED_OPERATION_CHECK_ENABLED ()  { throw new RuntimeException(); }
  public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> VARIABLE_SUBSTITUTE_ENABLED ()  { throw new RuntimeException(); }
  public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> VARIABLE_SUBSTITUTE_DEPTH ()  { throw new RuntimeException(); }
  public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> ENABLE_TWOLEVEL_AGG_MAP ()  { throw new RuntimeException(); }
  public  org.apache.spark.internal.config.ConfigEntry<java.lang.String> STREAMING_FILE_COMMIT_PROTOCOL_CLASS ()  { throw new RuntimeException(); }
  public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> FILE_SINK_LOG_DELETION ()  { throw new RuntimeException(); }
  public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> FILE_SINK_LOG_COMPACT_INTERVAL ()  { throw new RuntimeException(); }
  public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> FILE_SINK_LOG_CLEANUP_DELAY ()  { throw new RuntimeException(); }
  public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> FILE_SOURCE_LOG_DELETION ()  { throw new RuntimeException(); }
  public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> FILE_SOURCE_LOG_COMPACT_INTERVAL ()  { throw new RuntimeException(); }
  public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> FILE_SOURCE_LOG_CLEANUP_DELAY ()  { throw new RuntimeException(); }
  public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> STREAMING_SCHEMA_INFERENCE ()  { throw new RuntimeException(); }
  public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> STREAMING_POLLING_DELAY ()  { throw new RuntimeException(); }
  public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> STREAMING_NO_DATA_PROGRESS_EVENT_INTERVAL ()  { throw new RuntimeException(); }
  public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> STREAMING_METRICS_ENABLED ()  { throw new RuntimeException(); }
  public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> STREAMING_PROGRESS_RETENTION ()  { throw new RuntimeException(); }
  public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> NDV_MAX_ERROR ()  { throw new RuntimeException(); }
  public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> IGNORE_CORRUPT_FILES ()  { throw new RuntimeException(); }
}
