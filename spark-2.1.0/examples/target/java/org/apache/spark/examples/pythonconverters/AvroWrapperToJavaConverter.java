package org.apache.spark.examples.pythonconverters;
/**
 * Implementation of {@link org.apache.spark.api.python.Converter} that converts
 * an Avro Record wrapped in an AvroKey (or AvroValue) to a Java Map. It tries
 * to work with all 3 Avro data mappings (Generic, Specific and Reflect).
 */
public  class AvroWrapperToJavaConverter implements org.apache.spark.api.python.Converter<java.lang.Object, java.lang.Object> {
  public   AvroWrapperToJavaConverter ()  { throw new RuntimeException(); }
  public  Object convert (Object obj)  { throw new RuntimeException(); }
}
