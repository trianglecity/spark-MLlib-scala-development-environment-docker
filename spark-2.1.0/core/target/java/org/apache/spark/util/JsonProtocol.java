package org.apache.spark.util;
/**
 * Serializes SparkListener events to/from JSON.  This protocol provides strong backwards-
 * and forwards-compatibility guarantees: any version of Spark should be able to read JSON output
 * written by any other version, including newer versions.
 * <p>
 * JsonProtocolSuite contains backwards-compatibility tests which check that the current version of
 * JsonProtocol is able to read output written by earlier versions.  We do not currently have tests
 * for reading newer JSON output with older Spark versions.
 * <p>
 * To ensure that we provide these guarantees, follow these rules when modifying these methods:
 * <p>
 *  - Never delete any JSON fields.
 *  - Any new JSON fields should be optional; use <code>Utils.jsonOption</code> when reading these fields
 *    in <code>*FromJson</code> methods.
 */
public  class JsonProtocol {
  static private  org.json4s.DefaultFormats$ format ()  { throw new RuntimeException(); }
  static private  com.fasterxml.jackson.databind.ObjectMapper mapper ()  { throw new RuntimeException(); }
  /** ------------------------------------------------- *
   * JSON serialization methods for SparkListenerEvents |
   * @param event (undocumented)
   * @return (undocumented)
   * -------------------------------------------------- */
  static public  org.json4s.JsonAST.JValue sparkEventToJson (org.apache.spark.scheduler.SparkListenerEvent event)  { throw new RuntimeException(); }
  static public  org.json4s.JsonAST.JValue stageSubmittedToJson (org.apache.spark.scheduler.SparkListenerStageSubmitted stageSubmitted)  { throw new RuntimeException(); }
  static public  org.json4s.JsonAST.JValue stageCompletedToJson (org.apache.spark.scheduler.SparkListenerStageCompleted stageCompleted)  { throw new RuntimeException(); }
  static public  org.json4s.JsonAST.JValue taskStartToJson (org.apache.spark.scheduler.SparkListenerTaskStart taskStart)  { throw new RuntimeException(); }
  static public  org.json4s.JsonAST.JValue taskGettingResultToJson (org.apache.spark.scheduler.SparkListenerTaskGettingResult taskGettingResult)  { throw new RuntimeException(); }
  static public  org.json4s.JsonAST.JValue taskEndToJson (org.apache.spark.scheduler.SparkListenerTaskEnd taskEnd)  { throw new RuntimeException(); }
  static public  org.json4s.JsonAST.JValue jobStartToJson (org.apache.spark.scheduler.SparkListenerJobStart jobStart)  { throw new RuntimeException(); }
  static public  org.json4s.JsonAST.JValue jobEndToJson (org.apache.spark.scheduler.SparkListenerJobEnd jobEnd)  { throw new RuntimeException(); }
  static public  org.json4s.JsonAST.JValue environmentUpdateToJson (org.apache.spark.scheduler.SparkListenerEnvironmentUpdate environmentUpdate)  { throw new RuntimeException(); }
  static public  org.json4s.JsonAST.JValue blockManagerAddedToJson (org.apache.spark.scheduler.SparkListenerBlockManagerAdded blockManagerAdded)  { throw new RuntimeException(); }
  static public  org.json4s.JsonAST.JValue blockManagerRemovedToJson (org.apache.spark.scheduler.SparkListenerBlockManagerRemoved blockManagerRemoved)  { throw new RuntimeException(); }
  static public  org.json4s.JsonAST.JValue unpersistRDDToJson (org.apache.spark.scheduler.SparkListenerUnpersistRDD unpersistRDD)  { throw new RuntimeException(); }
  static public  org.json4s.JsonAST.JValue applicationStartToJson (org.apache.spark.scheduler.SparkListenerApplicationStart applicationStart)  { throw new RuntimeException(); }
  static public  org.json4s.JsonAST.JValue applicationEndToJson (org.apache.spark.scheduler.SparkListenerApplicationEnd applicationEnd)  { throw new RuntimeException(); }
  static public  org.json4s.JsonAST.JValue executorAddedToJson (org.apache.spark.scheduler.SparkListenerExecutorAdded executorAdded)  { throw new RuntimeException(); }
  static public  org.json4s.JsonAST.JValue executorRemovedToJson (org.apache.spark.scheduler.SparkListenerExecutorRemoved executorRemoved)  { throw new RuntimeException(); }
  static public  org.json4s.JsonAST.JValue logStartToJson (org.apache.spark.scheduler.SparkListenerLogStart logStart)  { throw new RuntimeException(); }
  static public  org.json4s.JsonAST.JValue executorMetricsUpdateToJson (org.apache.spark.scheduler.SparkListenerExecutorMetricsUpdate metricsUpdate)  { throw new RuntimeException(); }
  /** ------------------------------------------------------------------- *
   * JSON serialization methods for classes SparkListenerEvents depend on |
   * @param stageInfo (undocumented)
   * @return (undocumented)
   * -------------------------------------------------------------------- */
  static public  org.json4s.JsonAST.JValue stageInfoToJson (org.apache.spark.scheduler.StageInfo stageInfo)  { throw new RuntimeException(); }
  static public  org.json4s.JsonAST.JValue taskInfoToJson (org.apache.spark.scheduler.TaskInfo taskInfo)  { throw new RuntimeException(); }
  static public  org.json4s.JsonAST.JValue accumulableInfoToJson (org.apache.spark.scheduler.AccumulableInfo accumulableInfo)  { throw new RuntimeException(); }
  /**
   * Serialize the value of an accumulator to JSON.
   * <p>
   * For accumulators representing internal task metrics, this looks up the relevant
   * {@link AccumulatorParam} to serialize the value accordingly. For all other accumulators,
   * this will simply serialize the value as a string.
   * <p>
   * The behavior here must match that of {@link accumValueFromJson}. Exposed for testing.
   * @param name (undocumented)
   * @param value (undocumented)
   * @return (undocumented)
   */
  static   org.json4s.JsonAST.JValue accumValueToJson (scala.Option<java.lang.String> name, Object value)  { throw new RuntimeException(); }
  static public  org.json4s.JsonAST.JValue taskMetricsToJson (org.apache.spark.executor.TaskMetrics taskMetrics)  { throw new RuntimeException(); }
  static public  org.json4s.JsonAST.JValue taskEndReasonToJson (org.apache.spark.TaskEndReason taskEndReason)  { throw new RuntimeException(); }
  static public  org.json4s.JsonAST.JValue blockManagerIdToJson (org.apache.spark.storage.BlockManagerId blockManagerId)  { throw new RuntimeException(); }
  static public  org.json4s.JsonAST.JValue jobResultToJson (org.apache.spark.scheduler.JobResult jobResult)  { throw new RuntimeException(); }
  static public  org.json4s.JsonAST.JValue rddInfoToJson (org.apache.spark.storage.RDDInfo rddInfo)  { throw new RuntimeException(); }
  static public  org.json4s.JsonAST.JValue storageLevelToJson (org.apache.spark.storage.StorageLevel storageLevel)  { throw new RuntimeException(); }
  static public  org.json4s.JsonAST.JValue blockStatusToJson (org.apache.spark.storage.BlockStatus blockStatus)  { throw new RuntimeException(); }
  static public  org.json4s.JsonAST.JValue executorInfoToJson (org.apache.spark.scheduler.cluster.ExecutorInfo executorInfo)  { throw new RuntimeException(); }
  /** ------------------------------ *
   * Util JSON serialization methods |
   * @param m (undocumented)
   * @return (undocumented)
   * ------------------------------- */
  static public  org.json4s.JsonAST.JValue mapToJson (scala.collection.Map<java.lang.String, java.lang.String> m)  { throw new RuntimeException(); }
  static public  org.json4s.JsonAST.JValue propertiesToJson (java.util.Properties properties)  { throw new RuntimeException(); }
  static public  org.json4s.JsonAST.JValue UUIDToJson (java.util.UUID id)  { throw new RuntimeException(); }
  static public  org.json4s.JsonAST.JValue stackTraceToJson (java.lang.StackTraceElement[] stackTrace)  { throw new RuntimeException(); }
  static public  org.json4s.JsonAST.JValue exceptionToJson (java.lang.Exception exception)  { throw new RuntimeException(); }
  /** --------------------------------------------------- *
   * JSON deserialization methods for SparkListenerEvents |
   * @param json (undocumented)
   * @return (undocumented)
   * ---------------------------------------------------- */
  static public  org.apache.spark.scheduler.SparkListenerEvent sparkEventFromJson (org.json4s.JsonAST.JValue json)  { throw new RuntimeException(); }
  static public  org.apache.spark.scheduler.SparkListenerStageSubmitted stageSubmittedFromJson (org.json4s.JsonAST.JValue json)  { throw new RuntimeException(); }
  static public  org.apache.spark.scheduler.SparkListenerStageCompleted stageCompletedFromJson (org.json4s.JsonAST.JValue json)  { throw new RuntimeException(); }
  static public  org.apache.spark.scheduler.SparkListenerTaskStart taskStartFromJson (org.json4s.JsonAST.JValue json)  { throw new RuntimeException(); }
  static public  org.apache.spark.scheduler.SparkListenerTaskGettingResult taskGettingResultFromJson (org.json4s.JsonAST.JValue json)  { throw new RuntimeException(); }
  static public  org.apache.spark.scheduler.SparkListenerTaskEnd taskEndFromJson (org.json4s.JsonAST.JValue json)  { throw new RuntimeException(); }
  static public  org.apache.spark.scheduler.SparkListenerJobStart jobStartFromJson (org.json4s.JsonAST.JValue json)  { throw new RuntimeException(); }
  static public  org.apache.spark.scheduler.SparkListenerJobEnd jobEndFromJson (org.json4s.JsonAST.JValue json)  { throw new RuntimeException(); }
  static public  org.apache.spark.scheduler.SparkListenerEnvironmentUpdate environmentUpdateFromJson (org.json4s.JsonAST.JValue json)  { throw new RuntimeException(); }
  static public  org.apache.spark.scheduler.SparkListenerBlockManagerAdded blockManagerAddedFromJson (org.json4s.JsonAST.JValue json)  { throw new RuntimeException(); }
  static public  org.apache.spark.scheduler.SparkListenerBlockManagerRemoved blockManagerRemovedFromJson (org.json4s.JsonAST.JValue json)  { throw new RuntimeException(); }
  static public  org.apache.spark.scheduler.SparkListenerUnpersistRDD unpersistRDDFromJson (org.json4s.JsonAST.JValue json)  { throw new RuntimeException(); }
  static public  org.apache.spark.scheduler.SparkListenerApplicationStart applicationStartFromJson (org.json4s.JsonAST.JValue json)  { throw new RuntimeException(); }
  static public  org.apache.spark.scheduler.SparkListenerApplicationEnd applicationEndFromJson (org.json4s.JsonAST.JValue json)  { throw new RuntimeException(); }
  static public  org.apache.spark.scheduler.SparkListenerExecutorAdded executorAddedFromJson (org.json4s.JsonAST.JValue json)  { throw new RuntimeException(); }
  static public  org.apache.spark.scheduler.SparkListenerExecutorRemoved executorRemovedFromJson (org.json4s.JsonAST.JValue json)  { throw new RuntimeException(); }
  static public  org.apache.spark.scheduler.SparkListenerLogStart logStartFromJson (org.json4s.JsonAST.JValue json)  { throw new RuntimeException(); }
  static public  org.apache.spark.scheduler.SparkListenerExecutorMetricsUpdate executorMetricsUpdateFromJson (org.json4s.JsonAST.JValue json)  { throw new RuntimeException(); }
  /** --------------------------------------------------------------------- *
   * JSON deserialization methods for classes SparkListenerEvents depend on |
   * @param json (undocumented)
   * @return (undocumented)
   * ---------------------------------------------------------------------- */
  static public  org.apache.spark.scheduler.StageInfo stageInfoFromJson (org.json4s.JsonAST.JValue json)  { throw new RuntimeException(); }
  static public  org.apache.spark.scheduler.TaskInfo taskInfoFromJson (org.json4s.JsonAST.JValue json)  { throw new RuntimeException(); }
  static public  org.apache.spark.scheduler.AccumulableInfo accumulableInfoFromJson (org.json4s.JsonAST.JValue json)  { throw new RuntimeException(); }
  /**
   * Deserialize the value of an accumulator from JSON.
   * <p>
   * For accumulators representing internal task metrics, this looks up the relevant
   * {@link AccumulatorParam} to deserialize the value accordingly. For all other
   * accumulators, this will simply deserialize the value as a string.
   * <p>
   * The behavior here must match that of {@link accumValueToJson}. Exposed for testing.
   * @param name (undocumented)
   * @param value (undocumented)
   * @return (undocumented)
   */
  static   Object accumValueFromJson (scala.Option<java.lang.String> name, org.json4s.JsonAST.JValue value)  { throw new RuntimeException(); }
  static public  org.apache.spark.executor.TaskMetrics taskMetricsFromJson (org.json4s.JsonAST.JValue json)  { throw new RuntimeException(); }
  static public  org.apache.spark.TaskEndReason taskEndReasonFromJson (org.json4s.JsonAST.JValue json)  { throw new RuntimeException(); }
  static public  org.apache.spark.storage.BlockManagerId blockManagerIdFromJson (org.json4s.JsonAST.JValue json)  { throw new RuntimeException(); }
  static public  org.apache.spark.scheduler.JobResult jobResultFromJson (org.json4s.JsonAST.JValue json)  { throw new RuntimeException(); }
  static public  org.apache.spark.storage.RDDInfo rddInfoFromJson (org.json4s.JsonAST.JValue json)  { throw new RuntimeException(); }
  static public  org.apache.spark.storage.StorageLevel storageLevelFromJson (org.json4s.JsonAST.JValue json)  { throw new RuntimeException(); }
  static public  org.apache.spark.storage.BlockStatus blockStatusFromJson (org.json4s.JsonAST.JValue json)  { throw new RuntimeException(); }
  static public  org.apache.spark.scheduler.cluster.ExecutorInfo executorInfoFromJson (org.json4s.JsonAST.JValue json)  { throw new RuntimeException(); }
  /** -------------------------------- *
   * Util JSON deserialization methods |
   * @param json (undocumented)
   * @return (undocumented)
   * --------------------------------- */
  static public  scala.collection.Map<java.lang.String, java.lang.String> mapFromJson (org.json4s.JsonAST.JValue json)  { throw new RuntimeException(); }
  static public  java.util.Properties propertiesFromJson (org.json4s.JsonAST.JValue json)  { throw new RuntimeException(); }
  static public  java.util.UUID UUIDFromJson (org.json4s.JsonAST.JValue json)  { throw new RuntimeException(); }
  static public  java.lang.StackTraceElement[] stackTraceFromJson (org.json4s.JsonAST.JValue json)  { throw new RuntimeException(); }
  static public  java.lang.Exception exceptionFromJson (org.json4s.JsonAST.JValue json)  { throw new RuntimeException(); }
}
