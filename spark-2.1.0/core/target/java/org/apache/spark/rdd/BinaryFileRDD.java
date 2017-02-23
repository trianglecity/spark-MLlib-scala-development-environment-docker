package org.apache.spark.rdd;
  class BinaryFileRDD<T extends java.lang.Object> extends org.apache.spark.rdd.NewHadoopRDD<java.lang.String, T> {
  private  org.apache.spark.SparkContext sc ()  { throw new RuntimeException(); }
  // not preceding
  public   BinaryFileRDD (org.apache.spark.SparkContext sc, java.lang.Class<? extends org.apache.spark.input.StreamFileInputFormat<T>> inputFormatClass, java.lang.Class<java.lang.String> keyClass, java.lang.Class<T> valueClass, org.apache.hadoop.conf.Configuration conf, int minPartitions)  { throw new RuntimeException(); }
  public  org.apache.spark.Partition[] getPartitions ()  { throw new RuntimeException(); }
}
