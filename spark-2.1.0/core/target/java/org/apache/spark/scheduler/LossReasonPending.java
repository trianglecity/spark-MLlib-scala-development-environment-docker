package org.apache.spark.scheduler;
/**
 * A loss reason that means we don't yet know why the executor exited.
 * <p>
 * This is used by the task scheduler to remove state associated with the executor, but
 * not yet fail any tasks that were running in the executor before the real loss reason
 * is known.
 */
public  class LossReasonPending {
  static public  java.lang.String message ()  { throw new RuntimeException(); }
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
}
