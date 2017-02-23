package org.apache.spark.scheduler;
/**
 * :: DeveloperApi ::
 * Stores information about a stage to pass from the scheduler to SparkListeners.
 */
public  class StageInfo {
  /**
   * Construct a StageInfo from a Stage.
   * <p>
   * Each Stage is associated with one or many RDDs, with the boundary of a Stage marked by
   * shuffle dependencies. Therefore, all ancestor RDDs related to this Stage's RDD through a
   * sequence of narrow dependencies should also be associated with this Stage.
   * @param stage (undocumented)
   * @param attemptId (undocumented)
   * @param numTasks (undocumented)
   * @param taskMetrics (undocumented)
   * @param taskLocalityPreferences (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.scheduler.StageInfo fromStage (org.apache.spark.scheduler.Stage stage, int attemptId, scala.Option<java.lang.Object> numTasks, org.apache.spark.executor.TaskMetrics taskMetrics, scala.collection.Seq<scala.collection.Seq<org.apache.spark.scheduler.TaskLocation>> taskLocalityPreferences)  { throw new RuntimeException(); }
  public  int stageId ()  { throw new RuntimeException(); }
  public  int attemptId ()  { throw new RuntimeException(); }
  public  java.lang.String name ()  { throw new RuntimeException(); }
  public  int numTasks ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.storage.RDDInfo> rddInfos ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.Object> parentIds ()  { throw new RuntimeException(); }
  public  java.lang.String details ()  { throw new RuntimeException(); }
  public  org.apache.spark.executor.TaskMetrics taskMetrics ()  { throw new RuntimeException(); }
    scala.collection.Seq<scala.collection.Seq<org.apache.spark.scheduler.TaskLocation>> taskLocalityPreferences ()  { throw new RuntimeException(); }
  // not preceding
  public   StageInfo (int stageId, int attemptId, java.lang.String name, int numTasks, scala.collection.Seq<org.apache.spark.storage.RDDInfo> rddInfos, scala.collection.Seq<java.lang.Object> parentIds, java.lang.String details, org.apache.spark.executor.TaskMetrics taskMetrics, scala.collection.Seq<scala.collection.Seq<org.apache.spark.scheduler.TaskLocation>> taskLocalityPreferences)  { throw new RuntimeException(); }
  /** When this stage was submitted from the DAGScheduler to a TaskScheduler. */
  public  scala.Option<java.lang.Object> submissionTime ()  { throw new RuntimeException(); }
  /** Time when all tasks in the stage completed or when the stage was cancelled. */
  public  scala.Option<java.lang.Object> completionTime ()  { throw new RuntimeException(); }
  /** If the stage failed, the reason why. */
  public  scala.Option<java.lang.String> failureReason ()  { throw new RuntimeException(); }
  /**
   * Terminal values of accumulables updated during this stage, including all the user-defined
   * accumulators.
   * @return (undocumented)
   */
  public  scala.collection.mutable.HashMap<java.lang.Object, org.apache.spark.scheduler.AccumulableInfo> accumulables ()  { throw new RuntimeException(); }
  public  void stageFailed (java.lang.String reason)  { throw new RuntimeException(); }
    java.lang.String getStatusString ()  { throw new RuntimeException(); }
}
