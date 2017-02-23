package org.apache.spark.api.python;
public  class PythonUtils {
  /** Get the PYTHONPATH for PySpark, either from SPARK_HOME, if it is set, or from our JAR */
  static public  java.lang.String sparkPythonPath ()  { throw new RuntimeException(); }
  /** Merge PYTHONPATHS with the appropriate separator. Ignores blank strings. */
  static public  java.lang.String mergePythonPaths (scala.collection.Seq<java.lang.String> paths)  { throw new RuntimeException(); }
  static public  org.apache.spark.api.java.JavaRDD<java.lang.String> generateRDDWithNull (org.apache.spark.api.java.JavaSparkContext sc)  { throw new RuntimeException(); }
  /**
   * Convert list of T into seq of T (for calling API with varargs)
   * @param vs (undocumented)
   * @return (undocumented)
   */
  static public <T extends java.lang.Object> scala.collection.Seq<T> toSeq (java.util.List<T> vs)  { throw new RuntimeException(); }
  /**
   * Convert list of T into a (Scala) List of T
   * @param vs (undocumented)
   * @return (undocumented)
   */
  static public <T extends java.lang.Object> scala.collection.immutable.List<T> toList (java.util.List<T> vs)  { throw new RuntimeException(); }
  /**
   * Convert list of T into array of T (for calling API with array)
   * @param vs (undocumented)
   * @return (undocumented)
   */
  static public <T extends java.lang.Object> java.lang.Object toArray (java.util.List<T> vs)  { throw new RuntimeException(); }
  /**
   * Convert java map of K, V into Map of K, V (for calling API with varargs)
   * @param jm (undocumented)
   * @return (undocumented)
   */
  static public <K extends java.lang.Object, V extends java.lang.Object> scala.collection.immutable.Map<K, V> toScalaMap (java.util.Map<K, V> jm)  { throw new RuntimeException(); }
}
