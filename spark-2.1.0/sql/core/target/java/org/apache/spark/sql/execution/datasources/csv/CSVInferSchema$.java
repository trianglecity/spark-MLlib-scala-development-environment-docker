package org.apache.spark.sql.execution.datasources.csv;
public  class CSVInferSchema$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final CSVInferSchema$ MODULE$ = null;
  public   CSVInferSchema$ ()  { throw new RuntimeException(); }
  /**
   * Similar to the JSON schema inference
   *     1. Infer type of each row
   *     2. Merge row types to find common type
   *     3. Replace any null types with string type
   * @param tokenRdd (undocumented)
   * @param header (undocumented)
   * @param options (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.types.StructType infer (org.apache.spark.rdd.RDD<java.lang.String[]> tokenRdd, java.lang.String[] header, org.apache.spark.sql.execution.datasources.csv.CSVOptions options)  { throw new RuntimeException(); }
  private  org.apache.spark.sql.types.DataType[] inferRowType (org.apache.spark.sql.execution.datasources.csv.CSVOptions options, org.apache.spark.sql.types.DataType[] rowSoFar, java.lang.String[] next)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType[] mergeRowTypes (org.apache.spark.sql.types.DataType[] first, org.apache.spark.sql.types.DataType[] second)  { throw new RuntimeException(); }
  /**
   * Infer type of string field. Given known type Double, and a string "1", there is no
   * point checking if it is an Int, as the final type must be Double or higher.
   * @param typeSoFar (undocumented)
   * @param field (undocumented)
   * @param options (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.types.DataType inferField (org.apache.spark.sql.types.DataType typeSoFar, java.lang.String field, org.apache.spark.sql.execution.datasources.csv.CSVOptions options)  { throw new RuntimeException(); }
  private  org.apache.spark.sql.types.DataType tryParseInteger (java.lang.String field, org.apache.spark.sql.execution.datasources.csv.CSVOptions options)  { throw new RuntimeException(); }
  private  org.apache.spark.sql.types.DataType tryParseLong (java.lang.String field, org.apache.spark.sql.execution.datasources.csv.CSVOptions options)  { throw new RuntimeException(); }
  private  org.apache.spark.sql.types.DataType tryParseDecimal (java.lang.String field, org.apache.spark.sql.execution.datasources.csv.CSVOptions options)  { throw new RuntimeException(); }
  private  org.apache.spark.sql.types.DataType tryParseDouble (java.lang.String field, org.apache.spark.sql.execution.datasources.csv.CSVOptions options)  { throw new RuntimeException(); }
  private  org.apache.spark.sql.types.DataType tryParseTimestamp (java.lang.String field, org.apache.spark.sql.execution.datasources.csv.CSVOptions options)  { throw new RuntimeException(); }
  private  org.apache.spark.sql.types.DataType tryParseBoolean (java.lang.String field, org.apache.spark.sql.execution.datasources.csv.CSVOptions options)  { throw new RuntimeException(); }
  private  org.apache.spark.sql.types.DataType stringType ()  { throw new RuntimeException(); }
  private  scala.collection.IndexedSeq<org.apache.spark.sql.types.DataType> numericPrecedence ()  { throw new RuntimeException(); }
  /**
   * Copied from internal Spark api
   * {@link org.apache.spark.sql.catalyst.analysis.TypeCoercion}
   * @return (undocumented)
   */
  public  scala.Function2<org.apache.spark.sql.types.DataType, org.apache.spark.sql.types.DataType, scala.Option<org.apache.spark.sql.types.DataType>> findTightestCommonType ()  { throw new RuntimeException(); }
}
