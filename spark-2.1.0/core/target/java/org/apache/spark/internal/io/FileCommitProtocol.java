package org.apache.spark.internal.io;
/**
 * An interface to define how a single Spark job commits its outputs. Two notes:
 * <p>
 * 1. Implementations must be serializable, as the committer instance instantiated on the driver
 *    will be used for tasks on executors.
 * 2. Implementations should have a constructor with either 2 or 3 arguments:
 *    (jobId: String, path: String) or (jobId: String, path: String, isAppend: Boolean).
 * 3. A committer should not be reused across multiple Spark jobs.
 * <p>
 * The proper call sequence is:
 * <p>
 * 1. Driver calls setupJob.
 * 2. As part of each task's execution, executor calls setupTask and then commitTask
 *    (or abortTask if task failed).
 * 3. When all necessary tasks completed successfully, the driver calls commitJob. If the job
 *    failed to execute (e.g. too many failed tasks), the job should call abortJob.
 */
public abstract class FileCommitProtocol {
  static public  class EmptyTaskCommitMessage$ extends org.apache.spark.internal.io.FileCommitProtocol.TaskCommitMessage {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final EmptyTaskCommitMessage$ MODULE$ = null;
    public   EmptyTaskCommitMessage$ ()  { throw new RuntimeException(); }
  }
  static public  class TaskCommitMessage implements scala.Serializable {
    public  Object obj ()  { throw new RuntimeException(); }
    // not preceding
    public   TaskCommitMessage (Object obj)  { throw new RuntimeException(); }
  }
  /**
   * Instantiates a FileCommitProtocol using the given className.
   * @param className (undocumented)
   * @param jobId (undocumented)
   * @param outputPath (undocumented)
   * @param isAppend (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.internal.io.FileCommitProtocol instantiate (java.lang.String className, java.lang.String jobId, java.lang.String outputPath, boolean isAppend)  { throw new RuntimeException(); }
  public   FileCommitProtocol ()  { throw new RuntimeException(); }
  /**
   * Setups up a job. Must be called on the driver before any other methods can be invoked.
   * @param jobContext (undocumented)
   */
  public abstract  void setupJob (org.apache.hadoop.mapreduce.JobContext jobContext)  ;
  /**
   * Commits a job after the writes succeed. Must be called on the driver.
   * @param jobContext (undocumented)
   * @param taskCommits (undocumented)
   */
  public abstract  void commitJob (org.apache.hadoop.mapreduce.JobContext jobContext, scala.collection.Seq<org.apache.spark.internal.io.FileCommitProtocol.TaskCommitMessage> taskCommits)  ;
  /**
   * Aborts a job after the writes fail. Must be called on the driver.
   * <p>
   * Calling this function is a best-effort attempt, because it is possible that the driver
   * just crashes (or killed) before it can call abort.
   * @param jobContext (undocumented)
   */
  public abstract  void abortJob (org.apache.hadoop.mapreduce.JobContext jobContext)  ;
  /**
   * Sets up a task within a job.
   * Must be called before any other task related methods can be invoked.
   * @param taskContext (undocumented)
   */
  public abstract  void setupTask (org.apache.hadoop.mapreduce.TaskAttemptContext taskContext)  ;
  /**
   * Notifies the commit protocol to add a new file, and gets back the full path that should be
   * used. Must be called on the executors when running tasks.
   * <p>
   * Note that the returned temp file may have an arbitrary path. The commit protocol only
   * promises that the file will be at the location specified by the arguments after job commit.
   * <p>
   * A full file path consists of the following parts:
   *  1. the base path
   *  2. some sub-directory within the base path, used to specify partitioning
   *  3. file prefix, usually some unique job id with the task id
   *  4. bucket id
   *  5. source specific file extension, e.g. ".snappy.parquet"
   * <p>
   * The "dir" parameter specifies 2, and "ext" parameter specifies both 4 and 5, and the rest
   * are left to the commit protocol implementation to decide.
   * <p>
   * Important: it is the caller's responsibility to add uniquely identifying content to "ext"
   * if a task is going to write out multiple files to the same dir. The file commit protocol only
   * guarantees that files written by different tasks will not conflict.
   * @param taskContext (undocumented)
   * @param dir (undocumented)
   * @param ext (undocumented)
   * @return (undocumented)
   */
  public abstract  java.lang.String newTaskTempFile (org.apache.hadoop.mapreduce.TaskAttemptContext taskContext, scala.Option<java.lang.String> dir, java.lang.String ext)  ;
  /**
   * Similar to newTaskTempFile(), but allows files to committed to an absolute output location.
   * Depending on the implementation, there may be weaker guarantees around adding files this way.
   * <p>
   * Important: it is the caller's responsibility to add uniquely identifying content to "ext"
   * if a task is going to write out multiple files to the same dir. The file commit protocol only
   * guarantees that files written by different tasks will not conflict.
   * @param taskContext (undocumented)
   * @param absoluteDir (undocumented)
   * @param ext (undocumented)
   * @return (undocumented)
   */
  public abstract  java.lang.String newTaskTempFileAbsPath (org.apache.hadoop.mapreduce.TaskAttemptContext taskContext, java.lang.String absoluteDir, java.lang.String ext)  ;
  /**
   * Commits a task after the writes succeed. Must be called on the executors when running tasks.
   * @param taskContext (undocumented)
   * @return (undocumented)
   */
  public abstract  org.apache.spark.internal.io.FileCommitProtocol.TaskCommitMessage commitTask (org.apache.hadoop.mapreduce.TaskAttemptContext taskContext)  ;
  /**
   * Aborts a task after the writes have failed. Must be called on the executors when running tasks.
   * <p>
   * Calling this function is a best-effort attempt, because it is possible that the executor
   * just crashes (or killed) before it can call abort.
   * @param taskContext (undocumented)
   */
  public abstract  void abortTask (org.apache.hadoop.mapreduce.TaskAttemptContext taskContext)  ;
}
