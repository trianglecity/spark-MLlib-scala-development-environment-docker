package org.apache.spark.sql.streaming;
/**
 * Interface used to load a streaming <code>Dataset</code> from external storage systems (e.g. file systems,
 * key-value stores, etc). Use <code>SparkSession.readStream</code> to access this.
 * <p>
 * @since 2.0.0
 */
public final class DataStreamReader implements org.apache.spark.internal.Logging {
     DataStreamReader (org.apache.spark.sql.SparkSession sparkSession)  { throw new RuntimeException(); }
  /**
   * Specifies the input data source format.
   * <p>
   * @since 2.0.0
   * @param source (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.streaming.DataStreamReader format (java.lang.String source)  { throw new RuntimeException(); }
  /**
   * Specifies the input schema. Some data sources (e.g. JSON) can infer the input schema
   * automatically from data. By specifying the schema here, the underlying data source can
   * skip the schema inference step, and thus speed up data loading.
   * <p>
   * @since 2.0.0
   * @param schema (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.streaming.DataStreamReader schema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  /**
   * Adds an input option for the underlying data source.
   * <p>
   * @since 2.0.0
   * @param key (undocumented)
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.streaming.DataStreamReader option (java.lang.String key, java.lang.String value)  { throw new RuntimeException(); }
  /**
   * Adds an input option for the underlying data source.
   * <p>
   * @since 2.0.0
   * @param key (undocumented)
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.streaming.DataStreamReader option (java.lang.String key, boolean value)  { throw new RuntimeException(); }
  /**
   * Adds an input option for the underlying data source.
   * <p>
   * @since 2.0.0
   * @param key (undocumented)
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.streaming.DataStreamReader option (java.lang.String key, long value)  { throw new RuntimeException(); }
  /**
   * Adds an input option for the underlying data source.
   * <p>
   * @since 2.0.0
   * @param key (undocumented)
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.streaming.DataStreamReader option (java.lang.String key, double value)  { throw new RuntimeException(); }
  /**
   * (Scala-specific) Adds input options for the underlying data source.
   * <p>
   * @since 2.0.0
   * @param options (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.streaming.DataStreamReader options (scala.collection.Map<java.lang.String, java.lang.String> options)  { throw new RuntimeException(); }
  /**
   * Adds input options for the underlying data source.
   * <p>
   * @since 2.0.0
   * @param options (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.streaming.DataStreamReader options (java.util.Map<java.lang.String, java.lang.String> options)  { throw new RuntimeException(); }
  /**
   * Loads input data stream in as a <code>DataFrame</code>, for data streams that don't require a path
   * (e.g. external key-value stores).
   * <p>
   * @since 2.0.0
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> load ()  { throw new RuntimeException(); }
  /**
   * Loads input in as a <code>DataFrame</code>, for data streams that read from some path.
   * <p>
   * @since 2.0.0
   * @param path (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> load (java.lang.String path)  { throw new RuntimeException(); }
  /**
   * Loads a JSON file stream (<a href="http://jsonlines.org/">JSON Lines text format or
   * newline-delimited JSON</a>) and returns the result as a <code>DataFrame</code>.
   * <p>
   * This function goes through the input once to determine the input schema. If you know the
   * schema in advance, use the version that specifies the schema to avoid the extra scan.
   * <p>
   * You can set the following JSON-specific options to deal with non-standard JSON files:
   * <ul>
   * <li><code>maxFilesPerTrigger</code> (default: no max limit): sets the maximum number of new files to be
   * considered in every trigger.</li>
   * <li><code>primitivesAsString</code> (default <code>false</code>): infers all primitive values as a string type</li>
   * <li><code>prefersDecimal</code> (default <code>false</code>): infers all floating-point values as a decimal
   * type. If the values do not fit in decimal, then it infers them as doubles.</li>
   * <li><code>allowComments</code> (default <code>false</code>): ignores Java/C++ style comment in JSON records</li>
   * <li><code>allowUnquotedFieldNames</code> (default <code>false</code>): allows unquoted JSON field names</li>
   * <li><code>allowSingleQuotes</code> (default <code>true</code>): allows single quotes in addition to double quotes
   * </li>
   * <li><code>allowNumericLeadingZeros</code> (default <code>false</code>): allows leading zeros in numbers
   * (e.g. 00012)</li>
   * <li><code>allowBackslashEscapingAnyCharacter</code> (default <code>false</code>): allows accepting quoting of all
   * character using backslash quoting mechanism</li>
   * <li><code>mode</code> (default <code>PERMISSIVE</code>): allows a mode for dealing with corrupt records
   * during parsing.
   *   <ul>
   *     <li><code>PERMISSIVE</code> : sets other fields to <code>null</code> when it meets a corrupted record, and puts
   *     the malformed string into a new field configured by <code>columnNameOfCorruptRecord</code>. When
   *     a schema is set by user, it sets <code>null</code> for extra fields.</li>
   *     <li><code>DROPMALFORMED</code> : ignores the whole corrupted records.</li>
   *     <li><code>FAILFAST</code> : throws an exception when it meets corrupted records.</li>
   *   </ul>
   * </li>
   * <li><code>columnNameOfCorruptRecord</code> (default is the value specified in
   * <code>spark.sql.columnNameOfCorruptRecord</code>): allows renaming the new field having malformed string
   * created by <code>PERMISSIVE</code> mode. This overrides <code>spark.sql.columnNameOfCorruptRecord</code>.</li>
   * <li><code>dateFormat</code> (default <code>yyyy-MM-dd</code>): sets the string that indicates a date format.
   * Custom date formats follow the formats at <code>java.text.SimpleDateFormat</code>. This applies to
   * date type.</li>
   * <li><code>timestampFormat</code> (default <code>yyyy-MM-dd'T'HH:mm:ss.SSSZZ</code>): sets the string that
   * indicates a timestamp format. Custom date formats follow the formats at
   * <code>java.text.SimpleDateFormat</code>. This applies to timestamp type.</li>
   * </ul>
   * <p>
   * @since 2.0.0
   * @param path (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> json (java.lang.String path)  { throw new RuntimeException(); }
  /**
   * Loads a CSV file stream and returns the result as a <code>DataFrame</code>.
   * <p>
   * This function will go through the input once to determine the input schema if <code>inferSchema</code>
   * is enabled. To avoid going through the entire data once, disable <code>inferSchema</code> option or
   * specify the schema explicitly using {@link schema}.
   * <p>
   * You can set the following CSV-specific options to deal with CSV files:
   * <ul>
   * <li><code>maxFilesPerTrigger</code> (default: no max limit): sets the maximum number of new files to be
   * considered in every trigger.</li>
   * <li><code>sep</code> (default <code>,</code>): sets the single character as a separator for each
   * field and value.</li>
   * <li><code>encoding</code> (default <code>UTF-8</code>): decodes the CSV files by the given encoding
   * type.</li>
   * <li><code>quote</code> (default <code>"</code>): sets the single character used for escaping quoted values where
   * the separator can be part of the value. If you would like to turn off quotations, you need to
   * set not <code>null</code> but an empty string. This behaviour is different form
   * <code>com.databricks.spark.csv</code>.</li>
   * <li><code>escape</code> (default <code>\</code>): sets the single character used for escaping quotes inside
   * an already quoted value.</li>
   * <li><code>comment</code> (default empty string): sets the single character used for skipping lines
   * beginning with this character. By default, it is disabled.</li>
   * <li><code>header</code> (default <code>false</code>): uses the first line as names of columns.</li>
   * <li><code>inferSchema</code> (default <code>false</code>): infers the input schema automatically from data. It
   * requires one extra pass over the data.</li>
   * <li><code>ignoreLeadingWhiteSpace</code> (default <code>false</code>): defines whether or not leading whitespaces
   * from values being read should be skipped.</li>
   * <li><code>ignoreTrailingWhiteSpace</code> (default <code>false</code>): defines whether or not trailing
   * whitespaces from values being read should be skipped.</li>
   * <li><code>nullValue</code> (default empty string): sets the string representation of a null value. Since
   * 2.0.1, this applies to all supported types including the string type.</li>
   * <li><code>nanValue</code> (default <code>NaN</code>): sets the string representation of a non-number" value.</li>
   * <li><code>positiveInf</code> (default <code>Inf</code>): sets the string representation of a positive infinity
   * value.</li>
   * <li><code>negativeInf</code> (default <code>-Inf</code>): sets the string representation of a negative infinity
   * value.</li>
   * <li><code>dateFormat</code> (default <code>yyyy-MM-dd</code>): sets the string that indicates a date format.
   * Custom date formats follow the formats at <code>java.text.SimpleDateFormat</code>. This applies to
   * date type.</li>
   * <li><code>timestampFormat</code> (default <code>yyyy-MM-dd'T'HH:mm:ss.SSSZZ</code>): sets the string that
   * indicates a timestamp format. Custom date formats follow the formats at
   * <code>java.text.SimpleDateFormat</code>. This applies to timestamp type.</li>
   * <li><code>maxColumns</code> (default <code>20480</code>): defines a hard limit of how many columns
   * a record can have.</li>
   * <li><code>maxCharsPerColumn</code> (default <code>-1</code>): defines the maximum number of characters allowed
   * for any given value being read. By default, it is -1 meaning unlimited length</li>
   * <li><code>mode</code> (default <code>PERMISSIVE</code>): allows a mode for dealing with corrupt records
   *    during parsing.
   *   <ul>
   *     <li><code>PERMISSIVE</code> : sets other fields to <code>null</code> when it meets a corrupted record. When
   *       a schema is set by user, it sets <code>null</code> for extra fields.</li>
   *     <li><code>DROPMALFORMED</code> : ignores the whole corrupted records.</li>
   *     <li><code>FAILFAST</code> : throws an exception when it meets corrupted records.</li>
   *   </ul>
   * </li>
   * </ul>
   * <p>
   * @since 2.0.0
   * @param path (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> csv (java.lang.String path)  { throw new RuntimeException(); }
  /**
   * Loads a Parquet file stream, returning the result as a <code>DataFrame</code>.
   * <p>
   * You can set the following Parquet-specific option(s) for reading Parquet files:
   * <ul>
   * <li><code>maxFilesPerTrigger</code> (default: no max limit): sets the maximum number of new files to be
   * considered in every trigger.</li>
   * <li><code>mergeSchema</code> (default is the value specified in <code>spark.sql.parquet.mergeSchema</code>): sets
   * whether we should merge schemas collected from all
   * Parquet part-files. This will override
   * <code>spark.sql.parquet.mergeSchema</code>.</li>
   * </ul>
   * <p>
   * @since 2.0.0
   * @param path (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> parquet (java.lang.String path)  { throw new RuntimeException(); }
  /**
   * Loads text files and returns a <code>DataFrame</code> whose schema starts with a string column named
   * "value", and followed by partitioned columns if there are any.
   * <p>
   * Each line in the text files is a new row in the resulting DataFrame. For example:
   * <pre><code>
   *   // Scala:
   *   spark.readStream.text("/path/to/directory/")
   *
   *   // Java:
   *   spark.readStream().text("/path/to/directory/")
   * </code></pre>
   * <p>
   * You can set the following text-specific options to deal with text files:
   * <ul>
   * <li><code>maxFilesPerTrigger</code> (default: no max limit): sets the maximum number of new files to be
   * considered in every trigger.</li>
   * </ul>
   * <p>
   * @since 2.0.0
   * @param path (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> text (java.lang.String path)  { throw new RuntimeException(); }
  /**
   * Loads text file(s) and returns a <code>Dataset</code> of String. The underlying schema of the Dataset
   * contains a single string column named "value".
   * <p>
   * If the directory structure of the text files contains partitioning information, those are
   * ignored in the resulting Dataset. To include partitioning information as columns, use <code>text</code>.
   * <p>
   * Each line in the text file is a new element in the resulting Dataset. For example:
   * <pre><code>
   *   // Scala:
   *   spark.readStream.textFile("/path/to/spark/README.md")
   *
   *   // Java:
   *   spark.readStream().textFile("/path/to/spark/README.md")
   * </code></pre>
   * <p>
   * You can set the following text-specific options to deal with text files:
   * <ul>
   * <li><code>maxFilesPerTrigger</code> (default: no max limit): sets the maximum number of new files to be
   * considered in every trigger.</li>
   * </ul>
   * <p>
   * @param path input path
   * @since 2.1.0
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<java.lang.String> textFile (java.lang.String path)  { throw new RuntimeException(); }
  private  java.lang.String source ()  { throw new RuntimeException(); }
  private  scala.Option<org.apache.spark.sql.types.StructType> userSpecifiedSchema ()  { throw new RuntimeException(); }
  private  scala.collection.mutable.HashMap<java.lang.String, java.lang.String> extraOptions ()  { throw new RuntimeException(); }
}
