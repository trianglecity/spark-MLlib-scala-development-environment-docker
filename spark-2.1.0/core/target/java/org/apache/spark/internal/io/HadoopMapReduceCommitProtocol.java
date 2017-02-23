package org.apache.spark.internal.io;
/**
 * An {@link FileCommitProtocol} implementation backed by an underlying Hadoop OutputCommitter
 * (from the newer mapreduce API, not the old mapred API).
 * <p>
 * Unlike Hadoop's OutputCommitter, this implementation is serializable.
 */
public  class HadoopMapReduceCommitProtocol extends org.apache.spark.internal.io.FileCommitProtocol implements scala.Serializable, org.apache.spark.internal.Logging {
  public   HadoopMapReduceCommitProtocol (java.lang.String jobId, java.lang.String path)  { throw new RuntimeException(); }
  /** OutputCommitter from Hadoop is not serializable so marking it transient. */
  private  org.apache.hadoop.mapreduce.OutputCommitter committer ()  { throw new RuntimeException(); }
  /**
   * Tracks files staged by this task for absolute output paths. These outputs are not managed by
   * the Hadoop OutputCommitter, so we must move these to their final locations on job commit.
   * <p>
   * The mapping is from the temp output path to the final desired output path of the file.
   * @return (undocumented)
   */
  private  scala.collection.mutable.Map<java.lang.String, java.lang.String> addedAbsPathFiles ()  { throw new RuntimeException(); }
  /**
   * The staging directory for all files committed with absolute output paths.
   * @return (undocumented)
   */
  private  org.apache.hadoop.fs.Path absPathStagingDir ()  { throw new RuntimeException(); }
  protected  org.apache.hadoop.mapreduce.OutputCommitter setupCommitter (org.apache.hadoop.mapreduce.TaskAttemptContext context)  { throw new RuntimeException(); }
  public  java.lang.String newTaskTempFile (org.apache.hadoop.mapreduce.TaskAttemptContext taskContext, scala.Option<java.lang.String> dir, java.lang.String ext)  { throw new RuntimeException(); }
  public  java.lang.String newTaskTempFileAbsPath (org.apache.hadoop.mapreduce.TaskAttemptContext taskContext, java.lang.String absoluteDir, java.lang.String ext)  { throw new RuntimeException(); }
  private  java.lang.String getFilename (org.apache.hadoop.mapreduce.TaskAttemptContext taskContext, java.lang.String ext)  { throw new RuntimeException(); }
  public  void setupJob (org.apache.hadoop.mapreduce.JobContext jobContext)  { throw new RuntimeException(); }
  public  void commitJob (org.apache.hadoop.mapreduce.JobContext jobContext, scala.collection.Seq<org.apache.spark.internal.io.FileCommitProtocol.TaskCommitMessage> taskCommits)  { throw new RuntimeException(); }
  public  void abortJob (org.apache.hadoop.mapreduce.JobContext jobContext)  { throw new RuntimeException(); }
  public  void setupTask (org.apache.hadoop.mapreduce.TaskAttemptContext taskContext)  { throw new RuntimeException(); }
  public  org.apache.spark.internal.io.FileCommitProtocol.TaskCommitMessage commitTask (org.apache.hadoop.mapreduce.TaskAttemptContext taskContext)  { throw new RuntimeException(); }
  public  void abortTask (org.apache.hadoop.mapreduce.TaskAttemptContext taskContext)  { throw new RuntimeException(); }
}
