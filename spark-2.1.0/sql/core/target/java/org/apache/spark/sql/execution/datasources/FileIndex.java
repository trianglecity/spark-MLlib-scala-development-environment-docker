package org.apache.spark.sql.execution.datasources;
/**
 * An interface for objects capable of enumerating the root paths of a relation as well as the
 * partitions of a relation subject to some pruning expressions.
 */
public  interface FileIndex {
  /**
   * Returns the list of root input paths from which the catalog will get files. There may be a
   * single root path from which partitions are discovered, or individual partitions may be
   * specified by each path.
   * @return (undocumented)
   */
  public  scala.collection.Seq<org.apache.hadoop.fs.Path> rootPaths ()  ;
  /**
   * Returns all valid files grouped into partitions when the data is partitioned. If the data is
   * unpartitioned, this will return a single partition with no partition values.
   * <p>
   * @param filters The filters used to prune which partitions are returned.  These filters must
   *                only refer to partition columns and this method will only return files
   *                where these predicates are guaranteed to evaluate to <code>true</code>.  Thus, these
   *                filters will not need to be evaluated again on the returned data.
   * @return (undocumented)
   */
  public  scala.collection.Seq<org.apache.spark.sql.execution.datasources.PartitionDirectory> listFiles (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> filters)  ;
  /**
   * Returns the list of files that will be read when scanning this relation. This call may be
   * very expensive for large tables.
   * @return (undocumented)
   */
  public  java.lang.String[] inputFiles ()  ;
  /** Refresh any cached file listings */
  public  void refresh ()  ;
  /** Sum of table file sizes, in bytes */
  public  long sizeInBytes ()  ;
  /** Schema of the partitioning columns, or the empty schema if the table is not partitioned. */
  public  org.apache.spark.sql.types.StructType partitionSchema ()  ;
}
