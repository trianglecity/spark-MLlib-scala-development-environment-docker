package org.apache.spark.deploy.yarn.security;
/**
 * A ConfigurableCredentialManager to manage all the registered credential providers and offer
 * APIs for other modules to obtain credentials as well as renewal time. By default
 * {@link HDFSCredentialProvider}, {@link HiveCredentialProvider} and {@link HBaseCredentialProvider} will
 * be loaded in if not explicitly disabled, any plugged-in credential provider wants to be
 * managed by ConfigurableCredentialManager needs to implement {@link ServiceCredentialProvider}
 * interface and put into resources/META-INF/services to be loaded by ServiceLoader.
 * <p>
 * Also each credential provider is controlled by
 * spark.yarn.security.credentials.{service}.enabled, it will not be loaded in if set to false.
 */
 final class ConfigurableCredentialManager implements org.apache.spark.internal.Logging {
  public   ConfigurableCredentialManager (org.apache.spark.SparkConf sparkConf, org.apache.hadoop.conf.Configuration hadoopConf)  { throw new RuntimeException(); }
  private  java.lang.String deprecatedProviderEnabledConfig ()  { throw new RuntimeException(); }
  private  java.lang.String providerEnabledConfig ()  { throw new RuntimeException(); }
  private  scala.collection.immutable.Map<java.lang.String, org.apache.spark.deploy.yarn.security.ServiceCredentialProvider> credentialProviders ()  { throw new RuntimeException(); }
  /**
   * Get credential provider for the specified service.
   * @param service (undocumented)
   * @return (undocumented)
   */
  public  scala.Option<org.apache.spark.deploy.yarn.security.ServiceCredentialProvider> getServiceCredentialProvider (java.lang.String service)  { throw new RuntimeException(); }
  /**
   * Obtain credentials from all the registered providers.
   * @return nearest time of next renewal, Long.MaxValue if all the credentials aren't renewable,
   *         otherwise the nearest renewal time of any credentials will be returned.
   * @param hadoopConf (undocumented)
   * @param creds (undocumented)
   */
  public  long obtainCredentials (org.apache.hadoop.conf.Configuration hadoopConf, org.apache.hadoop.security.Credentials creds)  { throw new RuntimeException(); }
  /**
   * Create an {@link AMCredentialRenewer} instance, caller should be responsible to stop this
   * instance when it is not used. AM will use it to renew credentials periodically.
   * @return (undocumented)
   */
  public  org.apache.spark.deploy.yarn.security.AMCredentialRenewer credentialRenewer ()  { throw new RuntimeException(); }
  /**
   * Create an {@link CredentialUpdater} instance, caller should be resposible to stop this intance
   * when it is not used. Executors and driver (client mode) will use it to update credentials.
   * periodically.
   * @return (undocumented)
   */
  public  org.apache.spark.deploy.yarn.security.CredentialUpdater credentialUpdater ()  { throw new RuntimeException(); }
}
