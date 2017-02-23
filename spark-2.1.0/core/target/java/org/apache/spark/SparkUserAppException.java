package org.apache.spark;
/**
 * Exception thrown when the main user code is run as a child process (e.g. pyspark) and we want
 * the parent SparkSubmit process to exit with the same exit code.
 */
  class SparkUserAppException extends org.apache.spark.SparkException implements scala.Product, scala.Serializable {
  static public  java.lang.String getMessage ()  { throw new RuntimeException(); }
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
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  int exitCode ()  { throw new RuntimeException(); }
  // not preceding
  public   SparkUserAppException (int exitCode)  { throw new RuntimeException(); }
}
