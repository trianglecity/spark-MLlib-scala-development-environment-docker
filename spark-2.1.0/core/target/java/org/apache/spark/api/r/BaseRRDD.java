package org.apache.spark.api.r;
public abstract class BaseRRDD<T extends java.lang.Object, U extends java.lang.Object> extends org.apache.spark.rdd.RDD<U> implements org.apache.spark.internal.Logging {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   BaseRRDD (org.apache.spark.rdd.RDD<T> parent, int numPartitions, byte[] func, java.lang.String deserializer, java.lang.String serializer, byte[] packageNames, org.apache.spark.broadcast.Broadcast<java.lang.Object>[] broadcastVars, scala.reflect.ClassTag<T> evidence$1, scala.reflect.ClassTag<U> evidence$2)  { throw new RuntimeException(); }
  public  org.apache.spark.Partition[] getPartitions ()  { throw new RuntimeException(); }
  public  scala.collection.Iterator<U> compute (org.apache.spark.Partition partition, org.apache.spark.TaskContext context)  { throw new RuntimeException(); }
}
