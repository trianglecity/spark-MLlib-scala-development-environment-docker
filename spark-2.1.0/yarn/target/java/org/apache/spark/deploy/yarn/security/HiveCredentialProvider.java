package org.apache.spark.deploy.yarn.security;
  class HiveCredentialProvider implements org.apache.spark.deploy.yarn.security.ServiceCredentialProvider, org.apache.spark.internal.Logging {
  public   HiveCredentialProvider ()  { throw new RuntimeException(); }
  public  java.lang.String serviceName ()  { throw new RuntimeException(); }
  private  org.apache.hadoop.conf.Configuration hiveConf (org.apache.hadoop.conf.Configuration hadoopConf)  { throw new RuntimeException(); }
  public  boolean credentialsRequired (org.apache.hadoop.conf.Configuration hadoopConf)  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> obtainCredentials (org.apache.hadoop.conf.Configuration hadoopConf, org.apache.spark.SparkConf sparkConf, org.apache.hadoop.security.Credentials creds)  { throw new RuntimeException(); }
  /**
   * Run some code as the real logged in user (which may differ from the current user, for
   * example, when using proxying).
   * @param fn (undocumented)
   * @return (undocumented)
   */
  private <T extends java.lang.Object> T doAsRealUser (scala.Function0<T> fn)  { throw new RuntimeException(); }
}
