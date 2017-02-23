package org.apache.spark.sql.execution.streaming;
/**
 * An operator that saves or restores state from the {@link StateStore}.  The {@link OperatorStateId} should
 * be filled in by <code>prepareForExecution</code> in {@link IncrementalExecution}.
 */
public  interface StatefulOperator {
  public  scala.Option<org.apache.spark.sql.execution.streaming.OperatorStateId> stateId ()  ;
  public  org.apache.spark.sql.execution.streaming.OperatorStateId getStateId ()  ;
}
