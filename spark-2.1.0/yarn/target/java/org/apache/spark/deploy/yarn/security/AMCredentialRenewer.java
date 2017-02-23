package org.apache.spark.deploy.yarn.security;
/**
 * The following methods are primarily meant to make sure long-running apps like Spark
 * Streaming apps can run without interruption while accessing secured services. The
 * scheduleLoginFromKeytab method is called on the AM to get the new credentials.
 * This method wakes up a thread that logs into the KDC
 * once 75% of the renewal interval of the original credentials used for the container
 * has elapsed. It then obtains new credentials and writes them to HDFS in a
 * pre-specified location - the prefix of which is specified in the sparkConf by
 * spark.yarn.credentials.file (so the file(s) would be named c-timestamp1-1, c-timestamp2-2 etc.
 * - each update goes to a new file, with a monotonically increasing suffix), also the
 * timestamp1, timestamp2 here indicates the time of next update for CredentialUpdater.
 * After this, the credentials are renewed once 75% of the new tokens renewal interval has elapsed.
 * <p>
 * On the executor and driver (yarn client mode) side, the updateCredentialsIfRequired method is
 * called once 80% of the validity of the original credentials has elapsed. At that time the
 * executor finds the credentials file with the latest timestamp and checks if it has read those
 * credentials before (by keeping track of the suffix of the last file it read). If a new file has
 * appeared, it will read the credentials and update the currently running UGI with it. This
 * process happens again once 80% of the validity of this has expired.
 */
  class AMCredentialRenewer implements org.apache.spark.internal.Logging {
  public   AMCredentialRenewer (org.apache.spark.SparkConf sparkConf, org.apache.hadoop.conf.Configuration hadoopConf, org.apache.spark.deploy.yarn.security.ConfigurableCredentialManager credentialManager)  { throw new RuntimeException(); }
  private  int lastCredentialsFileSuffix ()  { throw new RuntimeException(); }
  private  java.util.concurrent.ScheduledExecutorService credentialRenewer ()  { throw new RuntimeException(); }
  private  org.apache.spark.deploy.yarn.YarnSparkHadoopUtil hadoopUtil ()  { throw new RuntimeException(); }
  private  java.lang.String credentialsFile ()  { throw new RuntimeException(); }
  private  int daysToKeepFiles ()  { throw new RuntimeException(); }
  private  int numFilesToKeep ()  { throw new RuntimeException(); }
  private  org.apache.hadoop.conf.Configuration freshHadoopConf ()  { throw new RuntimeException(); }
  private  long timeOfNextRenewal ()  { throw new RuntimeException(); }
  /**
   * Schedule a login from the keytab and principal set using the --principal and --keytab
   * arguments to spark-submit. This login happens only when the credentials of the current user
   * are about to expire. This method reads spark.yarn.principal and spark.yarn.keytab from
   * SparkConf to do the login. This method is a no-op in non-YARN mode.
   * <p>
   */
    void scheduleLoginFromKeytab ()  { throw new RuntimeException(); }
  private  void cleanupOldFiles ()  { throw new RuntimeException(); }
  private  void writeNewCredentialsToHDFS (java.lang.String principal, java.lang.String keytab)  { throw new RuntimeException(); }
  public  void stop ()  { throw new RuntimeException(); }
}
