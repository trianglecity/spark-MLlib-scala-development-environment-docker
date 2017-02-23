package org.apache.spark.mllib.linalg;
/**
 * :: AlphaComponent ::
 * <p>
 * User-defined type for {@link Vector} which allows easy interaction with SQL
 * via {@link org.apache.spark.sql.Dataset}.
 */
public  class VectorUDT extends org.apache.spark.sql.types.UserDefinedType<org.apache.spark.mllib.linalg.Vector> {
  public   VectorUDT ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType sqlType ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.InternalRow serialize (org.apache.spark.mllib.linalg.Vector obj)  { throw new RuntimeException(); }
  public  org.apache.spark.mllib.linalg.Vector deserialize (Object datum)  { throw new RuntimeException(); }
  public  java.lang.String pyUDT ()  { throw new RuntimeException(); }
  public  java.lang.Class<org.apache.spark.mllib.linalg.Vector> userClass ()  { throw new RuntimeException(); }
  public  boolean equals (Object o)  { throw new RuntimeException(); }
  public  int hashCode ()  { throw new RuntimeException(); }
  public  java.lang.String typeName ()  { throw new RuntimeException(); }
    org.apache.spark.mllib.linalg.VectorUDT asNullable ()  { throw new RuntimeException(); }
}
