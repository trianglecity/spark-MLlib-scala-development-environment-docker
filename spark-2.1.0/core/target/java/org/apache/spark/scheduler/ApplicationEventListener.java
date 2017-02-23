package org.apache.spark.scheduler;
/**
 * A simple listener for application events.
 * <p>
 * This listener expects to hear events from a single application only. If events
 * from multiple applications are seen, the behavior is unspecified.
 */
  class ApplicationEventListener extends org.apache.spark.scheduler.SparkListener {
  public   ApplicationEventListener ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> appName ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> appId ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> appAttemptId ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> sparkUser ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> startTime ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> endTime ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> viewAcls ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> adminAcls ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> viewAclsGroups ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> adminAclsGroups ()  { throw new RuntimeException(); }
  public  void onApplicationStart (org.apache.spark.scheduler.SparkListenerApplicationStart applicationStart)  { throw new RuntimeException(); }
  public  void onApplicationEnd (org.apache.spark.scheduler.SparkListenerApplicationEnd applicationEnd)  { throw new RuntimeException(); }
  public  void onEnvironmentUpdate (org.apache.spark.scheduler.SparkListenerEnvironmentUpdate environmentUpdate)  { throw new RuntimeException(); }
}
