package org.apache.spark.sql.execution.columnar;
  class ByteColumnStats implements org.apache.spark.sql.execution.columnar.ColumnStats {
  public   ByteColumnStats ()  { throw new RuntimeException(); }
  protected  byte upper ()  { throw new RuntimeException(); }
  protected  byte lower ()  { throw new RuntimeException(); }
  public  void gatherStats (org.apache.spark.sql.catalyst.InternalRow row, int ordinal)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.GenericInternalRow collectedStatistics ()  { throw new RuntimeException(); }
}
