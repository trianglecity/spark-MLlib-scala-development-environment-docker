package org.apache.spark.mllib.api.python;
/**
 * SerDe utility functions for PythonMLLibAPI.
 */
public  class SerDe {
  static   class DenseVectorPickler extends org.apache.spark.mllib.api.python.SerDeBase.BasePickler<org.apache.spark.mllib.linalg.DenseVector> {
    public   DenseVectorPickler ()  { throw new RuntimeException(); }
    public  void saveState (java.lang.Object obj, java.io.OutputStream out, net.razorvine.pickle.Pickler pickler)  { throw new RuntimeException(); }
    public  java.lang.Object construct (java.lang.Object[] args)  { throw new RuntimeException(); }
  }
  static   class DenseMatrixPickler extends org.apache.spark.mllib.api.python.SerDeBase.BasePickler<org.apache.spark.mllib.linalg.DenseMatrix> {
    public   DenseMatrixPickler ()  { throw new RuntimeException(); }
    public  void saveState (java.lang.Object obj, java.io.OutputStream out, net.razorvine.pickle.Pickler pickler)  { throw new RuntimeException(); }
    public  java.lang.Object construct (java.lang.Object[] args)  { throw new RuntimeException(); }
  }
  static   class SparseMatrixPickler extends org.apache.spark.mllib.api.python.SerDeBase.BasePickler<org.apache.spark.mllib.linalg.SparseMatrix> {
    public   SparseMatrixPickler ()  { throw new RuntimeException(); }
    public  void saveState (java.lang.Object obj, java.io.OutputStream out, net.razorvine.pickle.Pickler pickler)  { throw new RuntimeException(); }
    public  java.lang.Object construct (java.lang.Object[] args)  { throw new RuntimeException(); }
  }
  static   class SparseVectorPickler extends org.apache.spark.mllib.api.python.SerDeBase.BasePickler<org.apache.spark.mllib.linalg.SparseVector> {
    public   SparseVectorPickler ()  { throw new RuntimeException(); }
    public  void saveState (java.lang.Object obj, java.io.OutputStream out, net.razorvine.pickle.Pickler pickler)  { throw new RuntimeException(); }
    public  java.lang.Object construct (java.lang.Object[] args)  { throw new RuntimeException(); }
  }
  static   class LabeledPointPickler extends org.apache.spark.mllib.api.python.SerDeBase.BasePickler<org.apache.spark.mllib.regression.LabeledPoint> {
    public   LabeledPointPickler ()  { throw new RuntimeException(); }
    public  void saveState (java.lang.Object obj, java.io.OutputStream out, net.razorvine.pickle.Pickler pickler)  { throw new RuntimeException(); }
    public  java.lang.Object construct (java.lang.Object[] args)  { throw new RuntimeException(); }
  }
  static   class RatingPickler extends org.apache.spark.mllib.api.python.SerDeBase.BasePickler<org.apache.spark.mllib.recommendation.Rating> {
    public   RatingPickler ()  { throw new RuntimeException(); }
    public  void saveState (java.lang.Object obj, java.io.OutputStream out, net.razorvine.pickle.Pickler pickler)  { throw new RuntimeException(); }
    public  java.lang.Object construct (java.lang.Object[] args)  { throw new RuntimeException(); }
    private  int ratingsIdCheckLong (java.lang.Object obj)  { throw new RuntimeException(); }
  }
  static public  java.lang.String PYSPARK_PACKAGE ()  { throw new RuntimeException(); }
  static public  boolean initialized ()  { throw new RuntimeException(); }
  static public  void initialize ()  { throw new RuntimeException(); }
  static public  byte[] dumps (java.lang.Object obj)  { throw new RuntimeException(); }
  static public  java.lang.Object loads (byte[] bytes)  { throw new RuntimeException(); }
  static public  org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, java.lang.Object>> asTupleRDD (org.apache.spark.rdd.RDD<java.lang.Object[]> rdd)  { throw new RuntimeException(); }
  static public  org.apache.spark.rdd.RDD<java.lang.Object[]> fromTuple2RDD (org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, java.lang.Object>> rdd)  { throw new RuntimeException(); }
  static public  org.apache.spark.api.java.JavaRDD<byte[]> javaToPython (org.apache.spark.api.java.JavaRDD<java.lang.Object> jRDD)  { throw new RuntimeException(); }
  static public  org.apache.spark.api.java.JavaRDD<java.lang.Object> pythonToJava (org.apache.spark.api.java.JavaRDD<byte[]> pyRDD, boolean batched)  { throw new RuntimeException(); }
}
