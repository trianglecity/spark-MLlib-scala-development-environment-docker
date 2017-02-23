package org.apache.spark.sql.execution.columnar;
 abstract class NativeColumnBuilder<T extends org.apache.spark.sql.types.AtomicType> extends org.apache.spark.sql.execution.columnar.BasicColumnBuilder<java.lang.Object> implements org.apache.spark.sql.execution.columnar.NullableColumnBuilder, org.apache.spark.sql.execution.columnar.compression.AllCompressionSchemes, org.apache.spark.sql.execution.columnar.compression.CompressibleColumnBuilder<T> {
  public  org.apache.spark.sql.execution.columnar.ColumnStats columnStats ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.columnar.NativeColumnType<T> columnType ()  { throw new RuntimeException(); }
  // not preceding
  public   NativeColumnBuilder (org.apache.spark.sql.execution.columnar.ColumnStats columnStats, org.apache.spark.sql.execution.columnar.NativeColumnType<T> columnType)  { throw new RuntimeException(); }
}
