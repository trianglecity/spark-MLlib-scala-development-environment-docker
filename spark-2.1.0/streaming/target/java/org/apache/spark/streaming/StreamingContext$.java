package org.apache.spark.streaming;
/**
 * StreamingContext object contains a number of utility functions related to the
 * StreamingContext class.
 */
public  class StreamingContext$ implements org.apache.spark.internal.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final StreamingContext$ MODULE$ = null;
  public   StreamingContext$ ()  { throw new RuntimeException(); }
  /**
   * Lock that guards activation of a StreamingContext as well as access to the singleton active
   * StreamingContext in getActiveOrCreate().
   * @return (undocumented)
   */
  private  java.lang.Object ACTIVATION_LOCK ()  { throw new RuntimeException(); }
  private  int SHUTDOWN_HOOK_PRIORITY ()  { throw new RuntimeException(); }
  private  java.util.concurrent.atomic.AtomicReference<org.apache.spark.streaming.StreamingContext> activeContext ()  { throw new RuntimeException(); }
  private  void assertNoOtherContextIsActive ()  { throw new RuntimeException(); }
  private  void setActiveContext (org.apache.spark.streaming.StreamingContext ssc)  { throw new RuntimeException(); }
  /**
   * :: Experimental ::
   * <p>
   * Get the currently active context, if there is one. Active means started but not stopped.
   * @return (undocumented)
   */
  public  scala.Option<org.apache.spark.streaming.StreamingContext> getActive ()  { throw new RuntimeException(); }
  /**
   * :: Experimental ::
   * <p>
   * Either return the "active" StreamingContext (that is, started but not stopped), or create a
   * new StreamingContext that is
   * @param creatingFunc   Function to create a new StreamingContext
   * @return (undocumented)
   */
  public  org.apache.spark.streaming.StreamingContext getActiveOrCreate (scala.Function0<org.apache.spark.streaming.StreamingContext> creatingFunc)  { throw new RuntimeException(); }
  /**
   * :: Experimental ::
   * <p>
   * Either get the currently active StreamingContext (that is, started but not stopped),
   * OR recreate a StreamingContext from checkpoint data in the given path. If checkpoint data
   * does not exist in the provided, then create a new StreamingContext by calling the provided
   * <code>creatingFunc</code>.
   * <p>
   * @param checkpointPath Checkpoint directory used in an earlier StreamingContext program
   * @param creatingFunc   Function to create a new StreamingContext
   * @param hadoopConf     Optional Hadoop configuration if necessary for reading from the
   *                       file system
   * @param createOnError  Optional, whether to create a new StreamingContext if there is an
   *                       error in reading checkpoint data. By default, an exception will be
   *                       thrown on error.
   * @return (undocumented)
   */
  public  org.apache.spark.streaming.StreamingContext getActiveOrCreate (java.lang.String checkpointPath, scala.Function0<org.apache.spark.streaming.StreamingContext> creatingFunc, org.apache.hadoop.conf.Configuration hadoopConf, boolean createOnError)  { throw new RuntimeException(); }
  /**
   * Either recreate a StreamingContext from checkpoint data or create a new StreamingContext.
   * If checkpoint data exists in the provided <code>checkpointPath</code>, then StreamingContext will be
   * recreated from the checkpoint data. If the data does not exist, then the StreamingContext
   * will be created by called the provided <code>creatingFunc</code>.
   * <p>
   * @param checkpointPath Checkpoint directory used in an earlier StreamingContext program
   * @param creatingFunc   Function to create a new StreamingContext
   * @param hadoopConf     Optional Hadoop configuration if necessary for reading from the
   *                       file system
   * @param createOnError  Optional, whether to create a new StreamingContext if there is an
   *                       error in reading checkpoint data. By default, an exception will be
   *                       thrown on error.
   * @return (undocumented)
   */
  public  org.apache.spark.streaming.StreamingContext getOrCreate (java.lang.String checkpointPath, scala.Function0<org.apache.spark.streaming.StreamingContext> creatingFunc, org.apache.hadoop.conf.Configuration hadoopConf, boolean createOnError)  { throw new RuntimeException(); }
  /**
   * Find the JAR from which a given class was loaded, to make it easy for users to pass
   * their JARs to StreamingContext.
   * @param cls (undocumented)
   * @return (undocumented)
   */
  public  scala.Option<java.lang.String> jarOfClass (java.lang.Class<?> cls)  { throw new RuntimeException(); }
    org.apache.spark.SparkContext createNewSparkContext (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
    org.apache.spark.SparkContext createNewSparkContext (java.lang.String master, java.lang.String appName, java.lang.String sparkHome, scala.collection.Seq<java.lang.String> jars, scala.collection.Map<java.lang.String, java.lang.String> environment)  { throw new RuntimeException(); }
   <T extends java.lang.Object> java.lang.String rddToFileName (java.lang.String prefix, java.lang.String suffix, org.apache.spark.streaming.Time time)  { throw new RuntimeException(); }
}
