package org.apache.spark.ml.linalg;
/**
 * User-defined type for {@link Vector} in {@link mllib-local} which allows easy interaction with SQL
 * via {@link org.apache.spark.sql.Dataset}.
 */
  class VectorUDT extends org.apache.spark.sql.types.UserDefinedType<org.apache.spark.ml.linalg.Vector> {
  public   VectorUDT ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType sqlType ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.InternalRow serialize (org.apache.spark.ml.linalg.Vector obj)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.linalg.Vector deserialize (Object datum)  { throw new RuntimeException(); }
  public  java.lang.String pyUDT ()  { throw new RuntimeException(); }
  public  java.lang.Class<org.apache.spark.ml.linalg.Vector> userClass ()  { throw new RuntimeException(); }
  public  boolean equals (Object o)  { throw new RuntimeException(); }
  public  int hashCode ()  { throw new RuntimeException(); }
  public  java.lang.String typeName ()  { throw new RuntimeException(); }
    org.apache.spark.ml.linalg.VectorUDT asNullable ()  { throw new RuntimeException(); }
}
