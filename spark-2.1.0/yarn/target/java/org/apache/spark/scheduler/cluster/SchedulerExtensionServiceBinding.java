package org.apache.spark.scheduler.cluster;
/**
 * Binding information for a {@link SchedulerExtensionService}.
 * <p>
 * The attempt ID will be set if the service is started within a YARN application master;
 * there is then a different attempt ID for every time that AM is restarted.
 * When the service binding is instantiated in client mode, there's no attempt ID, as it lacks
 * this information.
 * param:  sparkContext current spark context
 * param:  applicationId YARN application ID
 * param:  attemptId YARN attemptID. This will always be unset in client mode, and always set in
 *                  cluster mode.
 */
public  class SchedulerExtensionServiceBinding implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  org.apache.spark.SparkContext sparkContext ()  { throw new RuntimeException(); }
  public  org.apache.hadoop.yarn.api.records.ApplicationId applicationId ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.hadoop.yarn.api.records.ApplicationAttemptId> attemptId ()  { throw new RuntimeException(); }
  // not preceding
  public   SchedulerExtensionServiceBinding (org.apache.spark.SparkContext sparkContext, org.apache.hadoop.yarn.api.records.ApplicationId applicationId, scala.Option<org.apache.hadoop.yarn.api.records.ApplicationAttemptId> attemptId)  { throw new RuntimeException(); }
}
