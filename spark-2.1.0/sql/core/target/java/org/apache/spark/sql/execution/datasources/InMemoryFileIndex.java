package org.apache.spark.sql.execution.datasources;
/**
 * A {@link FileIndex} that generates the list of files to process by recursively listing all the
 * files present in <code>paths</code>.
 * <p>
 * param:  rootPaths the list of root table paths to scan
 * param:  parameters as set of options to control discovery
 * param:  partitionSchema an optional partition schema that will be use to provide types for the
 *                        discovered partitions
 */
public  class InMemoryFileIndex extends org.apache.spark.sql.execution.datasources.PartitioningAwareFileIndex {
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
  static public  org.apache.spark.sql.types.StructType partitionSchema ()  { throw new RuntimeException(); }
  static protected  org.apache.hadoop.conf.Configuration hadoopConf ()  { throw new RuntimeException(); }
  static public  scala.collection.Seq<org.apache.spark.sql.execution.datasources.PartitionDirectory> listFiles (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> filters)  { throw new RuntimeException(); }
  static public  java.lang.String[] inputFiles ()  { throw new RuntimeException(); }
  static public  long sizeInBytes ()  { throw new RuntimeException(); }
  static public  scala.collection.Seq<org.apache.hadoop.fs.FileStatus> allFiles ()  { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.execution.datasources.PartitionSpec inferPartitioning ()  { throw new RuntimeException(); }
  static public  scala.collection.mutable.LinkedHashSet<org.apache.hadoop.fs.FileStatus> listLeafFiles (scala.collection.Seq<org.apache.hadoop.fs.Path> paths)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.hadoop.fs.Path> rootPaths ()  { throw new RuntimeException(); }
  // not preceding
  public   InMemoryFileIndex (org.apache.spark.sql.SparkSession sparkSession, scala.collection.Seq<org.apache.hadoop.fs.Path> rootPaths, scala.collection.immutable.Map<java.lang.String, java.lang.String> parameters, scala.Option<org.apache.spark.sql.types.StructType> partitionSchema, org.apache.spark.sql.execution.datasources.FileStatusCache fileStatusCache)  { throw new RuntimeException(); }
  private  scala.collection.mutable.LinkedHashMap<org.apache.hadoop.fs.Path, org.apache.hadoop.fs.FileStatus> cachedLeafFiles ()  { throw new RuntimeException(); }
  private  scala.collection.immutable.Map<org.apache.hadoop.fs.Path, org.apache.hadoop.fs.FileStatus[]> cachedLeafDirToChildrenFiles ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.execution.datasources.PartitionSpec cachedPartitionSpec ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.datasources.PartitionSpec partitionSpec ()  { throw new RuntimeException(); }
  protected  scala.collection.mutable.LinkedHashMap<org.apache.hadoop.fs.Path, org.apache.hadoop.fs.FileStatus> leafFiles ()  { throw new RuntimeException(); }
  protected  scala.collection.immutable.Map<org.apache.hadoop.fs.Path, org.apache.hadoop.fs.FileStatus[]> leafDirToChildrenFiles ()  { throw new RuntimeException(); }
  public  void refresh ()  { throw new RuntimeException(); }
  private  void refresh0 ()  { throw new RuntimeException(); }
  public  boolean equals (Object other)  { throw new RuntimeException(); }
  public  int hashCode ()  { throw new RuntimeException(); }
}
