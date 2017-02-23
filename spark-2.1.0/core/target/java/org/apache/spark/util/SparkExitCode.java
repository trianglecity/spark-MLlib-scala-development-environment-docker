package org.apache.spark.util;
public  class SparkExitCode {
  /** The default uncaught exception handler was reached. */
  static public  int UNCAUGHT_EXCEPTION ()  { throw new RuntimeException(); }
  /** The default uncaught exception handler was called and an exception was encountered while
   * @return (undocumented)
   logging the exception. */
  static public  int UNCAUGHT_EXCEPTION_TWICE ()  { throw new RuntimeException(); }
  /** The default uncaught exception handler was reached, and the uncaught exception was an
   * @return (undocumented)
   OutOfMemoryError. */
  static public  int OOM ()  { throw new RuntimeException(); }
}
