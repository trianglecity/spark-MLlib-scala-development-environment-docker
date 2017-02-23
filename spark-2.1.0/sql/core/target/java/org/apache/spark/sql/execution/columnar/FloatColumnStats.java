package org.apache.spark.sql.execution.columnar;
  class FloatColumnStats implements org.apache.spark.sql.execution.columnar.ColumnStats {
  public   FloatColumnStats ()  { throw new RuntimeException(); }
  protected  float upper ()  { throw new RuntimeException(); }
  protected  float lower ()  { throw new RuntimeException(); }
  public  void gatherStats (org.apache.spark.sql.catalyst.InternalRow row, int ordinal)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.GenericInternalRow collectedStatistics ()  { throw new RuntimeException(); }
}
