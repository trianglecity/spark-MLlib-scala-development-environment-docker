package org.apache.spark.scheduler;
public  class StageInfo$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final StageInfo$ MODULE$ = null;
  public   StageInfo$ ()  { throw new RuntimeException(); }
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
  public  org.apache.spark.scheduler.StageInfo fromStage (org.apache.spark.scheduler.Stage stage, int attemptId, scala.Option<java.lang.Object> numTasks, org.apache.spark.executor.TaskMetrics taskMetrics, scala.collection.Seq<scala.collection.Seq<org.apache.spark.scheduler.TaskLocation>> taskLocalityPreferences)  { throw new RuntimeException(); }
}
