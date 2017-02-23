package org.apache.spark.sql.execution.streaming;
/**
 * Responsible for continually reporting statistics about the amount of data processed as well
 * as latency for a streaming query.  This trait is designed to be mixed into the
 * {@link StreamExecution}, who is responsible for calling <code>startTrigger</code> and <code>finishTrigger</code>
 * at the appropriate times. Additionally, the status can updated with <code>updateStatusMessage</code> to
 * allow reporting on the streams current state (i.e. "Fetching more data").
 */
public  interface ProgressReporter extends org.apache.spark.internal.Logging {
  public  class ExecutionStats implements scala.Product, scala.Serializable {
    public  scala.collection.immutable.Map<org.apache.spark.sql.execution.streaming.Source, java.lang.Object> inputRows ()  { throw new RuntimeException(); }
    public  scala.collection.Seq<org.apache.spark.sql.streaming.StateOperatorProgress> stateOperators ()  { throw new RuntimeException(); }
    public  scala.collection.immutable.Map<java.lang.String, java.lang.String> eventTimeStats ()  { throw new RuntimeException(); }
    // not preceding
    public   ExecutionStats (scala.collection.immutable.Map<org.apache.spark.sql.execution.streaming.Source, java.lang.Object> inputRows, scala.collection.Seq<org.apache.spark.sql.streaming.StateOperatorProgress> stateOperators, scala.collection.immutable.Map<java.lang.String, java.lang.String> eventTimeStats)  { throw new RuntimeException(); }
  }
  public  class ExecutionStats extends scala.runtime.AbstractFunction3<scala.collection.immutable.Map<org.apache.spark.sql.execution.streaming.Source, java.lang.Object>, scala.collection.Seq<org.apache.spark.sql.streaming.StateOperatorProgress>, scala.collection.immutable.Map<java.lang.String, java.lang.String>, org.apache.spark.sql.execution.streaming.ProgressReporter.ExecutionStats> implements scala.Serializable {
    public   ExecutionStats ()  { throw new RuntimeException(); }
  }
  public  java.util.UUID id ()  ;
  public  java.util.UUID runId ()  ;
  public  java.lang.String name ()  ;
  public  org.apache.spark.util.Clock triggerClock ()  ;
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan logicalPlan ()  ;
  public  org.apache.spark.sql.execution.QueryExecution lastExecution ()  ;
  public  scala.collection.immutable.Map<org.apache.spark.sql.execution.streaming.Source, org.apache.spark.sql.Dataset<org.apache.spark.sql.Row>> newData ()  ;
  public  org.apache.spark.sql.execution.streaming.StreamProgress availableOffsets ()  ;
  public  org.apache.spark.sql.execution.streaming.StreamProgress committedOffsets ()  ;
  public  scala.collection.Seq<org.apache.spark.sql.execution.streaming.Source> sources ()  ;
  public  org.apache.spark.sql.execution.streaming.Sink sink ()  ;
  public  org.apache.spark.sql.execution.streaming.OffsetSeqMetadata offsetSeqMetadata ()  ;
  public  long currentBatchId ()  ;
  public  org.apache.spark.sql.SparkSession sparkSession ()  ;
  public  void postEvent (org.apache.spark.sql.streaming.StreamingQueryListener.Event event)  ;
  public  long currentTriggerStartTimestamp ()  ;
  public  long currentTriggerEndTimestamp ()  ;
  public  long lastTriggerStartTimestamp ()  ;
  public  scala.collection.mutable.HashMap<java.lang.String, java.lang.Object> currentDurationsMs ()  ;
  /** Flag that signals whether any error with input metrics have already been logged */
  public  boolean metricWarningLogged ()  ;
  /** Holds the most recent query progress updates.  Accesses must lock on the queue itself. */
  public  scala.collection.mutable.Queue<org.apache.spark.sql.streaming.StreamingQueryProgress> progressBuffer ()  ;
  public  long noDataProgressEventInterval ()  ;
  public  long lastNoDataProgressEventTime ()  ;
  public  java.text.SimpleDateFormat timestampFormat ()  ;
  public  org.apache.spark.sql.streaming.StreamingQueryStatus currentStatus ()  ;
  /** Returns the current status of the query. */
  public  org.apache.spark.sql.streaming.StreamingQueryStatus status ()  ;
  /** Returns an array containing the most recent query progress updates. */
  public  org.apache.spark.sql.streaming.StreamingQueryProgress[] recentProgress ()  ;
  /** Returns the most recent query progress update or null if there were no progress updates. */
  public  org.apache.spark.sql.streaming.StreamingQueryProgress lastProgress ()  ;
  /** Begins recording statistics about query progress for a given trigger. */
  public  void startTrigger ()  ;
  public  void updateProgress (org.apache.spark.sql.streaming.StreamingQueryProgress newProgress)  ;
  /** Finalizes the query progress and adds it to list of recent status updates. */
  public  void finishTrigger (boolean hasNewData)  ;
  /** Extracts statistics from the most recent query execution. */
  public  org.apache.spark.sql.execution.streaming.ProgressReporter.ExecutionStats extractExecutionStats (boolean hasNewData)  ;
  /** Records the duration of running `body` for the next query progress update. */
  public <T extends java.lang.Object> T reportTimeTaken (java.lang.String triggerDetailKey, scala.Function0<T> body)  ;
  public  java.lang.String formatTimestamp (long millis)  ;
  /** Updates the message returned in `status`. */
  public  void updateStatusMessage (java.lang.String message)  ;
}
