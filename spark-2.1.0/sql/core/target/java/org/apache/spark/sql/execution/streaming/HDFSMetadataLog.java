package org.apache.spark.sql.execution.streaming;
/**
 * A {@link MetadataLog} implementation based on HDFS. {@link HDFSMetadataLog} uses the specified <code>path</code>
 * as the metadata storage.
 * <p>
 * When writing a new batch, {@link HDFSMetadataLog} will firstly write to a temp file and then rename
 * it to the final batch file. If the rename step fails, there must be multiple writers and only
 * one of them will succeed and the others will fail.
 * <p>
 * Note: {@link HDFSMetadataLog} doesn't support S3-like file systems as they don't guarantee listing
 * files in a directory always shows the latest files.
 */
public  class HDFSMetadataLog<T extends java.lang.Object> implements org.apache.spark.sql.execution.streaming.MetadataLog<T>, org.apache.spark.internal.Logging {
  /** A simple trait to abstract out the file management operations needed by HDFSMetadataLog. */
  static public  interface FileManager {
    /** List the files in a path that matches a filter. */
    public  org.apache.hadoop.fs.FileStatus[] list (org.apache.hadoop.fs.Path path, org.apache.hadoop.fs.PathFilter filter)  ;
    /** Make directory at the give path and all its parent directories as needed. */
    public  void mkdirs (org.apache.hadoop.fs.Path path)  ;
    /** Whether path exists */
    public  boolean exists (org.apache.hadoop.fs.Path path)  ;
    /** Open a file for reading, or throw exception if it does not exist. */
    public  org.apache.hadoop.fs.FSDataInputStream open (org.apache.hadoop.fs.Path path)  ;
    /** Create path, or throw exception if it already exists */
    public  org.apache.hadoop.fs.FSDataOutputStream create (org.apache.hadoop.fs.Path path)  ;
    /**
     * Atomically rename path, or throw exception if it cannot be done.
     * Should throw FileNotFoundException if srcPath does not exist.
     * Should throw FileAlreadyExistsException if destPath already exists.
     * @param srcPath (undocumented)
     * @param destPath (undocumented)
     */
    public  void rename (org.apache.hadoop.fs.Path srcPath, org.apache.hadoop.fs.Path destPath)  ;
    /** Recursively delete a path if it exists. Should not throw exception if file doesn't exist. */
    public  void delete (org.apache.hadoop.fs.Path path)  ;
    /** Whether the file systme is a local FS. */
    public  boolean isLocalFileSystem ()  ;
  }
  /**
   * Default implementation of FileManager using newer FileContext API.
   */
  static public  class FileContextManager implements org.apache.spark.sql.execution.streaming.HDFSMetadataLog.FileManager {
    public   FileContextManager (org.apache.hadoop.fs.Path path, org.apache.hadoop.conf.Configuration hadoopConf)  { throw new RuntimeException(); }
    private  org.apache.hadoop.fs.FileContext fc ()  { throw new RuntimeException(); }
    public  org.apache.hadoop.fs.FileStatus[] list (org.apache.hadoop.fs.Path path, org.apache.hadoop.fs.PathFilter filter)  { throw new RuntimeException(); }
    public  void rename (org.apache.hadoop.fs.Path srcPath, org.apache.hadoop.fs.Path destPath)  { throw new RuntimeException(); }
    public  void mkdirs (org.apache.hadoop.fs.Path path)  { throw new RuntimeException(); }
    public  org.apache.hadoop.fs.FSDataInputStream open (org.apache.hadoop.fs.Path path)  { throw new RuntimeException(); }
    public  org.apache.hadoop.fs.FSDataOutputStream create (org.apache.hadoop.fs.Path path)  { throw new RuntimeException(); }
    public  boolean exists (org.apache.hadoop.fs.Path path)  { throw new RuntimeException(); }
    public  void delete (org.apache.hadoop.fs.Path path)  { throw new RuntimeException(); }
    public  boolean isLocalFileSystem ()  { throw new RuntimeException(); }
  }
  /**
   * Implementation of FileManager using older FileSystem API. Note that this implementation
   * cannot provide atomic renaming of paths, hence can lead to consistency issues. This
   * should be used only as a backup option, when FileContextManager cannot be used.
   */
  static public  class FileSystemManager implements org.apache.spark.sql.execution.streaming.HDFSMetadataLog.FileManager {
    public   FileSystemManager (org.apache.hadoop.fs.Path path, org.apache.hadoop.conf.Configuration hadoopConf)  { throw new RuntimeException(); }
    private  org.apache.hadoop.fs.FileSystem fs ()  { throw new RuntimeException(); }
    public  org.apache.hadoop.fs.FileStatus[] list (org.apache.hadoop.fs.Path path, org.apache.hadoop.fs.PathFilter filter)  { throw new RuntimeException(); }
    /**
     * Rename a path. Note that this implementation is not atomic.
     * @throws FileNotFoundException if source path does not exist.
     * @throws FileAlreadyExistsException if destination path already exists.
     * @throws IOException if renaming fails for some unknown reason.
     * @param srcPath (undocumented)
     * @param destPath (undocumented)
     */
    public  void rename (org.apache.hadoop.fs.Path srcPath, org.apache.hadoop.fs.Path destPath)  { throw new RuntimeException(); }
    public  void mkdirs (org.apache.hadoop.fs.Path path)  { throw new RuntimeException(); }
    public  org.apache.hadoop.fs.FSDataInputStream open (org.apache.hadoop.fs.Path path)  { throw new RuntimeException(); }
    public  org.apache.hadoop.fs.FSDataOutputStream create (org.apache.hadoop.fs.Path path)  { throw new RuntimeException(); }
    public  boolean exists (org.apache.hadoop.fs.Path path)  { throw new RuntimeException(); }
    public  void delete (org.apache.hadoop.fs.Path path)  { throw new RuntimeException(); }
    public  boolean isLocalFileSystem ()  { throw new RuntimeException(); }
  }
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
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree().setOriginal(Select(Ident(scala), TypeName("AnyRef")))))
  public   HDFSMetadataLog (org.apache.spark.sql.SparkSession sparkSession, java.lang.String path, scala.reflect.ClassTag<T> evidence$1)  { throw new RuntimeException(); }
  private  java.lang.Object formats ()  { throw new RuntimeException(); }
  /** Needed to serialize type T into JSON when using Jackson */
  private  scala.reflect.Manifest<T> manifest ()  { throw new RuntimeException(); }
  public  org.apache.hadoop.fs.Path metadataPath ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.execution.streaming.HDFSMetadataLog.FileManager fileManager ()  { throw new RuntimeException(); }
  /**
   * A <code>PathFilter</code> to filter only batch files
   * @return (undocumented)
   */
  protected  java.lang.Object batchFilesFilter ()  { throw new RuntimeException(); }
  protected  org.apache.hadoop.fs.Path batchIdToPath (long batchId)  { throw new RuntimeException(); }
  protected  long pathToBatchId (org.apache.hadoop.fs.Path path)  { throw new RuntimeException(); }
  protected  boolean isBatchFile (org.apache.hadoop.fs.Path path)  { throw new RuntimeException(); }
  protected  void serialize (T metadata, java.io.OutputStream out)  { throw new RuntimeException(); }
  protected  T deserialize (java.io.InputStream in)  { throw new RuntimeException(); }
  /**
   * Store the metadata for the specified batchId and return <code>true</code> if successful. If the batchId's
   * metadata has already been stored, this method will return <code>false</code>.
   * @param batchId (undocumented)
   * @param metadata (undocumented)
   * @return (undocumented)
   */
  public  boolean add (long batchId, T metadata)  { throw new RuntimeException(); }
  public  scala.Option<org.apache.hadoop.fs.Path> writeTempBatch (T metadata, scala.Function2<T, java.io.OutputStream, scala.runtime.BoxedUnit> writer)  { throw new RuntimeException(); }
  /**
   * Write a batch to a temp file then rename it to the batch file.
   * <p>
   * There may be multiple {@link HDFSMetadataLog} using the same metadata path. Although it is not a
   * valid behavior, we still need to prevent it from destroying the files.
   * @param batchId (undocumented)
   * @param metadata (undocumented)
   * @param writer (undocumented)
   */
  private  void writeBatch (long batchId, T metadata, scala.Function2<T, java.io.OutputStream, scala.runtime.BoxedUnit> writer)  { throw new RuntimeException(); }
  private  boolean isFileAlreadyExistsException (java.io.IOException e)  { throw new RuntimeException(); }
  /**
   * @return the deserialized metadata in a batch file, or None if file not exist.
   * @throws IllegalArgumentException when path does not point to a batch file.
   * @param batchFile (undocumented)
   */
  public  scala.Option<T> get (org.apache.hadoop.fs.Path batchFile)  { throw new RuntimeException(); }
  public  scala.Option<T> get (long batchId)  { throw new RuntimeException(); }
  public  scala.Tuple2<java.lang.Object, T>[] get (scala.Option<java.lang.Object> startId, scala.Option<java.lang.Object> endId)  { throw new RuntimeException(); }
  public  scala.Option<scala.Tuple2<java.lang.Object, T>> getLatest ()  { throw new RuntimeException(); }
  /**
   * Get an array of [FileStatus] referencing batch files.
   * The array is sorted by most recent batch file first to
   * oldest batch file.
   * @return (undocumented)
   */
  public  org.apache.hadoop.fs.FileStatus[] getOrderedBatchFiles ()  { throw new RuntimeException(); }
  /**
   * Removes all the log entry earlier than thresholdBatchId (exclusive).
   * @param thresholdBatchId (undocumented)
   */
  public  void purge (long thresholdBatchId)  { throw new RuntimeException(); }
  private  org.apache.spark.sql.execution.streaming.HDFSMetadataLog.FileManager createFileManager ()  { throw new RuntimeException(); }
}
