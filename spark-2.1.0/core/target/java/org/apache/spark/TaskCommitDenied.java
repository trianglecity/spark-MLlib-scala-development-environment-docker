package org.apache.spark;
/**
 * :: DeveloperApi ::
 * Task requested the driver to commit, but was denied.
 */
public  class TaskCommitDenied implements org.apache.spark.TaskFailedReason, scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  int jobID ()  { throw new RuntimeException(); }
  public  int partitionID ()  { throw new RuntimeException(); }
  public  int attemptNumber ()  { throw new RuntimeException(); }
  // not preceding
  public   TaskCommitDenied (int jobID, int partitionID, int attemptNumber)  { throw new RuntimeException(); }
  public  java.lang.String toErrorString ()  { throw new RuntimeException(); }
  /**
   * If a task failed because its attempt to commit was denied, do not count this failure
   * towards failing the stage. This is intended to prevent spurious stage failures in cases
   * where many speculative tasks are launched and denied to commit.
   * @return (undocumented)
   */
  public  boolean countTowardsTaskFailures ()  { throw new RuntimeException(); }
}
