package org.apache.spark.mllib.api.python;
/**
 * Basic SerDe utility class.
 */
 abstract class SerDeBase {
  public   SerDeBase ()  { throw new RuntimeException(); }
  public abstract  java.lang.String PYSPARK_PACKAGE ()  ;
  public abstract  void initialize ()  ;
  /**
   * Base class used for pickle
   */
   abstract class BasePickler<T extends java.lang.Object> implements net.razorvine.pickle.IObjectPickler, net.razorvine.pickle.IObjectConstructor {
    // not preceding
    // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
    public   BasePickler (scala.reflect.ClassTag<T> evidence$1)  { throw new RuntimeException(); }
    private  Object cls ()  { throw new RuntimeException(); }
    private  java.lang.String module ()  { throw new RuntimeException(); }
    private  java.lang.String name ()  { throw new RuntimeException(); }
    public  void register ()  { throw new RuntimeException(); }
    public  void pickle (java.lang.Object obj, java.io.OutputStream out, net.razorvine.pickle.Pickler pickler)  { throw new RuntimeException(); }
      void saveObjects (java.io.OutputStream out, net.razorvine.pickle.Pickler pickler, scala.collection.Seq<java.lang.Object> objects)  { throw new RuntimeException(); }
    protected  byte[] getBytes (java.lang.Object obj)  { throw new RuntimeException(); }
     abstract  void saveState (java.lang.Object obj, java.io.OutputStream out, net.razorvine.pickle.Pickler pickler)  ;
  }
  public  byte[] dumps (java.lang.Object obj)  { throw new RuntimeException(); }
  public  java.lang.Object loads (byte[] bytes)  { throw new RuntimeException(); }
  public  org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, java.lang.Object>> asTupleRDD (org.apache.spark.rdd.RDD<java.lang.Object[]> rdd)  { throw new RuntimeException(); }
  public  org.apache.spark.rdd.RDD<java.lang.Object[]> fromTuple2RDD (org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, java.lang.Object>> rdd)  { throw new RuntimeException(); }
  /**
   * Convert an RDD of Java objects to an RDD of serialized Python objects, that is usable by
   * PySpark.
   * @param jRDD (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.api.java.JavaRDD<byte[]> javaToPython (org.apache.spark.api.java.JavaRDD<java.lang.Object> jRDD)  { throw new RuntimeException(); }
  /**
   * Convert an RDD of serialized Python objects to RDD of objects, that is usable by PySpark.
   * @param pyRDD (undocumented)
   * @param batched (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.api.java.JavaRDD<java.lang.Object> pythonToJava (org.apache.spark.api.java.JavaRDD<byte[]> pyRDD, boolean batched)  { throw new RuntimeException(); }
}
