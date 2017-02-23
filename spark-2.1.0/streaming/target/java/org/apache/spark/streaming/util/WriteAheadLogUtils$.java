package org.apache.spark.streaming.util;
/** A helper class with utility functions related to the WriteAheadLog interface */
public  class WriteAheadLogUtils$ implements org.apache.spark.internal.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final WriteAheadLogUtils$ MODULE$ = null;
  public   WriteAheadLogUtils$ ()  { throw new RuntimeException(); }
  public  java.lang.String RECEIVER_WAL_ENABLE_CONF_KEY ()  { throw new RuntimeException(); }
  public  java.lang.String RECEIVER_WAL_CLASS_CONF_KEY ()  { throw new RuntimeException(); }
  public  java.lang.String RECEIVER_WAL_ROLLING_INTERVAL_CONF_KEY ()  { throw new RuntimeException(); }
  public  java.lang.String RECEIVER_WAL_MAX_FAILURES_CONF_KEY ()  { throw new RuntimeException(); }
  public  java.lang.String RECEIVER_WAL_CLOSE_AFTER_WRITE_CONF_KEY ()  { throw new RuntimeException(); }
  public  java.lang.String DRIVER_WAL_CLASS_CONF_KEY ()  { throw new RuntimeException(); }
  public  java.lang.String DRIVER_WAL_ROLLING_INTERVAL_CONF_KEY ()  { throw new RuntimeException(); }
  public  java.lang.String DRIVER_WAL_MAX_FAILURES_CONF_KEY ()  { throw new RuntimeException(); }
  public  java.lang.String DRIVER_WAL_BATCHING_CONF_KEY ()  { throw new RuntimeException(); }
  public  java.lang.String DRIVER_WAL_BATCHING_TIMEOUT_CONF_KEY ()  { throw new RuntimeException(); }
  public  java.lang.String DRIVER_WAL_CLOSE_AFTER_WRITE_CONF_KEY ()  { throw new RuntimeException(); }
  public  int DEFAULT_ROLLING_INTERVAL_SECS ()  { throw new RuntimeException(); }
  public  int DEFAULT_MAX_FAILURES ()  { throw new RuntimeException(); }
  public  boolean enableReceiverLog (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  public  int getRollingIntervalSecs (org.apache.spark.SparkConf conf, boolean isDriver)  { throw new RuntimeException(); }
  public  int getMaxFailures (org.apache.spark.SparkConf conf, boolean isDriver)  { throw new RuntimeException(); }
  public  boolean isBatchingEnabled (org.apache.spark.SparkConf conf, boolean isDriver)  { throw new RuntimeException(); }
  /**
   * How long we will wait for the wrappedLog in the BatchedWriteAheadLog to write the records
   * before we fail the write attempt to unblock receivers.
   * @param conf (undocumented)
   * @return (undocumented)
   */
  public  long getBatchingTimeout (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  public  boolean shouldCloseFileAfterWrite (org.apache.spark.SparkConf conf, boolean isDriver)  { throw new RuntimeException(); }
  /**
   * Create a WriteAheadLog for the driver. If configured with custom WAL class, it will try
   * to create instance of that class, otherwise it will create the default FileBasedWriteAheadLog.
   * @param sparkConf (undocumented)
   * @param fileWalLogDirectory (undocumented)
   * @param fileWalHadoopConf (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.streaming.util.WriteAheadLog createLogForDriver (org.apache.spark.SparkConf sparkConf, java.lang.String fileWalLogDirectory, org.apache.hadoop.conf.Configuration fileWalHadoopConf)  { throw new RuntimeException(); }
  /**
   * Create a WriteAheadLog for the receiver. If configured with custom WAL class, it will try
   * to create instance of that class, otherwise it will create the default FileBasedWriteAheadLog.
   * @param sparkConf (undocumented)
   * @param fileWalLogDirectory (undocumented)
   * @param fileWalHadoopConf (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.streaming.util.WriteAheadLog createLogForReceiver (org.apache.spark.SparkConf sparkConf, java.lang.String fileWalLogDirectory, org.apache.hadoop.conf.Configuration fileWalHadoopConf)  { throw new RuntimeException(); }
  /**
   * Create a WriteAheadLog based on the value of the given config key. The config key is used
   * to get the class name from the SparkConf. If the class is configured, it will try to
   * create instance of that class by first trying <code>new CustomWAL(sparkConf, logDir)</code> then trying
   * <code>new CustomWAL(sparkConf)</code>. If either fails, it will fail. If no class is configured, then
   * it will create the default FileBasedWriteAheadLog.
   * @param isDriver (undocumented)
   * @param sparkConf (undocumented)
   * @param fileWalLogDirectory (undocumented)
   * @param fileWalHadoopConf (undocumented)
   * @return (undocumented)
   */
  private  org.apache.spark.streaming.util.WriteAheadLog createLog (boolean isDriver, org.apache.spark.SparkConf sparkConf, java.lang.String fileWalLogDirectory, org.apache.hadoop.conf.Configuration fileWalHadoopConf)  { throw new RuntimeException(); }
  /** Instantiate the class, either using single arg constructor or zero arg constructor */
  private  org.apache.spark.streaming.util.WriteAheadLog instantiateClass (java.lang.Class<? extends org.apache.spark.streaming.util.WriteAheadLog> cls, org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
}
