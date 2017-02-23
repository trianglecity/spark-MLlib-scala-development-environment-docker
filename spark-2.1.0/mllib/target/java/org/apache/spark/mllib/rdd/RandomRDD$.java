package org.apache.spark.mllib.rdd;
public  class RandomRDD$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final RandomRDD$ MODULE$ = null;
  public   RandomRDD$ ()  { throw new RuntimeException(); }
  public <T extends java.lang.Object> org.apache.spark.Partition[] getPartitions (long size, int numPartitions, org.apache.spark.mllib.random.RandomDataGenerator<T> rng, long seed)  { throw new RuntimeException(); }
  public <T extends java.lang.Object> scala.collection.Iterator<T> getPointIterator (org.apache.spark.mllib.rdd.RandomRDDPartition<T> partition, scala.reflect.ClassTag<T> evidence$2)  { throw new RuntimeException(); }
  public  scala.collection.Iterator<org.apache.spark.mllib.linalg.Vector> getVectorIterator (org.apache.spark.mllib.rdd.RandomRDDPartition<java.lang.Object> partition, int vectorSize)  { throw new RuntimeException(); }
}
