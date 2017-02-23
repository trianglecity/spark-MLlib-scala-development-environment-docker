package org.apache.spark.examples.streaming;
/** Lazily instantiated singleton instance of SparkSession */
public  class SparkSessionSingleton {
  static private  org.apache.spark.sql.SparkSession instance ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.SparkSession getInstance (org.apache.spark.SparkConf sparkConf)  { throw new RuntimeException(); }
}
