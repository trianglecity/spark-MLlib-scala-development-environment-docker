package org.apache.spark.mllib.rdd;
  class RandomRDDPartition<T extends java.lang.Object> implements org.apache.spark.Partition {
  public  int index ()  { throw new RuntimeException(); }
  public  int size ()  { throw new RuntimeException(); }
  public  org.apache.spark.mllib.random.RandomDataGenerator<T> generator ()  { throw new RuntimeException(); }
  public  long seed ()  { throw new RuntimeException(); }
  // not preceding
  public   RandomRDDPartition (int index, int size, org.apache.spark.mllib.random.RandomDataGenerator<T> generator, long seed)  { throw new RuntimeException(); }
}
