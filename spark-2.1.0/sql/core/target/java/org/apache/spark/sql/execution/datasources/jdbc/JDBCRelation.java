package org.apache.spark.sql.execution.datasources.jdbc;
  class JDBCRelation extends org.apache.spark.sql.sources.BaseRelation implements org.apache.spark.sql.sources.PrunedFilteredScan, org.apache.spark.sql.sources.InsertableRelation, scala.Product, scala.Serializable {
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
  static public  org.apache.spark.Partition[] columnPartition (org.apache.spark.sql.execution.datasources.jdbc.JDBCPartitioningInfo partitioning)  { throw new RuntimeException(); }
  static public  long sizeInBytes ()  { throw new RuntimeException(); }
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  org.apache.spark.Partition[] parts ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.datasources.jdbc.JDBCOptions jdbcOptions ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.SparkSession sparkSession ()  { throw new RuntimeException(); }
  // not preceding
  public   JDBCRelation (org.apache.spark.Partition[] parts, org.apache.spark.sql.execution.datasources.jdbc.JDBCOptions jdbcOptions, org.apache.spark.sql.SparkSession sparkSession)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.SQLContext sqlContext ()  { throw new RuntimeException(); }
  public  boolean needConversion ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType schema ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.sources.Filter[] unhandledFilters (org.apache.spark.sql.sources.Filter[] filters)  { throw new RuntimeException(); }
  public  org.apache.spark.rdd.RDD<org.apache.spark.sql.Row> buildScan (java.lang.String[] requiredColumns, org.apache.spark.sql.sources.Filter[] filters)  { throw new RuntimeException(); }
  public  void insert (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> data, boolean overwrite)  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
