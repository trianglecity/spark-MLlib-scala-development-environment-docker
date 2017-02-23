package org.apache.spark.deploy.history;
/**
 * Application history information
 * param:  id application ID
 * param:  name application name
 * param:  attempts list of attempts, most recent first.
 */
public  class FsApplicationHistoryInfo extends org.apache.spark.deploy.history.ApplicationHistoryInfo {
  public  java.lang.String name ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.List<org.apache.spark.deploy.history.FsApplicationAttemptInfo> attempts ()  { throw new RuntimeException(); }
  // not preceding
  public   FsApplicationHistoryInfo (java.lang.String id, java.lang.String name, scala.collection.immutable.List<org.apache.spark.deploy.history.FsApplicationAttemptInfo> attempts)  { throw new RuntimeException(); }
}
