package org.apache.spark.sql.execution.columnar;
 abstract class ComplexColumnBuilder<JvmType extends java.lang.Object> extends org.apache.spark.sql.execution.columnar.BasicColumnBuilder<JvmType> implements org.apache.spark.sql.execution.columnar.NullableColumnBuilder {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   ComplexColumnBuilder (org.apache.spark.sql.execution.columnar.ColumnStats columnStats, org.apache.spark.sql.execution.columnar.ColumnType<JvmType> columnType)  { throw new RuntimeException(); }
}
