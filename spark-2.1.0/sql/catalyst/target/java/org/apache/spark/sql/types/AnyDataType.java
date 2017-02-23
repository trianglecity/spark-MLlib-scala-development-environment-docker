package org.apache.spark.sql.types;
/**
 * An {@link AbstractDataType} that matches any concrete data types.
 */
public  class AnyDataType {
  static   org.apache.spark.sql.types.DataType defaultConcreteType ()  { throw new RuntimeException(); }
  static   java.lang.String simpleString ()  { throw new RuntimeException(); }
  static   boolean acceptsType (org.apache.spark.sql.types.DataType other)  { throw new RuntimeException(); }
}
