package org.apache.spark.examples.pythonconverters;
/**
 * Implementation of {@link org.apache.spark.api.python.Converter} that converts
 * an Avro IndexedRecord (e.g., derived from AvroParquetInputFormat) to a Java Map.
 */
public  class IndexedRecordToJavaConverter implements org.apache.spark.api.python.Converter<org.apache.avro.generic.IndexedRecord, java.util.Map<java.lang.String, java.lang.Object>> {
  public   IndexedRecordToJavaConverter ()  { throw new RuntimeException(); }
  public  java.util.Map<java.lang.String, java.lang.Object> convert (org.apache.avro.generic.IndexedRecord record)  { throw new RuntimeException(); }
}
