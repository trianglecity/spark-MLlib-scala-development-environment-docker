package org.apache.spark.sql.execution.datasources.csv;
/**
 * Read and parse CSV-like input
 * <p>
 * param:  params Parameters object
 */
  class CsvReader {
  public   CsvReader (org.apache.spark.sql.execution.datasources.csv.CSVOptions params)  { throw new RuntimeException(); }
  private  com.univocity.parsers.csv.CsvParser parser ()  { throw new RuntimeException(); }
  /**
   * parse a line
   * <p>
   * @param line a String with no newline at the end
   * @return array of strings where each string is a field in the CSV record
   */
  public  java.lang.String[] parseLine (java.lang.String line)  { throw new RuntimeException(); }
}
