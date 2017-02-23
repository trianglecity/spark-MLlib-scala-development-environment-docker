package org.apache.spark.sql.execution.columnar;
  class ObjectColumnStats implements org.apache.spark.sql.execution.columnar.ColumnStats {
  public   ObjectColumnStats (org.apache.spark.sql.types.DataType dataType)  { throw new RuntimeException(); }
  public  Object columnType ()  { throw new RuntimeException(); }
  public  void gatherStats (org.apache.spark.sql.catalyst.InternalRow row, int ordinal)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.GenericInternalRow collectedStatistics ()  { throw new RuntimeException(); }
}
