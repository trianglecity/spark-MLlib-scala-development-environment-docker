package org.apache.spark.streaming.api.java;
/**
 * JavaStreamingContext object contains a number of utility functions.
 */
public  class JavaStreamingContext$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final JavaStreamingContext$ MODULE$ = null;
  public   JavaStreamingContext$ ()  { throw new RuntimeException(); }
  /**
   * Either recreate a StreamingContext from checkpoint data or create a new StreamingContext.
   * If checkpoint data exists in the provided <code>checkpointPath</code>, then StreamingContext will be
   * recreated from the checkpoint data. If the data does not exist, then the provided factory
   * will be used to create a JavaStreamingContext.
   * <p>
   * @param checkpointPath Checkpoint directory used in an earlier JavaStreamingContext program
   * @param creatingFunc   Function to create a new JavaStreamingContext
   * @return (undocumented)
   */
  public  org.apache.spark.streaming.api.java.JavaStreamingContext getOrCreate (java.lang.String checkpointPath, org.apache.spark.api.java.function.Function0<org.apache.spark.streaming.api.java.JavaStreamingContext> creatingFunc)  { throw new RuntimeException(); }
  /**
   * Either recreate a StreamingContext from checkpoint data or create a new StreamingContext.
   * If checkpoint data exists in the provided <code>checkpointPath</code>, then StreamingContext will be
   * recreated from the checkpoint data. If the data does not exist, then the provided factory
   * will be used to create a JavaStreamingContext.
   * <p>
   * @param checkpointPath Checkpoint directory used in an earlier StreamingContext program
   * @param creatingFunc   Function to create a new JavaStreamingContext
   * @param hadoopConf     Hadoop configuration if necessary for reading from any HDFS compatible
   *                       file system
   * @return (undocumented)
   */
  public  org.apache.spark.streaming.api.java.JavaStreamingContext getOrCreate (java.lang.String checkpointPath, org.apache.spark.api.java.function.Function0<org.apache.spark.streaming.api.java.JavaStreamingContext> creatingFunc, org.apache.hadoop.conf.Configuration hadoopConf)  { throw new RuntimeException(); }
  /**
   * Either recreate a StreamingContext from checkpoint data or create a new StreamingContext.
   * If checkpoint data exists in the provided <code>checkpointPath</code>, then StreamingContext will be
   * recreated from the checkpoint data. If the data does not exist, then the provided factory
   * will be used to create a JavaStreamingContext.
   * <p>
   * @param checkpointPath Checkpoint directory used in an earlier StreamingContext program
   * @param creatingFunc   Function to create a new JavaStreamingContext
   * @param hadoopConf     Hadoop configuration if necessary for reading from any HDFS compatible
   *                       file system
   * @param createOnError  Whether to create a new JavaStreamingContext if there is an
   *                       error in reading checkpoint data.
   * @return (undocumented)
   */
  public  org.apache.spark.streaming.api.java.JavaStreamingContext getOrCreate (java.lang.String checkpointPath, org.apache.spark.api.java.function.Function0<org.apache.spark.streaming.api.java.JavaStreamingContext> creatingFunc, org.apache.hadoop.conf.Configuration hadoopConf, boolean createOnError)  { throw new RuntimeException(); }
  /**
   * Find the JAR from which a given class was loaded, to make it easy for users to pass
   * their JARs to StreamingContext.
   * @param cls (undocumented)
   * @return (undocumented)
   */
  public  java.lang.String[] jarOfClass (java.lang.Class<?> cls)  { throw new RuntimeException(); }
}
