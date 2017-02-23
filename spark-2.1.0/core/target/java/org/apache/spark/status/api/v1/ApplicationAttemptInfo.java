package org.apache.spark.status.api.v1;
public  class ApplicationAttemptInfo {
  public  scala.Option<java.lang.String> attemptId ()  { throw new RuntimeException(); }
  public  java.util.Date startTime ()  { throw new RuntimeException(); }
  public  java.util.Date endTime ()  { throw new RuntimeException(); }
  public  java.util.Date lastUpdated ()  { throw new RuntimeException(); }
  public  long duration ()  { throw new RuntimeException(); }
  public  java.lang.String sparkUser ()  { throw new RuntimeException(); }
  public  boolean completed ()  { throw new RuntimeException(); }
  // not preceding
     ApplicationAttemptInfo (scala.Option<java.lang.String> attemptId, java.util.Date startTime, java.util.Date endTime, java.util.Date lastUpdated, long duration, java.lang.String sparkUser, boolean completed)  { throw new RuntimeException(); }
  public  long getStartTimeEpoch ()  { throw new RuntimeException(); }
  public  long getEndTimeEpoch ()  { throw new RuntimeException(); }
  public  long getLastUpdatedEpoch ()  { throw new RuntimeException(); }
}
