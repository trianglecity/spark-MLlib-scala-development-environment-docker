package org.apache.spark.sql.catalyst;
/**
 * Type-inference utilities for POJOs and Java collections.
 */
public  class JavaTypeInference {
  static private  com.google.common.reflect.TypeToken<java.lang.Iterable<?>> iterableType ()  { throw new RuntimeException(); }
  static private  com.google.common.reflect.TypeToken<java.util.Map<?, ?>> mapType ()  { throw new RuntimeException(); }
  static private  com.google.common.reflect.TypeToken<java.util.List<?>> listType ()  { throw new RuntimeException(); }
  static private  java.lang.reflect.Type iteratorReturnType ()  { throw new RuntimeException(); }
  static private  java.lang.reflect.Type nextReturnType ()  { throw new RuntimeException(); }
  static private  java.lang.reflect.Type keySetReturnType ()  { throw new RuntimeException(); }
  static private  java.lang.reflect.Type valuesReturnType ()  { throw new RuntimeException(); }
  /**
   * Infers the corresponding SQL data type of a JavaBean class.
   * @param beanClass Java type
   * @return (SQL data type, nullable)
   */
  static public  scala.Tuple2<org.apache.spark.sql.types.DataType, java.lang.Object> inferDataType (java.lang.Class<?> beanClass)  { throw new RuntimeException(); }
  /**
   * Infers the corresponding SQL data type of a Java type.
   * @param beanType Java type
   * @return (SQL data type, nullable)
   */
  static   scala.Tuple2<org.apache.spark.sql.types.DataType, java.lang.Object> inferDataType (java.lang.reflect.Type beanType)  { throw new RuntimeException(); }
  /**
   * Infers the corresponding SQL data type of a Java type.
   * @param typeToken Java type
   * @return (SQL data type, nullable)
   */
  static private  scala.Tuple2<org.apache.spark.sql.types.DataType, java.lang.Object> inferDataType (com.google.common.reflect.TypeToken<?> typeToken)  { throw new RuntimeException(); }
  static private  java.beans.PropertyDescriptor[] getJavaBeanProperties (java.lang.Class<?> beanClass)  { throw new RuntimeException(); }
  static private  com.google.common.reflect.TypeToken<?> elementType (com.google.common.reflect.TypeToken<?> typeToken)  { throw new RuntimeException(); }
  static private  scala.Tuple2<com.google.common.reflect.TypeToken<?>, com.google.common.reflect.TypeToken<?>> mapKeyValueType (com.google.common.reflect.TypeToken<?> typeToken)  { throw new RuntimeException(); }
  /**
   * Returns the Spark SQL DataType for a given java class.  Where this is not an exact mapping
   * to a native type, an ObjectType is returned.
   * <p>
   * Unlike <code>inferDataType</code>, this function doesn't do any massaging of types into the Spark SQL type
   * system.  As a result, ObjectType will be returned for things like boxed Integers.
   * @param cls (undocumented)
   * @return (undocumented)
   */
  static private  org.apache.spark.sql.types.DataType inferExternalType (java.lang.Class<?> cls)  { throw new RuntimeException(); }
  /**
   * Returns an expression that can be used to deserialize an internal row to an object of java bean
   * <code>T</code> with a compatible schema.  Fields of the row will be extracted using UnresolvedAttributes
   * of the same name as the constructor arguments.  Nested classes will have their fields accessed
   * using UnresolvedExtractValue.
   * @param beanClass (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.sql.catalyst.expressions.Expression deserializerFor (java.lang.Class<?> beanClass)  { throw new RuntimeException(); }
  static private  org.apache.spark.sql.catalyst.expressions.Expression deserializerFor (com.google.common.reflect.TypeToken<?> typeToken, scala.Option<org.apache.spark.sql.catalyst.expressions.Expression> path)  { throw new RuntimeException(); }
  /**
   * Returns an expression for serializing an object of the given type to an internal row.
   * @param beanClass (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.sql.catalyst.expressions.CreateNamedStruct serializerFor (java.lang.Class<?> beanClass)  { throw new RuntimeException(); }
  static private  org.apache.spark.sql.catalyst.expressions.Expression serializerFor (org.apache.spark.sql.catalyst.expressions.Expression inputObject, com.google.common.reflect.TypeToken<?> typeToken)  { throw new RuntimeException(); }
}
