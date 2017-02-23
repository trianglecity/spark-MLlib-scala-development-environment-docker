package org.apache.spark.sql.execution.datasources;
public  class PartitioningAwareFileIndex$ implements org.apache.spark.internal.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final PartitioningAwareFileIndex$ MODULE$ = null;
  public   PartitioningAwareFileIndex$ ()  { throw new RuntimeException(); }
  public  java.lang.String BASE_PATH_PARAM ()  { throw new RuntimeException(); }
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
  private  scala.collection.Seq<scala.Tuple2<org.apache.hadoop.fs.Path, scala.collection.Seq<org.apache.hadoop.fs.FileStatus>>> bulkListLeafFiles (scala.collection.Seq<org.apache.hadoop.fs.Path> paths, org.apache.hadoop.conf.Configuration hadoopConf, org.apache.hadoop.fs.PathFilter filter, org.apache.spark.sql.SparkSession sparkSession)  { throw new RuntimeException(); }
  /**
   * Lists a single filesystem path recursively. If a SparkSession object is specified, this
   * function may launch Spark jobs to parallelize listing.
   * <p>
   * If sessionOpt is None, this may be called on executors.
   * <p>
   * @return all children of path that match the specified filter.
   * @param path (undocumented)
   * @param hadoopConf (undocumented)
   * @param filter (undocumented)
   * @param sessionOpt (undocumented)
   */
  private  scala.collection.Seq<org.apache.hadoop.fs.FileStatus> listLeafFiles (org.apache.hadoop.fs.Path path, org.apache.hadoop.conf.Configuration hadoopConf, org.apache.hadoop.fs.PathFilter filter, scala.Option<org.apache.spark.sql.SparkSession> sessionOpt)  { throw new RuntimeException(); }
  /** Checks if we should filter out this path name. */
  public  boolean shouldFilterOut (java.lang.String pathName)  { throw new RuntimeException(); }
}
