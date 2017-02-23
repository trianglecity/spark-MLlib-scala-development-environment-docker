package org.apache.spark.deploy.yarn.security;
  class HBaseCredentialProvider implements org.apache.spark.deploy.yarn.security.ServiceCredentialProvider, org.apache.spark.internal.Logging {
  public   HBaseCredentialProvider ()  { throw new RuntimeException(); }
  public  java.lang.String serviceName ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> obtainCredentials (org.apache.hadoop.conf.Configuration hadoopConf, org.apache.spark.SparkConf sparkConf, org.apache.hadoop.security.Credentials creds)  { throw new RuntimeException(); }
  public  boolean credentialsRequired (org.apache.hadoop.conf.Configuration hadoopConf)  { throw new RuntimeException(); }
  private  org.apache.hadoop.conf.Configuration hbaseConf (org.apache.hadoop.conf.Configuration conf)  { throw new RuntimeException(); }
}
