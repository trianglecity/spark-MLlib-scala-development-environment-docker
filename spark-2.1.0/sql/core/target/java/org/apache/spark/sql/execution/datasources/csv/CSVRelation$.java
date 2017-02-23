package org.apache.spark.sql.execution.datasources.csv;
public  class CSVRelation$ implements org.apache.spark.internal.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final CSVRelation$ MODULE$ = null;
  public   CSVRelation$ ()  { throw new RuntimeException(); }
  public  org.apache.spark.rdd.RDD<java.lang.String[]> univocityTokenizer (org.apache.spark.rdd.RDD<java.lang.String> file, java.lang.String firstLine, org.apache.spark.sql.execution.datasources.csv.CSVOptions params)  { throw new RuntimeException(); }
  /**
   * Returns a function that parses a single CSV record (in the form of an array of strings in which
   * each element represents a column) and turns it into either one resulting row or no row (if the
   * the record is malformed).
   * <p>
   * The 2nd argument in the returned function represents the total number of malformed rows
   * observed so far.
   * @param schema (undocumented)
   * @param requiredColumns (undocumented)
   * @param params (undocumented)
   * @return (undocumented)
   */
  public  scala.Function2<java.lang.String[], java.lang.Object, scala.Option<org.apache.spark.sql.catalyst.InternalRow>> csvParser (org.apache.spark.sql.types.StructType schema, java.lang.String[] requiredColumns, org.apache.spark.sql.execution.datasources.csv.CSVOptions params)  { throw new RuntimeException(); }
  public  void dropHeaderLine (org.apache.spark.sql.execution.datasources.PartitionedFile file, scala.collection.Iterator<java.lang.String> lines, org.apache.spark.sql.execution.datasources.csv.CSVOptions csvOptions)  { throw new RuntimeException(); }
}
