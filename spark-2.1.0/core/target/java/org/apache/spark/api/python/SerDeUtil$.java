package org.apache.spark.api.python;
/** Utilities for serialization / deserialization between Python and Java, using Pickle. */
public  class SerDeUtil$ implements org.apache.spark.internal.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final SerDeUtil$ MODULE$ = null;
  public   SerDeUtil$ ()  { throw new RuntimeException(); }
  private  boolean initialized ()  { throw new RuntimeException(); }
  public  void initialize ()  { throw new RuntimeException(); }
  /**
   * Convert an RDD of Java objects to Array (no recursive conversions).
   * It is only used by pyspark.sql.
   * @param jrdd (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.api.java.JavaRDD<java.lang.Object> toJavaArray (org.apache.spark.api.java.JavaRDD<java.lang.Object> jrdd)  { throw new RuntimeException(); }
  /**
   * Convert an RDD of Java objects to an RDD of serialized Python objects, that is usable by
   * PySpark.
   * @param jRDD (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.api.java.JavaRDD<byte[]> javaToPython (org.apache.spark.api.java.JavaRDD<?> jRDD)  { throw new RuntimeException(); }
  /**
   * Convert an RDD of serialized Python objects to RDD of objects, that is usable by PySpark.
   * @param pyRDD (undocumented)
   * @param batched (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.api.java.JavaRDD<java.lang.Object> pythonToJava (org.apache.spark.api.java.JavaRDD<byte[]> pyRDD, boolean batched)  { throw new RuntimeException(); }
  private  scala.Tuple2<java.lang.Object, java.lang.Object> checkPickle (scala.Tuple2<java.lang.Object, java.lang.Object> t)  { throw new RuntimeException(); }
  /**
   * Convert an RDD of key-value pairs to an RDD of serialized Python objects, that is usable
   * by PySpark. By default, if serialization fails, toString is called and the string
   * representation is serialized
   * @param rdd (undocumented)
   * @param batchSize (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.rdd.RDD<byte[]> pairRDDToPython (org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, java.lang.Object>> rdd, int batchSize)  { throw new RuntimeException(); }
  /**
   * Convert an RDD of serialized Python tuple (K, V) to RDD[(K, V)].
   * @param pyRDD (undocumented)
   * @param batched (undocumented)
   * @return (undocumented)
   */
  public <K extends java.lang.Object, V extends java.lang.Object> org.apache.spark.rdd.RDD<scala.Tuple2<K, V>> pythonToPairRDD (org.apache.spark.rdd.RDD<byte[]> pyRDD, boolean batched)  { throw new RuntimeException(); }
}
