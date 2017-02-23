package org.apache.spark.deploy.yarn.security;
  class HDFSCredentialProvider implements org.apache.spark.deploy.yarn.security.ServiceCredentialProvider, org.apache.spark.internal.Logging {
  public   HDFSCredentialProvider ()  { throw new RuntimeException(); }
  private  scala.Option<java.lang.Object> tokenRenewalInterval ()  { throw new RuntimeException(); }
  public  java.lang.String serviceName ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> obtainCredentials (org.apache.hadoop.conf.Configuration hadoopConf, org.apache.spark.SparkConf sparkConf, org.apache.hadoop.security.Credentials creds)  { throw new RuntimeException(); }
  private  scala.Option<java.lang.Object> getTokenRenewalInterval (org.apache.hadoop.conf.Configuration hadoopConf, org.apache.spark.SparkConf sparkConf)  { throw new RuntimeException(); }
  private  java.lang.String getTokenRenewer (org.apache.hadoop.conf.Configuration conf)  { throw new RuntimeException(); }
  private  scala.collection.immutable.Set<org.apache.hadoop.fs.Path> nnsToAccess (org.apache.hadoop.conf.Configuration hadoopConf, org.apache.spark.SparkConf sparkConf)  { throw new RuntimeException(); }
}
