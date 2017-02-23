package org.apache.spark.deploy.yarn.security;
/**
 * A credential provider for a service. User must implement this if they need to access a
 * secure service from Spark.
 */
public  interface ServiceCredentialProvider {
  /**
   * Name of the service to provide credentials. This name should unique, Spark internally will
   * use this name to differentiate credential provider.
   * @return (undocumented)
   */
  public  java.lang.String serviceName ()  ;
  /**
   * To decide whether credential is required for this service. By default it based on whether
   * Hadoop security is enabled.
   * @param hadoopConf (undocumented)
   * @return (undocumented)
   */
  public  boolean credentialsRequired (org.apache.hadoop.conf.Configuration hadoopConf)  ;
  /**
   * Obtain credentials for this service and get the time of the next renewal.
   * @param hadoopConf Configuration of current Hadoop Compatible system.
   * @param sparkConf Spark configuration.
   * @param creds Credentials to add tokens and security keys to.
   * @return If this Credential is renewable and can be renewed, return the time of the next
   *         renewal, otherwise None should be returned.
   */
  public  scala.Option<java.lang.Object> obtainCredentials (org.apache.hadoop.conf.Configuration hadoopConf, org.apache.spark.SparkConf sparkConf, org.apache.hadoop.security.Credentials creds)  ;
}
