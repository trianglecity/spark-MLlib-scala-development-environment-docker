package org.apache.spark.sql.execution.datasources;
/** A helper object for writing FileFormat data out to a location. */
public  class FileFormatWriter$ implements org.apache.spark.internal.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final FileFormatWriter$ MODULE$ = null;
  public   FileFormatWriter$ ()  { throw new RuntimeException(); }
  /**
   * Basic work flow of this command is:
   * 1. Driver side setup, including output committer initialization and data source specific
   *    preparation work for the write job to be issued.
   * 2. Issues a write job consists of one or more executor side tasks, each of which writes all
   *    rows within an RDD partition.
   * 3. If no exception is thrown in a task, commits that task, otherwise aborts that task;  If any
   *    exception is thrown during task commitment, also aborts that task.
   * 4. If all tasks are committed, commit the job, otherwise aborts the job;  If any exception is
   *    thrown during job commitment, also aborts the job.
   * @param sparkSession (undocumented)
   * @param queryExecution (undocumented)
   * @param fileFormat (undocumented)
   * @param committer (undocumented)
   * @param outputSpec (undocumented)
   * @param hadoopConf (undocumented)
   * @param partitionColumns (undocumented)
   * @param bucketSpec (undocumented)
   * @param refreshFunction (undocumented)
   * @param options (undocumented)
   */
  public  void write (org.apache.spark.sql.SparkSession sparkSession, org.apache.spark.sql.execution.QueryExecution queryExecution, org.apache.spark.sql.execution.datasources.FileFormat fileFormat, org.apache.spark.internal.io.FileCommitProtocol committer, org.apache.spark.sql.execution.datasources.FileFormatWriter.OutputSpec outputSpec, org.apache.hadoop.conf.Configuration hadoopConf, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> partitionColumns, scala.Option<org.apache.spark.sql.catalyst.catalog.BucketSpec> bucketSpec, scala.Function1<scala.collection.Seq<scala.collection.immutable.Map<java.lang.String, java.lang.String>>, scala.runtime.BoxedUnit> refreshFunction, scala.collection.immutable.Map<java.lang.String, java.lang.String> options)  { throw new RuntimeException(); }
  /** Writes data out in a single Spark task. */
  private  scala.Tuple2<org.apache.spark.internal.io.FileCommitProtocol.TaskCommitMessage, scala.collection.immutable.Set<java.lang.String>> executeTask (org.apache.spark.sql.execution.datasources.FileFormatWriter.WriteJobDescription description, int sparkStageId, int sparkPartitionId, int sparkAttemptNumber, org.apache.spark.internal.io.FileCommitProtocol committer, scala.collection.Iterator<org.apache.spark.sql.catalyst.InternalRow> iterator)  { throw new RuntimeException(); }
}
