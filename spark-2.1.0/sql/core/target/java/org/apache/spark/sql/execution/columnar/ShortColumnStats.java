package org.apache.spark.sql.execution.columnar;
  class ShortColumnStats implements org.apache.spark.sql.execution.columnar.ColumnStats {
  public   ShortColumnStats ()  { throw new RuntimeException(); }
  protected  short upper ()  { throw new RuntimeException(); }
  protected  short lower ()  { throw new RuntimeException(); }
  public  void gatherStats (org.apache.spark.sql.catalyst.InternalRow row, int ordinal)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.GenericInternalRow collectedStatistics ()  { throw new RuntimeException(); }
}
