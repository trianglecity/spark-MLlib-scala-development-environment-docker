package org.apache.spark.security;
/**
 * This Spark trait is used for mapping a given userName to a set of groups which it belongs to.
 * This is useful for specifying a common group of admins/developers to provide them admin, modify
 * and/or view access rights. Based on whether access control checks are enabled using
 * spark.acls.enable, every time a user tries to access or modify the application, the
 * SecurityManager gets the corresponding groups a user belongs to from the instance of the groups
 * mapping provider specified by the entry spark.user.groups.mapping.
 */
public  interface GroupMappingServiceProvider {
  /**
   * Get the groups the user belongs to.
   * @param userName User's Name
   * @return set of groups that the user belongs to. Empty in case of an invalid user.
   */
  public  scala.collection.immutable.Set<java.lang.String> getGroups (java.lang.String userName)  ;
}
