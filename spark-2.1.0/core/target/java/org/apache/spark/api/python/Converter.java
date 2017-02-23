package org.apache.spark.api.python;
/**
 * A trait for use with reading custom classes in PySpark. Implement this trait and add custom
 * transformation code by overriding the convert method.
 */
public  interface Converter<T extends java.lang.Object, U extends java.lang.Object> extends scala.Serializable {
  public  U convert (T obj)  ;
}
