package org.apache.spark.sql.execution.datasources.csv;
/**
 * Provides access to CSV data from pure SQL statements.
 */
public  class CSVFileFormat extends org.apache.spark.sql.execution.datasources.TextBasedFileFormat implements org.apache.spark.sql.sources.DataSourceRegister {
  public   CSVFileFormat ()  { throw new RuntimeException(); }
  public  java.lang.String shortName ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  int hashCode ()  { throw new RuntimeException(); }
  public  boolean equals (Object other)  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.types.StructType> inferSchema (org.apache.spark.sql.SparkSession sparkSession, scala.collection.immutable.Map<java.lang.String, java.lang.String> options, scala.collection.Seq<org.apache.hadoop.fs.FileStatus> files)  { throw new RuntimeException(); }
  /**
   * Generates a header from the given row which is null-safe and duplicate-safe.
   * @param row (undocumented)
   * @param options (undocumented)
   * @param caseSensitive (undocumented)
   * @return (undocumented)
   */
  private  java.lang.String[] makeSafeHeader (java.lang.String[] row, org.apache.spark.sql.execution.datasources.csv.CSVOptions options, boolean caseSensitive)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.datasources.OutputWriterFactory prepareWrite (org.apache.spark.sql.SparkSession sparkSession, org.apache.hadoop.mapreduce.Job job, scala.collection.immutable.Map<java.lang.String, java.lang.String> options, org.apache.spark.sql.types.StructType dataSchema)  { throw new RuntimeException(); }
  public  scala.Function1<org.apache.spark.sql.execution.datasources.PartitionedFile, scala.collection.Iterator<org.apache.spark.sql.catalyst.InternalRow>> buildReader (org.apache.spark.sql.SparkSession sparkSession, org.apache.spark.sql.types.StructType dataSchema, org.apache.spark.sql.types.StructType partitionSchema, org.apache.spark.sql.types.StructType requiredSchema, scala.collection.Seq<org.apache.spark.sql.sources.Filter> filters, scala.collection.immutable.Map<java.lang.String, java.lang.String> options, org.apache.hadoop.conf.Configuration hadoopConf)  { throw new RuntimeException(); }
  private  org.apache.spark.rdd.RDD<java.lang.String> baseRdd (org.apache.spark.sql.SparkSession sparkSession, org.apache.spark.sql.execution.datasources.csv.CSVOptions options, scala.collection.Seq<java.lang.String> inputPaths)  { throw new RuntimeException(); }
  private  org.apache.spark.rdd.RDD<java.lang.String[]> tokenRdd (org.apache.spark.sql.SparkSession sparkSession, org.apache.spark.sql.execution.datasources.csv.CSVOptions options, java.lang.String[] header, scala.collection.Seq<java.lang.String> inputPaths)  { throw new RuntimeException(); }
  /**
   * Returns the first line of the first non-empty file in path
   * @param options (undocumented)
   * @param rdd (undocumented)
   * @return (undocumented)
   */
  private  java.lang.String findFirstLine (org.apache.spark.sql.execution.datasources.csv.CSVOptions options, org.apache.spark.rdd.RDD<java.lang.String> rdd)  { throw new RuntimeException(); }
  private  org.apache.spark.rdd.RDD<java.lang.String> readText (org.apache.spark.sql.SparkSession sparkSession, org.apache.spark.sql.execution.datasources.csv.CSVOptions options, java.lang.String location)  { throw new RuntimeException(); }
  private  void verifySchema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
}
