package org.apache.spark.sql.execution.datasources;
/**
 * An abstract class that represents {@link FileIndex}s that are aware of partitioned tables.
 * It provides the necessary methods to parse partition data based on a set of files.
 * <p>
 * param:  parameters as set of options to control partition discovery
 * param:  userPartitionSchema an optional partition schema that will be use to provide types for
 *                            the discovered partitions
 */
public abstract class PartitioningAwareFileIndex implements org.apache.spark.sql.execution.datasources.FileIndex, org.apache.spark.internal.Logging {
  /** A serializable variant of HDFS's BlockLocation. */
  static private  class SerializableBlockLocation implements scala.Product, scala.Serializable {
    public  java.lang.String[] names ()  { throw new RuntimeException(); }
    public  java.lang.String[] hosts ()  { throw new RuntimeException(); }
    public  long offset ()  { throw new RuntimeException(); }
    public  long length ()  { throw new RuntimeException(); }
    // not preceding
    public   SerializableBlockLocation (java.lang.String[] names, java.lang.String[] hosts, long offset, long length)  { throw new RuntimeException(); }
  }
  static private  class SerializableBlockLocation$ extends scala.runtime.AbstractFunction4<java.lang.String[], java.lang.String[], java.lang.Object, java.lang.Object, org.apache.spark.sql.execution.datasources.PartitioningAwareFileIndex.SerializableBlockLocation> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final SerializableBlockLocation$ MODULE$ = null;
    public   SerializableBlockLocation$ ()  { throw new RuntimeException(); }
  }
  /** A serializable variant of HDFS's FileStatus. */
  static private  class SerializableFileStatus implements scala.Product, scala.Serializable {
    public  java.lang.String path ()  { throw new RuntimeException(); }
    public  long length ()  { throw new RuntimeException(); }
    public  boolean isDir ()  { throw new RuntimeException(); }
    public  short blockReplication ()  { throw new RuntimeException(); }
    public  long blockSize ()  { throw new RuntimeException(); }
    public  long modificationTime ()  { throw new RuntimeException(); }
    public  long accessTime ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.execution.datasources.PartitioningAwareFileIndex.SerializableBlockLocation[] blockLocations ()  { throw new RuntimeException(); }
    // not preceding
    public   SerializableFileStatus (java.lang.String path, long length, boolean isDir, short blockReplication, long blockSize, long modificationTime, long accessTime, org.apache.spark.sql.execution.datasources.PartitioningAwareFileIndex.SerializableBlockLocation[] blockLocations)  { throw new RuntimeException(); }
  }
  static private  class SerializableFileStatus$ extends scala.runtime.AbstractFunction8<java.lang.String, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, org.apache.spark.sql.execution.datasources.PartitioningAwareFileIndex.SerializableBlockLocation[], org.apache.spark.sql.execution.datasources.PartitioningAwareFileIndex.SerializableFileStatus> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final SerializableFileStatus$ MODULE$ = null;
    public   SerializableFileStatus$ ()  { throw new RuntimeException(); }
  }
  static public  java.lang.String BASE_PATH_PARAM ()  { throw new RuntimeException(); }
  /**
   * Lists a collection of paths recursively. Picks the listing strategy adaptively depending
   * on the number of paths to list.
   * <p>
   * This may only be called on the driver.
   * <p>
   * @return for each input path, the set of discovered files for the path
   * @param paths (undocumented)
   * @param hadoopConf (undocumented)
   * @param filter (undocumented)
   * @param sparkSession (undocumented)
   */
  static private  scala.collection.Seq<scala.Tuple2<org.apache.hadoop.fs.Path, scala.collection.Seq<org.apache.hadoop.fs.FileStatus>>> bulkListLeafFiles (scala.collection.Seq<org.apache.hadoop.fs.Path> paths, org.apache.hadoop.conf.Configuration hadoopConf, org.apache.hadoop.fs.PathFilter filter, org.apache.spark.sql.SparkSession sparkSession)  { throw new RuntimeException(); }
  /** Checks if we should filter out this path name. */
  static public  boolean shouldFilterOut (java.lang.String pathName)  { throw new RuntimeException(); }
  static public abstract  scala.collection.Seq<org.apache.hadoop.fs.Path> rootPaths ()  ;
  static public abstract  void refresh ()  ;
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
  public   PartitioningAwareFileIndex (org.apache.spark.sql.SparkSession sparkSession, scala.collection.immutable.Map<java.lang.String, java.lang.String> parameters, scala.Option<org.apache.spark.sql.types.StructType> userPartitionSchema, org.apache.spark.sql.execution.datasources.FileStatusCache fileStatusCache)  { throw new RuntimeException(); }
  /** Returns the specification of the partitions inferred from the data. */
  public abstract  org.apache.spark.sql.execution.datasources.PartitionSpec partitionSpec ()  ;
  public  org.apache.spark.sql.types.StructType partitionSchema ()  { throw new RuntimeException(); }
  protected  org.apache.hadoop.conf.Configuration hadoopConf ()  { throw new RuntimeException(); }
  protected abstract  scala.collection.mutable.LinkedHashMap<org.apache.hadoop.fs.Path, org.apache.hadoop.fs.FileStatus> leafFiles ()  ;
  protected abstract  scala.collection.immutable.Map<org.apache.hadoop.fs.Path, org.apache.hadoop.fs.FileStatus[]> leafDirToChildrenFiles ()  ;
  public  scala.collection.Seq<org.apache.spark.sql.execution.datasources.PartitionDirectory> listFiles (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> filters)  { throw new RuntimeException(); }
  /** Returns the list of files that will be read when scanning this relation. */
  public  java.lang.String[] inputFiles ()  { throw new RuntimeException(); }
  public  long sizeInBytes ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.hadoop.fs.FileStatus> allFiles ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.execution.datasources.PartitionSpec inferPartitioning ()  { throw new RuntimeException(); }
  private  scala.collection.Seq<org.apache.spark.sql.execution.datasources.PartitionPath> prunePartitions (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> predicates, org.apache.spark.sql.execution.datasources.PartitionSpec partitionSpec)  { throw new RuntimeException(); }
  /**
   * Contains a set of paths that are considered as the base dirs of the input datasets.
   * The partitioning discovery logic will make sure it will stop when it reaches any
   * base path.
   * <p>
   * By default, the paths of the dataset provided by users will be base paths.
   * Below are three typical examples,
   * Case 1) <code>spark.read.parquet("/path/something=true/")</code>: the base path will be
   * <code>/path/something=true/</code>, and the returned DataFrame will not contain a column of <code>something</code>.
   * Case 2) <code>spark.read.parquet("/path/something=true/a.parquet")</code>: the base path will be
   * still <code>/path/something=true/</code>, and the returned DataFrame will also not contain a column of
   * <code>something</code>.
   * Case 3) <code>spark.read.parquet("/path/")</code>: the base path will be <code>/path/</code>, and the returned
   * DataFrame will have the column of <code>something</code>.
   * <p>
   * Users also can override the basePath by setting <code>basePath</code> in the options to pass the new base
   * path to the data source.
   * For example, <code>spark.read.option("basePath", "/path/").parquet("/path/something=true/")</code>,
   * and the returned DataFrame will have the column of <code>something</code>.
   * @return (undocumented)
   */
  private  scala.collection.immutable.Set<org.apache.hadoop.fs.Path> basePaths ()  { throw new RuntimeException(); }
  private  boolean isDataPath (org.apache.hadoop.fs.Path path)  { throw new RuntimeException(); }
  /**
   * List leaf files of given paths. This method will submit a Spark job to do parallel
   * listing whenever there is a path having more files than the parallel partition discovery
   * discovery threshold.
   * <p>
   * This is publicly visible for testing.
   * @param paths (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.mutable.LinkedHashSet<org.apache.hadoop.fs.FileStatus> listLeafFiles (scala.collection.Seq<org.apache.hadoop.fs.Path> paths)  { throw new RuntimeException(); }
}
