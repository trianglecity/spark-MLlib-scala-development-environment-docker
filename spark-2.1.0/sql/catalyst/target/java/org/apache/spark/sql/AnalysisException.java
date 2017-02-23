package org.apache.spark.sql;
/**
 * Thrown when a query fails to analyze, usually because the query itself is invalid.
 * <p>
 * @since 1.3.0
 */
public  class AnalysisException extends java.lang.Exception implements scala.Serializable {
  static public  java.lang.String getLocalizedMessage ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable getCause ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable initCause (java.lang.Throwable x$1)  { throw new RuntimeException(); }
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  static public  void printStackTrace ()  { throw new RuntimeException(); }
  static public  void printStackTrace (java.io.PrintStream x$1)  { throw new RuntimeException(); }
  static public  void printStackTrace (java.io.PrintWriter x$1)  { throw new RuntimeException(); }
  static public  java.lang.Throwable fillInStackTrace ()  { throw new RuntimeException(); }
  static public  java.lang.StackTraceElement[] getStackTrace ()  { throw new RuntimeException(); }
  static public  void setStackTrace (java.lang.StackTraceElement[] x$1)  { throw new RuntimeException(); }
  static   int getStackTraceDepth ()  { throw new RuntimeException(); }
  static   java.lang.StackTraceElement getStackTraceElement (int x$1)  { throw new RuntimeException(); }
  static public final  void addSuppressed (java.lang.Throwable x$1)  { throw new RuntimeException(); }
  static public final  java.lang.Throwable[] getSuppressed ()  { throw new RuntimeException(); }
  public  java.lang.String message ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> line ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> startPosition ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> plan ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Throwable> cause ()  { throw new RuntimeException(); }
  // not preceding
  protected   AnalysisException (java.lang.String message, scala.Option<java.lang.Object> line, scala.Option<java.lang.Object> startPosition, scala.Option<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> plan, scala.Option<java.lang.Throwable> cause)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.AnalysisException withPosition (scala.Option<java.lang.Object> line, scala.Option<java.lang.Object> startPosition)  { throw new RuntimeException(); }
  public  java.lang.String getMessage ()  { throw new RuntimeException(); }
  public  java.lang.String getSimpleMessage ()  { throw new RuntimeException(); }
}
