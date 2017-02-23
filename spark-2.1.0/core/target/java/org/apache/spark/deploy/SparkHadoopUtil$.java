package org.apache.spark.deploy;
public  class SparkHadoopUtil$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final SparkHadoopUtil$ MODULE$ = null;
  public   SparkHadoopUtil$ ()  { throw new RuntimeException(); }
  private  org.apache.spark.deploy.SparkHadoopUtil hadoop ()  { throw new RuntimeException(); }
  private  org.apache.spark.deploy.SparkHadoopUtil yarn ()  { throw new RuntimeException(); }
  public  java.lang.String SPARK_YARN_CREDS_TEMP_EXTENSION ()  { throw new RuntimeException(); }
  public  java.lang.String SPARK_YARN_CREDS_COUNTER_DELIM ()  { throw new RuntimeException(); }
  /**
   * Number of records to update input metrics when reading from HadoopRDDs.
   * <p>
   * Each update is potentially expensive because we need to use reflection to access the
   * Hadoop FileSystem API of interest (only available in 2.5), so we should do this sparingly.
   * @return (undocumented)
   */
    int UPDATE_INPUT_METRICS_INTERVAL_RECORDS ()  { throw new RuntimeException(); }
  public  org.apache.spark.deploy.SparkHadoopUtil get ()  { throw new RuntimeException(); }
}
