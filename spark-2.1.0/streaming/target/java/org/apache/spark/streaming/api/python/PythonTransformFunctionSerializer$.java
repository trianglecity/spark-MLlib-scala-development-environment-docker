package org.apache.spark.streaming.api.python;
/**
 * Helpers for PythonTransformFunctionSerializer
 * <p>
 * PythonTransformFunctionSerializer is logically a singleton that's happens to be
 * implemented as a Python object.
 */
public  class PythonTransformFunctionSerializer$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final PythonTransformFunctionSerializer$ MODULE$ = null;
  public   PythonTransformFunctionSerializer$ ()  { throw new RuntimeException(); }
  /**
   * A serializer in Python, used to serialize PythonTransformFunction
   * @return (undocumented)
   */
  private  org.apache.spark.streaming.api.python.PythonTransformFunctionSerializer serializer ()  { throw new RuntimeException(); }
  public  void register (org.apache.spark.streaming.api.python.PythonTransformFunctionSerializer ser)  { throw new RuntimeException(); }
  public  byte[] serialize (org.apache.spark.streaming.api.python.PythonTransformFunction func)  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.api.python.PythonTransformFunction deserialize (byte[] bytes)  { throw new RuntimeException(); }
}
