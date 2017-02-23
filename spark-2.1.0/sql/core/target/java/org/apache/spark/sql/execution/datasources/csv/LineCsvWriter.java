package org.apache.spark.sql.execution.datasources.csv;
/**
 * Converts a sequence of string to CSV string
 * <p>
 * param:  params Parameters object for configuration
 * param:  headers headers for columns
 */
  class LineCsvWriter implements org.apache.spark.internal.Logging {
  public   LineCsvWriter (org.apache.spark.sql.execution.datasources.csv.CSVOptions params, scala.collection.Seq<java.lang.String> headers)  { throw new RuntimeException(); }
  private  com.univocity.parsers.csv.CsvWriterSettings writerSettings ()  { throw new RuntimeException(); }
  private  com.univocity.parsers.csv.CsvFormat format ()  { throw new RuntimeException(); }
  private  java.io.CharArrayWriter buffer ()  { throw new RuntimeException(); }
  private  com.univocity.parsers.csv.CsvWriter writer ()  { throw new RuntimeException(); }
  public  void writeRow (scala.collection.Seq<java.lang.String> row, boolean includeHeader)  { throw new RuntimeException(); }
  public  java.lang.String flush ()  { throw new RuntimeException(); }
  public  void close ()  { throw new RuntimeException(); }
}
