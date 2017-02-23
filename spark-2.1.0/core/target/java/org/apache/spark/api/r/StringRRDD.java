package org.apache.spark.api.r;
/**
 * An RDD that stores R objects as Array[String].
 */
public  class StringRRDD<T extends java.lang.Object> extends org.apache.spark.api.r.BaseRRDD<T, java.lang.String> {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   StringRRDD (org.apache.spark.rdd.RDD<T> parent, byte[] func, java.lang.String deserializer, byte[] packageNames, java.lang.Object[] broadcastVars, scala.reflect.ClassTag<T> evidence$5)  { throw new RuntimeException(); }
  public  org.apache.spark.api.java.JavaRDD<java.lang.String> asJavaRDD ()  { throw new RuntimeException(); }
}
