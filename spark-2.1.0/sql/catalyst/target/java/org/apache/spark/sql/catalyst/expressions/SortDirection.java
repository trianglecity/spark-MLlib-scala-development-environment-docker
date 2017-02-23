package org.apache.spark.sql.catalyst.expressions;
public abstract class SortDirection {
  public   SortDirection ()  { throw new RuntimeException(); }
  public abstract  java.lang.String sql ()  ;
  public abstract  org.apache.spark.sql.catalyst.expressions.NullOrdering defaultNullOrdering ()  ;
}
