package org.apache.spark.sql.execution.datasources.jdbc;
public  class JDBCRelation$ implements org.apache.spark.internal.Logging, scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final JDBCRelation$ MODULE$ = null;
  public   JDBCRelation$ ()  { throw new RuntimeException(); }
  /**
   * Given a partitioning schematic (a column of integral type, a number of
   * partitions, and upper and lower bounds on the column's value), generate
   * WHERE clauses for each partition so that each row in the table appears
   * exactly once.  The parameters minValue and maxValue are advisory in that
   * incorrect values may cause the partitioning to be poor, but no data
   * will fail to be represented.
   * <p>
   * Null value predicate is added to the first partition where clause to include
   * the rows with null value for the partitions column.
   * <p>
   * @param partitioning partition information to generate the where clause for each partition
   * @return an array of partitions with where clause for each partition
   */
  public  org.apache.spark.Partition[] columnPartition (org.apache.spark.sql.execution.datasources.jdbc.JDBCPartitioningInfo partitioning)  { throw new RuntimeException(); }
}
