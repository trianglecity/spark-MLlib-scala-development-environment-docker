package org.apache.spark.examples.sql;
public  class SparkSQLExample {
  static public  class Person implements scala.Product, scala.Serializable {
    public  java.lang.String name ()  { throw new RuntimeException(); }
    public  long age ()  { throw new RuntimeException(); }
    // not preceding
    public   Person (java.lang.String name, long age)  { throw new RuntimeException(); }
  }
  static public  class Person$ extends scala.runtime.AbstractFunction2<java.lang.String, java.lang.Object, org.apache.spark.examples.sql.SparkSQLExample.Person> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Person$ MODULE$ = null;
    public   Person$ ()  { throw new RuntimeException(); }
  }
  static public  void main (java.lang.String[] args)  { throw new RuntimeException(); }
  static private  void runBasicDataFrameExample (org.apache.spark.sql.SparkSession spark)  { throw new RuntimeException(); }
  static private  void runDatasetCreationExample (org.apache.spark.sql.SparkSession spark)  { throw new RuntimeException(); }
  static private  void runInferSchemaExample (org.apache.spark.sql.SparkSession spark)  { throw new RuntimeException(); }
  static private  void runProgrammaticSchemaExample (org.apache.spark.sql.SparkSession spark)  { throw new RuntimeException(); }
}
