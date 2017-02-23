package org.apache.spark.sql.execution.ui;
public  class SparkListenerSQLExecutionStart implements org.apache.spark.scheduler.SparkListenerEvent, scala.Product, scala.Serializable {
  static protected  boolean logEvent ()  { throw new RuntimeException(); }
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  long executionId ()  { throw new RuntimeException(); }
  public  java.lang.String description ()  { throw new RuntimeException(); }
  public  java.lang.String details ()  { throw new RuntimeException(); }
  public  java.lang.String physicalPlanDescription ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.SparkPlanInfo sparkPlanInfo ()  { throw new RuntimeException(); }
  public  long time ()  { throw new RuntimeException(); }
  // not preceding
  public   SparkListenerSQLExecutionStart (long executionId, java.lang.String description, java.lang.String details, java.lang.String physicalPlanDescription, org.apache.spark.sql.execution.SparkPlanInfo sparkPlanInfo, long time)  { throw new RuntimeException(); }
}
