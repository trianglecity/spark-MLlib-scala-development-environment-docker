package org.apache.spark.streaming.api.python;
/**
 * Helper functions, which are called from Python via Py4J.
 */
public  class PythonDStream$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final PythonDStream$ MODULE$ = null;
  public   PythonDStream$ ()  { throw new RuntimeException(); }
  /**
   * can not access PythonTransformFunctionSerializer.register() via Py4j
   * Py4JError: PythonTransformFunctionSerializerregister does not exist in the JVM
   * @param ser (undocumented)
   */
  public  void registerSerializer (org.apache.spark.streaming.api.python.PythonTransformFunctionSerializer ser)  { throw new RuntimeException(); }
  /**
   * helper function for DStream.foreachRDD(),
   * cannot be <code>foreachRDD</code>, it will confusing py4j
   * @param jdstream (undocumented)
   * @param pfunc (undocumented)
   */
  public  void callForeachRDD (org.apache.spark.streaming.api.java.JavaDStream<byte[]> jdstream, org.apache.spark.streaming.api.python.PythonTransformFunction pfunc)  { throw new RuntimeException(); }
  /**
   * convert list of RDD into queue of RDDs, for ssc.queueStream()
   * @param rdds (undocumented)
   * @return (undocumented)
   */
  public  java.util.Queue<org.apache.spark.api.java.JavaRDD<byte[]>> toRDDQueue (java.util.ArrayList<org.apache.spark.api.java.JavaRDD<byte[]>> rdds)  { throw new RuntimeException(); }
  /**
   * Stop {@link StreamingContext} if the Python process crashes (E.g., OOM) in case the user cannot
   * stop it in the Python side.
   * @param e (undocumented)
   */
  public  void stopStreamingContextIfPythonProcessIsDead (java.lang.Throwable e)  { throw new RuntimeException(); }
}
