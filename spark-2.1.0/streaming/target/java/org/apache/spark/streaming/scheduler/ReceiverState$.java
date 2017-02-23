package org.apache.spark.streaming.scheduler;
/** Enumeration to identify current state of a Receiver */
public  class ReceiverState$ extends scala.Enumeration {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final ReceiverState$ MODULE$ = null;
  public   ReceiverState$ ()  { throw new RuntimeException(); }
  public  scala.Enumeration.Value INACTIVE ()  { throw new RuntimeException(); }
  public  scala.Enumeration.Value SCHEDULED ()  { throw new RuntimeException(); }
  public  scala.Enumeration.Value ACTIVE ()  { throw new RuntimeException(); }
}
