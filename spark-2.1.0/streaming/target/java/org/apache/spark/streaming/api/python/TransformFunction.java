package org.apache.spark.streaming.api.python;
/**
 * Wraps a PythonTransformFunction (which is a Python object accessed through Py4J)
 * so that it looks like a Scala function and can be transparently serialized and
 * deserialized by Java.
 */
  class TransformFunction implements org.apache.spark.api.java.function.Function2<java.util.List<org.apache.spark.api.java.JavaRDD<?>>, org.apache.spark.streaming.Time, org.apache.spark.api.java.JavaRDD<byte[]>> {
  public  org.apache.spark.streaming.api.python.PythonTransformFunction pfunc ()  { throw new RuntimeException(); }
  // not preceding
  public   TransformFunction (org.apache.spark.streaming.api.python.PythonTransformFunction pfunc)  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.rdd.RDD<byte[]>> apply (scala.Option<org.apache.spark.rdd.RDD<?>> rdd, org.apache.spark.streaming.Time time)  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.rdd.RDD<byte[]>> apply (scala.Option<org.apache.spark.rdd.RDD<?>> rdd, scala.Option<org.apache.spark.rdd.RDD<?>> rdd2, org.apache.spark.streaming.Time time)  { throw new RuntimeException(); }
  public  org.apache.spark.api.java.JavaRDD<byte[]> call (java.util.List<org.apache.spark.api.java.JavaRDD<?>> rdds, org.apache.spark.streaming.Time time)  { throw new RuntimeException(); }
  private  org.apache.spark.api.java.JavaRDD<byte[]> callPythonTransformFunction (long time, java.util.List<?> rdds)  { throw new RuntimeException(); }
  private  void writeObject (java.io.ObjectOutputStream out)  { throw new RuntimeException(); }
  private  void readObject (java.io.ObjectInputStream in)  { throw new RuntimeException(); }
}
