package org.apache.spark.security;
/**
 * This class is responsible for getting the groups for a particular user in Unix based
 * environments. This implementation uses the Unix Shell based id command to fetch the user groups
 * for the specified user. It does not cache the user groups as the invocations are expected
 * to be infrequent.
 */
  class ShellBasedGroupsMappingProvider implements org.apache.spark.security.GroupMappingServiceProvider, org.apache.spark.internal.Logging {
  public   ShellBasedGroupsMappingProvider ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Set<java.lang.String> getGroups (java.lang.String username)  { throw new RuntimeException(); }
  private  scala.collection.immutable.Set<java.lang.String> getUnixGroups (java.lang.String username)  { throw new RuntimeException(); }
}
