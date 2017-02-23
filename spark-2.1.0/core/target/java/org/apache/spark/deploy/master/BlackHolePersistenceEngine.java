package org.apache.spark.deploy.master;
  class BlackHolePersistenceEngine extends org.apache.spark.deploy.master.PersistenceEngine {
  public   BlackHolePersistenceEngine ()  { throw new RuntimeException(); }
  public  void persist (java.lang.String name, java.lang.Object obj)  { throw new RuntimeException(); }
  public  void unpersist (java.lang.String name)  { throw new RuntimeException(); }
  public <T extends java.lang.Object> scala.collection.Seq<T> read (java.lang.String name, scala.reflect.ClassTag<T> evidence$2)  { throw new RuntimeException(); }
}
