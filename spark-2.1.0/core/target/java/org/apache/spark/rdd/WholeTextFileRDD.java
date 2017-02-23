package org.apache.spark.rdd;
/**
 * An RDD that reads a bunch of text files in, and each text file becomes one record.
 */
  class WholeTextFileRDD extends org.apache.spark.rdd.NewHadoopRDD<org.apache.hadoop.io.Text, org.apache.hadoop.io.Text> {
  public   WholeTextFileRDD (org.apache.spark.SparkContext sc, java.lang.Class<? extends org.apache.spark.input.WholeTextFileInputFormat> inputFormatClass, java.lang.Class<org.apache.hadoop.io.Text> keyClass, java.lang.Class<org.apache.hadoop.io.Text> valueClass, org.apache.hadoop.conf.Configuration conf, int minPartitions)  { throw new RuntimeException(); }
  public  org.apache.spark.Partition[] getPartitions ()  { throw new RuntimeException(); }
}
