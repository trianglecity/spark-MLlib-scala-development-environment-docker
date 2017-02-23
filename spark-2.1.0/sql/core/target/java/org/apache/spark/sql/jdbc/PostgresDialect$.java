package org.apache.spark.sql.jdbc;
public  class PostgresDialect$ extends org.apache.spark.sql.jdbc.JdbcDialect {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final PostgresDialect$ MODULE$ = null;
  public   PostgresDialect$ ()  { throw new RuntimeException(); }
  public  boolean canHandle (java.lang.String url)  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.types.DataType> getCatalystType (int sqlType, java.lang.String typeName, int size, org.apache.spark.sql.types.MetadataBuilder md)  { throw new RuntimeException(); }
  private  scala.Option<org.apache.spark.sql.types.DataType> toCatalystType (java.lang.String typeName, int precision, int scale)  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.jdbc.JdbcType> getJDBCType (org.apache.spark.sql.types.DataType dt)  { throw new RuntimeException(); }
  public  java.lang.String getTableExistsQuery (java.lang.String table)  { throw new RuntimeException(); }
  public  void beforeFetch (java.sql.Connection connection, scala.collection.immutable.Map<java.lang.String, java.lang.String> properties)  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> isCascadingTruncateTable ()  { throw new RuntimeException(); }
}
