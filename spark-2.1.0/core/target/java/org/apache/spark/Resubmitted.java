package org.apache.spark;
/**
 * :: DeveloperApi ::
 * A <code>org.apache.spark.scheduler.ShuffleMapTask</code> that completed successfully earlier, but we
 * lost the executor before the stage completed. This means Spark needs to reschedule the task
 * to be re-executed on a different executor.
 */
public  class Resubmitted {
  static public  java.lang.String toErrorString ()  { throw new RuntimeException(); }
  static public  boolean countTowardsTaskFailures ()  { throw new RuntimeException(); }
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
}
