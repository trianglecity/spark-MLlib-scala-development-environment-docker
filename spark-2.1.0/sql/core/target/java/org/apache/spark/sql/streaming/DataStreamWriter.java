package org.apache.spark.sql.streaming;
/**
 * :: Experimental ::
 * Interface used to write a streaming <code>Dataset</code> to external storage systems (e.g. file systems,
 * key-value stores, etc). Use <code>Dataset.writeStream</code> to access this.
 * <p>
 * @since 2.0.0
 */
public final class DataStreamWriter<T extends java.lang.Object> {
  /**
   * Partitions the output by the given columns on the file system. If specified, the output is
   * laid out on the file system similar to Hive's partitioning scheme. As an example, when we
   * partition a dataset by year and then month, the directory layout would look like:
   * <p>
   *   - year=2016/month=01/
   *   - year=2016/month=02/
   * <p>
   * Partitioning is one of the most widely used techniques to optimize physical data layout.
   * It provides a coarse-grained index for skipping unnecessary data reads when queries have
   * predicates on the partitioned columns. In order for partitioning to work well, the number
   * of distinct values in each column should typically be less than tens of thousands.
   * <p>
   * This was initially applicable for Parquet but in 1.5+ covers JSON, text, ORC and avro as well.
   * <p>
   * @since 1.4.0
   * @param colNames (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.streaming.DataStreamWriter<T> partitionBy (java.lang.String... colNames)  { throw new RuntimeException(); }
  // not preceding
     DataStreamWriter (org.apache.spark.sql.Dataset<T> ds)  { throw new RuntimeException(); }
  private  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> df ()  { throw new RuntimeException(); }
  /**
   * Specifies how data of a streaming DataFrame/Dataset is written to a streaming sink.
   *   - <code>OutputMode.Append()</code>: only the new rows in the streaming DataFrame/Dataset will be
   *                            written to the sink
   *   - <code>OutputMode.Complete()</code>: all the rows in the streaming DataFrame/Dataset will be written
   *                              to the sink every time these is some updates
   * <p>
   * @since 2.0.0
   * @param outputMode (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.streaming.DataStreamWriter<T> outputMode (org.apache.spark.sql.streaming.OutputMode outputMode)  { throw new RuntimeException(); }
  /**
   * Specifies how data of a streaming DataFrame/Dataset is written to a streaming sink.
   *   - <code>append</code>:   only the new rows in the streaming DataFrame/Dataset will be written to
   *                 the sink
   *   - <code>complete</code>: all the rows in the streaming DataFrame/Dataset will be written to the sink
   *                 every time these is some updates
   * <p>
   * @since 2.0.0
   * @param outputMode (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.streaming.DataStreamWriter<T> outputMode (java.lang.String outputMode)  { throw new RuntimeException(); }
  /**
   * Set the trigger for the stream query. The default value is <code>ProcessingTime(0)</code> and it will run
   * the query as fast as possible.
   * <p>
   * Scala Example:
   * <pre><code>
   *   df.writeStream.trigger(ProcessingTime("10 seconds"))
   *
   *   import scala.concurrent.duration._
   *   df.writeStream.trigger(ProcessingTime(10.seconds))
   * </code></pre>
   * <p>
   * Java Example:
   * <pre><code>
   *   df.writeStream().trigger(ProcessingTime.create("10 seconds"))
   *
   *   import java.util.concurrent.TimeUnit
   *   df.writeStream().trigger(ProcessingTime.create(10, TimeUnit.SECONDS))
   * </code></pre>
   * <p>
   * @since 2.0.0
   * @param trigger (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.streaming.DataStreamWriter<T> trigger (org.apache.spark.sql.streaming.Trigger trigger)  { throw new RuntimeException(); }
  /**
   * Specifies the name of the {@link StreamingQuery} that can be started with <code>start()</code>.
   * This name must be unique among all the currently active queries in the associated SQLContext.
   * <p>
   * @since 2.0.0
   * @param queryName (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.streaming.DataStreamWriter<T> queryName (java.lang.String queryName)  { throw new RuntimeException(); }
  /**
   * Specifies the underlying output data source. Built-in options include "parquet" for now.
   * <p>
   * @since 2.0.0
   * @param source (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.streaming.DataStreamWriter<T> format (java.lang.String source)  { throw new RuntimeException(); }
  /**
   * Partitions the output by the given columns on the file system. If specified, the output is
   * laid out on the file system similar to Hive's partitioning scheme. As an example, when we
   * partition a dataset by year and then month, the directory layout would look like:
   * <p>
   *   - year=2016/month=01/
   *   - year=2016/month=02/
   * <p>
   * Partitioning is one of the most widely used techniques to optimize physical data layout.
   * It provides a coarse-grained index for skipping unnecessary data reads when queries have
   * predicates on the partitioned columns. In order for partitioning to work well, the number
   * of distinct values in each column should typically be less than tens of thousands.
   * <p>
   * This was initially applicable for Parquet but in 1.5+ covers JSON, text, ORC and avro as well.
   * <p>
   * @since 1.4.0
   * @param colNames (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.streaming.DataStreamWriter<T> partitionBy (scala.collection.Seq<java.lang.String> colNames)  { throw new RuntimeException(); }
  /**
   * Adds an output option for the underlying data source.
   * <p>
   * @since 2.0.0
   * @param key (undocumented)
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.streaming.DataStreamWriter<T> option (java.lang.String key, java.lang.String value)  { throw new RuntimeException(); }
  /**
   * Adds an output option for the underlying data source.
   * <p>
   * @since 2.0.0
   * @param key (undocumented)
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.streaming.DataStreamWriter<T> option (java.lang.String key, boolean value)  { throw new RuntimeException(); }
  /**
   * Adds an output option for the underlying data source.
   * <p>
   * @since 2.0.0
   * @param key (undocumented)
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.streaming.DataStreamWriter<T> option (java.lang.String key, long value)  { throw new RuntimeException(); }
  /**
   * Adds an output option for the underlying data source.
   * <p>
   * @since 2.0.0
   * @param key (undocumented)
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.streaming.DataStreamWriter<T> option (java.lang.String key, double value)  { throw new RuntimeException(); }
  /**
   * (Scala-specific) Adds output options for the underlying data source.
   * <p>
   * @since 2.0.0
   * @param options (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.streaming.DataStreamWriter<T> options (scala.collection.Map<java.lang.String, java.lang.String> options)  { throw new RuntimeException(); }
  /**
   * Adds output options for the underlying data source.
   * <p>
   * @since 2.0.0
   * @param options (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.streaming.DataStreamWriter<T> options (java.util.Map<java.lang.String, java.lang.String> options)  { throw new RuntimeException(); }
  /**
   * Starts the execution of the streaming query, which will continually output results to the given
   * path as new data arrives. The returned {@link StreamingQuery} object can be used to interact with
   * the stream.
   * <p>
   * @since 2.0.0
   * @param path (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.streaming.StreamingQuery start (java.lang.String path)  { throw new RuntimeException(); }
  /**
   * Starts the execution of the streaming query, which will continually output results to the given
   * path as new data arrives. The returned {@link StreamingQuery} object can be used to interact with
   * the stream.
   * <p>
   * @since 2.0.0
   * @return (undocumented)
   */
  public  org.apache.spark.sql.streaming.StreamingQuery start ()  { throw new RuntimeException(); }
  /**
   * Starts the execution of the streaming query, which will continually send results to the given
   * <code>ForeachWriter</code> as as new data arrives. The <code>ForeachWriter</code> can be used to send the data
   * generated by the <code>DataFrame</code>/<code>Dataset</code> to an external system.
   * <p>
   * Scala example:
   * <pre><code>
   *   datasetOfString.writeStream.foreach(new ForeachWriter[String] {
   *
   *     def open(partitionId: Long, version: Long): Boolean = {
   *       // open connection
   *     }
   *
   *     def process(record: String) = {
   *       // write string to connection
   *     }
   *
   *     def close(errorOrNull: Throwable): Unit = {
   *       // close the connection
   *     }
   *   }).start()
   * </code></pre>
   * <p>
   * Java example:
   * <pre><code>
   *  datasetOfString.writeStream().foreach(new ForeachWriter&lt;String&gt;() {
   *
   *    &#64;Override
   *    public boolean open(long partitionId, long version) {
   *      // open connection
   *    }
   *
   *    &#64;Override
   *    public void process(String value) {
   *      // write string to connection
   *    }
   *
   *    &#64;Override
   *    public void close(Throwable errorOrNull) {
   *      // close the connection
   *    }
   *  }).start();
   * </code></pre>
   * <p>
   * @since 2.0.0
   * @param writer (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.streaming.DataStreamWriter<T> foreach (org.apache.spark.sql.ForeachWriter<T> writer)  { throw new RuntimeException(); }
  private  scala.Option<scala.collection.Seq<java.lang.String>> normalizedParCols ()  { throw new RuntimeException(); }
  /**
   * The given column name may not be equal to any of the existing column names if we were in
   * case-insensitive context. Normalize the given column name to the real one so that we don't
   * need to care about case sensitivity afterwards.
   * @param columnName (undocumented)
   * @param columnType (undocumented)
   * @return (undocumented)
   */
  private  java.lang.String normalize (java.lang.String columnName, java.lang.String columnType)  { throw new RuntimeException(); }
  private  void assertNotPartitioned (java.lang.String operation)  { throw new RuntimeException(); }
  private  java.lang.String source ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.streaming.OutputMode outputMode ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.streaming.Trigger trigger ()  { throw new RuntimeException(); }
  private  scala.collection.mutable.HashMap<java.lang.String, java.lang.String> extraOptions ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.ForeachWriter<T> foreachWriter ()  { throw new RuntimeException(); }
  private  scala.Option<scala.collection.Seq<java.lang.String>> partitioningColumns ()  { throw new RuntimeException(); }
}
