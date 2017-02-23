package org.apache.spark.ml.linalg;
/**
 * User-defined type for {@link Matrix} in {@link mllib-local} which allows easy interaction with SQL
 * via {@link org.apache.spark.sql.Dataset}.
 */
  class MatrixUDT extends org.apache.spark.sql.types.UserDefinedType<org.apache.spark.ml.linalg.Matrix> {
  public   MatrixUDT ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType sqlType ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.InternalRow serialize (org.apache.spark.ml.linalg.Matrix obj)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.linalg.Matrix deserialize (Object datum)  { throw new RuntimeException(); }
  public  java.lang.Class<org.apache.spark.ml.linalg.Matrix> userClass ()  { throw new RuntimeException(); }
  public  boolean equals (Object o)  { throw new RuntimeException(); }
  public  int hashCode ()  { throw new RuntimeException(); }
  public  java.lang.String typeName ()  { throw new RuntimeException(); }
  public  java.lang.String pyUDT ()  { throw new RuntimeException(); }
    org.apache.spark.ml.linalg.MatrixUDT asNullable ()  { throw new RuntimeException(); }
}
