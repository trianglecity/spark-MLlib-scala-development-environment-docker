package org.apache.spark.deploy.history;
/**
 * Application attempt information.
 * <p>
 * param:  logPath path to the log file, or, for a legacy log, its directory
 * param:  name application name
 * param:  appId application ID
 * param:  attemptId optional attempt ID
 * param:  startTime start time (from playback)
 * param:  endTime end time (from playback). -1 if the application is incomplete.
 * param:  lastUpdated the modification time of the log file when this entry was built by replaying
 *                    the history.
 * param:  sparkUser user running the application
 * param:  completed flag to indicate whether or not the application has completed.
 * param:  fileSize the size of the log file the last time the file was scanned for changes
 */
public  class FsApplicationAttemptInfo extends org.apache.spark.deploy.history.ApplicationAttemptInfo {
  public  java.lang.String logPath ()  { throw new RuntimeException(); }
  public  java.lang.String name ()  { throw new RuntimeException(); }
  public  java.lang.String appId ()  { throw new RuntimeException(); }
  public  long fileSize ()  { throw new RuntimeException(); }
  // not preceding
  public   FsApplicationAttemptInfo (java.lang.String logPath, java.lang.String name, java.lang.String appId, scala.Option<java.lang.String> attemptId, long startTime, long endTime, long lastUpdated, java.lang.String sparkUser, boolean completed, long fileSize)  { throw new RuntimeException(); }
  /** extend the superclass string value with the extra attributes of this class */
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
