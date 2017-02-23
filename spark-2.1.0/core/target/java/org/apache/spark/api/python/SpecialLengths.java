package org.apache.spark.api.python;
public  class SpecialLengths {
  static public  int END_OF_DATA_SECTION ()  { throw new RuntimeException(); }
  static public  int PYTHON_EXCEPTION_THROWN ()  { throw new RuntimeException(); }
  static public  int TIMING_DATA ()  { throw new RuntimeException(); }
  static public  int END_OF_STREAM ()  { throw new RuntimeException(); }
  static public  int NULL ()  { throw new RuntimeException(); }
}
