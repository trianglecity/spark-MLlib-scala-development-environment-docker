package org.apache.spark.deploy.yarn.security;
  class CredentialUpdater implements org.apache.spark.internal.Logging {
  public   CredentialUpdater (org.apache.spark.SparkConf sparkConf, org.apache.hadoop.conf.Configuration hadoopConf, org.apache.spark.deploy.yarn.security.ConfigurableCredentialManager credentialManager)  { throw new RuntimeException(); }
  private  int lastCredentialsFileSuffix ()  { throw new RuntimeException(); }
  private  java.lang.String credentialsFile ()  { throw new RuntimeException(); }
  private  org.apache.hadoop.conf.Configuration freshHadoopConf ()  { throw new RuntimeException(); }
  private  java.util.concurrent.ScheduledExecutorService credentialUpdater ()  { throw new RuntimeException(); }
  private  java.lang.Object credentialUpdaterRunnable ()  { throw new RuntimeException(); }
  /** Start the credential updater task */
  public  void start ()  { throw new RuntimeException(); }
  private  void updateCredentialsIfRequired ()  { throw new RuntimeException(); }
  private  org.apache.hadoop.security.Credentials getCredentialsFromHDFSFile (org.apache.hadoop.fs.FileSystem remoteFs, org.apache.hadoop.fs.Path tokenPath)  { throw new RuntimeException(); }
  private  long getTimeOfNextUpdateFromFileName (org.apache.hadoop.fs.Path credentialsPath)  { throw new RuntimeException(); }
  public  void stop ()  { throw new RuntimeException(); }
}
